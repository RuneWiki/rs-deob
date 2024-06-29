import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class157 {

    @OriginalMember(owner = "client!ah", name = "l", descriptor = "Lke;")
    public static class256 field2799 = class316.method2202("Chargement des polices )2 ", 27626);

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "I")
    public static int field2793 = 0;

    @OriginalMember(owner = "client!ah", name = "r", descriptor = "I")
    public static int field2805 = 0;

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "I")
    public static int field2795 = 0;

    @OriginalMember(owner = "client!ah", name = "i", descriptor = "Lke;")
    public static class256 field2796 = class316.method2202("Update)2Liste geladen)3", 27626);

    @OriginalMember(owner = "client!ah", name = "x", descriptor = "I")
    public static int field2811 = 0;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "I")
    public static int field2788;

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "I")
    public int field2789;

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "I")
    public int field2791;

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "I")
    public static int field2792;

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "I")
    public int field2794;

    @OriginalMember(owner = "client!ah", name = "n", descriptor = "I")
    public static int field2801;

    @OriginalMember(owner = "client!ah", name = "o", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!ah", name = "p", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!ah", name = "q", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!ah", name = "s", descriptor = "I")
    public int field2806;

    @OriginalMember(owner = "client!ah", name = "t", descriptor = "I")
    public int field2807;

    @OriginalMember(owner = "client!ah", name = "u", descriptor = "I")
    public int field2808;

    @OriginalMember(owner = "client!ah", name = "v", descriptor = "I")
    public int field2809;

    @OriginalMember(owner = "client!ah", name = "w", descriptor = "I")
    public static int field2810;

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "[B")
    public byte[] field2790;

    @OriginalMember(owner = "client!ah", name = "j", descriptor = "[B")
    public byte[] field2797;

    @OriginalMember(owner = "client!ah", name = "m", descriptor = "[Lke;")
    public static class256[] field2800;

    @OriginalMember(owner = "client!ah", name = "k", descriptor = "[S")
    public static short[] field2798;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(III)V", line = 11)
    public static final void method1163(int arg0, int arg1, int arg2) {
        field2802++;
        int var3 = arg1--;
        int var4 = class292.field5058[arg1];
        if (var3 > 25) {
            var3 = 25;
        }
        int var5 = class52.field954[arg1];
        if (arg0 == 0) {
            class308.field5322.method1599(104, (byte) 97);
            class308.field5322.method308(var3 + var3 + 3, -2);
            class237.field4039++;
        }
        if (arg0 == 1) {
            class28.field376++;
            class308.field5322.method1599(131, (byte) 103);
            class308.field5322.method308(var3 + var3 + 3 + 14, -2);
        }
        if (arg0 == 2) {
            class308.field5322.method1599(238, (byte) 101);
            class239.field4083++;
            class308.field5322.method308(var3 + var3 + 3, arg2 ^ 0xFFFFFFE7);
        }
        class308.field5322.method322(false, class134.field2336 + var5);
        if (arg2 != 25) {
            field2798 = (short[]) null;
        }
        class308.field5322.method319(-1117072288, class140.field2468[82] ? 1 : 0);
        class269.field4588 = class292.field5058[0];
        class241.field4102 = class52.field954[0];
        for (int var6 = 1; var6 < var3; var6++) {
            arg1--;
            class308.field5322.method308(class52.field954[arg1] - var5, -2);
            class308.field5322.method321(class292.field5058[arg1] - var4, -25609);
        }
        class308.field5322.method366(class10.field147 + var4, -95);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)V", line = 71)
    public static final void method1164(int arg0) {
        field2803++;
        class171.field3045.method2076(arg0 + 11278);
        if (arg0 != -11159) {
            method1170(-35, 104, 109);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIIIII)V", line = 88)
    public static final void method1165(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg5 != 1) {
            return;
        }
        if (arg1 >= class244.field4161 && arg0 <= class175.field3106 && class105.field1887 <= arg4 && arg6 <= class274.field4748) {
            if (arg3 == 1) {
                class97.method699(arg6, arg0, (byte) 124, arg1, arg2, arg4);
            } else {
                class267.method1851(arg2, arg3, arg1, (byte) 84, arg6, arg0, arg4);
            }
        } else if (arg3 == 1) {
            class201.method1437(arg6, arg0, arg1, 121, arg4, arg2);
        } else {
            class204.method1446(arg3, arg2, (byte) 70, arg6, arg4, arg0, arg1);
        }
        field2810++;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Z)V", line = 119)
    public static void method1166(boolean arg0) {
        if (!arg0) {
            method1169((byte) -111, false);
        }
        field2799 = null;
        field2800 = null;
        field2798 = null;
        field2796 = null;
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(I)V", line = 140)
    public static final void method1167(int arg0) {
        field2792++;
        class311 var1 = (class311) class36.field632.method1270((byte) -121);
        if (arg0 != 22134) {
            method1167(103);
        }
        while (var1 != null) {
            class30 var2 = var1.field5367;
            if (class255.field4377 != var2.field453 || var2.field465 < class45.field840) {
                var1.method1199(21966);
            } else if (class45.field840 >= var2.field474) {
                if (var2.field442 > 0) {
                    class279 var3 = class187.field3281[var2.field442 - 1];
                    if (var3 != null && var3.field1192 >= 0 && var3.field1192 < 13312 && var3.field1197 >= 0 && var3.field1197 < 13312) {
                        var2.method216(var3.field1197, class45.field840, class297.method2080(var3.field1192, arg0 - 22034, var2.field453, var3.field1197) - var2.field484, (byte) 122, var3.field1192);
                    }
                }
                if (var2.field442 < 0) {
                    int var4 = -var2.field442 - 1;
                    class144 var5;
                    if (class104.field1852 == var4) {
                        var5 = class121.field2124;
                    } else {
                        var5 = class300.field5172[var4];
                    }
                    if (var5 != null && var5.field1192 >= 0 && var5.field1192 < 13312 && var5.field1197 >= 0 && var5.field1197 < 13312) {
                        var2.method216(var5.field1197, class45.field840, class297.method2080(var5.field1192, 101, var2.field453, var5.field1197) - var2.field484, (byte) 122, var5.field1192);
                    }
                }
                var2.method217(class29.field398, true);
                class78.method587(class255.field4377, (int) var2.field457, (int) var2.field485, (int) var2.field441, 60, var2, var2.field483, -1L, false);
            }
            var1 = (class311) class36.field632.method1277(1);
        }
    }

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "(I)V", line = 194)
    public static final void method1168(int arg0) {
        if (arg0 != -17910) {
            return;
        }
        field2801++;
        class209.field3775.method2084(-14);
        class254.field4357.method2084(-43);
        class111.field1939.method2084(124);
        class132.field2286.method2084(121);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(BZ)V", line = 219)
    public static final void method1169(byte arg0, boolean arg1) {
        int var2 = 78 / ((-arg0 - 59) / 40);
        field2788++;
        for (class187 var3 = (class187) class246.field4191.method1270((byte) -121); var3 != null; var3 = (class187) class246.field4191.method1277(1)) {
            if (var3.field3276 != null) {
                class197.field3603.method2237(var3.field3276);
                var3.field3276 = null;
            }
            if (var3.field3279 != null) {
                class197.field3603.method2237(var3.field3279);
                var3.field3279 = null;
            }
            var3.method1199(21966);
        }
        if (!arg1) {
            return;
        }
        for (class187 var4 = (class187) class186.field3272.method1270((byte) -121); var4 != null; var4 = (class187) class186.field3272.method1277(1)) {
            if (var4.field3276 != null) {
                class197.field3603.method2237(var4.field3276);
                var4.field3276 = null;
            }
            var4.method1199(21966);
        }
        for (class187 var5 = (class187) class31.field498.method1743(true); var5 != null; var5 = (class187) class31.field498.method1742((byte) 106)) {
            if (var5.field3276 != null) {
                class197.field3603.method2237(var5.field3276);
                var5.field3276 = null;
            }
            var5.method1199(21966);
        }
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(III)Z", line = 298)
    public static final boolean method1170(int arg0, int arg1, int arg2) {
        if (arg1 != 1) {
            field2799 = (class256) null;
        }
        field2804++;
        return (arg0 >> arg2 + 1 & 0x1) != 0;
    }
}
