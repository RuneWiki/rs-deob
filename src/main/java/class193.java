import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class193 {

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "[[I")
    public static int[][] field3081 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!cm", name = "h", descriptor = "Ljava/lang/String;")
    public static String field3087 = "flash2:";

    @OriginalMember(owner = "client!cm", name = "g", descriptor = "Lta;")
    public static class197 field3086 = new class197(64);

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "I")
    public static int field3080;

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "I")
    public static int field3082;

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "I")
    public static int field3083;

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "I")
    public static int field3084;

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "I")
    public static int field3085;

    @OriginalMember(owner = "client!cm", name = "j", descriptor = "I")
    public static int field3089;

    @OriginalMember(owner = "client!cm", name = "i", descriptor = "Ljava/lang/String;")
    public static String field3088;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIII)V", line = 9)
    public static final void method1397(int arg0, int arg1, int arg2, int arg3) {
        field3084++;
        if (class261.field3874 != 0 && arg0 != 0 && class111.field1754 < 50 && arg3 != -1) {
            class54.field817[class111.field1754] = arg3;
            class142.field2199[class111.field1754] = arg0;
            class15.field179[class111.field1754] = arg1;
            class302.field4721[class111.field1754] = null;
            class133.field2096[class111.field1754] = 0;
            class111.field1754++;
        }
        if (arg2 > -48) {
            method1401(70);
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILhb;)Lgh;", line = 33)
    public static final class228 method1398(int arg0, class35 arg1) {
        if (arg0 != 8923) {
            method1400(-2, 59);
        }
        field3085++;
        return new class228(arg1.method260((byte) -45), arg1.method260((byte) 123), arg1.method260((byte) 112), arg1.method260((byte) 110), arg1.method269(false), arg1.method273(65280));
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIIIII)V", line = 45)
    public static final void method1399(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3083++;
        int var6 = class257.method1784((byte) 91, arg0, class34.field432, class75.field1064);
        int var7 = class257.method1784((byte) 91, arg1, class34.field432, class75.field1064);
        int var8 = class257.method1784((byte) 91, arg4, class298.field4667, class327.field5072);
        if (arg3 != -13053) {
            method1400(12, -12);
        }
        int var9 = class257.method1784((byte) 91, arg5, class298.field4667, class327.field5072);
        for (int var10 = var6; var10 <= var7; var10++) {
            class138.method1047(arg2, var9, var8, 7, class320.field4990[var10]);
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(II)V", line = 75)
    public static final void method1400(int arg0, int arg1) {
        field3080++;
        int var2 = 18 % ((-arg0 - 65) / 58);
        class58.field862.method1429((byte) 127, arg1);
        class146.field2223.method1429((byte) 127, arg1);
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)V", line = 86)
    public static void method1401(int arg0) {
        field3088 = null;
        field3087 = null;
        field3086 = null;
        field3081 = (int[][]) null;
        if (arg0 != -20564) {
            field3089 = -123;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(III)V", line = 109)
    public static final void method1402(int arg0, int arg1, int arg2) {
        class126 var3 = class324.method2228(0, arg0);
        field3082++;
        int var4 = var3.field1986;
        if (arg2 != -10753) {
            method1401(122);
        }
        int var5 = var3.field1985;
        int var6 = var3.field1987;
        int var7 = class318.field4951[var6 - var5];
        if (arg1 < 0 || var7 < arg1) {
            arg1 = 0;
        }
        int var8 = var7 << var5;
        class184.method1346((byte) 67, arg1 << var5 & var8 | class199.field3158[var4] & ~var8, var4);
    }
}
