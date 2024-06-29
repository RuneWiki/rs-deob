import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class227 extends class97 {

    @OriginalMember(owner = "client!dh", name = "s", descriptor = "I")
    public int field3437 = -1;

    @OriginalMember(owner = "client!dh", name = "r", descriptor = "Z")
    public boolean field3436 = false;

    @OriginalMember(owner = "client!dh", name = "t", descriptor = "F")
    public static float field3438;

    @OriginalMember(owner = "client!dh", name = "o", descriptor = "I")
    public static int field3433;

    @OriginalMember(owner = "client!dh", name = "p", descriptor = "I")
    public int field3434;

    @OriginalMember(owner = "client!dh", name = "q", descriptor = "I")
    public int field3435;

    @OriginalMember(owner = "client!dh", name = "u", descriptor = "I")
    public int field3439;

    @OriginalMember(owner = "client!dh", name = "v", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!dh", name = "w", descriptor = "I")
    public int field3441;

    @OriginalMember(owner = "client!dh", name = "x", descriptor = "I")
    public int field3442;

    @OriginalMember(owner = "client!dh", name = "y", descriptor = "I")
    public static int field3443;

    @OriginalMember(owner = "client!dh", name = "n", descriptor = "Ltb;")
    public static class290 field3432;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Z)V")
    public static void method1374(boolean arg0) {
        field3432 = null;
        if (arg0) {
            method1374(true);
        }
    }

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "(I)Lcf;")
    public static final class251 method1375(int arg0) {
        field3443++;
        try {
            if (arg0 != 10951) {
                field3432 = null;
            }
            return (class251) Class.forName("qo").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(Z)V")
    public static final void method1376(boolean arg0) {
        class380.field5544++;
        class177.method1082(class25.field321, 0);
        if (!arg0) {
            field3440++;
            class189.field2840.method2366(0, true);
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(ZII)V")
    public static final void method1377(boolean arg0, int arg1, int arg2) {
        field3433++;
        if (arg2 == 0) {
            class196.field2965 = class261.method1619(true, class170.field2631, class79.field1043, class287.field4376 * 2, class362.field5334, arg2);
        } else {
            if (arg0) {
                class196.field2965 = class261.method1619(true, class170.field2631, class79.field1043, 0, class362.field5334, 0);
                class196.field2965.method437(0);
                class272 var3 = class1.method14((byte) 117, class430.field6321, 0, class458.field6782);
                class137 var4 = class196.field2965.method410(var3, class4.method26(class427.field6274, class458.field6782, 0), true);
                class217.method1322(var4, class28.field365.method937((byte) -47, class27.field356), 88, true);
                class196.field2965.method435();
                class60.method328(0);
                class196.field2965.method1617((byte) -37);
            }
            try {
                class196.field2965 = class261.method1619(true, class170.field2631, class79.field1043, class287.field4376 * 2, class362.field5334, arg2);
            } catch (Throwable var7) {
                class196.field2965 = class261.method1619(true, class170.field2631, class79.field1043, 0, class362.field5334, 0);
                arg2 = 0;
            }
        }
        if (class196.field2965.method404()) {
            class351 var5 = class196.field2965.method417(134217728);
            class196.field2965.method416(var5);
        }
        class405.field6032 = arg2;
        class405.method2546(-109);
        if (arg1 < 16) {
            return;
        }
        if (!class196.field2965.method346()) {
            class86.field1213 = 1;
        }
        class196.field2965.method379(class86.field1213);
        class196.field2965.method383(0);
        class94.field1312 = class196.field2965.method388();
        class243.field3647 = class196.field2965.method388();
        int var6 = (int) ((double) class115.field1522 * 34.46D);
        if (class196.field2965.method359()) {
            var6 += 128;
        }
        class196.field2965.method350(50, var6);
        class196.field2965.method412(!class39.field477);
        if (class196.field2965.method400()) {
            class42.method248(1, class289.field4391);
        }
        class296.field4492 = !class360.method2172(35);
        class312.method1905(class198.field3004 >> 3, class196.field2965, 1, class115.field1522 >> 3);
        class149.method930((byte) -71);
        class57.field768 = false;
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(I)V")
    public class227(int arg0) {
        this.field3437 = arg0;
    }
}
