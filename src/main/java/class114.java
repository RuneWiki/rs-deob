import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public class class114 extends class56 {

    @OriginalMember(owner = "client!jt", name = "I", descriptor = "I")
    private int field1435 = 204;

    @OriginalMember(owner = "client!jt", name = "T", descriptor = "I")
    private int field1446 = 0;

    @OriginalMember(owner = "client!jt", name = "G", descriptor = "I")
    private int field1433 = 81;

    @OriginalMember(owner = "client!jt", name = "X", descriptor = "I")
    private int field1450 = 409;

    @OriginalMember(owner = "client!jt", name = "N", descriptor = "I")
    private int field1440 = 4;

    @OriginalMember(owner = "client!jt", name = "W", descriptor = "I")
    private int field1449 = 8;

    @OriginalMember(owner = "client!jt", name = "V", descriptor = "I")
    private int field1448 = 1024;

    @OriginalMember(owner = "client!jt", name = "Y", descriptor = "I")
    private int field1451 = 1024;

    @OriginalMember(owner = "client!jt", name = "Z", descriptor = "I")
    public static int field1452 = 0;

    @OriginalMember(owner = "client!jt", name = "E", descriptor = "Llja;")
    public static class744 field1431 = new class744(56, -1);

    @OriginalMember(owner = "client!jt", name = "P", descriptor = "F")
    public static float field1442;

    @OriginalMember(owner = "client!jt", name = "F", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!jt", name = "K", descriptor = "I")
    public static int field1437;

    @OriginalMember(owner = "client!jt", name = "M", descriptor = "I")
    private int field1439;

    @OriginalMember(owner = "client!jt", name = "O", descriptor = "I")
    public static int field1441;

    @OriginalMember(owner = "client!jt", name = "R", descriptor = "I")
    public static int field1444;

    @OriginalMember(owner = "client!jt", name = "S", descriptor = "I")
    private int field1445;

    @OriginalMember(owner = "client!jt", name = "U", descriptor = "I")
    public static int field1447;

    @OriginalMember(owner = "client!jt", name = "ab", descriptor = "I")
    private int field1453;

    @OriginalMember(owner = "client!jt", name = "H", descriptor = "J")
    public static long field1434;

    @OriginalMember(owner = "client!jt", name = "J", descriptor = "[I")
    private int[] field1436;

    @OriginalMember(owner = "client!jt", name = "L", descriptor = "[[I")
    private int[][] field1438;

    @OriginalMember(owner = "client!jt", name = "Q", descriptor = "[[I")
    private int[][] field1443;

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(B)V")
    public final void method493(byte arg0) {
        int var2 = -89 % ((arg0 - 37) / 62);
        this.method906(true);
        ++field1437;
    }

    @OriginalMember(owner = "client!jt", name = "<init>", descriptor = "()V")
    public class114() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jt", name = "c", descriptor = "(I)V")
    public static void method904(int arg0) {
        field1431 = null;
        if (arg0 < 8) {
            field1431 = null;
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(II)[I")
    public final int[] method145(int arg0, int arg1) {
        ++field1441;
        if (arg0 != 0) {
            this.method144((byte) 84, -106, (class403) null);
        }
        int[] var3 = super.field752.method1308(false, arg1);
        if (super.field752.field2441) {
            int var4 = 0;
            int var5;
            for (var5 = class349.field4354[arg1] + this.field1446; var5 < 0; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (this.field1449 > var4 && this.field1436[var4] <= var5) {
                ++var4;
            }
            int var6 = var4 + -1;
            boolean var7 = (var4 & 1) == 0;
            int var8 = this.field1436[var4];
            int var9 = this.field1436[var4 + -1];
            if (~(this.field1445 + var9) > ~var5 && ~(-this.field1445 + var8) < ~var5) {
                for (int var10 = 0; ~class642.field8759 < ~var10; ++var10) {
                    int var11 = 0;
                    int var12 = !var7 ? -this.field1451 : this.field1451;
                    int var13;
                    for (var13 = (this.field1453 * var12 >> 12) + class648.field8837[var10]; var13 < 0; var13 += 4096) {
                    }
                    while (var13 > 4096) {
                        var13 -= 4096;
                    }
                    while (~var11 > ~this.field1440 && ~this.field1443[var6][var11] >= ~var13) {
                        ++var11;
                    }
                    int var14 = var11 + -1;
                    int var15 = this.field1443[var6][var14];
                    int var16 = this.field1443[var6][var11];
                    if (var15 - -this.field1445 < var13 && ~(-this.field1445 + var16) < ~var13) {
                        var3[var10] = this.field1438[var6][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class211.method1333(var3, 0, class642.field8759, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(IIIFIZIII)[[I")
    public static final int[][] method905(int arg0, int arg1, int arg2, float arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8) {
        ++field1432;
        int[][] var9 = new int[arg1][arg6];
        class337 var10 = new class337();
        var10.field4162 = arg2;
        var10.field4173 = arg0;
        var10.field4170 = (int) (arg3 * 4096.0F);
        var10.field4159 = arg4;
        var10.field4167 = arg5;
        var10.method493((byte) 110);
        class216.method1349(false, arg1, arg6);
        if (arg7 != 6505) {
            return null;
        } else {
            for (int var11 = 0; ~arg1 < ~var11; ++var11) {
                var10.method1996(var11, (byte) 123, var9[var11]);
            }
            return var9;
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(BILes;)V")
    public final void method144(byte arg0, int arg1, class403 arg2) {
        if (arg0 > -44) {
            field1434 = 32L;
        }
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (~arg1 != -5) {
                            if (~arg1 != -6) {
                                if (arg1 != 6) {
                                    if (~arg1 == -8) {
                                        this.field1448 = arg2.method2390((byte) -127);
                                    }
                                } else {
                                    this.field1433 = arg2.method2390((byte) -97);
                                }
                            } else {
                                this.field1446 = arg2.method2390((byte) -124);
                            }
                        } else {
                            this.field1451 = arg2.method2390((byte) 55);
                        }
                    } else {
                        this.field1435 = arg2.method2390((byte) 72);
                    }
                } else {
                    this.field1450 = arg2.method2390((byte) 22);
                }
            } else {
                this.field1449 = arg2.method2396((byte) 53);
            }
        } else {
            this.field1440 = arg2.method2396((byte) -101);
        }
        ++field1444;
    }

    @OriginalMember(owner = "client!jt", name = "d", descriptor = "(Z)V")
    private final void method906(boolean arg0) {
        ++field1447;
        Random var2 = new Random((long) this.field1449);
        if (!arg0) {
            this.field1436 = null;
        }
        this.field1453 = 4096 / this.field1440;
        this.field1439 = 4096 / this.field1449;
        this.field1445 = this.field1433 / 2;
        int var3 = this.field1453 / 2;
        this.field1436 = new int[this.field1449 + 1];
        int var4 = this.field1439 / 2;
        this.field1438 = new int[this.field1449][this.field1440];
        this.field1443 = new int[this.field1449][this.field1440 + 1];
        this.field1436[0] = 0;
        for (int var5 = 0; var5 < this.field1449; ++var5) {
            if (~var5 < -1) {
                int var6 = this.field1439;
                int var7 = (class93.method822(var2, -1, 4096) + -2048) * this.field1435 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field1436[var5] = this.field1436[var5 + -1] + var8;
            }
            this.field1443[var5][0] = 0;
            for (int var9 = 0; ~var9 > ~this.field1440; ++var9) {
                if (var9 > 0) {
                    int var10 = this.field1453;
                    int var11 = (class93.method822(var2, -1, 4096) + -2048) * this.field1450 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field1443[var5][var9] = this.field1443[var5][var9 + -1] + var12;
                }
                this.field1438[var5][var9] = ~this.field1448 < -1 ? -class93.method822(var2, -1, this.field1448) + 4096 : 4096;
            }
            this.field1443[var5][this.field1440] = 4096;
        }
        this.field1436[this.field1449] = 4096;
    }
}
