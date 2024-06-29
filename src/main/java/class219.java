import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class219 extends class335 {

    @OriginalMember(owner = "client!kb", name = "L", descriptor = "I")
    private int field3327 = 2048;

    @OriginalMember(owner = "client!kb", name = "T", descriptor = "I")
    private int field3335 = 8192;

    @OriginalMember(owner = "client!kb", name = "Q", descriptor = "I")
    private int field3332 = 0;

    @OriginalMember(owner = "client!kb", name = "X", descriptor = "I")
    private int field3339 = 2048;

    @OriginalMember(owner = "client!kb", name = "ab", descriptor = "I")
    private int field3342 = 0;

    @OriginalMember(owner = "client!kb", name = "U", descriptor = "I")
    private int field3336 = 4096;

    @OriginalMember(owner = "client!kb", name = "P", descriptor = "I")
    private int field3331 = 12288;

    @OriginalMember(owner = "client!kb", name = "M", descriptor = "I")
    public static int field3328 = -1;

    @OriginalMember(owner = "client!kb", name = "W", descriptor = "[I")
    public static int[] field3338 = new int[14];

    @OriginalMember(owner = "client!kb", name = "V", descriptor = "Lpg;")
    public static class320 field3337 = new class320(64);

    @OriginalMember(owner = "client!kb", name = "N", descriptor = "I")
    public static int field3329;

    @OriginalMember(owner = "client!kb", name = "O", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!kb", name = "R", descriptor = "I")
    public static int field3333;

    @OriginalMember(owner = "client!kb", name = "S", descriptor = "I")
    public static int field3334;

    @OriginalMember(owner = "client!kb", name = "Y", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!kb", name = "Z", descriptor = "I")
    public static int field3341;

    @OriginalMember(owner = "client!kb", name = "bb", descriptor = "I")
    public static int field3343;

    @OriginalMember(owner = "client!kb", name = "cb", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(III)Z", line = 7)
    private final boolean method1543(int arg0, int arg1, int arg2) {
        field3343++;
        int var4 = (arg1 + arg2) * this.field3331 >> 12;
        int var5 = class288.field4490[(var4 * 255 & 0xFFF85) >> 12];
        int var6 = (var5 << 12) / this.field3331;
        int var7 = (var6 << 12) / this.field3335;
        if (arg0 < 47) {
            field3328 = -127;
        }
        int var8 = this.field3336 * var7 >> 12;
        return arg2 - arg1 < var8 && -var8 < arg2 - arg1;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(II)[I", line = 29)
    public final int[] method149(int arg0, int arg1) {
        field3341++;
        int[] var3 = this.field5233.method1110((byte) 108, arg0);
        if (arg1 != 621) {
            return (int[]) null;
        }
        if (this.field5233.field2467) {
            int var4 = class280.field4316[arg0] - 2048;
            for (int var5 = 0; var5 < class105.field1630; var5++) {
                int var6 = class90.field1437[var5] - 2048;
                int var7 = this.field3327 + var6;
                int var8 = this.field3342 + var4;
                int var9 = var8 >= -2048 ? var8 : var8 + 4096;
                int var10 = this.field3332 + var6;
                int var11 = var9 <= 2048 ? var9 : var9 - 4096;
                int var12 = var10 >= -2048 ? var10 : var10 + 4096;
                int var13 = var12 <= 2048 ? var12 : var12 - 4096;
                int var14 = this.field3339 + var4;
                int var15 = var7 < -2048 ? var7 + 4096 : var7;
                int var16 = var15 > 2048 ? var15 - 4096 : var15;
                int var17 = var14 >= -2048 ? var14 : var14 + 4096;
                int var18 = var17 <= 2048 ? var17 : var17 - 4096;
                var3[var5] = this.method1547(var16, -6364, var11) || this.method1543(108, var13, var18) ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "()V", line = 509)
    public class219() {
        super(0, true);
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(Lkh;I)V", line = 90)
    public static final void method1544(class166 arg0, int arg1) {
        field3333++;
        if (arg1 != 4096) {
            return;
        }
        while (true) {
            while (arg0.field2500.length > arg0.field2532) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg0.method1178(0) == 1) {
                    var2 = true;
                    var3 = arg0.method1178(0);
                    var4 = arg0.method1178(0);
                }
                int var5 = arg0.method1178(0);
                int var6 = arg0.method1178(0);
                int var7 = var5 * 64 - class84.field1311;
                int var8 = class233.field3706 - (var6 * 64 + -class333.field5202) - 1;
                if (var7 >= 0 && var8 - 63 >= 0 && var7 + 63 < class313.field4863 && class233.field3706 > var8) {
                    int var9 = var8 >> 6;
                    int var10 = var7 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var11 >= (var3 * 8) && var11 < (var3 * 8 + 8) && var12 >= var4 * 8 && var4 * 8 + 8 > var12) {
                                byte var13 = arg0.method1143(arg1 - 4188);
                                if (var13 != 0) {
                                    if (class307.field4773[var10][var9] == null) {
                                        class307.field4773[var10][var9] = new byte[4096];
                                    }
                                    class307.field4773[var10][var9][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg0.method1143(-112);
                                    if (class19.field260[var10][var9] == null) {
                                        class19.field260[var10][var9] = new byte[4096];
                                    }
                                    class19.field260[var10][var9][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var2 ? 64 : 4096); var15++) {
                        byte var16 = arg0.method1143(arg1 - 4222);
                        if (var16 != 0) {
                            arg0.field2532++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(III)Lve;", line = 195)
    public static final class279 method1545(int arg0, int arg1, int arg2) {
        class142 var3 = class256.field4013[arg0][arg1][arg2];
        return var3 == null || var3.field2196 == null ? null : var3.field2196;
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(II)V", line = 204)
    public static final void method1546(int arg0, int arg1) {
        short var2 = 256;
        field3329++;
        if (var2 < arg1) {
            arg1 = var2;
        }
        if (arg1 > 10) {
            arg1 = 10;
        }
        class192.field2871 += arg1 * 128;
        if (class192.field2871 > class52.field885.length) {
            int var3 = (int) (Math.random() * 12.0D);
            class192.field2871 -= class52.field885.length;
            class92.method664(class55.field922[var3], (byte) -15);
        }
        int var4 = 0;
        int var5 = arg1 * 128;
        int var6 = (var2 - arg1) * 128;
        for (int var7 = 0; var7 < var6; var7++) {
            int var8 = class273.field4232[var4 + var5] - (class52.field885[class192.field2871 + var4 & class52.field885.length - 1] * arg1 / 6);
            if (var8 < 0) {
                var8 = 0;
            }
            class273.field4232[var4++] = var8;
        }
        for (int var9 = var2 - arg1; var9 < var2; var9++) {
            int var10 = var9 * 128;
            for (int var11 = 0; var11 < 128; var11++) {
                int var12 = (int) (Math.random() * 100.0D);
                if (var12 < 50 && var11 > 10 && var11 < 118) {
                    class273.field4232[var11 + var10] = 255;
                } else {
                    class273.field4232[var11 + var10] = 0;
                }
            }
        }
        for (int var13 = 0; var13 < var2 - arg1; var13++) {
            class88.field1417[var13] = class88.field1417[arg1 + var13];
        }
        if (arg0 != -11798) {
            return;
        }
        for (int var14 = var2 - arg1; var14 < var2; var14++) {
            class88.field1417[var14] = (int) (Math.sin((double) class242.field3877 / 14.0D) * 16.0D + Math.sin((double) class242.field3877 / 15.0D) * 14.0D + Math.sin((double) class242.field3877 / 16.0D) * 12.0D);
            class242.field3877++;
        }
        int var15 = (arg1 + (class227.field3618 & 0x1)) / 2;
        class7.field85 += arg1;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < class7.field85; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            class273.field4232[(var18 << 7) + var17] = 192;
        }
        class7.field85 = 0;
        for (int var19 = 0; var19 < var2; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if ((var22 + var15) < 128) {
                    var20 += class273.field4232[var21 + var22 + var15];
                }
                if ((var22 - var15 - 1) >= 0) {
                    var20 -= class273.field4232[var22 + var21 - var15 - 1];
                }
                if (var22 >= 0) {
                    class50.field818[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var2; var25++) {
                int var26 = var25 * 128;
                if ((var15 + var25) < var2) {
                    var24 += class50.field818[var15 * 128 + var23 + var26];
                }
                if (var25 - var15 - 1 >= 0) {
                    var24 -= class50.field818[var26 + var23 - ((var15 + 1) * 128)];
                }
                if (var25 >= 0) {
                    class273.field4232[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILkh;I)V", line = 399)
    public final void method230(int arg0, class166 arg1, int arg2) {
        if (arg0 == 0) {
            this.field3327 = arg1.method1151(-105);
        } else if (arg0 == 1) {
            this.field3342 = arg1.method1151(-82);
        } else if (arg0 == 2) {
            this.field3332 = arg1.method1151(-105);
        } else if (arg0 == 3) {
            this.field3339 = arg1.method1151(-74);
        } else if (arg0 == 4) {
            this.field3331 = arg1.method1151(-97);
        } else if (arg0 == 5) {
            this.field3336 = arg1.method1151(-97);
        } else if (arg0 == 6) {
            this.field3335 = arg1.method1151(-103);
        }
        if (arg2 < 51) {
            field3337 = (class320) null;
        }
        field3334++;
    }

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "(III)Z", line = 457)
    private final boolean method1547(int arg0, int arg1, int arg2) {
        field3344++;
        int var4 = (arg2 - arg0) * this.field3331 >> 12;
        int var5 = class288.field4490[var4 * 255 >> 12 & 0xFF];
        int var6 = (var5 << 12) / this.field3331;
        int var7 = (var6 << 12) / this.field3335;
        if (arg1 != -6364) {
            method1544((class166) null, -112);
        }
        int var8 = this.field3336 * var7 >> 12;
        return var8 > arg0 + arg2 && (-var8) < (arg0 + arg2);
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(B)V", line = 476)
    public static void method1548(byte arg0) {
        field3338 = null;
        field3337 = null;
        int var1 = -88 / ((-arg0 - 73) / 53);
    }

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "(I)V", line = 494)
    public final void method381(int arg0) {
        field3340++;
        int var2 = -79 / ((arg0 - 44) / 35);
        class117.method865(10);
    }
}
