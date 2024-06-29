import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class552 {

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "Lqj;")
    private class535 field7623 = new class535(64);

    @OriginalMember(owner = "client!lh", name = "k", descriptor = "Lqj;")
    public class535 field7626 = new class535(64);

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "Luq;")
    public class172 field7622;

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "Luq;")
    private class172 field7618;

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "I")
    public static int field7620 = 1;

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "I")
    public static int field7619 = -1;

    @OriginalMember(owner = "client!lh", name = "m", descriptor = "[Lbea;")
    public static class236[] field7628 = new class236[14];

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "I")
    public static int field7617 = 0;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "I")
    public static int field7616;

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "I")
    public static int field7621;

    @OriginalMember(owner = "client!lh", name = "j", descriptor = "I")
    public static int field7625;

    @OriginalMember(owner = "client!lh", name = "l", descriptor = "I")
    public static int field7627;

    @OriginalMember(owner = "client!lh", name = "n", descriptor = "I")
    public static int field7629;

    @OriginalMember(owner = "client!lh", name = "i", descriptor = "Ljava/applet/Applet;")
    public static Applet field7624;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V")
    public final void method3174(int arg0) {
        field7625++;
        class535 var2 = this.field7623;
        synchronized (this.field7623) {
            this.field7623.method3103(arg0 ^ 0x1BCE);
        }
        class535 var3 = this.field7626;
        synchronized (this.field7626) {
            this.field7626.method3103(-11294);
            if (arg0 != -14292) {
                this.method3175(-45, -103);
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)V")
    public final void method3175(int arg0, int arg1) {
        class535 var3 = this.field7623;
        synchronized (this.field7623) {
            this.field7623.method3101(false, arg0);
        }
        if (arg1 != 34) {
            return;
        }
        field7629++;
        class535 var4 = this.field7626;
        synchronized (this.field7626) {
            this.field7626.method3101(false, arg0);
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(BI)Lnea;")
    public final class742 method3176(byte arg0, int arg1) {
        if (arg0 != -125) {
            return null;
        }
        field7616++;
        class535 var3 = this.field7623;
        class742 var4;
        synchronized (this.field7623) {
            var4 = (class742) this.field7623.method3109((byte) 123, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class172 var5 = this.field7618;
        byte[] var6;
        synchronized (this.field7618) {
            var6 = this.field7618.method1188(34, -18047, arg1);
        }
        class742 var7 = new class742();
        var7.field10044 = this;
        if (var6 != null) {
            var7.method4076(new class254(var6), arg0 + 649239309);
        }
        class535 var8 = this.field7623;
        synchronized (this.field7623) {
            this.field7623.method3108((long) arg1, 16337, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)V")
    public final void method3177(int arg0) {
        field7621++;
        class535 var2 = this.field7623;
        synchronized (this.field7623) {
            this.field7623.method3113(-128);
        }
        if (arg0 != 14) {
            field7617 = -28;
        }
        class535 var3 = this.field7626;
        synchronized (this.field7626) {
            this.field7626.method3113(-128);
        }
    }

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "(I)V")
    public static void method3178(int arg0) {
        field7628 = null;
        if (arg0 != 34) {
            method3178(-55);
        }
        field7624 = null;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(III)V")
    public final void method3179(int arg0, int arg1, int arg2) {
        field7627++;
        this.field7623 = new class535(arg2);
        this.field7626 = new class535(arg1);
        if (arg0 != 34) {
            field7620 = 85;
        }
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(Lkw;ILuq;Luq;)V")
    public class552(class263 arg0, int arg1, class172 arg2, class172 arg3) {
        this.field7622 = arg3;
        this.field7618 = arg2;
        this.field7618.method1175(34, (byte) 81);
    }
}
