import java.awt.Canvas;
import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class213 {

    @OriginalMember(owner = "client!vn", name = "g", descriptor = "Laq;")
    private class494 field3127 = new class494(64);

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "Lgga;")
    private class513 field3121;

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "I")
    public static int field3123 = 0;

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "I")
    public static int field3122;

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "I")
    public static int field3124;

    @OriginalMember(owner = "client!vn", name = "e", descriptor = "I")
    public static int field3125;

    @OriginalMember(owner = "client!vn", name = "f", descriptor = "I")
    public static int field3126;

    @OriginalMember(owner = "client!vn", name = "i", descriptor = "I")
    public static int field3129;

    @OriginalMember(owner = "client!vn", name = "j", descriptor = "I")
    public static int field3130;

    @OriginalMember(owner = "client!vn", name = "h", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field3128;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)V")
    public final void method1470(int arg0) {
        class494 var2 = this.field3127;
        synchronized (this.field3127) {
            this.field3127.method2881((byte) -10);
            if (arg0 >= -42) {
                this.field3121 = null;
            }
        }
        field3124++;
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(I)V")
    public static void method1471(int arg0) {
        field3128 = null;
        if (arg0 != 10) {
            field3130 = -15;
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(ZJZI)Ljava/lang/String;")
    public static final String method1472(boolean arg0, long arg1, boolean arg2, int arg3) {
        field3122++;
        if (arg0) {
            method1471(-101);
        }
        Calendar var5;
        if (arg2) {
            class765.method4230(2, arg1);
            var5 = class99.field1438;
        } else {
            class724.method4017((byte) 127, arg1);
            var5 = class99.field1449;
        }
        int var6 = var5.get(5);
        int var7 = var5.get(2);
        int var8 = var5.get(1);
        int var9 = var5.get(11);
        int var10 = var5.get(12);
        return arg3 == 3 ? class168.method1247(arg3, 10, arg1, arg2) : Integer.toString(var6 / 10) + var6 % 10 + "-" + class25.field276[arg3][var7] + "-" + var8 + " " + var9 / 10 + var9 % 10 + ":" + var10 / 10 + var10 % 10;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(B)V")
    public final void method1473(byte arg0) {
        if (arg0 > -21) {
            field3123 = 37;
        }
        field3129++;
        class494 var2 = this.field3127;
        synchronized (this.field3127) {
            this.field3127.method2893((byte) 76);
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IZ)V")
    public final void method1474(int arg0, boolean arg1) {
        class494 var3 = this.field3127;
        synchronized (this.field3127) {
            this.field3127.method2888(arg0, 116);
        }
        if (!arg1) {
            method1471(-121);
        }
        field3126++;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(II)Lcaa;")
    public final class603 method1475(int arg0, int arg1) {
        field3125++;
        class494 var3 = this.field3127;
        class603 var4;
        synchronized (this.field3127) {
            var4 = (class603) this.field3127.method2882((long) arg0, (byte) -45);
        }
        if (var4 != null) {
            return var4;
        } else if (arg1 == 26754) {
            class513 var5 = this.field3121;
            byte[] var6;
            synchronized (this.field3121) {
                var6 = this.field3121.method3019(31, arg0, arg1 - 26674);
            }
            class603 var7 = new class603();
            if (var6 != null) {
                var7.method3502(new class431(var6), 0);
            }
            class494 var8 = this.field3127;
            synchronized (this.field3127) {
                this.field3127.method2890(-7307, (long) arg0, var7);
                return var7;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(Lmca;ILgga;)V")
    public class213(class41 arg0, int arg1, class513 arg2) {
        this.field3121 = arg2;
        this.field3121.method3007(-1, 31);
    }
}
