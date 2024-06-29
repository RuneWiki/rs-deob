import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class55 extends class4 {

    @OriginalMember(owner = "client!df", name = "C", descriptor = "I")
    public int field935 = 12800;

    @OriginalMember(owner = "client!df", name = "J", descriptor = "I")
    public int field941 = -1;

    @OriginalMember(owner = "client!df", name = "z", descriptor = "I")
    public int field932 = -1;

    @OriginalMember(owner = "client!df", name = "B", descriptor = "I")
    public int field934 = 0;

    @OriginalMember(owner = "client!df", name = "A", descriptor = "I")
    public int field933 = 0;

    @OriginalMember(owner = "client!df", name = "S", descriptor = "Z")
    public boolean field949 = true;

    @OriginalMember(owner = "client!df", name = "R", descriptor = "I")
    public int field948 = 12800;

    @OriginalMember(owner = "client!df", name = "x", descriptor = "Ljava/lang/String;")
    public String field930;

    @OriginalMember(owner = "client!df", name = "F", descriptor = "I")
    public int field938;

    @OriginalMember(owner = "client!df", name = "D", descriptor = "I")
    public int field936;

    @OriginalMember(owner = "client!df", name = "Q", descriptor = "Ljava/lang/String;")
    public String field947;

    @OriginalMember(owner = "client!df", name = "K", descriptor = "Lvj;")
    public class115 field942;

    @OriginalMember(owner = "client!df", name = "y", descriptor = "I")
    public static int field931;

    @OriginalMember(owner = "client!df", name = "E", descriptor = "I")
    public static int field937;

    @OriginalMember(owner = "client!df", name = "H", descriptor = "I")
    public static int field939;

    @OriginalMember(owner = "client!df", name = "I", descriptor = "I")
    public static int field940;

    @OriginalMember(owner = "client!df", name = "L", descriptor = "I")
    public static int field943;

    @OriginalMember(owner = "client!df", name = "M", descriptor = "I")
    public static int field944;

    @OriginalMember(owner = "client!df", name = "O", descriptor = "I")
    public static int field945;

    @OriginalMember(owner = "client!df", name = "P", descriptor = "I")
    public static int field946;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IZI)Z")
    public final boolean method408(int arg0, boolean arg1, int arg2) {
        field931++;
        if (this.field935 > arg0 || this.field934 < arg0 || arg2 < this.field948 || arg2 > this.field933) {
            return false;
        }
        for (class142 var4 = (class142) this.field942.method843(91); var4 != null; var4 = (class142) this.field942.method852((byte) 123)) {
            if (var4.method983(arg2, arg0, 100)) {
                return true;
            }
        }
        return !arg1;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(II)I")
    public static final int method409(int arg0, int arg1) {
        int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
        field940++;
        int var3 = arg0 * 6 - 61440;
        if (arg1 > -107) {
            method412(-83);
        }
        int var4 = (arg0 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!df", name = "f", descriptor = "(I)V")
    public static final void method410(int arg0) {
        field939++;
        class162 var1 = class72.field1188;
        synchronized (class72.field1188) {
            class138.field2270 = class229.field3777;
            class121.field1970++;
            if (class85.field1349 < 0) {
                for (int var2 = 0; var2 < 112; var2++) {
                    class73.field1193[var2] = false;
                }
                class85.field1349 = class8.field107;
            } else {
                while (class85.field1349 != class8.field107) {
                    int var3 = class83.field1301[class8.field107];
                    class8.field107 = class8.field107 + 1 & 0x7F;
                    if (var3 < 0) {
                        class73.field1193[~var3] = false;
                    } else {
                        class73.field1193[var3] = true;
                    }
                }
            }
            class229.field3777 = class107.field1757;
            if (arg0 == -23014) {
                ;
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IB)I")
    public static final int method411(String arg0, String arg1, int arg2, byte arg3) {
        field945++;
        int var4 = 0;
        int var5 = 0;
        int var6 = arg0.length();
        char var7 = 0;
        if (arg3 > -47) {
            return 105;
        }
        char var8 = 0;
        int var9 = arg1.length();
        while (var4 - var8 < var6 || var5 - var7 < var9) {
            if (var4 - var8 >= var6) {
                return -1;
            }
            if ((var5 - var7) >= var9) {
                return 1;
            }
            char var22;
            if (var8 == '\u0000') {
                var22 = arg0.charAt(var4++);
            } else {
                var22 = var8;
                boolean var23 = false;
            }
            char var24;
            if (var7 == '\u0000') {
                var24 = arg1.charAt(var5++);
            } else {
                var24 = var7;
                boolean var25 = false;
            }
            var8 = class22.method208(-12330, var22);
            var7 = class22.method208(-12330, var24);
            char var26 = class259.method1767(var22, arg2, (byte) 74);
            char var27 = class259.method1767(var24, arg2, (byte) 111);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class100.method738(arg2, false, var28) - class100.method738(arg2, false, var29);
                }
            }
        }
        int var10 = Math.min(var6, var9);
        for (int var11 = 0; var11 < var10; var11++) {
            int var16;
            int var17;
            if (arg2 == 2) {
                var16 = var9 - var11 - 1;
                var17 = var6 - (var11 + 1);
            } else {
                var16 = var11;
                var17 = var11;
            }
            char var18 = arg0.charAt(var17);
            char var19 = arg1.charAt(var16);
            if (var18 != var19 && Character.toUpperCase(var18) != Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (var20 != var21) {
                    return class100.method738(arg2, false, var20) - class100.method738(arg2, false, var21);
                }
            }
        }
        int var12 = var6 - var9;
        if (var12 != 0) {
            return var12;
        }
        for (int var13 = 0; var13 < var10; var13++) {
            char var14 = arg0.charAt(var13);
            char var15 = arg1.charAt(var13);
            if (var14 != var15) {
                return class100.method738(arg2, false, var14) - class100.method738(arg2, false, var15);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!df", name = "g", descriptor = "(I)V")
    public static final void method412(int arg0) {
        int var1 = -81 / ((21 - arg0) / 52);
        for (int var2 = 0; var2 < class43.field802; var2++) {
            int var3 = class106.field1701[var2];
            class33 var4 = class35.field548[var3];
            int var5 = class67.field1103.method1517((byte) -96);
            if ((var5 & 0x40) != 0) {
                var5 += class67.field1103.method1517((byte) -96) << 8;
            }
            class277.method1863(true, var5, var3, var4);
        }
        field943++;
    }

    @OriginalMember(owner = "client!df", name = "h", descriptor = "(I)V")
    public static final void method413(int arg0) {
        field944++;
        for (class180 var1 = (class180) class240.field3887.method843(arg0 ^ 0xFFFFF359); var1 != null; var1 = (class180) class240.field3887.method852((byte) 123)) {
            class64 var2 = var1.field2825;
            if (class250.field3980 != var2.field1075 || class222.field3682 > var2.field1070) {
                var1.method1388(arg0 ^ 0xC86);
            } else if (class222.field3682 >= var2.field1040) {
                if (var2.field1056 > 0) {
                    class15 var3 = class137.field2260[var2.field1056 - 1];
                    if (var3 != null && var3.field3389 >= 0 && var3.field3389 < 13312 && var3.field3341 >= 0 && var3.field3341 < 13312) {
                        var2.method451(var3.field3389, var3.field3341, class225.method1583(var3.field3341, var3.field3389, var2.field1075, arg0 - 3209) - var2.field1048, class222.field3682, -1);
                    }
                }
                if (var2.field1056 < 0) {
                    int var4 = -var2.field1056 - 1;
                    class33 var5;
                    if (class233.field3811 == var4) {
                        var5 = class167.field2655;
                    } else {
                        var5 = class35.field548[var4];
                    }
                    if (var5 != null && var5.field3389 >= 0 && var5.field3389 < 13312 && var5.field3341 >= 0 && var5.field3341 < 13312) {
                        var2.method451(var5.field3389, var5.field3341, class225.method1583(var5.field3341, var5.field3389, var2.field1075, 0) - var2.field1048, class222.field3682, -1);
                    }
                }
                var2.method457(class287.field4533, -109);
                class270.method1824(class250.field3980, (int) var2.field1041, (int) var2.field1059, (int) var2.field1054, 60, var2, var2.field1052, -1L, false);
            }
        }
        if (arg0 != 3209) {
            method411((String) null, (String) null, -102, (byte) -19);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ZIBI)Ljava/lang/String;")
    public static final String method414(boolean arg0, int arg1, byte arg2, int arg3) {
        field937++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        } else if (arg0 && arg1 >= 0) {
            int var4 = 2;
            if (arg2 <= 11) {
                method414(false, -59, (byte) 18, -80);
            }
            for (int var5 = arg1 / arg3; var5 != 0; var5 /= arg3) {
                var4++;
            }
            char[] var6 = new char[var4];
            var6[0] = '+';
            for (int var7 = var4 - 1; var7 > 0; var7--) {
                int var8 = arg1;
                arg1 /= arg3;
                int var9 = var8 - (arg1 * arg3);
                if (var9 >= 10) {
                    var6[var7] = (char) (var9 + 87);
                } else {
                    var6[var7] = (char) (var9 + 48);
                }
            }
            return new String(var6);
        } else {
            return Integer.toString(arg1, arg3);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(B)V")
    public final void method415(byte arg0) {
        this.field948 = 12800;
        this.field935 = 12800;
        this.field934 = 0;
        if (arg0 != -112) {
            return;
        }
        field946++;
        this.field933 = 0;
        for (class142 var2 = (class142) this.field942.method843(-79); var2 != null; var2 = (class142) this.field942.method852((byte) 123)) {
            if (var2.field2291 < this.field948) {
                this.field948 = var2.field2291;
            }
            if (this.field934 < var2.field2292) {
                this.field934 = var2.field2292;
            }
            if (var2.field2297 < this.field935) {
                this.field935 = var2.field2297;
            }
            if (this.field933 < var2.field2298) {
                this.field933 = var2.field2298;
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIZI)V")
    public class55(String arg0, String arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        this.field949 = arg5;
        this.field930 = arg0;
        this.field938 = arg3;
        this.field932 = arg4;
        this.field936 = arg2;
        this.field941 = arg6;
        this.field947 = arg1;
        if (this.field941 == 255) {
            this.field941 = 0;
        }
        this.field942 = new class115();
    }
}
