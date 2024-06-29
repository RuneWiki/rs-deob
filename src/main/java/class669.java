import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class669 {

    @OriginalMember(owner = "client!ab", name = "m", descriptor = "I")
    public int field9298;

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "Z")
    public boolean field9293;

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "Z")
    public boolean field9299;

    @OriginalMember(owner = "client!ab", name = "o", descriptor = "[S")
    public short[] field9300;

    @OriginalMember(owner = "client!ab", name = "s", descriptor = "I")
    public int field9304;

    @OriginalMember(owner = "client!ab", name = "r", descriptor = "I")
    private int field9303;

    @OriginalMember(owner = "client!ab", name = "u", descriptor = "Lafa;")
    public static class348 field9306 = new class348("RC", 1);

    @OriginalMember(owner = "client!ab", name = "w", descriptor = "[I")
    public static int[] field9308 = new int[5];

    @OriginalMember(owner = "client!ab", name = "v", descriptor = "Lil;")
    public static class7 field9307 = new class7();

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "I")
    private int field9286;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "I")
    public static int field9287;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "I")
    public static int field9288;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "I")
    public static int field9289;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "I")
    public static int field9290;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "I")
    public static int field9291;

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "I")
    private int field9292;

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "I")
    public static int field9294;

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "I")
    public static int field9296;

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "I")
    private int field9297;

    @OriginalMember(owner = "client!ab", name = "p", descriptor = "I")
    private int field9301;

    @OriginalMember(owner = "client!ab", name = "q", descriptor = "I")
    public static int field9302;

    @OriginalMember(owner = "client!ab", name = "t", descriptor = "I")
    public static int field9305;

    @OriginalMember(owner = "client!ab", name = "y", descriptor = "Lni;")
    public static class522 field9310;

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "Lcba;")
    public class551 field9295;

    @OriginalMember(owner = "client!ab", name = "x", descriptor = "Z")
    public static boolean field9309;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IBI)I")
    public static final int method3765(int arg0, byte arg1, int arg2) {
        field9288++;
        if (arg1 != -101) {
            field9309 = true;
        }
        return arg2 == 1 || arg2 == 3 ? class167.field2083[arg0 & 0x3] : class425.field5997[arg0 & 0x3];
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ZII)V")
    public final void method3766(boolean arg0, int arg1, int arg2) {
        field9296++;
        if (arg2 < 61) {
            this.method3769(96);
        }
        int var4;
        if (arg0) {
            var4 = 2048;
        } else {
            int var5 = this.field9301 * arg1 / 50 + this.field9303 & 0x7FF;
            int var6 = this.field9292;
            if (var6 == 1) {
                var4 = (class15.field113[var5 << 3] >> 4) + 1024;
            } else if (var6 == 3) {
                var4 = class100.field1322[var5] >> 1;
            } else if (var6 == 4) {
                var4 = var5 >> 10 << 11;
            } else if (var6 == 2) {
                var4 = var5;
            } else if (var6 == 5) {
                var4 = (var5 < 1024 ? var5 : 2048 - var5) << 1;
            } else {
                var4 = 2048;
            }
        }
        this.field9295.method2921((float) ((this.field9286 * var4 >> 11) + this.field9297) / 2048.0F, 57);
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(IBI)Z")
    public static final boolean method3767(int arg0, byte arg1, int arg2) {
        if (arg1 >= -79) {
            field9309 = true;
        }
        field9291++;
        if (arg2 >= 0 && arg0 >= 0 && class114.field1506[1].length > arg2 && arg0 < class114.field1506[1][arg2].length) {
            return (class114.field1506[1][arg2][arg0] & 0x2) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
    public static void method3768(int arg0) {
        if (arg0 <= 25) {
            field9307 = null;
        }
        field9310 = null;
        field9306 = null;
        field9307 = null;
        field9308 = null;
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V")
    private final void method3769(int arg0) {
        field9305++;
        int var2 = this.field9304;
        if (var2 == 2) {
            this.field9286 = 2048;
            this.field9301 = 2048;
            this.field9292 = 1;
            this.field9297 = 0;
        } else if (var2 == 3) {
            this.field9297 = 0;
            this.field9286 = 2048;
            this.field9292 = 1;
            this.field9301 = 4096;
        } else if (var2 == 4) {
            this.field9286 = 2048;
            this.field9292 = 4;
            this.field9301 = 2048;
            this.field9297 = 0;
        } else if (var2 == 5) {
            this.field9297 = 0;
            this.field9292 = 4;
            this.field9286 = 2048;
            this.field9301 = 8192;
        } else if (var2 == 12) {
            this.field9292 = 2;
            this.field9297 = 0;
            this.field9301 = 2048;
            this.field9286 = 2048;
        } else if (var2 == 13) {
            this.field9292 = 2;
            this.field9297 = 0;
            this.field9286 = 2048;
            this.field9301 = 8192;
        } else if (var2 == 10) {
            this.field9286 = 512;
            this.field9297 = 1536;
            this.field9292 = 3;
            this.field9301 = 2048;
        } else if (var2 == 11) {
            this.field9286 = 512;
            this.field9292 = 3;
            this.field9297 = 1536;
            this.field9301 = 4096;
        } else if (var2 == 6) {
            this.field9286 = 768;
            this.field9297 = 1280;
            this.field9292 = 3;
            this.field9301 = 2048;
        } else if (var2 == 7) {
            this.field9297 = 1280;
            this.field9292 = 3;
            this.field9301 = 4096;
            this.field9286 = 768;
        } else if (var2 == 8) {
            this.field9286 = 1024;
            this.field9292 = 3;
            this.field9297 = 1024;
            this.field9301 = 2048;
        } else if (var2 == 9) {
            this.field9301 = 4096;
            this.field9292 = 3;
            this.field9297 = 1024;
            this.field9286 = 1024;
        } else if (var2 == 14) {
            this.field9297 = 1280;
            this.field9292 = 1;
            this.field9301 = 2048;
            this.field9286 = 768;
        } else if (var2 == 15) {
            this.field9292 = 1;
            this.field9301 = 4096;
            this.field9297 = 1536;
            this.field9286 = 512;
        } else if (var2 == 16) {
            this.field9292 = 1;
            this.field9286 = 256;
            this.field9301 = 8192;
            this.field9297 = 1792;
        } else {
            this.field9286 = 2048;
            this.field9292 = 0;
            this.field9297 = 0;
            this.field9301 = 2048;
        }
        if (arg0 > 0) {
            method3768(-26);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(BLni;)V")
    public static final void method3770(byte arg0, class522 arg1) {
        class487.field6681 = arg1.method2890((byte) -107, "hitmarks");
        field9289++;
        class633.field8789 = arg1.method2890((byte) -106, "hitbar_default");
        class488.field6692 = arg1.method2890((byte) -71, "timerbar_default");
        if (arg0 >= -95) {
            field9310 = null;
        }
        class681.field9486 = arg1.method2890((byte) -61, "headicons_pk");
        class745.field10347 = arg1.method2890((byte) -92, "headicons_prayer");
        class619.field8683 = arg1.method2890((byte) -67, "hint_headicons");
        class556.field7832 = arg1.method2890((byte) -68, "hint_mapmarkers");
        class474.field6563 = arg1.method2890((byte) -93, "mapflag");
        class516.field6967 = arg1.method2890((byte) -55, "cross");
        class414.field5855 = arg1.method2890((byte) -87, "mapdots");
        class298.field3990 = arg1.method2890((byte) -67, "scrollbar");
        class333.field4496 = arg1.method2890((byte) -68, "name_icons");
        class386.field5454 = arg1.method2890((byte) -94, "floorshadows");
        class151.field1931 = arg1.method2890((byte) -123, "compass");
        class568.field8011 = arg1.method2890((byte) -50, "otherlevel");
        class493.field6726 = arg1.method2890((byte) -101, "hint_mapedge");
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIBI)V")
    public final void method3771(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        this.field9292 = arg4;
        if (arg3 <= -81) {
            field9287++;
            this.field9297 = arg2;
            this.field9286 = arg1;
            this.field9301 = arg0;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(BLha;IIIII)V")
    private final void method3772(byte arg0, class60 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field9290++;
        this.field9295 = arg1.method374(arg4, arg6, arg2, arg5, arg3, 1.0F);
        if (arg0 >= -21) {
            this.method3769(-124);
        }
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "()V")
    protected class669() {
        if (class100.field1322 == null) {
            class315.method1884(110);
        }
        this.method3769(-48);
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Lha;Lji;I)V")
    public class669(class60 arg0, class611 arg1, int arg2) {
        if (class100.field1322 == null) {
            class315.method1884(110);
        }
        this.field9298 = arg1.method3428((byte) -105);
        this.field9293 = (this.field9298 & 0x10) != 0;
        this.field9299 = (this.field9298 & 0x8) != 0;
        this.field9298 &= 0x7;
        int var4 = arg1.method3402((byte) 127) << arg2;
        int var5 = arg1.method3402((byte) 127) << arg2;
        int var6 = arg1.method3402((byte) 127) << arg2;
        int var7 = arg1.method3428((byte) 26);
        int var8 = var7 * 2 + 1;
        this.field9300 = new short[var8];
        for (int var9 = 0; var9 < this.field9300.length; var9++) {
            short var13 = (short) arg1.method3402((byte) 127);
            int var14 = var13 >>> 8;
            int var15 = var13 & 0xFF;
            if (var14 >= var8) {
                var14 = var8 - 1;
            }
            if (var15 > var8 - var14) {
                var15 = var8 - var14;
            }
            this.field9300[var9] = (short) class344.method2020(var14 << 8, var15);
        }
        int var10 = (var7 << class443.field6172) + class522.field7044;
        int var11 = class645.field8982 == null ? class120.field1575[class151.method921(arg1.method3402((byte) 127), 61) & 0xFFFF] : class645.field8982[arg1.method3402((byte) 127)];
        int var12 = arg1.method3428((byte) -110);
        this.field9304 = var12 & 0x1F;
        this.field9303 = var12 & 0xE0 << 3;
        if (this.field9304 != 31) {
            this.method3769(-31);
        }
        this.method3772((byte) -56, arg0, var5, var11, var4, var10, var6);
    }
}
