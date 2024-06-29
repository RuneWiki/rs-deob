import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class131 extends class297 {

    @OriginalMember(owner = "client!ld", name = "O", descriptor = "I")
    private int field2095 = 4096;

    @OriginalMember(owner = "client!ld", name = "N", descriptor = "I")
    private int field2094 = 0;

    @OriginalMember(owner = "client!ld", name = "S", descriptor = "I")
    private int field2099 = 2048;

    @OriginalMember(owner = "client!ld", name = "V", descriptor = "I")
    private int field2102 = 2048;

    @OriginalMember(owner = "client!ld", name = "W", descriptor = "I")
    private int field2103 = 12288;

    @OriginalMember(owner = "client!ld", name = "T", descriptor = "I")
    private int field2100 = 0;

    @OriginalMember(owner = "client!ld", name = "L", descriptor = "I")
    private int field2092 = 8192;

    @OriginalMember(owner = "client!ld", name = "I", descriptor = "I")
    public static int field2089;

    @OriginalMember(owner = "client!ld", name = "J", descriptor = "I")
    public static int field2090;

    @OriginalMember(owner = "client!ld", name = "M", descriptor = "I")
    public static int field2093;

    @OriginalMember(owner = "client!ld", name = "P", descriptor = "I")
    public static int field2096;

    @OriginalMember(owner = "client!ld", name = "Q", descriptor = "I")
    public static int field2097;

    @OriginalMember(owner = "client!ld", name = "R", descriptor = "I")
    public static int field2098;

    @OriginalMember(owner = "client!ld", name = "U", descriptor = "I")
    public static int field2101;

    @OriginalMember(owner = "client!ld", name = "X", descriptor = "I")
    public static int field2104;

    @OriginalMember(owner = "client!ld", name = "Y", descriptor = "I")
    public static int field2105;

    @OriginalMember(owner = "client!ld", name = "K", descriptor = "[I")
    public static int[] field2091;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "(I)V", line = 4)
    public static void method1011(int arg0) {
        field2091 = null;
        if (arg0 != 63) {
            field2105 = 66;
        }
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(III)Z", line = 16)
    private final boolean method1012(int arg0, int arg1, int arg2) {
        field2101++;
        int var4 = (arg1 - arg0) * this.field2103 >> 12;
        int var5 = class66.field986[var4 * 255 >> 12 & 0xFF];
        int var6 = (var5 << 12) / this.field2103;
        int var7 = (var6 << 12) / this.field2092;
        if (arg2 != -29717) {
            this.method247((byte) -51);
        }
        int var8 = this.field2095 * var7 >> 12;
        return var8 > (arg0 + arg1) && (arg0 + arg1) > (-var8);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILaj;)V", line = 37)
    public static final void method1013(int arg0, class1 arg1) {
        int var2 = -25 % ((arg0 + 22) / 35);
        while (true) {
            while (arg1.field34.length > arg1.field48) {
                boolean var3 = false;
                int var4 = 0;
                int var5 = 0;
                if (arg1.method15((byte) 59) == 1) {
                    var3 = true;
                    var5 = arg1.method15((byte) -81);
                    var4 = arg1.method15((byte) 111);
                }
                int var6 = arg1.method15((byte) 61);
                int var7 = arg1.method15((byte) -112);
                int var8 = var6 * 64 - class227.field3512;
                int var9 = class286.field4473 + class188.field2953 - (var7 * 64) - 1;
                if (var8 >= 0 && var9 - 63 >= 0 && (var8 + 63) < class113.field1833 && class286.field4473 > var9) {
                    int var10 = var8 >> 6;
                    int var11 = var9 >> 6;
                    for (int var12 = 0; var12 < 64; var12++) {
                        for (int var13 = 0; var13 < 64; var13++) {
                            if (!var3 || var12 >= (var5 * 8) && var5 * 8 + 8 > var12 && var13 >= var4 * 8 && var4 * 8 + 8 > var13) {
                                byte var14 = arg1.method55(4);
                                if (var14 != 0) {
                                    if (class303.field4830[var10][var11] == null) {
                                        class303.field4830[var10][var11] = new byte[4096];
                                    }
                                    class303.field4830[var10][var11][(63 - var13 << 6) + var12] = var14;
                                    byte var15 = arg1.method55(4);
                                    if (class3.field95[var10][var11] == null) {
                                        class3.field95[var10][var11] = new byte[4096];
                                    }
                                    class3.field95[var10][var11][(63 - var13 << 6) + var12] = var15;
                                }
                            }
                        }
                    }
                } else {
                    for (int var16 = 0; var16 < (var3 ? 64 : 4096); var16++) {
                        byte var17 = arg1.method55(4);
                        if (var17 != 0) {
                            arg1.field48++;
                        }
                    }
                }
            }
            field2098++;
            return;
        }
    }

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "(I)Lwk;", line = 137)
    public static final class186 method1014(int arg0) {
        if (arg0 == 1567682540) {
            field2097++;
            class186 var1 = new class186(class185.field2926, class112.field1821, class61.field892[0], class183.field2902[0], class309.field4887[0], class83.field1288[0], class207.field3277[0], class260.field3873);
            class260.method1796(1952227009);
            return var1;
        } else {
            return (class186) null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "()V", line = 149)
    public class131() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(B)V", line = 153)
    public final void method247(byte arg0) {
        field2090++;
        if (arg0 != 68) {
            field2091 = (int[]) null;
        }
        class37.method330((byte) 36);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IZ)[I", line = 167)
    public final int[] method173(int arg0, boolean arg1) {
        field2093++;
        int[] var3 = this.field4760.method215(arg0, 19142);
        if (!arg1) {
            method1011(125);
        }
        if (this.field4760.field388) {
            int var4 = class264.field3901[arg0] - 2048;
            for (int var5 = 0; var5 < class31.field491; var5++) {
                int var6 = class251.field3705[var5] - 2048;
                int var7 = this.field2102 + var6;
                int var8 = this.field2099 + var4;
                int var9 = this.field2094 + var6;
                int var10 = this.field2100 + var4;
                int var11 = var8 < -2048 ? var8 + 4096 : var8;
                int var12 = var11 <= 2048 ? var11 : var11 - 4096;
                int var13 = var10 < -2048 ? var10 + 4096 : var10;
                int var14 = var7 < -2048 ? var7 + 4096 : var7;
                int var15 = var13 > 2048 ? var13 - 4096 : var13;
                int var16 = var9 >= -2048 ? var9 : var9 + 4096;
                int var17 = var14 > 2048 ? var14 - 4096 : var14;
                int var18 = var16 > 2048 ? var16 - 4096 : var16;
                var3[var5] = this.method1012(var17, var15, -29717) || this.method1016(var12, var18, true) ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lpk;Lpk;Lpk;ILka;)Z", line = 221)
    public static final boolean method1015(class120 arg0, class120 arg1, class120 arg2, int arg3, class201 arg4) {
        class320.field5017 = arg2;
        if (arg3 <= 74) {
            method1014(94);
        }
        class20.field370 = arg4;
        class45.field702 = arg0;
        class28.field456 = arg1;
        field2104++;
        return true;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIZ)Z", line = 236)
    private final boolean method1016(int arg0, int arg1, boolean arg2) {
        field2089++;
        int var4 = (arg0 + arg1) * this.field2103 >> 12;
        int var5 = class66.field986[var4 * 255 >> 12 & 0xFF];
        int var6 = (var5 << 12) / this.field2103;
        int var7 = (var6 << 12) / this.field2092;
        if (!arg2) {
            this.field2100 = 71;
        }
        int var8 = this.field2095 * var7 >> 12;
        return var8 > arg0 - arg1 && -var8 < arg0 - arg1;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IILaj;)V", line = 296)
    public final void method169(int arg0, int arg1, class1 arg2) {
        if (arg0 == 0) {
            this.field2102 = arg2.method56(arg1 + 19357);
        } else if (arg0 == 1) {
            this.field2100 = arg2.method56(19612);
        } else if (arg0 == 2) {
            this.field2094 = arg2.method56(arg1 ^ 0x4C63);
        } else if (arg0 == 3) {
            this.field2099 = arg2.method56(arg1 + 19357);
        } else if (arg0 == 4) {
            this.field2103 = arg2.method56(19612);
        } else if (arg0 == 5) {
            this.field2095 = arg2.method56(19612);
        } else if (arg0 == 6) {
            this.field2092 = arg2.method56(arg1 + 19357);
        }
        if (arg1 != 255) {
            this.field2095 = -106;
        }
        field2096++;
    }
}
