import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public class class277 {

    @OriginalMember(owner = "client!os", name = "i", descriptor = "Laq;")
    private class494 field4003 = new class494(64);

    @OriginalMember(owner = "client!os", name = "b", descriptor = "Lgga;")
    private class513 field3996;

    @OriginalMember(owner = "client!os", name = "l", descriptor = "Lom;")
    public class390 field4006;

    @OriginalMember(owner = "client!os", name = "g", descriptor = "[I")
    public static int[] field4001 = new int[1000];

    @OriginalMember(owner = "client!os", name = "d", descriptor = "I")
    public static int field3998 = 0;

    @OriginalMember(owner = "client!os", name = "k", descriptor = "I")
    public static int field4005 = 16777215;

    @OriginalMember(owner = "client!os", name = "a", descriptor = "I")
    public static int field3995;

    @OriginalMember(owner = "client!os", name = "e", descriptor = "I")
    public static int field3999;

    @OriginalMember(owner = "client!os", name = "f", descriptor = "I")
    public static int field4000;

    @OriginalMember(owner = "client!os", name = "h", descriptor = "I")
    public static int field4002;

    @OriginalMember(owner = "client!os", name = "j", descriptor = "I")
    public static int field4004;

    @OriginalMember(owner = "client!os", name = "m", descriptor = "I")
    public static int field4007;

    @OriginalMember(owner = "client!os", name = "c", descriptor = "[Lnfa;")
    public static class745[] field3997;

    @OriginalMember(owner = "client!os", name = "a", descriptor = "([FII)[F", line = 8)
    public static final float[] method1769(float[] arg0, int arg1, int arg2) {
        field4002++;
        float[] var3 = new float[arg1];
        if (arg2 != -5189) {
            method1769(null, -10, -65);
        }
        class171.method1267(arg0, 0, var3, 0, arg1);
        return var3;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(B)V", line = 23)
    public final void method1770(byte arg0) {
        class494 var2 = this.field4003;
        synchronized (this.field4003) {
            this.field4003.method2881((byte) -48);
        }
        int var3 = 111 / ((arg0 + 16) / 43);
        field4004++;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Z)V", line = 37)
    public static void method1771(boolean arg0) {
        field4001 = null;
        if (arg0) {
            method1769(null, -52, 94);
        }
        field3997 = null;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(II)V", line = 50)
    public final void method1772(int arg0, int arg1) {
        class494 var3 = this.field4003;
        synchronized (this.field4003) {
            this.field4003.method2888(arg0, 121);
        }
        if (arg1 == -9480) {
            field4000++;
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(I)V", line = 69)
    public final void method1773(int arg0) {
        class494 var2 = this.field4003;
        synchronized (this.field4003) {
            this.field4003.method2893((byte) 114);
        }
        field3999++;
        int var3 = -4 % ((arg0 - 11) / 48);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IB)Lnia;", line = 84)
    public final class31 method1774(int arg0, byte arg1) {
        field4007++;
        class494 var3 = this.field4003;
        class31 var4;
        synchronized (this.field4003) {
            var4 = (class31) this.field4003.method2882((long) arg0, (byte) -35);
        }
        if (var4 != null) {
            return var4;
        }
        class513 var5 = this.field3996;
        byte[] var6;
        synchronized (this.field3996) {
            if (arg1 != 77) {
                this.method1772(124, 127);
            }
            var6 = this.field3996.method3019(32, arg0, 106);
        }
        class31 var7 = new class31();
        var7.field364 = this;
        if (var6 != null) {
            var7.method263(new class431(var6), (byte) -96);
        }
        class494 var8 = this.field4003;
        synchronized (this.field4003) {
            this.field4003.method2890(-7307, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!os", name = "<init>", descriptor = "(Lmca;ILgga;Lom;)V", line = 125)
    public class277(class41 arg0, int arg1, class513 arg2, class390 arg3) {
        this.field3996 = arg2;
        this.field3996.method3007(-1, 32);
        this.field4006 = arg3;
    }
}
