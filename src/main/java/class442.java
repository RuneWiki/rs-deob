import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public class class442 extends class136 {

    @OriginalMember(owner = "client!gs", name = "N", descriptor = "I")
    public static int field6584 = 0;

    @OriginalMember(owner = "client!gs", name = "P", descriptor = "Lpn;")
    public static class49 field6586 = new class49(53, 6);

    @OriginalMember(owner = "client!gs", name = "S", descriptor = "[F")
    public static float[] field6589 = new float[4];

    @OriginalMember(owner = "client!gs", name = "R", descriptor = "J")
    public static long field6588 = 0L;

    @OriginalMember(owner = "client!gs", name = "T", descriptor = "Lpn;")
    public static class49 field6590 = new class49(61, -1);

    @OriginalMember(owner = "client!gs", name = "H", descriptor = "I")
    public static int field6579;

    @OriginalMember(owner = "client!gs", name = "I", descriptor = "I")
    public static int field6580;

    @OriginalMember(owner = "client!gs", name = "K", descriptor = "I")
    public static int field6581;

    @OriginalMember(owner = "client!gs", name = "L", descriptor = "I")
    public static int field6582;

    @OriginalMember(owner = "client!gs", name = "M", descriptor = "I")
    public static int field6583;

    @OriginalMember(owner = "client!gs", name = "O", descriptor = "I")
    public static int field6585;

    @OriginalMember(owner = "client!gs", name = "Q", descriptor = "[B")
    private byte[] field6587;

    @OriginalMember(owner = "client!gs", name = "d", descriptor = "(I)V", line = 4)
    public static final void method2730(int arg0) {
        field6580++;
        if (class480.field7050 == -1 || class420.field6167 == -1) {
            return;
        }
        int var1 = ((class196.field3066 - class176.field2710) * class7.field83 >> 16) + class176.field2710;
        class7.field83 += var1;
        if (class7.field83 < 65535) {
            class86.field1391 = false;
            class453.field6744 = false;
        } else {
            class7.field83 = 65535;
            if (class86.field1391) {
                class453.field6744 = false;
            } else {
                class453.field6744 = true;
            }
            class86.field1391 = true;
        }
        float var2 = (float) class7.field83 / 65535.0F;
        float[] var3 = new float[3];
        int var4 = class247.field3699 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var22 = class190.field2914[class480.field7050][var4][var5] * 3;
            int var23 = class190.field2914[class480.field7050][var4 + 1][var5] * 3;
            int var24 = (class190.field2914[class480.field7050][var4 + 2][var5] + class190.field2914[class480.field7050][var4 + 2][var5] - class190.field2914[class480.field7050][var4 + 3][var5]) * 3;
            int var25 = class190.field2914[class480.field7050][var4][var5];
            int var26 = var23 - var22;
            int var27 = var24 + var22 - (var23 * 2);
            int var28 = var23 + class190.field2914[class480.field7050][var4 + 2][var5] - var24 - var25;
            var3[var5] = (((float) var28 * var2 + (float) var27) * var2 + (float) var26) * var2 + (float) var25;
        }
        class406.field5999 = (int) var3[2] - class23.field273 * 128;
        class128.field1917 = (int) var3[0] - class422.field6201 * 128;
        class505.field7344 = (int) var3[1] * -1;
        float[] var6 = new float[3];
        int var7 = class186.field2863 * 2;
        for (int var8 = 0; var8 < 3; var8++) {
            int var15 = class190.field2914[class420.field6167][var7][var8] * 3;
            int var16 = class190.field2914[class420.field6167][var7 + 1][var8] * 3;
            int var17 = (class190.field2914[class420.field6167][var7 + 2][var8] + class190.field2914[class420.field6167][var7 + 2][var8] - class190.field2914[class420.field6167][var7 + 3][var8]) * 3;
            int var18 = class190.field2914[class420.field6167][var7][var8];
            int var19 = var16 - var15;
            int var20 = var17 + var15 - (var16 * 2);
            int var21 = class190.field2914[class420.field6167][var7 + 2][var8] + var16 - var17 - var18;
            var6[var8] = (((float) var21 * var2 + (float) var20) * var2 + (float) var19) * var2 + (float) var18;
        }
        float var9 = var6[0] - var3[0];
        int var10 = 71 / ((63 - arg0) / 37);
        float var11 = (var6[1] - var3[1]) * -1.0F;
        float var12 = var6[2] - var3[2];
        double var13 = Math.sqrt((double) (var9 * var9 + var12 * var12));
        class430.field6377 = (int) (Math.atan2((double) var11, var13) * 2607.5945876176133D) & 0x3FFF;
        class536.field7863 = (int) (-Math.atan2((double) var9, (double) var12) * 2607.5945876176133D) & 0x3FFF;
        class21.field242 = ((class190.field2914[class480.field7050][var4 + 2][3] - class190.field2914[class480.field7050][var4][3]) * class7.field83 >> 16) + class190.field2914[class480.field7050][var4][3];
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(BIB)V", line = 107)
    public final void method998(byte arg0, int arg1, byte arg2) {
        field6583++;
        if (arg2 != 111) {
            return;
        }
        int var4 = arg1 * 2;
        int var5 = arg0 & 0xFF;
        int var6 = var4 + 1;
        this.field6587[var4] = (byte) (var5 * 3 >> 5);
        this.field6587[var6] = (byte) (var5 * 3 >> 5);
    }

    @OriginalMember(owner = "client!gs", name = "e", descriptor = "(I)V", line = 124)
    public static final void method2731(int arg0) {
        int var1 = 2 % ((-arg0 - 55) / 55);
        field6582++;
        class188 var2 = class10.method48((byte) 103, 15, 0);
        var2.method1306(-23128);
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(IIII)[B", line = 138)
    public final byte[] method2732(int arg0, int arg1, int arg2, int arg3) {
        field6581++;
        this.field6587 = new byte[arg0 * 2 * arg2 * arg3];
        if (arg1 < 22) {
            method2730(-109);
        }
        this.method1177(arg2, arg3, arg0, 17152);
        return this.field6587;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 155)
    public static final void method2733(String arg0, int arg1) {
        if (class86.field1415 == null) {
            class74.method687((byte) -29);
        }
        field6579++;
        String[] var2 = class454.method2784('\n', 1, arg0);
        int var3 = 0;
        if (arg1 != 8) {
            return;
        }
        while (var3 < var2.length) {
            for (int var4 = class182.field2784; var4 > 0; var4--) {
                class86.field1415[var4] = class86.field1415[var4 - 1];
            }
            class86.field1415[0] = var2[var3];
            if (class182.field2784 < class86.field1415.length - 1) {
                if (class193.field2966 > 0) {
                    class193.field2966++;
                }
                class182.field2784++;
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!gs", name = "<init>", descriptor = "()V", line = 203)
    public class442() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!gs", name = "f", descriptor = "(I)V", line = 211)
    public static void method2734(int arg0) {
        field6586 = null;
        field6589 = null;
        field6590 = null;
        if (arg0 != 3) {
            field6590 = null;
        }
    }
}
