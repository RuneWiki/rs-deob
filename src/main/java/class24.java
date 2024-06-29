import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class24 {

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
    private int field546 = 0;

    @OriginalMember(owner = "client!cc", name = "p", descriptor = "I")
    private int field559 = -1;

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "Lqd;")
    private class148 field556 = new class148();

    @OriginalMember(owner = "client!cc", name = "r", descriptor = "Z")
    public boolean field561 = false;

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "[Lna;")
    private class118[] field549;

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "[[[I")
    private int[][][] field555;

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "I")
    private int field553;

    @OriginalMember(owner = "client!cc", name = "o", descriptor = "I")
    private int field558;

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "Z")
    public static volatile boolean field554 = false;

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "Lgg;")
    public static class63 field551 = class116.method911(43, "mapmarker");

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "[I")
    public static int[] field545 = new int[2000];

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "Lgg;")
    public static class63 field547 = null;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
    public static int field544;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "I")
    public static int field548;

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "I")
    public static int field550;

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "I")
    public static int field552;

    @OriginalMember(owner = "client!cc", name = "q", descriptor = "I")
    public static int field560;

    @OriginalMember(owner = "client!cc", name = "n", descriptor = "Ljc;")
    public static class85 field557;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V")
    public final void method232(int arg0) {
        for (int var2 = 0; var2 < this.field553; var2++) {
            this.field555[var2][0] = null;
            this.field555[var2][1] = null;
            this.field555[var2][2] = null;
            this.field555[var2] = null;
        }
        this.field555 = null;
        this.field549 = null;
        field548++;
        if (arg0 <= 121) {
            this.method237(-43, -37);
        }
        this.field556.method1031(0);
        this.field556 = null;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(III)Leb;")
    public static final class41 method233(int arg0, int arg1, int arg2) {
        class96 var3 = class148.field3117[arg0][arg1][arg2];
        return var3 == null || var3.field2294 == null ? null : var3.field2294;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IILqe;ILjava/awt/Component;)Lfc;")
    public static final class51 method234(int arg0, int arg1, class149 arg2, int arg3, Component arg4) {
        field560++;
        if (class124.field2762 == 0) {
            throw new IllegalStateException();
        } else if (arg3 >= 0 && arg3 < 2) {
            if (arg1 < 256) {
                arg1 = 256;
            }
            try {
                class51 var5 = (class51) Class.forName("ib").getDeclaredConstructor().newInstance();
                var5.field1244 = arg1;
                var5.field1225 = new int[(class125.field2774 ? 2 : 1) * 256];
                var5.method507(arg4);
                var5.field1256 = (arg1 & 0xFFFFFC00) + 1024;
                if (var5.field1256 > 16384) {
                    var5.field1256 = 16384;
                }
                var5.method492(var5.field1256);
                if (class183.field3714 > 0 && class196.field3946 == null) {
                    class196.field3946 = new class134();
                    class196.field3946.field2894 = arg2;
                    arg2.method1045(class196.field3946, (byte) 94, class183.field3714);
                }
                if (class196.field3946 != null) {
                    if (class196.field3946.field2891[arg3] != null) {
                        throw new IllegalArgumentException();
                    }
                    class196.field3946.field2891[arg3] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class61 var6 = new class61(arg2, arg3);
                    var6.field1244 = arg1;
                    var6.field1225 = new int[(class125.field2774 ? 2 : 1) * 256];
                    var6.method507(arg4);
                    var6.field1256 = 16384;
                    var6.method492(var6.field1256);
                    if (class183.field3714 > 0 && class196.field3946 == null) {
                        class196.field3946 = new class134();
                        class196.field3946.field2894 = arg2;
                        arg2.method1045(class196.field3946, (byte) 91, class183.field3714);
                    }
                    if (class196.field3946 != null) {
                        if (class196.field3946.field2891[arg3] != null) {
                            throw new IllegalArgumentException();
                        }
                        class196.field3946.field2891[arg3] = var6;
                    }
                    if (arg0 < 106) {
                        field547 = null;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class51();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Ljc;IZLth;Ljc;)V")
    public static final void method235(class85 arg0, int arg1, boolean arg2, class179 arg3, class85 arg4) {
        class5.field140 = arg0;
        if (arg1 != 2000) {
            return;
        }
        class171.field3547 = arg4;
        class117.field2622 = arg2;
        field544++;
        class161.field3319 = class171.field3547.method759(10, false);
        class8.field179 = arg3;
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V")
    public static void method236(int arg0) {
        field551 = null;
        int var1 = 22 / ((arg0 - 64) / 32);
        field545 = null;
        field557 = null;
        field547 = null;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)[[I")
    public final int[][] method237(int arg0, int arg1) {
        if (arg0 != -1) {
            return null;
        }
        field550++;
        if (this.field558 == this.field553) {
            this.field561 = this.field549[arg1] == null;
            this.field549[arg1] = class22.field525;
            return this.field555[arg1];
        } else if (this.field553 == 1) {
            this.field561 = this.field559 != arg1;
            this.field559 = arg1;
            return this.field555[0];
        } else {
            class118 var3 = this.field549[arg1];
            if (this.field561 = var3 == null) {
                if (this.field546 >= this.field553) {
                    class118 var4 = (class118) this.field556.method1040(-112);
                    var3 = new class118(arg1, var4.field2639);
                    this.field549[var4.field2629] = null;
                    var4.method1172(arg0 - 22);
                } else {
                    var3 = new class118(arg1, this.field546);
                    this.field546++;
                }
                this.field549[arg1] = var3;
            }
            this.field556.method1038(~arg0, var3);
            return this.field555[var3.field2639];
        }
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(III)V")
    public class24(int arg0, int arg1, int arg2) {
        this.field549 = new class118[arg1];
        this.field555 = new int[arg0][3][arg2];
        this.field553 = arg0;
        this.field558 = arg1;
    }
}
