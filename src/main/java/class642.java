import java.awt.Container;
import java.awt.Insets;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aaa")
public class class642 extends IOException {

    @OriginalMember(owner = "client!aaa", name = "c", descriptor = "[Lcda;")
    public static class183[] field8649 = new class183[50];

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "I")
    public static int field8647;

    @OriginalMember(owner = "client!aaa", name = "b", descriptor = "I")
    public static int field8648;

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(I)V", line = 5)
    public static void method3534(int arg0) {
        field8649 = null;
        int var1 = -73 / ((26 - arg0) / 48);
    }

    @OriginalMember(owner = "client!aaa", name = "b", descriptor = "(I)V", line = 14)
    public static final void method3535(int arg0) {
        field8647++;
        client var1 = class723.field9821;
        synchronized (class723.field9821) {
            if (class393.field5661 == null) {
                Container var2;
                if (class639.field8606 != null) {
                    var2 = class639.field8606;
                } else if (class552.field7624 == null) {
                    var2 = class468.field6609;
                } else {
                    var2 = class552.field7624;
                }
                class358.field5218 = var2.getSize().width;
                class482.field6754 = var2.getSize().height;
                if (class639.field8606 == var2) {
                    Insets var3 = class639.field8606.getInsets();
                    class358.field5218 -= var3.right + var3.left;
                    class482.field6754 -= var3.top + var3.bottom;
                }
                if (class164.method1133(-15388) == 1) {
                    class460.field6558 = class67.field933;
                    class693.field9222 = class187.field2450;
                    class589.field8043 = 0;
                    class523.field7268 = (class358.field5218 - class67.field933) / 2;
                } else {
                    class531.method3071(arg0 + 1);
                }
                if (class554.field7645 != class222.field2884) {
                    boolean var10000;
                    if (class460.field6558 < 1024 && class693.field9222 < 768) {
                        var10000 = true;
                    } else {
                        var10000 = false;
                    }
                }
                class669.field8962.setSize(class460.field6558, class693.field9222);
                if (class375.field5490 != null) {
                    if (class24.field246) {
                        class657.method3648(class669.field8962, (byte) 123);
                    } else {
                        class375.field5490.method546(class669.field8962, class460.field6558, class693.field9222);
                    }
                }
                if (class639.field8606 == var2) {
                    Insets var4 = class639.field8606.getInsets();
                    class669.field8962.setLocation(class523.field7268 + var4.left, class589.field8043 + var4.top);
                } else {
                    class669.field8962.setLocation(class523.field7268, class589.field8043);
                }
                if (class227.field2935 != arg0) {
                    class336.method2157(66, true);
                }
                class555.method3188(-32479);
            }
        }
    }

    @OriginalMember(owner = "client!aaa", name = "c", descriptor = "(I)V", line = 97)
    public static final void method3536(int arg0) {
        if (class720.field9789 < 0) {
            class720.field9789 = 0;
            class313.field4423 = -1;
            class213.field2800 = -1;
        }
        field8648++;
        if (class720.field9789 > class752.field10176) {
            class213.field2800 = -1;
            class720.field9789 = class752.field10176;
            class313.field4423 = -1;
        }
        int var1 = 58 % ((80 - arg0) / 32);
        if (class81.field1129 < 0) {
            class81.field1129 = 0;
            class313.field4423 = -1;
            class213.field2800 = -1;
        }
        if (class752.field10181 < class81.field1129) {
            class213.field2800 = -1;
            class313.field4423 = -1;
            class81.field1129 = class752.field10181;
        }
    }

    @OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 136)
    public class642(String arg0) {
        super(arg0);
    }
}
