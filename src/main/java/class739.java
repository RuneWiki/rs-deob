import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ega")
public class class739 {

    @OriginalMember(owner = "client!ega", name = "h", descriptor = "Loo;")
    private class652 field10190 = new class652(64);

    @OriginalMember(owner = "client!ega", name = "c", descriptor = "Lwia;")
    private class791 field10185;

    @OriginalMember(owner = "client!ega", name = "d", descriptor = "I")
    public static int field10186 = 0;

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "I")
    public static int field10183;

    @OriginalMember(owner = "client!ega", name = "b", descriptor = "I")
    public static int field10184;

    @OriginalMember(owner = "client!ega", name = "e", descriptor = "I")
    public static int field10187;

    @OriginalMember(owner = "client!ega", name = "g", descriptor = "I")
    public static int field10189;

    @OriginalMember(owner = "client!ega", name = "i", descriptor = "I")
    public static int field10191;

    @OriginalMember(owner = "client!ega", name = "f", descriptor = "Lie;")
    public static class6 field10188;

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(I)V", line = 4)
    public final void method4112(int arg0) {
        field10189++;
        class652 var2 = this.field10190;
        synchronized (this.field10190) {
            this.field10190.method3743(8);
            int var3 = 43 % ((arg0 - 29) / 63);
        }
    }

    @OriginalMember(owner = "client!ega", name = "b", descriptor = "(I)V", line = 18)
    public static void method4113(int arg0) {
        field10188 = null;
        if (arg0 != -16977) {
            method4113(-45);
        }
    }

    @OriginalMember(owner = "client!ega", name = "c", descriptor = "(I)V", line = 28)
    public final void method4114(int arg0) {
        field10184++;
        class652 var2 = this.field10190;
        synchronized (this.field10190) {
            this.field10190.method3735(arg0 + 17011);
            if (arg0 != -17009) {
                field10186 = 15;
            }
        }
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(II)V", line = 42)
    public final void method4115(int arg0, int arg1) {
        class652 var3 = this.field10190;
        synchronized (this.field10190) {
            this.field10190.method3741(arg0, 0);
        }
        field10191++;
        if (arg1 != 11) {
            this.method4114(-35);
        }
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(IIIII)V", line = 55)
    public static final void method4116(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field10187++;
        if (arg3 <= arg1) {
            class434.method2601(class746.field10330[arg4], arg3, arg0, (byte) -62, arg1);
        } else {
            class434.method2601(class746.field10330[arg4], arg1, arg0, (byte) -62, arg3);
        }
        if (arg2 != 11) {
            field10188 = null;
        }
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(BI)Ltl;", line = 86)
    public final class645 method4117(byte arg0, int arg1) {
        field10183++;
        class652 var3 = this.field10190;
        class645 var4;
        synchronized (this.field10190) {
            var4 = (class645) this.field10190.method3742((byte) 67, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class791 var5 = this.field10185;
        byte[] var6;
        synchronized (this.field10185) {
            var6 = this.field10185.method4339(arg1, 0, 11);
        }
        if (arg0 != 49) {
            this.method4117((byte) -91, -29);
        }
        class645 var7 = new class645();
        if (var6 != null) {
            var7.method3702(new class494(var6), -3743);
        }
        class652 var8 = this.field10190;
        synchronized (this.field10190) {
            this.field10190.method3739((long) arg1, (byte) 51, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ega", name = "<init>", descriptor = "(Ldt;ILwia;)V", line = 122)
    public class739(class252 arg0, int arg1, class791 arg2) {
        this.field10185 = arg2;
        if (this.field10185 != null) {
            this.field10185.method4353(11, true);
        }
    }
}
