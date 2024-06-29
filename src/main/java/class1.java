import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public class class1 extends class243 {

    @OriginalMember(owner = "client!us", name = "J", descriptor = "[F")
    public static float[] field6 = new float[16384];

    @OriginalMember(owner = "client!us", name = "D", descriptor = "[F")
    public static float[] field1 = new float[16384];

    @OriginalMember(owner = "client!us", name = "E", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!us", name = "F", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!us", name = "G", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!us", name = "H", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!us", name = "M", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!us", name = "N", descriptor = "Ljt;")
    public static class107 field10;

    @OriginalMember(owner = "client!us", name = "L", descriptor = "[Lhga;")
    public static class175[] field8;

    @OriginalMember(owner = "client!us", name = "K", descriptor = "[Lhm;")
    private class222[] field7;

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(ILji;B)V")
    public final void method1(int arg0, class611 arg1, byte arg2) {
        if (arg0 == 0) {
            this.field7 = new class222[arg1.method3428((byte) -118)];
            for (int var4 = 0; ~this.field7.length < ~var4; ++var4) {
                int var5 = arg1.method3428((byte) 43);
                if (var5 != 0) {
                    if (~var5 != -2) {
                        if (var5 != 2) {
                            if (var5 == 3) {
                                this.field7[var4] = class71.method532(arg1, (byte) 51);
                            }
                        } else {
                            this.field7[var4] = class743.method4156((byte) -121, arg1);
                        }
                    } else {
                        this.field7[var4] = class374.method2199(false, arg1);
                    }
                } else {
                    this.field7[var4] = class72.method535(-120, arg1);
                }
            }
        } else if (arg0 == 1) {
            super.field3159 = ~arg1.method3428((byte) 30) == -2;
        }
        if (arg2 >= -92) {
            this.field7 = null;
        }
        ++field3;
    }

    @OriginalMember(owner = "client!us", name = "b", descriptor = "(II)[[I")
    public final int[][] method2(int arg0, int arg1) {
        ++field4;
        if (arg0 > -76) {
            this.method2(-3, -64);
        }
        int[][] var3 = super.field3156.method3306(arg1, 0);
        if (super.field3156.field8335) {
            int var4 = class687.field9628;
            int var5 = class676.field9444;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.field3156.method3308(26279);
            this.method4(true, var6);
            for (int var8 = 0; ~var8 > ~class676.field9444; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; var14 < class687.field9628; ++var14) {
                    int var15 = var9[var14];
                    var13[var14] = class321.method1919(var15, 255) << 4;
                    var12[var14] = class321.method1919(4080, var15 >> 4);
                    var11[var14] = class321.method1919(var15 >> 12, 4080);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!us", name = "e", descriptor = "(B)I")
    public static final int method3(byte arg0) {
        if (arg0 <= 49) {
            field10 = null;
        }
        ++field5;
        return ~class392.field5553 == -2 ? class582.field8155 : class460.field6372;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Z[[I)V")
    private final void method4(boolean arg0, int[][] arg1) {
        ++field2;
        if (arg0) {
            int var3 = class687.field9628;
            int var4 = class676.field9444;
            class161.method955((byte) -102, arg1);
            class655.method3694(class28.field206, (byte) -118, class625.field8744, 0, 0);
            if (this.field7 != null) {
                for (int var5 = 0; ~var5 > ~this.field7.length; ++var5) {
                    class222 var6 = this.field7[var5];
                    int var7 = var6.field2872;
                    int var8 = var6.field2868;
                    if (var7 < 0) {
                        if (~var8 <= -1) {
                            var6.method1269((byte) -96, var4, var3);
                        }
                    } else if (var8 >= 0) {
                        var6.method1264(var3, var4, -5515);
                    } else {
                        var6.method1268(82, var3, var4);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(II)[I")
    public final int[] method5(int arg0, int arg1) {
        ++field9;
        int[] var3 = super.field3164.method3742((byte) 98, arg1);
        if (arg0 != 255) {
            field8 = null;
        }
        if (super.field3164.field9250) {
            this.method4(true, super.field3164.method3743(-124));
        }
        return var3;
    }

    @OriginalMember(owner = "client!us", name = "c", descriptor = "(I)V")
    public static void method6(int arg0) {
        if (arg0 == 0) {
            field8 = null;
            field10 = null;
            field6 = null;
            field1 = null;
        }
    }

    @OriginalMember(owner = "client!us", name = "<init>", descriptor = "()V")
    public class1() {
        super(0, true);
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; ++var2) {
            field6[var2] = (float) Math.sin((double) var2 * var0);
            field1[var2] = (float) Math.cos((double) var2 * var0);
        }
    }
}
