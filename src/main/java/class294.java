import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class294 extends class110 {

    @OriginalMember(owner = "client!ab", name = "H", descriptor = "I")
    private int field4496 = 4096;

    @OriginalMember(owner = "client!ab", name = "J", descriptor = "I")
    private int field4498 = 4096;

    @OriginalMember(owner = "client!ab", name = "O", descriptor = "I")
    private int field4503 = 4096;

    @OriginalMember(owner = "client!ab", name = "G", descriptor = "[I")
    private int[] field4495 = new int[3];

    @OriginalMember(owner = "client!ab", name = "R", descriptor = "I")
    private int field4506 = 409;

    @OriginalMember(owner = "client!ab", name = "K", descriptor = "I")
    public static int field4499 = 0;

    @OriginalMember(owner = "client!ab", name = "M", descriptor = "I")
    public static int field4501 = -1;

    @OriginalMember(owner = "client!ab", name = "I", descriptor = "[Lql;")
    public static class323[] field4497 = new class323[4];

    @OriginalMember(owner = "client!ab", name = "L", descriptor = "I")
    public static int field4500;

    @OriginalMember(owner = "client!ab", name = "P", descriptor = "I")
    public static int field4504;

    @OriginalMember(owner = "client!ab", name = "Q", descriptor = "I")
    public static int field4505;

    @OriginalMember(owner = "client!ab", name = "S", descriptor = "Ljava/lang/Thread;")
    public static Thread field4507;

    @OriginalMember(owner = "client!ab", name = "N", descriptor = "[[[I")
    public static int[][][] field4502;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(BLlm;Llm;Llm;)V", line = 5)
    public static final void method2055(byte arg0, class210 arg1, class210 arg2, class210 arg3) {
        field4500++;
        class237.field3556 = arg1;
        class58.field724 = arg2;
        class210.field3181 = arg3;
        if (arg0 >= -61) {
            field4501 = -20;
        }
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "()V", line = 154)
    public class294() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "(I)V", line = 31)
    public static void method2056(int arg0) {
        field4507 = null;
        field4502 = (int[][][]) null;
        field4497 = null;
        if (arg0 != 1) {
            method2055((byte) 43, (class210) null, (class210) null, (class210) null);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IZ)[[I", line = 46)
    public final int[][] method445(int arg0, boolean arg1) {
        if (arg1) {
            method2055((byte) 12, (class210) null, (class210) null, (class210) null);
        }
        field4505++;
        int[][] var3 = this.field1701.method1477((byte) 64, arg0);
        if (this.field1701.field3255) {
            int[][] var4 = this.method770(arg0, (byte) 71, 0);
            int[] var5 = var3[0];
            int[] var6 = var4[2];
            int[] var7 = var4[0];
            int[] var8 = var3[1];
            int[] var9 = var4[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class124.field1936; var11++) {
                int var12 = var7[var11];
                int var13 = var12 - this.field4495[0];
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (var13 > this.field4506) {
                    var5[var11] = var12;
                    var8[var11] = var9[var11];
                    var10[var11] = var6[var11];
                } else {
                    int var14 = var9[var11];
                    int var15 = var14 - this.field4495[1];
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (var15 <= this.field4506) {
                        int var16 = var6[var11];
                        int var17 = var16 - this.field4495[2];
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (var17 > this.field4506) {
                            var5[var11] = var12;
                            var8[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var5[var11] = this.field4496 * var12 >> 12;
                            var8[var11] = this.field4498 * var14 >> 12;
                            var10[var11] = this.field4503 * var16 >> 12;
                        }
                    } else {
                        var5[var11] = var12;
                        var8[var11] = var14;
                        var10[var11] = var6[var11];
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILre;I)V", line = 158)
    public final void method44(int arg0, class263 arg1, int arg2) {
        field4504++;
        if (arg0 == 0) {
            this.field4506 = arg1.method1830((byte) -77);
        } else if (arg0 == 1) {
            this.field4503 = arg1.method1830((byte) -77);
        } else if (arg0 == 2) {
            this.field4498 = arg1.method1830((byte) -77);
        } else if (arg0 == 3) {
            this.field4496 = arg1.method1830((byte) -77);
        } else if (arg0 == 4) {
            int var5 = arg1.method1824(false);
            this.field4495[0] = class124.method893(var5 << 4, 267386880);
            this.field4495[1] = class124.method893(65280, var5) >> 4;
            this.field4495[2] = class124.method893(0, var5 >> 12);
        }
        if (arg2 >= -37) {
            this.method44(53, (class263) null, -56);
        }
    }
}
