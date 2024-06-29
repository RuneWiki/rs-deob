import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class290 {

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "I")
    public int field4776 = -1;

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "I")
    public int field4778 = -1;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "Lpf;")
    public static class17 field4775 = new class17(4);

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "I")
    public static int field4772;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "I")
    public static int field4773;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "I")
    public static int field4777;

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "I")
    public static int field4779;

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "[I")
    public int[] field4774;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(SB)Z")
    public static final boolean method2012(short arg0, byte arg1) {
        field4779++;
        if (arg0 == 19 || arg0 == 32 || arg0 == 15 || arg0 == 31 || arg0 == 41 || arg0 == 60 || arg0 == 28 || arg0 == 1) {
            return true;
        } else if (arg0 == 25 || arg0 == 20 || arg0 == 1010 || arg0 == 1003) {
            return true;
        } else if (arg0 == 2 || arg0 == 37 || arg0 == 51 || arg0 == 46 || arg0 == 24) {
            return true;
        } else {
            if (arg1 < 91) {
                method2014(-62);
            }
            return arg0 == 50 || arg0 == 42 || arg0 == 58 || arg0 == 40 || arg0 == 35 || arg0 == 43;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIILda;JLda;Lda;)V")
    public static final void method2013(int arg0, int arg1, int arg2, int arg3, class312 arg4, long arg5, class312 arg6, class312 arg7) {
        class170 var9 = new class170();
        var9.field2745 = arg4;
        var9.field2748 = arg1 * 128 + 64;
        var9.field2757 = arg2 * 128 + 64;
        var9.field2753 = arg3;
        var9.field2754 = arg5;
        var9.field2755 = arg6;
        var9.field2749 = arg7;
        int var10 = 0;
        class174 var11 = class90.field1498[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field2814; var12++) {
                class73 var13 = var11.field2812[var12];
                if ((var13.field1278 & 0x400000L) == 4194304L) {
                    int var14 = var13.field1262.method860();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field2744 = -var10;
        if (class90.field1498[arg0][arg1][arg2] == null) {
            class90.field1498[arg0][arg1][arg2] = new class174(arg0, arg1, arg2);
        }
        class90.field1498[arg0][arg1][arg2].field2816 = var9;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)[Lmd;")
    public static final class273[] method2014(int arg0) {
        field4772++;
        class273[] var1 = new class273[class206.field3317];
        int var2 = 0;
        if (arg0 != 22254) {
            field4775 = null;
        }
        while (class206.field3317 > var2) {
            int var3 = class43.field656[var2] * class297.field4859[var2];
            byte[] var4 = class289.field4758[var2];
            if (class140.field2307[var2]) {
                int[] var7 = new int[var3];
                byte[] var8 = class149.field2465[var2];
                for (int var9 = 0; var9 < var3; var9++) {
                    var7[var9] = class312.method2107(class15.method84(var8[var9], 255) << 24, class185.field2952[class15.method84(255, var4[var9])]);
                }
                var1[var2] = new class266(class134.field2214, class253.field4293, class49.field842[var2], class73.field1283[var2], class297.field4859[var2], class43.field656[var2], var7);
            } else {
                int[] var5 = new int[var3];
                for (int var6 = 0; var6 < var3; var6++) {
                    var5[var6] = class185.field2952[class15.method84(var4[var6], 255)];
                }
                var1[var2] = new class92(class134.field2214, class253.field4293, class49.field842[var2], class73.field1283[var2], class297.field4859[var2], class43.field656[var2], var5);
            }
            var2++;
        }
        class155.method1175(73);
        return var1;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IILab;I)V")
    private final void method2015(int arg0, int arg1, class249 arg2, int arg3) {
        field4777++;
        if (arg1 == 1) {
            this.field4778 = arg2.method1821((byte) 51);
        } else if (arg1 == 2) {
            this.field4774 = new int[arg2.method1802((byte) 96)];
            for (int var5 = 0; var5 < this.field4774.length; var5++) {
                this.field4774[var5] = arg2.method1821((byte) 51);
            }
        } else if (arg1 == 3) {
            this.field4776 = arg2.method1802((byte) 59);
        }
        if (arg0 > -37) {
            field4775 = null;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILab;B)V")
    public final void method2016(int arg0, class249 arg1, byte arg2) {
        while (true) {
            int var4 = arg1.method1802((byte) 37);
            if (var4 == 0) {
                if (arg2 != -112) {
                    return;
                }
                field4773++;
                return;
            }
            this.method2015(arg2 + 61, var4, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V")
    public static void method2017(int arg0) {
        if (arg0 != 4) {
            method2017(-56);
        }
        field4775 = null;
    }
}
