import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public abstract class class470 extends class117 {

    @OriginalMember(owner = "client!t", name = "D", descriptor = "Z")
    public volatile boolean field6915 = true;

    @OriginalMember(owner = "client!t", name = "A", descriptor = "Lgf;")
    public static class180 field6912 = new class180("Take", "Nehmen", "Prendre", "Pegar");

    @OriginalMember(owner = "client!t", name = "F", descriptor = "Luq;")
    public static class111 field6917 = new class111();

    @OriginalMember(owner = "client!t", name = "z", descriptor = "I")
    public static int field6911;

    @OriginalMember(owner = "client!t", name = "B", descriptor = "I")
    public static int field6913;

    @OriginalMember(owner = "client!t", name = "C", descriptor = "I")
    public static int field6914;

    @OriginalMember(owner = "client!t", name = "y", descriptor = "Z")
    public boolean field6910;

    @OriginalMember(owner = "client!t", name = "E", descriptor = "Z")
    public boolean field6916;

    @OriginalMember(owner = "client!t", name = "G", descriptor = "[I")
    public static int[] field6918;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IB)V", line = 6)
    public static final void method2803(int arg0, byte arg1) {
        class511.method3031(0);
        int var2 = 35 % ((-arg1 - 69) / 41);
        field6911++;
        class114.method840((byte) -77);
        class348.method2261(arg0, (byte) -116, true);
        class381.method2413(class394.field5821, class460.field6798, class420.field6181, 6);
        class122.method926(class394.field5821, 43, class460.field6798);
        class229.method1503((byte) -108, class402.field5901);
        class442.method2684(-1);
        class67.method582(-25099);
        if (class17.field266 == 10) {
            class410.method2536(false, -17143);
        } else if (class17.field266 == 30) {
            class138.method1022(25, 1);
        } else if (class17.field266 == 5) {
            class527.method3117(class394.field5821, (byte) 82, class460.field6798);
            return;
        }
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(IB)C", line = 42)
    public static final char method2804(int arg0, byte arg1) {
        field6913++;
        if (arg0 != 63) {
            return 'U';
        }
        int var2 = arg1 & 0xFF;
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (var2 >= 128 && var2 < 160) {
            char var3 = class60.field1047[var2 - 128];
            if (var3 == '\u0000') {
                var3 = '?';
            }
            var2 = var3;
        }
        return (char) var2;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIILkg;Lkg;)V", line = 71)
    public static final void method2805(int arg0, int arg1, int arg2, class177 arg3, class177 arg4) {
        class165 var5 = class524.method3094(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field2482 = arg3;
            var5.field2493 = arg4;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(DB)V", line = 80)
    public static final void method2806(double arg0, byte arg1) {
        field6914++;
        if (arg1 != -35 || class281.field4074 == arg0) {
            return;
        }
        for (int var3 = 0; var3 < 256; var3++) {
            int var4 = (int) (Math.pow((double) var3 / 255.0D, arg0) * 255.0D);
            class479.field7028[var3] = var4 <= 255 ? var4 : 255;
        }
        class281.field4074 = arg0;
    }

    @OriginalMember(owner = "client!t", name = "c", descriptor = "(B)V", line = 110)
    public static void method2807(byte arg0) {
        if (arg0 == -61) {
            field6917 = null;
            field6912 = null;
            field6918 = null;
        }
    }

    @OriginalMember(owner = "client!t", name = "f", descriptor = "(I)[B")
    public abstract byte[] method1266(int arg0);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Z)I")
    public abstract int method1267(boolean arg0);
}
