import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class95 extends class113 {

    @OriginalMember(owner = "client!ne", name = "lb", descriptor = "Z")
    public boolean field2300 = true;

    @OriginalMember(owner = "client!ne", name = "kb", descriptor = "I")
    public int field2299 = -1;

    @OriginalMember(owner = "client!ne", name = "qb", descriptor = "I")
    public int field2305 = 0;

    @OriginalMember(owner = "client!ne", name = "wb", descriptor = "I")
    public int field2311 = -1;

    @OriginalMember(owner = "client!ne", name = "ab", descriptor = "Lu;")
    private static class135 field2289 = class87.method676((byte) -39, " from your friend list first");

    @OriginalMember(owner = "client!ne", name = "fb", descriptor = "I")
    public static int field2294 = -1;

    @OriginalMember(owner = "client!ne", name = "gb", descriptor = "Lu;")
    public static class135 field2295 = class87.method676((byte) -69, "Registrierter Benutzer");

    @OriginalMember(owner = "client!ne", name = "jb", descriptor = "Lu;")
    public static class135 field2298 = field2289;

    @OriginalMember(owner = "client!ne", name = "rb", descriptor = "Z")
    public static boolean field2306 = false;

    @OriginalMember(owner = "client!ne", name = "tb", descriptor = "Lu;")
    private static class135 field2308 = class87.method676((byte) -90, "Hidden");

    @OriginalMember(owner = "client!ne", name = "ub", descriptor = "Lu;")
    public static class135 field2309 = field2308;

    @OriginalMember(owner = "client!ne", name = "bb", descriptor = "Lu;")
    public static class135 field2290 = class87.method676((byte) -65, "Titelbild geladen)3");

    @OriginalMember(owner = "client!ne", name = "Y", descriptor = "I")
    public static int field2287;

    @OriginalMember(owner = "client!ne", name = "cb", descriptor = "I")
    public static int field2291;

    @OriginalMember(owner = "client!ne", name = "db", descriptor = "I")
    public static int field2292;

    @OriginalMember(owner = "client!ne", name = "eb", descriptor = "I")
    public static int field2293;

    @OriginalMember(owner = "client!ne", name = "hb", descriptor = "I")
    public int field2296;

    @OriginalMember(owner = "client!ne", name = "ib", descriptor = "I")
    public static int field2297;

    @OriginalMember(owner = "client!ne", name = "mb", descriptor = "I")
    public static int field2301;

    @OriginalMember(owner = "client!ne", name = "nb", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!ne", name = "ob", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!ne", name = "pb", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!ne", name = "sb", descriptor = "I")
    public int field2307;

    @OriginalMember(owner = "client!ne", name = "vb", descriptor = "I")
    public int field2310;

    @OriginalMember(owner = "client!ne", name = "xb", descriptor = "I")
    public static int field2312;

    @OriginalMember(owner = "client!ne", name = "yb", descriptor = "I")
    public static int field2313;

    @OriginalMember(owner = "client!ne", name = "zb", descriptor = "I")
    public int field2314;

    @OriginalMember(owner = "client!ne", name = "Ab", descriptor = "I")
    public static int field2315;

    @OriginalMember(owner = "client!ne", name = "Bb", descriptor = "I")
    public int field2316;

    @OriginalMember(owner = "client!ne", name = "Cb", descriptor = "I")
    public static int field2317;

    @OriginalMember(owner = "client!ne", name = "Db", descriptor = "I")
    public static int field2318;

    @OriginalMember(owner = "client!ne", name = "Eb", descriptor = "I")
    public static int field2319;

    @OriginalMember(owner = "client!ne", name = "Fb", descriptor = "I")
    public int field2320;

    @OriginalMember(owner = "client!ne", name = "Gb", descriptor = "I")
    public static int field2321;

    @OriginalMember(owner = "client!ne", name = "Z", descriptor = "Lkf;")
    public static class75 field2288;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "(I)V")
    public static void method776(int arg0) {
        field2295 = null;
        field2290 = null;
        field2289 = null;
        field2308 = null;
        field2288 = null;
        field2298 = null;
        if (arg0 != -9) {
            method778(null, -117, -31, 56);
        }
        field2309 = null;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIILic;)V")
    private final void method777(int arg0, int arg1, int arg2, class59 arg3) {
        field2292++;
        if (arg1 != -4171) {
            this.field2310 = -122;
        }
        if (arg2 == 1) {
            this.field2305 = arg3.method455(true);
        } else if (arg2 == 2) {
            this.field2299 = arg3.method480(arg1 + 4171);
        } else if (arg2 == 5) {
            this.field2300 = false;
            return;
        } else if (arg2 == 7) {
            this.field2311 = arg3.method455(true);
            return;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lvd;III)V")
    public static final void method778(class145 arg0, int arg1, int arg2, int arg3) {
        field2321++;
        if (arg2 < 71) {
            field2317 = -19;
        }
        if ((arg3 & 0x8) != 0) {
            int var4 = class23.field581.method469(-128);
            int var5 = class23.field581.method484((byte) 124);
            arg0.method46(-13313, var4, var5, class126.field2998);
            arg0.field164 = class126.field2998 + 300;
            arg0.field199 = class23.field581.method469(-128);
            arg0.field171 = class23.field581.method484((byte) 119);
        }
        if ((arg3 & 0x100) != 0) {
            arg0.field155 = class23.field581.method488(-28134);
            int var6 = class23.field581.method493(false);
            arg0.field201 = 0;
            arg0.field188 = var6 >> 16;
            if (arg0.field155 == 65535) {
                arg0.field155 = -1;
            }
            arg0.field225 = 0;
            arg0.field193 = (var6 & 0xFFFF) + class126.field2998;
            if (arg0.field193 > class126.field2998) {
                arg0.field201 = -1;
            }
        }
        if ((arg3 & 0x4) != 0) {
            arg0.field227 = class23.field581.method483((byte) 24);
            if (arg0.field227 == 65535) {
                arg0.field227 = -1;
            }
        }
        if ((arg3 & 0x200) != 0) {
            arg0.field209 = class23.field581.method484((byte) 125);
            arg0.field189 = class23.field581.method456((byte) 89);
            arg0.field231 = class23.field581.method480(0);
            arg0.field204 = class23.field581.method469(-128);
            arg0.field208 = class23.field581.method491(2) + class126.field2998;
            arg0.field226 = class23.field581.method483((byte) 24) + class126.field2998;
            arg0.field183 = class23.field581.method480(0);
            arg0.field195 = 1;
            arg0.field187 = 0;
        }
        if ((arg3 & 0x10) != 0) {
            int var7 = class23.field581.method484((byte) 120);
            byte[] var8 = new byte[var7];
            class59 var9 = new class59(var8);
            class23.field581.method465(var8, (byte) 62, 0, var7);
            class78.field1844[arg1] = var9;
            arg0.method1184(true, var9);
        }
        if ((arg3 & 0x400) != 0) {
            int var10 = class23.field581.method484((byte) 123);
            int var11 = class23.field581.method469(-128);
            arg0.method46(-13313, var10, var11, class126.field2998);
            arg0.field164 = class126.field2998 + 300;
            arg0.field199 = class23.field581.method469(-128);
            arg0.field171 = class23.field581.method484((byte) 119);
        }
        if ((arg3 & 0x1) != 0) {
            int var12 = class23.field581.method472((byte) -122);
            if (var12 == 65535) {
                var12 = -1;
            }
            int var13 = class23.field581.method456((byte) 54);
            class132.method1055(-4, arg0, var12, var13);
        }
        if ((arg3 & 0x2) != 0) {
            int var14 = class23.field581.method472((byte) -72);
            int var15 = class23.field581.method484((byte) 119);
            int var16 = class23.field581.method469(-128);
            int var17 = class23.field581.field1485;
            if (arg0.field3516 != null && arg0.field3526 != null) {
                boolean var18 = false;
                long var19 = arg0.field3516.method1064(-22243);
                if (var15 <= 1) {
                    for (int var21 = 0; var21 < class119.field2844; var21++) {
                        if (class14.field340[var21] == var19) {
                            var18 = true;
                            break;
                        }
                    }
                }
                if (!var18 && class135.field3264 == 0) {
                    class2.field45.field1485 = 0;
                    class23.field581.method465(class2.field45.field1495, (byte) 62, 0, var16);
                    class2.field45.field1485 = 0;
                    class135 var22 = class130.method1045(class2.field45, (byte) 104).method1078(-103);
                    arg0.field179 = var22.method1086((byte) 63);
                    arg0.field158 = var14 & 0xFF;
                    arg0.field190 = 150;
                    arg0.field181 = var14 >> 8;
                    if (var15 == 2 || var15 == 3) {
                        class82.method635(1, class107.method867(2, new class135[] { class26.field626, arg0.field3516 }), (byte) 110, var22);
                    } else if (var15 == 1) {
                        class82.method635(1, class107.method867(2, new class135[] { class56.field1369, arg0.field3516 }), (byte) 118, var22);
                    } else {
                        class82.method635(2, arg0.field3516, (byte) 118, var22);
                    }
                }
            }
            class23.field581.field1485 = var16 + var17;
        }
        if ((arg3 & 0x80) != 0) {
            arg0.field160 = class23.field581.method491(2);
            arg0.field223 = class23.field581.method491(2);
        }
        if ((arg3 & 0x20) == 0) {
            return;
        }
        arg0.field179 = class23.field581.method496(-4);
        if (arg0.field179.method1071(61, 0) == 126) {
            arg0.field179 = arg0.field179.method1065((byte) -78, 1);
            class82.method635(2, arg0.field3516, (byte) 105, arg0.field179);
        } else if (class116.field2789 == arg0) {
            class82.method635(2, arg0.field3516, (byte) 126, arg0.field179);
        }
        arg0.field181 = 0;
        arg0.field190 = 150;
        arg0.field158 = 0;
    }

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "(I)V")
    public static final void method779(int arg0) {
        field2303++;
        if (class26.field642 > 0) {
            class145.method1190(-67);
        } else {
            class125.method978(40, 1);
            class78.field1839 = class104.field2501;
            int var1 = -126 / ((69 - arg0) / 47);
            class104.field2501 = null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILic;I)V")
    public final void method780(int arg0, class59 arg1, int arg2) {
        while (true) {
            int var4 = arg1.method480(0);
            if (var4 == 0) {
                field2319++;
                if (arg0 != 0) {
                    method776(120);
                    return;
                }
                return;
            }
            this.method777(arg2, -4171, var4, arg1);
        }
    }

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "(I)V")
    public final void method781(int arg0) {
        if (this.field2311 != -1) {
            this.method784(this.field2311, 0);
            this.field2310 = this.field2307;
            this.field2296 = this.field2316;
            this.field2320 = this.field2314;
        }
        field2302++;
        this.method784(this.field2305, 0);
        if (arg0 <= 89) {
            field2290 = null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Z)V")
    public static final void method782(boolean arg0) {
        class107.method865(true, class19.field425);
        if (class115.field2752 != -1) {
            class107.method865(true, class115.field2752);
        }
        class20.field452 = 0;
        class143.field3498.method966(-86);
        class51.method395();
        class70.method560();
        field2313++;
        class101.method830(0, 0, 503, 765, 0, 0, class19.field425);
        if (class115.field2752 != -1) {
            class101.method830(0, 0, 503, 765, 0, 0, class115.field2752);
        }
        if (class128.field3077) {
            class60.method505(0);
        } else {
            class77.method619((byte) 22);
            class10.method53(408);
        }
        try {
            Graphics var1 = class59.field1484.getGraphics();
            class143.field3498.method94(-17740, 0, var1, 0);
        } catch (Exception var2) {
            class59.field1484.repaint();
        }
        if (arg0) {
            method785(-127, (byte) -46, 83, null, null, 65, -123);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZLg;Lg;Lcc;Z)V")
    public static final void method783(boolean arg0, class43 arg1, class43 arg2, class18 arg3, boolean arg4) {
        class68.field1667 = arg0;
        class83.field1976 = arg2;
        class82.field1951 = arg1;
        class125.field2981 = class83.field1976.method335(10, (byte) -38);
        if (!arg4) {
            method783(true, null, null, null, true);
        }
        field2301++;
        class55.field1338 = arg3;
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(II)V")
    private final void method784(int arg0, int arg1) {
        field2304++;
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = var3;
        double var11 = var3;
        if (var3 < var5) {
            var11 = var5;
        }
        if (var11 < var7) {
            var11 = var7;
        }
        double var13 = 0.0D;
        double var15 = (double) arg1;
        if (var5 < var3) {
            var9 = var5;
        }
        if (var7 < var9) {
            var9 = var7;
        }
        double var17 = (var9 + var11) / 2.0D;
        this.field2314 = (int) (var17 * 256.0D);
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var13 = (var11 - var9) / (var9 + var11);
            }
            if (var17 >= 0.5D) {
                var13 = (var11 - var9) / (2.0D - var11 - var9);
            }
            if (var3 == var11) {
                var15 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var15 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var15 = (var3 - var5) / (-var9 + var11) + 4.0D;
            }
        }
        double var19 = var15 / 6.0D;
        this.field2307 = (int) (var13 * 256.0D);
        this.field2316 = (int) (var19 * 256.0D);
        if (this.field2314 < 0) {
            this.field2314 = 0;
        } else if (this.field2314 > 255) {
            this.field2314 = 255;
        }
        if (this.field2307 < 0) {
            this.field2307 = 0;
        } else if (this.field2307 > 255) {
            this.field2307 = 255;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IBILu;Lu;II)V")
    public static final void method785(int arg0, byte arg1, int arg2, class135 arg3, class135 arg4, int arg5, int arg6) {
        if (arg1 != -99) {
            field2295 = null;
        }
        field2312++;
        if (class131.field3135 >= 500) {
            return;
        }
        if (arg3.method1063(-64) <= 0) {
            class108.field2599[class131.field3135] = arg4;
        } else {
            class108.field2599[class131.field3135] = class107.method867(2, new class135[] { arg4, class56.field1348, arg3 });
        }
        class69.field1706[class131.field3135] = arg6;
        class104.field2514[class131.field3135] = arg5;
        class65.field1632[class131.field3135] = arg2;
        class93.field2202[class131.field3135] = arg0;
        class131.field3135++;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lg;I)V")
    public static final void method786(class43 arg0, int arg1) {
        field2293++;
        class106.field2560 = arg0;
        class60.field1526 = class106.field2560.method335(16, (byte) -38);
        int var2 = 83 / ((arg1 - 39) / 58);
    }
}
