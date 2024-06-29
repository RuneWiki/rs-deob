import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public class class268 extends class134 implements class55 {

    @OriginalMember(owner = "client!br", name = "s", descriptor = "Leo;")
    public class193 field3673;

    @OriginalMember(owner = "client!br", name = "v", descriptor = "Z")
    private boolean field3676;

    @OriginalMember(owner = "client!br", name = "D", descriptor = "I")
    public static int field3684;

    @OriginalMember(owner = "client!br", name = "n", descriptor = "I")
    public static int field3668;

    @OriginalMember(owner = "client!br", name = "o", descriptor = "I")
    public static int field3669;

    @OriginalMember(owner = "client!br", name = "p", descriptor = "I")
    public static int field3670;

    @OriginalMember(owner = "client!br", name = "q", descriptor = "I")
    public static int field3671;

    @OriginalMember(owner = "client!br", name = "r", descriptor = "I")
    public static int field3672;

    @OriginalMember(owner = "client!br", name = "t", descriptor = "I")
    public static int field3674;

    @OriginalMember(owner = "client!br", name = "u", descriptor = "I")
    public static int field3675;

    @OriginalMember(owner = "client!br", name = "w", descriptor = "I")
    public static int field3677;

    @OriginalMember(owner = "client!br", name = "x", descriptor = "I")
    public static int field3678;

    @OriginalMember(owner = "client!br", name = "y", descriptor = "I")
    public static int field3679;

    @OriginalMember(owner = "client!br", name = "z", descriptor = "I")
    public static int field3680;

    @OriginalMember(owner = "client!br", name = "A", descriptor = "I")
    public static int field3681;

    @OriginalMember(owner = "client!br", name = "B", descriptor = "I")
    public static int field3682;

    @OriginalMember(owner = "client!br", name = "C", descriptor = "I")
    public static int field3683;

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(Z)Z")
    public final boolean method399(boolean arg0) {
        ++field3681;
        if (arg0) {
            field3684 = -16;
        }
        return false;
    }

    @OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Lqa;Lpk;IIIIIZIII)V")
    public class268(class162 arg0, class132 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        super(arg4, arg5, arg6, class246.method1454(arg8, -2, arg9));
        this.field3673 = new class193(arg0, arg1, arg8, arg9, arg2, arg3, super.field1937, super.field1936, arg7, arg10);
        this.field3676 = arg1.field1850 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(Lqa;I)Lip;")
    public final class498 method402(class162 arg0, int arg1) {
        ++field3669;
        class121 var3 = this.field3673.method1175(49, true, super.field1937, 2048, super.field1936, arg0, false);
        if (var3 == null) {
            return null;
        } else {
            class415 var4 = arg0.method539();
            var4.method340(super.field1937, super.field1939, super.field1936);
            class498 var5 = null;
            if (this.field3676) {
                var5 = class227.method1338(arg1 + -16562, 1);
            }
            if (this.field3673.field2779 == null) {
                var3.method781(var4, var5 != null ? var5.field7332[0] : null, 0);
            } else {
                class148 var6 = this.field3673.field2779.method1260();
                arg0.method512(var3, var6, var4, var5 == null ? null : var5.field7332[0], 0);
            }
            if (arg1 != 16562) {
                this.field3673 = null;
            }
            int var7 = super.field1937 >> 7;
            int var8 = super.field1936 >> 7;
            this.field3673.method1173(22869, var7, arg0, var3, true, var7, var8, var8);
            return var5;
        }
    }

    @OriginalMember(owner = "client!br", name = "c", descriptor = "(I)V")
    public final void method361(int arg0) {
        int var2 = -17 / ((-36 - arg0) / 36);
        ++field3671;
    }

    @OriginalMember(owner = "client!br", name = "b", descriptor = "(B)I")
    public final int method359(byte arg0) {
        if (arg0 != -8) {
            this.method399(false);
        }
        ++field3682;
        return this.field3673.field2764;
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(IILco;ILqa;ZZ)V")
    public final void method394(int arg0, int arg1, class76 arg2, int arg3, class162 arg4, boolean arg5, boolean arg6) {
        if (!arg6) {
            this.method398(-101);
        }
        ++field3670;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(I)I")
    public final int method355(int arg0) {
        if (arg0 != 13599) {
            return -41;
        } else {
            ++field3680;
            return this.field3673.field2759;
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(Lqa;III)Z")
    public final boolean method403(class162 arg0, int arg1, int arg2, int arg3) {
        ++field3678;
        class121 var5 = this.field3673.method1175(61, false, super.field1937, 131072, super.field1936, arg0, false);
        if (var5 == null) {
            return false;
        } else {
            if (arg2 != 24130) {
                this.method361(-77);
            }
            class415 var6 = arg0.method539();
            var6.method340(super.field1937, super.field1939, super.field1936);
            return var5.method777(arg1, arg3, var6, false);
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(IILqa;)Lc;")
    public final class121 method358(int arg0, int arg1, class162 arg2) {
        ++field3668;
        return arg0 != 4586 ? null : this.field3673.method1175(112, false, 0, arg1, 0, arg2, false);
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(B)I")
    public final int method354(byte arg0) {
        ++field3679;
        int var2 = -5 / ((arg0 - 61) / 53);
        return this.field3673.field2780;
    }

    @OriginalMember(owner = "client!br", name = "b", descriptor = "(I)Z")
    public final boolean method360(int arg0) {
        if (arg0 < 34) {
            this.field3673 = null;
        }
        ++field3674;
        return this.field3673.method1180(true);
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(ILqa;)V")
    public final void method356(int arg0, class162 arg1) {
        ++field3675;
        if (arg0 < 100) {
            this.field3673 = null;
        }
        this.field3673.method1177(arg1, -29962);
    }

    @OriginalMember(owner = "client!br", name = "c", descriptor = "(ILqa;)V")
    public final void method400(int arg0, class162 arg1) {
        int var3 = 108 % ((arg0 - -29) / 33);
        ++field3683;
        class121 var4 = this.field3673.method1175(79, true, super.field1937, 262144, super.field1936, arg1, true);
        if (var4 != null) {
            int var5 = super.field1937 >> 7;
            int var6 = super.field1936 >> 7;
            this.field3673.method1173(22869, var5, arg1, var4, false, var5, var6, var6);
        }
    }

    @OriginalMember(owner = "client!br", name = "e", descriptor = "(I)V")
    public final void method398(int arg0) {
        ++field3677;
        if (arg0 < 74) {
            this.method357(8, (class162) null);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!br", name = "b", descriptor = "(ILqa;)V")
    public final void method357(int arg0, class162 arg1) {
        if (arg0 >= 41) {
            ++field3672;
            this.field3673.method1176(262144, arg1);
        }
    }

    static {
        new class83("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...");
        field3684 = 0;
    }
}
