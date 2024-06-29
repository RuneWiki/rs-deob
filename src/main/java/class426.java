import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public class class426 extends class502 {

    @OriginalMember(owner = "client!ns", name = "l", descriptor = "Lv;")
    public static class606 field5815 = null;

    @OriginalMember(owner = "client!ns", name = "q", descriptor = "I")
    public static int field5820 = 0;

    @OriginalMember(owner = "client!ns", name = "j", descriptor = "Lwg;")
    public static class450 field5813 = new class450(12, 0, 1, 0);

    @OriginalMember(owner = "client!ns", name = "t", descriptor = "I")
    public static int field5823 = 0;

    @OriginalMember(owner = "client!ns", name = "i", descriptor = "I")
    public static int field5812;

    @OriginalMember(owner = "client!ns", name = "k", descriptor = "I")
    public static int field5814;

    @OriginalMember(owner = "client!ns", name = "m", descriptor = "I")
    public static int field5816;

    @OriginalMember(owner = "client!ns", name = "n", descriptor = "I")
    public static int field5817;

    @OriginalMember(owner = "client!ns", name = "o", descriptor = "I")
    public static int field5818;

    @OriginalMember(owner = "client!ns", name = "p", descriptor = "I")
    public static int field5819;

    @OriginalMember(owner = "client!ns", name = "r", descriptor = "I")
    public static int field5821;

    @OriginalMember(owner = "client!ns", name = "s", descriptor = "I")
    public static int field5822;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Z)V")
    public final void method58(boolean arg0) {
        if (super.field6863.field6725.method3781((byte) -88) && !class357.method2201(super.field6863.field6725.method3784((byte) 118), 5)) {
            super.field6865 = 0;
        }
        if (!arg0) {
            this.method55(119);
        }
        ++field5814;
        if (~super.field6865 > -1 || super.field6865 > 2) {
            super.field6865 = this.method55(-2);
        }
    }

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(I)V")
    public static final void method2508(int arg0) {
        for (class704 var1 = (class704) class307.field4212.method1591((byte) 88); var1 != null; var1 = (class704) class307.field4212.method1591((byte) 93)) {
            class427.method2513(false, var1);
        }
        ++field5816;
        int var2;
        int var3;
        if (~class111.field1911.field6734.method3639((byte) 99) == -2) {
            var2 = 3;
            var3 = 0;
        } else {
            var2 = field5820;
            var3 = field5820;
        }
        client.method2009();
        if (arg0 != -2963) {
            method2508(-42);
        }
        for (int var4 = var3; var2 >= var4; ++var4) {
            client.method2006();
            client.method2025(var4);
            client.method2014(var4);
        }
        client.method2015();
        client.method2026();
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(II)I")
    public final int method57(int arg0, int arg1) {
        ++field5812;
        if (arg1 != 0) {
            field5820 = -71;
        }
        return !class357.method2201(super.field6863.field6725.method3784((byte) 69), 5) ? 3 : 1;
    }

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "(I)Z")
    public final boolean method2509(int arg0) {
        if (arg0 != 0) {
            return false;
        } else {
            ++field5821;
            return class357.method2201(super.field6863.field6725.method3784((byte) 100), 5);
        }
    }

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(Z)V")
    public static void method2510(boolean arg0) {
        field5815 = null;
        if (arg0) {
            field5815 = null;
        }
        field5813 = null;
    }

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "(B)I")
    public final int method2511(byte arg0) {
        ++field5822;
        if (arg0 < 49) {
            this.method57(102, -111);
        }
        return super.field6865;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Ljava/awt/Canvas;IIB)Lhf;")
    public static final class418 method2512(Canvas arg0, int arg1, int arg2, byte arg3) {
        ++field5818;
        try {
            Class var4 = Class.forName("qf");
            if (arg3 != -10) {
                field5820 = 110;
            }
            class418 var5 = (class418) var4.newInstance();
            var5.method2462(arg2, arg0, 18872, arg1);
            return var5;
        } catch (Throwable var7) {
            class609 var6 = new class609();
            var6.method2462(arg2, arg0, 18872, arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "(II)V")
    public final void method52(int arg0, int arg1) {
        ++field5817;
        super.field6865 = arg0;
        if (arg1 != 0) {
            field5813 = null;
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)I")
    public final int method55(int arg0) {
        ++field5819;
        if (arg0 != -2) {
            this.method52(108, -16);
        }
        return 0;
    }

    @OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(Leka;)V")
    public class426(class492 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(ILeka;)V")
    public class426(int arg0, class492 arg1) {
        super(arg0, arg1);
    }
}
