import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class148 extends class198 {

    @OriginalMember(owner = "client!dg", name = "L", descriptor = "I")
    public static int field2316 = 0;

    @OriginalMember(owner = "client!dg", name = "I", descriptor = "I")
    public static int field2313;

    @OriginalMember(owner = "client!dg", name = "K", descriptor = "I")
    public static int field2315;

    @OriginalMember(owner = "client!dg", name = "M", descriptor = "I")
    public static int field2317;

    @OriginalMember(owner = "client!dg", name = "O", descriptor = "I")
    public static int field2319;

    @OriginalMember(owner = "client!dg", name = "Q", descriptor = "I")
    public static int field2321;

    @OriginalMember(owner = "client!dg", name = "R", descriptor = "I")
    public static int field2322;

    @OriginalMember(owner = "client!dg", name = "S", descriptor = "I")
    public static int field2323;

    @OriginalMember(owner = "client!dg", name = "J", descriptor = "Lbe;")
    public static class30 field2314;

    @OriginalMember(owner = "client!dg", name = "P", descriptor = "[Lra;")
    private class253[] field2320;

    @OriginalMember(owner = "client!dg", name = "N", descriptor = "[[[B")
    public static byte[][][] field2318;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ZI)[I")
    public final int[] method32(boolean arg0, int arg1) {
        ++field2319;
        if (!arg0) {
            this.field2320 = null;
        }
        int[] var3 = super.field3134.method36(arg1, 30672);
        if (super.field3134.field69) {
            this.method981((byte) 2, super.field3134.method35(-17218));
        }
        return var3;
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "()V")
    public class148() {
        super(0, true);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(B[[I)V")
    private final void method981(byte arg0, int[][] arg1) {
        ++field2313;
        int var3 = class42.field590;
        if (arg0 != 2) {
            this.method200(-101, -55);
        }
        int var4 = class258.field4243;
        class2.method5(arg1, 37);
        class176.method1181(0, (byte) -95, 0, class52.field704, class227.field3594);
        if (this.field2320 != null) {
            for (int var5 = 0; ~this.field2320.length < ~var5; ++var5) {
                class253 var6 = this.field2320[var5];
                int var7 = var6.field4010;
                int var8 = var6.field4014;
                if (~var7 <= -1) {
                    if (~var8 <= -1) {
                        var6.method40(var4, (byte) -14, var3);
                    } else {
                        var6.method44(var4, false, var3);
                    }
                } else if (var8 >= 0) {
                    var6.method47(var4, -109, var3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)[[I")
    public final int[][] method200(int arg0, int arg1) {
        if (arg1 != -2) {
            method982();
        }
        int[][] var3 = super.field3150.method642(arg0, 1);
        ++field2317;
        if (super.field3150.field1498) {
            int var4 = class42.field590;
            int var5 = class258.field4243;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.field3150.method644((byte) -109);
            this.method981((byte) 2, var6);
            for (int var8 = 0; ~var8 > ~class258.field4243; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[1];
                int[] var12 = var10[0];
                int[] var13 = var10[2];
                for (int var14 = 0; ~var14 > ~class42.field590; ++var14) {
                    int var15 = var9[var14];
                    var13[var14] = class10.method53(var15, 255) << 4;
                    var11[var14] = class10.method53(var15, 65280) >> 4;
                    var12[var14] = class10.method53(var15, 16711680) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "()V")
    public static final void method982() {
        if (class280.field4638 != null) {
            for (int var0 = 0; var0 < class280.field4638.length; ++var0) {
                for (int var1 = 0; var1 < class183.field2835; ++var1) {
                    for (int var2 = 0; var2 < class90.field1391; ++var2) {
                        class280.field4638[var0][var1][var2] = null;
                    }
                }
            }
        }
        if (class114.field1727 != null) {
            for (int var3 = 0; var3 < class114.field1727.length; ++var3) {
                for (int var4 = 0; var4 < class183.field2835; ++var4) {
                    for (int var5 = 0; var5 < class90.field1391; ++var5) {
                        class114.field1727[var3][var4][var5] = null;
                    }
                }
            }
        }
        class262.field4328 = 0;
        if (class75.field1179 != null) {
            for (int var6 = 0; var6 < class262.field4328; ++var6) {
                class75.field1179[var6] = null;
            }
        }
        if (class207.field3309 != null) {
            for (int var7 = 0; var7 < class259.field4255; ++var7) {
                class207.field3309[var7] = null;
            }
            class259.field4255 = 0;
        }
        if (class24.field317 != null) {
            for (int var8 = 0; var8 < class24.field317.length; ++var8) {
                class24.field317[var8] = null;
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ILma;I)V")
    public final void method52(int arg0, class202 arg1, int arg2) {
        if (arg2 == 0) {
            this.field2320 = new class253[arg1.method1420((byte) 0)];
            for (int var4 = 0; this.field2320.length > var4; ++var4) {
                int var5 = arg1.method1420((byte) 0);
                if (~var5 != -1) {
                    if (var5 != 1) {
                        if (~var5 != -3) {
                            if (~var5 == -4) {
                                this.field2320[var4] = class157.method1036(arg1, -116);
                            }
                        } else {
                            this.field2320[var4] = class161.method1069(-22403, arg1);
                        }
                    } else {
                        this.field2320[var4] = class193.method1342(arg1, (byte) 78);
                    }
                } else {
                    this.field2320[var4] = class219.method1536((byte) -101, arg1);
                }
            }
        } else if (arg2 == 1) {
            super.field3139 = ~arg1.method1420((byte) 0) == -2;
        }
        int var7 = -13 / ((arg0 - 60) / 61);
        ++field2322;
    }

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "(B)V")
    public static final void method983(byte arg0) {
        if (arg0 >= -101) {
            field2323 = -69;
        }
        ++field2321;
        if (~class4.field34 == -6) {
            class4.field34 = 6;
        }
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(II)Lhg;")
    public static final class190 method984(int arg0, int arg1) {
        ++field2315;
        if (arg0 != -27185) {
            field2323 = -103;
        }
        class190 var2 = (class190) class262.field4321.method1343(-127, (long) arg1);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class226.field3590.method1877(arg1, 26, (byte) 81);
            class190 var4 = new class190();
            if (var3 != null) {
                var4.method1286(9762, new class202(var3));
            }
            class262.field4321.method1337(var4, (long) arg1, -1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "(B)V")
    public static void method985(byte arg0) {
        field2314 = null;
        if (arg0 <= -67) {
            field2318 = null;
        }
    }
}
