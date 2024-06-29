import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public class class425 extends class114 {

    @OriginalMember(owner = "client!vs", name = "C", descriptor = "I")
    private int field6476;

    @OriginalMember(owner = "client!vs", name = "x", descriptor = "Lni;")
    public static class367 field6471 = new class367(61, 3);

    @OriginalMember(owner = "client!vs", name = "E", descriptor = "J")
    public static long field6478 = -1L;

    @OriginalMember(owner = "client!vs", name = "F", descriptor = "Lni;")
    public static class367 field6479 = new class367(19, 7);

    @OriginalMember(owner = "client!vs", name = "G", descriptor = "F")
    public static float field6480;

    @OriginalMember(owner = "client!vs", name = "t", descriptor = "I")
    public static int field6467;

    @OriginalMember(owner = "client!vs", name = "u", descriptor = "I")
    public static int field6468;

    @OriginalMember(owner = "client!vs", name = "v", descriptor = "I")
    public static int field6469;

    @OriginalMember(owner = "client!vs", name = "w", descriptor = "I")
    public static int field6470;

    @OriginalMember(owner = "client!vs", name = "A", descriptor = "I")
    public static int field6474;

    @OriginalMember(owner = "client!vs", name = "B", descriptor = "I")
    public static int field6475;

    @OriginalMember(owner = "client!vs", name = "D", descriptor = "I")
    public static int field6477;

    @OriginalMember(owner = "client!vs", name = "y", descriptor = "[Ldt;")
    public class161[] field6472;

    @OriginalMember(owner = "client!vs", name = "z", descriptor = "[[B")
    private byte[][] field6473;

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(II)Z")
    public final boolean method2591(int arg0, int arg1) {
        field6469++;
        if (arg0 != -1123836575) {
            field6478 = -79L;
        }
        return this.field6472[arg1].field2103;
    }

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "(B)V")
    public static void method2592(byte arg0) {
        if (arg0 != 114) {
            method2598();
        }
        field6471 = null;
        field6479 = null;
    }

    @OriginalMember(owner = "client!vs", name = "f", descriptor = "(I)Z")
    public final boolean method2593(int arg0) {
        field6467++;
        if (this.field6472 != null) {
            return true;
        }
        if (this.field6473 == null) {
            if (!class176.field2358.method1268(-121, this.field6476)) {
                return false;
            }
            int[] var2 = class176.field2358.method1293(this.field6476, 20938);
            this.field6473 = new byte[var2.length][];
            for (int var3 = 0; var3 < var2.length; var3++) {
                this.field6473[var3] = class176.field2358.method1281(this.field6476, var2[var3], 70);
            }
        }
        boolean var4 = true;
        for (int var5 = 0; var5 < this.field6473.length; var5++) {
            byte[] var14 = this.field6473[var5];
            int var15 = var14[1] & 0xFF | (var14[0] & 0xFF) << 8;
            var4 &= class14.field264.method1288(var15, 18555);
        }
        if (!var4) {
            return false;
        }
        class63 var6 = new class63();
        int var7 = class176.field2358.method1290(false, this.field6476);
        this.field6472 = new class161[var7];
        if (arg0 <= 77) {
            this.method2597(-73, 59);
        }
        int[] var8 = class176.field2358.method1293(this.field6476, 20938);
        for (int var9 = 0; var9 < var8.length; var9++) {
            byte[] var10 = this.field6473[var9];
            int var11 = (var10[0] & 0xFF) << 8 | var10[1] & 0xFF;
            class393 var12 = null;
            for (class393 var13 = (class393) var6.method445(33); var13 != null; var13 = (class393) var6.method451(false)) {
                if (var13.field6013 == var11) {
                    var12 = var13;
                    break;
                }
            }
            if (var12 == null) {
                var12 = new class393(var11, class14.field264.method1289(var11, 110));
                var6.method453((byte) 102, var12);
            }
            this.field6472[var8[var9]] = new class161(var10, var12);
        }
        this.field6473 = null;
        return true;
    }

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "(II)Z")
    public final boolean method2594(int arg0, int arg1) {
        if (arg0 != 17729) {
            method2592((byte) 19);
        }
        field6477++;
        return this.field6472[arg1].field2097;
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(III[FIII)V")
    public static final void method2595(int arg0, int arg1, int arg2, float[] arg3, int arg4, int arg5, int arg6) {
        field6470++;
        if (arg0 > 0 && !class152.method994(arg0, false)) {
            throw new IllegalArgumentException("");
        } else if (arg5 <= 0 || class152.method994(arg5, false)) {
            int var7 = class429.method2623((byte) -43, arg2);
            int var8 = 0;
            int var9 = arg0 >= arg5 ? arg5 : arg0;
            int var10 = arg0 >> 1;
            int var11 = arg5 >> 1;
            float[] var12 = arg3;
            float[] var13 = new float[var10 * var11 * var7];
            while (true) {
                OpenGL.glTexImage2Df(arg6, var8, arg4, arg0, arg5, 0, arg2, 5126, var12, 0);
                if (var9 <= 1) {
                    if (arg1 <= 103) {
                        field6471 = null;
                        return;
                    }
                    return;
                }
                int var14 = arg0 * var7;
                for (int var15 = 0; var15 < var7; var15++) {
                    int var17 = var15;
                    int var18 = var15;
                    int var19 = var14 + var15;
                    for (int var20 = 0; var20 < var11; var20++) {
                        for (int var21 = 0; var21 < var10; var21++) {
                            float var22 = var12[var18];
                            int var23 = var7 + var18;
                            float var24 = var12[var23] + var22;
                            float var25 = var12[var19] + var24;
                            var18 = var7 + var23;
                            int var26 = var7 + var19;
                            float var27 = var12[var26] + var25;
                            var13[var17] = var27 * 0.25F;
                            var19 = var7 + var26;
                            var17 += var7;
                        }
                        var18 += var14;
                        var19 += var14;
                    }
                }
                float[] var16 = var13;
                var13 = var12;
                arg0 = var10;
                var12 = var16;
                arg5 = var11;
                var8++;
                var11 >>= 0x1;
                var9 >>= 0x1;
                var10 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(ILqa;)V")
    public static final void method2596(int arg0, class165 arg1) {
        if (arg0 != -13194) {
            field6480 = 0.18325745F;
        }
        field6475++;
        if (class232.field3307) {
            class151.method989(true, arg1);
        } else {
            class344.method2231(-32603, arg1);
        }
    }

    @OriginalMember(owner = "client!vs", name = "c", descriptor = "(II)Z")
    public final boolean method2597(int arg0, int arg1) {
        if (arg0 != 12010) {
            this.method2597(51, 106);
        }
        field6468++;
        return this.field6472[arg1].field2105;
    }

    @OriginalMember(owner = "client!vs", name = "<init>", descriptor = "(I)V")
    public class425(int arg0) {
        this.field6476 = arg0;
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "()V")
    public static final void method2598() {
        if (class453.field6825 != null) {
            for (int var0 = 0; var0 < class453.field6825.length; var0++) {
                for (int var1 = 0; var1 < class533.field7842; var1++) {
                    for (int var2 = 0; var2 < class475.field7051; var2++) {
                        if (class453.field6825[var0][var1][var2] != null) {
                            class453.field6825[var0][var1][var2].method2756(5071);
                        }
                        class453.field6825[var0][var1][var2] = null;
                    }
                }
            }
        }
        class453.field6825 = null;
        class414.field6317 = null;
        if (class35.field516 != null) {
            for (int var3 = 0; var3 < class35.field516.length; var3++) {
                for (int var4 = 0; var4 < class533.field7842; var4++) {
                    for (int var5 = 0; var5 < class475.field7051; var5++) {
                        if (class35.field516[var3][var4][var5] != null) {
                            class35.field516[var3][var4][var5].method2756(5071);
                        }
                        class35.field516[var3][var4][var5] = null;
                    }
                }
            }
        }
        class35.field516 = null;
        class71.field988 = null;
        class443.field6672 = null;
        class306.field4447 = null;
        class526.field7715 = 0;
        if (class306.field4446 != null) {
            for (int var6 = 0; var6 < class526.field7715; var6++) {
                class306.field4446[var6] = null;
            }
        }
        if (class1.field8 != null) {
            for (int var7 = 0; var7 < class527.field7728; var7++) {
                class1.field8[var7] = null;
            }
            class527.field7728 = 0;
        }
        if (class514.field7556 != null) {
            for (int var8 = 0; var8 < class401.field6115; var8++) {
                class514.field7556[var8] = null;
            }
            for (int var9 = 0; var9 < class141.field1892; var9++) {
                for (int var10 = 0; var10 < class533.field7842; var10++) {
                    for (int var11 = 0; var11 < class475.field7051; var11++) {
                        class411.field6251[var9][var10][var11] = 0L;
                    }
                }
            }
            class401.field6115 = 0;
        }
        class162.field2116 = null;
        class178.method1196(-19942);
        class36.field526.method3046(109);
        class113.field1574 = null;
        class374.field5693 = null;
        class236.field3344 = null;
        class463.field6923 = null;
        class362.field5577 = null;
        class516.field7574 = null;
    }
}
