import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class367 {

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "[S")
    public short[] field5285;

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "[I")
    public int[] field5288;

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "[S")
    public short[] field5287;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "J")
    public long field5283;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "Lqe;")
    public static class469 field5286 = new class469(62, 10);

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "I")
    public static int field5289;

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "I")
    public static int field5290;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "[Lhc;")
    public static class141[] field5284;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
    public static void method2264(int arg0) {
        field5286 = null;
        if (arg0 > -40) {
            field5286 = null;
        }
        field5284 = null;
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(J[I[S[S)V")
    public class367(long arg0, int[] arg1, short[] arg2, short[] arg3) {
        this.field5285 = arg3;
        this.field5288 = arg1;
        this.field5287 = arg2;
        this.field5283 = arg0;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V")
    public static final void method2265(byte arg0) {
        field5289++;
        if (class63.field916.field10203.method3093(17503) != 2 || arg0 >= -33) {
            return;
        }
        byte var1 = (byte) (class412.field6195 - 4 & 0xFF);
        int var2 = class412.field6195 % class194.field2946;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var18 = 0; var18 < class255.field3656; var18++) {
                class238.field3469[var3][var2][var18] = var1;
            }
        }
        if (class341.field4946 == 3) {
            return;
        }
        for (int var4 = 0; var4 < 2; var4++) {
            class193.field2931[var4] = -1000000;
            class640.field8989[var4] = 1000000;
            class375.field5687[var4] = 0;
            class242.field3535[var4] = 1000000;
            class421.field6281[var4] = 0;
        }
        int var5 = class130.field1749.field8423;
        int var6 = class130.field1749.field8428;
        if (class264.field3784 != 1 && class656.field9191 == -1) {
            int var7 = class384.method2468(true, class364.field5254, class341.field4946, class460.field6783);
            if (var7 - class259.field3700 < 3200 && (class60.field847[class341.field4946][class364.field5254 >> 9][class460.field6783 >> 9] & 0x4) != 0) {
                class123.method883(false, class80.field1136, class460.field6783 >> 9, class364.field5254 >> 9, 1, 12434);
                return;
            }
            return;
        }
        if (class264.field3784 != 1) {
            var6 = class67.field967;
            var5 = class656.field9191;
        }
        if ((class60.field847[class341.field4946][var5 >> 9][var6 >> 9] & 0x4) != 0) {
            class123.method883(false, class80.field1136, var6 >> 9, var5 >> 9, 0, 12434);
        }
        if (class120.field1650 >= 2560) {
            return;
        }
        int var8 = class364.field5254 >> 9;
        int var9 = class460.field6783 >> 9;
        int var10 = var5 >> 9;
        int var11 = var6 >> 9;
        int var12;
        if (var8 < var10) {
            var12 = var10 - var8;
        } else {
            var12 = var8 - var10;
        }
        int var13;
        if (var11 > var9) {
            var13 = var11 - var9;
        } else {
            var13 = var9 - var11;
        }
        if (var12 == 0 && var13 == 0 || var12 <= (-class194.field2946) || var12 >= class194.field2946 || (-class255.field3656) >= var13 || var13 >= class255.field3656) {
            class326.method2072(-3753, null, "RC: " + var8 + "," + var9 + " " + var10 + "," + var11 + " " + class361.field5224 + "," + class582.field8288);
            return;
        }
        if (var12 <= var13) {
            int var14 = var12 * 65536 / var13;
            int var15 = 32768;
            while (var9 != var11) {
                if (var9 < var11) {
                    var9++;
                } else if (var11 < var9) {
                    var9--;
                }
                if ((class60.field847[class341.field4946][var8][var9] & 0x4) != 0) {
                    class123.method883(false, class80.field1136, var9, var8, 1, 12434);
                    return;
                }
                var15 += var14;
                if (var15 >= 65536) {
                    if (var10 > var8) {
                        var8++;
                    } else if (var10 < var8) {
                        var8--;
                    }
                    var15 -= 65536;
                    if ((class60.field847[class341.field4946][var8][var9] & 0x4) != 0) {
                        class123.method883(false, class80.field1136, var9, var8, 1, 12434);
                        return;
                    }
                }
            }
            return;
        }
        int var16 = var13 * 65536 / var12;
        int var17 = 32768;
        while (var8 != var10) {
            if (var10 > var8) {
                var8++;
            } else if (var8 > var10) {
                var8--;
            }
            if ((class60.field847[class341.field4946][var8][var9] & 0x4) != 0) {
                class123.method883(false, class80.field1136, var9, var8, 1, 12434);
                return;
            }
            var17 += var16;
            if (var17 >= 65536) {
                var17 -= 65536;
                if (var9 < var11) {
                    var9++;
                } else if (var9 > var11) {
                    var9--;
                }
                if ((class60.field847[class341.field4946][var8][var9] & 0x4) != 0) {
                    class123.method883(false, class80.field1136, var9, var8, 1, 12434);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "()V")
    protected class367() {
    }
}
