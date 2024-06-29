import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public class class80 extends class656 {

    @OriginalMember(owner = "client!jv", name = "n", descriptor = "I")
    public int field965 = 0;

    @OriginalMember(owner = "client!jv", name = "B", descriptor = "Lvia;")
    private class564 field979;

    @OriginalMember(owner = "client!jv", name = "u", descriptor = "[I")
    private int[] field972;

    @OriginalMember(owner = "client!jv", name = "A", descriptor = "I")
    public int field978;

    @OriginalMember(owner = "client!jv", name = "w", descriptor = "F")
    public float field974;

    @OriginalMember(owner = "client!jv", name = "i", descriptor = "I")
    public int field960;

    @OriginalMember(owner = "client!jv", name = "t", descriptor = "I")
    public int field971;

    @OriginalMember(owner = "client!jv", name = "o", descriptor = "Lrv;")
    private class111 field966;

    @OriginalMember(owner = "client!jv", name = "C", descriptor = "I")
    public int field980;

    @OriginalMember(owner = "client!jv", name = "j", descriptor = "I")
    public static int field961;

    @OriginalMember(owner = "client!jv", name = "k", descriptor = "I")
    public static int field962;

    @OriginalMember(owner = "client!jv", name = "l", descriptor = "I")
    public static int field963;

    @OriginalMember(owner = "client!jv", name = "m", descriptor = "I")
    public static int field964;

    @OriginalMember(owner = "client!jv", name = "q", descriptor = "I")
    public static int field968;

    @OriginalMember(owner = "client!jv", name = "s", descriptor = "I")
    public static int field970;

    @OriginalMember(owner = "client!jv", name = "x", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!jv", name = "y", descriptor = "I")
    public static int field976;

    @OriginalMember(owner = "client!jv", name = "z", descriptor = "I")
    public static int field977;

    @OriginalMember(owner = "client!jv", name = "v", descriptor = "Lam;")
    private class633 field973;

    @OriginalMember(owner = "client!jv", name = "r", descriptor = "Ljaclib/memory/Stream;")
    private Stream field969;

    @OriginalMember(owner = "client!jv", name = "p", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field967;

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(IIII)V", line = 5)
    public final void method630(int arg0, int arg1, int arg2, int arg3) {
        this.field972[this.field979.field3992 * arg1 + arg0] = class446.method2556(this.field972[this.field979.field3992 * arg1 + arg0], 0x1 << arg3);
        field962++;
        this.field965++;
        if (arg2 != 14278) {
            this.method637(127, 34);
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(I)V", line = 23)
    public static final void method631(int arg0) {
        class566.field7445.method41(2064);
        field963++;
        class556.field7305 = null;
        class577.field7577 = null;
        class320.field4576 = arg0;
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(B)V", line = 41)
    public static final void method632(byte arg0) {
        if (arg0 != 102) {
            method631(56);
        }
        field975++;
        class339.field4795 = true;
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(IB[I)V", line = 53)
    public final void method633(int arg0, byte arg1, int[] arg2) {
        field976++;
        class268 var4 = this.field966.method855((byte) 127, this.field965 * 3);
        Buffer var5 = var4.method587(arg1 + 30899, true);
        if (var5 == null) {
            return;
        }
        Stream var6 = this.field966.method820((byte) -20, var5);
        int var7 = 0;
        int var8 = 32767;
        if (arg1 != 8) {
            this.method633(13, (byte) -15, null);
        }
        int var9 = -32768;
        if (Stream.method3739()) {
            label99: for (int var18 = 0; var18 < arg0; var18++) {
                int var20 = arg2[var18];
                int var21 = this.field972[var20];
                short[] var22 = this.field979.field7388[var20];
                if (var21 != 0 && var22 != null) {
                    int var23 = 0;
                    int var24 = 0;
                    while (true) {
                        while (true) {
                            if (var24 >= var22.length) {
                                continue label99;
                            }
                            if ((var21 & 0x1 << var23++) == 0) {
                                var24 += 3;
                            } else {
                                var7++;
                                for (int var25 = 0; var25 < 3; var25++) {
                                    int var26 = var22[var24++] & 0xFFFF;
                                    if (var26 > var9) {
                                        var9 = var26;
                                    }
                                    var6.method3735(var26);
                                    if (var8 > var26) {
                                        var8 = var26;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            label125: for (int var10 = 0; var10 < arg0; var10++) {
                int var11 = arg2[var10];
                short[] var12 = this.field979.field7388[var11];
                int var13 = this.field972[var11];
                if (var13 != 0 && var12 != null) {
                    int var14 = 0;
                    int var15 = 0;
                    while (true) {
                        while (true) {
                            if (var12.length <= var15) {
                                continue label125;
                            }
                            if ((var13 & 0x1 << var14++) == 0) {
                                var15 += 3;
                            } else {
                                for (int var16 = 0; var16 < 3; var16++) {
                                    int var17 = var12[var15++] & 0xFFFF;
                                    var6.method3737(var17);
                                    if (var17 < var8) {
                                        var8 = var17;
                                    }
                                    if (var9 < var17) {
                                        var9 = var17;
                                    }
                                }
                                var7++;
                            }
                        }
                    }
                }
            }
        }
        var6.method3734();
        if (!var4.method586(-17694) || var7 <= 0) {
            return;
        }
        this.field966.method856(this.field971, 42, (this.field979.field7414 & 0x8) != 0, (this.field979.field7414 & 0x7) != 0);
        if (this.field966.field1753) {
            this.field966.method502(Integer.MAX_VALUE, this.field980, this.field960, this.field978);
        }
        class615 var19 = this.field966.method916(0);
        var19.method3366(1.0F / this.field974, 1.0F / this.field974, 1.0F, (byte) -49);
        this.field966.method878(arg1 ^ 0xB, class91.field1105);
        this.field966.method825(1, 8, this.field973);
        this.field966.method898(this.field979.field7417, (byte) -15);
        this.field966.method900(var4, class322.field4583, var7, 0, var9 + 1 - var8, var8, -229);
        this.field966.method819(arg1 - 114);
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(IIFIB)V", line = 209)
    public final void method634(int arg0, int arg1, float arg2, int arg3, byte arg4) {
        if (this.field971 != -1) {
            class758 var6 = this.field966.field717.method91(this.field971, (byte) 126);
            int var7 = var6.field10542 & 0xFF;
            if (var7 != 0 && var6.field10536 != 4) {
                int var8;
                if (arg1 < 0) {
                    var8 = 0;
                } else if (arg1 > 127) {
                    var8 = 16777215;
                } else {
                    var8 = arg1 * 131586;
                }
                if (var7 == 256) {
                    arg3 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg3 = ((var8 & 0xFF00FF) * var7 + ((arg3 & 0xFF00FF) * var10) & 0xFF00FF00) + ((arg3 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) >> 8;
                }
            }
            int var11 = var6.field10537 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = ((arg3 & 0xFF0000) >> 16) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = (arg3 >> 8 & 0xFF) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg3 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                arg3 = (var12 << 8 & 0xFF004A) + (var14 >> 8) + (var13 & 0xFF00);
            }
        }
        field970++;
        if (arg2 != 1.0F) {
            int var15 = (arg3 & 0xFF11D6) >> 16;
            int var16 = (arg3 & 0xFF48) >> 8;
            int var17 = (int) ((float) var15 * arg2);
            int var18 = arg3 & 0xFF;
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 255) {
                var17 = 255;
            }
            int var19 = (int) ((float) var16 * arg2);
            if (var19 < 0) {
                var19 = 0;
            } else if (var19 > 255) {
                var19 = 255;
            }
            int var20 = (int) ((float) var18 * arg2);
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            arg3 = var19 << 8 | var17 << 16 | var20;
        }
        if (arg4 != -126) {
            this.field965 = 72;
        }
        this.field969.method3738(arg0 * 4);
        if (this.field966.field1823 == 0) {
            this.field969.method3745((byte) arg3);
            this.field969.method3745((byte) (arg3 >> 8));
            this.field969.method3745((byte) (arg3 >> 16));
        } else {
            this.field969.method3745((byte) (arg3 >> 16));
            this.field969.method3745((byte) (arg3 >> 8));
            this.field969.method3745((byte) arg3);
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(IB)V", line = 328)
    public final void method635(int arg0, byte arg1) {
        field968++;
        this.field967 = this.field966.method829(arg0 * 4, true, (byte) -35);
        if (arg1 != 16) {
            field964 = -71;
        }
        this.field969 = new Stream(this.field967, 0, arg0 * 4);
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(II)V", line = 342)
    public final void method636(int arg0, int arg1) {
        this.field969.method3738(arg0 * 4 + 3);
        field977++;
        if (arg1 != -19730) {
            this.method634(-9, -99, 0.21643426F, -50, (byte) -127);
        }
        this.field969.method3745(-1);
    }

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "(II)V", line = 357)
    public final void method637(int arg0, int arg1) {
        field961++;
        this.field969.method3734();
        this.field973 = this.field966.method904(44, false);
        this.field973.method2600(arg0 * arg1, this.field967, 24689, 4);
        this.field967 = null;
        this.field969 = null;
    }

    @OriginalMember(owner = "client!jv", name = "<init>", descriptor = "(Lvia;IIIII)V", line = 372)
    public class80(class564 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field979 = arg0;
        this.field972 = new int[this.field979.field3996 * this.field979.field3992];
        this.field978 = arg5;
        this.field974 = arg2;
        this.field960 = arg4;
        this.field971 = arg1;
        this.field966 = this.field979.field7381;
        this.field980 = arg3;
    }
}
