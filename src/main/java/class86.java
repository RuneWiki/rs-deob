import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class86 extends class8 {

    @OriginalMember(owner = "client!ai", name = "N", descriptor = "I")
    private int field1363 = 1024;

    @OriginalMember(owner = "client!ai", name = "S", descriptor = "I")
    private int field1368 = 0;

    @OriginalMember(owner = "client!ai", name = "O", descriptor = "I")
    private int field1364 = 409;

    @OriginalMember(owner = "client!ai", name = "K", descriptor = "I")
    private int field1360 = 1024;

    @OriginalMember(owner = "client!ai", name = "M", descriptor = "I")
    private int field1362 = 204;

    @OriginalMember(owner = "client!ai", name = "Y", descriptor = "I")
    private int field1374 = 81;

    @OriginalMember(owner = "client!ai", name = "R", descriptor = "I")
    private int field1367 = 8;

    @OriginalMember(owner = "client!ai", name = "bb", descriptor = "I")
    private int field1377 = 4;

    @OriginalMember(owner = "client!ai", name = "X", descriptor = "I")
    public static int field1373 = 0;

    @OriginalMember(owner = "client!ai", name = "db", descriptor = "[Ljava/lang/String;")
    public static String[] field1379 = new String[200];

    @OriginalMember(owner = "client!ai", name = "I", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!ai", name = "L", descriptor = "I")
    private int field1361;

    @OriginalMember(owner = "client!ai", name = "P", descriptor = "I")
    private int field1365;

    @OriginalMember(owner = "client!ai", name = "Q", descriptor = "I")
    public static int field1366;

    @OriginalMember(owner = "client!ai", name = "T", descriptor = "I")
    public static int field1369;

    @OriginalMember(owner = "client!ai", name = "U", descriptor = "I")
    public static int field1370;

    @OriginalMember(owner = "client!ai", name = "W", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!ai", name = "Z", descriptor = "I")
    public static int field1375;

    @OriginalMember(owner = "client!ai", name = "cb", descriptor = "I")
    public static int field1378;

    @OriginalMember(owner = "client!ai", name = "eb", descriptor = "I")
    private int field1380;

    @OriginalMember(owner = "client!ai", name = "ab", descriptor = "[I")
    private int[] field1376;

    @OriginalMember(owner = "client!ai", name = "J", descriptor = "[[I")
    private int[][] field1359;

    @OriginalMember(owner = "client!ai", name = "V", descriptor = "[[I")
    private int[][] field1371;

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "(B)V")
    public static void method626(byte arg0) {
        if (arg0 != 85) {
            method627((byte) -66);
        }
        field1379 = null;
    }

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "(B)V")
    public static final void method627(byte arg0) {
        ++field1358;
        if (class288.field4560) {
            class36 var1 = class230.method1612(1, class281.field4452, class253.field4032);
            if (arg0 > -8) {
                method626((byte) 116);
            }
            if (var1 != null && var1.field657 != null) {
                class213 var2 = new class213();
                var2.field3477 = var1.field657;
                var2.field3480 = var1;
                class89.method645(-121, var2);
            }
            class67.field1111 = -1;
            class288.field4560 = false;
            class280.method1886(var1, 32);
        }
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(Z)V")
    public final void method66(boolean arg0) {
        ++field1370;
        this.method629(arg0);
        if (arg0) {
            this.method64((byte) 121, (class221) null, 86);
        }
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(II)[I")
    public final int[] method44(int arg0, int arg1) {
        int[] var3 = super.field110.method1585(0, arg1);
        if (arg0 != 3) {
            return null;
        } else {
            if (super.field110.field3734) {
                int var4 = class182.field2864[arg1] + this.field1368;
                int var5 = 0;
                while (var4 < 0) {
                    var4 += 4096;
                }
                while (~var4 < -4097) {
                    var4 -= 4096;
                }
                while (var5 < this.field1367 && ~this.field1376[var5] >= ~var4) {
                    ++var5;
                }
                int var6 = var5 + -1;
                boolean var7 = (1 & var5) == 0;
                int var8 = this.field1376[var5];
                int var9 = this.field1376[var5 - 1];
                if (~var4 < ~(this.field1365 + var9) && ~(var8 - this.field1365) < ~var4) {
                    for (int var10 = 0; ~class231.field3798 < ~var10; ++var10) {
                        int var11 = var7 ? this.field1363 : -this.field1363;
                        int var12;
                        for (var12 = (this.field1361 * var11 >> 12) + class176.field2776[var10]; var12 < 0; var12 += 4096) {
                        }
                        int var13 = 0;
                        while (~var12 < -4097) {
                            var12 -= 4096;
                        }
                        while (var13 < this.field1377 && ~this.field1359[var6][var13] >= ~var12) {
                            ++var13;
                        }
                        int var14 = this.field1359[var6][var13];
                        int var15 = var13 + -1;
                        int var16 = this.field1359[var6][var15];
                        if (~(this.field1365 + var16) > ~var12 && ~(var14 - this.field1365) < ~var12) {
                            var3[var10] = this.field1371[var6][var15];
                        } else {
                            var3[var10] = 0;
                        }
                    }
                } else {
                    class140.method970(var3, 0, class231.field3798, 0);
                }
            }
            ++field1366;
            return var3;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(BLog;I)V")
    public final void method64(byte arg0, class221 arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (arg2 != 3) {
                        if (arg2 != 4) {
                            if (arg2 != 5) {
                                if (~arg2 != -7) {
                                    if (~arg2 == -8) {
                                        this.field1360 = arg1.method1521((byte) 113);
                                    }
                                } else {
                                    this.field1374 = arg1.method1521((byte) 113);
                                }
                            } else {
                                this.field1368 = arg1.method1521((byte) 113);
                            }
                        } else {
                            this.field1363 = arg1.method1521((byte) 113);
                        }
                    } else {
                        this.field1362 = arg1.method1521((byte) 113);
                    }
                } else {
                    this.field1364 = arg1.method1521((byte) 113);
                }
            } else {
                this.field1367 = arg1.method1517((byte) -96);
            }
        } else {
            this.field1377 = arg1.method1517((byte) -96);
        }
        if (arg0 <= 62) {
            this.method629(true);
        }
        ++field1378;
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "()V")
    public class86() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILqh;)V")
    public static final void method628(int arg0, class201 arg1) {
        if (arg0 != 29387) {
            method626((byte) -5);
        }
        class227.field3758 = arg1;
        ++field1369;
    }

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "(Z)V")
    private final void method629(boolean arg0) {
        ++field1372;
        Random var2 = new Random((long) this.field1367);
        this.field1365 = this.field1374 / 2;
        this.field1380 = 4096 / this.field1367;
        this.field1376 = new int[this.field1367 - -1];
        if (arg0) {
            field1375 = 30;
        }
        int var3 = this.field1380 / 2;
        this.field1376[0] = 0;
        this.field1361 = 4096 / this.field1377;
        this.field1371 = new int[this.field1367][this.field1377];
        this.field1359 = new int[this.field1367][this.field1377 - -1];
        int var4 = this.field1361 / 2;
        for (int var5 = 0; ~var5 > ~this.field1367; ++var5) {
            if (var5 > 0) {
                int var6 = this.field1380;
                int var7 = (-2048 + class142.method982(-396321952, 4096, var2)) * this.field1362 >> 12;
                int var8 = (var3 * var7 >> 12) + var6;
                this.field1376[var5] = this.field1376[var5 + -1] + var8;
            }
            this.field1359[var5][0] = 0;
            for (int var9 = 0; ~var9 > ~this.field1377; ++var9) {
                if (var9 > 0) {
                    int var10 = this.field1361;
                    int var11 = (class142.method982(-396321952, 4096, var2) + -2048) * this.field1364 >> 12;
                    int var12 = (var4 * var11 >> 12) + var10;
                    this.field1359[var5][var9] = this.field1359[var5][var9 - 1] + var12;
                }
                this.field1371[var5][var9] = this.field1360 > 0 ? 4096 + -class142.method982(-396321952, this.field1360, var2) : 4096;
            }
            this.field1359[var5][this.field1377] = 4096;
        }
        this.field1376[this.field1367] = 4096;
    }
}
