import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class227 extends class21 {

    @OriginalMember(owner = "client!bn", name = "T", descriptor = "I")
    private int field3591 = 4096;

    @OriginalMember(owner = "client!bn", name = "N", descriptor = "Ljava/lang/String;")
    public static String field3585 = "skill: ";

    @OriginalMember(owner = "client!bn", name = "O", descriptor = "Lab;")
    public static class279 field3586 = new class279(64);

    @OriginalMember(owner = "client!bn", name = "S", descriptor = "Ljava/lang/String;")
    public static String field3590 = "Loaded title screen";

    @OriginalMember(owner = "client!bn", name = "U", descriptor = "I")
    public static int field3592 = 0;

    @OriginalMember(owner = "client!bn", name = "W", descriptor = "Z")
    public static boolean field3594 = false;

    @OriginalMember(owner = "client!bn", name = "P", descriptor = "I")
    public static int field3587;

    @OriginalMember(owner = "client!bn", name = "Q", descriptor = "I")
    public static int field3588;

    @OriginalMember(owner = "client!bn", name = "R", descriptor = "I")
    public static int field3589;

    @OriginalMember(owner = "client!bn", name = "V", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!bn", name = "X", descriptor = "Lkl;")
    public static class68 field3595;

    @OriginalMember(owner = "client!bn", name = "<init>", descriptor = "()V", line = 6)
    public class227() {
        super(1, true);
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IILag;)V", line = 14)
    public final void method178(int arg0, int arg1, class202 arg2) {
        field3588++;
        if (arg0 == -318 && arg1 == 0) {
            this.field3591 = arg2.method1315(14289);
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(II)[I", line = 32)
    public final int[] method177(int arg0, int arg1) {
        int var3 = -8 / ((arg0 - 33) / 36);
        field3587++;
        int[] var4 = this.field443.method1040(arg1, false);
        if (this.field443.field2637) {
            int[] var5 = this.method171(0, -71, arg1 - 1 & class204.field3323);
            int[] var6 = this.method171(0, -80, arg1);
            int[] var7 = this.method171(0, 127, class204.field3323 & arg1 + 1);
            for (int var8 = 0; var8 < class294.field4489; var8++) {
                int var9 = (var7[var8] - var5[var8]) * this.field3591;
                int var10 = var9 >> 12;
                int var11 = (var6[var8 + 1 & class4.field108] - var6[var8 - 1 & class4.field108]) * this.field3591;
                int var12 = var11 >> 12;
                int var13 = var12 * var12 >> 12;
                int var14 = var10 * var10 >> 12;
                int var15 = (int) (Math.sqrt((double) ((float) (var13 + var14 + 4096) / 4096.0F)) * 4096.0D);
                int var16 = var15 == 0 ? 0 : 16777216 / var15;
                var4[var8] = 4096 - var16;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IBLjava/lang/String;)V", line = 83)
    public static final void method1511(String arg0, String arg1, int arg2, byte arg3, String arg4) {
        int var5 = -24 % ((arg3 + 7) / 38);
        field3589++;
        class234.method1557(arg4, arg0, arg1, arg2, 61, -1);
    }

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "(I)V", line = 92)
    public static void method1512(int arg0) {
        field3595 = null;
        field3586 = null;
        field3585 = null;
        field3590 = null;
        if (arg0 != 4096) {
            method1512(44);
        }
    }
}
