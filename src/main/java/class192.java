import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class192 {

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "I")
    public int field3061 = -1;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "I")
    public int field3054 = -1;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "[S")
    public static short[] field3056 = new short[500];

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "Z")
    public static volatile boolean field3052 = true;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "Lol;")
    public static class220 field3051 = new class220();

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
    public static int field3048;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "I")
    public static int field3049;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
    public static int field3050;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
    public static int field3053;

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "I")
    public static int field3057;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "I")
    public static int field3058;

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "I")
    public static int field3059;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "I")
    public static int field3060;

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "I")
    public static int field3062;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "[I")
    public int[] field3055;

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "[Lnj;")
    public static class215[] field3063;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IZLva;Lki;ILje;II)V")
    public static final void method1346(int arg0, boolean arg1, class138 arg2, class152 arg3, int arg4, class68 arg5, int arg6, int arg7) {
        if (arg0 != 1) {
            method1346(111, false, (class138) null, (class152) null, -80, (class68) null, -122, -88);
        }
        class244 var8 = null;
        field3057++;
        if (arg3.field2251 == 0) {
            if ((double) class207.field3245 == 3.0D) {
                var8 = class127.field1818;
            }
            if ((double) class207.field3245 == 4.0D) {
                var8 = class201.field3176;
            }
            if ((double) class207.field3245 == 6.0D) {
                var8 = class260.field4224;
            }
            if ((double) class207.field3245 >= 8.0D) {
                var8 = class62.field902;
            }
        } else if (arg3.field2251 == 1) {
            if ((double) class207.field3245 == 3.0D) {
                var8 = class260.field4224;
            }
            if ((double) class207.field3245 == 4.0D) {
                var8 = class62.field902;
            }
            if ((double) class207.field3245 == 6.0D) {
                var8 = class181.field2846;
            }
            if ((double) class207.field3245 >= 8.0D) {
                var8 = class309.field4971;
            }
        } else if (arg3.field2251 == 2) {
            if ((double) class207.field3245 == 3.0D) {
                var8 = class181.field2846;
            }
            if ((double) class207.field3245 == 4.0D) {
                var8 = class309.field4971;
            }
            if ((double) class207.field3245 == 6.0D) {
                var8 = class22.field284;
            }
            if ((double) class207.field3245 >= 8.0D) {
                var8 = class222.field3478;
            }
        }
        if (var8 == null) {
            return;
        }
        int var9 = arg3.field2260;
        if (arg2.field1985 && arg3.field2265 != -1) {
            var9 = arg3.field2265;
        }
        int var10 = class178.field2788.method1488(arg3.field2243, (int[]) null, class89.field1334);
        int var11 = arg2.field1989;
        int var12;
        if (arg1) {
            var12 = var11 - var8.method1742() * var10 / 2;
        } else {
            var12 = var11 - ((var10 - 1) * var8.method1744() + arg4 + (var8.method1742() / 2));
        }
        int var13 = var12 - var8.method1742();
        int var14 = 0;
        int var15 = var12 + var8.method1742() / 2;
        for (int var16 = 0; var16 < var10; var16++) {
            String var22 = class89.field1334[var16];
            if (var10 - 1 > var16) {
                var22 = var22.substring(0, var22.length() - 4);
            }
            int var23 = var8.method1739(var22);
            if (var14 < var23) {
                var14 = var23;
            }
        }
        arg5.field1009 = arg2.field1991 + arg6 - (var14 / 2);
        arg5.field1006 = var14 / 2 + arg2.field1991 + arg6;
        arg5.field1005 = arg7 + var13;
        int var17 = var13 + 2;
        arg5.field1010 = var13 + (var8.method1744() * var10) + arg7;
        int var18 = arg2.field1991 - var14 / 2 - 5;
        if (arg3.field2248 != 0) {
            class151.method1033(var18, var17, var14 + 10, -var17 + 1 + var10 * var8.method1744() + var13, arg3.field2248, arg3.field2248 >>> 24);
        }
        if (arg3.field2256 != 0) {
            class151.method1035(var18, var17, var14 + 10, var8.method1744() * var10 + -var17 + var13 + 1, arg3.field2256, arg3.field2256 >>> 24);
        }
        for (int var19 = 0; var19 < var10; var19++) {
            String var20 = class89.field1334[var19];
            if (var19 < (var10 - 1)) {
                var20 = var20.substring(0, var20.length() - 4);
            }
            int var21 = var8.method1739(var20);
            if (var14 < var21) {
                var14 = var21;
            }
            var8.method1741(var20, arg2.field1991, var15, var9, true);
            var15 += var8.method1744();
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)Ljava/lang/String;")
    public static final String method1347(byte arg0) {
        field3059++;
        int var1 = -11 / ((arg0 + 59) / 41);
        String var2;
        if (class197.field3123 == 1 && class173.field2721 < 2) {
            var2 = class179.field2800 + class206.field3231 + class230.field3551 + " ->";
        } else if (class63.field911 && class173.field2721 < 2) {
            var2 = class59.field865 + class206.field3231 + class284.field4604 + " ->";
        } else if (class182.field2860 && class309.field4977[81] && class173.field2721 > 2) {
            var2 = class211.method1463(-77, class173.field2721 - 2);
        } else {
            var2 = class211.method1463(-78, class173.field2721 - 1);
        }
        if (class173.field2721 > 2) {
            var2 = var2 + "<col=ffffff> / " + (class173.field2721 - 2) + class186.field2923;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(B)V")
    public static void method1348(byte arg0) {
        if (arg0 < 90) {
            field3053 = 39;
        }
        field3051 = null;
        field3063 = null;
        field3056 = null;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(III)Lrk;")
    public static final class165 method1349(int arg0, int arg1, int arg2) {
        class113 var3 = class184.field2892[arg0][arg1][arg2];
        return var3 == null ? null : var3.field1649;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V")
    public static final void method1350(int arg0) {
        class158.field2349.method1511((byte) 92);
        field3049++;
        if (arg0 != -25268) {
            method1348((byte) 16);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILim;B)V")
    public final void method1351(int arg0, class170 arg1, byte arg2) {
        while (true) {
            int var4 = arg1.method1218(84);
            if (var4 == 0) {
                field3058++;
                if (arg2 > -15) {
                    method1346(77, false, (class138) null, (class152) null, -79, (class68) null, -44, -28);
                    return;
                }
                return;
            }
            this.method1352((byte) 67, arg1, var4, arg0);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BLim;II)V")
    private final void method1352(byte arg0, class170 arg1, int arg2, int arg3) {
        if (arg2 == 1) {
            this.field3061 = arg1.method1186((byte) -43);
        } else if (arg2 == 2) {
            this.field3055 = new int[arg1.method1218(arg0 ^ 0xC)];
            for (int var5 = 0; var5 < this.field3055.length; var5++) {
                this.field3055[var5] = arg1.method1186((byte) -125);
            }
        } else if (arg2 == 3) {
            this.field3054 = arg1.method1218(108);
        }
        if (arg0 != 67) {
            field3052 = true;
        }
        field3060++;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIB)V")
    public static final void method1353(int arg0, int arg1, int arg2, byte arg3) {
        field3050++;
        if (arg3 != 27) {
            method1346(51, true, (class138) null, (class152) null, -48, (class68) null, -29, 52);
        }
        if (arg1 == 1002) {
            class263.method1845(10, arg2, arg0, (byte) -112);
        } else if (arg1 == 1010) {
            class263.method1845(11, arg2, arg0, (byte) -117);
        } else if (arg1 == 1012) {
            class263.method1845(12, arg2, arg0, (byte) -94);
        } else if (arg1 == 1006) {
            class263.method1845(13, arg2, arg0, (byte) -103);
            return;
        } else if (arg1 == 1008) {
            class263.method1845(14, arg2, arg0, (byte) -114);
            return;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(JB)V")
    public static final void method1354(long arg0, byte arg1) {
        field3062++;
        if (arg0 == 0L) {
            return;
        }
        if (arg1 != 22) {
            method1347((byte) -110);
        }
        for (int var3 = 0; var3 < class76.field1142; var3++) {
            if (class218.field3419[var3] == arg0) {
                class76.field1142--;
                for (int var4 = var3; var4 < class76.field1142; var4++) {
                    class301.field4799[var4] = class301.field4799[var4 + 1];
                    class127.field1821[var4] = class127.field1821[var4 + 1];
                    class198.field3143[var4] = class198.field3143[var4 + 1];
                    class218.field3419[var4] = class218.field3419[var4 + 1];
                    class113.field1655[var4] = class113.field1655[var4 + 1];
                    class214.field3349[var4] = class214.field3349[var4 + 1];
                }
                class274.field4454++;
                class250.field4088 = client.field3871;
                class150.field2218.method445(138, 7);
                class150.field2218.method1160(-25643, arg0);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lvl;B)V")
    public static final void method1355(class73 arg0, byte arg1) {
        field3048++;
        if (class8.field112) {
            return;
        }
        class151.method1044();
        if (arg1 < 50) {
            field3051 = null;
        }
        class27.field317 = class107.method715(class5.field72, (byte) -7, arg0);
        int var2 = class126.field1814;
        int var3 = var2 * 956 / 503;
        class27.field317.method292((class112.field1626 - var3) / 2, 0, var3, var2);
        class305.field4868 = class114.method756(class265.field4311, arg0, -21159);
        class305.field4868.method621(class112.field1626 / 2 - (class305.field4868.field2946 / 2), 18);
        class8.field112 = true;
    }
}
