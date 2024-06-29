import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class177 {

    @OriginalMember(owner = "client!jl", name = "j", descriptor = "Z")
    public boolean field2624 = true;

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "I")
    public static int field2621 = 0;

    @OriginalMember(owner = "client!jl", name = "l", descriptor = "C")
    private char field2626;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "I")
    public int field2615;

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "I")
    public static int field2616;

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "I")
    public static int field2617;

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "I")
    public static int field2620;

    @OriginalMember(owner = "client!jl", name = "i", descriptor = "I")
    public static int field2623;

    @OriginalMember(owner = "client!jl", name = "k", descriptor = "Lmg;")
    public static class101 field2625;

    @OriginalMember(owner = "client!jl", name = "h", descriptor = "Lmi;")
    public static class342 field2622;

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "Ljava/lang/String;")
    public String field2619;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(ZII)Z")
    public static final boolean method1141(boolean arg0, int arg1, int arg2) {
        field2618++;
        if (!class181.field2659) {
            return false;
        }
        int var3 = arg1 >> 16;
        int var4 = arg1 & 0xFFFF;
        if (class495.field7226[var3] == null || class495.field7226[var3][var4] == null) {
            return false;
        }
        if (!arg0) {
            field2625 = null;
        }
        class150 var5 = class495.field7226[var3][var4];
        if (arg2 == -1 && var5.field2315 == 0) {
            for (class82 var6 = (class82) class526.field7778.method2818((byte) -124); var6 != null; var6 = (class82) class526.field7778.method2820((byte) -58)) {
                if (var6.field1230 == 57 || var6.field1230 == 1003 || var6.field1230 == 15 || var6.field1230 == 9 || var6.field1230 == 4) {
                    for (class150 var7 = class60.method497(var6.field1233, (byte) -127); var7 != null; var7 = class3.method9(121, var7)) {
                        if (var5.field2277 == var7.field2277) {
                            return true;
                        }
                    }
                }
            }
        } else {
            for (class82 var8 = (class82) class526.field7778.method2818((byte) 100); var8 != null; var8 = (class82) class526.field7778.method2820((byte) -58)) {
                if (var8.field1228 == arg2 && var5.field2277 == var8.field1233 && (var8.field1230 == 57 || var8.field1230 == 1003 || var8.field1230 == 15 || var8.field1230 == 9 || var8.field1230 == 4)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(ILsi;B)V")
    private final void method1142(int arg0, class391 arg1, byte arg2) {
        if (arg0 == 1) {
            this.field2626 = class52.method452(arg2 ^ 0xFFFF881E, arg1.method2337(arg2 ^ 0x2D));
        } else if (arg0 == 2) {
            this.field2615 = arg1.method2361((byte) -56);
        } else if (arg0 == 4) {
            this.field2624 = false;
        } else if (arg0 == 5) {
            this.field2619 = arg1.method2347((byte) 110);
        }
        field2620++;
        if (arg2 != -46) {
            this.method1145(null, -32);
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(B)Z")
    public final boolean method1143(byte arg0) {
        field2616++;
        if (arg0 > -46) {
            return false;
        } else {
            return this.field2626 == 's';
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)V")
    public static void method1144(int arg0) {
        field2625 = null;
        field2622 = null;
        if (arg0 != 57) {
            field2622 = null;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lsi;I)V")
    public final void method1145(class391 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2348(-2);
            if (var3 == 0) {
                int var4 = 43 % ((-arg1 - 4) / 52);
                field2623++;
                return;
            }
            this.method1142(var3, arg0, (byte) -46);
        }
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(B)V")
    public static final void method1146(byte arg0) {
        class45.field539 = 0;
        field2617++;
        if (arg0 != -94) {
            return;
        }
        int var1 = (class316.field4324.field1732 >> 7) + class510.field7566;
        int var2 = (class316.field4324.field1735 >> 7) + class14.field204;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class45.field539 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class45.field539 = 1;
        }
        if (class45.field539 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class45.field539 = 0;
        }
    }
}
