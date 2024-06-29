import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class101 {

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "Z")
    public static boolean field1967 = false;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "[I")
    public static int[] field1962 = new int[2];

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "I")
    public static int field1963;

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "I")
    public static int field1966;

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!wf", name = "i", descriptor = "I")
    public static int field1970;

    @OriginalMember(owner = "client!wf", name = "j", descriptor = "I")
    public static int field1971;

    @OriginalMember(owner = "client!wf", name = "l", descriptor = "I")
    public static int field1973;

    @OriginalMember(owner = "client!wf", name = "n", descriptor = "I")
    public static int field1975;

    @OriginalMember(owner = "client!wf", name = "o", descriptor = "I")
    public static int field1976;

    @OriginalMember(owner = "client!wf", name = "p", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!wf", name = "r", descriptor = "I")
    public static int field1979;

    @OriginalMember(owner = "client!wf", name = "t", descriptor = "I")
    public static int field1981;

    @OriginalMember(owner = "client!wf", name = "u", descriptor = "I")
    public static int field1982;

    @OriginalMember(owner = "client!wf", name = "v", descriptor = "I")
    public int field1983;

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "J")
    private long field1968;

    @OriginalMember(owner = "client!wf", name = "s", descriptor = "J")
    private long field1980;

    @OriginalMember(owner = "client!wf", name = "k", descriptor = "Ljk;")
    public static class196 field1972;

    @OriginalMember(owner = "client!wf", name = "m", descriptor = "Lcj;")
    public static class28 field1974;

    @OriginalMember(owner = "client!wf", name = "q", descriptor = "Z")
    public boolean field1978;

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "[I")
    private int[] field1964;

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "[I")
    private int[] field1965;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(JI)Lr;")
    public static final class66 method690(long arg0, int arg1) {
        field1977++;
        int var3 = -20 % ((-arg1 - 16) / 36);
        return class237.method1565(10, arg0, 97, false);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILuc;IIB)Ljh;")
    public final class262 method691(int arg0, class224 arg1, int arg2, int arg3, byte arg4) {
        field1969++;
        long var6 = (long) arg2 | (long) arg2 << 32 | (long) (arg3 << 16);
        if (arg4 != -37) {
            method690(37L, 25);
        }
        class262 var8 = (class262) class95.field1823.method1617(arg4 + 14403, var6);
        if (var8 == null) {
            class118[] var9 = new class118[2];
            int var10 = 0;
            if (!class51.method352(arg2, arg4 + 40).method646(arg4 ^ 0x5C83) || !class51.method352(arg3, 3).method646(arg4 ^ 0x5C83)) {
                return null;
            }
            class118 var11 = class51.method352(arg2, arg4 ^ 0xFFFFFFD8).method645(-74);
            if (var11 != null) {
                var9[var10++] = var11;
            }
            class118 var12 = class51.method352(arg3, 3).method645(-123);
            if (var12 != null) {
                var9[var10++] = var12;
            }
            class118 var13 = new class118(var9, var10);
            for (int var14 = 0; var14 < 5; var14++) {
                if (class87.field1705[var14].length > this.field1964[var14]) {
                    var13.method803(class115.field2176[var14], class87.field1705[var14][this.field1964[var14]]);
                }
                if (this.field1964[var14] < class29.field433[var14].length) {
                    var13.method803(class34.field509[var14], class29.field433[var14][this.field1964[var14]]);
                }
            }
            var8 = var13.method801(64, 768, -50, -10, -50);
            class95.field1823.method1615(var8, 99, var6);
        }
        if (arg1 != null) {
            var8 = arg1.method1425((byte) -98, var8, arg0);
        }
        return var8;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZI)V")
    public final void method692(boolean arg0, int arg1) {
        this.field1978 = arg0;
        field1966++;
        int var3 = -19 / ((7 - arg1) / 45);
        this.method700(-1);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILuc;ILuc;B)Ljh;")
    public final class262 method693(int arg0, class224 arg1, int arg2, class224 arg3, byte arg4) {
        field1971++;
        if (this.field1983 != -1) {
            return class96.method665(this.field1983, 28).method1343(arg2, arg3, (byte) -119, arg1, arg0);
        }
        long var6 = this.field1968;
        int[] var8 = this.field1965;
        if (arg4 <= 43) {
            field1974 = null;
        }
        if (arg1 != null && (arg1.field3823 >= 0 || arg1.field3809 >= 0)) {
            var8 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var8[var9] = this.field1965[var9];
            }
            if (arg1.field3823 >= 0) {
                if (arg1.field3823 == 65535) {
                    var6 ^= 0xFFFFFFFF00000000L;
                    var8[5] = 0;
                } else {
                    var8[5] = class73.method521(1073741824, arg1.field3823);
                    var6 ^= (long) var8[5] << 32;
                }
            }
            if (arg1.field3809 >= 0) {
                if (arg1.field3809 == 65535) {
                    var8[3] = 0;
                    var6 ^= 0xFFFFFFFFL;
                } else {
                    var8[3] = class73.method521(1073741824, arg1.field3809);
                    var6 ^= (long) var8[3];
                }
            }
        }
        class262 var10 = (class262) class205.field3511.method1617(14366, var6);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var30 = var8[var12];
                if ((var30 & 0x40000000) == 0) {
                    if ((var30 & Integer.MIN_VALUE) != 0 && !class51.method352(var30 & 0x3FFFFFFF, 3).method647((byte) -118)) {
                        var11 = true;
                    }
                } else if (!class40.method242(-25672, var30 & 0x3FFFFFFF).method1067(this.field1978, -116)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field1980 != -1L) {
                    var10 = (class262) class205.field3511.method1617(14366, this.field1980);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                class118[] var13 = new class118[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var27 = var8[var15];
                    if ((var27 & 0x40000000) != 0) {
                        class118 var29 = class40.method242(-25672, var27 & 0x3FFFFFFF).method1078(this.field1978, (byte) 118);
                        if (var29 != null) {
                            var13[var14++] = var29;
                        }
                    } else if ((var27 & Integer.MIN_VALUE) != 0) {
                        class118 var28 = class51.method352(var27 & 0x3FFFFFFF, 3).method642(false);
                        if (var28 != null) {
                            var13[var14++] = var28;
                        }
                    }
                }
                int var16 = var8[0];
                if ((var16 & 0x40000000) != 0) {
                    class157 var17 = class40.method242(-25672, var16 & 0x3FFFFFFF);
                    if (var17.field2782 != null) {
                        for (int var18 = 0; var18 < var17.field2782.length; var18++) {
                            if (var17.field2782[var18] != null && var13[var18 + 1] != null) {
                                int var19 = var17.field2782[var18][0];
                                int var20 = var17.field2782[var18][1];
                                int var21 = var17.field2782[var18][2];
                                int var22 = var17.field2782[var18][3];
                                int var23 = var17.field2782[var18][4];
                                int var24 = var17.field2782[var18][5];
                                var13[var18 + 1].method802(var19, var20, var21);
                                var13[var18 + 1].method799(var22, var23, var24);
                            }
                        }
                    }
                }
                class118 var25 = new class118(var13, var14);
                for (int var26 = 0; var26 < 5; var26++) {
                    if (this.field1964[var26] < class87.field1705[var26].length) {
                        var25.method803(class115.field2176[var26], class87.field1705[var26][this.field1964[var26]]);
                    }
                    if (this.field1964[var26] < class29.field433[var26].length) {
                        var25.method803(class34.field509[var26], class29.field433[var26][this.field1964[var26]]);
                    }
                }
                var10 = var25.method801(64, 850, -30, -50, -30);
                class205.field3511.method1615(var10, 102, var6);
                this.field1980 = var6;
            }
        }
        if (arg1 == null && arg3 == null) {
            return var10;
        }
        class262 var31;
        if (arg1 != null && arg3 != null) {
            var31 = arg1.method1430(var10, arg3, arg2, (byte) -79, arg0);
        } else if (arg1 == null) {
            var31 = arg3.method1422(arg2, true, var10);
        } else {
            var31 = arg1.method1422(arg0, true, var10);
        }
        return var31;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(III)V")
    public final void method694(int arg0, int arg1, int arg2) {
        if (arg1 == 41) {
            this.field1964[arg0] = arg2;
            this.method700(-1);
            field1963++;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V")
    public static void method695(int arg0) {
        field1972 = null;
        field1962 = null;
        if (arg0 <= 56) {
            field1974 = null;
        }
        field1974 = null;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILuc;I)Ljh;")
    public final class262 method696(int arg0, class224 arg1, int arg2) {
        if (arg2 != -13) {
            return null;
        }
        field1976++;
        if (this.field1983 != -1) {
            return class96.method665(this.field1983, -111).method1342(arg1, (byte) 12, arg0);
        }
        class262 var4 = (class262) class95.field1823.method1617(14366, this.field1968);
        if (var4 == null) {
            boolean var5 = false;
            for (int var6 = 0; var6 < 12; var6++) {
                int var15 = this.field1965[var6];
                if ((var15 & 0x40000000) == 0) {
                    if ((var15 & Integer.MIN_VALUE) != 0 && !class51.method352(var15 & 0x3FFFFFFF, 3).method646(arg2 ^ 0x5CAB)) {
                        var5 = true;
                    }
                } else if (!class40.method242(-25672, var15 & 0x3FFFFFFF).method1069(this.field1978, (byte) 75)) {
                    var5 = true;
                }
            }
            if (var5) {
                return null;
            }
            class118[] var7 = new class118[12];
            int var8 = 0;
            for (int var9 = 0; var9 < 12; var9++) {
                int var12 = this.field1965[var9];
                if ((var12 & 0x40000000) != 0) {
                    class118 var13 = class40.method242(-25672, var12 & 0x3FFFFFFF).method1075(-31779, this.field1978);
                    if (var13 != null) {
                        var7[var8++] = var13;
                    }
                } else if ((Integer.MIN_VALUE & var12) != 0) {
                    class118 var14 = class51.method352(var12 & 0x3FFFFFFF, arg2 ^ 0xFFFFFFF0).method645(-50);
                    if (var14 != null) {
                        var7[var8++] = var14;
                    }
                }
            }
            class118 var10 = new class118(var7, var8);
            for (int var11 = 0; var11 < 5; var11++) {
                if (this.field1964[var11] < class87.field1705[var11].length) {
                    var10.method803(class115.field2176[var11], class87.field1705[var11][this.field1964[var11]]);
                }
                if (this.field1964[var11] < class29.field433[var11].length) {
                    var10.method803(class34.field509[var11], class29.field433[var11][this.field1964[var11]]);
                }
            }
            var4 = var10.method801(64, 768, -50, -10, -50);
            class95.field1823.method1615(var4, 127, this.field1968);
        }
        if (arg1 != null) {
            var4 = arg1.method1425((byte) -64, var4, arg0);
        }
        return var4;
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(III)V")
    public final void method697(int arg0, int arg1, int arg2) {
        field1981++;
        int var4 = class234.field4098[arg0];
        if (arg2 != -27345) {
            this.method699(false);
        }
        if (this.field1965[var4] != 0 && class51.method352(arg1, 3) != null) {
            this.field1965[var4] = class73.method521(arg1, Integer.MIN_VALUE);
            this.method700(-1);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "([I[IZBI)V")
    public final void method698(int[] arg0, int[] arg1, boolean arg2, byte arg3, int arg4) {
        if (arg1 == null) {
            arg1 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class202.field3468; var7++) {
                    class93 var8 = class51.method352(var7, 3);
                    if (var8 != null && !var8.field1780 && var8.field1797 == ((arg2 ? 7 : 0) + var6)) {
                        arg1[class234.field4098[var6]] = class73.method521(Integer.MIN_VALUE, var7);
                        break;
                    }
                }
            }
        }
        this.field1983 = arg4;
        field1979++;
        this.field1964 = arg0;
        this.field1978 = arg2;
        this.field1965 = arg1;
        this.method700(-1);
        if (arg3 >= -125) {
            this.method691(121, (class224) null, -17, 99, (byte) -74);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Z)I")
    public final int method699(boolean arg0) {
        if (!arg0) {
            this.method692(false, -75);
        }
        field1982++;
        return this.field1983 == -1 ? (this.field1964[0] << 25) + (this.field1965[8] << 10) + (this.field1964[4] << 20) + (this.field1965[11] << 5) + (this.field1965[0] << 15) + this.field1965[1] : class96.method665(this.field1983, -97).field3568 + 305419896;
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(I)V")
    private final void method700(int arg0) {
        field1970++;
        long var2 = this.field1968;
        long[] var4 = class143.field2611;
        this.field1968 = -1L;
        if (arg0 != -1) {
            method690(-7L, 114);
        }
        for (int var5 = 0; var5 < 12; var5++) {
            this.field1968 = this.field1968 >>> 8 ^ var4[(int) ((this.field1968 ^ (long) (this.field1965[var5] >> 24)) & 0xFFL)];
            this.field1968 = this.field1968 >>> 8 ^ var4[(int) ((this.field1968 ^ (long) (this.field1965[var5] >> 16)) & 0xFFL)];
            this.field1968 = this.field1968 >>> 8 ^ var4[(int) (((long) (this.field1965[var5] >> 8) ^ this.field1968) & 0xFFL)];
            this.field1968 = var4[(int) (((long) this.field1965[var5] ^ this.field1968) & 0xFFL)] ^ this.field1968 >>> 8;
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field1968 = var4[(int) ((this.field1968 ^ (long) this.field1964[var6]) & 0xFFL)] ^ this.field1968 >>> 8;
        }
        this.field1968 = this.field1968 >>> 8 ^ var4[(int) (((long) (this.field1978 ? 1 : 0) ^ this.field1968) & 0xFFL)];
        if (var2 != 0L && this.field1968 != var2) {
            class205.field3511.method1616((byte) 28, var2);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
    public static final String method701(Throwable arg0, int arg1) throws IOException {
        field1975++;
        String var2;
        if ((arg0 instanceof class244)) {
            class244 var3 = (class244) arg0;
            arg0 = var3.field4274;
            var2 = var3.field4266 + " | ";
        } else {
            var2 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            while (true) {
                String var9 = var7.readLine();
                if (var9 == null) {
                    String var18 = var2 + "| " + var8;
                    int var19 = -123 / ((9 - arg1) / 32);
                    return var18;
                }
                int var10 = var9.indexOf(40);
                int var11 = var9.indexOf(41, var10 + 1);
                if (var10 >= 0 && var11 >= 0) {
                    String var12 = var9.substring(var10 + 1, var11);
                    int var13 = var12.indexOf(".java:");
                    if (var13 >= 0) {
                        String var14 = var12.substring(0, var13) + var12.substring(var13 + 5);
                        var2 = var2 + var14 + ' ';
                        continue;
                    }
                    var9 = var9.substring(0, var10);
                }
                String var15 = var9.trim();
                String var16 = var15.substring(var15.lastIndexOf(32) + 1);
                String var17 = var16.substring(var16.lastIndexOf(9) + 1);
                var2 = var2 + var17 + ' ';
            }
        }
    }
}
