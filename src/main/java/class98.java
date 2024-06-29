import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class98 {

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "Lud;")
    public static class279 field1835 = class130.method1024("cyan:", 255);

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "I")
    public static int field1839 = 0;

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "Lud;")
    private static class279 field1844 = class130.method1024("slide:", 255);

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "Lud;")
    public static class279 field1842 = field1844;

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "Lud;")
    public static class279 field1838 = field1844;

    @OriginalMember(owner = "client!ca", name = "k", descriptor = "Lhc;")
    public static class171 field1845 = new class171(64);

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "I")
    public static int field1837;

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "I")
    public static int field1840;

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "I")
    public static int field1843;

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "I")
    public static int field1846;

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "[I")
    public static int[] field1836;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)V", line = 10)
    public static void method841(byte arg0) {
        field1835 = null;
        field1842 = null;
        field1845 = null;
        field1844 = null;
        field1836 = null;
        field1838 = null;
        int var1 = 61 % ((-arg0 - 63) / 59);
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(B)V", line = 29)
    public static final void method842(byte arg0) {
        field1843++;
        int var1 = 21 / ((-arg0 - 19) / 55);
        for (int var2 = 0; var2 < class26.field626; var2++) {
            int var3 = class200.field3579[var2];
            class102 var4 = class122.field2196[var3];
            if (var4 != null) {
                class278.method1961(var4.field1921.field2266, var4, -109);
            }
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(BZLud;)V", line = 63)
    public static final void method843(byte arg0, boolean arg1, class279 arg2) {
        if (arg0 <= 122) {
            return;
        }
        class279 var3 = arg2.method2002((byte) -94);
        field1837++;
        int var4 = 0;
        int var5 = arg1 ? 32768 : 0;
        int var6 = var5 + (arg1 ? class324.field5668 : class250.field4459);
        short[] var7 = new short[16];
        for (int var8 = var5; var8 < var6; var8++) {
            class307 var9 = class230.method1666((byte) -19, var8);
            if (var9.field5457 && var9.method2180(20).method2002((byte) -94).method1989(var3, (byte) -72) != -1) {
                if (var4 >= 50) {
                    class309.field5484 = -1;
                    class84.field1602 = null;
                    return;
                }
                if (var7.length <= var4) {
                    short[] var10 = new short[var7.length * 2];
                    for (int var11 = 0; var11 < var4; var11++) {
                        var10[var11] = var7[var11];
                    }
                    var7 = var10;
                }
                var7[var4++] = (short) var8;
            }
        }
        class280.field5004 = 0;
        class309.field5484 = var4;
        class84.field1602 = var7;
        class279[] var12 = new class279[class309.field5484];
        for (int var13 = 0; var13 < class309.field5484; var13++) {
            var12[var13] = class230.method1666((byte) -19, var7[var13]).method2180(34);
        }
        class278.method1965(class84.field1602, (byte) -106, var12);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(DI)V", line = 136)
    public static final void method844(double arg0, int arg1) {
        field1841++;
        if (class131.field2397 != arg0) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg0) * 255.0D);
                class212.field3723[var3] = var4 <= 255 ? var4 : 255;
            }
            class131.field2397 = arg0;
        }
        if (arg1 <= 89) {
            field1838 = (class279) null;
        }
    }
}
