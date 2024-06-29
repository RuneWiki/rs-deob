import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public class class401 {

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "I")
    public static int field5620 = 104;

    @OriginalMember(owner = "client!rp", name = "d", descriptor = "I")
    public static int field5622;

    @OriginalMember(owner = "client!rp", name = "f", descriptor = "I")
    public static int field5624;

    @OriginalMember(owner = "client!rp", name = "h", descriptor = "I")
    public static int field5626;

    @OriginalMember(owner = "client!rp", name = "e", descriptor = "J")
    public long field5623;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "Lr;")
    public static class166 field5619;

    @OriginalMember(owner = "client!rp", name = "c", descriptor = "Lrp;")
    public class401 field5621;

    @OriginalMember(owner = "client!rp", name = "g", descriptor = "Lrp;")
    public class401 field5625;

    @OriginalMember(owner = "client!rp", name = "i", descriptor = "[Lvv;")
    public static class295[] field5627;

    @OriginalMember(owner = "client!rp", name = "e", descriptor = "(I)Z", line = 6)
    public final boolean method2339(int arg0) {
        field5624++;
        if (this.field5621 == null) {
            return false;
        } else {
            if (arg0 < 102) {
                this.method2340(-21);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!rp", name = "f", descriptor = "(I)V", line = 28)
    public final void method2340(int arg0) {
        field5626++;
        if (this.field5621 == null) {
            return;
        }
        this.field5621.field5625 = this.field5625;
        this.field5625.field5621 = this.field5621;
        this.field5625 = null;
        this.field5621 = null;
        int var2 = 48 % ((20 - arg0) / 54);
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(Z)V", line = 45)
    public static void method2341(boolean arg0) {
        if (arg0) {
            method2342(true, 5, true, 106, 25, -49);
        }
        field5619 = null;
        field5627 = null;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(ZIZIII)V", line = 61)
    public static final void method2342(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field5622++;
        if (class295.field4051 == null) {
            class334.field4506.method1170(-16777216, arg3, arg4, arg5, arg1, -28207);
        } else if (class143.field2063.field4042 >= 0 && field5620 * 512 > class143.field2063.field4042 && class143.field2063.field4047 >= 0 && class257.field3508 * 512 > class143.field2063.field4047) {
            class241.field3299++;
            if (class143.field2063 != null && (class143.field2063.field4042 + 256 - (class143.field2063.method881(-115) * 256) >> 9) == class525.field7124 && (class143.field2063.field4047 + 256 - (class143.field2063.method881(-110) * 256) >> 9) == class289.field3961) {
                class525.field7124 = -1;
                class289.field3961 = -1;
                class428.method2458((byte) -97);
            }
            class61.method507((byte) 120);
            if (!arg2) {
                class169.method1198((byte) 58);
            }
            class516.method2946((byte) 101);
            class613.method3428(arg4, arg3, false, true, arg5, arg1);
            int var6 = class369.field4967;
            int var7 = class696.field9894;
            int var8 = class689.field9824;
            int var9 = class493.field6732;
            if (class203.field2863 == 1) {
                int var10 = (int) class228.field3168;
                if (var10 < (class604.field8405 >> 8)) {
                    var10 = class604.field8405 >> 8;
                }
                if (class524.field7115[4] && (class100.field1406[4] + 128) > var10) {
                    var10 = class100.field1406[4] + 128;
                }
                int var11 = (int) class705.field9964 + class568.field8077 & 0x3FFF;
                class111.method805(119, (var10 >> 3) * 3 + 600 << 2, var11, class249.method1533(class367.field4944, class143.field2063.field4047, class143.field2063.field4042, 50) - 200, class10.field93, var8, var10, class476.field6552);
            } else if (class203.field2863 == 4) {
                int var12 = (int) class228.field3168;
                if (var12 < (class604.field8405 >> 8)) {
                    var12 = class604.field8405 >> 8;
                }
                if (class524.field7115[4] && (class100.field1406[4] + 128) > var12) {
                    var12 = class100.field1406[4] + 128;
                }
                int var13 = (int) class705.field9964 & 0x3FFF;
                class111.method805(102, (var12 >> 3) * 3 + 600 << 2, var13, class249.method1533(class367.field4944, class323.field4403, class247.field3386, -99) - 200, class10.field93, var8, var12, class476.field6552);
            } else if (class203.field2863 == 5) {
                class90.method658(16384, var8);
            }
            int var14 = class666.field9335;
            int var15 = class441.field6102;
            int var16 = class11.field114;
            int var17 = class685.field9771;
            int var18 = class41.field475;
            for (int var19 = 0; var19 < 5; var19++) {
                if (class524.field7115[var19]) {
                    int var22 = (int) ((double) (-class44.field537[var19]) + Math.random() * (double) (class44.field537[var19] * 2 + 1) + Math.sin((double) class534.field7224[var19] / 100.0D * (double) class81.field1215[var19]) * (double) class100.field1406[var19]);
                    if (var19 == 3) {
                        class41.field475 = class41.field475 + var22 & 0x3FFF;
                    }
                    if (var19 == 0) {
                        class666.field9335 += var22 << 2;
                    }
                    if (var19 == 4) {
                        class685.field9771 += var22;
                        if (class685.field9771 < 1024) {
                            class685.field9771 = 1024;
                        } else if (class685.field9771 > 3072) {
                            class685.field9771 = 3072;
                        }
                    }
                    if (var19 == 2) {
                        class11.field114 += var22 << 2;
                    }
                    if (var19 == 1) {
                        class441.field6102 += var22 << 2;
                    }
                }
            }
            if (class666.field9335 < 0) {
                class666.field9335 = 0;
            }
            if ((class335.field4511 << 9) - 1 < class666.field9335) {
                class666.field9335 = (class335.field4511 << 9) - 1;
            }
            if (class11.field114 < 0) {
                class11.field114 = 0;
            }
            if (((class643.field8878 << 9) - 1) < class11.field114) {
                class11.field114 = (class643.field8878 << 9) - 1;
            }
            class470.method2659(-99);
            class116.method826(2000);
            class334.field4506.method200(var7, var9, var6 + var7, var9 - -var8);
            class334.field4506.method89();
            int var20 = class14.field151;
            if (class261.field3549 == null) {
                class334.field4506.method101(var20);
            } else {
                class261.field3549.method2390(class334.field4506, var6, 3, var7, var8, var9, class41.field475, class685.field9771, class14.field149 << 3, var20);
            }
            class466.method2634(5);
            class250.field3403.method680(class666.field9335, class441.field6102, class11.field114, -class685.field9771 & 0x3FFF, -class41.field475 & 0x3FFF, -class164.field2363 & 0x3FFF);
            class334.field4506.method93(class250.field3403);
            class334.field4506.method161(var6 / 2 + var7, var8 / 2 + var9, class28.field341 << 1, class28.field341 << 1);
            class149.method1089(class28.field341 << 1, var6 / 2 + var7, 4096, class28.field341 << 1, var8 / 2 + var9);
            class9.method42(class11.field114, class441.field6102, -class41.field475 & 0x3FFF, -class164.field2363 & 0x3FFF, 12803, class666.field9335, -class685.field9771 & 0x3FFF);
            byte var21 = class366.field4875.method541(class503.field6917, 1) == 2 ? (byte) class241.field3299 : 1;
            class431.method2479(class186.field2697, class666.field9335, class441.field6102, class11.field114, class468.field6439, class338.field4528, class606.field8430, class287.field3953, class185.field2691, class360.field4760, class143.field2063.field4053 + 1, var21, class143.field2063.field4042 >> 9, class143.field2063.field4047 >> 9, !class366.field4875.field9375, arg0);
            class466.method2634(5);
            if (class285.field3921 == 10) {
                class50.method399(var7, var8, 2, var6, var9, 256, 256);
                class100.method731(256, var8, var7, var6, 256, var9, false);
                class148.method1087(256, var9, var6, 256, var7, var8, 0);
                class367.method2121((byte) -118, var8, var7, var9, var6);
            }
            class603.method3395();
            class441.field6102 = var15;
            class685.field9771 = var17;
            class11.field114 = var16;
            class666.field9335 = var14;
            class41.field475 = var18;
            if (class213.field2981 && class654.field9099.method733(9670) == 0) {
                class213.field2981 = false;
            }
            if (class213.field2981) {
                class334.field4506.method1170(-16777216, var8, var7, var6, var9, -28207);
                class124.method890(class65.field800.method555(class697.field9900, arg0), class273.field3741, -1, false, class334.field4506, class136.field1916);
            }
        } else {
            class334.field4506.method1170(-16777216, arg3, arg4, arg5, arg1, -28207);
        }
    }
}
