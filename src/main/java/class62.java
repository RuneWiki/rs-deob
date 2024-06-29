import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class62 extends class304 {

    @OriginalMember(owner = "client!ub", name = "I", descriptor = "I")
    private int field905;

    @OriginalMember(owner = "client!ub", name = "v", descriptor = "I")
    private int field893;

    @OriginalMember(owner = "client!ub", name = "F", descriptor = "I")
    private int field902;

    @OriginalMember(owner = "client!ub", name = "y", descriptor = "I")
    private int field896;

    @OriginalMember(owner = "client!ub", name = "M", descriptor = "Ldb;")
    public static class102 field909 = new class102(4);

    @OriginalMember(owner = "client!ub", name = "P", descriptor = "Lfl;")
    public static class300 field912 = new class300();

    @OriginalMember(owner = "client!ub", name = "u", descriptor = "I")
    public static int field892;

    @OriginalMember(owner = "client!ub", name = "w", descriptor = "I")
    public static int field894;

    @OriginalMember(owner = "client!ub", name = "x", descriptor = "I")
    public static int field895;

    @OriginalMember(owner = "client!ub", name = "z", descriptor = "I")
    private int field897;

    @OriginalMember(owner = "client!ub", name = "A", descriptor = "I")
    private int field898;

    @OriginalMember(owner = "client!ub", name = "B", descriptor = "I")
    public static int field899;

    @OriginalMember(owner = "client!ub", name = "C", descriptor = "I")
    public static int field900;

    @OriginalMember(owner = "client!ub", name = "E", descriptor = "I")
    public static int field901;

    @OriginalMember(owner = "client!ub", name = "G", descriptor = "I")
    public static int field903;

    @OriginalMember(owner = "client!ub", name = "H", descriptor = "I")
    private int field904;

    @OriginalMember(owner = "client!ub", name = "J", descriptor = "I")
    public static int field906;

    @OriginalMember(owner = "client!ub", name = "L", descriptor = "I")
    public static int field908;

    @OriginalMember(owner = "client!ub", name = "N", descriptor = "I")
    private int field910;

    @OriginalMember(owner = "client!ub", name = "O", descriptor = "I")
    public static int field911;

    @OriginalMember(owner = "client!ub", name = "K", descriptor = "[B")
    private byte[] field907;

    @OriginalMember(owner = "client!ub", name = "Q", descriptor = "[I")
    public static int[] field913;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(B)V", line = 10)
    public final void method416(byte arg0) {
        this.field897 >>= 0x4;
        this.field896 = this.field902;
        if (arg0 != -4) {
            return;
        }
        if (this.field897 < 0) {
            this.field897 = 0;
        } else if (this.field897 > 255) {
            this.field897 = 255;
        }
        this.method421(this.field910++, (byte) this.field897);
        this.field897 = 0;
        field911++;
    }

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "(I)V", line = 32)
    public static final void method417(int arg0) {
        field899++;
        class189.method1404(1);
        class316.method2227((byte) -128);
        class303.method2158((byte) 110);
        class54.method344(true);
        if (arg0 >= -97) {
            method422((String) null, 108);
        }
        class234.method1691((byte) -45);
        class157.method1127((byte) -124);
        class277.method2008(0);
        class226.method1604((byte) 84);
        class179.method1344((byte) -40);
        class339.method2359(128);
        class327.method2290(37);
        class127.method923(-1565068888);
        class341.method2368(90);
        class5.method31(29);
        class204.method1485((byte) -127);
        class197.method1452(19050);
        class133.method972(23028);
        class285.method2051(107);
        class335.method2339(-123);
        class164.method1210((byte) 68);
        class93.field1270.method702((byte) 120);
        class339.field5285.method702((byte) 122);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(III)V", line = 64)
    public final void method418(int arg0, int arg1, int arg2) {
        field908++;
        if (arg1 == 0) {
            this.field904 = 4096;
            this.field898 = this.field905 - (arg0 < 0 ? -arg0 : arg0);
            this.field898 = this.field898 * this.field898 >> 12;
            this.field897 = this.field898;
        } else {
            this.field904 = this.field898 * this.field893 >> 12;
            this.field898 = this.field905 - (arg0 < 0 ? -arg0 : arg0);
            this.field898 = this.field898 * this.field898 >> 12;
            if (this.field904 < 0) {
                this.field904 = 0;
            } else if (this.field904 > 4096) {
                this.field904 = 4096;
            }
            this.field898 = this.field904 * this.field898 >> 12;
            this.field897 += this.field898 * this.field896 >> 12;
            this.field896 = this.field902 * this.field896 >> 12;
        }
        if (arg2 != 6952) {
            this.field907 = (byte[]) null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "(I)V", line = 102)
    public static void method419(int arg0) {
        field912 = null;
        if (arg0 != -1) {
            field909 = (class102) null;
        }
        field909 = null;
        field913 = null;
    }

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "(I)V", line = 115)
    public static final void method420(int arg0) {
        class70.field996 = arg0;
        class296.field4689 = false;
        class343.field5330 = -1;
        field903++;
        class39.field514 = -3;
        class113.field1722 = 0;
        class54.field760 = 0;
        class217.field3518 = 0;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IB)V", line = 130)
    public void method421(int arg0, byte arg1) {
        this.field907[arg0] = arg1;
        field894++;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 147)
    public static final int method422(String arg0, int arg1) {
        field892++;
        int var2 = 25 % ((arg1 + 67) / 35);
        int var3 = arg0.length();
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            var4 = class231.method1640(-103, arg0.charAt(var5)) + ((var4 << 5) - var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(I)V", line = 168)
    public final void method423(int arg0) {
        this.field897 = 0;
        this.field910 = 0;
        if (arg0 == 21260) {
            field901++;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IZIIIII)V", line = 180)
    public static final void method424(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field895++;
        if (class336.field5249 <= (arg6 - arg3) && (arg3 + arg6) <= class191.field3131 && class98.field1410 <= arg4 - arg3 && class279.field4497 >= (arg4 + arg3)) {
            class181.method1354(arg0, arg3, 2, arg4, arg6, arg5, arg2);
        } else {
            class273.method1978(arg6, arg0, arg3, -2087878879, arg4, arg5, arg2);
        }
        if (!arg1) {
            field909 = (class102) null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(DB)V", line = 199)
    public static final void method425(double arg0, byte arg1) {
        field900++;
        if (arg1 != -97) {
            method417(-78);
        }
        if (class144.field2241 == arg0) {
            return;
        }
        for (int var3 = 0; var3 < 256; var3++) {
            int var4 = (int) (Math.pow((double) var3 / 255.0D, arg0) * 255.0D);
            class208.field3423[var3] = var4 > 255 ? 255 : var4;
        }
        class144.field2241 = arg0;
    }

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "(I)Z", line = 229)
    public static final boolean method426(int arg0) throws IOException {
        field906++;
        if (class320.field4966 == null) {
            return false;
        }
        int var1 = class320.field4966.method87(arg0 ^ 0xFFFFEC77);
        if (var1 == 0) {
            return false;
        }
        if (class343.field5331 == -1) {
            class320.field4966.method89(1, true, class247.field3898.field573, 0);
            class247.field3898.field586 = 0;
            var1--;
            class343.field5331 = class247.field3898.method2373(false);
            class219.field3540 = class100.field1464[class343.field5331];
        }
        if (class219.field3540 == arg0) {
            if (var1 <= 0) {
                return false;
            }
            var1--;
            class320.field4966.method89(1, true, class247.field3898.field573, 0);
            class219.field3540 = class247.field3898.field573[0] & 0xFF;
        }
        if (class219.field3540 == -2) {
            if (var1 <= 1) {
                return false;
            }
            class320.field4966.method89(2, true, class247.field3898.field573, 0);
            class247.field3898.field586 = 0;
            class219.field3540 = class247.field3898.method271(21081);
            var1 -= 2;
        }
        if (var1 < class219.field3540) {
            return false;
        }
        class247.field3898.field586 = 0;
        class320.field4966.method89(class219.field3540, true, class247.field3898.field573, 0);
        class321.field4975 = 0;
        class101.field1470 = class268.field4325;
        class268.field4325 = class65.field937;
        class65.field937 = class343.field5331;
        if (class343.field5331 == 113) {
            class284.method2040(0);
            class343.field5331 = -1;
            return true;
        } else if (class343.field5331 == 4) {
            int var2 = class247.field3898.method271(21081);
            int var3 = class247.field3898.method282((byte) -97);
            int var4 = class247.field3898.method271(21081);
            if (class273.method1977(var4, (byte) -64)) {
                class179.method1345(-3, var2, var3);
            }
            class343.field5331 = -1;
            return true;
        } else if (class343.field5331 == 127) {
            class44.field585 = class247.field3898.method267((byte) -56) * 30;
            class343.field5331 = -1;
            class201.field3266 = class186.field3074;
            return true;
        } else if (class343.field5331 == 145 || class343.field5331 == 254 || class343.field5331 == 225 || class343.field5331 == 222 || class343.field5331 == 8 || class343.field5331 == 14 || class343.field5331 == 229 || class343.field5331 == 82 || class343.field5331 == 44 || class343.field5331 == 133 || class343.field5331 == 101 || class343.field5331 == 218 || class343.field5331 == 88 || class343.field5331 == 250) {
            class48.method304(-89852956);
            class343.field5331 = -1;
            return true;
        } else if (class343.field5331 == 226) {
            class11.field138 = class247.field3898.method286((byte) -106);
            class343.field5331 = -1;
            class133.field2092 = class186.field3074;
            return true;
        } else if (class343.field5331 == 232) {
            int var5 = class247.field3898.method267((byte) -50);
            int var6 = class247.field3898.method271(21081);
            int var7 = class247.field3898.method271(21081);
            if (var6 == 65535) {
                var6 = -1;
            }
            if (var7 == 65535) {
                var7 = -1;
            }
            int var8 = class247.field3898.method280(255);
            int var9 = class247.field3898.method237(-115);
            if (class273.method1977(var5, (byte) -19)) {
                for (int var10 = var6; var10 <= var7; var10++) {
                    long var11 = ((long) var9 << 32) + (long) var10;
                    class279 var13 = (class279) class60.field839.method451(var11, (byte) 100);
                    class279 var14;
                    if (var13 != null) {
                        var14 = new class279(var8, var13.field4495);
                        var13.method1212((byte) 101);
                    } else if (var10 == -1) {
                        var14 = new class279(var8, class142.method1053(var9, 65535).field2466.field4495);
                    } else {
                        var14 = new class279(var8, -1);
                    }
                    class60.field839.method461(45, var11, var14);
                }
            }
            class343.field5331 = -1;
            return true;
        } else if (class343.field5331 == 79) {
            for (int var15 = 0; var15 < class70.field991.length; var15++) {
                if (class70.field991[var15] != class335.field5232[var15]) {
                    class70.field991[var15] = class335.field5232[var15];
                    class233.method1690(var15, (byte) 48);
                    class273.field4411[client.method767(31, class281.field4528++)] = var15;
                }
            }
            class343.field5331 = -1;
            return true;
        } else if (class343.field5331 == 160) {
            int var388 = class247.field3898.method267((byte) -73);
            int var389 = class247.field3898.method248(true);
            int var390 = class247.field3898.method227((byte) 127);
            int var391 = class247.field3898.method267((byte) -91);
            if (class273.method1977(var391, (byte) -82)) {
                class90 var392 = (class90) class243.field3842.method451((long) var390, (byte) 100);
                if (var392 != null) {
                    class58.method374(var392, var392.field1249 != var388, (byte) 103);
                }
                client.method770(var390, 26, var389, var388);
            }
            class343.field5331 = -1;
            return true;
        } else if (class343.field5331 == 220) {
            class256.field4110 = 0;
            class343.field5331 = -1;
            return true;
        } else if (class343.field5331 == 129) {
            long var16 = class247.field3898.method276((byte) 109);
            int var18 = class247.field3898.method271(21081);
            int var19 = class247.field3898.method286((byte) -103);
            boolean var20 = true;
            String var21 = "";
            if (var16 < 0L) {
                var16 &= Long.MAX_VALUE;
                var20 = false;
            }
            if (var18 > 0) {
                var21 = class247.field3898.method265(0);
            }
            String var22 = class13.method74(63, var16);
            for (int var23 = 0; var23 < class61.field875; var23++) {
                if (class105.field1550[var23] == var16) {
                    if (class58.field824[var23] != var18) {
                        class58.field824[var23] = var18;
                        if (var18 > 0) {
                            class155.method1109(var22 + class103.field1513, 5, "", (byte) -47);
                        }
                        if (var18 == 0) {
                            class155.method1109(var22 + class110.field1629, 5, "", (byte) -47);
                        }
                    }
                    class121.field1838[var23] = var21;
                    class301.field4731[var23] = var19;
                    class191.field3130[var23] = var20;
                    var22 = null;
                    break;
                }
            }
            if (var22 != null && class61.field875 < 200) {
                class105.field1550[class61.field875] = var16;
                class61.field858[class61.field875] = var22;
                class58.field824[class61.field875] = var18;
                class121.field1838[class61.field875] = var21;
                class301.field4731[class61.field875] = var19;
                class191.field3130[class61.field875] = var20;
                class61.field875++;
            }
            boolean var24 = false;
            int var25 = class61.field875;
            class133.field2092 = class186.field3074;
            while (var25 > 0) {
                boolean var26 = true;
                var25--;
                for (int var27 = 0; var27 < var25; var27++) {
                    if (class58.field824[var27] != class21.field306 && class58.field824[var27 + 1] == class21.field306 || class58.field824[var27] == 0 && class58.field824[var27 + 1] != 0) {
                        int var28 = class58.field824[var27];
                        class58.field824[var27] = class58.field824[var27 + 1];
                        var26 = false;
                        class58.field824[var27 + 1] = var28;
                        String var29 = class121.field1838[var27];
                        class121.field1838[var27] = class121.field1838[var27 + 1];
                        class121.field1838[var27 + 1] = var29;
                        String var30 = class61.field858[var27];
                        class61.field858[var27] = class61.field858[var27 + 1];
                        class61.field858[var27 + 1] = var30;
                        long var31 = class105.field1550[var27];
                        class105.field1550[var27] = class105.field1550[var27 + 1];
                        class105.field1550[var27 + 1] = var31;
                        int var33 = class301.field4731[var27];
                        class301.field4731[var27] = class301.field4731[var27 + 1];
                        class301.field4731[var27 + 1] = var33;
                        boolean var34 = class191.field3130[var27];
                        class191.field3130[var27] = class191.field3130[var27 + 1];
                        class191.field3130[var27 + 1] = var34;
                    }
                }
                if (var26) {
                    break;
                }
            }
            class343.field5331 = -1;
            return true;
        } else if (class343.field5331 == 214) {
            long var35 = class247.field3898.method276((byte) 113);
            class247.field3898.method246((byte) -100);
            long var37 = class247.field3898.method276((byte) -49);
            long var39 = (long) class247.field3898.method271(arg0 + 21082);
            long var41 = (long) class247.field3898.method273(-867673064);
            int var43 = class247.field3898.method286((byte) -120);
            int var44 = class247.field3898.method271(21081);
            boolean var45 = false;
            long var46 = (var39 << 32) + var41;
            int var48 = 0;
            label1305: while (true) {
                if (var48 < 100) {
                    if (class65.field945[var48] != var46) {
                        var48++;
                        continue;
                    }
                    var45 = true;
                    break;
                }
                if (var43 <= 1) {
                    for (int var49 = 0; var49 < class207.field3412; var49++) {
                        if (class54.field769[var49] == var35) {
                            var45 = true;
                            break label1305;
                        }
                    }
                }
                break;
            }
            if (!var45 && class186.field3079 == 0) {
                class65.field945[class268.field4318] = var46;
                class268.field4318 = (class268.field4318 + 1) % 100;
                String var50 = class310.method2188(var44, false).method1897(-84, class247.field3898);
                if (var43 == 2 || var43 == 3) {
                    class236.method1710(var50, 20, "<img=1>" + class13.method74(88, var35), class13.method74(-118, var37), arg0 ^ 0x3C, var44);
                } else if (var43 == 1) {
                    class236.method1710(var50, 20, "<img=0>" + class13.method74(-119, var35), class13.method74(-118, var37), -5, var44);
                } else {
                    class236.method1710(var50, 20, class13.method74(-122, var35), class13.method74(-122, var37), -10, var44);
                }
            }
            class343.field5331 = -1;
            return true;
        } else if (class343.field5331 == 90) {
            int var51 = class247.field3898.method271(21081);
            int var52 = class247.field3898.method286((byte) -116);
            int var53 = class247.field3898.method286((byte) -87);
            int var54 = class247.field3898.method271(arg0 ^ 0xFFFFADA6);
            int var55 = class247.field3898.method286((byte) -69);
            int var56 = class247.field3898.method286((byte) -100);
            if (class273.method1977(var51, (byte) -122)) {
                class190.method1409(var55, var54, var53, var56, var52, 2);
            }
            class343.field5331 = -1;
            return true;
        } else if (class343.field5331 == 201) {
            String var57 = class247.field3898.method265(0);
            if (var57.endsWith(":tradereq:")) {
                String var93 = var57.substring(0, var57.indexOf(":"));
                long var94 = class204.method1491(-26916, var93);
                boolean var96 = false;
                for (int var97 = 0; var97 < class207.field3412; var97++) {
                    if (class54.field769[var97] == var94) {
                        var96 = true;
                        break;
                    }
                }
                if (!var96 && class186.field3079 == 0) {
                    class155.method1109(class261.field4168, 4, var93, (byte) -47);
                }
            } else if (var57.endsWith(":chalreq:")) {
                String var87 = var57.substring(0, var57.indexOf(":"));
                long var88 = class204.method1491(-26916, var87);
                boolean var90 = false;
                for (int var91 = 0; var91 < class207.field3412; var91++) {
                    if (class54.field769[var91] == var88) {
                        var90 = true;
                        break;
                    }
                }
                if (!var90 && class186.field3079 == 0) {
                    String var92 = var57.substring(var57.indexOf(":") + 1, var57.length() + -9);
                    class155.method1109(var92, 8, var87, (byte) -47);
                }
            } else if (var57.endsWith(":assistreq:")) {
                String var58 = var57.substring(0, var57.indexOf(":"));
                long var59 = class204.method1491(-26916, var58);
                boolean var61 = false;
                for (int var62 = 0; var62 < class207.field3412; var62++) {
                    if (class54.field769[var62] == var59) {
                        var61 = true;
                        break;
                    }
                }
                if (!var61 && class186.field3079 == 0) {
                    class155.method1109("", 10, var58, (byte) -47);
                }
            } else if (var57.endsWith(":clan:")) {
                String var63 = var57.substring(0, var57.indexOf(":clan:"));
                class155.method1109(var63, 11, "", (byte) -47);
            } else if (var57.endsWith(":trade:")) {
                String var64 = var57.substring(0, var57.indexOf(":trade:"));
                if (class186.field3079 == 0) {
                    class155.method1109(var64, 12, "", (byte) -47);
                }
            } else if (var57.endsWith(":assist:")) {
                String var86 = var57.substring(0, var57.indexOf(":assist:"));
                if (class186.field3079 == 0) {
                    class155.method1109(var86, 13, "", (byte) -47);
                }
            } else if (var57.endsWith(":duelstake:")) {
                String var65 = var57.substring(0, var57.indexOf(":"));
                long var66 = class204.method1491(arg0 ^ 0x6923, var65);
                boolean var68 = false;
                for (int var69 = 0; var69 < class207.field3412; var69++) {
                    if (class54.field769[var69] == var66) {
                        var68 = true;
                        break;
                    }
                }
                if (!var68 && class186.field3079 == 0) {
                    class155.method1109("", 14, var65, (byte) -47);
                }
            } else if (var57.endsWith(":duelfriend:")) {
                boolean var70 = false;
                String var71 = var57.substring(0, var57.indexOf(":"));
                long var72 = class204.method1491(-26916, var71);
                for (int var74 = 0; var74 < class207.field3412; var74++) {
                    if (class54.field769[var74] == var72) {
                        var70 = true;
                        break;
                    }
                }
                if (!var70 && class186.field3079 == 0) {
                    class155.method1109("", 15, var71, (byte) -47);
                }
            } else if (var57.endsWith(":clanreq:")) {
                String var75 = var57.substring(0, var57.indexOf(":"));
                long var76 = class204.method1491(-26916, var75);
                boolean var78 = false;
                for (int var79 = 0; var79 < class207.field3412; var79++) {
                    if (class54.field769[var79] == var76) {
                        var78 = true;
                        break;
                    }
                }
                if (!var78 && class186.field3079 == 0) {
                    class155.method1109("", 16, var75, (byte) -47);
                }
            } else if (var57.endsWith(":allyreq:")) {
                String var80 = var57.substring(0, var57.indexOf(":"));
                boolean var81 = false;
                long var82 = class204.method1491(-26916, var80);
                for (int var84 = 0; var84 < class207.field3412; var84++) {
                    if (class54.field769[var84] == var82) {
                        var81 = true;
                        break;
                    }
                }
                if (!var81 && class186.field3079 == 0) {
                    String var85 = var57.substring(var57.indexOf(":") + 1, var57.length() - 9);
                    class155.method1109(var85, 21, var80, (byte) -47);
                }
            } else {
                class155.method1109(var57, 0, "", (byte) -47);
            }
            class343.field5331 = -1;
            return true;
        } else if (class343.field5331 == 146) {
            if (class204.field3362 != null) {
                class8.method43(class318.field4946, false, 0, -1, -1);
            }
            byte[] var98 = new byte[class219.field3540];
            class247.field3898.method2369(4, 0, var98, class219.field3540);
            String var99 = class302.method2156(class219.field3540, 0, 120, var98);
            if (class278.field4482 == null && class124.field1933 == 3 || !class124.field1932.startsWith("win") || class27.field379) {
                class110.method763(var99, -20206, true);
            } else {
                class315.field4873 = var99;
                class208.field3419 = true;
                class4.field72 = class14.field159.method890(var99, ~arg0);
            }
            class343.field5331 = -1;
            return true;
        } else if (class343.field5331 == 99) {
            int var383 = class247.field3898.method226(-16384);
            int var384 = class247.field3898.method271(21081);
            int var385 = class247.field3898.method267((byte) -55);
            int var386 = class247.field3898.method282((byte) -97);
            int var387 = class247.field3898.method280(255);
            if (class273.method1977(var383, (byte) -48)) {
                class175.method1319(arg0 + 9, var386, var384, var387, var385);
            }
            class343.field5331 = -1;
            return true;
        } else if (class343.field5331 == 209) {
            long var379 = class247.field3898.method276((byte) -50);
            int var381 = class247.field3898.method271(21081);
            String var382 = class310.method2188(var381, false).method1897(arg0 - 65, class247.field3898);
            class236.method1710(var382, 19, class13.method74(arg0 - 127, var379), (String) null, -30, var381);
            class343.field5331 = -1;
            return true;
        } else if (class343.field5331 == 159) {
            int var371 = class247.field3898.method238((byte) 82);
            int var372 = class247.field3898.method271(21081);
            if (var371 < -70000) {
                var372 += 32768;
            }
            class157 var373;
            if (var371 >= 0) {
                var373 = class142.method1053(var371, 65535);
            } else {
                var373 = null;
            }
            if (var373 != null) {
                for (int var374 = 0; var374 < var373.field2483.length; var374++) {
                    var373.field2483[var374] = 0;
                    var373.field2542[var374] = 0;
                }
            }
            class320.method2248((byte) 93, var372);
            int var375 = class247.field3898.method271(21081);
            for (int var376 = 0; var376 < var375; var376++) {
                int var377 = class247.field3898.method286((byte) -107);
                if (var377 == 255) {
                    var377 = class247.field3898.method237(-111);
                }
                int var378 = class247.field3898.method271(arg0 + 21082);
                if (var373 != null && var376 < var373.field2483.length) {
                    var373.field2483[var376] = var378;
                    var373.field2542[var376] = var377;
                }
                class138.method1022(var377, var376, var372, var378 - 1, (byte) 50);
            }
            if (var373 != null) {
                class320.method2252(var373, 0);
            }
            class344.method2389(-13950);
            class243.field3849[client.method767(class324.field5031++, 31)] = client.method767(32767, var372);
            class343.field5331 = -1;
            return true;
        } else if (class343.field5331 == 156) {
            int var368 = class247.field3898.method226(arg0 ^ 0x3FFF);
            int var369 = class247.field3898.method227((byte) 33);
            if (class273.method1977(var368, (byte) -62)) {
                int var370 = 0;
                if (class191.field3129.field5224 != null) {
                    var370 = class191.field3129.field5224.method724((byte) 97);
                }
                class317.method2231(arg0 ^ 0xFFFFFF84, 3, -1, var370, var369);
            }
            class343.field5331 = -1;
            return true;
        } else if (class343.field5331 == 38) {
            class48.field654 = class247.field3898.method286((byte) -108);
            class8.field118 = class247.field3898.method286((byte) -118);
            class164.field2737 = class247.field3898.method286((byte) -87);
            class343.field5331 = -1;
            return true;
        } else if (class343.field5331 == 189) {
            class45.method292(false, (byte) 4);
            class343.field5331 = -1;
            return true;
        } else if (class343.field5331 == 165) {
            int var100 = class247.field3898.method226(arg0 ^ 0x3FFF);
            int var101 = class247.field3898.method237(arg0 - 115);
            int var102 = class247.field3898.method271(21081);
            if (var102 == 65535) {
                var102 = -1;
            }
            int var103 = class247.field3898.method267((byte) -79);
            int var104 = class247.field3898.method282((byte) -97);
            if (var104 == 65535) {
                var104 = -1;
            }
            if (class273.method1977(var103, (byte) -34)) {
                for (int var105 = var104; var105 <= var102; var105++) {
                    long var106 = ((long) var101 << 32) + (long) var105;
                    class279 var108 = (class279) class60.field839.method451(var106, (byte) 100);
                    class279 var109;
                    if (var108 != null) {
                        var109 = new class279(var108.field4503, var100);
                        var108.method1212((byte) 95);
                    } else if (var105 == -1) {
                        var109 = new class279(class142.method1053(var101, arg0 ^ 0xFFFF0000).field2466.field4503, var100);
                    } else {
                        var109 = new class279(0, var100);
                    }
                    class60.field839.method461(arg0 - 117, var106, var109);
                }
            }
            class343.field5331 = -1;
            return true;
        } else if (class343.field5331 == 43) {
            class49.field696 = class247.field3898.method221((byte) -78);
            class130.field2060 = class247.field3898.method221((byte) -78);
            class343.field5331 = -1;
            return true;
        } else if (class343.field5331 == 135) {
            int var367 = class247.field3898.method226(-16384);
            class234.method1692((byte) 122, var367);
            class243.field3849[client.method767(class324.field5031++, 31)] = client.method767(var367, 32767);
            class343.field5331 = -1;
            return true;
        } else if (class343.field5331 == 138) {
            client.field1658 = class247.field3898.method286((byte) -115);
            class343.field5331 = -1;
            return true;
        } else if (class343.field5331 == 114) {
            int var110 = class247.field3898.method271(21081);
            int var111 = class247.field3898.method238((byte) 82);
            int var112 = class247.field3898.method280(255);
            if (class273.method1977(var110, (byte) -118)) {
                class90 var113 = (class90) class243.field3842.method451((long) var111, (byte) 100);
                class90 var114 = (class90) class243.field3842.method451((long) var112, (byte) 100);
                if (var114 != null) {
                    class58.method374(var114, var113 == null || var113.field1249 != var114.field1249, (byte) 103);
                }
                if (var113 != null) {
                    var113.method1212((byte) 99);
                    class243.field3842.method461(-106, (long) var112, var113);
                }
                class157 var115 = class142.method1053(var111, 65535);
                if (var115 != null) {
                    class320.method2252(var115, 0);
                }
                class157 var116 = class142.method1053(var112, 65535);
                if (var116 != null) {
                    class320.method2252(var116, 0);
                    class109.method758(true, var116, 15);
                }
                if (class147.field2287 != -1) {
                    class60.method410(-11484, 1, class147.field2287);
                }
            }
            class343.field5331 = -1;
            return true;
        } else if (class343.field5331 == 178) {
            int var356 = class247.field3898.method227((byte) 103);
            int var357 = (var356 & 0xFFFCF30) >> 14;
            int var358 = var356 & 0x3FFF;
            int var359 = (var356 & 0x36025113) >> 28;
            int var360 = class247.field3898.method221((byte) -78);
            int var361 = var360 & 0x3;
            int var362 = var360 >> 2;
            int var363 = class209.field3437[var362];
            int var364 = class247.field3898.method271(21081);
            int var365 = var358 - class205.field3367;
            if (var364 == 65535) {
                var364 = -1;
            }
            int var366 = var357 - class70.field989;
            class78.method535(var366, var362, var365, var364, var361, var359, (byte) -97, var363);
            class343.field5331 = -1;
            return true;
        } else if (class343.field5331 == 233) {
            int var117 = class247.field3898.method226(-16384);
            int var118 = class247.field3898.method237(arg0 - 117);
            int var119 = class247.field3898.method282((byte) -97);
            if (class273.method1977(var117, (byte) -66)) {
                class39.method210(var118, arg0 ^ 0xFFFFFFCD, var119);
            }
            class343.field5331 = -1;
            return true;
        } else if (class343.field5331 == 55) {
            if (class147.field2287 != -1) {
                class60.method410(-11484, 0, class147.field2287);
            }
            class343.field5331 = -1;
            return true;
        } else if (class343.field5331 == 18) {
            class247.field3898.field586 += 28;
            if (class247.field3898.method249((byte) -56)) {
                class67.method446(class247.field3898.field586 - 28, -115, class247.field3898);
            }
            class343.field5331 = -1;
            return true;
        } else if (class343.field5331 == 67) {
            class207.field3412 = class219.field3540 / 8;
            for (int var355 = 0; var355 < class207.field3412; var355++) {
                class54.field769[var355] = class247.field3898.method276((byte) 123);
                class210.field3450[var355] = class190.method1406(class54.field769[var355], false);
                class181.field2993[var355] = false;
            }
            class343.field5331 = -1;
            class133.field2092 = class186.field3074;
            return true;
        } else if (class343.field5331 == 70) {
            int var352 = class247.field3898.method280(255);
            int var353 = class247.field3898.method226(arg0 - 16383);
            int var354 = class247.field3898.method271(21081);
            if (class273.method1977(var353, (byte) -65)) {
                class21.method112(false, var352, var354);
            }
            class343.field5331 = -1;
            return true;
        } else if (class343.field5331 == 142) {
            int var120 = class247.field3898.method226(arg0 - 16383);
            int var121 = class247.field3898.method226(-16384);
            int var122 = class247.field3898.method280(arg0 ^ 0xFFFFFF00);
            if (class273.method1977(var120, (byte) -48)) {
                class182.method1362(var121, (byte) -74, var122);
            }
            class343.field5331 = -1;
            return true;
        } else if (class343.field5331 == 242) {
            class344.method2389(-13950);
            class335.field5245 = class247.field3898.method228(true);
            class343.field5331 = -1;
            class201.field3266 = class186.field3074;
            return true;
        } else if (class343.field5331 == 187) {
            int var123 = class247.field3898.method286((byte) -94);
            int var124 = var123 >> 5;
            int var125 = var123 & 0x1F;
            if (var125 == 0) {
                class175.field2895[var124] = null;
                class343.field5331 = -1;
                return true;
            }
            class193 var126 = new class193();
            var126.field3156 = var125;
            var126.field3156 = var123 & 0x3F;
            var126.field3152 = class247.field3898.method286((byte) -92);
            if (var126.field3152 >= 0 && var126.field3152 < class147.field2288.length) {
                if (var126.field3156 == 1 || var126.field3156 == 10) {
                    var126.field3162 = class247.field3898.method271(21081);
                    class247.field3898.field586 += 5;
                } else if (var126.field3156 >= 2 && var126.field3156 <= 6) {
                    if (var126.field3156 == 2) {
                        var126.field3144 = 64;
                        var126.field3149 = 64;
                    }
                    if (var126.field3156 == 3) {
                        var126.field3149 = 0;
                        var126.field3144 = 64;
                    }
                    if (var126.field3156 == 4) {
                        var126.field3144 = 64;
                        var126.field3149 = 128;
                    }
                    if (var126.field3156 == 5) {
                        var126.field3149 = 64;
                        var126.field3144 = 0;
                    }
                    if (var126.field3156 == 6) {
                        var126.field3149 = 64;
                        var126.field3144 = 128;
                    }
                    var126.field3156 = 2;
                    var126.field3161 = class247.field3898.method271(21081);
                    var126.field3145 = class247.field3898.method271(21081);
                    var126.field3151 = class247.field3898.method286((byte) -98);
                    var126.field3164 = class247.field3898.method271(21081);
                }
                var126.field3160 = class247.field3898.method271(arg0 + 21082);
                if (var126.field3160 == 65535) {
                    var126.field3160 = -1;
                }
                class175.field2895[var124] = var126;
            }
            class343.field5331 = -1;
            return true;
        } else if (class343.field5331 == 213) {
            byte var127 = class247.field3898.method272((byte) 41);
            int var128 = class247.field3898.method267((byte) -126);
            int var129 = class247.field3898.method226(arg0 ^ 0x3FFF);
            if (class273.method1977(var129, (byte) -104)) {
                class21.method112(false, var127, var128);
            }
            class343.field5331 = -1;
            return true;
        } else if (class343.field5331 == 102) {
            int var130 = class247.field3898.method271(21081);
            if (class273.method1977(var130, (byte) -10)) {
                class55.method351(-1);
            }
            class343.field5331 = -1;
            return true;
        } else if (class343.field5331 == 190) {
            int var131 = class247.field3898.method271(arg0 ^ 0xFFFFADA6);
            int var132 = class247.field3898.method286((byte) -115);
            int var133 = class247.field3898.method286((byte) -87);
            int var134 = class247.field3898.method271(21081);
            int var135 = class247.field3898.method286((byte) -105);
            int var136 = class247.field3898.method286((byte) -107);
            if (class273.method1977(var131, (byte) -22)) {
                class101.method696(true, var136, var134, var132, -10335, var133, var135);
            }
            class343.field5331 = -1;
            return true;
        } else if (class343.field5331 == 48) {
            int var348 = class247.field3898.method271(21081);
            if (var348 == 65535) {
                var348 = -1;
            }
            int var349 = class247.field3898.method286((byte) -119);
            int var350 = class247.field3898.method271(21081);
            int var351 = class247.field3898.method286((byte) -125);
            class50.method327(var349, var350, var348, var351, (byte) 93);
            class343.field5331 = -1;
            return true;
        } else if (class343.field5331 == 0) {
            int var345 = class247.field3898.method238((byte) 82);
            class157 var346 = class142.method1053(var345, 65535);
            for (int var347 = 0; var347 < var346.field2483.length; var347++) {
                var346.field2483[var347] = -1;
                var346.field2483[var347] = 0;
            }
            class320.method2252(var346, 0);
            class343.field5331 = -1;
            return true;
        } else if (class343.field5331 == 158) {
            long var137 = class247.field3898.method276((byte) 122);
            long var139 = (long) class247.field3898.method271(arg0 + 21082);
            long var141 = (long) class247.field3898.method273(-867673064);
            int var143 = class247.field3898.method286((byte) -94);
            long var144 = (var139 << 32) + var141;
            int var146 = class247.field3898.method271(21081);
            boolean var147 = false;
            int var148 = 0;
            label1438: while (true) {
                if (var148 < 100) {
                    if (class65.field945[var148] != var144) {
                        var148++;
                        continue;
                    }
                    var147 = true;
                    break;
                }
                if (var143 <= 1) {
                    for (int var149 = 0; var149 < class207.field3412; var149++) {
                        if (class54.field769[var149] == var137) {
                            var147 = true;
                            break label1438;
                        }
                    }
                }
                break;
            }
            if (!var147 && class186.field3079 == 0) {
                class65.field945[class268.field4318] = var144;
                class268.field4318 = (class268.field4318 + 1) % 100;
                String var150 = class310.method2188(var146, false).method1897(-88, class247.field3898);
                if (var143 == 2) {
                    class236.method1710(var150, 18, "<img=1>" + class13.method74(35, var137), (String) null, -30, var146);
                } else if (var143 == 1) {
                    class236.method1710(var150, 18, "<img=0>" + class13.method74(67, var137), (String) null, -79, var146);
                } else {
                    class236.method1710(var150, 18, class13.method74(-127, var137), (String) null, -123, var146);
                }
            }
            class343.field5331 = -1;
            return true;
        } else if (class343.field5331 == 237) {
            int var151 = class247.field3898.method282((byte) -97);
            int var152 = class247.field3898.method286((byte) -68);
            if (class273.method1977(var151, (byte) -24)) {
                class106.field1577 = var152;
            }
            class343.field5331 = -1;
            return true;
        } else if (class343.field5331 == 235) {
            if (class219.field3540 == 0) {
                class344.field5357 = class133.field2082;
            } else {
                class344.field5357 = class247.field3898.method265(~arg0);
            }
            class343.field5331 = -1;
            return true;
        } else if (class343.field5331 == 94) {
            int var342 = class247.field3898.method221((byte) -78);
            int var343 = class247.field3898.method221((byte) -78);
            int var344 = class247.field3898.method263(true);
            class49.field698 = var343 >> 1;
            class191.field3129.method2335(var342, var344, (var343 & 0x1) == 1, (byte) -82);
            class343.field5331 = -1;
            return true;
        } else if (class343.field5331 == 193) {
            int var337 = class247.field3898.method271(21081);
            String var338 = class247.field3898.method265(0);
            Object[] var339 = new Object[var338.length() + 1];
            for (int var340 = var338.length() - 1; var340 >= 0; var340--) {
                if (var338.charAt(var340) == 's') {
                    var339[var340 + 1] = class247.field3898.method265(0);
                } else {
                    var339[var340 + 1] = Integer.valueOf(class247.field3898.method238((byte) 82));
                }
            }
            var339[0] = Integer.valueOf(class247.field3898.method238((byte) 82));
            if (class273.method1977(var337, (byte) -69)) {
                class39 var341 = new class39();
                var341.field501 = var339;
                class144.method1065(var341, (byte) 67);
            }
            class343.field5331 = -1;
            return true;
        } else if (class343.field5331 == 134) {
            int var153 = class247.field3898.method282((byte) -97);
            int var154 = class247.field3898.method282((byte) -97);
            if (var154 == 65535) {
                var154 = -1;
            }
            int var155 = class247.field3898.method238((byte) 82);
            int var156 = class247.field3898.method237(-107);
            if (class273.method1977(var153, (byte) -69)) {
                class157 var157 = class142.method1053(var155, arg0 + 65536);
                if (var157.field2421) {
                    class304.method2167(var155, 20589, var154, var156);
                    class330 var158 = class285.method2054(var154, 0);
                    class175.method1319(8, var158.field5140, var158.field5138, var155, var158.field5089);
                    class194.method1433(var158.field5133, var158.field5125, arg0 ^ 0x6F, var158.field5104, var155);
                } else if (var154 == -1) {
                    class343.field5331 = -1;
                    var157.field2516 = 0;
                    return true;
                } else {
                    class330 var159 = class285.method2054(var154, 0);
                    var157.field2492 = var159.field5089;
                    var157.field2516 = 4;
                    var157.field2574 = var159.field5140;
                    var157.field2455 = var154;
                    var157.field2449 = var159.field5138 * 100 / var156;
                    class320.method2252(var157, 0);
                }
            }
            class343.field5331 = -1;
            return true;
        } else if (class343.field5331 == 106) {
            class32.field436 = class186.field3074;
            long var160 = class247.field3898.method276((byte) 125);
            if (var160 == 0L) {
                class343.field5331 = -1;
                class84.field1175 = 0;
                class340.field5291 = null;
                class277.field4463 = null;
                class66.field950 = null;
                return true;
            }
            long var162 = class247.field3898.method276((byte) 116);
            class66.field950 = class33.method179(37, var162);
            class277.field4463 = class33.method179(37, var160);
            class307.field4796 = class247.field3898.method246((byte) -117);
            int var164 = class247.field3898.method286((byte) -80);
            if (var164 == 255) {
                class343.field5331 = -1;
                return true;
            }
            class315[] var165 = new class315[100];
            class84.field1175 = var164;
            for (int var166 = 0; var166 < class84.field1175; var166++) {
                var165[var166] = new class315();
                var165[var166].field2744 = class247.field3898.method276((byte) -22);
                var165[var166].field4876 = class33.method179(37, var165[var166].field2744);
                var165[var166].field4879 = class247.field3898.method271(21081);
                var165[var166].field4875 = class247.field3898.method246((byte) -65);
                var165[var166].field4871 = class247.field3898.method265(~arg0);
                if (class99.field1451 == var165[var166].field2744) {
                    class155.field2383 = var165[var166].field4875;
                }
            }
            boolean var167 = false;
            int var168 = class84.field1175;
            while (var168 > 0) {
                var168--;
                boolean var169 = true;
                for (int var170 = 0; var170 < var168; var170++) {
                    if (var165[var170].field4876.compareTo(var165[var170 + 1].field4876) > 0) {
                        class315 var171 = var165[var170];
                        var169 = false;
                        var165[var170] = var165[var170 + 1];
                        var165[var170 + 1] = var171;
                    }
                }
                if (var169) {
                    break;
                }
            }
            class340.field5291 = var165;
            class343.field5331 = -1;
            return true;
        } else if (class343.field5331 == 115) {
            String var334 = class247.field3898.method265(0);
            int var335 = class247.field3898.method267((byte) -120);
            int var336 = class247.field3898.method282((byte) -97);
            if (class273.method1977(var336, (byte) -116)) {
                class111.method765(var335, -128, var334);
            }
            class343.field5331 = -1;
            return true;
        } else if (class343.field5331 == 202) {
            int var172 = class247.field3898.method286((byte) -124);
            if (class247.field3898.method286((byte) -105) == 0) {
                class151.field2339[var172] = new class49();
            } else {
                class247.field3898.field586--;
                class151.field2339[var172] = new class49(class247.field3898);
            }
            class110.field1640 = class186.field3074;
            class343.field5331 = -1;
            return true;
        } else if (class343.field5331 == 112) {
            byte var173 = class247.field3898.method246((byte) -102);
            int var174 = class247.field3898.method226(-16384);
            class31.method170(var174, var173, 62);
            class343.field5331 = -1;
            return true;
        } else if (class343.field5331 == 6) {
            int var175 = class247.field3898.method226(arg0 ^ 0x3FFF);
            int var176 = class247.field3898.method237(arg0 ^ 0x7C);
            class55.method352(false, var175, var176);
            class343.field5331 = -1;
            return true;
        } else if (class343.field5331 == 20) {
            long var177 = class247.field3898.method276((byte) -6);
            int var179 = class247.field3898.method271(21081);
            boolean var180 = false;
            byte var181 = class247.field3898.method246((byte) -116);
            if ((var177 & Long.MIN_VALUE) != 0L) {
                var180 = true;
            }
            if (var180) {
                if (class84.field1175 == 0) {
                    class343.field5331 = -1;
                    return true;
                }
                long var187 = var177 & Long.MAX_VALUE;
                boolean var189 = false;
                int var190;
                for (var190 = 0; class84.field1175 > var190 && (class340.field5291[var190].field2744 != var187 || class340.field5291[var190].field4879 != var179); var190++) {
                }
                if (class84.field1175 > var190) {
                    while (var190 < (class84.field1175 - 1)) {
                        class340.field5291[var190] = class340.field5291[var190 + 1];
                        var190++;
                    }
                    class84.field1175--;
                    class340.field5291[class84.field1175] = null;
                }
            } else {
                String var182 = class247.field3898.method265(0);
                class315 var183 = new class315();
                var183.field2744 = var177;
                var183.field4876 = class33.method179(37, var183.field2744);
                var183.field4871 = var182;
                var183.field4879 = var179;
                var183.field4875 = var181;
                int var184;
                for (var184 = class84.field1175 - 1; var184 >= 0; var184--) {
                    int var185 = class340.field5291[var184].field4876.compareTo(var183.field4876);
                    if (var185 == 0) {
                        class340.field5291[var184].field4879 = var179;
                        class340.field5291[var184].field4875 = var181;
                        class340.field5291[var184].field4871 = var182;
                        class32.field436 = class186.field3074;
                        class343.field5331 = -1;
                        if (class99.field1451 == var177) {
                            class155.field2383 = var181;
                        }
                        return true;
                    }
                    if (var185 < 0) {
                        break;
                    }
                }
                if (class84.field1175 >= class340.field5291.length) {
                    class343.field5331 = -1;
                    return true;
                }
                for (int var186 = class84.field1175 - 1; var186 > var184; var186--) {
                    class340.field5291[var186 + 1] = class340.field5291[var186];
                }
                if (class84.field1175 == 0) {
                    class340.field5291 = new class315[100];
                }
                class340.field5291[var184 + 1] = var183;
                if (class99.field1451 == var177) {
                    class155.field2383 = var181;
                }
                class84.field1175++;
            }
            class32.field436 = class186.field3074;
            class343.field5331 = -1;
            return true;
        } else if (class343.field5331 == 188) {
            int var332 = class247.field3898.method282((byte) -97);
            int var333 = class247.field3898.method263(true);
            class55.method352(false, var332, var333);
            class343.field5331 = -1;
            return true;
        } else if (class343.field5331 == 1) {
            int var191 = class247.field3898.method282((byte) -97);
            int var192 = class247.field3898.method263(true);
            if (var191 == 65535) {
                var191 = -1;
            }
            class298.method2122(var192, var191, (byte) -94);
            class343.field5331 = -1;
            return true;
        } else if (class343.field5331 == 98) {
            int var329 = class247.field3898.method282((byte) -97);
            if (var329 == 65535) {
                var329 = -1;
            }
            int var330 = class247.field3898.method248(true);
            int var331 = class247.field3898.method256((byte) -90);
            class106.method722(var329, var330, (byte) -127, var331);
            class343.field5331 = -1;
            return true;
        } else if (class343.field5331 == 192) {
            int var193 = class247.field3898.method267((byte) -66);
            int var194 = class247.field3898.method280(arg0 + 256);
            int var195 = class247.field3898.method269((byte) -78);
            int var196 = class247.field3898.method268(true);
            if (class273.method1977(var193, (byte) -109)) {
                class20.method108(var194, var195, var196, -3169);
            }
            class343.field5331 = -1;
            return true;
        } else if (class343.field5331 == 180) {
            int var326 = class247.field3898.method271(21081);
            int var327 = class247.field3898.method280(255);
            int var328 = class247.field3898.method282((byte) -97);
            if (var328 == 65535) {
                var328 = -1;
            }
            if (class273.method1977(var326, (byte) -71)) {
                class317.method2231(126, 1, -1, var328, var327);
            }
            class343.field5331 = -1;
            return true;
        } else if (class343.field5331 == 126) {
            class42.method214(arg0 ^ 0x68);
            class343.field5331 = -1;
            return false;
        } else if (class343.field5331 == 119) {
            int var323 = class247.field3898.method267((byte) -57);
            String var324 = class247.field3898.method265(~arg0);
            int var325 = class247.field3898.method227((byte) 86);
            if (class273.method1977(var323, (byte) -79)) {
                class277.method2005(var325, var324, 122);
            }
            class343.field5331 = -1;
            return true;
        } else if (class343.field5331 == 47) {
            class197.method1445(class247.field3898, class219.field3540, 0, class14.field159);
            class343.field5331 = -1;
            return true;
        } else if (class343.field5331 == 177) {
            int var197 = class247.field3898.method267((byte) -75);
            int var198 = class247.field3898.method226(-16384);
            int var199 = class247.field3898.method248(true);
            if (class273.method1977(var197, (byte) -102)) {
                if (var199 == 2) {
                    class184.method1383(2);
                }
                class147.field2287 = var198;
                class84.method574(var198, 128);
                class150.method1092(false, -1264641594);
                class100.method693((byte) 78, class147.field2287);
                for (int var200 = 0; var200 < 100; var200++) {
                    class174.field2884[var200] = true;
                }
            }
            class343.field5331 = -1;
            return true;
        } else if (class343.field5331 == 92) {
            long var320 = class247.field3898.method276((byte) 119);
            String var322 = class251.method1791(class173.method1304(1, class51.method334(32767, class247.field3898)));
            class155.method1109(var322, 6, class13.method74(17, var320), (byte) -47);
            class343.field5331 = -1;
            return true;
        } else if (class343.field5331 == 163) {
            int var201 = class247.field3898.method238((byte) 82);
            int var202 = class247.field3898.method226(-16384);
            int var203 = class247.field3898.method221((byte) -78);
            if (class273.method1977(var202, (byte) -48)) {
                class225.method1597(var203, var201, -30037);
            }
            class343.field5331 = -1;
            return true;
        } else if (class343.field5331 == 147) {
            int var204 = class247.field3898.method226(-16384);
            String var205 = class247.field3898.method265(0);
            int var206 = class247.field3898.method226(-16384);
            if (class273.method1977(var204, (byte) -88)) {
                class111.method765(var206, -107, var205);
            }
            class343.field5331 = -1;
            return true;
        } else if (class343.field5331 == 49) {
            int var317 = class247.field3898.method226(arg0 - 16383);
            int var318 = class247.field3898.method238((byte) 82);
            int var319 = class247.field3898.method229(-23206);
            if (class273.method1977(var317, (byte) -11)) {
                class287.method2063(var318, var319, (byte) -63);
            }
            class343.field5331 = -1;
            return true;
        } else if (class343.field5331 == 81) {
            class344.method2389(arg0 ^ 0x367D);
            int var207 = class247.field3898.method286((byte) -88);
            int var208 = class247.field3898.method263(true);
            int var209 = class247.field3898.method237(arg0 ^ 0x73);
            class182.field3005[var208] = var209;
            class99.field1441[var208] = var207;
            class319.field4959[var208] = 1;
            for (int var210 = 0; var210 < 98; var210++) {
                if (class285.field4563[var210] <= var209) {
                    class319.field4959[var208] = var210 + 2;
                }
            }
            class53.field755[client.method767(31, class29.field389++)] = var208;
            class343.field5331 = -1;
            return true;
        } else if (class343.field5331 == 230) {
            class344.method2389(-13950);
            class263.field4231 = class247.field3898.method286((byte) -65);
            class201.field3266 = class186.field3074;
            class343.field5331 = -1;
            return true;
        } else if (class343.field5331 == 21) {
            class327.method2293(~arg0);
            class343.field5331 = -1;
            return true;
        } else if (class343.field5331 == 241) {
            class144.method1067((byte) -89, class247.field3898.method265(0));
            class343.field5331 = -1;
            return true;
        } else if (class343.field5331 == 62) {
            int var313 = class247.field3898.method280(255);
            int var314 = class247.field3898.method271(arg0 ^ 0xFFFFADA6);
            int var315 = class247.field3898.method226(-16384);
            int var316 = class247.field3898.method226(-16384);
            if (class273.method1977(var315, (byte) -87)) {
                class130.method949(var313, (byte) 77, (var316 << 16) + var314);
            }
            class343.field5331 = -1;
            return true;
        } else if (class343.field5331 == 75) {
            int var312 = class247.field3898.method237(-116);
            class322.field4983 = class14.field159.method893(var312, -47);
            class343.field5331 = -1;
            return true;
        } else if (class343.field5331 == 117) {
            class45.method292(true, (byte) 4);
            class343.field5331 = -1;
            return true;
        } else if (class343.field5331 == 84) {
            class25.method140(~arg0);
            class344.method2389(-13950);
            class343.field5331 = -1;
            class281.field4528 += 32;
            return true;
        } else if (class343.field5331 == 162) {
            int var211 = class247.field3898.method227((byte) 124);
            int var212 = class247.field3898.method282((byte) -97);
            class31.method170(var212, var211, arg0 ^ 0x71);
            class343.field5331 = -1;
            return true;
        } else if (class343.field5331 == 66) {
            for (int var310 = 0; var310 < class74.field1049.length; var310++) {
                if (class74.field1049[var310] != null) {
                    class74.field1049[var310].field4268 = -1;
                }
            }
            for (int var311 = 0; var311 < class99.field1445.length; var311++) {
                if (class99.field1445[var311] != null) {
                    class99.field1445[var311].field4268 = -1;
                }
            }
            class343.field5331 = -1;
            return true;
        } else if (class343.field5331 == 52) {
            int var213 = class247.field3898.method271(21081);
            int var214 = class247.field3898.method238((byte) 82);
            if (class273.method1977(var213, (byte) -87)) {
                class90 var215 = (class90) class243.field3842.method451((long) var214, (byte) 100);
                if (var215 != null) {
                    class58.method374(var215, true, (byte) 103);
                }
                if (class52.field740 != null) {
                    class320.method2252(class52.field740, 0);
                    class52.field740 = null;
                }
            }
            class343.field5331 = -1;
            return true;
        } else if (class343.field5331 == 35) {
            int var216 = class247.field3898.method226(arg0 - 16383);
            int var217 = class247.field3898.method282((byte) -97);
            int var218 = class247.field3898.method226(-16384);
            int var219 = class247.field3898.method280(255);
            if ((var219 >> 30) != 0) {
                int var244 = var219 >> 28 & 0x3;
                int var245 = ((var219 & 0xFFFF9A1) >> 14) - class70.field989;
                int var246 = (var219 & 0x3FFF) - class205.field3367;
                if (var245 >= 0 && var246 >= 0 && var245 < 104 && var246 < 104) {
                    int var247 = var246 * 128 + 64;
                    int var248 = var245 * 128 + 64;
                    class81 var249 = new class81(var216, var244, var248, var247, class123.method889(1, var244, var248, var247) - var217, var218, class240.field3818);
                    class45.field639.method1232(arg0 ^ 0xFFFFFFA6, new class54(var249));
                }
            } else if (var219 >> 29 != 0) {
                int var220 = var219 & 0xFFFF;
                class234 var221 = class99.field1445[var220];
                if (var221 != null) {
                    if (var216 == 65535) {
                        var216 = -1;
                    }
                    boolean var222 = true;
                    if (var216 != -1 && var221.field4278 != -1) {
                        if (var221.field4278 == var216) {
                            class323 var227 = class215.method1545(var216, arg0 + 2);
                            if (var227.field5008 && var227.field5011 != -1) {
                                class202 var228 = class325.method2274(var227.field5011, -109);
                                int var229 = var228.field3291;
                                if (var229 == 1) {
                                    var221.field4267 = 1;
                                    var221.field4226 = 0;
                                    var222 = false;
                                    var221.field4236 = class240.field3818 + var218;
                                    var221.field4276 = 0;
                                    var221.field4211 = 0;
                                    class190.method1411(arg0 + 32, false, var228, var221.field4264, var221.field4276, var221.field4255);
                                } else if (var229 == 2) {
                                    var221.field4250 = 0;
                                    var222 = false;
                                }
                            }
                        } else {
                            class323 var223 = class215.method1545(var216, arg0 + 2);
                            class323 var224 = class215.method1545(var221.field4278, 1);
                            if (var223.field5011 != -1 && var224.field5011 != -1) {
                                class202 var225 = class325.method2274(var223.field5011, -95);
                                class202 var226 = class325.method2274(var224.field5011, arg0 ^ 0x57);
                                if (var225.field3279 < var226.field3279) {
                                    var222 = false;
                                }
                            }
                        }
                    }
                    if (var222) {
                        var221.field4278 = var216;
                        var221.field4236 = class240.field3818 + var218;
                        var221.field4206 = var217;
                        var221.field4211 = 0;
                        var221.field4276 = 0;
                        var221.field4267 = 1;
                        if (class240.field3818 < var221.field4236) {
                            var221.field4276 = -1;
                        }
                        if (var221.field4278 != -1 && class240.field3818 == var221.field4236) {
                            int var230 = class215.method1545(var221.field4278, 1).field5011;
                            if (var230 != -1) {
                                class202 var231 = class325.method2274(var230, -65);
                                if (var231 != null && var231.field3293 != null) {
                                    class190.method1411(31, false, var231, var221.field4264, 0, var221.field4255);
                                }
                            }
                        }
                    }
                }
            } else if ((var219 >> 28) != 0) {
                int var232 = var219 & 0xFFFF;
                class334 var233;
                if (class234.field3758 == var232) {
                    var233 = class191.field3129;
                } else {
                    var233 = class74.field1049[var232];
                }
                if (var233 != null) {
                    if (var216 == 65535) {
                        var216 = -1;
                    }
                    boolean var234 = true;
                    if (var216 != -1 && var233.field4278 != -1) {
                        if (var233.field4278 == var216) {
                            class323 var239 = class215.method1545(var216, arg0 + 2);
                            if (var239.field5008 && var239.field5011 != -1) {
                                class202 var240 = class325.method2274(var239.field5011, -112);
                                int var241 = var240.field3291;
                                if (var241 == 1) {
                                    var233.field4267 = 1;
                                    var234 = false;
                                    var233.field4236 = class240.field3818 + var218;
                                    var233.field4226 = 0;
                                    var233.field4211 = 0;
                                    var233.field4276 = 0;
                                    class190.method1411(31, false, var240, var233.field4264, var233.field4276, var233.field4255);
                                } else if (var241 == 2) {
                                    var233.field4250 = 0;
                                    var234 = false;
                                }
                            }
                        } else {
                            class323 var235 = class215.method1545(var216, 1);
                            class323 var236 = class215.method1545(var233.field4278, 1);
                            if (var235.field5011 != -1 && var236.field5011 != -1) {
                                class202 var237 = class325.method2274(var235.field5011, -59);
                                class202 var238 = class325.method2274(var236.field5011, arg0 ^ 0x56);
                                if (var237.field3279 < var238.field3279) {
                                    var234 = false;
                                }
                            }
                        }
                    }
                    if (var234) {
                        var233.field4278 = var216;
                        var233.field4211 = 0;
                        if (var233.field4278 == 65535) {
                            var233.field4278 = -1;
                        }
                        var233.field4206 = var217;
                        var233.field4276 = 0;
                        var233.field4267 = 1;
                        var233.field4236 = class240.field3818 + var218;
                        if (var233.field4236 > class240.field3818) {
                            var233.field4276 = -1;
                        }
                        if (var233.field4278 != -1 && class240.field3818 == var233.field4236) {
                            int var242 = class215.method1545(var233.field4278, 1).field5011;
                            if (var242 != -1) {
                                class202 var243 = class325.method2274(var242, -91);
                                if (var243 != null && var243.field3293 != null) {
                                    class190.method1411(31, class191.field3129 == var233, var243, var233.field4264, 0, var233.field4255);
                                }
                            }
                        }
                    }
                }
            }
            class343.field5331 = -1;
            return true;
        } else if (class343.field5331 == 24) {
            long var295 = class247.field3898.method276((byte) -70);
            class247.field3898.method246((byte) -31);
            long var297 = class247.field3898.method276((byte) -96);
            long var299 = (long) class247.field3898.method271(21081);
            long var301 = (long) class247.field3898.method273(-867673064);
            int var303 = class247.field3898.method286((byte) -123);
            long var304 = (var299 << 32) + var301;
            boolean var306 = false;
            int var307 = 0;
            label1638: while (true) {
                if (var307 >= 100) {
                    if (var303 <= 1) {
                        if ((!class178.field2963 || class320.field4962) && !class102.field1487) {
                            for (int var308 = 0; var308 < class207.field3412; var308++) {
                                if (class54.field769[var308] == var295) {
                                    var306 = true;
                                    break label1638;
                                }
                            }
                        } else {
                            var306 = true;
                        }
                    }
                    break;
                }
                if (class65.field945[var307] == var304) {
                    var306 = true;
                    break;
                }
                var307++;
            }
            if (!var306 && class186.field3079 == 0) {
                class65.field945[class268.field4318] = var304;
                class268.field4318 = (class268.field4318 + 1) % 100;
                String var309 = class251.method1791(class173.method1304(1, class51.method334(arg0 + 32768, class247.field3898)));
                if (var303 == 2 || var303 == 3) {
                    class138.method1021(class13.method74(49, var297), "<img=1>" + class13.method74(-128, var295), var309, 9, arg0 - 118);
                } else if (var303 == 1) {
                    class138.method1021(class13.method74(110, var297), "<img=0>" + class13.method74(arg0 ^ 0xF, var295), var309, 9, arg0 ^ 0xFFFFFFA8);
                } else {
                    class138.method1021(class13.method74(40, var297), class13.method74(86, var295), var309, 9, arg0 + 84);
                }
            }
            class343.field5331 = -1;
            return true;
        } else if (class343.field5331 == 240) {
            int var291 = class247.field3898.method221((byte) -78);
            int var292 = class247.field3898.method226(arg0 - 16383);
            int var293 = class247.field3898.method267((byte) -52);
            class234 var294 = class99.field1445[var292];
            if (var294 != null) {
                class70.method463(var291, var293, var294, false);
            }
            class343.field5331 = -1;
            return true;
        } else if (class343.field5331 == 31) {
            long var278 = class247.field3898.method276((byte) -57);
            long var280 = (long) class247.field3898.method271(arg0 ^ 0xFFFFADA6);
            long var282 = (long) class247.field3898.method273(-867673064);
            long var284 = (var280 << 32) + var282;
            int var286 = class247.field3898.method286((byte) -76);
            boolean var287 = false;
            int var288 = 0;
            label1555: while (true) {
                if (var288 < 100) {
                    if (class65.field945[var288] != var284) {
                        var288++;
                        continue;
                    }
                    var287 = true;
                    break;
                }
                if (var286 <= 1) {
                    if ((!class178.field2963 || class320.field4962) && !class102.field1487) {
                        for (int var289 = 0; var289 < class207.field3412; var289++) {
                            if (class54.field769[var289] == var278) {
                                var287 = true;
                                break label1555;
                            }
                        }
                    } else {
                        var287 = true;
                    }
                }
                break;
            }
            if (!var287 && class186.field3079 == 0) {
                class65.field945[class268.field4318] = var284;
                class268.field4318 = (class268.field4318 + 1) % 100;
                String var290 = class251.method1791(class173.method1304(arg0 ^ 0xFFFFFFFE, class51.method334(32767, class247.field3898)));
                if (var286 == 2 || var286 == 3) {
                    class155.method1109(var290, 7, "<img=1>" + class13.method74(97, var278), (byte) -47);
                } else if (var286 == 1) {
                    class155.method1109(var290, 7, "<img=0>" + class13.method74(arg0 - 117, var278), (byte) -47);
                } else {
                    class155.method1109(var290, 3, class13.method74(arg0 + 63, var278), (byte) -47);
                }
            }
            class343.field5331 = -1;
            return true;
        } else if (class343.field5331 == 204) {
            int var250 = class247.field3898.method221((byte) -78);
            int var251 = class247.field3898.method226(-16384);
            String var252 = class247.field3898.method265(0);
            int var253 = class247.field3898.method248(true);
            if (var251 == 65535) {
                var251 = -1;
            }
            if (var250 >= 1 && var250 <= 8) {
                if (var252.equalsIgnoreCase("null")) {
                    var252 = null;
                }
                class319.field4954[var250 - 1] = var252;
                class159.field2637[var250 - 1] = var251;
                class147.field2286[var250 - 1] = var253 == 0;
            }
            class343.field5331 = -1;
            return true;
        } else if (class343.field5331 == 166) {
            class130.field2060 = class247.field3898.method248(true);
            class49.field696 = class247.field3898.method286((byte) -88);
            for (int var275 = class130.field2060; var275 < (class130.field2060 + 8); var275++) {
                for (int var276 = class49.field696; var276 < (class49.field696 + 8); var276++) {
                    if (class108.field1593[class49.field698][var275][var276] != null) {
                        class108.field1593[class49.field698][var275][var276] = null;
                        class240.method1723(1610612736, var276, var275);
                    }
                }
            }
            for (class327 var277 = (class327) class273.field4399.method1240(3); var277 != null; var277 = (class327) class273.field4399.method1235(false)) {
                if (class130.field2060 <= var277.field5060 && var277.field5060 < class130.field2060 + 8 && var277.field5046 >= class49.field696 && var277.field5046 < (class49.field696 + 8) && class49.field698 == var277.field5051) {
                    var277.field5062 = 0;
                }
            }
            class343.field5331 = -1;
            return true;
        } else if (class343.field5331 == 255) {
            int var254 = class247.field3898.method271(21081);
            int var255 = class247.field3898.method286((byte) -96);
            int var256 = class247.field3898.method286((byte) -101);
            int var257 = class247.field3898.method286((byte) -76);
            int var258 = class247.field3898.method286((byte) -116);
            int var259 = class247.field3898.method271(21081);
            if (class273.method1977(var254, (byte) -76)) {
                class204.field3335[var255] = true;
                class11.field140[var255] = var256;
                class327.field5050[var255] = var257;
                class127.field1985[var255] = var258;
                class270.field4357[var255] = var259;
            }
            class343.field5331 = -1;
            return true;
        } else if (class343.field5331 == 85) {
            int var260 = class247.field3898.method271(21081);
            if (class273.method1977(var260, (byte) -104)) {
                class24.method132((byte) -43);
            }
            class343.field5331 = -1;
            return true;
        } else if (class343.field5331 == 228) {
            int var269 = class247.field3898.method238((byte) 82);
            int var270 = class247.field3898.method271(21081);
            if (var269 < -70000) {
                var270 += 32768;
            }
            class157 var271;
            if (var269 >= 0) {
                var271 = class142.method1053(var269, arg0 + 65536);
            } else {
                var271 = null;
            }
            while (class247.field3898.field586 < class219.field3540) {
                int var272 = 0;
                int var273 = class247.field3898.method281(arg0 ^ 0x79);
                int var274 = class247.field3898.method271(21081);
                if (var274 != 0) {
                    var272 = class247.field3898.method286((byte) -81);
                    if (var272 == 255) {
                        var272 = class247.field3898.method238((byte) 82);
                    }
                }
                if (var271 != null && var273 >= 0 && var271.field2483.length > var273) {
                    var271.field2483[var273] = var274;
                    var271.field2542[var273] = var272;
                }
                class138.method1022(var272, var273, var270, var274 - 1, (byte) 48);
            }
            if (var271 != null) {
                class320.method2252(var271, 0);
            }
            class344.method2389(-13950);
            class243.field3849[client.method767(class324.field5031++, 31)] = client.method767(var270, 32767);
            class343.field5331 = -1;
            return true;
        } else if (class343.field5331 == 9) {
            class130.field2060 = class247.field3898.method221((byte) -78);
            class49.field696 = class247.field3898.method286((byte) -116);
            while (class219.field3540 > class247.field3898.field586) {
                class343.field5331 = class247.field3898.method286((byte) -123);
                class48.method304(-89852956);
            }
            class343.field5331 = -1;
            return true;
        } else if (class343.field5331 == 248) {
            int var264 = class247.field3898.method267((byte) -101);
            int var265 = class247.field3898.method267((byte) -112);
            int var266 = class247.field3898.method267((byte) -51);
            int var267 = class247.field3898.method271(21081);
            int var268 = class247.field3898.method280(255);
            if (class273.method1977(var264, (byte) -108)) {
                class317.method2231(126, 7, var266, var265 | var267 << 16, var268);
            }
            class343.field5331 = -1;
            return true;
        } else if (class343.field5331 == 245) {
            int var261 = class247.field3898.method282((byte) -97);
            int var262 = class247.field3898.method237(-113);
            if (var261 == 65535) {
                var261 = -1;
            }
            int var263 = class247.field3898.method282((byte) -97);
            if (class273.method1977(var263, (byte) -122)) {
                class317.method2231(124, 2, -1, var261, var262);
            }
            class343.field5331 = -1;
            return true;
        } else {
            class26.method152((Throwable) null, "T1 - " + class343.field5331 + "," + class268.field4325 + "," + class101.field1470 + " - " + class219.field3540, -116);
            class42.method214(-105);
            return true;
        }
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(IIIIIFFF)V", line = 3128)
    public class62(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field905 = (int) (arg6 * 4096.0F);
        this.field893 = (int) (arg7 * 4096.0F);
        this.field896 = this.field902 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }
}
