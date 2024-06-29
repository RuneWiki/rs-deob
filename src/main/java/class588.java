import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public class class588 extends class232 {

    @OriginalMember(owner = "client!bw", name = "y", descriptor = "I")
    private int field8531 = 0;

    @OriginalMember(owner = "client!bw", name = "B", descriptor = "Llp;")
    private class329 field8534 = new class329();

    @OriginalMember(owner = "client!bw", name = "u", descriptor = "F")
    public static float field8527 = 1024.0F;

    @OriginalMember(owner = "client!bw", name = "z", descriptor = "Lrg;")
    public static class548 field8532 = new class548(28, 3);

    @OriginalMember(owner = "client!bw", name = "D", descriptor = "Lcea;")
    public static class180 field8536 = new class180("Self", "Mich", "Moi", "Eu");

    @OriginalMember(owner = "client!bw", name = "E", descriptor = "I")
    public static int field8537 = 0;

    @OriginalMember(owner = "client!bw", name = "o", descriptor = "I")
    public static int field8521;

    @OriginalMember(owner = "client!bw", name = "p", descriptor = "I")
    public static int field8522;

    @OriginalMember(owner = "client!bw", name = "q", descriptor = "I")
    public static int field8523;

    @OriginalMember(owner = "client!bw", name = "r", descriptor = "I")
    public static int field8524;

    @OriginalMember(owner = "client!bw", name = "s", descriptor = "I")
    public static int field8525;

    @OriginalMember(owner = "client!bw", name = "t", descriptor = "I")
    public static int field8526;

    @OriginalMember(owner = "client!bw", name = "v", descriptor = "I")
    public static int field8528;

    @OriginalMember(owner = "client!bw", name = "w", descriptor = "I")
    public static int field8529;

    @OriginalMember(owner = "client!bw", name = "x", descriptor = "I")
    public static int field8530;

    @OriginalMember(owner = "client!bw", name = "A", descriptor = "I")
    public static int field8533;

    @OriginalMember(owner = "client!bw", name = "C", descriptor = "I")
    public static int field8535;

    @OriginalMember(owner = "client!bw", name = "F", descriptor = "I")
    public static int field8538;

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(Ldg;Z)V")
    public final void method1327(class349 arg0, boolean arg1) {
        ++field8523;
        super.field2870[super.field2862] = 21;
        super.field2869[super.field2862] = arg0;
        ++super.field2862;
        if (~super.field2862 <= -5001) {
            super.field2862 = 0;
        }
        if (!arg1) {
            method3410((byte) 5);
        }
    }

    @OriginalMember(owner = "client!bw", name = "c", descriptor = "(B)V")
    public static final void method3410(byte arg0) {
        class529.method3010((long) class335.field4358, (byte) 91, class210.field2560);
        ++field8521;
        if (class599.field8668 != -1) {
            class104.method616(class599.field8668, -1);
        }
        for (int var1 = 0; ~class315.field4023 < ~var1; ++var1) {
            if (class371.field4888[var1]) {
                class468.field6543[var1] = true;
            }
            class200.field2400[var1] = class371.field4888[var1];
            class371.field4888[var1] = false;
        }
        class636.field9146 = class335.field4358;
        if (arg0 < 35) {
            field8538 = 82;
        }
        if (class210.field2560.method271()) {
            class95.field1167 = true;
        }
        if (~class599.field8668 != 0) {
            class315.field4023 = 0;
            class309.method1714(906);
        }
        class210.field2560.method1182();
        class356.method2002(class210.field2560, 17276);
        int var2 = class171.method955((byte) -53);
        if (~var2 == 0) {
            var2 = class71.field684;
        }
        if (~var2 == 0) {
            var2 = class529.field7434;
        }
        class205.method1097((byte) 74, var2);
        class590.field8557 = 0;
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(Ldg;B)V")
    public final void method1331(class349 arg0, byte arg1) {
        super.field2870[super.field2862] = 20;
        ++field8526;
        super.field2869[super.field2862] = arg0;
        ++super.field2862;
        if (~super.field2862 <= -5001) {
            super.field2862 = 0;
        }
        int var3 = -125 % ((33 - arg1) / 58);
    }

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "(I)V")
    public static void method3411(int arg0) {
        if (arg0 < 50) {
            method3413(71, (byte) 38);
        }
        field8536 = null;
        field8532 = null;
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(B)V")
    public final void method1323(byte arg0) {
        ++field8524;
        while (super.field2864 != super.field2862) {
            this.method3412(-3383);
        }
        if (arg0 <= 104) {
            this.field8534 = null;
        }
    }

    @OriginalMember(owner = "client!bw", name = "c", descriptor = "(I)V")
    private final void method3412(int arg0) {
        ++field8522;
        int var2 = super.field2864++;
        if (~super.field2864 <= -5001) {
            super.field2864 = 0;
        }
        if (arg0 == -3383) {
            this.field8531 = super.field2870[var2];
            Object var3 = super.field2869[var2];
            super.field2869[var2] = null;
            if (this.field8531 == 21) {
                class167.method930(this.field8534, (class349) var3);
            } else if (~this.field8531 != -21) {
                if (this.field8531 >= 30 && ~this.field8531 >= -34) {
                    class638.field9190.method1106(3000.0F, super.field2863[var2] * 1.5F);
                    ((class174) var3).method854(class144.field1735, class222.field2728, class244.field3140, class201.field2419, ~(this.field8531 + -30) == -1);
                } else if (this.field8531 >= 40 && ~this.field8531 >= -44) {
                    class638.field9190.method1106(3000.0F, super.field2863[var2] * 1.5F);
                    ((class174) var3).method854(class144.field1735, class222.field2728, class244.field3140, class78.field918, this.field8531 - 40 == 0);
                } else if (~this.field8531 == -23) {
                    class638.field9190.method1164(-1, 1583160, 40, 127);
                } else {
                    if (this.field8531 != 23) {
                        if (this.field8531 == 24) {
                            class638.field9190.method1193(0, (class469[]) null);
                            return;
                        }
                    } else {
                        class638.field9190.method1146();
                    }
                }
            } else {
                class349 var4 = (class349) var3;
                if (var4.field4496 != null) {
                    var4.field4496.method326(29657, class638.field9190);
                }
                if (var4.field4497 != null) {
                    var4.field4497.method326(arg0 + 33040, class638.field9190);
                }
                if (var4.field4507 != null) {
                    var4.field4507.method326(arg0 ^ -32496, class638.field9190);
                }
                if (var4.field4498 != null) {
                    var4.field4498.method326(29657, class638.field9190);
                }
                if (var4.field4506 != null) {
                    var4.field4506.method326(29657, class638.field9190);
                }
                for (class61 var5 = var4.field4499; var5 != null; var5 = var5.field595) {
                    var5.field589.method326(29657, class638.field9190);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(Lsa;IIZF)V")
    public final void method1330(class174 arg0, int arg1, int arg2, boolean arg3, float arg4) {
        ++field8533;
        super.field2870[super.field2862] = (byte) (!arg3 ? arg1 + 30 : arg1 + 40);
        if (arg2 != 15547) {
            this.method1333(-127, 4);
        }
        super.field2869[super.field2862] = arg0;
        super.field2863[super.field2862] = arg4;
        ++super.field2862;
        if (super.field2862 >= 5000) {
            super.field2862 = 0;
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(II)V")
    public final void method1333(int arg0, int arg1) {
        super.field2870[super.field2862] = (byte) arg1;
        ++field8535;
        if (arg0 != 18936) {
            this.method1324(33, true);
        }
        ++super.field2862;
        if (super.field2862 >= 5000) {
            super.field2862 = 0;
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(IB)Z")
    public static final boolean method3413(int arg0, byte arg1) {
        if (arg1 > -34) {
            method3410((byte) 17);
        }
        ++field8528;
        return ~arg0 == -3 || ~arg0 == -5 || ~arg0 == -6;
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(ILdg;)V")
    public final void method1326(int arg0, class349 arg1) {
        --super.field2864;
        ++field8530;
        if (~super.field2864 > -1) {
            super.field2864 = 4999;
        }
        super.field2870[super.field2864] = 21;
        super.field2869[super.field2864] = arg1;
        if (arg0 != -15218) {
            field8532 = null;
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(I)V")
    public final void method1329(int arg0) {
        ++field8525;
        if (arg0 != 5000) {
            method3413(-3, (byte) -28);
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(IZ)V")
    public final void method1324(int arg0, boolean arg1) {
        ++field8529;
        if (arg1) {
            field8537 = 13;
        }
    }

    static {
        new class180("Invalid player name.", "Unzulässiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inválido.");
    }
}
