import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class30 extends class441 {

    @OriginalMember(owner = "client!eg", name = "m", descriptor = "I")
    private int field375;

    @OriginalMember(owner = "client!eg", name = "p", descriptor = "I")
    private int field378;

    @OriginalMember(owner = "client!eg", name = "l", descriptor = "I")
    private int field374;

    @OriginalMember(owner = "client!eg", name = "q", descriptor = "I")
    private int field379;

    @OriginalMember(owner = "client!eg", name = "s", descriptor = "I")
    public static int field381 = 0;

    @OriginalMember(owner = "client!eg", name = "n", descriptor = "Lpf;")
    public static class425 field376 = new class425(65, -1);

    @OriginalMember(owner = "client!eg", name = "t", descriptor = "I")
    public static int field382 = 0;

    @OriginalMember(owner = "client!eg", name = "u", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "client!eg", name = "j", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!eg", name = "k", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "client!eg", name = "o", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!eg", name = "r", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lmf;IIIII)V")
    public static final void method172(class45 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field559 = 0;
        for (int var6 = 0; var6 < 4; ++var6) {
            if (arg0.field554[var6] != null) {
                ++arg0.field559;
            }
        }
        label50: for (int var7 = 0; var7 < arg0.field559; ++var7) {
            long var8 = class452.field6688[arg1][arg2][arg3];
            while (var8 != 0L) {
                class21 var14 = class281.field4303[(int) ((var8 & 65535L) - 1L)];
                var8 >>>= 16;
                if (arg0.field554[var7] == var14) {
                    continue label50;
                }
            }
            long var10 = class452.field6688[arg1][arg4][arg5];
            while (var10 != 0L) {
                class21 var13 = class281.field4303[(int) ((var10 & 65535L) - 1L)];
                var10 >>>= 16;
                if (arg0.field554[var7] == var13) {
                    continue label50;
                }
            }
            for (int var12 = var7; var12 < arg0.field559 - 1; ++var12) {
                arg0.field554[var12] = arg0.field554[var12 + 1];
            }
            --arg0.field559;
        }
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(B)V")
    public static void method173(byte arg0) {
        if (arg0 != -123) {
            method172((class45) null, 55, 35, -92, 34, 92);
        }
        field376 = null;
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(IIIIIII)V")
    public class30(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field375 = arg0;
        this.field378 = arg3;
        this.field374 = arg2;
        this.field379 = arg1;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IZI)V")
    public final void method174(int arg0, boolean arg1, int arg2) {
        ++field372;
        int var4 = this.field375 * arg2 >> 12;
        int var5 = this.field374 * arg2 >> 12;
        if (!arg1) {
            field381 = -106;
        }
        int var6 = this.field379 * arg0 >> 12;
        int var7 = this.field378 * arg0 >> 12;
        class74.method486(var6, super.field6485, var4, var7, super.field6484, var5, 121);
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(BII)V")
    public final void method175(byte arg0, int arg1, int arg2) {
        ++field380;
        int var4 = this.field375 * arg1 >> 12;
        int var5 = this.field374 * arg1 >> 12;
        if (arg0 > -67) {
            method173((byte) 83);
        }
        int var6 = this.field379 * arg2 >> 12;
        int var7 = this.field378 * arg2 >> 12;
        class333.method2041(var4, var7, var5, super.field6487, var6, 27);
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(III)V")
    public final void method176(int arg0, int arg1, int arg2) {
        if (arg1 == 307) {
            ++field377;
            int var4 = this.field375 * arg0 >> 12;
            int var5 = this.field374 * arg0 >> 12;
            int var6 = this.field379 * arg2 >> 12;
            int var7 = this.field378 * arg2 >> 12;
            class435.method2673(var5, super.field6485, arg1 + -197, super.field6487, var6, var7, super.field6484, var4);
        }
    }

    static {
        new class463("", 76);
        field383 = 0;
    }
}
