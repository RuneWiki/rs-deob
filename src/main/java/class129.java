import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class129 {

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "Lqj;")
    private class535 field1773 = new class535(64);

    @OriginalMember(owner = "client!jj", name = "k", descriptor = "Lqj;")
    public class535 field1779 = new class535(60);

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "Luq;")
    private class172 field1770;

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "Luq;")
    public class172 field1772;

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "Led;")
    public static class732 field1776 = new class732(13, 0, 1, 0);

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "I")
    public static int field1769;

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "I")
    public static int field1771;

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "I")
    public static int field1774;

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "I")
    public static int field1775;

    @OriginalMember(owner = "client!jj", name = "i", descriptor = "I")
    public static int field1777;

    @OriginalMember(owner = "client!jj", name = "l", descriptor = "I")
    public static int field1780;

    @OriginalMember(owner = "client!jj", name = "m", descriptor = "I")
    public static int field1781;

    @OriginalMember(owner = "client!jj", name = "n", descriptor = "I")
    public int field1782;

    @OriginalMember(owner = "client!jj", name = "j", descriptor = "Lbr;")
    public static class414 field1778;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(B)V")
    public final void method911(byte arg0) {
        class535 var2 = this.field1773;
        synchronized (this.field1773) {
            this.field1773.method3103(-11294);
            if (arg0 != 95) {
                this.field1772 = null;
            }
        }
        field1771++;
        class535 var3 = this.field1779;
        synchronized (this.field1779) {
            this.field1779.method3103(-11294);
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V")
    public final void method912(int arg0) {
        class535 var2 = this.field1773;
        synchronized (this.field1773) {
            this.field1773.method3113(-128);
        }
        field1777++;
        class535 var3 = this.field1779;
        synchronized (this.field1779) {
            this.field1779.method3113(-128);
        }
        if (arg0 >= -70) {
            method914(-123, 29, 44, 95, -52);
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Z)Lir;")
    public static final class28 method913(boolean arg0) {
        field1774++;
        if (!arg0) {
            field1778 = null;
        }
        try {
            return (class28) Class.forName("dq").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIII)V")
    public static final void method914(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != 60) {
            return;
        }
        if (arg4 < arg0) {
            class464.method2733(arg2, arg4, arg0, -22816, class228.field2951[arg1]);
        } else {
            class464.method2733(arg2, arg0, arg4, -22816, class228.field2951[arg1]);
        }
        field1781++;
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(B)V")
    public static void method915(byte arg0) {
        int var1 = -45 / ((16 - arg0) / 48);
        field1776 = null;
        field1778 = null;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)V")
    public final void method916(int arg0, int arg1) {
        this.field1782 = arg0;
        if (arg1 != 21439) {
            return;
        }
        field1780++;
        class535 var3 = this.field1779;
        synchronized (this.field1779) {
            this.field1779.method3103(arg1 ^ 0xFFFF805D);
        }
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(II)V")
    public final void method917(int arg0, int arg1) {
        if (arg1 > -36) {
            method913(false);
        }
        field1769++;
        class535 var3 = this.field1773;
        synchronized (this.field1773) {
            this.field1773.method3101(false, arg0);
        }
        class535 var4 = this.field1779;
        synchronized (this.field1779) {
            this.field1779.method3101(false, arg0);
        }
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Lkw;ILuq;Luq;)V")
    public class129(class263 arg0, int arg1, class172 arg2, class172 arg3) {
        this.field1770 = arg2;
        this.field1772 = arg3;
        int var5 = this.field1770.method1193(true) - 1;
        this.field1770.method1175(var5, (byte) 124);
    }

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "(II)Lel;")
    public final class573 method918(int arg0, int arg1) {
        field1775++;
        class535 var3 = this.field1773;
        class573 var4;
        synchronized (this.field1773) {
            var4 = (class573) this.field1773.method3109((byte) 112, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg1 != 64) {
            this.field1772 = null;
        }
        class172 var5 = this.field1770;
        byte[] var6;
        synchronized (this.field1770) {
            var6 = this.field1770.method1188(class111.method828(-94, arg0), -18047, class222.method1414(true, arg0));
        }
        class573 var7 = new class573();
        var7.field7803 = arg0;
        var7.field7805 = this;
        if (var6 != null) {
            var7.method3254(new class254(var6), true);
        }
        class535 var8 = this.field1773;
        synchronized (this.field1773) {
            this.field1773.method3108((long) arg0, arg1 ^ 0x3F91, var7);
            return var7;
        }
    }
}
