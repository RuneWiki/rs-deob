import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class308 extends class403 implements class113 {

    @OriginalMember(owner = "client!ch", name = "F", descriptor = "Z")
    private boolean field4480;

    @OriginalMember(owner = "client!ch", name = "s", descriptor = "S")
    private short field4467;

    @OriginalMember(owner = "client!ch", name = "n", descriptor = "B")
    private byte field4462;

    @OriginalMember(owner = "client!ch", name = "G", descriptor = "Z")
    private boolean field4481;

    @OriginalMember(owner = "client!ch", name = "P", descriptor = "Z")
    private boolean field4490;

    @OriginalMember(owner = "client!ch", name = "w", descriptor = "B")
    private byte field4471;

    @OriginalMember(owner = "client!ch", name = "A", descriptor = "B")
    private byte field4475;

    @OriginalMember(owner = "client!ch", name = "N", descriptor = "Z")
    private boolean field4488;

    @OriginalMember(owner = "client!ch", name = "M", descriptor = "Lss;")
    private class283 field4487;

    @OriginalMember(owner = "client!ch", name = "H", descriptor = "Lva;")
    public class327 field4482;

    @OriginalMember(owner = "client!ch", name = "u", descriptor = "Lwt;")
    public static class194 field4469 = new class194("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");

    @OriginalMember(owner = "client!ch", name = "m", descriptor = "I")
    public static int field4461;

    @OriginalMember(owner = "client!ch", name = "o", descriptor = "I")
    public static int field4463;

    @OriginalMember(owner = "client!ch", name = "p", descriptor = "I")
    public static int field4464;

    @OriginalMember(owner = "client!ch", name = "q", descriptor = "I")
    public static int field4465;

    @OriginalMember(owner = "client!ch", name = "r", descriptor = "I")
    public static int field4466;

    @OriginalMember(owner = "client!ch", name = "t", descriptor = "I")
    public static int field4468;

    @OriginalMember(owner = "client!ch", name = "y", descriptor = "I")
    public static int field4473;

    @OriginalMember(owner = "client!ch", name = "z", descriptor = "I")
    public static int field4474;

    @OriginalMember(owner = "client!ch", name = "B", descriptor = "I")
    public static int field4476;

    @OriginalMember(owner = "client!ch", name = "C", descriptor = "I")
    public static int field4477;

    @OriginalMember(owner = "client!ch", name = "D", descriptor = "I")
    public static int field4478;

    @OriginalMember(owner = "client!ch", name = "E", descriptor = "I")
    public static int field4479;

    @OriginalMember(owner = "client!ch", name = "I", descriptor = "I")
    public static int field4483;

    @OriginalMember(owner = "client!ch", name = "J", descriptor = "I")
    public static int field4484;

    @OriginalMember(owner = "client!ch", name = "K", descriptor = "I")
    public static int field4485;

    @OriginalMember(owner = "client!ch", name = "L", descriptor = "I")
    public static int field4486;

    @OriginalMember(owner = "client!ch", name = "O", descriptor = "I")
    public static int field4489;

    @OriginalMember(owner = "client!ch", name = "R", descriptor = "I")
    public static int field4492;

    @OriginalMember(owner = "client!ch", name = "Q", descriptor = "J")
    public static long field4491;

    @OriginalMember(owner = "client!ch", name = "x", descriptor = "Z")
    public static boolean field4472;

    @OriginalMember(owner = "client!ch", name = "v", descriptor = "[I")
    public static int[] field4470;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Z)Z")
    public final boolean method371(boolean arg0) {
        ++field4463;
        if (arg0) {
            this.method364((class134) null, true);
        }
        return this.field4488;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILeq;BI)Z")
    public final boolean method365(int arg0, class134 arg1, byte arg2, int arg3) {
        int var5 = 75 % ((arg2 - -23) / 38);
        ++field4466;
        class327 var6 = this.method1853(arg1, -1, 131072);
        if (var6 != null) {
            class33 var7 = arg1.method830();
            var7.method278(super.field5937, super.field5938, super.field5936);
            return var6.method184(arg0, arg3, var7, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(I)V")
    public final void method368(int arg0) {
        ++field4483;
        if (arg0 != 5894) {
            this.field4481 = false;
        }
        if (this.field4482 != null) {
            this.field4482.method167();
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILeq;IZ)Luq;")
    private final class107 method1850(int arg0, class134 arg1, int arg2, boolean arg3) {
        ++field4468;
        if (arg0 != 1) {
            this.field4490 = true;
        }
        class486 var5 = class114.field1471.method2132((byte) 119, this.field4467 & 65535);
        class441 var6;
        class441 var7;
        if (!this.field4490) {
            if (~this.field4471 <= -4) {
                var6 = null;
            } else {
                var6 = class459.field6685[this.field4471 + 1];
            }
            var7 = class459.field6685[this.field4471];
        } else {
            var7 = class178.field2562[this.field4471];
            var6 = class459.field6685[0];
        }
        return var5.method2836(var6, var7, super.field5937, super.field5936, arg2, super.field5938, this.field4475, arg3, this.field4462, arg1, (byte) 77);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILeq;Z)Lva;")
    public final class327 method367(int arg0, class134 arg1, boolean arg2) {
        if (!arg2) {
            return null;
        } else {
            ++field4489;
            return this.method1853(arg1, -1, arg0);
        }
    }

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "(I)Z")
    public final boolean method723(int arg0) {
        ++field4477;
        if (arg0 != 17774) {
            field4491 = 23L;
        }
        return this.field4481;
    }

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "(B)V")
    public static void method1851(byte arg0) {
        field4469 = null;
        field4470 = null;
        if (arg0 > -70) {
            method1851((byte) -113);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIILbp;IZLeq;)V")
    public final void method719(int arg0, int arg1, int arg2, class250 arg3, int arg4, boolean arg5, class134 arg6) {
        if (arg3 instanceof class308) {
            class308 var8 = (class308) arg3;
            if (this.field4482 != null && var8.field4482 != null) {
                this.field4482.method159(var8.field4482, arg4, arg1, arg0, arg5);
            }
        } else if (arg3 instanceof class413) {
            class413 var9 = (class413) arg3;
            if (this.field4482 != null && var9.field6107 != null) {
                this.field4482.method159(var9.field6107, arg4, arg1, arg0, arg5);
            }
        }
        if (arg2 != -1) {
            this.field4462 = 20;
        }
        ++field4465;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIZ)V")
    public static final void method1852(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg0 < 94) {
            field4470 = null;
        }
        ++field4479;
        if (class293.field4174 == 0) {
            class265.method1630(false, -33);
        } else {
            class297.field4326 = class293.field4174;
            class46.method353(0, true);
        }
        class83.field1130 = arg1;
        class185.field2636 = arg2;
        class349.field5053 = arg4;
        class249.method1566(arg3);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Leq;I)V")
    public final void method361(class134 arg0, int arg1) {
        if (arg1 != -1) {
            this.method367(-27, (class134) null, false);
        }
        ++field4476;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Leq;II)Lva;")
    private final class327 method1853(class134 arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            return null;
        } else {
            ++field4461;
            if (this.field4482 != null && ~arg0.method819(this.field4482.method200(), arg2) == -1) {
                return this.field4482;
            } else {
                class107 var4 = this.method1850(1, arg0, arg2, false);
                return var4 == null ? null : var4.field1435;
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "(I)V")
    public final void method722(int arg0) {
        if (arg0 != 0) {
            field4469 = null;
        }
        ++field4486;
        this.field4481 = false;
        if (this.field4482 != null) {
            this.field4482.method197(-65537 & this.field4482.method200());
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(BLeq;)V")
    public final void method372(byte arg0, class134 arg1) {
        ++field4484;
        if (arg0 <= -49) {
            Object var3 = null;
            class283 var5;
            if (this.field4487 == null && this.field4488) {
                class107 var4 = this.method1850(1, arg1, 262144, true);
                var5 = var4 != null ? var4.field1436 : null;
            } else {
                var5 = this.field4487;
                this.field4487 = null;
            }
            if (var5 != null) {
                class484.method2821(var5, this.field4471, super.field5937, super.field5936, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(B)I")
    public final int method362(byte arg0) {
        if (arg0 != -72) {
            this.field4487 = null;
        }
        ++field4474;
        return this.field4475;
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(Leq;Lhn;IIIIZIIZ)V")
    public class308(class134 arg0, class486 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, boolean arg9) {
        super(arg3, arg4, arg5, class120.method688(100, arg8, arg7));
        this.field4480 = arg1.field7041 != 0 && !arg6;
        this.field4467 = (short) arg1.field7046;
        this.field4462 = (byte) arg8;
        this.field4481 = arg9;
        this.field4490 = arg6;
        this.field4471 = (byte) arg2;
        this.field4475 = (byte) arg7;
        super.field5937 = arg3;
        super.field5936 = arg5;
        this.field4488 = arg0.method761() && arg1.field7091 && !this.field4490 && ~class118.field1533.field6901 != -1;
        int var11 = 2048;
        if (this.field4481) {
            var11 |= 65536;
        }
        class107 var12 = this.method1850(1, arg0, var11, this.field4488);
        if (var12 != null) {
            this.field4487 = var12.field1436;
            this.field4482 = var12.field1435;
            if (this.field4481) {
                this.field4482 = this.field4482.method194((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(Leq;Z)Lgl;")
    public final class408 method364(class134 arg0, boolean arg1) {
        ++field4473;
        if (this.field4482 == null) {
            return null;
        } else {
            if (arg1) {
                this.field4482 = null;
            }
            class33 var3 = arg0.method830();
            var3.method278(super.field5937, super.field5938, super.field5936);
            class408 var4 = null;
            if (this.field4480) {
                var4 = class118.method675(-117, 1);
            }
            this.field4482.method191(var3, var4 != null ? var4.field5983[0] : null, 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(B)I")
    public final int method369(byte arg0) {
        ++field4485;
        if (arg0 < 24) {
            this.field4471 = 61;
        }
        return this.field4467 & 65535;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Leq;Z)V")
    public final void method360(class134 arg0, boolean arg1) {
        ++field4464;
        Object var3 = null;
        if (!arg1) {
            this.method1853((class134) null, -102, 104);
        }
        class283 var5;
        if (this.field4487 == null && this.field4488) {
            class107 var4 = this.method1850(1, arg0, 262144, true);
            var5 = var4 != null ? var4.field1436 : null;
        } else {
            var5 = this.field4487;
            this.field4487 = null;
        }
        if (var5 != null) {
            class458.method2666(var5, this.field4471, super.field5937, super.field5936, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)I")
    public final int method359(int arg0) {
        if (arg0 != 13228) {
            return -85;
        } else {
            ++field4478;
            return this.field4462;
        }
    }
}
