import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class80 {

    @OriginalMember(owner = "client!m", name = "k", descriptor = "Lka;")
    private class473 field1134 = new class473(128);

    @OriginalMember(owner = "client!m", name = "g", descriptor = "Ldk;")
    private class421 field1130;

    @OriginalMember(owner = "client!m", name = "e", descriptor = "[Lsq;")
    public static class363[] field1128 = new class363[16];

    @OriginalMember(owner = "client!m", name = "f", descriptor = "I")
    public static int field1129 = 0;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "I")
    public static int field1124;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "I")
    public static int field1125;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "I")
    public static int field1126;

    @OriginalMember(owner = "client!m", name = "h", descriptor = "I")
    public static int field1131;

    @OriginalMember(owner = "client!m", name = "i", descriptor = "I")
    public static int field1132;

    @OriginalMember(owner = "client!m", name = "d", descriptor = "Lkt;")
    public static class61 field1127;

    @OriginalMember(owner = "client!m", name = "j", descriptor = "[I")
    public static int[] field1133;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V")
    public final void method614(int arg0) {
        field1125++;
        class473 var2 = this.field1134;
        synchronized (this.field1134) {
            if (arg0 != 0) {
                this.method618(-48);
            }
            this.field1134.method2764(-769);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(B)V")
    public static void method615(byte arg0) {
        field1133 = null;
        if (arg0 < -18) {
            field1128 = null;
            field1127 = null;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(II)V")
    public final void method616(int arg0, int arg1) {
        field1132++;
        if (arg0 < 120) {
            this.field1134 = null;
        }
        class473 var3 = this.field1134;
        synchronized (this.field1134) {
            this.field1134.method2779(14896, arg1);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ILjava/awt/Component;)Lqn;")
    public static final class436 method617(int arg0, Component arg1) {
        field1126++;
        return arg0 == 1 ? new class494(arg1) : null;
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(I)V")
    public final void method618(int arg0) {
        if (arg0 != 0) {
            field1129 = -21;
        }
        field1124++;
        class473 var2 = this.field1134;
        synchronized (this.field1134) {
            this.field1134.method2774((byte) 118);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IB)Lwm;")
    public final class479 method619(int arg0, byte arg1) {
        field1131++;
        class473 var3 = this.field1134;
        class479 var4;
        synchronized (this.field1134) {
            var4 = (class479) this.field1134.method2767((long) arg0, 0);
            if (arg1 > -37) {
                field1128 = null;
            }
        }
        if (var4 != null) {
            return var4;
        }
        class421 var5 = this.field1130;
        byte[] var6;
        synchronized (this.field1130) {
            var6 = this.field1130.method2512(1, (byte) -93, arg0);
        }
        class479 var7 = new class479();
        if (var6 != null) {
            var7.method2840((byte) 48, new class319(var6));
        }
        class473 var8 = this.field1134;
        synchronized (this.field1134) {
            this.field1134.method2777(-1025, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Lad;ILdk;)V")
    public class80(class12 arg0, int arg1, class421 arg2) {
        this.field1130 = arg2;
        this.field1130.method2509(0, 1);
    }
}
