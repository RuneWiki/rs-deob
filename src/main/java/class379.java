import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class379 {

    @OriginalMember(owner = "client!md", name = "a", descriptor = "[S")
    public static short[] field5598 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!md", name = "b", descriptor = "Lgk;")
    public static class331 field5599 = new class331("Loading sprites - ", "Lade Sprites - ", "Chargement des sprites - ", "Carregando sprites - ");

    @OriginalMember(owner = "client!md", name = "f", descriptor = "I")
    public static int field5603;

    @OriginalMember(owner = "client!md", name = "g", descriptor = "I")
    public static int field5604;

    @OriginalMember(owner = "client!md", name = "h", descriptor = "I")
    public static int field5605;

    @OriginalMember(owner = "client!md", name = "i", descriptor = "I")
    public static int field5606;

    @OriginalMember(owner = "client!md", name = "c", descriptor = "Lmd;")
    public class379 field5600;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "Lmd;")
    public class379 field5601;

    @OriginalMember(owner = "client!md", name = "e", descriptor = "Lal;")
    public static class66 field5602;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Z)V")
    public static void method2320(boolean arg0) {
        field5598 = null;
        if (!arg0) {
            field5602 = null;
        }
        field5599 = null;
        field5602 = null;
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(Z)[Lic;")
    public static final class491[] method2321(boolean arg0) {
        field5606++;
        if (!arg0) {
            return null;
        }
        if (class167.field2366 == null) {
            class491[] var1 = class178.method1248(class498.field7404, 1034647426);
            class491[] var2 = new class491[var1.length];
            int var3 = 0;
            label66: for (int var4 = 0; var4 < var1.length; var4++) {
                class491 var8 = var1[var4];
                if ((var8.field7201 <= 0 || var8.field7201 >= 24) && var8.field7197 >= 800 && var8.field7198 >= 600 && (class352.field4882 >= 96 || class65.field802 != 0 || var8.field7197 <= 1024 && var8.field7198 <= 768)) {
                    for (int var9 = 0; var9 < var3; var9++) {
                        class491 var10 = var2[var9];
                        if (var8.field7197 == var10.field7197 && var8.field7198 == var10.field7198) {
                            if (var8.field7201 > var10.field7201) {
                                var2[var9] = var8;
                            }
                            continue label66;
                        }
                    }
                    var2[var3] = var8;
                    var3++;
                }
            }
            class167.field2366 = new class491[var3];
            class201.method1414(var2, 0, class167.field2366, 0, var3);
            int[] var5 = new int[class167.field2366.length];
            for (int var6 = 0; var6 < class167.field2366.length; var6++) {
                class491 var7 = class167.field2366[var6];
                var5[var6] = var7.field7198 * var7.field7197;
            }
            class85.method761(class167.field2366, var5, false);
        }
        return class167.field2366;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
    public final void method2322(int arg0) {
        field5605++;
        if (arg0 != 1024) {
            method2321(false);
        }
        if (this.field5601 != null) {
            this.field5601.field5600 = this.field5600;
            this.field5600.field5601 = this.field5601;
            this.field5601 = null;
            this.field5600 = null;
        }
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(I)V")
    public static final void method2323(int arg0) {
        field5603++;
        if (class478.field7044.method2069(class65.field802, -79) != 2) {
            return;
        }
        if (arg0 != -11572) {
            method2321(false);
        }
        byte var1 = (byte) (class50.field551 - 4 & 0xFF);
        int var2 = class50.field551 % class397.field5828;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var16 = 0; var16 < class457.field6713; var16++) {
                class232.field3411[var3][var2][var16] = var1;
            }
        }
        if (class525.field7714 == 3) {
            return;
        }
        for (int var4 = 0; var4 < 2; var4++) {
            class133.field1929[var4] = -1000000;
            class516.field7605[var4] = 1000000;
            class325.field4562[var4] = 0;
            class452.field6656[var4] = 1000000;
            class393.field5784[var4] = 0;
        }
        if (class462.field6802 != 1) {
            int var15 = class66.method643(class161.field2268, arg0 + 11474, class525.field7714, class486.field7138);
            if ((var15 - class487.field7162) >= 800 || (class238.field3497[class525.field7714][class161.field2268 >> 7][class486.field7138 >> 7] & 0x4) == 0) {
                return;
            }
            class133.method1013(class161.field2268 >> 7, false, arg0 + 44154, class486.field7138 >> 7, 1, class422.field6240);
            return;
        }
        if ((class238.field3497[class525.field7714][class435.field6375.field6335 >> 7][class435.field6375.field6334 >> 7] & 0x4) != 0) {
            class133.method1013(class435.field6375.field6335 >> 7, false, 32582, class435.field6375.field6334 >> 7, 0, class422.field6240);
        }
        if (class321.field4529 >= 2560) {
            return;
        }
        int var5 = class161.field2268 >> 7;
        int var6 = class486.field7138 >> 7;
        int var7 = class435.field6375.field6335 >> 7;
        int var8 = class435.field6375.field6334 >> 7;
        int var9;
        if (var7 <= var5) {
            var9 = var5 - var7;
        } else {
            var9 = var7 - var5;
        }
        int var10;
        if (var8 <= var6) {
            var10 = var6 - var8;
        } else {
            var10 = var8 - var6;
        }
        if ((var9 != 0 || var10 != 0) && var9 > -class397.field5828 && class397.field5828 > var9 && (-class457.field6713) < var10 && class457.field6713 > var10) {
            if (var9 <= var10) {
                int var11 = var9 * 65536 / var10;
                int var12 = 32768;
                while (var6 != var8) {
                    if (var8 > var6) {
                        var6++;
                    } else if (var6 > var8) {
                        var6--;
                    }
                    if ((class238.field3497[class525.field7714][var5][var6] & 0x4) != 0) {
                        class133.method1013(var5, false, 32582, var6, 1, class422.field6240);
                        return;
                    }
                    var12 += var11;
                    if (var12 >= 65536) {
                        if (var5 < var7) {
                            var5++;
                        } else if (var5 > var7) {
                            var5--;
                        }
                        var12 -= 65536;
                        if ((class238.field3497[class525.field7714][var5][var6] & 0x4) != 0) {
                            class133.method1013(var5, false, 32582, var6, 1, class422.field6240);
                            return;
                        }
                    }
                }
                return;
            }
            int var13 = var10 * 65536 / var9;
            int var14 = 32768;
            while (var5 != var7) {
                if (var7 > var5) {
                    var5++;
                } else if (var7 < var5) {
                    var5--;
                }
                if ((class238.field3497[class525.field7714][var5][var6] & 0x4) != 0) {
                    class133.method1013(var5, false, arg0 ^ 0xFFFFAD8A, var6, 1, class422.field6240);
                    return;
                }
                var14 += var13;
                if (var14 >= 65536) {
                    var14 -= 65536;
                    if (var8 > var6) {
                        var6++;
                    } else if (var6 > var8) {
                        var6--;
                    }
                    if ((class238.field3497[class525.field7714][var5][var6] & 0x4) != 0) {
                        class133.method1013(var5, false, arg0 ^ 0xFFFFAD8A, var6, 1, class422.field6240);
                        return;
                    }
                }
            }
            return;
        }
        class194.method1362(null, "RC: " + var5 + "," + var6 + " " + var7 + "," + var8 + " " + class340.field4713 + "," + class476.field7013, -101);
        return;
    }
}
