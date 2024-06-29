import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class144 {

    @OriginalMember(owner = "client!oe", name = "o", descriptor = "Lmd;")
    private class123 field2787 = new class123(256);

    @OriginalMember(owner = "client!oe", name = "q", descriptor = "Lmd;")
    private class123 field2789 = new class123(256);

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "Lpe;")
    private class154 field2783;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "Lpe;")
    private class154 field2774;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "Lob;")
    private static class141 field2773 = class175.method1195(40, "Unable to find ");

    @OriginalMember(owner = "client!oe", name = "n", descriptor = "Lob;")
    public static class141 field2786 = field2773;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "Lhc;")
    public static class73 field2779 = new class73();

    @OriginalMember(owner = "client!oe", name = "t", descriptor = "Lob;")
    private static class141 field2792 = class175.method1195(40, "The server is being updated)3");

    @OriginalMember(owner = "client!oe", name = "s", descriptor = "Lob;")
    public static class141 field2791 = class175.method1195(40, "<col=ffff00>*V");

    @OriginalMember(owner = "client!oe", name = "u", descriptor = "Lob;")
    public static class141 field2793 = field2792;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    public static int field2775;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "I")
    public static int field2776;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "I")
    public static int field2778;

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "I")
    public static int field2780;

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "I")
    public static int field2781;

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "I")
    public static int field2782;

    @OriginalMember(owner = "client!oe", name = "l", descriptor = "I")
    public static int field2784;

    @OriginalMember(owner = "client!oe", name = "m", descriptor = "I")
    public static int field2785;

    @OriginalMember(owner = "client!oe", name = "p", descriptor = "I")
    public static int field2788;

    @OriginalMember(owner = "client!oe", name = "r", descriptor = "I")
    public static int field2790;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "Lra;")
    public static class170 field2777;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V")
    public static void method948(int arg0) {
        field2786 = null;
        field2779 = null;
        field2791 = null;
        field2792 = null;
        field2793 = null;
        field2777 = null;
        field2773 = null;
        if (arg0 != -5079) {
            field2791 = null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lpe;III)Lkc;")
    public static final class102 method949(class154 arg0, int arg1, int arg2, int arg3) {
        field2785++;
        if (arg2 > -101) {
            field2777 = null;
        }
        return class53.method353(-103, arg1, arg0, arg3) ? class206.method1362((byte) -44) : null;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "([IBI)Loa;")
    public final class140 method950(int[] arg0, byte arg1, int arg2) {
        field2781++;
        if (this.field2783.method1063(-3853) == 1) {
            return this.method951(arg0, arg2, false, 0);
        } else if (this.field2783.method1058(arg2, (byte) -59) == 1) {
            return this.method951(arg0, 0, false, arg2);
        } else {
            int var4 = -122 % ((arg1 - 1) / 61);
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "([IIZI)Loa;")
    private final class140 method951(int[] arg0, int arg1, boolean arg2, int arg3) {
        if (arg2) {
            field2786 = null;
        }
        field2776++;
        int var5 = arg1 ^ ((arg3 & 0xB0000FFF) << 4 | arg3 >>> 12);
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class140 var9 = (class140) this.field2789.method792(var7, 22346);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class28 var10 = (class28) this.field2787.method792(var7, 22346);
            if (var10 == null) {
                var10 = class28.method199(this.field2783, arg3, arg1);
                if (var10 == null) {
                    return null;
                }
                this.field2787.method797(var10, var7, true);
            }
            class140 var11 = var10.method197(arg0);
            if (var11 == null) {
                return null;
            } else {
                var10.method1392(128);
                this.field2789.method797(var11, var7, true);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILqe;I[B)V")
    public static final void method952(int arg0, class164 arg1, int arg2, byte[] arg3) {
        int var4 = 122 / ((arg2 + 64) / 53);
        field2788++;
        class162 var5 = new class162();
        var5.field4067 = arg0;
        var5.field3136 = arg3;
        var5.field3133 = arg1;
        var5.field3138 = 0;
        class158 var6 = class109.field2097;
        synchronized (class109.field2097) {
            class109.field2097.method1098(0, var5);
        }
        class176.method1199(-9748);
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "([IBI)Loa;")
    public final class140 method953(int[] arg0, byte arg1, int arg2) {
        field2780++;
        if (this.field2774.method1063(-3853) == 1) {
            return this.method954(true, arg2, arg0, 0);
        } else if (this.field2774.method1058(arg2, (byte) -59) == 1) {
            return this.method954(true, 0, arg0, arg2);
        } else {
            if (arg1 > -34) {
                this.method953(null, (byte) -54, -124);
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ZI[II)Loa;")
    private final class140 method954(boolean arg0, int arg1, int[] arg2, int arg3) {
        int var5 = (arg3 >>> 12 | arg3 << 4 & 0xFFF1) ^ arg1;
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6;
        field2778++;
        class140 var9 = (class140) this.field2789.method792(var7, 22346);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class48 var10 = class48.method318(this.field2774, arg3, arg1);
            if (var10 == null) {
                return null;
            }
            class140 var11 = var10.method316();
            this.field2789.method797(var11, var7, arg0);
            if (arg2 != null) {
                arg2[0] -= var11.field2683.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)I")
    public static final int method955(int arg0, int arg1) {
        field2782++;
        if (arg0 >= -43) {
            method952(-9, null, -70, null);
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(Lpe;Lpe;)V")
    public class144(class154 arg0, class154 arg1) {
        this.field2783 = arg1;
        this.field2774 = arg0;
    }
}
