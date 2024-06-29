import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class156 extends class125 {

    @OriginalMember(owner = "client!wc", name = "w", descriptor = "I")
    public int field3589 = 0;

    @OriginalMember(owner = "client!wc", name = "C", descriptor = "I")
    public int field3595 = -1;

    @OriginalMember(owner = "client!wc", name = "v", descriptor = "Z")
    public static boolean field3588 = false;

    @OriginalMember(owner = "client!wc", name = "u", descriptor = "Lod;")
    public static class101 field3587 = null;

    @OriginalMember(owner = "client!wc", name = "E", descriptor = "[Lod;")
    public static class101[] field3597 = new class101[1000];

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "I")
    public int field3581;

    @OriginalMember(owner = "client!wc", name = "p", descriptor = "I")
    public int field3582;

    @OriginalMember(owner = "client!wc", name = "q", descriptor = "I")
    public int field3583;

    @OriginalMember(owner = "client!wc", name = "r", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!wc", name = "s", descriptor = "I")
    public int field3585;

    @OriginalMember(owner = "client!wc", name = "t", descriptor = "I")
    public int field3586;

    @OriginalMember(owner = "client!wc", name = "x", descriptor = "I")
    public int field3590;

    @OriginalMember(owner = "client!wc", name = "y", descriptor = "I")
    public int field3591;

    @OriginalMember(owner = "client!wc", name = "z", descriptor = "I")
    public int field3592;

    @OriginalMember(owner = "client!wc", name = "A", descriptor = "I")
    public int field3593;

    @OriginalMember(owner = "client!wc", name = "B", descriptor = "I")
    public int field3594;

    @OriginalMember(owner = "client!wc", name = "D", descriptor = "I")
    public static int field3596;

    @OriginalMember(owner = "client!wc", name = "F", descriptor = "I")
    public static int field3598;

    @OriginalMember(owner = "client!wc", name = "G", descriptor = "I")
    public static int field3599;

    @OriginalMember(owner = "client!wc", name = "H", descriptor = "I")
    public static int field3600;

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "Lrd;")
    public static class122 field3580;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)Z")
    public static final boolean method1210(int arg0, int arg1) {
        field3599++;
        if (arg0 <= 52) {
            return false;
        } else {
            return (arg1 >> 20 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)V")
    public static final void method1211(byte arg0) {
        if (arg0 != -115) {
            field3597 = null;
        }
        for (class133 var1 = (class133) class96.field2092.method1142((byte) -75); var1 != null; var1 = (class133) class96.field2092.method1136(-9485)) {
            int var2 = var1.field3044;
            if (class143.method1139(103, var2)) {
                boolean var3 = true;
                class126[] var4 = class100.field2161[var2];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field2788;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field2723;
                    class126 var7 = class78.method532(0, var6);
                    if (var7 != null) {
                        class40.method300(false, var7);
                    }
                }
            }
        }
        field3598++;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/Class;")
    public static final Class method1212(String arg0, byte arg1) throws ClassNotFoundException {
        field3600++;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg0.equals("F")) {
            return Float.TYPE;
        } else if (arg0.equals("D")) {
            return Double.TYPE;
        } else if (arg0.equals("C")) {
            return Character.TYPE;
        } else {
            if (arg1 >= -4) {
                field3580 = null;
            }
            return Class.forName(arg0);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Z)V")
    public static void method1213(boolean arg0) {
        if (arg0) {
            method1213(false);
        }
        field3587 = null;
        field3580 = null;
        field3597 = null;
    }

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "(I)V")
    public static final void method1214(int arg0) {
        class57.field1308.method135(arg0 ^ arg0);
        field3596++;
    }
}
