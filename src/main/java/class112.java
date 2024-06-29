import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class112 {

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "[Ljava/lang/String;")
    private String[] field1574;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "I")
    public static int field1572 = 205;

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "I")
    public static int field1573;

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "I")
    public static int field1575;

    @OriginalMember(owner = "client!tm", name = "e", descriptor = "I")
    public static int field1576;

    @OriginalMember(owner = "client!tm", name = "f", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(II)Ljava/lang/String;", line = 48)
    public final String method695(int arg0, int arg1) {
        if (arg0 > -111) {
            field1572 = -126;
        }
        field1573++;
        return this.field1574[arg1];
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(ZIZ)Ljava/lang/String;", line = 108)
    public static final String method696(boolean arg0, int arg1, boolean arg2) {
        field1576++;
        if (arg2 && arg1 >= 0) {
            if (!arg0) {
                method697(105);
            }
            return class224.method1412(10, arg2, (byte) -128, arg1);
        } else {
            return Integer.toString(arg1);
        }
    }

    @OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", line = 123)
    public class112(String arg0, String arg1, String arg2, String arg3) {
        this.field1574 = new String[] { arg0, arg1, arg2, arg3 };
    }

    @OriginalMember(owner = "client!tm", name = "toString", descriptor = "()Ljava/lang/String;", line = 137)
    public final String toString() {
        field1577++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)V", line = 149)
    public static final void method697(int arg0) {
        field1575++;
        if (class90.field1344 != null || arg0 != 1024) {
            return;
        }
        Container var1;
        if (class240.field3384 == null) {
            var1 = class343.field4703.field234;
        } else {
            var1 = class240.field3384;
        }
        class3.field28 = var1.getSize().width;
        class77.field1166 = var1.getSize().height;
        if (class240.field3384 == var1) {
            Insets var2 = class240.field3384.getInsets();
            class77.field1166 -= var2.top + var2.bottom;
            class3.field28 -= var2.right + var2.left;
        }
        if (class18.method156((byte) 111) == 1) {
            class335.field4600 = (class3.field28 - class407.field5642) / 2;
            class67.field987 = class407.field5642;
            class371.field5248 = class451.field6225;
            class192.field2743 = 0;
        } else if (class154.field2227 < 96 && class221.field3118 == 0) {
            int var3 = class3.field28 <= 1024 ? class3.field28 : 1024;
            class67.field987 = var3;
            class335.field4600 = (class3.field28 - var3) / 2;
            int var4 = class77.field1166 > 768 ? 768 : class77.field1166;
            class371.field5248 = var4;
            class192.field2743 = 0;
        } else {
            class67.field987 = class3.field28;
            class335.field4600 = 0;
            class371.field5248 = class77.field1166;
            class192.field2743 = 0;
        }
        if (class96.field1373 != class396.field5558) {
            boolean var10000;
            if (class67.field987 < 1024 && class371.field5248 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        class138.field1965.setSize(class67.field987, class371.field5248);
        if (class338.field4636 != null) {
            class338.field4636.method1101();
        }
        if (class240.field3384 == var1) {
            Insets var5 = class240.field3384.getInsets();
            class138.field1965.setLocation(class335.field4600 + var5.left, class192.field2743 + var5.top);
        } else {
            class138.field1965.setLocation(class335.field4600, class192.field2743);
        }
        if (class182.field2652 != -1) {
            class110.method688((byte) -30, true);
        }
        class406.method2384(-1);
    }
}
