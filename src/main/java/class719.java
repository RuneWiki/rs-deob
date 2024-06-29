import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public abstract class class719 extends class176 {

    @OriginalMember(owner = "client!jn", name = "J", descriptor = "S")
    public short field10064;

    @OriginalMember(owner = "client!jn", name = "H", descriptor = "Lpu;")
    public static class563 field10063 = new class563(8);

    @OriginalMember(owner = "client!jn", name = "K", descriptor = "Lnha;")
    public static class325 field10065 = class608.method3360((byte) 5);

    @OriginalMember(owner = "client!jn", name = "M", descriptor = "Ljava/lang/String;")
    public static String field10067 = null;

    @OriginalMember(owner = "client!jn", name = "A", descriptor = "I")
    public static int field10056;

    @OriginalMember(owner = "client!jn", name = "B", descriptor = "I")
    public static int field10057;

    @OriginalMember(owner = "client!jn", name = "C", descriptor = "I")
    public static int field10058;

    @OriginalMember(owner = "client!jn", name = "D", descriptor = "I")
    public static int field10059;

    @OriginalMember(owner = "client!jn", name = "E", descriptor = "I")
    public static int field10060;

    @OriginalMember(owner = "client!jn", name = "F", descriptor = "I")
    public static int field10061;

    @OriginalMember(owner = "client!jn", name = "G", descriptor = "I")
    public static int field10062;

    @OriginalMember(owner = "client!jn", name = "L", descriptor = "Ljt;")
    public static class107 field10066;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(I[Lcba;)I")
    public final int method881(int arg0, class551[] arg1) {
        ++field10056;
        int var3 = super.field2170 >> class443.field6172;
        int var4 = super.field2165 >> class443.field6172;
        int var5 = 0;
        if (class610.field8512 != var3) {
            if (class610.field8512 < var3) {
                var5 += 2;
            }
        } else {
            ++var5;
        }
        if (~class39.field407 != ~var4) {
            if (~var4 > ~class39.field407) {
                var5 += 6;
            }
        } else {
            var5 += 3;
        }
        int var6 = class610.field8513[var5];
        if (~(this.field10064 & var6) != -1) {
            return this.method1009(var3, false, arg1, var4);
        } else if (~this.field10064 == -2 && var3 > 0) {
            return this.method1009(var3 + -1, false, arg1, var4);
        } else if (~this.field10064 == -5 && var3 <= class68.field743) {
            return this.method1009(var3 + 1, false, arg1, var4);
        } else if (this.field10064 == 8 && var4 > 0) {
            return this.method1009(var3, false, arg1, var4 + -1);
        } else if (this.field10064 == 2 && ~class480.field6629 <= ~var4) {
            return this.method1009(var3, false, arg1, var4 + 1);
        } else if (this.field10064 == 16 && var3 > 0 && ~var4 >= ~class480.field6629) {
            return this.method1009(var3 + -1, false, arg1, var4 + 1);
        } else if (~this.field10064 == -33 && ~class68.field743 <= ~var3 && class480.field6629 >= var4) {
            return this.method1009(var3 + 1, false, arg1, var4 + 1);
        } else if (this.field10064 == 128 && ~var3 < -1 && ~var4 < -1) {
            return this.method1009(var3 + -1, false, arg1, var4 - 1);
        } else {
            int var7 = 124 % ((arg0 - 29) / 62);
            if (~this.field10064 == -65 && var3 <= class68.field743 && ~var4 < -1) {
                return this.method1009(var3 + 1, false, arg1, var4 - 1);
            } else {
                throw new RuntimeException("");
            }
        }
    }

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "(Z)Z")
    public final boolean method885(boolean arg0) {
        if (arg0) {
            field10067 = null;
        }
        ++field10060;
        return class423.field5940[(super.field2170 >> class443.field6172) + (-class610.field8512 - -class118.field1562)][(super.field2165 >> class443.field6172) + class118.field1562 + -class39.field407];
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(II)Z")
    public static final boolean method4041(int arg0, int arg1) {
        if (arg0 != -6410) {
            return false;
        } else {
            ++field10059;
            return ~arg1 == -8 || arg1 == 8 || arg1 == 9;
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Loi;B)V")
    public static final void method4042(class74 arg0, byte arg1) {
        ++field10057;
        if (arg1 >= -105) {
            method4042((class74) null, (byte) 25);
        }
        if (!(arg0 instanceof class215)) {
            if (arg0 instanceof class83) {
                class83 var2 = (class83) arg0;
                class431.method2457(~class653.field9086.field2175 != ~var2.field2175, true, var2);
                return;
            }
        } else {
            class215 var3 = (class215) arg0;
            if (var3.field2589 == null) {
                return;
            }
            class243.method1458(var3, (byte) 55, class653.field9086.field2175 != var3.field2175);
        }
    }

    @OriginalMember(owner = "client!jn", name = "g", descriptor = "(B)V")
    public static void method4043(byte arg0) {
        if (arg0 != -93) {
            field10066 = null;
        }
        field10065 = null;
        field10067 = null;
        field10063 = null;
        field10066 = null;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lha;B)Z")
    public final boolean method882(class60 arg0, byte arg1) {
        ++field10058;
        return arg1 != 77 ? false : class76.method560(super.field2167, super.field2170 >> class443.field6172, super.field2165 >> class443.field6172, this, (byte) 112);
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(II)I")
    public static final int method4044(int arg0, int arg1) {
        ++field10062;
        if (arg0 != 1) {
            method4043((byte) -80);
        }
        if (arg1 != 6406) {
            if (~arg1 != -6410) {
                if (arg1 != 32841) {
                    if (arg1 != 6410) {
                        if (arg1 == 6407) {
                            return 3;
                        } else if (~arg1 == -6409) {
                            return 4;
                        } else {
                            throw new IllegalArgumentException("");
                        }
                    } else {
                        return 2;
                    }
                } else {
                    return 1;
                }
            } else {
                return 1;
            }
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIBLca;)V")
    public static final void method4045(int arg0, int arg1, byte arg2, class308 arg3) {
        ++field10061;
        class493.field6722[arg1][arg0] = arg3;
        if (arg2 <= 20) {
            method4043((byte) -29);
        }
    }

    @OriginalMember(owner = "client!jn", name = "<init>", descriptor = "(IIIIII)V")
    public class719(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field10064 = (short) arg5;
        super.field2170 = arg0;
        super.field2175 = (byte) arg3;
        super.field2167 = (byte) arg4;
        super.field2178 = arg1;
        super.field2165 = arg2;
    }
}
