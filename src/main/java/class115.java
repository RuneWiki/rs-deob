import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class115 extends class60 {

    @OriginalMember(owner = "client!ik", name = "w", descriptor = "Lub;")
    public static class227 field2104 = class257.method1749("Suche nach Updates )2 ", 17263);

    @OriginalMember(owner = "client!ik", name = "A", descriptor = "I")
    public static int field2108 = 0;

    @OriginalMember(owner = "client!ik", name = "B", descriptor = "Z")
    public static boolean field2109 = false;

    @OriginalMember(owner = "client!ik", name = "F", descriptor = "I")
    public static int field2113 = 0;

    @OriginalMember(owner = "client!ik", name = "v", descriptor = "I")
    public static int field2103;

    @OriginalMember(owner = "client!ik", name = "y", descriptor = "I")
    public static int field2106;

    @OriginalMember(owner = "client!ik", name = "z", descriptor = "I")
    public static int field2107;

    @OriginalMember(owner = "client!ik", name = "C", descriptor = "I")
    public static int field2110;

    @OriginalMember(owner = "client!ik", name = "E", descriptor = "J")
    public long field2112;

    @OriginalMember(owner = "client!ik", name = "x", descriptor = "Lik;")
    public class115 field2105;

    @OriginalMember(owner = "client!ik", name = "D", descriptor = "Lik;")
    public class115 field2111;

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "(B)V")
    public final void method727(byte arg0) {
        field2103++;
        if (this.field2105 == null) {
            return;
        }
        this.field2105.field2111 = this.field2111;
        this.field2111.field2105 = this.field2105;
        this.field2105 = null;
        if (arg0 != 2) {
            method731(2, -114, -120, -119, 9);
        }
        this.field2111 = null;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ZLn;I)Z")
    public static final boolean method728(boolean arg0, class138 arg1, int arg2) {
        if (arg0) {
            return true;
        }
        field2107++;
        byte[] var3 = arg1.method867(arg2, 17056);
        if (var3 == null) {
            return false;
        } else {
            class219.method1385(var3, 0);
            return true;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ZZ)V")
    public static final void method729(boolean arg0, boolean arg1) {
        field2106++;
        if (class216.field3639.field50 >> 7 == class67.field1213 && class216.field3639.field99 >> 7 == class117.field2145) {
            class67.field1213 = 0;
        }
        int var2 = class146.field2512;
        if (arg1) {
            var2 = 1;
        }
        int var3 = 0;
        if (arg0) {
            return;
        }
        while (var3 < var2) {
            class225 var4;
            long var5;
            if (arg1) {
                var5 = 8791798054912L;
                var4 = class216.field3639;
            } else {
                var4 = class27.field446[class15.field278[var3]];
                var5 = (long) class15.field278[var3] << 32;
            }
            if (var4 != null && var4.method14((byte) -35)) {
                int var7 = var4.field99 >> 7;
                int var8 = var4.field50 >> 7;
                var4.field3807 = false;
                if ((class77.field1358 && class146.field2512 > 200 || class146.field2512 > 50) && !arg1 && var4.field82 == var4.field61) {
                    var4.field3807 = true;
                }
                if (var8 >= 0 && var8 < 104 && var7 >= 0 && var7 < 104) {
                    if (var4.field3806 == null || var4.field3810 > class253.field4393 || class253.field4393 >= var4.field3801) {
                        label92: {
                            if ((var4.field50 & 0x7F) == 64 && (var4.field99 & 0x7F) == 64) {
                                if (class78.field1376[var8][var7] == class87.field1508) {
                                    break label92;
                                }
                                class78.field1376[var8][var7] = class87.field1508;
                            }
                            var4.field74 = class193.method1227(var4.field50, true, class64.field1171, var4.field99);
                            class167.method1030(class64.field1171, var4.field50, var4.field99, var4.field74, 60, var4, var4.field106, var5, var4.field103);
                        }
                    } else {
                        var4.field3807 = false;
                        var4.field74 = class193.method1227(var4.field50, true, class64.field1171, var4.field99);
                        class117.method738(class64.field1171, var4.field50, var4.field99, var4.field74, var4, var4.field106, var5, var4.field3823, var4.field3826, var4.field3830, var4.field3805);
                    }
                }
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(Z)V")
    public static void method730(boolean arg0) {
        field2104 = null;
        if (arg0) {
            field2108 = 19;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIII)V")
    public static final void method731(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = 0;
        if (arg3 != 60) {
            return;
        }
        while (var5 < class140.field2421) {
            if (arg0 < (class36.field599[var5] + class116.field2137[var5]) && arg0 + arg1 > class36.field599[var5] && class54.field940[var5] + class18.field317[var5] > arg2 && (arg2 + arg4) > class18.field317[var5]) {
                class79.field1379[var5] = true;
            }
            var5++;
        }
        field2110++;
    }
}
