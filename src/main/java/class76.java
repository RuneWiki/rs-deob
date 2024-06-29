import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class76 extends class75 {

    @OriginalMember(owner = "client!uk", name = "r", descriptor = "I")
    private int field1309 = -32768;

    @OriginalMember(owner = "client!uk", name = "p", descriptor = "I")
    private int field1307 = -1;

    @OriginalMember(owner = "client!uk", name = "v", descriptor = "Lcg;")
    private class34 field1313 = null;

    @OriginalMember(owner = "client!uk", name = "l", descriptor = "I")
    private int field1303 = -1;

    @OriginalMember(owner = "client!uk", name = "n", descriptor = "I")
    private int field1305;

    @OriginalMember(owner = "client!uk", name = "F", descriptor = "I")
    private int field1323;

    @OriginalMember(owner = "client!uk", name = "y", descriptor = "I")
    private int field1316;

    @OriginalMember(owner = "client!uk", name = "A", descriptor = "I")
    private int field1318;

    @OriginalMember(owner = "client!uk", name = "H", descriptor = "I")
    private int field1325;

    @OriginalMember(owner = "client!uk", name = "I", descriptor = "I")
    private int field1326;

    @OriginalMember(owner = "client!uk", name = "t", descriptor = "Lpa;")
    private class2 field1311;

    @OriginalMember(owner = "client!uk", name = "O", descriptor = "I")
    private int field1331;

    @OriginalMember(owner = "client!uk", name = "q", descriptor = "I")
    private int field1308;

    @OriginalMember(owner = "client!uk", name = "z", descriptor = "Lli;")
    public static class185 field1317 = class245.method1649("Kampfstufe: ", -86);

    @OriginalMember(owner = "client!uk", name = "o", descriptor = "Lli;")
    public static class185 field1306 = class245.method1649("Zugewiesener Speicher)3", -45);

    @OriginalMember(owner = "client!uk", name = "L", descriptor = "I")
    public static int field1328 = 0;

    @OriginalMember(owner = "client!uk", name = "j", descriptor = "I")
    public static int field1301;

    @OriginalMember(owner = "client!uk", name = "k", descriptor = "I")
    public static int field1302;

    @OriginalMember(owner = "client!uk", name = "m", descriptor = "I")
    public static int field1304;

    @OriginalMember(owner = "client!uk", name = "u", descriptor = "I")
    public static int field1312;

    @OriginalMember(owner = "client!uk", name = "w", descriptor = "I")
    public static int field1314;

    @OriginalMember(owner = "client!uk", name = "x", descriptor = "I")
    public static int field1315;

    @OriginalMember(owner = "client!uk", name = "B", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!uk", name = "D", descriptor = "I")
    public static int field1321;

    @OriginalMember(owner = "client!uk", name = "K", descriptor = "I")
    public static int field1327;

    @OriginalMember(owner = "client!uk", name = "M", descriptor = "I")
    public static int field1329;

    @OriginalMember(owner = "client!uk", name = "N", descriptor = "I")
    public static int field1330;

    @OriginalMember(owner = "client!uk", name = "P", descriptor = "I")
    public static int field1332;

    @OriginalMember(owner = "client!uk", name = "s", descriptor = "Lga;")
    private class16 field1310;

    @OriginalMember(owner = "client!uk", name = "C", descriptor = "Lhi;")
    public static class250 field1320;

    @OriginalMember(owner = "client!uk", name = "E", descriptor = "[I")
    public static int[] field1322;

    @OriginalMember(owner = "client!uk", name = "G", descriptor = "[I")
    public static int[] field1324;

    @OriginalMember(owner = "client!uk", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field1304++;
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(III)V")
    private final void method489(int arg0, int arg1, int arg2) {
        field1321++;
        if (arg1 != 128) {
            this.field1311 = null;
        }
        if (this.field1311 == null) {
            return;
        }
        int var4 = class211.field3851 - this.field1331;
        if (var4 > 100 && this.field1311.field47 > 0) {
            int var5 = this.field1311.field37.length - this.field1311.field47;
            while (this.field1308 < var5 && var4 > this.field1311.field51[this.field1308]) {
                var4 -= this.field1311.field51[this.field1308];
                this.field1308++;
            }
            if (this.field1308 >= var5) {
                int var6 = 0;
                for (int var7 = var5; var7 < this.field1311.field37.length; var7++) {
                    var6 += this.field1311.field51[var7];
                }
                var4 %= var6;
            }
        }
        while (var4 > this.field1311.field51[this.field1308]) {
            class31.method188(-1, this.field1311, arg2, false, this.field1308, arg0);
            var4 -= this.field1311.field51[this.field1308];
            this.field1308++;
            if (this.field1311.field37.length <= this.field1308) {
                this.field1308 -= this.field1311.field47;
                if (this.field1308 < 0 || this.field1311.field37.length <= this.field1308) {
                    this.field1311 = null;
                    break;
                }
            }
        }
        this.field1331 = class211.field3851 - var4;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)Lbb;")
    private final class75 method490(int arg0) {
        if (arg0 != -32768) {
            this.field1307 = 49;
        }
        field1327++;
        return this.method494(arg0 ^ 0xFFFF802B, false);
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIIIIIIJILga;)V")
    public final void method48(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class16 arg10) {
        class75 var13 = this.method490(-32768);
        field1315++;
        if (var13 != null) {
            var13.method48(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field1310);
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIII)V")
    public final void method46(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1329++;
        this.method489(arg3, 128, arg4);
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "()I")
    public final int method62() {
        field1319++;
        return this.field1309;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(II)I")
    public static final int method491(int arg0, int arg1) {
        if (arg0 != -26551) {
            method497((class185) null, (byte) -73);
        }
        field1302++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)V")
    public static final void method492(int arg0) {
        field1312++;
        int var1 = 36 / ((-arg0 - 29) / 57);
        if (class9.field181 != null) {
            class259.method1756(class9.field181, true);
            class9.field181 = null;
        }
    }

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "(I)V")
    public static void method493(int arg0) {
        field1324 = null;
        field1322 = null;
        if (arg0 != -2679) {
            method493(36);
        }
        field1306 = null;
        field1317 = null;
        field1320 = null;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IZ)Lbb;")
    private final class75 method494(int arg0, boolean arg1) {
        boolean var3 = class60.field1075 != class201.field3694;
        field1330++;
        class135 var4 = class184.method1294(this.field1318, -28916);
        if (var4.field2502 != null) {
            var4 = var4.method964((byte) 90);
        }
        if (var4 == null) {
            return null;
        }
        int var5 = this.field1323 & 0x3;
        int var6;
        int var7;
        if (var5 == 1 || var5 == 3) {
            var7 = var4.field2536;
            var6 = var4.field2500;
        } else {
            var6 = var4.field2536;
            var7 = var4.field2500;
        }
        int var8 = 66 / ((-arg0 - 90) / 36);
        int var9 = (var6 >> 1) + this.field1305;
        int var10 = (var6 + 1 >> 1) + this.field1305;
        int var11 = (var7 + 1 >> 1) + this.field1325;
        int var12 = (var7 >> 1) + this.field1325;
        this.method489(var9 * 128, 128, var12 * 128);
        boolean var13 = !var3 && var4.field2474 && (this.field1303 != var4.field2527 || this.field1308 != this.field1307 && class84.field1666 >= 2);
        if (arg1 && !var13) {
            return null;
        }
        int[][] var14 = class201.field3694[this.field1316];
        int var15 = var14[var10][var12] + var14[var9][var11] + var14[var9][var12] + var14[var10][var11] >> 2;
        int var16 = (this.field1305 << 7) + (var6 << 6);
        int var17 = (this.field1325 << 7) + (var7 << 6);
        boolean var18 = this.field1313 == null;
        int[][] var19 = null;
        if (var3) {
            var19 = class60.field1075[0];
        } else if (this.field1316 < 3) {
            var19 = class201.field3694[this.field1316 + 1];
        }
        class217 var20;
        if (this.field1311 == null) {
            var20 = var4.method972(this.field1326, var18 ? class235.field4217 : this.field1313, var17, var14, var13, (byte) -77, this.field1323, var16, var15, var19, false);
        } else {
            var20 = var4.method962(var19, var18 ? class235.field4217 : this.field1313, var14, var17, this.field1311, var13, this.field1323, var15, this.field1308, var16, 120, this.field1326);
        }
        return var20 == null ? null : var20.field3972;
    }

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "(I)Z")
    public static final boolean method495(int arg0) {
        field1301++;
        if (class234.field4202) {
            try {
                class108.field1955.method1315(-98, class124.field2238.field3022);
                return true;
            } catch (Throwable var1) {
            }
        }
        if (arg0 != 477) {
            field1317 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IILhi;B)[Lda;")
    public static final class101[] method496(int arg0, int arg1, class250 arg2, byte arg3) {
        int var4 = 112 / ((-arg3 - 68) / 40);
        field1332++;
        return class224.method1551(arg1, arg0, arg2, (byte) -94) ? class136.method979(255) : null;
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(IIIIIIIZLbb;)V")
    public class76(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class75 arg8) {
        this.field1305 = arg4;
        this.field1323 = arg2;
        this.field1316 = arg3;
        this.field1318 = arg0;
        this.field1325 = arg5;
        this.field1326 = arg1;
        if (arg6 != -1) {
            this.field1311 = class253.method1712(arg6, -120);
            this.field1331 = class211.field3851 - 1;
            this.field1308 = 0;
            if (this.field1311.field58 == 0 && arg8 != null && arg8 instanceof class76) {
                class76 var10 = (class76) arg8;
                if (this.field1311 == var10.field1311) {
                    this.field1308 = var10.field1308;
                    this.field1331 = var10.field1331;
                    return;
                }
            }
            if (arg7 && this.field1311.field47 != -1) {
                this.field1308 = (int) ((double) this.field1311.field37.length * Math.random());
                this.field1331 -= (int) (Math.random() * (double) this.field1311.field51[this.field1308]);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lli;B)I")
    public static final int method497(class185 arg0, byte arg1) {
        field1314++;
        if (class215.field3955 == null || arg0.method1311((byte) 49) == 0) {
            return -1;
        }
        if (arg1 != 0) {
            field1324 = null;
        }
        for (int var2 = 0; var2 < class215.field3955.field3133; var2++) {
            if (class215.field3955.field3136[var2].method1336((byte) -102, class118.field2161, class163.field3059).method1299(-109, arg0)) {
                return var2;
            }
        }
        return -1;
    }
}
