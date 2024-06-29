import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sga")
public class class609 {

    @OriginalMember(owner = "client!sga", name = "d", descriptor = "I")
    public static int field8651 = 0;

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "I")
    public int field8648;

    @OriginalMember(owner = "client!sga", name = "b", descriptor = "I")
    public static int field8649;

    @OriginalMember(owner = "client!sga", name = "c", descriptor = "I")
    public static int field8650;

    @OriginalMember(owner = "client!sga", name = "e", descriptor = "I")
    public static int field8652;

    @OriginalMember(owner = "client!sga", name = "f", descriptor = "I")
    public int field8653;

    @OriginalMember(owner = "client!sga", name = "h", descriptor = "I")
    public static int field8655;

    @OriginalMember(owner = "client!sga", name = "i", descriptor = "I")
    public static int field8656;

    @OriginalMember(owner = "client!sga", name = "j", descriptor = "I")
    public static int field8657;

    @OriginalMember(owner = "client!sga", name = "g", descriptor = "[Lwm;")
    public class444[] field8654;

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(BLol;)V", line = 7)
    public final void method3525(byte arg0, class431 arg1) {
        field8655++;
        this.field8653 = arg1.method2515(71);
        this.field8648 = arg1.method2565((byte) -128);
        this.field8654 = new class444[arg1.method2557(14929)];
        if (arg0 != -28) {
            method3528((byte) -30);
        }
        class353[] var3 = class338.method2068(-65);
        for (int var4 = 0; var4 < this.field8654.length; var4++) {
            this.field8654[var4] = this.method3527((byte) -122, var3[arg1.method2557(14929)], arg1);
        }
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(Ljava/lang/String;Lha;BLrt;Lda;Z)V", line = 33)
    public static final void method3526(String arg0, class475 arg1, byte arg2, class470 arg3, class443 arg4, boolean arg5) {
        field8657++;
        boolean var6 = !class251.field3615 || class447.method2647((byte) -114);
        if (!var6) {
            return;
        }
        if (arg2 >= -2) {
            field8656 = 57;
        }
        if (class251.field3615 && var6) {
            class470 var12 = class353.field5017;
            class443 var13 = arg1.method491(var12, class280.field4034, true);
            int var14 = var12.method2744(250, arg0, null, -111);
            int var15 = var12.method2745(250, arg0, -1, null, var12.field6398);
            int var16 = class396.field5469.field5796;
            int var17 = var16 + 4;
            int var18 = var17 * 2 + var14;
            int var19 = var17 * 2 + var15;
            if (class598.field8529 > var18) {
                var18 = class598.field8529;
            }
            if (var19 < class131.field2207) {
                var19 = class131.field2207;
            }
            int var20 = class286.field4208.method3291(var18, 0, class499.field6858) + class656.field9263;
            int var21 = class17.field189.method2110(class381.field5334, var19, -29133) + class233.field3381;
            if (class593.field8489) {
                var20 += class45.method342(false);
                var21 += class87.method771(-2);
            }
            arg1.method487(class105.field1520, false).method8(var20 + class86.field1289.field5796, var21 - -class86.field1289.field5792, var18 - (class86.field1289.field5796 * 2), -(class86.field1289.field5792 * 2) + var19, 1, 0, 0);
            arg1.method487(class86.field1289, true).method759(var20, var21);
            class86.field1289.method2461();
            arg1.method487(class86.field1289, true).method759(var18 + var20 - var16, var21);
            class86.field1289.method2470();
            arg1.method487(class86.field1289, true).method759(var20 + var18 - var16, -var16 + var19 + var21);
            class86.field1289.method2461();
            arg1.method487(class86.field1289, true).method759(var20, var19 + var21 - var16);
            class86.field1289.method2470();
            arg1.method487(class396.field5469, true).method757(var20, class86.field1289.field5792 + var21, var16, var19 - (class86.field1289.field5792 * 2));
            class396.field5469.method2471();
            arg1.method487(class396.field5469, true).method757(class86.field1289.field5796 + var20, var21, var18 - (class86.field1289.field5796 * 2), var16);
            class396.field5469.method2471();
            arg1.method487(class396.field5469, true).method757(var20 + var18 - var16, var21 - -class86.field1289.field5792, var16, var19 - (class86.field1289.field5792 * 2));
            class396.field5469.method2471();
            arg1.method487(class396.field5469, true).method757(class86.field1289.field5796 + var20, -var16 + var21 + var19, var18 - (class86.field1289.field5796 * 2), var16);
            class396.field5469.method2471();
            var13.method2627(1, arg0, class570.field7912 | 0xFF000000, var18 - var17 * 2, var20 - -var17, 0, 1, var19 - var17 * 2, 0, null, -1, 0, null, -1609, var17 + var21, null);
            class515.method3026(var18, (byte) -36, var21, var20, var19);
        } else {
            int var7 = arg3.method2744(250, arg0, null, 110);
            int var8 = arg3.method2750(-9233, arg0, null, 250) * 13;
            byte var9 = 4;
            int var10 = var9 + 6;
            int var11 = var9 + 6;
            arg1.method436(var10 - var9, -var9 + var11, var7 + var9 + var9, var8 + var9 + var9, -16777216, 0);
            arg1.method447(var10 - var9, -var9 + var11, var7 - (-var9 - var9), var8 + var9 - -var9, -1, 0);
            arg4.method2627(1, arg0, -1, var7, var10, 0, 1, var8, 0, null, -1, 0, null, -1609, var11, null);
            class515.method3026(var7 + var9 + var9, (byte) -36, var11 - var9, -var9 + var10, var8 + var9 + var9);
        }
        if (!arg5) {
            return;
        }
        try {
            if (class593.field8489) {
                class714.method3969((byte) -51);
            } else {
                arg1.method2777(-16679);
            }
        } catch (class684 var22) {
        }
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(BLhl;Lol;)Lwm;", line = 132)
    private final class444 method3527(byte arg0, class353 arg1, class431 arg2) {
        field8650++;
        if (class774.field10651 == arg1) {
            return class630.method3596((byte) -96, arg2);
        } else if (class116.field1982 == arg1) {
            return class698.method3916((byte) -79, arg2);
        } else if (class614.field8711 == arg1) {
            return class157.method1215(1, arg2);
        } else if (class458.field6261 == arg1) {
            return class107.method859(true, arg2);
        } else if (class119.field2042 == arg1) {
            return class149.method1178(arg2, (byte) -79);
        } else if (class104.field1515 == arg1) {
            return class510.method2979(arg2, -86);
        } else if (class645.field9175 == arg1) {
            return class686.method3875(arg2, -71);
        } else if (class568.field7901 == arg1) {
            return class320.method1938(0, arg2);
        } else if (class443.field6134 == arg1) {
            return class735.method4063(arg2, true);
        } else if (class243.field3479 == arg1) {
            return class624.method3569((byte) 91, arg2);
        } else {
            if (arg0 > -108) {
                method3528((byte) 92);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(B)V", line = 179)
    public static final void method3528(byte arg0) {
        field8652++;
        if (class346.field4933 == null) {
            return;
        }
        if (arg0 != 5) {
            field8651 = -2;
        }
        class346.field4933 = null;
        class515.method3026(class362.field5138, (byte) -36, class541.field7494, class653.field9248, class778.field10681);
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(BLjava/lang/String;I)V", line = 194)
    public static final void method3529(byte arg0, String arg1, int arg2) {
        field8649++;
        class429.field5937++;
        class302 var3 = class582.method3419(class721.field10066, (byte) 127, class626.field8901);
        var3.field4341.method2524(false, class389.method2339(arg1, true) + 1);
        var3.field4341.method2566(-2, arg1);
        int var4 = 55 % ((-arg0 - 38) / 36);
        var3.field4341.method2579(false, arg2);
        class501.method2928(0, var3);
    }
}
