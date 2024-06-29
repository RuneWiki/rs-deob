import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class415 {

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "Ltb;")
    private class450 field5185 = new class450(16);

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "Lpl;")
    private class612 field5183;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "I")
    public static int field5182 = 2;

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "I")
    public static int field5184;

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "I")
    public static int field5186;

    @OriginalMember(owner = "client!nk", name = "f", descriptor = "I")
    public static int field5187;

    @OriginalMember(owner = "client!nk", name = "h", descriptor = "I")
    public static int field5189;

    @OriginalMember(owner = "client!nk", name = "j", descriptor = "I")
    public static int field5191;

    @OriginalMember(owner = "client!nk", name = "g", descriptor = "Lpl;")
    public static class612 field5188;

    @OriginalMember(owner = "client!nk", name = "i", descriptor = "[Liw;")
    public static class532[] field5190;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)V")
    public final void method2207(byte arg0) {
        class450 var2 = this.field5185;
        synchronized (this.field5185) {
            this.field5185.method2406(18385);
        }
        if (arg0 <= 119) {
            field5188 = null;
        }
        field5187++;
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(B)V")
    public final void method2208(byte arg0) {
        class450 var2 = this.field5185;
        synchronized (this.field5185) {
            this.field5185.method2412((byte) -128);
        }
        int var3 = 91 / ((-arg0 - 11) / 36);
        field5191++;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IB)V")
    public final void method2209(int arg0, byte arg1) {
        field5189++;
        class450 var3 = this.field5185;
        synchronized (this.field5185) {
            this.field5185.method2411(true, arg0);
        }
        int var4 = -100 % ((-arg1 - 11) / 36);
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(BLej;)V")
    public static final void method2210(byte arg0, class480 arg1) {
        arg1.field6380 = null;
        field5184++;
        if (arg0 == -45 && class685.field9618 < 20) {
            class284.field3528.method801(arg1, 103);
            class685.field9618++;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)V")
    public static void method2211(int arg0) {
        if (arg0 == 30) {
            field5190 = null;
            field5188 = null;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)Ldba;")
    public final class238 method2212(int arg0, int arg1) {
        field5186++;
        class450 var3 = this.field5185;
        class238 var4;
        synchronized (this.field5185) {
            var4 = (class238) this.field5185.method2418((long) arg0, (byte) 100);
        }
        if (var4 != null) {
            return var4;
        }
        class612 var5 = this.field5183;
        byte[] var6;
        synchronized (this.field5183) {
            if (arg1 != -27456) {
                field5188 = null;
            }
            var6 = this.field5183.method3365(arg0, arg1 + 27354, 30);
        }
        class238 var7 = new class238();
        if (var6 != null) {
            var7.method1427(-1, new class630(var6));
        }
        class450 var8 = this.field5185;
        synchronized (this.field5185) {
            this.field5185.method2409((long) arg0, var7, 1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(Lrf;ILpl;)V")
    public class415(class112 arg0, int arg1, class612 arg2) {
        this.field5183 = arg2;
        this.field5183.method3349(30, true);
    }
}
