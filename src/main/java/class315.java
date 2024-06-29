import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gaa")
public class class315 {

    @OriginalMember(owner = "client!gaa", name = "d", descriptor = "Lpja;")
    private class43 field4307 = new class43(256);

    @OriginalMember(owner = "client!gaa", name = "k", descriptor = "Ld;")
    private class162 field4314;

    @OriginalMember(owner = "client!gaa", name = "f", descriptor = "Lhk;")
    private class111 field4309;

    @OriginalMember(owner = "client!gaa", name = "e", descriptor = "Lfja;")
    public static class783 field4308 = new class783(78, 4);

    @OriginalMember(owner = "client!gaa", name = "i", descriptor = "I")
    public static int field4312 = -2;

    @OriginalMember(owner = "client!gaa", name = "j", descriptor = "I")
    public static int field4313 = 0;

    @OriginalMember(owner = "client!gaa", name = "l", descriptor = "[I")
    public static int[] field4315 = new int[25];

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "I")
    public static int field4304;

    @OriginalMember(owner = "client!gaa", name = "b", descriptor = "I")
    public static int field4305;

    @OriginalMember(owner = "client!gaa", name = "c", descriptor = "I")
    public static int field4306;

    @OriginalMember(owner = "client!gaa", name = "g", descriptor = "I")
    public static int field4310;

    @OriginalMember(owner = "client!gaa", name = "h", descriptor = "I")
    public static int field4311;

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(III)Z")
    public static final boolean method1988(int arg0, int arg1, int arg2) {
        int var3 = -49 % ((11 - arg2) / 59);
        field4310++;
        return class586.method3370(arg1, arg0, (byte) 67) || class104.method895(arg1, arg0, 0);
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ILjava/awt/Frame;Llu;)V")
    public static final void method1989(int arg0, Frame arg1, class742 arg2) {
        while (true) {
            class545 var3 = arg2.method4115((byte) -112, arg1);
            while (var3.field7412 == 0) {
                class643.method3577(10L, 0);
            }
            if (var3.field7412 == 1) {
                field4306++;
                arg1.setVisible(false);
                if (arg0 != 1) {
                    field4315 = null;
                }
                arg1.dispose();
                return;
            }
            class643.method3577(100L, arg0 - 1);
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(I)V")
    public final void method1990(int arg0) {
        if (arg0 != -1) {
            method1988(7, 45, 21);
        }
        field4304++;
        this.field4307.method265(5, -70);
    }

    @OriginalMember(owner = "client!gaa", name = "b", descriptor = "(I)V")
    public final void method1991(int arg0) {
        this.field4307.method273(-11);
        field4311++;
        if (arg0 != 64) {
            this.method1990(90);
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(B)V")
    public static void method1992(byte arg0) {
        field4308 = null;
        if (arg0 == 23) {
            field4315 = null;
        }
    }

    @OriginalMember(owner = "client!gaa", name = "<init>", descriptor = "(Lhk;Ld;)V")
    public class315(class111 arg0, class162 arg1) {
        this.field4314 = arg1;
        this.field4309 = arg0;
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(BI)Lkf;")
    public final class268 method1993(byte arg0, int arg1) {
        field4305++;
        Object var3 = this.field4307.method266((byte) -102, (long) arg1);
        if (var3 != null) {
            return (class268) var3;
        } else if (this.field4314.method1274(arg1, 21532)) {
            if (arg0 < 17) {
                this.field4309 = null;
            }
            class311 var4 = this.field4314.method1270(arg1, true);
            int var5 = var4.field4248 ? 64 : this.field4309.field1928;
            class268 var7;
            if (var4.field4232 && this.field4309.method577()) {
                float[] var6 = this.field4314.method1273(arg1, (byte) 80, false, var5, 0.7F, var5);
                var7 = new class268(this.field4309, 3553, 34842, var5, var5, var4.field4238 != 0, var6, 6408);
            } else {
                int[] var8;
                if (var4.field4242 != 2 && class500.method2864(7, var4.field4250)) {
                    var8 = this.field4314.method1269(0.7F, var5, true, arg1, var5, true);
                } else {
                    var8 = this.field4314.method1272(var5, arg1, 0.7F, var5, (byte) 81, false);
                }
                var7 = new class268(this.field4309, 3553, 6408, var5, var5, var4.field4238 != 0, var8, 0, 0, false);
            }
            var7.method1742(35, var4.field4235, var4.field4253);
            this.field4307.method270(var7, (long) arg1, -127);
            return var7;
        } else {
            return null;
        }
    }
}
