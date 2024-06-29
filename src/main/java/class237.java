import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public abstract class class237 {

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "Lbd;")
    public static class162 field3947 = class17.method142(0, "<br>");

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "[I")
    public static int[] field3948 = new int[50];

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "Lkl;")
    public static class247 field3946 = new class247();

    @OriginalMember(owner = "client!vi", name = "h", descriptor = "Lbd;")
    public static class162 field3951 = class17.method142(0, "Lade)3)3)3");

    @OriginalMember(owner = "client!vi", name = "i", descriptor = "Lbd;")
    public static class162 field3952 = class17.method142(0, "Lade Titelbild )2 ");

    @OriginalMember(owner = "client!vi", name = "j", descriptor = "[I")
    public static int[] field3953 = new int[] { 4, 4, 1, 2, 6, 4, 2, 50, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "I")
    public static int field3944;

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "I")
    public static int field3945;

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "I")
    public static int field3949;

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "I")
    public static int field3950;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)I", line = 5)
    public static final int method1678(int arg0, int arg1) {
        if (arg1 != -31981) {
            field3946 = (class247) null;
        }
        field3950++;
        int var7 = arg0 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(I)[Ldc;", line = 32)
    public static final class71[] method1679(int arg0) {
        field3949++;
        class71[] var1 = new class71[class129.field2334];
        if (arg0 > -30) {
            return (class71[]) null;
        }
        for (int var2 = 0; var2 < class129.field2334; var2++) {
            int var3 = class260.field4333[var2] * class190.field3253[var2];
            byte[] var4 = class317.field5350[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; var6 < var3; var6++) {
                var5[var6] = class306.field5152[class92.method695(255, var4[var6])];
            }
            if (class117.field2159) {
                var1[var2] = new class140(class238.field3962, class277.field4637, class127.field2312[var2], class40.field646[var2], class190.field3253[var2], class260.field4333[var2], var5);
            } else {
                var1[var2] = new class79(class238.field3962, class277.field4637, class127.field2312[var2], class40.field646[var2], class190.field3253[var2], class260.field4333[var2], var5);
            }
        }
        class247.method1738(-1);
        return var1;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Z)I", line = 80)
    public static final int method1680(boolean arg0) {
        field3944++;
        if (class289.field4878) {
            return 0;
        }
        if (!arg0) {
            method1680(false);
        }
        if (class4.method19(-128)) {
            return class45.field724 ? 2 : 1;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "(I)V", line = 102)
    public static void method1681(int arg0) {
        field3947 = null;
        field3948 = null;
        field3951 = null;
        field3952 = null;
        if (arg0 == 1) {
            field3946 = null;
            field3953 = null;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)V")
    public abstract void method839(int arg0);

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(III)I")
    public abstract int method837(int arg0, int arg1, int arg2);
}
