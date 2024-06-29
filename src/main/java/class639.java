import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class639 {

    @OriginalMember(owner = "client!te", name = "g", descriptor = "Lqj;")
    private class535 field8608 = new class535(64);

    @OriginalMember(owner = "client!te", name = "c", descriptor = "Luq;")
    private class172 field8604;

    @OriginalMember(owner = "client!te", name = "k", descriptor = "I")
    public static int field8612 = -1;

    @OriginalMember(owner = "client!te", name = "d", descriptor = "Led;")
    public static class732 field8605 = new class732(9, 0, 4, 1);

    @OriginalMember(owner = "client!te", name = "a", descriptor = "I")
    public static int field8602;

    @OriginalMember(owner = "client!te", name = "f", descriptor = "I")
    public static int field8607;

    @OriginalMember(owner = "client!te", name = "h", descriptor = "I")
    public static int field8609;

    @OriginalMember(owner = "client!te", name = "i", descriptor = "I")
    public static int field8610;

    @OriginalMember(owner = "client!te", name = "j", descriptor = "I")
    public static int field8611;

    @OriginalMember(owner = "client!te", name = "e", descriptor = "Ljava/awt/Frame;")
    public static Frame field8606;

    @OriginalMember(owner = "client!te", name = "b", descriptor = "[I")
    public static int[] field8603;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(II)Lpga;", line = 7)
    public final class560 method3515(int arg0, int arg1) {
        field8610++;
        class535 var3 = this.field8608;
        class560 var4;
        synchronized (this.field8608) {
            var4 = (class560) this.field8608.method3109((byte) 119, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class172 var5 = this.field8604;
        byte[] var6;
        synchronized (this.field8604) {
            var6 = this.field8604.method1188(11, -18047, arg0);
        }
        if (arg1 != 0) {
            this.method3520(-120);
        }
        class560 var7 = new class560();
        if (var6 != null) {
            var7.method3198((byte) 17, new class254(var6));
        }
        class535 var8 = this.field8608;
        synchronized (this.field8608) {
            this.field8608.method3108((long) arg0, 16337, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(II)V", line = 38)
    public final void method3516(int arg0, int arg1) {
        class535 var3 = this.field8608;
        synchronized (this.field8608) {
            if (arg1 != -22933) {
                method3519(-119);
            }
            this.field8608.method3101(false, arg0);
        }
        field8609++;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V", line = 52)
    public static final void method3517(int arg0) {
        field8602++;
        if (arg0 != 2358) {
            return;
        }
        for (class608 var1 = (class608) class398.field5706.method679((byte) -86); var1 != null; var1 = (class608) class398.field5706.method681(-67)) {
            class171.method1156(arg0 - 28594, false, var1);
        }
        for (class608 var2 = (class608) class518.field7196.method679((byte) -86); var2 != null; var2 = (class608) class518.field7196.method681(-85)) {
            class171.method1156(-26236, true, var2);
        }
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(I)V", line = 77)
    public final void method3518(int arg0) {
        if (arg0 != -30244) {
            field8603 = null;
        }
        class535 var2 = this.field8608;
        synchronized (this.field8608) {
            this.field8608.method3103(-11294);
        }
        field8607++;
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(I)V", line = 92)
    public static void method3519(int arg0) {
        field8606 = null;
        field8605 = null;
        if (arg0 != 11) {
            method3517(11);
        }
        field8603 = null;
    }

    @OriginalMember(owner = "client!te", name = "d", descriptor = "(I)V", line = 111)
    public final void method3520(int arg0) {
        field8611++;
        class535 var2 = this.field8608;
        synchronized (this.field8608) {
            this.field8608.method3113(-127);
            int var3 = 97 % ((arg0 - 41) / 35);
        }
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Lkw;ILuq;)V", line = 132)
    public class639(class263 arg0, int arg1, class172 arg2) {
        this.field8604 = arg2;
        if (this.field8604 != null) {
            this.field8604.method1175(11, (byte) 115);
        }
    }
}
