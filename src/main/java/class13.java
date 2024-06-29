import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class13 {

    @OriginalMember(owner = "client!vl", name = "m", descriptor = "Llga;")
    private class663 field138 = new class663(64);

    @OriginalMember(owner = "client!vl", name = "e", descriptor = "Lsea;")
    private class648 field130;

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "[I")
    public static int[] field127 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "I")
    public static int field126;

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "I")
    public static int field128;

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "I")
    public static int field129;

    @OriginalMember(owner = "client!vl", name = "f", descriptor = "I")
    public static int field131;

    @OriginalMember(owner = "client!vl", name = "g", descriptor = "I")
    public static int field132;

    @OriginalMember(owner = "client!vl", name = "h", descriptor = "I")
    public static int field133;

    @OriginalMember(owner = "client!vl", name = "i", descriptor = "I")
    public static int field134;

    @OriginalMember(owner = "client!vl", name = "j", descriptor = "I")
    public static int field135;

    @OriginalMember(owner = "client!vl", name = "k", descriptor = "I")
    public static int field136;

    @OriginalMember(owner = "client!vl", name = "l", descriptor = "Lsea;")
    public static class648 field137;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(B)V", line = 3)
    public final void method60(byte arg0) {
        class663 var2 = this.field138;
        synchronized (this.field138) {
            this.field138.method3755(19713);
            if (arg0 < 122) {
                this.field130 = null;
            }
        }
        field129++;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(BI)V", line = 18)
    public static final void method61(byte arg0, int arg1) {
        if (class468.field6439 == null) {
            class468.field6439 = new byte[4][class401.field5620][class257.field3508];
        }
        field132++;
        for (int var2 = arg1; var2 < 4; var2++) {
            for (int var3 = 0; var3 < class401.field5620; var3++) {
                for (int var4 = 0; var4 < class257.field3508; var4++) {
                    class468.field6439[var2][var3][var4] = arg0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)V", line = 55)
    public static void method62(int arg0) {
        field127 = null;
        if (arg0 == 15990) {
            field137 = null;
        }
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(I)V", line = 66)
    public static final void method63(int arg0) {
        if (arg0 < 39) {
            field127 = null;
        }
        field134++;
        int var1 = 0;
        if (class366.field4875 != null) {
            var1 = class366.field4875.method534(1, class503.field6917);
        }
        if (var1 == 2) {
            int var4 = class148.field2192 > 800 ? 800 : class148.field2192;
            class323.field4401 = (class148.field2192 - var4) / 2;
            int var5 = class595.field8319 > 600 ? 600 : class595.field8319;
            class222.field3096 = var4;
            class703.field9949 = 0;
            class340.field4553 = var5;
        } else if (var1 == 1) {
            int var2 = class148.field2192 <= 1024 ? class148.field2192 : 1024;
            class323.field4401 = (class148.field2192 - var2) / 2;
            int var3 = class595.field8319 > 768 ? 768 : class595.field8319;
            class222.field3096 = var2;
            class340.field4553 = var3;
            class703.field9949 = 0;
        } else {
            class340.field4553 = class595.field8319;
            class703.field9949 = 0;
            class222.field3096 = class148.field2192;
            class323.field4401 = 0;
        }
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(B)Lhg;", line = 115)
    public static final class643 method64(byte arg0) {
        field126++;
        return arg0 == -117 ? class396.method2324(arg0 - 32402, 1) : null;
    }

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "(I)V", line = 128)
    public final void method65(int arg0) {
        if (arg0 > -121) {
            return;
        }
        class663 var2 = this.field138;
        synchronized (this.field138) {
            this.field138.method3749(7648);
        }
        field131++;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(ZI)Lul;", line = 143)
    public final class532 method66(boolean arg0, int arg1) {
        field133++;
        class663 var3 = this.field138;
        class532 var4;
        synchronized (this.field138) {
            var4 = (class532) this.field138.method3747((byte) -66, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg0) {
            method62(76);
        }
        class648 var5 = this.field130;
        byte[] var6;
        synchronized (this.field130) {
            var6 = this.field130.method3654(-15615, 31, arg1);
        }
        class532 var7 = new class532();
        if (var6 != null) {
            var7.method3020(97, new class501(var6));
        }
        class663 var8 = this.field138;
        synchronized (this.field138) {
            this.field138.method3748((long) arg1, var7, 12537);
            return var7;
        }
    }

    @OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(Lci;ILsea;)V", line = 203)
    public class13(class414 arg0, int arg1, class648 arg2) {
        this.field130 = arg2;
        this.field130.method3653(31, true);
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(II)V", line = 191)
    public final void method67(int arg0, int arg1) {
        field128++;
        class663 var3 = this.field138;
        synchronized (this.field138) {
            this.field138.method3754(arg1, true);
        }
        if (arg0 != 11) {
            method63(93);
        }
    }
}
