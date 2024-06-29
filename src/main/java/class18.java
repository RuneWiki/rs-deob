import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class18 {

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "Z")
    public boolean field298 = true;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "I")
    public int field295;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "I")
    public int field299;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
    public int field296;

    @OriginalMember(owner = "client!bg", name = "q", descriptor = "I")
    public int field310;

    @OriginalMember(owner = "client!bg", name = "n", descriptor = "I")
    public int field307;

    @OriginalMember(owner = "client!bg", name = "p", descriptor = "I")
    public int field309;

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "I")
    public static int field301 = 0;

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "I")
    public static int field302 = 2;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
    public static int field297 = 0;

    @OriginalMember(owner = "client!bg", name = "o", descriptor = "Lkb;")
    public static class93 field308 = class76.method390("Fehler beim Laden Ihres Spielcharakters)3", 0);

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "Z")
    public static boolean field300 = false;

    @OriginalMember(owner = "client!bg", name = "r", descriptor = "I")
    public static int field311 = 0;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "Lkb;")
    public static class93 field294 = class76.method390(" )2> <col=ffffff>", 0);

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!bg", name = "k", descriptor = "I")
    public static int field304;

    @OriginalMember(owner = "client!bg", name = "l", descriptor = "Ljg;")
    public static class89 field305;

    @OriginalMember(owner = "client!bg", name = "m", descriptor = "[Lob;")
    public static class129[] field306;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(BLjg;)V")
    public static final void method106(byte arg0, class89 arg1) {
        class53.field893 = arg1;
        if (arg0 < 78) {
            method108(67, false, null);
        }
        field303++;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V")
    public static void method107(int arg0) {
        field306 = null;
        field305 = null;
        field308 = null;
        if (arg0 == 18892) {
            field294 = null;
        }
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class18(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field298 = arg6;
        this.field295 = arg2;
        this.field299 = arg4;
        this.field296 = arg5;
        this.field310 = arg0;
        this.field307 = arg3;
        this.field309 = arg1;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IZLid;)V")
    public static final void method108(int arg0, boolean arg1, class78 arg2) {
        field304++;
        int var3 = arg2.field1406;
        int var4 = (int) arg2.field718;
        arg2.method235(false);
        if (arg1) {
            class177.method1167(var3, 98);
        }
        class66.method350(65535, var3);
        class65 var5 = class204.method1325(65535, var4);
        if (var5 != null) {
            class160.method1095(0, var5);
        }
        class121.field2241 = false;
        class100.field1841 = arg0;
        class77.method392(class184.field3622, class66.field1202, class36.field593, class44.field722, 0);
        if (class97.field1824 != -1) {
            class190.method1229(class97.field1824, 1, 0);
        }
    }
}
