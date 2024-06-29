import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class17 {

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "I")
    public static volatile int field207 = -1;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "I")
    public static int field203;

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "I")
    public static int field204;

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "I")
    public static int field205;

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "I")
    public static int field208;

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "I")
    public static int field209;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(BIIIIIII)V")
    public static final void method90(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = arg1 + arg5;
        field205++;
        int var9 = arg2 - arg5;
        if (arg0 != 71) {
            method92((byte) -90, -21);
        }
        int var10 = arg5 + arg7;
        for (int var11 = arg1; var11 < var8; var11++) {
            class93.method598(-7, arg4, arg7, class167.field2735[var11], arg3);
        }
        int var12 = arg4 - arg5;
        for (int var13 = arg2; var13 > var9; var13--) {
            class93.method598(-7, arg4, arg7, class167.field2735[var13], arg3);
        }
        for (int var14 = var8; var14 <= var9; var14++) {
            int[] var15 = class167.field2735[var14];
            class93.method598(arg0 - 78, var10, arg7, var15, arg3);
            class93.method598(arg0 - 78, var12, var10, var15, arg6);
            class93.method598(-7, arg4, var12, var15, arg3);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method91(String arg0, int arg1) {
        if (arg1 < 84) {
            field207 = 18;
        }
        field208++;
        System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        System.exit(1);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(BI)Lfj;")
    public static final class276 method92(byte arg0, int arg1) {
        field209++;
        if (arg0 != 34) {
            return null;
        } else if (arg1 == 0) {
            return new class234();
        } else if (arg1 == 1) {
            return new class179();
        } else if (arg1 == 2) {
            return new class145();
        } else if (arg1 == 3) {
            return new class274();
        } else if (arg1 == 4) {
            return new class77();
        } else if (arg1 == 5) {
            return new class119();
        } else if (arg1 == 6) {
            return new class97();
        } else if (arg1 == 7) {
            return new class54();
        } else if (arg1 == 8) {
            return new class270();
        } else if (arg1 == 9) {
            return new class125();
        } else if (arg1 == 10) {
            return new class48();
        } else if (arg1 == 11) {
            return new class188();
        } else if (arg1 == 12) {
            return new class217();
        } else if (arg1 == 13) {
            return new class294();
        } else if (arg1 == 14) {
            return new class91();
        } else if (arg1 == 15) {
            return new class153();
        } else if (arg1 == 16) {
            return new class293();
        } else if (arg1 == 17) {
            return new class201();
        } else if (arg1 == 18) {
            return new class84();
        } else if (arg1 == 19) {
            return new class140();
        } else if (arg1 == 20) {
            return new class178();
        } else if (arg1 == 21) {
            return new class79();
        } else if (arg1 == 22) {
            return new class191();
        } else if (arg1 == 23) {
            return new class264();
        } else if (arg1 == 24) {
            return new class255();
        } else if (arg1 == 25) {
            return new class228();
        } else if (arg1 == 26) {
            return new class107();
        } else if (arg1 == 27) {
            return new class87();
        } else if (arg1 == 28) {
            return new class4();
        } else if (arg1 == 29) {
            return new class286();
        } else if (arg1 == 30) {
            return new class254();
        } else if (arg1 == 31) {
            return new class187();
        } else if (arg1 == 32) {
            return new class275();
        } else if (arg1 == 33) {
            return new class205();
        } else if (arg1 == 34) {
            return new class227();
        } else if (arg1 == 35) {
            return new class102();
        } else if (arg1 == 36) {
            return new class245();
        } else if (arg1 == 37) {
            return new class105();
        } else if (arg1 == 38) {
            return new class175();
        } else if (arg1 == 39) {
            return new class155();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)Ljg;")
    public static final class157 method93(int arg0, int arg1) {
        class157 var2 = (class157) class33.field473.method3(32, (long) arg0);
        field204++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class114.field2057.method746(arg0, (byte) -128, 5);
        class157 var4 = new class157();
        if (var3 != null) {
            var4.method1079(new class101(var3), (byte) -68);
        }
        class33.field473.method4(0, var4, (long) arg0);
        if (arg1 <= 31) {
            field207 = 22;
        }
        return var4;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(III)V")
    public static final void method94(int arg0, int arg1, int arg2) {
        if (class71.field1163 > 0) {
            class228.method1531((byte) -109, class71.field1163);
            class71.field1163 = 0;
        }
        field203++;
        if (arg1 < 80) {
            return;
        }
        short var3 = 256;
        int var4 = 0;
        int var5 = class283.field4491 * arg2;
        int var6 = 0;
        for (int var7 = 1; var7 < (var3 - 1); var7++) {
            int var8 = (var3 - var7) * class207.field3450[var7] / var3;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var11 = class283.field4490[var5++ + arg0];
                int var12 = class190.field3078[var4++];
                if (var12 == 0) {
                    class119.field2113.field3189[var6++] = var11;
                } else {
                    int var13 = -(var12 - 256) - 18;
                    if (var13 > 255) {
                        var13 = 255;
                    }
                    int var14 = var12 + 18;
                    int var15 = class246.field4037[var12];
                    if (var14 > 255) {
                        var14 = 255;
                    }
                    class119.field2113.field3189[var6++] = class113.method791(class113.method791(var11, 16711935) * var13 + class113.method791(16711935, var15) * var14, -16711936) + class113.method791(var13 * class113.method791(65280, var11) + var14 * class113.method791(65280, var15), 16711680) >> 8;
                }
            }
            for (int var10 = 0; var10 < var8; var10++) {
                class119.field2113.field3189[var6++] = class283.field4490[arg0 + (var5++)];
            }
            var5 += class283.field4491 - 128;
        }
        class119.field2113.method452(arg0, arg2);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Z)V")
    public static final void method95(boolean arg0) {
        field206++;
        if (!arg0) {
            class248.field4083.method473(32);
            class146.field2484 = 1;
            class169.field2791 = null;
        }
    }
}
