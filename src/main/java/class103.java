import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oda")
public class class103 {

    @OriginalMember(owner = "client!oda", name = "c", descriptor = "I")
    public static int field1836 = 0;

    @OriginalMember(owner = "client!oda", name = "h", descriptor = "[I")
    public static int[] field1841 = new int[3];

    @OriginalMember(owner = "client!oda", name = "d", descriptor = "Lkj;")
    public static class527 field1837 = new class527(12, 2);

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "I")
    public static int field1834;

    @OriginalMember(owner = "client!oda", name = "b", descriptor = "I")
    public static int field1835;

    @OriginalMember(owner = "client!oda", name = "e", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!oda", name = "f", descriptor = "I")
    public static int field1839;

    @OriginalMember(owner = "client!oda", name = "g", descriptor = "I")
    public static int field1840;

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(III)Z")
    public static final boolean method958(int arg0, int arg1, int arg2) {
        field1838++;
        if (arg2 < 22) {
            method962(-52, 57);
        }
        return (arg1 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(B)Z")
    public final boolean method959(byte arg0) {
        int var2 = -56 % ((-arg0 - 31) / 32);
        field1840++;
        return class157.field2687 == this | class153.field2606 == this;
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(Lsaa;B)I")
    public static final int method960(class300 arg0, byte arg1) {
        field1834++;
        if (arg1 != 40) {
            field1841 = null;
        }
        String var2 = class121.method1047(arg0, false);
        int[] var3 = null;
        if (class129.method1095(-45, arg0.field4465)) {
            var3 = class268.field3985.method258((int) arg0.field4472, (byte) -67).field1971;
        } else if (arg0.field4471 != -1) {
            var3 = class268.field3985.method258(arg0.field4471, (byte) -67).field1971;
        } else if (class219.method1522(72, arg0.field4465)) {
            class436 var6 = (class436) class208.field3179.method2596((long) ((int) arg0.field4472), 44);
            if (var6 != null) {
                class22 var7 = var6.field6298;
                class334 var8 = var7.field880;
                if (var8.field4984 != null) {
                    var8 = var8.method2150(class113.field2038, arg1 ^ 0xFFFF8208);
                }
                if (var8 != null) {
                    var3 = var8.field4996;
                }
            }
        } else if (class602.method3438(arg0.field4465, -118)) {
            Object var4 = null;
            class56 var5;
            if (arg0.field4465 == 1001) {
                var5 = class237.field3521.method3515((int) arg0.field4472, 50);
            } else {
                var5 = class237.field3521.method3515((int) (arg0.field4472 >>> 32 & 0x7FFFFFFFL), 50);
            }
            if (var5.field1248 != null) {
                var5 = var5.method662(3433, class113.field2038);
            }
            if (var5 != null) {
                var3 = var5.field1309;
            }
        }
        if (var3 != null) {
            var2 = var2 + class367.method2319((byte) -85, var3);
        }
        int var9 = class141.field2478.method295(var2, (byte) -101, class126.field2308);
        if (arg0.field4460) {
            var9 += class173.field2851.method1792() + 4;
        }
        return var9;
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(I)V")
    public static void method961(int arg0) {
        field1837 = null;
        if (arg0 != -20336) {
            field1836 = 88;
        }
        field1841 = null;
    }

    @OriginalMember(owner = "client!oda", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1839++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(II)Lja;")
    public static final class254 method962(int arg0, int arg1) {
        field1835++;
        class254[] var2 = class301.method1990(279527169);
        for (int var3 = 0; var3 < var2.length; var3++) {
            if (var2[var3].field3764 == arg0) {
                return var2[var3];
            }
        }
        int var4 = 127 % ((arg1 - 25) / 33);
        return null;
    }
}
