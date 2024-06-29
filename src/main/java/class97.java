import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class97 {

    @OriginalMember(owner = "client!qc", name = "l", descriptor = "Lja;")
    private class55 field2075 = new class55();

    @OriginalMember(owner = "client!qc", name = "v", descriptor = "Loa;")
    private class85 field2085 = new class85();

    @OriginalMember(owner = "client!qc", name = "w", descriptor = "I")
    private int field2086;

    @OriginalMember(owner = "client!qc", name = "t", descriptor = "I")
    private int field2083;

    @OriginalMember(owner = "client!qc", name = "u", descriptor = "Lba;")
    private class8 field2084;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
    public static int field2064 = 0;

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "I")
    public static int field2073 = 0;

    @OriginalMember(owner = "client!qc", name = "n", descriptor = "I")
    public static int field2077 = 0;

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "Lo;")
    public static class84 field2074 = class15.method124(" (Xskill)2", 255);

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "Lwc;")
    public static class127 field2070 = new class127(5000);

    @OriginalMember(owner = "client!qc", name = "y", descriptor = "Lo;")
    public static class84 field2088 = class15.method124(")3", 255);

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
    public static int field2065;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "I")
    public static int field2067;

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
    public static int field2069;

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "I")
    public static int field2072;

    @OriginalMember(owner = "client!qc", name = "m", descriptor = "I")
    public static int field2076;

    @OriginalMember(owner = "client!qc", name = "o", descriptor = "I")
    public static int field2078;

    @OriginalMember(owner = "client!qc", name = "p", descriptor = "I")
    public static int field2079;

    @OriginalMember(owner = "client!qc", name = "r", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!qc", name = "s", descriptor = "I")
    public static int field2082;

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "Lwd;")
    public static class128 field2071;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "Lp;")
    public static class89 field2068;

    @OriginalMember(owner = "client!qc", name = "q", descriptor = "Lp;")
    public static class89 field2080;

    @OriginalMember(owner = "client!qc", name = "x", descriptor = "Lqd;")
    public static class98 field2087;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(JB)Lja;", line = 19)
    public final class55 method737(long arg0, byte arg1) {
        field2069++;
        if (arg1 >= -71) {
            this.field2083 = -10;
        }
        class55 var4 = (class55) this.field2084.method66(124, arg0);
        if (var4 != null) {
            this.field2085.method672(var4, (byte) 98);
        }
        return var4;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIII)I", line = 43)
    public static final int method738(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = 65536 - class7.field124[arg0 * 1024 / arg3] >> arg1;
        field2076++;
        return ((65536 - var5) * arg2 >> 16) + (arg4 * var5 >> 16);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IJ)V", line = 55)
    public final void method739(int arg0, long arg1) {
        if (arg0 != 1) {
            method745((byte) 70, null);
        }
        field2065++;
        class55 var4 = (class55) this.field2084.method66(120, arg1);
        if (var4 != null) {
            var4.method333(0);
            var4.method461(arg0 ^ 0xFFFFFF8F);
            this.field2086++;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V", line = 75)
    public static void method740(int arg0) {
        field2070 = null;
        field2087 = null;
        field2088 = null;
        if (arg0 == -30466) {
            field2074 = null;
            field2071 = null;
            field2068 = null;
            field2080 = null;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lud;Lud;I)V", line = 92)
    public static final void method741(class118 arg0, class118 arg1, int arg2) {
        class63.field1326 = arg0;
        if (arg2 == -24414) {
            class111.field2402 = arg1;
            field2081++;
        }
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)V", line = 119)
    public final void method742(int arg0) {
        if (arg0 != 4) {
            method738(71, 87, -34, 78, 114);
        }
        field2066++;
        while (true) {
            class55 var2 = this.field2085.method673(arg0 + 26431);
            if (var2 == null) {
                this.field2086 = this.field2083;
                return;
            }
            var2.method333(0);
            var2.method461(-118);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)V", line = 163)
    public static final void method743(byte arg0) {
        field2072++;
        if (arg0 != 83 || class105.field2225 != 1) {
            return;
        }
        if (class128.field2820 >= 6 && class128.field2820 <= 106 && class109.field2367 >= 467 && class109.field2367 <= 499) {
            class61.field1271 = true;
            class28.field550 = (class28.field550 + 1) % 4;
            class84.field1889++;
            class85.field1927 = true;
            field2070.method979(arg0 ^ 0x52, 132);
            field2070.method226(arg0 ^ 0xFFFFDA01, class28.field550);
            field2070.method226(-9646, class125.field2771);
            field2070.method226(-9646, class123.field2756);
        }
        if (class128.field2820 >= 135 && class128.field2820 <= 235 && class109.field2367 >= 467 && class109.field2367 <= 499) {
            class85.field1927 = true;
            class61.field1271 = true;
            class84.field1889++;
            class125.field2771 = (class125.field2771 + 1) % 3;
            field2070.method979(1, 132);
            field2070.method226(-9646, class28.field550);
            field2070.method226(arg0 ^ 0xFFFFDA01, class125.field2771);
            field2070.method226(-9646, class123.field2756);
        }
        if (class128.field2820 >= 273 && class128.field2820 <= 373 && class109.field2367 >= 467 && class109.field2367 <= 499) {
            class123.field2756 = (class123.field2756 + 1) % 3;
            class61.field1271 = true;
            class84.field1889++;
            class85.field1927 = true;
            field2070.method979(1, 132);
            field2070.method226(-9646, class28.field550);
            field2070.method226(-9646, class125.field2771);
            field2070.method226(-9646, class123.field2756);
        }
        if (class128.field2820 < 412 || class128.field2820 > 512 || class109.field2367 < 467 || class109.field2367 > 499) {
            return;
        }
        if (class27.field528 != -1) {
            class67.method514(0, class73.field1524, class113.field2441, true);
            return;
        }
        class71.method523(arg0 - 211);
        if (class40.field820 != -1) {
            class63.field1321 = false;
            class73.field1528 = class73.field1524;
            class88.field1990 = class27.field528 = class40.field820;
            return;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IJLja;)V", line = 232)
    public final void method744(int arg0, long arg1, class55 arg2) {
        field2079++;
        if (this.field2086 == 0) {
            class55 var5 = this.field2085.method673(26435);
            var5.method333(0);
            var5.method461(52);
            if (this.field2075 == var5) {
                class55 var6 = this.field2085.method673(26435);
                var6.method333(0);
                var6.method461(-47);
            }
        } else {
            this.field2086--;
        }
        if (arg0 <= -119) {
            this.field2084.method71(126, arg2, arg1);
            this.field2085.method672(arg2, (byte) 98);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(BLjava/awt/Graphics;)V", line = 262)
    public static final void method745(byte arg0, Graphics arg1) {
        class3.field38.method705(0, arg1, 4, 4);
        if (arg0 < -46) {
            field2078++;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I[Lo;)Lo;", line = 277)
    public static final class84 method746(int arg0, class84[] arg1) {
        if (arg0 != 0) {
            field2067 = 60;
        }
        field2082++;
        if (arg1.length < 2) {
            throw new IllegalArgumentException();
        }
        return class116.method892(arg1, 0, arg0 + 8526, arg1.length);
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(I)V", line = 320)
    public class97(int arg0) {
        this.field2086 = arg0;
        this.field2083 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2084 = new class8(var2);
    }
}
