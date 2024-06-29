import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class735 extends class518 {

    @OriginalMember(owner = "client!la", name = "K", descriptor = "I")
    private int field10465 = 8;

    @OriginalMember(owner = "client!la", name = "S", descriptor = "I")
    private int field10474 = 409;

    @OriginalMember(owner = "client!la", name = "M", descriptor = "I")
    private int field10476 = 1024;

    @OriginalMember(owner = "client!la", name = "O", descriptor = "I")
    private int field10478 = 0;

    @OriginalMember(owner = "client!la", name = "U", descriptor = "I")
    private int field10462 = 4;

    @OriginalMember(owner = "client!la", name = "R", descriptor = "I")
    private int field10479 = 81;

    @OriginalMember(owner = "client!la", name = "C", descriptor = "I")
    private int field10466 = 1024;

    @OriginalMember(owner = "client!la", name = "G", descriptor = "I")
    private int field10481 = 204;

    @OriginalMember(owner = "client!la", name = "W", descriptor = "[Ljava/lang/String;")
    private static final String[] field10483 = new String[] { method5343(method5342(",wpxO")), method5343(method5342(";8p\u0011\u001a")), method5343(method5342(",wp|O")), method5343(method5342(".c2S")), method5343(method5342(",wpzO")), method5343(method5342(",wp{O")), method5343(method5342(",wpuO")), method5343(method5342(",wp}O")) };

    @OriginalMember(owner = "client!la", name = "D", descriptor = "[C")
    public static char[] field10464 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!la", name = "F", descriptor = "I")
    public static int field10469;

    @OriginalMember(owner = "client!la", name = "E", descriptor = "I")
    private int field10470;

    @OriginalMember(owner = "client!la", name = "Q", descriptor = "I")
    public static int field10471;

    @OriginalMember(owner = "client!la", name = "T", descriptor = "I")
    public static int field10472;

    @OriginalMember(owner = "client!la", name = "I", descriptor = "I")
    private int field10473;

    @OriginalMember(owner = "client!la", name = "J", descriptor = "I")
    private int field10475;

    @OriginalMember(owner = "client!la", name = "B", descriptor = "I")
    public static int field10477;

    @OriginalMember(owner = "client!la", name = "H", descriptor = "I")
    public static int field10480;

    @OriginalMember(owner = "client!la", name = "P", descriptor = "I")
    public static int field10482;

    @OriginalMember(owner = "client!la", name = "N", descriptor = "[I")
    private int[] field10467;

    @OriginalMember(owner = "client!la", name = "L", descriptor = "[[I")
    private int[][] field10463;

    @OriginalMember(owner = "client!la", name = "V", descriptor = "[[I")
    private int[][] field10468;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "(B)V", line = 10)
    private final void method5339(byte arg0) {
        try {
            ++field10469;
            Random var2 = new Random((long) this.field10465);
            this.field10473 = 4096 / this.field10465;
            this.field10470 = 4096 / this.field10462;
            this.field10475 = this.field10479 / 2;
            int var3 = this.field10470 / 2;
            this.field10467 = new int[this.field10465 + 1];
            this.field10468 = new int[this.field10465][this.field10462];
            this.field10463 = new int[this.field10465][this.field10462 + 1];
            int var4 = this.field10473 / 2;
            this.field10467[0] = 0;
            if (arg0 == 75) {
                for (int var5 = 0; ~var5 > ~this.field10465; ++var5) {
                    if (~var5 < -1) {
                        int var6 = this.field10473;
                        int var7 = (class70.method723(var2, 4096, (byte) 58) + -2048) * this.field10481 >> 12;
                        int var8 = (var4 * var7 >> 12) + var6;
                        this.field10467[var5] = this.field10467[var5 + -1] + var8;
                    }
                    this.field10463[var5][0] = 0;
                    for (int var9 = 0; ~this.field10462 < ~var9; ++var9) {
                        if (var9 > 0) {
                            int var10 = this.field10470;
                            int var11 = (-2048 + class70.method723(var2, 4096, (byte) 58)) * this.field10474 >> 12;
                            int var12 = (var3 * var11 >> 12) + var10;
                            this.field10463[var5][var9] = this.field10463[var5][var9 + -1] + var12;
                        }
                        this.field10468[var5][var9] = this.field10476 <= 0 ? 4096 : 4096 + -class70.method723(var2, this.field10476, (byte) 58);
                    }
                    this.field10463[var5][this.field10462] = 4096;
                }
                this.field10467[this.field10465] = 4096;
            }
        } catch (RuntimeException var14) {
            throw class665.method4799(var14, field10483[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I[[BB[BI[I[[B[I)I", line = 78)
    public static final int method5340(int arg0, byte[][] arg1, byte arg2, byte[] arg3, int arg4, int[] arg5, byte[][] arg6, int[] arg7) {
        try {
            ++field10471;
            int var8 = arg5[arg4];
            int var9 = arg7[arg4] + var8;
            if (arg2 <= 77) {
                return 44;
            } else {
                int var10 = arg5[arg0];
                int var11 = arg7[arg0] + var10;
                int var12 = var8;
                if (~var8 > ~var10) {
                    var12 = var10;
                }
                int var13 = var9;
                if (~var9 < ~var11) {
                    var13 = var11;
                }
                int var14 = 255 & arg3[arg4];
                if (~(arg3[arg0] & 255) > ~var14) {
                    var14 = 255 & arg3[arg0];
                }
                byte[] var15 = arg1[arg4];
                byte[] var16 = arg6[arg0];
                int var17 = -var8 + var12;
                int var18 = -var10 + var12;
                for (int var19 = var12; var13 > var19; ++var19) {
                    int var20 = var16[var18++] + var15[var17++];
                    if (var14 > var20) {
                        var14 = var20;
                    }
                }
                return -var14;
            }
        } catch (RuntimeException var22) {
            throw class665.method4799(var22, field10483[4] + arg0 + ',' + (arg1 != null ? field10483[1] : field10483[3]) + ',' + arg2 + ',' + (arg3 != null ? field10483[1] : field10483[3]) + ',' + arg4 + ',' + (arg5 != null ? field10483[1] : field10483[3]) + ',' + (arg6 != null ? field10483[1] : field10483[3]) + ',' + (arg7 != null ? field10483[1] : field10483[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(II)[I", line = 136)
    public final int[] method14(int arg0, int arg1) {
        try {
            ++field10477;
            int[] var3 = super.field7564.method4462(26041, arg0);
            int var4 = -59 % ((-57 - arg1) / 55);
            if (super.field7564.field8652) {
                int var5 = 0;
                int var6;
                for (var6 = class568.field8263[arg0] - -this.field10478; var6 < 0; var6 += 4096) {
                }
                while (var6 > 4096) {
                    var6 -= 4096;
                }
                while (this.field10465 > var5 && ~this.field10467[var5] >= ~var6) {
                    ++var5;
                }
                int var7 = var5 + -1;
                boolean var8 = (var5 & 1) == 0;
                int var9 = this.field10467[var5];
                int var10 = this.field10467[var5 - 1];
                if (var6 > this.field10475 + var10 && ~(var9 - this.field10475) < ~var6) {
                    for (int var11 = 0; ~class110.field1436 < ~var11; ++var11) {
                        int var12 = 0;
                        int var13 = !var8 ? -this.field10466 : this.field10466;
                        int var14;
                        for (var14 = class393.field5718[var11] - -(this.field10470 * var13 >> 12); var14 < 0; var14 += 4096) {
                        }
                        while (var14 > 4096) {
                            var14 -= 4096;
                        }
                        while (this.field10462 > var12 && this.field10463[var7][var12] <= var14) {
                            ++var12;
                        }
                        int var15 = var12 - 1;
                        int var16 = this.field10463[var7][var12];
                        int var17 = this.field10463[var7][var15];
                        if (var14 > this.field10475 + var17 && ~var14 > ~(-this.field10475 + var16)) {
                            var3[var11] = this.field10468[var7][var15];
                        } else {
                            var3[var11] = 0;
                        }
                    }
                } else {
                    class569.method4243(var3, 0, class110.field1436, 0);
                }
            }
            return var3;
        } catch (RuntimeException var19) {
            throw class665.method4799(var19, field10483[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!la", name = "f", descriptor = "(I)V", line = 237)
    public static void method5341(int arg0) {
        try {
            field10464 = null;
            if (arg0 != 4096) {
                method5341(-66);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field10483[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjc;I)V", line = 247)
    public final void method17(int arg0, class711 arg1, int arg2) {
        try {
            if (arg0 != 0) {
                if (~arg0 != -2) {
                    if (arg0 != 2) {
                        if (~arg0 != -4) {
                            if (~arg0 != -5) {
                                if (~arg0 != -6) {
                                    if (arg0 != 6) {
                                        if (arg0 == 7) {
                                            this.field10476 = arg1.method5116((byte) -127);
                                        }
                                    } else {
                                        this.field10479 = arg1.method5116((byte) -111);
                                    }
                                } else {
                                    this.field10478 = arg1.method5116((byte) -125);
                                }
                            } else {
                                this.field10466 = arg1.method5116((byte) -123);
                            }
                        } else {
                            this.field10481 = arg1.method5116((byte) -117);
                        }
                    } else {
                        this.field10474 = arg1.method5116((byte) -126);
                    }
                } else {
                    this.field10465 = arg1.method5128(0);
                }
            } else {
                this.field10462 = arg1.method5128(0);
            }
            if (arg2 != -3) {
                method5340(43, (byte[][]) null, (byte) -10, (byte[]) null, -2, (int[]) null, (byte[][]) null, (int[]) null);
            }
            ++field10482;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field10483[2] + arg0 + ',' + (arg1 != null ? field10483[1] : field10483[3]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "()V", line = 349)
    public class735() {
        super(0, true);
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(I)V", line = 365)
    public final void method12(int arg0) {
        try {
            if (arg0 > 38) {
                this.method5339((byte) 75);
                ++field10480;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10483[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!la", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5342(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 103);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!la", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5343(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 64;
                    break;
                case 1:
                    var10005 = 22;
                    break;
                case 2:
                    var10005 = 94;
                    break;
                case 3:
                    var10005 = 63;
                    break;
                default:
                    var10005 = 103;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
