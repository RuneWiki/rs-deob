import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class275 {

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "Z")
    public static boolean field4544 = false;

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "I")
    public static int field4548 = 0;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "I")
    public static int field4543;

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "I")
    public static int field4545;

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "I")
    public static int field4546;

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "I")
    public static int field4547;

    @OriginalMember(owner = "client!pm", name = "g", descriptor = "I")
    public static int field4549;

    @OriginalMember(owner = "client!pm", name = "h", descriptor = "I")
    public static int field4550;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Ljava/lang/String;BZ)V", line = 9)
    public static final void method2050(String arg0, byte arg1, boolean arg2) {
        field4543++;
        if (arg0 == null) {
            return;
        }
        if (class93.field1561 >= 100) {
            class182.method1431(class270.field4493, (byte) -11);
            return;
        }
        String var3 = class81.method660(arg0, -239);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < class93.field1561; var4++) {
            String var5 = class81.method660(class239.field3946[var4], -239);
            if (var5 != null && var5.equals(var3)) {
                class182.method1431(arg0 + class173.field2760, (byte) -11);
                return;
            }
            if (class92.field1553[var4] != null) {
                String var6 = class81.method660(class92.field1553[var4], -239);
                if (var6 != null && var6.equals(var3)) {
                    class182.method1431(arg0 + class173.field2760, (byte) -11);
                    return;
                }
            }
        }
        for (int var7 = 0; var7 < class38.field570; var7++) {
            String var8 = class81.method660(class241.field3986[var7], -239);
            if (var8 != null && var8.equals(var3)) {
                class182.method1431(class335.field5301 + arg0 + class160.field2547, (byte) -11);
                return;
            }
            if (class121.field2021[var7] != null) {
                String var9 = class81.method660(class121.field2021[var7], arg1 ^ 0xFFFFFF5A);
                if (var9 != null && var9.equals(var3)) {
                    class182.method1431(class335.field5301 + arg0 + class160.field2547, (byte) -11);
                    return;
                }
            }
        }
        if (class81.method660(class6.field55.field4349, -239).equals(var3)) {
            class182.method1431(class116.field1948, (byte) -11);
            return;
        }
        if (arg1 != 75) {
            method2053(false);
        }
        class36.field520.method2228(206, arg1 + 16472);
        class87.field1495++;
        class36.field520.method1712(class163.method1261(1, arg0) + 1, -104);
        class36.field520.method1709(arg0, (byte) -89);
        class36.field520.method1712(arg2 ? 1 : 0, -96);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(ZLth;Lth;)V", line = 106)
    public static final void method2051(boolean arg0, class57 arg1, class57 arg2) {
        class288.field4694 = arg1;
        if (!arg0) {
            field4544 = false;
        }
        class70.field1229 = arg2;
        class70.field1229.method482(27535, 36);
        field4547++;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(B)I", line = 130)
    public static final int method2052(byte arg0) {
        field4550++;
        if (class89.field1502 != null) {
            return 3;
        } else if (class42.field607 && class35.field514) {
            return 2;
        } else if (class42.field607 && !class35.field514) {
            return 1;
        } else if (arg0 == -115) {
            return 0;
        } else {
            return 8;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Z)V", line = 152)
    public static final void method2053(boolean arg0) {
        field4545++;
        class187.method1471();
        for (int var1 = 0; var1 < 4; var1++) {
            class32.field459[var1].method137(1);
        }
        if (!arg0) {
            field4548 = 78;
        }
        System.gc();
    }
}
