import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class157 extends class80 {

    @OriginalMember(owner = "client!vl", name = "v", descriptor = "Lo;")
    public static class227 field2555 = new class227();

    @OriginalMember(owner = "client!vl", name = "z", descriptor = "I")
    public static int field2559 = 2;

    @OriginalMember(owner = "client!vl", name = "A", descriptor = "Lph;")
    public static class229 field2560 = class266.method1858("showVideoAd", 0);

    @OriginalMember(owner = "client!vl", name = "l", descriptor = "I")
    public int field2545;

    @OriginalMember(owner = "client!vl", name = "m", descriptor = "I")
    public static int field2546;

    @OriginalMember(owner = "client!vl", name = "o", descriptor = "I")
    public int field2548;

    @OriginalMember(owner = "client!vl", name = "q", descriptor = "I")
    public static int field2550;

    @OriginalMember(owner = "client!vl", name = "t", descriptor = "I")
    public int field2553;

    @OriginalMember(owner = "client!vl", name = "u", descriptor = "I")
    public int field2554;

    @OriginalMember(owner = "client!vl", name = "w", descriptor = "I")
    public int field2556;

    @OriginalMember(owner = "client!vl", name = "x", descriptor = "I")
    public static int field2557;

    @OriginalMember(owner = "client!vl", name = "p", descriptor = "Lph;")
    public class229 field2549;

    @OriginalMember(owner = "client!vl", name = "n", descriptor = "Lri;")
    public class301 field2547;

    @OriginalMember(owner = "client!vl", name = "r", descriptor = "Lri;")
    public class301 field2551;

    @OriginalMember(owner = "client!vl", name = "B", descriptor = "Lclient;")
    public static client field2561;

    @OriginalMember(owner = "client!vl", name = "y", descriptor = "Z")
    public boolean field2558;

    @OriginalMember(owner = "client!vl", name = "s", descriptor = "[Ljava/lang/Object;")
    public Object[] field2552;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(BI)V", line = 18)
    public static final void method1126(byte arg0, int arg1) {
        class314.field5337--;
        field2546++;
        int var2 = 7 % ((arg0 + 57) / 54);
        if (class314.field5337 == arg1) {
            return;
        }
        class42.method313(class94.field1579, arg1 + 1, class94.field1579, arg1, class314.field5337 - arg1);
        class42.method313(class141.field2282, arg1 + 1, class141.field2282, arg1, class314.field5337 - arg1);
        class42.method320(class53.field748, arg1 + 1, class53.field748, arg1, class314.field5337 - arg1);
        class42.method319(class27.field409, arg1 + 1, class27.field409, arg1, class314.field5337 - arg1);
        class42.method316(class255.field4263, arg1 + 1, class255.field4263, arg1, class314.field5337 - arg1);
        class42.method316(class293.field4788, arg1 + 1, class293.field4788, arg1, class314.field5337 - arg1);
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(III)V", line = 41)
    public static final void method1127(int arg0, int arg1, int arg2) {
        if (arg1 != 28232) {
            field2560 = (class229) null;
        }
        field2550++;
        class166.field2711[arg2] = arg0;
        class266 var3 = (class266) class179.field2941.method713(arg1 ^ 0x636D, (long) arg2);
        if (var3 == null) {
            class266 var4 = new class266(class130.method935(false) + 500L);
            class179.field2941.method710(var4, (byte) -93, (long) arg2);
        } else {
            var3.field4477 = class130.method935(false) + 500L;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(B)V", line = 71)
    public static void method1128(byte arg0) {
        int var1 = -21 / ((31 - arg0) / 44);
        field2560 = null;
        field2555 = null;
        field2561 = null;
    }
}
