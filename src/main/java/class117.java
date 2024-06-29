import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class117 {

    @OriginalMember(owner = "client!mm", name = "k", descriptor = "Lkc;")
    private class51 field2066 = new class51();

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "[I")
    public static int[] field2058 = new int[100];

    @OriginalMember(owner = "client!mm", name = "i", descriptor = "Lhi;")
    public static class82 field2064 = class95.method664((byte) -67, "Examiner");

    @OriginalMember(owner = "client!mm", name = "h", descriptor = "Lhi;")
    public static class82 field2063 = class95.method664((byte) -74, ":");

    @OriginalMember(owner = "client!mm", name = "m", descriptor = "Lhi;")
    public static class82 field2068 = class95.method664((byte) -38, "Clientscript error in: ");

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "I")
    public static int field2056;

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "I")
    public static int field2060;

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!mm", name = "g", descriptor = "I")
    public static int field2062;

    @OriginalMember(owner = "client!mm", name = "j", descriptor = "I")
    public static int field2065;

    @OriginalMember(owner = "client!mm", name = "l", descriptor = "I")
    public static int field2067;

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "Ljg;")
    public static class140 field2057;

    @OriginalMember(owner = "client!mm", name = "n", descriptor = "Lkc;")
    private class51 field2069;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)V", line = 4)
    public static void method796(int arg0) {
        if (arg0 != 1) {
            field2063 = (class82) null;
        }
        field2068 = null;
        field2058 = null;
        field2064 = null;
        field2063 = null;
        field2057 = null;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(ZLak;Z)V", line = 19)
    public static final void method797(boolean arg0, class146 arg1, boolean arg2) {
        field2067++;
        if (!arg0) {
            method796(125);
        }
        int var3 = arg1.field2474;
        int var4 = (int) arg1.field2418;
        arg1.method961((byte) 124);
        if (arg2) {
            class38.method298(var3, 0);
        }
        class243.method1744((byte) 46, var3);
        class75 var5 = class282.method1965(var4, (byte) 6);
        if (var5 != null) {
            class138.method937(var5, 16);
        }
        int var6 = class309.field5262;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class34.method262(-116, class135.field2333[var7])) {
                class243.method1745(var7, 1);
            }
        }
        if (class309.field5262 == 1) {
            class187.field3153 = false;
            class143.method977(class33.field495, class88.field1563, class164.field2874, true, class28.field367);
        } else {
            class143.method977(class33.field495, class88.field1563, class164.field2874, arg0, class28.field367);
            int var8 = class253.field4354.method124(class287.field4831);
            for (int var9 = 0; var9 < class309.field5262; var9++) {
                int var10 = class253.field4354.method124(class207.method1484(var9, (byte) 120));
                if (var10 > var8) {
                    var8 = var10;
                }
            }
            class164.field2874 = class309.field5262 * 15 + 22;
            class88.field1563 = var8 + 8;
        }
        if (class255.field4382 != -1) {
            class143.method976(class255.field4382, 256, 1);
        }
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(I)I", line = 100)
    public final int method798(int arg0) {
        int var2 = 0;
        field2061++;
        class51 var3 = this.field2066.field836;
        while (this.field2066 != var3) {
            var3 = var3.field836;
            var2++;
        }
        if (arg0 != 21644) {
            this.method802((byte) -76);
        }
        return var2;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(B)V", line = 125)
    public final void method799(byte arg0) {
        while (true) {
            class51 var2 = this.field2066.field836;
            if (this.field2066 == var2) {
                field2056++;
                this.field2069 = null;
                if (arg0 != 39) {
                    field2058 = (int[]) null;
                }
                return;
            }
            var2.method358((byte) 52);
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(BLkc;)V", line = 158)
    public final void method800(byte arg0, class51 arg1) {
        if (arg1.field831 != null) {
            arg1.method358((byte) 52);
        }
        field2065++;
        int var3 = 69 / ((40 - arg0) / 50);
        arg1.field831 = this.field2066.field831;
        arg1.field836 = this.field2066;
        arg1.field831.field836 = arg1;
        arg1.field836.field831 = arg1;
    }

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "(I)Lkc;", line = 180)
    public final class51 method801(int arg0) {
        field2060++;
        class51 var2 = this.field2066.field836;
        if (arg0 != 100) {
            method796(122);
        }
        if (this.field2066 == var2) {
            return null;
        } else {
            var2.method358((byte) 52);
            return var2;
        }
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(B)Lkc;", line = 200)
    public final class51 method802(byte arg0) {
        class51 var2 = this.field2069;
        field2059++;
        if (arg0 != -71) {
            return (class51) null;
        } else if (this.field2066 == var2) {
            this.field2069 = null;
            return null;
        } else {
            this.field2069 = var2.field836;
            return var2;
        }
    }

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "(B)Lkc;", line = 237)
    public final class51 method803(byte arg0) {
        field2062++;
        if (arg0 != 97) {
            field2057 = (class140) null;
        }
        class51 var2 = this.field2066.field836;
        if (this.field2066 == var2) {
            this.field2069 = null;
            return null;
        } else {
            this.field2069 = var2.field836;
            return var2;
        }
    }

    @OriginalMember(owner = "client!mm", name = "<init>", descriptor = "()V", line = 259)
    public class117() {
        this.field2066.field831 = this.field2066;
        this.field2066.field836 = this.field2066;
    }
}
