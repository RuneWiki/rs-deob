import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class39 {

    @OriginalMember(owner = "client!je", name = "b", descriptor = "Llf;")
    public class260 field572;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "I")
    public int field573;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "Ljl;")
    public static class332 field574 = new class332(64);

    @OriginalMember(owner = "client!je", name = "g", descriptor = "I")
    public static int field577 = 0;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "I")
    public static int field571;

    @OriginalMember(owner = "client!je", name = "e", descriptor = "I")
    public static int field575;

    @OriginalMember(owner = "client!je", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field576;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ILjava/lang/String;)V", line = 4)
    public static final void method257(int arg0, String arg1) {
        field571++;
        if (arg1 == null) {
            return;
        }
        if (!(class38.field570 < 100 || class134.field2256) || class38.field570 >= 200) {
            class182.method1431(class236.field3916, (byte) -11);
            return;
        }
        String var2 = class81.method660(arg1, -239);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class38.field570; var3++) {
            String var4 = class81.method660(class241.field3986[var3], -239);
            if (var4 != null && var4.equals(var2)) {
                class182.method1431(arg1 + class231.field3840, (byte) -11);
                return;
            }
            if (class121.field2021[var3] != null) {
                String var5 = class81.method660(class121.field2021[var3], -239);
                if (var5 != null && var5.equals(var2)) {
                    class182.method1431(arg1 + class231.field3840, (byte) -11);
                    return;
                }
            }
        }
        for (int var6 = arg0; var6 < class93.field1561; var6++) {
            String var7 = class81.method660(class239.field3946[var6], arg0 - 239);
            if (var7 != null && var7.equals(var2)) {
                class182.method1431(class230.field3832 + arg1 + class183.field2951, (byte) -11);
                return;
            }
            if (class92.field1553[var6] != null) {
                String var8 = class81.method660(class92.field1553[var6], arg0 ^ 0xFFFFFF11);
                if (var8 != null && var8.equals(var2)) {
                    class182.method1431(class230.field3832 + arg1 + class183.field2951, (byte) -11);
                    return;
                }
            }
        }
        if (class81.method660(class6.field55.field4349, -239).equals(var2)) {
            class182.method1431(class335.field5303, (byte) -11);
        } else {
            class329.field5225++;
            class36.field520.method2228(93, arg0 ^ 0x40A3);
            class36.field520.method1712(class163.method1261(1, arg1), -99);
            class36.field520.method1709(arg1, (byte) 101);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(III)I", line = 98)
    public static final int method258(int arg0, int arg1, int arg2) {
        field575++;
        int var3 = arg1;
        while (arg0 > 1) {
            if ((arg0 & 0x1) != 0) {
                var3 = arg2 * var3;
            }
            arg2 *= arg2;
            arg0 >>= 0x1;
        }
        if (arg0 == 1) {
            return arg2 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V", line = 131)
    public static void method259(byte arg0) {
        field574 = null;
        if (arg0 == -76) {
            field576 = null;
        }
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "(II)V", line = 144)
    public class39(int arg0, int arg1) {
        this.field572 = class31.method215(arg0, 115);
        this.field573 = arg1;
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Llf;I)V", line = 153)
    public class39(class260 arg0, int arg1) {
        this.field573 = arg1;
        this.field572 = arg0;
    }
}
