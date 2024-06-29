import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public class class202 extends class175 {

    @OriginalMember(owner = "client!op", name = "G", descriptor = "[I")
    public static int[] field2623 = new int[2];

    @OriginalMember(owner = "client!op", name = "K", descriptor = "Ljb;")
    public static class519 field2627 = new class519(118, 0);

    @OriginalMember(owner = "client!op", name = "E", descriptor = "I")
    public static int field2621;

    @OriginalMember(owner = "client!op", name = "F", descriptor = "I")
    public static int field2622;

    @OriginalMember(owner = "client!op", name = "H", descriptor = "I")
    public static int field2624;

    @OriginalMember(owner = "client!op", name = "I", descriptor = "I")
    public static int field2625;

    @OriginalMember(owner = "client!op", name = "J", descriptor = "I")
    public static int field2626;

    @OriginalMember(owner = "client!op", name = "L", descriptor = "I")
    public static int field2628;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(IB)[[I", line = 4)
    public final int[][] method238(int arg0, byte arg1) {
        ++field2621;
        int[][] var3 = super.field2316.method3602(arg0, (byte) -74);
        if (arg1 > -47) {
            method1333((byte) 11);
        }
        if (super.field2316.field8746) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~var7 > ~class598.field8136; ++var7) {
                this.method1334(arg0, var7, 255);
                int[][] var8 = this.method1205(0, class246.field3215, 29179);
                var4[var7] = var8[0][class311.field4403];
                var5[var7] = var8[1][class311.field4403];
                var6[var7] = var8[2][class311.field4403];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(ZI)[I", line = 46)
    public final int[] method47(boolean arg0, int arg1) {
        ++field2622;
        if (!arg0) {
            this.method1334(-110, -31, 84);
        }
        int[] var3 = super.field2310.method91(0, arg1);
        if (super.field2310.field169) {
            for (int var4 = 0; ~var4 > ~class598.field8136; ++var4) {
                this.method1334(arg1, var4, 255);
                int[] var5 = this.method1202(class246.field3215, -1150480797, 0);
                var3[var4] = var5[class311.field4403];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(ILdt;Z)V", line = 82)
    public final void method44(int arg0, class254 arg1, boolean arg2) {
        if (arg2) {
            field2627 = null;
        }
        if (~arg0 == -1) {
            super.field2305 = arg1.method1731((byte) 64) == 1;
        }
        ++field2626;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(IIIIBILjava/lang/String;I)V", line = 97)
    public static final void method1331(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, String arg6, int arg7) {
        ++field2624;
        class704 var8 = new class704();
        var8.field9637 = arg3;
        var8.field9641 = arg6;
        var8.field9633 = class572.field7788 - -arg0;
        var8.field9636 = arg7;
        var8.field9632 = arg5;
        int var9 = -110 % ((arg4 - -29) / 59);
        var8.field9638 = arg1;
        var8.field9634 = arg2;
        class325.field4620.method2188((byte) 31, var8);
    }

    @OriginalMember(owner = "client!op", name = "c", descriptor = "(III)V", line = 116)
    public static final void method1332(int arg0, int arg1, int arg2) {
        ++field2625;
        int var3 = class643.field8657.method3619((byte) -69, class58.field721.method365(class55.field647, (byte) 92));
        int var5;
        if (class30.field301) {
            for (class641 var4 = (class641) class716.field9763.method152((byte) -13); var4 != null; var4 = (class641) class716.field9763.method146((byte) 97)) {
                int var6;
                if (var4.field8639 == 1) {
                    var6 = class320.method2073(arg0 ^ 15381, (class478) var4.field8636.field259.field8885);
                } else {
                    var6 = class648.method3597((byte) 84, var4);
                }
                if (~var6 < ~var3) {
                    var3 = var6;
                }
            }
            var5 = class382.field5558 * 16 + 21;
            var3 += 8;
            class625.field8477 = class382.field5558 * 16 - -(!class348.field5048 ? 22 : 26);
        } else {
            for (class478 var7 = (class478) class645.field8695.method679((byte) -86); var7 != null; var7 = (class478) class645.field8695.method681(-23)) {
                int var10 = class320.method2073(-122, var7);
                if (var10 > var3) {
                    var3 = var10;
                }
            }
            class625.field8477 = (class348.field5048 ? 26 : 22) + class269.field3929 * 16;
            var5 = class269.field3929 * 16 + 21;
            var3 += 8;
        }
        int var8 = arg1 - var3 / 2;
        if (var3 + var8 > class460.field6558) {
            var8 = -var3 + class460.field6558;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg2;
        if (~class693.field9222 > ~(arg2 - -var5)) {
            var9 = -var5 + class693.field9222;
        }
        if (arg0 != 15460) {
            field2627 = null;
        }
        class92.field1298 = var8;
        if (~var9 > -1) {
            var9 = 0;
        }
        class677.field9075 = true;
        class632.field8551 = var9;
        class677.field9082 = var3;
    }

    @OriginalMember(owner = "client!op", name = "c", descriptor = "(B)V", line = 201)
    public static void method1333(byte arg0) {
        field2627 = null;
        field2623 = null;
        if (arg0 != 83) {
            field2623 = null;
        }
    }

    @OriginalMember(owner = "client!op", name = "d", descriptor = "(III)V", line = 214)
    private final void method1334(int arg0, int arg1, int arg2) {
        ++field2628;
        int var4 = class693.field9221[arg1];
        if (arg2 != 255) {
            field2627 = null;
        }
        int var5 = class456.field6536[arg0];
        float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 + -2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class311.field4403 = arg1;
            class246.field3215 = arg0;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class246.field3215 = arg1;
            class311.field4403 = arg0;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class246.field3215 = arg1;
            class311.field4403 = -arg0 + class598.field8136;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class246.field3215 = -arg0 + class561.field7687;
            class311.field4403 = arg1;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class246.field3215 = -arg0 + class561.field7687;
            class311.field4403 = -arg1 + class598.field8136;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class246.field3215 = class561.field7687 - arg1;
            class311.field4403 = class598.field8136 - arg0;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class246.field3215 = -arg1 + class561.field7687;
            class311.field4403 = arg0;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class311.field4403 = -arg1 + class598.field8136;
            class246.field3215 = arg0;
        }
        class246.field3215 &= class698.field9254;
        class311.field4403 &= class412.field5896;
    }

    @OriginalMember(owner = "client!op", name = "<init>", descriptor = "()V", line = 298)
    public class202() {
        super(1, false);
    }
}
