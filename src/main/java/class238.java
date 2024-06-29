import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class238 {

    @OriginalMember(owner = "client!no", name = "c", descriptor = "Lmo;")
    private class336 field3476 = new class336(64);

    @OriginalMember(owner = "client!no", name = "r", descriptor = "Lmo;")
    public class336 field3491 = new class336(30);

    @OriginalMember(owner = "client!no", name = "d", descriptor = "Lnl;")
    private class435 field3477;

    @OriginalMember(owner = "client!no", name = "o", descriptor = "Lnl;")
    public class435 field3488;

    @OriginalMember(owner = "client!no", name = "b", descriptor = "I")
    public static int field3475 = -1;

    @OriginalMember(owner = "client!no", name = "l", descriptor = "Lcf;")
    public static class92 field3485 = new class92();

    @OriginalMember(owner = "client!no", name = "q", descriptor = "[[I")
    public static int[][] field3490;

    @OriginalMember(owner = "client!no", name = "p", descriptor = "F")
    public static float field3489;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "I")
    public static int field3474;

    @OriginalMember(owner = "client!no", name = "e", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!no", name = "f", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!no", name = "g", descriptor = "I")
    public static int field3480;

    @OriginalMember(owner = "client!no", name = "h", descriptor = "I")
    public static int field3481;

    @OriginalMember(owner = "client!no", name = "i", descriptor = "I")
    public static int field3482;

    @OriginalMember(owner = "client!no", name = "j", descriptor = "I")
    public static int field3483;

    @OriginalMember(owner = "client!no", name = "k", descriptor = "I")
    public static int field3484;

    @OriginalMember(owner = "client!no", name = "m", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!no", name = "s", descriptor = "I")
    public int field3492;

    @OriginalMember(owner = "client!no", name = "n", descriptor = "Lnl;")
    public static class435 field3487;

    static {
        new class151("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.");
        field3490 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(B)V", line = 5)
    public static void method1659(byte arg0) {
        int var1 = -118 / ((-arg0 - 51) / 54);
        field3485 = null;
        field3487 = null;
        field3490 = null;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(II)V", line = 20)
    public final void method1660(int arg0, int arg1) {
        class336 var3 = this.field3476;
        synchronized (this.field3476) {
            if (arg1 != 1) {
                field3485 = null;
            }
            this.field3476.method2120((byte) -83, arg0);
        }
        field3478++;
        class336 var4 = this.field3491;
        synchronized (this.field3491) {
            this.field3491.method2120((byte) 83, arg0);
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(I)V", line = 38)
    public final void method1661(int arg0) {
        class336 var2 = this.field3476;
        synchronized (this.field3476) {
            this.field3476.method2109(-1);
        }
        field3479++;
        if (arg0 != 2519) {
            method1666(64);
        }
        class336 var3 = this.field3491;
        synchronized (this.field3491) {
            this.field3491.method2109(-1);
        }
    }

    @OriginalMember(owner = "client!no", name = "b", descriptor = "(I)V", line = 55)
    public static final void method1662(int arg0) {
        field3483++;
        if (class374.field5152 != null) {
            class280.field4024.method1772((byte) 125);
            class371.method2268();
            class184.method1311((byte) -31);
            class241.method1674(arg0 - 32);
            class428.method2560((byte) 110);
            class202.method1402((byte) 89);
            if (class323.field4519 != null) {
                class323.field4519.method2686(-1);
            }
            class421.method2513(42);
            class262.method1769(-19881);
            class419.method2511(true);
            class89.method745(92, false);
            class196.method1368(-22);
            for (int var1 = 0; var1 < 2048; var1++) {
                class39 var5 = class112.field1570[var1];
                if (var5 != null) {
                    var5.field5813 = null;
                    for (int var6 = 0; var6 < var5.field5803.length; var6++) {
                        var5.field5803[var6] = null;
                    }
                }
            }
            for (int var2 = 0; var2 < class163.field2377.length; var2++) {
                class361 var3 = class163.field2377[var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field5803.length; var4++) {
                        var3.field5803[var4] = null;
                    }
                }
            }
            class374.field5152.method755(arg0 - 98);
            class374.field5152 = null;
        }
        if (arg0 != 10) {
            field3485 = null;
        }
    }

    @OriginalMember(owner = "client!no", name = "c", descriptor = "(I)V", line = 131)
    public final void method1663(int arg0) {
        field3480++;
        class336 var2 = this.field3476;
        synchronized (this.field3476) {
            this.field3476.method2119(0);
        }
        class336 var3 = this.field3491;
        synchronized (this.field3491) {
            this.field3491.method2119(0);
        }
        if (arg0 != 192) {
            field3489 = -1.1165701F;
        }
    }

    @OriginalMember(owner = "client!no", name = "b", descriptor = "(II)Lcl;", line = 155)
    public final class217 method1664(int arg0, int arg1) {
        field3482++;
        class336 var3 = this.field3476;
        class217 var4;
        synchronized (this.field3476) {
            var4 = (class217) this.field3476.method2113(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field3477.method2633(class151.method1080((byte) -77, arg0), class25.method176((byte) -76, arg0), -55);
        class217 var6 = new class217();
        var6.field3133 = this;
        var6.field3126 = arg0;
        if (var5 != null) {
            var6.method1497(127, new class161(var5));
        }
        class336 var7 = this.field3476;
        synchronized (this.field3476) {
            this.field3476.method2116((long) arg0, (byte) -106, var6);
            int var8 = 60 % ((arg1 + 60) / 50);
            return var6;
        }
    }

    @OriginalMember(owner = "client!no", name = "c", descriptor = "(II)V", line = 189)
    public final void method1665(int arg0, int arg1) {
        this.field3492 = arg0;
        field3481++;
        class336 var3 = this.field3491;
        synchronized (this.field3491) {
            int var4 = -126 % ((arg1 - 66) / 45);
            this.field3491.method2109(-1);
        }
    }

    @OriginalMember(owner = "client!no", name = "d", descriptor = "(I)V", line = 214)
    public static final void method1666(int arg0) {
        if (arg0 >= -124) {
            field3490 = null;
        }
        if (class65.field958.toLowerCase().indexOf("microsoft") == -1) {
            class37.field403[91] = 42;
            class37.field403[93] = 43;
            class37.field403[92] = 74;
            class37.field403[61] = 27;
            if (class65.field964 == null) {
                class37.field403[192] = 58;
                class37.field403[222] = 59;
            } else {
                class37.field403[222] = 58;
                class37.field403[520] = 59;
                class37.field403[192] = 28;
            }
            class37.field403[46] = 72;
            class37.field403[44] = 71;
            class37.field403[45] = 26;
            class37.field403[59] = 57;
            class37.field403[47] = 73;
        } else {
            class37.field403[221] = 43;
            class37.field403[190] = 72;
            class37.field403[186] = 57;
            class37.field403[220] = 74;
            class37.field403[189] = 26;
            class37.field403[223] = 28;
            class37.field403[192] = 58;
            class37.field403[219] = 42;
            class37.field403[188] = 71;
            class37.field403[222] = 59;
            class37.field403[191] = 73;
            class37.field403[187] = 27;
        }
        field3484++;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IZZII)I", line = 264)
    public static final int method1667(int arg0, boolean arg1, boolean arg2, int arg3, int arg4) {
        field3486++;
        class48 var5 = class317.method2019((byte) -109, arg4, arg2);
        if (var5 == null) {
            return 0;
        }
        int var6 = 0;
        int var7 = 0;
        if (arg3 != 7442) {
            field3487 = null;
        }
        while (var5.field723.length > var7) {
            if (var5.field723[var7] >= 0 && var5.field723[var7] < class373.field5128.field3451) {
                class156 var8 = class373.field5128.method1644(var5.field723[var7], 100);
                int var9 = var8.method1114(arg3 - 7332, class422.field5847.method1635(arg0, false).field1765, arg0);
                if (arg1) {
                    var6 += var5.field725[var7] * var9;
                } else {
                    var6 += var9;
                }
            }
            var7++;
        }
        return var6;
    }

    @OriginalMember(owner = "client!no", name = "<init>", descriptor = "(Llo;ILnl;Lnl;)V", line = 316)
    public class238(class280 arg0, int arg1, class435 arg2, class435 arg3) {
        this.field3477 = arg2;
        this.field3488 = arg3;
        int var5 = this.field3477.method2658(-1) - 1;
        this.field3477.method2638(1, var5);
    }
}
