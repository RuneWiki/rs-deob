import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class115 extends class97 {

    @OriginalMember(owner = "client!t", name = "fb", descriptor = "I")
    private int field2896 = 0;

    @OriginalMember(owner = "client!t", name = "Q", descriptor = "Lke;")
    public static class65 field2881 = class1.method17("Wordpack geladen)3", -125);

    @OriginalMember(owner = "client!t", name = "ab", descriptor = "Lke;")
    public static class65 field2891 = class1.method17("Update)2Liste geladen)3", -124);

    @OriginalMember(owner = "client!t", name = "R", descriptor = "[[I")
    public static int[][] field2882 = new int[104][104];

    @OriginalMember(owner = "client!t", name = "S", descriptor = "I")
    public static int field2883 = 0;

    @OriginalMember(owner = "client!t", name = "Y", descriptor = "I")
    public static volatile int field2889 = 0;

    @OriginalMember(owner = "client!t", name = "db", descriptor = "I")
    public static int field2894 = 3353893;

    @OriginalMember(owner = "client!t", name = "ib", descriptor = "Lke;")
    private static class65 field2899 = class1.method17("red:", -116);

    @OriginalMember(owner = "client!t", name = "Z", descriptor = "Lke;")
    public static class65 field2890 = field2899;

    @OriginalMember(owner = "client!t", name = "kb", descriptor = "I")
    public static int field2901 = 0;

    @OriginalMember(owner = "client!t", name = "lb", descriptor = "Lke;")
    private static class65 field2902 = class1.method17("Login", -114);

    @OriginalMember(owner = "client!t", name = "nb", descriptor = "Lke;")
    public static class65 field2904 = class1.method17("backvmid3", -115);

    @OriginalMember(owner = "client!t", name = "eb", descriptor = "Lke;")
    public static class65 field2895 = field2902;

    @OriginalMember(owner = "client!t", name = "mb", descriptor = "Lke;")
    public static class65 field2903 = class1.method17("Mitteilung", -119);

    @OriginalMember(owner = "client!t", name = "T", descriptor = "I")
    public static int field2884;

    @OriginalMember(owner = "client!t", name = "U", descriptor = "I")
    public int field2885;

    @OriginalMember(owner = "client!t", name = "V", descriptor = "I")
    public static int field2886;

    @OriginalMember(owner = "client!t", name = "W", descriptor = "I")
    public int field2887;

    @OriginalMember(owner = "client!t", name = "X", descriptor = "I")
    public int field2888;

    @OriginalMember(owner = "client!t", name = "bb", descriptor = "I")
    public static int field2892;

    @OriginalMember(owner = "client!t", name = "cb", descriptor = "I")
    public int field2893;

    @OriginalMember(owner = "client!t", name = "gb", descriptor = "I")
    public static int field2897;

    @OriginalMember(owner = "client!t", name = "hb", descriptor = "I")
    public static int field2898;

    @OriginalMember(owner = "client!t", name = "jb", descriptor = "I")
    public static int field2900;

    @OriginalMember(owner = "client!t", name = "e", descriptor = "(I)V", line = 12)
    public static void method939(int arg0) {
        field2904 = null;
        field2903 = null;
        field2890 = null;
        field2891 = null;
        field2882 = null;
        field2881 = null;
        if (arg0 < -75) {
            field2895 = null;
            field2902 = null;
            field2899 = null;
        }
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(II)V", line = 47)
    private final void method940(int arg0, int arg1) {
        field2884++;
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = 0.0D;
        double var11 = var3;
        double var13 = var3;
        double var15 = 0.0D;
        if (var3 > var5) {
            var13 = var5;
        }
        if (var7 < var13) {
            var13 = var7;
        }
        if (var5 > var3) {
            var11 = var5;
        }
        if (var7 > var11) {
            var11 = var7;
        }
        if (arg1 < 123) {
            this.method943(11, (byte) -50, null, -43);
        }
        double var17 = (var11 + var13) / 2.0D;
        this.field2893 = (int) (var17 * 256.0D);
        if (this.field2893 < 0) {
            this.field2893 = 0;
        } else if (this.field2893 > 255) {
            this.field2893 = 255;
        }
        if (var11 != var13) {
            if (var17 < 0.5D) {
                var15 = (var11 - var13) / (var11 + var13);
            }
            if (var3 == var11) {
                var9 = (var5 - var7) / (var11 - var13);
            } else if (var5 == var11) {
                var9 = (var7 - var3) / (var11 - var13) + 2.0D;
            } else if (var7 == var11) {
                var9 = (var3 - var5) / (var11 - var13) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var13) / (2.0D - var11 - var13);
            }
        }
        this.field2887 = (int) (var15 * 256.0D);
        if (this.field2887 < 0) {
            this.field2887 = 0;
        } else if (this.field2887 > 255) {
            this.field2887 = 255;
        }
        if (var17 > 0.5D) {
            this.field2888 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field2888 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field2888 < 1) {
            this.field2888 = 1;
        }
        double var19 = var9 / 6.0D;
        this.field2885 = (int) ((double) this.field2888 * var19);
    }

    @OriginalMember(owner = "client!t", name = "f", descriptor = "(I)V", line = 137)
    public static final void method941(int arg0) {
        System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german]");
        System.exit(arg0);
        field2886++;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ILg;I)V", line = 146)
    public final void method942(int arg0, class39 arg1, int arg2) {
        field2900++;
        while (true) {
            int var4 = arg1.method334(arg2 + 8813);
            if (var4 == 0) {
                if (arg2 == -8704) {
                    return;
                } else {
                    this.method944(-117);
                    return;
                }
            }
            this.method943(arg0, (byte) 30, arg1, var4);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IBLg;I)V", line = 177)
    private final void method943(int arg0, byte arg1, class39 arg2, int arg3) {
        if (arg1 == 30) {
            field2897++;
            if (arg3 == 1) {
                this.field2896 = arg2.method308((byte) -118);
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "g", descriptor = "(I)V", line = 200)
    public final void method944(int arg0) {
        this.method940(this.field2896, arg0 + 124);
        if (arg0 != 0) {
            this.field2896 = 31;
        }
        field2892++;
    }
}
