import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class233 extends class167 {

    @OriginalMember(owner = "client!jk", name = "L", descriptor = "Le;")
    public static class191 field4155 = class54.method368("Angreifen", 2047);

    @OriginalMember(owner = "client!jk", name = "W", descriptor = "Le;")
    private static class191 field4166 = class54.method368("Loading )2 please wait)3", 2047);

    @OriginalMember(owner = "client!jk", name = "K", descriptor = "I")
    public static int field4154 = -1;

    @OriginalMember(owner = "client!jk", name = "V", descriptor = "I")
    public static int field4165 = 0;

    @OriginalMember(owner = "client!jk", name = "T", descriptor = "Le;")
    public static class191 field4163 = field4166;

    @OriginalMember(owner = "client!jk", name = "M", descriptor = "I")
    public static int field4156;

    @OriginalMember(owner = "client!jk", name = "O", descriptor = "I")
    public static int field4158;

    @OriginalMember(owner = "client!jk", name = "P", descriptor = "I")
    public static int field4159;

    @OriginalMember(owner = "client!jk", name = "Q", descriptor = "I")
    public static int field4160;

    @OriginalMember(owner = "client!jk", name = "R", descriptor = "I")
    public static int field4161;

    @OriginalMember(owner = "client!jk", name = "S", descriptor = "I")
    public static int field4162;

    @OriginalMember(owner = "client!jk", name = "U", descriptor = "I")
    public static int field4164;

    @OriginalMember(owner = "client!jk", name = "Y", descriptor = "I")
    public static int field4168;

    @OriginalMember(owner = "client!jk", name = "X", descriptor = "Le;")
    public static class191 field4167;

    @OriginalMember(owner = "client!jk", name = "N", descriptor = "Lwd;")
    private class97 field4157;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IB)V")
    public static final void method1644(int arg0, byte arg1) {
        class232.field4142.method990(70, arg0);
        field4160++;
        if (arg1 > -55) {
            method1651((byte) 45, 84);
        }
    }

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "(I)V")
    public static void method1645(int arg0) {
        if (arg0 != -4) {
            method1645(30);
        }
        field4167 = null;
        field4163 = null;
        field4155 = null;
        field4166 = null;
    }

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "(II)Leg;")
    public static final class33 method1646(int arg0, int arg1) {
        if (arg0 != 5877) {
            return null;
        }
        field4159++;
        int var2 = arg1 & 0xFFFF;
        int var3 = arg1 >> 16;
        if (class242.field4325[var3] == null || class242.field4325[var3][var2] == null) {
            boolean var4 = class127.method858(var3, arg0 - 5773);
            if (!var4) {
                return null;
            }
        }
        return class242.field4325[var3][var2];
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lji;II)V")
    private final void method1647(class225 arg0, int arg1, int arg2) {
        if (arg2 != 2) {
            method1648(-8, 121, -35, -11, (class16) null, (class16) null, -63, -46, -91, 86, -11L);
        }
        if (arg1 == 249) {
            int var4 = arg0.method1580(-111);
            if (this.field4157 == null) {
                int var5 = class10.method71(var4, -480947516);
                this.field4157 = new class97(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg0.method1580(-40) == 1;
                int var8 = arg0.method1591(2);
                class104 var9;
                if (var7) {
                    var9 = new class166(arg0.method1596((byte) 82));
                } else {
                    var9 = new class115(arg0.method1562(21705));
                }
                this.field4157.method605((long) var8, -3, var9);
            }
        }
        field4168++;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIIILbe;Lbe;IIIIJ)V")
    public static final void method1648(int arg0, int arg1, int arg2, int arg3, class16 arg4, class16 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class9 var12 = new class9();
        var12.field86 = arg10;
        var12.field103 = arg1 * 128 + 64;
        var12.field100 = arg2 * 128 + 64;
        var12.field91 = arg3;
        var12.field94 = arg4;
        var12.field88 = arg5;
        var12.field92 = arg6;
        var12.field96 = arg7;
        var12.field97 = arg8;
        var12.field104 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class201.field3608[var13][arg1][arg2] == null) {
                class201.field3608[var13][arg1][arg2] = new class199(var13, arg1, arg2);
            }
        }
        class201.field3608[arg0][arg1][arg2].field3541 = var12;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lji;Z)V")
    public final void method1649(class225 arg0, boolean arg1) {
        if (!arg1) {
            return;
        }
        while (true) {
            int var3 = arg0.method1580(-16);
            if (var3 == 0) {
                field4156++;
                return;
            }
            this.method1647(arg0, var3, 2);
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(III)I")
    public final int method1650(int arg0, int arg1, int arg2) {
        field4164++;
        if (this.field4157 == null) {
            return arg0;
        }
        class115 var4 = (class115) this.field4157.method612((long) arg2, true);
        if (var4 == null) {
            return arg0;
        } else {
            if (arg1 < 15) {
                method1644(16, (byte) -64);
            }
            return var4.field1896;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(BI)Lsc;")
    public static final class124 method1651(byte arg0, int arg1) {
        if (arg0 != -99) {
            return null;
        }
        field4162++;
        if (arg1 == 0) {
            return new class28();
        } else if (arg1 == 1) {
            return new class93();
        } else if (arg1 == 2) {
            return new class117();
        } else if (arg1 == 3) {
            return new class157();
        } else if (arg1 == 4) {
            return new class68();
        } else if (arg1 == 5) {
            return new class73();
        } else if (arg1 == 6) {
            return new class37();
        } else if (arg1 == 7) {
            return new class85();
        } else if (arg1 == 8) {
            return new class138();
        } else if (arg1 == 9) {
            return new class40();
        } else if (arg1 == 10) {
            return new class265();
        } else if (arg1 == 11) {
            return new class18();
        } else if (arg1 == 12) {
            return new class173();
        } else if (arg1 == 13) {
            return new class17();
        } else if (arg1 == 14) {
            return new class170();
        } else if (arg1 == 15) {
            return new class205();
        } else if (arg1 == 16) {
            return new class82();
        } else if (arg1 == 17) {
            return new class209();
        } else if (arg1 == 18) {
            return new class81();
        } else if (arg1 == 19) {
            return new class127();
        } else if (arg1 == 20) {
            return new class133();
        } else if (arg1 == 21) {
            return new class158();
        } else if (arg1 == 22) {
            return new class229();
        } else if (arg1 == 23) {
            return new class201();
        } else if (arg1 == 24) {
            return new class137();
        } else if (arg1 == 25) {
            return new class250();
        } else if (arg1 == 26) {
            return new class258();
        } else if (arg1 == 27) {
            return new class263();
        } else if (arg1 == 28) {
            return new class255();
        } else if (arg1 == 29) {
            return new class145();
        } else if (arg1 == 30) {
            return new class88();
        } else if (arg1 == 31) {
            return new class134();
        } else if (arg1 == 32) {
            return new class123();
        } else if (arg1 == 33) {
            return new class105();
        } else if (arg1 == 34) {
            return new class91();
        } else if (arg1 == 35) {
            return new class252();
        } else if (arg1 == 36) {
            return new class130();
        } else if (arg1 == 37) {
            return new class129();
        } else if (arg1 == 38) {
            return new class169();
        } else if (arg1 == 39) {
            return new class128();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(ILe;I)Le;")
    public final class191 method1652(int arg0, class191 arg1, int arg2) {
        field4158++;
        if (this.field4157 == null) {
            return arg1;
        }
        class166 var4 = (class166) this.field4157.method612((long) arg2, true);
        if (arg0 > -109) {
            method1648(-66, -36, 47, 64, (class16) null, (class16) null, -37, -44, -83, -128, 29L);
        }
        return var4 == null ? arg1 : var4.field2810;
    }
}
