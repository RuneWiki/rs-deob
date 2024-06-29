import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class180 {

    @OriginalMember(owner = "client!bg", name = "l", descriptor = "[I")
    private int[] field2866 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "I")
    public int field2863 = -1;

    @OriginalMember(owner = "client!bg", name = "n", descriptor = "Z")
    public boolean field2868 = false;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "I")
    public static int field2861 = 0;

    @OriginalMember(owner = "client!bg", name = "o", descriptor = "[I")
    public static int[] field2869 = new int[100];

    @OriginalMember(owner = "client!bg", name = "u", descriptor = "I")
    public static int field2875 = 1;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
    public static int field2857;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
    public static int field2858;

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "I")
    public static int field2862;

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "I")
    public static int field2864;

    @OriginalMember(owner = "client!bg", name = "k", descriptor = "I")
    public static int field2865;

    @OriginalMember(owner = "client!bg", name = "p", descriptor = "I")
    public static int field2870;

    @OriginalMember(owner = "client!bg", name = "q", descriptor = "I")
    public static int field2871;

    @OriginalMember(owner = "client!bg", name = "t", descriptor = "I")
    public static int field2874;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "Ljava/lang/String;")
    public static String field2860;

    @OriginalMember(owner = "client!bg", name = "m", descriptor = "[I")
    public static int[] field2867;

    @OriginalMember(owner = "client!bg", name = "v", descriptor = "[I")
    private int[] field2876;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "[Lwb;")
    public static class123[] field2856;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "[S")
    private short[] field2855;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "[S")
    private short[] field2859;

    @OriginalMember(owner = "client!bg", name = "r", descriptor = "[S")
    private short[] field2872;

    @OriginalMember(owner = "client!bg", name = "s", descriptor = "[S")
    private short[] field2873;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)Lbf;")
    public final class205 method1251(byte arg0) {
        field2864++;
        class205[] var2 = new class205[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field2866[var4] != -1) {
                var2[var3++] = class205.method1444(class147.field2310, this.field2866[var4], 0);
            }
        }
        class205 var5 = new class205(var2, var3);
        if (this.field2872 != null) {
            for (int var6 = 0; var6 < this.field2872.length; var6++) {
                var5.method1438(this.field2872[var6], this.field2859[var6]);
            }
        }
        if (this.field2873 != null) {
            for (int var7 = 0; var7 < this.field2873.length; var7++) {
                var5.method1449(this.field2873[var7], this.field2855[var7]);
            }
        }
        if (arg0 != -18) {
            this.field2863 = -20;
        }
        return var5;
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(B)Z")
    public final boolean method1252(byte arg0) {
        if (arg0 != 17) {
            return true;
        }
        field2874++;
        if (this.field2876 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field2876.length; var3++) {
            if (!class147.field2310.method947(this.field2876[var3], 0, true)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(BLpd;)V")
    public final void method1253(byte arg0, class96 arg1) {
        field2857++;
        int var3 = -80 / ((arg0 - 21) / 54);
        while (true) {
            int var4 = arg1.method584(255);
            if (var4 == 0) {
                return;
            }
            this.method1254(arg1, var4, (byte) 73);
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lpd;IB)V")
    private final void method1254(class96 arg0, int arg1, byte arg2) {
        field2858++;
        if (arg2 <= 71) {
            return;
        }
        if (arg1 == 1) {
            this.field2863 = arg0.method584(255);
        } else if (arg1 == 2) {
            int var8 = arg0.method584(255);
            this.field2876 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field2876[var9] = arg0.method549(255);
            }
        } else if (arg1 == 3) {
            this.field2868 = true;
        } else if (arg1 == 40) {
            int var6 = arg0.method584(255);
            this.field2872 = new short[var6];
            this.field2859 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field2872[var7] = (short) arg0.method549(255);
                this.field2859[var7] = (short) arg0.method549(255);
            }
        } else if (arg1 == 41) {
            int var4 = arg0.method584(255);
            this.field2855 = new short[var4];
            this.field2873 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2873[var5] = (short) arg0.method549(255);
                this.field2855[var5] = (short) arg0.method549(255);
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field2866[arg1 - 60] = arg0.method549(255);
            return;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(II)V")
    public static final void method1255(int arg0, int arg1) {
        if (arg1 != 60) {
            field2856 = null;
        }
        class28.field396.method1695(arg0, arg1 - 60);
        field2870++;
    }

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "(B)V")
    public static void method1256(byte arg0) {
        field2869 = null;
        field2856 = null;
        int var1 = 111 / ((-arg0 - 19) / 44);
        field2860 = null;
        field2867 = null;
    }

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "(B)Z")
    public final boolean method1257(byte arg0) {
        field2865++;
        int var2 = -56 / ((arg0 - 55) / 60);
        boolean var3 = true;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field2866[var4] != -1 && !class147.field2310.method947(this.field2866[var4], 0, true)) {
                var3 = false;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)Lbf;")
    public final class205 method1258(int arg0) {
        field2871++;
        if (this.field2876 == null) {
            return null;
        }
        class205[] var2 = new class205[this.field2876.length];
        for (int var3 = 0; var3 < this.field2876.length; var3++) {
            var2[var3] = class205.method1444(class147.field2310, this.field2876[var3], 0);
        }
        if (arg0 >= -74) {
            method1255(61, -126);
        }
        class205 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class205(var2, var2.length);
        }
        if (this.field2872 != null) {
            for (int var5 = 0; var5 < this.field2872.length; var5++) {
                var4.method1438(this.field2872[var5], this.field2859[var5]);
            }
        }
        if (this.field2873 != null) {
            for (int var6 = 0; var6 < this.field2873.length; var6++) {
                var4.method1449(this.field2873[var6], this.field2855[var6]);
            }
        }
        return var4;
    }
}
