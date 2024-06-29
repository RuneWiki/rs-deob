import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class9 extends class217 {

    @OriginalMember(owner = "client!wh", name = "A", descriptor = "Llc;")
    private class143 field161 = class33.field561;

    @OriginalMember(owner = "client!wh", name = "G", descriptor = "I")
    public static int field166 = 0;

    @OriginalMember(owner = "client!wh", name = "N", descriptor = "I")
    public static int field173 = 100;

    @OriginalMember(owner = "client!wh", name = "H", descriptor = "[I")
    public static int[] field167 = new int[4096];

    @OriginalMember(owner = "client!wh", name = "Z", descriptor = "Lvh;")
    public static class43 field185;

    @OriginalMember(owner = "client!wh", name = "Y", descriptor = "Llc;")
    public static class143 field184;

    @OriginalMember(owner = "client!wh", name = "y", descriptor = "I")
    public static int field159;

    @OriginalMember(owner = "client!wh", name = "z", descriptor = "I")
    public static int field160;

    @OriginalMember(owner = "client!wh", name = "B", descriptor = "I")
    public static int field162;

    @OriginalMember(owner = "client!wh", name = "C", descriptor = "I")
    private int field163;

    @OriginalMember(owner = "client!wh", name = "E", descriptor = "I")
    public static int field164;

    @OriginalMember(owner = "client!wh", name = "F", descriptor = "I")
    public static int field165;

    @OriginalMember(owner = "client!wh", name = "I", descriptor = "I")
    public static int field168;

    @OriginalMember(owner = "client!wh", name = "J", descriptor = "I")
    public static int field169;

    @OriginalMember(owner = "client!wh", name = "M", descriptor = "I")
    public static int field172;

    @OriginalMember(owner = "client!wh", name = "O", descriptor = "I")
    public static int field174;

    @OriginalMember(owner = "client!wh", name = "Q", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!wh", name = "R", descriptor = "I")
    public int field177;

    @OriginalMember(owner = "client!wh", name = "S", descriptor = "I")
    public static int field178;

    @OriginalMember(owner = "client!wh", name = "T", descriptor = "I")
    public static int field179;

    @OriginalMember(owner = "client!wh", name = "U", descriptor = "I")
    public int field180;

    @OriginalMember(owner = "client!wh", name = "W", descriptor = "I")
    public static int field182;

    @OriginalMember(owner = "client!wh", name = "X", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!wh", name = "K", descriptor = "Ltg;")
    private class277 field170;

    @OriginalMember(owner = "client!wh", name = "P", descriptor = "Ltg;")
    public class277 field175;

    @OriginalMember(owner = "client!wh", name = "V", descriptor = "[Lqg;")
    public static class211[] field181;

    @OriginalMember(owner = "client!wh", name = "L", descriptor = "[Lfe;")
    public static class212[] field171;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method68(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field169++;
        if (arg0 != 1) {
            field185 = null;
        }
        if (arg2 < 0 || arg5 < 0 || arg2 >= 103 || arg5 >= 103) {
            return;
        }
        if (arg6 == 0) {
            class57 var8 = class67.method392(arg1, arg2, arg5);
            if (var8 != null) {
                int var9 = Integer.MAX_VALUE & (int) (var8.field1096 >>> 32);
                if (arg3 == 2) {
                    var8.field1105 = new class34(var9, 2, arg7 + 4, arg1, arg2, arg5, arg4, false, var8.field1105);
                    var8.field1099 = new class34(var9, 2, arg7 + 1 & 0x3, arg1, arg2, arg5, arg4, false, var8.field1099);
                } else {
                    var8.field1105 = new class34(var9, arg3, arg7, arg1, arg2, arg5, arg4, false, var8.field1105);
                }
            }
        }
        if (arg6 == 1) {
            class63 var10 = class31.method211(arg1, arg2, arg5);
            if (var10 != null) {
                int var11 = (int) (var10.field1191 >>> 32) & Integer.MAX_VALUE;
                if (arg3 == 4 || arg3 == 5) {
                    var10.field1182 = new class34(var11, 4, arg7, arg1, arg2, arg5, arg4, false, var10.field1182);
                } else if (arg3 == 6) {
                    var10.field1182 = new class34(var11, 4, arg7 + 4, arg1, arg2, arg5, arg4, false, var10.field1182);
                } else if (arg3 == 7) {
                    var10.field1182 = new class34(var11, 4, (arg7 + 2 & 0x3) + 4, arg1, arg2, arg5, arg4, false, var10.field1182);
                } else if (arg3 == 8) {
                    var10.field1182 = new class34(var11, 4, arg7 + 4, arg1, arg2, arg5, arg4, false, var10.field1182);
                    var10.field1190 = new class34(var11, 4, (arg7 + 2 & 0x3) + 4, arg1, arg2, arg5, arg4, false, var10.field1190);
                }
            }
        }
        if (arg6 == 2) {
            if (arg3 == 11) {
                arg3 = 10;
            }
            class211 var12 = class272.method1798(arg1, arg2, arg5);
            if (var12 != null) {
                var12.field3916 = new class34(Integer.MAX_VALUE & (int) (var12.field3928 >>> 32), arg3, arg7, arg1, arg2, arg5, arg4, false, var12.field3916);
            }
        }
        if (arg6 != 3) {
            return;
        }
        class140 var13 = class238.method1600(arg1, arg2, arg5);
        if (var13 != null) {
            var13.field2445 = new class34((int) (var13.field2437 >>> 32) & Integer.MAX_VALUE, 22, arg7, arg1, arg2, arg5, arg4, false, var13.field2445);
            return;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lq;ILjava/lang/Object;)V")
    public static final void method69(class81 arg0, int arg1, Object arg2) {
        field168++;
        if (arg0.field1470 == null) {
            return;
        }
        int var3 = -117 % ((arg1 - 70) / 53);
        for (int var4 = 0; var4 < 50 && arg0.field1470.peekEvent() != null; var4++) {
            class61.method347(1L, 1);
        }
        if (arg2 != null) {
            arg0.field1470.postEvent(new ActionEvent(arg2, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(BILh;)V")
    private final void method70(byte arg0, int arg1, class190 arg2) {
        if (arg1 == 1) {
            this.field177 = arg2.method1265(120);
        } else if (arg1 == 2) {
            this.field180 = arg2.method1265(121);
        } else if (arg1 == 3) {
            this.field161 = arg2.method1270((byte) -123);
        } else if (arg1 == 4) {
            this.field163 = arg2.method1269(62);
        } else if (arg1 == 5 || arg1 == 6) {
            int var4 = arg2.method1275(128);
            this.field175 = new class277(class29.method198(var4, false));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method1269(63);
                class61 var7;
                if (arg1 == 5) {
                    var7 = new class265(arg2.method1270((byte) -118));
                } else {
                    var7 = new class3(arg2.method1269(49));
                }
                this.field175.method1825(var7, (byte) 64, (long) var6);
            }
        }
        if (arg0 > 71) {
            field172++;
        }
    }

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "(I)V")
    private final void method71(int arg0) {
        if (arg0 != Integer.MAX_VALUE) {
            method69((class81) null, 62, (Object) null);
        }
        this.field170 = new class277(this.field175.method1833((byte) 115));
        for (class265 var2 = (class265) this.field175.method1818(false); var2 != null; var2 = (class265) this.field175.method1834((byte) -48)) {
            class107 var3 = new class107(var2.field4767, (int) var2.field1162);
            this.field170.method1825(var3, (byte) 64, var2.field4767.method884(123));
        }
        field162++;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZLh;)V")
    public final void method72(boolean arg0, class190 arg1) {
        while (true) {
            int var3 = arg1.method1265(120);
            if (var3 == 0) {
                if (!arg0) {
                    return;
                }
                field164++;
                return;
            }
            this.method70((byte) 123, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIIIII)I")
    public static final int method73(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field159++;
        int var7 = arg5 & 0x3;
        if ((arg4 & 0x1) == 1) {
            int var8 = arg0;
            arg0 = arg1;
            arg1 = var8;
        }
        if (var7 == 0) {
            return arg3;
        } else if (var7 == 1) {
            return 1 + 7 - arg0 - arg6;
        } else {
            if (arg2 != Integer.MAX_VALUE) {
                method74((class143) null, -76);
            }
            return var7 == 2 ? 7 + 1 - arg1 - arg3 : arg6;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Llc;I)Lrg;")
    public static final class80 method74(class143 arg0, int arg1) {
        if (arg1 != -104) {
            method78(-41, false);
        }
        field165++;
        for (class80 var2 = (class80) class268.field4799.method1294(false); var2 != null; var2 = (class80) class268.field4799.method1292((byte) 58)) {
            if (var2.field1453.method876((byte) -122, arg0)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IB)Llc;")
    public final class143 method75(int arg0, byte arg1) {
        field160++;
        if (arg1 != 12) {
            this.field177 = 73;
        }
        if (this.field175 == null) {
            return this.field161;
        } else {
            class265 var3 = (class265) this.field175.method1824((long) arg0, arg1 - 12);
            return var3 == null ? this.field161 : var3.field4767;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)Z")
    public final boolean method76(int arg0, int arg1) {
        field178++;
        if (arg0 != -21266) {
            this.method76(-118, 96);
        }
        if (this.field175 == null) {
            return false;
        }
        if (this.field170 == null) {
            this.method80(-16706);
        }
        class3 var3 = (class3) this.field170.method1824((long) arg1, 0);
        return var3 != null;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IZ)I")
    public final int method77(int arg0, boolean arg1) {
        field183++;
        if (!arg1) {
            this.method70((byte) 70, 59, (class190) null);
        }
        if (this.field175 == null) {
            return this.field163;
        } else {
            class3 var3 = (class3) this.field175.method1824((long) arg0, 0);
            return var3 == null ? this.field163 : var3.field49;
        }
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(IZ)Lqc;")
    public static final class4 method78(int arg0, boolean arg1) {
        class4 var2 = (class4) class217.field3975.method826((long) arg0, arg1);
        if (arg1) {
            field173 = -101;
        }
        field176++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class185.field3357.method41(-18328, 4, arg0);
        class4 var4 = new class4();
        if (var3 != null) {
            var4.method17(arg0, new class190(var3), 3);
        }
        class217.field3975.method827(-3, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILlc;)Z")
    public final boolean method79(int arg0, class143 arg1) {
        field182++;
        if (this.field175 == null) {
            return false;
        }
        if (this.field170 == null) {
            this.method71(Integer.MAX_VALUE);
        }
        class107 var3 = (class107) this.field170.method1824(arg1.method884(122), 0);
        if (arg0 != 32399) {
            return true;
        }
        while (var3 != null) {
            if (var3.field1895.method876((byte) -122, arg1)) {
                return true;
            }
            var3 = (class107) this.field170.method1819(-77);
        }
        return false;
    }

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "(I)V")
    private final void method80(int arg0) {
        this.field170 = new class277(this.field175.method1833((byte) 101));
        for (class3 var2 = (class3) this.field175.method1818(false); var2 != null; var2 = (class3) this.field175.method1834((byte) -116)) {
            class3 var3 = new class3((int) var2.field1162);
            this.field170.method1825(var3, (byte) 64, (long) var2.field49);
        }
        if (arg0 != -16706) {
            this.method75(-54, (byte) -13);
        }
        field174++;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Z)V")
    public static void method81(boolean arg0) {
        field185 = null;
        if (arg0) {
            method81(true);
        }
        field181 = null;
        field171 = null;
        field167 = null;
        field184 = null;
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field167[var0] = class281.method1845(var0, (byte) -72);
        }
        field185 = null;
        field184 = class66.method374("Gegenstand f-Ur Mitglieder", -1);
    }
}
