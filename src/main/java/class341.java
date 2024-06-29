import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class341 extends class397 {

    @OriginalMember(owner = "client!dn", name = "N", descriptor = "I")
    private int field4955 = 4096;

    @OriginalMember(owner = "client!dn", name = "O", descriptor = "I")
    private int field4956 = 4096;

    @OriginalMember(owner = "client!dn", name = "R", descriptor = "I")
    private int field4959 = 4096;

    @OriginalMember(owner = "client!dn", name = "M", descriptor = "[I")
    private int[] field4954 = new int[3];

    @OriginalMember(owner = "client!dn", name = "Q", descriptor = "I")
    private int field4958 = 409;

    @OriginalMember(owner = "client!dn", name = "P", descriptor = "J")
    public static long field4957 = 0L;

    @OriginalMember(owner = "client!dn", name = "U", descriptor = "Liu;")
    public static class390 field4962;

    @OriginalMember(owner = "client!dn", name = "V", descriptor = "[[F")
    public static float[][] field4963;

    @OriginalMember(owner = "client!dn", name = "L", descriptor = "I")
    public static int field4953;

    @OriginalMember(owner = "client!dn", name = "S", descriptor = "I")
    public static int field4960;

    @OriginalMember(owner = "client!dn", name = "T", descriptor = "I")
    public static int field4961;

    static {
        new class194("Unable to add friend - system busy.", "Der Freund konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un ami - système occupé.", "Não foi possível adicionar o amigo. O sistema está ocupado.");
        field4962 = new class390(13, 5);
        field4963 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };
    }

    @OriginalMember(owner = "client!dn", name = "<init>", descriptor = "()V", line = 21)
    public class341() {
        super(1, false);
    }

    @OriginalMember(owner = "client!dn", name = "e", descriptor = "(B)V", line = 9)
    public static void method2066(byte arg0) {
        if (arg0 <= -15) {
            field4962 = null;
            field4963 = null;
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IBLae;)V", line = 24)
    public final void method27(int arg0, byte arg1, class156 arg2) {
        if (arg1 != 80) {
            this.method486((byte) 21, 4);
        }
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (~arg0 == -5) {
                            int var5 = arg2.method943(1295851312);
                            this.field4954[1] = class500.method3013(4080, var5 >> 4);
                            this.field4954[0] = class500.method3013(var5, 16711680) << 4;
                            this.field4954[2] = class500.method3013(var5, 255) >> 12;
                        }
                    } else {
                        this.field4955 = arg2.method993((byte) -118);
                    }
                } else {
                    this.field4959 = arg2.method993((byte) -104);
                }
            } else {
                this.field4956 = arg2.method993((byte) -37);
            }
        } else {
            this.field4958 = arg2.method993((byte) -125);
        }
        ++field4960;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(BI)[[I", line = 92)
    public final int[][] method486(byte arg0, int arg1) {
        ++field4953;
        int[][] var3 = super.field5848.method1692(arg1, 109);
        if (arg0 < 81) {
            this.field4959 = -84;
        }
        if (super.field5848.field3939) {
            int[][] var4 = this.method2377(arg1, -20, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class164.field2152 > var11; ++var11) {
                int var12 = var5[var11];
                int var13 = -this.field4954[0] + var12;
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (var13 > this.field4958) {
                    var8[var11] = var12;
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = var14 - this.field4954[1];
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (~var15 < ~this.field4958) {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = -this.field4954[2] + var16;
                        if (~var17 > -1) {
                            var17 = -var17;
                        }
                        if (var17 > this.field4958) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var8[var11] = this.field4955 * var12 >> 12;
                            var9[var11] = this.field4959 * var14 >> 12;
                            var10[var11] = this.field4956 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dn", name = "f", descriptor = "(III)V", line = 183)
    public static final void method2067(int arg0, int arg1, int arg2) {
        if (arg2 != -3) {
            method2067(-70, -90, -39);
        }
        ++field4961;
        if (!(class249.field3581 < class249.field3576)) {
            if (class249.field3581 > class249.field3576) {
                class249.field3581 = (float) ((double) class249.field3581 - (double) class249.field3581 / 30.0D);
                if (class249.field3581 < class249.field3576) {
                    class249.field3581 = class249.field3576;
                }
                class126.method706(4832);
                class249.field3577 = (int) class249.field3581 >> 1;
                class249.field3579 = class449.method2620((byte) 108, class249.field3577);
            }
        } else {
            class249.field3581 = (float) ((double) class249.field3581 / 30.0D + (double) class249.field3581);
            if (class249.field3576 < class249.field3581) {
                class249.field3581 = class249.field3576;
            }
            class126.method706(4832);
            class249.field3577 = (int) class249.field3581 >> 1;
            class249.field3579 = class449.method2620((byte) 108, class249.field3577);
        }
        if (~class261.field3728 != 0 && ~class134.field1711 != 0) {
            int var3 = -class192.field2715 + class261.field3728;
            if (var3 < 2 || ~var3 < -3) {
                var3 /= 8;
            }
            int var4 = -class364.field5477 + class134.field1711;
            if (var4 < 2 || var4 > 2) {
                var4 /= 8;
            }
            class192.field2715 += var3;
            if (var3 == 0 && var4 == 0) {
                class261.field3728 = -1;
                class134.field1711 = -1;
            }
            class364.field5477 += var4;
            class126.method706(4832);
        }
        if (~class440.field6432 < -1) {
            --class135.field1729;
            if (class135.field1729 == 0) {
                class135.field1729 = 100;
                --class440.field6432;
            }
        } else {
            class440.field6424 = -1;
            class33.field540 = -1;
        }
        if (class258.field3698 && class56.field883 != null) {
            for (class45 var5 = (class45) class56.field883.method2096(-21400); var5 != null; var5 = (class45) class56.field883.method2084((byte) 19)) {
                class170 var6 = class249.field3573.method282(var5.field689.field6017, 51);
                if (!var5.method349(arg0, arg1, -24270)) {
                    if (var5.field689.field6015) {
                        var5.field689.field6015 = false;
                        class396.method2367(class114.field1470, var5.field689.field6017, var6.field2242);
                    }
                } else {
                    if (var6.field2262 != null) {
                        if (var6.field2262[4] != null) {
                            class495.method2974(true, (long) var5.field689.field6017, 1006, var6.field2262[4], -1, var6.field2242, -1, var6.field2263, 0, false, -1);
                        }
                        if (var6.field2262[3] != null) {
                            class495.method2974(true, (long) var5.field689.field6017, 1003, var6.field2262[3], -1, var6.field2242, -1, var6.field2263, 0, false, -1);
                        }
                        if (var6.field2262[2] != null) {
                            class495.method2974(true, (long) var5.field689.field6017, 1001, var6.field2262[2], -1, var6.field2242, -1, var6.field2263, 0, false, -1);
                        }
                        if (var6.field2262[1] != null) {
                            class495.method2974(true, (long) var5.field689.field6017, 1008, var6.field2262[1], -1, var6.field2242, -1, var6.field2263, 0, false, -1);
                        }
                        if (var6.field2262[0] != null) {
                            class495.method2974(true, (long) var5.field689.field6017, 1012, var6.field2262[0], -1, var6.field2242, -1, var6.field2263, 0, false, -1);
                        }
                    }
                    if (!var5.field689.field6015) {
                        var5.field689.field6015 = true;
                        class396.method2367(class317.field4654, var5.field689.field6017, var6.field2242);
                    }
                    if (var5.field689.field6015) {
                        class396.method2367(class352.field5105, var5.field689.field6017, var6.field2242);
                    }
                }
            }
        }
    }
}
