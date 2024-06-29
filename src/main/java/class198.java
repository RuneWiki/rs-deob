import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class198 {

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "Lsf;")
    public class60 field3388 = new class60();

    @OriginalMember(owner = "client!uh", name = "m", descriptor = "[[B")
    public static byte[][] field3398 = new byte[250][];

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "Lub;")
    private static class227 field3391 = class257.method1749("Allocated memory", 17263);

    @OriginalMember(owner = "client!uh", name = "o", descriptor = "Lub;")
    public static class227 field3400 = field3391;

    @OriginalMember(owner = "client!uh", name = "s", descriptor = "Lub;")
    public static class227 field3404 = class257.method1749("Fertigkeit)2", 17263);

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "I")
    public static int field3386;

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "I")
    public static int field3389;

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "I")
    public static int field3390;

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "I")
    public static int field3392;

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "I")
    public static int field3393;

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "I")
    public static int field3394;

    @OriginalMember(owner = "client!uh", name = "j", descriptor = "I")
    public static int field3395;

    @OriginalMember(owner = "client!uh", name = "k", descriptor = "I")
    public static int field3396;

    @OriginalMember(owner = "client!uh", name = "l", descriptor = "I")
    public static int field3397;

    @OriginalMember(owner = "client!uh", name = "p", descriptor = "I")
    public static int field3401;

    @OriginalMember(owner = "client!uh", name = "q", descriptor = "I")
    public static int field3402;

    @OriginalMember(owner = "client!uh", name = "t", descriptor = "I")
    public static int field3405;

    @OriginalMember(owner = "client!uh", name = "u", descriptor = "I")
    public static int field3406;

    @OriginalMember(owner = "client!uh", name = "v", descriptor = "I")
    public static int field3407;

    @OriginalMember(owner = "client!uh", name = "r", descriptor = "Lsf;")
    private class60 field3403;

    @OriginalMember(owner = "client!uh", name = "n", descriptor = "[[I")
    public static int[][] field3399;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ILta;)V")
    public static final void method1268(int arg0, class105 arg1) {
        field3396++;
        if (class226.field3905 == arg1.field1840) {
            class10.field182[arg1.field1988] = true;
        }
        if (arg0 <= 73) {
            field3399 = null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)Lsf;")
    public final class60 method1269(byte arg0) {
        field3393++;
        class60 var2 = this.field3388.field1110;
        if (this.field3388 == var2) {
            return null;
        } else {
            var2.method369(125);
            int var3 = 89 % ((arg0 - 69) / 55);
            return var2;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)Lsf;")
    public final class60 method1270(int arg0) {
        field3390++;
        if (arg0 != 0) {
            return null;
        }
        class60 var2 = this.field3388.field1112;
        if (this.field3388 == var2) {
            this.field3403 = null;
            return null;
        } else {
            this.field3403 = var2.field1112;
            return var2;
        }
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(I)Lsf;")
    public final class60 method1271(int arg0) {
        field3389++;
        class60 var2 = this.field3403;
        if (arg0 != 250) {
            this.method1280((class60) null, false, (class60) null);
        }
        if (this.field3388 == var2) {
            this.field3403 = null;
            return null;
        } else {
            this.field3403 = var2.field1110;
            return var2;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ILsf;)V")
    public final void method1272(int arg0, class60 arg1) {
        field3386++;
        if (arg0 != 5664) {
            return;
        }
        if (arg1.field1112 != null) {
            arg1.method369(127);
        }
        arg1.field1110 = this.field3388;
        arg1.field1112 = this.field3388.field1112;
        arg1.field1112.field1110 = arg1;
        arg1.field1110.field1112 = arg1;
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(B)I")
    public final int method1273(byte arg0) {
        if (arg0 >= -102) {
            field3398 = null;
        }
        field3401++;
        class60 var2 = this.field3388.field1110;
        int var3 = 0;
        while (this.field3388 != var2) {
            var3++;
            var2 = var2.field1110;
        }
        return var3;
    }

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "(B)V")
    public final void method1274(byte arg0) {
        if (arg0 != 109) {
            this.field3388 = null;
        }
        while (true) {
            class60 var2 = this.field3388.field1110;
            if (this.field3388 == var2) {
                field3405++;
                this.field3403 = null;
                return;
            }
            var2.method369(arg0 ^ 0xFFFFFFCD);
        }
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(ILsf;)V")
    public final void method1275(int arg0, class60 arg1) {
        if (arg1.field1112 != null) {
            arg1.method369(-34);
        }
        arg1.field1112 = this.field3388;
        arg1.field1110 = this.field3388.field1110;
        if (arg0 == -18157) {
            arg1.field1112.field1110 = arg1;
            arg1.field1110.field1112 = arg1;
            field3387++;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IILn;)Lwf;")
    public static final class99 method1276(int arg0, int arg1, class138 arg2) {
        field3407++;
        byte[] var3 = arg2.method867(arg0, 17056);
        if (var3 == null) {
            return null;
        } else {
            if (arg1 != -32680) {
                method1276(5, -81, (class138) null);
            }
            return new class99(var3);
        }
    }

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "(I)Lsf;")
    public final class60 method1277(int arg0) {
        field3397++;
        class60 var2 = this.field3388.field1110;
        if (this.field3388 == var2) {
            this.field3403 = null;
            return null;
        } else {
            this.field3403 = var2.field1110;
            return arg0 < 75 ? null : var2;
        }
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "()V")
    public class198() {
        this.field3388.field1110 = this.field3388;
        this.field3388.field1112 = this.field3388;
    }

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "(I)V")
    public static void method1278(int arg0) {
        field3398 = null;
        field3399 = null;
        int var1 = 94 / ((21 - arg0) / 63);
        field3400 = null;
        field3404 = null;
        field3391 = null;
    }

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "(I)Lsf;")
    public final class60 method1279(int arg0) {
        field3402++;
        class60 var2 = this.field3403;
        if (this.field3388 == var2) {
            this.field3403 = null;
            return null;
        }
        if (arg0 != 0) {
            method1268(59, (class105) null);
        }
        this.field3403 = var2.field1112;
        return var2;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lsf;ZLsf;)V")
    public final void method1280(class60 arg0, boolean arg1, class60 arg2) {
        if (arg0.field1112 != null) {
            arg0.method369(124);
        }
        arg0.field1110 = arg2;
        field3406++;
        if (!arg1) {
            arg0.field1112 = arg2.field1112;
            arg0.field1112.field1110 = arg0;
            arg0.field1110.field1112 = arg0;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ILn;IB)Lwh;")
    public static final class163 method1281(int arg0, class138 arg1, int arg2, byte arg3) {
        field3395++;
        if (class123.method760(arg1, arg0, arg2, -121)) {
            int var4 = -102 % ((27 - arg3) / 36);
            return class119.method750(360);
        } else {
            return null;
        }
    }
}
