import jaggl.OpenGL;
import java.awt.Canvas;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public class class436 {

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "Lrp;")
    private class369 field5912 = new class369();

    @OriginalMember(owner = "client!gq", name = "s", descriptor = "Lrp;")
    private class369 field5928 = new class369();

    @OriginalMember(owner = "client!gq", name = "t", descriptor = "Lrp;")
    private class369 field5929 = new class369();

    @OriginalMember(owner = "client!gq", name = "u", descriptor = "Lrp;")
    private class369 field5930 = new class369();

    @OriginalMember(owner = "client!gq", name = "w", descriptor = "Los;")
    private class374 field5932 = new class374(4);

    @OriginalMember(owner = "client!gq", name = "A", descriptor = "I")
    public volatile int field5936 = 0;

    @OriginalMember(owner = "client!gq", name = "z", descriptor = "I")
    public volatile int field5935 = 0;

    @OriginalMember(owner = "client!gq", name = "C", descriptor = "B")
    private byte field5938 = 0;

    @OriginalMember(owner = "client!gq", name = "B", descriptor = "Los;")
    private class374 field5937 = new class374(8);

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field5911 = new String[200];

    @OriginalMember(owner = "client!gq", name = "i", descriptor = "Lsw;")
    public static class641 field5918 = new class641(4);

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "I")
    public static int field5910;

    @OriginalMember(owner = "client!gq", name = "d", descriptor = "I")
    public static int field5913;

    @OriginalMember(owner = "client!gq", name = "e", descriptor = "I")
    public static int field5914;

    @OriginalMember(owner = "client!gq", name = "f", descriptor = "I")
    public static int field5915;

    @OriginalMember(owner = "client!gq", name = "g", descriptor = "I")
    public static int field5916;

    @OriginalMember(owner = "client!gq", name = "h", descriptor = "I")
    public static int field5917;

    @OriginalMember(owner = "client!gq", name = "j", descriptor = "I")
    public static int field5919;

    @OriginalMember(owner = "client!gq", name = "k", descriptor = "I")
    public static int field5920;

    @OriginalMember(owner = "client!gq", name = "l", descriptor = "I")
    public static int field5921;

    @OriginalMember(owner = "client!gq", name = "m", descriptor = "I")
    public static int field5922;

    @OriginalMember(owner = "client!gq", name = "n", descriptor = "I")
    public static int field5923;

    @OriginalMember(owner = "client!gq", name = "o", descriptor = "I")
    public static int field5924;

    @OriginalMember(owner = "client!gq", name = "p", descriptor = "I")
    public static int field5925;

    @OriginalMember(owner = "client!gq", name = "q", descriptor = "I")
    public static int field5926;

    @OriginalMember(owner = "client!gq", name = "r", descriptor = "I")
    public static int field5927;

    @OriginalMember(owner = "client!gq", name = "y", descriptor = "I")
    private int field5934;

    @OriginalMember(owner = "client!gq", name = "v", descriptor = "J")
    private long field5931;

    @OriginalMember(owner = "client!gq", name = "x", descriptor = "Lqg;")
    private class391 field5933;

    @OriginalMember(owner = "client!gq", name = "D", descriptor = "Lpm;")
    private class499 field5939;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(B)V")
    public final void method2517(byte arg0) {
        field5910++;
        if (this.field5933 == null) {
            return;
        }
        try {
            if (arg0 == -15) {
                this.field5932.field4966 = 0;
                this.field5932.method2093(7, -103);
                this.field5932.method2102(0, (byte) -99);
                this.field5933.method2251(this.field5932.field4929, 4, -26995, 0);
            }
        } catch (IOException var3) {
            try {
                this.field5933.method2245(1);
            } catch (Exception var2) {
            }
            this.field5936++;
            this.field5933 = null;
            this.field5935 = -2;
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(I)V")
    public final void method2518(int arg0) {
        field5921++;
        if (arg0 != -1) {
            this.field5931 = 106L;
        }
        if (this.field5933 != null) {
            this.field5933.method2245(1);
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(BIIZZ)Lpm;")
    public final class499 method2519(byte arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        field5923++;
        long var6 = (long) ((arg2 << 16) + arg1);
        class499 var8 = new class499();
        var8.field6932 = arg0;
        if (arg4) {
            this.field5933 = null;
        }
        var8.field67 = var6;
        var8.field8321 = arg3;
        if (arg3) {
            if (this.method2532((byte) -89) >= 20) {
                throw new RuntimeException();
            }
            this.field5912.method2070(var8, 98);
        } else if (this.method2520((byte) -91) < 20) {
            this.field5929.method2070(var8, 114);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(B)I")
    private final int method2520(byte arg0) {
        field5917++;
        if (arg0 != -91) {
            this.method2518(30);
        }
        return this.field5929.method2069(true) + this.field5930.method2069(true);
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(I)V")
    public final void method2521(int arg0) {
        field5926++;
        try {
            this.field5933.method2245(1);
        } catch (Exception var2) {
        }
        this.field5935 = -1;
        this.field5936++;
        this.field5933 = null;
        if (arg0 == -29644) {
            this.field5938 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(Ljava/lang/String;[BII)I")
    public static final int method2522(String arg0, byte[] arg1, int arg2, int arg3) {
        int var4 = 36 % ((32 - arg3) / 48);
        field5916++;
        int var5 = arg2;
        int var6 = arg0.length();
        for (int var7 = 0; var7 < var6; var7 += 4) {
            int var8 = class172.method961(arg0.charAt(var7), 16);
            int var9 = var7 + 1 >= var6 ? -1 : class172.method961(arg0.charAt(var7 + 1), 16);
            int var10 = var7 + 2 >= var6 ? -1 : class172.method961(arg0.charAt(var7 + 2), 16);
            int var11 = var6 <= (var7 + 3) ? -1 : class172.method961(arg0.charAt(var7 + 3), 16);
            arg1[arg2++] = (byte) class42.method223(var9 >>> 4, var8 << 2);
            if (var10 == -1) {
                break;
            }
            arg1[arg2++] = (byte) class42.method223(var10 >>> 2, class288.method1624(var9 << 4, 240));
            if (var11 == -1) {
                break;
            }
            arg1[arg2++] = (byte) class42.method223(var11, class288.method1624(3, var10) << 6);
        }
        return arg2 - var5;
    }

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "(I)Z")
    public final boolean method2523(int arg0) {
        if (arg0 == 0) {
            field5920++;
            return this.method2532((byte) 102) >= 20;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(ZLqg;B)V")
    public final void method2524(boolean arg0, class391 arg1, byte arg2) {
        if (this.field5933 != null) {
            try {
                this.field5933.method2245(1);
            } catch (Exception var9) {
            }
            this.field5933 = null;
        }
        field5924++;
        this.field5933 = arg1;
        this.method2527(12504);
        int var4 = -53 / ((-arg2 - 34) / 63);
        this.method2531(arg0, 0);
        this.field5937.field4966 = 0;
        this.field5939 = null;
        while (true) {
            class499 var5 = (class499) this.field5928.method2072(false);
            if (var5 == null) {
                while (true) {
                    class499 var6 = (class499) this.field5930.method2072(false);
                    if (var6 == null) {
                        if (this.field5938 != 0) {
                            try {
                                this.field5932.field4966 = 0;
                                this.field5932.method2093(4, -109);
                                this.field5932.method2093(this.field5938, -102);
                                this.field5932.method2115(0, 3324);
                                this.field5933.method2251(this.field5932.field4929, 4, -26995, 0);
                            } catch (IOException var8) {
                                try {
                                    this.field5933.method2245(1);
                                } catch (Exception var7) {
                                }
                                this.field5933 = null;
                                this.field5935 = -2;
                                this.field5936++;
                            }
                        }
                        this.field5934 = 0;
                        this.field5931 = class190.method1030(false);
                        return;
                    }
                    this.field5929.method2070(var6, 116);
                }
            }
            this.field5912.method2070(var5, -73);
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(Z)V")
    public static void method2525(boolean arg0) {
        field5911 = null;
        field5918 = null;
        if (!arg0) {
            method2528(-22, null, -101, null, null);
        }
    }

    @OriginalMember(owner = "client!gq", name = "d", descriptor = "(I)V")
    public final void method2526(int arg0) {
        if (arg0 < -78) {
            field5914++;
            if (this.field5933 != null) {
                this.field5933.method2244(-16138);
            }
        }
    }

    @OriginalMember(owner = "client!gq", name = "e", descriptor = "(I)V")
    private final void method2527(int arg0) {
        field5925++;
        if (this.field5933 == null) {
            return;
        }
        try {
            if (arg0 != 12504) {
                this.field5937 = null;
            }
            this.field5932.field4966 = 0;
            this.field5932.method2093(6, -117);
            this.field5932.method2102(3, (byte) -108);
            this.field5933.method2251(this.field5932.field4929, 4, -26995, 0);
        } catch (IOException var3) {
            try {
                this.field5933.method2245(1);
            } catch (Exception var2) {
            }
            this.field5933 = null;
            this.field5935 = -2;
            this.field5936++;
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(ILdn;ILjava/awt/Canvas;Ln;)Lqa;")
    public static final class206 method2528(int arg0, class438 arg1, int arg2, Canvas arg3, class17 arg4) {
        field5927++;
        if (arg2 != -4757) {
            field5918 = null;
        }
        if (!class301.method1664(63)) {
            throw new RuntimeException("");
        } else if (class136.method757(0, "jaggl")) {
            OpenGL var5 = new OpenGL();
            long var6 = var5.init(arg3, 8, 8, 8, 24, 0, arg0);
            if (var6 == 0L) {
                throw new RuntimeException("");
            }
            class327 var8 = new class327(var5, arg3, var6, arg4, arg1, arg0);
            var8.method2473(-122);
            return var8;
        } else {
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(Z)Z")
    public final boolean method2529(boolean arg0) {
        field5919++;
        if (!arg0) {
            this.field5933 = null;
        }
        return this.method2520((byte) -91) >= 20;
    }

    @OriginalMember(owner = "client!gq", name = "f", descriptor = "(I)Z")
    public final boolean method2530(int arg0) {
        if (this.field5933 != null) {
            long var2 = class190.method1030(false);
            int var4 = (int) (var2 - this.field5931);
            if (var4 > 200) {
                var4 = 200;
            }
            this.field5931 = var2;
            this.field5934 += var4;
            if (this.field5934 > 30000) {
                try {
                    this.field5933.method2245(1);
                } catch (Exception var27) {
                }
                this.field5933 = null;
            }
        }
        field5922++;
        if (this.field5933 == null) {
            return this.method2532((byte) 122) == 0 && this.method2520((byte) -91) == 0;
        }
        try {
            this.field5933.method2247(0);
            for (class499 var5 = (class499) this.field5912.method2066((byte) -82); var5 != null; var5 = (class499) this.field5912.method2068(true)) {
                this.field5932.field4966 = 0;
                this.field5932.method2093(1, -111);
                this.field5932.method2102((int) var5.field67, (byte) 66);
                this.field5933.method2251(this.field5932.field4929, 4, -26995, 0);
                this.field5928.method2070(var5, -127);
            }
            if (arg0 >= -57) {
                this.field5912 = null;
            }
            for (class499 var6 = (class499) this.field5929.method2066((byte) -82); var6 != null; var6 = (class499) this.field5929.method2068(true)) {
                this.field5932.field4966 = 0;
                this.field5932.method2093(0, -109);
                this.field5932.method2102((int) var6.field67, (byte) 65);
                this.field5933.method2251(this.field5932.field4929, 4, -26995, 0);
                this.field5930.method2070(var6, -68);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field5933.method2249((byte) 4);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field5934 = 0;
                byte var9 = 0;
                if (this.field5939 == null) {
                    var9 = 8;
                } else if (this.field5939.field6927 == 0) {
                    var9 = 1;
                }
                if (var9 > 0) {
                    int var10 = var9 - this.field5937.field4966;
                    if (var8 < var10) {
                        var10 = var8;
                    }
                    this.field5933.method2248(this.field5937.field4929, (byte) 74, var10, this.field5937.field4966);
                    if (this.field5938 != 0) {
                        for (int var11 = 0; var11 < var10; var11++) {
                            this.field5937.field4929[this.field5937.field4966 + var11] = (byte) class347.method1937(this.field5937.field4929[this.field5937.field4966 + var11], this.field5938);
                        }
                    }
                    this.field5937.field4966 += var10;
                    if (var9 <= this.field5937.field4966) {
                        if (this.field5939 == null) {
                            this.field5937.field4966 = 0;
                            int var12 = this.field5937.method2129(-70);
                            int var13 = this.field5937.method2136(false);
                            int var14 = this.field5937.method2129(-115);
                            int var15 = this.field5937.method2123(false);
                            int var16 = var14 & 0x7F;
                            boolean var17 = (var14 & 0x80) != 0;
                            long var18 = (long) ((var12 << 16) + var13);
                            Object var20 = null;
                            class499 var21;
                            if (var17) {
                                for (var21 = (class499) this.field5930.method2066((byte) -82); var21 != null && var21.field67 != var18; var21 = (class499) this.field5930.method2068(true)) {
                                }
                            } else {
                                for (var21 = (class499) this.field5928.method2066((byte) -82); var21 != null && var21.field67 != var18; var21 = (class499) this.field5928.method2068(true)) {
                                }
                            }
                            if (var21 == null) {
                                throw new IOException();
                            }
                            this.field5939 = var21;
                            int var22 = var16 == 0 ? 5 : 9;
                            this.field5939.field6930 = new class374(var15 + var22 + this.field5939.field6932);
                            this.field5939.field6930.method2093(var16, -101);
                            this.field5939.field6930.method2131(var15, -1495157560);
                            this.field5937.field4966 = 0;
                            this.field5939.field6927 = 8;
                        } else if (this.field5939.field6927 != 0) {
                            throw new IOException();
                        } else if (this.field5937.field4929[0] == -1) {
                            this.field5939.field6927 = 1;
                            this.field5937.field4966 = 0;
                        } else {
                            this.field5939 = null;
                        }
                    }
                } else {
                    int var23 = this.field5939.field6930.field4929.length - this.field5939.field6932;
                    int var24 = 512 - this.field5939.field6927;
                    if (var23 - this.field5939.field6930.field4966 < var24) {
                        var24 = var23 - this.field5939.field6930.field4966;
                    }
                    if (var8 < var24) {
                        var24 = var8;
                    }
                    this.field5933.method2248(this.field5939.field6930.field4929, (byte) 74, var24, this.field5939.field6930.field4966);
                    if (this.field5938 != 0) {
                        for (int var25 = 0; var25 < var24; var25++) {
                            this.field5939.field6930.field4929[this.field5939.field6930.field4966 + var25] = (byte) class347.method1937(this.field5939.field6930.field4929[this.field5939.field6930.field4966 + var25], this.field5938);
                        }
                    }
                    this.field5939.field6930.field4966 += var24;
                    this.field5939.field6927 += var24;
                    if (this.field5939.field6930.field4966 == var23) {
                        this.field5939.method48(-1);
                        this.field5939.field8322 = false;
                        this.field5939 = null;
                    } else if (this.field5939.field6927 == 512) {
                        this.field5939.field6927 = 0;
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field5933.method2245(1);
            } catch (Exception var26) {
            }
            this.field5933 = null;
            this.field5936++;
            this.field5935 = -2;
            return this.method2532((byte) 96) == 0 && this.method2520((byte) -91) == 0;
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(ZI)V")
    public final void method2531(boolean arg0, int arg1) {
        field5915++;
        if (this.field5933 == null) {
            return;
        }
        try {
            this.field5932.field4966 = 0;
            this.field5932.method2093(arg0 ? 2 : 3, arg1 - 127);
            this.field5932.method2102(0, (byte) -115);
            this.field5933.method2251(this.field5932.field4929, 4, -26995, arg1);
        } catch (IOException var4) {
            try {
                this.field5933.method2245(1);
            } catch (Exception var3) {
            }
            this.field5935 = -2;
            this.field5933 = null;
            this.field5936++;
        }
    }

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "(B)I")
    public final int method2532(byte arg0) {
        int var2 = -42 / ((47 - arg0) / 48);
        field5913++;
        return this.field5912.method2069(true) + this.field5928.method2069(true);
    }
}
