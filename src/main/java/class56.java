import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class56 {

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "Z")
    public static boolean field853 = true;

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "I")
    public static int field856 = 0;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "I")
    public static int field852;

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "I")
    public static int field854;

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "I")
    public static int field855;

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "I")
    public static int field857;

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "[S")
    public static short[] field858;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IZI)Luc;", line = 6)
    public static final class202 method471(int arg0, boolean arg1, int arg2) {
        field852++;
        if (!arg1) {
            return (class202) null;
        }
        class202 var3 = new class202();
        for (class91 var4 = (class91) class243.field3641.method71((byte) -93); var4 != null; var4 = (class91) class243.field3641.method84(1)) {
            if (var4.field1471 && var4.method718(-75, arg2, arg0)) {
                var3.method1453(var4, 125);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)[Lwd;", line = 32)
    public static final class88[] method472(int arg0) {
        field854++;
        int var1 = 1 / ((arg0 - 29) / 59);
        class88[] var2 = new class88[class89.field1426];
        for (int var3 = 0; var3 < class89.field1426; var3++) {
            int var4 = class83.field1288[var3] * class309.field4887[var3];
            byte[] var5 = class207.field3277[var3];
            if (class107.field1759[var3]) {
                byte[] var8 = class116.field1878[var3];
                int[] var9 = new int[var4];
                for (int var10 = 0; var10 < var4; var10++) {
                    var9[var10] = class251.method1740(class164.method1234(var8[var10] << 24, -16777216), class260.field3873[class164.method1234(var5[var10], 255)]);
                }
                if (class162.field2623) {
                    var2[var3] = new class153(class185.field2926, class112.field1821, class61.field892[var3], class183.field2902[var3], class309.field4887[var3], class83.field1288[var3], var9);
                } else {
                    var2[var3] = new class224(class185.field2926, class112.field1821, class61.field892[var3], class183.field2902[var3], class309.field4887[var3], class83.field1288[var3], var9);
                }
            } else {
                int[] var6 = new int[var4];
                for (int var7 = 0; var7 < var4; var7++) {
                    var6[var7] = class260.field3873[class164.method1234(255, var5[var7])];
                }
                if (class162.field2623) {
                    var2[var3] = new class196(class185.field2926, class112.field1821, class61.field892[var3], class183.field2902[var3], class309.field4887[var3], class83.field1288[var3], var6);
                } else {
                    var2[var3] = new class317(class185.field2926, class112.field1821, class61.field892[var3], class183.field2902[var3], class309.field4887[var3], class83.field1288[var3], var6);
                }
            }
        }
        class260.method1796(1952227009);
        return var2;
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(I)V", line = 100)
    public static void method473(int arg0) {
        field858 = null;
        if (arg0 != -25693) {
            field856 = 19;
        }
    }
}
