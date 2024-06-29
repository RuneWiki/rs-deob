import java.awt.Image;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class70 {

    @OriginalMember(owner = "client!c", name = "j", descriptor = "Lu;")
    private class34 field1285 = new class34();

    @OriginalMember(owner = "client!c", name = "i", descriptor = "Lc;")
    public static class70 field1284 = new class70();

    @OriginalMember(owner = "client!c", name = "m", descriptor = "Lke;")
    private static class256 field1288 = class316.method2202("Walk here", 27626);

    @OriginalMember(owner = "client!c", name = "k", descriptor = "I")
    public static int field1286 = -1;

    @OriginalMember(owner = "client!c", name = "l", descriptor = "Lke;")
    public static class256 field1287 = field1288;

    @OriginalMember(owner = "client!c", name = "q", descriptor = "I")
    public static int field1292 = 127;

    @OriginalMember(owner = "client!c", name = "o", descriptor = "Lke;")
    private static class256 field1290 = class316.method2202("scroll:", 27626);

    @OriginalMember(owner = "client!c", name = "r", descriptor = "Lke;")
    public static class256 field1293 = field1290;

    @OriginalMember(owner = "client!c", name = "p", descriptor = "Lke;")
    public static class256 field1291 = field1290;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "I")
    public static int field1276;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "I")
    public static int field1277;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!c", name = "d", descriptor = "I")
    public static int field1279;

    @OriginalMember(owner = "client!c", name = "e", descriptor = "I")
    public static int field1280;

    @OriginalMember(owner = "client!c", name = "f", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!c", name = "g", descriptor = "I")
    public static int field1282;

    @OriginalMember(owner = "client!c", name = "h", descriptor = "I")
    public static int field1283;

    @OriginalMember(owner = "client!c", name = "s", descriptor = "Lu;")
    private class34 field1294;

    @OriginalMember(owner = "client!c", name = "n", descriptor = "Ljava/awt/Image;")
    public static Image field1289;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V", line = 4)
    public final void method531(int arg0) {
        if (arg0 != -1) {
            this.field1294 = (class34) null;
        }
        field1281++;
        while (true) {
            class34 var2 = this.field1285.field529;
            if (this.field1285 == var2) {
                this.field1294 = null;
                return;
            }
            var2.method235(-109);
        }
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(I)Lra;", line = 29)
    public static final class41 method532(int arg0) {
        field1282++;
        class41 var1 = new class41(34);
        var1.method308(11, arg0 ^ 0x1);
        var1.method308(class106.field1895, arg0 ^ 0x1);
        var1.method308(class257.field4455 ? 1 : 0, -2);
        var1.method308(class85.field1537 ? 1 : 0, -2);
        var1.method308(class65.field1167 ? 1 : 0, -2);
        var1.method308(class236.field4032 ? 1 : 0, arg0 ^ 0x1);
        var1.method308(class95.field1695 ? 1 : 0, arg0 ^ 0x1);
        var1.method308(class115.field2026 ? 1 : 0, -2);
        var1.method308(class11.field165 ? 1 : 0, arg0 - 1);
        var1.method308(class181.field3216 ? 1 : 0, arg0 + arg0);
        var1.method308(class17.field241, -2);
        var1.method308(class193.field3531 ? 1 : 0, -2);
        var1.method308(class281.field4880 ? 1 : 0, arg0 ^ 0x1);
        var1.method308(class74.field1373 ? 1 : 0, arg0 ^ 0x1);
        var1.method308(class274.field4743, -2);
        var1.method308(class171.field3050 ? 1 : 0, -2);
        var1.method308(class29.field422, arg0 - 1);
        var1.method308(class38.field694, -2);
        var1.method308(field1292, arg0 - 1);
        var1.method366(class141.field2479, -109);
        var1.method366(class145.field2566, -119);
        var1.method308(class283.method1978(), -2);
        var1.method365((byte) -32, class236.field4024);
        var1.method308(class237.field4037, -2);
        var1.method308(class137.field2392 ? 1 : 0, -2);
        var1.method308(class154.field2746 ? 1 : 0, -2);
        var1.method308(class163.field2882, -2);
        var1.method308(class30.field450 ? 1 : 0, -2);
        var1.method308(class31.field505 ? 1 : 0, arg0 - 1);
        return var1;
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(I)V", line = 70)
    public static void method533(int arg0) {
        field1290 = null;
        field1291 = null;
        field1287 = null;
        field1288 = null;
        if (arg0 != -1) {
            method532(-100);
        }
        field1289 = null;
        field1284 = null;
        field1293 = null;
    }

    @OriginalMember(owner = "client!c", name = "d", descriptor = "(I)Lu;", line = 97)
    public final class34 method534(int arg0) {
        field1279++;
        class34 var2 = this.field1285.field529;
        if (this.field1285 == var2) {
            this.field1294 = null;
            return null;
        } else if (arg0 <= 91) {
            return (class34) null;
        } else {
            this.field1294 = var2.field529;
            return var2;
        }
    }

    @OriginalMember(owner = "client!c", name = "e", descriptor = "(I)I", line = 116)
    public final int method535(int arg0) {
        field1276++;
        int var2 = arg0;
        class34 var3 = this.field1285.field529;
        while (this.field1285 != var3) {
            var3 = var3.field529;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(B)Lu;", line = 138)
    public final class34 method536(byte arg0) {
        field1280++;
        class34 var2 = this.field1294;
        if (arg0 >= -10) {
            this.field1294 = (class34) null;
        }
        if (this.field1285 == var2) {
            this.field1294 = null;
            return null;
        } else {
            this.field1294 = var2.field529;
            return var2;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lu;I)V", line = 173)
    public final void method537(class34 arg0, int arg1) {
        field1277++;
        if (arg0.field543 != null) {
            arg0.method235(90);
        }
        arg0.field543 = this.field1285.field543;
        if (arg1 == -1) {
            arg0.field529 = this.field1285;
            arg0.field543.field529 = arg0;
            arg0.field529.field543 = arg0;
        }
    }

    @OriginalMember(owner = "client!c", name = "f", descriptor = "(I)Lu;", line = 193)
    public final class34 method538(int arg0) {
        field1283++;
        int var2 = 112 % ((19 - arg0) / 62);
        class34 var3 = this.field1285.field529;
        if (this.field1285 == var3) {
            return null;
        } else {
            var3.method235(50);
            return var3;
        }
    }

    @OriginalMember(owner = "client!c", name = "g", descriptor = "(I)Z", line = 211)
    public static final boolean method539(int arg0) throws IOException {
        field1278++;
        if (class196.field3586 == null) {
            return false;
        }
        int var1 = class196.field3586.method1633((byte) -5);
        if (var1 == 0) {
            return false;
        }
        if (class9.field141 == -1) {
            class196.field3586.method1635(0, class23.field302.field772, 1, -1078);
            var1--;
            class23.field302.field738 = 0;
            class9.field141 = class23.field302.method1596(255);
            class290.field5027 = class200.field3647[class9.field141];
        }
        if (class290.field5027 == -1) {
            if (var1 <= 0) {
                return false;
            }
            class196.field3586.method1635(0, class23.field302.field772, 1, arg0 ^ 0x476);
            class290.field5027 = class23.field302.field772[0] & 0xFF;
            var1--;
        }
        if (class290.field5027 == -2) {
            if (var1 <= 1) {
                return false;
            }
            var1 -= 2;
            class196.field3586.method1635(0, class23.field302.field772, 2, -1078);
            class23.field302.field738 = 0;
            class290.field5027 = class23.field302.method346(-16);
        }
        if (class290.field5027 > var1) {
            return false;
        }
        class23.field302.field738 = 0;
        class196.field3586.method1635(0, class23.field302.field772, class290.field5027, -1078);
        class167.field2954 = class231.field3966;
        class231.field3966 = class260.field4496;
        class64.field1135 = 0;
        class260.field4496 = class9.field141;
        if (class9.field141 == 165) {
            class288.method2008((byte) -48, true);
            class9.field141 = -1;
            return true;
        } else if (class9.field141 == 107) {
            for (int var2 = 0; var2 < class97.field1741.length; var2++) {
                if (class97.field1741[var2] != class201.field3658[var2]) {
                    class97.field1741[var2] = class201.field3658[var2];
                    class300.method2098(101, var2);
                    class165.field2930[class150.method1123(class249.field4235++, 31)] = var2;
                }
            }
            class9.field141 = -1;
            return true;
        } else if (class9.field141 == 10) {
            int var3 = class23.field302.method357(false);
            if (class23.field302.method357(false) == 0) {
                class229.field3931[var3] = new class150();
            } else {
                class23.field302.field738--;
                class229.field3931[var3] = new class150(class23.field302);
            }
            class182.field3222 = class35.field549;
            class9.field141 = -1;
            return true;
        } else if (class9.field141 == 241) {
            int var351 = class23.field302.method314(true);
            int var352 = class23.field302.method346(-16);
            int var353 = class23.field302.method336(255);
            if (class274.method1898((byte) 54, var351)) {
                if (var353 == 2) {
                    class267.method1852((byte) 119);
                }
                class211.field3803 = var352;
                class5.method40(-11122, var352);
                class159.method1177(false, -1);
                class269.method1859(class211.field3803, (byte) 105);
                for (int var354 = 0; var354 < 100; var354++) {
                    class53.field974[var354] = true;
                }
            }
            class9.field141 = -1;
            return true;
        } else if (class9.field141 == 244) {
            long var4 = class23.field302.method344((byte) -20);
            class23.field302.method323(arg0 ^ 0xFFFFDC38);
            boolean var6 = false;
            long var7 = class23.field302.method344((byte) -64);
            long var9 = (long) class23.field302.method346(-16);
            long var11 = (long) class23.field302.method349((byte) -126);
            int var13 = class23.field302.method357(false);
            long var14 = (var9 << 32) + var11;
            int var16 = 0;
            label1185: while (true) {
                if (var16 < 100) {
                    if (class48.field869[var16] != var14) {
                        var16++;
                        continue;
                    }
                    var6 = true;
                    break;
                }
                if (var13 <= 1) {
                    if ((!class36.field649 || class316.field5454) && !class154.field2759) {
                        for (int var17 = 0; var17 < class129.field2263; var17++) {
                            if (class62.field1090[var17] == var4) {
                                var6 = true;
                                break label1185;
                            }
                        }
                    } else {
                        var6 = true;
                    }
                }
                break;
            }
            if (!var6 && class130.field2276 == 0) {
                class48.field869[class280.field4871] = var14;
                class280.field4871 = (class280.field4871 + 1) % 100;
                class256 var18 = class293.method2047(class86.method631(class23.field302, 73).method1805(true));
                if (var13 == 2 || var13 == 3) {
                    class102.method735(class290.method2018(7130, var7).method1761(88), var18, 9, class30.method214(new class256[] { class286.field4958, class290.method2018(7130, var4).method1761(-108) }, 29784), false);
                } else if (var13 == 1) {
                    class102.method735(class290.method2018(7130, var7).method1761(-79), var18, 9, class30.method214(new class256[] { class23.field313, class290.method2018(7130, var4).method1761(96) }, arg0 + 29852), false);
                } else {
                    class102.method735(class290.method2018(7130, var7).method1761(49), var18, 9, class290.method2018(arg0 + 7198, var4).method1761(2), false);
                }
            }
            class9.field141 = -1;
            return true;
        } else if (class9.field141 == 69) {
            class119.method809(class23.field302, (byte) 93);
            class9.field141 = -1;
            return true;
        } else if (class9.field141 == 31 || class9.field141 == 145 || class9.field141 == 136 || class9.field141 == 84 || class9.field141 == 131 || class9.field141 == 59 || class9.field141 == 94 || class9.field141 == 97 || class9.field141 == 76 || class9.field141 == 139 || class9.field141 == 111 || class9.field141 == 253) {
            class313.method2168(1444607457);
            class9.field141 = -1;
            return true;
        } else if (class9.field141 == 222) {
            if (class290.field5027 == 0) {
                class177.field3138 = field1287;
            } else {
                class177.field3138 = class23.field302.method313((byte) 54);
            }
            class9.field141 = -1;
            return true;
        } else if (class9.field141 == 104) {
            int var19 = class23.field302.method310((byte) -71);
            int var20 = class23.field302.method363(-240439704);
            if (class274.method1898((byte) -126, var19)) {
                int var21 = 0;
                if (class121.field2124.field2552 != null) {
                    var21 = class121.field2124.field2552.method388((byte) 126);
                }
                class318.method2209(3, var20, var21, -96);
            }
            class9.field141 = -1;
            return true;
        } else if (class9.field141 == 167) {
            class166.field2946 = class23.field302.method357(false);
            class9.field141 = -1;
            class7.field113 = class35.field549;
            return true;
        } else if (class9.field141 == 1) {
            long var335 = class23.field302.method344((byte) -26);
            class23.field302.method323(9092);
            long var337 = class23.field302.method344((byte) -13);
            long var339 = (long) class23.field302.method346(-16);
            long var341 = (long) class23.field302.method349((byte) 52);
            int var343 = class23.field302.method357(false);
            int var344 = class23.field302.method346(-16);
            long var345 = (var339 << 32) + var341;
            boolean var347 = false;
            int var348 = 0;
            label1584: while (true) {
                if (var348 < 100) {
                    if (class48.field869[var348] != var345) {
                        var348++;
                        continue;
                    }
                    var347 = true;
                    break;
                }
                if (var343 <= 1) {
                    for (int var349 = 0; var349 < class129.field2263; var349++) {
                        if (class62.field1090[var349] == var335) {
                            var347 = true;
                            break label1584;
                        }
                    }
                }
                break;
            }
            if (!var347 && class130.field2276 == 0) {
                class48.field869[class280.field4871] = var345;
                class280.field4871 = (class280.field4871 + 1) % 100;
                class256 var350 = class66.method507(var344, 536870911).method108(arg0 + 67, class23.field302);
                if (var343 == 2 || var343 == 3) {
                    class28.method206(20, class290.method2018(arg0 ^ 0xFFFFE466, var337).method1761(-124), class30.method214(new class256[] { class286.field4958, class290.method2018(arg0 ^ 0xFFFFE466, var335).method1761(-119) }, 29784), var344, (byte) -84, var350);
                } else if (var343 == 1) {
                    class28.method206(20, class290.method2018(arg0 ^ 0xFFFFE466, var337).method1761(-116), class30.method214(new class256[] { class23.field313, class290.method2018(arg0 + 7198, var335).method1761(-89) }, 29784), var344, (byte) -84, var350);
                } else {
                    class28.method206(20, class290.method2018(7130, var337).method1761(88), class290.method2018(7130, var335).method1761(-87), var344, (byte) -84, var350);
                }
            }
            class9.field141 = -1;
            return true;
        } else if (arg0 != -68) {
            return true;
        } else if (class9.field141 == 102) {
            long var321 = class23.field302.method344((byte) -2);
            int var323 = class23.field302.method346(arg0 ^ 0x4C);
            byte var324 = class23.field302.method323(arg0 ^ 0xFFFFDC38);
            boolean var325 = false;
            if ((Long.MIN_VALUE & var321) != 0L) {
                var325 = true;
            }
            if (var325) {
                if (class206.field3733 == 0) {
                    class9.field141 = -1;
                    return true;
                }
                long var326 = var321 & Long.MAX_VALUE;
                boolean var328 = false;
                int var329;
                for (var329 = 0; var329 < class206.field3733 && (class284.field4914[var329].field2895 != var326 || class284.field4914[var329].field3245 != var323); var329++) {
                }
                if (class206.field3733 > var329) {
                    while ((class206.field3733 - 1) > var329) {
                        class284.field4914[var329] = class284.field4914[var329 + 1];
                        var329++;
                    }
                    class206.field3733--;
                    class284.field4914[class206.field3733] = null;
                }
            } else {
                class256 var330 = class23.field302.method313((byte) 54);
                class183 var331 = new class183();
                var331.field2895 = var321;
                var331.field3246 = class290.method2018(7130, var331.field2895);
                var331.field3239 = var330;
                var331.field3245 = var323;
                var331.field3249 = var324;
                int var332;
                for (var332 = class206.field3733 - 1; var332 >= 0; var332--) {
                    int var333 = class284.field4914[var332].field3246.method1772((byte) 109, var331.field3246);
                    if (var333 == 0) {
                        class284.field4914[var332].field3245 = var323;
                        class284.field4914[var332].field3249 = var324;
                        class284.field4914[var332].field3239 = var330;
                        class179.field3155 = class35.field549;
                        class9.field141 = -1;
                        if (class62.field1103 == var321) {
                            class246.field4181 = var324;
                        }
                        return true;
                    }
                    if (var333 < 0) {
                        break;
                    }
                }
                if (class206.field3733 >= class284.field4914.length) {
                    class9.field141 = -1;
                    return true;
                }
                for (int var334 = class206.field3733 - 1; var334 > var332; var334--) {
                    class284.field4914[var334 + 1] = class284.field4914[var334];
                }
                if (class206.field3733 == 0) {
                    class284.field4914 = new class183[100];
                }
                class284.field4914[var332 + 1] = var331;
                class206.field3733++;
                if (class62.field1103 == var321) {
                    class246.field4181 = var324;
                }
            }
            class9.field141 = -1;
            class179.field3155 = class35.field549;
            return true;
        } else if (class9.field141 == 197) {
            long var22 = class23.field302.method344((byte) -51);
            long var24 = (long) class23.field302.method346(-16);
            long var26 = (long) class23.field302.method349((byte) -110);
            int var28 = class23.field302.method357(false);
            long var29 = (var24 << 32) + var26;
            boolean var31 = false;
            int var32 = class23.field302.method346(-16);
            int var33 = 0;
            label1201: while (true) {
                if (var33 >= 100) {
                    if (var28 <= 1) {
                        for (int var34 = 0; var34 < class129.field2263; var34++) {
                            if (class62.field1090[var34] == var22) {
                                var31 = true;
                                break label1201;
                            }
                        }
                    }
                    break;
                }
                if (class48.field869[var33] == var29) {
                    var31 = true;
                    break;
                }
                var33++;
            }
            if (!var31 && class130.field2276 == 0) {
                class48.field869[class280.field4871] = var29;
                class280.field4871 = (class280.field4871 + 1) % 100;
                class256 var35 = class66.method507(var32, 536870911).method108(arg0 + 67, class23.field302);
                if (var28 == 2) {
                    class28.method206(18, (class256) null, class30.method214(new class256[] { class286.field4958, class290.method2018(7130, var22).method1761(-84) }, 29784), var32, (byte) -84, var35);
                } else if (var28 == 1) {
                    class28.method206(18, (class256) null, class30.method214(new class256[] { class23.field313, class290.method2018(arg0 ^ 0xFFFFE466, var22).method1761(arg0 ^ 0x32) }, arg0 + 29852), var32, (byte) -84, var35);
                } else {
                    class28.method206(18, (class256) null, class290.method2018(7130, var22).method1761(arg0 ^ 0x28), var32, (byte) -84, var35);
                }
            }
            class9.field141 = -1;
            return true;
        } else if (class9.field141 == 134) {
            class135.method964(-926);
            class9.field141 = -1;
            return true;
        } else if (class9.field141 == 155) {
            class179.field3155 = class35.field549;
            long var36 = class23.field302.method344((byte) 120);
            if (var36 == 0L) {
                class8.field130 = null;
                class206.field3733 = 0;
                class216.field3841 = null;
                class9.field141 = -1;
                class284.field4914 = null;
                return true;
            }
            long var38 = class23.field302.method344((byte) -78);
            class216.field3841 = class290.method2018(arg0 + 7198, var38);
            class8.field130 = class290.method2018(7130, var36);
            class51.field936 = class23.field302.method323(9092);
            int var40 = class23.field302.method357(false);
            if (var40 == 255) {
                class9.field141 = -1;
                return true;
            }
            class183[] var41 = new class183[100];
            class206.field3733 = var40;
            for (int var42 = 0; var42 < class206.field3733; var42++) {
                var41[var42] = new class183();
                var41[var42].field2895 = class23.field302.method344((byte) 116);
                var41[var42].field3246 = class290.method2018(7130, var41[var42].field2895);
                var41[var42].field3245 = class23.field302.method346(arg0 ^ 0x4C);
                var41[var42].field3249 = class23.field302.method323(9092);
                var41[var42].field3239 = class23.field302.method313((byte) 54);
                if (class62.field1103 == var41[var42].field2895) {
                    class246.field4181 = var41[var42].field3249;
                }
            }
            boolean var43 = false;
            int var44 = class206.field3733;
            while (var44 > 0) {
                var44--;
                boolean var45 = true;
                for (int var46 = 0; var46 < var44; var46++) {
                    if (var41[var46].field3246.method1772((byte) 120, var41[var46 + 1].field3246) > 0) {
                        class183 var47 = var41[var46];
                        var45 = false;
                        var41[var46] = var41[var46 + 1];
                        var41[var46 + 1] = var47;
                    }
                }
                if (var45) {
                    break;
                }
            }
            class9.field141 = -1;
            class284.field4914 = var41;
            return true;
        } else if (class9.field141 == 70) {
            int var301 = class23.field302.method310((byte) -93);
            int var302 = class23.field302.method331(0);
            int var303 = class23.field302.method310((byte) -96);
            int var304 = class23.field302.method314(true);
            if ((var302 >> 30) != 0) {
                int var305 = ((var302 & 0xFFFE369) >> 14) - class134.field2336;
                int var306 = (var302 & 0x3C9A47F5) >> 28;
                int var307 = (var302 & 0x3FFF) - class10.field147;
                if (var305 >= 0 && var307 >= 0 && var305 < 104 && var307 < 104) {
                    int var308 = var307 * 128 + 64;
                    int var309 = var305 * 128 + 64;
                    class23 var310 = new class23(var301, var306, var309, var308, class297.method2080(var309, 101, var306, var308) - var304, var303, class45.field840);
                    class57.field1038.method1269(false, new class166(var310));
                }
            } else if ((var302 >> 29) != 0) {
                int var316 = var302 & 0xFFFF;
                class279 var317 = class187.field3281[var316];
                if (var317 != null) {
                    boolean var318 = true;
                    if (var301 == 65535) {
                        var301 = -1;
                    }
                    if (var301 != -1 && var317.field1253 != -1 && class250.method1682(class302.method2113(true, var301).field3688, true).field2048 < class250.method1682(class302.method2113(true, var317.field1253).field3688, true).field2048) {
                        var318 = false;
                    }
                    if (var318) {
                        var317.field1224 = 0;
                        var317.field1185 = class45.field840 + var303;
                        var317.field1253 = var301;
                        var317.field1201 = 0;
                        if (class45.field840 < var317.field1185) {
                            var317.field1201 = -1;
                        }
                        var317.field1221 = var304;
                        if (var317.field1253 != -1 && class45.field840 == var317.field1185) {
                            int var319 = class302.method2113(true, var317.field1253).field3688;
                            if (var319 != -1) {
                                class117 var320 = class250.method1682(var319, true);
                                if (var320 != null && var320.field2040 != null) {
                                    class49.method391(var317.field1192, false, var317.field1197, 0, var320, arg0 ^ 0x2B79);
                                }
                            }
                        }
                    }
                }
            } else if ((var302 >> 28) != 0) {
                int var311 = var302 & 0xFFFF;
                class144 var312;
                if (class104.field1852 == var311) {
                    var312 = class121.field2124;
                } else {
                    var312 = class300.field5172[var311];
                }
                if (var312 != null) {
                    if (var301 == 65535) {
                        var301 = -1;
                    }
                    boolean var313 = true;
                    if (var301 != -1 && var312.field1253 != -1 && class250.method1682(class302.method2113(true, var301).field3688, true).field2048 < class250.method1682(class302.method2113(true, var312.field1253).field3688, true).field2048) {
                        var313 = false;
                    }
                    if (var313) {
                        var312.field1253 = var301;
                        var312.field1185 = class45.field840 + var303;
                        var312.field1221 = var304;
                        var312.field1224 = 0;
                        if (var312.field1253 == 65535) {
                            var312.field1253 = -1;
                        }
                        var312.field1201 = 0;
                        if (var312.field1185 > class45.field840) {
                            var312.field1201 = -1;
                        }
                        if (var312.field1253 != -1 && class45.field840 == var312.field1185) {
                            int var314 = class302.method2113(true, var312.field1253).field3688;
                            if (var314 != -1) {
                                class117 var315 = class250.method1682(var314, true);
                                if (var315 != null && var315.field2040 != null) {
                                    class49.method391(var312.field1192, class121.field2124 == var312, var312.field1197, 0, var315, arg0 ^ 0x2B79);
                                }
                            }
                        }
                    }
                }
            }
            class9.field141 = -1;
            return true;
        } else if (class9.field141 == 185) {
            class15.field194 = class23.field302.method314(true) * 30;
            class9.field141 = -1;
            class163.field2884 = class35.field549;
            return true;
        } else if (class9.field141 == 142) {
            int var48 = class23.field302.method346(-16);
            class256 var49 = class23.field302.method313((byte) 54);
            Object[] var50 = new Object[var49.method1799(arg0 ^ 0xFFFFFFC3) + 1];
            for (int var51 = var49.method1799(127) - 1; var51 >= 0; var51--) {
                if (var49.method1786(-751, var51) == 115) {
                    var50[var51 + 1] = class23.field302.method313((byte) 54);
                } else {
                    var50[var51 + 1] = Integer.valueOf(class23.field302.method327(4));
                }
            }
            var50[0] = Integer.valueOf(class23.field302.method327(4));
            if (class274.method1898((byte) -125, var48)) {
                class119 var52 = new class119();
                var52.field2114 = var50;
                class91.method678((byte) -126, var52);
            }
            class9.field141 = -1;
            return true;
        } else if (class9.field141 == 161) {
            int var53 = class23.field302.method363(-240439704);
            int var54 = class23.field302.method310((byte) -69);
            class10.method63(var54, var53, true);
            class9.field141 = -1;
            return true;
        } else if (class9.field141 == 175) {
            int var55 = class23.field302.method362((byte) 47);
            class114.method786(var55, true);
            class93.field1679[class150.method1123(class292.field5052++, 31)] = class150.method1123(32767, var55);
            class9.field141 = -1;
            return true;
        } else if (class9.field141 == 254) {
            class9.field141 = -1;
            class241.field4102 = 0;
            return true;
        } else if (class9.field141 == 216) {
            int var56 = class23.field302.method352((byte) -67);
            int var57 = class23.field302.method346(-16);
            int var58 = class23.field302.method346(-16);
            if (var58 == 65535) {
                var58 = -1;
            }
            if (class274.method1898((byte) 27, var57)) {
                class318.method2209(1, var56, var58, 127);
            }
            class9.field141 = -1;
            return true;
        } else if (class9.field141 == 160) {
            int var59 = class23.field302.method314(true);
            int var60 = class23.field302.method363(-240439704);
            int var61 = class23.field302.method310((byte) 113);
            if (class274.method1898((byte) 111, var61)) {
                class282.method1975(var59, 1, var60);
            }
            class9.field141 = -1;
            return true;
        } else if (class9.field141 == 173) {
            class257.method1814(8460);
            class9.field141 = -1;
            return true;
        } else if (class9.field141 == 143) {
            int var299 = class23.field302.method314(true);
            int var300 = class23.field302.method332(255);
            class115.method790(var300, var299, -24376);
            class9.field141 = -1;
            return true;
        } else if (class9.field141 == 19) {
            int var294 = class23.field302.method327(4);
            int var295 = class23.field302.method362((byte) 47);
            int var296 = class23.field302.method357(false);
            int var297 = class23.field302.method362((byte) 47);
            if (class274.method1898((byte) 88, var295)) {
                class316 var298 = (class316) class62.field1098.method1744((byte) 125, (long) var294);
                if (var298 != null) {
                    class287.method2006(var298, var298.field5453 != var297, 30656);
                }
                class90.method672(var296, var297, var294, 29238);
            }
            class9.field141 = -1;
            return true;
        } else if (class9.field141 == 125) {
            int var291 = class23.field302.method310((byte) 114);
            class256 var292 = class23.field302.method313((byte) 54);
            int var293 = class23.field302.method362((byte) 47);
            if (class274.method1898((byte) -127, var293)) {
                class64.method497(var291, var292, 2);
            }
            class9.field141 = -1;
            return true;
        } else if (class9.field141 == 182) {
            int var286 = class23.field302.method357(false);
            int var287 = class23.field302.method357(false);
            int var288 = class23.field302.method346(-16);
            int var289 = class23.field302.method357(false);
            int var290 = class23.field302.method357(false);
            class206.method1460(var289, var286, arg0 ^ 0xFFFFFFCD, var290, var288, var287);
            class9.field141 = -1;
            return true;
        } else if (class9.field141 == 36) {
            class305.field5278 = class23.field302.method357(false);
            class41.field797 = class23.field302.method357(false);
            for (int var283 = class41.field797; var283 < class41.field797 + 8; var283++) {
                for (int var284 = class305.field5278; var284 < (class305.field5278 + 8); var284++) {
                    if (class230.field3934[class255.field4377][var283][var284] != null) {
                        class230.field3934[class255.field4377][var283][var284] = null;
                        class236.method1587((byte) 120, var283, var284);
                    }
                }
            }
            for (class32 var285 = (class32) class124.field2196.method1270((byte) -121); var285 != null; var285 = (class32) class124.field2196.method1277(1)) {
                if (class41.field797 <= var285.field525 && var285.field525 < class41.field797 + 8 && class305.field5278 <= var285.field514 && var285.field514 < (class305.field5278 + 8) && class255.field4377 == var285.field526) {
                    var285.field512 = 0;
                }
            }
            class9.field141 = -1;
            return true;
        } else if (class9.field141 == 149) {
            int var280 = class23.field302.method362((byte) 47);
            int var281 = class23.field302.method352((byte) -67);
            int var282 = class23.field302.method310((byte) -94);
            if (class274.method1898((byte) 46, var282)) {
                class292.method2030(var280, -47, var281);
            }
            class9.field141 = -1;
            return true;
        } else if (class9.field141 == 35) {
            int var277 = class23.field302.method327(arg0 ^ 0xFFFFFFB8);
            int var278 = class23.field302.method346(-16);
            int var279 = class23.field302.method336(255);
            if (class274.method1898((byte) -125, var278)) {
                class142.method1038(var279, false, var277);
            }
            class9.field141 = -1;
            return true;
        } else if (class9.field141 == 101) {
            class208.method1470((byte) -113);
            class270.field4616 = class23.field302.method309(2);
            class163.field2884 = class35.field549;
            class9.field141 = -1;
            return true;
        } else if (class9.field141 == 72) {
            int var62 = class23.field302.method327(4);
            int var63 = class23.field302.method346(-16);
            class188 var64;
            if (var62 < 0) {
                var64 = null;
            } else {
                var64 = class182.method1335((byte) 90, var62);
            }
            if (var62 < -70000) {
                var63 += 32768;
            }
            if (var64 != null) {
                for (int var65 = 0; var65 < var64.field3347.length; var65++) {
                    var64.field3347[var65] = 0;
                    var64.field3351[var65] = 0;
                }
            }
            class142.method1039(var63, false);
            int var66 = class23.field302.method346(arg0 ^ 0x4C);
            for (int var67 = 0; var67 < var66; var67++) {
                int var68 = class23.field302.method315(-43);
                if (var68 == 255) {
                    var68 = class23.field302.method331(0);
                }
                int var69 = class23.field302.method314(true);
                if (var64 != null && var67 < var64.field3347.length) {
                    var64.field3347[var67] = var69;
                    var64.field3351[var67] = var68;
                }
                class105.method745(var68, -79, var63, var69 - 1, var67);
            }
            if (var64 != null) {
                class64.method500(var64, (byte) -117);
            }
            class208.method1470((byte) -28);
            class93.field1679[class150.method1123(class292.field5052++, 31)] = class150.method1123(32767, var63);
            class9.field141 = -1;
            return true;
        } else if (class9.field141 == 140) {
            int var275 = class23.field302.method346(-16);
            int var276 = class23.field302.method346(arg0 + 52);
            class114.field2014 = var275;
            class289.field5001 = var276;
            if (class192.field3510 == 2) {
                class180.field3192 = class114.field2014;
                class210.field3784 = class289.field5001;
            }
            class37.method276(arg0 ^ 0x43);
            class9.field141 = -1;
            return true;
        } else if (class9.field141 == 67) {
            int var70 = class23.field302.method362((byte) 47);
            int var71 = class23.field302.method362((byte) 47);
            int var72 = class23.field302.method352((byte) -67);
            if (class274.method1898((byte) 114, var70)) {
                class97.method698(-100, var71, var72);
            }
            class9.field141 = -1;
            return true;
        } else if (class9.field141 == 38) {
            class321.field5495 = class23.field302.method357(false);
            class9.field141 = -1;
            return true;
        } else if (class9.field141 == 141) {
            class256 var73 = class23.field302.method313((byte) 54);
            if (var73.method1789(class223.field3906, (byte) 120)) {
                boolean var109 = false;
                class256 var110 = var73.method1777(var73.method1779(class260.field4498, (byte) -116), 25163, 0);
                long var111 = var110.method1780(true);
                for (int var113 = 0; var113 < class129.field2263; var113++) {
                    if (class62.field1090[var113] == var111) {
                        var109 = true;
                        break;
                    }
                }
                if (!var109 && class130.field2276 == 0) {
                    class274.method1895(4, 22156, var110, class203.field3685);
                }
            } else if (var73.method1789(class246.field4194, (byte) 120)) {
                boolean var74 = false;
                class256 var75 = var73.method1777(var73.method1779(class260.field4498, (byte) -116), 25163, 0);
                long var76 = var75.method1780(true);
                for (int var78 = 0; var78 < class129.field2263; var78++) {
                    if (class62.field1090[var78] == var76) {
                        var74 = true;
                        break;
                    }
                }
                if (!var74 && class130.field2276 == 0) {
                    class256 var79 = var73.method1777(var73.method1799(127) - 9, 25163, var73.method1779(class260.field4498, (byte) -116) + 1);
                    class274.method1895(8, arg0 + 22224, var75, var79);
                }
            } else if (var73.method1789(class214.field3818, (byte) 120)) {
                class256 var80 = var73.method1777(var73.method1779(class260.field4498, (byte) -116), 25163, 0);
                long var81 = var80.method1780(true);
                boolean var83 = false;
                for (int var84 = 0; var84 < class129.field2263; var84++) {
                    if (class62.field1090[var84] == var81) {
                        var83 = true;
                        break;
                    }
                }
                if (!var83 && class130.field2276 == 0) {
                    class274.method1895(10, arg0 + 22224, var80, class46.field844);
                }
            } else if (var73.method1789(class83.field1514, (byte) 120)) {
                class256 var108 = var73.method1777(var73.method1779(class83.field1514, (byte) -116), arg0 ^ 0xFFFF9DF7, 0);
                class274.method1895(11, 22156, class46.field844, var108);
            } else if (var73.method1789(class301.field5188, (byte) 120)) {
                class256 var107 = var73.method1777(var73.method1779(class301.field5188, (byte) -116), arg0 ^ 0xFFFF9DF7, 0);
                if (class130.field2276 == 0) {
                    class274.method1895(12, 22156, class46.field844, var107);
                }
            } else if (var73.method1789(class215.field3837, (byte) 120)) {
                class256 var85 = var73.method1777(var73.method1779(class215.field3837, (byte) -116), 25163, 0);
                if (class130.field2276 == 0) {
                    class274.method1895(13, arg0 ^ 0xFFFFA930, class46.field844, var85);
                }
            } else if (var73.method1789(class287.field4970, (byte) 120)) {
                boolean var86 = false;
                class256 var87 = var73.method1777(var73.method1779(class260.field4498, (byte) -116), 25163, 0);
                long var88 = var87.method1780(true);
                for (int var90 = 0; var90 < class129.field2263; var90++) {
                    if (class62.field1090[var90] == var88) {
                        var86 = true;
                        break;
                    }
                }
                if (!var86 && class130.field2276 == 0) {
                    class274.method1895(14, 22156, var87, class46.field844);
                }
            } else if (var73.method1789(class197.field3608, (byte) 120)) {
                class256 var102 = var73.method1777(var73.method1779(class260.field4498, (byte) -116), 25163, 0);
                long var103 = var102.method1780(true);
                boolean var105 = false;
                for (int var106 = 0; var106 < class129.field2263; var106++) {
                    if (class62.field1090[var106] == var103) {
                        var105 = true;
                        break;
                    }
                }
                if (!var105 && class130.field2276 == 0) {
                    class274.method1895(15, 22156, var102, class46.field844);
                }
            } else if (var73.method1789(class239.field4080, (byte) 120)) {
                class256 var91 = var73.method1777(var73.method1779(class260.field4498, (byte) -116), 25163, 0);
                long var92 = var91.method1780(true);
                boolean var94 = false;
                for (int var95 = 0; var95 < class129.field2263; var95++) {
                    if (class62.field1090[var95] == var92) {
                        var94 = true;
                        break;
                    }
                }
                if (!var94 && class130.field2276 == 0) {
                    class274.method1895(16, 22156, var91, class46.field844);
                }
            } else if (var73.method1789(class197.field3598, (byte) 120)) {
                class256 var96 = var73.method1777(var73.method1779(class260.field4498, (byte) -116), arg0 + 25231, 0);
                long var97 = var96.method1780(true);
                boolean var99 = false;
                for (int var100 = 0; var100 < class129.field2263; var100++) {
                    if (class62.field1090[var100] == var97) {
                        var99 = true;
                        break;
                    }
                }
                if (!var99 && class130.field2276 == 0) {
                    class256 var101 = var73.method1777(var73.method1799(127) - 9, 25163, var73.method1779(class260.field4498, (byte) -116) + 1);
                    class274.method1895(21, 22156, var96, var101);
                }
            } else {
                class274.method1895(0, 22156, class46.field844, var73);
            }
            class9.field141 = -1;
            return true;
        } else if (class9.field141 == 3) {
            for (int var273 = 0; var273 < class300.field5172.length; var273++) {
                if (class300.field5172[var273] != null) {
                    class300.field5172[var273].field1202 = -1;
                }
            }
            for (int var274 = 0; var274 < class187.field3281.length; var274++) {
                if (class187.field3281[var274] != null) {
                    class187.field3281[var274].field1202 = -1;
                }
            }
            class9.field141 = -1;
            return true;
        } else if (class9.field141 == 109) {
            int var264 = class23.field302.method314(true);
            if (var264 == 65535) {
                var264 = -1;
            }
            int var265 = class23.field302.method363(-240439704);
            int var266 = class23.field302.method363(-240439704);
            int var267 = class23.field302.method310((byte) -29);
            int var268 = class23.field302.method362((byte) 47);
            if (var267 == 65535) {
                var267 = -1;
            }
            if (class274.method1898((byte) 36, var268)) {
                for (int var269 = var264; var269 <= var267; var269++) {
                    long var270 = ((long) var265 << 32) + (long) var269;
                    class163 var272 = class36.field643.method1744((byte) 126, var270);
                    if (var272 != null) {
                        var272.method1199(21966);
                    }
                    class36.field643.method1749(true, new class6(var266), var270);
                }
            }
            class9.field141 = -1;
            return true;
        } else if (class9.field141 == 52) {
            int var114 = class23.field302.method346(-16);
            if (var114 == 65535) {
                var114 = -1;
            }
            int var115 = class23.field302.method357(false);
            int var116 = class23.field302.method346(-16);
            class9.method61(var114, var116, var115, -93);
            class9.field141 = -1;
            return true;
        } else if (class9.field141 == 221) {
            int var117 = class23.field302.method362((byte) 47);
            int var118 = class23.field302.method346(-16);
            class256 var119 = class23.field302.method313((byte) 54);
            if (class274.method1898((byte) 13, var118)) {
                class64.method497(var117, var119, 2);
            }
            class9.field141 = -1;
            return true;
        } else if (class9.field141 == 60) {
            int var259 = class23.field302.method357(false);
            int var260 = class23.field302.method357(false);
            int var261 = class23.field302.method357(false);
            int var262 = class23.field302.method357(false);
            int var263 = class23.field302.method346(-16);
            class63.field1107[var259] = true;
            class117.field2059[var259] = var260;
            class162.field2874[var259] = var261;
            class52.field956[var259] = var262;
            class121.field2130[var259] = var263;
            class9.field141 = -1;
            return true;
        } else if (class9.field141 == 43) {
            long var120 = class23.field302.method344((byte) 127);
            long var122 = (long) class23.field302.method346(-16);
            long var124 = (long) class23.field302.method349((byte) -104);
            long var126 = (var122 << 32) + var124;
            int var128 = class23.field302.method357(false);
            boolean var129 = false;
            int var130 = 0;
            label1325: while (true) {
                if (var130 < 100) {
                    if (class48.field869[var130] != var126) {
                        var130++;
                        continue;
                    }
                    var129 = true;
                    break;
                }
                if (var128 <= 1) {
                    if ((!class36.field649 || class316.field5454) && !class154.field2759) {
                        for (int var131 = 0; var131 < class129.field2263; var131++) {
                            if (class62.field1090[var131] == var120) {
                                var129 = true;
                                break label1325;
                            }
                        }
                    } else {
                        var129 = true;
                    }
                }
                break;
            }
            if (!var129 && class130.field2276 == 0) {
                class48.field869[class280.field4871] = var126;
                class280.field4871 = (class280.field4871 + 1) % 100;
                class256 var132 = class293.method2047(class86.method631(class23.field302, 113).method1805(true));
                if (var128 == 2 || var128 == 3) {
                    class274.method1895(7, 22156, class30.method214(new class256[] { class286.field4958, class290.method2018(arg0 ^ 0xFFFFE466, var120).method1761(54) }, 29784), var132);
                } else if (var128 == 1) {
                    class274.method1895(7, 22156, class30.method214(new class256[] { class23.field313, class290.method2018(arg0 + 7198, var120).method1761(104) }, 29784), var132);
                } else {
                    class274.method1895(3, arg0 + 22224, class290.method2018(7130, var120).method1761(arg0 ^ 0xFFFFFFBC), var132);
                }
            }
            class9.field141 = -1;
            return true;
        } else if (class9.field141 == 44) {
            int var258 = class23.field302.method327(4);
            class288.field4980 = class272.field4658.method22(var258, 43);
            class9.field141 = -1;
            return true;
        } else if (class9.field141 == 121) {
            int var251 = class23.field302.method327(arg0 + 72);
            int var252 = class23.field302.method331(0);
            int var253 = class23.field302.method346(-16);
            if (class274.method1898((byte) -128, var253)) {
                class316 var254 = (class316) class62.field1098.method1744((byte) 124, (long) var251);
                class316 var255 = (class316) class62.field1098.method1744((byte) 126, (long) var252);
                if (var255 != null) {
                    class287.method2006(var255, var254 == null || var254.field5453 != var255.field5453, arg0 + 30724);
                }
                if (var254 != null) {
                    var254.method1199(21966);
                    class62.field1098.method1749(true, var254, (long) var252);
                }
                class188 var256 = class182.method1335((byte) 116, var251);
                if (var256 != null) {
                    class64.method500(var256, (byte) -117);
                }
                class188 var257 = class182.method1335((byte) 113, var252);
                if (var257 != null) {
                    class64.method500(var257, (byte) -117);
                    class90.method675(true, var257, -1);
                }
                if (class211.field3803 != -1) {
                    class281.method1965(class211.field3803, 24561, 1);
                }
            }
            class9.field141 = -1;
            return true;
        } else if (class9.field141 == 193) {
            long var133 = class23.field302.method344((byte) 120);
            int var135 = class23.field302.method346(-16);
            class256 var136 = class66.method507(var135, arg0 + 536870979).method108(-1, class23.field302);
            class28.method206(19, (class256) null, class290.method2018(7130, var133).method1761(arg0 - 60), var135, (byte) -84, var136);
            class9.field141 = -1;
            return true;
        } else if (class9.field141 == 239) {
            int var137 = class23.field302.method310((byte) -40);
            byte var138 = class23.field302.method323(9092);
            class10.method63(var137, var138, true);
            class9.field141 = -1;
            return true;
        } else if (class9.field141 == 100) {
            class288.method2008((byte) -73, false);
            class9.field141 = -1;
            return true;
        } else if (class9.field141 == 183) {
            int var248 = class23.field302.method346(arg0 + 52);
            int var249 = class23.field302.method327(4);
            if (class274.method1898((byte) 61, var248)) {
                class316 var250 = (class316) class62.field1098.method1744((byte) 127, (long) var249);
                if (var250 != null) {
                    class287.method2006(var250, true, 30656);
                }
                if (class278.field4815 != null) {
                    class64.method500(class278.field4815, (byte) -117);
                    class278.field4815 = null;
                }
            }
            class9.field141 = -1;
            return true;
        } else if (class9.field141 == 27) {
            if (class317.field5460 != null) {
                class248.method1671(-1, false, class237.field4037, -1, true);
            }
            byte[] var139 = new byte[class290.field5027];
            class23.field302.method1601(25705, class290.field5027, 0, var139);
            class256 var140 = class49.method392(var139, (byte) 100, 0, class290.field5027);
            if (class198.field3627 == null && class4.field66 == 3 || !class4.field70.startsWith("win") || class66.field1176) {
                class85.method624(true, var140, (byte) 39);
            } else {
                class31.field509 = var140;
                class83.field1515 = true;
                class24.field317 = class272.field4658.method37((byte) 8, new String(var140.method1778((byte) -48), "ISO-8859-1"));
            }
            class9.field141 = -1;
            return true;
        } else if (class9.field141 == 195) {
            class256 var245 = class23.field302.method313((byte) 54);
            int var246 = class23.field302.method314(true);
            int var247 = class23.field302.method327(arg0 + 72);
            if (class274.method1898((byte) -126, var246)) {
                class64.method498(var247, var245, -6);
            }
            class9.field141 = -1;
            return true;
        } else if (class9.field141 == 163) {
            int var141 = class23.field302.method310((byte) -108);
            int var142 = class23.field302.method331(0);
            class115.method790(var142, var141, -24376);
            class9.field141 = -1;
            return true;
        } else if (class9.field141 == 203) {
            int var143 = class23.field302.method362((byte) 47);
            if (var143 == 65535) {
                var143 = -1;
            }
            class294.method2065(var143, 22519);
            class9.field141 = -1;
            return true;
        } else if (class9.field141 == 211) {
            int var243 = class23.field302.method346(arg0 + 52);
            if (var243 == 65535) {
                var243 = -1;
            }
            int var244 = class23.field302.method349((byte) -113);
            class248.method1673(var244, var243, -1);
            class9.field141 = -1;
            return true;
        } else if (class9.field141 == 88) {
            int var237 = class23.field302.method327(4);
            int var238 = class23.field302.method346(-16);
            if (var237 < -70000) {
                var238 += 32768;
            }
            class188 var239;
            if (var237 < 0) {
                var239 = null;
            } else {
                var239 = class182.method1335((byte) 123, var237);
            }
            while (class23.field302.field738 < class290.field5027) {
                int var240 = class23.field302.method354((byte) -125);
                int var241 = class23.field302.method346(arg0 + 52);
                int var242 = 0;
                if (var241 != 0) {
                    var242 = class23.field302.method357(false);
                    if (var242 == 255) {
                        var242 = class23.field302.method327(arg0 ^ 0xFFFFFFB8);
                    }
                }
                if (var239 != null && var240 >= 0 && var239.field3347.length > var240) {
                    var239.field3347[var240] = var241;
                    var239.field3351[var240] = var242;
                }
                class105.method745(var242, -34, var238, var241 - 1, var240);
            }
            if (var239 != null) {
                class64.method500(var239, (byte) -117);
            }
            class208.method1470((byte) -122);
            class93.field1679[class150.method1123(31, class292.field5052++)] = class150.method1123(var238, 32767);
            class9.field141 = -1;
            return true;
        } else if (class9.field141 == 130) {
            class138.method1005(true);
            class9.field141 = -1;
            return true;
        } else if (class9.field141 == 135) {
            class241.method1615((byte) -24);
            class9.field141 = -1;
            return false;
        } else if (class9.field141 == 6) {
            long var144 = class23.field302.method344((byte) 120);
            int var146 = class23.field302.method346(-16);
            int var147 = class23.field302.method357(false);
            class256 var148 = class46.field844;
            boolean var149 = true;
            if (var144 < 0L) {
                var149 = false;
                var144 &= Long.MAX_VALUE;
            }
            if (var146 > 0) {
                var148 = class23.field302.method313((byte) 54);
            }
            class256 var150 = class290.method2018(arg0 ^ 0xFFFFE466, var144).method1761(33);
            for (int var151 = 0; var151 < class311.field5358; var151++) {
                if (class108.field1924[var151] == var144) {
                    if (class68.field1261[var151] != var146) {
                        class68.field1261[var151] = var146;
                        if (var146 > 0) {
                            class274.method1895(5, 22156, class46.field844, class30.method214(new class256[] { var150, class260.field4488 }, arg0 ^ 0xFFFF8BE4));
                        }
                        if (var146 == 0) {
                            class274.method1895(5, 22156, class46.field844, class30.method214(new class256[] { var150, class294.field5117 }, 29784));
                        }
                    }
                    class35.field565[var151] = var148;
                    class273.field4673[var151] = var147;
                    class53.field979[var151] = var149;
                    var150 = null;
                    break;
                }
            }
            if (var150 != null && class311.field5358 < 200) {
                class108.field1924[class311.field5358] = var144;
                class124.field2203[class311.field5358] = var150;
                class68.field1261[class311.field5358] = var146;
                class35.field565[class311.field5358] = var148;
                class273.field4673[class311.field5358] = var147;
                class53.field979[class311.field5358] = var149;
                class311.field5358++;
            }
            class7.field113 = class35.field549;
            boolean var152 = false;
            int var153 = class311.field5358;
            while (var153 > 0) {
                var153--;
                boolean var154 = true;
                for (int var155 = 0; var155 < var153; var155++) {
                    if (class68.field1261[var155] != class240.field4089 && class68.field1261[var155 + 1] == class240.field4089 || class68.field1261[var155] == 0 && class68.field1261[var155 + 1] != 0) {
                        var154 = false;
                        int var156 = class68.field1261[var155];
                        class68.field1261[var155] = class68.field1261[var155 + 1];
                        class68.field1261[var155 + 1] = var156;
                        class256 var157 = class35.field565[var155];
                        class35.field565[var155] = class35.field565[var155 + 1];
                        class35.field565[var155 + 1] = var157;
                        class256 var158 = class124.field2203[var155];
                        class124.field2203[var155] = class124.field2203[var155 + 1];
                        class124.field2203[var155 + 1] = var158;
                        long var159 = class108.field1924[var155];
                        class108.field1924[var155] = class108.field1924[var155 + 1];
                        class108.field1924[var155 + 1] = var159;
                        int var161 = class273.field4673[var155];
                        class273.field4673[var155] = class273.field4673[var155 + 1];
                        class273.field4673[var155 + 1] = var161;
                        boolean var162 = class53.field979[var155];
                        class53.field979[var155] = class53.field979[var155 + 1];
                        class53.field979[var155 + 1] = var162;
                    }
                }
                if (var154) {
                    break;
                }
            }
            class9.field141 = -1;
            return true;
        } else if (class9.field141 == 188) {
            int var163 = class23.field302.method336(255);
            int var164 = class23.field302.method315(-115);
            int var165 = class23.field302.method336(255);
            class255.field4377 = var163 >> 1;
            class121.field2124.method1058((var163 & 0x1) == 1, var165, (byte) -111, var164);
            class9.field141 = -1;
            return true;
        } else if (class9.field141 == 74) {
            class208.method1470((byte) -29);
            int var233 = class23.field302.method357(false);
            int var234 = class23.field302.method352((byte) -67);
            int var235 = class23.field302.method332(255);
            class30.field475[var235] = var234;
            class14.field188[var235] = var233;
            class17.field240[var235] = 1;
            for (int var236 = 0; var236 < 98; var236++) {
                if (class152.field2724[var236] <= var234) {
                    class17.field240[var235] = var236 + 2;
                }
            }
            class108.field1926[class150.method1123(class216.field3846++, 31)] = var235;
            class9.field141 = -1;
            return true;
        } else if (class9.field141 == 33) {
            int var166 = class23.field302.method362((byte) 47);
            int var167 = class23.field302.method327(arg0 ^ 0xFFFFFFB8);
            int var168 = class23.field302.method335(100);
            if (class274.method1898((byte) -125, var166)) {
                class270.method1868(-103, var168, var167);
            }
            class9.field141 = -1;
            return true;
        } else if (class9.field141 == 99) {
            int var169 = class23.field302.method332(255);
            int var170 = class23.field302.method362((byte) 47);
            int var171 = class23.field302.method314(true);
            class279 var172 = class187.field3281[var171];
            if (var172 != null) {
                class88.method652(-10140, var170, var172, var169);
            }
            class9.field141 = -1;
            return true;
        } else if (class9.field141 == 152) {
            int var228 = class23.field302.method362((byte) 47);
            int var229 = class23.field302.method314(true);
            int var230 = class23.field302.method362((byte) 47);
            int var231 = class23.field302.method352((byte) -67);
            int var232 = class23.field302.method314(true);
            if (class274.method1898((byte) -124, var228)) {
                class316.method2204(var230, var231, var229, var232, -119);
            }
            class9.field141 = -1;
            return true;
        } else if (class9.field141 == 81) {
            int var223 = class23.field302.method357(false);
            int var224 = class23.field302.method357(false);
            int var225 = class23.field302.method346(-16);
            int var226 = class23.field302.method357(false);
            int var227 = class23.field302.method357(false);
            class54.method432(var225, var226, arg0 ^ 0x43, true, var224, var223, var227);
            class9.field141 = -1;
            return true;
        } else if (class9.field141 == 51) {
            if (class211.field3803 != -1) {
                class281.method1965(class211.field3803, 24561, 0);
            }
            class9.field141 = -1;
            return true;
        } else if (class9.field141 == 228) {
            long var220 = class23.field302.method344((byte) -53);
            class256 var222 = class293.method2047(class86.method631(class23.field302, -120).method1805(true));
            class274.method1895(6, 22156, class290.method2018(7130, var220).method1761(-114), var222);
            class9.field141 = -1;
            return true;
        } else if (class9.field141 == 26) {
            int var173 = class23.field302.method346(-16);
            int var174 = class23.field302.method310((byte) -91);
            int var175 = class23.field302.method346(-16);
            int var176 = class23.field302.method363(-240439704);
            if (class274.method1898((byte) -123, var175)) {
                class205.method1454((var174 << 16) + var173, 13, var176);
            }
            class9.field141 = -1;
            return true;
        } else if (class9.field141 == 209) {
            class208.method1470((byte) -63);
            class121.field2128 = class23.field302.method357(false);
            class9.field141 = -1;
            class163.field2884 = class35.field549;
            return true;
        } else if (class9.field141 == 237) {
            class41.field797 = class23.field302.method315(-44);
            class305.field5278 = class23.field302.method357(false);
            while (class23.field302.field738 < class290.field5027) {
                class9.field141 = class23.field302.method357(false);
                class313.method2168(1444607457);
            }
            class9.field141 = -1;
            return true;
        } else if (class9.field141 == 78) {
            class305.field5278 = class23.field302.method357(false);
            class41.field797 = class23.field302.method315(-44);
            class9.field141 = -1;
            return true;
        } else if (class9.field141 == 20) {
            int var177 = class23.field302.method363(-240439704);
            class188 var178 = class182.method1335((byte) 89, var177);
            for (int var179 = 0; var179 < var178.field3347.length; var179++) {
                var178.field3347[var179] = -1;
                var178.field3347[var179] = 0;
            }
            class64.method500(var178, (byte) -117);
            class9.field141 = -1;
            return true;
        } else if (class9.field141 == 106) {
            class84.method623(class23.field302, class290.field5027, class272.field4658, true);
            class9.field141 = -1;
            return true;
        } else if (class9.field141 == 98) {
            class107.method755((byte) -127);
            class208.method1470((byte) -109);
            class249.field4235 += 32;
            class9.field141 = -1;
            return true;
        } else if (class9.field141 == 164) {
            int var180 = class23.field302.method310((byte) -110);
            if (var180 == 65535) {
                var180 = -1;
            }
            int var181 = class23.field302.method362((byte) 47);
            int var182 = class23.field302.method331(arg0 ^ 0xFFFFFFBC);
            if (class274.method1898((byte) -126, var181)) {
                class318.method2209(2, var182, var180, -119);
            }
            class9.field141 = -1;
            return true;
        } else if (class9.field141 == 110) {
            int var183 = class23.field302.method357(false);
            class96 var184 = new class96();
            int var185 = var183 >> 6;
            var184.field1733 = var183 & 0x3F;
            var184.field1725 = class23.field302.method357(false);
            if (var184.field1725 >= 0 && var184.field1725 < class39.field713.length) {
                if (var184.field1733 == 1 || var184.field1733 == 10) {
                    var184.field1720 = class23.field302.method346(-16);
                    class23.field302.field738 += 3;
                } else if (var184.field1733 >= 2 && var184.field1733 <= 6) {
                    if (var184.field1733 == 2) {
                        var184.field1715 = 64;
                        var184.field1708 = 64;
                    }
                    if (var184.field1733 == 3) {
                        var184.field1708 = 64;
                        var184.field1715 = 0;
                    }
                    if (var184.field1733 == 4) {
                        var184.field1708 = 64;
                        var184.field1715 = 128;
                    }
                    if (var184.field1733 == 5) {
                        var184.field1715 = 64;
                        var184.field1708 = 0;
                    }
                    if (var184.field1733 == 6) {
                        var184.field1715 = 64;
                        var184.field1708 = 128;
                    }
                    var184.field1733 = 2;
                    var184.field1709 = class23.field302.method346(arg0 ^ 0x4C);
                    var184.field1730 = class23.field302.method346(-16);
                    var184.field1723 = class23.field302.method357(false);
                }
                var184.field1705 = class23.field302.method346(-16);
                if (var184.field1705 == 65535) {
                    var184.field1705 = -1;
                }
                class38.field690[var185] = var184;
            }
            class9.field141 = -1;
            return true;
        } else if (class9.field141 == 171) {
            int var216 = class23.field302.method314(true);
            int var217 = class23.field302.method314(true);
            int var218 = class23.field302.method314(true);
            int var219 = class23.field302.method363(arg0 - 240439636);
            if (class274.method1898((byte) -128, var216)) {
                class318.method2209(7, var219, var217 << 16 | var218, arg0 + 22);
            }
            class9.field141 = -1;
            return true;
        } else if (class9.field141 == 230) {
            class267.field4556 = class23.field302.method357(false);
            class192.field3523 = class23.field302.method357(false);
            class114.field2009 = class23.field302.method357(false);
            class9.field141 = -1;
            return true;
        } else if (class9.field141 == 151) {
            int var186 = class23.field302.method357(false);
            int var187 = class23.field302.method314(true);
            if (var187 == 65535) {
                var187 = -1;
            }
            int var188 = class23.field302.method336(255);
            class256 var189 = class23.field302.method313((byte) 54);
            if (var186 >= 1 && var186 <= 8) {
                if (var189.method1769(class261.field4513, (byte) 121)) {
                    var189 = null;
                }
                class117.field2055[var186 - 1] = var189;
                class230.field3943[var186 - 1] = var187;
                class17.field242[var186 - 1] = var188 == 0;
            }
            class9.field141 = -1;
            return true;
        } else if (class9.field141 == 15) {
            int var190 = class23.field302.method327(4);
            int var191 = class23.field302.method314(true);
            int var192 = class23.field302.method346(arg0 ^ 0x4C);
            int var193 = class23.field302.method331(0);
            if (var192 == 65535) {
                var192 = -1;
            }
            if (class274.method1898((byte) 37, var191)) {
                class188 var194 = class182.method1335((byte) 87, var193);
                if (var194.field3396) {
                    class177.method1284(var193, var192, -49, var190);
                    class36 var195 = class254.method1753(var192, true);
                    class316.method2204(var195.field622, var193, var195.field626, var195.field597, 116);
                    class156.method1159(arg0 + 47, var195.field566, var193, var195.field607, var195.field575);
                } else if (var192 == -1) {
                    var194.field3434 = 0;
                    class9.field141 = -1;
                    return true;
                } else {
                    class36 var196 = class254.method1753(var192, true);
                    var194.field3353 = var196.field622;
                    var194.field3306 = var192;
                    var194.field3313 = var196.field597;
                    var194.field3434 = 4;
                    var194.field3450 = var196.field626 * 100 / var190;
                    class64.method500(var194, (byte) -117);
                }
            }
            class9.field141 = -1;
            return true;
        } else if (class9.field141 == 129) {
            int var212 = class23.field302.method309(2);
            int var213 = class23.field302.method362((byte) 47);
            int var214 = class23.field302.method341(arg0 ^ 0xFFFFFF43);
            int var215 = class23.field302.method331(0);
            if (class274.method1898((byte) 34, var213)) {
                class10.method66(var214, var215, var212, 11);
            }
            class9.field141 = -1;
            return true;
        } else if (class9.field141 == 186) {
            class316.method2203(class23.field302.method313((byte) 54), 126);
            class9.field141 = -1;
            return true;
        } else if (class9.field141 == 45) {
            int var209 = class23.field302.method346(arg0 ^ 0x4C);
            int var210 = class23.field302.method336(255);
            int var211 = class23.field302.method314(true);
            if (class274.method1898((byte) -127, var209)) {
                class282.method1975(var211, 1, var210);
            }
            class9.field141 = -1;
            return true;
        } else if (class9.field141 == 215) {
            class129.field2263 = class290.field5027 / 8;
            for (int var208 = 0; var208 < class129.field2263; var208++) {
                class62.field1090[var208] = class23.field302.method344((byte) 118);
                class22.field284[var208] = class290.method2018(7130, class62.field1090[var208]);
            }
            class9.field141 = -1;
            class7.field113 = class35.field549;
            return true;
        } else if (class9.field141 == 169) {
            int var197 = class23.field302.method363(arg0 ^ 0xE54D1D4);
            int var198 = (var197 & 0x31ABB9FD) >> 28;
            int var199 = var197 & 0x3FFF;
            int var200 = (var197 & 0xFFFC6B7) >> 14;
            int var201 = class23.field302.method362((byte) 47);
            if (var201 == 65535) {
                var201 = -1;
            }
            int var202 = class23.field302.method357(false);
            int var203 = var200 - class134.field2336;
            int var204 = var202 >> 2;
            int var205 = var202 & 0x3;
            int var206 = class200.field3642[var204];
            int var207 = var199 - class10.field147;
            class222.method1530(var206, var205, var201, arg0 + 11806, var204, var198, var203, var207);
            class9.field141 = -1;
            return true;
        } else {
            class7.method48("T1 - " + class9.field141 + "," + class231.field3966 + "," + class167.field2954 + " - " + class290.field5027, (byte) 82, (Throwable) null);
            class241.method1615((byte) -24);
            return true;
        }
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "()V", line = 2899)
    public class70() {
        this.field1285.field529 = this.field1285;
        this.field1285.field543 = this.field1285;
    }
}
