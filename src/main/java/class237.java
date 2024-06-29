import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class237 extends class114 {

    @OriginalMember(owner = "client!al", name = "q", descriptor = "I")
    private int field3569 = -32768;

    @OriginalMember(owner = "client!al", name = "u", descriptor = "I")
    public static int field3573 = 0;

    @OriginalMember(owner = "client!al", name = "r", descriptor = "I")
    public static int field3570 = 0;

    @OriginalMember(owner = "client!al", name = "n", descriptor = "Lik;")
    public static class267 field3566 = new class267(64);

    @OriginalMember(owner = "client!al", name = "C", descriptor = "[I")
    public static int[] field3581 = new int[2];

    @OriginalMember(owner = "client!al", name = "o", descriptor = "I")
    public static int field3567;

    @OriginalMember(owner = "client!al", name = "p", descriptor = "I")
    public static int field3568;

    @OriginalMember(owner = "client!al", name = "s", descriptor = "I")
    public static int field3571;

    @OriginalMember(owner = "client!al", name = "v", descriptor = "I")
    public int field3574;

    @OriginalMember(owner = "client!al", name = "w", descriptor = "I")
    public static int field3575;

    @OriginalMember(owner = "client!al", name = "x", descriptor = "I")
    public static int field3576;

    @OriginalMember(owner = "client!al", name = "y", descriptor = "I")
    public int field3577;

    @OriginalMember(owner = "client!al", name = "z", descriptor = "I")
    public static int field3578;

    @OriginalMember(owner = "client!al", name = "A", descriptor = "I")
    public static int field3579;

    @OriginalMember(owner = "client!al", name = "t", descriptor = "Lda;")
    public static class189 field3572;

    @OriginalMember(owner = "client!al", name = "B", descriptor = "Lpf;")
    public static class294 field3580;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "()I")
    public final int method81() {
        field3568++;
        return this.field3569;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(ILpf;IZ)[Lsb;")
    public static final class230[] method1502(int arg0, class294 arg1, int arg2, boolean arg3) {
        field3571++;
        if (arg3) {
            return null;
        } else if (class66.method451(arg1, arg0, 2048, arg2)) {
            return class289.method1918(-122);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIIII)V")
    public final void method98(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3575++;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Lrf;I)Ljava/lang/String;")
    public static final String method1503(class289 arg0, int arg1) {
        if (arg1 >= -44) {
            method1505(-93, 68, 30, -45, (class114) null, 61L, (class114) null, (class114) null);
        }
        field3578++;
        if (client.method972(arg0).method1791((byte) 69) == 0) {
            return null;
        } else if (arg0.field4562 == null || arg0.field4562.trim().length() == 0) {
            return class64.field1009 ? "Hidden-use" : null;
        } else {
            return arg0.field4562;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I)V")
    public static void method1504(int arg0) {
        field3572 = null;
        field3566 = null;
        if (arg0 >= 35) {
            field3580 = null;
            field3581 = null;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIIILsk;JLsk;Lsk;)V")
    public static final void method1505(int arg0, int arg1, int arg2, int arg3, class114 arg4, long arg5, class114 arg6, class114 arg7) {
        class231 var9 = new class231();
        var9.field3489 = arg4;
        var9.field3475 = arg1 * 128 + 64;
        var9.field3496 = arg2 * 128 + 64;
        var9.field3490 = arg3;
        var9.field3485 = arg5;
        var9.field3487 = arg6;
        var9.field3481 = arg7;
        int var10 = 0;
        class270 var11 = class33.field487[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field4071; var12++) {
                class2 var13 = var11.field4069[var12];
                if ((var13.field28 & 0x400000L) == 4194304L) {
                    int var14 = var13.field31.method81();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field3478 = -var10;
        if (class33.field487[arg0][arg1][arg2] == null) {
            class33.field487[arg0][arg1][arg2] = new class270(arg0, arg1, arg2);
        }
        class33.field487[arg0][arg1][arg2].field4068 = var9;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIIIIIIIJILs;)V")
    public final void method90(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class245 arg10) {
        field3579++;
        class14 var13 = class160.method999(this.field3577, 0).method299((class79) null, this.field3574, 0, -1, 0, (class215) null, 0);
        if (var13 != null) {
            var13.method90(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
            this.field3569 = var13.method81();
        }
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(I)V")
    public static final void method1506(int arg0) {
        field3576++;
        class118.field1781 = 0;
        class204.field3070 = 0;
        class70.method469(1);
        class276.method1831((byte) -50);
        class139.method858((byte) 125);
        for (int var1 = arg0; var1 < class204.field3070; var1++) {
            int var3 = class72.field1157[var1];
            if (class270.field4058 != class18.field220[var3].field2278) {
                if (class18.field220[var3].field959.method493(-115)) {
                    class191.method1200((byte) 89, class18.field220[var3]);
                }
                class18.field220[var3].method405((class72) null, (byte) 25);
                class18.field220[var3] = null;
            }
        }
        if (class202.field3050 != class100.field1580.field3748) {
            throw new RuntimeException("gnp1 pos:" + class100.field1580.field3748 + " psize:" + class202.field3050);
        }
        for (int var2 = 0; var2 < class24.field295; var2++) {
            if (class18.field220[class169.field2586[var2]] == null) {
                throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class24.field295);
            }
        }
    }
}
