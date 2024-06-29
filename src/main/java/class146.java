import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class146 {

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "I")
    public int field2296 = -1;

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "I")
    private int field2301 = 0;

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "I")
    public int field2303 = 128;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "Z")
    public boolean field2299 = true;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "[[Z")
    public static boolean[][] field2298 = new boolean[][] { new boolean[0], { true, false, true }, { true, false, false, true }, { false, false, true, true }, { true, true, false }, { false, true, true }, { true, false, false, true }, { false, false, false, true, true }, { false, true, true }, { true, false, true, true, true }, { false, true, true, true, true }, { false, true, true, true, true, false } };

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "J")
    public static long field2306 = 0L;

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "I")
    public static int field2297;

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "I")
    public int field2300;

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!rd", name = "l", descriptor = "I")
    public int field2307;

    @OriginalMember(owner = "client!rd", name = "m", descriptor = "I")
    public static int field2308;

    @OriginalMember(owner = "client!rd", name = "n", descriptor = "I")
    public int field2309;

    @OriginalMember(owner = "client!rd", name = "p", descriptor = "I")
    public int field2311;

    @OriginalMember(owner = "client!rd", name = "q", descriptor = "I")
    public static int field2312;

    @OriginalMember(owner = "client!rd", name = "r", descriptor = "I")
    public static int field2313;

    @OriginalMember(owner = "client!rd", name = "o", descriptor = "Lql;")
    public static class337 field2310;

    @OriginalMember(owner = "client!rd", name = "s", descriptor = "Lgb;")
    public static class88 field2314;

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "[I")
    public static int[] field2305;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZILvl;)V", line = 8)
    public final void method1076(boolean arg0, int arg1, class6 arg2) {
        field2313++;
        if (!arg0) {
            return;
        }
        while (true) {
            int var4 = arg2.method58(-288140008);
            if (var4 == 0) {
                return;
            }
            this.method1079(false, var4, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILvc;Ljava/awt/Component;BI)Lea;", line = 28)
    public static final class246 method1077(int arg0, class137 arg1, Component arg2, byte arg3, int arg4) {
        field2312++;
        if (class318.field5024 == 0) {
            throw new IllegalStateException();
        } else if (arg0 >= 0 && arg0 < 2) {
            if (arg4 < 256) {
                arg4 = 256;
            }
            try {
                class246 var5 = (class246) Class.forName("ii").getDeclaredConstructor().newInstance();
                var5.field3867 = arg4;
                if (arg3 <= 86) {
                    return (class246) null;
                }
                var5.field3835 = new int[(class157.field2427 ? 2 : 1) * 256];
                var5.method530(arg2);
                var5.field3868 = (arg4 & 0xFFFFFC00) + 1024;
                if (var5.field3868 > 16384) {
                    var5.field3868 = 16384;
                }
                var5.method528(var5.field3868);
                if (class61.field903 > 0 && class251.field3958 == null) {
                    class251.field3958 = new class241();
                    class251.field3958.field3754 = arg1;
                    arg1.method1014(class251.field3958, 6, class61.field903);
                }
                if (class251.field3958 != null) {
                    if (class251.field3958.field3758[arg0] != null) {
                        throw new IllegalArgumentException();
                    }
                    class251.field3958.field3758[arg0] = var5;
                }
                return var5;
            } catch (Throwable var10) {
                try {
                    class67 var7 = new class67(arg1, arg0);
                    var7.field3835 = new int[(class157.field2427 ? 2 : 1) * 256];
                    var7.field3867 = arg4;
                    var7.method530(arg2);
                    var7.field3868 = 16384;
                    var7.method528(var7.field3868);
                    if (class61.field903 > 0 && class251.field3958 == null) {
                        class251.field3958 = new class241();
                        class251.field3958.field3754 = arg1;
                        arg1.method1014(class251.field3958, 6, class61.field903);
                    }
                    if (class251.field3958 != null) {
                        if (class251.field3958.field3758[arg0] != null) {
                            throw new IllegalArgumentException();
                        }
                        class251.field3958.field3758[arg0] = var7;
                    }
                    return var7;
                } catch (Throwable var9) {
                    return new class246();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)V", line = 137)
    private final void method1078(int arg0, int arg1) {
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg0 & 0xFF) / 256.0D;
        double var7 = var3;
        double var9 = var3;
        double var11 = 0.0D;
        field2297++;
        double var13 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        int var15 = 6 % ((17 - arg1) / 38);
        double var16 = 0.0D;
        if (var13 < var3) {
            var9 = var13;
        }
        if (var3 < var13) {
            var7 = var13;
        }
        if (var7 < var5) {
            var7 = var5;
        }
        if (var9 > var5) {
            var9 = var5;
        }
        double var18 = (var7 + var9) / 2.0D;
        if (var7 != var9) {
            if (var18 < 0.5D) {
                var16 = (var7 - var9) / (var7 + var9);
            }
            if (var18 >= 0.5D) {
                var16 = (var7 - var9) / (2.0D - var7 - var9);
            }
            if (var3 == var7) {
                var11 = (var13 - var5) / (var7 - var9);
            } else if (var7 == var13) {
                var11 = (var5 - var3) / (var7 - var9) + 2.0D;
            } else if (var5 == var7) {
                var11 = (var3 - var13) / (var7 - var9) + 4.0D;
            }
        }
        double var20 = var11 / 6.0D;
        if (var18 > 0.5D) {
            this.field2300 = (int) ((1.0D - var18) * var16 * 512.0D);
        } else {
            this.field2300 = (int) (var16 * var18 * 512.0D);
        }
        this.field2311 = (int) (var18 * 256.0D);
        if (this.field2300 < 1) {
            this.field2300 = 1;
        }
        if (this.field2311 < 0) {
            this.field2311 = 0;
        } else if (this.field2311 > 255) {
            this.field2311 = 255;
        }
        this.field2307 = (int) ((double) this.field2300 * var20);
        this.field2309 = (int) (var16 * 256.0D);
        if (this.field2309 < 0) {
            this.field2309 = 0;
        } else if (this.field2309 > 255) {
            this.field2309 = 255;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZILvl;I)V", line = 226)
    private final void method1079(boolean arg0, int arg1, class6 arg2, int arg3) {
        if (arg1 == 1) {
            this.field2301 = arg2.method31(-22888);
            this.method1078(this.field2301, 66);
        } else if (arg1 == 2) {
            this.field2296 = arg2.method39((byte) 42);
            if (this.field2296 == 65535) {
                this.field2296 = -1;
            }
        } else if (arg1 == 3) {
            this.field2303 = arg2.method39((byte) 108);
        } else if (arg1 == 4) {
            this.field2299 = false;
        }
        if (arg0) {
            this.method1076(true, -28, (class6) null);
        }
        field2302++;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V", line = 264)
    public static void method1080(int arg0) {
        if (arg0 >= -68) {
            field2305 = (int[]) null;
        }
        field2305 = null;
        field2314 = null;
        field2310 = null;
        field2298 = (boolean[][]) null;
    }
}
