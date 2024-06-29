import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class37 extends class178 {

    @OriginalMember(owner = "client!dc", name = "Q", descriptor = "Loc;")
    public static class151 field765 = class137.method873(2, ")3)3)3");

    @OriginalMember(owner = "client!dc", name = "S", descriptor = "Loc;")
    public static class151 field767 = class137.method873(2, "hint_headicons");

    @OriginalMember(owner = "client!dc", name = "ab", descriptor = "Luc;")
    public static class211 field775 = new class211(64);

    @OriginalMember(owner = "client!dc", name = "bb", descriptor = "Ltg;")
    public static class205 field776 = new class205();

    @OriginalMember(owner = "client!dc", name = "db", descriptor = "I")
    public static int field778 = 0;

    @OriginalMember(owner = "client!dc", name = "M", descriptor = "I")
    public static int field761;

    @OriginalMember(owner = "client!dc", name = "N", descriptor = "I")
    public static int field762;

    @OriginalMember(owner = "client!dc", name = "P", descriptor = "I")
    public static int field764;

    @OriginalMember(owner = "client!dc", name = "R", descriptor = "I")
    public static int field766;

    @OriginalMember(owner = "client!dc", name = "V", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!dc", name = "X", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!dc", name = "Y", descriptor = "I")
    public static int field773;

    @OriginalMember(owner = "client!dc", name = "Z", descriptor = "I")
    public static int field774;

    @OriginalMember(owner = "client!dc", name = "eb", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "client!dc", name = "cb", descriptor = "Lnd;")
    public static class142 field777;

    @OriginalMember(owner = "client!dc", name = "T", descriptor = "Loc;")
    public class151 field768;

    @OriginalMember(owner = "client!dc", name = "L", descriptor = "[I")
    public int[] field760;

    @OriginalMember(owner = "client!dc", name = "O", descriptor = "[I")
    public int[] field763;

    @OriginalMember(owner = "client!dc", name = "U", descriptor = "[I")
    public int[] field769;

    @OriginalMember(owner = "client!dc", name = "W", descriptor = "[I")
    public int[] field771;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I[BLgd;Z)V")
    public static final void method273(int arg0, byte[] arg1, class69 arg2, boolean arg3) {
        field764++;
        if (arg3) {
            return;
        }
        class220 var4 = new class220();
        var4.field1881 = arg0;
        var4.field3821 = arg2;
        var4.field3825 = 0;
        var4.field3822 = arg1;
        class218 var5 = class144.field2600;
        synchronized (class144.field2600) {
            class144.field2600.method1361(var4, (byte) 71);
        }
        class188.method1162(9768);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IB)I")
    public final int method274(int arg0, byte arg1) {
        field766++;
        if (arg1 != -26) {
            return -85;
        } else if (this.field760 == null) {
            return -1;
        } else {
            for (int var3 = 0; var3 < this.field760.length; var3++) {
                if (this.field769[var3] == arg0) {
                    return this.field760[var3];
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILwa;)V")
    public final void method275(int arg0, class229 arg1) {
        field762++;
        while (true) {
            int var3 = arg1.method1475(255);
            if (var3 == 0) {
                if (arg0 == -1) {
                    return;
                } else {
                    method278(59);
                    return;
                }
            }
            this.method277(var3, (byte) 93, arg1);
        }
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(IB)I")
    public final int method276(int arg0, byte arg1) {
        field761++;
        if (this.field771 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field771.length; var3++) {
            if (this.field763[var3] == arg0) {
                return this.field771[var3];
            }
        }
        int var4 = -5 % ((63 - arg1) / 36);
        return -1;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IBLwa;)V")
    private final void method277(int arg0, byte arg1, class229 arg2) {
        field772++;
        if (arg1 < 80) {
            return;
        }
        if (arg0 == 1) {
            this.field768 = arg2.method1443((byte) -99);
        } else if (arg0 == 2) {
            int var4 = arg2.method1475(255);
            this.field771 = new int[var4];
            this.field763 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field771[var5] = arg2.method1490((byte) 73);
                int var6 = arg2.method1475(255);
                if (var6 == 0) {
                    this.field763[var5] = -1;
                } else {
                    this.field763[var5] = var6;
                }
            }
        } else if (arg0 == 3) {
            int var7 = arg2.method1475(255);
            this.field760 = new int[var7];
            this.field769 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field760[var8] = arg2.method1490((byte) 73);
                int var9 = arg2.method1475(255);
                if (var9 == 0) {
                    this.field769[var8] = -1;
                } else {
                    this.field769[var8] = var9;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(I)V")
    public static void method278(int arg0) {
        if (arg0 != -16) {
            method278(-107);
        }
        field765 = null;
        field776 = null;
        field775 = null;
        field767 = null;
        field777 = null;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lsd;I)V")
    public static final void method279(class192 arg0, int arg1) {
        class163.field2952 = arg0;
        if (arg1 < 50) {
            method273(5, null, null, true);
        }
        field774++;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IILwd;IIIII)V")
    public static final void method280(int arg0, int arg1, class232 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class202.field3600) {
            class52.field1054 = 32;
        } else {
            class52.field1054 = 0;
        }
        field770++;
        class202.field3600 = false;
        if (~class141.field2553 != arg3) {
            if (arg6 >= arg4 && arg6 < arg4 + 16 && arg0 >= arg7 && arg7 + 16 > arg0) {
                arg2.field4195 -= 4;
                class27.method208(true, arg2);
            } else if (arg4 <= arg6 && arg4 + 16 > arg6 && arg0 >= arg7 + arg1 - 16 && arg0 < arg7 + arg1) {
                arg2.field4195 += 4;
                class27.method208(true, arg2);
            } else if (arg6 >= arg4 - class52.field1054 && arg4 + class52.field1054 + 16 > arg6 && arg0 >= arg7 + 16 && arg1 + arg7 - 16 > arg0) {
                int var8 = (arg1 - 32) * arg1 / arg5;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg1 - var8 - 32;
                int var10 = arg0 - var8 / 2 - arg7 - 16;
                arg2.field4195 = (arg5 - arg1) * var10 / var9;
                class27.method208(true, arg2);
                class202.field3600 = true;
            }
        }
        if (class11.field211 == 0) {
            return;
        }
        int var11 = arg2.field4215;
        if (arg6 >= arg4 - var11 && arg0 >= arg7 && arg4 + 16 > arg6 && arg0 <= arg7 + arg1) {
            arg2.field4195 += class11.field211 * 45;
            class27.method208(true, arg2);
            return;
        }
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(II)I")
    public static final int method281(int arg0, int arg1) {
        field773++;
        int var2 = 1 % ((arg0 + 73) / 42);
        return arg1 & 0xFF;
    }
}
