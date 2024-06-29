import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class528 {

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "I")
    public static int field7719 = 0;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
    public static int field7720;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "I")
    public static int field7721;

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "I")
    public static int field7722;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "Lha;")
    public class54 field7717;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "Lda;")
    public class55 field7718;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(BI)V", line = 8)
    public static final void method3107(byte arg0, int arg1) {
        field7720++;
        class168.field2054 = arg1;
        int var2 = -28 / ((arg0 - 66) / 57);
        class611.field8763 = 2;
        long var3 = 0L;
        if (class424.field6102 == null) {
            class676.method3841(35, -94);
        } else {
            class389 var5 = new class389(class534.method3139(class297.method1763(class424.field6102, (byte) 14), 128));
            long var6 = var5.method2227(-26276);
            class236.field3182 = var5.method2227(-26276);
            class256.method1559("", true, (byte) 23, class437.method2613((byte) -116, var6));
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(BZLkfa;)V", line = 40)
    public static final void method3108(byte arg0, boolean arg1, class557 arg2) {
        field7721++;
        if (class271.field3704 >= 400 || arg0 != 0) {
            return;
        }
        class323 var3 = arg2.field8052;
        if (var3.field4315 != null) {
            var3 = var3.method1881(class410.field5804, (byte) 114);
            if (var3 == null) {
                return;
            }
        }
        if (!var3.field4299) {
            return;
        }
        String var4 = var3.field4271;
        if (var3.field4284 != 0) {
            String var5 = class588.field8518 == class356.field4753 ? class424.field6068.method2561(class370.field4980, 0) : class424.field6066.method2561(class370.field4980, 0);
            var4 = var4 + class244.method1483(false, var3.field4284, class206.field2472.field8802) + " (" + var5 + var3.field4284 + ")";
        }
        if (class99.field1336 && !arg1) {
            class184 var6 = class19.field524 == -1 ? null : class582.field8483.method2536((byte) -124, class19.field524);
            if ((class251.field3440 & 0x2) != 0 && (var6 == null || var3.method1877(class19.field524, var6.field2253, -1) != var6.field2253)) {
                class52.field845++;
                class240.method1471((long) arg2.field2664, -24453, 20, false, -1, class564.field8154, 0, class52.field844, 0, true, class255.field3461 + " -> <col=ffff00>" + var4);
            }
        }
        if (!arg1) {
            String[] var7 = var3.field4322;
            if (class74.field1110) {
                var7 = class281.method1690(true, var7);
            }
            if (var7 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var7[var8] != null && (var3.field4285 == 0 || !var7[var8].equalsIgnoreCase(class424.field6061.method2561(class370.field4980, 0)))) {
                        byte var9 = 0;
                        int var10 = class660.field9376;
                        if (var8 == 0) {
                            var9 = 48;
                        }
                        if (var8 == 1) {
                            var9 = 21;
                        }
                        if (var8 == 2) {
                            var9 = 30;
                        }
                        if (var8 == 3) {
                            var9 = 8;
                        }
                        if (var8 == 4) {
                            var9 = 18;
                        }
                        if (var3.field4307 == var8) {
                            var10 = var3.field4317;
                        }
                        if (var3.field4266 == var8) {
                            var10 = var3.field4267;
                        }
                        class354.field4732++;
                        class240.method1471((long) arg2.field2664, -24453, var9, false, -1, var7[var8].equalsIgnoreCase(class424.field6061.method2561(class370.field4980, 0)) ? var3.field4289 : var10, 0, var7[var8], 0, true, "<col=ffff00>" + var4);
                    }
                }
            }
            if (var3.field4285 == 1 && var7 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var7[var11] != null && var7[var11].equalsIgnoreCase(class424.field6061.method2561(class370.field4980, 0))) {
                        short var12 = 0;
                        if (class206.field2472.field8802 < var3.field4284) {
                            var12 = 2000;
                        }
                        short var13 = 0;
                        if (var11 == 0) {
                            var13 = 48;
                        }
                        if (var11 == 1) {
                            var13 = 21;
                        }
                        if (var11 == 2) {
                            var13 = 30;
                        }
                        if (var11 == 3) {
                            var13 = 8;
                        }
                        if (var11 == 4) {
                            var13 = 18;
                        }
                        if (var13 != 0) {
                            var13 += var12;
                        }
                        class240.method1471((long) arg2.field2664, -24453, var13, false, -1, var3.field4289, 0, var7[var11], 0, true, "<col=ffff00>" + var4);
                        class407.field5775++;
                    }
                }
            }
        }
        class240.method1471((long) arg2.field2664, -24453, 1006, arg1, -1, class427.field6138, 0, class424.field6060.method2561(class370.field4980, arg0), 0, true, "<col=ffff00>" + var4);
        class696.field9860++;
    }
}
