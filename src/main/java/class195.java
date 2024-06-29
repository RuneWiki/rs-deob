import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cea")
public class class195 {

    @OriginalMember(owner = "client!cea", name = "c", descriptor = "Loe;")
    public static class183 field2363 = new class183();

    @OriginalMember(owner = "client!cea", name = "d", descriptor = "[Lbu;")
    public static class19[] field2364 = new class19[2048];

    @OriginalMember(owner = "client!cea", name = "b", descriptor = "I")
    public static int field2362;

    @OriginalMember(owner = "client!cea", name = "e", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "Lqg;")
    public static class429 field2361;

    @OriginalMember(owner = "client!cea", name = "g", descriptor = "Lcf;")
    public static class559 field2367;

    @OriginalMember(owner = "client!cea", name = "f", descriptor = "[I")
    public static int[] field2366;

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(I)V")
    public static void method1195(int arg0) {
        field2363 = null;
        field2366 = null;
        field2367 = null;
        field2361 = null;
        field2364 = null;
        int var1 = 26 / ((-arg0 - 24) / 50);
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(IB)V")
    public static final void method1196(int arg0, byte arg1) {
        field2362++;
        if (arg1 <= 6) {
            field2364 = null;
        }
        class233 var2 = class7.method44(arg0, 12, -1);
        var2.method1423(0);
    }
}
