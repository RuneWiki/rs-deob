import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class138 implements Runnable {

    @OriginalMember(owner = "client!ik", name = "j", descriptor = "Luq;")
    private class111 field2089 = new class111();

    @OriginalMember(owner = "client!ik", name = "m", descriptor = "I")
    public int field2092 = 0;

    @OriginalMember(owner = "client!ik", name = "o", descriptor = "Z")
    private boolean field2094 = false;

    @OriginalMember(owner = "client!ik", name = "n", descriptor = "Ljava/lang/Thread;")
    private Thread field2093;

    @OriginalMember(owner = "client!ik", name = "i", descriptor = "Z")
    public static boolean field2088;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "I")
    public static int field2080;

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "I")
    public static int field2082;

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "I")
    public static int field2083;

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "I")
    public static int field2084;

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "I")
    public static int field2085;

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "I")
    public static int field2087;

    @OriginalMember(owner = "client!ik", name = "k", descriptor = "I")
    public static int field2090;

    @OriginalMember(owner = "client!ik", name = "l", descriptor = "Lhu;")
    public static class85 field2091;

    static {
        new class180("Error sending message to clan chat - please try again later!", "Fehler beim Versenden der Nachricht - bitte versuch es später erneut.", "Erreur lors de l'envoi du message au canal de clan - veuillez réessayer ultérieurement.", "Erro ao enviar mensagem ao canal de clã. Tente de novo depois!");
        field2088 = false;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ILpf;)V", line = 3)
    private final void method1015(int arg0, class409 arg1) {
        field2090++;
        class111 var3 = this.field2089;
        synchronized (this.field2089) {
            if (arg0 != -1) {
                this.field2092 = -31;
            }
            this.field2089.method819(arg1, 1431655765);
            this.field2092++;
            this.field2089.notifyAll();
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ILkn;[BZ)Lpf;", line = 18)
    public final class409 method1016(int arg0, class518 arg1, byte[] arg2, boolean arg3) {
        field2083++;
        class409 var5 = new class409();
        var5.field6030 = 2;
        var5.field6033 = arg1;
        var5.field6032 = arg2;
        var5.field1844 = arg0;
        var5.field6916 = arg3;
        this.method1015(-1, var5);
        return var5;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IBLkn;)Lpf;", line = 35)
    public final class409 method1017(int arg0, byte arg1, class518 arg2) {
        if (arg1 <= 10) {
            return null;
        }
        field2082++;
        class409 var4 = new class409();
        var4.field6030 = 1;
        class111 var5 = this.field2089;
        synchronized (this.field2089) {
            class409 var6 = (class409) this.field2089.method820(true);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if (((long) arg0) == var6.field1844 && var6.field6033 == arg2 && var6.field6030 == 2) {
                    var4.field6915 = false;
                    var4.field6032 = var6.field6032;
                    return var4;
                }
                var6 = (class409) this.field2089.method816(122);
            }
        }
        var4.field6032 = arg2.method3064((byte) 121, arg0);
        var4.field6916 = true;
        var4.field6915 = false;
        return var4;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)Z", line = 71)
    public static final boolean method1018(int arg0) throws IOException {
        field2087++;
        if (field2091 == null) {
            return false;
        }
        int var1 = field2091.method693((byte) -122);
        if (var1 == 0) {
            return false;
        }
        if (class18.field281 == null) {
            if (class326.field5028) {
                field2091.method691(0, class387.field5738.field4326, 127, 1);
                var1--;
                class326.field5028 = false;
                class492.field7186++;
            }
            class387.field5738.field4333 = 0;
            if (class387.field5738.method2850((byte) -85)) {
                if (var1 == 0) {
                    return false;
                }
                field2091.method691(1, class387.field5738.field4326, 118, 1);
                var1--;
                class492.field7186++;
            }
            class326.field5028 = true;
            class188[] var2 = class314.method1984(-1);
            int var3 = class387.field5738.method2846((byte) -117);
            if (var3 < 0 || var2.length <= var3) {
                throw new IOException("invo:" + var3 + " ip:" + class387.field5738.field4333);
            }
            class18.field281 = var2[var3];
            class133.field2060 = class18.field281.field2785;
        }
        if (class133.field2060 == -1) {
            if (var1 <= 0) {
                return false;
            }
            field2091.method691(0, class387.field5738.field4326, 124, 1);
            var1--;
            class492.field7186++;
            class133.field2060 = class387.field5738.field4326[0] & 0xFF;
        }
        if (class133.field2060 == -2) {
            if (var1 <= 1) {
                return false;
            }
            field2091.method691(0, class387.field5738.field4326, 127, 2);
            class387.field5738.field4333 = 0;
            class133.field2060 = class387.field5738.method1868(0);
            var1 -= 2;
            class492.field7186 += 2;
        }
        if (var1 < class133.field2060) {
            return false;
        }
        class387.field5738.field4333 = 0;
        field2091.method691(0, class387.field5738.field4326, 124, class133.field2060);
        class297.field4247 = class438.field6388;
        class492.field7186 += class133.field2060;
        class461.field6805 = 0;
        class438.field6388 = class447.field6547;
        class447.field6547 = class18.field281;
        if (class35.field533 == class18.field281) {
            class16.field248 = class387.field5738.method1884((byte) -128) << 3;
            class367.field5509 = class387.field5738.method1861((byte) 111);
            class382.field5686 = class387.field5738.method1899((byte) -105) << 3;
            for (class63 var4 = (class63) class73.field1218.method2483(114); var4 != null; var4 = (class63) class73.field1218.method2481((byte) -27)) {
                int var6 = (int) (var4.field6399 & 0x3FFFL);
                int var7 = (int) (var4.field6399 >> 14 & 0x3FFFL);
                int var8 = (int) (var4.field6399 >> 28 & 0x3L);
                if (class367.field5509 == var8 && class16.field248 <= var6 && class16.field248 + 8 > var6 && var7 >= class382.field5686 && var7 < (class382.field5686 + 8)) {
                    var4.method2663(-117);
                    class91.method737(var6, class367.field5509, (byte) -51, var7);
                }
            }
            for (class64 var5 = (class64) class516.field7581.method2257((byte) 111); var5 != null; var5 = (class64) class516.field7581.method2256(-100)) {
                if (class16.field248 <= var5.field1122 && var5.field1122 < (class16.field248 + 8) && class382.field5686 <= var5.field1121 && var5.field1121 < class382.field5686 + 8 && class367.field5509 == var5.field1134) {
                    var5.field1125 = 0;
                }
            }
            class18.field281 = null;
            return true;
        } else if (class479.field7025 == class18.field281) {
            int var9 = class387.field5738.method1868(0);
            int var10 = class387.field5738.method1864(16698);
            int var11 = class387.field5738.method1873((byte) -33);
            if (class317.method1989(1, var9)) {
                class63.method564(var10, var11, 7);
            }
            class18.field281 = null;
            return true;
        } else if (class381.field5672 == class18.field281) {
            int var12 = class387.field5738.method1898(115);
            int var13 = class387.field5738.method1868(0);
            if (class317.method1989(1, var13)) {
                class488.method2925((byte) 114, 3, var12, -1, -1);
            }
            class18.field281 = null;
            return true;
        } else if (class380.field5669 == class18.field281) {
            int var14 = class387.field5738.method1888((byte) 89);
            int var15 = class387.field5738.method1888((byte) 121);
            int var16 = class387.field5738.method1868(0);
            int var17 = class387.field5738.method1888((byte) 91);
            int var18 = class387.field5738.method1873((byte) -44);
            if (class317.method1989(1, var14)) {
                class370.method2371(20545, var15, var17, var16, var18);
            }
            class18.field281 = null;
            return true;
        } else if (class18.field281 == class108.field1676) {
            class478.method2861(-8496, class222.field3222);
            class18.field281 = null;
            return true;
        } else if (class435.field6323 == class18.field281) {
            if (class341.field5207 != -1) {
                class270.method1734(class341.field5207, 0, -109);
            }
            class18.field281 = null;
            return true;
        } else if (class455.field6732 == class18.field281) {
            class382.field5686 = class387.field5738.method1899((byte) 101) << 3;
            class367.field5509 = class387.field5738.method1918((byte) 73);
            class16.field248 = class387.field5738.method1883((byte) -29) << 3;
            while (class387.field5738.field4333 < class133.field2060) {
                class489 var19 = class408.method2527((byte) 83)[class387.field5738.method1918((byte) -49)];
                class478.method2861(-8496, var19);
            }
            class18.field281 = null;
            return true;
        } else if (class522.field7662 == class18.field281) {
            class478.method2861(-8496, class182.field2743);
            class18.field281 = null;
            return true;
        } else if (class372.field5571 == class18.field281) {
            while (class133.field2060 > class387.field5738.field4333) {
                boolean var30 = class387.field5738.method1918((byte) -76) == 1;
                String var31 = class387.field5738.method1879(30669);
                String var32 = class387.field5738.method1879(30669);
                int var33 = class387.field5738.method1868(0);
                int var34 = class387.field5738.method1918((byte) 76);
                String var35 = "";
                boolean var36 = false;
                if (var33 > 0) {
                    var35 = class387.field5738.method1879(30669);
                    var36 = class387.field5738.method1918((byte) 79) == 1;
                }
                for (int var37 = 0; var37 < class424.field6218; var37++) {
                    if (var30) {
                        if (var32.equals(class469.field6908[var37])) {
                            class469.field6908[var37] = var31;
                            class332.field5102[var37] = var32;
                            var31 = null;
                            break;
                        }
                    } else if (var31.equals(class469.field6908[var37])) {
                        if (class222.field3219[var37] != var33) {
                            class222.field3219[var37] = var33;
                            if (var33 > 0) {
                                class64.method569(2, 5, var31 + class319.field4558.method1273(true, class370.field5530), 0, "", "");
                            }
                            if (var33 == 0) {
                                class64.method569(2, 5, var31 + class111.field1757.method1273(true, class370.field5530), 0, "", "");
                            }
                        }
                        class332.field5102[var37] = var32;
                        class227.field3331[var37] = var35;
                        class410.field6043[var37] = var34;
                        class56.field816[var37] = var36;
                        var31 = null;
                        break;
                    }
                }
                if (var31 != null && class424.field6218 < 200) {
                    class469.field6908[class424.field6218] = var31;
                    class332.field5102[class424.field6218] = var32;
                    class222.field3219[class424.field6218] = var33;
                    class227.field3331[class424.field6218] = var35;
                    class410.field6043[class424.field6218] = var34;
                    class56.field816[class424.field6218] = var36;
                    class424.field6218++;
                }
            }
            class317.field4540 = 2;
            class92.field1521 = class285.field4130;
            boolean var20 = false;
            int var21 = class424.field6218;
            while (var21 > 0) {
                var21--;
                boolean var22 = true;
                for (int var23 = 0; var23 < var21; var23++) {
                    if (class222.field3219[var23] != class255.field3681 && class222.field3219[var23 + 1] == class255.field3681 || class222.field3219[var23] == 0 && class222.field3219[var23 + 1] != 0) {
                        int var24 = class222.field3219[var23];
                        class222.field3219[var23] = class222.field3219[var23 + 1];
                        class222.field3219[var23 + 1] = var24;
                        String var25 = class227.field3331[var23];
                        class227.field3331[var23] = class227.field3331[var23 + 1];
                        class227.field3331[var23 + 1] = var25;
                        String var26 = class469.field6908[var23];
                        class469.field6908[var23] = class469.field6908[var23 + 1];
                        class469.field6908[var23 + 1] = var26;
                        String var27 = class332.field5102[var23];
                        class332.field5102[var23] = class332.field5102[var23 + 1];
                        class332.field5102[var23 + 1] = var27;
                        int var28 = class410.field6043[var23];
                        class410.field6043[var23] = class410.field6043[var23 + 1];
                        class410.field6043[var23 + 1] = var28;
                        boolean var29 = class56.field816[var23];
                        class56.field816[var23] = class56.field816[var23 + 1];
                        class56.field816[var23 + 1] = var29;
                        var22 = false;
                    }
                }
                if (var22) {
                    break;
                }
            }
            class18.field281 = null;
            return true;
        } else if (class18.field281 == class17.field270) {
            String var38 = class387.field5738.method1879(30669);
            int var39 = class387.field5738.method1868(0);
            String var40 = class121.field1892.method1689(var39, (byte) -104).method3010(class387.field5738, false);
            class160.method1154(-10444, var38, var39, var38, 0, null, var40, 19);
            class18.field281 = null;
            return true;
        } else if (class417.field6161 == class18.field281) {
            int var41 = class387.field5738.method1868(0);
            int var42 = class387.field5738.method1918((byte) 71);
            int var43 = class387.field5738.method1918((byte) 102);
            int var44 = class387.field5738.method1918((byte) -58);
            int var45 = class387.field5738.method1918((byte) 119);
            int var46 = class387.field5738.method1868(0);
            if (class317.method1989(1, var41)) {
                class205.field2962[var42] = true;
                class151.field2316[var42] = var43;
                class57.field823[var42] = var44;
                class266.field3845[var42] = var45;
                class530.field7816[var42] = var46;
            }
            class18.field281 = null;
            return true;
        } else if (class267.field3869 == class18.field281) {
            int var47 = class387.field5738.method1888((byte) 96);
            byte var48 = class387.field5738.method1884((byte) -127);
            class526.field7733.method2827(-31366, var47, var48);
            class18.field281 = null;
            return true;
        } else if (class33.field516 == class18.field281) {
            class57.method408(class387.field5738, class133.field2060, 0);
            class18.field281 = null;
            return true;
        } else if (class301.field4289 == class18.field281) {
            int var49 = class387.field5738.method1868(0);
            if (var49 == 65535) {
                var49 = -1;
            }
            int var50 = class387.field5738.method1918((byte) -44);
            int var51 = class387.field5738.method1868(0);
            int var52 = class387.field5738.method1918((byte) 127);
            class16.method153(var51, var49, true, var50, var52);
            class18.field281 = null;
            return true;
        } else if (class435.field6320 == class18.field281) {
            class128.field1946 = class379.method2401((byte) -96, class387.field5738.method1918((byte) -112));
            class18.field281 = null;
            return true;
        } else if (class325.field4978 == class18.field281) {
            class478.method2861(-8496, class406.field5974);
            class18.field281 = null;
            return true;
        } else if (class47.field719 == class18.field281) {
            int var53 = class387.field5738.method1868(0);
            int var54 = class387.field5738.method1868(0);
            int var55 = class387.field5738.method1868(0);
            int var56 = class387.field5738.method1868(0);
            if (class317.method1989(1, var53) && class416.field6157[var54] != null) {
                for (int var57 = var55; var57 < var56; var57++) {
                    int var58 = class387.field5738.method1866(false);
                    if (class416.field6157[var54].length > var57 && class416.field6157[var54][var57] != null) {
                        class416.field6157[var54][var57].field947 = var58;
                    }
                }
            }
            class18.field281 = null;
            return true;
        } else if (class64.field1131 == class18.field281) {
            int var59 = class387.field5738.method1903((byte) -124);
            if (var59 == 65535) {
                var59 = -1;
            }
            int var60 = class387.field5738.method1898(116);
            int var61 = class387.field5738.method1888((byte) 123);
            if (class317.method1989(1, var61)) {
                class264.method1693((byte) -99, var59, var60);
            }
            class18.field281 = null;
            return true;
        } else if (class270.field3917 == class18.field281) {
            int var62 = class387.field5738.method1894(255);
            int var63 = class387.field5738.method1869((byte) -126);
            int var64 = class387.field5738.method1868(0);
            class13 var65 = class132.field2030[var63];
            if (var65 != null) {
                class119.method867(var62, var65, var64, (byte) -123);
            }
            class18.field281 = null;
            return true;
        } else if (class416.field6152 == class18.field281) {
            int var66 = class387.field5738.method1894(255);
            int var67 = class387.field5738.method1868(0);
            if (var67 == 65535) {
                var67 = -1;
            }
            int var68 = class387.field5738.method1864(16698);
            String var69 = class387.field5738.method1879(30669);
            if (var66 >= 1 && var66 <= 8) {
                if (var69.equalsIgnoreCase("null")) {
                    var69 = null;
                }
                client.field2875[var66 - 1] = var69;
                class492.field7187[var66 - 1] = var67;
                class458.field6762[var66 - 1] = var68 == 0;
            }
            class18.field281 = null;
            return true;
        } else if (class320.field4571 == class18.field281) {
            class317.field4540 = 1;
            class92.field1521 = class285.field4130;
            class18.field281 = null;
            return true;
        } else if (class402.field5900 == class18.field281) {
            int var70 = class387.field5738.method1888((byte) 90);
            int var71 = class387.field5738.method1888((byte) 91);
            int var72 = class387.field5738.method1889(119);
            if (class317.method1989(1, var71)) {
                class403.method2514((byte) 127, var70, var72);
            }
            class18.field281 = null;
            return true;
        } else {
            int var73 = 40 % ((25 - arg0) / 37);
            if (class18.field281 == class114.field1816) {
                for (int var74 = 0; var74 < class390.field5783.length; var74++) {
                    if (class390.field5783[var74] != null) {
                        class390.field5783[var74].field320 = -1;
                    }
                }
                for (int var75 = 0; var75 < class132.field2030.length; var75++) {
                    if (class132.field2030[var75] != null) {
                        class132.field2030[var75].field320 = -1;
                    }
                }
                class18.field281 = null;
                return true;
            } else if (class18.field281 == class14.field239) {
                class478.method2861(-8496, class127.field1934);
                class18.field281 = null;
                return true;
            } else if (class98.field1596 == class18.field281) {
                int var76 = class387.field5738.method1868(0);
                int var77 = class387.field5738.method1888((byte) 96);
                int var78 = class387.field5738.method1873((byte) -113);
                if (class317.method1989(1, var76)) {
                    class372.method2383(var78, (byte) -20, var77);
                }
                class18.field281 = null;
                return true;
            } else if (class18.field281 == class133.field2040) {
                int var79 = class387.field5738.method1868(0);
                int var80 = class387.field5738.method1918((byte) 106);
                int var81 = class387.field5738.method1918((byte) -93);
                int var82 = class387.field5738.method1868(0) << 0;
                int var83 = class387.field5738.method1918((byte) 108);
                int var84 = class387.field5738.method1918((byte) 98);
                if (class317.method1989(1, var79)) {
                    class415.method2558(true, true, var81, var82, var80, var83, var84);
                }
                class18.field281 = null;
                return true;
            } else if (class322.field4927 == class18.field281) {
                int var85 = class387.field5738.method1891(false);
                int var86 = class387.field5738.method1870(-1945262512);
                int var87 = class387.field5738.method1918((byte) 72);
                String var88 = "";
                String var89 = var88;
                if ((var87 & 0x1) != 0) {
                    var88 = class387.field5738.method1879(30669);
                    if ((var87 & 0x2) == 0) {
                        var89 = var88;
                    } else {
                        var89 = class387.field5738.method1879(30669);
                    }
                }
                String var90 = class387.field5738.method1879(30669);
                if (var85 == 99) {
                    class105.method796(var90, (byte) 112);
                } else if (var89.equals("") || !class13.method109(true, var89)) {
                    class64.method569(2, var85, var90, var86, var88, var89);
                } else {
                    class18.field281 = null;
                    return true;
                }
                class18.field281 = null;
                return true;
            } else if (class212.field3065 == class18.field281) {
                class200.method1364(true, 84);
                class18.field281 = null;
                return true;
            } else if (class25.field442 == class18.field281) {
                class526.field7733.method2830(true);
                class493.field7192 += 32;
                class18.field281 = null;
                return true;
            } else if (class378.field5631 == class18.field281) {
                class200.field2918 = class387.field5738.method1868(0) * 30;
                class18.field281 = null;
                class371.field5563 = class285.field4130;
                return true;
            } else if (class466.field6855 == class18.field281) {
                int var91 = class387.field5738.method1870(-1945262512);
                int var92 = class387.field5738.method1906((byte) 120);
                int var93 = class387.field5738.method1888((byte) 97);
                if (class317.method1989(1, var93)) {
                    class78.method638(var92, var91, 68);
                }
                class18.field281 = null;
                return true;
            } else if (class44.field673 == class18.field281) {
                int var94 = class387.field5738.method1903((byte) 81);
                if (var94 == 65535) {
                    var94 = -1;
                }
                int var95 = class387.field5738.method1898(119);
                int var96 = class387.field5738.method1888((byte) 85);
                int var97 = class387.field5738.method1888((byte) 103);
                if (var97 == 65535) {
                    var97 = -1;
                }
                int var98 = class387.field5738.method1889(-34);
                if (class317.method1989(1, var96)) {
                    for (int var99 = var94; var99 <= var97; var99++) {
                        long var100 = ((long) var95 << 32) + ((long) var99);
                        class102 var102 = (class102) class392.field5803.method2485(72, var100);
                        class102 var103;
                        if (var102 != null) {
                            var103 = new class102(var98, var102.field1634);
                            var102.method2663(-122);
                        } else if (var99 == -1) {
                            var103 = new class102(var98, class421.method2578(-4179, var95).field957.field1634);
                        } else {
                            var103 = new class102(var98, -1);
                        }
                        class392.field5803.method2486(-101, var103, var100);
                    }
                }
                class18.field281 = null;
                return true;
            } else if (class380.field5664 == class18.field281) {
                int var104 = class387.field5738.method1903((byte) -128);
                int var105 = class387.field5738.method1873((byte) -11);
                int var106 = class387.field5738.method1870(-1945262512);
                if (class317.method1989(1, var104)) {
                    class183 var107 = (class183) class466.field6844.method2485(63, (long) var106);
                    class183 var108 = (class183) class466.field6844.method2485(51, (long) var105);
                    if (var108 != null) {
                        class456.method2743(var107 == null || var107.field2753 != var108.field2753, 83, false, var108);
                    }
                    if (var107 != null) {
                        var107.method2663(-125);
                        class466.field6844.method2486(-108, var107, (long) var105);
                    }
                    class58 var109 = class421.method2578(-4179, var106);
                    if (var109 != null) {
                        class139.method1027(var109, false);
                    }
                    class58 var110 = class421.method2578(-4179, var105);
                    if (var110 != null) {
                        class139.method1027(var110, false);
                        class162.method1171(var110, true, -121);
                    }
                    if (class341.field5207 != -1) {
                        class270.method1734(class341.field5207, 1, 120);
                    }
                }
                class18.field281 = null;
                return true;
            } else if (class432.field6298 == class18.field281) {
                int var111 = class387.field5738.method1870(-1945262512);
                class133.field2058 = class112.field1785.method1956(var111, 3);
                class18.field281 = null;
                return true;
            } else if (class18.field281 == class163.field2464) {
                class478.method2861(-8496, class18.field273);
                class18.field281 = null;
                return true;
            } else if (class469.field6907 == class18.field281) {
                int var112 = class387.field5738.method1868(0);
                int var113 = class387.field5738.method1918((byte) 75);
                boolean var114 = (var113 & 0x1) == 1;
                class133.method986(-5172, var112, var114);
                int var115 = class387.field5738.method1868(0);
                for (int var116 = 0; var116 < var115; var116++) {
                    int var117 = class387.field5738.method1903((byte) 7);
                    int var118 = class387.field5738.method1894(255);
                    if (var118 == 255) {
                        var118 = class387.field5738.method1870(-1945262512);
                    }
                    class160.method1162(var117 - 1, var116, var118, 1, var112, var114);
                }
                class265.field3830[class388.method2441(31, class101.field1612++)] = var112;
                class18.field281 = null;
                return true;
            } else if (class301.field4288 == class18.field281) {
                int var119 = class387.field5738.method1918((byte) -52);
                int var120 = var119 >> 5;
                int var121 = var119 & 0x1F;
                if (var121 == 0) {
                    class187.field2777[var120] = null;
                    class18.field281 = null;
                    return true;
                }
                class324 var122 = new class324();
                var122.field4969 = var121;
                var122.field4976 = class387.field5738.method1918((byte) -73);
                if (var122.field4976 >= 0 && var122.field4976 < class57.field829.length) {
                    if (var122.field4969 == 1 || var122.field4969 == 10) {
                        var122.field4972 = class387.field5738.method1868(0);
                        class387.field5738.field4333 += 6;
                    } else if (var122.field4969 >= 2 && var122.field4969 <= 6) {
                        if (var122.field4969 == 2) {
                            var122.field4971 = 64;
                            var122.field4968 = 64;
                        }
                        if (var122.field4969 == 3) {
                            var122.field4971 = 0;
                            var122.field4968 = 64;
                        }
                        if (var122.field4969 == 4) {
                            var122.field4971 = 128;
                            var122.field4968 = 64;
                        }
                        if (var122.field4969 == 5) {
                            var122.field4968 = 0;
                            var122.field4971 = 64;
                        }
                        if (var122.field4969 == 6) {
                            var122.field4968 = 128;
                            var122.field4971 = 64;
                        }
                        var122.field4969 = 2;
                        var122.field4970 = class387.field5738.method1918((byte) -104);
                        var122.field4971 += class387.field5738.method1868(0) - class483.field7082 << 7;
                        var122.field4968 += class387.field5738.method1868(0) - class465.field6840 << 7;
                        var122.field4967 = class387.field5738.method1918((byte) 118);
                        var122.field4975 = class387.field5738.method1868(0);
                    }
                    var122.field4964 = class387.field5738.method1868(0);
                    if (var122.field4964 == 65535) {
                        var122.field4964 = -1;
                    }
                    class187.field2777[var120] = var122;
                }
                class18.field281 = null;
                return true;
            } else if (class525.field7720 == class18.field281) {
                int var123 = class387.field5738.method1894(255);
                int var124 = class387.field5738.method1888((byte) 99);
                class526.field7733.method2828((byte) 93, var124, var123);
                class18.field281 = null;
                return true;
            } else if (class333.field5115 == class18.field281) {
                int var125 = class387.field5738.method1903((byte) -124);
                int var126 = class387.field5738.method1869((byte) 82);
                int var127 = class387.field5738.method1864(16698);
                if (class317.method1989(1, var126)) {
                    if (var127 == 2) {
                        class45.method346(25);
                    }
                    class341.field5207 = var125;
                    class525.method3103(var125, -69);
                    class31.method256(44, false);
                    class150.method1081(class341.field5207);
                    for (int var128 = 0; var128 < 100; var128++) {
                        class165.field2473[var128] = true;
                    }
                }
                class18.field281 = null;
                return true;
            } else if (class22.field387 == class18.field281) {
                String var129 = class387.field5738.method1879(30669);
                int var130 = class387.field5738.method1903((byte) -128);
                int var131 = class387.field5738.method1898(86);
                if (class317.method1989(1, var130)) {
                    class418.method2572((byte) -6, var131, var129);
                }
                class18.field281 = null;
                return true;
            } else if (class438.field6381 == class18.field281) {
                int var132 = class387.field5738.method1894(255);
                int var133 = var132 >> 2;
                int var134 = var132 & 0x3;
                int var135 = class113.field1798[var133];
                int var136 = class387.field5738.method1903((byte) -124);
                if (var136 == 65535) {
                    var136 = -1;
                }
                int var137 = class387.field5738.method1870(-1945262512);
                int var138 = var137 >> 28 & 0x3;
                int var139 = var137 >> 14 & 0x3FFF;
                int var140 = var139 - class483.field7082;
                int var141 = var137 & 0x3FFF;
                int var142 = var141 - class465.field6840;
                class267.method1707(var142, false, var136, var135, var140, var138, var134, var133);
                class18.field281 = null;
                return true;
            } else if (class18.field281 == class17.field269) {
                int var143 = class387.field5738.method1921((byte) -55);
                int var144 = class387.field5738.method1870(-1945262512);
                int var145 = class387.field5738.method1901(118);
                int var146 = class387.field5738.method1869((byte) -119);
                if (class317.method1989(1, var146)) {
                    class303.method1909(var144, var143, 3, var145);
                }
                class18.field281 = null;
                return true;
            } else if (class416.field6150 == class18.field281) {
                class527.method3113((byte) -102, class387.field5738, class133.field2060, class112.field1785);
                class18.field281 = null;
                return true;
            } else if (class18.field281 == class139.field2095) {
                class406.field5977 = class387.field5738.method1918((byte) 107);
                class18.field281 = null;
                return true;
            } else if (class343.field5236 == class18.field281) {
                boolean var147 = class387.field5738.method1918((byte) -66) == 1;
                String var148 = class387.field5738.method1879(30669);
                String var149 = var148;
                if (var147) {
                    var149 = class387.field5738.method1879(30669);
                }
                long var150 = (long) class387.field5738.method1868(0);
                long var152 = (long) class387.field5738.method1866(false);
                int var154 = class387.field5738.method1918((byte) 82);
                long var155 = (var150 << 32) + var152;
                boolean var157 = false;
                int var158 = 0;
                while (true) {
                    if (var158 >= 100) {
                        if (var154 <= 1) {
                            if (!(!class170.field2554 || class101.field1622) || class72.field1209) {
                                var157 = true;
                            } else if (class13.method109(true, var149)) {
                                var157 = true;
                            }
                        }
                        break;
                    }
                    if (class275.field3990[var158] == var155) {
                        var157 = true;
                        break;
                    }
                    var158++;
                }
                if (!var157 && class524.field7704 == 0) {
                    class275.field3990[class68.field1175] = var155;
                    class68.field1175 = (class68.field1175 + 1) % 100;
                    String var159 = class342.method2234(true, class105.method794(-97, class387.field5738));
                    if (var154 == 2) {
                        class160.method1154(-10444, "<img=1>" + var148, -1, "<img=1>" + var149, 0, null, var159, 7);
                    } else if (var154 == 1) {
                        class160.method1154(-10444, "<img=0>" + var148, -1, "<img=0>" + var149, 0, null, var159, 7);
                    } else {
                        class160.method1154(-10444, var148, -1, var149, 0, null, var159, 3);
                    }
                }
                class18.field281 = null;
                return true;
            } else if (class290.field4161 == class18.field281) {
                boolean var160 = class387.field5738.method1918((byte) -109) == 1;
                String var161 = class387.field5738.method1879(30669);
                String var162 = var161;
                if (var160) {
                    var162 = class387.field5738.method1879(30669);
                }
                int var163 = class387.field5738.method1918((byte) -37);
                int var164 = class387.field5738.method1868(0);
                boolean var165 = false;
                if (var163 <= 1 && class13.method109(true, var162)) {
                    var165 = true;
                }
                if (!var165 && class524.field7704 == 0) {
                    String var166 = class121.field1892.method1689(var164, (byte) -54).method3010(class387.field5738, false);
                    if (var163 == 2) {
                        class160.method1154(-10444, "<img=1>" + var161, var164, "<img=1>" + var162, 0, null, var166, 25);
                    } else if (var163 == 1) {
                        class160.method1154(-10444, "<img=0>" + var161, var164, "<img=0>" + var162, 0, null, var166, 25);
                    } else {
                        class160.method1154(-10444, var161, var164, var162, 0, null, var166, 25);
                    }
                }
                class18.field281 = null;
                return true;
            } else if (class343.field5229 == class18.field281) {
                int var167 = class387.field5738.method1868(0);
                int var168 = class387.field5738.method1870(-1945262512);
                if (class317.method1989(1, var167)) {
                    class488.method2925((byte) 116, 5, var168, 0, class64.field1128);
                }
                class18.field281 = null;
                return true;
            } else if (class347.field5261 == class18.field281) {
                String var169 = class387.field5738.method1879(30669);
                boolean var170 = class387.field5738.method1918((byte) -119) == 1;
                String var171;
                if (var170) {
                    var171 = class387.field5738.method1879(30669);
                } else {
                    var171 = var169;
                }
                int var172 = class387.field5738.method1868(0);
                byte var173 = class387.field5738.method1899((byte) 106);
                boolean var174 = false;
                if (var173 == -128) {
                    var174 = true;
                }
                if (var174) {
                    if (class22.field395 == 0) {
                        class18.field281 = null;
                        return true;
                    }
                    boolean var175 = false;
                    int var176;
                    for (var176 = 0; var176 < class22.field395 && (!class172.field2628[var176].field4199.equals(var171) || class172.field2628[var176].field4203 != var172); var176++) {
                    }
                    if (class22.field395 > var176) {
                        while ((class22.field395 - 1) > var176) {
                            class172.field2628[var176] = class172.field2628[var176 + 1];
                            var176++;
                        }
                        class22.field395--;
                        class172.field2628[class22.field395] = null;
                    }
                } else {
                    String var177 = class387.field5738.method1879(30669);
                    class294 var178 = new class294();
                    var178.field4205 = var169;
                    var178.field4199 = var171;
                    var178.field4202 = class343.method2237(var178.field4199, (byte) -57);
                    var178.field4203 = var172;
                    var178.field4204 = var177;
                    var178.field4200 = var173;
                    int var179;
                    for (var179 = class22.field395 - 1; var179 >= 0; var179--) {
                        int var180 = class172.field2628[var179].field4202.compareTo(var178.field4202);
                        if (var180 == 0) {
                            class172.field2628[var179].field4203 = var172;
                            class172.field2628[var179].field4200 = var173;
                            class172.field2628[var179].field4204 = var177;
                            if (var171.equals(class95.field1558.field1094)) {
                                class62.field1114 = var173;
                            }
                            class18.field281 = null;
                            class202.field2928 = class285.field4130;
                            return true;
                        }
                        if (var180 < 0) {
                            break;
                        }
                    }
                    if (class22.field395 >= class172.field2628.length) {
                        class18.field281 = null;
                        return true;
                    }
                    for (int var181 = class22.field395 - 1; var181 > var179; var181--) {
                        class172.field2628[var181 + 1] = class172.field2628[var181];
                    }
                    if (class22.field395 == 0) {
                        class172.field2628 = new class294[100];
                    }
                    class172.field2628[var179 + 1] = var178;
                    class22.field395++;
                    if (var171.equals(class95.field1558.field1094)) {
                        class62.field1114 = var173;
                    }
                }
                class18.field281 = null;
                class202.field2928 = class285.field4130;
                return true;
            } else if (class18.field281 == class170.field2546) {
                class478.method2861(-8496, class358.field5426);
                class18.field281 = null;
                return true;
            } else if (class408.field5988 == class18.field281) {
                int var182 = class387.field5738.method1868(0);
                int var183 = class387.field5738.method1903((byte) 54);
                int var184 = class387.field5738.method1870(-1945262512);
                int var185 = class387.field5738.method1869((byte) -125);
                if (class317.method1989(1, var182)) {
                    class27.method219(30727, var184, (var183 << 16) + var185);
                }
                class18.field281 = null;
                return true;
            } else if (class453.field6715 == class18.field281) {
                class478.method2861(-8496, class92.field1518);
                class18.field281 = null;
                return true;
            } else if (class182.field2742 == class18.field281) {
                class478.method2861(-8496, class397.field5835);
                class18.field281 = null;
                return true;
            } else if (class259.field3735 == class18.field281) {
                int var186 = class387.field5738.method1869((byte) -122);
                int var187 = class387.field5738.method1861((byte) 111);
                if (class317.method1989(1, var186)) {
                    class529.field7812 = var187;
                }
                class18.field281 = null;
                return true;
            } else if (class18.field281 == class147.field2162) {
                int var188 = class387.field5738.method1868(0);
                if (var188 == 65535) {
                    var188 = -1;
                }
                int var189 = class387.field5738.method1918((byte) -81);
                int var190 = class387.field5738.method1868(0);
                int var191 = class387.field5738.method1918((byte) -58);
                class513.method3041(27663, var189, var190, var188, var191);
                class18.field281 = null;
                return true;
            } else if (class37.field572 == class18.field281) {
                class154.method1119(-95);
                class18.field281 = null;
                return false;
            } else if (class18.field281 == class167.field2504) {
                int var192 = class387.field5738.method1918((byte) 79);
                boolean var193 = (var192 & 0x1) == 1;
                String var194 = class387.field5738.method1879(30669);
                String var195 = class387.field5738.method1879(30669);
                if (var195.equals("")) {
                    var195 = var194;
                }
                String var196 = class387.field5738.method1879(30669);
                String var197 = class387.field5738.method1879(30669);
                if (var197.equals("")) {
                    var197 = var196;
                }
                if (var193) {
                    for (int var198 = 0; var198 < class520.field7636; var198++) {
                        if (class173.field2656[var198].equals(var197)) {
                            class83.field1361[var198] = var194;
                            class173.field2656[var198] = var195;
                            class451.field6586[var198] = var196;
                            class408.field6017[var198] = var197;
                            break;
                        }
                    }
                } else {
                    class83.field1361[class520.field7636] = var194;
                    class173.field2656[class520.field7636] = var195;
                    class451.field6586[class520.field7636] = var196;
                    class408.field6017[class520.field7636] = var197;
                    class374.field5600[class520.field7636] = class388.method2441(2, var192) == 2;
                    class520.field7636++;
                }
                class92.field1521 = class285.field4130;
                class18.field281 = null;
                return true;
            } else if (class453.field6711 == class18.field281) {
                int var199 = class387.field5738.method1918((byte) 127);
                if (class387.field5738.method1918((byte) 126) == 0) {
                    class131.field2024[var199] = new class7();
                } else {
                    class387.field5738.field4333--;
                    class131.field2024[var199] = new class7(class387.field5738);
                }
                class18.field281 = null;
                class415.field6110 = class285.field4130;
                return true;
            } else if (class18.field281 == class178.field2701) {
                int var200 = class387.field5738.method1898(112);
                int var201 = class387.field5738.method1869((byte) 33);
                int var202 = class387.field5738.method1903((byte) 123);
                if (var202 == 65535) {
                    var202 = -1;
                }
                int var203 = class387.field5738.method1888((byte) 89);
                int var204 = class387.field5738.method1903((byte) -124);
                if (var204 == 65535) {
                    var204 = -1;
                }
                if (class317.method1989(1, var203)) {
                    for (int var205 = var204; var205 <= var202; var205++) {
                        long var206 = ((long) var200 << 32) + ((long) var205);
                        class102 var208 = (class102) class392.field5803.method2485(55, var206);
                        class102 var209;
                        if (var208 != null) {
                            var209 = new class102(var208.field1626, var201);
                            var208.method2663(-124);
                        } else if (var205 == -1) {
                            var209 = new class102(class421.method2578(-4179, var200).field957.field1626, var201);
                        } else {
                            var209 = new class102(0, var201);
                        }
                        class392.field5803.method2486(-115, var209, var206);
                    }
                }
                class18.field281 = null;
                return true;
            } else if (class425.field6228 == class18.field281) {
                int var210 = class387.field5738.method1869((byte) 36);
                int var211 = class387.field5738.method1903((byte) -127);
                int var212 = class387.field5738.method1873((byte) -109);
                int var213 = class387.field5738.method1889(-55);
                if (class317.method1989(1, var210)) {
                    class488.method2925((byte) 120, 5, var213, var212, var211);
                }
                class18.field281 = null;
                return true;
            } else if (class480.field7035 == class18.field281) {
                int var214 = class387.field5738.method1898(116);
                int var215 = class387.field5738.method1868(0);
                class526.field7733.method2827(-31366, var215, var214);
                class18.field281 = null;
                return true;
            } else if (class522.field7663 == class18.field281) {
                class321.field4604 = class387.field5738.method1901(118);
                class371.field5563 = class285.field4130;
                class18.field281 = null;
                return true;
            } else if (class420.field6184 == class18.field281) {
                int var216 = class387.field5738.method1869((byte) -112);
                if (var216 == 65535) {
                    var216 = -1;
                }
                int var217 = class387.field5738.method1888((byte) 97);
                int var218 = class387.field5738.method1889(95);
                if (class317.method1989(1, var217)) {
                    class488.method2925((byte) 116, 2, var218, -1, var216);
                }
                class18.field281 = null;
                return true;
            } else if (class500.field7354 == class18.field281) {
                class196.method1359(0);
                class18.field281 = null;
                return false;
            } else if (class256.field3690 == class18.field281) {
                class202.field2928 = class285.field4130;
                if (class133.field2060 == 0) {
                    class18.field281 = null;
                    class22.field395 = 0;
                    class298.field4258 = null;
                    class418.field6169 = null;
                    class172.field2628 = null;
                    return true;
                }
                class298.field4258 = class387.field5738.method1879(30669);
                boolean var219 = class387.field5738.method1918((byte) 86) == 1;
                if (var219) {
                    class387.field5738.method1879(30669);
                }
                long var220 = class387.field5738.method1917((byte) 4);
                class418.field6169 = class41.method317((byte) 26, var220);
                class443.field6495 = class387.field5738.method1899((byte) 75);
                int var222 = class387.field5738.method1918((byte) 104);
                if (var222 == 255) {
                    class18.field281 = null;
                    return true;
                }
                class22.field395 = var222;
                class294[] var223 = new class294[100];
                for (int var224 = 0; var224 < class22.field395; var224++) {
                    var223[var224] = new class294();
                    var223[var224].field4205 = class387.field5738.method1879(30669);
                    boolean var230 = class387.field5738.method1918((byte) -75) == 1;
                    if (var230) {
                        var223[var224].field4199 = class387.field5738.method1879(30669);
                    } else {
                        var223[var224].field4199 = var223[var224].field4205;
                    }
                    var223[var224].field4202 = class343.method2237(var223[var224].field4199, (byte) -57);
                    var223[var224].field4203 = class387.field5738.method1868(0);
                    var223[var224].field4200 = class387.field5738.method1899((byte) -117);
                    var223[var224].field4204 = class387.field5738.method1879(30669);
                    if (var223[var224].field4199.equals(class95.field1558.field1094)) {
                        class62.field1114 = var223[var224].field4200;
                    }
                }
                boolean var225 = false;
                int var226 = class22.field395;
                while (var226 > 0) {
                    var226--;
                    boolean var227 = true;
                    for (int var228 = 0; var228 < var226; var228++) {
                        if (var223[var228].field4202.compareTo(var223[var228 + 1].field4202) > 0) {
                            class294 var229 = var223[var228];
                            var223[var228] = var223[var228 + 1];
                            var223[var228 + 1] = var229;
                            var227 = false;
                        }
                    }
                    if (var227) {
                        break;
                    }
                }
                class172.field2628 = var223;
                class18.field281 = null;
                return true;
            } else if (class372.field5576 == class18.field281) {
                int var231 = class387.field5738.method1898(104);
                int var232 = class387.field5738.method1868(0);
                int var233 = class387.field5738.method1869((byte) -125);
                if (class317.method1989(1, var232)) {
                    class322.method2091(var233, var231, -13815);
                }
                class18.field281 = null;
                return true;
            } else if (class442.field6488 == class18.field281) {
                boolean var234 = class387.field5738.method1918((byte) -61) == 1;
                String var235 = class387.field5738.method1879(30669);
                String var236 = var235;
                if (var234) {
                    var236 = class387.field5738.method1879(30669);
                }
                long var237 = class387.field5738.method1917((byte) 4);
                long var239 = (long) class387.field5738.method1868(0);
                long var241 = (long) class387.field5738.method1866(false);
                int var243 = class387.field5738.method1918((byte) -110);
                long var244 = (var239 << 32) + var241;
                boolean var246 = false;
                int var247 = 0;
                while (true) {
                    if (var247 >= 100) {
                        if (var243 <= 1) {
                            if (!(!class170.field2554 || class101.field1622) || class72.field1209) {
                                var246 = true;
                            } else if (class13.method109(true, var236)) {
                                var246 = true;
                            }
                        }
                        break;
                    }
                    if (class275.field3990[var247] == var244) {
                        var246 = true;
                        break;
                    }
                    var247++;
                }
                if (!var246 && class524.field7704 == 0) {
                    class275.field3990[class68.field1175] = var244;
                    class68.field1175 = (class68.field1175 + 1) % 100;
                    String var248 = class342.method2234(true, class105.method794(81, class387.field5738));
                    if (var243 == 2 || var243 == 3) {
                        class160.method1154(-10444, "<img=1>" + var235, -1, "<img=1>" + var236, 0, class223.method1471(var237, (byte) -8), var248, 9);
                    } else if (var243 == 1) {
                        class160.method1154(-10444, "<img=0>" + var235, -1, "<img=0>" + var236, 0, class223.method1471(var237, (byte) -8), var248, 9);
                    } else {
                        class160.method1154(-10444, var235, -1, var236, 0, class223.method1471(var237, (byte) -8), var248, 9);
                    }
                }
                class18.field281 = null;
                return true;
            } else if (class89.field1494 == class18.field281) {
                int var249 = class387.field5738.method1898(122);
                int var250 = class387.field5738.method1888((byte) 119);
                class526.field7733.method2828((byte) 96, var250, var249);
                class18.field281 = null;
                return true;
            } else if (class6.field84 == class18.field281) {
                int var251 = class387.field5738.method1918((byte) -40);
                int var252 = class387.field5738.method1864(16698);
                int var253 = class387.field5738.method1898(87);
                class108.field1685[var252] = var253;
                class229.field3351[var252] = var251;
                class369.field5524[var252] = 1;
                int var254 = class344.field5245[var252] - 1;
                for (int var255 = 0; var255 < var254; var255++) {
                    if (class471.field6929[var255] <= var253) {
                        class369.field5524[var252] = var255 + 2;
                    }
                }
                class310.field4448[class388.method2441(31, class331.field5100++)] = var252;
                class18.field281 = null;
                return true;
            } else if (class412.field6056 == class18.field281) {
                class478.method2861(-8496, class290.field4165);
                class18.field281 = null;
                return true;
            } else if (class226.field3299 == class18.field281) {
                class402.field5904 = class387.field5738.method1861((byte) 111);
                class509.field7439 = class387.field5738.method1894(255);
                class18.field281 = null;
                return true;
            } else if (class33.field518 == class18.field281) {
                boolean var256 = class387.field5738.method1918((byte) -69) == 1;
                String var257 = class387.field5738.method1879(30669);
                String var258 = var257;
                if (var256) {
                    var258 = class387.field5738.method1879(30669);
                }
                int var259 = class387.field5738.method1918((byte) -119);
                boolean var260 = false;
                if (var259 <= 1) {
                    if (!(!class170.field2554 || class101.field1622) || class72.field1209) {
                        var260 = true;
                    } else if (var259 <= 1 && class13.method109(true, var258)) {
                        var260 = true;
                    }
                }
                if (!var260 && class524.field7704 == 0) {
                    String var261 = class342.method2234(true, class105.method794(89, class387.field5738));
                    if (var259 == 2) {
                        class160.method1154(-10444, "<img=1>" + var257, -1, "<img=1>" + var258, 0, null, var261, 24);
                    } else if (var259 == 1) {
                        class160.method1154(-10444, "<img=0>" + var257, -1, "<img=0>" + var258, 0, null, var261, 24);
                    } else {
                        class160.method1154(-10444, var257, -1, var258, 0, null, var261, 24);
                    }
                }
                class18.field281 = null;
                return true;
            } else if (class48.field729 == class18.field281) {
                String var262 = class387.field5738.method1879(30669);
                String var263 = class342.method2234(true, class105.method794(-37, class387.field5738));
                class64.method569(2, 6, var263, 0, var262, var262);
                class18.field281 = null;
                return true;
            } else if (class226.field3303 == class18.field281) {
                int var264 = class387.field5738.method1918((byte) 113);
                int var265 = class387.field5738.method1894(255);
                if (var265 == 255) {
                    var265 = -1;
                    var264 = -1;
                }
                class317.method1990(var265, (byte) -80, var264);
                class18.field281 = null;
                return true;
            } else if (class504.field7403 == class18.field281) {
                int var266 = class387.field5738.method1864(16698);
                int var267 = class387.field5738.method1868(0);
                boolean var268 = (var266 & 0x1) == 1;
                class365.method2353(-111, var268, var267);
                class265.field3830[class388.method2441(31, class101.field1612++)] = var267;
                class18.field281 = null;
                return true;
            } else if (class523.field7696 == class18.field281) {
                int var269 = class387.field5738.method1873((byte) -111);
                int var270 = class387.field5738.method1888((byte) 87);
                int var271 = class387.field5738.method1888((byte) 103);
                if (class317.method1989(1, var271)) {
                    class381.method2416(var270, var269, 1);
                }
                class18.field281 = null;
                return true;
            } else if (class439.field6397 == class18.field281) {
                class478.method2861(-8496, class359.field5430);
                class18.field281 = null;
                return true;
            } else if (class465.field6839 == class18.field281) {
                String var272 = class387.field5738.method1879(30669);
                int var273 = class387.field5738.method1888((byte) 106);
                int var274 = class387.field5738.method1868(0);
                if (class317.method1989(1, var274)) {
                    class519.method3070(var273, -20142, var272);
                }
                class18.field281 = null;
                return true;
            } else if (client.field2878 == class18.field281) {
                class478.method2861(-8496, class94.field1537);
                class18.field281 = null;
                return true;
            } else if (class437.field6345 == class18.field281) {
                int var275 = class387.field5738.method1903((byte) -126);
                int var276 = class387.field5738.method1888((byte) 111);
                int var277 = class387.field5738.method1868(0);
                if (class317.method1989(1, var276)) {
                    class211.method1411(var277, var275, 0, false);
                }
                class18.field281 = null;
                return true;
            } else if (class18.field281 == class134.field2065) {
                int var278 = class387.field5738.method1868(0);
                int var279 = class387.field5738.method1870(-1945262512);
                if (class317.method1989(1, var278)) {
                    class183 var280 = (class183) class466.field6844.method2485(104, (long) var279);
                    if (var280 != null) {
                        class456.method2743(true, 68, false, var280);
                    }
                    if (class259.field3741 != null) {
                        class139.method1027(class259.field3741, false);
                        class259.field3741 = null;
                    }
                }
                class18.field281 = null;
                return true;
            } else if (class4.field74 == class18.field281) {
                class341.method2225((byte) -77);
                class18.field281 = null;
                return false;
            } else if (class18.field281 == class151.field2308) {
                byte var281 = class387.field5738.method1922((byte) -45);
                int var282 = class387.field5738.method1903((byte) -127);
                int var283 = class387.field5738.method1903((byte) 17);
                if (class317.method1989(1, var282)) {
                    class381.method2416(var283, var281, 1);
                }
                class18.field281 = null;
                return true;
            } else if (class206.field2964 == class18.field281) {
                int var284 = class387.field5738.method1903((byte) -128);
                int var285 = class387.field5738.method1903((byte) -124);
                if (var285 == 65535) {
                    var285 = -1;
                }
                int var286 = class387.field5738.method1898(83);
                if (class317.method1989(1, var284)) {
                    class488.method2925((byte) 122, 1, var286, -1, var285);
                }
                class18.field281 = null;
                return true;
            } else if (class524.field7703 == class18.field281) {
                class200.method1364(false, 112);
                class18.field281 = null;
                return true;
            } else if (class390.field5793 == class18.field281) {
                int var287 = class387.field5738.method1868(0);
                if (class317.method1989(1, var287)) {
                    class8.method60(-40);
                }
                class18.field281 = null;
                return true;
            } else if (class275.field3985 == class18.field281) {
                class478.method2861(-8496, class455.field6734);
                class18.field281 = null;
                return true;
            } else if (class246.field3570 == class18.field281) {
                class314.method1985(0);
                class18.field281 = null;
                return true;
            } else if (class31.field498 == class18.field281) {
                int var288 = class387.field5738.method1894(255);
                int var289 = class387.field5738.method1869((byte) 111);
                if (var289 == 65535) {
                    var289 = -1;
                }
                int var290 = class387.field5738.method1918((byte) -120);
                class295.method1824(var288, -9574, var290, var289);
                class18.field281 = null;
                return true;
            } else if (class246.field3565 == class18.field281) {
                int var291 = class387.field5738.method1861((byte) 111);
                int var292 = class387.field5738.method1903((byte) -125);
                if (var292 == 65535) {
                    var292 = -1;
                }
                int var293 = class387.field5738.method1902((byte) 22);
                class310.method1941(-9434, var291, var292, var293);
                class18.field281 = null;
                return true;
            } else if (class412.field6070 == class18.field281) {
                int var294 = class387.field5738.method1868(0);
                if (class317.method1989(1, var294)) {
                    class379.method2405(-1);
                }
                class18.field281 = null;
                return true;
            } else if (class414.field6084 == class18.field281) {
                class387.field5738.field4333 += 28;
                if (class387.field5738.method1916(255)) {
                    class239.method1553(class387.field5738.field4333 - 28, -22189, class387.field5738);
                }
                class18.field281 = null;
                return true;
            } else if (class390.field5791 == class18.field281) {
                int var295 = class387.field5738.method1861((byte) 111);
                int var296 = class387.field5738.method1868(0);
                int var297 = class387.field5738.method1888((byte) 114);
                int var298 = class387.field5738.method1888((byte) 123);
                int var299 = class387.field5738.method1889(-60);
                boolean var300 = (var295 & 0x80) != 0;
                if ((var299 >> 30) != 0) {
                    int var331 = (var299 & 0x3AF90A86) >> 28;
                    int var332 = ((var299 & 0xFFFC34A) >> 14) - class483.field7082;
                    int var333 = (var299 & 0x3FFF) - class465.field6840;
                    if (var332 >= 0 && var333 >= 0 && var332 < class237.field3436 && var333 < class83.field1366) {
                        int var334 = var332 * 128 + 64;
                        int var335 = var333 * 128 + 64;
                        int var336 = var331;
                        if (var331 < 3 && class72.method606(var332, var333, (byte) -90)) {
                            var336 = var331 + 1;
                        }
                        class37 var337 = new class37(var297, 0, class180.field2734, var331, var336, var334, class259.method1646(var335, var334, 851701031, var331) - var296, var335, var332, var332, var333, var333, var295);
                        class91.field1503.method2270(0, new class212(var337));
                    }
                } else if (var299 >> 29 != 0) {
                    int var301 = var299 & 0xFFFF;
                    class13 var302 = class132.field2030[var301];
                    if (var302 != null) {
                        if (var297 == 65535) {
                            var297 = -1;
                        }
                        boolean var303 = true;
                        int var304 = var300 ? var302.field372 : var302.field359;
                        if (var297 != -1 && var304 != -1) {
                            if (var297 == var304) {
                                class246 var309 = class450.field6582.method1475(var297, true);
                                if (var309.field3543 && var309.field3547 != -1) {
                                    class357 var310 = class311.field4455.method1233(true, var309.field3547);
                                    int var311 = var310.field5404;
                                    if (var311 == 0 || var311 == 2) {
                                        var303 = false;
                                    } else if (var311 == 1) {
                                        var303 = true;
                                    }
                                }
                            } else {
                                class246 var305 = class450.field6582.method1475(var297, true);
                                class246 var306 = class450.field6582.method1475(var304, true);
                                if (var305.field3547 != -1 && var306.field3547 != -1) {
                                    class357 var307 = class311.field4455.method1233(true, var305.field3547);
                                    class357 var308 = class311.field4455.method1233(true, var306.field3547);
                                    if (var308.field5389 > var307.field5389) {
                                        var303 = false;
                                    }
                                }
                            }
                        }
                        if (var303) {
                            if (var300) {
                                var302.field321 = 1;
                                var302.field391 = var295 & 0x7;
                                var302.field324 = var296;
                                var302.field372 = var297;
                                var302.field380 = 0;
                                var302.field327 = 0;
                                var302.field333 = class180.field2734 + var298;
                                if (class180.field2734 < var302.field333) {
                                    var302.field380 = -1;
                                }
                                if (var302.field372 != -1 && class180.field2734 == var302.field333) {
                                    int var312 = class450.field6582.method1475(var302.field372, true).field3547;
                                    if (var312 != -1) {
                                        class357 var313 = class311.field4455.method1233(true, var312);
                                        if (var313 != null && var313.field5395 != null) {
                                            class435.method2635(var302.field5538, 232, var302.field5539, 0, var313, false, var302.field5529);
                                        }
                                    }
                                }
                            } else {
                                var302.field351 = 0;
                                var302.field316 = 1;
                                var302.field396 = class180.field2734 + var298;
                                var302.field360 = 0;
                                var302.field359 = var297;
                                var302.field381 = var295 & 0x7;
                                var302.field346 = var296;
                                if (var302.field396 > class180.field2734) {
                                    var302.field360 = -1;
                                }
                                if (var302.field359 != -1 && class180.field2734 == var302.field396) {
                                    int var314 = class450.field6582.method1475(var302.field359, true).field3547;
                                    if (var314 != -1) {
                                        class357 var315 = class311.field4455.method1233(true, var314);
                                        if (var315 != null && var315.field5395 != null) {
                                            class435.method2635(var302.field5538, 232, var302.field5539, 0, var315, false, var302.field5529);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if ((var299 >> 28) != 0) {
                    int var316 = var299 & 0xFFFF;
                    class62 var317;
                    if (class64.field1128 == var316) {
                        var317 = class95.field1558;
                    } else {
                        var317 = class390.field5783[var316];
                    }
                    if (var317 != null) {
                        if (var297 == 65535) {
                            var297 = -1;
                        }
                        boolean var318 = true;
                        int var319 = var300 ? var317.field372 : var317.field359;
                        if (var297 != -1 && var319 != -1) {
                            if (var297 == var319) {
                                class246 var320 = class450.field6582.method1475(var297, true);
                                if (var320.field3543 && var320.field3547 != -1) {
                                    class357 var321 = class311.field4455.method1233(true, var320.field3547);
                                    int var322 = var321.field5404;
                                    if (var322 == 0 || var322 == 2) {
                                        var318 = false;
                                    } else if (var322 == 1) {
                                        var318 = true;
                                    }
                                }
                            } else {
                                class246 var323 = class450.field6582.method1475(var297, true);
                                class246 var324 = class450.field6582.method1475(var319, true);
                                if (var323.field3547 != -1 && var324.field3547 != -1) {
                                    class357 var325 = class311.field4455.method1233(true, var323.field3547);
                                    class357 var326 = class311.field4455.method1233(true, var324.field3547);
                                    if (var326.field5389 > var325.field5389) {
                                        var318 = false;
                                    }
                                }
                            }
                        }
                        if (var318) {
                            if (var300) {
                                var317.field372 = var297;
                                var317.field324 = var296;
                                var317.field321 = 1;
                                var317.field327 = 0;
                                var317.field380 = 0;
                                var317.field391 = var295 & 0x7;
                                var317.field333 = class180.field2734 + var298;
                                if (var317.field372 == 65535) {
                                    var317.field372 = -1;
                                }
                                if (class180.field2734 < var317.field333) {
                                    var317.field380 = -1;
                                }
                                if (var317.field372 != -1 && class180.field2734 == var317.field333) {
                                    int var329 = class450.field6582.method1475(var317.field372, true).field3547;
                                    if (var329 != -1) {
                                        class357 var330 = class311.field4455.method1233(true, var329);
                                        if (var330 != null && var330.field5395 != null) {
                                            class435.method2635(var317.field5538, 232, var317.field5539, 0, var330, class95.field1558 == var317, var317.field5529);
                                        }
                                    }
                                }
                            } else {
                                var317.field316 = 1;
                                var317.field360 = 0;
                                var317.field381 = var295 & 0x7;
                                var317.field359 = var297;
                                var317.field351 = 0;
                                var317.field396 = class180.field2734 + var298;
                                var317.field346 = var296;
                                if (class180.field2734 < var317.field396) {
                                    var317.field360 = -1;
                                }
                                if (var317.field359 == 65535) {
                                    var317.field359 = -1;
                                }
                                if (var317.field359 != -1 && class180.field2734 == var317.field396) {
                                    int var327 = class450.field6582.method1475(var317.field359, true).field3547;
                                    if (var327 != -1) {
                                        class357 var328 = class311.field4455.method1233(true, var327);
                                        if (var328 != null && var328.field5395 != null) {
                                            class435.method2635(var317.field5538, 232, var317.field5539, 0, var328, class95.field1558 == var317, var317.field5529);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                class18.field281 = null;
                return true;
            } else if (class26.field448 == class18.field281) {
                class478.method2861(-8496, class266.field3837);
                class18.field281 = null;
                return true;
            } else if (class522.field7676 == class18.field281) {
                int var338 = class387.field5738.method1870(-1945262512);
                int var339 = class387.field5738.method1903((byte) -128);
                int var340 = class387.field5738.method1864(16698);
                int var341 = class387.field5738.method1888((byte) 98);
                if (class317.method1989(1, var339)) {
                    class183 var342 = (class183) class466.field6844.method2485(12, (long) var338);
                    if (var342 != null) {
                        class456.method2743(var342.field2753 != var341, 91, false, var342);
                    }
                    class172.method1229(false, var338, 0, var340, var341);
                }
                class18.field281 = null;
                return true;
            } else if (class74.field1241 == class18.field281) {
                class520.field7636 = class387.field5738.method1918((byte) -117);
                for (int var343 = 0; var343 < class520.field7636; var343++) {
                    class83.field1361[var343] = class387.field5738.method1879(30669);
                    class173.field2656[var343] = class387.field5738.method1879(30669);
                    if (class173.field2656[var343].equals("")) {
                        class173.field2656[var343] = class83.field1361[var343];
                    }
                    class451.field6586[var343] = class387.field5738.method1879(30669);
                    class408.field6017[var343] = class387.field5738.method1879(30669);
                    if (class408.field6017[var343].equals("")) {
                        class408.field6017[var343] = class451.field6586[var343];
                    }
                    class374.field5600[var343] = false;
                }
                class18.field281 = null;
                class92.field1521 = class285.field4130;
                return true;
            } else if (class482.field7068 == class18.field281) {
                if (class320.field4577 != null) {
                    class412.method2542(-1, false, -1, (byte) 113, class397.field5830.field124);
                }
                byte[] var344 = new byte[class133.field2060];
                class387.field5738.method2859(0, class133.field2060, var344, -124);
                String var345 = class331.method2188(false, 0, var344, class133.field2060);
                class261.method1660((byte) -54, var345, true, class112.field1785, class399.field5865 == 1);
                class18.field281 = null;
                return true;
            } else if (class439.field6406 == class18.field281) {
                class472.field6958 = class387.field5738.method1918((byte) 95);
                class371.field5563 = class285.field4130;
                class18.field281 = null;
                return true;
            } else if (class18.field281 == class119.field1875) {
                class478.method2861(-8496, class353.field5342);
                class18.field281 = null;
                return true;
            } else if (class308.field4398 == class18.field281) {
                class478.method2861(-8496, class475.field6990);
                class18.field281 = null;
                return true;
            } else if (class526.field7730 == class18.field281) {
                class16.field248 = class387.field5738.method1899((byte) 74) << 3;
                class382.field5686 = class387.field5738.method1922((byte) -116) << 3;
                class367.field5509 = class387.field5738.method1864(16698);
                class18.field281 = null;
                return true;
            } else if (class93.field1528 == class18.field281) {
                int var346 = class387.field5738.method1868(0);
                int var347 = class387.field5738.method1918((byte) -36);
                boolean var348 = (var347 & 0x1) == 1;
                while (class133.field2060 > class387.field5738.field4333) {
                    int var349 = class387.field5738.method1891(false);
                    int var350 = class387.field5738.method1868(0);
                    int var351 = 0;
                    if (var350 != 0) {
                        var351 = class387.field5738.method1918((byte) -49);
                        if (var351 == 255) {
                            var351 = class387.field5738.method1870(-1945262512);
                        }
                    }
                    class160.method1162(var350 - 1, var349, var351, 1, var346, var348);
                }
                class265.field3830[class388.method2441(class101.field1612++, 31)] = var346;
                class18.field281 = null;
                return true;
            } else if (class18.field281 == class132.field2034) {
                boolean var352 = class387.field5738.method1918((byte) -107) == 1;
                String var353 = class387.field5738.method1879(30669);
                String var354 = var353;
                if (var352) {
                    var354 = class387.field5738.method1879(30669);
                }
                long var355 = class387.field5738.method1917((byte) 4);
                long var357 = (long) class387.field5738.method1868(0);
                long var359 = (long) class387.field5738.method1866(false);
                int var361 = class387.field5738.method1918((byte) -102);
                int var362 = class387.field5738.method1868(0);
                long var363 = (var357 << 32) + var359;
                boolean var365 = false;
                int var366 = 0;
                while (true) {
                    if (var366 >= 100) {
                        if (var361 <= 1 && class13.method109(true, var354)) {
                            var365 = true;
                        }
                        break;
                    }
                    if (class275.field3990[var366] == var363) {
                        var365 = true;
                        break;
                    }
                    var366++;
                }
                if (!var365 && class524.field7704 == 0) {
                    class275.field3990[class68.field1175] = var363;
                    class68.field1175 = (class68.field1175 + 1) % 100;
                    String var367 = class121.field1892.method1689(var362, (byte) -104).method3010(class387.field5738, false);
                    if (var361 == 2) {
                        class160.method1154(-10444, "<img=1>" + var353, var362, "<img=1>" + var354, 0, class223.method1471(var355, (byte) -8), var367, 20);
                    } else if (var361 == 1) {
                        class160.method1154(-10444, "<img=0>" + var353, var362, "<img=0>" + var354, 0, class223.method1471(var355, (byte) -8), var367, 20);
                    } else {
                        class160.method1154(-10444, var353, var362, var354, 0, class223.method1471(var355, (byte) -8), var367, 20);
                    }
                }
                class18.field281 = null;
                return true;
            } else if (class18.field281 == class143.field2117) {
                int var368 = class387.field5738.method1870(-1945262512);
                int var369 = class387.field5738.method1903((byte) 95);
                if (var369 == 65535) {
                    var369 = -1;
                }
                int var370 = class387.field5738.method1903((byte) 49);
                int var371 = class387.field5738.method1889(-44);
                if (class317.method1989(1, var370)) {
                    class378.method2399((byte) 44, var368, var369, var371);
                    class172 var372 = class8.field111.method3077(-124, var369);
                    class370.method2371(20545, var372.field2565, var372.field2594, var372.field2598, var368);
                    class139.method1024(var372.field2567, var372.field2622, -125, var372.field2585, var368);
                }
                class18.field281 = null;
                return true;
            } else if (class43.field656 == class18.field281) {
                int var373 = class387.field5738.method1903((byte) -126);
                String var374 = class387.field5738.method1879(30669);
                int var375 = class387.field5738.method1869((byte) 18);
                if (class317.method1989(1, var373)) {
                    class519.method3070(var375, -20142, var374);
                }
                class18.field281 = null;
                return true;
            } else if (class420.field6180 == class18.field281) {
                int var376 = class387.field5738.method1868(0);
                int var377 = class387.field5738.method1918((byte) -55);
                int var378 = class387.field5738.method1918((byte) -109);
                int var379 = class387.field5738.method1868(0) << 0;
                int var380 = class387.field5738.method1918((byte) 126);
                int var381 = class387.field5738.method1918((byte) -91);
                if (class317.method1989(1, var376)) {
                    class206.method1383(-19442, var381, var379, var378, var377, var380);
                }
                class18.field281 = null;
                return true;
            } else if (class253.field3643 == class18.field281) {
                class356.method2299(class387.field5738.method1879(30669), (byte) -69);
                class18.field281 = null;
                return true;
            } else if (class353.field5344 == class18.field281) {
                int var382 = class387.field5738.method1889(-126);
                int var383 = class387.field5738.method1888((byte) 114);
                int var384 = class387.field5738.method1888((byte) 127);
                int var385 = class387.field5738.method1868(0);
                int var386 = class387.field5738.method1903((byte) -125);
                if (class317.method1989(1, var383)) {
                    class488.method2925((byte) 115, 7, var382, var386, var384 << 16 | var385);
                }
                class18.field281 = null;
                return true;
            } else if (class523.field7699 == class18.field281) {
                class27.field457 = class133.field2060 > 2 ? class387.field5738.method1879(30669) : class471.field6939.method1273(true, class370.field5530);
                class505.field7407 = class133.field2060 > 0 ? class387.field5738.method1868(0) : -1;
                if (class505.field7407 == 65535) {
                    class505.field7407 = -1;
                }
                class18.field281 = null;
                return true;
            } else if (class18.field281 == class160.field2423) {
                int var387 = class387.field5738.method1868(0);
                String var388 = class387.field5738.method1879(30669);
                Object[] var389 = new Object[var388.length() + 1];
                for (int var390 = var388.length() - 1; var390 >= 0; var390--) {
                    if (var388.charAt(var390) == 's') {
                        var389[var390 + 1] = class387.field5738.method1879(30669);
                    } else {
                        var389[var390 + 1] = Integer.valueOf(class387.field5738.method1870(-1945262512));
                    }
                }
                var389[0] = Integer.valueOf(class387.field5738.method1870(-1945262512));
                if (class317.method1989(1, var387)) {
                    class519 var391 = new class519();
                    var391.field7627 = var389;
                    class150.method1086(var391);
                }
                class18.field281 = null;
                return true;
            } else if (class18.field281 == class106.field1664) {
                boolean var392 = class387.field5738.method1918((byte) 82) == 1;
                String var393 = class387.field5738.method1879(30669);
                String var394 = var393;
                if (var392) {
                    var394 = class387.field5738.method1879(30669);
                }
                long var395 = (long) class387.field5738.method1868(0);
                long var397 = (long) class387.field5738.method1866(false);
                int var399 = class387.field5738.method1918((byte) 107);
                int var400 = class387.field5738.method1868(0);
                long var401 = (var395 << 32) + var397;
                boolean var403 = false;
                int var404 = 0;
                while (true) {
                    if (var404 >= 100) {
                        if (var399 <= 1 && class13.method109(true, var394)) {
                            var403 = true;
                        }
                        break;
                    }
                    if (class275.field3990[var404] == var401) {
                        var403 = true;
                        break;
                    }
                    var404++;
                }
                if (!var403 && class524.field7704 == 0) {
                    class275.field3990[class68.field1175] = var401;
                    class68.field1175 = (class68.field1175 + 1) % 100;
                    String var405 = class121.field1892.method1689(var400, (byte) -89).method3010(class387.field5738, false);
                    if (var399 == 2) {
                        class160.method1154(-10444, "<img=1>" + var393, var400, "<img=1>" + var394, 0, null, var405, 18);
                    } else if (var399 == 1) {
                        class160.method1154(-10444, "<img=0>" + var393, var400, "<img=0>" + var394, 0, null, var405, 18);
                    } else {
                        class160.method1154(-10444, var393, var400, var394, 0, null, var405, 18);
                    }
                }
                class18.field281 = null;
                return true;
            } else {
                class169.method1200("T1 - " + (class18.field281 == null ? -1 : class18.field281.method1301((byte) -100)) + "," + (class438.field6388 == null ? -1 : class438.field6388.method1301((byte) -100)) + "," + (class297.field4247 == null ? -1 : class297.field4247.method1301((byte) -100)) + " - " + class133.field2060, null, (byte) -113);
                class196.method1359(0);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(B)V", line = 3148)
    public static void method1019(byte arg0) {
        field2091 = null;
        if (arg0 != -58) {
            field2088 = false;
        }
    }

    @OriginalMember(owner = "client!ik", name = "run", descriptor = "()V", line = 3168)
    public final void run() {
        while (!this.field2094) {
            class111 var1 = this.field2089;
            class409 var2;
            synchronized (this.field2089) {
                var2 = (class409) this.field2089.method814(0);
                if (var2 == null) {
                    try {
                        this.field2089.wait();
                    } catch (InterruptedException var6) {
                    }
                    continue;
                }
                this.field2092--;
            }
            try {
                if (var2.field6030 == 2) {
                    var2.field6033.method3066(var2.field6032.length, -124, var2.field6032, (int) var2.field1844);
                } else if (var2.field6030 == 3) {
                    var2.field6032 = var2.field6033.method3064((byte) 125, (int) var2.field1844);
                }
            } catch (Exception var7) {
                class169.method1200(null, var7, (byte) -113);
            }
            var2.field6915 = false;
        }
        field2085++;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(BILkn;)Lpf;", line = 3213)
    public final class409 method1020(byte arg0, int arg1, class518 arg2) {
        field2086++;
        class409 var4 = new class409();
        var4.field6916 = false;
        var4.field6030 = 3;
        var4.field6033 = arg2;
        var4.field1844 = arg1;
        if (arg0 < 13) {
            return null;
        } else {
            this.method1015(-1, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Z)V", line = 3236)
    public final void method1021(boolean arg0) {
        field2080++;
        this.field2094 = arg0;
        class111 var2 = this.field2089;
        synchronized (this.field2089) {
            this.field2089.notifyAll();
        }
        try {
            this.field2093.join();
        } catch (InterruptedException var3) {
        }
        this.field2093 = null;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(II)V", line = 3253)
    public static final void method1022(int arg0, int arg1) {
        field2084++;
        if (class17.field266 == arg0) {
            return;
        }
        if (class17.field266 == 0) {
            class222.method1467(0);
        }
        if (arg0 == 40) {
            class289.method1800(1);
        }
        if (arg0 != 40 && class196.field2904 != null) {
            class196.field2904.method694(false);
            class196.field2904 = null;
        }
        if (class17.field266 == 25 || class17.field266 == 28) {
            class200.field2917.field1398 = 2;
            class16.field249.field1398 = 2;
            class34.field526.field1398 = 2;
            class36.field544.field1398 = 2;
            class8.field120.field1398 = 2;
            class484.field7095.field1398 = 2;
            class496.field7216.field1398 = 2;
        }
        if (arg0 == 25 || arg0 == 28) {
            class467.field6866 = 1;
            class360.field5439 = 0;
            class292.field4183 = 0;
            class454.field6719 = 1;
            class139.field2099 = 0;
            class438.method2660(-99, true);
            class200.field2917.field1398 = 1;
            class16.field249.field1398 = 1;
            class34.field526.field1398 = 1;
            class36.field544.field1398 = 1;
            class8.field120.field1398 = 1;
            class484.field7095.field1398 = 1;
            class496.field7216.field1398 = 1;
        }
        if (arg0 == 25 || arg0 == 10) {
            class99.method775(-20858);
        }
        if (arg0 == 5) {
            class527.method3117(class394.field5821, (byte) 83, class460.field6798);
        } else {
            class314.method1987(false);
        }
        boolean var2 = arg0 == 5 || arg0 == 10 || arg0 == 28;
        if (arg1 != 1) {
            field2081 = -4;
        }
        boolean var3 = class17.field266 == 5 || class17.field266 == 10 || class17.field266 == 28;
        if (var2 != var3) {
            if (var2) {
                class277.field3994 = class475.field6994;
                if (class397.field5830.field141 == 0) {
                    class151.method1092(2, 1221);
                } else {
                    class281.method1776((byte) -74, class427.field6244, 0, 2, false, class475.field6994, class397.field5830.field141);
                }
                class383.field5691.method1687(false, false);
            } else {
                class151.method1092(2, 1221);
                class383.field5691.method1687(false, true);
            }
        }
        if (arg0 == 25 || arg0 == 28 || arg0 == 40) {
            class394.field5821.method510();
        }
        class17.field266 = arg0;
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(Lci;)V", line = 3362)
    public class138(class312 arg0) {
        class100 var2 = arg0.method1959(-120, 5, this);
        while (var2.field1604 == 0) {
            class185.method1285(120, 10L);
        }
        if (var2.field1604 == 2) {
            throw new RuntimeException();
        }
        this.field2093 = (Thread) var2.field1608;
    }
}
