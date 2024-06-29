import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class647 {

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "Lpja;")
    private class43 field8941 = new class43(64);

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "Lgj;")
    private class662 field8939;

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "I")
    public static int field8938 = 0;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "I")
    public static int field8937;

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "I")
    public static int field8940;

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "I")
    public static int field8942;

    @OriginalMember(owner = "client!tl", name = "g", descriptor = "[[[S")
    public static short[][][] field8943;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(ILgj;ZLgj;)V")
    public static final void method3630(int arg0, class662 arg1, boolean arg2, class662 arg3) {
        field8942++;
        if (arg2) {
            field8938 = -48;
        }
        class276.field3829 = arg3;
        class769.field10609 = arg1;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(ZI)Ldv;")
    public final class686 method3631(boolean arg0, int arg1) {
        if (arg0) {
            this.method3631(true, 93);
        }
        field8937++;
        class43 var3 = this.field8941;
        class686 var4;
        synchronized (this.field8941) {
            var4 = (class686) this.field8941.method266((byte) -118, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class662 var5 = this.field8939;
        byte[] var6;
        synchronized (this.field8939) {
            var6 = this.field8939.method3732(arg1, 8906, 5);
        }
        class686 var7 = new class686();
        if (var6 != null) {
            var7.method3860(-24495, new class93(var6));
        }
        class43 var8 = this.field8941;
        synchronized (this.field8941) {
            this.field8941.method270(var7, (long) arg1, -127);
            return var7;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(B)V")
    public static void method3632(byte arg0) {
        if (arg0 <= 124) {
            method3633(69, -108, 24, null, null);
        }
        field8943 = null;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIILjia;Lha;)V")
    public static final void method3633(int arg0, int arg1, int arg2, class645 arg3, class66 arg4) {
        class497.field6805.method3590((byte) -117);
        field8940++;
        if (class355.field4845) {
            return;
        }
        for (class508 var5 = (class508) arg3.method3589((byte) -128); var5 != null; var5 = (class508) arg3.method3591(0)) {
            class393 var7 = class64.field882.method4031(36, var5.field6973);
            if (class5.method39(var7, false)) {
                boolean var8 = class55.method402(arg4, arg0, var7, arg2, var5, -108);
                if (var8) {
                    class386.method2352(var5, var7, arg4, -3);
                }
            }
        }
        int var6 = -2 / ((7 - arg1) / 32);
    }

    @OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(Lim;ILgj;)V")
    public class647(class598 arg0, int arg1, class662 arg2) {
        this.field8939 = arg2;
        this.field8939.method3730((byte) 86, 5);
    }
}
