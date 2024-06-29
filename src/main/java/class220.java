import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class220 extends class418 {

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "I")
    private int field3451;

    @OriginalMember(owner = "client!bb", name = "m", descriptor = "I")
    private int field3454;

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "I")
    private int field3450;

    @OriginalMember(owner = "client!bb", name = "q", descriptor = "I")
    private int field3458;

    @OriginalMember(owner = "client!bb", name = "l", descriptor = "I")
    public static int field3453 = 0;

    @OriginalMember(owner = "client!bb", name = "u", descriptor = "Ls;")
    public static class186 field3462;

    @OriginalMember(owner = "client!bb", name = "v", descriptor = "[I")
    public static int[] field3463;

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!bb", name = "n", descriptor = "I")
    public static int field3455;

    @OriginalMember(owner = "client!bb", name = "o", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!bb", name = "p", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!bb", name = "r", descriptor = "I")
    public static int field3459;

    @OriginalMember(owner = "client!bb", name = "s", descriptor = "I")
    public static int field3460;

    @OriginalMember(owner = "client!bb", name = "t", descriptor = "I")
    public static int field3461;

    @OriginalMember(owner = "client!bb", name = "w", descriptor = "I")
    public static int field3464;

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(Z)V")
    public static void method1468(boolean arg0) {
        if (!arg0) {
            method1470(-22, -126);
        }
        field3462 = null;
        field3463 = null;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IZI)V")
    public final void method1302(int arg0, boolean arg1, int arg2) {
        ++field3457;
        int var4 = this.field3450 * arg0 >> 12;
        int var5 = this.field3454 * arg0 >> 12;
        int var6 = this.field3451 * arg2 >> 12;
        int var7 = this.field3458 * arg2 >> 12;
        class494.method2979(var4, super.field6295, var7, super.field6297, var5, var6, arg1);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lph;I)V")
    public static final void method1469(class459 arg0, int arg1) {
        class442.field6569 = arg0;
        if (arg1 != 712624332) {
            field3463 = null;
        }
        ++field3456;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(III)V")
    public final void method1301(int arg0, int arg1, int arg2) {
        ++field3461;
        int var4 = this.field3450 * arg1 >> 12;
        int var5 = -117 % ((arg0 - -67) / 57);
        int var6 = this.field3454 * arg1 >> 12;
        int var7 = this.field3451 * arg2 >> 12;
        int var8 = this.field3458 * arg2 >> 12;
        class186.method1270(var4, var7, false, super.field6297, super.field6295, super.field6294, var8, var6);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(BII)V")
    public final void method1300(byte arg0, int arg1, int arg2) {
        ++field3452;
        int var4 = this.field3450 * arg1 >> 12;
        int var5 = this.field3454 * arg1 >> 12;
        int var6 = this.field3451 * arg2 >> 12;
        int var7 = this.field3458 * arg2 >> 12;
        class459.method2762(var6, var4, var7, var5, (byte) 59, super.field6294);
        if (arg0 <= 12) {
            method1469((class459) null, 38);
        }
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(II)Leq;")
    public static final class143 method1470(int arg0, int arg1) {
        ++field3460;
        class143 var2 = (class143) class199.field3221.method2478(1, (long) arg1);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class204.field3269.method2757(0, arg1, (byte) -126);
            class143 var4 = new class143();
            if (var3 != null) {
                var4.method1068(true, new class289(var3));
            }
            var4.method1067((byte) -109);
            if (arg0 != -23658) {
                return null;
            } else {
                class199.field3221.method2472(110, var4, (long) arg1);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(BIIIIII)V")
    public static final void method1471(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field3459;
        int var7 = class73.method640(class216.field3415, (byte) -68, class372.field5455, arg3);
        int var8 = class73.method640(class216.field3415, (byte) -110, class372.field5455, arg6);
        int var9 = class73.method640(class43.field600, (byte) -69, class467.field6940, arg2);
        int var10 = class73.method640(class43.field600, (byte) -106, class467.field6940, arg5);
        int var11 = class73.method640(class216.field3415, (byte) -77, class372.field5455, arg3 - -arg4);
        int var12 = class73.method640(class216.field3415, (byte) -73, class372.field5455, -arg4 + arg6);
        for (int var13 = var7; ~var13 > ~var11; ++var13) {
            class503.method3027(var9, (byte) 127, var10, arg1, class316.field4797[var13]);
        }
        for (int var14 = var8; var12 < var14; --var14) {
            class503.method3027(var9, (byte) 127, var10, arg1, class316.field4797[var14]);
        }
        int var15 = class73.method640(class43.field600, (byte) -85, class467.field6940, arg2 + arg4);
        int var16 = class73.method640(class43.field600, (byte) -74, class467.field6940, -arg4 + arg5);
        int var17 = var11;
        if (arg0 == -49) {
            while (~var17 >= ~var12) {
                int[] var18 = class316.field4797[var17];
                class503.method3027(var9, (byte) 127, var15, arg1, var18);
                class503.method3027(var16, (byte) 127, var10, arg1, var18);
                ++var17;
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(IIIIIII)V")
    public class220(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field3451 = arg1;
        this.field3454 = arg2;
        this.field3450 = arg0;
        this.field3458 = arg3;
    }

    static {
        new class309("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes dans aucun canal à l'heure actuelle.", "No momento você não está em um canal.");
        field3462 = new class186(33, 20);
        field3463 = new int[100];
        new class309("Unable to add name - system busy.", "Der Name konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un nom - système occupé.", "Não foi possível adicionar o nome. O sistema está ocupado.");
    }
}
