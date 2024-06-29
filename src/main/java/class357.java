import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public class class357 {

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "Ljk;")
    private class449 field4590 = new class449(64);

    @OriginalMember(owner = "client!gq", name = "e", descriptor = "Lqn;")
    private class47 field4592;

    @OriginalMember(owner = "client!gq", name = "h", descriptor = "Lqn;")
    public class47 field4595;

    @OriginalMember(owner = "client!gq", name = "i", descriptor = "[[B")
    public static byte[][] field4596 = new byte[50][];

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "I")
    public static int field4588 = 0;

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "I")
    public static int field4589;

    @OriginalMember(owner = "client!gq", name = "d", descriptor = "I")
    public static int field4591;

    @OriginalMember(owner = "client!gq", name = "f", descriptor = "I")
    public static int field4593;

    @OriginalMember(owner = "client!gq", name = "g", descriptor = "I")
    public static int field4594;

    @OriginalMember(owner = "client!gq", name = "j", descriptor = "I")
    public static int field4597;

    @OriginalMember(owner = "client!gq", name = "k", descriptor = "I")
    public static int field4598;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(I)V")
    public final void method2043(int arg0) {
        field4593++;
        class449 var2 = this.field4590;
        synchronized (this.field4590) {
            this.field4590.method2642(arg0 + 25876);
            if (arg0 != -25876) {
                this.field4592 = null;
            }
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(IB)Lbn;")
    public final class309 method2044(int arg0, byte arg1) {
        field4589++;
        class449 var3 = this.field4590;
        class309 var4;
        synchronized (this.field4590) {
            var4 = (class309) this.field4590.method2647(-127, (long) arg0);
            int var5 = 12 % ((-arg1 - 38) / 54);
        }
        if (var4 != null) {
            return var4;
        }
        class47 var6 = this.field4592;
        byte[] var7;
        synchronized (this.field4592) {
            var7 = this.field4592.method481(3, arg0, -106);
        }
        class309 var8 = new class309();
        var8.field3966 = this;
        if (var7 != null) {
            var8.method1807(new class463(var7), -123);
        }
        class449 var9 = this.field4590;
        synchronized (this.field4590) {
            this.field4590.method2635((long) arg0, -26591, var8);
            return var8;
        }
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(I)V")
    public static void method2045(int arg0) {
        if (arg0 != 0) {
            field4596 = null;
        }
        field4596 = null;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(B)V")
    public final void method2046(byte arg0) {
        field4598++;
        class449 var2 = this.field4590;
        synchronized (this.field4590) {
            this.field4590.method2640(118);
        }
        if (arg0 != -67) {
            method2047(-49, null);
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(ILfh;)Lmm;")
    public static final class184 method2047(int arg0, class463 arg1) {
        field4591++;
        arg1.method2737(false);
        int var2 = arg1.method2737(false);
        class184 var3 = class237.method1428(var2, 112);
        var3.field2408 = arg1.method2737(false);
        int var4 = arg1.method2737(false);
        for (int var5 = arg0; var5 < var4; var5++) {
            int var6 = arg1.method2737(false);
            var3.method7((byte) -96, var6, arg1);
        }
        var3.method109(false);
        return var3;
    }

    @OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(Lae;ILqn;Lqn;)V")
    public class357(class165 arg0, int arg1, class47 arg2, class47 arg3) {
        this.field4592 = arg2;
        this.field4595 = arg3;
        this.field4592.method469(30322, 3);
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(II)V")
    public final void method2048(int arg0, int arg1) {
        class449 var3 = this.field4590;
        synchronized (this.field4590) {
            this.field4590.method2648(false, arg1);
            if (arg0 > -81) {
                method2045(-44);
            }
        }
        field4594++;
    }
}
