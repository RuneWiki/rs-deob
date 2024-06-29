import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class364 extends class163 {

    @OriginalMember(owner = "client!ll", name = "C", descriptor = "I")
    public static int field4654;

    @OriginalMember(owner = "client!ll", name = "D", descriptor = "I")
    public static int field4655;

    @OriginalMember(owner = "client!ll", name = "E", descriptor = "I")
    public static int field4656;

    @OriginalMember(owner = "client!ll", name = "F", descriptor = "I")
    public static int field4657;

    @OriginalMember(owner = "client!ll", name = "G", descriptor = "I")
    public static int field4658;

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(IIIIIF)V")
    public class364(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IF)V")
    public final void method799(int arg0, float arg1) {
        if (arg0 < 111) {
            method2125((String) null, (byte) -13);
        }
        ++field4656;
        super.field1814 = arg1;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(BIII)V")
    public final void method801(byte arg0, int arg1, int arg2, int arg3) {
        ++field4658;
        super.field1822 = arg2;
        super.field1823 = arg1;
        super.field1820 = arg3;
        if (arg0 >= 86) {
            ;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method2125(String arg0, byte arg1) {
        ++field4657;
        if (arg0 != null) {
            if (arg0.startsWith("*")) {
                arg0 = arg0.substring(1);
            }
            if (arg1 == -83) {
                String var2 = class102.method708(arg0, -21413);
                if (var2 != null) {
                    for (int var3 = 0; ~var3 > ~class293.field3610; ++var3) {
                        String var4 = class178.field2089[var3];
                        if (var4.startsWith("*")) {
                            var4 = var4.substring(1);
                        }
                        String var5 = class102.method708(var4, arg1 + -21330);
                        if (var5 != null && var5.equals(var2)) {
                            --class293.field3610;
                            for (int var6 = var3; var6 < class293.field3610; ++var6) {
                                class178.field2089[var6] = class178.field2089[var6 + 1];
                                class522.field7422[var6] = class522.field7422[var6 + 1];
                                class484.field6891[var6] = class484.field6891[var6 + 1];
                                class166.field1853[var6] = class166.field1853[var6 + 1];
                                class730.field10211[var6] = class730.field10211[var6 + 1];
                            }
                            ++class704.field9920;
                            class422.field6146 = class514.field7334;
                            class249 var7 = class289.method1715(class19.field169, 83, class41.field470);
                            var7.field3016.method1460(class729.method4063(-1, arg0), 24710);
                            var7.field3016.method1480(arg0, false);
                            class510.method3017(var7, 123);
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lha;B)V")
    public static final void method2126(class58 arg0, byte arg1) {
        ++field4655;
        int var2 = 0;
        if (arg1 >= 20) {
            int var3 = 0;
            if (class397.field5443) {
                var2 = class389.method2400(89);
                var3 = class752.method4192(1);
            }
            int var4 = -10660793;
            class47.method272(class183.field2187 - -var3, class236.field2806, class542.field7804, class655.field9351 + var2, (byte) -120, var4, arg0, -16777216);
            class567.field8070.method442(var2 + 3 + class655.field9351, -1, class183.field2187 + var3 + 14, var4, class486.field6928.method2936(class489.field6978, 122), 0);
            int var5 = var2 + class353.field4537.method694((byte) 109);
            int var6 = class353.field4537.method691((byte) -109) - -var3;
            if (!class260.field3231) {
                int var7 = 0;
                for (class649 var8 = (class649) class265.field3289.method1719(65280); var8 != null; var8 = (class649) class265.field3289.method1723(-20665)) {
                    int var9 = (class343.field4449 + -1 - var7) * 16 + class183.field2187 - -var3 + 31;
                    ++var7;
                    class215.method1260(class183.field2187 + var3, var8, -1, -256, var5, class236.field2806, class655.field9351 + var2, arg0, -2, class542.field7804, var6, var9);
                }
            } else {
                int var10 = 0;
                for (class177 var11 = (class177) class331.field4291.method2067(22462); var11 != null; var11 = (class177) class331.field4291.method2066(0)) {
                    int var15 = var10 * 16 + class183.field2187 + var3 + 31;
                    if (var11.field2078 != 1) {
                        class320.method1914(arg0, 0, class183.field2187 + var3, var11, var15, -256, class655.field9351 + var2, class236.field2806, -1, class542.field7804, var5, var6);
                    } else {
                        class215.method1260(class183.field2187 + var3, (class649) var11.field2081.field4488.field8923, -1, -256, var5, class236.field2806, class655.field9351 + var2, arg0, -2, class542.field7804, var6, var15);
                    }
                    ++var10;
                }
                if (class336.field4322 != null) {
                    class47.method272(class210.field2484, class750.field10484, class134.field1515, class330.field4283, (byte) -114, var4, arg0, -16777216);
                    class567.field8070.method442(class330.field4283 + 3, -1, class210.field2484 - -14, var4, class336.field4322.field2080, 0);
                    int var12 = 0;
                    for (class649 var13 = (class649) class336.field4322.field2081.method2067(22462); var13 != null; var13 = (class649) class336.field4322.field2081.method2066(0)) {
                        int var14 = class210.field2484 + 31 - -(var12 * 16);
                        class215.method1260(class210.field2484, var13, -1, -256, var5, class750.field10484, class330.field4283, arg0, -2, class134.field1515, var6, var14);
                        ++var12;
                    }
                    class193.method1172(class750.field10484, class210.field2484, class134.field1515, (byte) -78, class330.field4283);
                }
            }
            class193.method1172(class236.field2806, class183.field2187 + var3, class542.field7804, (byte) -126, class655.field9351 + var2);
        }
    }
}
