import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ba")
public class class4 extends RuntimeException {

    @OriginalMember(owner = "mapview!ba", name = "e", descriptor = "Ljava/lang/String;")
    public String field121;

    @OriginalMember(owner = "mapview!ba", name = "d", descriptor = "Ljava/lang/Throwable;")
    public Throwable field120;

    @OriginalMember(owner = "mapview!ba", name = "b", descriptor = "Lh;")
    public static class15 field118 = class26.method190(true, "Sword Shop");

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "Lh;")
    public static class15 field117 = class26.method190(true, "Kebab Seller");

    @OriginalMember(owner = "mapview!ba", name = "c", descriptor = "Lh;")
    public static class15 field119 = class26.method190(true, "Fishing Shop");

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(I)V", line = 29)
    public static final void method58(int arg0) {
        class6.field130 = null;
        class29.field399 = null;
        class16.field261 = null;
        class16.field269 = null;
        int var1 = 75 / ((arg0 + 1) / 44);
        class2.field87 = null;
        class25.field343 = null;
    }

    @OriginalMember(owner = "mapview!ba", name = "b", descriptor = "(I)V", line = 47)
    public static void method59(int arg0) {
        field118 = null;
        field117 = null;
        field119 = null;
        if (arg0 != 95) {
            method59(-102);
        }
    }

    @OriginalMember(owner = "mapview!ba", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 76)
    public class4(Throwable arg0, String arg1) {
        this.field121 = arg1;
        this.field120 = arg0;
    }
}
