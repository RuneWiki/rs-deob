import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class235 extends class199 {

    @OriginalMember(owner = "client!of", name = "cb", descriptor = "[S")
    private short[] field3377 = new short[257];

    @OriginalMember(owner = "client!of", name = "db", descriptor = "I")
    private int field3378 = 0;

    @OriginalMember(owner = "client!of", name = "S", descriptor = "I")
    public static int field3367;

    @OriginalMember(owner = "client!of", name = "T", descriptor = "I")
    public static int field3368;

    @OriginalMember(owner = "client!of", name = "V", descriptor = "I")
    public static int field3370;

    @OriginalMember(owner = "client!of", name = "W", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!of", name = "Y", descriptor = "I")
    public static int field3373;

    @OriginalMember(owner = "client!of", name = "ab", descriptor = "I")
    public static int field3375;

    @OriginalMember(owner = "client!of", name = "bb", descriptor = "I")
    public static int field3376;

    @OriginalMember(owner = "client!of", name = "eb", descriptor = "I")
    public static int field3379;

    @OriginalMember(owner = "client!of", name = "fb", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!of", name = "gb", descriptor = "I")
    public static int field3381;

    @OriginalMember(owner = "client!of", name = "Z", descriptor = "Lgl;")
    public static class281 field3374;

    @OriginalMember(owner = "client!of", name = "X", descriptor = "[I")
    private int[] field3372;

    @OriginalMember(owner = "client!of", name = "hb", descriptor = "[I")
    private int[] field3382;

    @OriginalMember(owner = "client!of", name = "U", descriptor = "[[I")
    private int[][] field3369;

    @OriginalMember(owner = "client!of", name = "f", descriptor = "(B)V", line = 7)
    public static final void method1667(byte arg0) {
        if (arg0 != -114) {
            method1671(-8);
        }
        field3376++;
        class312.field4584.method2258((byte) 86);
        class260.field3769.method2258((byte) 86);
    }

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(II)[I", line = 21)
    private final int[] method1668(int arg0, int arg1) {
        field3380++;
        if (arg1 <= 121) {
            field3371 = -77;
        }
        if (arg0 >= 0) {
            return this.field3369.length > arg0 ? this.field3369[arg0] : this.field3382;
        } else {
            return this.field3372;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(II)[I", line = 42)
    public final int[] method190(int arg0, int arg1) {
        field3381++;
        int[] var3 = this.field2802.method2502(arg1, 93);
        if (arg0 != -1735) {
            this.field3377 = (short[]) null;
        }
        if (this.field2802.field5637) {
            int[] var4 = this.method1467(-7764, arg1, 0);
            for (int var5 = 0; var5 < class95.field1235; var5++) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field3377[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!of", name = "f", descriptor = "(I)V", line = 81)
    private final void method1669(int arg0) {
        field3368++;
        if (arg0 <= 103) {
            field3371 = 99;
        }
        int var2 = this.field3378;
        if (var2 == 2) {
            for (int var3 = 0; var3 < 257; var3++) {
                int var4 = var3 << 4;
                int var5;
                for (var5 = 1; var5 < this.field3369.length - 1 && var4 >= this.field3369[var5][0]; var5++) {
                }
                int[] var6 = this.field3369[var5];
                int[] var7 = this.field3369[var5 - 1];
                int var8 = this.method1668(var5 - 2, 126)[1];
                int var9 = var6[1];
                int var10 = var7[1];
                int var12 = var9 - var8;
                int var13 = this.method1668(var5 + 1, 125)[1];
                int var14 = (var4 - var7[0] << 12) / (var6[0] - var7[0]);
                int var15 = var10 + var13 - var9 - var8;
                int var16 = var8 - var10 - var15;
                int var17 = var14 * var14 >> 12;
                int var18 = var12 * var14 >> 12;
                int var19 = (var14 * var15 >> 12) * var17 >> 12;
                int var20 = var16 * var17 >> 12;
                int var21 = var19 + var20 + var10 + var18;
                if (var21 <= -32768) {
                    var21 = -32767;
                }
                if (var21 >= 32768) {
                    var21 = 32767;
                }
                this.field3377[var3] = (short) var21;
            }
        } else if (var2 == 1) {
            for (int var30 = 0; var30 < 257; var30++) {
                int var31 = var30 << 4;
                int var32;
                for (var32 = 1; this.field3369.length - 1 > var32 && this.field3369[var32][0] <= var31; var32++) {
                }
                int[] var33 = this.field3369[var32 - 1];
                int[] var34 = this.field3369[var32];
                int var35 = (var31 - var33[0] << 12) / (var34[0] - var33[0]);
                int var36 = 4096 - class112.field1446[var35 >> 5 & 0xFF] >> 1;
                int var37 = 4096 - var36;
                int var38 = var33[1] * var37 + var34[1] * var36 >> 12;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field3377[var30] = (short) var38;
            }
        } else {
            for (int var22 = 0; var22 < 257; var22++) {
                int var23 = var22 << 4;
                int var24;
                for (var24 = 1; (this.field3369.length - 1) > var24 && var23 >= this.field3369[var24][0]; var24++) {
                }
                int[] var25 = this.field3369[var24 - 1];
                int[] var26 = this.field3369[var24];
                int var27 = (var23 - var25[0] << 12) / (var26[0] - var25[0]);
                int var28 = 4096 - var27;
                int var29 = var25[1] * var28 + var26[1] * var27 >> 12;
                if (var29 <= -32768) {
                    var29 = -32767;
                }
                if (var29 >= 32768) {
                    var29 = 32767;
                }
                this.field3377[var22] = (short) var29;
            }
        }
    }

    @OriginalMember(owner = "client!of", name = "g", descriptor = "(I)V", line = 264)
    private final void method1670(int arg0) {
        field3370++;
        int[] var2 = this.field3369[0];
        int[] var3 = this.field3369[1];
        int[] var4 = this.field3369[this.field3369.length - 1];
        int[] var5 = this.field3369[this.field3369.length - 2];
        this.field3382 = new int[] { var5[0] + var5[0] - var4[0], var5[1] - -var5[1] - var4[1] };
        this.field3372 = new int[] { var2[0] - (var3[0] - var2[arg0]), var2[1] + -var3[1] + var2[1] };
    }

    @OriginalMember(owner = "client!of", name = "h", descriptor = "(I)V", line = 282)
    public static void method1671(int arg0) {
        if (arg0 < -83) {
            field3374 = null;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(BLjava/lang/String;)V", line = 292)
    public static final void method1672(byte arg0, String arg1) {
        field3367++;
        if (class217.field3070 >= 2) {
            if (arg1.equalsIgnoreCase("::gc")) {
                class302.method2120((byte) 64);
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class88.method641((String) null, 0, false, "mem=" + var4 + "k");
            }
            if (arg1.equalsIgnoreCase("::mm")) {
                class302.method2120((byte) 64);
                for (int var5 = 0; var5 < 10; var5++) {
                    System.gc();
                }
                Runtime var6 = Runtime.getRuntime();
                int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class88.method641((String) null, 0, false, "Memory before cleanup=" + var7 + "k");
                class15.method112(124);
                class302.method2120((byte) 64);
                for (int var8 = 0; var8 < 10; var8++) {
                    System.gc();
                }
                int var9 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class88.method641((String) null, 0, false, "Memory after cleanup=" + var9 + "k");
            }
            if (arg1.equalsIgnoreCase("::pcachesize")) {
                class88.method641((String) null, 0, false, "Number of player models in cache:" + class49.method390((byte) 127));
            }
            if (class47.field623 && arg1.equalsIgnoreCase("::cardmem")) {
                System.out.println("oncard_geometry:" + class298.field4319);
                System.out.println("oncard_2d:" + class298.field4323);
                System.out.println("oncard_texture:" + class298.field4318);
            }
            if (arg1.equalsIgnoreCase("::clientdrop")) {
                class359.method2494((byte) -68);
            }
            if (arg1.equalsIgnoreCase("::clientjs5drop")) {
                class85.field1092.method19(-117);
            }
            if (arg1.equalsIgnoreCase("::serverjs5drop")) {
                class85.field1092.method10(0);
            }
            if (arg1.equalsIgnoreCase("::breakcon")) {
                class157.field2216.method512(5000);
                class265.field3848.method527((byte) 52);
                class85.field1092.method15((byte) -127);
            }
            if (arg1.equalsIgnoreCase("::replacecanvas")) {
                class132.field1796 = true;
            }
            if (arg1.equalsIgnoreCase("::rebuild")) {
                class59.method445(25, (byte) 124);
            }
            if (arg1.equalsIgnoreCase("::fpson")) {
                class234.field3352 = true;
            }
            if (arg1.equalsIgnoreCase("::fpsoff")) {
                class234.field3352 = false;
            }
            if (arg1.equalsIgnoreCase("::wm0")) {
                class158.method1216(false, -104, 0, -1, -1);
            }
            if (arg1.equalsIgnoreCase("::wm1")) {
                class158.method1216(false, -109, 1, -1, -1);
            }
            if (arg1.equalsIgnoreCase("::wm2")) {
                class158.method1216(false, -128, 2, -1, -1);
            }
            if (arg1.equalsIgnoreCase("::wm3")) {
                class158.method1216(false, -121, 3, 1024, 768);
            }
            if (arg1.startsWith("::setba")) {
                class58.field745 = class16.method118(true, arg1.substring(8));
                class122.method879(-25299, class157.field2216);
                class352.field5491 = false;
            }
            if (arg1.startsWith("::setparticles")) {
                class187.method1359(class16.method118(true, arg1.substring(15)));
                class122.method879(-25299, class157.field2216);
                class352.field5491 = false;
            }
            if (arg1.startsWith("::fps ") && class145.field2021 != 0) {
                class124.method919(class16.method118(true, arg1.substring(6)), -27143);
            }
            if (arg1.equalsIgnoreCase("::errortest")) {
                throw new RuntimeException();
            }
            if (arg1.startsWith("::rect_debug")) {
                class159.field2259 = class16.method118(true, arg1.substring(12).trim());
                class88.method641((String) null, 0, false, "rect_debug=" + class159.field2259);
            }
            if (arg1.equalsIgnoreCase("::qa_op_test")) {
                class40.field503 = true;
            }
            if (arg1.startsWith("::hdr") && class47.field623 && !class32.method199(!class46.method337(), 947635216)) {
                class88.method641((String) null, 0, false, "Failed to enable hdr");
            }
            if (arg1.equalsIgnoreCase("::tween")) {
                if (class354.field5523) {
                    class354.field5523 = false;
                    class88.method641((String) null, 0, false, "Forced tweening disabled.");
                } else {
                    class354.field5523 = true;
                    class88.method641((String) null, 0, false, "Forced tweening ENABLED!");
                }
            }
            if (arg1.equalsIgnoreCase("::shiftclick")) {
                if (class226.field3257) {
                    System.out.println("Shift-click disabled.");
                    class226.field3257 = false;
                } else {
                    System.out.println("Shift-click ENABLED!");
                    class226.field3257 = true;
                }
            }
            if (arg1.equalsIgnoreCase("::getcgcoord")) {
                class88.method641((String) null, 0, false, "x:" + (class359.field5616.field4855 >> 7) + " z:" + (class359.field5616.field4893 >> 7) + " groundh:" + class74.field978[class56.field724][class359.field5616.field4855 >> 7][class359.field5616.field4893 >> 7]);
            }
            if (arg1.equalsIgnoreCase("::getheight")) {
                class88.method641((String) null, 0, false, "Height: " + class74.field978[class56.field724][class359.field5616.field4855 >> 7][class359.field5616.field4893 >> 7]);
            }
        }
        class251.field3681.method1309(23, 216);
        class118.field1539++;
        class251.field3681.method2048(arg1.length() - 1, 107);
        int var10 = -78 / ((arg0 - 9) / 55);
        class251.field3681.method2042(arg1.substring(2), -73);
    }

    @OriginalMember(owner = "client!of", name = "e", descriptor = "(B)V", line = 515)
    public final void method189(byte arg0) {
        int var2 = -61 / ((36 - arg0) / 44);
        if (this.field3369 == null) {
            this.field3369 = new int[][] { { 0, 0 }, { 4096, 4096 } };
        }
        field3373++;
        if (this.field3369.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        }
        if (this.field3378 == 2) {
            this.method1670(0);
        }
        class177.method1304((byte) -29);
        this.method1669(113);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(BLfd;I)V", line = 540)
    public final void method193(byte arg0, class299 arg1, int arg2) {
        if (arg0 != -43) {
            return;
        }
        field3379++;
        if (arg2 != 0) {
            return;
        }
        this.field3378 = arg1.method2096((byte) -122);
        this.field3369 = new int[arg1.method2096((byte) -122)][2];
        for (int var4 = 0; var4 < this.field3369.length; var4++) {
            this.field3369[var4][0] = arg1.method2083((byte) -60);
            this.field3369[var4][1] = arg1.method2083((byte) -39);
        }
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "()V", line = 579)
    public class235() {
        super(1, true);
    }

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(III)V", line = 571)
    public static final void method1673(int arg0, int arg1, int arg2) {
        class95.field1242 = true;
        class348.field5430 = arg0;
        class32.field373 = arg1;
        class102.field1325 = arg2;
        class327.field4773 = -1;
        class336.field5258 = -1;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Z)Lfe;", line = 588)
    public static final class153 method1674(boolean arg0) {
        class153 var1 = new class153(class16.field201, class133.field1805, class348.field5418[0], class119.field1578[0], class251.field3673[0], class184.field2508[0], class338.field5276[0], class292.field4253);
        field3375++;
        class236.method1685(false);
        return arg0 ? var1 : (class153) null;
    }
}
