import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!oa")
public class class30 extends RuntimeException {

    @OriginalMember(owner = "mapview!oa", name = "c", descriptor = "Ljava/lang/String;")
    public String field390;

    @OriginalMember(owner = "mapview!oa", name = "f", descriptor = "Ljava/lang/Throwable;")
    public Throwable field393;

    @OriginalMember(owner = "mapview!oa", name = "d", descriptor = "Lh;")
    public static class15 field391 = class18.method153("75(U", 1);

    @OriginalMember(owner = "mapview!oa", name = "a", descriptor = "I")
    public static int field388 = 0;

    @OriginalMember(owner = "mapview!oa", name = "e", descriptor = "Lh;")
    public static class15 field392 = class18.method153("world", 1);

    @OriginalMember(owner = "mapview!oa", name = "b", descriptor = "Z")
    public static volatile boolean field389 = true;

    @OriginalMember(owner = "mapview!oa", name = "a", descriptor = "(III[B)I", line = 14)
    public static final int method204(int arg0, int arg1, int arg2, byte[] arg3) {
        int var4 = -1;
        for (int var5 = arg0; var5 < arg1; var5++) {
            var4 = var4 >>> 8 ^ class36.field449[(var4 ^ arg3[var5]) & 0xFF];
        }
        return var4 ^ arg2;
    }

    @OriginalMember(owner = "mapview!oa", name = "a", descriptor = "(I)V", line = 45)
    public static void method205(int arg0) {
        field392 = null;
        field391 = null;
        if (arg0 != 2647) {
            method204(95, -75, -122, null);
        }
    }

    @OriginalMember(owner = "mapview!oa", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 67)
    public class30(Throwable arg0, String arg1) {
        this.field390 = arg1;
        this.field393 = arg0;
    }
}
