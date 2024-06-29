import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class113 extends class23 {

    @OriginalMember(owner = "client!ke", name = "W", descriptor = "I")
    private int field2028;

    @OriginalMember(owner = "client!ke", name = "N", descriptor = "Ldc;")
    public static class37 field2019 = class185.method1233((byte) 86, " <col=ffff00>");

    @OriginalMember(owner = "client!ke", name = "S", descriptor = "[I")
    public static int[] field2024 = new int[32];

    @OriginalMember(owner = "client!ke", name = "U", descriptor = "Ldc;")
    public static class37 field2026;

    @OriginalMember(owner = "client!ke", name = "L", descriptor = "I")
    public static int field2017;

    @OriginalMember(owner = "client!ke", name = "M", descriptor = "I")
    public static int field2018;

    @OriginalMember(owner = "client!ke", name = "O", descriptor = "I")
    public static int field2020;

    @OriginalMember(owner = "client!ke", name = "P", descriptor = "I")
    public static int field2021;

    @OriginalMember(owner = "client!ke", name = "Q", descriptor = "I")
    public static int field2022;

    @OriginalMember(owner = "client!ke", name = "R", descriptor = "I")
    public static int field2023;

    @OriginalMember(owner = "client!ke", name = "T", descriptor = "I")
    public static int field2025;

    @OriginalMember(owner = "client!ke", name = "V", descriptor = "I")
    public static int field2027;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILpc;)V")
    public static final void method793(int arg0, class166 arg1) {
        long var2 = 0L;
        ++field2017;
        int var4 = 0;
        if (arg1.field3183 == 0) {
            var2 = client.method276(arg1.field3168, arg1.field3175, arg1.field3178);
        }
        if (~arg1.field3183 == -2) {
            var2 = class9.method60(arg1.field3168, arg1.field3175, arg1.field3178);
        }
        if (~arg1.field3183 == -3) {
            var2 = class204.method1343(arg1.field3168, arg1.field3175, arg1.field3178);
        }
        if (arg1.field3183 == 3) {
            var2 = class244.method1592(arg1.field3168, arg1.field3175, arg1.field3178);
        }
        if (arg0 == -21619) {
            int var5 = -1;
            int var6 = 0;
            if (var2 != 0L) {
                var5 = Integer.MAX_VALUE & (int) (var2 >>> 32);
                var4 = 31 & (int) var2 >> 14;
                var6 = 3 & (int) var2 >> 20;
            }
            arg1.field3176 = var6;
            arg1.field3179 = var4;
            arg1.field3163 = var5;
        }
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(I)V")
    private class113(int arg0) {
        super(0, true);
        this.field2028 = 4096;
        this.field2028 = arg0;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)[I")
    public final int[] method57(int arg0, int arg1) {
        int[] var3 = super.field405.method1461(arg1, (byte) -127);
        ++field2023;
        if (arg0 != 0) {
            return null;
        } else {
            if (super.field405.field4114) {
                class4.method32(var3, 0, class199.field3705, this.field2028);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I[B)V")
    public static final void method794(int arg0, byte[] arg1) {
        int var2 = 0;
        if (arg0 != 23095) {
            field2026 = null;
        }
        while (true) {
            while (var2 < arg1.length) {
                int var3 = 64 * (255 & arg1[var2++]) + -class235.field4272;
                int var4 = -class68.field1224 + (255 & arg1[var2++]) * 64;
                if (~var3 < -1 && ~var4 < -1 && class150.field2848 > var3 - -64 && class190.field3528 > var4 + 64) {
                    int var5 = var3 >> 6;
                    int var6 = -var4 + class190.field3528 + -1 >> 6;
                    for (int var7 = 0; ~var7 > -65; ++var7) {
                        for (int var8 = -64; ~var8 > -1; ++var8) {
                            byte var9 = arg1[var2++];
                            if (var9 != 0) {
                                if (class120.field2153[var5][var6] == null) {
                                    class120.field2153[var5][var6] = new byte[4096];
                                }
                                class120.field2153[var5][var6][(-(var8 + 1) << 6) + var7] = var9;
                                byte var10 = arg1[var2++];
                                if (class30.field558[var5][var6] == null) {
                                    class30.field558[var5][var6] = new byte[4096];
                                }
                                class30.field558[var5][var6][(-(var8 + 1) << 6) - -var7] = var10;
                            }
                        }
                    }
                } else {
                    for (int var11 = -4096; var11 < 0; ++var11) {
                        byte var12 = arg1[var2++];
                        if (var12 != 0) {
                            ++var2;
                        }
                    }
                }
            }
            ++field2020;
            return;
        }
    }

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "(B)V")
    public static void method795(byte arg0) {
        field2026 = null;
        field2024 = null;
        field2019 = null;
        if (arg0 != 59) {
            method796(-33);
        }
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "()V")
    public class113() {
        this(4096);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lce;II)V")
    public final void method40(class28 arg0, int arg1, int arg2) {
        if (arg2 != 1000) {
            field2026 = null;
        }
        if (~arg1 == -1) {
            this.field2028 = (arg0.method215(-1797813752) << 12) / 255;
        }
        ++field2022;
    }

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "(I)I")
    public static final int method796(int arg0) {
        ++field2025;
        if (class31.field632 == 3.0D) {
            return 37;
        } else if (class31.field632 == 4.0D) {
            return 50;
        } else if (arg0 != 16493) {
            return 95;
        } else {
            return class31.field632 == 6.0D ? 75 : 100;
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; ~var1 > -33; ++var1) {
            field2024[var1] = var0 + -1;
            var0 += var0;
        }
        field2026 = class185.method1233((byte) 86, "(U4");
    }
}
