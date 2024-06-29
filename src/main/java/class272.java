import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gia")
public class class272 extends class362 {

    @OriginalMember(owner = "client!gia", name = "r", descriptor = "[B")
    public byte[] field3825;

    @OriginalMember(owner = "client!gia", name = "v", descriptor = "[S")
    private static short[] field3829 = new short[] { 967, 20428, -21577, 11219, -10290 };

    @OriginalMember(owner = "client!gia", name = "x", descriptor = "[S")
    private static short[] field3831 = new short[] { 957, 20418, -21587, 11209, -10300 };

    @OriginalMember(owner = "client!gia", name = "s", descriptor = "[S")
    private static short[] field3826 = new short[] { 952, 20413, -21592, 11204, -10305 };

    @OriginalMember(owner = "client!gia", name = "z", descriptor = "[S")
    private static short[] field3833 = new short[] { 962, 20423, -21582, 11214, -10295 };

    @OriginalMember(owner = "client!gia", name = "y", descriptor = "[[S")
    public static short[][] field3832 = new short[][] { field3829, field3833, field3831, field3826 };

    @OriginalMember(owner = "client!gia", name = "A", descriptor = "[I")
    public static int[] field3834 = new int[3];

    @OriginalMember(owner = "client!gia", name = "t", descriptor = "I")
    public static int field3827;

    @OriginalMember(owner = "client!gia", name = "B", descriptor = "I")
    public static int field3835;

    @OriginalMember(owner = "client!gia", name = "u", descriptor = "Ltb;")
    public static class401 field3828;

    @OriginalMember(owner = "client!gia", name = "o", descriptor = "Lha;")
    public static class59 field3822;

    @OriginalMember(owner = "client!gia", name = "w", descriptor = "Ljava/applet/Applet;")
    public static Applet field3830;

    @OriginalMember(owner = "client!gia", name = "p", descriptor = "[I")
    public static int[] field3823;

    @OriginalMember(owner = "client!gia", name = "q", descriptor = "[[Z")
    public static boolean[][] field3824;

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "(BLkda;)I", line = 5)
    public static final int method1796(byte arg0, class390 arg1) {
        field3835++;
        if (arg0 != 108) {
            field3830 = null;
        }
        if (arg1.field5736 == 0) {
            return 0;
        }
        if (arg1.field5701 != -1) {
            class390 var2 = null;
            if (arg1.field5701 < 32768) {
                class751 var3 = (class751) class86.field1546.method1465((long) arg1.field5701, -6008);
                if (var3 != null) {
                    var2 = var3.field10510;
                }
            } else if (arg1.field5701 >= 32768) {
                var2 = class49.field1040[arg1.field5701 - 32768];
            }
            if (var2 != null) {
                int var4 = arg1.field5922 - var2.field5922;
                int var5 = arg1.field5933 - var2.field5933;
                if (var4 != 0 || var5 != 0) {
                    arg1.method2461((byte) 49, (int) (Math.atan2((double) var4, (double) var5) * 2607.5945876176133D) & 0x3FFF);
                }
            }
        }
        if (arg1 instanceof class598) {
            class598 var6 = (class598) arg1;
            if (var6.field8169 != -1 && (var6.field5745 == 0 || var6.field5752 > 0)) {
                var6.method2461((byte) 49, var6.field8169);
                var6.field8169 = -1;
            }
        } else if (arg1 instanceof class9) {
            class9 var7 = (class9) arg1;
            if (var7.field120 != -1 && (var7.field5745 == 0 || var7.field5752 > 0)) {
                int var8 = var7.field5922 - ((var7.field120 - class221.field3177 - class221.field3177) * 256);
                int var9 = var7.field5933 - (var7.field133 - class367.field5236 - class367.field5236) * 256;
                if (var8 != 0 || var9 != 0) {
                    var7.method2461((byte) 49, (int) (Math.atan2((double) var8, (double) var9) * 2607.5945876176133D) & 0x3FFF);
                }
                var7.field120 = -1;
            }
        }
        return arg1.method2449(arg0 - 106);
    }

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "(B)V", line = 88)
    public static void method1797(byte arg0) {
        field3826 = null;
        field3822 = null;
        field3833 = null;
        field3834 = null;
        field3831 = null;
        field3823 = null;
        if (arg0 > -123) {
            method1798((byte) -65, -91);
        }
        field3828 = null;
        field3824 = null;
        field3830 = null;
        field3832 = null;
        field3829 = null;
    }

    @OriginalMember(owner = "client!gia", name = "<init>", descriptor = "([B)V", line = 108)
    public class272(byte[] arg0) {
        this.field3825 = arg0;
    }

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "(BI)Lfh;", line = 119)
    public static final class652 method1798(byte arg0, int arg1) {
        field3827++;
        if (arg0 > -35) {
            field3824 = null;
        }
        class652[] var2 = class579.method3327((byte) 91);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class652 var4 = var2[var3];
            if (var4.field8953 == arg1) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "(JJ)J", line = 151)
    public static long method1799(long arg0, long arg1) {
        return arg0 & arg1;
    }
}
