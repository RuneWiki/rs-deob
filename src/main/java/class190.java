import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dga")
public class class190 {

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "I")
    public static int field2723;

    @OriginalMember(owner = "client!dga", name = "b", descriptor = "I")
    public static int field2724;

    @OriginalMember(owner = "client!dga", name = "c", descriptor = "I")
    public static int field2725;

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(BI)Lrk;")
    public static final class30 method1290(byte arg0, int arg1) {
        field2725++;
        if (arg0 != 4) {
            field2724 = -123;
        }
        if (arg1 == 0) {
            return new class320();
        } else if (arg1 == 1) {
            return new class554();
        } else if (arg1 == 2) {
            return new class513();
        } else if (arg1 == 3) {
            return new class498();
        } else if (arg1 == 4) {
            return new class645();
        } else if (arg1 == 5) {
            return new class23();
        } else if (arg1 == 6) {
            return new class574();
        } else if (arg1 == 7) {
            return new class244();
        } else if (arg1 == 8) {
            return new class131();
        } else if (arg1 == 9) {
            return new class152();
        } else if (arg1 == 10) {
            return new class8();
        } else if (arg1 == 11) {
            return new class570();
        } else if (arg1 == 12) {
            return new class299();
        } else if (arg1 == 13) {
            return new class107();
        } else if (arg1 == 14) {
            return new class531();
        } else if (arg1 == 15) {
            return new class383();
        } else if (arg1 == 16) {
            return new class76();
        } else if (arg1 == 17) {
            return new class324();
        } else if (arg1 == 18) {
            return new class326();
        } else if (arg1 == 19) {
            return new class339();
        } else if (arg1 == 20) {
            return new class334();
        } else if (arg1 == 21) {
            return new class45();
        } else if (arg1 == 22) {
            return new class127();
        } else if (arg1 == 23) {
            return new class377();
        } else if (arg1 == 24) {
            return new class10();
        } else if (arg1 == 25) {
            return new class332();
        } else if (arg1 == 26) {
            return new class21();
        } else if (arg1 == 27) {
            return new class250();
        } else if (arg1 == 28) {
            return new class654();
        } else if (arg1 == 29) {
            return new class273();
        } else if (arg1 == 30) {
            return new class402();
        } else if (arg1 == 31) {
            return new class391();
        } else if (arg1 == 32) {
            return new class302();
        } else if (arg1 == 33) {
            return new class423();
        } else if (arg1 == 34) {
            return new class629();
        } else if (arg1 == 35) {
            return new class71();
        } else if (arg1 == 36) {
            return new class505();
        } else if (arg1 == 37) {
            return new class473();
        } else if (arg1 == 38) {
            return new class319();
        } else if (arg1 == 39) {
            return new class418();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(Ltg;Z)Z")
    public static final boolean method1291(class210 arg0, boolean arg1) {
        boolean var2 = class52.field606 == class409.field5812;
        int var3 = 0;
        short var4 = 0;
        byte var5 = 0;
        arg0.method893((byte) -117);
        if (arg0.field2972 < 0 || arg0.field2963 < 0 || arg0.field2973 >= class335.field4511 || arg0.field2969 >= class643.field8878) {
            return false;
        }
        short var6 = 0;
        for (int var7 = arg0.field2972; var7 <= arg0.field2973; var7++) {
            for (int var11 = arg0.field2963; var11 <= arg0.field2969; var11++) {
                class390 var12 = class568.method3255(arg0.field4053, var7, var11);
                if (var12 != null) {
                    class467 var13 = class313.method1898(arg0, -30524);
                    class467 var14 = var12.field5536;
                    if (var14 == null) {
                        var12.field5536 = var13;
                    } else {
                        while (var14.field6421 != null) {
                            var14 = var14.field6421;
                        }
                        var14.field6421 = var13;
                    }
                    if (var2 && (class437.field6073[var7][var11] & 0xFF000000) != 0) {
                        var3 = class437.field6073[var7][var11];
                        var4 = class24.field305[var7][var11];
                        var5 = class523.field7099[var7][var11];
                    }
                    if (!arg1 && var12.field5524 != null && var12.field5524.field6341 > var6) {
                        var6 = var12.field5524.field6341;
                    }
                }
            }
        }
        if (var2 && (var3 & 0xFF000000) != 0) {
            for (int var8 = arg0.field2972; var8 <= arg0.field2973; var8++) {
                for (int var9 = arg0.field2963; var9 <= arg0.field2969; var9++) {
                    if ((class437.field6073[var8][var9] & 0xFF000000) == 0) {
                        class437.field6073[var8][var9] = var3;
                        class24.field305[var8][var9] = var4;
                        class523.field7099[var8][var9] = var5;
                    }
                }
            }
        }
        if (arg1) {
            class544.field7388[class590.field8286++] = arg0;
        } else {
            int var10 = class52.field606 == class409.field5812 ? 1 : 0;
            if (!arg0.method216(true)) {
                class420.field5921[var10][class466.field6417[var10]++] = arg0;
            } else if (arg0.method209((byte) 90)) {
                class216.field3061[var10][class582.field8197[var10]++] = arg0;
            } else {
                class383.field5425[var10][class89.field1287[var10]++] = arg0;
            }
        }
        if (arg1) {
            arg0.field4052 -= var6;
        }
        return true;
    }
}
