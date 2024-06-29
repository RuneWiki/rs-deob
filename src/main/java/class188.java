import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class188 {

    @OriginalMember(owner = "client!sm", name = "n", descriptor = "I")
    public int field3021;

    @OriginalMember(owner = "client!sm", name = "l", descriptor = "Z")
    public boolean field3019;

    @OriginalMember(owner = "client!sm", name = "t", descriptor = "Z")
    public boolean field3027;

    @OriginalMember(owner = "client!sm", name = "s", descriptor = "[S")
    public short[] field3026;

    @OriginalMember(owner = "client!sm", name = "v", descriptor = "I")
    public int field3029;

    @OriginalMember(owner = "client!sm", name = "o", descriptor = "I")
    private int field3022;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "Ls;")
    public static class186 field3008 = new class186(79, 6);

    @OriginalMember(owner = "client!sm", name = "i", descriptor = "[[I")
    public static int[][] field3016 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "I")
    public static int field3011 = 500;

    @OriginalMember(owner = "client!sm", name = "p", descriptor = "[Z")
    public static boolean[] field3023 = new boolean[100];

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "I")
    public static int field3009;

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "I")
    private int field3010;

    @OriginalMember(owner = "client!sm", name = "e", descriptor = "I")
    public static int field3012;

    @OriginalMember(owner = "client!sm", name = "g", descriptor = "I")
    private int field3014;

    @OriginalMember(owner = "client!sm", name = "j", descriptor = "I")
    public static int field3017;

    @OriginalMember(owner = "client!sm", name = "k", descriptor = "I")
    private int field3018;

    @OriginalMember(owner = "client!sm", name = "m", descriptor = "I")
    public static int field3020;

    @OriginalMember(owner = "client!sm", name = "q", descriptor = "I")
    public static int field3024;

    @OriginalMember(owner = "client!sm", name = "r", descriptor = "I")
    private int field3025;

    @OriginalMember(owner = "client!sm", name = "u", descriptor = "I")
    public static int field3028;

    @OriginalMember(owner = "client!sm", name = "h", descriptor = "Lbk;")
    public class256 field3015;

    @OriginalMember(owner = "client!sm", name = "f", descriptor = "Ljava/lang/String;")
    public static String field3013;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IZI)Z", line = 19)
    public static final boolean method1279(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            return false;
        } else {
            field3020++;
            return (arg2 & 0x800) != 0;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(BIZ)V", line = 30)
    public final void method1280(byte arg0, int arg1, boolean arg2) {
        field3024++;
        int var6;
        if (arg2) {
            var6 = 2048;
        } else {
            int var4 = this.field3014 * arg1 / 50 + this.field3022 & 0x7FF;
            int var5 = this.field3018;
            if (var5 == 1) {
                var6 = (class407.field6169[var4 << 3] >> 5) + 1024;
            } else if (var5 == 3) {
                var6 = class177.field2870[var4] >> 1;
            } else if (var5 == 4) {
                var6 = var4 >> 10 << 11;
            } else if (var5 == 2) {
                var6 = var4;
            } else if (var5 == 5) {
                var6 = (var4 >= 1024 ? 2048 - var4 : var4) << 1;
            } else {
                var6 = 2048;
            }
        }
        if (arg0 != -73) {
            method1282((byte) -88, true, true, null, null);
        }
        this.field3015.method145(2784, (float) ((this.field3010 * var6 >> 11) + this.field3025) / 2048.0F);
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)V", line = 105)
    private final void method1281(int arg0) {
        int var2 = this.field3029;
        if (var2 == 2) {
            this.field3014 = 2048;
            this.field3025 = 0;
            this.field3018 = 1;
            this.field3010 = 2048;
        } else if (var2 == 3) {
            this.field3014 = 4096;
            this.field3025 = 0;
            this.field3010 = 2048;
            this.field3018 = 1;
        } else if (var2 == 4) {
            this.field3014 = 2048;
            this.field3025 = 0;
            this.field3018 = 4;
            this.field3010 = 2048;
        } else if (var2 == 5) {
            this.field3014 = 8192;
            this.field3025 = 0;
            this.field3010 = 2048;
            this.field3018 = 4;
        } else if (var2 == 12) {
            this.field3010 = 2048;
            this.field3025 = 0;
            this.field3014 = 2048;
            this.field3018 = 2;
        } else if (var2 == 13) {
            this.field3018 = 2;
            this.field3014 = 8192;
            this.field3010 = 2048;
            this.field3025 = 0;
        } else if (var2 == 10) {
            this.field3014 = 2048;
            this.field3010 = 512;
            this.field3018 = 3;
            this.field3025 = 1536;
        } else if (var2 == 11) {
            this.field3014 = 4096;
            this.field3018 = 3;
            this.field3025 = 1536;
            this.field3010 = 512;
        } else if (var2 == 6) {
            this.field3025 = 1280;
            this.field3014 = 2048;
            this.field3018 = 3;
            this.field3010 = 768;
        } else if (var2 == 7) {
            this.field3014 = 4096;
            this.field3010 = 768;
            this.field3018 = 3;
            this.field3025 = 1280;
        } else if (var2 == 8) {
            this.field3014 = 2048;
            this.field3025 = 1024;
            this.field3018 = 3;
            this.field3010 = 1024;
        } else if (var2 == 9) {
            this.field3025 = 1024;
            this.field3014 = 4096;
            this.field3018 = 3;
            this.field3010 = 1024;
        } else if (var2 == 14) {
            this.field3014 = 2048;
            this.field3010 = 768;
            this.field3025 = 1280;
            this.field3018 = 1;
        } else if (var2 == 15) {
            this.field3025 = 1536;
            this.field3014 = 4096;
            this.field3018 = 1;
            this.field3010 = 512;
        } else if (var2 == 16) {
            this.field3018 = 1;
            this.field3014 = 8192;
            this.field3010 = 256;
            this.field3025 = 1792;
        } else {
            this.field3010 = 2048;
            this.field3018 = 0;
            this.field3014 = 2048;
            this.field3025 = 0;
        }
        if (arg0 == 1280) {
            field3017++;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(BZZLlt;Ljava/lang/String;)V", line = 303)
    public static final void method1282(byte arg0, boolean arg1, boolean arg2, class480 arg3, String arg4) {
        int var5 = -114 % ((21 - arg0) / 48);
        field3009++;
        if (!arg2) {
            class449.method2683(3, arg3, arg4, (byte) 61);
            return;
        }
        if (class480.field7082.startsWith("win") && class480.field7076 != 3) {
            String var6 = null;
            if (arg3.field7072 != null) {
                var6 = arg3.field7072.getParameter("haveie6");
            }
            if (var6 == null || !var6.equals("1")) {
                class121 var7 = class449.method2683(0, arg3, arg4, (byte) 97);
                class307.field4660 = var7;
                field3013 = arg4;
                class151.field2485 = arg3;
                return;
            }
        }
        if (class480.field7082.startsWith("mac")) {
            String var8 = null;
            if (arg3.field7072 != null) {
                var8 = arg3.field7072.getParameter("havefirefox");
            }
            if (var8 != null && var8.equals("1") && arg1) {
                class449.method2683(1, arg3, arg4, (byte) 84);
                return;
            }
        }
        class449.method2683(2, arg3, arg4, (byte) 109);
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIIIILza;I)V", line = 368)
    private final void method1283(int arg0, int arg1, int arg2, int arg3, int arg4, class288 arg5, int arg6) {
        this.field3015 = arg5.method272(arg2, arg0, arg3, arg4, arg1, 1.0F);
        field3028++;
        if (arg6 <= 106) {
            this.method1281(-18);
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(BIIII)V", line = 392)
    public final void method1284(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field3014 = arg3;
        if (arg0 < 102) {
            field3011 = 27;
        }
        this.field3025 = arg2;
        this.field3010 = arg1;
        field3012++;
        this.field3018 = arg4;
    }

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(I)V", line = 407)
    public static void method1285(int arg0) {
        field3016 = null;
        field3013 = null;
        field3008 = null;
        field3023 = null;
        if (arg0 != 21243) {
            method1282((byte) -38, true, false, null, null);
        }
    }

    @OriginalMember(owner = "client!sm", name = "<init>", descriptor = "()V", line = 432)
    protected class188() {
        if (class177.field2870 == null) {
            class69.method599((byte) -117);
        }
        this.method1281(1280);
    }

    @OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(Lza;Lnn;I)V", line = 442)
    public class188(class288 arg0, class289 arg1, int arg2) {
        if (class177.field2870 == null) {
            class69.method599((byte) -117);
        }
        this.field3021 = arg1.method1858(-3256);
        this.field3019 = (this.field3021 & 0x10) != 0;
        this.field3027 = (this.field3021 & 0x8) != 0;
        this.field3021 &= 0x7;
        int var4 = arg1.method1841((byte) -124) << arg2;
        int var5 = arg1.method1841((byte) -14) << arg2;
        int var6 = arg1.method1841((byte) 83) << arg2;
        int var7 = arg1.method1858(-3256);
        int var8 = var7 * 2 + 1;
        this.field3026 = new short[var8];
        for (int var9 = 0; var9 < this.field3026.length; var9++) {
            short var13 = (short) arg1.method1841((byte) 103);
            int var14 = var13 >>> 8;
            int var15 = var13 & 0xFF;
            if (var14 >= var8) {
                var14 = var8 - 1;
            }
            if (var15 > (var8 - var14)) {
                var15 = var8 - var14;
            }
            this.field3026[var9] = (short) class418.method2558(var14 << 8, var15);
        }
        int var10 = (var7 << class353.field5216) + class421.field6346;
        int var11 = class97.field1892 == null ? class198.field3177[class127.method1000(arg1.method1841((byte) -121), (byte) -71) & 0xFFFF] : class97.field1892[arg1.method1841((byte) -5)];
        int var12 = arg1.method1858(-3256);
        this.field3029 = var12 & 0x1F;
        this.field3022 = var12 & 0xE0 << 3;
        if (this.field3029 != 31) {
            this.method1281(1280);
        }
        this.method1283(var6, var11, var4, var5, var10, arg0, 126);
    }
}
