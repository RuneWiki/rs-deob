import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public class class152 {

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "F")
    public static float field2269 = 1.0F;

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "Z")
    public static boolean field2268 = true;

    @OriginalMember(owner = "client!wq", name = "d", descriptor = "Lfaa;")
    public static class140 field2271 = null;

    @OriginalMember(owner = "client!wq", name = "g", descriptor = "Luc;")
    public static class27 field2274 = new class27(76, 3);

    @OriginalMember(owner = "client!wq", name = "j", descriptor = "[Lfca;")
    public static class76[] field2277 = new class76[6];

    @OriginalMember(owner = "client!wq", name = "k", descriptor = "Z")
    public static boolean field2278 = false;

    @OriginalMember(owner = "client!wq", name = "c", descriptor = "I")
    public static int field2270;

    @OriginalMember(owner = "client!wq", name = "f", descriptor = "I")
    public int field2273;

    @OriginalMember(owner = "client!wq", name = "h", descriptor = "I")
    public static int field2275;

    @OriginalMember(owner = "client!wq", name = "i", descriptor = "Llv;")
    public static class408 field2276;

    @OriginalMember(owner = "client!wq", name = "e", descriptor = "[Lms;")
    public class695[] field2272;

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(ILjr;)V")
    public final void method1063(int arg0, class96 arg1) {
        field2275++;
        this.field2273 = arg1.method718(109);
        this.field2272 = new class695[arg1.method718(arg0 + 93)];
        class295[] var3 = class551.method3029(-42);
        for (int var4 = arg0; var4 < this.field2272.length; var4++) {
            this.field2272[var4] = this.method1065(var3[arg1.method718(-58)], arg1, 22071);
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(I)V")
    public static final void method1064(int arg0) {
        class323.field4766 = arg0;
        for (int var1 = 0; var1 < class137.field1931; var1++) {
            for (int var2 = 0; var2 < class22.field308; var2++) {
                if (class658.field9266[arg0][var1][var2] == null) {
                    class658.field9266[arg0][var1][var2] = new class486(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(Lhs;Ljr;I)Lms;")
    private final class695 method1065(class295 arg0, class96 arg1, int arg2) {
        field2270++;
        if (class466.field6556 == arg0) {
            return class435.method2499(arg1, (byte) 37);
        }
        if (arg2 != 22071) {
            field2278 = false;
        }
        if (class520.field7080 == arg0) {
            return class106.method801(arg1, (byte) 6);
        } else if (class357.field5107 == arg0) {
            return class644.method3585(1, arg1);
        } else if (class270.field3827 == arg0) {
            return class686.method3773((byte) 77, arg1);
        } else if (class238.field3435 == arg0) {
            return class258.method1595(arg1, (byte) -43);
        } else if (class389.field5463 == arg0) {
            return class438.method2512(arg2 - 22072, arg1);
        } else if (class125.field1743 == arg0) {
            return class324.method1965(arg1, (byte) -114);
        } else if (class539.field7316 == arg0) {
            return class680.method3757(arg1, (byte) -65);
        } else if (class22.field306 == arg0) {
            return class208.method1375(1, arg1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "(I)V")
    public static void method1066(int arg0) {
        field2277 = null;
        field2271 = null;
        field2276 = null;
        if (arg0 <= 86) {
            field2268 = false;
        }
        field2274 = null;
    }
}
