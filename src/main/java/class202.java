import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class202 extends class183 {

    @OriginalMember(owner = "client!ci", name = "T", descriptor = "I")
    private int field3530 = 3216;

    @OriginalMember(owner = "client!ci", name = "V", descriptor = "[I")
    private int[] field3532 = new int[3];

    @OriginalMember(owner = "client!ci", name = "ab", descriptor = "I")
    private int field3537 = 4096;

    @OriginalMember(owner = "client!ci", name = "db", descriptor = "I")
    private int field3540 = 3216;

    @OriginalMember(owner = "client!ci", name = "bb", descriptor = "[I")
    public static int[] field3538 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2 };

    @OriginalMember(owner = "client!ci", name = "U", descriptor = "I")
    public static int field3531;

    @OriginalMember(owner = "client!ci", name = "W", descriptor = "I")
    public static int field3533;

    @OriginalMember(owner = "client!ci", name = "X", descriptor = "I")
    public static int field3534;

    @OriginalMember(owner = "client!ci", name = "Y", descriptor = "I")
    public static int field3535;

    @OriginalMember(owner = "client!ci", name = "Z", descriptor = "I")
    public static int field3536;

    @OriginalMember(owner = "client!ci", name = "cb", descriptor = "I")
    public static int field3539;

    @OriginalMember(owner = "client!ci", name = "eb", descriptor = "I")
    public static int field3541;

    @OriginalMember(owner = "client!ci", name = "fb", descriptor = "I")
    public static int field3542;

    @OriginalMember(owner = "client!ci", name = "gb", descriptor = "I")
    public static int field3543;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ILkh;I)V", line = 9)
    public final void method14(int arg0, class14 arg1, int arg2) {
        field3541++;
        if (arg2 == 0) {
            this.field3537 = arg1.method116(-1);
        } else if (arg2 == 1) {
            this.field3540 = arg1.method116(-1);
        } else if (arg2 == 2) {
            this.field3530 = arg1.method116(-1);
        }
        if (arg0 >= -43) {
            this.method25(-110);
        }
    }

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "(B)V", line = 53)
    public static void method1411(byte arg0) {
        field3538 = null;
        if (arg0 >= -20) {
            field3535 = 23;
        }
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "()V", line = 63)
    public class202() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "(II)Lqm;", line = 73)
    public static final class235 method1412(int arg0, int arg1) {
        class235 var2 = (class235) class8.field79.method643((long) arg0, 1649232044);
        field3543++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class69.field1330.method1275(arg0, 26, -5211);
        class235 var4 = new class235();
        if (var3 != null) {
            var4.method1681(-51, new class14(var3));
        }
        class8.field79.method640(var4, (long) arg0, 24179);
        if (arg1 >= -50) {
            field3535 = 68;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "(I)V", line = 96)
    private final void method1413(int arg0) {
        field3539++;
        double var2 = Math.cos((double) ((float) this.field3530 / 4096.0F));
        this.field3532[0] = (int) (Math.sin((double) ((float) this.field3540 / 4096.0F)) * var2 * 4096.0D);
        this.field3532[1] = (int) (Math.cos((double) ((float) this.field3540 / 4096.0F)) * var2 * 4096.0D);
        this.field3532[2] = (int) (Math.sin((double) ((float) this.field3530 / 4096.0F)) * 4096.0D);
        int var4 = this.field3532[2] * this.field3532[2] >> 12;
        int var5 = this.field3532[arg0] * this.field3532[1] >> 12;
        int var6 = this.field3532[0] * this.field3532[0] >> 12;
        int var7 = (int) (Math.sqrt((double) (var6 + var4 + var5 >> 12)) * 4096.0D);
        if (var7 != 0) {
            this.field3532[1] = (this.field3532[1] << 12) / var7;
            this.field3532[0] = (this.field3532[0] << 12) / var7;
            this.field3532[2] = (this.field3532[2] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lpk;B)V", line = 132)
    public static final void method1414(class112 arg0, byte arg1) {
        field3534++;
        if (class199.field3475 == arg0.field1982 || arg0.field2000 == -1 || arg0.field2016 != 0 || arg0.field2033 + 1 > class280.method1965(arg0.field2000, 64).field3384[arg0.field1990]) {
            int var2 = arg0.field1982 - arg0.field1998;
            int var3 = class199.field3475 - arg0.field1998;
            int var4 = arg0.field1970 * 128 + (arg0.method299(true) * 64);
            int var5 = arg0.field1979 * 128 + (arg0.method299(true) * 64);
            int var6 = arg0.field1974 * 128 + arg0.method299(true) * 64;
            int var7 = arg0.field1995 * 128 + (arg0.method299(true) * 64);
            arg0.field1983 = ((var2 - var3) * var4 + var3 * var6) / var2;
            arg0.field2028 = ((var2 - var3) * var5 + var3 * var7) / var2;
        }
        if (arg0.field1988 == 0) {
            arg0.field1964 = 1024;
        }
        if (arg0.field1988 == 1) {
            arg0.field1964 = 1536;
        }
        if (arg0.field1988 == 2) {
            arg0.field1964 = 0;
        }
        arg0.field2005 = 0;
        if (arg0.field1988 == 3) {
            arg0.field1964 = 512;
        }
        if (arg1 != 9) {
            field3538 = (int[]) null;
        }
        arg0.field1987 = arg0.field1964;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIII)I", line = 181)
    public static final int method1415(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 != 3838) {
            return 56;
        }
        field3531++;
        int var5 = arg2 & 0xF;
        int var6 = var5 >= 4 ? (var5 == 12 || var5 == 14 ? arg4 : arg3) : arg0;
        int var7 = var5 < 8 ? arg4 : arg0;
        return ((var5 & 0x2) == 0 ? var6 : -var6) + ((var5 & 0x1) == 0 ? var7 : -var7);
    }

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "(I)V", line = 198)
    public final void method25(int arg0) {
        this.method1413(1);
        field3533++;
        if (arg0 != -8) {
            this.field3540 = 121;
        }
    }

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "(II)[I", line = 224)
    public final int[] method10(int arg0, int arg1) {
        field3542++;
        int[] var3 = this.field3161.method664(arg0, 0);
        if (arg1 != -1) {
            return (int[]) null;
        }
        if (this.field3161.field1736) {
            int var4 = class205.field3572 * this.field3537 >> 12;
            int[] var5 = this.method1253(0, class252.field4405 & arg0 - 1, 114);
            int[] var6 = this.method1253(0, arg0, 111);
            int[] var7 = this.method1253(0, class252.field4405 & arg0 + 1, 103);
            for (int var8 = 0; var8 < class22.field393; var8++) {
                int var9 = (var7[var8] - var5[var8]) * var4 >> 12;
                int var10 = (var6[class52.field913 & var8 - 1] - var6[var8 + 1 & class52.field913]) * var4 >> 12;
                int var11 = var10 >> 4;
                if (var11 < 0) {
                    var11 = -var11;
                }
                if (var11 > 255) {
                    var11 = 255;
                }
                int var12 = var9 >> 4;
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                int var13 = class192.field3328[((var12 + 1) * var12 >> 1) + var11] & 0xFF;
                int var14 = var9 * var13 >> 8;
                int var15 = var13 * 4096 >> 8;
                int var16 = this.field3532[1] * var14 >> 12;
                int var17 = var10 * var13 >> 8;
                int var18 = this.field3532[0] * var17 >> 12;
                int var19 = this.field3532[2] * var15 >> 12;
                var3[var8] = var18 - (-var16 - var19);
            }
        }
        return var3;
    }
}
