import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public class class298 {

    @OriginalMember(owner = "client!es", name = "j", descriptor = "Z")
    public boolean field3897;

    @OriginalMember(owner = "client!es", name = "p", descriptor = "I")
    public int field3903;

    @OriginalMember(owner = "client!es", name = "c", descriptor = "I")
    public int field3890;

    @OriginalMember(owner = "client!es", name = "k", descriptor = "I")
    public int field3898;

    @OriginalMember(owner = "client!es", name = "l", descriptor = "S")
    public short field3899;

    @OriginalMember(owner = "client!es", name = "f", descriptor = "I")
    public int field3893;

    @OriginalMember(owner = "client!es", name = "e", descriptor = "S")
    public short field3892;

    @OriginalMember(owner = "client!es", name = "h", descriptor = "B")
    public byte field3895;

    @OriginalMember(owner = "client!es", name = "m", descriptor = "I")
    public int field3900;

    @OriginalMember(owner = "client!es", name = "b", descriptor = "S")
    public short field3889;

    @OriginalMember(owner = "client!es", name = "a", descriptor = "J")
    public static volatile long field3888 = 0L;

    @OriginalMember(owner = "client!es", name = "g", descriptor = "[I")
    public static int[] field3894 = new int[3];

    @OriginalMember(owner = "client!es", name = "r", descriptor = "I")
    public static int field3905 = 0;

    @OriginalMember(owner = "client!es", name = "d", descriptor = "Lju;")
    public static class102 field3891 = new class102(35, 11);

    @OriginalMember(owner = "client!es", name = "n", descriptor = "I")
    public static int field3901;

    @OriginalMember(owner = "client!es", name = "o", descriptor = "I")
    public static int field3902;

    @OriginalMember(owner = "client!es", name = "i", descriptor = "Z")
    public static boolean field3896;

    @OriginalMember(owner = "client!es", name = "q", descriptor = "[Lcw;")
    public static class21[] field3904;

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(B)V")
    public static void method1755(byte arg0) {
        field3894 = null;
        field3904 = null;
        field3891 = null;
        if (arg0 < 113) {
            method1757(true);
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(IIIIIZIIF)[[I")
    public static final int[][] method1756(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, float arg8) {
        field3902++;
        int[][] var9 = new int[arg4][arg0];
        class278 var10 = new class278();
        var10.field3721 = arg6;
        var10.field3705 = (int) (arg8 * 4096.0F);
        var10.field3714 = arg5;
        var10.field3703 = arg3;
        var10.field3717 = arg7;
        var10.method23((byte) 67);
        class68.method439(~arg1, arg0, arg4);
        for (int var11 = arg1; var11 < arg4; var11++) {
            var10.method1673(var11, (byte) -110, var9[var11]);
        }
        return var9;
    }

    @OriginalMember(owner = "client!es", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
    public class298(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field3897 = arg10;
        this.field3903 = arg11;
        this.field3890 = arg0;
        this.field3898 = arg2;
        this.field3899 = (short) arg4;
        this.field3893 = arg1;
        this.field3892 = (short) arg6;
        this.field3895 = (byte) arg8;
        this.field3900 = arg3;
        this.field3889 = (short) arg5;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(Z)V")
    public static final void method1757(boolean arg0) {
        field3901++;
        if (class97.field1410 == null) {
            class97.field1410 = class471.method2803(57);
            class666.field9389 = class97.field1410[0];
            class612.field8700 = class224.method1457((byte) -62);
        }
        if (class562.field7995 == null) {
            class24.method135(-2);
        }
        if (arg0) {
            return;
        }
        class471 var1 = class666.field9389;
        int var2 = class262.method1625((byte) 88);
        if (class666.field9389 == var1) {
            class451.field6196 = class666.field9389.field6435.method891(-2041650704, class369.field4721);
            if (class666.field9389.field6439) {
                class442.field6072 = (class666.field9389.field6429 - class666.field9389.field6432) * var2 / 100 + class666.field9389.field6432;
            }
            if (class666.field9389.field6428) {
                class451.field6196 = class451.field6196 + class442.field6072 + "%";
            }
        } else if (class666.field9389 == class471.field6463) {
            class562.field7995 = null;
            class647.method3754(3, true);
        } else {
            class451.field6196 = var1.field6438.method891(-2041650704, class369.field4721);
            if (class666.field9389.field6428) {
                class451.field6196 = class451.field6196 + var1.field6429 + "%";
            }
            class442.field6072 = var1.field6429;
            if (class666.field9389.field6439 || var1.field6439) {
                class612.field8700 = class224.method1457((byte) -62);
            }
        }
        if (class562.field7995 == null) {
            return;
        }
        class562.field7995.method1579(class442.field6072, class666.field9389, class451.field6196, class612.field8700, (byte) -127);
        if (class14.field199 == null) {
            return;
        }
        for (int var3 = class172.field2324 + 1; var3 < class14.field199.length; var3++) {
            if (class14.field199[var3].method252((byte) 40) >= 100 && (var3 - 1) == class172.field2324 && class213.field3004 >= 1 && class562.field7995.method1570(7)) {
                try {
                    class14.field199[var3].method256((byte) -105);
                } catch (Exception var4) {
                    class14.field199 = null;
                    return;
                }
                class562.field7995.method1580(class14.field199[var3], 1);
                class172.field2324++;
                if ((class14.field199.length - 1) <= class172.field2324 && class14.field199.length > 1) {
                    class172.field2324 = class374.field5165.method3717(0) ? 0 : -1;
                }
            }
        }
        return;
    }
}
