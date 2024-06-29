import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class159 extends class366 {

    @OriginalMember(owner = "client!sm", name = "Vb", descriptor = "Ljm;")
    public static class162 field2268;

    @OriginalMember(owner = "client!sm", name = "Fb", descriptor = "I")
    public static int field2252;

    @OriginalMember(owner = "client!sm", name = "Gb", descriptor = "I")
    public static int field2253;

    @OriginalMember(owner = "client!sm", name = "Hb", descriptor = "I")
    private int field2254;

    @OriginalMember(owner = "client!sm", name = "Jb", descriptor = "I")
    public static int field2256;

    @OriginalMember(owner = "client!sm", name = "Lb", descriptor = "I")
    public static int field2258;

    @OriginalMember(owner = "client!sm", name = "Mb", descriptor = "I")
    public static int field2259;

    @OriginalMember(owner = "client!sm", name = "Nb", descriptor = "I")
    public static int field2260;

    @OriginalMember(owner = "client!sm", name = "Ob", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!sm", name = "Pb", descriptor = "I")
    public static int field2262;

    @OriginalMember(owner = "client!sm", name = "Qb", descriptor = "I")
    public static int field2263;

    @OriginalMember(owner = "client!sm", name = "Rb", descriptor = "I")
    public static int field2264;

    @OriginalMember(owner = "client!sm", name = "Sb", descriptor = "I")
    public static int field2265;

    @OriginalMember(owner = "client!sm", name = "Tb", descriptor = "I")
    public static int field2266;

    @OriginalMember(owner = "client!sm", name = "Ub", descriptor = "I")
    public static int field2267;

    @OriginalMember(owner = "client!sm", name = "Kb", descriptor = "Lij;")
    public static class316 field2257;

    @OriginalMember(owner = "client!sm", name = "Ib", descriptor = "Lkb;")
    private class80 field2255;

    static {
        new class368("You will be un-muted within 24 hours.", "Du wirst innerhalb der nächsten 24 Stunden wieder sprechen können.", "Vous aurez à nouveau accès à la messagerie instantanée dans 24 heures.", "O veto será retirado dentro de 24 horas.");
        new class368("Unable to delete name - system busy.", "Name konnte nicht gelöscht werden - Systemfehler.", "Impossible d'effacer le nom - système occupé.", "Não foi possível deletar o nome - sistema ocupado.");
        field2268 = new class162();
    }

    @OriginalMember(owner = "client!sm", name = "l", descriptor = "(B)I", line = 3)
    public final int method1143(byte arg0) {
        int var2 = 105 % ((arg0 - 38) / 32);
        ++field2267;
        return 255 & super.field5076[super.field5048++] + -this.field2255.method651(5);
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(I[I)V", line = 14)
    public final void method1144(int arg0, int[] arg1) {
        ++field2260;
        int var3 = 0 % ((11 - arg0) / 42);
        this.field2255 = new class80(arg1);
    }

    @OriginalMember(owner = "client!sm", name = "n", descriptor = "(II)I", line = 28)
    public final int method1145(int arg0, int arg1) {
        ++field2256;
        if (arg0 != 8) {
            method1153((class316) null, (class387) null, -53, (class316) null, (class316) null);
        }
        return arg1 * 8 + -this.field2254;
    }

    @OriginalMember(owner = "client!sm", name = "f", descriptor = "(BI)I", line = 40)
    public final int method1146(byte arg0, int arg1) {
        ++field2258;
        int var3 = this.field2254 >> 3;
        if (arg0 > -66) {
            this.field2255 = null;
        }
        int var4 = 8 - (7 & this.field2254);
        this.field2254 += arg1;
        int var5 = 0;
        while (~var4 > ~arg1) {
            var5 += (class203.field2892[var4] & super.field5076[var3++]) << -var4 + arg1;
            arg1 -= var4;
            var4 = 8;
        }
        int var6;
        if (~arg1 == ~var4) {
            var6 = (super.field5076[var3] & class203.field2892[var4]) + var5;
        } else {
            var6 = (super.field5076[var3] >> -arg1 + var4 & class203.field2892[arg1]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!sm", name = "m", descriptor = "(B)V", line = 70)
    public final void method1147(byte arg0) {
        if (arg0 != -76) {
            field2257 = null;
        }
        ++field2253;
        super.field5048 = (this.field2254 + 7) / 8;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "([BIII)V", line = 82)
    public final void method1148(byte[] arg0, int arg1, int arg2, int arg3) {
        ++field2266;
        for (int var5 = arg3; arg2 > var5; ++var5) {
            arg0[arg1 + var5] = (byte) (super.field5076[super.field5048++] + -this.field2255.method651(5));
        }
    }

    @OriginalMember(owner = "client!sm", name = "e", descriptor = "(Z)V", line = 100)
    public static void method1149(boolean arg0) {
        field2268 = null;
        field2257 = null;
        if (arg0) {
            field2257 = null;
        }
    }

    @OriginalMember(owner = "client!sm", name = "u", descriptor = "(I)V", line = 116)
    public final void method1150(int arg0) {
        this.field2254 = super.field5048 * 8;
        ++field2264;
        if (arg0 <= 74) {
            this.method1143((byte) 43);
        }
    }

    @OriginalMember(owner = "client!sm", name = "e", descriptor = "(IB)V", line = 130)
    public final void method1151(int arg0, byte arg1) {
        int var3 = -127 % ((27 - arg1) / 56);
        super.field5076[super.field5048++] = (byte) (this.field2255.method651(5) + arg0);
        ++field2259;
    }

    @OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(I)V", line = 142)
    public class159(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(III)I", line = 149)
    public static final int method1152(int arg0, int arg1, int arg2) {
        ++field2263;
        int var3 = arg2 >>> 31;
        return arg0 != 8 ? -67 : (arg2 + var3) / arg1 + -var3;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lij;Lfl;ILij;Lij;)Z", line = 164)
    public static final boolean method1153(class316 arg0, class387 arg1, int arg2, class316 arg3, class316 arg4) {
        class177.field2521 = arg3;
        class54.field690 = arg4;
        class42.field550 = arg0;
        ++field2265;
        if (arg2 != 6848) {
            return true;
        } else {
            class105.field1477 = arg1;
            return true;
        }
    }

    @OriginalMember(owner = "client!sm", name = "n", descriptor = "(B)V", line = 188)
    public static final void method1154(byte arg0) {
        if (arg0 < -5) {
            ++field2252;
            for (class284 var1 = (class284) class196.field2843.method1173(0); var1 != null; var1 = (class284) class196.field2843.method1165(true)) {
                class427 var2 = var1.field3863;
                if (class343.field4623 == var2.field42 && !var2.field5935) {
                    if (~class246.field3467 <= ~var2.field5924) {
                        var2.method2633(0, class54.field694);
                        if (!var2.field5935) {
                            class147.method1064(var2, true);
                        } else {
                            var1.method1884(false);
                        }
                    }
                } else {
                    var1.method1884(false);
                    var2.method2630((byte) 126);
                }
            }
        }
    }
}
