import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class183 {

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "I")
    public int field2795 = -1;

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "Z")
    public boolean field2805 = true;

    @OriginalMember(owner = "client!fc", name = "v", descriptor = "I")
    private int field2813 = 0;

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "I")
    public int field2806 = 128;

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
    public static int field2796 = 0;

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "Ljh;")
    public static class207 field2803 = null;

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "I")
    public static int field2797 = 0;

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "[I")
    public static int[] field2807 = new int[5];

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "Leg;")
    public static class188 field2802 = new class188(2);

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
    public int field2792;

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
    public int field2793;

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "I")
    public static int field2798;

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "I")
    public static int field2799;

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "I")
    public static int field2800;

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "I")
    public static int field2801;

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!fc", name = "q", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!fc", name = "r", descriptor = "I")
    public int field2809;

    @OriginalMember(owner = "client!fc", name = "s", descriptor = "I")
    public int field2810;

    @OriginalMember(owner = "client!fc", name = "u", descriptor = "I")
    public static int field2812;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "Lwf;")
    public static class306 field2794;

    @OriginalMember(owner = "client!fc", name = "t", descriptor = "[[B")
    public static byte[][] field2811;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V", line = 13)
    public static void method1260(int arg0) {
        field2811 = (byte[][]) null;
        field2794 = null;
        field2803 = null;
        field2807 = null;
        field2802 = null;
        if (arg0 != 2) {
            method1261((byte) -22, (String) null);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(BLjava/lang/String;)V", line = 32)
    public static final void method1261(byte arg0, String arg1) {
        System.out.println("Bad " + arg1 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        System.exit(1);
        field2799++;
        if (arg0 != -63) {
            method1264(-16, (String[]) null, -126, (byte) 60);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)V", line = 46)
    private final void method1262(int arg0, int arg1) {
        field2800++;
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) ((arg1 & 0xFFE6) >> 8) / 256.0D;
        double var7 = var3;
        double var9 = var3;
        if (var5 > var3) {
            var9 = var5;
        }
        double var11 = (double) (arg1 & 0xFF) / 256.0D;
        if (var11 > var9) {
            var9 = var11;
        }
        if (var5 < var3) {
            var7 = var5;
        }
        if (var11 < var7) {
            var7 = var11;
        }
        double var13 = (double) arg0;
        double var15 = 0.0D;
        double var17 = (var7 + var9) / 2.0D;
        this.field2792 = (int) (var17 * 256.0D);
        if (var7 != var9) {
            if (var3 == var9) {
                var15 = (var5 - var11) / (var9 - var7);
            } else if (var5 == var9) {
                var15 = (var11 - var3) / (var9 - var7) + 2.0D;
            } else if (var9 == var11) {
                var15 = (var3 - var5) / (var9 - var7) + 4.0D;
            }
            if (var17 < 0.5D) {
                var13 = (var9 - var7) / (var7 + var9);
            }
            if (var17 >= 0.5D) {
                var13 = (var9 - var7) / (2.0D - var9 - var7);
            }
        }
        if (this.field2792 < 0) {
            this.field2792 = 0;
        } else if (this.field2792 > 255) {
            this.field2792 = 255;
        }
        this.field2810 = (int) (var13 * 256.0D);
        if ((var17 > 0.5D)) {
            this.field2793 = (int) ((1.0D - var17) * var13 * 512.0D);
        } else {
            this.field2793 = (int) (var13 * var17 * 512.0D);
        }
        if (this.field2793 < 1) {
            this.field2793 = 1;
        }
        double var19 = var15 / 6.0D;
        this.field2809 = (int) ((double) this.field2793 * var19);
        if (this.field2810 < 0) {
            this.field2810 = 0;
        } else if (this.field2810 > 255) {
            this.field2810 = 255;
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(II)Z", line = 136)
    public static final boolean method1263(int arg0, int arg1) {
        field2804++;
        if (class228.field3658[arg1]) {
            return true;
        } else if (class116.field1793.method2105(30835, arg1)) {
            int var2 = class116.field1793.method2086(arg0, arg1);
            if (var2 == 0) {
                class228.field3658[arg1] = true;
                return true;
            }
            if (class219.field3487[arg1] == null) {
                class219.field3487[arg1] = new class207[var2];
            }
            for (int var3 = arg0; var3 < var2; var3++) {
                if (class219.field3487[arg1][var3] == null) {
                    byte[] var4 = class116.field1793.method2103(0, arg1, var3);
                    if (var4 != null) {
                        class207 var5 = class219.field3487[arg1][var3] = new class207();
                        var5.field3250 = (arg1 << 16) + var3;
                        if (var4[0] == -1) {
                            var5.method1390((byte) 63, new class303(var4));
                        } else {
                            var5.method1392(0, new class303(var4));
                        }
                    }
                }
            }
            class228.field3658[arg1] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I[Ljava/lang/String;IB)Ljava/lang/String;", line = 198)
    public static final String method1264(int arg0, String[] arg1, int arg2, byte arg3) {
        if (arg3 != -124) {
            return (String) null;
        }
        field2812++;
        if (arg2 == 0) {
            return "";
        } else if (arg2 == 1) {
            String var11 = arg1[arg0];
            return var11 == null ? "null" : var11.toString();
        } else {
            int var4 = 0;
            int var5 = arg0 + arg2;
            for (int var6 = arg0; var6 < var5; var6++) {
                String var7 = arg1[var6];
                if (var7 == null) {
                    var4 += 4;
                } else {
                    var4 += var7.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var4);
            for (int var9 = arg0; var9 < var5; var9++) {
                String var10 = arg1[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILgn;II)V", line = 285)
    private final void method1265(int arg0, class303 arg1, int arg2, int arg3) {
        if (arg0 == 1) {
            this.field2813 = arg1.method2059(255);
            this.method1262(0, this.field2813);
        } else if (arg0 == 2) {
            this.field2795 = arg1.method1994(false);
            if (this.field2795 == 65535) {
                this.field2795 = -1;
            }
        } else if (arg0 == 3) {
            this.field2806 = arg1.method1994(false);
        } else if (arg0 == 4) {
            this.field2805 = false;
        }
        field2801++;
        if (arg2 != 95138856) {
            field2808 = -24;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lgn;BI)V", line = 335)
    public final void method1266(class303 arg0, byte arg1, int arg2) {
        field2798++;
        while (true) {
            int var4 = arg0.method2043((byte) -127);
            if (var4 == 0) {
                if (arg1 != -16) {
                    field2803 = (class207) null;
                }
                return;
            }
            this.method1265(var4, arg0, 95138856, arg2);
        }
    }
}
