import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class33 {

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "Ld;")
    private class242 field392 = new class242(64);

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "Lum;")
    private class83 field391;

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "Lpn;")
    public static class49 field389 = new class49(33, -1);

    @OriginalMember(owner = "client!wf", name = "i", descriptor = "[Z")
    public static boolean[] field395 = new boolean[8];

    @OriginalMember(owner = "client!wf", name = "n", descriptor = "I")
    public static int field400 = -1;

    @OriginalMember(owner = "client!wf", name = "j", descriptor = "F")
    public static float field396;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "I")
    public static int field387;

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "I")
    public static int field394;

    @OriginalMember(owner = "client!wf", name = "k", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!wf", name = "m", descriptor = "I")
    public static int field399;

    @OriginalMember(owner = "client!wf", name = "o", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "client!wf", name = "p", descriptor = "I")
    public static int field402;

    @OriginalMember(owner = "client!wf", name = "l", descriptor = "Lfj;")
    public static class503 field398;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IZIII)V")
    public static final void method196(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        class250.field4082 = 0L;
        field393++;
        int var5 = class159.method1145((byte) 121);
        if (arg2 != 51) {
            field394 = -12;
        }
        if (arg0 == 3 || var5 == 3) {
            arg1 = true;
        }
        if (!class376.field5542.method563()) {
            arg1 = true;
        }
        class396.method2504(arg4, arg3, var5, -123, arg1, arg0);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)Z")
    public static final boolean method197(int arg0, int arg1) {
        field402++;
        if (arg1 < 18) {
            field396 = 0.1263664F;
        }
        if (arg0 == 51 || arg0 == 44 || arg0 == 16 || arg0 == 57 || arg0 == 58) {
            return true;
        } else {
            return arg0 == 11 || arg0 == 1012;
        }
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(II)V")
    public final void method198(int arg0, int arg1) {
        field390++;
        class242 var3 = this.field392;
        synchronized (this.field392) {
            this.field392.method1631(arg1, (byte) -19);
            if (arg0 != 33) {
                field394 = 123;
            }
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)[Lrp;")
    public static final class277[] method199(int arg0) {
        if (arg0 == 30507) {
            field387++;
            return new class277[] { class185.field2836, class320.field4850, class149.field2229 };
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "(II)Lkj;")
    public final class203 method200(int arg0, int arg1) {
        field397++;
        class242 var3 = this.field392;
        class203 var4;
        synchronized (this.field392) {
            var4 = (class203) this.field392.method1634((long) arg1, 64);
        }
        if (var4 != null) {
            return var4;
        }
        class83 var5 = this.field391;
        byte[] var7;
        synchronized (this.field391) {
            if (arg0 != 18167) {
                return null;
            }
            var7 = this.field391.method731(0, arg1, 31);
        }
        class203 var8 = new class203();
        if (var7 != null) {
            var8.method1427(85, new class194(var7));
        }
        class242 var9 = this.field392;
        synchronized (this.field392) {
            this.field392.method1623((long) arg1, 17621, var8);
            return var8;
        }
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(Lpt;ILum;)V")
    public class33(class308 arg0, int arg1, class83 arg2) {
        this.field391 = arg2;
        this.field391.method748(31, 12408);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Z)V")
    public final void method201(boolean arg0) {
        field399++;
        class242 var2 = this.field392;
        synchronized (this.field392) {
            this.field392.method1637((byte) 13);
            if (!arg0) {
                field396 = -0.11350479F;
            }
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)V")
    public static void method202(byte arg0) {
        field389 = null;
        field395 = null;
        if (arg0 <= 78) {
            method196(71, true, 75, 32, 93);
        }
        field398 = null;
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(I)V")
    public final void method203(int arg0) {
        field388++;
        class242 var2 = this.field392;
        synchronized (this.field392) {
            if (arg0 == 33) {
                this.field392.method1630(-125);
            }
        }
    }
}
