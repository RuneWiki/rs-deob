import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class216 extends class306 {

    @OriginalMember(owner = "client!ah", name = "K", descriptor = "I")
    private int field3106 = 0;

    @OriginalMember(owner = "client!ah", name = "F", descriptor = "I")
    private int field3101 = 0;

    @OriginalMember(owner = "client!ah", name = "P", descriptor = "I")
    private int field3111 = -1;

    @OriginalMember(owner = "client!ah", name = "I", descriptor = "Z")
    public boolean field3104 = false;

    @OriginalMember(owner = "client!ah", name = "Q", descriptor = "I")
    private int field3112 = -32768;

    @OriginalMember(owner = "client!ah", name = "R", descriptor = "I")
    private int field3113;

    @OriginalMember(owner = "client!ah", name = "O", descriptor = "I")
    public int field3110;

    @OriginalMember(owner = "client!ah", name = "H", descriptor = "Lb;")
    private class183 field3103;

    @OriginalMember(owner = "client!ah", name = "Z", descriptor = "Lpm;")
    public static class349 field3120;

    @OriginalMember(owner = "client!ah", name = "B", descriptor = "I")
    public static int field3097;

    @OriginalMember(owner = "client!ah", name = "D", descriptor = "I")
    public static int field3099;

    @OriginalMember(owner = "client!ah", name = "E", descriptor = "I")
    public static int field3100;

    @OriginalMember(owner = "client!ah", name = "G", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "client!ah", name = "J", descriptor = "I")
    public static int field3105;

    @OriginalMember(owner = "client!ah", name = "L", descriptor = "I")
    public static int field3107;

    @OriginalMember(owner = "client!ah", name = "M", descriptor = "I")
    public static int field3108;

    @OriginalMember(owner = "client!ah", name = "N", descriptor = "I")
    public static int field3109;

    @OriginalMember(owner = "client!ah", name = "S", descriptor = "I")
    public static int field3114;

    @OriginalMember(owner = "client!ah", name = "T", descriptor = "I")
    public static int field3115;

    @OriginalMember(owner = "client!ah", name = "U", descriptor = "I")
    public static int field3116;

    @OriginalMember(owner = "client!ah", name = "W", descriptor = "I")
    public static int field3117;

    @OriginalMember(owner = "client!ah", name = "Y", descriptor = "I")
    public static int field3119;

    @OriginalMember(owner = "client!ah", name = "bb", descriptor = "I")
    public static int field3122;

    @OriginalMember(owner = "client!ah", name = "ab", descriptor = "Ltj;")
    public static class108 field3121;

    @OriginalMember(owner = "client!ah", name = "X", descriptor = "Lro;")
    public static class1 field3118;

    @OriginalMember(owner = "client!ah", name = "C", descriptor = "Lnl;")
    private class328 field3098;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lvq;IIB)Z")
    public final boolean method16(class269 arg0, int arg1, int arg2, byte arg3) {
        int var5 = 44 % ((arg3 - 19) / 45);
        ++field3105;
        return false;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IILvq;)Lni;")
    private final class305 method1511(int arg0, int arg1, class269 arg2) {
        if (arg0 != 0) {
            this.field3103 = null;
        }
        ++field3097;
        class135 var4 = class209.method1486(this.field3113, 11);
        return this.field3104 ? var4.method1041(arg1, -1, arg2, -67, 0, -1) : var4.method1041(arg1, this.field3101, arg2, -70, this.field3106, this.field3111);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(B)V")
    public final void method1512(byte arg0) {
        if (this.field3098 != null) {
            this.field3098.method2155();
        }
        ++field3099;
        if (arg0 <= 39) {
            field3122 = 79;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lvq;Lni;I)V")
    private final void method1513(class269 arg0, class305 arg1, int arg2) {
        ++field3115;
        if (arg2 != 1024) {
            this.method1514(-100, 27);
        }
        class88[] var4 = arg1.method210();
        class430[] var5 = arg1.method238();
        if ((this.field3098 == null || this.field3098.field4755) && (var4 != null || var5 != null)) {
            this.field3098 = new class328(class34.field434);
        }
        if (this.field3098 != null) {
            this.field3098.method2154(arg0, (long) class34.field434, var4, var5, false);
            this.field3098.method2150(super.field4464, super.field4465, super.field4460, super.field4462, super.field4471);
        }
    }

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "(B)V")
    public final void method613(byte arg0) {
        ++field3114;
        if (arg0 <= -56) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(BLvq;)Lbf;")
    public final class316 method15(byte arg0, class269 arg1) {
        ++field3102;
        class305 var3 = this.method1511(0, 1024, arg1);
        if (var3 == null) {
            return null;
        } else {
            class154 var4 = arg1.method884();
            var4.method1133(super.field4463, super.field4457, super.field4466);
            int var5 = -81 % ((-8 - arg0) / 51);
            if (this.field3098 != null) {
                class235 var6 = this.field3098.method2152();
                arg1.method1013(var3, var6, var4, (class144) null, 0);
            } else {
                var3.method230(var4, (class144) null, 0);
            }
            this.field3112 = var3.method221();
            this.method1513(arg1, var3, 1024);
            return null;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(II)V")
    public final void method1514(int arg0, int arg1) {
        if (arg0 != 0) {
            this.method1511(17, 93, (class269) null);
        }
        ++field3107;
        if (!this.field3104) {
            this.field3106 += arg1;
            while (this.field3106 > this.field3103.field2600[this.field3101]) {
                this.field3106 -= this.field3103.field2600[this.field3101];
                ++this.field3101;
                if (this.field3103.field2609.length <= this.field3101) {
                    this.field3104 = true;
                    break;
                }
            }
            if (!this.field3104) {
                class47.method311(super.field4463, super.field4466, this.field3101, true, false, this.field3103);
            }
        }
    }

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "(I)Z")
    public final boolean method610(int arg0) {
        ++field3100;
        if (arg0 != -439) {
            this.method22((class269) null, (byte) 64);
        }
        return false;
    }

    @OriginalMember(owner = "client!ah", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.field3098 != null) {
            this.field3098.method2155();
        }
        ++field3119;
    }

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "(I)I")
    public final int method775(int arg0) {
        ++field3108;
        if (arg0 != 3) {
            this.field3101 = 122;
        }
        return this.field3112;
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class216(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, false, (byte) 0);
        this.field3113 = arg0;
        this.field3110 = arg1 + arg2;
        int var12 = class209.method1486(this.field3113, 11).field2078;
        if (~var12 == 0) {
            this.field3104 = true;
        } else {
            this.field3104 = false;
            this.field3103 = class110.method671(-21965, var12);
        }
        if (~this.field3110 == ~arg2) {
            class47.method311(super.field4463, super.field4466, this.field3101, true, false, this.field3103);
        }
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(B)V")
    public static void method1515(byte arg0) {
        field3120 = null;
        int var1 = -101 % ((44 - arg0) / 52);
        field3121 = null;
        field3118 = null;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lvq;ZLkm;IIBI)V")
    public final void method611(class269 arg0, boolean arg1, class198 arg2, int arg3, int arg4, byte arg5, int arg6) {
        int var8 = -55 % ((12 - arg5) / 40);
        ++field3109;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lvq;B)V")
    public final void method22(class269 arg0, byte arg1) {
        ++field3117;
        if (arg1 < 11) {
            this.field3098 = null;
        }
        class305 var3 = this.method1511(0, 0, arg0);
        if (var3 != null) {
            this.method1513(arg0, var3, 1024);
        }
    }

    static {
        new class349("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.");
        new class349(" joined the channel.", " hat den Chatraum betreten.", " a rejoint le canal.", " entrou no canal.");
        new class349("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
        field3120 = new class349("Prepared sound engine", "Musik-Engine vorbereitet.", "Moteur son préparé", "Mecanismo de som preparado");
    }
}
