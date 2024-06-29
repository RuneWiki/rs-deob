import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public class class315 {

    @OriginalMember(owner = "client!pr", name = "c", descriptor = "Lip;")
    public static class508 field4584 = new class508("", 10);

    @OriginalMember(owner = "client!pr", name = "e", descriptor = "I")
    public static int field4586 = 1;

    @OriginalMember(owner = "client!pr", name = "d", descriptor = "[Lvr;")
    public static class91[] field4585 = new class91[14];

    @OriginalMember(owner = "client!pr", name = "g", descriptor = "I")
    public static int field4588 = 0;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "I")
    public static int field4582;

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "I")
    public static int field4583;

    @OriginalMember(owner = "client!pr", name = "h", descriptor = "I")
    public static int field4589;

    @OriginalMember(owner = "client!pr", name = "i", descriptor = "I")
    public static int field4590;

    @OriginalMember(owner = "client!pr", name = "f", descriptor = "Luu;")
    public static class191 field4587;

    @OriginalMember(owner = "client!pr", name = "j", descriptor = "Laa;")
    public static class341 field4591;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(IIIBZI)V")
    public static final void method1979(int arg0, int arg1, int arg2, byte arg3, boolean arg4, int arg5) {
        field4589++;
        if (class443.field6672 == null) {
            class400.field6090.method1117(arg0, arg2, -16777216, arg1, arg5, (byte) 73);
        } else if (class56.field800.field1867 >= 0 && class398.field6071 * 128 > class56.field800.field1867 && class56.field800.field1862 >= 0 && class528.field7734 * 128 > class56.field800.field1862) {
            class206.field2765++;
            if (class56.field800 != null && (class56.field800.field1867 - ((class56.field800.method637((byte) -123) - 1) * 64) >> 7) == class75.field1103 && (class56.field800.field1862 - (class56.field800.method637((byte) 3) - 1) * 64 >> 7) == class309.field4501) {
                class309.field4501 = -1;
                class75.field1103 = -1;
                class48.method374((byte) -76);
            }
            class431.method2629(3);
            if (!arg4) {
                class165.method1119(arg3 ^ 0xFFFFCEF1);
            }
            class491.method2929(123);
            class466.method2803(arg5, arg3 + 184, arg2, arg1, arg0, true);
            int var6 = class359.field5513;
            int var7 = class320.field4633;
            int var8 = class72.field997;
            int var9 = class178.field2381;
            if (class340.field5269 == 1) {
                int var10 = (int) class536.field7870;
                if (var10 < class426.field6481 >> 8) {
                    var10 = class426.field6481 >> 8;
                }
                if (class17.field286[4] && (class475.field7056[4] + 128) > var10) {
                    var10 = class475.field7056[4] + 128;
                }
                int var11 = (int) class53.field744 + class147.field1957 & 0x3FFF;
                class107.method682(var10, (var10 >> 3) * 3 + 600 << 0, class312.field4571, (byte) -85, var11, class352.method2264(-124, class367.field5618, class56.field800.field1862, class56.field800.field1867) - 50, class366.field5609, var9);
            } else if (class340.field5269 == 4) {
                int var12 = (int) class536.field7870;
                if (var12 < (class426.field6481 >> 8)) {
                    var12 = class426.field6481 >> 8;
                }
                if (class17.field286[4] && class475.field7056[4] + 128 > var12) {
                    var12 = class475.field7056[4] + 128;
                }
                int var13 = (int) class53.field744 & 0x3FFF;
                class107.method682(var12, (var12 >> 3) * 3 + 600 << 0, class312.field4571, (byte) -126, var13, class352.method2264(arg3 + 4, class367.field5618, class21.field320, class62.field883) - 50, class366.field5609, var9);
            } else if (class340.field5269 == 5) {
                class401.method2479(-23383, var9);
            }
            int var14 = class199.field2646;
            int var15 = class26.field384;
            int var16 = class140.field1869;
            int var17 = class296.field4378;
            int var18 = class49.field702;
            for (int var19 = 0; var19 < 5; var19++) {
                if (class17.field286[var19]) {
                    int var22 = (int) (Math.random() * (double) (class309.field4503[var19] * 2 + 1) + Math.sin((double) class514.field7554[var19] / 100.0D * (double) class508.field7477[var19]) * (double) class475.field7056[var19] - (double) class309.field4503[var19]);
                    if (var19 == 0) {
                        class199.field2646 += var22;
                    }
                    if (var19 == 1) {
                        class26.field384 += var22;
                    }
                    if (var19 == 3) {
                        class49.field702 = class49.field702 + var22 & 0x3FFF;
                    }
                    if (var19 == 2) {
                        class140.field1869 += var22;
                    }
                    if (var19 == 4) {
                        class296.field4378 += var22;
                        if (class296.field4378 < 1024) {
                            class296.field4378 = 1024;
                        } else if (class296.field4378 > 3072) {
                            class296.field4378 = 3072;
                        }
                    }
                }
            }
            if (class199.field2646 < 0) {
                class199.field2646 = 0;
            }
            if (((class533.field7842 << 7) - 1) < class199.field2646) {
                class199.field2646 = (class533.field7842 << 7) - 1;
            }
            if (class140.field1869 < 0) {
                class140.field1869 = 0;
            }
            if (class140.field1869 > (class475.field7051 << 7) - 1) {
                class140.field1869 = (class475.field7051 << 7) - 1;
            }
            class85.method582(15662);
            class461.method2790(-82);
            class400.field6090.method739(var8, var7, var6 + var8, var7 - -var9);
            class400.field6090.method831();
            int var20 = class375.field5702;
            if (class121.field1655 == null) {
                class400.field6090.method834(var20);
            } else {
                class121.field1655.method481((byte) 114, class400.field6090, class361.field5534 << 3, var6, class296.field4378, var8, var7, class49.field702, var20, var9);
            }
            class523.method3104((byte) -1);
            class24.field346.method140(class199.field2646, class26.field384, class140.field1869, -class296.field4378 & 0x3FFF, -class49.field702 & 0x3FFF, -class334.field5197 & 0x3FFF);
            class400.field6090.method821(class24.field346);
            class400.field6090.method762(var8 + (var6 / 2), var9 / 2 + var7, client.field2678 << 1, client.field2678 << 1);
            class294.method1882(arg3 + 229, client.field2678 << 1, client.field2678 << 1, var6 / 2 + var8, var9 / 2 + var7);
            class319.method1992(class26.field384, class199.field2646, -class296.field4378 & 0x3FFF, -class49.field702 & 0x3FFF, class140.field1869, -class334.field5197 & 0x3FFF, (byte) 115);
            byte var21 = class203.field2716.method16(class378.field5771, -110) == 2 ? (byte) class206.field2765 : 1;
            class414.method2545(class400.field6090, class393.field6017, field4586, class24.field346, class199.field2646, class26.field384, class140.field1869, class304.field4438, class394.field6021, class282.field4153, class78.field1127, class102.field1476, class390.field5958, class56.field800.field1866 + 1, var21, class56.field800.field1867 >> 7, class56.field800.field1862 >> 7, !class203.field2716.field1182);
            class523.method3104((byte) -1);
            if (class435.field6596 == 9) {
                class387.method2424(var6, arg3 ^ 0x3D, var7, var8, 256, 256, var9);
                class147.method977(-22590, var6, var7, 256, 256, var9, var8);
                class526.method3116(102, var8, var9, var6, 256, 256, var7);
                class110.method695((byte) 12, var7, var6, var8, var9);
            }
            class131.method894();
            class199.field2646 = var14;
            class140.field1869 = var16;
            class49.field702 = var18;
            class296.field4378 = var17;
            if (arg3 != -102) {
                field4588 = 70;
            }
            class26.field384 = var15;
            if (class215.field3039 && class13.field258.method889((byte) 57) == 0) {
                class215.field3039 = false;
            }
            if (class215.field3039) {
                class400.field6090.method1117(var9, var7, -16777216, var8, var6, (byte) 73);
                class536.method3166(class86.field1253.method2705((byte) 69, class257.field3556), false, class94.field1380, 2);
            }
        } else {
            class400.field6090.method1117(arg0, arg2, -16777216, arg1, arg5, (byte) 73);
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(Ll;ILuu;)V")
    public static final void method1980(class15 arg0, int arg1, class191 arg2) {
        int var3 = -126 % ((arg1 - 34) / 34);
        class446.field6695 = arg0;
        field4582++;
        class330.field5153 = arg2;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(I)V")
    public static void method1981(int arg0) {
        field4585 = null;
        field4591 = null;
        field4584 = null;
        if (arg0 == 1) {
            field4587 = null;
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(FFFZ)F")
    public static final float method1982(float arg0, float arg1, float arg2, boolean arg3) {
        field4583++;
        if (!arg3) {
            field4587 = null;
        }
        return (arg0 - arg2) * arg1 + arg2;
    }
}
