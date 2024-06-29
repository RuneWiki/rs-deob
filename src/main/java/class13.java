import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class13 extends class117 {

    @OriginalMember(owner = "client!ve", name = "X", descriptor = "I")
    private int field202 = -1;

    @OriginalMember(owner = "client!ve", name = "T", descriptor = "Lhh;")
    public static class163 field198 = class137.method1065("Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100", 17);

    @OriginalMember(owner = "client!ve", name = "eb", descriptor = "Lhh;")
    public static class163 field209 = class137.method1065("Clientscript error in: ", 17);

    @OriginalMember(owner = "client!ve", name = "fb", descriptor = "[I")
    public static int[] field210 = new int[25];

    @OriginalMember(owner = "client!ve", name = "gb", descriptor = "I")
    public static int field211 = -1;

    @OriginalMember(owner = "client!ve", name = "R", descriptor = "I")
    public static int field196;

    @OriginalMember(owner = "client!ve", name = "S", descriptor = "I")
    public static int field197;

    @OriginalMember(owner = "client!ve", name = "U", descriptor = "I")
    public static int field199;

    @OriginalMember(owner = "client!ve", name = "W", descriptor = "I")
    public static int field201;

    @OriginalMember(owner = "client!ve", name = "Y", descriptor = "I")
    public int field203;

    @OriginalMember(owner = "client!ve", name = "Z", descriptor = "I")
    public static int field204;

    @OriginalMember(owner = "client!ve", name = "bb", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!ve", name = "cb", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!ve", name = "db", descriptor = "I")
    public int field208;

    @OriginalMember(owner = "client!ve", name = "ib", descriptor = "I")
    public static int field213;

    @OriginalMember(owner = "client!ve", name = "hb", descriptor = "Lpa;")
    public static class123 field212;

    @OriginalMember(owner = "client!ve", name = "V", descriptor = "[I")
    public static int[] field200;

    @OriginalMember(owner = "client!ve", name = "ab", descriptor = "[I")
    public int[] field205;

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "(I)Z")
    public final boolean method85(int arg0) {
        ++field196;
        if (this.field205 != null) {
            return true;
        } else if (this.field202 >= arg0) {
            class105 var2 = class133.method1049(class157.field2917, this.field202, -31550);
            var2.method844();
            this.field205 = var2.field2012;
            this.field208 = var2.field1337;
            this.field203 = var2.field1336;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "(I)V")
    public final void method86(int arg0) {
        ++field204;
        super.method86(arg0);
        this.field205 = null;
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "()V")
    public class13() {
        super(0, false);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(BLqh;I)Lhh;")
    public static final class163 method87(byte arg0, class69 arg1, int arg2) {
        ++field199;
        if (arg0 >= -118) {
            field209 = null;
        }
        if (!class197.method1420(client.method826(arg1), arg2, (byte) -89) && arg1.field1212 == null) {
            return null;
        } else if (arg1.field1296 != null && arg1.field1296.length > arg2 && arg1.field1296[arg2] != null && arg1.field1296[arg2].method1194(1).method1221(-23096) != 0) {
            return arg1.field1296[arg2];
        } else {
            return class127.field2470 ? class145.method1101(0, new class163[] { class170.field3107, class136.method1061(arg2, (byte) 115) }) : null;
        }
    }

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(B)I")
    public final int method88(byte arg0) {
        ++field213;
        if (arg0 > -71) {
            method89((byte) 85);
        }
        return this.field202;
    }

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "(B)V")
    public static void method89(byte arg0) {
        field209 = null;
        field198 = null;
        if (arg0 <= -126) {
            field212 = null;
            field210 = null;
            field200 = null;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IILpg;)V")
    public final void method60(int arg0, int arg1, class81 arg2) {
        if (arg0 == 0) {
            if (~arg1 == -1) {
                this.field202 = arg2.method658(85);
            }
            ++field207;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IZ)[[I")
    public int[][] method90(int arg0, boolean arg1) {
        if (!arg1) {
            field200 = null;
        }
        ++field206;
        int[][] var3 = super.field2228.method1304(arg0, (byte) -70);
        if (super.field2228.field3221 && this.method85(0)) {
            int[] var4 = var3[0];
            int[] var5 = var3[2];
            int var6 = (~class1.field26 == ~this.field208 ? arg0 : this.field208 * arg0 / class1.field26) * this.field203;
            int[] var7 = var3[1];
            if (class143.field2702 != this.field203) {
                for (int var8 = 0; ~var8 > ~class143.field2702; ++var8) {
                    int var9 = this.field203 * var8 / class143.field2702;
                    int var10 = this.field205[var6 - -var9];
                    var5[var8] = class7.method50(var10 << 4, 4080);
                    var7[var8] = class7.method50(4080, var10 >> 4);
                    var4[var8] = class7.method50(4080, var10 >> 12);
                }
            } else {
                for (int var11 = 0; class143.field2702 > var11; ++var11) {
                    int var12 = this.field205[var6++];
                    var5[var11] = class7.method50(4080, var12 << 4);
                    var7[var11] = class7.method50(var12 >> 4, 4080);
                    var4[var11] = class7.method50(var12 >> 12, 4080);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lhh;I)V")
    public static final void method91(class163 arg0, int arg1) {
        ++field197;
        if (class99.field1920 >= 2) {
            if (arg0.method1228(class45.field762, -57)) {
                class7.method51(-75);
                for (int var2 = 0; ~var2 > -11; ++var2) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() + -var3.freeMemory()) / 1024L);
                class56.method396(class145.method1101(0, new class163[] { class136.field2638, class136.method1061(var4, (byte) 115), class67.field1146 }), 126, (class163) null, 0);
            }
            if (arg0.method1228(class216.field3937, 100)) {
                class62.method426((byte) -100);
            }
            if (arg0.method1228(class17.field255, -12)) {
                class174.method1292(25, true);
            }
            if (arg0.method1228(class6.field107, -126)) {
                class174.field3172 = true;
            }
            if (arg0.method1228(class164.field3031, arg1 + -4088)) {
                class174.field3172 = false;
            }
            if (arg0.method1228(class7.field125, arg1 + -3974)) {
                for (int var5 = 0; var5 < 4; ++var5) {
                    for (int var6 = 1; var6 < 103; ++var6) {
                        for (int var7 = 1; var7 < 103; ++var7) {
                            class140.field2670[var5].field11[var6][var7] = 0;
                        }
                    }
                }
            }
            if (arg0.method1212(class171.field3139, arg1 + -4080) && ~class147.field2794 != -1) {
                class237.method1645((byte) 58, arg0.method1216(6, (byte) -127).method1207((byte) 95));
            }
            if (arg0.method1228(class60.field995, 6) && class147.field2794 == 2) {
                throw new RuntimeException();
            }
            if (arg0.method1212(class64.field1088, 0)) {
                class129.field2515 = arg0.method1216(12, (byte) -125).method1194(1).method1207((byte) 122);
                class56.method396(class145.method1101(0, new class163[] { class48.field811, class136.method1061(class129.field2515, (byte) 124) }), 98, (class163) null, 0);
            }
            if (arg0.method1228(class174.field3163, 125)) {
                class127.field2470 = true;
            }
        }
        class191.field3499.method75(248, arg1 + -4049);
        class191.field3499.method655(0, -1 + arg0.method1221(arg1 ^ -21960));
        class191.field3499.method654(17048, arg0.method1216(2, (byte) -127));
        if (arg1 == 4080) {
            ++class196.field3533;
        }
    }
}
