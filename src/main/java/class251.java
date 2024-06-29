import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class251 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!df", name = "b", descriptor = "I")
    public static int field4265;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "I")
    public static int field4266;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "I")
    public static int field4267;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "I")
    public static int field4268;

    @OriginalMember(owner = "client!df", name = "f", descriptor = "I")
    public static int field4269;

    @OriginalMember(owner = "client!df", name = "g", descriptor = "I")
    public static int field4270;

    @OriginalMember(owner = "client!df", name = "h", descriptor = "I")
    public static int field4271;

    @OriginalMember(owner = "client!df", name = "i", descriptor = "I")
    public static int field4272;

    @OriginalMember(owner = "client!df", name = "j", descriptor = "I")
    public static int field4273;

    @OriginalMember(owner = "client!df", name = "k", descriptor = "I")
    public static int field4274;

    @OriginalMember(owner = "client!df", name = "l", descriptor = "I")
    public static int field4275;

    @OriginalMember(owner = "client!df", name = "m", descriptor = "I")
    public static int field4276;

    @OriginalMember(owner = "client!df", name = "n", descriptor = "I")
    public static int field4277;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "Le;")
    public static class169 field4264;

    @OriginalMember(owner = "client!df", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 15)
    public final void focusGained(FocusEvent arg0) {
        field4271++;
    }

    @OriginalMember(owner = "client!df", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 25)
    public final synchronized void keyPressed(KeyEvent arg0) {
        field4272++;
        if (class55.field704 == null) {
            return;
        }
        class102.field1583 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && class298.field5047.length > var2) {
            var3 = class298.field5047[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class280.field4705 >= 0 && var3 >= 0) {
            class241.field3910[class280.field4705] = var3;
            class280.field4705 = class280.field4705 + 1 & 0x7F;
            if (class44.field545 == class280.field4705) {
                class280.field4705 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class121.field1882 + 1 & 0x7F;
            if (class107.field1641 != var4) {
                class67.field884[class121.field1882] = var3;
                class85.field1302[class121.field1882] = -1;
                class121.field1882 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V", line = 100)
    public static final void method1712(int arg0) {
        int var1 = (class248.field4249 >> 10) + (class182.field2916 >> 3);
        int var2 = (class276.field4641 >> 3) + (class157.field2483 >> 10);
        field4273++;
        byte var3 = 0;
        byte var4 = 8;
        int var5 = 80 / ((arg0 - 57) / 34);
        byte var6 = 18;
        class151.field2336 = new byte[var6][];
        class78.field1077 = new byte[var6][];
        class76.field1011 = new int[var6];
        class196.field3228 = new int[var6];
        class28.field356 = new byte[var6][];
        class51.field625 = new byte[var6][];
        class157.field2492 = new int[var6];
        byte var7 = 8;
        class247.field4232 = new int[var6];
        class39.field482 = new byte[var6][];
        class215.field3502 = new int[var6];
        class303.field5104 = new int[var6];
        class280.field4708 = new int[var6][4];
        int var8 = 0;
        for (int var9 = (var1 - 6) / 8; var9 <= ((var1 + 6) / 8); var9++) {
            for (int var10 = (var2 - 6) / 8; var10 <= ((var2 + 6) / 8); var10++) {
                int var11 = (var9 << 8) + var10;
                class303.field5104[var8] = var11;
                class215.field3502[var8] = class175.field2830.method1646(-27248, class134.method938((byte) -125, new class168[] { class133.field2072, class169.method1228(var9, 0), class188.field2986, class169.method1228(var10, 0) }));
                class157.field2492[var8] = class175.field2830.method1646(-27248, class134.method938((byte) -124, new class168[] { class283.field4795, class169.method1228(var9, 0), class188.field2986, class169.method1228(var10, 0) }));
                class247.field4232[var8] = class175.field2830.method1646(-27248, class134.method938((byte) -127, new class168[] { class135.field2111, class169.method1228(var9, 0), class188.field2986, class169.method1228(var10, 0) }));
                class196.field3228[var8] = class175.field2830.method1646(-27248, class134.method938((byte) -125, new class168[] { class293.field4966, class169.method1228(var9, 0), class188.field2986, class169.method1228(var10, 0) }));
                class76.field1011[var8] = class175.field2830.method1646(-27248, class134.method938((byte) -126, new class168[] { class143.field2205, class169.method1228(var9, 0), class188.field2986, class169.method1228(var10, 0) }));
                if (class247.field4232[var8] == -1) {
                    class215.field3502[var8] = -1;
                    class157.field2492[var8] = -1;
                    class196.field3228[var8] = -1;
                    class76.field1011[var8] = -1;
                }
                var8++;
            }
        }
        class114.method834(var7, var4, var1, var3, true, 122, var2);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(B)Lha;", line = 193)
    public static final class49 method1713(byte arg0) {
        field4269++;
        if (arg0 <= 62) {
            return (class49) null;
        }
        int var1 = class214.field3490[0] * class205.field3374[0];
        byte[] var2 = class236.field3779[0];
        class49 var6;
        if (class78.field1086[0]) {
            byte[] var3 = class303.field5115[0];
            int[] var4 = new int[var1];
            for (int var5 = 0; var5 < var1; var5++) {
                var4[var5] = class80.method492(class123.field1905[class159.method1119(var2[var5], 255)], class159.method1119(var3[var5], 255) << 24);
            }
            var6 = new class210(class56.field724, class206.field3381, class154.field2430[0], class254.field4341[0], class205.field3374[0], class214.field3490[0], var4);
        } else {
            int[] var7 = new int[var1];
            for (int var8 = 0; var8 < var1; var8++) {
                var7[var8] = class123.field1905[class159.method1119(var2[var8], 255)];
            }
            var6 = new class49(class56.field724, class206.field3381, class154.field2430[0], class254.field4341[0], class205.field3374[0], class214.field3490[0], var7);
        }
        class244.method1679(-14642);
        return var6;
    }

    @OriginalMember(owner = "client!df", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 241)
    public final synchronized void keyReleased(KeyEvent arg0) {
        field4265++;
        if (class55.field704 != null) {
            class102.field1583 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class298.field5047.length > var2) {
                var3 = class298.field5047[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class280.field4705 >= 0 && var3 >= 0) {
                class241.field3910[class280.field4705] = ~var3;
                class280.field4705 = class280.field4705 + 1 & 0x7F;
                if (class44.field545 == class280.field4705) {
                    class280.field4705 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(B)V", line = 276)
    public static final void method1714(byte arg0) {
        if (class48.field596 > 0) {
            class48.field596--;
        }
        if (class268.field4525 > 1) {
            class268.field4525--;
            class50.field612 = class9.field116;
        }
        field4266++;
        if (class267.field4512) {
            class267.field4512 = false;
            class279.method1929(-97);
            return;
        }
        for (int var1 = 0; var1 < 100 && class213.method1478(91); var1++) {
        }
        if (class193.field3143 != 30) {
            return;
        }
        class78.method462(163, true, class249.field4262);
        Object var2 = class15.field170.field3165;
        synchronized (class15.field170.field3165) {
            if (!class249.field4257) {
                class15.field170.field3167 = 0;
            } else if (class106.field1634 != 0 || class15.field170.field3167 >= 40) {
                class249.field4262.method726(211, 2138389379);
                class217.field3540++;
                class249.field4262.method1095(0, -34);
                int var3 = 0;
                int var4 = class249.field4262.field2367;
                for (int var5 = 0; class15.field170.field3167 > var5 && (class249.field4262.field2367 - var4) < 240; var5++) {
                    int var6 = class15.field170.field3170[var5];
                    int var7 = class15.field170.field3168[var5];
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 65534) {
                        var7 = 65534;
                    }
                    var3++;
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    boolean var8 = false;
                    if (class15.field170.field3168[var5] == -1 && class15.field170.field3170[var5] == -1) {
                        var8 = true;
                        var6 = -1;
                        var7 = -1;
                    }
                    if (class288.field4851 != var6 || class134.field2094 != var7) {
                        int var9 = var6 - class288.field4851;
                        int var10 = var7 - class134.field2094;
                        class134.field2094 = var7;
                        class288.field4851 = var6;
                        if (class28.field357 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var9 += 32;
                            var10 += 32;
                            class249.field4262.method1047(-87, (class28.field357 << 12) + (var9 << 6) + var10);
                            class28.field357 = 0;
                        } else if (class28.field357 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                            class249.field4262.method1095(class28.field357 + 128, -28);
                            var10 += 128;
                            var9 += 128;
                            class249.field4262.method1047(100, (var9 << 8) + var10);
                            class28.field357 = 0;
                        } else if (class28.field357 >= 32) {
                            class249.field4262.method1047(104, class28.field357 + 57344);
                            if (var8) {
                                class249.field4262.method1045(Integer.MIN_VALUE, (byte) 5);
                            } else {
                                class249.field4262.method1045(var7 << 16 | var6, (byte) 67);
                            }
                            class28.field357 = 0;
                        } else {
                            class249.field4262.method1095(class28.field357 + 192, -114);
                            if (var8) {
                                class249.field4262.method1045(Integer.MIN_VALUE, (byte) 31);
                            } else {
                                class249.field4262.method1045(var7 << 16 | var6, (byte) 56);
                            }
                            class28.field357 = 0;
                        }
                    } else if (class28.field357 < 2047) {
                        class28.field357++;
                    }
                }
                class249.field4262.method1063(class249.field4262.field2367 - var4, 77);
                if (class15.field170.field3167 > var3) {
                    class15.field170.field3167 -= var3;
                    for (int var11 = 0; var11 < class15.field170.field3167; var11++) {
                        class15.field170.field3170[var11] = class15.field170.field3170[var11 + var3];
                        class15.field170.field3168[var11] = class15.field170.field3168[var11 + var3];
                    }
                } else {
                    class15.field170.field3167 = 0;
                }
            }
        }
        if (class106.field1634 != 0) {
            class55.field705++;
            int var13 = class83.field1244;
            int var14 = class206.field3384;
            long var15 = (class44.field536 - class224.field3614) / 50L;
            byte var17 = 0;
            if (var13 < 0) {
                var13 = 0;
            } else if (var13 > 65535) {
                var13 = 65535;
            }
            if (class106.field1634 == 2) {
                var17 = 1;
            }
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 65535) {
                var14 = 65535;
            }
            class224.field3614 = class44.field536;
            class249.field4262.method726(196, 2138389379);
            if (var15 > 32767L) {
                var15 = 32767L;
            }
            int var18 = (int) var15;
            class249.field4262.method1047(-106, var18 | var17 << 15);
            class249.field4262.method1054(var13 << 16 | var14, (byte) 124);
        }
        if (class83.field1251 > 0) {
            class83.field1251--;
        }
        if (class190.field3071[96] || class190.field3071[97] || class190.field3071[98] || class190.field3071[99]) {
            class214.field3498 = true;
        }
        if (class214.field3498 && class83.field1251 <= 0) {
            class83.field1251 = 20;
            class155.field2437++;
            class214.field3498 = false;
            class249.field4262.method726(44, 2138389379);
            class249.field4262.method1050(class71.field959, -29944);
            class249.field4262.method1050(class171.field2787, -29944);
        }
        if (client.field4935 && !class213.field3484) {
            class297.field5017++;
            class213.field3484 = true;
            class249.field4262.method726(142, 2138389379);
            class249.field4262.method1095(1, -51);
        }
        if (!client.field4935 && class213.field3484) {
            class297.field5017++;
            class213.field3484 = false;
            class249.field4262.method726(142, 2138389379);
            class249.field4262.method1095(0, -111);
        }
        if (!class76.field1026) {
            class249.field4262.method726(94, 2138389379);
            class226.field3675++;
            class249.field4262.method1054(class115.method840(-124), (byte) 125);
            class76.field1026 = true;
        }
        class180.method1289(0);
        if (class193.field3143 != 30) {
            return;
        }
        class96.method736(-1);
        class274.method1894(-114);
        class142.field2190++;
        if (class142.field2190 > 750) {
            class279.method1929(97);
            return;
        }
        class298.method2041(true);
        class238.method1605(true);
        class56.method311(-126);
        if (class77.field1045 != null) {
            class134.method935((byte) 19);
        }
        for (int var19 = class259.method1778(true, 0); var19 != -1; var19 = class259.method1778(false, 0)) {
            class271.method1875(var19, (byte) 75);
            class242.field3997[class159.method1119(31, class67.field878++)] = var19;
        }
        for (class26 var20 = class135.method944(97); var20 != null; var20 = class135.method944(89)) {
            int var21 = var20.method133((byte) -125);
            int var22 = var20.method139(-127);
            if (var21 == 1) {
                class168.field2750[var22] = var20.field325;
                class283.field4790[class159.method1119(class224.field3611++, 31)] = var22;
            } else if (var21 == 2) {
                class172.field2800[var22] = var20.field332;
                class18.field212[class159.method1119(class51.field624++, 31)] = var22;
            }
        }
        if (class60.field785 != 0) {
            class264.field4467 += 20;
            if (class264.field4467 >= 400) {
                class60.field785 = 0;
            }
        }
        class274.field4619++;
        if (class196.field3225 != null) {
            class179.field2889++;
            if (class179.field2889 >= 15) {
                client.method2011((byte) -59, class196.field3225);
                class196.field3225 = null;
            }
        }
        if (class24.field291 != null) {
            client.method2011((byte) -59, class24.field291);
            class61.field803++;
            if (class262.field4442 > class237.field3786 + 5 || class237.field3786 - 5 > class262.field4442 || class155.field2457 > (class116.field1803 + 5) || (class116.field1803 - 5) > class155.field2457) {
                client.field4941 = true;
            }
            if (class281.field4725 == 0) {
                if (client.field4941 && class61.field803 >= 5) {
                    if (class72.field962 == class24.field291 && class270.field4542 != class267.field4513) {
                        class199.field3292++;
                        class242 var23 = class24.field291;
                        byte var24 = 0;
                        if (class171.field2795 == 1 && var23.field4115 == 206) {
                            var24 = 1;
                        }
                        if (var23.field4013[class267.field4513] <= 0) {
                            var24 = 0;
                        }
                        if (class114.method832(client.method2015(var23), -1)) {
                            int var25 = class267.field4513;
                            int var26 = class270.field4542;
                            var23.field4013[var25] = var23.field4013[var26];
                            var23.field4066[var25] = var23.field4066[var26];
                            var23.field4013[var26] = -1;
                            var23.field4066[var26] = 0;
                        } else if (var24 == 1) {
                            int var27 = class267.field4513;
                            int var28 = class270.field4542;
                            while (var27 != var28) {
                                if (var28 > var27) {
                                    var23.method1661(var28 - 1, var28, 122);
                                    var28--;
                                } else if (var28 < var27) {
                                    var23.method1661(var28 + 1, var28, 124);
                                    var28++;
                                }
                            }
                        } else {
                            var23.method1661(class267.field4513, class270.field4542, 122);
                        }
                        class249.field4262.method726(87, 2138389379);
                        class249.field4262.method1061(var24, false);
                        class249.field4262.method1047(107, class267.field4513);
                        class249.field4262.method1045(class24.field291.field3996, (byte) 12);
                        class249.field4262.method1076(class270.field4542, -58);
                    }
                } else if ((class39.field487 == 1 || class284.method1962(class22.field275 - 1, true)) && class22.field275 > 2) {
                    class201.method1411((byte) -117);
                } else if (class22.field275 > 0) {
                    class56.method319(-31082);
                }
                class24.field291 = null;
                class106.field1634 = 0;
                class179.field2889 = 10;
            }
        }
        class299.field5074 = false;
        class242 var29 = class177.field2855;
        class138.field2132 = 0;
        class303.field5106 = false;
        if (arg0 < 35) {
            return;
        }
        class177.field2855 = null;
        class242 var30 = class271.field4553;
        class242.field3970 = null;
        class271.field4553 = null;
        while (class69.method390(-13828) && class138.field2132 < 128) {
            class106.field1631[class138.field2132] = class80.field1161;
            class103.field1605[class138.field2132] = class86.field1339;
            class138.field2132++;
        }
        class77.field1045 = null;
        if (class19.field221 != -1) {
            class303.method2061(0, class299.field5069, class19.field221, 0, 0, 16572, class14.field142, 0);
        }
        class9.field116++;
        while (true) {
            class182 var31;
            class242 var32;
            class242 var33;
            do {
                var31 = (class182) class238.field3816.method447(true);
                if (var31 == null) {
                    while (true) {
                        class182 var34;
                        class242 var35;
                        class242 var36;
                        do {
                            var34 = (class182) class5.field56.method447(true);
                            if (var34 == null) {
                                while (true) {
                                    class182 var37;
                                    class242 var38;
                                    class242 var39;
                                    do {
                                        var37 = (class182) class266.field4478.method447(true);
                                        if (var37 == null) {
                                            if (class24.field297 && class77.field1045 == null) {
                                                class24.field297 = false;
                                            }
                                            if (class177.field2861 != null) {
                                                class113.method827(16777215);
                                            }
                                            if (class280.field4694 > 0 && class190.field3071[82] && class190.field3071[81] && class26.field324 != 0) {
                                                int var40 = class79.field1127 - class26.field324;
                                                if (var40 < 0) {
                                                    var40 = 0;
                                                } else if (var40 > 3) {
                                                    var40 = 3;
                                                }
                                                class151.method1036(class266.field4489.field3033[0] + class276.field4641, 895969644, var40, class182.field2916 + class266.field4489.field3020[0]);
                                            }
                                            if (class114.field1783 != -1) {
                                                int var41 = class261.field4433;
                                                int var42 = class114.field1783;
                                                if (class280.field4694 > 0 && class190.field3071[82] && class190.field3071[81]) {
                                                    class151.method1036(class276.field4641 + var41, 895969644, class79.field1127, class182.field2916 + var42);
                                                } else {
                                                    boolean var43 = class240.method1623(0, true, (byte) 80, class266.field4489.field3020[0], 0, var42, 0, 0, class266.field4489.field3033[0], 0, 0, var41);
                                                    if (var43) {
                                                        class288.field4854 = class83.field1244;
                                                        class60.field785 = 1;
                                                        class264.field4467 = 0;
                                                        class296.field5010 = class206.field3384;
                                                    }
                                                }
                                                class114.field1783 = -1;
                                            }
                                            class73.method408((byte) -88);
                                            if (class177.field2855 != var29) {
                                                if (var29 != null) {
                                                    client.method2011((byte) -59, var29);
                                                }
                                                if (class177.field2855 != null) {
                                                    client.method2011((byte) -59, class177.field2855);
                                                }
                                            }
                                            if (class271.field4553 != var30 && class200.field3298 == class117.field1820) {
                                                if (var30 != null) {
                                                    client.method2011((byte) -59, var30);
                                                }
                                                if (class271.field4553 != null) {
                                                    client.method2011((byte) -59, class271.field4553);
                                                }
                                            }
                                            if (class271.field4553 == null) {
                                                if (class117.field1820 > 0) {
                                                    class117.field1820--;
                                                }
                                            } else if (class200.field3298 > class117.field1820) {
                                                class117.field1820++;
                                                if (class200.field3298 == class117.field1820) {
                                                    client.method2011((byte) -59, class271.field4553);
                                                }
                                            }
                                            if (class289.field4867 == 1) {
                                                class233.method1583(-91);
                                            } else if (class289.field4867 == 2) {
                                                class289.method1994((byte) 43);
                                            } else {
                                                class19.method90((byte) -128);
                                            }
                                            for (int var44 = 0; var44 < 5; var44++) {
                                                int var10002 = class159.field2516[var44]++;
                                            }
                                            int var45 = class180.method1295(-39014264);
                                            int var46 = class299.method2048(false);
                                            if (var45 > 4500 && var46 > 4500) {
                                                class48.field596 = 250;
                                                class5.field58++;
                                                class197.method1391((byte) -64, 4000);
                                                class249.field4262.method726(11, 2138389379);
                                            }
                                            class115.field1794++;
                                            class224.field3624++;
                                            if (class224.field3624 > 500) {
                                                class224.field3624 = 0;
                                                int var47 = (int) (Math.random() * 8.0D);
                                                if ((var47 & 0x2) == 2) {
                                                    class103.field1594 += class20.field244;
                                                }
                                                if ((var47 & 0x4) == 4) {
                                                    class110.field1723 += class267.field4506;
                                                }
                                                if ((var47 & 0x1) == 1) {
                                                    class39.field490 += class54.field667;
                                                }
                                            }
                                            if (class110.field1723 < -40) {
                                                class267.field4506 = 1;
                                            }
                                            if (class103.field1594 < -55) {
                                                class20.field244 = 2;
                                            }
                                            class303.field5107++;
                                            if (class103.field1594 > 55) {
                                                class20.field244 = -2;
                                            }
                                            if (class39.field490 < -50) {
                                                class54.field667 = 2;
                                            }
                                            if (class39.field490 > 50) {
                                                class54.field667 = -2;
                                            }
                                            if (class115.field1794 > 500) {
                                                int var48 = (int) (Math.random() * 8.0D);
                                                if ((var48 & 0x2) == 2) {
                                                    class70.field934 += class200.field3296;
                                                }
                                                class115.field1794 = 0;
                                                if ((var48 & 0x1) == 1) {
                                                    class45.field551 += class231.field3728;
                                                }
                                            }
                                            if (class70.field934 < -20) {
                                                class200.field3296 = 1;
                                            }
                                            if (class110.field1723 > 40) {
                                                class267.field4506 = -1;
                                            }
                                            if (class45.field551 < -60) {
                                                class231.field3728 = 2;
                                            }
                                            if (class70.field934 > 10) {
                                                class200.field3296 = -1;
                                            }
                                            if (class45.field551 > 60) {
                                                class231.field3728 = -2;
                                            }
                                            if (class303.field5107 > 50) {
                                                class249.field4262.method726(237, 2138389379);
                                                class289.field4870++;
                                            }
                                            class283.method1954(113);
                                            try {
                                                if (class157.field2493 != null && class249.field4262.field2367 > 0) {
                                                    class157.field2493.method1233((byte) 124, class249.field4262.field2359, class249.field4262.field2367, 0);
                                                    class249.field4262.field2367 = 0;
                                                    class303.field5107 = 0;
                                                }
                                            } catch (IOException var50) {
                                                class279.method1929(76);
                                            }
                                            return;
                                        }
                                        var38 = var37.field2928;
                                        if (var38.field3956 < 0) {
                                            break;
                                        }
                                        var39 = class130.method910((byte) -86, var38.field3977);
                                    } while (var39 == null || var39.field4004 == null || var38.field3956 >= var39.field4004.length || var39.field4004[var38.field3956] != var38);
                                    class177.method1270(var37, (byte) -32);
                                }
                            }
                            var35 = var34.field2928;
                            if (var35.field3956 < 0) {
                                break;
                            }
                            var36 = class130.method910((byte) -99, var35.field3977);
                        } while (var36 == null || var36.field4004 == null || var35.field3956 >= var36.field4004.length || var36.field4004[var35.field3956] != var35);
                        class177.method1270(var34, (byte) -80);
                    }
                }
                var32 = var31.field2928;
                if (var32.field3956 < 0) {
                    break;
                }
                var33 = class130.method910((byte) -117, var32.field3977);
            } while (var33 == null || var33.field4004 == null || var32.field3956 >= var33.field4004.length || var33.field4004[var32.field3956] != var32);
            class177.method1270(var31, (byte) -50);
        }
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(B)V", line = 1024)
    public static final void method1715(byte arg0) {
        class9.field120 = 0;
        field4275++;
        class127.field1954 = 0;
        if (arg0 > -74) {
            method1714((byte) 70);
        }
        class240.method1625((byte) 89);
        class274.method1893((byte) -102);
        class213.method1479(96);
        class139.method959(0);
        for (int var1 = 0; var1 < class127.field1954; var1++) {
            int var2 = class300.field5084[var1];
            if (class203.field3335 != class9.field117[var2].field3011) {
                if (class9.field117[var2].field690 > 0) {
                    class261.method1823(class9.field117[var2], (byte) 94);
                }
                class9.field117[var2] = null;
            }
        }
        if (class110.field1726 != class166.field2671.field2367) {
            throw new RuntimeException("gpp1 pos:" + class166.field2671.field2367 + " psize:" + class110.field1726);
        }
        for (int var3 = 0; var3 < class167.field2676; var3++) {
            if (class9.field117[class281.field4719[var3]] == null) {
                throw new RuntimeException("gpp2 pos:" + var3 + " size:" + class167.field2676);
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(II[BI)Z", line = 1084)
    public static final boolean method1716(int arg0, int arg1, byte[] arg2, int arg3) {
        field4274++;
        boolean var4 = true;
        int var5 = arg1;
        class153 var6 = new class153(arg2);
        label54: while (true) {
            int var7 = var6.method1079((byte) -93);
            if (var7 == 0) {
                return var4;
            }
            var5 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var6.method1074((byte) -94);
                    if (var11 == 0) {
                        continue label54;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 & 0x3F;
                    int var13 = var8 >> 6 & 0x3F;
                    int var14 = arg3 + var13;
                    int var15 = arg0 + var12;
                    int var16 = var6.method1042((byte) 127) >> 2;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class161 var17 = class15.method64(var5, false);
                        if (var16 != 22 || class69.field914 || var17.field2596 != 0 || var17.field2571 == 1 || var17.field2554) {
                            var9 = true;
                            if (!var17.method1134(42)) {
                                var4 = false;
                                class263.field4455++;
                            }
                        }
                    }
                }
                int var10 = var6.method1074((byte) -107);
                if (var10 == 0) {
                    break;
                }
                var6.method1042((byte) -17);
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 1184)
    public final void keyTyped(KeyEvent arg0) {
        field4277++;
        if (class55.field704 != null) {
            int var2 = class167.method1160(117, arg0);
            if (var2 >= 0) {
                int var3 = class121.field1882 + 1 & 0x7F;
                if (class107.field1641 != var3) {
                    class67.field884[class121.field1882] = -1;
                    class85.field1302[class121.field1882] = var2;
                    class121.field1882 = var3;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!df", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 1219)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class55.field704 != null) {
            class280.field4705 = -1;
        }
        field4270++;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIZIII)V", line = 1237)
    public static final void method1717(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field4267++;
        if (arg2) {
            return;
        }
        if (class150.field2331 <= arg4 && arg5 <= class65.field874 && class9.field112 <= arg3 && arg0 <= class44.field538) {
            class214.method1486(arg4, arg0, arg3, arg5, -20636, arg1);
        } else {
            class267.method1860(arg3, arg0, arg5, 3821, arg1, arg4);
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(I)V", line = 1265)
    public static void method1718(int arg0) {
        if (arg0 != 0) {
            field4268 = -51;
        }
        field4264 = null;
    }
}
