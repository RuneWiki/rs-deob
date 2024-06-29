import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public class class315 extends class447 {

    @OriginalMember(owner = "client!ur", name = "H", descriptor = "Ljava/lang/String;")
    private String field4350 = "null";

    @OriginalMember(owner = "client!ur", name = "J", descriptor = "Z")
    public static boolean field4351 = true;

    @OriginalMember(owner = "client!ur", name = "u", descriptor = "C")
    public char field4337;

    @OriginalMember(owner = "client!ur", name = "G", descriptor = "C")
    public char field4349;

    @OriginalMember(owner = "client!ur", name = "v", descriptor = "I")
    public static int field4338;

    @OriginalMember(owner = "client!ur", name = "x", descriptor = "I")
    public static int field4340;

    @OriginalMember(owner = "client!ur", name = "y", descriptor = "I")
    public static int field4341;

    @OriginalMember(owner = "client!ur", name = "z", descriptor = "I")
    public static int field4342;

    @OriginalMember(owner = "client!ur", name = "A", descriptor = "I")
    public static int field4343;

    @OriginalMember(owner = "client!ur", name = "B", descriptor = "I")
    public static int field4344;

    @OriginalMember(owner = "client!ur", name = "C", descriptor = "I")
    public static int field4345;

    @OriginalMember(owner = "client!ur", name = "D", descriptor = "I")
    public static int field4346;

    @OriginalMember(owner = "client!ur", name = "F", descriptor = "I")
    public static int field4348;

    @OriginalMember(owner = "client!ur", name = "K", descriptor = "I")
    public static int field4352;

    @OriginalMember(owner = "client!ur", name = "L", descriptor = "I")
    public static int field4353;

    @OriginalMember(owner = "client!ur", name = "M", descriptor = "I")
    private int field4354;

    @OriginalMember(owner = "client!ur", name = "N", descriptor = "I")
    public static int field4355;

    @OriginalMember(owner = "client!ur", name = "w", descriptor = "Lbr;")
    private class223 field4339;

    @OriginalMember(owner = "client!ur", name = "E", descriptor = "Lbr;")
    public class223 field4347;

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IZ)Ljava/lang/String;", line = 5)
    public final String method2001(int arg0, boolean arg1) {
        if (!arg1) {
            this.field4354 = 40;
        }
        field4341++;
        if (this.field4347 == null) {
            return this.field4350;
        } else {
            class424 var3 = (class424) this.field4347.method1412((byte) -54, (long) arg0);
            return var3 == null ? this.field4350 : var3.field6098;
        }
    }

    @OriginalMember(owner = "client!ur", name = "d", descriptor = "(I)V", line = 30)
    private final void method2002(int arg0) {
        this.field4339 = new class223(this.field4347.method1423(8458));
        field4338++;
        class23 var2 = (class23) this.field4347.method1413(30381);
        if (arg0 < 53) {
            this.method2003((byte) 53);
        }
        while (var2 != null) {
            class23 var3 = new class23((int) var2.field5363);
            this.field4339.method1419((long) var2.field316, 78, var3);
            var2 = (class23) this.field4347.method1420((byte) 92);
        }
    }

    @OriginalMember(owner = "client!ur", name = "e", descriptor = "(B)V", line = 55)
    private final void method2003(byte arg0) {
        this.field4339 = new class223(this.field4347.method1423(8458));
        int var2 = 97 % ((74 - arg0) / 49);
        field4345++;
        for (class424 var3 = (class424) this.field4347.method1413(30381); var3 != null; var3 = (class424) this.field4347.method1420((byte) 97)) {
            class342 var4 = new class342(var3.field6098, (int) var3.field5363);
            this.field4339.method1419(class369.method2374(var3.field6098, -22395), 46, var4);
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Leb;B)V", line = 76)
    public final void method2004(class371 arg0, byte arg1) {
        field4348++;
        if (arg1 > -117) {
            return;
        }
        while (true) {
            int var3 = arg0.method2429(0);
            if (var3 == 0) {
                return;
            }
            this.method2005(arg0, var3, -97);
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Leb;II)V", line = 99)
    private final void method2005(class371 arg0, int arg1, int arg2) {
        field4343++;
        if (arg2 != -97) {
            method2012(-42, -110);
        }
        if (arg1 == 1) {
            this.field4337 = class46.method329(arg0.method2418(-21337), 0);
        } else if (arg1 == 2) {
            this.field4349 = class46.method329(arg0.method2418(-21337), arg2 + 97);
        } else if (arg1 == 3) {
            this.field4350 = arg0.method2422(-1);
        } else if (arg1 == 4) {
            this.field4354 = arg0.method2413((byte) -30);
        } else if (arg1 == 5 || arg1 == 6) {
            int var4 = arg0.method2403((byte) 69);
            this.field4347 = new class223(class164.method1089(var4, (byte) -118));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method2413((byte) -30);
                class376 var7;
                if (arg1 == 5) {
                    var7 = new class424(arg0.method2422(-1));
                } else {
                    var7 = new class23(arg0.method2413((byte) -30));
                }
                this.field4347.method1419((long) var6, 123, var7);
            }
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(BI)Z", line = 158)
    public final boolean method2006(byte arg0, int arg1) {
        field4352++;
        if (this.field4347 == null) {
            return false;
        }
        if (this.field4339 == null) {
            this.method2002(123);
        }
        class23 var3 = (class23) this.field4339.method1412((byte) -54, (long) arg1);
        if (var3 == null) {
            return false;
        } else {
            if (arg0 <= 59) {
                this.method2002(30);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(II)I", line = 183)
    public final int method2007(int arg0, int arg1) {
        field4353++;
        if (this.field4347 == null) {
            return this.field4354;
        } else if (arg1 == 220) {
            class23 var3 = (class23) this.field4347.method1412((byte) -54, (long) arg0);
            return var3 == null ? this.field4354 : var3.field316;
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(IZ)V", line = 203)
    public static final void method2008(int arg0, boolean arg1) {
        class367.field5146++;
        class442.field6400.method158((byte) 7, 220);
        field4342++;
        class432 var2 = (class432) class271.field3700.method1413(30381);
        if (arg0 != 0) {
            return;
        }
        while (var2 != null) {
            if (!var2.method2460(79)) {
                var2 = (class432) class271.field3700.method1413(30381);
                if (var2 == null) {
                    break;
                }
            }
            if (var2.field6219 == 0) {
                class54.method371(var2, arg1, true, 0);
            }
            var2 = (class432) class271.field3700.method1420((byte) -100);
        }
        if (class353.field4958 != null) {
            class86.method596(14459, class353.field4958);
            class353.field4958 = null;
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 244)
    public final boolean method2009(String arg0, int arg1) {
        field4346++;
        if (this.field4347 == null) {
            return false;
        }
        if (this.field4339 == null) {
            this.method2003((byte) -20);
        }
        if (arg1 != -1) {
            this.field4349 = '=';
        }
        for (class342 var3 = (class342) this.field4339.method1412((byte) -54, class369.method2374(arg0, arg1 - 22394)); var3 != null; var3 = (class342) this.field4339.method1421(1)) {
            if (var3.field4787.equals(arg0)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(III)Lrg;", line = 274)
    public static final class383 method2010(int arg0, int arg1, int arg2) {
        if (arg2 != -27590) {
            return null;
        }
        field4340++;
        class383 var3 = class290.method1869((byte) 78, arg0);
        if (arg1 == -1) {
            return var3;
        } else if (var3 == null || var3.field5465 == null || arg1 >= var3.field5465.length) {
            return null;
        } else {
            return var3.field5465[arg1];
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(ILaa;Z[[II)V", line = 295)
    public static final void method2011(int arg0, class281 arg1, boolean arg2, int[][] arg3, int arg4) {
        field4344++;
        int var5 = -125 % ((-arg4 - 34) / 50);
        for (int var6 = 0; var6 < arg0; var6++) {
            int[][] var7;
            if (arg3 == null) {
                var7 = null;
            } else {
                var7 = new int[class432.field6220 + 1][class267.field3646 + 1];
                for (int var8 = 0; var8 <= class267.field3646; var8++) {
                    for (int var9 = 0; var9 <= class432.field6220; var9++) {
                        var7[var9][var8] = class418.field6051[var6][var9][var8] - arg3[var9][var8];
                    }
                }
            }
            int var10 = 0;
            int var11 = 0;
            if (!arg2) {
                if (class406.field5904) {
                    var11 |= 0x8;
                }
                if (class412.field5977) {
                    var10 |= 0x2;
                }
                if (class410.field5956 != 0) {
                    var10 |= 0x1;
                    if (var6 == 0 || class275.field3730 >= 96) {
                        var11 |= 0x10;
                    }
                }
            }
            if (class412.field5977) {
                var11 |= 0x7;
            }
            class156 var12 = arg1.method1821(class432.field6220, class267.field3646, class418.field6051[var6], var7, 128, var10, var11);
            class374.method2445(var6, var12);
        }
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(II)I", line = 378)
    public static final int method2012(int arg0, int arg1) {
        field4355++;
        if (arg0 != 21375) {
            return 87;
        }
        class413 var2 = class300.method1936(arg1, (byte) -11);
        int var3 = var2.field5996;
        int var4 = var2.field5997;
        int var5 = var2.field5994;
        int var6 = class48.field731[var5 - var4];
        return class447.field6439[var3] >> var4 & var6;
    }
}
