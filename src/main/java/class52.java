import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class52 extends class225 {

    @OriginalMember(owner = "client!cg", name = "o", descriptor = "I")
    private final int field824;

    @OriginalMember(owner = "client!cg", name = "x", descriptor = "I")
    private final int field833;

    @OriginalMember(owner = "client!cg", name = "n", descriptor = "I")
    private final int field823;

    @OriginalMember(owner = "client!cg", name = "l", descriptor = "I")
    private final int field821;

    @OriginalMember(owner = "client!cg", name = "p", descriptor = "Lma;")
    public static class5 field825 = class12.method119("sl_back", (byte) 117);

    @OriginalMember(owner = "client!cg", name = "m", descriptor = "[Z")
    public static boolean[] field822 = new boolean[100];

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "I")
    public static int field819;

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "I")
    public static int field820;

    @OriginalMember(owner = "client!cg", name = "r", descriptor = "I")
    public static int field827;

    @OriginalMember(owner = "client!cg", name = "s", descriptor = "I")
    public static int field828;

    @OriginalMember(owner = "client!cg", name = "t", descriptor = "I")
    public static int field829;

    @OriginalMember(owner = "client!cg", name = "u", descriptor = "I")
    public static int field830;

    @OriginalMember(owner = "client!cg", name = "v", descriptor = "I")
    public static int field831;

    @OriginalMember(owner = "client!cg", name = "w", descriptor = "I")
    public static int field832;

    @OriginalMember(owner = "client!cg", name = "q", descriptor = "Lje;")
    public static class158 field826;

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(I)V", line = 7)
    public static final void method391(int arg0) {
        if (arg0 < -97) {
            field832++;
            class131.field1963.method523(123);
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)V", line = 18)
    public static void method392(byte arg0) {
        if (arg0 < -55) {
            field826 = null;
            field825 = null;
            field822 = null;
        }
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(IIB)V", line = 30)
    public final void method393(int arg0, int arg1, byte arg2) {
        field831++;
        if (arg2 != -3) {
            field825 = (class5) null;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIBI)V", line = 47)
    public static final void method394(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field827++;
        if (arg4 != 84) {
            return;
        }
        int var6 = arg0 - arg3;
        int var7 = arg5 - arg2;
        if (var6 == 0) {
            if (var7 != 0) {
                class70.method503(arg2, arg1, arg5, arg3, arg4 ^ 0x55);
            }
        } else if (var7 == 0) {
            class35.method254(arg4 - 9962, arg2, arg1, arg0, arg3);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = arg2 - (arg3 * var8 >> 12);
            int var10;
            int var11;
            if (class57.field899 > arg0) {
                var10 = (class57.field899 * var8 >> 12) + var9;
                var11 = class57.field899;
            } else if (arg0 <= class301.field5073) {
                var11 = arg0;
                var10 = arg5;
            } else {
                var10 = (class301.field5073 * var8 >> 12) + var9;
                var11 = class301.field5073;
            }
            int var12;
            int var13;
            if (arg3 < class57.field899) {
                var13 = (class57.field899 * var8 >> 12) + var9;
                var12 = class57.field899;
            } else if (arg3 <= class301.field5073) {
                var12 = arg3;
                var13 = arg2;
            } else {
                var12 = class301.field5073;
                var13 = var9 + (class301.field5073 * var8 >> 12);
            }
            if (var10 < class294.field4956) {
                var10 = class294.field4956;
                var11 = (class294.field4956 - var9 << 12) / var8;
            } else if (var10 > class101.field1505) {
                var10 = class101.field1505;
                var11 = (class101.field1505 - var9 << 12) / var8;
            }
            if (var13 < class294.field4956) {
                var13 = class294.field4956;
                var12 = (class294.field4956 - var9 << 12) / var8;
            } else if (class101.field1505 < var13) {
                var13 = class101.field1505;
                var12 = (class101.field1505 - var9 << 12) / var8;
            }
            class240.method1695(var11, arg1, -28633, var12, var13, var10);
        }
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(IIIIII)V", line = 150)
    public class52(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field824 = arg2;
        this.field833 = arg3;
        this.field823 = arg1;
        this.field821 = arg0;
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(IIB)V", line = 162)
    public final void method395(int arg0, int arg1, byte arg2) {
        if (arg2 == 29) {
            field820++;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(BLma;)V", line = 172)
    public static final void method396(byte arg0, class5 arg1) {
        field819++;
        if (arg0 > -67) {
            method392((byte) 47);
        }
        if (class1.field3 >= 2) {
            if (arg1.method29(61, class150.field2181)) {
                class137.method894(0);
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class69.method497(24077, (class5) null, 0, class288.method1940((byte) 60, new class5[] { class136.field2022, class175.method1148(var4, false), class217.field3488 }));
            }
            if (arg1.method29(61, class61.field959)) {
                System.out.println("oncard_geometry:" + class36.field575);
                System.out.println("oncard_2d:" + class36.field573);
                System.out.println("oncard_texture:" + class36.field574);
            }
            if (arg1.method29(61, class234.field3868)) {
                class231.method1644((byte) 125);
            }
            if (arg1.method29(61, class66.field1031)) {
                class112.method741(25, 5);
            }
            if (arg1.method29(61, class97.field1450)) {
                class197.field3131 = true;
            }
            if (arg1.method29(61, class165.field2517)) {
                class197.field3131 = false;
            }
            if (arg1.method29(61, class296.field4976)) {
                for (int var5 = 0; var5 < 4; var5++) {
                    for (int var6 = 1; var6 < 103; var6++) {
                        for (int var7 = 1; var7 < 103; var7++) {
                            class242.field4031[var5].field793[var6][var7] = 0;
                        }
                    }
                }
            }
            if (arg1.method75((byte) 117, class265.field4540) && class90.field1350 != 0) {
                class101.method644(0, arg1.method78(-24938, 6).method54((byte) -83));
            }
            if (arg1.method29(61, class122.field1854) && class90.field1350 == 2) {
                throw new RuntimeException();
            }
            if (arg1.method75((byte) 9, class99.field1483)) {
                class161.field2462 = arg1.method78(-24938, 12).method40((byte) -120).method54((byte) -83);
                class69.method497(24077, (class5) null, 0, class288.method1940((byte) 60, new class5[] { class245.field4067, class175.method1148(class161.field2462, false) }));
            }
            if (arg1.method29(61, class185.field2849)) {
                class184.field2833 = true;
            }
            if (arg1.method62(class238.field3929, -23269)) {
                if (class207.field3291 == null) {
                    class70.method506(1024, 768, -35);
                } else {
                    class278.method1890(30);
                }
            }
        }
        class147.field2127.method1389((byte) 96, 64);
        class147.field2127.method1542(-126, arg1.method36(30673) - 1);
        class257.field4402++;
        class147.field2127.method1522(arg1.method78(-24938, 2), (byte) -93);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIB)V", line = 304)
    public final void method397(int arg0, int arg1, byte arg2) {
        field828++;
        int var4 = this.field821 * arg0 >> 12;
        int var5 = this.field824 * arg0 >> 12;
        int var6 = this.field823 * arg1 >> 12;
        int var7 = this.field833 * arg1 >> 12;
        if (arg2 >= -104) {
            field825 = (class5) null;
        }
        method394(var5, this.field3705, var6, var4, (byte) 84, var7);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ILni;)I", line = 326)
    public static final int method398(int arg0, class202 arg1) {
        field830++;
        int var2 = arg0;
        if (arg1.method1341(-29, class19.field323)) {
            var2 = arg0 + 1;
        }
        if (arg1.method1341(-8, class76.field1190)) {
            var2++;
        }
        return var2;
    }
}
