import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class172 {

    @OriginalMember(owner = "client!bk", name = "l", descriptor = "I")
    private int field2685 = 0;

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "I")
    public int field2675 = -1;

    @OriginalMember(owner = "client!bk", name = "q", descriptor = "I")
    private int field2690 = 0;

    @OriginalMember(owner = "client!bk", name = "p", descriptor = "Z")
    public boolean field2689 = false;

    @OriginalMember(owner = "client!bk", name = "s", descriptor = "I")
    private int field2692 = 128;

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "Z")
    public boolean field2679 = false;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "I")
    private int field2674 = 0;

    @OriginalMember(owner = "client!bk", name = "r", descriptor = "I")
    private int field2691 = 128;

    @OriginalMember(owner = "client!bk", name = "t", descriptor = "Z")
    public static boolean field2693 = false;

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "Lui;")
    public static class98 field2680 = new class98(50);

    @OriginalMember(owner = "client!bk", name = "v", descriptor = "Lsi;")
    public static class264 field2695 = null;

    @OriginalMember(owner = "client!bk", name = "y", descriptor = "Ljava/lang/String;")
    public static String field2698 = "Loading...";

    @OriginalMember(owner = "client!bk", name = "x", descriptor = "[I")
    public static int[] field2697 = new int[2];

    @OriginalMember(owner = "client!bk", name = "z", descriptor = "F")
    public static float field2699;

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "I")
    public int field2676;

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "I")
    public static int field2677;

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "I")
    public static int field2678;

    @OriginalMember(owner = "client!bk", name = "j", descriptor = "I")
    public static int field2683;

    @OriginalMember(owner = "client!bk", name = "k", descriptor = "I")
    private int field2684;

    @OriginalMember(owner = "client!bk", name = "m", descriptor = "I")
    public static int field2686;

    @OriginalMember(owner = "client!bk", name = "u", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!bk", name = "w", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!bk", name = "h", descriptor = "[S")
    private short[] field2681;

    @OriginalMember(owner = "client!bk", name = "i", descriptor = "[S")
    private short[] field2682;

    @OriginalMember(owner = "client!bk", name = "n", descriptor = "[S")
    private short[] field2687;

    @OriginalMember(owner = "client!bk", name = "o", descriptor = "[S")
    private short[] field2688;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lfh;II)V", line = 10)
    private final void method1184(class313 arg0, int arg1, int arg2) {
        if (arg2 != 9) {
            this.field2689 = true;
        }
        field2677++;
        if (arg1 == 1) {
            this.field2684 = arg0.method2250(-1613178296);
        } else if (arg1 == 2) {
            this.field2675 = arg0.method2250(-1613178296);
        } else if (arg1 == 4) {
            this.field2691 = arg0.method2250(arg2 - 1613178305);
        } else if (arg1 == 5) {
            this.field2692 = arg0.method2250(-1613178296);
        } else if (arg1 == 6) {
            this.field2690 = arg0.method2250(-1613178296);
        } else if (arg1 == 7) {
            this.field2685 = arg0.method2224(-123);
        } else if (arg1 == 8) {
            this.field2674 = arg0.method2224(-123);
        } else if (arg1 == 9) {
            this.field2679 = true;
        } else if (arg1 == 10) {
            this.field2689 = true;
        } else if (arg1 == 40) {
            int var6 = arg0.method2224(arg2 - 131);
            this.field2688 = new short[var6];
            this.field2682 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field2688[var7] = (short) arg0.method2250(class185.method1279(arg2, -1613178303));
                this.field2682[var7] = (short) arg0.method2250(-1613178296);
            }
        } else if (arg1 == 41) {
            int var4 = arg0.method2224(-122);
            this.field2681 = new short[var4];
            this.field2687 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2687[var5] = (short) arg0.method2250(arg2 - 1613178305);
                this.field2681[var5] = (short) arg0.method2250(-1613178296);
            }
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "([Lsi;II)V", line = 100)
    public static final void method1185(class264[] arg0, int arg1, int arg2) {
        field2696++;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            class264 var4 = arg0[var3];
            if (var4 != null) {
                if (var4.field4350 == 0) {
                    if (var4.field4314 != null) {
                        method1185(var4.field4314, 18376, arg2);
                    }
                    class167 var5 = (class167) class218.field3363.method29((long) var4.field4204, arg1 ^ 0x47AF);
                    if (var5 != null) {
                        class160.method1134(arg2, (byte) -70, var5.field2631);
                    }
                }
                if (arg2 == 0 && var4.field4294 != null) {
                    class190 var6 = new class190();
                    var6.field2940 = var4.field4294;
                    var6.field2937 = var4;
                    class201.method1372(var6, 200000);
                }
                if (arg2 == 1 && var4.field4325 != null) {
                    if (var4.field4240 >= 0) {
                        class264 var7 = class94.method629(5386, var4.field4204);
                        if (var7 == null || var7.field4314 == null || var7.field4314.length <= var4.field4240 || var7.field4314[var4.field4240] != var4) {
                            continue;
                        }
                    }
                    class190 var8 = new class190();
                    var8.field2940 = var4.field4325;
                    var8.field2937 = var4;
                    class201.method1372(var8, 200000);
                }
            }
        }
        if (arg1 != 18376) {
            method1190(true, 107, -63);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIII)Lsm;", line = 174)
    public final class128 method1186(int arg0, int arg1, int arg2, int arg3) {
        field2686++;
        class128 var5 = (class128) class207.field3155.method652((long) this.field2676, false);
        if (var5 == null) {
            class135 var6 = class135.method925(class287.field4787, this.field2684, 0);
            if (var6 == null) {
                return null;
            }
            if (this.field2688 != null) {
                for (int var7 = 0; var7 < this.field2688.length; var7++) {
                    var6.method904(this.field2688[var7], this.field2682[var7]);
                }
            }
            if (this.field2687 != null) {
                for (int var8 = 0; var8 < this.field2687.length; var8++) {
                    var6.method930(this.field2687[var8], this.field2681[var8]);
                }
            }
            var5 = var6.method906(this.field2685 + 64, 850 - -this.field2674, -30, -50, -30);
            class207.field3155.method642(var5, (long) this.field2676, -84);
        }
        class128 var9;
        if (this.field2675 == -1 || arg1 == -1) {
            var9 = var5.method198(true, true, true);
        } else {
            var9 = class68.method476((byte) 103, this.field2675).method853(arg3, arg1, arg2, 650731984, var5);
        }
        if (this.field2691 != 128 || this.field2692 != 128) {
            var9.method169(this.field2691, this.field2692, this.field2691);
        }
        if (arg0 != -25079) {
            return (class128) null;
        }
        if (this.field2690 != 0) {
            if (this.field2690 == 90) {
                var9.method171();
            }
            if (this.field2690 == 180) {
                var9.method167();
            }
            if (this.field2690 == 270) {
                var9.method166();
            }
        }
        return var9;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lnm;Lnm;I)V", line = 255)
    public static final void method1187(class221 arg0, class221 arg1, int arg2) {
        field2694++;
        class285.field4671 = arg0;
        class148.field2384 = arg1;
        if (arg2 <= 35) {
            method1185((class264[]) null, 35, -92);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lfh;B)V", line = 267)
    public final void method1188(class313 arg0, byte arg1) {
        field2678++;
        if (arg1 < 4) {
            method1187((class221) null, (class221) null, 121);
        }
        while (true) {
            int var3 = arg0.method2224(-121);
            if (var3 == 0) {
                return;
            }
            this.method1184(arg0, var3, 9);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Z)V", line = 297)
    public static void method1189(boolean arg0) {
        field2698 = null;
        field2697 = null;
        field2680 = null;
        if (arg0) {
            field2695 = null;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ZII)V", line = 326)
    public static final void method1190(boolean arg0, int arg1, int arg2) {
        field2683++;
        class179.field2785 = class88.field1256 + class88.field1262 - arg2 - 1;
        class32.field488 = arg1 - class88.field1261;
        if (!arg0) {
            method1185((class264[]) null, 14, -109);
        }
    }
}
