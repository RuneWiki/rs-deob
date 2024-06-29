import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class23 {

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "[I")
    public static int[] field291 = new int[128];

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "Ljava/lang/String;")
    public static String field292 = "Loaded textures";

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "I")
    public static int field296 = -1;

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "Lqc;")
    public static class99 field295 = new class99(64);

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "I")
    public static int field293;

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "I")
    public static int field299;

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "Lkm;")
    public static class133 field294;

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "Lkm;")
    public static class133 field297;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V", line = 5)
    public static void method136(int arg0) {
        field295 = null;
        if (arg0 != -1) {
            field294 = (class133) null;
        }
        field297 = null;
        field292 = null;
        field291 = null;
        field294 = null;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IJ)V", line = 25)
    public static final void method137(int arg0, long arg1) {
        int var3 = class130.field1783 + class173.field2356.field3745;
        if (!class98.field1340) {
            class89.field1257 += (float) arg1 * class312.field4717 / 40.0F;
            class124.field1674 += (float) arg1 * class187.field2589 / 40.0F;
        }
        int var4 = class304.field4566 + class173.field2356.field3679;
        field299++;
        if ((class111.field1505 - var3) < -500 || class111.field1505 - var3 > 500 || (class17.field228 - var4) < -500 || class17.field228 - var4 > 500) {
            class111.field1505 = var3;
            class17.field228 = var4;
        }
        if (class111.field1505 != var3) {
            int var5 = var3 - class111.field1505;
            int var6 = (int) ((long) var5 * arg1 / 320L);
            if (var5 > 0) {
                if (var6 == 0) {
                    var6 = 1;
                } else if (var5 < var6) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = -1;
            } else if (var5 > var6) {
                var6 = var5;
            }
            class111.field1505 += var6;
        }
        if (class17.field228 != var4) {
            int var7 = var4 - class17.field228;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 > 0) {
                if (var8 == 0) {
                    var8 = 1;
                } else if (var8 > var7) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = -1;
            } else if (var7 > var8) {
                var8 = var7;
            }
            class17.field228 += var8;
        }
        if (arg0 < -21) {
            class64.method428(101);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lcg;B)V", line = 135)
    public static final void method138(class316 arg0, byte arg1) {
        field298++;
        int var2 = -100 % ((58 - arg1) / 42);
        while (true) {
            while (arg0.field4798.length > arg0.field4777) {
                boolean var3 = false;
                int var4 = 0;
                int var5 = 0;
                if (arg0.method2219(16448) == 1) {
                    var3 = true;
                    var5 = arg0.method2219(16448);
                    var4 = arg0.method2219(16448);
                }
                int var6 = arg0.method2219(16448);
                int var7 = arg0.method2219(16448);
                int var8 = var6 * 64 - class174.field2374;
                int var9 = class56.field765 - (var7 * 64 + -class42.field481) - 1;
                if (var8 >= 0 && var9 - 63 >= 0 && var8 + 63 < class20.field258 && var9 < class56.field765) {
                    int var10 = var9 >> 6;
                    int var11 = var8 >> 6;
                    for (int var12 = 0; var12 < 64; var12++) {
                        for (int var13 = 0; var13 < 64; var13++) {
                            if (!var3 || var12 >= (var5 * 8) && var12 < (var5 * 8 + 8) && var4 * 8 <= var13 && (var4 * 8 + 8) > var13) {
                                byte var14 = arg0.method2192(3);
                                if (var14 != 0) {
                                    if (class294.field4370[var11][var10] == null) {
                                        class294.field4370[var11][var10] = new byte[4096];
                                    }
                                    class294.field4370[var11][var10][(63 - var13 << 6) + var12] = var14;
                                    byte var15 = arg0.method2192(3);
                                    if (class249.field3583[var11][var10] == null) {
                                        class249.field3583[var11][var10] = new byte[4096];
                                    }
                                    class249.field3583[var11][var10][(63 - var13 << 6) + var12] = var15;
                                }
                            }
                        }
                    }
                } else {
                    for (int var16 = 0; var16 < (var3 ? 64 : 4096); var16++) {
                        byte var17 = arg0.method2192(3);
                        if (var17 != 0) {
                            arg0.field4777++;
                        }
                    }
                }
            }
            return;
        }
    }
}
