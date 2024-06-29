import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public class class347 {

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "I")
    public static int field5122;

    @OriginalMember(owner = "client!ev", name = "b", descriptor = "I")
    public static int field5123;

    @OriginalMember(owner = "client!ev", name = "c", descriptor = "I")
    public static int field5124;

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(Lraa;IZI)V")
    public static final void method2213(class353 arg0, int arg1, boolean arg2, int arg3) {
        if (arg2) {
            class25.field249 = arg0;
            class481.field6949 = arg3;
            class735.field10354 = arg1;
            field5123++;
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(Lfc;ILjava/lang/Object;)V")
    public static final void method2214(class731 arg0, int arg1, Object arg2) {
        field5122++;
        if (arg0.field10272 == null) {
            return;
        }
        for (int var3 = arg1; var3 < 50 && arg0.field10272.peekEvent() != null; var3++) {
            class484.method2932(true, 1L);
        }
        try {
            if (arg2 != null) {
                arg0.field10272.postEvent(new ActionEvent(arg2, 1001, "dummy"));
            }
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(I)I")
    public static final int method2215(int arg0) {
        if (arg0 != -21383) {
            method2216(-34, -86, 72, null);
        }
        field5124++;
        if (class196.field3382 == null) {
            return class138.field2166 ? 2 : 1;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(IIILmj;)V")
    public static final void method2216(int arg0, int arg1, int arg2, class713 arg3) {
        class114 var4 = class378.method2384(arg0, arg1, arg2);
        if (var4 == null) {
            return;
        }
        var4.field1768 = arg3;
        int var5 = class211.field3511 == class152.field2374 ? 1 : 0;
        if (arg3.method95(0)) {
            if (arg3.method86(0)) {
                arg3.field9472 = class231.field3722[var5];
                class231.field3722[var5] = arg3;
                return;
            }
            arg3.field9472 = class335.field4904[var5];
            class335.field4904[var5] = arg3;
            class245.field3947 = true;
            return;
        }
        arg3.field9472 = class24.field240[var5];
        class24.field240[var5] = arg3;
    }
}
