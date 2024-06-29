import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public class class184 {

    @OriginalMember(owner = "client!dt", name = "c", descriptor = "Ljs;")
    private class117 field2670 = new class117();

    @OriginalMember(owner = "client!dt", name = "n", descriptor = "Lot;")
    private class255 field2681 = new class255();

    @OriginalMember(owner = "client!dt", name = "o", descriptor = "I")
    private int field2682;

    @OriginalMember(owner = "client!dt", name = "l", descriptor = "I")
    private int field2679;

    @OriginalMember(owner = "client!dt", name = "m", descriptor = "Lsq;")
    private class454 field2680;

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "I")
    public static int field2669 = 0;

    @OriginalMember(owner = "client!dt", name = "e", descriptor = "D")
    public static double field2672 = -1.0D;

    @OriginalMember(owner = "client!dt", name = "i", descriptor = "Lfn;")
    public static class52 field2676 = new class52(35, 8);

    @OriginalMember(owner = "client!dt", name = "j", descriptor = "Ljava/lang/String;")
    public static String field2677 = "";

    @OriginalMember(owner = "client!dt", name = "k", descriptor = "Z")
    public static boolean field2678 = false;

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "I")
    public static int field2668;

    @OriginalMember(owner = "client!dt", name = "d", descriptor = "I")
    public static int field2671;

    @OriginalMember(owner = "client!dt", name = "f", descriptor = "I")
    public static int field2673;

    @OriginalMember(owner = "client!dt", name = "g", descriptor = "I")
    public static int field2674;

    @OriginalMember(owner = "client!dt", name = "h", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(Z)V")
    public static void method1203(boolean arg0) {
        field2676 = null;
        field2677 = null;
        if (arg0) {
            field2669 = 122;
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(III)Lpi;")
    public static final class467 method1204(int arg0, int arg1, int arg2) {
        class406 var3 = class455.field6293[arg0][arg1][arg2];
        return var3 == null ? null : var3.field5624;
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(Lkm;Lcj;IIII)V")
    public static final void method1205(class487 arg0, class475 arg1, int arg2, int arg3, int arg4, int arg5) {
        field2668++;
        if (arg5 != 4) {
            field2669 = 33;
        }
        class78 var6 = class425.field5861.method377((byte) 75, arg1.field6702);
        if (var6.field1175 == -1) {
            return;
        }
        int var8;
        if (arg1.field6646) {
            int var7 = arg1.field6722 + arg2;
            var8 = var7 & 0x3;
        } else {
            var8 = 0;
        }
        class385 var9 = var6.method537(57, var8, arg1.field6664, arg0);
        if (var9 == null) {
            return;
        }
        int var10 = arg1.field6708;
        int var11 = arg1.field6714;
        if ((var8 & 0x1) == 1) {
            var11 = arg1.field6708;
            var10 = arg1.field6714;
        }
        int var12 = var9.method382();
        int var13 = var9.method389();
        if (var6.field1176) {
            var12 = var10 * 4;
            var13 = var11 * 4;
        }
        if (var6.field1178 == 0) {
            var9.method2297(arg4, arg3 + 4 - (var11 * 4), var12, var13);
        } else {
            var9.method384(arg4, arg3 + 4 - (var11 * 4), var12, var13, 1, var6.field1178 | 0xFF000000, 1);
        }
    }

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "(Z)V")
    public final void method1206(boolean arg0) {
        this.field2681.method1586((byte) -25);
        field2673++;
        if (!arg0) {
            this.field2680.method2623((byte) 85);
            this.field2670 = new class117();
            this.field2679 = this.field2682;
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(IJLjs;)V")
    public final void method1207(int arg0, long arg1, class117 arg2) {
        field2674++;
        if (~this.field2679 == arg0) {
            class117 var5 = this.field2681.method1589(0);
            var5.method1182(28818);
            var5.method738(-13002);
            if (this.field2670 == var5) {
                class117 var6 = this.field2681.method1589(0);
                var6.method1182(28818);
                var6.method738(arg0 ^ 0x32C9);
            }
        } else {
            this.field2679--;
        }
        this.field2680.method2620(arg1, arg2, false);
        this.field2681.method1584(78, arg2);
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(JI)Ljava/lang/String;")
    public static final String method1208(long arg0, int arg1) {
        field2675++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if (arg0 % 37L == 0L) {
            return null;
        } else {
            int var3 = 0;
            if (arg1 >= -50) {
                field2672 = 0.552565090346753D;
            }
            long var4 = arg0;
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg0 != 0L) {
                long var7 = arg0;
                arg0 /= 37L;
                var6.append(class374.field5294[(int) (var7 - (arg0 * 37L))]);
            }
            return var6.reverse().toString();
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(ZJ)Ljs;")
    public final class117 method1209(boolean arg0, long arg1) {
        if (arg0) {
            this.method1209(false, -98L);
        }
        field2671++;
        class117 var4 = (class117) this.field2680.method2614(arg1, -88);
        if (var4 != null) {
            this.field2681.method1584(112, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!dt", name = "<init>", descriptor = "(I)V")
    public class184(int arg0) {
        this.field2682 = arg0;
        this.field2679 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field2680 = new class454(var2);
    }

    static {
        new class112("You are not allowed to talk in this clan channel.", "Du darfst in diesem Chatraum nicht reden.", "Vous n'êtes pas autorisé à parler dans ce canal de clan.", "Você não tem permissão para conversar neste canal de clã.");
    }
}
