import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class192 extends class203 {

    @OriginalMember(owner = "client!s", name = "r", descriptor = "I")
    private int field2665 = 0;

    @OriginalMember(owner = "client!s", name = "p", descriptor = "Lnb;")
    private class340 field2663 = new class340();

    @OriginalMember(owner = "client!s", name = "s", descriptor = "[I")
    public static int[] field2666 = new int[] { 28, 35, 40, 44 };

    @OriginalMember(owner = "client!s", name = "D", descriptor = "I")
    public static int field2676 = 0;

    @OriginalMember(owner = "client!s", name = "E", descriptor = "Luc;")
    public static class51 field2677 = new class51(50);

    @OriginalMember(owner = "client!s", name = "G", descriptor = "Ljava/lang/String;")
    public static String field2679 = "Your ignore list is full. Max of 100 users.";

    @OriginalMember(owner = "client!s", name = "F", descriptor = "I")
    public static int field2678 = 0;

    @OriginalMember(owner = "client!s", name = "H", descriptor = "I")
    public static int field2680 = 0;

    @OriginalMember(owner = "client!s", name = "q", descriptor = "I")
    public static int field2664;

    @OriginalMember(owner = "client!s", name = "t", descriptor = "I")
    public static int field2667;

    @OriginalMember(owner = "client!s", name = "u", descriptor = "I")
    public static int field2668;

    @OriginalMember(owner = "client!s", name = "v", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!s", name = "w", descriptor = "I")
    public static int field2670;

    @OriginalMember(owner = "client!s", name = "x", descriptor = "I")
    public static int field2671;

    @OriginalMember(owner = "client!s", name = "y", descriptor = "I")
    public static int field2672;

    @OriginalMember(owner = "client!s", name = "z", descriptor = "I")
    public static int field2673;

    @OriginalMember(owner = "client!s", name = "A", descriptor = "I")
    public static int field2674;

    @OriginalMember(owner = "client!s", name = "B", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Ldh;I)V")
    public final void method1275(class77 arg0, int arg1) {
        ++field2668;
        super.field2805[super.field2798] = 20;
        super.field2800[super.field2798] = arg0;
        ++super.field2798;
        if (arg1 == -25427) {
            if (super.field2798 >= 5000) {
                super.field2798 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ZLdh;)V")
    public final void method1276(boolean arg0, class77 arg1) {
        super.field2805[super.field2798] = 21;
        ++field2664;
        if (arg0) {
            field2676 = -107;
        }
        super.field2800[super.field2798] = arg1;
        ++super.field2798;
        if (super.field2798 >= 5000) {
            super.field2798 = 0;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(BLdh;)V")
    public final void method1277(byte arg0, class77 arg1) {
        ++field2674;
        --super.field2808;
        if (super.field2808 < 0) {
            super.field2808 = 4999;
        }
        super.field2805[super.field2808] = 21;
        if (arg0 != 40) {
            field2677 = null;
        }
        super.field2800[super.field2808] = arg1;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II)V")
    public final void method1278(int arg0, int arg1) {
        super.field2805[super.field2798] = (byte) arg1;
        ++field2673;
        ++super.field2798;
        if (super.field2798 >= 5000) {
            super.field2798 = 0;
        }
        if (arg0 != -9877) {
            this.method1277((byte) 74, (class77) null);
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V")
    public final void method1279(int arg0) {
        ++field2670;
        while (~super.field2808 != ~super.field2798) {
            this.method1285((byte) 46);
        }
        if (arg0 != 8192) {
            this.method1283(28);
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Z)V")
    public static void method1280(boolean arg0) {
        field2666 = null;
        field2679 = null;
        field2677 = null;
        if (arg0) {
            method1284((byte) 90);
        }
    }

    @OriginalMember(owner = "client!s", name = "c", descriptor = "(II)V")
    public final void method1281(int arg0, int arg1) {
        ++field2672;
        int var3 = 103 % ((arg0 - -58) / 40);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ZFIILda;)V")
    public final void method1282(boolean arg0, float arg1, int arg2, int arg3, class193 arg4) {
        if (arg2 == 1) {
            ++field2667;
            super.field2805[super.field2798] = (byte) (arg0 ? arg3 + 40 : arg3 + 30);
            super.field2800[super.field2798] = arg4;
            super.field2807[super.field2798] = arg1;
            ++super.field2798;
            if (super.field2798 >= 5000) {
                super.field2798 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(I)V")
    public final void method1283(int arg0) {
        if (arg0 < 100) {
            field2676 = 39;
        }
        ++field2669;
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(B)V")
    public static final void method1284(byte arg0) {
        ++field2671;
        for (int var1 = 0; ~class93.field1274 < ~var1; ++var1) {
            int var2 = class62.field943[var1];
            class163 var3 = class388.field5670[var2];
            if (var3 != null) {
                class370.method2437(var3.field2206.field2590, -1, var3);
            }
        }
        if (arg0 != 45) {
            method1284((byte) -25);
        }
    }

    @OriginalMember(owner = "client!s", name = "c", descriptor = "(B)V")
    private final void method1285(byte arg0) {
        ++field2675;
        int var2 = super.field2808;
        if (arg0 >= 1) {
            ++super.field2808;
            if (super.field2808 >= 5000) {
                super.field2808 = 0;
            }
            this.field2665 = super.field2805[var2];
            Object var3 = super.field2800[var2];
            super.field2800[var2] = null;
            if (this.field2665 == 21) {
                class394.method2531(this.field2663, (class77) var3);
            } else if (~this.field2665 != -21) {
                if (~this.field2665 <= -31 && ~this.field2665 >= -34) {
                    class185.field2528.method481(3000.0F, super.field2807[var2] * 1.5F);
                    ((class193) var3).method739(class167.field2261, class437.field6352, class251.field3687, class277.field4069, this.field2665 - 30 == 0);
                } else if (this.field2665 >= 40 && ~this.field2665 >= -44) {
                    class185.field2528.method481(3000.0F, super.field2807[var2] * 1.5F);
                    ((class193) var3).method739(class167.field2261, class437.field6352, class251.field3687, class349.field5191, this.field2665 - 40 == 0);
                } else {
                    if (this.field2665 != 22) {
                        if (this.field2665 == 23) {
                            class185.field2528.method476();
                            return;
                        }
                        if (~this.field2665 == -25) {
                            class185.field2528.method505(0, (class16[]) null);
                            return;
                        }
                    } else {
                        class185.field2528.method525(-1, 1583160, 40);
                    }
                }
            } else {
                class77 var4 = (class77) var3;
                if (var4.field1067 != null) {
                    var4.field1067.method126((byte) 50, class185.field2528);
                }
                if (var4.field1087 != null) {
                    var4.field1087.method126((byte) 50, class185.field2528);
                }
                if (var4.field1063 != null) {
                    var4.field1063.method126((byte) 50, class185.field2528);
                }
                if (var4.field1076 != null) {
                    var4.field1076.method126((byte) 50, class185.field2528);
                }
                if (var4.field1079 != null) {
                    var4.field1079.method126((byte) 50, class185.field2528);
                }
                for (class356 var5 = var4.field1064; var5 != null; var5 = var5.field5275) {
                    var5.field5274.method126((byte) 50, class185.field2528);
                }
            }
        }
    }
}
