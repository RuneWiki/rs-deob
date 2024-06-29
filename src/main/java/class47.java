import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class47 {

    @OriginalMember(owner = "client!il", name = "a", descriptor = "Llc;")
    public static class143 field920 = class66.method374("S-Blectionner", -1);

    @OriginalMember(owner = "client!il", name = "c", descriptor = "Llc;")
    public static class143 field922 = class66.method374("clignotant2:", -1);

    @OriginalMember(owner = "client!il", name = "b", descriptor = "Lvd;")
    public static class116 field921 = null;

    @OriginalMember(owner = "client!il", name = "h", descriptor = "I")
    public static int field927 = 0;

    @OriginalMember(owner = "client!il", name = "f", descriptor = "Llc;")
    public static class143 field925 = class66.method374("Jeter", -1);

    @OriginalMember(owner = "client!il", name = "d", descriptor = "I")
    public static int field923;

    @OriginalMember(owner = "client!il", name = "e", descriptor = "I")
    public static int field924;

    @OriginalMember(owner = "client!il", name = "g", descriptor = "I")
    public static int field926;

    @OriginalMember(owner = "client!il", name = "i", descriptor = "I")
    public static int field928;

    @OriginalMember(owner = "client!il", name = "j", descriptor = "Lrg;")
    public static class80 field929;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IJ)V")
    public static final void method286(int arg0, long arg1) {
        try {
            Thread.sleep(arg1);
        } catch (InterruptedException var3) {
        }
        if (arg0 != 670292816) {
            method289((byte) -4, -116);
        }
        field924++;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I)V")
    public static void method287(int arg0) {
        field929 = null;
        field922 = null;
        field920 = null;
        field925 = null;
        if (arg0 != -23045) {
            method288(114);
        }
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(I)V")
    public static final void method288(int arg0) {
        class141.method844((byte) 107, class50.field996);
        field926++;
        class146.field2632++;
        if (class25.field427 && class176.field3144) {
            int var1 = class158.field2859;
            int var2 = var1 - class185.field3369;
            int var3 = class235.field4292;
            int var4 = var3 - class10.field212;
            if (var2 < class140.field2440) {
                var2 = class140.field2440;
            }
            if (class140.field2440 + class129.field2278.field831 < class50.field996.field831 + var2) {
                var2 = class140.field2440 - (class50.field996.field831 - class129.field2278.field831);
            }
            int var5 = var2 - class179.field3212;
            if (class79.field1432 > var4) {
                var4 = class79.field1432;
            }
            if (class79.field1432 + class129.field2278.field735 < class50.field996.field735 + var4) {
                var4 = class79.field1432 + class129.field2278.field735 - class50.field996.field735;
            }
            int var6 = var4 - class251.field4523;
            int var7 = class129.field2278.field879 + var4 - class79.field1432;
            int var8 = class50.field996.field743;
            if (arg0 != -1) {
                method286(49, -114L);
            }
            if (class50.field996.field872 < class146.field2632 && (var6 > var8 || var6 < -var8 || var5 > var8 || var5 < -var8)) {
                class39.field672 = true;
            }
            int var9 = var2 + class129.field2278.field882 - class140.field2440;
            if (class50.field996.field796 != null && class39.field672) {
                class91 var10 = new class91();
                var10.field1641 = class50.field996;
                var10.field1639 = class50.field996.field796;
                var10.field1642 = var9;
                var10.field1643 = var7;
                class247.method1638(var10, (byte) -91);
            }
            if (class147.field2660 == 0) {
                if (class39.field672) {
                    if (class50.field996.field855 != null) {
                        class91 var11 = new class91();
                        var11.field1643 = var7;
                        var11.field1641 = class50.field996;
                        var11.field1642 = var9;
                        var11.field1639 = class50.field996.field855;
                        var11.field1632 = class117.field2087;
                        class247.method1638(var11, (byte) -91);
                    }
                    if (class117.field2087 != null && client.method1515(class50.field996) != null) {
                        class285.field5010.method799(103, 61);
                        class285.field5010.method1262(arg0 ^ 0x5BCA, class117.field2087.field722);
                        class210.field3912++;
                        class285.field5010.method1278(class50.field996.field719, (byte) 23);
                        class285.field5010.method1233((byte) 71, class50.field996.field722);
                        class285.field5010.method1245(class117.field2087.field719, arg0 + 77);
                    }
                } else if ((class141.field2457 == 1 || class64.method366(true, class257.field4625 - 1)) && class257.field4625 > 2) {
                    class113.method676(arg0 ^ 0x78);
                } else if (class257.field4625 > 0) {
                    class287.method1881((byte) 73);
                }
                class50.field996 = null;
            }
        } else if (class146.field2632 > 1) {
            class50.field996 = null;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(BI)Z")
    public static final boolean method289(byte arg0, int arg1) {
        field928++;
        if (class254.field4559[arg1]) {
            return true;
        } else if (class263.field4705.method36(arg1, 0)) {
            int var2 = 10 / ((-arg0 - 8) / 39);
            int var3 = class263.field4705.method60(-108, arg1);
            if (var3 == 0) {
                class254.field4559[arg1] = true;
                return true;
            }
            if (class223.field4045[arg1] == null) {
                class223.field4045[arg1] = new class43[var3];
            }
            for (int var4 = 0; var4 < var3; var4++) {
                if (class223.field4045[arg1][var4] == null) {
                    byte[] var5 = class263.field4705.method41(-18328, arg1, var4);
                    if (var5 != null) {
                        class223.field4045[arg1][var4] = new class43();
                        class223.field4045[arg1][var4].field722 = (arg1 << 16) + var4;
                        if (var5[0] == -1) {
                            class223.field4045[arg1][var4].method264(new class190(var5), false);
                        } else {
                            class223.field4045[arg1][var4].method267(new class190(var5), true);
                        }
                    }
                }
            }
            class254.field4559[arg1] = true;
            return true;
        } else {
            return false;
        }
    }
}
