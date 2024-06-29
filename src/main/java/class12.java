import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class12 extends class270 {

    @OriginalMember(owner = "client!rj", name = "K", descriptor = "I")
    private int field200 = 4096;

    @OriginalMember(owner = "client!rj", name = "M", descriptor = "I")
    private int field202 = 3216;

    @OriginalMember(owner = "client!rj", name = "Q", descriptor = "I")
    private int field206 = 3216;

    @OriginalMember(owner = "client!rj", name = "V", descriptor = "[I")
    private int[] field211 = new int[3];

    @OriginalMember(owner = "client!rj", name = "G", descriptor = "Z")
    public static boolean field197 = false;

    @OriginalMember(owner = "client!rj", name = "I", descriptor = "I")
    public static int field198;

    @OriginalMember(owner = "client!rj", name = "J", descriptor = "I")
    public static int field199;

    @OriginalMember(owner = "client!rj", name = "L", descriptor = "I")
    public static int field201;

    @OriginalMember(owner = "client!rj", name = "N", descriptor = "I")
    public static int field203;

    @OriginalMember(owner = "client!rj", name = "O", descriptor = "I")
    public static int field204;

    @OriginalMember(owner = "client!rj", name = "P", descriptor = "I")
    public static int field205;

    @OriginalMember(owner = "client!rj", name = "R", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!rj", name = "T", descriptor = "I")
    public static int field209;

    @OriginalMember(owner = "client!rj", name = "U", descriptor = "I")
    public static int field210;

    @OriginalMember(owner = "client!rj", name = "S", descriptor = "Ldp;")
    public static class174 field208;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(B[I)Ljava/lang/String;", line = 3)
    public static final String method77(byte arg0, int[] arg1) {
        ++field209;
        if (arg0 <= 107) {
            field197 = false;
        }
        StringBuffer var2 = new StringBuffer();
        int var3 = class452.field6568;
        for (int var4 = 0; ~var4 > ~arg1.length; ++var4) {
            class305 var5 = class134.method1107(arg1[var4], (byte) -121);
            if (var5.field4462 != -1) {
                class421 var6 = (class421) class409.field5959.method103(0, (long) var5.field4462);
                if (var6 == null) {
                    class344 var7 = class344.method2217(class100.field1561, var5.field4462, 0);
                    if (var7 != null) {
                        var6 = class73.field1235.method734(var7, true);
                        class409.field5959.method113(var6, 0, (long) var5.field4462);
                    }
                }
                if (var6 != null) {
                    class28.field415[var3] = var6;
                    var2.append(" <img=").append(var3).append(">");
                    ++var3;
                }
            }
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(BLec;I)V", line = 54)
    public final void method78(byte arg0, class37 arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    this.field206 = arg1.method320((byte) -87);
                }
            } else {
                this.field202 = arg1.method320((byte) -87);
            }
        } else {
            this.field200 = arg1.method320((byte) -87);
        }
        ++field207;
        if (arg0 != 108) {
            method77((byte) 17, (int[]) null);
        }
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "()V", line = 99)
    public class12() {
        super(1, true);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIZIZII)V", line = 108)
    public static final void method79(int arg0, int arg1, boolean arg2, int arg3, boolean arg4, int arg5, int arg6) {
        ++field204;
        if (arg1 != 255) {
            method79(-60, 34, false, 48, true, -125, -124);
        }
        if (arg3 < arg5) {
            int var7 = (arg3 - -arg5) / 2;
            int var8 = arg3;
            class218 var9 = class221.field3299[var7];
            class221.field3299[var7] = class221.field3299[arg5];
            class221.field3299[arg5] = var9;
            for (int var10 = arg3; ~var10 > ~arg5; ++var10) {
                if (~class187.method1450(arg2, arg4, var9, arg6, -114, class221.field3299[var10], arg0) >= -1) {
                    class218 var11 = class221.field3299[var10];
                    class221.field3299[var10] = class221.field3299[var8];
                    class221.field3299[var8++] = var11;
                }
            }
            class221.field3299[arg5] = class221.field3299[var8];
            class221.field3299[var8] = var9;
            method79(arg0, 255, arg2, arg3, arg4, var8 + -1, arg6);
            method79(arg0, 255, arg2, var8 + 1, arg4, arg5, arg6);
        }
    }

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "(I)V", line = 162)
    private final void method80(int arg0) {
        ++field198;
        double var2 = Math.cos((double) ((float) this.field206 / 4096.0F));
        this.field211[0] = (int) (4096.0D * var2 * Math.sin((double) ((float) this.field202 / 4096.0F)));
        this.field211[1] = (int) (Math.cos((double) ((float) this.field202 / 4096.0F)) * var2 * 4096.0D);
        this.field211[2] = (int) (4096.0D * Math.sin((double) ((float) this.field206 / 4096.0F)));
        int var4 = this.field211[0] * this.field211[0] >> 12;
        int var5 = this.field211[1] * this.field211[1] >> 12;
        if (arg0 <= -46) {
            int var6 = this.field211[2] * this.field211[2] >> 12;
            int var7 = (int) (Math.sqrt((double) (var4 + var5 + var6 >> 12)) * 4096.0D);
            if (var7 != 0) {
                this.field211[1] = (this.field211[1] << 12) / var7;
                this.field211[2] = (this.field211[2] << 12) / var7;
                this.field211[0] = (this.field211[0] << 12) / var7;
            }
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(BI)[I", line = 201)
    public final int[] method81(byte arg0, int arg1) {
        ++field201;
        if (arg0 < 26) {
            return null;
        } else {
            int[] var3 = super.field4053.method396(arg1, 121);
            if (super.field4053.field815) {
                int var4 = class249.field3602 * this.field200 >> 12;
                int[] var5 = this.method1927(0, 0, arg1 - 1 & class30.field442);
                int[] var6 = this.method1927(0, 0, arg1);
                int[] var7 = this.method1927(0, 0, arg1 + 1 & class30.field442);
                for (int var8 = 0; class161.field2445 > var8; ++var8) {
                    int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                    int var10 = (var6[class267.field3997 & var8 + -1] + -var6[var8 + 1 & class267.field3997]) * var4 >> 12;
                    int var11 = var10 >> 4;
                    if (var11 < 0) {
                        var11 = -var11;
                    }
                    int var12 = var9 >> 4;
                    if (~var11 < -256) {
                        var11 = 255;
                    }
                    if (~var12 > -1) {
                        var12 = -var12;
                    }
                    if (~var12 < -256) {
                        var12 = 255;
                    }
                    int var13 = 255 & class76.field1296[((var12 + 1) * var12 >> 1) + var11];
                    int var14 = var13 * 4096 >> 8;
                    int var15 = var9 * var13 >> 8;
                    int var16 = var10 * var13 >> 8;
                    int var17 = this.field211[2] * var14 >> 12;
                    int var18 = this.field211[1] * var15 >> 12;
                    int var19 = this.field211[0] * var16 >> 12;
                    var3[var8] = var19 - -var18 + var17;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "(I)V", line = 272)
    public static void method82(int arg0) {
        field208 = null;
        int var1 = 65 % ((83 - arg0) / 40);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Z)V", line = 282)
    public final void method83(boolean arg0) {
        if (!arg0) {
            field205 = -89;
        }
        this.method80(-61);
        ++field203;
    }
}
