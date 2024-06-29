import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ria")
public class class302 {

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "I")
    public static int field4353;

    @OriginalMember(owner = "client!ria", name = "b", descriptor = "I")
    public static int field4354;

    @OriginalMember(owner = "client!ria", name = "c", descriptor = "I")
    public static int field4355;

    @OriginalMember(owner = "client!ria", name = "d", descriptor = "I")
    public static int field4356;

    @OriginalMember(owner = "client!ria", name = "e", descriptor = "I")
    public static int field4357;

    @OriginalMember(owner = "client!ria", name = "f", descriptor = "I")
    public static int field4358;

    @OriginalMember(owner = "client!ria", name = "g", descriptor = "Laj;")
    public static class333 field4359;

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(CIB)I", line = 3)
    public static final int method1904(char arg0, int arg1, byte arg2) {
        field4354++;
        if (arg2 <= 46) {
            field4359 = null;
        }
        int var3 = arg0 << 4;
        if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
            char var4 = Character.toLowerCase(arg0);
            var3 = (var4 << 4) + 1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(B)Z", line = 23)
    public static final boolean method1905(byte arg0) {
        if (arg0 != -48) {
            field4359 = null;
        }
        field4355++;
        if (class458.field6355 == 3) {
            return class674.field9468 == 0 && class268.field3949 == 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(I[BII)[B", line = 44)
    public static final byte[] method1906(int arg0, byte[] arg1, int arg2, int arg3) {
        field4358++;
        byte[] var4 = new byte[arg2];
        class278.method1796(arg1, arg3, var4, 0, arg2);
        return arg0 == 19691 ? var4 : null;
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(III)I", line = 60)
    public static final int method1907(int arg0, int arg1, int arg2) {
        field4353++;
        if (arg0 != 8443) {
            field4359 = null;
        }
        int var3 = 0;
        while (arg2 > 0) {
            var3 = var3 << 1 | arg1 & 0x1;
            arg1 >>>= 0x1;
            arg2--;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(Z)[I", line = 81)
    public static final int[] method1908(boolean arg0) {
        field4356++;
        if (arg0) {
            field4359 = null;
        }
        return new int[] { class691.field9699, class229.field3121, class45.field676 };
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(I)V", line = 92)
    public static void method1909(int arg0) {
        field4359 = null;
        if (arg0 < 96) {
            field4359 = null;
        }
    }

    @OriginalMember(owner = "client!ria", name = "b", descriptor = "(I)J", line = 104)
    public static final synchronized long method1910(int arg0) {
        field4357++;
        long var1 = System.currentTimeMillis();
        if (class632.field8830 > var1) {
            class117.field1681 += class632.field8830 - var1;
        }
        class632.field8830 = var1;
        return arg0 == 0 ? class117.field1681 + var1 : -119L;
    }

    @OriginalMember(owner = "client!ria", name = "b", descriptor = "(Z)V", line = 127)
    public static final void method1911(boolean arg0) {
        if (arg0) {
            class626.field8501 = class747.field10304;
            class528.field7227 = class538.field7317;
        } else {
            class626.field8501 = class513.field7033;
            class528.field7227 = class412.field5933;
        }
        class315.field4541 = class626.field8501.length;
    }
}
