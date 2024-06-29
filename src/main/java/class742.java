import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class742 extends class522 {

    @OriginalMember(owner = "client!kn", name = "o", descriptor = "I")
    private int field10350;

    @OriginalMember(owner = "client!kn", name = "v", descriptor = "I")
    private int field10357;

    @OriginalMember(owner = "client!kn", name = "q", descriptor = "I")
    private int field10352;

    @OriginalMember(owner = "client!kn", name = "n", descriptor = "I")
    private int field10349;

    @OriginalMember(owner = "client!kn", name = "l", descriptor = "I")
    private int field10347;

    @OriginalMember(owner = "client!kn", name = "p", descriptor = "I")
    private int field10351;

    @OriginalMember(owner = "client!kn", name = "r", descriptor = "I")
    private int field10353;

    @OriginalMember(owner = "client!kn", name = "w", descriptor = "I")
    private int field10358;

    @OriginalMember(owner = "client!kn", name = "s", descriptor = "Lhg;")
    public static class693 field10354 = new class693(69, 4);

    @OriginalMember(owner = "client!kn", name = "x", descriptor = "Lbia;")
    public static class501 field10359 = new class501(1);

    @OriginalMember(owner = "client!kn", name = "y", descriptor = "[Lrh;")
    public static class268[] field10360 = new class268[50];

    @OriginalMember(owner = "client!kn", name = "k", descriptor = "I")
    public static int field10346;

    @OriginalMember(owner = "client!kn", name = "m", descriptor = "I")
    public static int field10348;

    @OriginalMember(owner = "client!kn", name = "t", descriptor = "I")
    public static int field10355;

    @OriginalMember(owner = "client!kn", name = "u", descriptor = "I")
    public static int field10356;

    @OriginalMember(owner = "client!kn", name = "z", descriptor = "[Lpv;")
    public static class72[] field10361;

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "(I)V", line = 4)
    public static void method4134(int arg0) {
        int var1 = -7 / ((76 - arg0) / 47);
        field10359 = null;
        field10360 = null;
        field10361 = null;
        field10354 = null;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(ZII)V", line = 21)
    public final void method1094(boolean arg0, int arg1, int arg2) {
        ++field10348;
        if (arg0) {
            this.method1092(-95, 61, 51);
        }
    }

    @OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 31)
    public class742(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field10350 = arg4;
        this.field10357 = arg3;
        this.field10352 = arg6;
        this.field10349 = arg1;
        this.field10347 = arg7;
        this.field10351 = arg5;
        this.field10353 = arg2;
        this.field10358 = arg0;
    }

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(III)V", line = 49)
    public final void method1093(int arg0, int arg1, int arg2) {
        ++field10355;
        int var4 = this.field10358 * arg0 >> 12;
        int var5 = this.field10349 * arg2 >> 12;
        int var6 = this.field10353 * arg0 >> 12;
        int var7 = this.field10357 * arg2 >> 12;
        if (arg1 == 1) {
            int var8 = this.field10350 * arg0 >> 12;
            int var9 = this.field10351 * arg2 >> 12;
            int var10 = this.field10352 * arg0 >> 12;
            int var11 = this.field10347 * arg2 >> 12;
            class478.method2753(92, var4, var8, var5, var9, var10, super.field7318, var11, var6, var7);
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(III)V", line = 84)
    public final void method1092(int arg0, int arg1, int arg2) {
        ++field10356;
        if (arg2 != 2048) {
            method4134(-78);
        }
    }

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(IBI)Z", line = 95)
    public static final boolean method4135(int arg0, byte arg1, int arg2) {
        ++field10346;
        int var3 = 104 / ((arg1 - 22) / 63);
        return class730.method4072(true, arg2, arg0) | (arg0 & 262144) != 0 || class688.method3867(arg0, 0, arg2);
    }
}
