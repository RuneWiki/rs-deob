import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class140 {

    @OriginalMember(owner = "client!fh", name = "L", descriptor = "Lfo;")
    private class229 field1957 = null;

    @OriginalMember(owner = "client!fh", name = "p", descriptor = "Z")
    private boolean field1935;

    @OriginalMember(owner = "client!fh", name = "G", descriptor = "Lga;")
    private class175 field1952;

    @OriginalMember(owner = "client!fh", name = "g", descriptor = "Z")
    private boolean field1926;

    @OriginalMember(owner = "client!fh", name = "E", descriptor = "I")
    public static int field1950 = 0;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "I")
    public static int field1920;

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "I")
    public static int field1921;

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "I")
    public static int field1922;

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "I")
    public static int field1923;

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "I")
    public static int field1924;

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "I")
    public static int field1925;

    @OriginalMember(owner = "client!fh", name = "h", descriptor = "I")
    public static int field1927;

    @OriginalMember(owner = "client!fh", name = "i", descriptor = "I")
    public static int field1928;

    @OriginalMember(owner = "client!fh", name = "j", descriptor = "I")
    public static int field1929;

    @OriginalMember(owner = "client!fh", name = "k", descriptor = "I")
    public static int field1930;

    @OriginalMember(owner = "client!fh", name = "l", descriptor = "I")
    public static int field1931;

    @OriginalMember(owner = "client!fh", name = "m", descriptor = "I")
    public static int field1932;

    @OriginalMember(owner = "client!fh", name = "n", descriptor = "I")
    public static int field1933;

    @OriginalMember(owner = "client!fh", name = "o", descriptor = "I")
    public static int field1934;

    @OriginalMember(owner = "client!fh", name = "q", descriptor = "I")
    public static int field1936;

    @OriginalMember(owner = "client!fh", name = "r", descriptor = "I")
    public static int field1937;

    @OriginalMember(owner = "client!fh", name = "t", descriptor = "I")
    public static int field1939;

    @OriginalMember(owner = "client!fh", name = "u", descriptor = "I")
    public static int field1940;

    @OriginalMember(owner = "client!fh", name = "v", descriptor = "I")
    public static int field1941;

    @OriginalMember(owner = "client!fh", name = "w", descriptor = "I")
    public static int field1942;

    @OriginalMember(owner = "client!fh", name = "x", descriptor = "I")
    public static int field1943;

    @OriginalMember(owner = "client!fh", name = "y", descriptor = "I")
    public static int field1944;

    @OriginalMember(owner = "client!fh", name = "z", descriptor = "I")
    public static int field1945;

    @OriginalMember(owner = "client!fh", name = "A", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!fh", name = "B", descriptor = "I")
    public static int field1947;

    @OriginalMember(owner = "client!fh", name = "C", descriptor = "I")
    public static int field1948;

    @OriginalMember(owner = "client!fh", name = "D", descriptor = "I")
    public static int field1949;

    @OriginalMember(owner = "client!fh", name = "F", descriptor = "I")
    public static int field1951;

    @OriginalMember(owner = "client!fh", name = "I", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!fh", name = "J", descriptor = "I")
    public static int field1955;

    @OriginalMember(owner = "client!fh", name = "K", descriptor = "I")
    public static int field1956;

    @OriginalMember(owner = "client!fh", name = "M", descriptor = "I")
    public static int field1958;

    @OriginalMember(owner = "client!fh", name = "N", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!fh", name = "H", descriptor = "[Ljava/lang/Object;")
    private Object[] field1953;

    @OriginalMember(owner = "client!fh", name = "s", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field1938;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)Z", line = 10)
    public final boolean method1057(String arg0, byte arg1, String arg2) {
        field1933++;
        if (!this.method1065((byte) -110)) {
            return false;
        }
        String var4 = arg0.toLowerCase();
        String var5 = arg2.toLowerCase();
        int var6 = this.field1957.field3282.method1331(-76, class255.method1773(var4, 0));
        if (!this.method1083(var6, -112)) {
            return false;
        }
        if (arg1 != -99) {
            this.method1073(true, false, (byte) 79);
        }
        int var7 = this.field1957.field3290[var6].method1331(-84, class255.method1773(var5, 0));
        return this.method1087(var6, true, var7);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)V", line = 37)
    private final void method1058(int arg0, int arg1) {
        field1921++;
        if (arg0 == 0) {
            this.field1952.method1289(arg1, -6);
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 50)
    public final int method1059(String arg0, byte arg1) {
        if (arg1 != -11) {
            this.field1957 = (class229) null;
        }
        field1922++;
        if (this.method1065((byte) -110)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field1957.field3282.method1331(-107, class255.method1773(var3, arg1 + 11));
            return this.method1063(var4, -12826);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IZ)[B", line = 71)
    public final byte[] method1060(int arg0, boolean arg1) {
        if (!arg1) {
            this.field1957 = (class229) null;
        }
        field1946++;
        if (!this.method1065((byte) -110)) {
            return null;
        } else if (this.field1957.field3274.length == 1) {
            return this.method1089(0, (byte) 118, arg0);
        } else if (!this.method1083(arg0, -120)) {
            return null;
        } else if (this.field1957.field3274[arg0] == 1) {
            return this.method1089(arg0, (byte) 111, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 99)
    public final boolean method1061(String arg0, int arg1) {
        if (arg1 != -2) {
            return true;
        }
        field1955++;
        if (this.method1065((byte) -110)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field1957.field3282.method1331(-128, class255.method1773(var3, 0));
            return var4 >= 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)I", line = 123)
    public final int method1062(int arg0) {
        field1927++;
        if (!this.method1065((byte) -110)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1953.length; var4++) {
            if (this.field1957.field3285[var4] > 0) {
                var3 += this.method1063(var4, -12826);
                var2 += 100;
            }
        }
        if (arg0 > -106) {
            this.field1935 = false;
        }
        if (var2 == 0) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(II)I", line = 162)
    private final int method1063(int arg0, int arg1) {
        field1937++;
        if (arg1 != -12826) {
            return -42;
        } else if (this.method1083(arg0, -123)) {
            return this.field1953[arg0] == null ? this.field1952.method1288(arg0, -1) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)Lfd;", line = 182)
    public static final class299 method1064(int arg0) {
        field1924++;
        if (arg0 > -69) {
            field1950 = 31;
        }
        class299 var1 = new class299(34);
        var1.method2048(11, 82);
        var1.method2048(class254.field3713, 80);
        var1.method2048(class180.field2467 ? 1 : 0, 120);
        var1.method2048(class199.field2803 ? 1 : 0, 127);
        var1.method2048(class329.field4812 ? 1 : 0, 118);
        var1.method2048(class27.field313 ? 1 : 0, 123);
        var1.method2048(class343.field5340 ? 1 : 0, 66);
        var1.method2048(class80.field1017 ? 1 : 0, 100);
        var1.method2048(class40.field506 ? 1 : 0, 61);
        var1.method2048(class122.field1603 ? 1 : 0, 62);
        var1.method2048(class89.field1119, 103);
        var1.method2048(class67.field856 ? 1 : 0, 88);
        var1.method2048(class177.field2436 ? 1 : 0, 101);
        var1.method2048(class280.field3995 ? 1 : 0, 119);
        var1.method2048(class315.field4647, 81);
        var1.method2048(class103.field1343 ? 1 : 0, 62);
        var1.method2048(class75.field991, 67);
        var1.method2048(class101.field1319, 116);
        var1.method2048(class204.field2843, 95);
        var1.method2098(-41, class330.field4838);
        var1.method2098(-124, class214.field3032);
        var1.method2048(class187.method1356(), 96);
        var1.method2084(true, class97.field1280);
        var1.method2048(class118.field1543, 110);
        var1.method2048(class142.field1963 ? 1 : 0, 100);
        var1.method2048(class48.field638 ? 1 : 0, 81);
        var1.method2048(class58.field745, 123);
        var1.method2048(class66.field849 ? 1 : 0, 75);
        var1.method2048(class139.field1917 ? 1 : 0, 94);
        return var1;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(B)Z", line = 223)
    private final boolean method1065(byte arg0) {
        if (arg0 != -110) {
            this.field1952 = (class175) null;
        }
        field1923++;
        if (this.field1957 == null) {
            this.field1957 = this.field1952.method1292(arg0 ^ 0xFFFFFF92);
            if (this.field1957 == null) {
                return false;
            }
            this.field1953 = new Object[this.field1957.field3296];
            this.field1938 = new Object[this.field1957.field3296][];
        }
        return true;
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "(I)V", line = 246)
    public final void method1066(int arg0) {
        field1929++;
        if (this.field1938 != null) {
            for (int var2 = 0; var2 < this.field1938.length; var2++) {
                this.field1938[var2] = null;
            }
        }
        if (arg0 != 0) {
            this.field1952 = (class175) null;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZII)[B", line = 268)
    public final byte[] method1067(boolean arg0, int arg1, int arg2) {
        field1920++;
        if (!this.method1070(arg1, 57, arg2)) {
            return null;
        }
        if (this.field1938[arg2] == null || this.field1938[arg2][arg1] == null) {
            boolean var4 = this.method1071(0, (int[]) null, arg2);
            if (!var4) {
                this.method1069(1, arg2);
                boolean var5 = this.method1071(0, (int[]) null, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        return class25.method168(19138, arg0, this.field1938[arg2][arg1]);
    }

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "(I)I", line = 304)
    public final int method1068(int arg0) {
        field1945++;
        if (arg0 >= -31) {
            this.method1079(true, (String) null);
        }
        return this.method1065((byte) -110) ? this.field1957.field3274.length : -1;
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "(II)V", line = 319)
    private final void method1069(int arg0, int arg1) {
        field1958++;
        if (arg0 != 1) {
            this.field1926 = false;
        }
        if (this.field1926) {
            this.field1953[arg1] = this.field1952.method1290(-94271416, arg1);
        } else {
            this.field1953[arg1] = class138.method1043(this.field1952.method1290(-94271416, arg1), false, 136);
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(III)Z", line = 334)
    private final boolean method1070(int arg0, int arg1, int arg2) {
        field1941++;
        if (!this.method1065((byte) -110)) {
            return false;
        }
        int var4 = 67 / ((arg1 + 82) / 33);
        if (arg2 >= 0 && arg0 >= 0 && this.field1957.field3274.length > arg2 && arg0 < this.field1957.field3274[arg2]) {
            return true;
        } else if (class82.field1057) {
            throw new IllegalArgumentException(arg2 + "," + arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I[II)Z", line = 358)
    private final boolean method1071(int arg0, int[] arg1, int arg2) {
        field1944++;
        if (!this.method1083(arg2, -106)) {
            return false;
        } else if (this.field1953[arg2] == null) {
            return false;
        } else {
            int[] var4 = this.field1957.field3277[arg2];
            int var5 = this.field1957.field3285[arg2];
            boolean var6 = true;
            if (this.field1938[arg2] == null) {
                this.field1938[arg2] = new Object[this.field1957.field3274[arg2]];
            }
            Object[] var7 = this.field1938[arg2];
            for (int var8 = arg0; var8 < var5; var8++) {
                int var9;
                if (var4 == null) {
                    var9 = var8;
                } else {
                    var9 = var4[var8];
                }
                if (var7[var9] == null) {
                    var6 = false;
                    break;
                }
            }
            if (var6) {
                return true;
            }
            byte[] var10;
            if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
                var10 = class25.method168(arg0 ^ 0x4AC2, false, this.field1953[arg2]);
            } else {
                var10 = class25.method168(19138, true, this.field1953[arg2]);
                class299 var11 = new class299(var10);
                var11.method2074(arg1, 5, true, var11.field4350.length);
            }
            byte[] var12;
            try {
                var12 = class170.method1257(true, var10);
            } catch (RuntimeException var31) {
                throw class249.method1749(var31, "T3 - " + (arg1 != null) + "," + arg2 + "," + var10.length + "," + class166.method1241(var10.length, arg0, var10) + "," + class166.method1241(var10.length - 2, 0, var10) + "," + this.field1957.field3279[arg2] + "," + this.field1957.field3293);
            }
            if (this.field1926) {
                this.field1953[arg2] = null;
            }
            if (var5 > 1) {
                int var14 = var12.length;
                int[] var15 = new int[var5];
                int var32 = var14 - 1;
                int var16 = var12[var32] & 0xFF;
                class299 var17 = new class299(var12);
                int var18 = var32 - var16 * 4 * var5;
                var17.field4351 = var18;
                for (int var19 = 0; var19 < var16; var19++) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < var5; var21++) {
                        if (var4 != null) {
                        }
                        var20 += var17.method2062(-25795);
                        var15[var21] += var20;
                    }
                }
                byte[][] var22 = new byte[var5][];
                for (int var23 = 0; var23 < var5; var23++) {
                    var22[var23] = new byte[var15[var23]];
                    var15[var23] = 0;
                }
                var17.field4351 = var18;
                int var24 = 0;
                for (int var25 = 0; var25 < var16; var25++) {
                    int var26 = 0;
                    for (int var27 = 0; var27 < var5; var27++) {
                        var26 += var17.method2062(arg0 ^ 0xFFFF9B3D);
                        class87.method635(var12, var24, var22[var27], var15[var27], var26);
                        var24 += var26;
                        var15[var27] += var26;
                    }
                }
                for (int var28 = 0; var28 < var5; var28++) {
                    int var29;
                    if (var4 == null) {
                        var29 = var28;
                    } else {
                        var29 = var4[var28];
                    }
                    if (this.field1935) {
                        var7[var29] = var22[var28];
                    } else {
                        var7[var29] = class138.method1043(var22[var28], false, 136);
                    }
                }
            } else {
                int var30;
                if (var4 == null) {
                    var30 = 0;
                } else {
                    var30 = var4[0];
                }
                if (this.field1935) {
                    var7[var30] = var12;
                } else {
                    var7[var30] = class138.method1043(var12, false, 136);
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IB)Z", line = 554)
    private final boolean method1072(int arg0, byte arg1) {
        field1956++;
        if (arg1 != -73) {
            return true;
        } else if (!this.method1083(arg0, -108)) {
            return false;
        } else if (this.field1953[arg0] == null) {
            this.method1069(1, arg0);
            return this.field1953[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZZB)V", line = 578)
    public final void method1073(boolean arg0, boolean arg1, byte arg2) {
        field1939++;
        if (arg2 != -20) {
            this.field1957 = (class229) null;
        }
        if (!this.method1065((byte) -110)) {
            return;
        }
        if (arg1) {
            this.field1957.field3290 = null;
            this.field1957.field3284 = (int[][]) null;
        }
        if (arg0) {
            this.field1957.field3292 = null;
            this.field1957.field3282 = null;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ILjava/lang/String;)V", line = 604)
    public final void method1074(int arg0, String arg1) {
        if (arg0 <= 6) {
            this.method1078(86, 36, (int[]) null, -78);
        }
        field1954++;
        if (this.method1065((byte) -110)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field1957.field3282.method1331(-75, class255.method1773(var3, 0));
            this.method1058(0, var4);
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)[B", line = 623)
    public final byte[] method1075(int arg0, String arg1, String arg2) {
        field1932++;
        if (!this.method1065((byte) -110)) {
            return null;
        }
        String var4 = arg2.toLowerCase();
        if (arg0 < 62) {
            return (byte[]) null;
        }
        String var5 = arg1.toLowerCase();
        int var6 = this.field1957.field3282.method1331(-92, class255.method1773(var4, 0));
        if (this.method1083(var6, -117)) {
            int var7 = this.field1957.field3290[var6].method1331(-128, class255.method1773(var5, 0));
            return this.method1089(var6, (byte) 110, var7);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "(II)Z", line = 649)
    public final boolean method1076(int arg0, int arg1) {
        field1928++;
        if (!this.method1065((byte) -110)) {
            return false;
        } else if (this.field1957.field3274.length == 1) {
            return this.method1087(0, true, arg0);
        } else if (this.method1083(arg0, -126)) {
            if (arg1 <= 59) {
                method1081(-43, -94);
            }
            if (this.field1957.field3274[arg0] != 1) {
                throw new RuntimeException();
            }
            return this.method1087(arg0, true, 0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Z)Z", line = 682)
    public final boolean method1077(boolean arg0) {
        field1940++;
        if (!this.method1065((byte) -110)) {
            return false;
        }
        boolean var2 = arg0;
        for (int var3 = 0; var3 < this.field1957.field3294.length; var3++) {
            int var4 = this.field1957.field3294[var3];
            if (this.field1953[var4] == null) {
                this.method1069(1, var4);
                if (this.field1953[var4] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(II[II)[B", line = 716)
    public final byte[] method1078(int arg0, int arg1, int[] arg2, int arg3) {
        field1931++;
        if (!this.method1070(arg0, arg3 ^ 0xA, arg1)) {
            return null;
        }
        if (this.field1938[arg1] == null || this.field1938[arg1][arg0] == null) {
            boolean var5 = this.method1071(0, arg2, arg1);
            if (!var5) {
                this.method1069(1, arg1);
                boolean var6 = this.method1071(0, arg2, arg1);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class25.method168(arg3 + 19138, false, this.field1938[arg1][arg0]);
        if (arg3 != 0) {
            return (byte[]) null;
        }
        if (this.field1935) {
            this.field1938[arg1][arg0] = null;
            if (this.field1957.field3274[arg1] == 1) {
                this.field1938[arg1] = null;
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZLjava/lang/String;)I", line = 761)
    public final int method1079(boolean arg0, String arg1) {
        field1925++;
        if (!this.method1065((byte) -110)) {
            return -1;
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field1957.field3282.method1331(-98, class255.method1773(var3, 0));
        if (arg0) {
            this.field1957 = (class229) null;
        }
        return this.method1083(var4, -126) ? var4 : -1;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZI)[I", line = 783)
    public final int[] method1080(boolean arg0, int arg1) {
        if (!arg0) {
            this.method1079(true, (String) null);
        }
        field1934++;
        if (!this.method1083(arg1, -112)) {
            return null;
        }
        int[] var3 = this.field1957.field3277[arg1];
        if (var3 == null) {
            var3 = new int[this.field1957.field3285[arg1]];
            int var4 = 0;
            while (var4 < var3.length) {
                var3[var4] = var4++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "(II)Z", line = 811)
    public static final boolean method1081(int arg0, int arg1) {
        field1943++;
        if (class44.field548[arg1]) {
            return true;
        } else if (!class284.field4050.method1072(arg1, (byte) -73)) {
            return false;
        } else if (arg0 >= -24) {
            return false;
        } else {
            int var2 = class284.field4050.method1088(arg1, 1);
            if (var2 == 0) {
                class44.field548[arg1] = true;
                return true;
            }
            if (class26.field308[arg1] == null) {
                class26.field308[arg1] = new class333[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class26.field308[arg1][var3] == null) {
                    byte[] var4 = class284.field4050.method1089(arg1, (byte) 116, var3);
                    if (var4 != null) {
                        class333 var5 = class26.field308[arg1][var3] = new class333();
                        var5.field5109 = (arg1 << 16) + var3;
                        if (var4[0] == -1) {
                            var5.method2328(-14625, new class299(var4));
                        } else {
                            var5.method2324(new class299(var4), 78);
                        }
                    }
                }
            }
            class44.field548[arg1] = true;
            return true;
        }
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(Ljava/lang/String;I)Z", line = 871)
    public final boolean method1082(String arg0, int arg1) {
        field1949++;
        if (!this.method1065((byte) -110)) {
            return false;
        }
        String var3 = arg0.toLowerCase();
        if (arg1 != 2) {
            this.method1062(-68);
        }
        int var4 = this.field1957.field3282.method1331(-72, class255.method1773(var3, 0));
        return this.method1072(var4, (byte) -73);
    }

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "(II)Z", line = 894)
    private final boolean method1083(int arg0, int arg1) {
        field1948++;
        if (!this.method1065((byte) -110)) {
            return false;
        } else if (arg0 >= 0 && this.field1957.field3274.length > arg0 && this.field1957.field3274[arg0] != 0) {
            if (arg1 >= -105) {
                this.method1084(114, (byte) -119);
            }
            return true;
        } else if (class82.field1057) {
            throw new IllegalArgumentException(Integer.toString(arg0));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(IB)I", line = 922)
    public final int method1084(int arg0, byte arg1) {
        field1942++;
        if (!this.method1065((byte) -110)) {
            return -1;
        }
        int var3 = this.field1957.field3282.method1331(-91, arg0);
        if (this.method1083(var3, -110)) {
            return arg1 == -115 ? var3 : -24;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(ZI)V", line = 949)
    public final void method1085(boolean arg0, int arg1) {
        field1936++;
        if (!this.method1083(arg1, -119)) {
            return;
        }
        if (arg0) {
            this.field1957 = (class229) null;
        }
        if (this.field1938 != null) {
            this.field1938[arg1] = null;
        }
    }

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "(I)I", line = 966)
    public final int method1086(int arg0) {
        field1951++;
        if (!this.method1065((byte) -110)) {
            throw new IllegalStateException("");
        }
        if (arg0 != 28532) {
            this.field1953 = (Object[]) null;
        }
        return this.field1957.field3293;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IZI)Z", line = 988)
    public final boolean method1087(int arg0, boolean arg1, int arg2) {
        field1959++;
        if (!this.method1070(arg2, -35, arg0)) {
            return false;
        } else if (this.field1938[arg0] == null || this.field1938[arg0][arg2] == null) {
            if (!arg1) {
                this.method1057((String) null, (byte) -61, (String) null);
            }
            if (this.field1953[arg0] == null) {
                this.method1069(1, arg0);
                return this.field1953[arg0] != null;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(Lga;ZZ)V", line = 1043)
    public class140(class175 arg0, boolean arg1, boolean arg2) {
        this.field1935 = arg2;
        this.field1952 = arg0;
        this.field1926 = arg1;
    }

    @OriginalMember(owner = "client!fh", name = "g", descriptor = "(II)I", line = 1019)
    public final int method1088(int arg0, int arg1) {
        if (arg1 == 1) {
            field1947++;
            return this.method1083(arg0, arg1 ^ 0xFFFFFF8E) ? this.field1957.field3274[arg0] : 0;
        } else {
            return 77;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IBI)[B", line = 1034)
    public final byte[] method1089(int arg0, byte arg1, int arg2) {
        field1930++;
        if (arg1 < 108) {
            this.field1952 = (class175) null;
        }
        return this.method1078(arg2, arg0, (int[]) null, 0);
    }
}
