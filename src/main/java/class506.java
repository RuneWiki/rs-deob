import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class506 {

    @OriginalMember(owner = "client!md", name = "l", descriptor = "Lom;")
    private class344 field7182;

    @OriginalMember(owner = "client!md", name = "h", descriptor = "[[I")
    private int[][] field7178;

    @OriginalMember(owner = "client!md", name = "e", descriptor = "I")
    private int field7175;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "[Z")
    private boolean[] field7171;

    @OriginalMember(owner = "client!md", name = "g", descriptor = "Lsb;")
    public static class266 field7177 = new class266(35, 11);

    @OriginalMember(owner = "client!md", name = "k", descriptor = "Lia;")
    public static class547 field7181 = new class547();

    @OriginalMember(owner = "client!md", name = "m", descriptor = "Lsb;")
    public static class266 field7183 = new class266(32, 12);

    @OriginalMember(owner = "client!md", name = "b", descriptor = "I")
    public static int field7172;

    @OriginalMember(owner = "client!md", name = "c", descriptor = "I")
    public static int field7173;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "I")
    public static int field7174;

    @OriginalMember(owner = "client!md", name = "f", descriptor = "I")
    public static int field7176;

    @OriginalMember(owner = "client!md", name = "i", descriptor = "I")
    public static int field7179;

    @OriginalMember(owner = "client!md", name = "j", descriptor = "I")
    public static int field7180;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Z)Z")
    public final boolean method3003(boolean arg0) {
        if (!arg0) {
            this.method3003(false);
        }
        field7179++;
        return this.field7175 != -1;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(II)Lpda;")
    public final class584 method3004(int arg0, int arg1) {
        field7174++;
        if (arg0 == 1274) {
            byte[] var3 = this.field7182.method2216(1, arg1, true);
            class584 var4 = new class584();
            var4.method3346(84, new class61(var3));
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(B)V")
    public static void method3005(byte arg0) {
        field7177 = null;
        field7183 = null;
        if (arg0 <= 7) {
            method3008(-126, 42);
        }
        field7181 = null;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIII)V")
    public static final void method3006(int arg0, int arg1, int arg2, int arg3) {
        field7180++;
        if (arg2 <= 69) {
            field7183 = null;
        }
        class472 var4 = class240.field3541[arg3][arg0];
        class703.method3927(-30924, var4 == null ? class14.field742 : var4, arg1);
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(II)[I")
    public final int[] method3007(int arg0, int arg1) {
        field7176++;
        if (arg0 < 0 || this.field7178.length <= arg0) {
            return this.field7175 == -1 ? new int[0] : new int[] { this.field7175 };
        } else if (this.field7171[arg0] && this.field7178[arg0].length > 1) {
            int var3 = this.field7175 == -1 ? 0 : 1;
            Random var4 = new Random();
            int[] var5 = new int[this.field7178[arg0].length];
            class692.method3874(this.field7178[arg0], 0, var5, 0, var5.length);
            if (arg1 != -27084) {
                this.field7171 = null;
            }
            for (int var6 = var3; var6 < var5.length; var6++) {
                int var7 = var3 + class468.method2795(var4, var5.length - var3, (byte) -93);
                int var8 = var5[var6];
                var5[var6] = var5[var7];
                var5[var7] = var8;
            }
            return var5;
        } else {
            return this.field7178[arg0];
        }
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Lmea;ILom;)V")
    public class506(class398 arg0, int arg1, class344 arg2) {
        this.field7182 = arg2;
        this.field7182.method2236(1, 0);
        class61 var4 = new class61(this.field7182.method2216(0, 0, true));
        int var5 = var4.method732(-559537960);
        if (var5 > 3) {
            this.field7178 = new int[0][];
            this.field7175 = -1;
            this.field7171 = new boolean[0];
        } else {
            int var6 = var4.method732(-559537960);
            class598[] var7 = class319.method2053((byte) 110);
            boolean var8 = true;
            if (var7.length == var6) {
                for (int var9 = 0; var9 < var7.length; var9++) {
                    int var10 = var4.method732(-559537960);
                    if (var7[var9].field8576 != var10) {
                        var8 = false;
                        break;
                    }
                }
            } else {
                var8 = false;
            }
            if (var8) {
                int var11 = var4.method732(-559537960);
                int var12 = var4.method732(-559537960);
                if (var5 <= 2) {
                    this.field7175 = -1;
                } else {
                    this.field7175 = var4.method721(-461515024);
                }
                this.field7171 = new boolean[var12 + 1];
                this.field7178 = new int[var12 + 1][];
                for (int var13 = 0; var13 < var11; var13++) {
                    int var15 = var4.method732(-559537960);
                    this.field7171[var15] = var4.method732(-559537960) == 1;
                    int var16 = var4.method723((byte) -25);
                    if (this.field7175 == -1) {
                        this.field7178[var15] = new int[var16];
                        for (int var17 = 0; var17 < var16; var17++) {
                            this.field7178[var15][var17] = var4.method723((byte) -25);
                        }
                    } else {
                        this.field7178[var15] = new int[var16 + 1];
                        this.field7178[var15][0] = this.field7175;
                        for (int var18 = 0; var18 < var16; var18++) {
                            this.field7178[var15][var18 + 1] = var4.method723((byte) -25);
                        }
                    }
                }
                for (int var14 = 0; var14 < var12 + 1; var14++) {
                    if (this.field7178[var14] == null) {
                        if (this.field7175 == -1) {
                            this.field7178[var14] = new int[0];
                        } else {
                            this.field7178[var14] = new int[] { this.field7175 };
                        }
                    }
                }
            } else {
                this.field7175 = -1;
                this.field7178 = new int[0][];
                this.field7171 = new boolean[0];
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "c", descriptor = "(II)I")
    public static final int method3008(int arg0, int arg1) {
        if (arg1 >= -7) {
            field7177 = null;
        }
        field7172++;
        return arg0 & 0x7F;
    }
}
