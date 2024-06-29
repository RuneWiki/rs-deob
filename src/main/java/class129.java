import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hw")
public class class129 extends class458 implements class706 {

    @OriginalMember(owner = "client!hw", name = "bb", descriptor = "Z")
    private boolean field1553 = false;

    @OriginalMember(owner = "client!hw", name = "jb", descriptor = "Lwca;")
    public class676 field1561;

    @OriginalMember(owner = "client!hw", name = "Q", descriptor = "Z")
    private boolean field1543;

    @OriginalMember(owner = "client!hw", name = "O", descriptor = "[I")
    public static int[] field1541 = new int[1];

    @OriginalMember(owner = "client!hw", name = "M", descriptor = "I")
    public static int field1539;

    @OriginalMember(owner = "client!hw", name = "P", descriptor = "I")
    public static int field1542;

    @OriginalMember(owner = "client!hw", name = "R", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!hw", name = "S", descriptor = "I")
    public static int field1545;

    @OriginalMember(owner = "client!hw", name = "T", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!hw", name = "U", descriptor = "I")
    public static int field1547;

    @OriginalMember(owner = "client!hw", name = "W", descriptor = "I")
    public static int field1548;

    @OriginalMember(owner = "client!hw", name = "X", descriptor = "I")
    public static int field1549;

    @OriginalMember(owner = "client!hw", name = "Y", descriptor = "I")
    public static int field1550;

    @OriginalMember(owner = "client!hw", name = "Z", descriptor = "I")
    public static int field1551;

    @OriginalMember(owner = "client!hw", name = "ab", descriptor = "I")
    public static int field1552;

    @OriginalMember(owner = "client!hw", name = "cb", descriptor = "I")
    public static int field1554;

    @OriginalMember(owner = "client!hw", name = "db", descriptor = "I")
    public static int field1555;

    @OriginalMember(owner = "client!hw", name = "eb", descriptor = "I")
    public static int field1556;

    @OriginalMember(owner = "client!hw", name = "fb", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!hw", name = "gb", descriptor = "I")
    public static int field1558;

    @OriginalMember(owner = "client!hw", name = "hb", descriptor = "I")
    public static int field1559;

    @OriginalMember(owner = "client!hw", name = "ib", descriptor = "I")
    public static int field1560;

    @OriginalMember(owner = "client!hw", name = "kb", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "client!hw", name = "N", descriptor = "Lkj;")
    private class566 field1540;

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(ILha;)V")
    public final void method860(int arg0, class58 arg1) {
        ++field1539;
        if (arg0 <= 15) {
            this.field1543 = false;
        }
        this.field1561.method3763(-1, arg1);
    }

    @OriginalMember(owner = "client!hw", name = "c", descriptor = "(B)I")
    public final int method861(byte arg0) {
        ++field1556;
        if (arg0 != -17) {
            this.method860(9, (class58) null);
        }
        return this.field1561.field9228;
    }

    @OriginalMember(owner = "client!hw", name = "i", descriptor = "(I)I")
    public final int method749(int arg0) {
        ++field1555;
        if (arg0 != 32767) {
            method869((int[]) null, (byte) -27, (long[]) null);
        }
        return this.field1561.method3760((byte) -17);
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(Lha;III)Z")
    public final boolean method752(class58 arg0, int arg1, int arg2, int arg3) {
        ++field1544;
        class471 var5 = this.field1561.method3765(false, arg1 + -16386, false, arg0, 131072);
        if (var5 == null) {
            return false;
        } else {
            class513 var6 = arg0.method439();
            if (arg1 != 0) {
                this.field1561 = null;
            }
            var6.method339(super.field1264 - -super.field6453, super.field1255, super.field6458 + super.field1250);
            return class180.field2409 ? var5.method229(arg3, arg2, var6, false, 0, class516.field7361) : var5.method233(arg3, arg2, var6, false, 0);
        }
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(III)Z")
    public static final boolean method862(int arg0, int arg1, int arg2) {
        ++field1549;
        if (!class103.method736(arg0 ^ -4300, arg1, arg2)) {
            return false;
        } else if (~(arg1 & 45056) != -1 | class634.method3527(9, arg1, arg2) | class325.method2117(arg1, 58, arg2)) {
            return true;
        } else {
            if (arg0 != 4285) {
                method869((int[]) null, (byte) -61, (long[]) null);
            }
            return (arg2 & 55) == 0 & (class461.method2738(100, arg2, arg1) | class273.method1778(127, arg2, arg1));
        }
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(Z)Z")
    public final boolean method751(boolean arg0) {
        if (arg0) {
            this.field1561 = null;
        }
        ++field1550;
        return this.field1553;
    }

    @OriginalMember(owner = "client!hw", name = "b", descriptor = "(ILha;)Lkj;")
    public final class566 method744(int arg0, class58 arg1) {
        if (arg0 != 0) {
            this.method746(-2);
        }
        ++field1557;
        return this.field1540;
    }

    @OriginalMember(owner = "client!hw", name = "i", descriptor = "(B)V")
    public static final void method863(byte arg0) {
        if (arg0 > -21) {
            field1541 = null;
        }
        for (int var1 = 0; ~class296.field4168 < ~var1; ++var1) {
            int var2 = class415.method2548(var1 - -class233.field3144, class296.field4168, false) * class224.field3008;
            for (int var3 = 0; var3 < class224.field3008; ++var3) {
                int var4 = class415.method2548(class584.field8213 + var3, class224.field3008, false) + var2;
                if (~class518.field7371[var4] == ~class681.field9340) {
                    class448.field6358[var4].method2195(0, 0, class338.field4700, class47.field555, class338.field4700 * var3, class47.field555 * var1, true, true);
                }
            }
        }
        ++field1547;
    }

    @OriginalMember(owner = "client!hw", name = "e", descriptor = "(I)Z")
    public final boolean method746(int arg0) {
        if (arg0 >= -106) {
            return true;
        } else {
            ++field1562;
            return false;
        }
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(Lha;B)V")
    public final void method864(class58 arg0, byte arg1) {
        this.field1561.method3764(3, arg0);
        ++field1551;
        if (arg1 != -73) {
            field1541 = null;
        }
    }

    @OriginalMember(owner = "client!hw", name = "b", descriptor = "(BLha;)Lml;")
    public final class387 method755(byte arg0, class58 arg1) {
        ++field1560;
        if (arg0 != -127) {
            return null;
        } else {
            class471 var3 = this.field1561.method3765(false, -16386, true, arg1, 2048);
            if (var3 == null) {
                return null;
            } else {
                class513 var4 = arg1.method439();
                var4.method339(super.field6453 + super.field1264, super.field1255, super.field6458 + super.field1250);
                class387 var5 = class65.method544(this.field1543, 1, arg0 ^ -24711);
                int var6 = super.field1264 >> 9;
                int var7 = super.field1250 >> 9;
                this.field1561.method3768(var3, var6, true, arg1, (byte) 36, var4, var7, var6, var7);
                if (class180.field2409) {
                    var3.method262(var4, var5.field5482[0], class516.field7361, 0);
                } else {
                    var3.method221(var4, var5.field5482[0], 0);
                }
                if (this.field1561.field9231 != null) {
                    class50 var8 = this.field1561.field9231.method3116();
                    if (class180.field2409) {
                        arg1.method379(var8, class516.field7361);
                    } else {
                        arg1.method381(var8);
                    }
                }
                this.field1553 = var3.method224() || this.field1561.field9231 != null;
                if (this.field1540 == null) {
                    this.field1540 = class654.method3596(super.field1255, var3, super.field1264, super.field1250, (byte) 14);
                } else {
                    class555.method3208(this.field1540, super.field1255, super.field1250, super.field1264, (byte) -102, var3);
                }
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(I)I")
    public final int method865(int arg0) {
        ++field1558;
        if (arg0 != 30374) {
            this.field1561 = null;
        }
        return this.field1561.field9223;
    }

    @OriginalMember(owner = "client!hw", name = "d", descriptor = "(B)V")
    public final void method866(byte arg0) {
        if (arg0 != -62) {
            this.field1561 = null;
        }
        ++field1559;
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(B)Z")
    public final boolean method867(byte arg0) {
        ++field1542;
        if (arg0 < 82) {
            this.field1553 = true;
        }
        return this.field1561.method3758(109);
    }

    @OriginalMember(owner = "client!hw", name = "b", descriptor = "(B)I")
    public final int method868(byte arg0) {
        if (arg0 != -10) {
            this.method867((byte) 66);
        }
        ++field1548;
        return this.field1561.field9227;
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "([IB[J)V")
    public static final void method869(int[] arg0, byte arg1, long[] arg2) {
        if (arg1 != -122) {
            method869((int[]) null, (byte) 15, (long[]) null);
        }
        class4.method15(852, arg2.length + -1, arg2, 0, arg0);
        ++field1546;
    }

    @OriginalMember(owner = "client!hw", name = "b", descriptor = "(Z)V")
    public static void method870(boolean arg0) {
        if (!arg0) {
            method870(true);
        }
        field1541 = null;
    }

    @OriginalMember(owner = "client!hw", name = "b", descriptor = "(II)V")
    public static final void method871(int arg0, int arg1) {
        ++field1545;
        class592 var2 = class682.method3825(-652872096, arg1, arg0);
        var2.method3350(arg1 + -9);
    }

    @OriginalMember(owner = "client!hw", name = "<init>", descriptor = "(Lha;Lhba;IIIIIZIIIII)V")
    public class129(class58 arg0, class10 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
        this.field1561 = new class676(arg0, arg1, arg10, arg11, super.field1266, arg3, this, arg7, arg12);
        this.field1543 = arg1.field207 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(BLha;)V")
    public final void method753(byte arg0, class58 arg1) {
        int var3 = -52 / ((arg0 - 18) / 40);
        ++field1552;
        class471 var4 = this.field1561.method3765(false, -16386, true, arg1, 262144);
        if (var4 != null) {
            int var5 = super.field1264 >> 9;
            int var6 = super.field1250 >> 9;
            class513 var7 = arg1.method439();
            var7.method339(super.field1264, super.field1255, super.field1250);
            this.field1561.method3768(var4, var5, false, arg1, (byte) -128, var7, var6, var5, var6);
        }
    }

    @OriginalMember(owner = "client!hw", name = "g", descriptor = "(B)I")
    public final int method750(byte arg0) {
        ++field1554;
        if (arg0 != 14) {
            this.method749(-7);
        }
        return this.field1561.method3766(-102);
    }
}
