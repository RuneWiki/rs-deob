import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class1 {

    @OriginalMember(owner = "client!a", name = "a", descriptor = "Lec;")
    public static class32 field1 = class73.method594(" )2> ", true);

    @OriginalMember(owner = "client!a", name = "d", descriptor = "Lec;")
    public static class32 field4 = class73.method594("Hierhin gehen", true);

    @OriginalMember(owner = "client!a", name = "g", descriptor = "Lec;")
    public static class32 field7 = class73.method594("Ung-Ultige Session)2ID)3", true);

    @OriginalMember(owner = "client!a", name = "c", descriptor = "Z")
    public static volatile boolean field3 = true;

    @OriginalMember(owner = "client!a", name = "j", descriptor = "Lec;")
    private static class32 field10 = class73.method594("Please wait 5 minutes before trying again)3", true);

    @OriginalMember(owner = "client!a", name = "h", descriptor = "I")
    public static int field8 = 0;

    @OriginalMember(owner = "client!a", name = "k", descriptor = "I")
    public static int field11 = 0;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "Lec;")
    public static class32 field12 = field10;

    @OriginalMember(owner = "client!a", name = "n", descriptor = "Lec;")
    public static class32 field14 = class73.method594("(U(Y", true);

    @OriginalMember(owner = "client!a", name = "m", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "Lga;")
    public static class44 field6;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "[Lh;")
    public static class49[] field2;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)[Lh;")
    public static final class49[] method1(int arg0) {
        field13++;
        class49[] var1 = new class49[class92.field2112];
        for (int var2 = 0; var2 < class92.field2112; var2++) {
            class49 var3 = var1[var2] = new class49();
            var3.field1139 = class152.field3508;
            var3.field1141 = class128.field2967;
            var3.field1140 = class70.field1639[var2];
            var3.field1144 = class74.field1747[var2];
            var3.field1142 = class126.field2927[var2];
            var3.field1143 = class34.field720[var2];
            int var4 = var3.field1143 * var3.field1142;
            byte[] var5 = class147.field3346[var2];
            var3.field1145 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                var3.field1145[var6] = class31.field616[class41.method326(255, var5[var6])];
            }
        }
        if (arg0 != 9590) {
            method3(92);
        }
        class70.method580((byte) 29);
        return var1;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(III)V")
    public static final void method2(int arg0, int arg1, int arg2) {
        field5++;
        if (~class4.field72 != arg2 && class4.field72 != 3 || class79.field1827 != 1) {
            return;
        }
        int var3 = class9.field166 - arg0 - 25;
        int var4 = class66.field1590 - arg1 - 5;
        if (var3 < 0 || var4 < 0 || var3 >= 146 || var4 >= 151) {
            return;
        }
        var3 -= 73;
        var4 -= 75;
        int var5 = class27.field493 + class133.field3056 & 0x7FF;
        int var6 = class7.field113[var5];
        int var7 = (class29.field527 + 256) * var6 >> 8;
        int var8 = class7.field121[var5];
        int var9 = (class29.field527 + 256) * var8 >> 8;
        int var10 = var4 * var9 - var3 * var7 >> 11;
        int var11 = var3 * var9 + var4 * var7 >> 11;
        int var12 = class20.field373.field2700 - var10 >> 7;
        int var13 = class20.field373.field2749 + var11 >> 7;
        boolean var14 = class94.method749(true, 0, class20.field373.field2738[0], -1, 0, 0, var13, class20.field373.field2761[0], 0, var12, 0, 1);
        if (!var14) {
            return;
        }
        class44.field1027.method515((byte) 115, var3);
        class44.field1027.method515((byte) 78, var4);
        class44.field1027.method514(class133.field3056, (byte) -76);
        class44.field1027.method515((byte) 62, 57);
        class44.field1027.method515((byte) 61, class27.field493);
        class44.field1027.method515((byte) 123, class29.field527);
        class44.field1027.method515((byte) 69, 89);
        class44.field1027.method514(class20.field373.field2749, (byte) -76);
        class44.field1027.method514(class20.field373.field2700, (byte) -76);
        class44.field1027.method515((byte) 89, class57.field1328);
        class44.field1027.method515((byte) 98, 63);
        return;
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(I)V")
    public static void method3(int arg0) {
        field10 = null;
        if (arg0 <= 84) {
            field2 = null;
        }
        field7 = null;
        field14 = null;
        field4 = null;
        field12 = null;
        field1 = null;
        field6 = null;
        field2 = null;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIZLea;)Lhb;")
    public static final class51 method4(int arg0, int arg1, boolean arg2, class30 arg3) {
        if (!arg2) {
            method3(42);
        }
        field9++;
        return class28.method193(arg1, arg3, -308039560, arg0) ? class94.method743(0) : null;
    }
}
