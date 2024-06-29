import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class590 {

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "I")
    public int field8315 = 128;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "I")
    public int field8313 = 128;

    @OriginalMember(owner = "client!gn", name = "g", descriptor = "I")
    public int field8319;

    @OriginalMember(owner = "client!gn", name = "i", descriptor = "I")
    public int field8321;

    @OriginalMember(owner = "client!gn", name = "l", descriptor = "I")
    public int field8324;

    @OriginalMember(owner = "client!gn", name = "d", descriptor = "I")
    public int field8316;

    @OriginalMember(owner = "client!gn", name = "e", descriptor = "Z")
    public static boolean field8317 = false;

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "I")
    public static int field8314;

    @OriginalMember(owner = "client!gn", name = "f", descriptor = "I")
    public static int field8318;

    @OriginalMember(owner = "client!gn", name = "h", descriptor = "I")
    public static int field8320;

    @OriginalMember(owner = "client!gn", name = "j", descriptor = "I")
    public static int field8322;

    @OriginalMember(owner = "client!gn", name = "k", descriptor = "I")
    public static int field8323;

    @OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(I)V", line = 87)
    public class590(int arg0) {
        this.field8319 = arg0;
    }

    @OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(IIIIII)V", line = 94)
    private class590(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field8321 = arg4;
        this.field8315 = arg1;
        this.field8324 = arg3;
        this.field8319 = arg0;
        this.field8316 = arg5;
        this.field8313 = arg2;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Z)Lgn;", line = 13)
    public final class590 method3453(boolean arg0) {
        if (!arg0) {
            this.method3453(false);
        }
        field8320++;
        return new class590(this.field8319, this.field8315, this.field8313, this.field8324, this.field8321, this.field8316);
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(III)Z", line = 24)
    public static final boolean method3454(int arg0, int arg1, int arg2) {
        field8318++;
        if (arg1 > -38) {
            field8314 = 52;
        }
        return class571.method3358(256, arg0, arg2) & class664.method3786(arg2, (byte) -6, arg0);
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lgn;I)V", line = 37)
    public final void method3455(class590 arg0, int arg1) {
        this.field8313 = arg0.field8313;
        this.field8315 = arg0.field8315;
        this.field8324 = arg0.field8324;
        this.field8316 = arg0.field8316;
        field8323++;
        if (arg1 != 128) {
            this.field8316 = 6;
        }
        this.field8319 = arg0.field8319;
        this.field8321 = arg0.field8321;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(II)Lfea;", line = 56)
    public static final class678 method3456(int arg0, int arg1) {
        field8322++;
        class678[] var2 = class563.method3330(arg1 ^ 0xFFFF9C07);
        for (int var3 = arg1; var3 < var2.length; var3++) {
            class678 var4 = var2[var3];
            if (var4.field9489 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
