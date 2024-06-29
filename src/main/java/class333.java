import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public class class333 {

    @OriginalMember(owner = "client!pp", name = "i", descriptor = "Lhp;")
    private class277 field4794 = new class277(64);

    @OriginalMember(owner = "client!pp", name = "j", descriptor = "I")
    public int field4795 = 0;

    @OriginalMember(owner = "client!pp", name = "d", descriptor = "Lkea;")
    private class203 field4789;

    @OriginalMember(owner = "client!pp", name = "f", descriptor = "I")
    public int field4791;

    @OriginalMember(owner = "client!pp", name = "c", descriptor = "Lea;")
    public static class474 field4788 = new class474("Loaded HW3D", "HW3D geladen", "HW3D chargé", "HW3D carregado");

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "I")
    public static int field4786;

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "I")
    public static int field4787;

    @OriginalMember(owner = "client!pp", name = "e", descriptor = "I")
    public static int field4790;

    @OriginalMember(owner = "client!pp", name = "g", descriptor = "I")
    public static int field4792;

    @OriginalMember(owner = "client!pp", name = "h", descriptor = "I")
    public static int field4793;

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(II)V")
    public final void method2163(int arg0, int arg1) {
        field4786++;
        class277 var3 = this.field4794;
        synchronized (this.field4794) {
            this.field4794.method1811((byte) -25, arg0);
        }
        if (arg1 != -21515) {
            method2166(-73);
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(ZI)Lqba;")
    public final class346 method2164(boolean arg0, int arg1) {
        field4790++;
        class277 var3 = this.field4794;
        class346 var4;
        synchronized (this.field4794) {
            var4 = (class346) this.field4794.method1801(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class203 var5 = this.field4789;
        byte[] var7;
        synchronized (this.field4789) {
            if (!arg0) {
                return null;
            }
            var7 = this.field4789.method1286(arg1, 4, (byte) -49);
        }
        class346 var8 = new class346();
        var8.field4956 = this;
        var8.field4963 = arg1;
        if (var7 != null) {
            var8.method2217(-7463, new class194(var7));
        }
        var8.method2216((byte) -33);
        class277 var9 = this.field4794;
        synchronized (this.field4794) {
            this.field4794.method1808((long) arg1, var8, (byte) -89);
            return var8;
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(B)I")
    public static final int method2165(byte arg0) {
        field4793++;
        class605 var1 = class413.field6264;
        boolean var2 = false;
        if (class81.field908 != 0) {
            Canvas var3 = new Canvas();
            var3.setSize(100, 100);
            var1 = class605.method3526(0, (byte) -63, 0, null, var3, null);
            var2 = true;
        }
        if (arg0 != 46) {
            return 44;
        }
        long var4 = class84.method550((byte) -108);
        for (int var6 = 0; var6 < 10000; var6++) {
            var1.method294(5, 10, 75, 50, 15, 90, -65536, -65536, -65536, 1);
        }
        int var7 = (int) (class84.method550((byte) -119) - var4);
        var1.method3524(100, 0, (byte) 92, -16777216, 100, 0);
        if (var2) {
            var1.method3522(16384);
        }
        return var7;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(I)V")
    public static void method2166(int arg0) {
        if (arg0 == 24207) {
            field4788 = null;
        }
    }

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "(I)V")
    public final void method2167(int arg0) {
        field4787++;
        class277 var2 = this.field4794;
        synchronized (this.field4794) {
            this.field4794.method1805(-127);
            if (arg0 != 90) {
                this.method2168(97);
            }
        }
    }

    @OriginalMember(owner = "client!pp", name = "c", descriptor = "(I)V")
    public final void method2168(int arg0) {
        field4792++;
        class277 var2 = this.field4794;
        synchronized (this.field4794) {
            this.field4794.method1810(false);
            if (arg0 != -22641) {
                this.field4791 = -34;
            }
        }
    }

    @OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Lcda;ILkea;)V")
    public class333(class149 arg0, int arg1, class203 arg2) {
        this.field4789 = arg2;
        this.field4791 = this.field4789.method1309(1675886592, 4);
    }
}
