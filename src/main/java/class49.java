import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("eh")
public class class49 {

    @OriginalMember(owner = "eh", name = "x", descriptor = "I")
    private int field1018 = 0;

    @OriginalMember(owner = "eh", name = "g", descriptor = "[Lhb;")
    private class71[] field1001;

    @OriginalMember(owner = "eh", name = "m", descriptor = "I")
    private int field1007;

    @OriginalMember(owner = "eh", name = "b", descriptor = "Llf;")
    public static class109 field996 = class35.method275("oberen Rand der Webseite ausw-=hlen)3", 2);

    @OriginalMember(owner = "eh", name = "h", descriptor = "Llf;")
    private static class109 field1002 = class35.method275("Your ignore list is full)3 Max of 100 users)3", 2);

    @OriginalMember(owner = "eh", name = "f", descriptor = "Llf;")
    public static class109 field1000 = field1002;

    @OriginalMember(owner = "eh", name = "n", descriptor = "I")
    public static int field1008 = 0;

    @OriginalMember(owner = "eh", name = "q", descriptor = "I")
    public static int field1011 = 0;

    @OriginalMember(owner = "eh", name = "k", descriptor = "Llf;")
    public static class109 field1005 = class35.method275("Der Anmelde)2Server ist offline)3", 2);

    @OriginalMember(owner = "eh", name = "i", descriptor = "I")
    public static int field1003;

    @OriginalMember(owner = "eh", name = "j", descriptor = "I")
    public static int field1004;

    @OriginalMember(owner = "eh", name = "l", descriptor = "I")
    public static int field1006;

    @OriginalMember(owner = "eh", name = "p", descriptor = "I")
    public static int field1010;

    @OriginalMember(owner = "eh", name = "r", descriptor = "I")
    public static int field1012;

    @OriginalMember(owner = "eh", name = "t", descriptor = "I")
    public static int field1014;

    @OriginalMember(owner = "eh", name = "a", descriptor = "I")
    public static int field995;

    @OriginalMember(owner = "eh", name = "c", descriptor = "I")
    public static int field997;

    @OriginalMember(owner = "eh", name = "d", descriptor = "I")
    public static int field998;

    @OriginalMember(owner = "eh", name = "e", descriptor = "I")
    public static int field999;

    @OriginalMember(owner = "eh", name = "v", descriptor = "J")
    private long field1016;

    @OriginalMember(owner = "eh", name = "u", descriptor = "Lhb;")
    private class71 field1015;

    @OriginalMember(owner = "eh", name = "w", descriptor = "Lhb;")
    private class71 field1017;

    @OriginalMember(owner = "eh", name = "o", descriptor = "Lke;")
    public static class99 field1009;

    @OriginalMember(owner = "eh", name = "s", descriptor = "[I")
    public static int[] field1013;

    @OriginalMember(owner = "eh", name = "a", descriptor = "(II)Z")
    public static final boolean method330(int arg0, int arg1) {
        if (arg0 != 1) {
            field1005 = null;
        }
        field1003++;
        return (arg1 >> 20 & 0x1) != 0;
    }

    @OriginalMember(owner = "eh", name = "a", descriptor = "(I)Lhb;")
    public final class71 method331(int arg0) {
        field1012++;
        if (this.field1015 == null) {
            return null;
        }
        class71 var2 = this.field1001[(int) (this.field1016 & (long) (this.field1007 + arg0))];
        while (this.field1015 != var2) {
            if (this.field1015.field1381 == this.field1016) {
                class71 var3 = this.field1015;
                this.field1015 = this.field1015.field1385;
                return var3;
            }
            this.field1015 = this.field1015.field1385;
        }
        this.field1015 = null;
        return null;
    }

    @OriginalMember(owner = "eh", name = "b", descriptor = "(I)V")
    public static void method332(int arg0) {
        field1009 = null;
        field996 = null;
        field1000 = null;
        field1002 = null;
        field1013 = null;
        field1005 = null;
        if (arg0 != -8917) {
            field1013 = null;
        }
    }

    @OriginalMember(owner = "eh", name = "b", descriptor = "(II)V")
    public static final void method333(int arg0, int arg1) {
        class8.field109 = 0;
        class72.field1394 = -1;
        field1014++;
        class88.field1839 = false;
        class72.field1404 = arg0;
        class84.field1711 = arg1;
        class145.field2803 = -1;
        class16.field302 = null;
    }

    @OriginalMember(owner = "eh", name = "a", descriptor = "([Lhb;I)I")
    public final int method334(class71[] arg0, int arg1) {
        field1006++;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1007; var4++) {
            class71 var5 = this.field1001[var4];
            for (class71 var6 = var5.field1385; var6 != var5; var6 = var6.field1385) {
                arg0[var3++] = var6;
            }
        }
        if (arg1 <= 85) {
            field996 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "eh", name = "c", descriptor = "(I)Lhb;")
    public final class71 method335(int arg0) {
        field998++;
        if (this.field1018 > 0 && this.field1001[this.field1018 - 1] != this.field1017) {
            class71 var2 = this.field1017;
            this.field1017 = var2.field1385;
            return var2;
        }
        while (this.field1007 > this.field1018) {
            class71 var3 = this.field1001[this.field1018++].field1385;
            if (this.field1001[this.field1018 - 1] != var3) {
                this.field1017 = var3.field1385;
                return var3;
            }
        }
        if (arg0 != 1) {
            this.method337(-110L, (byte) 111);
        }
        return null;
    }

    @OriginalMember(owner = "eh", name = "d", descriptor = "(I)I")
    public final int method336(int arg0) {
        field997++;
        int var2 = 0;
        for (int var3 = arg0; var3 < this.field1007; var3++) {
            class71 var4 = this.field1001[var3];
            class71 var5 = var4.field1385;
            while (var4 != var5) {
                var5 = var5.field1385;
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "eh", name = "a", descriptor = "(JB)Lhb;")
    public final class71 method337(long arg0, byte arg1) {
        field995++;
        if (arg1 >= -74) {
            method330(-78, -86);
        }
        this.field1016 = arg0;
        class71 var4 = this.field1001[(int) ((long) (this.field1007 - 1) & arg0)];
        for (this.field1015 = var4.field1385; this.field1015 != var4; this.field1015 = this.field1015.field1385) {
            if (this.field1015.field1381 == arg0) {
                class71 var5 = this.field1015;
                this.field1015 = this.field1015.field1385;
                return var5;
            }
        }
        this.field1015 = null;
        return null;
    }

    @OriginalMember(owner = "eh", name = "a", descriptor = "(B)Lhb;")
    public final class71 method338(byte arg0) {
        field999++;
        if (arg0 <= 60) {
            this.field1016 = 73L;
        }
        this.field1018 = 0;
        return this.method335(1);
    }

    @OriginalMember(owner = "eh", name = "a", descriptor = "(JZLhb;)V")
    public final void method339(long arg0, boolean arg1, class71 arg2) {
        field1010++;
        if (arg2.field1382 != null) {
            arg2.method452(true);
        }
        class71 var5 = this.field1001[(int) ((long) (this.field1007 - 1) & arg0)];
        arg2.field1385 = var5;
        arg2.field1382 = var5.field1382;
        arg2.field1382.field1385 = arg2;
        arg2.field1385.field1382 = arg2;
        if (arg1) {
            field1002 = null;
        }
        arg2.field1381 = arg0;
    }

    @OriginalMember(owner = "eh", name = "<init>", descriptor = "(I)V")
    public class49(int arg0) {
        this.field1001 = new class71[arg0];
        this.field1007 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class71 var3 = this.field1001[var2] = new class71();
            var3.field1385 = var3;
            var3.field1382 = var3;
        }
    }
}
