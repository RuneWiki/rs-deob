import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class384 {

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "Lwo;")
    private class522 field5400;

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "Luf;")
    public static class310 field5395 = new class310(11, 6);

    @OriginalMember(owner = "client!gh", name = "l", descriptor = "[I")
    public static int[] field5403 = new int[5];

    @OriginalMember(owner = "client!gh", name = "k", descriptor = "Lqi;")
    public static class398 field5402 = new class398();

    @OriginalMember(owner = "client!gh", name = "m", descriptor = "I")
    public static int field5404 = 0;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "I")
    public static int field5392;

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "I")
    public static int field5393;

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "I")
    public static int field5394;

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "I")
    public static int field5396;

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "I")
    public static int field5397;

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "I")
    public static int field5399;

    @OriginalMember(owner = "client!gh", name = "j", descriptor = "I")
    public static int field5401;

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "Lki;")
    private class499 field5398;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Z)V")
    public static void method2202(boolean arg0) {
        field5402 = null;
        field5395 = null;
        if (!arg0) {
            field5403 = null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(Z)Lki;")
    public final class499 method2203(boolean arg0) {
        field5396++;
        class499 var2 = this.field5400.field7697.field7336;
        if (this.field5400.field7697 == var2) {
            this.field5398 = null;
            return null;
        }
        this.field5398 = var2.field7336;
        if (arg0) {
            field5402 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ILwo;)V")
    public final void method2204(int arg0, class522 arg1) {
        this.field5400 = arg1;
        if (arg0 < -1) {
            field5393++;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)Lki;")
    public final class499 method2205(int arg0) {
        field5394++;
        class499 var2 = this.field5398;
        if (arg0 != 1317274464) {
            return null;
        } else if (this.field5400.field7697 == var2) {
            this.field5398 = null;
            return null;
        } else {
            this.field5398 = var2.field7336;
            return var2;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ZI)S")
    public static final short method2206(boolean arg0, int arg1) {
        field5399++;
        int var2 = (arg1 & 0xFE58) >> 10;
        int var3 = (arg1 & 0x386) >> 3;
        if (!arg0) {
            field5404 = 90;
        }
        int var4 = arg1 & 0x7F;
        int var5 = var4 > 64 ? (127 - var4) * var3 >> 7 : var3 * var4 >> 7;
        int var6 = var4 + var5;
        int var7;
        if (var6 == 0) {
            var7 = var5 << 1;
        } else {
            var7 = (var5 << 8) / var6;
        }
        return (short) (var2 << 10 | var7 >> 4 << 7 | var6);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(BLss;II)V")
    public static final void method2207(byte arg0, class295 arg1, int arg2, int arg3) {
        field5401++;
        class382 var4 = arg1.method1690(arg0 + 107, class418.field6109);
        if (arg0 != -108 || var4 == null) {
            return;
        }
        class418.field6109.method462(arg2, arg3, arg1.field4022 + arg2, arg3 - -arg1.field3960);
        if (class166.field2346 < 3) {
            class359.field4908.method3105((float) arg1.field4022 / 2.0F + (float) arg2, (float) arg1.field3960 / 2.0F + (float) arg3, 4096, ((int) (-class40.field553) & 0x3FFF) << 2, var4, arg2, arg3);
        } else {
            class418.field6109.method517(-16777216, var4, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "()V")
    public class384() {
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(Lwo;)V")
    public class384(class522 arg0) {
        this.field5400 = arg0;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ILem;)I")
    public static final int method2208(int arg0, class149 arg1) {
        field5392++;
        String var2 = class224.method1327(arg1, 6645);
        int[] var3 = null;
        if (arg0 < 55) {
            method2207((byte) 54, null, 80, -80);
        }
        if (class230.method1346(arg1.field2102, -98)) {
            var3 = class75.field1097.method823(false, (int) arg1.field2105).field4381;
        } else if (arg1.field2101 != -1) {
            var3 = class75.field1097.method823(false, arg1.field2101).field4381;
        } else if (class411.method2447((byte) 101, arg1.field2102)) {
            class405 var6 = class179.field2534[(int) arg1.field2105];
            if (var6 != null) {
                class336 var7 = var6.field5623;
                if (var7.field4612 != null) {
                    var7 = var7.method1860(class453.field6623, (byte) -112);
                }
                if (var7 != null) {
                    var3 = var7.field4603;
                }
            }
        } else if (class67.method418(arg1.field2102, 21)) {
            Object var4 = null;
            class132 var5;
            if (arg1.field2102 == 1003) {
                var5 = class82.field1154.method2121((int) arg1.field2105, true);
            } else {
                var5 = class82.field1154.method2121((int) (arg1.field2105 >>> 32 & 0x7FFFFFFFL), true);
            }
            if (var5.field1814 != null) {
                var5 = var5.method870(0, class453.field6623);
            }
            if (var5 != null) {
                var3 = var5.field1888;
            }
        }
        if (var3 != null) {
            var2 = var2 + class334.method1851(var3, 0);
        }
        int var8 = class105.field1430.method365(var2, 13299, class272.field3713);
        if (arg1.field2099) {
            var8 += class106.field1442.method125() + 4;
        }
        return var8;
    }
}
