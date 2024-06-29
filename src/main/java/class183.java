import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class183 extends class90 {

    @OriginalMember(owner = "client!lb", name = "T", descriptor = "I")
    public int field2619 = 0;

    @OriginalMember(owner = "client!lb", name = "L", descriptor = "I")
    public static int field2611 = 0;

    @OriginalMember(owner = "client!lb", name = "H", descriptor = "Ljava/lang/String;")
    public static String field2607 = "Take";

    @OriginalMember(owner = "client!lb", name = "R", descriptor = "Ljava/lang/String;")
    public static String field2617 = "Members object";

    @OriginalMember(owner = "client!lb", name = "J", descriptor = "[I")
    public static int[] field2609 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!lb", name = "N", descriptor = "I")
    public static int field2613 = 0;

    @OriginalMember(owner = "client!lb", name = "S", descriptor = "I")
    public static int field2618 = -1;

    @OriginalMember(owner = "client!lb", name = "Q", descriptor = "[I")
    public static int[] field2616 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!lb", name = "F", descriptor = "I")
    public static int field2606;

    @OriginalMember(owner = "client!lb", name = "I", descriptor = "I")
    public static int field2608;

    @OriginalMember(owner = "client!lb", name = "K", descriptor = "I")
    public static int field2610;

    @OriginalMember(owner = "client!lb", name = "M", descriptor = "I")
    public static int field2612;

    @OriginalMember(owner = "client!lb", name = "O", descriptor = "I")
    public static int field2614;

    @OriginalMember(owner = "client!lb", name = "P", descriptor = "I")
    public static int field2615;

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "(I)V")
    public static void method1179(int arg0) {
        field2616 = null;
        field2607 = null;
        field2617 = null;
        if (arg0 != -24203) {
            method1179(-84);
        }
        field2609 = null;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILkl;)V")
    public final void method1180(int arg0, class114 arg1) {
        int var3 = 69 / ((arg0 - 16) / 45);
        field2614++;
        while (true) {
            int var4 = arg1.method760(false);
            if (var4 == 0) {
                return;
            }
            this.method1183(128, arg1, var4);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IBI[II)V")
    public static final void method1181(int arg0, byte arg1, int arg2, int[] arg3, int arg4) {
        arg4--;
        field2606++;
        int var6 = arg2 - 1;
        int var5 = var6 - 7;
        while (arg4 < var5) {
            int var7 = arg4 + 1;
            arg3[var7] = arg0;
            int var8 = var7 + 1;
            arg3[var8] = arg0;
            int var9 = var8 + 1;
            arg3[var9] = arg0;
            int var10 = var9 + 1;
            arg3[var10] = arg0;
            int var11 = var10 + 1;
            arg3[var11] = arg0;
            int var12 = var11 + 1;
            arg3[var12] = arg0;
            int var13 = var12 + 1;
            arg3[var13] = arg0;
            arg4 = var13 + 1;
            arg3[arg4] = arg0;
        }
        while (arg4 < var6) {
            arg4++;
            arg3[arg4] = arg0;
        }
        if (arg1 != -69) {
            method1179(-86);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BLwg;Lwg;)V")
    public static final void method1182(byte arg0, class254 arg1, class254 arg2) {
        field2608++;
        if (arg0 != -53) {
            method1181(-1, (byte) 106, -107, (int[]) null, 90);
        }
        if (arg1.field3860 != null) {
            arg1.method1706(-111);
        }
        arg1.field3859 = arg2;
        arg1.field3860 = arg2.field3860;
        arg1.field3860.field3859 = arg1;
        arg1.field3859.field3860 = arg1;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILkl;I)V")
    private final void method1183(int arg0, class114 arg1, int arg2) {
        if (arg2 == 2) {
            this.field2619 = arg1.method756(arg0 - 30029);
        }
        if (arg0 != 128) {
            this.method1180(-12, (class114) null);
        }
        field2610++;
    }
}
