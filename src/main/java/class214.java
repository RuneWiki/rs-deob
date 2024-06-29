import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public class class214 extends class435 {

    @OriginalMember(owner = "client!fp", name = "l", descriptor = "I")
    public int field2922;

    @OriginalMember(owner = "client!fp", name = "p", descriptor = "I")
    public int field2926;

    @OriginalMember(owner = "client!fp", name = "s", descriptor = "Ljc;")
    public static class305 field2929 = new class305("Created gameworld", "Spielwelt erstellt.", "Monde de jeu créé", "Universo de jogo criado");

    @OriginalMember(owner = "client!fp", name = "t", descriptor = "Lao;")
    public static class191 field2930 = new class191(65, -1);

    @OriginalMember(owner = "client!fp", name = "m", descriptor = "I")
    public static int field2923;

    @OriginalMember(owner = "client!fp", name = "n", descriptor = "I")
    public static int field2924;

    @OriginalMember(owner = "client!fp", name = "o", descriptor = "I")
    public static int field2925;

    @OriginalMember(owner = "client!fp", name = "q", descriptor = "I")
    public static int field2927;

    @OriginalMember(owner = "client!fp", name = "r", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!fp", name = "u", descriptor = "I")
    public static int field2931;

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(ZB)V", line = 3)
    public static final void method1365(boolean arg0, byte arg1) {
        field2923++;
        class275.field3658 = 0;
        class508.field7361 = 0;
        int var2 = -101 / ((arg1 - 36) / 57);
        class447.method2766((byte) 50);
        class485.method2949(arg0, 3);
        class530.method3140(false);
        for (int var3 = 0; var3 < class508.field7361; var3++) {
            int var5 = class19.field174[var3];
            if (class483.field7125 && class463.method2838(true, var5)) {
                class95.method530((byte) 8);
            }
            if (class532.field7836 != class339.field4484[var5].field1229) {
                if (class339.field4484[var5].field220.method1357(true)) {
                    class355.method2083((byte) 34, class339.field4484[var5]);
                }
                class339.field4484[var5].method124(true, null);
                class339.field4484[var5] = null;
            }
        }
        if (class132.field1742 != class334.field4414.field5729) {
            throw new RuntimeException("gnp1 pos:" + class334.field4414.field5729 + " psize:" + class132.field1742);
        }
        for (int var4 = 0; var4 < class401.field5813; var4++) {
            if (class339.field4484[class337.field4465[var4]] == null) {
                throw new RuntimeException("gnp2 pos:" + var4 + " size:" + class401.field5813);
            }
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(IIIIIIIII)V", line = 61)
    public static final void method1366(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = 110 / ((-arg3 - 73) / 38);
        field2924++;
        class340.method1980(arg1, arg6, arg8, arg2, arg4, arg7, 29308, arg5, 0, arg0);
    }

    @OriginalMember(owner = "client!fp", name = "<init>", descriptor = "(II)V", line = 71)
    public class214(int arg0, int arg1) {
        this.field2922 = arg0;
        this.field2926 = arg1;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(B)V", line = 82)
    public static void method1367(byte arg0) {
        int var1 = -52 % ((arg0 + 29) / 39);
        field2929 = null;
        field2930 = null;
    }

    @OriginalMember(owner = "client!fp", name = "c", descriptor = "(I)I", line = 92)
    public static final int method1368(int arg0) {
        if (arg0 != -24880) {
            field2929 = null;
        }
        field2925++;
        if (class188.field2436 == null) {
            if (!class483.field7125 && class391.field5656 > 0) {
                if (class59.field690 && class413.field5893.method1472(28251, 81) && class391.field5656 > 2) {
                    return ((class36) class69.field806.field2165.field6345.field6345).field366;
                }
                return ((class36) class69.field806.field2165.field6345).field366;
            }
            int var1 = class148.field1951.method349((byte) -103);
            int var2 = class148.field1951.method347(-127);
            int var3 = class451.field6723;
            int var4 = class155.field2026;
            int var5 = class366.field4993;
            if (var1 > var3 && var3 + var5 > var1) {
                int var6 = -1;
                for (int var7 = 0; var7 < class391.field5656; var7++) {
                    if (class144.field1922) {
                        int var11 = (class391.field5656 - var7 - 1) * 16 + var4 + 33;
                        if ((var11 - 13) < var2 && (var11 + 3) >= var2) {
                            var6 = var7;
                        }
                    } else {
                        int var12 = (class391.field5656 - var7 - 1) * 16 + var4 + 31;
                        if (var2 > var12 - 13 && (var12 + 3) >= var2) {
                            var6 = var7;
                        }
                    }
                }
                if (var6 != -1) {
                    int var8 = 0;
                    class10 var9 = new class10(class69.field806);
                    for (class36 var10 = (class36) var9.method68(-61); var10 != null; var10 = (class36) var9.method65((byte) -19)) {
                        if ((var8++) == var6) {
                            return var10.field366;
                        }
                    }
                }
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "(B)V", line = 182)
    public static final void method1369(byte arg0) {
        field2928++;
        if (class168.field2174 == -1 || arg0 <= 2) {
            return;
        }
        int var1 = class148.field1951.method349((byte) 80);
        int var2 = class148.field1951.method347(-120);
        class299 var3 = (class299) class333.field4405.method970(12);
        if (var3 != null) {
            var1 = var3.method1760(1);
            var2 = var3.method1755(3);
        }
        class302.method1806(class372.field5051, class430.field6244, var2, 0, 0, 20707, 0, class168.field2174, var1, 0);
        if (class530.field7772 != null) {
            class358.method2121(var2, var1, 16);
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(I[BBIII)V", line = 216)
    public static final void method1370(int arg0, byte[] arg1, byte arg2, int arg3, int arg4, int arg5) {
        field2927++;
        if (arg4 >= arg0) {
            return;
        }
        int var6 = arg4 + arg5;
        int var7 = arg0 - arg4 >> 2;
        if (arg2 < 3) {
            field2931 = 38;
        }
        while (true) {
            var7--;
            if (var7 < 0) {
                int var8 = arg0 - arg4 & 0x3;
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        return;
                    }
                    arg1[var6++] = 1;
                }
            }
            arg1[var6++] = 1;
            arg1[var6++] = 1;
            arg1[var6++] = 1;
            arg1[var6++] = 1;
        }
    }
}
