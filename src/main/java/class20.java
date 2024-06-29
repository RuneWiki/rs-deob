import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class20 {

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "[I")
    public static int[] field266 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "I")
    public static int field269 = 0;

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "I")
    public static int field267;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
    public static int field270;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "I")
    public static int field271;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IILuj;II)V")
    public static final void method113(int arg0, int arg1, class134 arg2, int arg3, int arg4) {
        field268++;
        if (class173.field2721 >= 400) {
            return;
        }
        if (arg2.field1894 != null) {
            arg2 = arg2.method855((byte) -114);
        }
        if (arg2 == null || !arg2.field1906 || arg4 != -5190) {
            return;
        }
        String var5 = arg2.field1929;
        if (arg2.field1905 != 0) {
            String var6 = class257.field4188 == 1 ? class158.field2364 : class21.field277;
            var5 = var5 + class306.method2045(class214.field3347.field13, 376, arg2.field1905) + " (" + var6 + arg2.field1905 + ")";
        }
        if (class197.field3123 == 1) {
            class28.method142(class230.field3551 + " -> <col=ffff00>" + var5, 83, class179.field2800, arg3, (short) 3, (long) arg1, arg0, class123.field1773);
            class52.field740++;
        } else if (class63.field911) {
            class226 var7 = class78.field1181 == -1 ? null : class214.method1501(class78.field1181, (byte) -59);
            if ((class111.field1613 & 0x2) != 0) {
                if (var7 == null || arg2.method846(class78.field1181, 900, var7.field3519) != var7.field3519) {
                    class119.field1723++;
                    class28.method142(class284.field4604 + " -> <col=ffff00>" + var5, arg4 + 5111, class59.field865, arg3, (short) 30, (long) arg1, arg0, class122.field1757);
                }
                return;
            }
        } else {
            class265.field4313++;
            String[] var8 = arg2.field1918;
            if (class287.field4637) {
                var8 = method115(arg4 + 5184, var8);
            }
            if (var8 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var8[var9] != null && (class257.field4188 != 0 || !var8[var9].equalsIgnoreCase(class61.field889))) {
                        class77.field1176++;
                        byte var10 = 0;
                        int var11 = -1;
                        if (var9 == 0) {
                            var10 = 12;
                        }
                        if (var9 == 1) {
                            var10 = 40;
                        }
                        if (var9 == 2) {
                            var10 = 4;
                        }
                        if (var9 == 3) {
                            var10 = 9;
                        }
                        if (var9 == 4) {
                            var10 = 7;
                        }
                        if (arg2.field1935 == var9) {
                            var11 = arg2.field1892;
                        }
                        if (arg2.field1900 == var9) {
                            var11 = arg2.field1904;
                        }
                        class28.method142("<col=ffff00>" + var5, 122, var8[var9], arg3, var10, (long) arg1, arg0, var11);
                    }
                }
            }
            if (class257.field4188 == 0 && var8 != null) {
                for (int var12 = 4; var12 >= 0; var12--) {
                    if (var8[var12] != null && var8[var12].equalsIgnoreCase(class61.field889)) {
                        class58.field853++;
                        short var13 = 0;
                        if (class214.field3347.field13 < arg2.field1905) {
                            var13 = 2000;
                        }
                        short var14 = 0;
                        if (var12 == 0) {
                            var14 = 12;
                        }
                        if (var12 == 1) {
                            var14 = 40;
                        }
                        if (var12 == 2) {
                            var14 = 4;
                        }
                        if (var12 == 3) {
                            var14 = 9;
                        }
                        if (var12 == 4) {
                            var14 = 7;
                        }
                        if (var14 != 0) {
                            var14 += var13;
                        }
                        class28.method142("<col=ffff00>" + var5, -88, var8[var12], arg3, var14, (long) arg1, arg0, arg2.field1911);
                    }
                }
            }
            class28.method142("<col=ffff00>" + var5, 62, class298.field4761, arg3, (short) 1005, (long) arg1, arg0, class104.field1522);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
    public static void method114(int arg0) {
        field266 = null;
        if (arg0 != 7) {
            method114(-93);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;")
    public static final String[] method115(int arg0, String[] arg1) {
        String[] var2 = new String[5];
        if (arg0 != -6) {
            field271 = 114;
        }
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = var2[var3] + arg1[var3];
            }
        }
        field267++;
        return var2;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(BI)[B")
    public static final synchronized byte[] method116(byte arg0, int arg1) {
        if (arg0 != -31) {
            return null;
        }
        field270++;
        if (arg1 == 100 && class142.field2094 > 0) {
            byte[] var2 = class71.field1037[--class142.field2094];
            class71.field1037[class142.field2094] = null;
            return var2;
        } else if (arg1 == 5000 && class286.field4626 > 0) {
            byte[] var3 = class4.field68[--class286.field4626];
            class4.field68[class286.field4626] = null;
            return var3;
        } else if (arg1 == 30000 && class142.field2081 > 0) {
            byte[] var4 = class205.field3210[--class142.field2081];
            class205.field3210[class142.field2081] = null;
            return var4;
        } else {
            return new byte[arg1];
        }
    }
}
