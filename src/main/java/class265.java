import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class265 {

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "I")
    public int field4248;

    @OriginalMember(owner = "client!jk", name = "j", descriptor = "I")
    public int field4253;

    @OriginalMember(owner = "client!jk", name = "i", descriptor = "I")
    public int field4252;

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "I")
    public int field4249;

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "I")
    public static int field4246 = 5063219;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "[Ltc;")
    public static class142[] field4244 = new class142[8];

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "I")
    public static int field4245 = 0;

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "Lic;")
    public static class294 field4251 = new class294();

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "I")
    public static int field4247;

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "[Ldj;")
    public static class138[] field4250;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V")
    public static void method1826(int arg0) {
        field4251 = null;
        if (arg0 != -15582) {
            method1826(69);
        }
        field4244 = null;
        field4250 = null;
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "()V")
    public class265() {
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(Ljk;)V")
    public class265(class265 arg0) {
        this.field4248 = arg0.field4248;
        this.field4253 = arg0.field4253;
        this.field4252 = arg0.field4252;
        this.field4249 = arg0.field4249;
    }
}
