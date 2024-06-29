import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class128 {

    @OriginalMember(owner = "client!so", name = "d", descriptor = "[I")
    public static int[] field2231 = new int[25];

    @OriginalMember(owner = "client!so", name = "f", descriptor = "[I")
    public static int[] field2233 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

    @OriginalMember(owner = "client!so", name = "a", descriptor = "I")
    public static int field2228;

    @OriginalMember(owner = "client!so", name = "b", descriptor = "I")
    public static int field2229;

    @OriginalMember(owner = "client!so", name = "c", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!so", name = "e", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!so", name = "g", descriptor = "I")
    public static int field2234;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(ILjava/lang/String;)[B", line = 5)
    public static final byte[] method911(int arg0, String arg1) {
        int var2 = arg1.length();
        field2232++;
        byte[] var3 = new byte[var2];
        if (arg0 != 8226) {
            method912(-85);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            char var5 = arg1.charAt(var4);
            if (var5 > '\u0000' && var5 < '\u0080' || var5 >= ' ' && var5 <= 'ÿ') {
                var3[var4] = (byte) var5;
            } else if (var5 == '€') {
                var3[var4] = -128;
            } else if (var5 == '‚') {
                var3[var4] = -126;
            } else if (var5 == 'ƒ') {
                var3[var4] = -125;
            } else if (var5 == '„') {
                var3[var4] = -124;
            } else if (var5 == '…') {
                var3[var4] = -123;
            } else if (var5 == '†') {
                var3[var4] = -122;
            } else if (var5 == '‡') {
                var3[var4] = -121;
            } else if (var5 == 'ˆ') {
                var3[var4] = -120;
            } else if (var5 == '‰') {
                var3[var4] = -119;
            } else if (var5 == 'Š') {
                var3[var4] = -118;
            } else if (var5 == '‹') {
                var3[var4] = -117;
            } else if (var5 == 'Œ') {
                var3[var4] = -116;
            } else if (var5 == 'Ž') {
                var3[var4] = -114;
            } else if (var5 == '‘') {
                var3[var4] = -111;
            } else if (var5 == '’') {
                var3[var4] = -110;
            } else if (var5 == '“') {
                var3[var4] = -109;
            } else if (var5 == '”') {
                var3[var4] = -108;
            } else if (var5 == '•') {
                var3[var4] = -107;
            } else if (var5 == '–') {
                var3[var4] = -106;
            } else if (var5 == '—') {
                var3[var4] = -105;
            } else if (var5 == '˜') {
                var3[var4] = -104;
            } else if (var5 == '™') {
                var3[var4] = -103;
            } else if (var5 == 'š') {
                var3[var4] = -102;
            } else if (var5 == '›') {
                var3[var4] = -101;
            } else if (var5 == 'œ') {
                var3[var4] = -100;
            } else if (var5 == 'ž') {
                var3[var4] = -98;
            } else if (var5 == 'Ÿ') {
                var3[var4] = -97;
            } else {
                var3[var4] = 63;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(I)V", line = 142)
    public static final void method912(int arg0) {
        class332.field5297 = null;
        class159.field2695 = null;
        field2229++;
        class138.field2351 = null;
        class358.field5698 = null;
        class133.field2280 = null;
        class201.field3382 = null;
        class235.field3854 = null;
        class173.field2877 = null;
        if (arg0 < 19) {
            method912(-45);
        }
        class28.field686 = null;
        class144.field2424 = null;
        class269.field4390 = null;
        class14.field416 = null;
        class352.field5622 = null;
        class320.field5211 = null;
        class263.field4320 = null;
        class308.field5035 = null;
        class37.field810 = null;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "([I[II[ILth;)V", line = 169)
    public static final void method913(int[] arg0, int[] arg1, int arg2, int[] arg3, class98 arg4) {
        field2230++;
        if (arg2 != 19915) {
            method911(-40, (String) null);
        }
        for (int var5 = 0; var5 < arg3.length; var5++) {
            int var6 = arg3[var5];
            int var7 = arg1[var5];
            int var8 = arg0[var5];
            int var9 = 0;
            while (var7 != 0 && var9 < arg4.field167.length) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg4.field167[var9] = null;
                    } else {
                        class300 var10 = class258.method1807(var6, arg2 ^ 0x4DA1);
                        int var11 = var10.field4872;
                        class242 var12 = arg4.field167[var9];
                        if (var12 != null) {
                            if (var12.field4045 == var6) {
                                if (var11 == 0) {
                                    var12 = arg4.field167[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field4046 = 0;
                                    var12.field4042 = 0;
                                    var12.field4043 = var8;
                                    var12.field4044 = 1;
                                    var12.field4041 = 0;
                                    class347.method2479(class96.field1750 == arg4, (byte) -99, var10, 0, arg4.field199, arg4.field213);
                                } else if (var11 == 2) {
                                    var12.field4042 = 0;
                                }
                            } else if (var10.field4892 >= class258.method1807(var12.field4045, arg2 ^ 0x4DB9).field4892) {
                                var12 = arg4.field167[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class242 var13 = arg4.field167[var9] = new class242();
                            var13.field4041 = 0;
                            var13.field4043 = var8;
                            var13.field4042 = 0;
                            var13.field4046 = 0;
                            var13.field4045 = var6;
                            var13.field4044 = 1;
                            class347.method2479(class96.field1750 == arg4, (byte) -99, var10, 0, arg4.field199, arg4.field213);
                        }
                    }
                }
                var9++;
                var7 >>>= 0x1;
            }
        }
    }

    @OriginalMember(owner = "client!so", name = "b", descriptor = "(I)V", line = 267)
    public static void method914(int arg0) {
        if (arg0 != -8223) {
            field2233 = (int[]) null;
        }
        field2231 = null;
        field2233 = null;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "([BI)[B", line = 297)
    public static final byte[] method915(byte[] arg0, int arg1) {
        field2228++;
        class146 var2 = new class146(arg0);
        if (arg1 != 1) {
            field2233 = (int[]) null;
        }
        int var3 = var2.method1005((byte) 122);
        int var4 = var2.method1004(3);
        if (var4 < 0 || !(class306.field4976 == 0 || class306.field4976 >= var4)) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method994(-1, var5, var4, 0);
            return var5;
        } else {
            int var6 = var2.method1004(3);
            if (var6 < 0 || !(class306.field4976 == 0 || var6 <= class306.field4976)) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class322.method2313(var7, var6, arg0, var4, 9);
            } else {
                class125.field2197.method1852(var7, var2, 31);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(B)Z", line = 348)
    public static final boolean method916(byte arg0) {
        if (arg0 > -47) {
            return true;
        }
        field2234++;
        class148 var1 = class181.field3149;
        synchronized (class181.field3149) {
            if (class356.field5677 == class100.field1832) {
                return false;
            } else {
                class363.field5752 = class252.field4146[class356.field5677];
                class311.field5071 = class323.field5234[class356.field5677];
                class356.field5677 = class356.field5677 + 1 & 0x7F;
                return true;
            }
        }
    }
}
