import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class177 extends class184 {

    @OriginalMember(owner = "client!ul", name = "p", descriptor = "I")
    private int field2902 = 0;

    @OriginalMember(owner = "client!ul", name = "v", descriptor = "Z")
    public boolean field2908 = false;

    @OriginalMember(owner = "client!ul", name = "A", descriptor = "I")
    private int field2913 = 0;

    @OriginalMember(owner = "client!ul", name = "G", descriptor = "I")
    private int field2919 = -1;

    @OriginalMember(owner = "client!ul", name = "I", descriptor = "I")
    private int field2921 = -32768;

    @OriginalMember(owner = "client!ul", name = "x", descriptor = "I")
    public int field2910;

    @OriginalMember(owner = "client!ul", name = "D", descriptor = "I")
    public int field2916;

    @OriginalMember(owner = "client!ul", name = "s", descriptor = "I")
    public int field2905;

    @OriginalMember(owner = "client!ul", name = "O", descriptor = "I")
    public int field2926;

    @OriginalMember(owner = "client!ul", name = "E", descriptor = "I")
    private int field2917;

    @OriginalMember(owner = "client!ul", name = "r", descriptor = "I")
    public int field2904;

    @OriginalMember(owner = "client!ul", name = "n", descriptor = "Lpb;")
    private class167 field2900;

    @OriginalMember(owner = "client!ul", name = "F", descriptor = "Li;")
    public static class112 field2918 = new class112(16);

    @OriginalMember(owner = "client!ul", name = "o", descriptor = "I")
    public static int field2901;

    @OriginalMember(owner = "client!ul", name = "q", descriptor = "I")
    public static int field2903;

    @OriginalMember(owner = "client!ul", name = "t", descriptor = "I")
    public static int field2906;

    @OriginalMember(owner = "client!ul", name = "u", descriptor = "I")
    public static int field2907;

    @OriginalMember(owner = "client!ul", name = "w", descriptor = "I")
    public static int field2909;

    @OriginalMember(owner = "client!ul", name = "B", descriptor = "I")
    public static int field2914;

    @OriginalMember(owner = "client!ul", name = "C", descriptor = "I")
    public static int field2915;

    @OriginalMember(owner = "client!ul", name = "H", descriptor = "I")
    public static int field2920;

    @OriginalMember(owner = "client!ul", name = "M", descriptor = "I")
    public static int field2924;

    @OriginalMember(owner = "client!ul", name = "N", descriptor = "I")
    public static int field2925;

    @OriginalMember(owner = "client!ul", name = "y", descriptor = "Lgh;")
    private class32 field2911;

    @OriginalMember(owner = "client!ul", name = "K", descriptor = "Lcj;")
    public static class74 field2923;

    @OriginalMember(owner = "client!ul", name = "J", descriptor = "Ljava/awt/Font;")
    public static Font field2922;

    @OriginalMember(owner = "client!ul", name = "z", descriptor = "[[[B")
    public static byte[][][] field2912;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(BI)V")
    public final void method1175(byte arg0, int arg1) {
        field2915++;
        if (this.field2908) {
            return;
        }
        this.field2902 += arg1;
        if (arg0 != 26) {
            return;
        }
        while (this.field2900.field2751[this.field2913] < this.field2902) {
            this.field2902 -= this.field2900.field2751[this.field2913];
            this.field2913++;
            if (this.field2913 >= this.field2900.field2736.length) {
                this.field2908 = true;
                break;
            }
        }
        if (!this.field2908) {
            class112.method786(this.field2926, this.field2900, this.field2913, this.field2904, (byte) -25, false);
        }
    }

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "(B)Lba;")
    private final class279 method1176(byte arg0) {
        if (arg0 >= -29) {
            field2914 = -12;
        }
        field2909++;
        class121 var2 = class189.method1243(65536, this.field2917);
        class279 var3;
        if (this.field2908) {
            var3 = var2.method830(1, -1, -1, 0);
        } else {
            var3 = var2.method830(1, this.field2919, this.field2913, this.field2902);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIIII)V")
    public final void method226(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2903++;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lvh;Z)V")
    public static final void method1177(class108 arg0, boolean arg1) {
        field2920++;
        if (class4.field59) {
            return;
        }
        class283.method1852();
        class67.field1116 = class53.method331(class55.field963, (byte) 116, arg0);
        int var2 = class4.field38;
        int var3 = var2 * 956 / 503;
        class67.field1116.method455((class267.field4324 - var3) / 2, 0, var3, var2);
        class178.field2933 = class290.method1958((byte) -101, class85.field1538, arg0);
        class178.field2933.method631(class267.field4324 / 2 - (class178.field2933.field1711 / 2), 18);
        class4.field59 = arg1;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(JI)V")
    public static final void method1178(long arg0, int arg1) {
        field2906++;
        if (!class173.field2852) {
            class195.field3151 += (float) arg0 * class158.field2659 / 40.0F;
            class106.field1900 += (float) arg0 * class68.field1125 / 40.0F;
        }
        int var3 = class203.field3328 + class273.field4378.field1397;
        int var4 = class273.field4378.field1458 + class82.field1489;
        if (class216.field3637 - var3 < -500 || (class216.field3637 - var3) > 500 || (class77.field1251 - var4) < -500 || class77.field1251 - var4 > 500) {
            class77.field1251 = var4;
            class216.field3637 = var3;
        }
        if (class216.field3637 != var3) {
            int var5 = var3 - class216.field3637;
            int var6 = (int) ((long) var5 * arg0 / 320L);
            if (var5 > 0) {
                if (var6 == 0) {
                    var6 = 1;
                } else if (var5 < var6) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = -1;
            } else if (var6 < var5) {
                var6 = var5;
            }
            class216.field3637 += var6;
        }
        int var7 = 71 / ((49 - arg1) / 48);
        if (class77.field1251 != var4) {
            int var8 = var4 - class77.field1251;
            int var9 = (int) ((long) var8 * arg0 / 320L);
            if (var8 > 0) {
                if (var9 == 0) {
                    var9 = 1;
                } else if (var9 > var8) {
                    var9 = var8;
                }
            } else if (var9 == 0) {
                var9 = -1;
            } else if (var8 > var9) {
                var9 = var8;
            }
            class77.field1251 += var9;
        }
        class126.method867(false);
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(Z)V")
    public static void method1179(boolean arg0) {
        field2918 = null;
        field2922 = null;
        if (!arg0) {
            field2912 = null;
            field2923 = null;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "()I")
    public final int method110() {
        field2901++;
        return this.field2921;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIIIIIIIJILgh;)V")
    public final void method120(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class32 arg10) {
        class279 var13 = this.method1176((byte) -69);
        field2907++;
        if (var13 != null) {
            var13.method120(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field2911);
            this.field2921 = var13.method110();
        }
    }

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(IIIIIII)V")
    public class177(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field2910 = arg5 + arg6;
        this.field2916 = arg4;
        this.field2905 = arg1;
        this.field2926 = arg3;
        this.field2917 = arg0;
        this.field2904 = arg2;
        int var8 = class189.method1243(65536, this.field2917).field2138;
        if (var8 == -1) {
            this.field2908 = true;
        } else {
            this.field2908 = false;
            this.field2900 = class105.method714(var8, (byte) 46);
        }
        if (this.field2910 == arg6) {
            class112.method786(this.field2926, this.field2900, this.field2913, this.field2904, (byte) -89, false);
        }
    }
}
