import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class283 extends class232 {

    @OriginalMember(owner = "client!lc", name = "S", descriptor = "I")
    private int field4749 = 4096;

    @OriginalMember(owner = "client!lc", name = "X", descriptor = "I")
    private int field4754 = 409;

    @OriginalMember(owner = "client!lc", name = "V", descriptor = "I")
    private int field4752 = 4096;

    @OriginalMember(owner = "client!lc", name = "U", descriptor = "[I")
    private int[] field4751 = new int[3];

    @OriginalMember(owner = "client!lc", name = "W", descriptor = "I")
    private int field4753 = 4096;

    @OriginalMember(owner = "client!lc", name = "R", descriptor = "I")
    public static int field4748 = 0;

    @OriginalMember(owner = "client!lc", name = "Y", descriptor = "Lhi;")
    public static class82 field4755 = class95.method664((byte) -100, "Prendre");

    @OriginalMember(owner = "client!lc", name = "db", descriptor = "[[I")
    public static int[][] field4760 = new int[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!lc", name = "Q", descriptor = "I")
    public static int field4747;

    @OriginalMember(owner = "client!lc", name = "T", descriptor = "I")
    public static int field4750;

    @OriginalMember(owner = "client!lc", name = "ab", descriptor = "I")
    public static int field4757;

    @OriginalMember(owner = "client!lc", name = "bb", descriptor = "I")
    public static int field4758;

    @OriginalMember(owner = "client!lc", name = "cb", descriptor = "I")
    public static int field4759;

    @OriginalMember(owner = "client!lc", name = "P", descriptor = "[[I")
    public static int[][] field4746;

    @OriginalMember(owner = "client!lc", name = "Z", descriptor = "[[[B")
    public static byte[][][] field4756;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IBLbc;)V", line = 4)
    public final void method81(int arg0, byte arg1, class153 arg2) {
        field4747++;
        if (arg0 == 0) {
            this.field4754 = arg2.method1090(false);
        } else if (arg0 == 1) {
            this.field4749 = arg2.method1090(false);
        } else if (arg0 == 2) {
            this.field4752 = arg2.method1090(false);
        } else if (arg0 == 3) {
            this.field4753 = arg2.method1090(false);
        } else if (arg0 == 4) {
            int var5 = arg2.method1107((byte) 82);
            this.field4751[0] = class277.method1935(var5 << 4, 267386880);
            this.field4751[1] = class277.method1935(65280, var5) >> 4;
            this.field4751[2] = class277.method1935(0, var5 >> 12);
        }
        if (arg1 != -19) {
            this.field4749 = -116;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(BLbc;)Ldm;", line = 73)
    public static final class23 method1966(byte arg0, class153 arg1) {
        field4757++;
        class23 var2 = new class23();
        if (arg0 != 26) {
            method1968(100);
        }
        var2.field320 = arg1.method1090(false);
        var2.field318 = class280.method1951(var2.field320, 26029);
        return var2;
    }

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "(I)V", line = 88)
    public static void method1967(int arg0) {
        if (arg0 != 35) {
            method1968(-32);
        }
        field4760 = (int[][]) null;
        field4756 = (byte[][][]) null;
        field4755 = null;
        field4746 = (int[][]) null;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IB)[[I", line = 105)
    public final int[][] method146(int arg0, byte arg1) {
        field4750++;
        if (arg1 != -82) {
            field4748 = 29;
        }
        int[][] var3 = this.field3996.method136(0, arg0);
        if (this.field3996.field278) {
            int[][] var4 = this.method1641(0, arg0, (byte) -98);
            int[] var5 = var4[1];
            int[] var6 = var4[2];
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var4[0];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class54.field858; var11++) {
                int var12 = var9[var11];
                int var13 = var12 - this.field4751[0];
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (this.field4754 >= var13) {
                    int var14 = var5[var11];
                    int var15 = var14 - this.field4751[1];
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (this.field4754 >= var15) {
                        int var16 = var6[var11];
                        int var17 = var16 - this.field4751[2];
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (this.field4754 >= var17) {
                            var7[var11] = this.field4753 * var12 >> 12;
                            var8[var11] = this.field4752 * var14 >> 12;
                            var10[var11] = this.field4749 * var16 >> 12;
                        } else {
                            var7[var11] = var12;
                            var8[var11] = var14;
                            var10[var11] = var16;
                        }
                    } else {
                        var7[var11] = var12;
                        var8[var11] = var14;
                        var10[var11] = var6[var11];
                    }
                } else {
                    var7[var11] = var12;
                    var8[var11] = var5[var11];
                    var10[var11] = var6[var11];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "()V", line = 231)
    public class283() {
        super(1, false);
    }

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "(I)V", line = 214)
    public static final void method1968(int arg0) {
        field4759++;
        if (arg0 < 19) {
            return;
        }
        if (class142.field2435 != null) {
            class142.field2435.method767((byte) -45);
        }
        if (class67.field1048 != null) {
            class67.field1048.method767((byte) -71);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)V", line = 243)
    public static final void method1969(boolean arg0) {
        field4758++;
        class245.field4254 = class134.method917(true, 8, 0.4F, 2048, 8, (byte) 76, 35, 4);
        if (arg0) {
            field4748 = 87;
        }
    }
}
