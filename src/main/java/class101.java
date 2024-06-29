import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class101 extends class171 {

    @OriginalMember(owner = "client!mb", name = "s", descriptor = "I")
    public int field1627;

    @OriginalMember(owner = "client!mb", name = "q", descriptor = "Lok;")
    public static class146 field1625 = class235.method1724(-12908, "OK");

    @OriginalMember(owner = "client!mb", name = "t", descriptor = "I")
    public static int field1628 = 0;

    @OriginalMember(owner = "client!mb", name = "w", descriptor = "I")
    public static int field1631 = 0;

    @OriginalMember(owner = "client!mb", name = "A", descriptor = "I")
    public static int field1635 = 500;

    @OriginalMember(owner = "client!mb", name = "C", descriptor = "Lok;")
    public static class146 field1637 = class235.method1724(-12908, "Memory after cleanup=");

    @OriginalMember(owner = "client!mb", name = "y", descriptor = "I")
    public static int field1633 = -2;

    @OriginalMember(owner = "client!mb", name = "u", descriptor = "I")
    public static int field1629;

    @OriginalMember(owner = "client!mb", name = "v", descriptor = "I")
    public static int field1630;

    @OriginalMember(owner = "client!mb", name = "z", descriptor = "I")
    public static int field1634;

    @OriginalMember(owner = "client!mb", name = "B", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!mb", name = "x", descriptor = "Lqj;")
    public static class246 field1632;

    @OriginalMember(owner = "client!mb", name = "r", descriptor = "Z")
    public static boolean field1626;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)V", line = 7)
    public static void method691(int arg0) {
        field1625 = null;
        field1632 = null;
        if (arg0 != -13492) {
            method695(69, (byte) -21);
        }
        field1637 = null;
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(B)V", line = 21)
    public static final void method692(byte arg0) {
        field1636++;
        if (!class271.field4640 || class212.field3512) {
            return;
        }
        class11[][][] var1 = class203.field3382;
        for (int var2 = 0; var2 < var1.length; var2++) {
            class11[][] var3 = var1[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class11 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field205 != null && var6.field205.field2785 instanceof class176) {
                            class176 var7 = (class176) var6.field205.field2785;
                            if ((Long.MIN_VALUE & var6.field205.field2787) == 0L) {
                                var7.method1389(false, true, true, true, false, true, true);
                            } else {
                                var7.method1389(true, true, true, true, true, true, true);
                            }
                        }
                        if (var6.field223 != null) {
                            if (var6.field223.field371 instanceof class176) {
                                class176 var8 = (class176) var6.field223.field371;
                                if ((Long.MIN_VALUE & var6.field223.field364) == 0L) {
                                    var8.method1389(false, true, true, true, false, true, true);
                                } else {
                                    var8.method1389(true, true, true, true, true, true, true);
                                }
                            }
                            if (var6.field223.field373 instanceof class176) {
                                class176 var9 = (class176) var6.field223.field373;
                                if ((var6.field223.field364 & Long.MIN_VALUE) == 0L) {
                                    var9.method1389(false, true, true, true, false, true, true);
                                } else {
                                    var9.method1389(true, true, true, true, true, true, true);
                                }
                            }
                        }
                        if (var6.field212 != null) {
                            if (var6.field212.field4779 instanceof class176) {
                                class176 var10 = (class176) var6.field212.field4779;
                                if ((Long.MIN_VALUE & var6.field212.field4780) == 0L) {
                                    var10.method1389(false, true, true, true, false, true, true);
                                } else {
                                    var10.method1389(true, true, true, true, true, true, true);
                                }
                            }
                            if (var6.field212.field4774 instanceof class176) {
                                class176 var11 = (class176) var6.field212.field4774;
                                if ((var6.field212.field4780 & Long.MIN_VALUE) == 0L) {
                                    var11.method1389(false, true, true, true, false, true, true);
                                } else {
                                    var11.method1389(true, true, true, true, true, true, true);
                                }
                            }
                        }
                        for (int var12 = 0; var12 < var6.field218; var12++) {
                            if (var6.field217[var12].field5300 instanceof class176) {
                                class176 var13 = (class176) var6.field217[var12].field5300;
                                if ((Long.MIN_VALUE & var6.field217[var12].field5289) == 0L) {
                                    var13.method1389(false, true, true, true, false, true, true);
                                } else {
                                    var13.method1389(true, true, true, true, true, true, true);
                                }
                            }
                        }
                    }
                }
            }
        }
        class212.field3512 = true;
        if (arg0 >= -106) {
            method694(true, 85);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lwe;Z)V", line = 165)
    public static final void method693(class47 arg0, boolean arg1) {
        field1630++;
        if (!arg1) {
            method691(-31);
        }
        while (true) {
            while (arg0.field857 < arg0.field860.length) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg0.method368(39) == 1) {
                    var2 = true;
                    var3 = arg0.method368(-105);
                    var4 = arg0.method368(-105);
                }
                int var5 = arg0.method368(-104);
                int var6 = arg0.method368(37);
                int var7 = class191.field3152 + class33.field639 - (var6 * 64) - 1;
                int var8 = var5 * 64 - class277.field4764;
                if (var8 >= 0 && var7 - 63 >= 0 && class118.field1916 > (var8 + 63) && var7 < class33.field639) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var3 * 8 <= var11 && var3 * 8 + 8 > var11 && (var4 * 8) <= var12 && var12 < (var4 * 8 + 8)) {
                                byte var13 = arg0.method352(255);
                                if (var13 != 0) {
                                    if (class137.field2288[var10][var9] == null) {
                                        class137.field2288[var10][var9] = new byte[4096];
                                    }
                                    class137.field2288[var10][var9][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg0.method352(255);
                                    if (class277.field4762[var10][var9] == null) {
                                        class277.field4762[var10][var9] = new byte[4096];
                                    }
                                    class277.field4762[var10][var9][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var2 ? 64 : 4096); var15++) {
                        byte var16 = arg0.method352(255);
                        if (var16 != 0) {
                            arg0.field857++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZI)Z", line = 276)
    public static final boolean method694(boolean arg0, int arg1) {
        field1629++;
        if (arg1 >= 97 && arg1 <= 122) {
            return true;
        } else if (arg0) {
            return false;
        } else if (arg1 >= 65 && arg1 <= 90) {
            return true;
        } else {
            return arg1 >= 48 && arg1 <= 57;
        }
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V", line = 295)
    public class101() {
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(I)V", line = 305)
    public class101(int arg0) {
        this.field1627 = arg0;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IB)V", line = 329)
    public static final void method695(int arg0, byte arg1) {
        class87.field1381.method794(-17435, arg0);
        class305.field5214.method794(-17435, arg0);
        field1634++;
        int var2 = 70 % ((-arg1 - 14) / 51);
    }
}
