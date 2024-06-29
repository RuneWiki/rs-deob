import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class32 {

    @OriginalMember(owner = "client!hb", name = "m", descriptor = "I")
    public int field522 = 0;

    @OriginalMember(owner = "client!hb", name = "n", descriptor = "Z")
    public boolean field523 = false;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
    public int field510 = 0;

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "I")
    public static volatile int field515 = 0;

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "I")
    public static int field511 = -1;

    @OriginalMember(owner = "client!hb", name = "p", descriptor = "Lve;")
    public static class255 field525 = class87.method607(82, "hint_mapedge");

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "[Lve;")
    public static class255[] field519 = new class255[200];

    @OriginalMember(owner = "client!hb", name = "l", descriptor = "I")
    public static int field521 = 0;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "I")
    public static int field514;

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "I")
    public static int field520;

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "Lhj;")
    public class28 field518;

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "Lua;")
    public static class82 field517;

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "Lrg;")
    public static class88 field513;

    @OriginalMember(owner = "client!hb", name = "o", descriptor = "Lrg;")
    public static class88 field524;

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "Ljava/nio/ByteBuffer;")
    public ByteBuffer field516;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Z)V", line = 18)
    public static void method183(boolean arg0) {
        field517 = null;
        field524 = null;
        if (!arg0) {
            field524 = (class88) null;
        }
        field525 = null;
        field513 = null;
        field519 = null;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lpb;B)Lsl;", line = 62)
    public static final class91 method184(class70 arg0, byte arg1) {
        field512++;
        class91 var2 = new class91(arg0.method479(-1), arg0.method479(-1), arg0.method423(255), arg0.method423(255), arg0.method469(80), arg0.method481(0) == 1);
        int var3 = arg0.method481(0);
        for (int var4 = 0; var4 < var3; var4++) {
            var2.field1552.method1472(true, new class157(arg0.method423(255), arg0.method423(255), arg0.method423(255), arg0.method423(255)));
        }
        if (arg1 > -15) {
            field524 = (class88) null;
        }
        var2.method683(-15097);
        return var2;
    }
}
