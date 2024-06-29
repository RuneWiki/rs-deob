import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class124 extends class446 {

    @OriginalMember(owner = "client!ui", name = "B", descriptor = "Ljava/lang/String;")
    private String field1718 = "null";

    @OriginalMember(owner = "client!ui", name = "K", descriptor = "C")
    public char field1725;

    @OriginalMember(owner = "client!ui", name = "N", descriptor = "C")
    public char field1728;

    @OriginalMember(owner = "client!ui", name = "w", descriptor = "I")
    public static int field1713;

    @OriginalMember(owner = "client!ui", name = "x", descriptor = "I")
    public static int field1714;

    @OriginalMember(owner = "client!ui", name = "y", descriptor = "I")
    public static int field1715;

    @OriginalMember(owner = "client!ui", name = "z", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!ui", name = "E", descriptor = "I")
    private int field1720;

    @OriginalMember(owner = "client!ui", name = "F", descriptor = "I")
    public static int field1721;

    @OriginalMember(owner = "client!ui", name = "G", descriptor = "I")
    public static int field1722;

    @OriginalMember(owner = "client!ui", name = "H", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "client!ui", name = "I", descriptor = "I")
    public static int field1724;

    @OriginalMember(owner = "client!ui", name = "L", descriptor = "I")
    public static int field1726;

    @OriginalMember(owner = "client!ui", name = "M", descriptor = "I")
    public static int field1727;

    @OriginalMember(owner = "client!ui", name = "Q", descriptor = "I")
    public static int field1730;

    @OriginalMember(owner = "client!ui", name = "D", descriptor = "Lec;")
    public class129 field1719;

    @OriginalMember(owner = "client!ui", name = "P", descriptor = "Lec;")
    private class129 field1729;

    @OriginalMember(owner = "client!ui", name = "A", descriptor = "Lnq;")
    public static class268 field1717;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ui", name = "R", descriptor = "Ljava/lang/Class;")
    public static Class field1731;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "()V")
    public static final void method835() {
        for (int var0 = 0; var0 < class231.field3344; var0++) {
            if (!class54.field745[var0]) {
                class404 var1 = class14.field280[var0];
                int var2 = var1.field5744;
                int var3 = var1.field411 - 64;
                int var4 = (var3 * 2 >> 7) + 1;
                int var5 = 0;
                int[] var6 = new int[var4 * var4];
                int var7 = var1.field407 - var3 >> 7;
                int var8 = var1.field408 - var3 >> 7;
                int var9 = var1.field408 + var3 >> 7;
                if (var8 < 0) {
                    var5 -= var8;
                    var8 = 0;
                }
                if (var9 >= class264.field3687) {
                    var9 = class264.field3687 - 1;
                }
                for (int var10 = var8; var10 <= var9; var10++) {
                    short var11 = var1.field5741[var5];
                    int var12 = var11 >>> 8;
                    int var13 = var4 * var5 + var12;
                    int var14 = (var11 >>> 8) + var7;
                    int var15 = (var11 & 0xFF) + var14 - 1;
                    if (var14 < 0) {
                        var13 -= var14;
                        var14 = 0;
                    }
                    if (var15 >= class200.field2772) {
                        var15 = class200.field2772 - 1;
                    }
                    for (int var16 = var14; var16 <= var15; var16++) {
                        byte var17 = 1;
                        class447 var18 = class139.method952(var2, var16, var10, field1731 == null ? (field1731 = method848("kr")) : field1731);
                        if (var18 != null && var18.field6263 != 0) {
                            if (var18.field6263 == 1) {
                                boolean var19 = var16 - 1 >= var14;
                                boolean var20 = var16 + 1 <= var15;
                                if (!var19 && var10 + 1 <= var9) {
                                    short var21 = var1.field5741[var5 + 1];
                                    int var22 = (var21 >>> 8) + var7;
                                    int var23 = (var21 & 0xFF) + var22;
                                    var19 = var16 > var22 && var16 < var23;
                                }
                                if (!var20 && var10 - 1 >= var8) {
                                    short var24 = var1.field5741[var5 - 1];
                                    int var25 = (var24 >>> 8) + var7;
                                    int var26 = (var24 & 0xFF) + var25;
                                    var20 = var16 > var25 && var16 < var26;
                                }
                                if (var19 && !var20) {
                                    var17 = 4;
                                } else if (var20 && !var19) {
                                    var17 = 2;
                                }
                            } else {
                                boolean var27 = var16 - 1 >= var14;
                                boolean var28 = var16 + 1 <= var15;
                                if (!var27 && var10 - 1 >= var8) {
                                    short var29 = var1.field5741[var5 - 1];
                                    int var30 = (var29 >>> 8) + var7;
                                    int var31 = (var29 & 0xFF) + var30;
                                    var27 = var16 > var30 && var16 < var31;
                                }
                                if (!var28 && var10 + 1 <= var9) {
                                    short var32 = var1.field5741[var5 + 1];
                                    int var33 = (var32 >>> 8) + var7;
                                    int var34 = (var32 & 0xFF) + var33;
                                    var28 = var16 > var33 && var16 < var34;
                                }
                                if (var27 && !var28) {
                                    var17 = 3;
                                } else if (var28 && !var27) {
                                    var17 = 5;
                                }
                            }
                        }
                        var6[var13++] = var17;
                    }
                    var5++;
                }
                class54.field745[var0] = true;
                class375.field5354[var2].method727(var1, var6);
            }
        }
    }

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "(I)V")
    private final void method836(int arg0) {
        field1726++;
        if (arg0 != 255) {
            this.field1728 = (char) 65474;
        }
        this.field1729 = new class129(this.field1719.method884(14552));
        for (class406 var2 = (class406) this.field1719.method885(-66); var2 != null; var2 = (class406) this.field1719.method881((byte) -68)) {
            class406 var3 = new class406((int) var2.field5600);
            this.field1729.method883((byte) -54, (long) var2.field5773, var3);
        }
    }

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "(I)V")
    private final void method837(int arg0) {
        this.field1729 = new class129(this.field1719.method884(14552));
        field1727++;
        if (arg0 != 26390) {
            this.field1720 = -69;
        }
        for (class200 var2 = (class200) this.field1719.method885(-122); var2 != null; var2 = (class200) this.field1719.method881((byte) -68)) {
            class284 var3 = new class284(var2.field2765, (int) var2.field5600);
            this.field1729.method883((byte) -54, class389.method2465(var2.field2765, 105), var3);
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(BIIILgm;)V")
    public static final void method838(byte arg0, int arg1, int arg2, int arg3, class64 arg4) {
        field1730++;
        if (arg0 != 117) {
            return;
        }
        for (class194 var5 = (class194) class375.field5353.method646(48); var5 != null; var5 = (class194) class375.field5353.method641(false)) {
            if (var5.field2671 == arg1 && (arg2 * 128) == var5.field2661 && (arg3 * 128) == var5.field2670 && var5.field2656.field916 == arg4.field916) {
                if (var5.field2659 != null) {
                    class164.field2266.method2788(var5.field2659);
                    var5.field2659 = null;
                }
                if (var5.field2658 != null) {
                    class164.field2266.method2788(var5.field2658);
                    var5.field2658 = null;
                }
                var5.method2467((byte) 89);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IB)Ljava/lang/String;")
    public final String method839(int arg0, byte arg1) {
        if (arg1 >= -10) {
            this.method840((class11) null, 103);
        }
        field1716++;
        if (this.field1719 == null) {
            return this.field1718;
        } else {
            class200 var3 = (class200) this.field1719.method886((long) arg0, 25651);
            return var3 == null ? this.field1718 : var3.field2765;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lkh;I)V")
    public final void method840(class11 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method172((byte) 52);
            if (var3 == 0) {
                field1723++;
                if (arg1 != 2) {
                    field1717 = null;
                    return;
                }
                return;
            }
            this.method843((byte) -109, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Ljava/lang/String;IB)I")
    public static final int method841(String arg0, int arg1, byte arg2) {
        field1721++;
        return arg2 == -3 ? class205.method1332(arg1, arg0, (byte) -10, true) : 36;
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(IB)I")
    public final int method842(int arg0, byte arg1) {
        field1715++;
        if (this.field1719 == null) {
            return this.field1720;
        }
        class406 var3 = (class406) this.field1719.method886((long) arg0, 25651);
        if (var3 == null) {
            return this.field1720;
        } else {
            if (arg1 < 85) {
                method841((String) null, 106, (byte) -123);
            }
            return var3.field5773;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(BLkh;I)V")
    private final void method843(byte arg0, class11 arg1, int arg2) {
        if (arg2 == 1) {
            this.field1728 = class436.method2744(63, arg1.method162(-4436));
        } else if (arg2 == 2) {
            this.field1725 = class436.method2744(63, arg1.method162(-4436));
        } else if (arg2 == 3) {
            this.field1718 = arg1.method171(arg0 - 9156);
        } else if (arg2 == 4) {
            this.field1720 = arg1.method185(25239);
        } else if (arg2 == 5 || arg2 == 6) {
            int var4 = arg1.method174(255);
            this.field1719 = new class129(class438.method2748((byte) 116, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method185(25239);
                class390 var7;
                if (arg2 == 5) {
                    var7 = new class200(arg1.method171(-9265));
                } else {
                    var7 = new class406(arg1.method185(25239));
                }
                this.field1719.method883((byte) -54, (long) var6, var7);
            }
        }
        field1714++;
        if (arg0 != -109) {
            this.field1725 = ':';
        }
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(II)Z")
    public final boolean method844(int arg0, int arg1) {
        field1724++;
        if (this.field1719 == null) {
            return false;
        }
        if (this.field1729 == null) {
            this.method836(255);
        }
        int var3 = 61 % ((arg0 + 8) / 62);
        class406 var4 = (class406) this.field1729.method886((long) arg1, 25651);
        return var4 != null;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method845(int arg0, String arg1) {
        field1722++;
        if (this.field1719 == null) {
            return false;
        }
        if (this.field1729 == null) {
            this.method837(26390);
        }
        if (arg0 > -13) {
            return false;
        }
        for (class284 var3 = (class284) this.field1729.method886(class389.method2465(arg1, -86), 25651); var3 != null; var3 = (class284) this.field1729.method882(true)) {
            if (var3.field4009.equals(arg1)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "(I)V")
    public static void method846(int arg0) {
        field1717 = null;
        if (arg0 != 1) {
            method847(-52);
        }
    }

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "(I)V")
    public static final void method847(int arg0) {
        class333.field4598 = class95.field1313.field4633 + class95.field1313.field4632 + 2;
        field1713++;
        class331.field4580 = class293.field4104.field4633 + class293.field4104.field4632 + 2;
        if (arg0 > 49) {
            class399.field5695 = new String[500];
            for (int var1 = 0; var1 < class399.field5695.length; var1++) {
                class399.field5695[var1] = "";
            }
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method848(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class442("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'êtes pas autorisé à expulser des utilisateurs de ce canal.", "Você não tem permissão para expulsar usuários neste canal.");
    }
}
