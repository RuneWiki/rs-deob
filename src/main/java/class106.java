import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class106 extends class161 {

    @OriginalMember(owner = "client!vb", name = "n", descriptor = "I")
    public int field1480 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!vb", name = "p", descriptor = "I")
    public int field1482 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!vb", name = "s", descriptor = "I")
    public int field1485 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!vb", name = "x", descriptor = "I")
    public int field1490 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!vb", name = "l", descriptor = "I")
    public int field1478 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!vb", name = "u", descriptor = "I")
    public int field1487 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!vb", name = "y", descriptor = "I")
    public int field1491 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!vb", name = "A", descriptor = "I")
    public int field1493 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!vb", name = "q", descriptor = "Lbr;")
    public class222 field1483;

    @OriginalMember(owner = "client!vb", name = "o", descriptor = "[B")
    public static byte[] field1481 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!vb", name = "C", descriptor = "[Lko;")
    public static class292[] field1495 = new class292[29];

    @OriginalMember(owner = "client!vb", name = "m", descriptor = "I")
    public static int field1479;

    @OriginalMember(owner = "client!vb", name = "r", descriptor = "I")
    public static int field1484;

    @OriginalMember(owner = "client!vb", name = "t", descriptor = "I")
    public static int field1486;

    @OriginalMember(owner = "client!vb", name = "v", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!vb", name = "w", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!vb", name = "z", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!vb", name = "B", descriptor = "I")
    public static int field1494;

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Lbr;)V", line = 132)
    public class106(class222 arg0) {
        this.field1483 = arg0;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(III)Z", line = 11)
    public final boolean method800(int arg0, int arg1, int arg2) {
        field1494++;
        if (this.field1478 <= arg0 && arg0 <= this.field1480 && arg1 >= this.field1482 && arg1 <= this.field1485) {
            return true;
        } else if (arg0 >= this.field1490 && arg0 <= this.field1493 && this.field1487 <= arg1 && this.field1491 >= arg1) {
            return true;
        } else {
            if (arg2 != Integer.MAX_VALUE) {
                method802(-79);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(Z)V", line = 33)
    public static final void method801(boolean arg0) {
        if (!arg0) {
            return;
        }
        class89.field1112.method336(-70);
        field1479++;
        class338.field5247.method336(-46);
        class182.field2978.method336(97);
        class84.field1047.method336(107);
        class7.field92.method336(-128);
    }

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "(I)Lpn;", line = 48)
    public static final class444 method802(int arg0) {
        field1488++;
        try {
            return arg0 <= 106 ? null : (class444) Class.forName("jf").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(B)V", line = 80)
    public static void method803(byte arg0) {
        int var1 = -54 % ((arg0 - 11) / 57);
        field1481 = null;
        field1495 = null;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIII)V", line = 114)
    public static final void method804(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class11.field139.method2224(158, (byte) 0);
        field1486++;
        class351.field5425++;
        if (arg1 != -10437) {
            method801(false);
        }
        class11.field139.method1315(arg4, (byte) 110);
        class11.field139.method1283(8, arg3);
        class11.field139.method1315(arg2, (byte) 68);
        class11.field139.method1298(arg0, -111);
    }
}
