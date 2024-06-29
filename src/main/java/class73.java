import java.io.IOException;
import java.net.Socket;
import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class73 {

    @OriginalMember(owner = "client!fn", name = "d", descriptor = "I")
    public static int field948 = 0;

    @OriginalMember(owner = "client!fn", name = "i", descriptor = "[I")
    public static int[] field953 = new int[14];

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "I")
    public static int field945;

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "I")
    public static int field946;

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "client!fn", name = "e", descriptor = "I")
    public static int field949;

    @OriginalMember(owner = "client!fn", name = "f", descriptor = "I")
    public static int field950;

    @OriginalMember(owner = "client!fn", name = "g", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "client!fn", name = "h", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field952;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Z)V")
    public static final void method439(boolean arg0) {
        if (!arg0) {
            return;
        }
        field945++;
        if (class215.field3080 == 0 || class215.field3080 == 5) {
            return;
        }
        try {
            if ((++class26.field319) > 2000) {
                if (class199.field2847 != null) {
                    class199.field2847.method1093(false);
                    class199.field2847 = null;
                }
                if (class57.field762 >= 1) {
                    class215.field3080 = 0;
                    class384.field5440 = -5;
                    return;
                }
                class215.field3080 = 1;
                if (class30.field371 == class291.field4234) {
                    class291.field4234 = class150.field2246;
                } else {
                    class291.field4234 = class30.field371;
                }
                class57.field762++;
                class26.field319 = 0;
            }
            if (class215.field3080 == 1) {
                class398.field5596 = class401.field5628.method1536(class291.field4234, class220.field3162, 2099);
                class215.field3080 = 2;
            }
            if (class215.field3080 == 2) {
                if (class398.field5596.field2298 == 2) {
                    throw new IOException();
                }
                if (class398.field5596.field2298 != 1) {
                    return;
                }
                class199.field2847 = new class148((Socket) class398.field5596.field2295, class401.field5628);
                class398.field5596 = null;
                long var1 = class452.field6483 = class407.method2561(class311.field4505, 117);
                class407.field5761.field1880 = 0;
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class407.field5761.method831(14, (byte) 114);
                class407.field5761.method831(var3, (byte) -52);
                class199.field2847.method1091(false, class407.field5761.field1851, 2, 0);
                if (class153.field2271 != null) {
                    class153.field2271.method1363(-81);
                }
                if (class439.field6276 != null) {
                    class439.field6276.method1363(-68);
                }
                int var4 = class199.field2847.method1098((byte) 22);
                if (class153.field2271 != null) {
                    class153.field2271.method1363(-67);
                }
                if (class439.field6276 != null) {
                    class439.field6276.method1363(-119);
                }
                if (var4 != 0) {
                    class215.field3080 = 0;
                    class384.field5440 = var4;
                    class199.field2847.method1093(false);
                    class199.field2847 = null;
                    return;
                }
                class215.field3080 = 3;
            }
            if (class215.field3080 == 3) {
                if (class199.field2847.method1089((byte) 119) < 8) {
                    return;
                }
                class199.field2847.method1096(8, class352.field5114.field1851, -1, 0);
                class352.field5114.field1880 = 0;
                class59.field803 = class352.field5114.method804(893309448);
                int[] var5 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class59.field803 >> 32), (int) class59.field803 };
                class407.field5761.field1880 = 0;
                class407.field5761.method831(10, (byte) -39);
                class407.field5761.method849(var5[0], (byte) -68);
                class407.field5761.method849(var5[1], (byte) -81);
                class407.field5761.method849(var5[2], (byte) -127);
                class407.field5761.method849(var5[3], (byte) -68);
                class407.field5761.method832((byte) -61, class407.method2561(class311.field4505, 56));
                class407.field5761.method807((byte) 124, class410.field5881);
                class407.field5761.method833(class246.field3674, class15.field220, -107);
                class248.field3705.field1880 = 0;
                if (class423.field6041 == 40) {
                    class248.field3705.method831(18, (byte) -35);
                } else {
                    class248.field3705.method831(16, (byte) 125);
                }
                class248.field3705.method799(class407.field5761.field1880 + class276.method1873(arg0, class324.field4720) + 161, 50);
                class248.field3705.method849(566, (byte) -102);
                class248.field3705.method831(class323.field4707, (byte) 125);
                class248.field3705.method831(class436.method2717(false), (byte) 112);
                class248.field3705.method799(class24.field307, -74);
                class248.field3705.method799(class316.field4643, -115);
                class248.field3705.method831(class233.field3451, (byte) 119);
                class334.method2186(class248.field3705, false);
                class248.field3705.method807((byte) 124, class324.field4720);
                class248.field3705.method849(class363.field5213, (byte) -110);
                class248.field3705.method849(class190.method1366(false), (byte) -123);
                class315.field4627 = true;
                class248.field3705.method799(class306.field4472, -63);
                class248.field3705.method849(class105.field1350.method644(-1), (byte) -82);
                class248.field3705.method849(class222.field3179.method644(-1), (byte) -91);
                class248.field3705.method849(class365.field5227.method644(-1), (byte) -91);
                class248.field3705.method849(class213.field3010.method644(-1), (byte) -114);
                class248.field3705.method849(class119.field1609.method644(-1), (byte) -55);
                class248.field3705.method849(class226.field3370.method644(-1), (byte) -117);
                class248.field3705.method849(class72.field942.method644(-1), (byte) -126);
                class248.field3705.method849(class287.field4167.method644(-1), (byte) -53);
                class248.field3705.method849(class15.field216.method644(-1), (byte) -60);
                class248.field3705.method849(class264.field3888.method644(-1), (byte) -60);
                class248.field3705.method849(class170.field2406.method644(-1), (byte) -103);
                class248.field3705.method849(class173.field2448.method644(-1), (byte) -119);
                class248.field3705.method849(class311.field4563.method644(-1), (byte) -95);
                class248.field3705.method849(class327.field4745.method644(-1), (byte) -118);
                class248.field3705.method849(class413.field5910.method644(-1), (byte) -90);
                class248.field3705.method849(class229.field3395.method644(-1), (byte) -126);
                class248.field3705.method849(class245.field3662.method644(-1), (byte) -69);
                class248.field3705.method849(class47.field625.method644(-1), (byte) -53);
                class248.field3705.method849(class224.field3357.method644(-1), (byte) -120);
                class248.field3705.method849(class449.field6414.method644(-1), (byte) -77);
                class248.field3705.method849(class418.field6002.method644(-1), (byte) -115);
                class248.field3705.method849(class196.field2813.method644(-1), (byte) -99);
                class248.field3705.method849(class122.field1636.method644(-1), (byte) -87);
                class248.field3705.method849(class284.field4140.method644(-1), (byte) -53);
                class248.field3705.method849(class83.field1064.method644(-1), (byte) -115);
                class248.field3705.method849(class247.field3702.method644(-1), (byte) -54);
                class248.field3705.method849(class278.field4004.method644(-1), (byte) -67);
                class248.field3705.method849(class331.field4795.method644(-1), (byte) -119);
                class248.field3705.method849(class331.field4794.method644(-1), (byte) -94);
                class248.field3705.method821(class407.field5761.field1880, 124, 0, class407.field5761.field1851);
                class199.field2847.method1091(false, class248.field3705.field1851, class248.field3705.field1880, 0);
                class407.field5761.method2049(-12691, var5);
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] += 50;
                }
                class352.field5114.method2049(-12691, var5);
                class215.field3080 = 4;
            }
            if (class215.field3080 == 4) {
                if (class199.field2847.method1089((byte) 100) < 1) {
                    return;
                }
                int var7 = class199.field2847.method1098((byte) 22);
                if (var7 == 21) {
                    class215.field3080 = 7;
                } else if (var7 == 29) {
                    class215.field3080 = 10;
                } else if (var7 == 1) {
                    class215.field3080 = 5;
                    class384.field5440 = var7;
                    return;
                } else if (var7 == 2) {
                    class215.field3080 = 8;
                } else if (var7 == 15) {
                    class215.field3080 = 0;
                    class384.field5440 = var7;
                    return;
                } else if (var7 == 23 && class57.field762 < 1) {
                    class57.field762++;
                    class26.field319 = 0;
                    class215.field3080 = 1;
                    class199.field2847.method1093(false);
                    class199.field2847 = null;
                    return;
                } else {
                    class215.field3080 = 0;
                    class384.field5440 = var7;
                    class199.field2847.method1093(false);
                    class199.field2847 = null;
                    return;
                }
            }
            if (class215.field3080 == 6) {
                class407.field5761.field1880 = 0;
                class407.field5761.method2048(2040, 17);
                class199.field2847.method1091(false, class407.field5761.field1851, class407.field5761.field1880, 0);
                class215.field3080 = 4;
            } else if (class215.field3080 == 7) {
                if (class199.field2847.method1089((byte) -72) >= 1) {
                    class384.field5439 = (class199.field2847.method1098((byte) 22) + 3) * 60;
                    class384.field5440 = 21;
                    class215.field3080 = 0;
                    class199.field2847.method1093(!arg0);
                    class199.field2847 = null;
                }
            } else if (class215.field3080 != 10) {
                if (class215.field3080 == 8) {
                    if (class199.field2847.method1089((byte) -70) < 13) {
                        return;
                    }
                    class199.field2847.method1096(13, class352.field5114.field1851, -1, 0);
                    class352.field5114.field1880 = 0;
                    class316.field4628 = class352.field5114.method837(true);
                    class325.field4725 = class352.field5114.method837(true);
                    class138.field2117 = class352.field5114.method837(true) == 1;
                    class335.field4874 = class352.field5114.method837(arg0) == 1;
                    class381.field5415 = class352.field5114.method837(arg0) == 1;
                    class148.field2211 = class352.field5114.method837(true) == 1;
                    class302.field4417 = class352.field5114.method798(false);
                    class282.field4061 = class352.field5114.method837(true) == 1;
                    class311.field4503 = class352.field5114.method837(true) == 1;
                    class352.method2302(class311.field4503, -108);
                    class181.method1296(class311.field4503, arg0);
                    class431.method2684(class311.field4503, false);
                    if ((!class138.field2117 || class381.field5415) && !class282.field4061) {
                        try {
                            class348.method2282((byte) -69, "unzap", class401.field5628.field3154);
                        } catch (Throwable var9) {
                        }
                    } else {
                        try {
                            class348.method2282((byte) -116, "zap", class401.field5628.field3154);
                        } catch (Throwable var10) {
                        }
                    }
                    if (class214.field3022 == 0) {
                        try {
                            class348.method2282((byte) -30, "loggedin", class401.field5628.field3154);
                        } catch (Throwable var8) {
                        }
                    }
                    class213.field3012 = class352.field5114.method2046((byte) 126);
                    class242.field3572 = class352.field5114.method798(!arg0);
                    class215.field3080 = 9;
                }
                if (class215.field3080 == 9 && class199.field2847.method1089((byte) -88) >= class242.field3572) {
                    class352.field5114.field1880 = 0;
                    class199.field2847.method1096(class242.field3572, class352.field5114.field1851, -1, 0);
                    class215.field3080 = 0;
                    class384.field5440 = 2;
                    class125.method756(0);
                    class327.field4741 = -1;
                    class386.method2455(false, (byte) -102);
                    class213.field3012 = -1;
                }
            } else if (class199.field2847.method1089((byte) 78) >= 1) {
                class30.field368 = class199.field2847.method1098((byte) 22);
                class384.field5440 = 29;
                class215.field3080 = 0;
                class199.field2847.method1093(!arg0);
                class199.field2847 = null;
            }
        } catch (IOException var11) {
            if (class199.field2847 != null) {
                class199.field2847.method1093(false);
                class199.field2847 = null;
            }
            if (class57.field762 < 1) {
                class57.field762++;
                class215.field3080 = 1;
                class26.field319 = 0;
                if (class30.field371 == class291.field4234) {
                    class291.field4234 = class150.field2246;
                } else {
                    class291.field4234 = class30.field371;
                }
            } else {
                class384.field5440 = -4;
                class215.field3080 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!fn", name = "<init>", descriptor = "()V")
    public class73() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Ltj;I)V")
    public static final void method440(class108 arg0, int arg1) {
        class9.field120 = arg0;
        field950++;
        if (arg1 != -4450) {
            field948 = -39;
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(CB)B")
    public static final byte method441(char arg0, byte arg1) {
        if (arg1 != 100) {
            method439(true);
        }
        field947++;
        byte var2;
        if (!(arg0 <= '\u0000' || arg0 >= '\u0080') || !(arg0 < ' ' || arg0 > 'ÿ')) {
            var2 = (byte) arg0;
        } else if (arg0 == '€') {
            var2 = -128;
        } else if (arg0 == '‚') {
            var2 = -126;
        } else if (arg0 == 'ƒ') {
            var2 = -125;
        } else if (arg0 == '„') {
            var2 = -124;
        } else if (arg0 == '…') {
            var2 = -123;
        } else if (arg0 == '†') {
            var2 = -122;
        } else if (arg0 == '‡') {
            var2 = -121;
        } else if (arg0 == 'ˆ') {
            var2 = -120;
        } else if (arg0 == '‰') {
            var2 = -119;
        } else if (arg0 == 'Š') {
            var2 = -118;
        } else if (arg0 == '‹') {
            var2 = -117;
        } else if (arg0 == 'Œ') {
            var2 = -116;
        } else if (arg0 == 'Ž') {
            var2 = -114;
        } else if (arg0 == '‘') {
            var2 = -111;
        } else if (arg0 == '’') {
            var2 = -110;
        } else if (arg0 == '“') {
            var2 = -109;
        } else if (arg0 == '”') {
            var2 = -108;
        } else if (arg0 == '•') {
            var2 = -107;
        } else if (arg0 == '–') {
            var2 = -106;
        } else if (arg0 == '—') {
            var2 = -105;
        } else if (arg0 == '˜') {
            var2 = -104;
        } else if (arg0 == '™') {
            var2 = -103;
        } else if (arg0 == 'š') {
            var2 = -102;
        } else if (arg0 == '›') {
            var2 = -101;
        } else if (arg0 == 'œ') {
            var2 = -100;
        } else if (arg0 == 'ž') {
            var2 = -98;
        } else if (arg0 == 'Ÿ') {
            var2 = -97;
        } else {
            var2 = 63;
        }
        return var2;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)V")
    public static void method442(int arg0) {
        int var1 = 73 / ((arg0 - 3) / 42);
        field953 = null;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(BLpn;)V")
    public static final void method443(byte arg0, class446 arg1) {
        field949++;
        if (class381.field5412 >= 400) {
            return;
        }
        class346 var2 = arg1.field6375;
        if (var2.field5023 != null) {
            var2 = var2.method2273(-1);
            if (var2 == null) {
                return;
            }
        }
        if (!var2.field5020) {
            return;
        }
        String var3 = var2.field5016;
        if (arg0 <= 67) {
            method441((char) 65427, (byte) -56);
        }
        if (var2.field5000 != 0) {
            String var4 = class317.field4656 == 1 ? class357.field5162.method2284((byte) 117, class309.field4497) : class3.field65.method2284((byte) -94, class309.field4497);
            var3 = var3 + class140.method1063(class181.field2555.field1776, 107, var2.field5000) + " (" + var4 + var2.field5000 + ")";
        }
        if (class269.field3935) {
            class319 var12 = class34.field433 == -1 ? null : class58.method378(class34.field433, (byte) 118);
            if ((class432.field6182 & 0x2) != 0 && var12 == null || var2.method2271(113, var12.field4668, class34.field433) != var12.field4668) {
                class320.field4686++;
                class252.method1755((long) arg1.field4514, class106.field1363 + " -> <col=ffff00>" + var3, 47, class442.field6319, (byte) -72, class285.field4153, 0, 0);
            }
            return;
        }
        String[] var5 = var2.field5041;
        if (class253.field3751) {
            var5 = class168.method1203(-121, var5);
        }
        if (var5 != null) {
            for (int var6 = 4; var6 >= 0; var6--) {
                if (var5[var6] != null && (class317.field4656 != 0 || !var5[var6].equalsIgnoreCase(class83.field1065.method2284((byte) -14, class309.field4497)))) {
                    byte var7 = 0;
                    int var8 = class165.field2363;
                    if (var6 == 0) {
                        var7 = 10;
                    }
                    if (var6 == 1) {
                        var7 = 49;
                    }
                    if (var6 == 2) {
                        var7 = 25;
                    }
                    if (var6 == 3) {
                        var7 = 6;
                    }
                    if (var2.field5009 == var6) {
                        var8 = var2.field4986;
                    }
                    if (var6 == 4) {
                        var7 = 9;
                    }
                    if (var2.field5006 == var6) {
                        var8 = var2.field4988;
                    }
                    class131.field1909++;
                    class252.method1755((long) arg1.field4514, "<col=ffff00>" + var3, var7, var8, (byte) -112, var5[var6], 0, 0);
                }
            }
        }
        if (class317.field4656 == 0 && var5 != null) {
            for (int var9 = 4; var9 >= 0; var9--) {
                if (var5[var9] != null && var5[var9].equalsIgnoreCase(class83.field1065.method2284((byte) 124, class309.field4497))) {
                    short var10 = 0;
                    if (class181.field2555.field1776 < var2.field5000) {
                        var10 = 2000;
                    }
                    short var11 = 0;
                    if (var9 == 0) {
                        var11 = 10;
                    }
                    if (var9 == 1) {
                        var11 = 49;
                    }
                    if (var9 == 2) {
                        var11 = 25;
                    }
                    if (var9 == 3) {
                        var11 = 6;
                    }
                    if (var9 == 4) {
                        var11 = 9;
                    }
                    if (var11 != 0) {
                        var11 += var10;
                    }
                    class252.method1755((long) arg1.field4514, "<col=ffff00>" + var3, var11, var2.field5022, (byte) 65, var5[var9], 0, 0);
                    class84.field1069++;
                }
            }
        }
        class16.field242++;
        class252.method1755((long) arg1.field4514, "<col=ffff00>" + var3, 1001, class305.field4446, (byte) 94, class204.field2882.method2284((byte) 109, class309.field4497), 0, 0);
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(ILlf;[B)V")
    public final void method444(int arg0, class130 arg1, byte[] arg2) {
        field951++;
        if (arg1.field1851[arg1.field1880] != 31 || arg1.field1851[arg1.field1880 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field952 == null) {
            this.field952 = new Inflater(true);
        }
        try {
            if (arg0 > -37) {
                this.method444(-109, (class130) null, (byte[]) null);
            }
            this.field952.setInput(arg1.field1851, arg1.field1880 + 10, arg1.field1851.length - (arg1.field1880 - -18));
            this.field952.inflate(arg2);
        } catch (Exception var4) {
            this.field952.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field952.reset();
    }

    @OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(III)V")
    private class73(int arg0, int arg1, int arg2) {
    }
}
