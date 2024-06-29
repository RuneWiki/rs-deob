import java.awt.Color;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class103 {

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
    public static int field547 = 0;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "Lfc;")
    public static class39 field558 = class90.method774("Menge eingeben:", -128);

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field549 = 0;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "Lfc;")
    private static class39 field554 = class90.method774("yellow:", -101);

    @OriginalMember(owner = "client!client", name = "U", descriptor = "Lfc;")
    public static class39 field551 = class90.method774("Diese Betatest)2Welt ist nur f-Ur eingeladene", -99);

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "Z")
    public static boolean field561 = false;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "Lfc;")
    public static class39 field573 = field554;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "Lfc;")
    public static class39 field548 = class90.method774("Verbindung mit", -107);

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "Lfc;")
    public static class39 field562 = class90.method774("Zu viele Verbindungen von Ihrer Adresse)3", -126);

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "Lfc;")
    public static class39 field555 = field554;

    @OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
    public static int field578 = 0;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field550;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field552;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field556;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field559;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field560;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field564;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field565;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field566;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field567;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field568;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field569;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    public static int field571;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    public static int field572;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
    public static int field574;

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
    public static int field575;

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
    public static int field576;

    @OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
    public static int field577;

    @OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
    public static int field579;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "Loc;")
    public static class100 field553;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "Luc;")
    public static class139 field563;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "Lve;")
    public static class147 field570;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "Lmf;")
    public static class89 field557;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILob;Lob;)Lob;", line = 3)
    public static final class99 method228(int arg0, int arg1, int arg2, class99 arg3, class99 arg4) {
        field566++;
        class99 var5 = class55.method571(arg2, arg3.field2381, arg3.field2429, 0, arg3.field2447, arg3.field2357, class65.field1571[arg3.field2406 >> 16], 0, arg0, arg3.field2406, arg1, arg4);
        if (var5 == null) {
            if (arg3.field2416 != null) {
                var5 = class55.method571(arg2, arg3.field2381, arg3.field2429, 0, arg3.field2447, arg3.field2357, arg3.field2416, 0, 0, arg3.field2406, arg1, arg4);
            }
            return var5;
        } else {
            return var5;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILac;[Lod;[B)V", line = 19)
    public static final void method229(int arg0, int arg1, int arg2, class4 arg3, class101[] arg4, byte[] arg5) {
        class25 var6 = new class25(arg5);
        field574++;
        int var7 = arg0;
        while (true) {
            int var8 = var6.method324(false);
            if (var8 == 0) {
                return;
            }
            var7 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var6.method324(false);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 & 0x3F;
                int var12 = var9 >> 12;
                int var13 = var9 >> 6 & 0x3F;
                int var14 = var6.method322((byte) -50);
                int var15 = var14 >> 2;
                int var16 = var14 & 0x3;
                int var17 = arg1 + var13;
                int var18 = arg2 + var11;
                if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
                    class101 var19 = null;
                    int var20 = var12;
                    if ((class137.field3424[1][var17][var18] & 0x2) == 2) {
                        var20 = var12 - 1;
                    }
                    if (var20 >= 0) {
                        var19 = arg4[var20];
                    }
                    class93.method791(var18, var15, var17, var16, 125, var12, var19, arg3, var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 97)
    public final void init() {
        field564++;
        if (!this.method919((byte) -99)) {
            return;
        }
        class56.field1404 = Integer.parseInt(this.getParameter("worldid"));
        class96.field2255 = Integer.parseInt(this.getParameter("modewhat"));
        class36.field980 = Integer.parseInt(this.getParameter("modewhere"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            class109.method966(-98);
        } else {
            class88.method750((byte) 81);
        }
        String var2 = this.getParameter("members");
        if (var2 != null && var2.equals("1")) {
            class26.field743 = true;
        } else {
            class26.field743 = false;
        }
        String var3 = this.getParameter("lang");
        if (var3 != null && var3.equals("1")) {
            class131.method1067(0);
            class107.field2684 = class108.field2710;
            class38.field1037 = 1;
        }
        try {
            class63.field1556 = Integer.parseInt(this.getParameter("js"));
            class93.field2173 = Integer.parseInt(this.getParameter("plug"));
        } catch (Exception var4) {
        }
        class60.field1456 = this.getCodeBase().getHost();
        this.method925((byte) 126, 765, 503, class96.field2255 + 32, 458);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V", line = 147)
    public final void method230(int arg0) {
        field577++;
        method238(-30065);
        class39.method444((byte) -125);
        class103.method918((byte) -121);
        class149.method1192(-105);
        class82.method693(false);
        class31.method371(102);
        class25.method282(99);
        class139.method1137(0);
        class89.method756(-977580216);
        class16.method203((byte) 68);
        class120.method1027((byte) -29);
        class121.method1037(true);
        class34.method391(17517);
        class84.method715();
        class4.method33();
        class101.method861((byte) 82);
        class142.method1157(115);
        class2.method13((byte) 50);
        class99.method829(-15313);
        class66.method633((byte) 28);
        class114.method999(-118);
        class74.method666(-25177);
        class147.method1181((byte) -32);
        class94.method797(1230099650);
        class136.method1104(700772549);
        class116.method1008(false);
        class111.method974(70);
        class131.method1068(50);
        class96.method806((byte) -24);
        class145.method1166((byte) -49);
        class63.method623(-30206);
        class68.method645(-100);
        class104.method932(-17302);
        class23.method264();
        class138.method1127();
        class153.method1226((byte) -102);
        class79.method682((byte) 76);
        class78.method681((byte) 126);
        class90.method773(126);
        class62.method614(255);
        class88.method748((byte) -92);
        class113.method987((byte) -84);
        class86.method733(-127);
        class12.method150((byte) 112);
        class54.method570((byte) 24);
        class119.method1024((byte) -92);
        class19.method223();
        class50.method552(84);
        class67.method637((byte) 114);
        class29.method360(-116);
        class118.method1022(true);
        class100.method853(-16149);
        class70.method652(-74);
        class97.method813((byte) 56);
        class15.method172(-26);
        class26.method337(15);
        class127.method1056(-92);
        class3.method28(96);
        class13.method152(25907);
        class30.method369(-28860);
        class6.method87((byte) -127);
        class65.method627(-418514552);
        class45.method523(-80);
        class92.method785(-79);
        class57.method582(true);
        class40.method482();
        class152.method1211();
        int var2 = -69 / ((-arg0 - 26) / 37);
        class10.method135(-105);
        class98.method818((byte) 99);
        class83.method695(6557);
        class53.method559(false);
        class32.method384();
        class150.method1195((byte) 110);
        class134.method1089(91);
        class17.method207(3754);
        class7.method92(105);
        class18.method218(-1714709436);
        class132.method1070(false);
        class35.method406(0);
        class109.method952(false);
        class60.method595((byte) 64);
        class107.method945(-1);
        class43.method504((byte) 105);
        class38.method428(29190);
        class71.method659(false);
        class36.method415((byte) 113);
        class87.method737((byte) 105);
        class51.method554();
        class137.method1114(31105);
        class37.method423(1);
        class72.method665(-121);
        class80.method689(-84);
        class1.method3((byte) -1);
        class24.method278(0);
        class27.method343(0);
        class55.method574((byte) 123);
        class58.method584((byte) 7);
        class106.method941();
        class128.method1058((byte) 3);
        class14.method154(-92);
        class151.method1201(-792446169);
        class115.method1003(0);
        class140.method1148(-1);
        class75.method668((byte) -113);
        class112.method981(51);
        class143.method1162(50);
        class126.method1047(18);
        class76.method673(16565);
        class28.method348(false);
        class9.method133((byte) -51);
        class61.method608(-68);
        class5.method85((byte) 63);
        class117.method1017(127);
        class56.method579(-114);
        class91.method784();
        class59.method592();
        class124.method1041(-1);
        class52.method557();
        class42.method501(false);
        class22.method245();
        class110.method972((byte) 120);
        class108.method949((byte) 127);
        class93.method793(1);
        class77.method674(-126);
        class85.method727();
        class46.method531();
        class146.method1175(false);
        class44.method513(30212);
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V", line = 290)
    private final void method231(byte arg0) {
        field572++;
        if (class56.field1409 == 1000) {
            return;
        }
        if (arg0 != -57) {
            this.method239(false);
        }
        boolean var2 = class140.method1146(4);
        if (!var2) {
            this.method232(-5807);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V", line = 325)
    private final void method232(int arg0) {
        field568++;
        if (class6.field201 >= 4) {
            this.method921("js5crc", 34);
            class56.field1409 = 1000;
            return;
        }
        if (class24.field653 >= 4) {
            if (class56.field1409 <= 5) {
                this.method921("js5io", arg0 + 5724);
                class56.field1409 = 1000;
                return;
            }
            class96.field2270 = 3000;
            class24.field653 = 3;
        }
        if (class96.field2270-- > 0) {
            return;
        }
        try {
            if (arg0 != -5807) {
                field555 = null;
            }
            if (class119.field3110 == 0) {
                class30.field855 = class83.field1850.method1083(class117.field3078, class60.field1456, -123);
                class119.field3110++;
            }
            if (class119.field3110 == 1) {
                if (class30.field855.field1816 == 2) {
                    this.method233(-1, 0);
                    return;
                }
                if (class30.field855.field1816 == 1) {
                    class119.field3110++;
                }
            }
            if (class119.field3110 == 2) {
                class60.field1484 = new class139((Socket) class30.field855.field1820, class83.field1850);
                class25 var2 = new class25(5);
                var2.method326(15, (byte) -50);
                var2.method283(true, 458);
                class60.field1484.method1140(true, 5, 0, var2.field711);
                class119.field3110++;
                class71.field1669 = class29.method361(arg0 + 486);
            }
            if (class119.field3110 == 3) {
                if (class56.field1409 <= 5 || class60.field1484.method1138((byte) -47) > 0) {
                    int var3 = class60.field1484.method1143(-113);
                    if (var3 != 0) {
                        this.method233(var3, arg0 + 5807);
                        return;
                    }
                    class119.field3110++;
                } else if (class29.method361(arg0 + 486) - class71.field1669 > 30000L) {
                    this.method233(-2, 0);
                    return;
                }
            }
            if (class119.field3110 == 4) {
                class15.method189(class56.field1409 > 20, class60.field1484, (byte) -93);
                class110.field2828 = 0;
                class119.field3110 = 0;
                class30.field855 = null;
                class60.field1484 = null;
            }
        } catch (IOException var4) {
            this.method233(-3, 0);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V", line = 445)
    private final void method233(int arg0, int arg1) {
        class110.field2828++;
        field575++;
        class60.field1484 = null;
        class119.field3110 = arg1;
        class30.field855 = null;
        if (class80.field1812 == class117.field3078) {
            class117.field3078 = class63.field1543;
        } else {
            class117.field3078 = class80.field1812;
        }
        if (class110.field2828 >= 2 && (arg0 == 7 || arg0 == 9)) {
            if (class56.field1409 > 5) {
                class96.field2270 = 3000;
            } else {
                this.method921("js5connect_full", arg1 + 125);
                class56.field1409 = 1000;
            }
        } else if (class110.field2828 >= 2 && arg0 == 6) {
            this.method921("js5connect_outofdate", arg1 + 127);
            class56.field1409 = 1000;
        } else if (class110.field2828 >= 4) {
            if (class56.field1409 > 5) {
                class96.field2270 = 3000;
            } else {
                this.method921("js5connect", arg1 ^ 0x7F);
                class56.field1409 = 1000;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lq;I)V", line = 503)
    public static final void method234(class111 arg0, int arg1) {
        arg0.field2869 = arg0.field2920;
        field560++;
        if (arg0.field2927 == 0) {
            arg0.field2872 = 0;
            return;
        }
        if (arg0.field2888 != -1 && arg0.field2911 == 0) {
            class116 var2 = class38.method430(arg1 ^ 0x62AE, arg0.field2888);
            if (arg0.field2884 > 0 && var2.field3051 == 0) {
                arg0.field2872++;
                return;
            }
            if (arg0.field2884 <= 0 && var2.field3059 == 0) {
                arg0.field2872++;
                return;
            }
        }
        int var3 = arg0.field2913[arg0.field2927 - 1] * 128 + arg0.field2918 * 64;
        int var4 = arg0.field2916;
        int var5 = arg0.field2909;
        int var6 = arg0.field2926[arg0.field2927 - 1] * 128 + arg0.field2918 * 64;
        if (var3 - var4 > 256 || var3 - var4 < -256 || var6 - var5 > 256 || var6 - var5 < -256) {
            arg0.field2916 = var3;
            arg0.field2909 = var6;
            return;
        }
        if (var4 >= var3) {
            if (var4 <= var3) {
                if (var6 > var5) {
                    arg0.field2887 = 1024;
                } else if (var6 < var5) {
                    arg0.field2887 = 0;
                }
            } else if (var5 < var6) {
                arg0.field2887 = 768;
            } else if (var5 > var6) {
                arg0.field2887 = 256;
            } else {
                arg0.field2887 = 512;
            }
        } else if (var6 > var5) {
            arg0.field2887 = 1280;
        } else if (var6 < var5) {
            arg0.field2887 = 1792;
        } else {
            arg0.field2887 = 1536;
        }
        int var7 = arg0.field2887 - arg0.field2900 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        if (arg1 != 27152) {
            return;
        }
        int var8 = arg0.field2861;
        int var9 = 4;
        boolean var10 = true;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg0.field2873;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg0.field2907;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg0.field2917;
        }
        if (var8 == -1) {
            var8 = arg0.field2873;
        }
        arg0.field2869 = var8;
        if (arg0 instanceof class121) {
            var10 = ((class121) arg0).field3163.field2277;
        }
        if (var10) {
            if (arg0.field2900 != arg0.field2887 && arg0.field2898 == -1 && arg0.field2893 != 0) {
                var9 = 2;
            }
            if (arg0.field2927 > 2) {
                var9 = 6;
            }
            if (arg0.field2927 > 3) {
                var9 = 8;
            }
            if (arg0.field2872 > 0 && arg0.field2927 > 1) {
                arg0.field2872--;
                var9 = 8;
            }
        } else {
            if (arg0.field2927 > 1) {
                var9 = 6;
            }
            if (arg0.field2927 > 2) {
                var9 = 8;
            }
            if (arg0.field2872 > 0 && arg0.field2927 > 1) {
                arg0.field2872--;
                var9 = 8;
            }
        }
        if (arg0.field2903[arg0.field2927 - 1]) {
            var9 <<= 0x1;
        }
        if (var6 > var5) {
            arg0.field2909 += var9;
            if (arg0.field2909 > var6) {
                arg0.field2909 = var6;
            }
        } else if (var6 < var5) {
            arg0.field2909 -= var9;
            if (var6 > arg0.field2909) {
                arg0.field2909 = var6;
            }
        }
        if (var4 < var3) {
            arg0.field2916 += var9;
            if (arg0.field2916 > var3) {
                arg0.field2916 = var3;
            }
        } else if (var4 > var3) {
            arg0.field2916 -= var9;
            if (var3 > arg0.field2916) {
                arg0.field2916 = var3;
            }
        }
        if (var9 >= 8 && arg0.field2873 == arg0.field2869 && arg0.field2870 != -1) {
            arg0.field2869 = arg0.field2870;
        }
        if (arg0.field2916 == var3 && arg0.field2909 == var6) {
            if (arg0.field2884 > 0) {
                arg0.field2884--;
            }
            arg0.field2927--;
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(II)Z", line = 722)
    public static final boolean method235(int arg0, int arg1) {
        if (arg1 != -9) {
            field555 = null;
        }
        field567++;
        return (arg0 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V", line = 737)
    public final void method236(boolean arg0) {
        field565++;
        boolean var2 = class146.method1173(65);
        if (var2 && class9.field255 && field570 != null) {
            field570.method1188(-27000);
        }
        if (class57.field1421) {
            class9.method132((byte) -77, class140.field3523);
            class15.method160(class140.field3523, (byte) 17);
            if (class14.field366 != null) {
                class14.field366.method632(class140.field3523, 25085);
            }
            this.method924(100);
            class10.method137(-2, class140.field3523);
            class1.method1(class140.field3523, -19276);
            if (class14.field366 != null) {
                class14.field366.method630((byte) -123, class140.field3523);
            }
        }
        if (class56.field1409 == 0) {
            class151.method1200(class93.field2178, 2, null, class127.field3226);
        } else if (class56.field1409 == 5) {
            class17.method212(class96.field2224, (byte) 49, class54.field1367);
        } else if (class56.field1409 == 10) {
            class17.method212(class96.field2224, (byte) 49, class54.field1367);
        } else if (class56.field1409 == 20) {
            class17.method212(class96.field2224, (byte) 49, class54.field1367);
        } else if (class56.field1409 == 25) {
            if (class38.field1031 == 1) {
                if (class38.field1036 < class3.field78) {
                    class38.field1036 = class3.field78;
                }
                int var3 = (class38.field1036 - class3.field78) * 50 / class38.field1036;
                class131.method1066(class137.method1111(new class39[] { class100.field2493, class86.method734(var3, 2218), class100.field2462 }, (byte) 123), class2.field45, true, 257);
            } else if (class38.field1031 == 2) {
                if (class96.field2235 < class120.field3126) {
                    class96.field2235 = class120.field3126;
                }
                int var4 = (class96.field2235 - class120.field3126) * 50 / class96.field2235 + 50;
                class131.method1066(class137.method1111(new class39[] { class100.field2493, class86.method734(var4, 2218), class100.field2462 }, (byte) -124), class2.field45, true, 257);
            } else {
                class131.method1066(null, class2.field45, false, 257);
            }
        } else if (class56.field1409 == 30) {
            class92.method789((byte) -28);
        } else if (class56.field1409 == 35) {
            class128.method1059((byte) 0);
        } else if (class56.field1409 == 40) {
            class131.method1066(class30.field850, class149.field3703, false, 257);
        }
        if (!arg0) {
            main(null);
        }
        class101.field2534 = 0;
        class68.field1620 = 0;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V", line = 902)
    public final void method237(int arg0) {
        class70.field1654++;
        field550++;
        this.method231((byte) -57);
        class117.method1018((byte) -120);
        class113.method986((byte) -84);
        class121.method1036((byte) 61);
        class7.method94(arg0 ^ 0x93E);
        if (arg0 != 2376) {
            return;
        }
        class2.method11(arg0 - 2376);
        if (class14.field366 != null) {
            int var2 = class14.field366.method629((byte) 22);
            class2.field37 = var2;
            class68.field1620 += var2;
        }
        if (class56.field1409 == 0) {
            class104.method937(21);
            class34.method389((byte) 127);
        } else if (class56.field1409 == 5) {
            class100.method846(this, true);
            class104.method937(21);
            class34.method389((byte) 127);
        } else if (class56.field1409 == 10) {
            class100.method846(this, true);
        } else if (class56.field1409 == 20) {
            class100.method846(this, true);
            class109.method961(arg0 - 2287);
        } else if (class56.field1409 == 25) {
            class137.method1116(16445);
        }
        if (class56.field1409 == 30) {
            class60.method594(83);
        } else if (class56.field1409 == 35) {
            class60.method594(96);
        } else if (class56.field1409 == 40) {
            class109.method961(arg0 - 2489);
            return;
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V", line = 971)
    public static void method238(int arg0) {
        field555 = null;
        field557 = null;
        field563 = null;
        if (arg0 != -30065) {
            return;
        }
        field570 = null;
        field551 = null;
        field548 = null;
        field554 = null;
        field562 = null;
        field558 = null;
        field553 = null;
        field573 = null;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V", line = 995)
    public final void method239(boolean arg0) {
        if (!arg0) {
            return;
        }
        class63.field1543 = class36.field980 == 0 ? 443 : class56.field1404 + 50000;
        class80.field1812 = class36.field980 == 0 ? 43594 : class56.field1404 + 40000;
        class117.field3078 = class80.field1812;
        class71.method662((byte) -115);
        field552++;
        class10.method137(-2, class140.field3523);
        class1.method1(class140.field3523, -19276);
        class14.field366 = class29.method358(-18839);
        if (class14.field366 != null) {
            class14.field366.method630((byte) -116, class140.field3523);
        }
        class54.field1359 = class133.field3358;
        try {
            if (class83.field1850.field3363 != null) {
                class145.field3610 = new class16(class83.field1850.field3363, 5200, 0);
                for (int var2 = 0; var2 < 16; var2++) {
                    class37.field1000[var2] = new class16(class83.field1850.field3367[var2], 6000, 0);
                }
                class99.field2444 = new class16(class83.field1850.field3351, 6000, 0);
                class109.field2802 = new class120(255, class145.field3610, class99.field2444, 500000);
                class83.field1850.field3351 = null;
                class83.field1850.field3367 = null;
                class83.field1850.field3363 = null;
            }
        } catch (IOException var3) {
            class145.field3610 = null;
            class99.field2444 = null;
            class109.field2802 = null;
        }
        if (class36.field980 != 0) {
            class100.field2478 = true;
        }
        class98.field2320 = new class99();
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 1065)
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 6) {
                class44.method520(-19);
            }
            class56.field1404 = Integer.parseInt(arg0[0]);
            if (arg0[1].equals("live")) {
                class36.field980 = 0;
            } else if (arg0[1].equals("office")) {
                class36.field980 = 1;
            } else if (arg0[1].equals("local")) {
                class36.field980 = 2;
            } else {
                class44.method520(-19);
            }
            if (arg0[2].equals("live")) {
                class96.field2255 = 0;
            } else if (arg0[2].equals("rc")) {
                class96.field2255 = 1;
            } else if (arg0[2].equals("wip")) {
                class96.field2255 = 2;
            } else {
                class44.method520(-19);
            }
            if (arg0[3].equals("lowmem")) {
                class109.method966(-128);
            } else if (arg0[3].equals("highmem")) {
                class88.method750((byte) 97);
            } else {
                class44.method520(-19);
            }
            if (arg0[4].equals("free")) {
                class26.field743 = false;
            } else if (arg0[4].equals("members")) {
                class26.field743 = true;
            } else {
                class44.method520(-19);
            }
            if (arg0[5].equals("english")) {
                class38.field1037 = 0;
            } else if (arg0[5].equals("german")) {
                class131.method1067(0);
                class107.field2684 = class108.field2710;
                class38.field1037 = 1;
            } else {
                class44.method520(-19);
            }
            class60.field1456 = "127.0.0.1";
            client var1 = new client();
            var1.method923(503, 458, 0, class96.field2255 + 32, "runescape", 16, 765);
        } catch (Exception var3) {
            class142.method1158(null, var3, -118);
        }
        field576++;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V", line = 1169)
    public final void method240(boolean arg0) {
        if (class150.field3716 != null) {
            class150.field3716.field863 = false;
        }
        field559++;
        class150.field3716 = null;
        if (class115.field3015 != null) {
            class115.field3015.method1145(5073);
            class115.field3015 = null;
        }
        class14.method155(true);
        class28.method356((byte) -34);
        class14.field366 = null;
        if (field570 != null) {
            field570.method1190(15);
        }
        if (class104.field2630 != null) {
            class104.field2630.method1190(81);
        }
        if (arg0) {
            field551 = null;
        }
        class5.method83(0);
        class75.method671((byte) 79);
        try {
            if (class145.field3610 != null) {
                class145.field3610.method197(true);
            }
            if (class37.field1000 != null) {
                for (int var2 = 0; var2 < class37.field1000.length; var2++) {
                    if (class37.field1000[var2] != null) {
                        class37.field1000[var2].method197(true);
                    }
                }
            }
            if (class99.field2444 != null) {
                class99.field2444.method197(true);
            }
        } catch (IOException var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILee;I)V", line = 1241)
    public static final void method241(int arg0, class34 arg1, int arg2) {
        field569++;
        if (arg2 != -20923) {
            return;
        }
        while (true) {
            class44 var3 = (class44) class28.field791.method8(-1);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field1216; var5++) {
                if (var3.field1209[var5] != null) {
                    if (var3.field1209[var5].field1816 == 2) {
                        var3.field1191[var5] = -5;
                    }
                    if (var3.field1209[var5].field1816 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field1193[var5] != null) {
                    if (var3.field1193[var5].field1816 == 2) {
                        var3.field1191[var5] = -6;
                    }
                    if (var3.field1193[var5].field1816 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg1.method393((byte) -14, arg0);
            arg1.method326(0, (byte) -107);
            int var6 = arg1.field710;
            arg1.method283(true, var3.field1208);
            for (int var7 = 0; var7 < var3.field1216; var7++) {
                if (var3.field1191[var7] == 0) {
                    try {
                        int var8 = var3.field1196[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field1209[var7].field1820;
                            int var13 = var12.getInt(null);
                            arg1.method326(0, (byte) -108);
                            arg1.method283(true, var13);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field1209[var7].field1820;
                            var11.setInt(null, var3.field1192[var7]);
                            arg1.method326(0, (byte) -48);
                        } else if (var8 == 2) {
                            Field var9 = (Field) var3.field1209[var7].field1820;
                            int var10 = var9.getModifiers();
                            arg1.method326(0, (byte) -83);
                            arg1.method283(true, var10);
                        }
                        if (var8 == 3) {
                            Method var14 = (Method) var3.field1193[var7].field1820;
                            byte[][] var15 = var3.field1190[var7];
                            Object[] var16 = new Object[var15.length];
                            for (int var17 = 0; var17 < var15.length; var17++) {
                                ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var15[var17]));
                                var16[var17] = var18.readObject();
                            }
                            Object var19 = var14.invoke(null, var16);
                            if (var19 == null) {
                                arg1.method326(0, (byte) -103);
                            } else if (var19 instanceof Number) {
                                arg1.method326(1, (byte) -49);
                                arg1.method290(((Number) var19).longValue(), (byte) -43);
                            } else if (var19 instanceof class39) {
                                arg1.method326(2, (byte) -97);
                                arg1.method287((class39) var19, false);
                            } else {
                                arg1.method326(4, (byte) -67);
                            }
                        } else if (var8 == 4) {
                            Method var20 = (Method) var3.field1193[var7].field1820;
                            int var21 = var20.getModifiers();
                            arg1.method326(0, (byte) -106);
                            arg1.method283(true, var21);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg1.method326(-10, (byte) -61);
                    } catch (InvalidClassException var23) {
                        arg1.method326(-11, (byte) -67);
                    } catch (StreamCorruptedException var24) {
                        arg1.method326(-12, (byte) -104);
                    } catch (OptionalDataException var25) {
                        arg1.method326(-13, (byte) -44);
                    } catch (IllegalAccessException var26) {
                        arg1.method326(-14, (byte) -26);
                    } catch (IllegalArgumentException var27) {
                        arg1.method326(-15, (byte) -34);
                    } catch (InvocationTargetException var28) {
                        arg1.method326(-16, (byte) -120);
                    } catch (SecurityException var29) {
                        arg1.method326(-17, (byte) -16);
                    } catch (IOException var30) {
                        arg1.method326(-18, (byte) -68);
                    } catch (NullPointerException var31) {
                        arg1.method326(-19, (byte) -49);
                    } catch (Exception var32) {
                        arg1.method326(-20, (byte) -94);
                    } catch (Throwable var33) {
                        arg1.method326(-21, (byte) -50);
                    }
                } else {
                    arg1.method326(var3.field1191[var7], (byte) -58);
                }
            }
            arg1.method308(var6, 0);
            arg1.method288(arg2 + 20922, -var6 + arg1.field710);
            var3.method1170(16);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)V", line = 1438)
    public static final void method242(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 0;
        int var5 = 92 % ((47 - arg2) / 57);
        while (var4 < 8) {
            for (int var8 = 0; var8 < 8; var8++) {
                class7.field219[arg3][arg0 + var4][arg1 + var8] = 0;
            }
            var4++;
        }
        field571++;
        if (arg0 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                class7.field219[arg3][arg0][arg1 + var6] = class7.field219[arg3][arg0 - 1][arg1 + var6];
            }
        }
        if (arg1 > 0) {
            for (int var7 = 1; var7 < 8; var7++) {
                class7.field219[arg3][arg0 + var7][arg1] = class7.field219[arg3][arg0 + var7][arg1 - 1];
            }
        }
        if (arg0 > 0 && class7.field219[arg3][arg0 - 1][arg1] != 0) {
            class7.field219[arg3][arg0][arg1] = class7.field219[arg3][arg0 - 1][arg1];
        } else if (arg1 > 0 && class7.field219[arg3][arg0][arg1 - 1] != 0) {
            class7.field219[arg3][arg0][arg1] = class7.field219[arg3][arg0][arg1 - 1];
        } else if (arg0 > 0 && arg1 > 0 && class7.field219[arg3][arg0 - 1][arg1 - 1] != 0) {
            class7.field219[arg3][arg0][arg1] = class7.field219[arg3][arg0 - 1][arg1 - 1];
        }
    }
}
