import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class357 extends class354 implements class381 {

    @OriginalMember(owner = "client!lq", name = "p", descriptor = "Lql;")
    public class477 field4921;

    @OriginalMember(owner = "client!lq", name = "C", descriptor = "Z")
    private boolean field4934;

    @OriginalMember(owner = "client!lq", name = "s", descriptor = "I")
    public static int field4924 = -1;

    @OriginalMember(owner = "client!lq", name = "t", descriptor = "Lh;")
    public static class434 field4925 = new class434(28, 6);

    @OriginalMember(owner = "client!lq", name = "q", descriptor = "I")
    public static int field4922;

    @OriginalMember(owner = "client!lq", name = "r", descriptor = "I")
    public static int field4923;

    @OriginalMember(owner = "client!lq", name = "u", descriptor = "I")
    public static int field4926;

    @OriginalMember(owner = "client!lq", name = "v", descriptor = "I")
    public static int field4927;

    @OriginalMember(owner = "client!lq", name = "w", descriptor = "I")
    public static int field4928;

    @OriginalMember(owner = "client!lq", name = "x", descriptor = "I")
    public static int field4929;

    @OriginalMember(owner = "client!lq", name = "y", descriptor = "I")
    public static int field4930;

    @OriginalMember(owner = "client!lq", name = "z", descriptor = "I")
    public static int field4931;

    @OriginalMember(owner = "client!lq", name = "A", descriptor = "I")
    public static int field4932;

    @OriginalMember(owner = "client!lq", name = "B", descriptor = "I")
    public static int field4933;

    @OriginalMember(owner = "client!lq", name = "D", descriptor = "I")
    public static int field4935;

    @OriginalMember(owner = "client!lq", name = "E", descriptor = "I")
    public static int field4936;

    @OriginalMember(owner = "client!lq", name = "F", descriptor = "I")
    public static int field4937;

    @OriginalMember(owner = "client!lq", name = "G", descriptor = "I")
    public static int field4938;

    @OriginalMember(owner = "client!lq", name = "H", descriptor = "I")
    public static int field4939;

    @OriginalMember(owner = "client!lq", name = "K", descriptor = "I")
    public static int field4942;

    @OriginalMember(owner = "client!lq", name = "I", descriptor = "Lrt;")
    public static class137 field4940;

    @OriginalMember(owner = "client!lq", name = "J", descriptor = "[I")
    public static int[] field4941;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(BLwm;)V")
    public final void method12(byte arg0, class364 arg1) {
        ++field4937;
        if (arg0 >= 27) {
            this.field4921.method2785(arg1, -27576);
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(JI)Ljava/lang/String;")
    public static final String method2188(long arg0, int arg1) {
        ++field4922;
        if (arg0 > 0L && arg0 < 6582952005840035281L) {
            if (~(arg0 % 37L) == -1L) {
                return null;
            } else {
                int var3 = 0;
                long var4 = arg0;
                while (var4 != 0L) {
                    var4 /= 37L;
                    ++var3;
                }
                StringBuffer var6 = new StringBuffer(var3);
                if (arg1 != -525737785) {
                    return null;
                } else {
                    while (arg0 != 0L) {
                        long var7 = arg0;
                        arg0 /= 37L;
                        var6.append(class26.field337[(int) (-(arg0 * 37L) + var7)]);
                    }
                    return var6.reverse().toString();
                }
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lq", name = "e", descriptor = "(I)V")
    public final void method8(int arg0) {
        if (arg0 >= -74) {
            field4940 = null;
        }
        ++field4933;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "(I)I")
    public final int method9(int arg0) {
        ++field4927;
        if (arg0 != -769) {
            this.method16((class364) null, 84);
        }
        return this.field4921.field6590;
    }

    @OriginalMember(owner = "client!lq", name = "d", descriptor = "(I)I")
    public final int method13(int arg0) {
        ++field4923;
        return arg0 <= 51 ? 96 : this.field4921.field6595;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(IIBLwm;)Z")
    public final boolean method14(int arg0, int arg1, byte arg2, class364 arg3) {
        ++field4936;
        class456 var5 = this.field4921.method2796(false, false, arg3, 65536, super.field4900, super.field4904, (byte) -117);
        if (var5 == null) {
            return false;
        } else {
            class203 var6 = arg3.method1960();
            var6.method1029(super.field4904, super.field4897, super.field4900);
            if (arg2 >= -107) {
                this.field4934 = true;
            }
            return var5.method1882(arg0, arg1, var6, false);
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Z)Z")
    public final boolean method7(boolean arg0) {
        if (arg0) {
            this.field4921 = null;
        }
        ++field4931;
        return this.field4921.method2793(73);
    }

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(I)V")
    public final void method1(int arg0) {
        if (arg0 >= -105) {
            this.method12((byte) 85, (class364) null);
        }
        ++field4929;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lwm;B)V")
    public final void method10(class364 arg0, byte arg1) {
        ++field4938;
        class456 var3 = this.field4921.method2796(true, true, arg0, 131072, super.field4900, super.field4904, (byte) -126);
        if (arg1 > -48) {
            field4924 = -127;
        }
        if (var3 != null) {
            this.field4921.method2790(arg0, super.field4900 >> 7, var3, super.field4904 >> 7, super.field4900 >> 7, false, (byte) -121, super.field4904 >> 7);
        }
    }

    @OriginalMember(owner = "client!lq", name = "g", descriptor = "(I)Z")
    public final boolean method17(int arg0) {
        ++field4942;
        return arg0 != 7 ? false : false;
    }

    @OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(Lwm;Lct;IIIIIZII)V")
    public class357(class364 arg0, class88 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        super(arg4, arg5, arg6, arg1.field1263, arg1.field1258);
        this.field4921 = new class477(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
        this.field4934 = ~arg1.field1265 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(ILwm;I)Lgn;")
    public final class456 method15(int arg0, class364 arg1, int arg2) {
        ++field4930;
        return arg2 != -28045 ? null : this.field4921.method2796(false, false, arg1, arg0, 0, 0, (byte) -118);
    }

    @OriginalMember(owner = "client!lq", name = "i", descriptor = "(I)V")
    public static void method2189(int arg0) {
        field4925 = null;
        field4941 = null;
        field4940 = null;
        int var1 = -117 / ((-57 - arg0) / 52);
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)I")
    public final int method4(int arg0) {
        ++field4939;
        if (arg0 != -10666) {
            this.field4921 = null;
        }
        return this.field4921.field6596;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(II)V")
    public static final void method2190(int arg0, int arg1) {
        ++field4932;
        if (arg0 != -22420) {
            method2190(-26, -73);
        }
        class309.field4088 = arg1;
        class300.field4012.method495(-95);
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(IIILwm;ZLhp;Z)V")
    public final void method2(int arg0, int arg1, int arg2, class364 arg3, boolean arg4, class197 arg5, boolean arg6) {
        ++field4935;
        if (!arg6) {
            field4941 = null;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(Lwm;B)Lnf;")
    public final class374 method3(class364 arg0, byte arg1) {
        ++field4926;
        class456 var3 = this.field4921.method2796(true, false, arg0, 1024, super.field4900, super.field4904, (byte) -127);
        if (var3 == null) {
            return null;
        } else {
            class203 var4 = arg0.method1960();
            var4.method1029(super.field4904, super.field4897, super.field4900);
            if (arg1 < 99) {
                return null;
            } else {
                class374 var5 = null;
                if (this.field4934) {
                    var5 = class358.method2196(1, (byte) -2);
                }
                if (this.field4921.field6610 == null) {
                    var3.method1880(var4, var5 != null ? var5.field5156[0] : null, 0);
                } else {
                    class342 var6 = this.field4921.field6610.method1441();
                    arg0.method2051(var3, var6, var4, var5 == null ? null : var5.field5156[0], 0);
                }
                this.field4921.method2790(arg0, super.field4900 >> 7, var3, super.field4904 >> 7, super.field4900 >> 7, true, (byte) 26, super.field4904 >> 7);
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lwm;I)V")
    public final void method16(class364 arg0, int arg1) {
        if (arg1 == 31591) {
            ++field4928;
            this.field4921.method2795(94, arg0);
        }
    }

    static {
        new class206("Thank-you, your abuse report has been received.", "Vielen Dank, deine Meldung ist bei uns eingegangen.", "Merci, nous avons bien reçu votre rapport d'abus.", "Obrigado. Sua denúncia de abuso foi recebida.");
    }
}
