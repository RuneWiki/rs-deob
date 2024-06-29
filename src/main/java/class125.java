import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class125 implements Runnable {

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "[Lha;")
    public volatile class50[] field2886 = new class50[2];

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "Z")
    public volatile boolean field2878 = false;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "Z")
    public volatile boolean field2881 = false;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "Lwd;")
    public static class150 field2877 = class2.method9(true, "Stufe)2");

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "[I")
    public static int[] field2885 = new int[32];

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "I")
    public static int field2887;

    @OriginalMember(owner = "client!sc", name = "r", descriptor = "Lwd;")
    private static class150 field2894;

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "Lwd;")
    public static class150 field2888;

    @OriginalMember(owner = "client!sc", name = "s", descriptor = "Lwd;")
    private static class150 field2895;

    @OriginalMember(owner = "client!sc", name = "v", descriptor = "Lwd;")
    public static class150 field2898;

    @OriginalMember(owner = "client!sc", name = "q", descriptor = "Lwd;")
    public static class150 field2893;

    @OriginalMember(owner = "client!sc", name = "p", descriptor = "Lwd;")
    public static class150 field2892;

    @OriginalMember(owner = "client!sc", name = "n", descriptor = "Lwd;")
    public static class150 field2890;

    @OriginalMember(owner = "client!sc", name = "y", descriptor = "[I")
    public static int[] field2901;

    @OriginalMember(owner = "client!sc", name = "x", descriptor = "I")
    public static int field2900;

    @OriginalMember(owner = "client!sc", name = "t", descriptor = "Lwd;")
    public static class150 field2896;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
    public static int field2879;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
    public static int field2880;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
    public static int field2883;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
    public static int field2884;

    @OriginalMember(owner = "client!sc", name = "o", descriptor = "Lp;")
    public static class104 field2891;

    @OriginalMember(owner = "client!sc", name = "w", descriptor = "Lce;")
    public static class20 field2899;

    @OriginalMember(owner = "client!sc", name = "u", descriptor = "Ldf;")
    public static class28 field2897;

    @OriginalMember(owner = "client!sc", name = "m", descriptor = "[I")
    public static int[] field2889;

    @OriginalMember(owner = "client!sc", name = "z", descriptor = "[Lhb;")
    public static class51[] field2902;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(BJ)V")
    public static final void method946(byte arg0, long arg1) {
        field2883++;
        if (arg1 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class74.field1858; var3++) {
            if (class74.field1859[var3] == arg1) {
                class74.field1858--;
                class82.field1972 = true;
                class112.field2584++;
                for (int var4 = var3; var4 < class74.field1858; var4++) {
                    class74.field1859[var4] = class74.field1859[var4 + 1];
                }
                class143.field3451.method965(true, 174);
                class143.field3451.method1129(arg1, false);
                break;
            }
        }
        if (arg0 < 81) {
            field2899 = null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)V")
    public static final void method947(byte arg0) {
        field2884++;
        class121.field2783.method976((byte) 51);
        int var1 = class121.field2783.method967(8, false);
        if (var1 < class133.field3128) {
            for (int var2 = var1; var2 < class133.field3128; var2++) {
                class49.field1293[class70.field1786++] = class101.field2309[var2];
            }
        }
        if (var1 > class133.field3128) {
            throw new RuntimeException("gnpov1");
        }
        class133.field3128 = 0;
        int var3 = 0;
        if (arg0 > -120) {
            field2895 = null;
        }
        while (var3 < var1) {
            int var4 = class101.field2309[var3];
            class18 var5 = class37.field1013[var4];
            int var6 = class121.field2783.method967(1, false);
            if (var6 == 0) {
                class101.field2309[class133.field3128++] = var4;
                var5.field2965 = class11.field280;
            } else {
                int var7 = class121.field2783.method967(2, false);
                if (var7 == 0) {
                    class101.field2309[class133.field3128++] = var4;
                    var5.field2965 = class11.field280;
                    class17.field468[class111.field2577++] = var4;
                } else if (var7 == 1) {
                    class101.field2309[class133.field3128++] = var4;
                    var5.field2965 = class11.field280;
                    int var8 = class121.field2783.method967(3, false);
                    var5.method959((byte) -47, var8, false);
                    int var9 = class121.field2783.method967(1, false);
                    if (var9 == 1) {
                        class17.field468[class111.field2577++] = var4;
                    }
                } else if (var7 == 2) {
                    class101.field2309[class133.field3128++] = var4;
                    var5.field2965 = class11.field280;
                    int var10 = class121.field2783.method967(3, false);
                    var5.method959((byte) -47, var10, true);
                    int var11 = class121.field2783.method967(3, false);
                    var5.method959((byte) -47, var11, true);
                    int var12 = class121.field2783.method967(1, false);
                    if (var12 == 1) {
                        class17.field468[class111.field2577++] = var4;
                    }
                } else if (var7 == 3) {
                    class49.field1293[class70.field1786++] = var4;
                }
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(B)V")
    public static void method948(byte arg0) {
        field2890 = null;
        field2892 = null;
        field2877 = null;
        field2896 = null;
        field2901 = null;
        field2895 = null;
        field2894 = null;
        field2891 = null;
        field2888 = null;
        field2893 = null;
        field2897 = null;
        field2902 = null;
        if (arg0 != -114) {
            method946((byte) -117, 26L);
        }
        field2889 = null;
        field2885 = null;
        field2899 = null;
        field2898 = null;
    }

    @OriginalMember(owner = "client!sc", name = "run", descriptor = "()V")
    public final void run() {
        this.field2881 = true;
        try {
            while (!this.field2878) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class50 var2 = this.field2886[var1];
                    if (var2 != null) {
                        var2.method379(-97);
                    }
                }
                class72.method548(-57, 10L);
                class69.method529(0, false);
            }
        } catch (Exception var4) {
            class61.method467(null, (byte) -90, var4);
        }
        field2879++;
        this.field2881 = false;
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(B)V")
    public static final void method949(byte arg0) {
        field2880++;
        if (!class9.field226) {
            return;
        }
        class54.field1413 = null;
        class150.field3664 = null;
        class56.field1450 = null;
        class95.field2201 = null;
        class142.field3434 = null;
        class26.field797 = null;
        class20.field499 = null;
        class69.field1734 = null;
        class21.field544 = null;
        class30.field903 = null;
        class83.field1995 = null;
        class98.field2239 = null;
        class2.field38 = null;
        class141.field3333 = null;
        class124.field2872 = null;
        class121.field2794 = null;
        class37.field1026 = null;
        class9.field226 = false;
        class6.field162 = null;
        class77.field1895 = null;
        class16.field416 = null;
        class1.field12 = null;
        class34.field955 = null;
        class118.field2703 = null;
        class55.field1439 = null;
        class20.field522 = null;
        class17.field469 = null;
        class94.field2192 = null;
        if (arg0 < 27) {
            return;
        }
        class92.field2158 = null;
        class70.field1780 = null;
        class101.field2298 = null;
        class148.field3595 = null;
        class106.field2403 = null;
        class103.field2343 = null;
        class97.field2237 = null;
        class113.field2611 = null;
        class50.field1351 = null;
        class90.field2108 = null;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2885[var1] = var0 - 1;
            var0 += var0;
        }
        field2887 = 1;
        field2894 = class2.method9(true, "Free world");
        field2888 = class2.method9(true, "Benutzen Sie bitte eine andere Welt)3");
        field2895 = class2.method9(true, "K");
        field2898 = field2894;
        field2893 = field2895;
        field2892 = class2.method9(true, "Konfig geladen)3");
        field2890 = class2.method9(true, "Cabbage");
        field2901 = new int[5];
        field2900 = 0;
        field2896 = field2895;
    }
}
