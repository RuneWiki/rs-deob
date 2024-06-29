import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public class class774 {

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "Lgq;")
    private class540 field11247;

    @OriginalMember(owner = "client!wo", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field11250 = new String[] { method5612(method5611("\u0003%Gcv")), method5612(method5611("\u000fdG\u000f#")), method5612(method5611("\u001a?\u0005M")), method5612(method5611("\u0003%G\u001d7\u001a#\u001d\u001fv")), method5612(method5611("\u0003%Gdv")), method5612(method5611("&\tS\u0001")), method5612(method5611("\u0003%G`v")), method5612(method5611("\u0003%Gev")), method5612(method5611("\u0003%Gbv")) };

    @OriginalMember(owner = "client!wo", name = "c", descriptor = "I")
    public static int field11244;

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "I")
    public static int field11245;

    @OriginalMember(owner = "client!wo", name = "e", descriptor = "I")
    public static int field11248;

    @OriginalMember(owner = "client!wo", name = "g", descriptor = "I")
    public static int field11249;

    @OriginalMember(owner = "client!wo", name = "d", descriptor = "Lcja;")
    private class46 field11243;

    @OriginalMember(owner = "client!wo", name = "f", descriptor = "[Lfs;")
    public static class581[] field11246;

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(ILnda;)Z", line = 10)
    public static final boolean method5606(int arg0, class583 arg1) {
        try {
            int var2 = 56 / ((-arg0 - 69) / 48);
            field11249++;
            class198 var3 = class417.field6144.method3030(0, arg1.method1083((byte) -100));
            if (var3.field3060 == -1) {
                return true;
            } else {
                class709 var4 = class617.field9073.method4604((byte) -124, var3.field3060);
                return var4.field10268 == -1 ? true : var4.method5173(0);
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field11250[8] + arg0 + ',' + (arg1 == null ? field11250[2] : field11250[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!wo", name = "d", descriptor = "(I)V", line = 32)
    public static void method5607(int arg0) {
        try {
            if (arg0 > 30) {
                field11246 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field11250[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wo", name = "c", descriptor = "(I)Lcja;", line = 43)
    public final class46 method5608(int arg0) {
        try {
            if (arg0 != -22019) {
                return null;
            }
            field11244++;
            class46 var2 = this.field11243;
            if (this.field11247.field7916 == var2) {
                this.field11243 = null;
                return null;
            } else {
                this.field11243 = var2.field529;
                return var2;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field11250[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "(I)V", line = 68)
    public static final void method5609(int arg0) {
        try {
            field11245++;
            if (class289.field4305.field808.method4761(false) == 2) {
                byte var1 = (byte) (class373.field5698 - 4 & 0xFF);
                int var2 = class373.field5698 % class648.field9378;
                for (int var3 = 0; var3 < 4; var3++) {
                    for (int var4 = 0; var4 < class659.field9506; var4++) {
                        class520.field7621[var3][var2][var4] = var1;
                    }
                }
                int var5 = -46 / ((-arg0 - 68) / 33);
                if (class520.field7618 != 3) {
                    for (int var6 = 0; var6 < 2; var6++) {
                        class152.field1872[var6] = -1000000;
                        class334.field5223[var6] = 1000000;
                        class639.field9287[var6] = 0;
                        class49.field556[var6] = 1000000;
                        class248.field3875[var6] = 0;
                    }
                    int var7 = class225.field3446.field6197;
                    int var8 = class225.field3446.field6211;
                    if (class185.field2559 != 1 && class730.field10605 == -1) {
                        int var9 = class316.method2656(class271.field4116, class520.field7618, class683.field9899, 0);
                        if ((var9 - class144.field1749) < 3200 && (class184.field2545[class520.field7618][class271.field4116 >> 9][class683.field9899 >> 9] & 0x4) != 0) {
                            class653.method4790(class734.field10683, class683.field9899 >> 9, false, 1, 1, class271.field4116 >> 9);
                        }
                    } else {
                        if (class185.field2559 != 1) {
                            var8 = class238.field3617;
                            var7 = class730.field10605;
                        }
                        if ((class184.field2545[class520.field7618][var7 >> 9][var8 >> 9] & 0x4) != 0) {
                            class653.method4790(class734.field10683, var8 >> 9, false, 1, 0, var7 >> 9);
                        }
                        if (class320.field5061 < 2560) {
                            int var10 = class271.field4116 >> 9;
                            int var11 = class683.field9899 >> 9;
                            int var12 = var7 >> 9;
                            int var13 = var8 >> 9;
                            int var14;
                            if (var10 >= var12) {
                                var14 = var10 - var12;
                            } else {
                                var14 = var12 - var10;
                            }
                            int var15;
                            if (var13 <= var11) {
                                var15 = var11 - var13;
                            } else {
                                var15 = var13 - var11;
                            }
                            if (!(var14 != 0 || var15 != 0) || var14 <= (-class648.field9378) || class648.field9378 <= var14 || var15 <= -class659.field9506 || var15 >= class659.field9506) {
                                class618.method4603((byte) 126, field11250[5] + var10 + "," + var11 + " " + var12 + "," + var13 + " " + class494.field7101 + "," + class281.field4219, null);
                            } else if (var14 <= var15) {
                                int var16 = var14 * 65536 / var15;
                                int var17 = 32768;
                                while (var11 != var13) {
                                    if (var13 > var11) {
                                        var11++;
                                    } else if (var13 < var11) {
                                        var11--;
                                    }
                                    if ((class184.field2545[class520.field7618][var10][var11] & 0x4) != 0) {
                                        class653.method4790(class734.field10683, var11, false, 1, 1, var10);
                                        return;
                                    }
                                    var17 += var16;
                                    if (var17 >= 65536) {
                                        var17 -= 65536;
                                        if (var10 < var12) {
                                            var10++;
                                        } else if (var12 < var10) {
                                            var10--;
                                        }
                                        if ((class184.field2545[class520.field7618][var10][var11] & 0x4) != 0) {
                                            class653.method4790(class734.field10683, var11, false, 1, 1, var10);
                                            return;
                                        }
                                    }
                                }
                            } else {
                                int var18 = var15 * 65536 / var14;
                                int var19 = 32768;
                                while (var10 != var12) {
                                    if (var12 > var10) {
                                        var10++;
                                    } else if (var10 > var12) {
                                        var10--;
                                    }
                                    if ((class184.field2545[class520.field7618][var10][var11] & 0x4) != 0) {
                                        class653.method4790(class734.field10683, var11, false, 1, 1, var10);
                                        return;
                                    }
                                    var19 += var18;
                                    if (var19 >= 65536) {
                                        var19 -= 65536;
                                        if (var11 < var13) {
                                            var11++;
                                        } else if (var11 > var13) {
                                            var11--;
                                        }
                                        if ((class184.field2545[class520.field7618][var10][var11] & 0x4) != 0) {
                                            class653.method4790(class734.field10683, var11, false, 1, 1, var10);
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException var21) {
            throw class759.method5498(var21, field11250[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wo", name = "<init>", descriptor = "()V", line = 269)
    public class774() {
    }

    @OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(Lgq;)V", line = 271)
    public class774(class540 arg0) {
        try {
            this.field11247 = arg0;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field11250[3] + (arg0 == null ? field11250[2] : field11250[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(I)Lcja;", line = 279)
    public final class46 method5610(int arg0) {
        try {
            if (arg0 != 1517) {
                method5607(-61);
            }
            field11248++;
            class46 var2 = this.field11247.field7916.field529;
            if (this.field11247.field7916 == var2) {
                this.field11243 = null;
                return null;
            } else {
                this.field11243 = var2.field529;
                return var2;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field11250[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wo", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5611(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5E);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!wo", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5612(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 116;
                    break;
                case 1:
                    var10005 = 74;
                    break;
                case 2:
                    var10005 = 105;
                    break;
                case 3:
                    var10005 = 33;
                    break;
                default:
                    var10005 = 94;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
