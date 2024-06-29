import java.security.MessageDigest;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class20 extends class165 {

    @OriginalMember(owner = "client!fb", name = "x", descriptor = "[I")
    private final int[] field223 = new int[this.field2646];

    @OriginalMember(owner = "client!fb", name = "B", descriptor = "Luf;")
    private static class168 field227 = class148.method1019(-1720, "green:");

    @OriginalMember(owner = "client!fb", name = "O", descriptor = "Luf;")
    public static class168 field240 = field227;

    @OriginalMember(owner = "client!fb", name = "M", descriptor = "Luf;")
    public static class168 field238 = field227;

    @OriginalMember(owner = "client!fb", name = "K", descriptor = "Ljk;")
    public static class76 field236 = new class76();

    @OriginalMember(owner = "client!fb", name = "R", descriptor = "Luf;")
    public static class168 field243 = class148.method1019(-1720, "www");

    @OriginalMember(owner = "client!fb", name = "U", descriptor = "Luf;")
    public static class168 field246 = class148.method1019(-1720, "VOLL");

    @OriginalMember(owner = "client!fb", name = "X", descriptor = "[I")
    public static int[] field249 = new int[25];

    @OriginalMember(owner = "client!fb", name = "W", descriptor = "Luf;")
    private static class168 field248 = class148.method1019(-1720, " from your friend list first)3");

    @OriginalMember(owner = "client!fb", name = "P", descriptor = "Luf;")
    public static class168 field241 = class148.method1019(-1720, ":chalreq:");

    @OriginalMember(owner = "client!fb", name = "S", descriptor = "I")
    public static int field244 = 2;

    @OriginalMember(owner = "client!fb", name = "T", descriptor = "Luf;")
    public static class168 field245 = field248;

    @OriginalMember(owner = "client!fb", name = "Y", descriptor = "I")
    public static int field250 = 99;

    @OriginalMember(owner = "client!fb", name = "z", descriptor = "I")
    private int field225;

    @OriginalMember(owner = "client!fb", name = "A", descriptor = "I")
    public static int field226;

    @OriginalMember(owner = "client!fb", name = "C", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "client!fb", name = "D", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!fb", name = "E", descriptor = "I")
    public static int field230;

    @OriginalMember(owner = "client!fb", name = "F", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "client!fb", name = "G", descriptor = "I")
    private int field232;

    @OriginalMember(owner = "client!fb", name = "H", descriptor = "I")
    public static int field233;

    @OriginalMember(owner = "client!fb", name = "I", descriptor = "I")
    public static int field234;

    @OriginalMember(owner = "client!fb", name = "J", descriptor = "I")
    public static int field235;

    @OriginalMember(owner = "client!fb", name = "L", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!fb", name = "N", descriptor = "I")
    public static int field239;

    @OriginalMember(owner = "client!fb", name = "Q", descriptor = "I")
    public static int field242;

    @OriginalMember(owner = "client!fb", name = "V", descriptor = "Lea;")
    public static class62 field247;

    @OriginalMember(owner = "client!fb", name = "y", descriptor = "[B")
    private byte[] field224;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZLdk;)V", line = 5)
    public static final void method92(boolean arg0, class241 arg1) {
        if (!arg0) {
            field246 = (class168) null;
        }
        class85.field1325 = arg1.method1646(-27248, class58.field771);
        class198.field3277 = arg1.method1646(-27248, class94.field1482);
        field226++;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Luf;B)Z", line = 20)
    public static final boolean method93(class168 arg0, byte arg1) {
        field237++;
        try {
            int var2 = arg0.method1224(44, (byte) 120);
            if (var2 == -1) {
                return false;
            }
            class168 var3 = arg0.method1187(0, 0, var2);
            class168 var4 = arg0.method1193((byte) -86, var2 + 1);
            MessageDigest var5 = MessageDigest.getInstance("SHA");
            var5.reset();
            var5.update(var3.method1174(true));
            byte[] var6 = var5.digest();
            byte[] var7 = var4.method1203(74);
            class153 var8 = new class153(5000);
            var8.method1062(var7, 32767, 0, var7.length);
            var8.field2367 = 0;
            if (arg1 > -24) {
                field250 = -5;
            }
            var8.method1060(class169.field2773, class79.field1132, (byte) 31);
            if (var8.field2359[0] != 1) {
                return false;
            }
            for (int var9 = 0; var9 < 20; var9++) {
                if (var8.field2359[var9 + 1] != var6[var9]) {
                    return false;
                }
            }
            return true;
        } catch (Exception var11) {
            return false;
        }
    }

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "(I)V", line = 71)
    public final void method94(int arg0) {
        this.field232 = 0;
        this.field225 = 0;
        if (arg0 != 26332) {
            field248 = (class168) null;
        }
        field239++;
    }

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "(I)V", line = 90)
    public static void method95(int arg0) {
        field248 = null;
        field240 = null;
        field246 = null;
        field236 = null;
        field238 = null;
        field249 = null;
        field247 = null;
        field241 = null;
        if (arg0 == 150) {
            field243 = null;
            field245 = null;
            field227 = null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZLg;)Z", line = 112)
    public static final boolean method96(boolean arg0, class242 arg1) {
        field228++;
        if (arg1.field4043 == null) {
            return false;
        }
        for (int var2 = 0; var2 < arg1.field4043.length; var2++) {
            int var3 = class39.method219(arg1, var2, 119);
            int var4 = arg1.field4009[var2];
            if (arg1.field4043[var2] == 2) {
                if (var4 <= var3) {
                    return false;
                }
            } else if (arg1.field4043[var2] == 3) {
                if (var3 <= var4) {
                    return false;
                }
            } else if (arg1.field4043[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        if (!arg0) {
            method96(false, (class242) null);
        }
        return true;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(III)V", line = 172)
    public final void method97(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            this.field232 += this.field223[arg0] * arg1 >> 12;
            field231++;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IB)V", line = 201)
    public void method98(int arg0, byte arg1) {
        field235++;
        this.field224[this.field225++] = (byte) (class159.method1119(127, arg1 >> 1) + 127);
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(IIIIIF)V", line = 214)
    public class20(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; var7 < this.field2646; var7++) {
            this.field223[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(BI)I", line = 233)
    public static final int method99(byte arg0, int arg1) {
        field229++;
        if (arg1 >= 97 && arg1 <= 122 || arg1 >= 224 && arg1 <= 254 && arg1 != 247) {
            return arg1 - 32;
        }
        int var2 = -72 % ((11 - arg0) / 56);
        if (arg1 == 255) {
            return 159;
        } else if (arg1 == 156) {
            return 140;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V", line = 257)
    public final void method100(byte arg0) {
        this.field232 = Math.abs(this.field232);
        field234++;
        if (this.field232 >= 4096) {
            this.field232 = 4095;
        }
        if (arg0 != 63) {
            field244 = 72;
        }
        this.method98(this.field225++, (byte) (this.field232 >> 4));
        this.field232 = 0;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIILdk;)Lha;", line = 273)
    public static final class49 method101(int arg0, int arg1, int arg2, class241 arg3) {
        if (arg0 != 0) {
            field247 = (class62) null;
        }
        field230++;
        return class28.method148(arg1, arg3, arg2, -38) ? class19.method91((byte) 81) : null;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILoe;II)V", line = 290)
    public static final void method102(int arg0, class54 arg1, int arg2, int arg3) {
        field233++;
        if ((arg0 & 0x100) != 0) {
            int var4 = class166.field2671.method1064((byte) 19);
            int var5 = class166.field2671.method1042((byte) 95);
            arg1.method1335(var4, arg2 - 125, var5, class203.field3335);
        }
        if ((arg0 & 0x80) != 0) {
            arg1.field3017 = class166.field2671.method1069(57);
            arg1.field3050 = class166.field2671.method1069(119);
        }
        if ((arg0 & 0x8) != 0) {
            int var6 = class166.field2671.method1049(true);
            int var7 = class166.field2671.method1042((byte) -102);
            int var8 = class166.field2671.method1064((byte) 19);
            int var9 = class166.field2671.field2367;
            boolean var10 = (var6 & 0x8000) != 0;
            if (arg1.field658 != null && arg1.field668 != null) {
                boolean var11 = false;
                long var12 = arg1.field658.method1208((byte) 71);
                if (var7 <= 1) {
                    if (!var10 && class63.field830 == 1 || class72.field963 == 1) {
                        var11 = true;
                    } else {
                        for (int var14 = 0; var14 < class149.field2302; var14++) {
                            if (class201.field3311[var14] == var12) {
                                var11 = true;
                                break;
                            }
                        }
                    }
                }
                if (!var11 && class272.field4573 == 0) {
                    class229.field3700.field2367 = 0;
                    class166.field2671.method1080(var8, (byte) -65, 0, class229.field3700.field2359);
                    int var15 = -1;
                    class229.field3700.field2367 = 0;
                    class168 var17;
                    if (var10) {
                        var6 &= 0x7FFF;
                        class199 var16 = class240.method1624(class229.field3700, false);
                        var15 = var16.field3291;
                        var17 = var16.field3281.method1925(0, class229.field3700);
                    } else {
                        var17 = class37.method205(class143.method980((byte) 80, class229.field3700).method1217((byte) 77));
                    }
                    arg1.field3039 = var17.method1195(false);
                    arg1.field3001 = var6 & 0xFF;
                    arg1.field2998 = var6 >> 8;
                    arg1.field3051 = 150;
                    if (var7 == 2) {
                        class40.method223((class168) null, var15, var17, var10 ? 17 : 1, (byte) -118, class134.method938((byte) -126, new class168[] { class122.field1897, arg1.method300(arg2 - 127) }));
                    } else if (var7 == 1) {
                        class40.method223((class168) null, var15, var17, var10 ? 17 : 1, (byte) -118, class134.method938((byte) -124, new class168[] { class171.field2783, arg1.method300(-118) }));
                    } else {
                        class40.method223((class168) null, var15, var17, var10 ? 17 : 2, (byte) -118, arg1.method300(-123));
                    }
                }
            }
            class166.field2671.field2367 = var8 + var9;
        }
        if ((arg0 & 0x1) != 0) {
            int var18 = class166.field2671.method1093((byte) 106);
            byte[] var19 = new byte[var18];
            class153 var20 = new class153(var19);
            class166.field2671.method1086(0, arg2 + 58, var19, var18);
            class114.field1778[arg3] = var20;
            arg1.method297((byte) 107, var20);
        }
        if ((arg0 & 0x10) != 0) {
            arg1.field3039 = class166.field2671.method1075(17);
            if (arg1.field3039.method1171(-6146, 0) == 126) {
                arg1.field3039 = arg1.field3039.method1193((byte) -86, 1);
                class266.method1850(2, arg1.field3039, arg1.method300(arg2 ^ 0x75), arg2 ^ 0x64);
            } else if (class266.field4489 == arg1) {
                class266.method1850(2, arg1.field3039, arg1.method300(arg2 - 125), arg2 ^ 0x5D);
            }
            arg1.field3001 = 0;
            arg1.field3051 = 150;
            arg1.field2998 = 0;
        }
        if ((arg0 & 0x40) != 0) {
            arg1.field3029 = class166.field2671.method1069(33);
            if (arg1.field3029 == 65535) {
                arg1.field3029 = -1;
            }
        }
        if ((arg0 & 0x20) != 0) {
            int var21 = class166.field2671.method1051(-128);
            int var22 = class166.field2671.method1042((byte) -74);
            if (var21 == 65535) {
                var21 = -1;
            }
            class168.method1213(arg1, var21, -18679, var22);
        }
        if (~(arg0 & 0x400) != arg2) {
            arg1.field3019 = class166.field2671.method1064((byte) 19);
            arg1.field3000 = class166.field2671.method1094((byte) 118);
            arg1.field3014 = class166.field2671.method1093((byte) 80);
            arg1.field3040 = class166.field2671.method1094((byte) -76);
            arg1.field3036 = class166.field2671.method1051(-128) + class203.field3335;
            arg1.field2990 = class166.field2671.method1049(true) + class203.field3335;
            arg1.field3018 = class166.field2671.method1042((byte) -99);
            arg1.field2997 = 1;
            arg1.field3043 = 0;
        }
        if ((arg0 & 0x4) != 0) {
            int var23 = class166.field2671.method1042((byte) 110);
            int var24 = class166.field2671.method1064((byte) 19);
            arg1.method1335(var23, arg2 + 89, var24, class203.field3335);
            arg1.field3035 = class203.field3335 + 300;
            arg1.field3030 = class166.field2671.method1064((byte) 19);
        }
        if ((arg0 & 0x200) == 0) {
            return;
        }
        arg1.field3026 = class166.field2671.method1051(arg2 - 127);
        int var25 = class166.field2671.method1052(29912);
        if (arg1.field3026 == 65535) {
            arg1.field3026 = -1;
        }
        arg1.field3047 = var25 >> 16;
        arg1.field3042 = 0;
        arg1.field3022 = class203.field3335 + (var25 & 0xFFFF);
        if (class203.field3335 < arg1.field3022) {
            arg1.field3042 = -1;
        }
        arg1.field2989 = 0;
        if (arg1.field3026 == -1 || class203.field3335 != arg1.field3022) {
            return;
        }
        int var26 = class270.method1873(arg1.field3026, false).field48;
        if (var26 != -1) {
            class190 var27 = class119.method858(true, var26);
            if (var27 != null && var27.field3063 != null) {
                class27.method142(var27, (byte) -119, arg1.field3027, 0, arg1.field3021, class266.field4489 == arg1);
            }
        }
    }
}
