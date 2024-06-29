import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class306 {

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "B")
    private byte field4778;

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "I")
    public int field4780;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "I")
    public int field4773;

    @OriginalMember(owner = "client!ab", name = "o", descriptor = "I")
    public int field4787;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "I")
    public int field4775;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "I")
    public int field4777;

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field4779 = new String[5];

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "Z")
    public static boolean field4782 = false;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "I")
    public static int field4774;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "I")
    public static int field4776;

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "I")
    public static int field4781;

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "I")
    public static int field4784;

    @OriginalMember(owner = "client!ab", name = "m", descriptor = "I")
    public static int field4785;

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "I")
    public static int field4786;

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "Lug;")
    public static class253 field4783;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)I", line = 5)
    public final int method2117(int arg0) {
        field4774++;
        if (arg0 <= 111) {
            this.method2117(-101);
        }
        return (this.field4778 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z)I", line = 23)
    public final int method2118(boolean arg0) {
        if (arg0) {
            field4776++;
            return this.field4778 & 0x7;
        } else {
            return 48;
        }
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(Z)Lic;", line = 49)
    public static final class319 method2119(boolean arg0) {
        field4785++;
        if (!arg0) {
            return (class319) null;
        }
        try {
            return (class319) Class.forName("bl").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V", line = 71)
    public static void method2120(int arg0) {
        field4783 = null;
        field4779 = null;
        if (arg0 < 69) {
            method2121(-18, 21, 118, (byte) -70);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIB)I", line = 89)
    public static final int method2121(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != -31) {
            method2120(116);
        }
        int var4 = arg0 & 0x3;
        field4786++;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return 1023 - arg2;
        } else if (var4 == 2) {
            return 1023 - arg1;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "()V", line = 113)
    public class306() {
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Lvl;)V", line = 115)
    public class306(class6 arg0) {
        this.field4778 = arg0.method83((byte) -109);
        this.field4780 = arg0.method39((byte) 51);
        this.field4773 = arg0.method73((byte) 19);
        this.field4787 = arg0.method73((byte) 19);
        this.field4775 = arg0.method73((byte) 19);
        this.field4777 = arg0.method73((byte) 19);
    }
}
