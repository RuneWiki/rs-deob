import java.awt.Component;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class227 extends class83 {

    @OriginalMember(owner = "client!ic", name = "R", descriptor = "I")
    private int field3093 = 204;

    @OriginalMember(owner = "client!ic", name = "S", descriptor = "I")
    private int field3094 = 409;

    @OriginalMember(owner = "client!ic", name = "bb", descriptor = "I")
    private int field3103 = 8;

    @OriginalMember(owner = "client!ic", name = "eb", descriptor = "I")
    private int field3106 = 4;

    @OriginalMember(owner = "client!ic", name = "X", descriptor = "I")
    private int field3099 = 1024;

    @OriginalMember(owner = "client!ic", name = "ib", descriptor = "I")
    private int field3110 = 81;

    @OriginalMember(owner = "client!ic", name = "gb", descriptor = "I")
    private int field3108 = 0;

    @OriginalMember(owner = "client!ic", name = "K", descriptor = "I")
    private int field3086 = 1024;

    @OriginalMember(owner = "client!ic", name = "T", descriptor = "Z")
    public static boolean field3095 = false;

    @OriginalMember(owner = "client!ic", name = "db", descriptor = "Z")
    public static boolean field3105 = false;

    @OriginalMember(owner = "client!ic", name = "jb", descriptor = "[I")
    public static int[] field3111 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!ic", name = "L", descriptor = "I")
    public static int field3087;

    @OriginalMember(owner = "client!ic", name = "N", descriptor = "I")
    public static int field3089;

    @OriginalMember(owner = "client!ic", name = "Q", descriptor = "I")
    public static int field3092;

    @OriginalMember(owner = "client!ic", name = "V", descriptor = "I")
    private int field3097;

    @OriginalMember(owner = "client!ic", name = "W", descriptor = "I")
    private int field3098;

    @OriginalMember(owner = "client!ic", name = "Y", descriptor = "I")
    public static int field3100;

    @OriginalMember(owner = "client!ic", name = "Z", descriptor = "I")
    public static int field3101;

    @OriginalMember(owner = "client!ic", name = "ab", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "client!ic", name = "cb", descriptor = "I")
    public static int field3104;

    @OriginalMember(owner = "client!ic", name = "fb", descriptor = "I")
    public static int field3107;

    @OriginalMember(owner = "client!ic", name = "hb", descriptor = "I")
    private int field3109;

    @OriginalMember(owner = "client!ic", name = "P", descriptor = "[I")
    private int[] field3091;

    @OriginalMember(owner = "client!ic", name = "O", descriptor = "[Ltd;")
    public static class106[] field3090;

    @OriginalMember(owner = "client!ic", name = "M", descriptor = "[[I")
    private int[][] field3088;

    @OriginalMember(owner = "client!ic", name = "U", descriptor = "[[I")
    private int[][] field3096;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "(B)V", line = 9)
    private final void method1229(byte arg0) {
        ++field3101;
        Random var2 = new Random((long) this.field3103);
        this.field3097 = 4096 / this.field3103;
        this.field3098 = 4096 / this.field3106;
        this.field3109 = this.field3110 / 2;
        int var3 = this.field3098 / 2;
        this.field3096 = new int[this.field3103][this.field3106 + 1];
        this.field3088 = new int[this.field3103][this.field3106];
        int var4 = this.field3097 / 2;
        this.field3091 = new int[this.field3103 + 1];
        this.field3091[0] = 0;
        for (int var5 = 0; var5 < this.field3103; ++var5) {
            if (~var5 < -1) {
                int var6 = this.field3097;
                int var7 = (class409.method2546(arg0 ^ 18960, var2, 4096) + -2048) * this.field3093 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field3091[var5] = this.field3091[var5 + -1] - -var8;
            }
            this.field3096[var5][0] = 0;
            for (int var9 = 0; var9 < this.field3106; ++var9) {
                if (var9 > 0) {
                    int var10 = this.field3098;
                    int var11 = (class409.method2546(18992, var2, 4096) - 2048) * this.field3094 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field3096[var5][var9] = this.field3096[var5][var9 + -1] + var12;
                }
                this.field3088[var5][var9] = ~this.field3086 < -1 ? -class409.method2546(18992, var2, this.field3086) + 4096 : 4096;
            }
            this.field3096[var5][this.field3106] = 4096;
        }
        if (arg0 != 32) {
            this.method35(67, (byte) 114, (class250) null);
        }
        this.field3091[this.field3103] = 4096;
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(Z)V", line = 74)
    public static void method1230(boolean arg0) {
        if (!arg0) {
            field3111 = null;
            field3090 = null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(Z)V", line = 87)
    public final void method120(boolean arg0) {
        ++field3100;
        this.method1229((byte) 32);
        if (arg0) {
            this.method35(-112, (byte) -65, (class250) null);
        }
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "()V", line = 195)
    public class227() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Llh;IILjava/awt/Component;I)Lck;", line = 112)
    public static final class351 method1231(class450 arg0, int arg1, int arg2, Component arg3, int arg4) {
        ++field3104;
        if (~class432.field6338 == -1) {
            throw new IllegalStateException();
        } else if (~arg1 <= -1 && arg1 < 2) {
            if (arg4 < 256) {
                arg4 = 256;
            }
            try {
                class351 var5 = (class351) Class.forName("rn").newInstance();
                var5.field4921 = arg4;
                var5.field4904 = new int[(class67.field689 ? 2 : 1) * 256];
                var5.method718(arg3);
                var5.field4918 = (arg4 & -1024) + 1024;
                if (~var5.field4918 < -16385) {
                    var5.field4918 = 16384;
                }
                var5.method722(var5.field4918);
                if (class305.field4140 > 0 && class67.field696 == null) {
                    class67.field696 = new class289();
                    class67.field696.field3928 = arg0;
                    arg0.method2788(class67.field696, class305.field4140, 45);
                }
                if (class67.field696 != null) {
                    if (class67.field696.field3933[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    class67.field696.field3933[arg1] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class332 var6 = new class332(arg0, arg1);
                    var6.field4904 = new int[(class67.field689 ? 2 : 1) * 256];
                    var6.field4921 = arg4;
                    var6.method718(arg3);
                    var6.field4918 = 16384;
                    var6.method722(var6.field4918);
                    if (arg2 != -1249444089) {
                        return null;
                    } else {
                        if (class305.field4140 > 0 && class67.field696 == null) {
                            class67.field696 = new class289();
                            class67.field696.field3928 = arg0;
                            arg0.method2788(class67.field696, class305.field4140, 81);
                        }
                        if (class67.field696 != null) {
                            if (class67.field696.field3933[arg1] != null) {
                                throw new IllegalArgumentException();
                            }
                            class67.field696.field3933[arg1] = var6;
                        }
                        return var6;
                    }
                } catch (Throwable var7) {
                    return new class351();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)[I", line = 202)
    public final int[] method37(int arg0, int arg1) {
        if (arg0 != 2) {
            return null;
        } else {
            ++field3107;
            int[] var3 = super.field916.method1813(arg1, (byte) -126);
            if (super.field916.field4174) {
                int var4 = 0;
                int var5;
                for (var5 = class225.field3036[arg1] + this.field3108; ~var5 > -1; var5 += 4096) {
                }
                while (~var5 < -4097) {
                    var5 -= 4096;
                }
                while (var4 < this.field3103 && this.field3091[var4] <= var5) {
                    ++var4;
                }
                int var6 = var4 + -1;
                boolean var7 = (1 & var4) == 0;
                int var8 = this.field3091[var4];
                int var9 = this.field3091[var4 + -1];
                if (~var5 < ~(this.field3109 + var9) && -this.field3109 + var8 > var5) {
                    for (int var10 = 0; ~var10 > ~class420.field6139; ++var10) {
                        int var11 = 0;
                        int var12 = !var7 ? -this.field3099 : this.field3099;
                        int var13;
                        for (var13 = (this.field3098 * var12 >> 12) + class402.field5863[var10]; var13 < 0; var13 += 4096) {
                        }
                        while (~var13 < -4097) {
                            var13 -= 4096;
                        }
                        while (var11 < this.field3106 && ~this.field3096[var6][var11] >= ~var13) {
                            ++var11;
                        }
                        int var14 = var11 + -1;
                        int var15 = this.field3096[var6][var11];
                        int var16 = this.field3096[var6][var14];
                        if (~(var16 - -this.field3109) > ~var13 && ~var13 > ~(-this.field3109 + var15)) {
                            var3[var10] = this.field3088[var6][var14];
                        } else {
                            var3[var10] = 0;
                        }
                    }
                } else {
                    class358.method2180(var3, 0, class420.field6139, 0);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "(I)V", line = 307)
    public static final void method1232(int arg0) {
        class114 var1 = class180.field2253;
        synchronized (class180.field2253) {
            class180.field2253.method606((byte) 98);
            if (arg0 != 768) {
                method1232(21);
            }
        }
        ++field3089;
        class114 var2 = class83.field912;
        synchronized (class83.field912) {
            class83.field912.method606((byte) 81);
        }
        class114 var3 = class272.field3672;
        synchronized (class272.field3672) {
            class272.field3672.method606((byte) 80);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IBLtq;)V", line = 343)
    public final void method35(int arg0, byte arg1, class250 arg2) {
        int var4 = 25 / ((-27 - arg1) / 50);
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (arg0 != 4) {
                            if (~arg0 != -6) {
                                if (arg0 != 6) {
                                    if (~arg0 == -8) {
                                        this.field3086 = arg2.method1374(-2);
                                    }
                                } else {
                                    this.field3110 = arg2.method1374(-2);
                                }
                            } else {
                                this.field3108 = arg2.method1374(-2);
                            }
                        } else {
                            this.field3099 = arg2.method1374(-2);
                        }
                    } else {
                        this.field3093 = arg2.method1374(-2);
                    }
                } else {
                    this.field3094 = arg2.method1374(-2);
                }
            } else {
                this.field3103 = arg2.method1350(31351);
            }
        } else {
            this.field3106 = arg2.method1350(31351);
        }
        ++field3092;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Ljava/lang/String;IZ)V", line = 446)
    public static final void method1233(String arg0, int arg1, boolean arg2) {
        ++field3087;
        if (arg1 != 7272) {
            field3102 = 34;
        }
        if (class429.field6292 != 0 || class110.field1357 >= 2) {
            try {
                if (arg0.equalsIgnoreCase("fpson")) {
                    class327.field4346 = true;
                }
                if (arg0.equalsIgnoreCase("fpsoff")) {
                    class327.field4346 = false;
                }
                if (arg0.equalsIgnoreCase("cleartext")) {
                    class118.field1467.method989(1);
                }
                if (arg0.equalsIgnoreCase("gc")) {
                    class370.method2236(128);
                    for (int var3 = 0; ~var3 > -11; ++var3) {
                        System.gc();
                    }
                    Runtime var4 = Runtime.getRuntime();
                    int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
                    class418.method2592("mem=" + var5 + "k", false);
                }
                if (arg0.equalsIgnoreCase("compact")) {
                    class370.method2236(128);
                    for (int var6 = 0; var6 < 10; ++var6) {
                        System.gc();
                    }
                    Runtime var7 = Runtime.getRuntime();
                    int var8 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
                    class418.method2592("Memory before cleanup=" + var8 + "k", false);
                    class108.method570(arg1 + -29378);
                    class370.method2236(128);
                    for (int var9 = 0; ~var9 > -11; ++var9) {
                        System.gc();
                    }
                    int var10 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
                    class418.method2592("Memory after cleanup=" + var10 + "k", false);
                }
                if (arg0.equalsIgnoreCase("pcachesize")) {
                    class418.method2592("Number of player models in cache:" + class84.method459(27582), false);
                }
                if (arg0.equalsIgnoreCase("clientdrop")) {
                    class104.method557(-65);
                }
                if (arg0.equalsIgnoreCase("clientjs5drop")) {
                    class91.field1032.method2190(-52);
                }
                if (arg0.equalsIgnoreCase("serverjs5drop")) {
                    class91.field1032.method2189(16673);
                }
                if (arg0.equalsIgnoreCase("breakcon")) {
                    class159.field2055.method2773(false);
                    class264.field3605.method1530(64);
                    class91.field1032.method2195(86);
                }
                if (arg0.equalsIgnoreCase("rebuild")) {
                    class418.method2598(30);
                    class116.method630((byte) -60);
                }
                if (arg0.equalsIgnoreCase("wm1")) {
                    class345.method2010(false, -1, -1, 0, 1);
                }
                if (arg0.equalsIgnoreCase("wm2")) {
                    class345.method2010(false, -1, -1, 0, 2);
                }
                if (arg0.equalsIgnoreCase("::wm3")) {
                    class345.method2010(false, 768, 1024, arg1 ^ 7272, 3);
                }
                if (arg0.equalsIgnoreCase("tk0")) {
                    class429.method2657(0, 616516448);
                    class417.field6000 = 0;
                    class340.method1982(6288, class159.field2055);
                    class114.field1416 = false;
                }
                if (arg0.equalsIgnoreCase("tk1")) {
                    class429.method2657(1, 616516448);
                    class417.field6000 = 1;
                    class340.method1982(6288, class159.field2055);
                    class114.field1416 = false;
                }
                if (arg0.equalsIgnoreCase("tk2")) {
                    class429.method2657(2, arg1 + 616509176);
                    class417.field6000 = 2;
                    class340.method1982(6288, class159.field2055);
                    class114.field1416 = false;
                }
                if (arg0.equalsIgnoreCase("tk3")) {
                    class429.method2657(3, arg1 + 616509176);
                }
                if (arg0.equalsIgnoreCase("ot")) {
                    class2.field19 = !class2.field19;
                    class340.method1982(6288, class159.field2055);
                    class114.field1416 = false;
                    class418.method2598(arg1 ^ 7286);
                }
                if (arg0.equalsIgnoreCase("gb")) {
                    class297.field4040 = !class297.field4040;
                    class340.method1982(6288, class159.field2055);
                    class114.field1416 = false;
                    class418.method2598(30);
                }
                if (arg0.startsWith("shadows ")) {
                    class169.field2133 = class359.method2196((byte) 106, arg0.substring(8));
                    class340.method1982(arg1 + -984, class159.field2055);
                    class114.field1416 = false;
                    class418.method2598(arg1 ^ 7286);
                }
                if (arg0.startsWith("setba")) {
                    class292.field3962 = class359.method2196((byte) 104, arg0.substring(6));
                    class340.method1982(6288, class159.field2055);
                    class114.field1416 = false;
                }
                if (arg0.startsWith("setparticles")) {
                    class34.method163(arg1 ^ -7180, class359.method2196((byte) 115, arg0.substring(13)));
                    class340.method1982(6288, class159.field2055);
                    class114.field1416 = false;
                }
                if (arg0.startsWith("fps ") && ~class429.field6292 != -1) {
                    class423.method2635(class359.method2196((byte) 126, arg0.substring(4)), (byte) 97);
                }
                if (arg0.equalsIgnoreCase("errortest")) {
                    throw new RuntimeException();
                }
                if (arg0.startsWith("rect_debug")) {
                    class126.field1632 = class359.method2196((byte) 116, arg0.substring(10).trim());
                    class418.method2592("rect_debug=" + class126.field1632, false);
                }
                if (arg0.equalsIgnoreCase("qa_op_test")) {
                    class318.field4237 = true;
                }
                if (arg0.equalsIgnoreCase("clipcomponents")) {
                    field3095 = !field3095;
                    class418.method2592("clipcomponents=" + field3095, false);
                }
                if (arg0.startsWith("bloom")) {
                    boolean var11 = class88.field1003.method1636();
                    if (!class188.method1012(!var11, -1)) {
                        class418.method2592("Failed to enable bloom", false);
                    } else if (!var11) {
                        class418.method2592("Bloom enabled", false);
                    } else {
                        class418.method2592("Bloom disabled", false);
                    }
                }
                if (arg0.equalsIgnoreCase("tween")) {
                    if (!class83.field926) {
                        class83.field926 = true;
                        class418.method2592("Forced tweening ENABLED!", false);
                    } else {
                        class83.field926 = false;
                        class418.method2592("Forced tweening disabled.", false);
                    }
                }
                if (arg0.equalsIgnoreCase("shiftclick")) {
                    if (class259.field3519) {
                        class418.method2592("Shift-click disabled.", false);
                        class259.field3519 = false;
                    } else {
                        class418.method2592("Shift-click ENABLED!", false);
                        class259.field3519 = true;
                    }
                }
                if (arg0.equalsIgnoreCase("getcgcoord")) {
                    class418.method2592("x:" + (class427.field6264.field152 >> 7) + " z:" + (class427.field6264.field154 >> 7), false);
                }
                if (arg0.equalsIgnoreCase("getheight")) {
                    class418.method2592("Height: " + class98.field1161[class263.field3592].method271(class427.field6264.field152 >> 7, class427.field6264.field154 >> 7), false);
                }
                if (arg0.equalsIgnoreCase("resetminimap")) {
                    class72.field797.method1701(118);
                    class72.field797.method1684((byte) -121);
                    class138.method754(16704);
                    class116.method630((byte) -60);
                }
                if (arg0.startsWith("mc")) {
                    if (class88.field1003.method1557()) {
                        int var12 = Integer.parseInt(arg0.substring(3));
                        if (~var12 > -2) {
                            var12 = 1;
                        } else if (var12 > 4) {
                            var12 = 4;
                        }
                        class353.field4935 = var12;
                        class88.field1003.method1627(class353.field4935);
                        class88.field1003.method1618(0);
                        class418.method2592("Render cores now: " + class353.field4935, false);
                    } else {
                        class418.method2592("Current toolkit doesn't support multiple cores", false);
                    }
                }
                if (arg0.startsWith("cachespace")) {
                    class418.method2592("I(s): " + class386.field5504.method611(arg1 ^ -6655) + "/" + class386.field5504.method617(arg1 ^ 1941), false);
                    class418.method2592("I(m): " + class249.field3353.method611(-1431) + "/" + class249.field3353.method617(arg1 ^ 1941), false);
                    class418.method2592("O(s): " + class119.field1482.method711(-23289) + "/" + class119.field1482.method702((byte) 16), false);
                }
                if (arg0.equalsIgnoreCase("getcamerapos")) {
                    class418.method2592("Pos: " + class263.field3592 + "," + ((class127.field1633 >> 7) + class70.field767 >> 6) + "," + ((class180.field2272 >> 7) + class291.field3961 >> 6) + "," + ((class127.field1633 >> 7) + class70.field767 & 63) + "," + ((class180.field2272 >> 7) + class291.field3961 & 63) + " Height: " + (class201.method1098(class127.field1633, class180.field2272, class263.field3592, (byte) -108) - class175.field2197), false);
                    class418.method2592("Look: " + class263.field3592 + "," + (class70.field767 + class128.field1654 >> 6) + "," + (class291.field3961 + class139.field1781 >> 6) + "," + (63 & class128.field1654 - -class70.field767) + "," + (63 & class139.field1781 - -class291.field3961) + " Height: " + (class201.method1098(class128.field1654, class139.field1781, class263.field3592, (byte) -110) - class162.field2074), false);
                }
                if (arg0.equals("showocc")) {
                    class320.field4282 = !class320.field4282;
                    class418.method2598(arg1 ^ 7286);
                }
                if (arg0.equals("renderprofile") || arg0.equals("rp")) {
                    class424.field6224 = !class424.field6224;
                    class88.field1003.method1572(class424.field6224);
                    class386.method2393((byte) -51);
                }
                if (arg0.equals("nonpcs")) {
                    class63.field663 = !class63.field663;
                }
                if (arg0.equals("autoworld")) {
                    class211.method1147(-1);
                }
                if (arg0.equals("heap")) {
                    class418.method2592("Heap: " + class436.field6389 + "MB", false);
                }
                if (arg0.equals("savevarcs")) {
                    class360.method2204(0);
                }
                if (arg0.equals("scramblevarcs")) {
                    for (int var13 = 0; ~class142.field1810.length < ~var13; ++var13) {
                        if (class279.field3799[var13]) {
                            class142.field1810[var13] = (int) (99999.0D * Math.random());
                            if (Math.random() > 0.5D) {
                                class142.field1810[var13] *= -1;
                            }
                        }
                    }
                    class360.method2204(arg1 ^ 7272);
                }
                if (arg0.equals("showcolmap")) {
                    class243.field3314 = true;
                    class116.method630((byte) -60);
                }
                if (arg0.equals("hidecolmap")) {
                    class243.field3314 = false;
                    class116.method630((byte) -60);
                }
                if (arg0.equals("resetcache")) {
                    class80.method443(23574);
                }
                if (arg0.equals("profilecpu")) {
                    class418.method2592(class32.method151(false) + "ms", false);
                }
                if (class129.field1664 == 30) {
                    class281.field3857.method295(arg1 ^ 19467, 193);
                    ++class380.field5369;
                    class281.field3857.method1386(-222840624, 2 + arg0.length());
                    class281.field3857.method1386(-222840624, !arg2 ? 0 : 1);
                    class281.field3857.method1343(arg0, 22608);
                    return;
                }
            } catch (Exception var14) {
                class418.method2592("Whoops, something went wrong.", false);
                return;
            }
        }
    }
}
