import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class110 {

    @OriginalMember(owner = "client!af", name = "w", descriptor = "I")
    private int field1332 = -1;

    @OriginalMember(owner = "client!af", name = "l", descriptor = "Z")
    private boolean field1321 = false;

    @OriginalMember(owner = "client!af", name = "o", descriptor = "I")
    private int field1324 = -1;

    @OriginalMember(owner = "client!af", name = "G", descriptor = "Z")
    private boolean field1342 = false;

    @OriginalMember(owner = "client!af", name = "O", descriptor = "I")
    private int field1350 = -32768;

    @OriginalMember(owner = "client!af", name = "P", descriptor = "I")
    private int field1351;

    @OriginalMember(owner = "client!af", name = "K", descriptor = "I")
    public int field1346;

    @OriginalMember(owner = "client!af", name = "t", descriptor = "B")
    private byte field1329;

    @OriginalMember(owner = "client!af", name = "F", descriptor = "I")
    public int field1341;

    @OriginalMember(owner = "client!af", name = "z", descriptor = "I")
    private int field1335;

    @OriginalMember(owner = "client!af", name = "q", descriptor = "B")
    private byte field1326;

    @OriginalMember(owner = "client!af", name = "x", descriptor = "I")
    public int field1333;

    @OriginalMember(owner = "client!af", name = "y", descriptor = "Z")
    private boolean field1334;

    @OriginalMember(owner = "client!af", name = "g", descriptor = "I")
    public static int field1316 = 2;

    @OriginalMember(owner = "client!af", name = "B", descriptor = "I")
    public static int field1337 = -1;

    @OriginalMember(owner = "client!af", name = "H", descriptor = "Lpn;")
    public static class72 field1343 = new class72(29, 3);

    @OriginalMember(owner = "client!af", name = "N", descriptor = "[I")
    public static int[] field1349 = new int[5];

    @OriginalMember(owner = "client!af", name = "S", descriptor = "I")
    public static int field1354 = -1;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "I")
    public static int field1311;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "I")
    public static int field1312;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "I")
    public static int field1314;

    @OriginalMember(owner = "client!af", name = "h", descriptor = "I")
    public static int field1317;

    @OriginalMember(owner = "client!af", name = "i", descriptor = "I")
    public static int field1318;

    @OriginalMember(owner = "client!af", name = "j", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!af", name = "k", descriptor = "I")
    private int field1320;

    @OriginalMember(owner = "client!af", name = "m", descriptor = "I")
    private int field1322;

    @OriginalMember(owner = "client!af", name = "n", descriptor = "I")
    public static int field1323;

    @OriginalMember(owner = "client!af", name = "p", descriptor = "I")
    public static int field1325;

    @OriginalMember(owner = "client!af", name = "r", descriptor = "I")
    private int field1327;

    @OriginalMember(owner = "client!af", name = "s", descriptor = "I")
    public static int field1328;

    @OriginalMember(owner = "client!af", name = "A", descriptor = "I")
    public static int field1336;

    @OriginalMember(owner = "client!af", name = "C", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!af", name = "D", descriptor = "I")
    private int field1339;

    @OriginalMember(owner = "client!af", name = "I", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!af", name = "J", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!af", name = "M", descriptor = "I")
    public static int field1348;

    @OriginalMember(owner = "client!af", name = "Q", descriptor = "I")
    public static int field1352;

    @OriginalMember(owner = "client!af", name = "R", descriptor = "I")
    public static int field1353;

    @OriginalMember(owner = "client!af", name = "u", descriptor = "J")
    public static long field1330;

    @OriginalMember(owner = "client!af", name = "f", descriptor = "Lph;")
    private class125 field1315;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "Lhu;")
    private class207 field1313;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "Lqh;")
    private class352 field1310;

    @OriginalMember(owner = "client!af", name = "v", descriptor = "Lbt;")
    public class380 field1331;

    @OriginalMember(owner = "client!af", name = "L", descriptor = "Laj;")
    public static class77 field1347;

    @OriginalMember(owner = "client!af", name = "E", descriptor = "[Z")
    private boolean[] field1340;

    @OriginalMember(owner = "client!af", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field1348++;
        if (this.field1331 != null) {
            this.field1331.method2281();
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(BI)V")
    private final void method521(byte arg0, int arg1) {
        field1311++;
        int var3 = arg1;
        boolean var4 = false;
        if (arg1 == -1) {
            class415 var5 = class173.field2084.method2297(50, this.field1346);
            class415 var6 = var5;
            if (var5.field5951 != null) {
                var5 = var5.method2473(-18648, class75.field909);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field5989 != null) {
                if (this.field1313 != null && var5.method2462(this.field1313.field2838, (byte) 63)) {
                    return;
                }
                var3 = var5.method2472(-18);
                if (this.field1332 != var5.field5918) {
                    var4 = var5.field5966;
                }
            } else if (var5.field5943 == -1) {
                if (var6 != null && var6.field5989 != null) {
                    if (this.field1313 != null && var6.method2462(this.field1313.field2838, (byte) 111)) {
                        return;
                    }
                    var3 = var6.method2472(-75);
                    if (this.field1332 != var6.field5918) {
                        var4 = var6.field5966;
                    }
                } else if (var6 != null && var6.field5943 != -1 && this.field1332 != var6.field5918) {
                    var4 = var6.field5966;
                    var3 = var6.field5943;
                }
            } else if (this.field1332 != var5.field5918) {
                var4 = var5.field5966;
                var3 = var5.field5943;
            }
        }
        if (var3 == -1) {
            this.field1313 = null;
            return;
        }
        this.field1310 = null;
        if (this.field1313 == null || this.field1313.field2838 != var3) {
            this.field1313 = class175.field2103.method1267(-25, var3);
        } else if (this.field1313.field2848 == 0) {
            return;
        }
        if (this.field1313.field2853 == null) {
            this.field1313 = null;
            return;
        }
        if (var4) {
            this.field1322 = (int) ((double) this.field1313.field2853.length * Math.random());
            this.field1327 = (int) ((double) this.field1313.field2843[this.field1322] * Math.random()) + 1;
        } else {
            this.field1322 = 0;
            this.field1327 = 1;
        }
        this.field1339 = this.field1322 + 1;
        if (this.field1339 < 0 || this.field1313.field2853.length <= this.field1339) {
            this.field1339 = -1;
        }
        if (arg0 != -97) {
            field1354 = 81;
        }
        this.field1320 = class204.field2796 - this.field1327;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V")
    public static final void method522(int arg0) {
        field1314++;
        class11 var1 = null;
        try {
            class405 var2 = class42.field512.method2173(false);
            while (var2.field5759 == 0) {
                class85.method433(1L, 81);
            }
            if (var2.field5759 == 1) {
                var1 = (class11) var2.field5755;
                byte[] var3 = new byte[(int) var1.method89((byte) -45)];
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method88(var4, var3, (byte) 38, var3.length - var4);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class475.method2809(0, new class179(var3));
            }
        } catch (Exception var7) {
        }
        try {
            if (var1 != null) {
                var1.method86((byte) -104);
            }
        } catch (Exception var6) {
        }
        if (arg0 != 0) {
            method522(5);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ILoj;)V")
    public final void method523(int arg0, class280 arg1) {
        if (arg0 != -27426) {
            this.field1335 = 106;
        }
        field1318++;
        if (this.field1315 != null) {
            class200.method1098(this.field1315, this.field1326, this.field1351, this.field1335, this.field1340);
            this.field1340 = null;
            this.field1315 = null;
        }
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(I)Z")
    public final boolean method524(int arg0) {
        if (arg0 != 10) {
            this.method531(15, (byte) 117);
        }
        field1325++;
        return this.field1334;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Z)V")
    public static void method525(boolean arg0) {
        field1349 = null;
        field1347 = null;
        field1343 = null;
        if (arg0) {
            method525(false);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(JZ)Ljava/lang/String;")
    public static final String method526(long arg0, boolean arg1) {
        field1317++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if ((arg0 % 37L) == 0L) {
            return null;
        } else {
            int var3 = 0;
            if (arg1) {
                field1349 = null;
            }
            for (long var4 = arg0; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg0 != 0L) {
                long var7 = arg0;
                arg0 /= 37L;
                var6.append(class330.field4751[(int) (var7 - arg0 * 37L)]);
            }
            return var6.reverse().toString();
        }
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(I)[Lep;")
    public static final class159[] method527(int arg0) {
        field1345++;
        if (class458.field6446 == null) {
            class159[] var1 = class368.method2225(72, class42.field512);
            class159[] var2 = new class159[var1.length];
            int var3 = 0;
            label67: for (int var4 = 0; var4 < var1.length; var4++) {
                class159 var8 = var1[var4];
                if ((var8.field1900 <= 0 || var8.field1900 >= 24) && var8.field1902 >= 800 && var8.field1905 >= 600 && (class275.field3918 >= 96 || class375.field5347 != 0 || var8.field1902 <= 1024 && var8.field1905 <= 768)) {
                    for (int var9 = 0; var9 < var3; var9++) {
                        class159 var10 = var2[var9];
                        if (var8.field1902 == var10.field1902 && var8.field1905 == var10.field1905) {
                            if (var8.field1900 > var10.field1900) {
                                var2[var9] = var8;
                            }
                            continue label67;
                        }
                    }
                    var2[var3] = var8;
                    var3++;
                }
            }
            class458.field6446 = new class159[var3];
            class268.method1626(var2, 0, class458.field6446, 0, var3);
            int[] var5 = new int[class458.field6446.length];
            for (int var6 = 0; var6 < class458.field6446.length; var6++) {
                class159 var7 = class458.field6446[var6];
                var5[var6] = var7.field1905 * var7.field1902;
            }
            class51.method269(var5, arg0 - 4576, class458.field6446);
        }
        if (arg0 != 4576) {
            field1316 = 123;
        }
        return class458.field6446;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Loj;I)V")
    public final void method528(class280 arg0, int arg1) {
        field1338++;
        this.method529(true, 78, arg0, this.field1335, this.field1351, arg1, true);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ZILoj;IIIZ)Lqh;")
    public final class352 method529(boolean arg0, int arg1, class280 arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field1353++;
        class415 var8 = class173.field2084.method2297(50, this.field1346);
        if (var8.field5951 != null) {
            var8 = var8.method2473(-18648, class75.field909);
        }
        if (var8 == null) {
            this.method523(-27426, arg2);
            this.field1332 = -1;
            this.field1324 = this.field1322;
            return null;
        }
        if (!this.field1321 && this.field1332 != var8.field5918) {
            this.field1310 = null;
            this.method521((byte) -97, -1);
        }
        this.method534(-1, arg3, arg4);
        boolean var9 = arg0 & this.field1334 & class427.field6166 != 0;
        boolean var10 = var9 & (this.field1332 != var8.field5918 || (this.field1324 != this.field1322 || this.field1313 != null && (this.field1313.field2840 || class445.field6334) && this.field1339 != this.field1322) && class427.field6166 >= 2);
        if (arg6 && !var10) {
            this.field1332 = var8.field5918;
            this.field1324 = this.field1322;
            return null;
        }
        if (var10) {
            class200.method1098(this.field1315, this.field1326, this.field1351, this.field1335, this.field1340);
        }
        class443 var11 = class398.field5667[this.field1326];
        if (arg1 < 48) {
            field1336 = -52;
        }
        class443 var12;
        if (this.field1342) {
            var12 = class443.field6329[0];
        } else {
            var12 = this.field1326 < 3 ? class398.field5667[this.field1326 + 1] : null;
        }
        class352 var13 = null;
        if (this.field1313 != null) {
            if (var10) {
                arg5 |= 0x20000;
            }
            var13 = var8.method2459(this.field1322, var11.method1857(this.field1351, this.field1335), this.field1335, var11, this.field1339, (byte) 121, this.field1341 == 11 ? 10 : this.field1341, arg5, this.field1313, this.field1351, arg2, var12, this.field1327, this.field1341 == 11 ? this.field1333 + 4 : this.field1333);
            if (var13 == null) {
                this.field1340 = null;
                this.field1350 = 0;
                this.field1315 = null;
            } else {
                if (var10) {
                    if (this.field1340 == null) {
                        this.field1340 = new boolean[4];
                    }
                    this.field1315 = var13.method1734(this.field1315);
                    class47.method249(this.field1315, this.field1326, arg4, arg3, this.field1340);
                }
                this.field1350 = var13.method1733();
            }
            this.field1310 = null;
        } else if (this.field1310 != null && arg5 == (arg5 & this.field1310.method1719()) && this.field1332 == var8.field5918) {
            var13 = this.field1310;
        } else {
            if (this.field1310 != null) {
                arg5 |= this.field1310.method1719();
            }
            class324 var14 = var8.method2466(var11, var12, this.field1341 == 11 ? 10 : this.field1341, var10, this.field1341 == 11 ? this.field1333 + 4 : this.field1333, this.field1351, (byte) 116, var11.method1857(this.field1351, this.field1335), this.field1335, arg2, arg5);
            if (var14 == null) {
                this.field1340 = null;
                this.field1310 = null;
                this.field1315 = null;
                this.field1350 = 0;
            } else {
                var13 = var14.field4681;
                this.field1310 = var14.field4681;
                if (var10) {
                    this.field1315 = var14.field4676;
                    this.field1340 = null;
                    class47.method249(this.field1315, this.field1326, arg4, arg3, (boolean[]) null);
                }
                this.field1350 = var13.method1733();
            }
        }
        this.field1335 = arg3;
        this.field1324 = this.field1322;
        this.field1351 = arg4;
        this.field1332 = var8.field5918;
        return var13;
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(Z)I")
    public final int method530(boolean arg0) {
        field1344++;
        return arg0 ? this.field1350 : 67;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IB)V")
    public final void method531(int arg0, byte arg1) {
        field1319++;
        this.field1321 = true;
        this.method521((byte) -97, arg0);
        if (arg1 >= -46) {
            this.field1351 = 93;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(BLqh;ZIIIILoj;)V")
    public final void method532(byte arg0, class352 arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, class280 arg7) {
        if (arg0 > -85) {
            return;
        }
        field1352++;
        class118[] var9 = arg1.method1721();
        class282[] var10 = arg1.method1707();
        if ((this.field1331 == null || this.field1331.field5380) && (var9 != null || var10 != null)) {
            class415 var11 = class173.field2084.method2297(50, this.field1346);
            if (var11.field5951 != null) {
                var11 = var11.method2473(-18648, class75.field909);
            }
            if (var11 != null) {
                this.field1331 = new class380(class204.field2796);
            }
        }
        if (this.field1331 == null) {
            return;
        }
        if (arg2) {
            this.field1331.method2271(arg7, (long) class204.field2796, var9, var10, false);
        } else {
            this.field1331.method2278((long) class204.field2796);
        }
        this.field1331.method2274(this.field1329, arg5, arg6, arg3, arg4);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IZ)V")
    public static final void method533(int arg0, boolean arg1) {
        if (arg0 != -1) {
            return;
        }
        for (class399 var2 = (class399) class445.field6339.method802((byte) 124); var2 != null; var2 = (class399) class445.field6339.method806((byte) 104)) {
            if (var2.field5688 != null) {
                class226.field3136.method509(var2.field5688);
                var2.field5688 = null;
            }
            if (var2.field5682 != null) {
                class226.field3136.method509(var2.field5682);
                var2.field5682 = null;
            }
            var2.method702((byte) -114);
        }
        field1328++;
        if (!arg1) {
            return;
        }
        for (class399 var3 = (class399) class53.field689.method802((byte) 109); var3 != null; var3 = (class399) class53.field689.method806((byte) 104)) {
            if (var3.field5688 != null) {
                class226.field3136.method509(var3.field5688);
                var3.field5688 = null;
            }
            var3.method702((byte) -114);
        }
        for (class399 var4 = (class399) class350.field5031.method241(~arg0); var4 != null; var4 = (class399) class350.field5031.method239(0)) {
            if (var4.field5688 != null) {
                class226.field3136.method509(var4.field5688);
                var4.field5688 = null;
            }
            var4.method702((byte) -114);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(III)V")
    private final void method534(int arg0, int arg1, int arg2) {
        field1323++;
        if (arg0 != -1) {
            return;
        }
        label90: while (true) {
            if (this.field1313 == null) {
                if (this.field1321) {
                    return;
                }
                this.method521((byte) -97, -1);
                if (this.field1313 == null) {
                    return;
                }
            }
            int var4 = class204.field2796 - this.field1320;
            if (var4 > 100 && this.field1313.field2864 > 0) {
                int var5 = this.field1313.field2853.length - this.field1313.field2864;
                while (var5 > this.field1322 && var4 > this.field1313.field2843[this.field1322]) {
                    var4 -= this.field1313.field2843[this.field1322];
                    this.field1322++;
                }
                if (var5 <= this.field1322) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field1313.field2853.length; var7++) {
                        var6 += this.field1313.field2843[var7];
                    }
                    var4 %= var6;
                }
                this.field1339 = this.field1322 + 1;
                if (this.field1313.field2853.length <= this.field1339) {
                    this.field1339 -= this.field1313.field2864;
                    if (this.field1339 < 0 || this.field1339 >= this.field1313.field2853.length) {
                        this.field1339 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (this.field1313.field2843[this.field1322] >= var4) {
                            this.field1327 = var4;
                            this.field1320 = class204.field2796 - var4;
                            return;
                        }
                        class126.method602(this.field1313, false, arg2, this.field1322, arg1, false, this.field1329);
                        var4 -= this.field1313.field2843[this.field1322];
                        this.field1322++;
                        if (this.field1322 >= this.field1313.field2853.length) {
                            this.field1322 -= this.field1313.field2864;
                            if (this.field1322 < 0 || this.field1322 >= this.field1313.field2853.length) {
                                this.field1313 = null;
                                continue label90;
                            }
                        }
                        this.field1339 = this.field1322 + 1;
                    } while (this.field1313.field2853.length > this.field1339);
                    this.field1339 -= this.field1313.field2864;
                } while (this.field1339 >= 0 && this.field1339 < this.field1313.field2853.length);
                this.field1339 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Loj;Lcu;IIIIIIZI)V")
    public class110(class280 arg0, class415 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        this.field1351 = arg6;
        this.field1346 = arg1.field5918;
        this.field1329 = (byte) arg4;
        this.field1341 = arg2;
        this.field1335 = arg7;
        this.field1326 = (byte) arg5;
        this.field1333 = arg3;
        this.field1342 = arg8;
        this.field1334 = arg0.method1474() && arg1.field5960 && !this.field1342;
        if (arg9 != -1) {
            this.field1321 = true;
        }
        this.method521((byte) -97, arg9);
    }
}
