import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class146 extends class34 {

    @OriginalMember(owner = "client!nh", name = "y", descriptor = "Lv;")
    public class218 field2610 = new class218();

    @OriginalMember(owner = "client!nh", name = "N", descriptor = "Llg;")
    public class125 field2625 = new class125();

    @OriginalMember(owner = "client!nh", name = "z", descriptor = "Lma;")
    private class129 field2611;

    @OriginalMember(owner = "client!nh", name = "K", descriptor = "Loc;")
    public static class151 field2622 = class137.method873(2, "Starte 3D)2Softwarebibliothek");

    @OriginalMember(owner = "client!nh", name = "v", descriptor = "I")
    public static int field2607 = 0;

    @OriginalMember(owner = "client!nh", name = "P", descriptor = "Loc;")
    private static class151 field2627 = class137.method873(2, "Prepared visibility map");

    @OriginalMember(owner = "client!nh", name = "E", descriptor = "[Loc;")
    public static class151[] field2616 = new class151[200];

    @OriginalMember(owner = "client!nh", name = "w", descriptor = "Loc;")
    public static class151 field2608 = field2627;

    @OriginalMember(owner = "client!nh", name = "I", descriptor = "Loc;")
    public static class151 field2620 = class137.method873(2, "Fps:");

    @OriginalMember(owner = "client!nh", name = "u", descriptor = "I")
    public static int field2606;

    @OriginalMember(owner = "client!nh", name = "x", descriptor = "I")
    public static int field2609;

    @OriginalMember(owner = "client!nh", name = "B", descriptor = "I")
    public static int field2613;

    @OriginalMember(owner = "client!nh", name = "C", descriptor = "I")
    public static int field2614;

    @OriginalMember(owner = "client!nh", name = "D", descriptor = "I")
    public static int field2615;

    @OriginalMember(owner = "client!nh", name = "F", descriptor = "I")
    public static int field2617;

    @OriginalMember(owner = "client!nh", name = "G", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!nh", name = "H", descriptor = "I")
    public static int field2619;

    @OriginalMember(owner = "client!nh", name = "J", descriptor = "I")
    public static int field2621;

    @OriginalMember(owner = "client!nh", name = "L", descriptor = "I")
    public static int field2623;

    @OriginalMember(owner = "client!nh", name = "M", descriptor = "I")
    public static int field2624;

    @OriginalMember(owner = "client!nh", name = "O", descriptor = "I")
    public static int field2626;

    @OriginalMember(owner = "client!nh", name = "A", descriptor = "[S")
    public static short[] field2612;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(JI)V")
    public static final void method926(long arg0, int arg1) {
        if (arg1 >= -29) {
            return;
        }
        field2619++;
        if (arg0 == 0L) {
            return;
        }
        if (class32.field658 >= 100) {
            client.method246(0, (byte) -78, class134.field2441, class142.field2573);
            return;
        }
        class151 var3 = class155.method1016(0, arg0).method994(-121);
        for (int var4 = 0; var4 < class32.field658; var4++) {
            if (class224.field3909[var4] == arg0) {
                client.method246(0, (byte) -104, class134.field2441, class126.method761(new class151[] { var3, class45.field933 }, 10260));
                return;
            }
        }
        for (int var5 = 0; var5 < class36.field758; var5++) {
            if (class233.field4290[var5] == arg0) {
                client.method246(0, (byte) -88, class134.field2441, class126.method761(new class151[] { class45.field929, var3, class31.field641 }, 10260));
                return;
            }
        }
        if (var3.method976(48, class228.field3975.field416)) {
            client.method246(0, (byte) -96, class134.field2441, class147.field2638);
            return;
        }
        class224.field3909[class32.field658] = arg0;
        class23.field507++;
        class170.field3103[class32.field658++] = class155.method1016(0, arg0);
        class75.field1441 = class1.field35;
        class48.field984.method650(-13721, 106);
        class48.field984.method1458((byte) 125, arg0);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIII)V")
    public static final void method927(int arg0, int arg1, int arg2, int arg3) {
        class232 var4 = class197.method1235(116, arg0, arg3);
        if (var4 != null && var4.field4185 != null) {
            class224 var5 = new class224();
            var5.field3905 = var4;
            var5.field3895 = var4.field4185;
            class110.method664(1785261985, var5);
        }
        field2614++;
        class95.field1771 = arg3;
        class58.field1162 = arg0;
        class54.field1103 = arg1;
        class159.field2859 = true;
        if (arg2 > -99) {
            field2608 = null;
        }
        class27.method208(true, var4);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "([IIILwf;II)V")
    private final void method928(int[] arg0, int arg1, int arg2, class234 arg3, int arg4, int arg5) {
        if ((this.field2611.field2312[arg3.field4324] & 0x4) != 0 && arg3.field4305 < 0) {
            int var7 = this.field2611.field2353[arg3.field4324] / class204.field3624;
            while (true) {
                int var8 = (var7 + 1048575 - arg3.field4327) / var7;
                if (var8 > arg1) {
                    arg3.field4327 += arg1 * var7;
                    break;
                }
                arg1 -= var8;
                arg3.field4326.method253(arg0, arg4, var8);
                class136 var9 = arg3.field4326;
                int var10 = 262144 / var7;
                arg4 += var8;
                int var11 = class204.field3624 / 100;
                if (var10 < var11) {
                    var11 = var10;
                }
                arg3.field4327 += var7 * var8 - 1048576;
                if (this.field2611.field2336[arg3.field4324] == 0) {
                    arg3.field4326 = class136.method848(arg3.field4304, var9.method863(), var9.method830(), var9.method831());
                } else {
                    arg3.field4326 = class136.method848(arg3.field4304, var9.method863(), 0, var9.method831());
                    this.field2611.method793(arg3, true, arg3.field4321.field2136[arg3.field4318] < 0);
                    arg3.field4326.method846(var11, var9.method830());
                }
                if (arg3.field4321.field2136[arg3.field4318] < 0) {
                    arg3.field4326.method828(-1);
                }
                var9.method861(var11);
                var9.method253(arg0, arg4, arg2 - arg4);
                if (var9.method835()) {
                    this.field2625.method752(var9);
                }
            }
        }
        arg3.field4326.method253(arg0, arg4, arg1);
        field2615++;
        if (arg5 < 68) {
            this.field2610 = null;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Z)V")
    public static void method929(boolean arg0) {
        field2622 = null;
        field2616 = null;
        field2612 = null;
        field2627 = null;
        if (arg0) {
            field2612 = null;
        }
        field2608 = null;
        field2620 = null;
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "()Ld;")
    public final class34 method251() {
        field2626++;
        class234 var1;
        do {
            var1 = (class234) this.field2610.method1360(true);
            if (var1 == null) {
                return null;
            }
        } while (var1.field4326 == null);
        return var1.field4326;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IILwf;)V")
    private final void method930(int arg0, int arg1, class234 arg2) {
        field2623++;
        if ((this.field2611.field2312[arg2.field4324] & 0x4) != 0 && arg2.field4305 < 0) {
            int var4 = this.field2611.field2353[arg2.field4324] / class204.field3624;
            int var5 = (var4 + 1048575 - arg2.field4327) / var4;
            arg2.field4327 = arg1 * var4 + arg2.field4327 & 0xFFFFF;
            if (arg1 >= var5) {
                if (this.field2611.field2336[arg2.field4324] == 0) {
                    arg2.field4326 = class136.method848(arg2.field4304, arg2.field4326.method863(), arg2.field4326.method830(), arg2.field4326.method831());
                } else {
                    arg2.field4326 = class136.method848(arg2.field4304, arg2.field4326.method863(), 0, arg2.field4326.method831());
                    this.field2611.method793(arg2, true, arg2.field4321.field2136[arg2.field4318] < 0);
                }
                if (arg2.field4321.field2136[arg2.field4318] < 0) {
                    arg2.field4326.method828(-1);
                }
                arg1 = arg2.field4327 / var4;
            }
        }
        if (arg0 == 1048575) {
            arg2.field4326.method255(arg1);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lri;")
    public static final class187 method931(Throwable arg0, String arg1) {
        field2624++;
        class187 var2;
        if (arg0 instanceof class187) {
            var2 = (class187) arg0;
            var2.field3321 = var2.field3321 + ' ' + arg1;
        } else {
            var2 = new class187(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IZIIII)V")
    public static final void method932(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field2613++;
        if (arg1) {
            method926(24L, -80);
        }
        int var6 = class116.method704(class154.field2793, arg3, 27104, class233.field4281);
        int var7 = class116.method704(class154.field2793, arg2, 27104, class233.field4281);
        int var8 = class116.method704(class25.field524, arg5, 27104, class79.field1526);
        int var9 = class116.method704(class25.field524, arg4, 27104, class79.field1526);
        for (int var10 = var6; var10 <= var7; var10++) {
            class55.method380(arg0, 106, class43.field887[var10], var9, var8);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "()Ld;")
    public final class34 method250() {
        field2621++;
        class234 var1 = (class234) this.field2610.method1358(-29726);
        if (var1 == null) {
            return null;
        } else if (var1.field4326 == null) {
            return this.method251();
        } else {
            return var1.field4326;
        }
    }

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "()I")
    public final int method256() {
        field2618++;
        return 0;
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)V")
    public final void method255(int arg0) {
        field2609++;
        this.field2625.method255(arg0);
        for (class234 var2 = (class234) this.field2610.method1358(-29726); var2 != null; var2 = (class234) this.field2610.method1360(true)) {
            if (!this.field2611.method805(-128, var2)) {
                int var3 = arg0;
                do {
                    if (var2.field4320 >= var3) {
                        this.method930(1048575, var3, var2);
                        var2.field4320 -= var3;
                        break;
                    }
                    this.method930(1048575, var2.field4320, var2);
                    var3 -= var2.field4320;
                } while (!this.field2611.method782(null, var3, var2, -53, 0));
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "([III)V")
    public final void method253(int[] arg0, int arg1, int arg2) {
        field2606++;
        this.field2625.method253(arg0, arg1, arg2);
        for (class234 var4 = (class234) this.field2610.method1358(-29726); var4 != null; var4 = (class234) this.field2610.method1360(true)) {
            if (!this.field2611.method805(-128, var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field4320) {
                        this.method928(arg0, var6, var5 + var6, var4, var5, 77);
                        var4.field4320 -= var6;
                        break;
                    }
                    this.method928(arg0, var4.field4320, var5 + var6, var4, var5, 124);
                    var5 += var4.field4320;
                    var6 -= var4.field4320;
                } while (!this.field2611.method782(arg0, var6, var4, 119, var5));
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Lma;)V")
    public class146(class129 arg0) {
        this.field2611 = arg0;
    }
}
