import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class41 extends class102 {

    @OriginalMember(owner = "client!gj", name = "W", descriptor = "Lr;")
    public static class66 field681 = class93.method641(43, "unzap");

    @OriginalMember(owner = "client!gj", name = "I", descriptor = "I")
    public static int field667;

    @OriginalMember(owner = "client!gj", name = "J", descriptor = "I")
    public static int field668;

    @OriginalMember(owner = "client!gj", name = "K", descriptor = "I")
    public static int field669;

    @OriginalMember(owner = "client!gj", name = "L", descriptor = "I")
    public static int field670;

    @OriginalMember(owner = "client!gj", name = "M", descriptor = "I")
    public static int field671;

    @OriginalMember(owner = "client!gj", name = "N", descriptor = "I")
    public static int field672;

    @OriginalMember(owner = "client!gj", name = "P", descriptor = "I")
    public static int field674;

    @OriginalMember(owner = "client!gj", name = "Q", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!gj", name = "S", descriptor = "I")
    public static int field677;

    @OriginalMember(owner = "client!gj", name = "U", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!gj", name = "V", descriptor = "I")
    public static int field680;

    @OriginalMember(owner = "client!gj", name = "X", descriptor = "I")
    public static int field682;

    @OriginalMember(owner = "client!gj", name = "Y", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!gj", name = "ab", descriptor = "I")
    public static int field685;

    @OriginalMember(owner = "client!gj", name = "bb", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!gj", name = "cb", descriptor = "I")
    public static int field687;

    @OriginalMember(owner = "client!gj", name = "T", descriptor = "Lcj;")
    public static class28 field678;

    @OriginalMember(owner = "client!gj", name = "eb", descriptor = "Lcj;")
    public static class28 field689;

    @OriginalMember(owner = "client!gj", name = "R", descriptor = "[I")
    public int[] field676;

    @OriginalMember(owner = "client!gj", name = "Z", descriptor = "[I")
    private int[] field684;

    @OriginalMember(owner = "client!gj", name = "db", descriptor = "[Lr;")
    private class66[] field688;

    @OriginalMember(owner = "client!gj", name = "O", descriptor = "[[I")
    private int[][] field673;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(III)I")
    public final int method257(int arg0, int arg1, int arg2) {
        field679++;
        if (this.field684 == null || arg0 < 0 || arg0 > this.field684.length) {
            return -1;
        } else {
            if (arg1 != -20484) {
                method267(-25, true, 33);
            }
            return this.field673[arg0] == null || arg2 < 0 || this.field673[arg0].length < arg2 ? -1 : this.field673[arg0][arg2];
        }
    }

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "(B)I")
    public final int method258(byte arg0) {
        if (arg0 > -21) {
            this.field676 = null;
        }
        field685++;
        return this.field684 == null ? 0 : this.field684.length;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I[ILlh;)V")
    public final void method259(int arg0, int[] arg1, class249 arg2) {
        field680++;
        if (this.field684 == null) {
            return;
        }
        int var4 = 0;
        if (arg0 > -14) {
            return;
        }
        while (this.field684.length > var4) {
            if (var4 >= arg1.length) {
                return;
            }
            int var5 = class257.field4506[this.method260(var4, (byte) -66)];
            if (var5 > 0) {
                arg2.method1643((long) arg1[var4], -112, var5);
            }
            var4++;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IB)I")
    public final int method260(int arg0, byte arg1) {
        field667++;
        if (arg1 != -66) {
            this.field684 = null;
        }
        return this.field684 == null || arg0 < 0 || this.field684.length < arg0 ? -1 : this.field684[arg0];
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(BI)V")
    public static final void method261(byte arg0, int arg1) {
        field671++;
        if (arg1 < 0) {
            return;
        }
        int var2 = class188.field3272[arg1];
        int var3 = class43.field710[arg1];
        long var4 = class70.field1414[arg1];
        if (var3 >= 2000) {
            var3 -= 2000;
        }
        int var6 = (int) class70.field1414[arg1];
        int var7 = class60.field1025[arg1];
        if (var3 == 20) {
            class45 var8 = class59.field988[var6];
            if (var8 != null) {
                class67.field1346++;
                class10.method44(0, 0, class207.field3595.field2039[0], class207.field3595.field2086[0], 1, 1, var8.field2086[0], false, 0, -3, 2, var8.field2039[0]);
                class176.field3089 = class174.field3068;
                class15.field191 = class188.field3274;
                client.field1644 = 2;
                class42.field694 = 0;
                class28.field412.method578(78, 227);
                class28.field412.method1685((byte) 19, var6);
            }
        }
        if (var3 == 41) {
            class121.field2293++;
            class28.field412.method578(-57, 203);
            class28.field412.method1685((byte) 19, var7);
            class28.field412.method1666(544537784, var2);
            class28.field412.method1650(false, var6);
            class144.field2624 = 0;
            class52.field927 = class54.method367(var2, (byte) -80);
            class251.field4419 = var7;
        }
        if (var3 == 58) {
            class28.field412.method578(87, 137);
            class27.field361++;
            class28.field412.method1650(false, var6);
            class28.field412.method1640((byte) -104, var2);
            class28.field412.method1656(var7, (byte) 38);
            class144.field2624 = 0;
            class52.field927 = class54.method367(var2, (byte) -80);
            class251.field4419 = var7;
        }
        if (var3 == 7) {
            class28.field412.method578(-94, 152);
            class244.field4269++;
            class28.field412.method1685((byte) 19, var7);
            class28.field412.method1671(var6, -49);
            class28.field412.method1640((byte) -102, var2);
            class144.field2624 = 0;
            class52.field927 = class54.method367(var2, (byte) -80);
            class251.field4419 = var7;
        }
        if (var3 == 1005) {
            class176.field3089 = class174.field3068;
            class42.field694 = 0;
            class149.field2689++;
            class15.field191 = class188.field3274;
            client.field1644 = 2;
            class28.field412.method578(-111, 84);
            class28.field412.method1671(var6, -37);
        }
        if (var3 == 35) {
            class63.field1147++;
            boolean var9 = class10.method44(0, 0, class207.field3595.field2039[0], class207.field3595.field2086[0], 0, 0, var2, false, 0, -3, 2, var7);
            if (!var9) {
                class10.method44(0, 0, class207.field3595.field2039[0], class207.field3595.field2086[0], 1, 1, var2, false, 0, -3, 2, var7);
            }
            class42.field694 = 0;
            client.field1644 = 2;
            class15.field191 = class188.field3274;
            class176.field3089 = class174.field3068;
            class28.field412.method578(54, 191);
            class28.field412.method1650(false, var7 + class3.field39);
            class28.field412.method1650(false, class34.field512 + var2);
            class28.field412.method1671(var6, -58);
        }
        if (var3 == 6) {
            class243.field4247++;
            class28.field412.method578(-99, 136);
            class28.field412.method1640((byte) -126, var2);
            class28.field412.method1650(false, class240.field4174);
            class28.field412.method1685((byte) 19, var7);
            class28.field412.method1681(-19237, class225.field3859);
        }
        if (var3 == 1006) {
            class192.field3327++;
            client.field1644 = 2;
            class176.field3089 = class174.field3068;
            class42.field694 = 0;
            class15.field191 = class188.field3274;
            class28.field412.method578(-77, 38);
            class28.field412.method1685((byte) 19, var6);
        }
        if (var3 == 29) {
            class37 var11 = class178.field3112[var6];
            if (var11 != null) {
                class10.method44(0, 0, class207.field3595.field2039[0], class207.field3595.field2086[0], 1, 1, var11.field2086[0], false, 0, -3, 2, var11.field2039[0]);
                class176.field3089 = class174.field3068;
                class63.field1157++;
                class42.field694 = 0;
                class15.field191 = class188.field3274;
                client.field1644 = 2;
                class28.field412.method578(85, 123);
                class28.field412.method1650(false, var6);
            }
        }
        if (var3 == 12) {
            class37 var12 = class178.field3112[var6];
            if (var12 != null) {
                class10.method44(0, 0, class207.field3595.field2039[0], class207.field3595.field2086[0], 1, 1, var12.field2086[0], false, 0, -3, 2, var12.field2039[0]);
                class176.field3089 = class174.field3068;
                class42.field694 = 0;
                client.field1644 = 2;
                class15.field191 = class188.field3274;
                class28.field412.method578(110, 7);
                class28.field412.method1671(var6, -107);
                class62.field1042++;
            }
        }
        if (var3 == 4) {
            class45 var13 = class59.field988[var6];
            if (var13 != null) {
                class7.field69++;
                class10.method44(0, 0, class207.field3595.field2039[0], class207.field3595.field2086[0], 1, 1, var13.field2086[0], false, 0, -3, 2, var13.field2039[0]);
                class42.field694 = 0;
                class15.field191 = class188.field3274;
                client.field1644 = 2;
                class176.field3089 = class174.field3068;
                class28.field412.method578(-105, 35);
                class28.field412.method1685((byte) 19, var6);
            }
        }
        if (var3 == 39) {
            class28.field412.method578(-83, 40);
            class28.field412.method1656(var6, (byte) 38);
            class192.field3334++;
            class28.field412.method1671(class120.field2280, -26);
            class28.field412.method1640((byte) -109, class85.field1676);
            class28.field412.method1640((byte) -111, var2);
            class28.field412.method1671(var7, -85);
            class28.field412.method1671(class45.field800, -80);
            class144.field2624 = 0;
            class52.field927 = class54.method367(var2, (byte) -80);
            class251.field4419 = var7;
        }
        if (var3 == 1 && class72.method516(var4, var2, -12974, var7)) {
            class89.field1718++;
            class28.field412.method578(-73, 224);
            class28.field412.method1656(var2 + class34.field512, (byte) 38);
            class28.field412.method1650(false, class120.field2280);
            class28.field412.method1640((byte) -107, class85.field1676);
            class28.field412.method1671(class45.field800, -80);
            class28.field412.method1671(Integer.MAX_VALUE & (int) (var4 >>> 32), -106);
            class28.field412.method1650(false, var7 + class3.field39);
        }
        if (var3 == 2) {
            class45 var14 = class59.field988[var6];
            if (var14 != null) {
                class130.field2419++;
                class10.method44(0, 0, class207.field3595.field2039[0], class207.field3595.field2086[0], 1, 1, var14.field2086[0], false, 0, -3, 2, var14.field2039[0]);
                client.field1644 = 2;
                class176.field3089 = class174.field3068;
                class42.field694 = 0;
                class15.field191 = class188.field3274;
                class28.field412.method578(-65, 131);
                class28.field412.method1686((byte) 127, class85.field1676);
                class28.field412.method1671(var6, -85);
                class28.field412.method1656(class45.field800, (byte) 38);
                class28.field412.method1656(class120.field2280, (byte) 38);
            }
        }
        if (var3 == 1002) {
            client.field1644 = 2;
            class15.field191 = class188.field3274;
            class42.field694 = 0;
            class176.field3089 = class174.field3068;
            class37 var15 = class178.field3112[var6];
            if (var15 != null) {
                class206 var16 = var15.field548;
                if (var16.field3541 != null) {
                    var16 = var16.method1339(-94);
                }
                if (var16 != null) {
                    class28.field412.method578(-119, 88);
                    class28.field412.method1650(false, var16.field3568);
                    class174.field3067++;
                }
            }
        }
        if (var3 == 31) {
            class28.field412.method578(-54, 154);
            class28.field412.method1685((byte) 19, var6);
            class165.field2963++;
            class28.field412.method1656(class240.field4174, (byte) 38);
            class28.field412.method1656(var7, (byte) 38);
            class28.field412.method1686((byte) 127, var2);
            class28.field412.method1686((byte) 127, class225.field3859);
            class144.field2624 = 0;
            class52.field927 = class54.method367(var2, (byte) -80);
            class251.field4419 = var7;
        }
        if (var3 == 32) {
            class63 var17 = class218.method1401(var2, false, var7);
            if (var17 != null) {
                class1.method2((byte) 96);
                class178.method1194((byte) -113, class45.method328(106, client.method592(var17)), var7, var2);
                class188.field3259 = 0;
                class162.field2895 = class259.method1769(0, var17);
                if (class162.field2895 == null) {
                    class162.field2895 = class10.field121;
                }
                if (!var17.field1186) {
                    class195.field3366 = class212.method1372(2, new class66[] { class234.field4091, var17.field1221, class80.field1565 });
                    return;
                }
                class195.field3366 = class212.method1372(2, new class66[] { var17.field1213, class80.field1565 });
            }
            return;
        }
        if (var3 == 8) {
            boolean var18 = class10.method44(0, 0, class207.field3595.field2039[0], class207.field3595.field2086[0], 0, 0, var2, false, 0, -3, 2, var7);
            if (!var18) {
                class10.method44(0, 0, class207.field3595.field2039[0], class207.field3595.field2086[0], 1, 1, var2, false, 0, -3, 2, var7);
            }
            class15.field191 = class188.field3274;
            client.field1644 = 2;
            class42.field694 = 0;
            class261.field4602++;
            class176.field3089 = class174.field3068;
            class28.field412.method578(-55, 9);
            class28.field412.method1671(class120.field2280, -41);
            class28.field412.method1685((byte) 19, var6);
            class28.field412.method1681(-19237, class85.field1676);
            class28.field412.method1685((byte) 19, class34.field512 + var2);
            class28.field412.method1650(false, class45.field800);
            class28.field412.method1656(class3.field39 + var7, (byte) 38);
        }
        if (var3 == 14) {
            class57.field981++;
            class28.field412.method578(-121, 220);
            class28.field412.method1686((byte) 127, var2);
            class28.field412.method1656(var6, (byte) 38);
            class28.field412.method1671(var7, -96);
            class144.field2624 = 0;
            class52.field927 = class54.method367(var2, (byte) -80);
            class251.field4419 = var7;
        }
        if (var3 == 16) {
            class1.method2((byte) 114);
            class63 var20 = class54.method367(var2, (byte) -80);
            class188.field3259 = 1;
            class120.field2280 = var6;
            class85.field1676 = var2;
            class45.field800 = var7;
            class215.method1385(var20, -120);
            class103.field2004 = class212.method1372(2, new class66[] { class150.field2695, class40.method242(-25672, var6).field2813, class80.field1565 });
            if (class103.field2004 == null) {
                class103.field2004 = class220.field3772;
            }
            return;
        }
        if (var3 == 9) {
            class181.field3170++;
            boolean var21 = class10.method44(0, 0, class207.field3595.field2039[0], class207.field3595.field2086[0], 0, 0, var2, false, 0, -3, 2, var7);
            if (!var21) {
                class10.method44(0, 0, class207.field3595.field2039[0], class207.field3595.field2086[0], 1, 1, var2, false, 0, -3, 2, var7);
            }
            class42.field694 = 0;
            class15.field191 = class188.field3274;
            client.field1644 = 2;
            class176.field3089 = class174.field3068;
            class28.field412.method578(80, 33);
            class28.field412.method1685((byte) 19, class34.field512 + var2);
            class28.field412.method1656(var6, (byte) 38);
            class28.field412.method1650(false, var7 + class3.field39);
        }
        if (var3 == 5) {
            class8.method32(class196.field3401, var7, var2);
        }
        if (var3 == 13) {
            class233.field4073++;
            class28.field412.method578(-119, 134);
            class28.field412.method1650(false, var6);
            class28.field412.method1685((byte) 19, var7);
            class28.field412.method1686((byte) 127, var2);
            class144.field2624 = 0;
            class52.field927 = class54.method367(var2, (byte) -80);
            class251.field4419 = var7;
        }
        if (var3 == 25) {
            class45 var23 = class59.field988[var6];
            if (var23 != null) {
                class33.field494++;
                class10.method44(0, 0, class207.field3595.field2039[0], class207.field3595.field2086[0], 1, 1, var23.field2086[0], false, 0, -3, 2, var23.field2039[0]);
                class15.field191 = class188.field3274;
                class42.field694 = 0;
                client.field1644 = 2;
                class176.field3089 = class174.field3068;
                class28.field412.method578(106, 68);
                class28.field412.method1685((byte) 19, var6);
            }
        }
        if (var3 == 3) {
            class143.field2614++;
            boolean var24 = class10.method44(0, 0, class207.field3595.field2039[0], class207.field3595.field2086[0], 0, 0, var2, false, 0, -3, 2, var7);
            if (!var24) {
                class10.method44(0, 0, class207.field3595.field2039[0], class207.field3595.field2086[0], 1, 1, var2, false, 0, -3, 2, var7);
            }
            client.field1644 = 2;
            class15.field191 = class188.field3274;
            class42.field694 = 0;
            class176.field3089 = class174.field3068;
            class28.field412.method578(-71, 39);
            class28.field412.method1656(var6, (byte) 38);
            class28.field412.method1671(class3.field39 + var7, -61);
            class28.field412.method1656(class34.field512 + var2, (byte) 38);
        }
        if (var3 == 1001) {
            class63 var26 = class54.method367(var2, (byte) -80);
            if (var26 == null || var26.field1097[var7] < 100000) {
                class28.field412.method578(120, 38);
                class28.field412.method1685((byte) 19, var6);
                class192.field3327++;
            } else {
                class234.method1533(class85.field1679, 125, class212.method1372(2, new class66[] { class144.method989(var26.field1097[var7], 0), class24.field310, class40.method242(-25672, var6).field2813 }), 0);
            }
            class144.field2624 = 0;
            class52.field927 = class54.method367(var2, (byte) -80);
            class251.field4419 = var7;
        }
        if (var3 == 50) {
            class45 var27 = class59.field988[var6];
            if (var27 != null) {
                class10.method44(0, 0, class207.field3595.field2039[0], class207.field3595.field2086[0], 1, 1, var27.field2086[0], false, 0, -3, 2, var27.field2039[0]);
                class81.field1576++;
                client.field1644 = 2;
                class15.field191 = class188.field3274;
                class42.field694 = 0;
                class176.field3089 = class174.field3068;
                class28.field412.method578(-104, 70);
                class28.field412.method1650(false, class240.field4174);
                class28.field412.method1656(var6, (byte) 38);
                class28.field412.method1666(544537784, class225.field3859);
            }
        }
        if (var3 == 1003) {
            class215.field3702++;
            class72.method516(var4, var2, -12974, var7);
            class28.field412.method578(75, 190);
            class28.field412.method1656(class34.field512 + var2, (byte) 38);
            class28.field412.method1685((byte) 19, var7 + class3.field39);
            class28.field412.method1685((byte) 19, Integer.MAX_VALUE & (int) (var4 >>> 32));
        }
        if (var3 == 22) {
            class28.field412.method578(-106, 211);
            class212.field3637++;
            class28.field412.method1686((byte) 127, var2);
            class28.field412.method1685((byte) 19, var7);
            class28.field412.method1650(false, var6);
            class144.field2624 = 0;
            class52.field927 = class54.method367(var2, (byte) -80);
            class251.field4419 = var7;
        }
        if (var3 == 11) {
            class37 var28 = class178.field3112[var6];
            if (var28 != null) {
                class10.method44(0, 0, class207.field3595.field2039[0], class207.field3595.field2086[0], 1, 1, var28.field2086[0], false, 0, -3, 2, var28.field2039[0]);
                class42.field694 = 0;
                client.field1644 = 2;
                class176.field3089 = class174.field3068;
                class248.field4333++;
                class15.field191 = class188.field3274;
                class28.field412.method578(-66, 221);
                class28.field412.method1685((byte) 19, var6);
            }
        }
        if (var3 == 30) {
            class248.field4331++;
            boolean var29 = class10.method44(0, 0, class207.field3595.field2039[0], class207.field3595.field2086[0], 0, 0, var2, false, 0, -3, 2, var7);
            if (!var29) {
                class10.method44(0, 0, class207.field3595.field2039[0], class207.field3595.field2086[0], 1, 1, var2, false, 0, -3, 2, var7);
            }
            class15.field191 = class188.field3274;
            class42.field694 = 0;
            client.field1644 = 2;
            class176.field3089 = class174.field3068;
            class28.field412.method578(69, 201);
            class28.field412.method1671(class34.field512 + var2, -111);
            class28.field412.method1650(false, class3.field39 + var7);
            class28.field412.method1685((byte) 19, var6);
        }
        if (var3 == 36) {
            class28.field412.method578(-72, 113);
            class28.field412.method1666(544537784, var2);
            class244.field4262++;
            class63 var31 = class54.method367(var2, (byte) -80);
            if (var31.field1231 != null && var31.field1231[0][0] == 5) {
                int var32 = var31.field1231[0][1];
                class89.field1726[var32] = 1 - class89.field1726[var32];
                class34.method193((byte) 67, var32);
            }
        }
        if (var3 == 44) {
            class37 var33 = class178.field3112[var6];
            if (var33 != null) {
                class10.method44(0, 0, class207.field3595.field2039[0], class207.field3595.field2086[0], 1, 1, var33.field2086[0], false, 0, -3, 2, var33.field2039[0]);
                client.field1644 = 2;
                class125.field2354++;
                class176.field3089 = class174.field3068;
                class42.field694 = 0;
                class15.field191 = class188.field3274;
                class28.field412.method578(-118, 24);
                class28.field412.method1671(var6, -25);
                class28.field412.method1640((byte) -87, class225.field3859);
                class28.field412.method1671(class240.field4174, -51);
            }
        }
        if (var3 == 24) {
            class45 var34 = class59.field988[var6];
            if (var34 != null) {
                class208.field3609++;
                class10.method44(0, 0, class207.field3595.field2039[0], class207.field3595.field2086[0], 1, 1, var34.field2086[0], false, 0, -3, 2, var34.field2039[0]);
                client.field1644 = 2;
                class176.field3089 = class174.field3068;
                class42.field694 = 0;
                class15.field191 = class188.field3274;
                class28.field412.method578(-79, 160);
                class28.field412.method1656(var6, (byte) 38);
            }
        }
        if (var3 == 17) {
            class156.field2769++;
            class28.field412.method578(-119, 3);
            class28.field412.method1681(-19237, var2);
            class28.field412.method1656(var6, (byte) 38);
            class28.field412.method1656(var7, (byte) 38);
            class144.field2624 = 0;
            class52.field927 = class54.method367(var2, (byte) -80);
            class251.field4419 = var7;
        }
        if (var3 == 10) {
            class203.method1312(636);
        }
        if (var3 == 34) {
            boolean var35 = class10.method44(0, 0, class207.field3595.field2039[0], class207.field3595.field2086[0], 0, 0, var2, false, 0, -3, 2, var7);
            class4.field42++;
            if (!var35) {
                class10.method44(0, 0, class207.field3595.field2039[0], class207.field3595.field2086[0], 1, 1, var2, false, 0, -3, 2, var7);
            }
            class15.field191 = class188.field3274;
            class42.field694 = 0;
            class176.field3089 = class174.field3068;
            client.field1644 = 2;
            class28.field412.method578(-105, 81);
            class28.field412.method1671(var7 + class3.field39, -119);
            class28.field412.method1666(544537784, class225.field3859);
            class28.field412.method1650(false, class34.field512 + var2);
            class28.field412.method1671(var6, -23);
            class28.field412.method1656(class240.field4174, (byte) 38);
        }
        if (var3 == 46) {
            class72.method516(var4, var2, -12974, var7);
            class28.field412.method578(101, 46);
            class28.field412.method1685((byte) 19, class34.field512 + var2);
            class28.field412.method1685((byte) 19, class3.field39 + var7);
            class254.field4473++;
            class28.field412.method1671((int) (var4 >>> 32) & Integer.MAX_VALUE, -55);
        }
        int var37 = -68 % ((arg0 + 6) / 56);
        if (var3 == 28) {
            class244.field4262++;
            class28.field412.method578(-72, 113);
            class28.field412.method1666(544537784, var2);
            class63 var38 = class54.method367(var2, (byte) -80);
            if (var38.field1231 != null && var38.field1231[0][0] == 5) {
                int var39 = var38.field1231[0][1];
                if (class89.field1726[var39] != var38.field1114[0]) {
                    class89.field1726[var39] = var38.field1114[0];
                    class34.method193((byte) 67, var39);
                }
            }
        }
        if (var3 == 37 && class72.method516(var4, var2, -12974, var7)) {
            class84.field1629++;
            class28.field412.method578(-98, 114);
            class28.field412.method1656(class34.field512 + var2, (byte) 38);
            class28.field412.method1671((int) (var4 >>> 32) & Integer.MAX_VALUE, -80);
            class28.field412.method1671(var7 + class3.field39, -93);
            class28.field412.method1681(-19237, class225.field3859);
            class28.field412.method1656(class240.field4174, (byte) 38);
        }
        if (var3 == 51 || var3 == 1007) {
            class112.method757(var2, (byte) 78, var6, class9.field96[arg1], var7);
        }
        if (var3 == 38) {
            class263.field4619++;
            class28.field412.method578(65, 185);
            class28.field412.method1681(-19237, var2);
            class28.field412.method1650(false, var7);
            class28.field412.method1685((byte) 19, var6);
            class144.field2624 = 0;
            class52.field927 = class54.method367(var2, (byte) -80);
            class251.field4419 = var7;
        }
        if (var3 == 42) {
            class92.field1778++;
            class72.method516(var4, var2, -12974, var7);
            class28.field412.method578(-51, 94);
            class28.field412.method1671(class3.field39 + var7, -30);
            class28.field412.method1656(Integer.MAX_VALUE & (int) (var4 >>> 32), (byte) 38);
            class28.field412.method1685((byte) 19, var2 + class34.field512);
        }
        if (var3 == 47) {
            class203.field3485++;
            class72.method516(var4, var2, -12974, var7);
            class28.field412.method578(112, 228);
            class28.field412.method1671(class34.field512 + var2, -28);
            class28.field412.method1656(Integer.MAX_VALUE & (int) (var4 >>> 32), (byte) 38);
            class28.field412.method1685((byte) 19, class3.field39 + var7);
        }
        if (var3 == 26) {
            class45 var40 = class59.field988[var6];
            if (var40 != null) {
                class54.field943++;
                class10.method44(0, 0, class207.field3595.field2039[0], class207.field3595.field2086[0], 1, 1, var40.field2086[0], false, 0, -3, 2, var40.field2039[0]);
                class42.field694 = 0;
                class176.field3089 = class174.field3068;
                client.field1644 = 2;
                class15.field191 = class188.field3274;
                class28.field412.method578(118, 93);
                class28.field412.method1685((byte) 19, var6);
            }
        }
        if (var3 == 49) {
            class45 var41 = class59.field988[var6];
            if (var41 != null) {
                class10.method44(0, 0, class207.field3595.field2039[0], class207.field3595.field2086[0], 1, 1, var41.field2086[0], false, 0, -3, 2, var41.field2039[0]);
                class85.field1662++;
                class176.field3089 = class174.field3068;
                client.field1644 = 2;
                class15.field191 = class188.field3274;
                class42.field694 = 0;
                class28.field412.method578(117, 37);
                class28.field412.method1650(false, var6);
            }
        }
        if (var3 == 43) {
            class28.field412.method578(103, 45);
            class28.field412.method1650(false, var6);
            class138.field2544++;
            class28.field412.method1656(var7, (byte) 38);
            class28.field412.method1666(544537784, var2);
            class144.field2624 = 0;
            class52.field927 = class54.method367(var2, (byte) -80);
            class251.field4419 = var7;
        }
        if (var3 == 33) {
            class45 var42 = class59.field988[var6];
            if (var42 != null) {
                class10.method44(0, 0, class207.field3595.field2039[0], class207.field3595.field2086[0], 1, 1, var42.field2086[0], false, 0, -3, 2, var42.field2039[0]);
                client.field1644 = 2;
                class15.field191 = class188.field3274;
                class93.field1779++;
                class42.field694 = 0;
                class176.field3089 = class174.field3068;
                class28.field412.method578(-114, 253);
                class28.field412.method1685((byte) 19, var6);
            }
        }
        if (var3 == 15) {
            class37 var43 = class178.field3112[var6];
            if (var43 != null) {
                class10.method44(0, 0, class207.field3595.field2039[0], class207.field3595.field2086[0], 1, 1, var43.field2086[0], false, 0, -3, 2, var43.field2039[0]);
                class67.field1342++;
                client.field1644 = 2;
                class176.field3089 = class174.field3068;
                class15.field191 = class188.field3274;
                class42.field694 = 0;
                class28.field412.method578(63, 12);
                class28.field412.method1686((byte) 127, class85.field1676);
                class28.field412.method1650(false, var6);
                class28.field412.method1685((byte) 19, class45.field800);
                class28.field412.method1671(class120.field2280, -124);
            }
        }
        if (var3 == 45) {
            class99.field1937++;
            boolean var44 = class10.method44(0, 0, class207.field3595.field2039[0], class207.field3595.field2086[0], 0, 0, var2, false, 0, -3, 2, var7);
            if (!var44) {
                class10.method44(0, 0, class207.field3595.field2039[0], class207.field3595.field2086[0], 1, 1, var2, false, 0, -3, 2, var7);
            }
            class42.field694 = 0;
            class15.field191 = class188.field3274;
            client.field1644 = 2;
            class176.field3089 = class174.field3068;
            class28.field412.method578(65, 150);
            class28.field412.method1656(class34.field512 + var2, (byte) 38);
            class28.field412.method1671(var6, -66);
            class28.field412.method1650(false, class3.field39 + var7);
        }
        if (var3 == 48) {
            class37 var46 = class178.field3112[var6];
            if (var46 != null) {
                class243.field4251++;
                class10.method44(0, 0, class207.field3595.field2039[0], class207.field3595.field2086[0], 1, 1, var46.field2086[0], false, 0, -3, 2, var46.field2039[0]);
                class42.field694 = 0;
                class15.field191 = class188.field3274;
                client.field1644 = 2;
                class176.field3089 = class174.field3068;
                class28.field412.method578(-116, 52);
                class28.field412.method1685((byte) 19, var6);
            }
        }
        if (var3 == 19) {
            class45 var47 = class59.field988[var6];
            if (var47 != null) {
                class10.method44(0, 0, class207.field3595.field2039[0], class207.field3595.field2086[0], 1, 1, var47.field2086[0], false, 0, -3, 2, var47.field2039[0]);
                client.field1644 = 2;
                class42.field694 = 0;
                class230.field3978++;
                class176.field3089 = class174.field3068;
                class15.field191 = class188.field3274;
                class28.field412.method578(83, 183);
                class28.field412.method1656(var6, (byte) 38);
            }
        }
        if (var3 == 23) {
            class63 var48 = class54.method367(var2, (byte) -80);
            boolean var49 = true;
            if (var48.field1131 > 0) {
                var49 = class51.method354(var48, 29905);
            }
            if (var49) {
                class244.field4262++;
                class28.field412.method578(-82, 113);
                class28.field412.method1666(544537784, var2);
            }
        }
        if (var3 == 21) {
            class37 var50 = class178.field3112[var6];
            if (var50 != null) {
                class10.method44(0, 0, class207.field3595.field2039[0], class207.field3595.field2086[0], 1, 1, var50.field2086[0], false, 0, -3, 2, var50.field2039[0]);
                class42.field694 = 0;
                class15.field191 = class188.field3274;
                class153.field2728++;
                client.field1644 = 2;
                class176.field3089 = class174.field3068;
                class28.field412.method578(73, 199);
                class28.field412.method1656(var6, (byte) 38);
            }
        }
        if (var3 == 18) {
            class176.field3087++;
            class72.method516(var4, var2, -12974, var7);
            class28.field412.method578(91, 158);
            class28.field412.method1656(class3.field39 + var7, (byte) 38);
            class28.field412.method1650(false, Integer.MAX_VALUE & (int) (var4 >>> 32));
            class28.field412.method1685((byte) 19, class34.field512 + var2);
        }
        if (var3 == 57 && class264.field4629 == null) {
            class21.method96(var7, var2, 327685);
            class264.field4629 = class218.method1401(var2, false, var7);
            class215.method1385(class264.field4629, -120);
        }
        if (var3 == 40) {
            class28.field412.method578(-53, 186);
            class15.field193++;
            class28.field412.method1686((byte) 127, var2);
            class28.field412.method1671(var6, -122);
            class28.field412.method1685((byte) 19, var7);
            class144.field2624 = 0;
            class52.field927 = class54.method367(var2, (byte) -80);
            class251.field4419 = var7;
        }
        if (class188.field3259 != 0) {
            class188.field3259 = 0;
            class215.method1385(class54.method367(class85.field1676, (byte) -80), -114);
        }
        if (class247.field4308) {
            class1.method2((byte) 77);
        }
        if (class52.field927 != null && class144.field2624 == 0) {
            class215.method1385(class52.field927, -128);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(BLlh;)V")
    public final void method262(byte arg0, class249 arg1) {
        field669++;
        if (arg0 != 45) {
            this.method257(-45, -100, 114);
        }
        while (true) {
            int var3 = arg1.method1677(-6677);
            if (var3 == 0) {
                return;
            }
            this.method263(arg1, var3, arg0 ^ 0x370A);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Llh;II)V")
    private final void method263(class249 arg0, int arg1, int arg2) {
        field674++;
        if (arg2 != 14119) {
            this.field673 = null;
        }
        if (arg1 == 1) {
            this.field688 = arg0.method1637(arg2 ^ 0x3758).method490(0, 60);
        } else if (arg1 == 2) {
            int var8 = arg0.method1677(-6677);
            this.field676 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field676[var9] = arg0.method1674(1355769544);
            }
        } else if (arg1 == 3) {
            int var4 = arg0.method1677(-6677);
            this.field684 = new int[var4];
            this.field673 = new int[var4][];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method1674(1355769544);
                this.field684[var5] = var6;
                this.field673[var5] = new int[class188.field3253[var6]];
                for (int var7 = 0; var7 < class188.field3253[var6]; var7++) {
                    this.field673[var5][var7] = arg0.method1674(1355769544);
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "(II)V")
    public static final void method264(int arg0, int arg1) {
        field675++;
        if (arg0 == 0) {
            class208.field3605.method1611(arg0 ^ 0xFFFFB6B1, arg1);
        }
    }

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "(I)V")
    public static final void method265(int arg0) {
        field686++;
        if (arg0 != 0) {
            method273();
        }
        class114.field2162.method1614(-28);
        class48.field867.method1614(122);
    }

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "(I)Lr;")
    public final class66 method266(int arg0) {
        field687++;
        class66 var2 = class28.method136(-18982, 80);
        if (this.field688 == null) {
            return class147.field2671;
        }
        int var3 = 58 % ((-arg0 - 6) / 43);
        var2.method488(this.field688[0], 12147);
        for (int var4 = 1; var4 < this.field688.length; var4++) {
            var2.method488(class248.field4323, 12147);
            var2.method488(this.field688[var4], 12147);
        }
        return var2.method457(true);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IZI)Lr;")
    public static final class66 method267(int arg0, boolean arg1, int arg2) {
        field670++;
        int var3 = arg2 - arg0;
        if (var3 < -9) {
            return class25.field324;
        } else if (var3 < -6) {
            return class64.field1266;
        } else if (!arg1) {
            return null;
        } else if (var3 < -3) {
            return class57.field979;
        } else if (var3 < 0) {
            return class64.field1256;
        } else if (var3 > 9) {
            return class234.field4091;
        } else if (var3 > 6) {
            return class167.field3002;
        } else if (var3 > 3) {
            return class11.field132;
        } else if (var3 > 0) {
            return class89.field1728;
        } else {
            return class83.field1610;
        }
    }

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "(B)V")
    public final void method268(byte arg0) {
        field682++;
        if (this.field676 != null) {
            for (int var2 = 0; var2 < this.field676.length; var2++) {
                this.field676[var2] = class73.method521(this.field676[var2], 32768);
            }
        }
        if (arg0 != 38) {
            this.method257(120, -71, -4);
        }
    }

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "(II)V")
    public static final void method269(int arg0, int arg1) {
        field668++;
        class205.field3511.method1611(-18767, arg1);
        if (arg0 != 190) {
            field689 = null;
        }
        class95.field1823.method1611(-18767, arg1);
    }

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "(I)V")
    public static void method270(int arg0) {
        field689 = null;
        field681 = null;
        if (arg0 != 1) {
            field689 = null;
        }
        field678 = null;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(ILlh;)Lr;")
    public final class66 method271(int arg0, class249 arg1) {
        field672++;
        int var3 = -92 / ((33 - arg0) / 34);
        class66 var4 = class28.method136(-18982, 80);
        if (this.field684 != null) {
            for (int var5 = 0; var5 < this.field684.length; var5++) {
                var4.method488(this.field688[var5], 12147);
                var4.method488(class132.method914(this.field673[var5], arg1.method1635(class4.field49[this.field684[var5]], (byte) -41), -1, this.field684[var5]), 12147);
            }
        }
        var4.method488(this.field688[this.field688.length - 1], 12147);
        return var4.method457(true);
    }

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "(II)I")
    public static final int method272(int arg0, int arg1) {
        if (arg1 != 654593194) {
            field678 = null;
        }
        field683++;
        return arg0 >>> 10;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "()V")
    public static final void method273() {
        class260.field4572 = 0;
        label191: for (int var0 = 0; var0 < class51.field898; var0++) {
            class259 var1 = class255.field4478[var0];
            if (class150.field2698 != null) {
                for (int var2 = 0; var2 < class150.field2698.length; var2++) {
                    if (class150.field2698[var2] != -1000000 && (var1.field4551 <= class150.field2698[var2] || var1.field4549 <= class150.field2698[var2]) && (var1.field4558 <= class224.field3818[var2] || var1.field4561 <= class224.field3818[var2]) && (var1.field4558 >= class15.field188[var2] || var1.field4561 >= class15.field188[var2]) && (var1.field4547 <= class82.field1596[var2] || var1.field4546 <= class82.field1596[var2]) && (var1.field4547 >= class190.field3286[var2] || var1.field4546 >= class190.field3286[var2])) {
                        continue label191;
                    }
                }
            }
            if (var1.field4541 == 1) {
                int var3 = var1.field4545 + class94.field1818 - class256.field4504;
                if (var3 >= 0 && var3 <= class94.field1818 + class94.field1818) {
                    int var4 = var1.field4544 + class94.field1818 - class254.field4452;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field4555 + class94.field1818 - class254.field4452;
                    if (var5 > class94.field1818 + class94.field1818) {
                        var5 = class94.field1818 + class94.field1818;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class35.field522[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class171.field3036 - var1.field4558;
                        if (var7 > 32) {
                            var1.field4540 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field4540 = 2;
                            var7 = -var7;
                        }
                        var1.field4537 = (var1.field4547 - class30.field455 << 8) / var7;
                        var1.field4556 = (var1.field4546 - class30.field455 << 8) / var7;
                        var1.field4552 = (var1.field4551 - class142.field2603 << 8) / var7;
                        var1.field4542 = (var1.field4549 - class142.field2603 << 8) / var7;
                        class147.field2675[class260.field4572++] = var1;
                    }
                }
            } else if (var1.field4541 == 2) {
                int var8 = var1.field4544 + class94.field1818 - class254.field4452;
                if (var8 >= 0 && var8 <= class94.field1818 + class94.field1818) {
                    int var9 = var1.field4545 + class94.field1818 - class256.field4504;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field4548 + class94.field1818 - class256.field4504;
                    if (var10 > class94.field1818 + class94.field1818) {
                        var10 = class94.field1818 + class94.field1818;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class35.field522[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class30.field455 - var1.field4547;
                        if (var12 > 32) {
                            var1.field4540 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field4540 = 4;
                            var12 = -var12;
                        }
                        var1.field4538 = (var1.field4558 - class171.field3036 << 8) / var12;
                        var1.field4543 = (var1.field4561 - class171.field3036 << 8) / var12;
                        var1.field4552 = (var1.field4551 - class142.field2603 << 8) / var12;
                        var1.field4542 = (var1.field4549 - class142.field2603 << 8) / var12;
                        class147.field2675[class260.field4572++] = var1;
                    }
                }
            } else if (var1.field4541 == 4) {
                int var13 = var1.field4551 - class142.field2603;
                if (var13 > 128) {
                    int var14 = var1.field4544 + class94.field1818 - class254.field4452;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field4555 + class94.field1818 - class254.field4452;
                    if (var15 > class94.field1818 + class94.field1818) {
                        var15 = class94.field1818 + class94.field1818;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field4545 + class94.field1818 - class256.field4504;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field4548 + class94.field1818 - class256.field4504;
                        if (var17 > class94.field1818 + class94.field1818) {
                            var17 = class94.field1818 + class94.field1818;
                        }
                        boolean var18 = false;
                        label163: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class35.field522[var19][var20]) {
                                    var18 = true;
                                    break label163;
                                }
                            }
                        }
                        if (var18) {
                            var1.field4540 = 5;
                            var1.field4538 = (var1.field4558 - class171.field3036 << 8) / var13;
                            var1.field4543 = (var1.field4561 - class171.field3036 << 8) / var13;
                            var1.field4537 = (var1.field4547 - class30.field455 << 8) / var13;
                            var1.field4556 = (var1.field4546 - class30.field455 << 8) / var13;
                            class147.field2675[class260.field4572++] = var1;
                        }
                    }
                }
            }
        }
    }
}
