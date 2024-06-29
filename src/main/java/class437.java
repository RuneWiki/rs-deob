import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class437 extends class403 implements class113 {

    @OriginalMember(owner = "client!rg", name = "B", descriptor = "Lro;")
    public class2 field6398;

    @OriginalMember(owner = "client!rg", name = "t", descriptor = "Z")
    private boolean field6390;

    @OriginalMember(owner = "client!rg", name = "v", descriptor = "I")
    public static int field6392 = 0;

    @OriginalMember(owner = "client!rg", name = "m", descriptor = "I")
    public static int field6383;

    @OriginalMember(owner = "client!rg", name = "n", descriptor = "I")
    public static int field6384;

    @OriginalMember(owner = "client!rg", name = "o", descriptor = "I")
    public static int field6385;

    @OriginalMember(owner = "client!rg", name = "p", descriptor = "I")
    public static int field6386;

    @OriginalMember(owner = "client!rg", name = "q", descriptor = "I")
    public static int field6387;

    @OriginalMember(owner = "client!rg", name = "r", descriptor = "I")
    public static int field6388;

    @OriginalMember(owner = "client!rg", name = "s", descriptor = "I")
    public static int field6389;

    @OriginalMember(owner = "client!rg", name = "u", descriptor = "I")
    public static int field6391;

    @OriginalMember(owner = "client!rg", name = "w", descriptor = "I")
    public static int field6393;

    @OriginalMember(owner = "client!rg", name = "x", descriptor = "I")
    public static int field6394;

    @OriginalMember(owner = "client!rg", name = "y", descriptor = "I")
    public static int field6395;

    @OriginalMember(owner = "client!rg", name = "z", descriptor = "I")
    public static int field6396;

    @OriginalMember(owner = "client!rg", name = "C", descriptor = "I")
    public static int field6399;

    @OriginalMember(owner = "client!rg", name = "D", descriptor = "I")
    public static int field6400;

    @OriginalMember(owner = "client!rg", name = "E", descriptor = "I")
    public static int field6401;

    @OriginalMember(owner = "client!rg", name = "F", descriptor = "I")
    public static int field6402;

    @OriginalMember(owner = "client!rg", name = "G", descriptor = "I")
    public static int field6403;

    @OriginalMember(owner = "client!rg", name = "A", descriptor = "Ljava/lang/String;")
    public static String field6397;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(ILeq;Z)Lva;")
    public final class327 method367(int arg0, class134 arg1, boolean arg2) {
        if (!arg2) {
            return null;
        } else {
            ++field6396;
            return this.field6398.method16(0, -1, 0, arg1, false, arg0, false);
        }
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(Leq;Lhn;IIIIIZIII)V")
    public class437(class134 arg0, class486 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        super(arg4, arg5, arg6, class150.method924(arg8, -117, arg9));
        this.field6398 = new class2(arg0, arg1, arg8, arg9, arg2, arg3, super.field5937, super.field5936, arg7, arg10);
        this.field6390 = arg1.field7041 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lbn;B)I")
    public static final int method2570(class294 arg0, byte arg1) {
        ++field6391;
        if (arg0.field4226 == 0) {
            return 0;
        } else {
            if (~arg0.field4222 != 0) {
                class294 var2 = null;
                if (~arg0.field4222 > -32769) {
                    var2 = class504.field7697[arg0.field4222];
                } else if (arg0.field4222 >= 32768) {
                    var2 = class262.field3742[arg0.field4222 + -32768];
                }
                if (var2 != null) {
                    int var3 = -var2.field2959 + arg0.field2959;
                    int var4 = arg0.field2966 - var2.field2966;
                    if (~var3 != -1 || ~var4 != -1) {
                        arg0.method1775((byte) -50, 16383 & (int) (Math.atan2((double) var3, (double) var4) * 2607.5945876176133D));
                    }
                }
            }
            if (arg1 != 11) {
                method2570((class294) null, (byte) -26);
            }
            if (arg0 instanceof class313) {
                class313 var5 = (class313) arg0;
                if (var5.field4570 != -1 && (var5.field4277 == 0 || ~var5.field4275 < -1)) {
                    var5.method1775((byte) -53, var5.field4570);
                    var5.field4570 = -1;
                }
            } else if (arg0 instanceof class139) {
                class139 var6 = (class139) arg0;
                if (~var6.field1831 != 0 && (var6.field4277 == 0 || var6.field4275 > 0)) {
                    int var7 = -((-class455.field6637 + var6.field1831 + -class455.field6637) * 64) + var6.field2959;
                    int var8 = var6.field2966 - (var6.field1829 - (class223.field3158 + class223.field3158)) * 64;
                    if (~var7 != -1 || ~var8 != -1) {
                        var6.method1775((byte) 118, 16383 & (int) (Math.atan2((double) var7, (double) var8) * 2607.5945876176133D));
                    }
                    var6.field1831 = -1;
                }
            }
            return arg0.method1777((byte) 16);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(ILeq;BI)Z")
    public final boolean method365(int arg0, class134 arg1, byte arg2, int arg3) {
        int var5 = -78 % ((arg2 - -23) / 38);
        ++field6401;
        class327 var6 = this.field6398.method16(super.field5936, -1, super.field5937, arg1, false, 131072, false);
        if (var6 == null) {
            return false;
        } else {
            class33 var7 = arg1.method830();
            var7.method278(super.field5937, super.field5938, super.field5936);
            return var6.method184(arg0, arg3, var7, false);
        }
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(Leq;Z)Lgl;")
    public final class408 method364(class134 arg0, boolean arg1) {
        ++field6386;
        class327 var3 = this.field6398.method16(super.field5936, -1, super.field5937, arg0, arg1, 2048, true);
        if (var3 == null) {
            return null;
        } else {
            class33 var4 = arg0.method830();
            var4.method278(super.field5937, super.field5938, super.field5936);
            class408 var5 = null;
            if (this.field6390) {
                var5 = class118.method675(-124, 1);
            }
            if (this.field6398.field15 != null) {
                class191 var6 = this.field6398.field15.method2005();
                arg0.method787(var3, var6, var4, var5 == null ? null : var5.field5983[0], 0);
            } else {
                var3.method191(var4, var5 != null ? var5.field5983[0] : null, 0);
            }
            int var7 = super.field5937 >> 7;
            int var8 = super.field5936 >> 7;
            this.field6398.method13(var3, -32533, var8, var7, true, var7, arg0, var8);
            return var5;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Z)Z")
    public final boolean method371(boolean arg0) {
        if (arg0) {
            return true;
        } else {
            ++field6384;
            return this.field6398.method14((byte) 96);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Leq;I)V")
    public final void method361(class134 arg0, int arg1) {
        ++field6385;
        class327 var3 = this.field6398.method16(super.field5936, arg1, super.field5937, arg0, true, 262144, true);
        if (var3 != null) {
            int var4 = super.field5937 >> 7;
            int var5 = super.field5936 >> 7;
            this.field6398.method13(var3, arg1 + -32532, var5, var4, false, var4, arg0, var5);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIILbp;IZLeq;)V")
    public final void method719(int arg0, int arg1, int arg2, class250 arg3, int arg4, boolean arg5, class134 arg6) {
        ++field6383;
        if (arg2 != -1) {
            this.method364((class134) null, true);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)I")
    public final int method369(byte arg0) {
        ++field6399;
        if (arg0 <= 24) {
            this.method360((class134) null, false);
        }
        return this.field6398.field12;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)I")
    public final int method359(int arg0) {
        ++field6403;
        if (arg0 != 13228) {
            this.method368(-102);
        }
        return this.field6398.field39;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Leq;Z)V")
    public final void method360(class134 arg0, boolean arg1) {
        ++field6388;
        this.field6398.method4((byte) -120, arg0);
        if (!arg1) {
            field6402 = 80;
        }
    }

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "(I)V")
    public final void method722(int arg0) {
        ++field6387;
        if (arg0 != 0) {
            this.method369((byte) -43);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(BLeq;)V")
    public final void method372(byte arg0, class134 arg1) {
        if (arg0 > -49) {
            field6402 = 95;
        }
        ++field6400;
        this.field6398.method7(arg1, (byte) -70);
    }

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "(I)V")
    public static void method2571(int arg0) {
        if (arg0 < -114) {
            field6397 = null;
        }
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(B)I")
    public final int method362(byte arg0) {
        if (arg0 != -72) {
            this.method723(44);
        }
        ++field6395;
        return this.field6398.field9;
    }

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "(I)Z")
    public final boolean method723(int arg0) {
        ++field6393;
        if (arg0 != 17774) {
            this.method365(-27, (class134) null, (byte) 80, -108);
        }
        return false;
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(I)V")
    public final void method368(int arg0) {
        ++field6394;
        if (arg0 != 5894) {
            field6402 = -74;
        }
    }
}
