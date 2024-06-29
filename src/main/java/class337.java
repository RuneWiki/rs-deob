import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vu")
public class class337 {

    @OriginalMember(owner = "client!vu", name = "g", descriptor = "Lpca;")
    private class714 field4692 = new class714(128);

    @OriginalMember(owner = "client!vu", name = "e", descriptor = "Lfp;")
    private class323 field4690;

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "Lgda;")
    public static class53 field4687 = new class53(9, 8);

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "I")
    public static int field4686;

    @OriginalMember(owner = "client!vu", name = "c", descriptor = "I")
    public static int field4688;

    @OriginalMember(owner = "client!vu", name = "d", descriptor = "I")
    public static int field4689;

    @OriginalMember(owner = "client!vu", name = "f", descriptor = "I")
    public static int field4691;

    @OriginalMember(owner = "client!vu", name = "h", descriptor = "I")
    public static int field4693;

    @OriginalMember(owner = "client!vu", name = "i", descriptor = "I")
    public static int field4694;

    @OriginalMember(owner = "client!vu", name = "j", descriptor = "I")
    public static int field4695;

    @OriginalMember(owner = "client!vu", name = "k", descriptor = "I")
    public static int field4696;

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(B)V")
    public final void method2185(byte arg0) {
        field4689++;
        if (arg0 == -93) {
            class714 var2 = this.field4692;
            synchronized (this.field4692) {
                this.field4692.method4023((byte) 120);
            }
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(IZ)Ltr;")
    public final class293 method2186(int arg0, boolean arg1) {
        field4695++;
        class714 var3 = this.field4692;
        class293 var4;
        synchronized (this.field4692) {
            var4 = (class293) this.field4692.method4022((long) arg0, (byte) 84);
        }
        if (var4 != null) {
            return var4;
        }
        class323 var5 = this.field4690;
        byte[] var6;
        synchronized (this.field4690) {
            var6 = this.field4690.method2100(arg0, (byte) 112, 1);
        }
        class293 var7 = new class293();
        if (var6 != null) {
            var7.method1911(new class675(var6), -128);
        }
        class714 var8 = this.field4692;
        synchronized (this.field4692) {
            this.field4692.method4018((byte) 127, var7, (long) arg0);
        }
        return arg1 ? var7 : null;
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(I)Lff;")
    public static final class9 method2187(int arg0) {
        field4691++;
        if (arg0 != 1) {
            field4687 = null;
        }
        class9 var1 = (class9) class103.field1230.method2303((byte) -37);
        if (var1 == null) {
            return new class9();
        } else {
            class511.field7305--;
            return var1;
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(Z)V")
    public static void method2188(boolean arg0) {
        field4687 = null;
        if (!arg0) {
            field4696 = 56;
        }
    }

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "(I)V")
    public final void method2189(int arg0) {
        field4688++;
        class714 var2 = this.field4692;
        synchronized (this.field4692) {
            this.field4692.method4024(0);
            if (arg0 != -16505) {
                this.method2189(-56);
            }
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(BI)V")
    public final void method2190(byte arg0, int arg1) {
        class714 var3 = this.field4692;
        synchronized (this.field4692) {
            this.field4692.method4016(arg1, (byte) -73);
            if (arg0 != -106) {
                field4687 = null;
            }
        }
        field4686++;
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(IIILha;IIILbe;IIII)V")
    public static final void method2191(int arg0, int arg1, int arg2, class58 arg3, int arg4, int arg5, int arg6, class37 arg7, int arg8, int arg9, int arg10, int arg11) {
        if (arg6 > arg11 && arg6 < arg9 + arg11 && arg10 - 13 < arg5 && arg10 + 3 > arg5 && arg7.field460) {
            arg2 = arg1;
        }
        field4693++;
        int[] var12 = null;
        if (class727.method4086(-46, arg7.field463)) {
            var12 = class682.field9361.method3424((int) arg7.field474, false).field7686;
        } else if (arg7.field462 != -1) {
            var12 = class682.field9361.method3424(arg7.field462, false).field7686;
        } else if (class71.method592(arg7.field463, (byte) -94)) {
            class740 var15 = (class740) class373.field5230.method1180((byte) 26, (long) ((int) arg7.field474));
            if (var15 != null) {
                class468 var16 = var15.field10289;
                class353 var17 = var16.field6632;
                if (var17.field5026 != null) {
                    var17 = var17.method2273((byte) 29, class101.field1201);
                }
                if (var17 != null) {
                    var12 = var17.field5001;
                }
            }
        } else if (class636.method3537(8071, arg7.field463)) {
            Object var13 = null;
            class10 var14;
            if (arg7.field463 == 1004) {
                var14 = class612.field8588.method558((byte) 39, (int) arg7.field474);
            } else {
                var14 = class612.field8588.method558((byte) -115, (int) (arg7.field474 >>> 32 & 0x7FFFFFFFL));
            }
            if (var14.field226 != null) {
                var14 = var14.method67(class101.field1201, arg8 - 9);
            }
            if (var14 != null) {
                var12 = var14.field219;
            }
        }
        String var18 = class725.method4078(arg7, -126);
        if (arg8 != 9) {
            return;
        }
        if (var12 != null) {
            var18 = var18 + class473.method2831(var12, (byte) 122);
        }
        class505.field7241.method508(0, arg2, arg8 ^ 0x6D, arg11 + 3, class748.field10391, var18, class417.field5894, arg10);
        if (arg7.field471) {
            class322.field4456.method658(class119.field1441.method992(var18, (byte) -88) + arg11 + 5, arg10 + -12);
        }
    }

    @OriginalMember(owner = "client!vu", name = "<init>", descriptor = "(Lsaa;ILfp;)V")
    public class337(class326 arg0, int arg1, class323 arg2) {
        this.field4690 = arg2;
        this.field4690.method2084(1, 0);
    }
}
