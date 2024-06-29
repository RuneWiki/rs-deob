import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class160 {

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "I")
    public static int field2405 = -1;

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "I")
    public static volatile int field2408 = 0;

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "I")
    public static int field2407;

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "I")
    public static int field2409;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Z)V")
    public static final void method1160(boolean arg0) {
        field2406++;
        if (arg0) {
            method1161((byte) 127);
        }
        if (class91.field1417) {
            return;
        }
        class130.field1929 = true;
        if (class189.field2972) {
            class248.field3941 = (float) ((int) class248.field3941 - 17 & 0xFFFFFFF0);
        } else {
            class226.field3621 += (-class226.field3621 - 12.0F) / 2.0F;
        }
        class91.field1417 = true;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(B)V")
    public static final void method1161(byte arg0) {
        field2407++;
        int var1 = class73.field1118.method1788(class164.field2480);
        int var2 = -69 / ((63 - arg0) / 48);
        for (int var3 = 0; var3 < class14.field174; var3++) {
            int var7 = class73.field1118.method1788(class151.method1097(true, var3));
            if (var1 < var7) {
                var1 = var7;
            }
        }
        var1 += 8;
        int var4 = class14.field174 * 15 + 21;
        int var5 = class121.field1831 - (var1 / 2);
        if (class179.field2816 < (var1 + var5)) {
            var5 = class179.field2816 - var1;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        int var6 = class9.field156;
        if ((var6 + var4) > class163.field2449) {
            var6 = class163.field2449 - var4;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        if (class8.field127 == 1) {
            if (class9.field162 == class121.field1831 && class9.field156 == class64.field1017) {
                class259.field4109 = var6;
                class272.field4345 = var1;
                class209.field3233 = class14.field174 * 15 + (class284.field4471 ? 26 : 22);
                class8.field127 = 0;
                class207.field3185 = true;
                class237.field3737 = var5;
            }
        } else if (class73.field1126 == class121.field1831 && class9.field156 == class240.field3829) {
            class207.field3185 = true;
            class259.field4109 = var6;
            class8.field127 = 0;
            class237.field3737 = var5;
            class272.field4345 = var1;
            class209.field3233 = (class284.field4471 ? 26 : 22) + class14.field174 * 15;
        } else {
            class64.field1017 = class240.field3829;
            class9.field162 = class73.field1126;
            class8.field127 = 1;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIIILah;I)Z")
    public static final boolean method1162(int arg0, int arg1, int arg2, int arg3, int arg4, class295 arg5, int arg6) {
        field2409++;
        class35 var7 = class237.method1623(1, arg5.field4624);
        if (var7.field611 == -1) {
            return true;
        }
        int var9;
        if (arg5.field4596) {
            int var8 = arg5.field4579 + arg6;
            var9 = var8 & 0x3;
        } else {
            var9 = 0;
        }
        if (arg1 != 22174) {
            field2408 = 76;
        }
        class13 var10 = var7.method333(true, arg5.field4613, var9);
        if (var10 == null) {
            return false;
        }
        int var11 = arg5.field4592;
        int var12 = arg5.field4620;
        if ((var9 & 0x1) == 1) {
            var12 = arg5.field4592;
            var11 = arg5.field4620;
        }
        int var13 = var10.field151;
        int var14 = var10.field158;
        if (var7.field601) {
            var14 = var12 * 4;
            var13 = var11 * 4;
        }
        if (var7.field607 == 0) {
            var10.method110(arg2 * 4 + 48, (104 - (arg0 - -var11)) * 4 + 48, var14, var13);
        } else {
            var10.method109((arg2 * 4) + 48, 48 - -((104 - arg0 + -var11) * 4), var14, var13, var7.field607);
        }
        return true;
    }
}
