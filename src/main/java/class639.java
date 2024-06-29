import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class639 {

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "Lwg;")
    private class58 field9269 = new class58(128);

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "Lkr;")
    private class329 field9267;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "I")
    public static int field9262;

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "I")
    public static int field9263;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "I")
    public static int field9264;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
    public static int field9265;

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
    public static int field9266;

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "I")
    public static int field9268;

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "I")
    public static int field9270;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Z)Z")
    public static final boolean method3677(boolean arg0) {
        field9263++;
        if (!arg0) {
            return true;
        }
        if (class351.field4936) {
            try {
                class499.method2793("showVideoAd", (byte) -85, class31.field488.field3644);
                return true;
            } catch (Throwable var1) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)V")
    public static final void method3678(byte arg0) {
        class554.field7754 = 1;
        field9264++;
        class419.field5730 = -1;
        long var1 = 0L;
        if (class207.field2685 == null) {
            class372.method2272(35, (byte) 86);
            return;
        }
        class551 var3 = new class551(class183.method1121(false, class606.method3469(class207.field2685, (byte) 13)));
        long var4 = var3.method3072(-24373);
        class551.field7716 = var3.method3072(arg0 ^ 0xFFFFA0B6);
        if (arg0 != 125) {
            method3681(3);
        }
        class492.method2763("", true, 0, class387.method2338((byte) -127, var4));
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Ldg;Z)V")
    public static final void method3679(class20 arg0, boolean arg1) {
        field9266++;
        class72 var2 = (class72) class304.field3930.method3476((long) arg0.field366, (byte) 28);
        if (var2 == null) {
            class318.method1980(arg0.field6358, (byte) -77, 0, null, arg0.field417[0], null, arg0, arg0.field419[0]);
        } else {
            var2.method421(30896);
        }
        if (!arg1) {
            method3679(null, true);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(BIIII)V")
    public static final void method3680(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        class231.field2957 = arg3;
        field9265++;
        int var5 = -3 % ((arg0 + 31) / 33);
        class308.field3943 = arg1;
        class317.field4374 = arg2;
        class476.field6709 = arg4;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)[Lim;")
    public static final class353[] method3681(int arg0) {
        field9262++;
        return arg0 < 7 ? null : new class353[] { class466.field6622, class387.field5385, class203.field2677, class308.field3939, class40.field599, class510.field7115, class71.field960, class616.field8881, class584.field8449, class149.field1931, class111.field1435, class161.field2054, class72.field990, class510.field7114, class485.field6775, class9.field74, class176.field2271, class59.field799, class449.field6345, class424.field5740, class459.field6558, class216.field2767, class183.field2349, class579.field8049, class381.field5332, class550.field7649, class165.field2093, class48.field657, class370.field5161, class411.field5650, class367.field5112, class623.field8994, class144.field1874, class140.field1779, class130.field1597, class50.field686, class150.field1977, class75.field1020, class181.field2331, class634.field9231, class527.field7334, class96.field1290, class104.field1364, class463.field6598, class208.field2704, class453.field6428, class310.field3970, class325.field4467, class539.field7540, class151.field1991, class452.field6402, class336.field4695, class125.field1554, class48.field654, class621.field8932, class263.field3354, class637.field9251, class418.field5714, class483.field6745, class402.field5500, class586.field8485, class536.field7478, class291.field3778, class54.field724, class7.field59, class390.field5409, class438.field5963, class478.field6723, class226.field2889, class443.field6128, class268.field3419, class598.field8631, class83.field1124, class529.field7398, class50.field677, class171.field2189, class90.field1199, class208.field2705, class356.field4981, class336.field4694, class637.field9250, class356.field4982, class598.field8637, class220.field2813, class118.field1489, class220.field2816, class424.field5743, class370.field5149, class610.field8772, class411.field5655, class476.field6705, class351.field4908, class329.field4556, class285.field3712, class345.field4779, class71.field963, class544.field7586, class559.field7826, class354.field4952, class360.field5025, class598.field8639, class77.field1045, class635.field9235, class206.field2680, class389.field5399, class217.field2770, class623.field8998, class20.field293, class643.field9331, class209.field2712, class198.field2594, class281.field3674, class115.field1465, class57.field761, class150.field1958 };
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IB)Loc;")
    public final class503 method3682(int arg0, byte arg1) {
        field9270++;
        int var3 = -55 % ((32 - arg1) / 41);
        class58 var4 = this.field9269;
        class503 var5;
        synchronized (this.field9269) {
            var5 = (class503) this.field9269.method323((long) arg0, -19814);
        }
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = this.field9267.method2054(true, class413.method2462(-105, arg0), class385.method2330(arg0, 84));
        class503 var7 = new class503();
        if (var6 != null) {
            var7.method2811((byte) -127, new class551(var6));
        }
        class58 var8 = this.field9269;
        synchronized (this.field9269) {
            this.field9269.method316((long) arg0, (byte) -118, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Lg;ILkr;)V")
    public class639(class513 arg0, int arg1, class329 arg2) {
        this.field9267 = arg2;
        if (this.field9267 != null) {
            int var4 = this.field9267.method2046((byte) 64) - 1;
            this.field9267.method2064(0, var4);
        }
    }

    static {
        new class344("clan_chat", "clanchat", "conversation_clan", "clan_chat");
        new class344("From", "Von:", "De", "De");
    }
}
