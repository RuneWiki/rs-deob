import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class169 extends class27 {

    @OriginalMember(owner = "client!wa", name = "K", descriptor = "I")
    private int field2424 = 8;

    @OriginalMember(owner = "client!wa", name = "ab", descriptor = "I")
    private int field2439 = 409;

    @OriginalMember(owner = "client!wa", name = "bb", descriptor = "I")
    private int field2440 = 0;

    @OriginalMember(owner = "client!wa", name = "Z", descriptor = "I")
    private int field2438 = 4;

    @OriginalMember(owner = "client!wa", name = "L", descriptor = "I")
    private int field2425 = 204;

    @OriginalMember(owner = "client!wa", name = "U", descriptor = "I")
    private int field2434 = 1024;

    @OriginalMember(owner = "client!wa", name = "T", descriptor = "I")
    private int field2433 = 81;

    @OriginalMember(owner = "client!wa", name = "lb", descriptor = "I")
    private int field2450 = 1024;

    @OriginalMember(owner = "client!wa", name = "M", descriptor = "I")
    public static int field2426 = 0;

    @OriginalMember(owner = "client!wa", name = "cb", descriptor = "[Lug;")
    public static class221[] field2441 = new class221[29];

    @OriginalMember(owner = "client!wa", name = "N", descriptor = "I")
    public static int field2427;

    @OriginalMember(owner = "client!wa", name = "O", descriptor = "I")
    public static int field2428;

    @OriginalMember(owner = "client!wa", name = "P", descriptor = "I")
    public static int field2429;

    @OriginalMember(owner = "client!wa", name = "Q", descriptor = "I")
    private int field2430;

    @OriginalMember(owner = "client!wa", name = "S", descriptor = "I")
    public static int field2432;

    @OriginalMember(owner = "client!wa", name = "W", descriptor = "I")
    public static int field2435;

    @OriginalMember(owner = "client!wa", name = "Y", descriptor = "I")
    public static int field2437;

    @OriginalMember(owner = "client!wa", name = "db", descriptor = "I")
    public static int field2442;

    @OriginalMember(owner = "client!wa", name = "fb", descriptor = "I")
    public static int field2444;

    @OriginalMember(owner = "client!wa", name = "gb", descriptor = "I")
    private int field2445;

    @OriginalMember(owner = "client!wa", name = "hb", descriptor = "I")
    public static int field2446;

    @OriginalMember(owner = "client!wa", name = "ib", descriptor = "I")
    public static int field2447;

    @OriginalMember(owner = "client!wa", name = "jb", descriptor = "I")
    public static int field2448;

    @OriginalMember(owner = "client!wa", name = "kb", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!wa", name = "mb", descriptor = "I")
    private int field2451;

    @OriginalMember(owner = "client!wa", name = "R", descriptor = "[I")
    private int[] field2431;

    @OriginalMember(owner = "client!wa", name = "X", descriptor = "[[I")
    private int[][] field2436;

    @OriginalMember(owner = "client!wa", name = "eb", descriptor = "[[I")
    private int[][] field2443;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(III)V", line = 7)
    public static final void method1191(int arg0, int arg1, int arg2) {
        class36.field536++;
        class107.field1533.method1915(true, arg1);
        field2449++;
        class107.field1533.method1366(arg2, (byte) -121);
        class107.field1533.method1368(arg1 + 6029133, arg0);
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "()V", line = 354)
    public class169() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILsb;I)V", line = 29)
    public final void method23(int arg0, class190 arg1, int arg2) {
        if (arg0 != -5836) {
            this.field2440 = -50;
        }
        if (arg2 == 0) {
            this.field2438 = arg1.method1319(arg0 ^ 0xFFFFE9CB);
        } else if (arg2 == 1) {
            this.field2424 = arg1.method1319(255);
        } else if (arg2 == 2) {
            this.field2439 = arg1.method1317((byte) 101);
        } else if (arg2 == 3) {
            this.field2425 = arg1.method1317((byte) 76);
        } else if (arg2 == 4) {
            this.field2450 = arg1.method1317((byte) 39);
        } else if (arg2 == 5) {
            this.field2440 = arg1.method1317((byte) 48);
        } else if (arg2 == 6) {
            this.field2433 = arg1.method1317((byte) 62);
        } else if (arg2 == 7) {
            this.field2434 = arg1.method1317((byte) 113);
        }
        field2442++;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IBIII)V", line = 116)
    public static final void method1192(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg1 != -68) {
            field2432 = 21;
        }
        if (class343.field5315 == 1) {
            class285.field4299[class48.field719 / 100].method642(class145.field2095 - 8, class116.field1648 + -8);
        }
        if (class343.field5315 == 2) {
            class285.field4299[class48.field719 / 100 + 4].method642(class145.field2095 - 8, class116.field1648 + -8);
        }
        class190.method1315(1);
        field2428++;
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(II)Ljava/lang/String;", line = 139)
    public static final String method1193(int arg0, int arg1) {
        field2427++;
        String var2 = Integer.toString(arg1);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class347.field5357 + " (" + var2 + ")</col>";
        } else if (arg0 == 1) {
            return var2.length() > 6 ? " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class23.field343 + " (" + var2 + ")</col>" : " <col=ffff00>" + var2 + "</col>";
        } else {
            return (String) null;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IB)[I", line = 170)
    public final int[] method18(int arg0, byte arg1) {
        if (arg1 != -62) {
            this.field2434 = 11;
        }
        int[] var3 = this.field375.method2087(arg1 - 44, arg0);
        if (this.field375.field4382) {
            int var4 = 0;
            int var5;
            for (var5 = class215.field3175[arg0] + this.field2440; var5 < 0; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (this.field2424 > var4 && var5 >= this.field2431[var4]) {
                var4++;
            }
            int var6 = var4 - 1;
            boolean var7 = (var4 & 0x1) == 0;
            int var8 = this.field2431[var4];
            int var9 = this.field2431[var4 - 1];
            if (var5 > (this.field2451 + var9) && (var8 - this.field2451) > var5) {
                for (int var10 = 0; var10 < class209.field3053; var10++) {
                    int var11 = var7 ? this.field2450 : -this.field2450;
                    int var12;
                    for (var12 = (this.field2430 * var11 >> 12) + class251.field3721[var10]; var12 < 0; var12 += 4096) {
                    }
                    int var13 = 0;
                    while (var12 > 4096) {
                        var12 -= 4096;
                    }
                    while (this.field2438 > var13 && this.field2436[var6][var13] <= var12) {
                        var13++;
                    }
                    int var14 = this.field2436[var6][var13];
                    int var15 = var13 - 1;
                    int var16 = this.field2436[var6][var15];
                    if (var12 > (this.field2451 + var16) && (var14 - this.field2451) > var12) {
                        var3[var10] = this.field2443[var6][var15];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class84.method690(var3, 0, class209.field3053, 0);
            }
        }
        field2435++;
        return var3;
    }

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "(I)V", line = 272)
    private final void method1194(int arg0) {
        field2448++;
        Random var2 = new Random((long) this.field2424);
        this.field2430 = 4096 / this.field2438;
        this.field2451 = this.field2433 / 2;
        if (arg0 >= -127) {
            this.method22(-23);
        }
        int var3 = this.field2430 / 2;
        this.field2445 = 4096 / this.field2424;
        this.field2436 = new int[this.field2424][this.field2438 + 1];
        this.field2431 = new int[this.field2424 + 1];
        this.field2443 = new int[this.field2424][this.field2438];
        this.field2431[0] = 0;
        int var4 = this.field2445 / 2;
        for (int var5 = 0; var5 < this.field2424; var5++) {
            if (var5 > 0) {
                int var6 = this.field2445;
                int var7 = (class127.method943((byte) -118, var2, 4096) - 2048) * this.field2425 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field2431[var5] = this.field2431[var5 - 1] + var8;
            }
            this.field2436[var5][0] = 0;
            for (int var9 = 0; var9 < this.field2438; var9++) {
                if (var9 > 0) {
                    int var10 = this.field2430;
                    int var11 = (class127.method943((byte) -99, var2, 4096) - 2048) * this.field2439 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field2436[var5][var9] = this.field2436[var5][var9 - 1] + var12;
                }
                this.field2443[var5][var9] = this.field2434 <= 0 ? 4096 : 4096 - class127.method943((byte) -97, var2, this.field2434);
            }
            this.field2436[var5][this.field2438] = 4096;
        }
        this.field2431[this.field2424] = 4096;
    }

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "(I)V", line = 361)
    public final void method22(int arg0) {
        this.method1194(-128);
        field2444++;
        if (arg0 > -63) {
            this.field2451 = -92;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lsb;II)Led;", line = 388)
    public static final class281 method1195(class190 arg0, int arg1, int arg2) {
        field2437++;
        if (arg1 > -37) {
            method1196(-18);
        }
        class281 var3 = new class281(arg2, arg0.method1329((byte) 59), arg0.method1329((byte) 59), arg0.method1371(-4), arg0.method1371(-4), arg0.method1319(255) == 1, arg0.method1319(255));
        int var4 = arg0.method1319(255);
        for (int var5 = 0; var5 < var4; var5++) {
            var3.field4266.method106(new class99(arg0.method1319(255), arg0.method1319(255), arg0.method1317((byte) 45), arg0.method1317((byte) 31), arg0.method1317((byte) 117), arg0.method1317((byte) 67), arg0.method1317((byte) 47), arg0.method1317((byte) 24), arg0.method1317((byte) 54), arg0.method1317((byte) 20)), -128);
        }
        var3.method2044((byte) -114);
        return var3;
    }

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "(I)V", line = 416)
    public static void method1196(int arg0) {
        if (arg0 != 211) {
            field2432 = 86;
        }
        field2441 = null;
    }
}
