import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class120 extends class65 {

    @OriginalMember(owner = "client!u", name = "B", descriptor = "[I")
    public int[] field2888 = new int[] { -1 };

    @OriginalMember(owner = "client!u", name = "y", descriptor = "[I")
    public int[] field2885 = new int[1];

    @OriginalMember(owner = "client!u", name = "C", descriptor = "I")
    public static int field2889 = -1;

    @OriginalMember(owner = "client!u", name = "G", descriptor = "I")
    public static int field2893 = 0;

    @OriginalMember(owner = "client!u", name = "z", descriptor = "Lle;")
    public static class71 field2886 = new class71(200);

    @OriginalMember(owner = "client!u", name = "H", descriptor = "[Lub;")
    public static class122[] field2894 = new class122[13];

    @OriginalMember(owner = "client!u", name = "J", descriptor = "[I")
    public static int[] field2896 = new int[100];

    @OriginalMember(owner = "client!u", name = "K", descriptor = "Lrc;")
    public static class105 field2897 = class43.method374("Angreifen", 0);

    @OriginalMember(owner = "client!u", name = "I", descriptor = "Lrc;")
    private static class105 field2895 = class43.method374("You are standing in a members)2only area)3", 0);

    @OriginalMember(owner = "client!u", name = "N", descriptor = "Lrc;")
    private static class105 field2900 = class43.method374("Please wait 1 minute and try again)3", 0);

    @OriginalMember(owner = "client!u", name = "L", descriptor = "Lrc;")
    public static class105 field2898 = field2900;

    @OriginalMember(owner = "client!u", name = "O", descriptor = "[I")
    public static int[] field2901 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!u", name = "M", descriptor = "Lrc;")
    public static class105 field2899 = field2900;

    @OriginalMember(owner = "client!u", name = "P", descriptor = "Lrc;")
    public static class105 field2902 = field2895;

    @OriginalMember(owner = "client!u", name = "Q", descriptor = "Lrc;")
    public static class105 field2903 = class43.method374("Ung-Ultiger Benutzername", 0);

    @OriginalMember(owner = "client!u", name = "A", descriptor = "I")
    public static int field2887;

    @OriginalMember(owner = "client!u", name = "D", descriptor = "I")
    public static int field2890;

    @OriginalMember(owner = "client!u", name = "E", descriptor = "I")
    public static int field2891;

    @OriginalMember(owner = "client!u", name = "F", descriptor = "I")
    public static int field2892;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(II)Lsd;", line = 8)
    public static final class112 method969(int arg0, int arg1) {
        field2891++;
        class112 var2 = (class112) class12.field235.method601((long) arg1, (byte) 118);
        if (var2 != null) {
            return var2;
        } else if (arg0 > -126) {
            return null;
        } else {
            byte[] var3 = class111.field2600.method766(arg1, (byte) -45, 4);
            class112 var4 = new class112();
            if (var3 != null) {
                var4.method920(arg1, new class7(var3), (byte) 107);
            }
            var4.method919(true);
            class12.field235.method608((long) arg1, var4, (byte) 127);
            return var4;
        }
    }

    @OriginalMember(owner = "client!u", name = "c", descriptor = "(I)V", line = 39)
    public static void method970(int arg0) {
        field2900 = null;
        field2903 = null;
        field2902 = null;
        field2894 = null;
        field2896 = null;
        field2901 = null;
        field2897 = null;
        field2886 = null;
        field2895 = null;
        field2899 = null;
        field2898 = null;
        if (arg0 != -1) {
            field2898 = null;
        }
    }

    @OriginalMember(owner = "client!u", name = "d", descriptor = "(I)[Lbd;", line = 65)
    public static final class11[] method971(int arg0) {
        class11[] var1 = new class11[class86.field1944];
        for (int var2 = 0; var2 < class86.field1944; var2++) {
            class11 var3 = var1[var2] = new class11();
            var3.field224 = class113.field2648;
            var3.field222 = class107.field2460;
            var3.field223 = class43.field981[var2];
            var3.field219 = class113.field2646[var2];
            var3.field221 = class90.field2059[var2];
            var3.field225 = class50.field1057[var2];
            var3.field220 = class58.field1295;
            var3.field218 = class85.field1908[var2];
        }
        class9.method118(arg0 ^ 0xFFFFFF37);
        if (arg0 != 200) {
            method969(-21, -70);
        }
        field2890++;
        return var1;
    }

    @OriginalMember(owner = "client!u", name = "e", descriptor = "(I)V", line = 106)
    public static final void method972(int arg0) {
        field2887++;
        if (class113.field2652 < 2 && class57.field1199 == 0 && class122.field3003 == 0) {
            return;
        }
        class105 var1;
        if (class57.field1199 == 1 && class113.field2652 < 2) {
            var1 = class108.method878(new class105[] { class43.field1007, class67.field1525, class29.field661, class111.field2581 }, 2867);
        } else if (class122.field3003 == 1 && class113.field2652 < 2) {
            var1 = class108.method878(new class105[] { class84.field1884, class67.field1525, class105.field2386, class111.field2581 }, 2867);
        } else {
            var1 = class95.field2197[class113.field2652 - 1];
        }
        if (arg0 <= 40) {
            field2895 = null;
        }
        if (class113.field2652 > 2) {
            var1 = class108.method878(new class105[] { var1, class127.field3071, class75.method637(class113.field2652 - 2, 8241), class67.field1505 }, 2867);
        }
        class100.field2285.method659(var1, 4, 15, 16777215, true, class104.field2351 / 1000);
    }
}
