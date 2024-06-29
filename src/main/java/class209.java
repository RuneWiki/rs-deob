import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class209 extends class539 {

    @OriginalMember(owner = "client!jd", name = "n", descriptor = "Z")
    public boolean field3080 = false;

    @OriginalMember(owner = "client!jd", name = "t", descriptor = "I")
    public int field3086 = -1;

    @OriginalMember(owner = "client!jd", name = "q", descriptor = "[Ljava/awt/Color;")
    public static Color[] field3083 = new Color[] { new Color(9179409), new Color(16777215) };

    @OriginalMember(owner = "client!jd", name = "u", descriptor = "Lkda;")
    public static class354 field3087 = new class354();

    @OriginalMember(owner = "client!jd", name = "m", descriptor = "I")
    public int field3079;

    @OriginalMember(owner = "client!jd", name = "o", descriptor = "I")
    public int field3081;

    @OriginalMember(owner = "client!jd", name = "p", descriptor = "I")
    public int field3082;

    @OriginalMember(owner = "client!jd", name = "r", descriptor = "I")
    public int field3084;

    @OriginalMember(owner = "client!jd", name = "s", descriptor = "I")
    public int field3085;

    @OriginalMember(owner = "client!jd", name = "v", descriptor = "I")
    public static int field3088;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIII)Z", line = 6)
    public static final boolean method1379(int arg0, int arg1, int arg2, int arg3) {
        if (class308.method1898(arg0, arg1, arg2)) {
            int var4 = arg1 << class627.field8753;
            int var5 = arg2 << class627.field8753;
            return class680.method3754(var4 + 1, class144.field2149[arg0].method273(arg1, arg2) + arg3, var5 + 1) && class680.method3754(class658.field9268 + var4 - 1, class144.field2149[arg0].method273(arg1 + 1, arg2) + arg3, var5 + 1) && class680.method3754(class658.field9268 + var4 - 1, class144.field2149[arg0].method273(arg1 + 1, arg2 + 1) + arg3, class658.field9268 + var5 - 1) && class680.method3754(var4 + 1, class144.field2149[arg0].method273(arg1, arg2 + 1) + arg3, class658.field9268 + var5 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(I)V", line = 49)
    public class209(int arg0) {
        this.field3086 = arg0;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V", line = 24)
    public static void method1380(int arg0) {
        field3083 = null;
        field3087 = null;
        if (arg0 >= -39) {
            field3088 = -14;
        }
    }
}
