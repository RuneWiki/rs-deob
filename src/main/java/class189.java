import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class189 {

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "I")
    public int field2682 = 43594;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "Z")
    public boolean field2678 = false;

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "I")
    public int field2685 = 443;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "I")
    public static int field2677 = -2;

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "Lml;")
    public static class325 field2684;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "I")
    public static int field2679;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
    public int field2680;

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "I")
    public static int field2683;

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "I")
    public static int field2687;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "Lbf;")
    public static class458 field2681;

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "Ljava/lang/String;")
    public String field2686;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZIIIIILan;)V")
    public static final void method1177(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class21 arg6) {
        field2683++;
        class503.field6996 = arg0;
        class291.field4011 = arg6;
        class467.field6585 = arg2;
        class47.field903 = arg4;
        class587.field8397 = arg3;
        class5.field70 = arg5;
        class112.field1726 = 1;
        if (arg1 != 616) {
            method1179(54, -103, -82, 85, null);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)I")
    public final int method1178(int arg0) {
        if (arg0 == 12623) {
            field2679++;
            return this.field2678 ? this.field2685 : this.field2682;
        } else {
            return -2;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIILfq;)V")
    public static final void method1179(int arg0, int arg1, int arg2, int arg3, class171 arg4) {
        class622 var5 = class452.method2656(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        int var6 = 0;
        arg4.field2473 = (arg1 << class272.field3786) + class194.field2745;
        arg4.field2470 = arg3;
        arg4.field2469 = (arg2 << class272.field3786) + class194.field2745;
        for (class559 var7 = var5.field8973; var7 != null; var7 = var7.field7736) {
            if (var7.field7742.field6033) {
                int var8 = var7.field7742.method492(0);
                if (var8 != -32768 && var8 < var6) {
                    var6 = var8;
                }
            }
        }
        if (var6 < 0) {
            arg4.field2470 += var6;
            arg4.field2468 = true;
        } else if (var5.field8979 != null) {
            arg4.field2470 -= var5.field8979.field2793;
        }
        var5.field8974 = arg4;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)V")
    public static void method1180(byte arg0) {
        field2681 = null;
        field2684 = null;
        if (arg0 > -74) {
            method1179(-15, -7, -79, 35, null);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lqb;B)Z")
    public final boolean method1181(class189 arg0, byte arg1) {
        field2687++;
        if (arg1 < 55) {
            method1180((byte) -72);
        }
        if (arg0 == null) {
            return false;
        } else {
            return this.field2680 == arg0.field2680 && this.field2686.equals(arg0.field2686);
        }
    }

    static {
        new class104("Unable to join clan chat at this time - please try again later!", "Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Impossible de participer à une discussion de clan pour le moment - veuillez réessayer ultérieurement.", "Não foi possível entrar no bate-papo do clã dessa vez. Tente de novo depois!");
        field2684 = new class325(8, 17);
    }
}
