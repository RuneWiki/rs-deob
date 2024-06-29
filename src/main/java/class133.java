import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public abstract class class133 {

    @OriginalMember(owner = "client!el", name = "f", descriptor = "[Lga;")
    public static class22[] field2272 = new class22[50];

    @OriginalMember(owner = "client!el", name = "a", descriptor = "I")
    public static int field2267;

    @OriginalMember(owner = "client!el", name = "b", descriptor = "I")
    public static int field2268;

    @OriginalMember(owner = "client!el", name = "c", descriptor = "I")
    public static int field2269;

    @OriginalMember(owner = "client!el", name = "g", descriptor = "I")
    public static int field2273;

    @OriginalMember(owner = "client!el", name = "h", descriptor = "I")
    public static int field2274;

    @OriginalMember(owner = "client!el", name = "j", descriptor = "I")
    public static int field2276;

    @OriginalMember(owner = "client!el", name = "i", descriptor = "Lmh;")
    public static class150 field2275;

    @OriginalMember(owner = "client!el", name = "e", descriptor = "Llk;")
    public static class304 field2271;

    @OriginalMember(owner = "client!el", name = "d", descriptor = "Ljava/lang/String;")
    public static String field2270;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(BI)V", line = 4)
    public static final void method1088(byte arg0, int arg1) {
        field2273++;
        class9.method68(class9.field123, ((float) arg1 * 0.1F + 0.7F) * 1.1523438F, 0.69921875F, 0.69921875F);
        class9.method70(-50.0F, -60.0F, -50.0F);
        class9.method71(class9.field117, 0, false);
        class9.method62();
        if (arg0 != -26) {
            method1091(36);
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(II)I", line = 21)
    public static final int method1090(int arg0, int arg1) {
        field2267++;
        if (arg0 != -1213575384) {
            method1091(55);
        }
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I)V", line = 32)
    public static void method1091(int arg0) {
        field2272 = null;
        field2275 = null;
        if (arg0 == -50) {
            field2270 = null;
            field2271 = null;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(III)V", line = 52)
    public static final void method1092(int arg0, int arg1, int arg2) {
        field2274++;
        class213 var3 = class261.method1801(arg1, 10812);
        int var4 = var3.field3578;
        int var5 = var3.field3584;
        int var6 = var3.field3583;
        if (arg2 != -60) {
            field2270 = (String) null;
        }
        int var7 = class71.field1169[var6 - var4];
        if (arg0 < 0 || arg0 > var7) {
            arg0 = 0;
        }
        int var8 = var7 << var4;
        class86.method768(false, var5, class334.field5302[var5] & ~var8 | arg0 << var4 & var8);
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Lpe;Z)Lpe;")
    public abstract class113 method1089(class113 arg0, boolean arg1);
}
