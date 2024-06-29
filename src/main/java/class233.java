import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class233 {

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "I")
    public static int field3942 = 0;

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
    public static int field3939;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "I")
    public static int field3940;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "I")
    public static int field3941;

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "I")
    public static int field3943;

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "I")
    public static int field3944;

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "I")
    public static int field3945;

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "I")
    public static int field3946;

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "I")
    public static int field3947;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "[I")
    public static int[] field3938;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)V")
    public static final void method1672(int arg0, int arg1) {
        field3941++;
        if (arg1 == 0) {
            return;
        }
        if (arg1 == 1) {
            class95.method679(123);
        } else if (arg1 == 2) {
            class123.method928(-26765);
        } else if (arg1 == 3) {
            class149.method1114(0);
        } else {
            throw new RuntimeException();
        }
        if (arg0 != 10) {
            method1675(49, 77);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIILhg;IIILme;Ljava/lang/String;I)V")
    public static final void method1673(int arg0, int arg1, int arg2, class207 arg3, int arg4, int arg5, int arg6, class165 arg7, String arg8, int arg9) {
        field3944++;
        int var10;
        if (class169.field2739 == 4) {
            var10 = (int) class265.field4432 & 0x7FF;
        } else {
            var10 = (int) class265.field4432 + class314.field5060 & 0x7FF;
        }
        int var11 = Math.max(arg3.field3484 / 2, arg3.field3481 / 2) + 10;
        int var12 = arg5 * arg5 + arg6 * arg6;
        if (var12 > (var11 * var11)) {
            return;
        }
        int var13 = class128.field2133[var10];
        int var14 = class128.field2130[var10];
        if (class169.field2739 != 4) {
            var14 = var14 * 256 / (class286.field4738 + 256);
            var13 = var13 * 256 / (class286.field4738 + 256);
        }
        int var15 = arg6 * var14 - (arg5 * var13) >> 16;
        int var16 = arg7.method1223(arg8, 100);
        int var17 = arg7.method1237(arg8, 100, 0);
        int var18 = arg5 * var14 + arg6 * var13 >> 16;
        int var19 = var18 - var16 / 2;
        if (arg1 <= -7 && (-arg3.field3484) <= var19 && var19 <= arg3.field3484 && (-arg3.field3481) <= var15 && var15 <= arg3.field3481) {
            class211.method1479(arg3.field3363, arg3.field3359);
            arg7.method1213(arg8, arg3.field3484 / 2 + arg2 + var19, arg3.field3481 / 2 + arg0 - var17 + -var15 + -arg4, var16, 50, arg9, 0, 256, 1, 0, 0);
            class211.method1486();
        }
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(II)V")
    public static final void method1674(int arg0, int arg1) {
        field3945++;
        if (arg1 >= -8) {
            method1672(54, 67);
        }
        class147.field2421 = 1000 / arg0;
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(II)I")
    public static final int method1675(int arg0, int arg1) {
        if (arg1 != 1) {
            method1672(2, -26);
        }
        field3943++;
        if (arg0 > 0) {
            return 1;
        } else if (arg0 < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V")
    public static final void method1676(int arg0) {
        class294.method2035(-85);
        field3947++;
        class220.method1566((byte) -69);
        class85.method597(false);
        class100.method708(-8660);
        class36.method220(1);
        class58.method370(true);
        class101.method717(23825);
        class100.method712((byte) 120);
        class121.method912(true);
        class46.method279((byte) 95);
        class33.method206(-120);
        class34.method209(false);
        class95.method676(false);
        class55.method350(-40);
        class127.method941((byte) 74);
        if (arg0 <= 70) {
            field3939 = -49;
        }
        class134.method998(0);
        class6.method41(-69);
        class244.method1750(-89);
        class272.method1922(141);
        class181.method1316((byte) 124);
        class300.method2055((byte) -119);
        class290.field4775.method94(34);
        class125.field2100.method94(34);
        class84.field1388.method94(34);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)V")
    public static void method1677(byte arg0) {
        if (arg0 != -7) {
            field3939 = 80;
        }
        field3938 = null;
    }

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "(II)Lqi;")
    public static final class190 method1678(int arg0, int arg1) {
        field3940++;
        class190 var2 = (class190) class195.field3119.method99((long) arg0, true);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class244.field4101.method1149(arg1, (byte) 30, arg0);
        class190 var4 = new class190();
        if (var3 != null) {
            var4.method1369(2, new class249(var3));
        }
        var4.method1372((byte) -60);
        class195.field3119.method100((long) arg0, var4, 53);
        return var4;
    }
}
