import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public abstract class class226 {

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "I")
    public static int field3374 = 999999;

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "Z")
    public static boolean field3375 = false;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "I")
    public static int field3369;

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "I")
    public static int field3373;

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "Ltj;")
    public static class108 field3370;

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "[Z")
    public static boolean[] field3372;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V", line = 3)
    public static void method1581(int arg0) {
        if (arg0 <= 77) {
            field3370 = null;
        }
        field3370 = null;
        field3372 = null;
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(I)V", line = 14)
    public static final void method1582(int arg0) {
        field3373++;
        if (arg0 == 4437) {
            class243.field3604.method98(0);
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(BI)Lrg;", line = 26)
    public static final class385 method1583(byte arg0, int arg1) {
        field3369++;
        class15 var2 = class392.field5506;
        class385 var3;
        synchronized (class392.field5506) {
            var3 = (class385) class392.field5506.method99(true, (long) arg1);
            if (var3 == null) {
                var3 = new class385(arg1);
                class392.field5506.method90(var3, (long) arg1, arg0 ^ 0xD);
            }
        }
        if (arg0 != 13) {
            field3370 = null;
        }
        synchronized (var3) {
            return var3.method2446((byte) -122) ? var3 : null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lml;B)[Lj;", line = 54)
    public static final class321[] method1584(class219 arg0, byte arg1) {
        field3371++;
        if (!arg0.method1539(arg1 ^ 0xFFFFFFEB)) {
            return new class321[0];
        }
        class156 var2 = arg0.method1532((byte) 85);
        while (var2.field2298 == 0) {
            class259.method1790((byte) -126, 10L);
        }
        if (var2.field2298 == 2) {
            return new class321[0];
        }
        if (arg1 != -21) {
            field3374 = -58;
        }
        int[] var3 = (int[]) var2.field2295;
        class321[] var4 = new class321[var3.length >> 2];
        for (int var5 = 0; var5 < var4.length; var5++) {
            class321 var6 = new class321();
            var4[var5] = var6;
            var6.field4698 = var3[var5 << 2];
            var6.field4693 = var3[(var5 << 2) + 1];
            var6.field4695 = var3[(var5 << 2) + 2];
            var6.field4694 = var3[(var5 << 2) + 3];
        }
        return var4;
    }
}
