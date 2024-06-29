import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class250 extends class59 {

    @OriginalMember(owner = "client!qj", name = "D", descriptor = "I")
    public int field3982;

    @OriginalMember(owner = "client!qj", name = "x", descriptor = "I")
    public int field3976;

    @OriginalMember(owner = "client!qj", name = "z", descriptor = "I")
    public int field3978;

    @OriginalMember(owner = "client!qj", name = "J", descriptor = "I")
    public int field3987;

    @OriginalMember(owner = "client!qj", name = "v", descriptor = "Lok;")
    public static class41 field3974 = class137.method956("scrollen:", 45);

    @OriginalMember(owner = "client!qj", name = "C", descriptor = "Lok;")
    public static class41 field3981 = class137.method956("Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100", 45);

    @OriginalMember(owner = "client!qj", name = "B", descriptor = "Lok;")
    private static class41 field3980 = class137.method956("skill: ", 45);

    @OriginalMember(owner = "client!qj", name = "E", descriptor = "Lok;")
    public static class41 field3983 = class137.method956("Weiter", 45);

    @OriginalMember(owner = "client!qj", name = "H", descriptor = "Lok;")
    public static class41 field3985 = field3980;

    @OriginalMember(owner = "client!qj", name = "F", descriptor = "[S")
    public static short[] field3984 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!qj", name = "K", descriptor = "Lok;")
    public static class41 field3988 = class137.method956("Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100", 45);

    @OriginalMember(owner = "client!qj", name = "w", descriptor = "I")
    public static int field3975;

    @OriginalMember(owner = "client!qj", name = "y", descriptor = "I")
    public static int field3977;

    @OriginalMember(owner = "client!qj", name = "A", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!qj", name = "I", descriptor = "I")
    public static int field3986;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(III)Z", line = 20)
    public final boolean method1770(int arg0, int arg1, int arg2) {
        if (arg0 <= 3) {
            method1774(95, (class112) null, (byte) -88);
        }
        field3986++;
        return arg1 >= this.field3987 && arg1 <= this.field3978 && arg2 >= this.field3982 && this.field3976 >= arg2;
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(III)V", line = 50)
    public static final void method1771(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class308.field5184; var3++) {
            for (int var4 = 0; var4 < class272.field4434; var4++) {
                for (int var5 = 0; var5 < class65.field996; var5++) {
                    class308 var6 = class205.field3312[var3][var4][var5];
                    if (var6 != null) {
                        class241 var7 = var6.field5210;
                        if (var7 != null && var7.field3864.method889()) {
                            class86.method619(var7.field3864, var3, var4, var5, 1, 1);
                            if (var7.field3854 != null && var7.field3854.method889()) {
                                class86.method619(var7.field3854, var3, var4, var5, 1, 1);
                                var7.field3864.method885(var7.field3854, 0, 0, 0, false);
                                var7.field3854 = var7.field3854.method888(arg0, arg1, arg2);
                            }
                            var7.field3864 = var7.field3864.method888(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field5193; var8++) {
                            class232 var9 = var6.field5201[var8];
                            if (var9 != null && var9.field3674.method889()) {
                                class86.method619(var9.field3674, var3, var4, var5, var9.field3673 + 1 - var9.field3668, var9.field3676 - var9.field3665 + 1);
                                var9.field3674 = var9.field3674.method888(arg0, arg1, arg2);
                            }
                        }
                        class107 var10 = var6.field5207;
                        if (var10 != null && var10.field1499.method889()) {
                            class123.method874(var10.field1499, var3, var4, var5);
                            var10.field1499 = var10.field1499.method888(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(II)V", line = 123)
    public static final void method1772(int arg0, int arg1) {
        field3979++;
        class306 var2 = (class306) class186.field3031.method617((long) arg1, false);
        if (var2 == null) {
            return;
        }
        if (arg0 != 1) {
            field3984 = (short[]) null;
        }
        for (int var3 = 0; var3 < var2.field5125.length; var3++) {
            var2.field5125[var3] = -1;
            var2.field5130[var3] = 0;
        }
    }

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "(I)V", line = 157)
    public static final void method1773(int arg0) {
        field3977++;
        if (class136.field2015 != -1) {
            class294.method2035(-1, class136.field2015);
        }
        for (int var1 = 0; var1 < class75.field1120; var1++) {
            if (class195.field3151[var1]) {
                class165.field2615[var1] = true;
            }
            class46.field733[var1] = class195.field3151[var1];
            class195.field3151[var1] = false;
        }
        class64.field942 = null;
        class161.field2552 = -1;
        class156.field2472 = -1;
        if (class166.field2625) {
            class86.field1266 = true;
        }
        class228.field3641 = class18.field234;
        if (class136.field2015 != -1) {
            class75.field1120 = 0;
            class264.method1872(6266, 0, class14.field182, -1, class136.field2015, class188.field3055, 0, 0, 0);
        }
        if (class166.field2625) {
            class190.method1366();
        } else {
            class54.method382();
        }
        class140.field2163 = 0;
        if (arg0 > -63) {
            method1774(53, (class112) null, (byte) -117);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(ILlb;B)Lok;", line = 206)
    public static final class41 method1774(int arg0, class112 arg1, byte arg2) {
        field3975++;
        try {
            if (arg2 != -10) {
                method1772(115, 35);
            }
            class41 var3 = new class41();
            var3.field617 = arg1.method756(125);
            if (var3.field617 > arg0) {
                var3.field617 = arg0;
            }
            var3.field660 = new byte[var3.field617];
            arg1.field1640 += class186.field3041.method324(var3.field660, 0, var3.field617, arg1.field1640, 1, arg1.field1607);
            return var3;
        } catch (Exception var5) {
            return class269.field4350;
        }
    }

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "(I)V", line = 244)
    public static void method1775(int arg0) {
        field3980 = null;
        field3983 = null;
        field3981 = null;
        field3974 = null;
        if (arg0 != 26836) {
            method1772(47, 8);
        }
        field3985 = null;
        field3984 = null;
        field3988 = null;
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(IIII)V", line = 259)
    public class250(int arg0, int arg1, int arg2, int arg3) {
        this.field3982 = arg1;
        this.field3976 = arg3;
        this.field3978 = arg2;
        this.field3987 = arg0;
    }
}
