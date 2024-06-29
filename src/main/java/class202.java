import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class202 {

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "I")
    private int field3900 = -1;

    @OriginalMember(owner = "client!ud", name = "m", descriptor = "I")
    private int field3907 = 0;

    @OriginalMember(owner = "client!ud", name = "u", descriptor = "Lof;")
    private class145 field3915 = new class145();

    @OriginalMember(owner = "client!ud", name = "E", descriptor = "Z")
    public boolean field3925 = false;

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "[[[I")
    private int[][][] field3898;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "I")
    private int field3897;

    @OriginalMember(owner = "client!ud", name = "A", descriptor = "[Lc;")
    private class21[] field3921;

    @OriginalMember(owner = "client!ud", name = "D", descriptor = "I")
    private int field3924;

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "Lrd;")
    private static class173 field3902 = class133.method843("Unexpected server response)3", 36);

    @OriginalMember(owner = "client!ud", name = "k", descriptor = "Lrd;")
    private static class173 field3905 = class133.method843("Choose Option", 115);

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "I")
    public static int field3896 = 0;

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "Lrd;")
    public static class173 field3903 = class133.method843("Angreifen", -111);

    @OriginalMember(owner = "client!ud", name = "o", descriptor = "Lrd;")
    private static class173 field3909 = class133.method843("Service unavailable)3", -125);

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "Lrd;")
    public static class173 field3901 = field3909;

    @OriginalMember(owner = "client!ud", name = "x", descriptor = "Lrd;")
    public static class173 field3918 = field3905;

    @OriginalMember(owner = "client!ud", name = "q", descriptor = "I")
    public static volatile int field3911 = -1;

    @OriginalMember(owner = "client!ud", name = "z", descriptor = "Lrd;")
    public static class173 field3920 = class133.method843("", -108);

    @OriginalMember(owner = "client!ud", name = "C", descriptor = "Lrd;")
    public static class173 field3923 = field3902;

    @OriginalMember(owner = "client!ud", name = "t", descriptor = "Lrd;")
    public static class173 field3914 = class133.method843("null", -86);

    @OriginalMember(owner = "client!ud", name = "B", descriptor = "[I")
    public static int[] field3922 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!ud", name = "w", descriptor = "Z")
    public static volatile boolean field3917 = true;

    @OriginalMember(owner = "client!ud", name = "r", descriptor = "Z")
    public static volatile boolean field3912 = true;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "I")
    public static int field3899;

    @OriginalMember(owner = "client!ud", name = "j", descriptor = "I")
    public static int field3904;

    @OriginalMember(owner = "client!ud", name = "l", descriptor = "I")
    public static int field3906;

    @OriginalMember(owner = "client!ud", name = "n", descriptor = "I")
    public static int field3908;

    @OriginalMember(owner = "client!ud", name = "p", descriptor = "I")
    public static int field3910;

    @OriginalMember(owner = "client!ud", name = "s", descriptor = "I")
    public static int field3913;

    @OriginalMember(owner = "client!ud", name = "y", descriptor = "I")
    public static int field3919;

    @OriginalMember(owner = "client!ud", name = "v", descriptor = "Lbc;")
    public static class14 field3916;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "Lpd;")
    public static class153 field3895;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)[[I")
    public final int[][] method1340(int arg0, int arg1) {
        field3904++;
        int var3 = 55 % ((arg0 + 49) / 51);
        if (this.field3924 == this.field3897) {
            this.field3925 = this.field3921[arg1] == null;
            this.field3921[arg1] = class70.field1370;
            return this.field3898[arg1];
        } else if (this.field3897 == 1) {
            this.field3925 = this.field3900 != arg1;
            this.field3900 = arg1;
            return this.field3898[0];
        } else {
            class21 var4 = this.field3921[arg1];
            if (this.field3925 = var4 == null) {
                if (this.field3897 <= this.field3907) {
                    class21 var5 = (class21) this.field3915.method918(4226);
                    var4 = new class21(arg1, var5.field470);
                    this.field3921[var5.field464] = null;
                    var5.method824((byte) -123);
                } else {
                    var4 = new class21(arg1, this.field3907);
                    this.field3907++;
                }
                this.field3921[arg1] = var4;
            }
            this.field3915.method925(255, var4);
            return this.field3898[var4.field470];
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
    public final void method1341(int arg0) {
        field3906++;
        for (int var2 = 0; var2 < this.field3897; var2++) {
            this.field3898[var2][0] = null;
            this.field3898[var2][1] = null;
            this.field3898[var2][2] = null;
            this.field3898[var2] = null;
        }
        this.field3898 = null;
        if (arg0 >= -25) {
            this.field3915 = null;
        }
        this.field3921 = null;
        this.field3915.method916((byte) 110);
        this.field3915 = null;
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)[[[I")
    public final int[][][] method1342(int arg0) {
        if (arg0 <= 63) {
            field3918 = null;
        }
        field3910++;
        if (this.field3924 != this.field3897) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field3897; var2++) {
            this.field3921[var2] = class70.field1370;
        }
        return this.field3898;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/Class;")
    public static final Class method1343(boolean arg0, String arg1) throws ClassNotFoundException {
        field3899++;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else if (arg1.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg1.equals("F")) {
            return Float.TYPE;
        } else if (arg1.equals("D")) {
            return Double.TYPE;
        } else {
            if (!arg0) {
                method1346(-95);
            }
            return arg1.equals("C") ? Character.TYPE : Class.forName(arg1);
        }
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(I)V")
    public static final void method1344(int arg0) {
        class164.field3044.method53(-51);
        if (arg0 > -64) {
            field3901 = null;
        }
        field3913++;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(BLrd;)Z")
    public static final boolean method1345(byte arg0, class173 arg1) {
        field3919++;
        if (arg1 == null) {
            return false;
        }
        if (arg0 >= -56) {
            method1344(9);
        }
        for (int var2 = 0; var2 < class149.field2840; var2++) {
            if (arg1.method1123(101, class191.field3730[var2])) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "(I)V")
    public static void method1346(int arg0) {
        if (arg0 != 0) {
            method1345((byte) -47, null);
        }
        field3901 = null;
        field3903 = null;
        field3920 = null;
        field3923 = null;
        field3922 = null;
        field3909 = null;
        field3902 = null;
        field3905 = null;
        field3895 = null;
        field3916 = null;
        field3918 = null;
        field3914 = null;
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(III)V")
    public class202(int arg0, int arg1, int arg2) {
        this.field3898 = new int[arg0][3][arg2];
        this.field3897 = arg0;
        this.field3921 = new class21[arg1];
        this.field3924 = arg1;
    }
}
