import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!qa")
public class class32 extends RuntimeException {

    @OriginalMember(owner = "mapview!qa", name = "d", descriptor = "Ljava/lang/Throwable;")
    public Throwable field439;

    @OriginalMember(owner = "mapview!qa", name = "e", descriptor = "Ljava/lang/String;")
    public String field440;

    @OriginalMember(owner = "mapview!qa", name = "a", descriptor = "Lea;")
    public static class10 field436 = class3.method8("Quest Start", 91);

    @OriginalMember(owner = "mapview!qa", name = "c", descriptor = "I")
    public static int field438 = 0;

    @OriginalMember(owner = "mapview!qa", name = "f", descriptor = "Lea;")
    public static class10 field441 = class3.method8("Scimitar Shop", -87);

    @OriginalMember(owner = "mapview!qa", name = "b", descriptor = "Lea;")
    public static class10 field437 = class3.method8("", 108);

    @OriginalMember(owner = "mapview!qa", name = "g", descriptor = "[Lpa;")
    public static class30[] field442;

    @OriginalMember(owner = "mapview!qa", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 25)
    public class32(Throwable arg0, String arg1) {
        this.field439 = arg0;
        this.field440 = arg1;
    }

    @OriginalMember(owner = "mapview!qa", name = "a", descriptor = "([BIII)Lea;", line = 36)
    public static final class10 method224(byte[] arg0, int arg1, int arg2, int arg3) {
        class10 var4 = new class10();
        var4.field78 = new byte[arg1];
        var4.field83 = arg3;
        for (int var5 = arg2; var5 < arg2 + arg1; var5++) {
            if (arg0[var5] != 0) {
                var4.field78[var4.field83++] = arg0[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "mapview!qa", name = "a", descriptor = "(B)V", line = 85)
    public static void method225(byte arg0) {
        field441 = null;
        field442 = null;
        field436 = null;
        field437 = null;
        if (arg0 != 101) {
            field442 = null;
        }
    }

    @OriginalMember(owner = "mapview!qa", name = "a", descriptor = "(II)I", line = 98)
    public static int method226(int arg0, int arg1) {
        return arg0 ^ arg1;
    }
}
