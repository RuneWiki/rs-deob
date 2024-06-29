import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class216 {

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "Lna;")
    public static class26 field3385 = null;

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "Lna;")
    public static class26 field3382 = class69.method505(" <col=ffff00>", (byte) -127);

    @OriginalMember(owner = "client!wj", name = "k", descriptor = "Lna;")
    public static class26 field3391 = class69.method505("Continuer", (byte) -120);

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "Lna;")
    public static class26 field3386 = class69.method505("ul", (byte) -125);

    @OriginalMember(owner = "client!wj", name = "l", descriptor = "I")
    public static int field3392 = 0;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "I")
    public static int field3381;

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "I")
    public static int field3383;

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!wj", name = "h", descriptor = "I")
    public static int field3388;

    @OriginalMember(owner = "client!wj", name = "i", descriptor = "I")
    public static int field3389;

    @OriginalMember(owner = "client!wj", name = "j", descriptor = "I")
    public static int field3390;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)V", line = 12)
    public static final void method1443(int arg0) {
        while (true) {
            if (class300.field5157.method1430(class259.field4228, 32666) >= 27) {
                int var1 = class300.field5157.method1427((byte) -11, 15);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (class185.field2877[var1] == null) {
                        var2 = true;
                        class185.field2877[var1] = new class324();
                    }
                    class324 var3 = class185.field2877[var1];
                    class316.field5412[class81.field1270++] = var1;
                    var3.field3982 = class229.field3626;
                    if (var3.field5565 != null && var3.field5565.method1276(-1)) {
                        class173.method1188(var3, false);
                    }
                    int var4 = class300.field5157.method1427((byte) -11, 1);
                    int var5 = class322.field5527[class300.field5157.method1427((byte) -11, 3)];
                    if (var2) {
                        var3.field3946 = var3.field3922 = var5;
                    }
                    int var6 = class300.field5157.method1427((byte) -11, 1);
                    if (var6 == 1) {
                        class168.field2599[class28.field474++] = var1;
                    }
                    int var7 = class300.field5157.method1427((byte) -11, 5);
                    var3.method2251(-1, class96.method720(class300.field5157.method1427((byte) -11, 14), 27112));
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    int var8 = class300.field5157.method1427((byte) -11, 5);
                    if (var8 > 15) {
                        var8 -= 32;
                    }
                    var3.method1665(var3.field5565.field2894, 2);
                    var3.field3900 = var3.field5565.field2938;
                    var3.field3916 = var3.field5565.field2932;
                    if (var3.field3916 == 0) {
                        var3.field3922 = 0;
                    }
                    var3.method1657(-2, var3.method1078((byte) 114), class13.field221.field3904[0] + var8, class13.field221.field3890[0] + var7, var4 == 1);
                    if (var3.field5565.method1276(-1)) {
                        class267.method1903(var3.field3890[0], false, (class78) null, 0, var3, var3.field3904[0], class279.field4651, (class159) null);
                    }
                    continue;
                }
            }
            field3381++;
            class300.field5157.method1433(false);
            if (arg0 <= 0) {
                method1447(-16);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(B)V", line = 87)
    public static void method1444(byte arg0) {
        field3385 = null;
        if (arg0 > 0) {
            field3391 = null;
            field3382 = null;
            field3386 = null;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIIIII)V", line = 104)
    public static final void method1445(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class101 var7 = new class101();
        var7.field1625 = arg1 / 128;
        var7.field1619 = arg2 / 128;
        var7.field1636 = arg3 / 128;
        var7.field1639 = arg4 / 128;
        var7.field1626 = arg0;
        var7.field1635 = arg1;
        var7.field1617 = arg2;
        var7.field1633 = arg3;
        var7.field1622 = arg4;
        var7.field1616 = arg5;
        var7.field1620 = arg6;
        class173.field2715[class69.field1067++] = var7;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Z)V", line = 120)
    public static final void method1446(boolean arg0) {
        if (arg0) {
            class36.field585 = class10.field124;
            class229.field3635 = class8.field96;
            class323.field5561 = class112.field1761;
        } else {
            class36.field585 = class103.field1653;
            class229.field3635 = class258.field4209;
            class323.field5561 = client.field4125;
        }
        class235.field3723 = class36.field585.length;
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(I)V", line = 141)
    public static final void method1447(int arg0) {
        class263.field4299.method1987(3);
        field3384++;
        if (arg0 != 0) {
            field3386 = (class26) null;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIB)V", line = 160)
    public static final void method1448(int arg0, int arg1, byte arg2) {
        field3389++;
        if (class92.field1499 != 0 && arg1 != -1) {
            class267.method1902(class96.field1568, false, arg1, 0, false, class92.field1499);
            class243.field4003 = true;
        }
        if (arg2 != -1) {
            field3386 = (class26) null;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIZLwa;IIBII)V", line = 196)
    public static final void method1449(int arg0, int arg1, boolean arg2, class82 arg3, int arg4, int arg5, byte arg6, int arg7, int arg8) {
        if (arg5 >= 0 && arg5 < 104 && arg4 >= 0 && arg4 < 104) {
            if (!arg2) {
                class92.field1492[arg8][arg5][arg4] = 0;
            }
            while (true) {
                int var9 = arg3.method642((byte) -111);
                if (var9 == 0) {
                    if (arg2) {
                        class229.field3635[0][arg5][arg4] = class258.field4209[0][arg5][arg4];
                    } else if (arg8 == 0) {
                        class229.field3635[0][arg5][arg4] = -class223.method1488(arg4 + arg1 + 556238, 125, arg0 + arg5 + 932731) * 8;
                    } else {
                        class229.field3635[arg8][arg5][arg4] = class229.field3635[arg8 - 1][arg5][arg4] - 240;
                    }
                    break;
                }
                if (var9 == 1) {
                    int var10 = arg3.method642((byte) -110);
                    if (arg2) {
                        class229.field3635[0][arg5][arg4] = class258.field4209[0][arg5][arg4] + (var10 * 8);
                    } else {
                        if (var10 == 1) {
                            var10 = 0;
                        }
                        if (arg8 == 0) {
                            class229.field3635[0][arg5][arg4] = -var10 * 8;
                        } else {
                            class229.field3635[arg8][arg5][arg4] = class229.field3635[arg8 - 1][arg5][arg4] - (var10 * 8);
                        }
                    }
                    break;
                }
                if (var9 <= 49) {
                    class312.field5340[arg8][arg5][arg4] = arg3.method599(false);
                    class282.field4704[arg8][arg5][arg4] = (byte) ((var9 - 2) / 4);
                    class163.field2529[arg8][arg5][arg4] = (byte) class4.method23(var9 + arg7 - 2, 3);
                } else if (var9 > 81) {
                    class264.field4327[arg8][arg5][arg4] = (byte) (var9 - 81);
                } else if (!arg2) {
                    class92.field1492[arg8][arg5][arg4] = (byte) (var9 - 49);
                }
            }
        } else {
            while (true) {
                int var11 = arg3.method642((byte) -103);
                if (var11 == 0) {
                    break;
                }
                if (var11 == 1) {
                    arg3.method642((byte) -48);
                    break;
                }
                if (var11 <= 49) {
                    arg3.method642((byte) -68);
                }
            }
        }
        field3383++;
        if (arg6 < 58) {
            field3392 = 87;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(BII)I", line = 313)
    public static final int method1450(byte arg0, int arg1, int arg2) {
        class186 var3 = (class186) class55.field876.method1827((long) arg1, 0);
        field3390++;
        if (var3 == null) {
            return 0;
        } else if (arg2 == -1) {
            return 0;
        } else {
            int var4 = 0;
            for (int var5 = 0; var5 < var3.field2892.length; var5++) {
                if (var3.field2887[var5] == arg2) {
                    var4 += var3.field2892[var5];
                }
            }
            if (arg0 > -45) {
                field3391 = (class26) null;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(B)V", line = 347)
    public static final void method1451(byte arg0) {
        field3387++;
        if (class88.field1449 != null) {
            class88.field1449.method2018(14821);
            class88.field1449 = null;
        }
        class18.method120((byte) 110);
        class223.method1490();
        for (int var1 = 0; var1 < 4; var1++) {
            class218.field3479[var1].method1531(0);
        }
        class28.method228(62, false);
        System.gc();
        class246.method1698(-1, 2);
        class243.field4003 = false;
        class271.field4528 = -1;
        class134.method909((byte) -77, true);
        class56.field908 = false;
        class165.field2568 = 0;
        class8.field99 = 0;
        class116.field1829 = 0;
        class12.field157 = 0;
        for (int var2 = 0; var2 < class122.field1901.length; var2++) {
            class122.field1901[var2] = null;
        }
        class80.field1261 = 0;
        class81.field1270 = 0;
        if (arg0 != 46) {
            method1451((byte) 43);
        }
        for (int var3 = 0; var3 < 2048; var3++) {
            class268.field4427[var3] = null;
            class64.field1018[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class185.field2877[var4] = null;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var6 = 0; var6 < 104; var6++) {
                for (int var7 = 0; var7 < 104; var7++) {
                    class268.field4433[var5][var6][var7] = null;
                }
            }
        }
        class132.method893(-21556);
        class101.field1615 = 0;
        class1.method7(arg0 - 161);
        class46.method350(true, 3000);
    }
}
