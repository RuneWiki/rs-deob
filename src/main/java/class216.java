import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qu")
public class class216 extends class56 implements class92 {

    @OriginalMember(owner = "client!qu", name = "i", descriptor = "I")
    private int field3760;

    @OriginalMember(owner = "client!qu", name = "l", descriptor = "Z")
    public static boolean field3763 = false;

    @OriginalMember(owner = "client!qu", name = "g", descriptor = "Lvv;")
    public static class313 field3758 = new class313(2, -2);

    @OriginalMember(owner = "client!qu", name = "n", descriptor = "Lpu;")
    public static class411 field3765 = new class411();

    @OriginalMember(owner = "client!qu", name = "o", descriptor = "Lvv;")
    public static class313 field3766 = new class313(102, 7);

    @OriginalMember(owner = "client!qu", name = "p", descriptor = "Lvv;")
    public static class313 field3767;

    @OriginalMember(owner = "client!qu", name = "q", descriptor = "Ldw;")
    public static class403 field3768;

    @OriginalMember(owner = "client!qu", name = "c", descriptor = "I")
    public static int field3754;

    @OriginalMember(owner = "client!qu", name = "d", descriptor = "I")
    public static int field3755;

    @OriginalMember(owner = "client!qu", name = "e", descriptor = "I")
    public static int field3756;

    @OriginalMember(owner = "client!qu", name = "f", descriptor = "I")
    public static int field3757;

    @OriginalMember(owner = "client!qu", name = "h", descriptor = "I")
    public static int field3759;

    @OriginalMember(owner = "client!qu", name = "j", descriptor = "I")
    public static int field3761;

    @OriginalMember(owner = "client!qu", name = "k", descriptor = "I")
    public static int field3762;

    @OriginalMember(owner = "client!qu", name = "m", descriptor = "I")
    public static int field3764;

    static {
        new class306("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d'être déconnecté(e) de votre canal précédent.", "Aguarde até se desconectar do canal anterior.");
        field3767 = new class313(5, 12);
        field3768 = new class403("", 13);
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(BI)V", line = 6)
    public static final void method1493(byte arg0, int arg1) {
        if (arg0 > -110) {
            field3763 = true;
        }
        ++field3756;
        class231 var2 = class322.field5060;
        synchronized (class322.field5060) {
            class322.field5060.method1603((byte) -109, arg1);
        }
        class231 var3 = class241.field4158;
        synchronized (class241.field4158) {
            class241.field4158.method1603((byte) -109, arg1);
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Ljh;", line = 22)
    public static final class380 method1494(Throwable arg0, String arg1) {
        ++field3757;
        class380 var2;
        if (arg0 instanceof class380) {
            var2 = (class380) arg0;
            var2.field5883 = var2.field5883 + ' ' + arg1;
        } else {
            var2 = new class380(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(B)I", line = 42)
    public final int method517(byte arg0) {
        ++field3759;
        return arg0 > -86 ? -110 : 0;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(ILqs;IB)Lqm;", line = 56)
    public static final class331 method1495(int arg0, class496 arg1, int arg2, byte arg3) {
        if (arg3 > -32) {
            field3766 = null;
        }
        ++field3762;
        byte[] var4 = arg1.method2926(arg0, -81, arg2);
        return var4 == null ? null : new class331(var4);
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(I)I", line = 74)
    public final int method514(int arg0) {
        ++field3761;
        if (arg0 != -10228) {
            field3768 = null;
        }
        return this.field3760;
    }

    @OriginalMember(owner = "client!qu", name = "<init>", descriptor = "(Lih;ILjaggl/memory/NativeBuffer;)V", line = 85)
    public class216(class214 arg0, int arg1, NativeBuffer arg2) {
        super(arg0, arg2);
        this.field3760 = arg1;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(Z)J", line = 94)
    public final long method512(boolean arg0) {
        if (arg0) {
            field3768 = null;
        }
        ++field3764;
        return super.field893.method94();
    }

    @OriginalMember(owner = "client!qu", name = "<init>", descriptor = "(Lih;I[BI)V", line = 105)
    public class216(class214 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field3760 = arg1;
    }

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "(B)V", line = 113)
    public static void method1496(byte arg0) {
        field3765 = null;
        field3766 = null;
        field3758 = null;
        field3768 = null;
        field3767 = null;
        if (arg0 != 111) {
            field3768 = null;
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(B[BII)V", line = 128)
    public final void method516(byte arg0, byte[] arg1, int arg2, int arg3) {
        this.method389(arg1, arg2);
        ++field3754;
        int var5 = -122 / ((arg0 - -64) / 32);
        this.field3760 = arg3;
    }
}
