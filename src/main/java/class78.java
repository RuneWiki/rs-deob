import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class78 {

    @OriginalMember(owner = "client!lb", name = "u", descriptor = "Ljb;")
    private class64 field1649 = new class64(256);

    @OriginalMember(owner = "client!lb", name = "w", descriptor = "Ljb;")
    private class64 field1651 = new class64(256);

    @OriginalMember(owner = "client!lb", name = "r", descriptor = "Lna;")
    private class91 field1646;

    @OriginalMember(owner = "client!lb", name = "t", descriptor = "Lna;")
    private class91 field1648;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
    public static int field1630 = 7759444;

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "Lpe;")
    public static class109 field1638 = class141.method1120(")1", 0);

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "Lpe;")
    public static class109 field1635 = class141.method1120("M", 0);

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "Lpe;")
    public static class109 field1633 = class141.method1120("Angreifen", 0);

    @OriginalMember(owner = "client!lb", name = "p", descriptor = "Lpe;")
    public static class109 field1644 = class141.method1120("<col=00ff00>", 0);

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "Lpe;")
    private static class109 field1629 = class141.method1120("Members object", 0);

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "Lpe;")
    public static class109 field1634 = field1629;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
    public static int field1631;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "I")
    public static int field1632;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "I")
    public static int field1639;

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "I")
    public static int field1640;

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "I")
    public static int field1641;

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "I")
    public static int field1642;

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "client!lb", name = "q", descriptor = "I")
    public static int field1645;

    @OriginalMember(owner = "client!lb", name = "s", descriptor = "I")
    public static int field1647;

    @OriginalMember(owner = "client!lb", name = "v", descriptor = "I")
    public static int field1650;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "Le;")
    public static class29 field1637;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lwa;Lpe;B)Lpe;")
    public static final class109 method622(class154 arg0, class109 arg1, byte arg2) {
        if (arg1.method896(class112.field2386, -1) != -1) {
            label62: while (true) {
                int var3 = arg1.method896(class112.field2390, -1);
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg1.method896(class127.field2817, -1);
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg1.method896(class20.field498, -1);
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg1.method896(class131.field2878, -1);
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg1.method896(class53.field1097, -1);
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg1.method896(class149.field3296, -1);
                                                        if (var8 == -1) {
                                                            break label62;
                                                        }
                                                        class109 var9 = class131.field2866;
                                                        if (class127.field2812 != null) {
                                                            var9 = class157.method1225((byte) -55, class127.field2812.field512);
                                                            try {
                                                                if (class127.field2812.field514 != null) {
                                                                    byte[] var10 = ((String) class127.field2812.field514).getBytes("ISO-8859-1");
                                                                    var9 = class42.method384(var10, var10.length, (byte) -121, 0);
                                                                }
                                                            } catch (UnsupportedEncodingException var11) {
                                                            }
                                                        }
                                                        arg1 = class44.method405(new class109[] { arg1.method872(var8, -127, 0), var9, arg1.method897(false, var8 + 4) }, (byte) -74);
                                                    }
                                                }
                                                arg1 = class44.method405(new class109[] { arg1.method872(var7, -123, 0), class88.method729(class67.method523(4, arg0, 83), (byte) -99), arg1.method897(false, var7 + 2) }, (byte) -74);
                                            }
                                        }
                                        arg1 = class44.method405(new class109[] { arg1.method872(var6, -26, 0), class88.method729(class67.method523(3, arg0, 83), (byte) -117), arg1.method897(false, var6 + 2) }, (byte) -74);
                                    }
                                }
                                arg1 = class44.method405(new class109[] { arg1.method872(var5, 40, 0), class88.method729(class67.method523(2, arg0, 81), (byte) -100), arg1.method897(false, var5 + 2) }, (byte) -74);
                            }
                        }
                        arg1 = class44.method405(new class109[] { arg1.method872(var4, -21, 0), class88.method729(class67.method523(1, arg0, 126), (byte) -88), arg1.method897(false, var4 + 2) }, (byte) -74);
                    }
                }
                arg1 = class44.method405(new class109[] { arg1.method872(var3, -122, 0), class88.method729(class67.method523(0, arg0, 57), (byte) -43), arg1.method897(false, var3 + 2) }, (byte) -74);
            }
        }
        if (arg2 >= -123) {
            field1644 = null;
        }
        field1639++;
        return arg1;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIIIII)I")
    public static final int method623(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg5 & 0x1) == 1) {
            int var7 = arg4;
            arg4 = arg3;
            arg3 = var7;
        }
        int var8 = arg0 & 0x3;
        field1645++;
        if (var8 == 0) {
            return arg2;
        }
        if (arg1 > -49) {
            method630((byte) -77, null);
        }
        if (var8 == 1) {
            return arg6;
        } else if (var8 == 2) {
            return 7 + 1 - arg4 - arg2;
        } else {
            return 8 - arg3 - arg6;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "([Lla;II[BIIIIII)V")
    public static final void method624(class77[] arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        for (int var10 = 0; var10 < 8; var10++) {
            for (int var15 = 0; var15 < 8; var15++) {
                if (arg1 + var10 > 0 && arg1 + var10 < 103 && arg7 + var15 > 0 && arg7 + var15 < 103) {
                    arg0[arg5].field1618[arg1 + var10][arg7 + var15] = class4.method34(arg0[arg5].field1618[arg1 + var10][arg7 + var15], -16777217);
                }
            }
        }
        if (arg2 != 7744) {
            return;
        }
        class13 var11 = new class13(arg3);
        field1640++;
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg6 == var12 && arg9 <= var13 && var13 < arg9 + 8 && var14 >= arg4 && arg4 + 8 > var14) {
                        class44.method400(var11, arg8, 0, true, arg5, arg1 + class18.method185(arg8, arg2 ^ 0x1E2E, var14 & 0x7, var13 & 0x7), arg7 + class120.method977(arg8, true, var14 & 0x7, var13 & 0x7), 0);
                    } else {
                        class44.method400(var11, 0, 0, true, 0, -1, -1, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V")
    public static void method625(int arg0) {
        field1638 = null;
        field1635 = null;
        if (arg0 != -31671) {
            method623(110, 93, 21, 17, 1, 64, 95);
        }
        field1629 = null;
        field1633 = null;
        field1634 = null;
        field1644 = null;
        field1637 = null;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(II[IB)Lhb;")
    private final class51 method626(int arg0, int arg1, int[] arg2, byte arg3) {
        field1643++;
        int var5 = arg0 ^ (arg1 >>> 12 | (arg1 & 0x70000FFF) << 4);
        if (arg3 > -35) {
            method630((byte) -85, null);
        }
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6;
        class51 var9 = (class51) this.field1651.method505((byte) -46, var7);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class73 var10 = class73.method583(this.field1648, arg1, arg0);
            if (var10 == null) {
                return null;
            }
            class51 var11 = var10.method586();
            this.field1651.method503(-1, var11, var7);
            if (arg2 != null) {
                arg2[0] -= var11.field1064.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V")
    public static final void method627(int arg0) {
        class61.field1198 = arg0;
        class42.field869 = 0;
        class145.method1138((byte) -23);
        field1636++;
        class47.method416((byte) 82);
        class14.method172((byte) 55);
        class43.method397(-97);
        for (int var1 = 0; var1 < class61.field1198; var1++) {
            int var3 = class118.field2626[var1];
            if (class12.field264 != class104.field2194[var3].field3119) {
                class104.field2194[var3] = null;
            }
        }
        if (class109.field2286 != class82.field1733.field309) {
            throw new RuntimeException("gpp1 pos:" + class82.field1733.field309 + " psize:" + class109.field2286);
        }
        for (int var2 = 0; var2 < class44.field927; var2++) {
            if (class104.field2194[class92.field1973[var2]] == null) {
                throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class44.field927);
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BI)Z")
    public static final boolean method628(byte arg0, int arg1) {
        field1647++;
        if (arg0 == -51) {
            return (arg1 >> 29 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I[II)Lhb;")
    public final class51 method629(int arg0, int[] arg1, int arg2) {
        if (arg0 >= -109) {
            this.field1649 = null;
        }
        field1642++;
        if (this.field1648.method757((byte) -47) == 1) {
            return this.method626(arg2, 0, arg1, (byte) -66);
        } else if (this.field1648.method754(arg2, (byte) 8) == 1) {
            return this.method626(0, arg2, arg1, (byte) -57);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BLna;)V")
    public static final void method630(byte arg0, class91 arg1) {
        field1631++;
        if (arg0 <= 14) {
            method624(null, -54, 44, null, 25, 82, 18, 80, -85, -109);
        }
        class49.field1008 = arg1;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(III[I)Lhb;")
    private final class51 method631(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = arg0 ^ (arg1 >>> 12 | arg1 << 4 & 0xFFF3);
        field1650++;
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class51 var9 = (class51) this.field1651.method505((byte) -46, var7);
        if (var9 != null) {
            return var9;
        } else if (arg3 != null && arg3[0] <= 0) {
            return null;
        } else if (arg2 > -122) {
            return null;
        } else {
            class103 var10 = (class103) this.field1649.method505((byte) -46, var7);
            if (var10 == null) {
                var10 = class103.method824(this.field1646, arg1, arg0);
                if (var10 == null) {
                    return null;
                }
                this.field1649.method503(-1, var10, var7);
            }
            class51 var11 = var10.method827(arg3);
            if (var11 == null) {
                return null;
            } else {
                var10.method101((byte) 116);
                this.field1651.method503(-1, var11, var7);
                return var11;
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "([III)Lhb;")
    public final class51 method632(int[] arg0, int arg1, int arg2) {
        field1632++;
        if (this.field1646.method757((byte) -23) == 1) {
            return this.method631(arg1, 0, -123, arg0);
        } else if (arg2 != -8449) {
            return null;
        } else if (this.field1646.method754(arg1, (byte) -116) == 1) {
            return this.method631(0, arg1, arg2 ^ 0x217B, arg0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Lna;Lna;)V")
    public class78(class91 arg0, class91 arg1) {
        this.field1646 = arg1;
        this.field1648 = arg0;
    }
}
