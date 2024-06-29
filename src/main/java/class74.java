import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class74 extends class226 {

    @OriginalMember(owner = "client!wd", name = "u", descriptor = "I")
    private int field1361 = -32768;

    @OriginalMember(owner = "client!wd", name = "C", descriptor = "Z")
    private boolean field1369 = false;

    @OriginalMember(owner = "client!wd", name = "A", descriptor = "I")
    private int field1367 = 0;

    @OriginalMember(owner = "client!wd", name = "ib", descriptor = "I")
    private int field1401 = 0;

    @OriginalMember(owner = "client!wd", name = "t", descriptor = "I")
    private int field1360;

    @OriginalMember(owner = "client!wd", name = "P", descriptor = "I")
    private int field1382;

    @OriginalMember(owner = "client!wd", name = "N", descriptor = "I")
    private int field1380;

    @OriginalMember(owner = "client!wd", name = "Y", descriptor = "I")
    public int field1391;

    @OriginalMember(owner = "client!wd", name = "B", descriptor = "I")
    private int field1368;

    @OriginalMember(owner = "client!wd", name = "X", descriptor = "I")
    public int field1390;

    @OriginalMember(owner = "client!wd", name = "D", descriptor = "I")
    public int field1370;

    @OriginalMember(owner = "client!wd", name = "y", descriptor = "I")
    public int field1365;

    @OriginalMember(owner = "client!wd", name = "s", descriptor = "I")
    private int field1359;

    @OriginalMember(owner = "client!wd", name = "w", descriptor = "I")
    public int field1363;

    @OriginalMember(owner = "client!wd", name = "W", descriptor = "I")
    private int field1389;

    @OriginalMember(owner = "client!wd", name = "V", descriptor = "Laj;")
    private class1 field1388;

    @OriginalMember(owner = "client!wd", name = "Z", descriptor = "Ltb;")
    public static class210 field1392 = new class210(64);

    @OriginalMember(owner = "client!wd", name = "bb", descriptor = "Lmh;")
    private static class128 field1394 = class22.method156(125, "Examine");

    @OriginalMember(owner = "client!wd", name = "cb", descriptor = "Lmh;")
    public static class128 field1395 = field1394;

    @OriginalMember(owner = "client!wd", name = "hb", descriptor = "Z")
    public static boolean field1400 = false;

    @OriginalMember(owner = "client!wd", name = "x", descriptor = "D")
    private double field1364;

    @OriginalMember(owner = "client!wd", name = "z", descriptor = "D")
    private double field1366;

    @OriginalMember(owner = "client!wd", name = "G", descriptor = "D")
    public double field1373;

    @OriginalMember(owner = "client!wd", name = "H", descriptor = "D")
    private double field1374;

    @OriginalMember(owner = "client!wd", name = "J", descriptor = "D")
    private double field1376;

    @OriginalMember(owner = "client!wd", name = "S", descriptor = "D")
    public double field1385;

    @OriginalMember(owner = "client!wd", name = "T", descriptor = "D")
    private double field1386;

    @OriginalMember(owner = "client!wd", name = "db", descriptor = "D")
    public double field1396;

    @OriginalMember(owner = "client!wd", name = "v", descriptor = "I")
    public static int field1362;

    @OriginalMember(owner = "client!wd", name = "E", descriptor = "I")
    public static int field1371;

    @OriginalMember(owner = "client!wd", name = "F", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!wd", name = "I", descriptor = "I")
    private int field1375;

    @OriginalMember(owner = "client!wd", name = "K", descriptor = "I")
    public static int field1377;

    @OriginalMember(owner = "client!wd", name = "L", descriptor = "I")
    public static int field1378;

    @OriginalMember(owner = "client!wd", name = "M", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!wd", name = "O", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!wd", name = "Q", descriptor = "I")
    public int field1383;

    @OriginalMember(owner = "client!wd", name = "R", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!wd", name = "U", descriptor = "I")
    public static int field1387;

    @OriginalMember(owner = "client!wd", name = "ab", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!wd", name = "eb", descriptor = "I")
    public static int field1397;

    @OriginalMember(owner = "client!wd", name = "fb", descriptor = "Luc;")
    public static class180 field1398;

    @OriginalMember(owner = "client!wd", name = "gb", descriptor = "Lni;")
    public static class23 field1399;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(IIIII)V", line = 6)
    public final void method484(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1378++;
        if (!this.field1369) {
            double var6 = (double) (arg2 - this.field1389);
            double var8 = (double) (arg1 - this.field1368);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field1385 = (double) this.field1360 * var8 / var10 + (double) this.field1368;
            this.field1373 = (double) this.field1360 * var6 / var10 + (double) this.field1389;
            this.field1396 = (double) this.field1380;
        }
        double var12 = (double) (this.field1363 + arg3 - arg4);
        this.field1376 = ((double) arg1 - this.field1385) / var12;
        this.field1386 = ((double) arg2 - this.field1373) / var12;
        this.field1364 = Math.sqrt(this.field1386 * this.field1386 + this.field1376 * this.field1376);
        if (!this.field1369) {
            this.field1374 = -this.field1364 * Math.tan((double) this.field1382 * 0.02454369D);
        }
        this.field1366 = ((double) arg0 - this.field1396 - (this.field1374 * var12)) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)V", line = 44)
    public static final void method485(int arg0, int arg1) {
        field1362++;
        if (!class133.method890(false, arg1)) {
            return;
        }
        if (arg0 != 128) {
            method489(-38);
        }
        class10[] var2 = class200.field3508[arg1];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class10 var4 = var2[var3];
            if (var4 != null) {
                var4.field315 = 0;
                var4.field354 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(IIIIIIIIIII)V", line = 319)
    public class74(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1360 = arg8;
        this.field1382 = arg7;
        this.field1380 = arg4;
        this.field1369 = false;
        this.field1391 = arg5;
        this.field1368 = arg2;
        this.field1390 = arg10;
        this.field1370 = arg1;
        this.field1365 = arg9;
        this.field1359 = arg0;
        this.field1363 = arg6;
        this.field1389 = arg3;
        int var12 = class169.method1134(2, this.field1359).field2303;
        if (var12 == -1) {
            this.field1388 = null;
        } else {
            this.field1388 = class167.method1091(-78, var12);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I[[IIIII)I", line = 92)
    public static final int method486(int arg0, int[][] arg1, int arg2, int arg3, int arg4, int arg5) {
        field1371++;
        if (arg2 < 21) {
            method488(110, -68, 69);
        }
        int var6 = (128 - arg0) * arg1[arg3][arg4 + 1] + arg1[arg3 + 1][arg4 + 1] * arg0 >> 7;
        int var7 = (128 - arg0) * arg1[arg3][arg4] + arg1[arg3 + 1][arg4] * arg0 >> 7;
        return (128 - arg5) * var7 + arg5 * var6 >> 7;
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(I)V", line = 109)
    public static final void method487(int arg0) {
        field1379++;
        if (class94.field1591 != null) {
            class259 var1 = class94.field1591;
            synchronized (class94.field1591) {
                class94.field1591 = null;
            }
        }
        if (arg0 != 2047) {
            method488(-82, 99, 30);
        }
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(III)Z", line = 128)
    public static final boolean method488(int arg0, int arg1, int arg2) {
        int var3 = class289.field4943[arg0][arg1][arg2];
        if (-class99.field1712 == var3) {
            return false;
        } else if (class99.field1712 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class62.method409(var4 + 1, class250.field4334[arg0][arg1][arg2], var5 + 1) && class62.method409(var4 + 128 - 1, class250.field4334[arg0][arg1 + 1][arg2], var5 + 1) && class62.method409(var4 + 128 - 1, class250.field4334[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class62.method409(var4 + 1, class250.field4334[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class289.field4943[arg0][arg1][arg2] = class99.field1712;
                return true;
            } else {
                class289.field4943[arg0][arg1][arg2] = -class99.field1712;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "()I", line = 153)
    public final int method204() {
        field1393++;
        return this.field1361;
    }

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "(I)V", line = 172)
    public static void method489(int arg0) {
        field1395 = null;
        field1394 = null;
        field1398 = null;
        field1399 = null;
        if (arg0 != -15610) {
            field1397 = 68;
        }
        field1392 = null;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(II)V", line = 195)
    public final void method490(int arg0, int arg1) {
        this.field1373 += (double) arg0 * this.field1386;
        this.field1369 = true;
        field1387++;
        this.field1385 += (double) arg0 * this.field1376;
        this.field1396 += this.field1366 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1374;
        this.field1374 += (double) arg0 * this.field1366;
        this.field1383 = (int) (Math.atan2(this.field1376, this.field1386) * 325.949D) + 1024 & 0x7FF;
        if (arg1 != -5983) {
            this.field1369 = false;
        }
        this.field1375 = (int) (Math.atan2(this.field1374, this.field1364) * 325.949D) & 0x7FF;
        if (this.field1388 == null) {
            return;
        }
        this.field1367 += arg0;
        while (true) {
            do {
                do {
                    if (this.field1388.field7[this.field1401] >= this.field1367) {
                        return;
                    }
                    this.field1367 -= this.field1388.field7[this.field1401];
                    this.field1401++;
                } while (this.field1401 < this.field1388.field8.length);
                this.field1401 -= this.field1388.field26;
            } while (this.field1401 >= 0 && this.field1388.field8.length > this.field1401);
            this.field1401 = 0;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIIIIIJ)V", line = 236)
    public final void method201(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        class60 var11 = this.method491(125);
        field1377++;
        if (var11 != null) {
            var11.method201(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field1361 = var11.method204();
        }
    }

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "(I)Lja;", line = 266)
    private final class60 method491(int arg0) {
        field1384++;
        int var2 = 72 / ((-arg0 - 16) / 47);
        class133 var3 = class169.method1134(2, this.field1359);
        class60 var4 = var3.method887(this.field1401, (byte) 118);
        if (var4 == null) {
            return null;
        } else {
            var4.method208(this.field1375);
            return var4;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILem;)Z", line = 284)
    public static final boolean method492(int arg0, class10 arg1) {
        if (arg0 > -22) {
            field1392 = (class210) null;
        }
        field1372++;
        if (arg1.field222 == 205) {
            class298.field5078 = 250;
            return true;
        } else {
            return false;
        }
    }
}
