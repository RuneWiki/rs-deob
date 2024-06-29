import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class146 {

    @OriginalMember(owner = "client!v", name = "l", descriptor = "[I")
    private int[] field2701 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!v", name = "q", descriptor = "Z")
    public boolean field2706 = false;

    @OriginalMember(owner = "client!v", name = "t", descriptor = "I")
    public int field2709 = -1;

    @OriginalMember(owner = "client!v", name = "h", descriptor = "Lhj;")
    public static class69 field2697 = class181.method1318("k", (byte) -119);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "I")
    public static int field2690;

    @OriginalMember(owner = "client!v", name = "b", descriptor = "I")
    public static int field2691;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "I")
    public static int field2692;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!v", name = "i", descriptor = "I")
    public static int field2698;

    @OriginalMember(owner = "client!v", name = "k", descriptor = "I")
    public static int field2700;

    @OriginalMember(owner = "client!v", name = "n", descriptor = "I")
    public static int field2703;

    @OriginalMember(owner = "client!v", name = "o", descriptor = "I")
    public static int field2704;

    @OriginalMember(owner = "client!v", name = "p", descriptor = "I")
    public static int field2705;

    @OriginalMember(owner = "client!v", name = "s", descriptor = "I")
    public static int field2708;

    @OriginalMember(owner = "client!v", name = "u", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "client!v", name = "g", descriptor = "Lnc;")
    public static class83 field2696;

    @OriginalMember(owner = "client!v", name = "j", descriptor = "[I")
    private int[] field2699;

    @OriginalMember(owner = "client!v", name = "d", descriptor = "[S")
    private short[] field2693;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "[S")
    private short[] field2695;

    @OriginalMember(owner = "client!v", name = "m", descriptor = "[S")
    private short[] field2702;

    @OriginalMember(owner = "client!v", name = "r", descriptor = "[S")
    private short[] field2707;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Z)Lng;")
    public final class74 method1105(boolean arg0) {
        field2705++;
        if (this.field2699 == null) {
            return null;
        }
        class74[] var2 = new class74[this.field2699.length];
        for (int var3 = 0; var3 < this.field2699.length; var3++) {
            var2[var3] = class74.method523(class156.field2909, this.field2699[var3], 0);
        }
        class74 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class74(var2, var2.length);
        }
        if (this.field2702 != null) {
            for (int var5 = 0; var5 < this.field2702.length; var5++) {
                var4.method533(this.field2702[var5], this.field2695[var5]);
            }
        }
        if (this.field2707 != null) {
            for (int var6 = 0; var6 < this.field2707.length; var6++) {
                var4.method514(this.field2707[var6], this.field2693[var6]);
            }
        }
        if (!arg0) {
            field2696 = null;
        }
        return var4;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V")
    public static final void method1106(int arg0) {
        field2698++;
        if (!class103.field1936) {
            class208.field3782[0] = 1007;
            class177.field3218 = 1;
            if (class233.field4252 != 0) {
                class240.field4416 = class109.field2087;
                class256.field4601 = class109.field2079;
            } else if (class8.field53 == 0) {
                class240.field4416 = class72.field1398;
                class256.field4601 = class205.field3681;
            } else {
                class240.field4416 = class207.field3776;
                class256.field4601 = class56.field1020;
            }
            class26.field374[0] = class253.field4571;
            class216.field3917[0] = class209.field3816;
        }
        if (class35.field483 != -1) {
            class262.method1797((byte) -111, class35.field483);
        }
        for (int var1 = 0; var1 < class151.field2797; var1++) {
            if (class40.field576[var1]) {
                class49.field723[var1] = true;
            }
            class175.field3201[var1] = class40.field576[var1];
            class40.field576[var1] = false;
        }
        int var2 = -86 / ((arg0 - 12) / 52);
        class159.field2952 = class180.field3272;
        class58.field1057 = -1;
        class108.field2075 = null;
        class222.field3990 = -1;
        if (class35.field483 != -1) {
            class151.field2797 = 0;
            class56.method337((byte) -37, 0, -1, 0, class20.field287, 0, class66.field1278, class35.field483, 0);
        }
        class15.method99();
        class261.method1793((byte) -126);
        if (class103.field1936) {
            class21.method120(16777215);
        } else if (class222.field3990 != -1) {
            class56.method345(class58.field1057, (byte) 124, class222.field3990);
        }
        if (class91.field1727 == 3) {
            for (int var3 = 0; var3 < class151.field2797; var3++) {
                if (class175.field3201[var3]) {
                    class15.method95(class101.field1891[var3], class181.field3300[var3], class129.field2410[var3], class202.field3646[var3], 16711935, 128);
                } else if (class49.field723[var3]) {
                    class15.method95(class101.field1891[var3], class181.field3300[var3], class129.field2410[var3], class202.field3646[var3], 16711680, 128);
                }
            }
        }
        class36.method193((byte) 87, class148.field2767, class156.field2904.field4005, class52.field927, class156.field2904.field3985);
        class148.field2767 = 0;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lfh;Z)V")
    public final void method1107(class128 arg0, boolean arg1) {
        if (arg1) {
            return;
        }
        while (true) {
            int var3 = arg0.method937(false);
            if (var3 == 0) {
                field2710++;
                return;
            }
            this.method1109(arg0, var3, false);
        }
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(I)Z")
    public final boolean method1108(int arg0) {
        field2704++;
        if (this.field2699 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = arg0; var3 < this.field2699.length; var3++) {
            if (!class156.field2909.method600(-53, this.field2699[var3], 0)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lfh;IZ)V")
    private final void method1109(class128 arg0, int arg1, boolean arg2) {
        if (arg1 == 1) {
            this.field2709 = arg0.method937(arg2);
        } else if (arg1 == 2) {
            int var8 = arg0.method937(false);
            this.field2699 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field2699[var9] = arg0.method912(-102);
            }
        } else if (arg1 == 3) {
            this.field2706 = true;
        } else if (arg1 == 40) {
            int var4 = arg0.method937(false);
            this.field2702 = new short[var4];
            this.field2695 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2702[var5] = (short) arg0.method912(121);
                this.field2695[var5] = (short) arg0.method912(-126);
            }
        } else if (arg1 == 41) {
            int var6 = arg0.method937(false);
            this.field2707 = new short[var6];
            this.field2693 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field2707[var7] = (short) arg0.method912(101);
                this.field2693[var7] = (short) arg0.method912(40);
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field2701[arg1 - 60] = arg0.method912(-117);
        }
        if (!arg2) {
            field2700++;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(B)V")
    public static void method1110(byte arg0) {
        field2697 = null;
        field2696 = null;
        if (arg0 <= 77) {
            field2691 = -97;
        }
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(I)Z")
    public final boolean method1111(int arg0) {
        field2708++;
        boolean var2 = true;
        if (arg0 != -15070) {
            method1110((byte) -125);
        }
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field2701[var3] != -1 && !class156.field2909.method600(-79, this.field2701[var3], 0)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!v", name = "d", descriptor = "(I)Lng;")
    public final class74 method1112(int arg0) {
        field2690++;
        class74[] var2 = new class74[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field2701[var4] != -1) {
                var2[var3++] = class74.method523(class156.field2909, this.field2701[var4], 0);
            }
        }
        class74 var5 = new class74(var2, var3);
        if (arg0 > -6) {
            this.method1112(-20);
        }
        if (this.field2702 != null) {
            for (int var6 = 0; var6 < this.field2702.length; var6++) {
                var5.method533(this.field2702[var6], this.field2695[var6]);
            }
        }
        if (this.field2707 != null) {
            for (int var7 = 0; var7 < this.field2707.length; var7++) {
                var5.method514(this.field2707[var7], this.field2693[var7]);
            }
        }
        return var5;
    }
}
