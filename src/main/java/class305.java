import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class305 extends class53 {

    @OriginalMember(owner = "client!al", name = "M", descriptor = "I")
    private int field5208 = 20;

    @OriginalMember(owner = "client!al", name = "S", descriptor = "I")
    private int field5214 = 0;

    @OriginalMember(owner = "client!al", name = "X", descriptor = "I")
    private int field5219 = 0;

    @OriginalMember(owner = "client!al", name = "R", descriptor = "I")
    private int field5213 = 1365;

    @OriginalMember(owner = "client!al", name = "N", descriptor = "Lwa;")
    public static class75 field5209 = class66.method560(" )2> <col=ff9040>", false);

    @OriginalMember(owner = "client!al", name = "U", descriptor = "Lwa;")
    private static class75 field5216 = class66.method560("Connected to update server", false);

    @OriginalMember(owner = "client!al", name = "P", descriptor = "Lwa;")
    public static class75 field5211 = field5216;

    @OriginalMember(owner = "client!al", name = "O", descriptor = "I")
    public static int field5210;

    @OriginalMember(owner = "client!al", name = "Q", descriptor = "I")
    public static int field5212;

    @OriginalMember(owner = "client!al", name = "T", descriptor = "I")
    public static int field5215;

    @OriginalMember(owner = "client!al", name = "V", descriptor = "I")
    public static int field5217;

    @OriginalMember(owner = "client!al", name = "W", descriptor = "I")
    public static int field5218;

    @OriginalMember(owner = "client!al", name = "Y", descriptor = "I")
    public static int field5220;

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "()V", line = 190)
    public class305() {
        super(0, true);
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(II)[I", line = 22)
    public final int[] method59(int arg0, int arg1) {
        if (arg0 != -15196) {
            this.field5219 = -33;
        }
        int[] var3 = this.field878.method1603(arg1, (byte) 113);
        if (this.field878.field3749) {
            for (int var4 = 0; var4 < class269.field4644; var4++) {
                int var5 = (class67.field1178[var4] << 12) / this.field5213 + this.field5219;
                int var6 = var5;
                int var7 = (class50.field814[arg1] << 12) / this.field5213 + this.field5214;
                int var8 = var7;
                int var9 = var5;
                int var10 = var5 * var5 >> 12;
                int var11 = var7 * var7 >> 12;
                int var12 = var7;
                int var13 = 0;
                while ((var10 + var11) < 16384 && this.field5208 > var13) {
                    var12 = (var9 * var12 >> 12) * 2 + var8;
                    var9 = var6 + var10 - var11;
                    var10 = var9 * var9 >> 12;
                    var13++;
                    var11 = var12 * var12 >> 12;
                }
                var3[var4] = var13 >= (this.field5208 - 1) ? 0 : (var13 << 12) / this.field5208;
            }
        }
        field5215++;
        return var3;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIIII)V", line = 76)
    public static final void method2095(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5212++;
        class118 var5 = (class118) class310.field5269.method1007((long) arg4, -17004);
        if (var5 == null) {
            var5 = new class118();
            class310.field5269.method1004((byte) 73, (long) arg4, var5);
        }
        if (var5.field1999.length <= arg0) {
            int[] var6 = new int[arg0 + 1];
            int[] var7 = new int[arg0 + 1];
            for (int var8 = 0; var8 < var5.field1999.length; var8++) {
                var6[var8] = var5.field1999[var8];
                var7[var8] = var5.field2001[var8];
            }
            for (int var9 = var5.field1999.length; var9 < arg0; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field2001 = var7;
            var5.field1999 = var6;
        }
        var5.field1999[arg0] = arg1;
        if (arg2 == 22075) {
            var5.field2001[arg0] = arg3;
        }
    }

    @OriginalMember(owner = "client!al", name = "c", descriptor = "(B)V", line = 126)
    public static void method2096(byte arg0) {
        if (arg0 != -26) {
            field5216 = (class75) null;
        }
        field5209 = null;
        field5216 = null;
        field5211 = null;
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(IIIII)V", line = 138)
    public static final void method2097(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= arg2) {
            for (int var5 = arg2; var5 < arg0; var5++) {
                class63.field1096[var5][arg1] = arg4;
            }
        } else {
            for (int var6 = arg0; var6 < arg2; var6++) {
                class63.field1096[var6][arg1] = arg4;
            }
        }
        field5218++;
        if (arg3 != 1984052364) {
            method2098(119, 48, 114, -100, (class75) null, -36L, -57);
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(ILja;Z)V", line = 208)
    public final void method54(int arg0, class60 arg1, boolean arg2) {
        if (arg0 == 0) {
            this.field5213 = arg1.method485((byte) -2);
        } else if (arg0 == 1) {
            this.field5208 = arg1.method485((byte) -2);
        } else if (arg0 == 2) {
            this.field5219 = arg1.method485((byte) -2);
        } else if (arg0 == 3) {
            this.field5214 = arg1.method485((byte) -2);
        }
        field5210++;
        if (!arg2) {
            method2095(42, -33, -107, -12, 59);
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIIILwa;JI)V", line = 251)
    public static final void method2098(int arg0, int arg1, int arg2, int arg3, class75 arg4, long arg5, int arg6) {
        field5220++;
        class60 var8 = new class60(128);
        var8.method518(112, 10);
        var8.method503(-597878072, (int) (Math.random() * 99999.0D));
        var8.method503(-597878072, 512);
        var8.method514(30009, arg5);
        var8.method510((int) (Math.random() * 9.9999999E7D), -71);
        var8.method516((byte) -20, arg4);
        var8.method510((int) (Math.random() * 9.9999999E7D), -114);
        var8.method503(-597878072, class98.field1612);
        if (arg6 <= 59) {
            field5217 = -11;
        }
        var8.method518(118, arg2);
        var8.method518(121, arg3);
        var8.method510((int) (Math.random() * 9.9999999E7D), 96);
        var8.method503(-597878072, arg0);
        var8.method503(-597878072, arg1);
        var8.method510((int) (Math.random() * 9.9999999E7D), -80);
        var8.method524(class269.field4650, class229.field3872, 0);
        class89.field1470.field1012 = 0;
        class89.field1470.method518(103, 237);
        class89.field1470.method518(105, var8.field1012);
        class89.field1470.method494(var8.field997, (byte) -114, 0, var8.field1012);
        class252.field4225 = 1;
        class121.field2034 = 0;
        class157.field2693 = 0;
        class139.field2377 = -3;
    }
}
