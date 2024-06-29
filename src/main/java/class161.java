import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class161 extends class196 {

    @OriginalMember(owner = "client!ga", name = "T", descriptor = "I")
    private int field2637 = 4096;

    @OriginalMember(owner = "client!ga", name = "Z", descriptor = "I")
    private int field2643 = 0;

    @OriginalMember(owner = "client!ga", name = "Q", descriptor = "Ldf;")
    private static class51 field2634 = class46.method233("Connection lost)3", 100);

    @OriginalMember(owner = "client!ga", name = "U", descriptor = "Ldf;")
    public static class51 field2638 = field2634;

    @OriginalMember(owner = "client!ga", name = "X", descriptor = "[I")
    public static int[] field2641 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2 };

    @OriginalMember(owner = "client!ga", name = "bb", descriptor = "Ldf;")
    public static class51 field2645 = class46.method233("; Max)2Age=", 100);

    @OriginalMember(owner = "client!ga", name = "db", descriptor = "Ldf;")
    public static class51 field2647 = class46.method233("Mitglieder)2Welt", 100);

    @OriginalMember(owner = "client!ga", name = "eb", descriptor = "Ldf;")
    public static class51 field2648 = class46.method233("Cabbage", 100);

    @OriginalMember(owner = "client!ga", name = "R", descriptor = "I")
    public static int field2635;

    @OriginalMember(owner = "client!ga", name = "S", descriptor = "I")
    public static int field2636;

    @OriginalMember(owner = "client!ga", name = "W", descriptor = "I")
    public static int field2640;

    @OriginalMember(owner = "client!ga", name = "ab", descriptor = "I")
    public static int field2644;

    @OriginalMember(owner = "client!ga", name = "cb", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "client!ga", name = "Y", descriptor = "Ljava/awt/Font;")
    public static Font field2642;

    @OriginalMember(owner = "client!ga", name = "V", descriptor = "[I")
    public static int[] field2639;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILlb;B)V")
    public final void method44(int arg0, class121 arg1, byte arg2) {
        ++field2640;
        if (arg2 != 82) {
            method1140((byte) -103);
        }
        if (~arg0 != -1) {
            if (arg0 == 1) {
                this.field2637 = arg1.method876(false);
            }
        } else {
            this.field2643 = arg1.method876(false);
        }
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "()V")
    public class161() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "(B)V")
    public static final void method1140(byte arg0) {
        class192.field3220.method1353(-115);
        if (arg0 != -125) {
            field2647 = null;
        }
        ++field2635;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lwc;IIIBIII)V")
    public static final void method1141(class213 arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        if (class169.field2742) {
            class122.field2080 = 32;
        } else {
            class122.field2080 = 0;
        }
        if (arg4 != -10) {
            field2641 = null;
        }
        class169.field2742 = false;
        ++field2646;
        if (class147.field2473 != 0) {
            if (~arg6 <= ~arg7 && arg7 + 16 > arg6 && ~arg5 >= ~arg2 && ~(arg5 + 16) < ~arg2) {
                arg0.field3593 -= 4;
                class25.method135(arg0, arg4 + -28004);
            } else if (~arg6 <= ~arg7 && ~(arg7 + 16) < ~arg6 && arg2 >= arg5 + -16 - -arg1 && ~arg2 > ~(arg1 + arg5)) {
                arg0.field3593 += 4;
                class25.method135(arg0, arg4 + -28004);
            } else if (arg7 - class122.field2080 <= arg6 && ~arg6 > ~(arg7 + 16 + class122.field2080) && ~(arg5 + 16) >= ~arg2 && ~arg2 > ~(arg1 + -16 + arg5)) {
                int var8 = (arg1 + -32) * arg1 / arg3;
                if (~var8 > -9) {
                    var8 = 8;
                }
                int var9 = -arg5 + arg2 - (var8 / 2 + 16);
                int var10 = -var8 + arg1 + -32;
                arg0.field3593 = (arg3 - arg1) * var9 / var10;
                class25.method135(arg0, arg4 + -28004);
                class169.field2742 = true;
            }
        }
        if (class43.field689 != 0) {
            int var11 = arg0.field3603;
            if (~arg6 <= ~(-var11 + arg7) && ~arg5 >= ~arg2 && arg7 + 16 > arg6 && arg1 + arg5 >= arg2) {
                arg0.field3593 += class43.field689 * 45;
                class25.method135(arg0, arg4 ^ 28004);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IZBIILlb;III)V")
    public static final void method1142(int arg0, boolean arg1, byte arg2, int arg3, int arg4, class121 arg5, int arg6, int arg7, int arg8) {
        if (arg2 < 38) {
            field2645 = null;
        }
        if (~arg4 <= -1 && ~arg4 > -105 && ~arg0 <= -1 && arg0 < 104) {
            if (!arg1) {
                class160.field2626[arg7][arg4][arg0] = 0;
            }
            while (true) {
                int var9 = arg5.method897(105);
                if (var9 == 0) {
                    if (arg1) {
                        class172.field2820[0][arg4][arg0] = class101.field1682[0][arg4][arg0];
                    } else if (~arg7 == -1) {
                        class172.field2820[0][arg4][arg0] = 8 * -class180.method1280(556238 - -arg0 + arg8, 826665185, arg3 + arg4 + 932731);
                    } else {
                        class172.field2820[arg7][arg4][arg0] = class172.field2820[arg7 + -1][arg4][arg0] - 240;
                    }
                    break;
                }
                if (var9 == 1) {
                    int var10 = arg5.method897(123);
                    if (!arg1) {
                        if (~var10 == -2) {
                            var10 = 0;
                        }
                        if (arg7 == 0) {
                            class172.field2820[0][arg4][arg0] = -var10 * 8;
                        } else {
                            class172.field2820[arg7][arg4][arg0] = class172.field2820[arg7 + -1][arg4][arg0] + -(var10 * 8);
                        }
                    } else {
                        class172.field2820[0][arg4][arg0] = var10 * 8 + class101.field1682[0][arg4][arg0];
                    }
                    break;
                }
                if (~var9 >= -50) {
                    class3.field18[arg7][arg4][arg0] = arg5.method912((byte) -90);
                    class57.field954[arg7][arg4][arg0] = (byte) ((var9 - 2) / 4);
                    class195.field3263[arg7][arg4][arg0] = (byte) class191.method1366(3, arg6 + -2 + var9);
                } else if (var9 <= 81) {
                    if (!arg1) {
                        class160.field2626[arg7][arg4][arg0] = (byte) (var9 - 49);
                    }
                } else {
                    class142.field2383[arg7][arg4][arg0] = (byte) (var9 + -81);
                }
            }
        } else {
            while (true) {
                int var11 = arg5.method897(111);
                if (~var11 == -1) {
                    break;
                }
                if (var11 == 1) {
                    arg5.method897(-118);
                    break;
                }
                if (var11 <= 49) {
                    arg5.method897(109);
                }
            }
        }
        ++field2636;
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(II)[I")
    public final int[] method45(int arg0, int arg1) {
        ++field2644;
        if (arg1 != 10565) {
            this.method44(-16, (class121) null, (byte) -80);
        }
        int[] var3 = super.field3274.method1476(true, arg0);
        if (super.field3274.field3741) {
            int[] var4 = this.method1390(arg0, 0, -80);
            for (int var5 = 0; var5 < class49.field767; ++var5) {
                int var6 = var4[var5];
                var3[var5] = ~var6 <= ~this.field2643 && ~this.field2637 <= ~var6 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "(I)V")
    public static void method1143(int arg0) {
        field2634 = null;
        if (arg0 != 0) {
            field2639 = null;
        }
        field2641 = null;
        field2645 = null;
        field2642 = null;
        field2639 = null;
        field2638 = null;
        field2648 = null;
        field2647 = null;
    }
}
