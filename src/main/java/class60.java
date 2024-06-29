import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class60 {

    @OriginalMember(owner = "client!in", name = "c", descriptor = "Ljk;")
    private class449 field778 = new class449(64);

    @OriginalMember(owner = "client!in", name = "m", descriptor = "Ljk;")
    private class449 field788 = new class449(100);

    @OriginalMember(owner = "client!in", name = "e", descriptor = "Lqn;")
    private class47 field780;

    @OriginalMember(owner = "client!in", name = "g", descriptor = "I")
    public static int field782 = 16777215;

    @OriginalMember(owner = "client!in", name = "i", descriptor = "I")
    public static int field784 = -1;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "I")
    public static int field776;

    @OriginalMember(owner = "client!in", name = "b", descriptor = "I")
    public static int field777;

    @OriginalMember(owner = "client!in", name = "d", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "client!in", name = "f", descriptor = "I")
    public static int field781;

    @OriginalMember(owner = "client!in", name = "h", descriptor = "I")
    public static int field783;

    @OriginalMember(owner = "client!in", name = "j", descriptor = "I")
    public static int field785;

    @OriginalMember(owner = "client!in", name = "k", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "client!in", name = "l", descriptor = "I")
    public static int field787;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(II)I", line = 6)
    public static final int method550(int arg0, int arg1) {
        int var7 = arg1 - 1;
        if (arg0 < 95) {
            field784 = 62;
        }
        field777++;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(II)Lcm;", line = 27)
    public final class513 method551(int arg0, int arg1) {
        field783++;
        class449 var3 = this.field788;
        class513 var4;
        synchronized (this.field788) {
            var4 = (class513) this.field788.method2647(arg1 ^ 0xFFFFA234, (long) arg0);
            if (var4 == null) {
                var4 = new class513(arg0);
                this.field788.method2635((long) arg0, -26591, var4);
            }
        }
        synchronized (var4) {
            if (var4.method3067(0)) {
                if (arg1 != 23968) {
                    method555(null, null, -26, -125, -25, -61, 41);
                }
                return var4;
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(I)V", line = 56)
    public final void method552(int arg0) {
        field776++;
        class449 var2 = this.field778;
        synchronized (this.field778) {
            this.field778.method2640(arg0 ^ 0x4B);
        }
        class449 var3 = this.field788;
        synchronized (this.field788) {
            if (arg0 != 30) {
                field782 = 0;
            }
            this.field788.method2640(arg0 ^ 0x77);
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(B)V", line = 72)
    public final void method553(byte arg0) {
        field787++;
        class449 var2 = this.field778;
        synchronized (this.field778) {
            this.field778.method2642(arg0 ^ 0x37);
        }
        class449 var3 = this.field788;
        synchronized (this.field788) {
            if (arg0 != 55) {
                this.method551(-128, 3);
            }
            this.field788.method2642(0);
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(ILhd;Lhd;)V", line = 88)
    public static final void method554(int arg0, class523 arg1, class523 arg2) {
        if (arg0 != -1) {
            return;
        }
        class505.field7277++;
        class282.method1669(class511.field7407, false);
        field781++;
        class40.field511.method2777(arg2.field7723, -11);
        class40.field511.method2748(arg2.field7562, 8016);
        class40.field511.method2785(arg1.field7567, 15103);
        class40.field511.method2753(arg1.field7723, -25597);
        class40.field511.method2759((byte) -60, arg2.field7567);
        class40.field511.method2748(arg1.field7562, 8016);
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Lga;Lya;IIIII)V", line = 106)
    public static final void method555(class278 arg0, class38 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field786++;
        if (class285.field3646 < 100) {
            class49.method508(arg0, arg1, 91);
        }
        arg1.method330(arg5, arg4, arg3 + arg5, arg2 + arg4);
        if (class285.field3646 < 100) {
            byte var7 = 20;
            int var8 = arg5 + (arg3 / 2);
            arg1.method308(arg5, arg4, arg3, arg2, -16777216, 0);
            int var9 = arg2 / 2 + arg4 - var7 - 18;
            arg1.method303(var8 - 152, var9, 304, 34, class249.field3192[class288.field3682].getRGB(), 0);
            arg1.method308(var8 - 150, var9 + 2, class285.field3646 * 3, 30, class64.field833[class288.field3682].getRGB(), 0);
            class91.field1116.method1852(var7 + var9, -32458, var8, -1, class510.field7364.method1936(-26539, class11.field177), class338.field4246[class288.field3682].getRGB());
            return;
        }
        int var10 = class175.field2277 - ((int) ((float) arg3 / class241.field3107));
        int var11 = class38.field496 + ((int) ((float) arg2 / class241.field3107));
        int var12 = (int) ((float) arg3 / class241.field3107) + class175.field2277;
        class452.field6529 = class38.field496 - ((int) ((float) arg2 / class241.field3107));
        class20.field287 = (int) ((float) (arg3 * 2) / class241.field3107);
        int var13 = class38.field496 - (int) ((float) arg2 / class241.field3107);
        class203.field2643 = class175.field2277 - (int) ((float) arg3 / class241.field3107);
        class374.field4837 = (int) ((float) (arg2 * 2) / class241.field3107);
        class241.method1456(var10 + class241.field3112, class241.field3119 + var11, class241.field3112 + var12, class241.field3119 + var13, arg5, arg4, arg3 + arg5, arg4 + 1 - -arg2);
        class241.method1472(arg1);
        class18 var14 = class241.method1453(arg1);
        class480.method2930(0, 0, 0, arg1, var14);
        if (arg6 <= 126) {
            method555(null, null, -29, -17, 42, -19, 41);
        }
        if (class118.field1593 > 0) {
            class298.field3833--;
            if (class298.field3833 == 0) {
                class298.field3833 = 20;
                class118.field1593--;
            }
        }
        if (!class394.field5285) {
            return;
        }
        int var15 = arg3 + arg5 - 5;
        int var16 = arg2 + arg4 - 8;
        class460.field6579.method1863("Fps:" + class189.field2474, var16, 16776960, (byte) -74, var15, -1);
        int var20 = var16 - 15;
        Runtime var17 = Runtime.getRuntime();
        int var18 = (int) ((var17.totalMemory() - var17.freeMemory()) / 1024L);
        int var19 = 16776960;
        if (var18 > 65536) {
            var19 = 16711680;
        }
        class460.field6579.method1863("Mem:" + var18 + "k", var20, var19, (byte) -49, var15, -1);
        var16 = var20 - 15;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IB)V", line = 199)
    public final void method556(int arg0, byte arg1) {
        field779++;
        class449 var3 = this.field778;
        synchronized (this.field778) {
            if (arg1 != -79) {
                this.method552(84);
            }
            this.field778.method2648(false, arg0);
        }
        class449 var4 = this.field788;
        synchronized (this.field788) {
            this.field788.method2648(false, arg0);
        }
    }

    @OriginalMember(owner = "client!in", name = "c", descriptor = "(II)Lid;", line = 215)
    public final class415 method557(int arg0, int arg1) {
        field785++;
        if (arg1 != 15) {
            this.field778 = null;
        }
        class449 var3 = this.field778;
        class415 var4;
        synchronized (this.field778) {
            var4 = (class415) this.field778.method2647(-123, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class47 var5 = this.field780;
        byte[] var6;
        synchronized (this.field780) {
            var6 = this.field780.method481(class477.method2909(arg0, (byte) 61), class276.method1634(arg0, arg1 - 99), arg1 - 121);
        }
        class415 var7 = new class415();
        var7.field5901 = arg0;
        var7.field5905 = this;
        if (var6 != null) {
            var7.method2453(-1, new class463(var6));
        }
        var7.method2458(2038);
        class449 var8 = this.field778;
        synchronized (this.field778) {
            this.field778.method2635((long) arg0, -26591, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!in", name = "<init>", descriptor = "(Lae;ILqn;Lqn;Lqn;)V", line = 256)
    public class60(class165 arg0, int arg1, class47 arg2, class47 arg3, class47 arg4) {
        this.field780 = arg2;
        if (this.field780 != null) {
            int var6 = this.field780.method472((byte) -82) - 1;
            this.field780.method469(30322, var6);
        }
        class478.method2920(arg3, 1, arg4);
    }
}
