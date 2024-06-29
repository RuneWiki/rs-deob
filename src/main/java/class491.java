import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class491 {

    @OriginalMember(owner = "client!f", name = "h", descriptor = "B")
    public byte field6843 = 0;

    @OriginalMember(owner = "client!f", name = "m", descriptor = "B")
    public byte field6848;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "B")
    public byte field6836;

    @OriginalMember(owner = "client!f", name = "s", descriptor = "S")
    public short field6854;

    @OriginalMember(owner = "client!f", name = "y", descriptor = "S")
    public short field6860;

    @OriginalMember(owner = "client!f", name = "b", descriptor = "Lmc;")
    public static class78 field6837 = new class78(61, -1);

    @OriginalMember(owner = "client!f", name = "E", descriptor = "I")
    public static int field6865 = 1400;

    @OriginalMember(owner = "client!f", name = "G", descriptor = "Ljava/lang/String;")
    public static String field6867 = null;

    @OriginalMember(owner = "client!f", name = "H", descriptor = "I")
    public static int field6868;

    @OriginalMember(owner = "client!f", name = "i", descriptor = "B")
    public byte field6844;

    @OriginalMember(owner = "client!f", name = "q", descriptor = "B")
    public byte field6852;

    @OriginalMember(owner = "client!f", name = "v", descriptor = "B")
    public byte field6857;

    @OriginalMember(owner = "client!f", name = "z", descriptor = "B")
    public byte field6861;

    @OriginalMember(owner = "client!f", name = "d", descriptor = "I")
    public static int field6839;

    @OriginalMember(owner = "client!f", name = "f", descriptor = "I")
    public static int field6841;

    @OriginalMember(owner = "client!f", name = "k", descriptor = "I")
    public static int field6846;

    @OriginalMember(owner = "client!f", name = "p", descriptor = "I")
    public static int field6851;

    @OriginalMember(owner = "client!f", name = "u", descriptor = "I")
    public static int field6856;

    @OriginalMember(owner = "client!f", name = "x", descriptor = "Lvj;")
    public static class281 field6859;

    @OriginalMember(owner = "client!f", name = "j", descriptor = "Lbi;")
    public class309 field6845;

    @OriginalMember(owner = "client!f", name = "F", descriptor = "Lod;")
    public static class321 field6866;

    @OriginalMember(owner = "client!f", name = "l", descriptor = "Lgq;")
    public class327 field6847;

    @OriginalMember(owner = "client!f", name = "D", descriptor = "Lgq;")
    public class327 field6864;

    @OriginalMember(owner = "client!f", name = "r", descriptor = "Ltp;")
    public class342 field6853;

    @OriginalMember(owner = "client!f", name = "g", descriptor = "Lel;")
    public class354 field6842;

    @OriginalMember(owner = "client!f", name = "t", descriptor = "Lda;")
    public class41 field6855;

    @OriginalMember(owner = "client!f", name = "e", descriptor = "Lcj;")
    public class451 field6840;

    @OriginalMember(owner = "client!f", name = "n", descriptor = "Lcj;")
    public class451 field6849;

    @OriginalMember(owner = "client!f", name = "B", descriptor = "Lf;")
    public class491 field6862;

    @OriginalMember(owner = "client!f", name = "o", descriptor = "S")
    public short field6850;

    @OriginalMember(owner = "client!f", name = "c", descriptor = "Z")
    public boolean field6838;

    @OriginalMember(owner = "client!f", name = "w", descriptor = "Z")
    public boolean field6858;

    @OriginalMember(owner = "client!f", name = "C", descriptor = "Z")
    public boolean field6863;

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "(III)V")
    public class491(int arg0, int arg1, int arg2) {
        this.field6836 = this.field6848 = (byte) arg0;
        this.field6854 = (short) arg2;
        this.field6860 = (short) arg1;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lmc;I)V")
    public static final void method2861(class78 arg0, int arg1) {
        if (arg1 == 1) {
            field6839++;
            class203.field2751.method1663(arg0.method516(-5544), 114);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(B)V")
    public static final void method2862(byte arg0) {
        field6846++;
        if (class18.field256 == 0 || class18.field256 == 5) {
            return;
        }
        try {
            if (++class114.field1710 > 2000) {
                if (class280.field3743 != null) {
                    class280.field3743.method2310(-126);
                    class280.field3743 = null;
                }
                if (class168.field2329 >= 1) {
                    class297.field3976 = -5;
                    class18.field256 = 0;
                    return;
                }
                class114.field1710 = 0;
                class168.field2329++;
                class18.field256 = 1;
                if (class95.field1403 == class265.field3503) {
                    class265.field3503 = class289.field3890;
                } else {
                    class265.field3503 = class95.field1403;
                }
            }
            if (arg0 == 88) {
                if (class18.field256 == 1) {
                    class268.field3583 = class251.field3359.method1333(class168.field2325, class265.field3503, arg0 - 87);
                    class18.field256 = 2;
                }
                if (class18.field256 == 2) {
                    if (class268.field3583.field6534 == 2) {
                        throw new IOException();
                    }
                    if (class268.field3583.field6534 != 1) {
                        return;
                    }
                    class280.field3743 = new class375((Socket) class268.field3583.field6529, class251.field3359);
                    class268.field3583 = null;
                    long var1 = class294.field3933 = class322.method1790((byte) 125, class80.field1079);
                    int var3 = (int) (var1 >> 16 & 0x1FL);
                    class203.field2751.field456 = 0;
                    class203.field2751.method228(class419.field5688.field1076, 32);
                    class203.field2751.method228(var3, 32);
                    class280.field3743.method2308(false, 0, 2, class203.field2751.field472);
                    if (class259.field3433 != null) {
                        class259.field3433.method851(8);
                    }
                    if (class98.field1434 != null) {
                        class98.field1434.method851(8);
                    }
                    int var4 = class280.field3743.method2311(1);
                    if (class259.field3433 != null) {
                        class259.field3433.method851(8);
                    }
                    if (class98.field1434 != null) {
                        class98.field1434.method851(8);
                    }
                    if (var4 != 0) {
                        class18.field256 = 0;
                        class297.field3976 = var4;
                        class280.field3743.method2310(arg0 - 215);
                        class280.field3743 = null;
                        return;
                    }
                    class18.field256 = 3;
                }
                if (class18.field256 == 3) {
                    if (class280.field3743.method2306(1) < 8) {
                        return;
                    }
                    class280.field3743.method2304(class314.field4171.field472, 8, arg0 ^ 0x59, 0);
                    class314.field4171.field456 = 0;
                    class244.field3246 = class314.field4171.method184(-24867872);
                    class32 var5 = new class32(70);
                    int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class244.field3246 >> 32), (int) class244.field3246 };
                    var5.method228(10, arg0 ^ 0x78);
                    var5.method199((byte) -117, var6[0]);
                    var5.method199((byte) -117, var6[1]);
                    var5.method199((byte) -117, var6[2]);
                    var5.method199((byte) -117, var6[3]);
                    var5.method218(16439, class322.method1790((byte) 117, class80.field1079));
                    var5.method208(class95.field1405, -100);
                    var5.method220(class171.field2347, arg0 - 136, class105.field1578);
                    class203.field2751.field456 = 0;
                    if (class18.field258 == 40) {
                        class203.field2751.method228(class419.field5693.field1076, arg0 ^ 0x78);
                    } else {
                        class203.field2751.method228(class419.field5691.field1076, 32);
                    }
                    class203.field2751.method229(0, 1309449544);
                    int var7 = class203.field2751.field456;
                    class203.field2751.method199((byte) -117, 578);
                    class203.field2751.method228(class357.field4924, 32);
                    class203.field2751.method228(class6.method41((byte) -121), 32);
                    class203.field2751.method229(class424.field5738, arg0 ^ 0x4E0C9D10);
                    class203.field2751.method229(class72.field986, 1309449544);
                    class203.field2751.method228(class488.field6789.field6678, 32);
                    class231.method1295(class203.field2751, (byte) -127);
                    class203.field2751.method208(class441.field5949, -92);
                    class203.field2751.method199((byte) -117, class448.field6099);
                    class32 var8 = class488.field6789.method2414(-2);
                    class203.field2751.method228(var8.field456, 32);
                    class203.field2751.method243((byte) 125, 0, var8.field472, var8.field456);
                    class464.field6399 = true;
                    class203.field2751.method229(class45.field618, 1309449544);
                    class203.field2751.method199((byte) -117, class176.field2400.method691((byte) -27));
                    class203.field2751.method199((byte) -117, class32.field441.method691((byte) 122));
                    class203.field2751.method199((byte) -117, class19.field262.method691((byte) -48));
                    class203.field2751.method199((byte) -117, class267.field3552.method691((byte) -125));
                    class203.field2751.method199((byte) -117, class265.field3506.method691((byte) -117));
                    class203.field2751.method199((byte) -117, class87.field1219.method691((byte) -91));
                    class203.field2751.method199((byte) -117, class330.field4383.method691((byte) -86));
                    class203.field2751.method199((byte) -117, class356.field4916.method691((byte) 121));
                    class203.field2751.method199((byte) -117, class473.field6525.method691((byte) -16));
                    class203.field2751.method199((byte) -117, class108.field1627.method691((byte) 127));
                    class203.field2751.method199((byte) -117, class311.field4106.method691((byte) -65));
                    class203.field2751.method199((byte) -117, class168.field2331.method691((byte) 119));
                    class203.field2751.method199((byte) -117, class262.field3477.method691((byte) -35));
                    class203.field2751.method199((byte) -117, class172.field2358.method691((byte) 127));
                    class203.field2751.method199((byte) -117, class338.field4543.method691((byte) -30));
                    class203.field2751.method199((byte) -117, class33.field511.method691((byte) -49));
                    class203.field2751.method199((byte) -117, class104.field1514.method691((byte) 120));
                    class203.field2751.method199((byte) -117, class34.field519.method691((byte) -102));
                    class203.field2751.method199((byte) -117, class168.field2323.method691((byte) -92));
                    class203.field2751.method199((byte) -117, class209.field2834.method691((byte) 121));
                    class203.field2751.method199((byte) -117, class196.field2673.method691((byte) -20));
                    class203.field2751.method199((byte) -117, class365.field5028.method691((byte) -124));
                    class203.field2751.method199((byte) -117, class417.field5663.method691((byte) -67));
                    class203.field2751.method199((byte) -117, class484.field6701.method691((byte) -64));
                    class203.field2751.method199((byte) -117, class299.field4004.method691((byte) -25));
                    class203.field2751.method199((byte) -117, class196.field2671.method691((byte) -61));
                    class203.field2751.method199((byte) -117, class148.field2110.method691((byte) -52));
                    class203.field2751.method199((byte) -117, class209.field2833.method691((byte) 119));
                    class203.field2751.method199((byte) -117, class265.field3504.method691((byte) -23));
                    class203.field2751.method243((byte) 125, 0, var5.field472, var5.field456);
                    class203.field2751.method237(arg0 ^ 0xFFFFCB6A, class203.field2751.field456 - var7);
                    class280.field3743.method2308(false, 0, class203.field2751.field456, class203.field2751.field472);
                    class203.field2751.method1667(var6, (byte) 85);
                    for (int var9 = 0; var9 < 4; var9++) {
                        var6[var9] += 50;
                    }
                    class314.field4171.method1667(var6, (byte) 85);
                    class18.field256 = 4;
                }
                if (class18.field256 == 4) {
                    if (class280.field3743.method2306(1) < 1) {
                        return;
                    }
                    int var10 = class280.field3743.method2311(arg0 ^ 0x59);
                    if (var10 == 21) {
                        class18.field256 = 7;
                    } else if (var10 == 29) {
                        class18.field256 = 11;
                    } else if (var10 == 1) {
                        class18.field256 = 5;
                        class297.field3976 = var10;
                        return;
                    } else if (var10 == 2) {
                        class18.field256 = 8;
                    } else if (var10 == 15) {
                        class18.field256 = 12;
                        class136.field1983 = -2;
                    } else if (var10 == 23 && class168.field2329 < 1) {
                        class114.field1710 = 0;
                        class168.field2329++;
                        class18.field256 = 1;
                        class280.field3743.method2310(arg0 ^ 0xFFFFFFF0);
                        class280.field3743 = null;
                        return;
                    } else {
                        class297.field3976 = var10;
                        class18.field256 = 0;
                        class280.field3743.method2310(-98);
                        class280.field3743 = null;
                        return;
                    }
                }
                if (class18.field256 == 6) {
                    class203.field2751.field456 = 0;
                    class203.field2751.method1663(class419.field5692.field1076, arg0 ^ 0x23);
                    class280.field3743.method2308(false, 0, class203.field2751.field456, class203.field2751.field472);
                    class18.field256 = 4;
                } else if (class18.field256 == 7) {
                    if (class280.field3743.method2306(1) >= 1) {
                        class68.field924 = class280.field3743.method2311(1) * 60 + 180;
                        class297.field3976 = 21;
                        class18.field256 = 0;
                        class280.field3743.method2310(-107);
                        class280.field3743 = null;
                    }
                } else if (class18.field256 != 11) {
                    if (class18.field256 == 8) {
                        if (class280.field3743.method2306(1) < 13) {
                            return;
                        }
                        class280.field3743.method2304(class314.field4171.field472, 13, 1, 0);
                        class314.field4171.field456 = 0;
                        class348.field4799 = class314.field4171.method201((byte) -114);
                        class91.field1347 = class314.field4171.method201((byte) -119);
                        class458.field6212 = class314.field4171.method201((byte) -118) == 1;
                        class330.field4384 = class314.field4171.method201((byte) -107) == 1;
                        class18.field254 = class314.field4171.method201((byte) -108) == 1;
                        class129.field1900 = class314.field4171.method201((byte) -124) == 1;
                        class332.field4494 = class314.field4171.method215((byte) 121);
                        class164.field2275 = class314.field4171.method201((byte) -112) == 1;
                        class158.field2174 = class314.field4171.method201((byte) -125) == 1;
                        class1.field23.method929((byte) 113, class158.field2174);
                        class175.field2385.method1560(class158.field2174, (byte) -124);
                        class150.field2121.method785(class158.field2174, (byte) 115);
                        if ((!class458.field6212 || class18.field254) && !class164.field2275) {
                            try {
                                class361.method2207(class251.field3359.field3209, "unzap", (byte) -88);
                            } catch (Throwable var14) {
                            }
                        } else {
                            try {
                                class361.method2207(class251.field3359.field3209, "zap", (byte) -73);
                            } catch (Throwable var16) {
                                if (class59.field792) {
                                    try {
                                        class251.field3359.field3209.getAppletContext().showDocument(new URL(class251.field3359.field3209.getCodeBase(), "blank.ws"), "tbi");
                                    } catch (Exception var15) {
                                    }
                                }
                            }
                        }
                        if (class377.field5197 == class278.field3682) {
                            try {
                                class361.method2207(class251.field3359.field3209, "loggedin", (byte) -124);
                            } catch (Throwable var13) {
                            }
                        }
                        class18.field256 = 10;
                    }
                    if (class18.field256 == 10) {
                        if (class314.field4171.method1666((byte) -114)) {
                            if (class280.field3743.method2306(1) < 1) {
                                return;
                            }
                            class280.field3743.method2304(class314.field4171.field472, 1, arg0 ^ 0x59, class314.field4171.field456 + 2);
                        }
                        class374.field5163 = class202.method1153(false)[class314.field4171.method1660(17529)];
                        class136.field1983 = class314.field4171.method215((byte) 89);
                        class18.field256 = 9;
                    }
                    if (class18.field256 == 9) {
                        if (class280.field3743.method2306(1) >= class136.field1983) {
                            class280.field3743.method2304(class314.field4171.field472, class136.field1983, arg0 ^ 0x59, 0);
                            class314.field4171.field456 = 0;
                            class297.field3976 = 2;
                            int var11 = class136.field1983;
                            class18.field256 = 0;
                            class109.method679(arg0 - 88);
                            class347.method2139(3695, class314.field4171);
                            class4.field60 = -1;
                            class461.method2706(false, 83);
                            if (class314.field4171.field456 != var11) {
                                throw new RuntimeException("lswp pos:" + class314.field4171.field456 + " psize:" + var11);
                            }
                            class374.field5163 = null;
                        }
                    } else if (class18.field256 == 12) {
                        if (class136.field1983 == -2) {
                            if (class280.field3743.method2306(1) < 2) {
                                return;
                            }
                            class280.field3743.method2304(class314.field4171.field472, 2, 1, 0);
                            class314.field4171.field456 = 0;
                            class136.field1983 = class314.field4171.method215((byte) 100);
                        }
                        if (class280.field3743.method2306(arg0 ^ 0x59) >= class136.field1983) {
                            class280.field3743.method2304(class314.field4171.field472, class136.field1983, 1, 0);
                            class314.field4171.field456 = 0;
                            class297.field3976 = 15;
                            class18.field256 = 0;
                            int var12 = class136.field1983;
                            class114.method728((byte) 101);
                            class347.method2139(arg0 ^ 0xE37, class314.field4171);
                            if (class314.field4171.field456 != var12) {
                                throw new RuntimeException("lswpr pos:" + class314.field4171.field456 + " psize:" + var12);
                            }
                            class374.field5163 = null;
                        }
                    }
                } else if (class280.field3743.method2306(1) >= 1) {
                    class71.field970 = class280.field3743.method2311(1);
                    class18.field256 = 0;
                    class297.field3976 = 29;
                    class280.field3743.method2310(-91);
                    class280.field3743 = null;
                }
            }
        } catch (IOException var17) {
            if (class280.field3743 != null) {
                class280.field3743.method2310(-97);
                class280.field3743 = null;
            }
            if (class168.field2329 < 1) {
                class114.field1710 = 0;
                class168.field2329++;
                class18.field256 = 1;
                if (class95.field1403 == class265.field3503) {
                    class265.field3503 = class289.field3890;
                } else {
                    class265.field3503 = class95.field1403;
                }
            } else {
                class297.field3976 = -4;
                class18.field256 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V")
    public static final void method2863(int arg0) {
        class280.field3734.method495(arg0 - 4206);
        if (arg0 != 4089) {
            method2861((class78) null, 3);
        }
        field6841++;
        class471.field6493.method495(-85);
        class140.field2023.method495(arg0 ^ 0xFFFFF049);
        class215.field2896.method495(arg0 - 4213);
        class87.field1212.method495(-96);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IZ)V")
    public static final void method2864(int arg0, boolean arg1) {
        if (!arg1) {
            field6856++;
            class416.field5656 = arg0;
            class471.field6493.method495(-76);
        }
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(I)V")
    public final void method2865(int arg0) {
        field6851++;
        if (arg0 <= 63) {
            this.field6858 = true;
        }
        while (this.field6845 != null) {
            class309 var2 = this.field6845.field4084;
            this.field6845.method1702(500);
            this.field6845 = var2;
        }
        this.field6843 = 0;
    }

    @OriginalMember(owner = "client!f", name = "c", descriptor = "(I)V")
    public static void method2866(int arg0) {
        if (arg0 >= -60) {
            method2866(-106);
        }
        field6837 = null;
        field6866 = null;
        field6859 = null;
        field6867 = null;
    }

    static {
        new class206("Join your channel by clicking 'Join Chat' and typing: ", "Klick auf 'Betreten' und gib ein: ", "Pour rejoindre votre canal, cliquez sur « Participer » et entrez : ", "Para entrar no seu canal, clique em \"Acessar bate-papo\" e digite: ");
        field6868 = -1;
    }
}
