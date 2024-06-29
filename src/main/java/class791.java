import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public class class791 {

    @OriginalMember(owner = "client!ms", name = "e", descriptor = "Lqj;")
    private class535 field10857 = new class535(64);

    @OriginalMember(owner = "client!ms", name = "d", descriptor = "Luq;")
    private class172 field10856;

    @OriginalMember(owner = "client!ms", name = "c", descriptor = "I")
    public int field10855;

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "Ljb;")
    public static class519 field10854 = new class519(92, 4);

    @OriginalMember(owner = "client!ms", name = "f", descriptor = "S")
    public static short field10858 = 1;

    @OriginalMember(owner = "client!ms", name = "i", descriptor = "Ljava/util/Calendar;")
    public static Calendar field10861 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "I")
    public static int field10853;

    @OriginalMember(owner = "client!ms", name = "g", descriptor = "I")
    public static int field10859;

    @OriginalMember(owner = "client!ms", name = "h", descriptor = "I")
    public static int field10860;

    @OriginalMember(owner = "client!ms", name = "k", descriptor = "I")
    public static int field10863;

    @OriginalMember(owner = "client!ms", name = "l", descriptor = "I")
    public static int field10864;

    @OriginalMember(owner = "client!ms", name = "m", descriptor = "I")
    public static int field10865;

    @OriginalMember(owner = "client!ms", name = "j", descriptor = "Ljava/lang/Thread;")
    public static Thread field10862;

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(II)V")
    public final void method4320(int arg0, int arg1) {
        field10863++;
        class535 var3 = this.field10857;
        synchronized (this.field10857) {
            if (arg0 != 16) {
                field10861 = null;
            }
            this.field10857.method3101(false, arg1);
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(I)V")
    public static void method4321(int arg0) {
        field10854 = null;
        field10862 = null;
        field10861 = null;
        int var1 = -128 / ((-arg0 - 4) / 61);
    }

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "(I)V")
    public final void method4322(int arg0) {
        field10860++;
        class535 var2 = this.field10857;
        synchronized (this.field10857) {
            this.field10857.method3113(-127);
        }
        int var3 = 24 % ((arg0 - 4) / 48);
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(BI)Lno;")
    public final class729 method4323(byte arg0, int arg1) {
        field10864++;
        class535 var3 = this.field10857;
        class729 var4;
        synchronized (this.field10857) {
            var4 = (class729) this.field10857.method3109((byte) 102, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class172 var5 = this.field10856;
        byte[] var6;
        synchronized (this.field10856) {
            var6 = this.field10856.method1188(16, -18047, arg1);
        }
        class729 var7 = new class729();
        if (arg0 > -92) {
            this.method4320(-95, -65);
        }
        if (var6 != null) {
            var7.method4030(false, new class254(var6));
        }
        class535 var8 = this.field10857;
        synchronized (this.field10857) {
            this.field10857.method3108((long) arg1, 16337, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(IIIIII)V")
    public static final void method4324(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field10865++;
        if (arg1 == arg4) {
            class534.method3099(7682, arg2, arg3, arg1, arg0);
            return;
        }
        if (class297.field4199 <= arg2 - arg1 && class45.field472 >= arg1 + arg2 && arg0 - arg4 >= class291.field4156 && class233.field3099 >= arg0 + arg4) {
            class195.method1285(arg4, arg0, arg1, 5124, arg3, arg2);
        } else {
            class91.method720(arg1, arg3, arg2, arg0, (byte) -121, arg4);
        }
        if (arg5 != 64) {
            field10858 = 16;
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(IIB)Z")
    public static final boolean method4325(int arg0, int arg1, byte arg2) {
        if (arg2 == 104) {
            field10859++;
            return (arg0 & 0x220) == 544 | (arg0 & 0x18) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ms", name = "c", descriptor = "(I)V")
    public final void method4326(int arg0) {
        class535 var2 = this.field10857;
        synchronized (this.field10857) {
            this.field10857.method3103(arg0 + 19757);
        }
        field10853++;
        if (arg0 != -31051) {
            this.method4320(-41, 101);
        }
    }

    @OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(Lkw;ILuq;)V")
    public class791(class263 arg0, int arg1, class172 arg2) {
        this.field10856 = arg2;
        if (this.field10856 == null) {
            this.field10855 = 0;
        } else {
            this.field10855 = this.field10856.method1175(16, (byte) 81);
        }
    }
}
