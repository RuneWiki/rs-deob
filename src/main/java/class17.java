import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public class class17 extends class76 implements class161 {

    @OriginalMember(owner = "client!wt", name = "R", descriptor = "Lah;")
    public class191 field193;

    @OriginalMember(owner = "client!wt", name = "A", descriptor = "Z")
    private boolean field177;

    @OriginalMember(owner = "client!wt", name = "P", descriptor = "I")
    public static int field191;

    @OriginalMember(owner = "client!wt", name = "L", descriptor = "S")
    public static short field187;

    @OriginalMember(owner = "client!wt", name = "y", descriptor = "I")
    public static int field175;

    @OriginalMember(owner = "client!wt", name = "z", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!wt", name = "B", descriptor = "I")
    public static int field178;

    @OriginalMember(owner = "client!wt", name = "C", descriptor = "I")
    public static int field179;

    @OriginalMember(owner = "client!wt", name = "D", descriptor = "I")
    public static int field180;

    @OriginalMember(owner = "client!wt", name = "E", descriptor = "I")
    public static int field181;

    @OriginalMember(owner = "client!wt", name = "F", descriptor = "I")
    public static int field182;

    @OriginalMember(owner = "client!wt", name = "G", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!wt", name = "H", descriptor = "I")
    public static int field184;

    @OriginalMember(owner = "client!wt", name = "J", descriptor = "I")
    public static int field185;

    @OriginalMember(owner = "client!wt", name = "K", descriptor = "I")
    public static int field186;

    @OriginalMember(owner = "client!wt", name = "M", descriptor = "I")
    public static int field188;

    @OriginalMember(owner = "client!wt", name = "N", descriptor = "I")
    public static int field189;

    @OriginalMember(owner = "client!wt", name = "O", descriptor = "I")
    public static int field190;

    @OriginalMember(owner = "client!wt", name = "Q", descriptor = "I")
    public static int field192;

    @OriginalMember(owner = "client!wt", name = "S", descriptor = "I")
    public static int field194;

    @OriginalMember(owner = "client!wt", name = "T", descriptor = "I")
    public static int field195;

    static {
        new class179("Unable to join clan chat at this time - please try again later!", "Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Impossible de participer à une discussion de clan pour le moment - veuillez réessayer ultérieurement.", "Não foi possível entrar no bate-papo do clã dessa vez. Tente de novo depois!");
        field191 = 0;
        field187 = 320;
        new class179("You do not have a high enough rank to join this clan channel.", "Dein Rang reicht nicht aus, um diesen Chatraum zu betreten.", "Votre rang n'est pas assez élevé pour rejoindre ce canal de clan.", "Sua posição não é alta o suficiente para você entrar nesse canal de clã.");
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(Lza;B)V", line = 3)
    public final void method96(class299 arg0, byte arg1) {
        this.field193.method1319(86, arg0);
        ++field185;
        if (arg1 <= 78) {
            this.field193 = null;
        }
    }

    @OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(Lza;Lii;IIIIIZIIIIIII)V", line = 15)
    public class17(class299 arg0, class395 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field5811 == 1, class436.method2706(arg13, 32005, arg12));
        this.field193 = new class191(arg0, arg1, arg12, arg13, super.field1274, arg3, arg4, arg6, arg7, arg14);
        this.field177 = arg1.field5840 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(I)I", line = 27)
    public final int method97(int arg0) {
        ++field195;
        if (arg0 <= 82) {
            this.method111((class299) null, -51, false);
        }
        return this.field193.field2917;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(ILza;)V", line = 39)
    public final void method98(int arg0, class299 arg1) {
        ++field189;
        if (arg0 != 31203) {
            this.method104((byte) 3);
        }
        class289 var3 = this.field193.method1322(super.field1275, arg1, (byte) -126, true, true, 262144, super.field1279);
        if (var3 != null) {
            this.field193.method1323(super.field1277, -2376, arg1, false, var3, super.field1283, super.field1271, super.field1272);
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(B)I", line = 55)
    public final int method99(byte arg0) {
        if (arg0 != -107) {
            method105((byte) 73);
        }
        ++field175;
        return this.field193.field2946;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(BLza;)V", line = 66)
    public final void method100(byte arg0, class299 arg1) {
        this.field193.method1321(-32004, arg1);
        ++field176;
        if (arg0 != 51) {
            field191 = 47;
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(Z)I", line = 80)
    public final int method101(boolean arg0) {
        if (arg0) {
            return -37;
        } else {
            ++field181;
            return this.field193.method1324((byte) -57);
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(Lza;IIILps;IZ)V", line = 91)
    public final void method102(class299 arg0, int arg1, int arg2, int arg3, class352 arg4, int arg5, boolean arg6) {
        if (arg3 != -750) {
            this.method99((byte) -73);
        }
        ++field192;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "(I)I", line = 102)
    public final int method103(int arg0) {
        if (arg0 >= -10) {
            return 99;
        } else {
            ++field188;
            return this.field193.field2951;
        }
    }

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "(B)Z", line = 117)
    public final boolean method104(byte arg0) {
        int var2 = 5 / ((arg0 - -41) / 38);
        ++field194;
        return this.field193.method1328((byte) -93);
    }

    @OriginalMember(owner = "client!wt", name = "e", descriptor = "(B)V", line = 127)
    public static final void method105(byte arg0) {
        class314.field4777.method2141(5, (byte) 57);
        ++field183;
        class118.field1813.method888(5, (byte) -121);
        class306.field4682.method1958(8282, 5);
        class247.field3693.method2279(5, (byte) -52);
        class462.field6842.method1233(5, 16946);
        class300.field4608.method2085(5, 65);
        class393.field5735.method1536(5, 99999999);
        class232.field3490.method2628(5, 1);
        class529.field7739.method2103(87, 5);
        class390.field5714.method49(121, 5);
        class315.field4808.method157(5, 0);
        class455.field6765.method2179(5, 16515072);
        class384.field5647.method768(5, 64);
        class264.field4225.method2791(5, -109);
        class389.field5702.method1823(5, (byte) -120);
        class335.field5044.method1979((byte) 123, 5);
        int var1 = -88 / ((arg0 - -30) / 39);
        class436.field6496.method2982(true, 5);
        class61.field958.method198(33, 5);
        class256.field4117.method3112((byte) -44, 5);
        class420.field6176.method929(125, 5);
        class285.method1914(5, (byte) 87);
        class215.method1482(50, true);
        class349.method2245(-6, 5);
        class63.method425(0, 5);
        class81.field1329.method1631(5, (byte) -19);
        class531.field7750.method1631(5, (byte) -19);
        class90.field1445.method1631(5, (byte) -19);
        class194.field3030.method1631(5, (byte) -19);
        class152.field2295.method1631(5, (byte) -19);
    }

    @OriginalMember(owner = "client!wt", name = "c", descriptor = "(I)V", line = 165)
    public final void method106(int arg0) {
        if (arg0 == -19159) {
            ++field179;
        }
    }

    @OriginalMember(owner = "client!wt", name = "c", descriptor = "(B)Z", line = 175)
    public final boolean method107(byte arg0) {
        if (arg0 != -88) {
            return false;
        } else {
            ++field186;
            return false;
        }
    }

    @OriginalMember(owner = "client!wt", name = "d", descriptor = "(I)V", line = 187)
    public final void method108(int arg0) {
        ++field184;
        int var2 = -103 / ((48 - arg0) / 37);
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(Lza;III)Z", line = 197)
    public final boolean method109(class299 arg0, int arg1, int arg2, int arg3) {
        ++field182;
        class289 var5 = this.field193.method1322(super.field1275, arg0, (byte) -121, false, false, 131072, super.field1279);
        if (arg2 <= 23) {
            field191 = -87;
        }
        if (var5 == null) {
            return false;
        } else {
            class517 var6 = arg0.method538();
            var6.method951(super.field1275, super.field1278, super.field1279);
            return var5.method638(arg1, arg3, var6, false);
        }
    }

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "(ILza;)Lhp;", line = 224)
    public final class293 method110(int arg0, class299 arg1) {
        ++field178;
        class289 var3 = this.field193.method1322(super.field1275, arg1, (byte) -115, true, false, 2048, super.field1279);
        if (var3 == null) {
            return null;
        } else {
            class517 var4 = arg1.method538();
            if (arg0 != 0) {
                return null;
            } else {
                var4.method951(super.field1275, super.field1278, super.field1279);
                class293 var5 = null;
                if (this.field177) {
                    var5 = class467.method2844(-22755, 1);
                }
                if (this.field193.field2942 == null) {
                    var3.method673(var4, var5 == null ? null : var5.field4524[0], 0);
                } else {
                    class320 var6 = this.field193.field2942.method2424();
                    arg1.method584(var3, var6, var4, var5 == null ? null : var5.field4524[0], 0);
                }
                this.field193.method1323(super.field1277, arg0 ^ -2376, arg1, true, var3, super.field1283, super.field1271, super.field1272);
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(Lza;IZ)Le;", line = 262)
    public final class289 method111(class299 arg0, int arg1, boolean arg2) {
        ++field190;
        return !arg2 ? null : this.field193.method1322(0, arg0, (byte) -123, false, false, arg1, 0);
    }
}
