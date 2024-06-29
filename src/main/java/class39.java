import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public abstract class class39 {

    @OriginalMember(owner = "client!de", name = "i", descriptor = "[I")
    public static int[] field815 = new int[128];

    @OriginalMember(owner = "client!de", name = "p", descriptor = "[S")
    public static short[] field822 = new short[256];

    @OriginalMember(owner = "client!de", name = "f", descriptor = "I")
    public static int field812 = 0;

    @OriginalMember(owner = "client!de", name = "r", descriptor = "Ldc;")
    private static class37 field824 = class185.method1233((byte) 86, "Take");

    @OriginalMember(owner = "client!de", name = "g", descriptor = "Ldc;")
    public static class37 field813 = class185.method1233((byte) 86, "settings=");

    @OriginalMember(owner = "client!de", name = "h", descriptor = "Ldc;")
    public static class37 field814 = field824;

    @OriginalMember(owner = "client!de", name = "o", descriptor = "Ldc;")
    public static class37 field821 = class185.method1233((byte) 86, "mapdots");

    @OriginalMember(owner = "client!de", name = "d", descriptor = "Ldc;")
    public static class37 field810 = class185.method1233((byte) 86, "sl_button");

    @OriginalMember(owner = "client!de", name = "j", descriptor = "Lvh;")
    public static class235 field816 = new class235();

    @OriginalMember(owner = "client!de", name = "a", descriptor = "I")
    public static int field807;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "I")
    public static int field809;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "I")
    public static int field811;

    @OriginalMember(owner = "client!de", name = "l", descriptor = "I")
    public static int field818;

    @OriginalMember(owner = "client!de", name = "m", descriptor = "I")
    public static int field819;

    @OriginalMember(owner = "client!de", name = "q", descriptor = "I")
    public static int field823;

    @OriginalMember(owner = "client!de", name = "k", descriptor = "Lwa;")
    public static class238 field817;

    @OriginalMember(owner = "client!de", name = "n", descriptor = "Lwa;")
    public static class238 field820;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "[[[I")
    public static int[][][] field808;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IBI)I")
    public abstract int method85(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Z)V")
    public static void method351(boolean arg0) {
        field821 = null;
        field820 = null;
        field822 = null;
        if (!arg0) {
            method353(null, -116);
        }
        field824 = null;
        field814 = null;
        field815 = null;
        field816 = null;
        field817 = null;
        field813 = null;
        field808 = null;
        field810 = null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
    public abstract void method86(int arg0);

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(II)Z")
    public static final boolean method352(int arg0, int arg1) {
        field823++;
        if (class119.field2133[arg1]) {
            return true;
        } else if (class225.field4163.method1555((byte) -120, arg1)) {
            int var2 = class225.field4163.method1559(26143, arg1);
            if (var2 == 0) {
                class119.field2133[arg1] = true;
                return true;
            }
            if (class177.field3344[arg1] == null) {
                class177.field3344[arg1] = new class136[var2];
            }
            if (arg0 != -10924) {
                return false;
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class177.field3344[arg1][var3] == null) {
                    byte[] var4 = class225.field4163.method1547(var3, 0, arg1);
                    if (var4 != null) {
                        class177.field3344[arg1][var3] = new class136();
                        class177.field3344[arg1][var3].field2608 = (arg1 << 16) + var3;
                        if (var4[0] == -1) {
                            class177.field3344[arg1][var3].method950(new class28(var4), 1);
                        } else {
                            class177.field3344[arg1][var3].method944(20, new class28(var4));
                        }
                    }
                }
            }
            class119.field2133[arg1] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "([BI)V")
    public static final void method353(byte[] arg0, int arg1) {
        field819++;
        class28 var2 = new class28(arg0);
        int var3 = var2.method230((byte) -121);
        for (int var4 = 0; var4 < var3; var4++) {
            class141 var6 = new class141();
            class37 var7 = var2.method180(2);
            var6.field2728 = var2.method230((byte) -117);
            var6.field2731 = var2.method230((byte) -120);
            var6.field2721 = var2.method215(-1797813752);
            var6.field2727 = var7.method340(32, 47, 0);
            var6.field2724 = var7.method331(false, 47);
            class37.field788.method1340(-100, var6);
        }
        int var5 = -1 % ((-arg1 - 24) / 32);
    }
}
