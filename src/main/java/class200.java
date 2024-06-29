import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class200 {

    @OriginalMember(owner = "client!dl", name = "o", descriptor = "Z")
    public boolean field2867 = false;

    @OriginalMember(owner = "client!dl", name = "j", descriptor = "I")
    public int field2862 = -1;

    @OriginalMember(owner = "client!dl", name = "r", descriptor = "[I")
    private int[] field2870 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "[I")
    public static int[] field2857 = new int[1000];

    @OriginalMember(owner = "client!dl", name = "q", descriptor = "Z")
    public static boolean field2869 = true;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "I")
    public static int field2855;

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "I")
    public static int field2856;

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "I")
    public static int field2858;

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "I")
    public static int field2859;

    @OriginalMember(owner = "client!dl", name = "i", descriptor = "I")
    public static int field2861;

    @OriginalMember(owner = "client!dl", name = "k", descriptor = "I")
    public static int field2863;

    @OriginalMember(owner = "client!dl", name = "l", descriptor = "I")
    public static int field2864;

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "[I")
    private int[] field2854;

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "[S")
    private short[] field2860;

    @OriginalMember(owner = "client!dl", name = "m", descriptor = "[S")
    private short[] field2865;

    @OriginalMember(owner = "client!dl", name = "n", descriptor = "[S")
    private short[] field2866;

    @OriginalMember(owner = "client!dl", name = "p", descriptor = "[S")
    private short[] field2868;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lil;Z)V")
    public final void method1253(class265 arg0, boolean arg1) {
        while (true) {
            int var3 = arg0.method1697(-86);
            if (var3 == 0) {
                if (arg1) {
                    field2869 = true;
                }
                field2858++;
                return;
            }
            this.method1259(var3, arg0, -73);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(B)Z")
    public final boolean method1254(byte arg0) {
        field2853++;
        if (this.field2854 == null) {
            return true;
        }
        boolean var2 = true;
        class238 var3 = class272.field3988;
        synchronized (class272.field3988) {
            for (int var4 = 0; var4 < this.field2854.length; var4++) {
                if (!class272.field3988.method1462(0, this.field2854[var4], 123)) {
                    var2 = false;
                }
            }
            if (arg0 > -114) {
                method1260(40);
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)Lm;")
    public final class180 method1255(int arg0) {
        field2863++;
        class180[] var2 = new class180[5];
        int var3 = 0;
        class238 var4 = class272.field3988;
        synchronized (class272.field3988) {
            int var5 = 0;
            while (true) {
                if (var5 >= 5) {
                    if (arg0 != -20658) {
                        this.method1257(57);
                    }
                    break;
                }
                if (this.field2870[var5] != -1) {
                    var2[var3++] = class357.method2343(this.field2870[var5], 0, class272.field3988, 1);
                }
                var5++;
            }
        }
        class180 var6 = new class180(var2, var3);
        if (this.field2868 != null) {
            for (int var7 = 0; var7 < this.field2868.length; var7++) {
                var6.method1117(this.field2865[var7], this.field2868[var7], -126);
            }
        }
        if (this.field2860 != null) {
            for (int var8 = 0; var8 < this.field2860.length; var8++) {
                var6.method1114(arg0 + 20536, this.field2860[var8], this.field2866[var8]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Z)Z")
    public final boolean method1256(boolean arg0) {
        field2864++;
        boolean var2 = arg0;
        class238 var3 = class272.field3988;
        synchronized (class272.field3988) {
            for (int var4 = 0; var4 < 5; var4++) {
                if (this.field2870[var4] != -1 && !class272.field3988.method1462(0, this.field2870[var4], 106)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(I)Lm;")
    public final class180 method1257(int arg0) {
        field2855++;
        if (this.field2854 == null) {
            return null;
        }
        class180[] var2 = new class180[this.field2854.length];
        class238 var3 = class272.field3988;
        synchronized (class272.field3988) {
            for (int var4 = 0; var4 < this.field2854.length; var4++) {
                var2[var4] = class357.method2343(this.field2854[var4], 0, class272.field3988, arg0 + 14649);
            }
            if (arg0 != -14648) {
                this.field2860 = null;
            }
        }
        class180 var5;
        if (var2.length == 1) {
            var5 = var2[0];
        } else {
            var5 = new class180(var2, var2.length);
        }
        if (var5 == null) {
            return null;
        }
        if (this.field2868 != null) {
            for (int var6 = 0; var6 < this.field2868.length; var6++) {
                var5.method1117(this.field2865[var6], this.field2868[var6], 77);
            }
        }
        if (this.field2860 != null) {
            for (int var7 = 0; var7 < this.field2860.length; var7++) {
                var5.method1114(-122, this.field2860[var7], this.field2866[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IB)V")
    public static final void method1258(int arg0, byte arg1) {
        int var2 = -68 / ((arg1 - 59) / 43);
        class310.field4439 = 1000 / arg0;
        field2856++;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ILil;I)V")
    private final void method1259(int arg0, class265 arg1, int arg2) {
        field2859++;
        int var4 = 37 % ((arg2 - 1) / 59);
        if (arg0 == 1) {
            this.field2862 = arg1.method1697(-33);
        } else if (arg0 == 2) {
            int var9 = arg1.method1697(90);
            this.field2854 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2854[var10] = arg1.method1685(8104);
            }
        } else if (arg0 == 3) {
            this.field2867 = true;
        } else if (arg0 == 40) {
            int var7 = arg1.method1697(87);
            this.field2865 = new short[var7];
            this.field2868 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2868[var8] = (short) arg1.method1685(8104);
                this.field2865[var8] = (short) arg1.method1685(8104);
            }
        } else if (arg0 == 41) {
            int var5 = arg1.method1697(117);
            this.field2866 = new short[var5];
            this.field2860 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2860[var6] = (short) arg1.method1685(8104);
                this.field2866[var6] = (short) arg1.method1685(8104);
            }
        } else if (arg0 >= 60 && arg0 < 70) {
            this.field2870[arg0 - 60] = arg1.method1685(8104);
            return;
        }
    }

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "(I)V")
    public static void method1260(int arg0) {
        if (arg0 != 0) {
            method1260(-99);
        }
        field2857 = null;
    }
}
