import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class56 {

    @OriginalMember(owner = "client!si", name = "e", descriptor = "Lck;")
    public static class1 field968 = new class1(128);

    @OriginalMember(owner = "client!si", name = "p", descriptor = "[S")
    public static short[] field979 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!si", name = "r", descriptor = "[I")
    public static int[] field981 = new int[50];

    @OriginalMember(owner = "client!si", name = "s", descriptor = "I")
    public static int field982 = 64;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "I")
    public int field964;

    @OriginalMember(owner = "client!si", name = "b", descriptor = "I")
    public static int field965;

    @OriginalMember(owner = "client!si", name = "c", descriptor = "I")
    public int field966;

    @OriginalMember(owner = "client!si", name = "d", descriptor = "I")
    public int field967;

    @OriginalMember(owner = "client!si", name = "f", descriptor = "I")
    public int field969;

    @OriginalMember(owner = "client!si", name = "g", descriptor = "I")
    public static int field970;

    @OriginalMember(owner = "client!si", name = "h", descriptor = "I")
    public int field971;

    @OriginalMember(owner = "client!si", name = "j", descriptor = "I")
    public static int field973;

    @OriginalMember(owner = "client!si", name = "k", descriptor = "I")
    public static int field974;

    @OriginalMember(owner = "client!si", name = "m", descriptor = "I")
    public static int field976;

    @OriginalMember(owner = "client!si", name = "n", descriptor = "I")
    public int field977;

    @OriginalMember(owner = "client!si", name = "o", descriptor = "I")
    public static int field978;

    @OriginalMember(owner = "client!si", name = "i", descriptor = "Lvh;")
    public static class108 field972;

    @OriginalMember(owner = "client!si", name = "l", descriptor = "[I")
    public static int[] field975;

    @OriginalMember(owner = "client!si", name = "q", descriptor = "[I")
    public static int[] field980;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Z)V")
    public static final void method347(boolean arg0) {
        field974++;
        class61.field1071 = 0;
        class292.field4664 = 0;
        class216.method1437(1);
        class291.method1961(false);
        class11.method70(0);
        for (int var1 = 0; var1 < class61.field1071; var1++) {
            int var3 = class248.field4070[var1];
            if (class266.field4301 != class42.field625[var3].field1406) {
                if (class42.field625[var3].field2421.method1399((byte) -86)) {
                    class99.method627(class42.field625[var3], true);
                }
                class42.field625[var3].method989((class208) null, (byte) 67);
                class42.field625[var3] = null;
            }
        }
        if (class101.field1747 != class248.field4058.field1762) {
            throw new RuntimeException("gnp1 pos:" + class248.field4058.field1762 + " psize:" + class101.field1747);
        }
        if (!arg0) {
            field982 = 83;
        }
        for (int var2 = 0; var2 < class187.field3037; var2++) {
            if (class42.field625[class292.field4668[var2]] == null) {
                throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class187.field3037);
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(BI)Lak;")
    public static final class19 method348(byte arg0, int arg1) {
        if (arg0 < 25) {
            method347(false);
        }
        field970++;
        class19 var2 = (class19) class2.field16.method57((long) arg1, -72);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class132.field2304.method746(arg1, (byte) -128, 3);
        class19 var4 = new class19();
        if (var3 != null) {
            var4.method134(new class101(var3), -24072);
        }
        class2.field16.method62(0, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIIII)V")
    public static final void method349(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field973++;
        if (class126.field2222 <= arg0 && class118.field2098 >= arg2 && class118.field2094 <= arg5 && arg1 <= class89.field1582) {
            class171.method1153(arg3, arg1, arg5, arg2, arg0, (byte) 71);
        } else {
            class268.method1762(arg2, arg1, arg3, arg5, (byte) 112, arg0);
        }
        if (arg4 != -7349) {
            method350((byte) 11);
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(B)V")
    public static void method350(byte arg0) {
        field968 = null;
        int var1 = -75 / ((arg0 + 42) / 52);
        field975 = null;
        field980 = null;
        field979 = null;
        field981 = null;
        field972 = null;
    }
}
