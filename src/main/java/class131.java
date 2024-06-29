import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class131 {

    @OriginalMember(owner = "client!sf", name = "r", descriptor = "I")
    public int field2992;

    @OriginalMember(owner = "client!sf", name = "o", descriptor = "I")
    public int field2989;

    @OriginalMember(owner = "client!sf", name = "j", descriptor = "I")
    public int field2984;

    @OriginalMember(owner = "client!sf", name = "k", descriptor = "I")
    public int field2985;

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "Lr;")
    public static class118 field2978 = class153.method1136(80, "(U0a )2 in: ");

    @OriginalMember(owner = "client!sf", name = "m", descriptor = "I")
    public static int field2987 = 2;

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "[J")
    public static long[] field2983 = new long[32];

    @OriginalMember(owner = "client!sf", name = "n", descriptor = "Lr;")
    public static class118 field2988 = class153.method1136(84, "(U3");

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "I")
    public static int field2976;

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "I")
    public static int field2977;

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "I")
    public static int field2979;

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "I")
    public static int field2980;

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "I")
    public static int field2981;

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "I")
    public static int field2982;

    @OriginalMember(owner = "client!sf", name = "l", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!sf", name = "p", descriptor = "I")
    public static int field2990;

    @OriginalMember(owner = "client!sf", name = "q", descriptor = "Lbf;")
    public static class14 field2991;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "[Ln;")
    public static class90[] field2975;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)I")
    public static final int method1012(int arg0, int arg1) {
        field2979++;
        class46 var2 = class75.method631(arg0 ^ 0xCCB, arg1);
        int var3 = var2.field1103;
        int var4 = var2.field1115;
        int var5 = var2.field1106;
        if (arg0 == 3233) {
            int var6 = class75.field1842[var4 - var5];
            return class92.field2193[var3] >> var5 & var6;
        } else {
            return -68;
        }
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(II)Lmb;")
    public static final class85 method1013(int arg0, int arg1) {
        field2982++;
        class85 var2 = (class85) class142.field3213.method395((byte) -66, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class56.field1323.method350(10, -25, arg1);
        class85 var4 = new class85();
        var4.field2064 = arg1;
        if (var3 != null) {
            var4.method692(new class105(var3), -143);
        }
        var4.method702(30149);
        if (var4.field2036 != -1) {
            var4.method703(method1013(-12582, var4.field2036), (byte) 68, method1013(-12582, var4.field2067));
        }
        if (!class42.field1016 && var4.field2027) {
            var4.field2090 = 0;
            var4.field2071 = null;
            var4.field2048 = class73.field1689;
            var4.field2081 = null;
        }
        if (arg0 == -12582) {
            class142.field3213.method391(var4, (long) arg1, true);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(JI)Lr;")
    public static final class118 method1014(long arg0, int arg1) {
        field2981++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        }
        int var3 = 63 % ((arg1 + 55) / 47);
        if (arg0 % 37L == 0L) {
            return null;
        }
        int var4 = 0;
        for (long var5 = arg0; var5 != 0L; var5 /= 37L) {
            var4++;
        }
        byte[] var7 = new byte[var4];
        while (arg0 != 0L) {
            long var9 = arg0;
            arg0 /= 37L;
            var4--;
            var7[var4] = class20.field480[(int) (var9 - arg0 * 37L)];
        }
        class118 var8 = new class118();
        var8.field2746 = var7;
        var8.field2743 = var7.length;
        return var8;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)V")
    public static void method1015(byte arg0) {
        int var1 = -90 % ((60 - arg0) / 43);
        field2978 = null;
        field2983 = null;
        field2991 = null;
        field2975 = null;
        field2988 = null;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lff;Lff;I)V")
    public static final void method1016(class42 arg0, class42 arg1, int arg2) {
        field2986++;
        class81.field1961 = arg1;
        class157.field3613 = arg0;
        field2977 = class81.field1961.method343((byte) 93, arg2);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Ljc;II[B)V")
    public static final void method1017(class65 arg0, int arg1, int arg2, byte[] arg3) {
        field2980++;
        class34 var4 = new class34();
        var4.field2295 = arg1;
        var4.field845 = arg3;
        var4.field865 = arg0;
        var4.field862 = arg2;
        class113 var5 = class62.field1432;
        synchronized (class62.field1432) {
            class62.field1432.method883(var4, -26866);
        }
        class95.method749((byte) -111);
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "()V")
    public class131() {
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Lsf;)V")
    public class131(class131 arg0) {
        this.field2992 = arg0.field2992;
        this.field2989 = arg0.field2989;
        this.field2984 = arg0.field2984;
        this.field2985 = arg0.field2985;
    }
}
