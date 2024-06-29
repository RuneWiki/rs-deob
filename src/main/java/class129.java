import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class129 {

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "Lvi;")
    private class560 field1633 = new class560(64);

    @OriginalMember(owner = "client!wm", name = "i", descriptor = "Lvi;")
    private class560 field1639 = new class560(100);

    @OriginalMember(owner = "client!wm", name = "f", descriptor = "Lpq;")
    private class159 field1636;

    @OriginalMember(owner = "client!wm", name = "e", descriptor = "Lcv;")
    public static class264 field1635 = new class264();

    @OriginalMember(owner = "client!wm", name = "k", descriptor = "[[F")
    public static float[][] field1641 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

    @OriginalMember(owner = "client!wm", name = "h", descriptor = "Lcb;")
    public static class318 field1638 = new class318(53, -2);

    @OriginalMember(owner = "client!wm", name = "l", descriptor = "[I")
    public static int[] field1642 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "I")
    public static int field1631;

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "I")
    public static int field1632;

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "I")
    public static int field1634;

    @OriginalMember(owner = "client!wm", name = "g", descriptor = "I")
    public static int field1637;

    @OriginalMember(owner = "client!wm", name = "j", descriptor = "I")
    public static int field1640;

    @OriginalMember(owner = "client!wm", name = "m", descriptor = "Z")
    public static boolean field1643;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)V")
    public static void method772(int arg0) {
        field1635 = null;
        field1641 = null;
        if (arg0 == -2) {
            field1642 = null;
            field1638 = null;
        }
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(I)V")
    public final void method773(int arg0) {
        class560 var2 = this.field1633;
        synchronized (this.field1633) {
            this.field1633.method3144(true);
        }
        field1634++;
        class560 var3 = this.field1639;
        synchronized (this.field1639) {
            this.field1639.method3144(true);
        }
        if (arg0 != 12513) {
            this.field1636 = null;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(II)Lfv;")
    public final class495 method774(int arg0, int arg1) {
        field1640++;
        class560 var3 = this.field1639;
        class495 var4;
        synchronized (this.field1639) {
            var4 = (class495) this.field1639.method3134((long) arg0, -54);
            if (var4 == null) {
                var4 = new class495(arg0);
                this.field1639.method3130((long) arg0, true, var4);
            }
        }
        synchronized (var4) {
            if (var4.method2797((byte) -106)) {
                if (arg1 > -116) {
                    this.method776(107, (byte) 42);
                }
                return var4;
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IB)V")
    public final void method775(int arg0, byte arg1) {
        field1632++;
        class560 var3 = this.field1633;
        synchronized (this.field1633) {
            int var4 = 79 / ((arg1 + 69) / 37);
            this.field1633.method3129(arg0, 14583);
        }
        class560 var5 = this.field1639;
        synchronized (this.field1639) {
            this.field1639.method3129(arg0, 14583);
        }
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(IB)Lfq;")
    public final class463 method776(int arg0, byte arg1) {
        int var3 = -23 / ((-arg1 - 8) / 58);
        field1631++;
        class560 var4 = this.field1633;
        class463 var5;
        synchronized (this.field1633) {
            var5 = (class463) this.field1633.method3134((long) arg0, -64);
        }
        if (var5 != null) {
            return var5;
        }
        class159 var6 = this.field1636;
        byte[] var7;
        synchronized (this.field1636) {
            var7 = this.field1636.method1087(class442.method2536((byte) 107, arg0), class82.method459(arg0, -126), 1);
        }
        class463 var8 = new class463();
        var8.field6329 = arg0;
        var8.field6320 = this;
        if (var7 != null) {
            var8.method2626(new class138(var7), false);
        }
        var8.method2620(124);
        class560 var9 = this.field1633;
        synchronized (this.field1633) {
            this.field1633.method3130((long) arg0, true, var8);
            return var8;
        }
    }

    @OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(Luea;ILpq;Lpq;Lpq;)V")
    public class129(class484 arg0, int arg1, class159 arg2, class159 arg3, class159 arg4) {
        this.field1636 = arg2;
        if (this.field1636 != null) {
            int var6 = this.field1636.method1074((byte) 106) - 1;
            this.field1636.method1076(var6, 0);
        }
        class542.method3052(2, arg4, -7834, arg3);
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Z)V")
    public final void method777(boolean arg0) {
        field1637++;
        class560 var2 = this.field1633;
        synchronized (this.field1633) {
            this.field1633.method3142(!arg0);
        }
        if (!arg0) {
            field1643 = false;
        }
        class560 var3 = this.field1639;
        synchronized (this.field1639) {
            this.field1639.method3142(!arg0);
        }
    }
}
