import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class164 {

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "Lue;")
    private class222 field2331 = new class222(256);

    @OriginalMember(owner = "client!sd", name = "r", descriptor = "Lue;")
    private class222 field2337 = new class222(256);

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "Lnh;")
    private class305 field2321;

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "Lnh;")
    private class305 field2329;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "Ljava/lang/String;")
    public static String field2320 = "Started 3d Library";

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "Z")
    public static boolean field2322 = false;

    @OriginalMember(owner = "client!sd", name = "o", descriptor = "I")
    public static int field2334 = -1;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
    public static int field2323;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "I")
    public static int field2324;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "I")
    public static int field2325;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "I")
    public static int field2327;

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "I")
    public static int field2328;

    @OriginalMember(owner = "client!sd", name = "m", descriptor = "I")
    public static int field2332;

    @OriginalMember(owner = "client!sd", name = "q", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!sd", name = "p", descriptor = "Lim;")
    public static class178 field2335;

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "Lnh;")
    public static class305 field2330;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "[[I")
    public static int[][] field2326;

    @OriginalMember(owner = "client!sd", name = "n", descriptor = "[[[B")
    public static byte[][][] field2333;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(II[IB)Lqm;")
    private final class173 method1043(int arg0, int arg1, int[] arg2, byte arg3) {
        field2324++;
        int var5 = (arg1 << 4 & 0xFFF4 | arg1 >>> 12) ^ arg0;
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        if (arg3 != -103) {
            return null;
        }
        class173 var9 = (class173) this.field2337.method1453(true, var7);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class217 var10 = (class217) this.field2331.method1453(true, var7);
            if (var10 == null) {
                var10 = class217.method1410(this.field2329, arg1, arg0);
                if (var10 == null) {
                    return null;
                }
                this.field2331.method1452(var7, var10, 0);
            }
            class173 var11 = var10.method1409(arg2);
            if (var11 == null) {
                return null;
            } else {
                var10.method962(128);
                this.field2337.method1452(var7, var11, arg3 + 103);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I[IZ)Lqm;")
    public final class173 method1044(int arg0, int[] arg1, boolean arg2) {
        field2332++;
        if (arg2) {
            field2330 = null;
        }
        if (this.field2329.method2048(true) == 1) {
            return this.method1043(arg0, 0, arg1, (byte) -103);
        } else if (this.field2329.method2067(arg0, (byte) 51) == 1) {
            return this.method1043(0, arg0, arg1, (byte) -103);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I[IB)Lqm;")
    public final class173 method1045(int arg0, int[] arg1, byte arg2) {
        field2328++;
        int var4 = -5 / ((49 - arg2) / 35);
        if (this.field2321.method2048(true) == 1) {
            return this.method1049(arg1, 0, arg0, true);
        } else if (this.field2321.method2067(arg0, (byte) 51) == 1) {
            return this.method1049(arg1, arg0, 0, true);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)[Lee;")
    public static final class74[] method1046(int arg0) {
        field2323++;
        class74[] var1 = new class74[class56.field784];
        for (int var2 = 0; var2 < class56.field784; var2++) {
            var1[var2] = new class74(class242.field3805, class70.field1021, class275.field4376[var2], class96.field1381[var2], class137.field1869[var2], class112.field1613[var2], class134.field1847[var2], class298.field4748);
        }
        class282.method1840(true);
        if (arg0 != 65527) {
            field2333 = null;
        }
        return var1;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(III)Ll;")
    public static final class75 method1047(int arg0, int arg1, int arg2) {
        class91 var3 = class246.field3856[arg0][arg1][arg2];
        return var3 == null ? null : var3.field1329;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)V")
    public static void method1048(byte arg0) {
        field2333 = null;
        field2320 = null;
        field2326 = null;
        field2330 = null;
        if (arg0 >= -63) {
            field2334 = 95;
        }
        field2335 = null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "([IIIZ)Lqm;")
    private final class173 method1049(int[] arg0, int arg1, int arg2, boolean arg3) {
        field2327++;
        int var5 = arg2 ^ (arg1 << 4 & 0xFFF7 | arg1 >>> 12);
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6;
        class173 var9 = (class173) this.field2337.method1453(arg3, var7);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class28 var10 = class28.method183(this.field2321, arg1, arg2);
            if (var10 == null) {
                return null;
            }
            class173 var11 = var10.method185();
            this.field2337.method1452(var7, var11, 0);
            if (arg0 != null) {
                arg0[0] -= var11.field2451.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILda;III)V")
    public static final void method1050(int arg0, class211 arg1, int arg2, int arg3, int arg4) {
        field2336++;
        if (class179.field2721 >= 400) {
            return;
        }
        if (arg1.field3173 != null) {
            arg1 = arg1.method1316((byte) -116);
        }
        if (arg1 == null || !arg1.field3140 || arg3 != -10763) {
            return;
        }
        String var5 = arg1.field3176;
        if (arg1.field3155 != 0) {
            String var6 = class188.field2856 == 1 ? class105.field1514 : class271.field4325;
            var5 = var5 + class136.method856((byte) -116, class250.field3905.field5059, arg1.field3155) + " (" + var6 + arg1.field3155 + ")";
        }
        if (class265.field4266 == 1) {
            class168.field2401++;
            class82.method518(class256.field4085, (short) 47, class95.field1367, class34.field521 + " -> <col=ffff00>" + var5, arg2, arg4, (long) arg0, (byte) 96);
        } else if (class193.field2950) {
            class267 var7 = class8.field94 == -1 ? null : class218.method1422((byte) 86, class8.field94);
            if ((class202.field3052 & 0x2) != 0) {
                if (var7 == null || arg1.method1315(var7.field4294, -29, class8.field94) != var7.field4294) {
                    class82.method518(class121.field1729, (short) 49, class225.field3526, class166.field2353 + " -> <col=ffff00>" + var5, arg2, arg4, (long) arg0, (byte) 89);
                    class209.field3107++;
                }
                return;
            }
        } else {
            class38.field580++;
            String[] var8 = arg1.field3144;
            if (class26.field420) {
                var8 = class56.method352(-119, var8);
            }
            if (var8 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var8[var9] != null && (class188.field2856 != 0 || !var8[var9].equalsIgnoreCase(class69.field973))) {
                        class288.field4597++;
                        int var10 = -1;
                        byte var11 = 0;
                        if (var9 == 0) {
                            var11 = 2;
                        }
                        if (var9 == 1) {
                            var11 = 41;
                        }
                        if (var9 == 2) {
                            var11 = 58;
                        }
                        if (arg1.field3128 == var9) {
                            var10 = arg1.field3157;
                        }
                        if (arg1.field3132 == var9) {
                            var10 = arg1.field3181;
                        }
                        if (var9 == 3) {
                            var11 = 26;
                        }
                        if (var9 == 4) {
                            var11 = 43;
                        }
                        class82.method518(var10, var11, var8[var9], "<col=ffff00>" + var5, arg2, arg4, (long) arg0, (byte) 106);
                    }
                }
            }
            if (class188.field2856 == 0 && var8 != null) {
                for (int var12 = 4; var12 >= 0; var12--) {
                    if (var8[var12] != null && var8[var12].equalsIgnoreCase(class69.field973)) {
                        class11.field182++;
                        short var13 = 0;
                        if (class250.field3905.field5059 < arg1.field3155) {
                            var13 = 2000;
                        }
                        short var14 = 0;
                        if (var12 == 0) {
                            var14 = 2;
                        }
                        if (var12 == 1) {
                            var14 = 41;
                        }
                        if (var12 == 2) {
                            var14 = 58;
                        }
                        if (var12 == 3) {
                            var14 = 26;
                        }
                        if (var12 == 4) {
                            var14 = 43;
                        }
                        if (var14 != 0) {
                            var14 += var13;
                        }
                        class82.method518(arg1.field3168, var14, var8[var12], "<col=ffff00>" + var5, arg2, arg4, (long) arg0, (byte) 63);
                    }
                }
            }
            class82.method518(class228.field3569, (short) 1003, class45.field668, "<col=ffff00>" + var5, arg2, arg4, (long) arg0, (byte) 80);
        }
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(Lnh;Lnh;)V")
    public class164(class305 arg0, class305 arg1) {
        this.field2321 = arg0;
        this.field2329 = arg1;
    }
}
