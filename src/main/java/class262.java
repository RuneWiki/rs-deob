import java.awt.Canvas;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class262 {

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "Ler;")
    private class157 field3641 = new class157(128);

    @OriginalMember(owner = "client!bl", name = "l", descriptor = "Lns;")
    private class438 field3651;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "I")
    public static int field3640;

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "I")
    public static int field3642;

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "I")
    public static int field3644;

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "I")
    public static int field3645;

    @OriginalMember(owner = "client!bl", name = "g", descriptor = "I")
    public static int field3646;

    @OriginalMember(owner = "client!bl", name = "h", descriptor = "I")
    public static int field3647;

    @OriginalMember(owner = "client!bl", name = "i", descriptor = "I")
    public static int field3648;

    @OriginalMember(owner = "client!bl", name = "j", descriptor = "I")
    public static int field3649;

    @OriginalMember(owner = "client!bl", name = "k", descriptor = "I")
    public static int field3650;

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "Z")
    public static boolean field3643;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lhu;IIILjava/awt/Canvas;Lm;)Lqa;")
    public static final class496 method1686(class469 arg0, int arg1, int arg2, int arg3, Canvas arg4, class373 arg5) {
        if (arg1 != 25) {
            method1690(-119);
        }
        field3649++;
        return new class282(arg2, arg4, arg5, arg3, arg0);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Ljava/awt/Component;BZ)Lan;")
    public static final class126 method1687(Component arg0, byte arg1, boolean arg2) {
        field3650++;
        if (arg1 >= -1) {
            field3643 = false;
        }
        return new class162(arg0, arg2);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(II)V")
    public final void method1688(int arg0, int arg1) {
        if (arg0 != 1) {
            method1692(107, 47, 35, -81);
        }
        field3646++;
        class157 var3 = this.field3641;
        synchronized (this.field3641) {
            this.field3641.method1016(arg1, (byte) 118);
        }
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(II)Lao;")
    public final class362 method1689(int arg0, int arg1) {
        field3645++;
        class157 var3 = this.field3641;
        class362 var4;
        synchronized (this.field3641) {
            var4 = (class362) this.field3641.method1013((long) arg0, (byte) -106);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field3651.method2650(arg0, -41, 1);
        int var6 = -127 % ((34 - arg1) / 49);
        class362 var7 = new class362();
        if (var5 != null) {
            var7.method2287(new class91(var5), -1);
        }
        class157 var8 = this.field3641;
        synchronized (this.field3641) {
            this.field3641.method1012(-83, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)V")
    public static final void method1690(int arg0) {
        class524.method3106(arg0, (byte) 86);
        field3648++;
        class332.method2141((byte) 3);
        System.gc();
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(B)V")
    public final void method1691(byte arg0) {
        if (arg0 < 25) {
            return;
        }
        class157 var2 = this.field3641;
        synchronized (this.field3641) {
            this.field3641.method1022((byte) -34);
        }
        field3640++;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIII)V")
    public static final void method1692(int arg0, int arg1, int arg2, int arg3) {
        field3642++;
        int var4 = 11 % ((-arg0 - 80) / 46);
        class20 var5 = class98.field1415[arg2][arg3];
        class97.method668(var5 == null ? class202.field2840 : var5, (byte) 122, arg1);
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(B)V")
    public final void method1693(byte arg0) {
        field3644++;
        class157 var2 = this.field3641;
        synchronized (this.field3641) {
            this.field3641.method1015((byte) 91);
            if (arg0 < 109) {
                method1686(null, 46, 30, -116, null, null);
            }
        }
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(Lgo;ILns;)V")
    public class262(class331 arg0, int arg1, class438 arg2) {
        this.field3651 = arg2;
        this.field3651.method2645(1, 1);
    }
}
