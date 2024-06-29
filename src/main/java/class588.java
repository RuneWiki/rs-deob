import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!maa")
public class class588 extends class28 {

    @OriginalMember(owner = "client!maa", name = "j", descriptor = "Z")
    public boolean field8073 = false;

    @OriginalMember(owner = "client!maa", name = "m", descriptor = "I")
    public int field8076 = -1;

    @OriginalMember(owner = "client!maa", name = "q", descriptor = "Lcb;")
    public static class318 field8080 = new class318(60, 5);

    @OriginalMember(owner = "client!maa", name = "s", descriptor = "I")
    public static int field8082 = 104;

    @OriginalMember(owner = "client!maa", name = "k", descriptor = "I")
    public int field8074;

    @OriginalMember(owner = "client!maa", name = "l", descriptor = "I")
    public int field8075;

    @OriginalMember(owner = "client!maa", name = "n", descriptor = "I")
    public int field8077;

    @OriginalMember(owner = "client!maa", name = "o", descriptor = "I")
    public int field8078;

    @OriginalMember(owner = "client!maa", name = "p", descriptor = "I")
    public static int field8079;

    @OriginalMember(owner = "client!maa", name = "r", descriptor = "I")
    public int field8081;

    @OriginalMember(owner = "client!maa", name = "<init>", descriptor = "(I)V", line = 56)
    public class588(int arg0) {
        this.field8076 = arg0;
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(Z)V", line = 12)
    public static void method3285(boolean arg0) {
        if (arg0) {
            field8080 = null;
        }
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(II)V", line = 27)
    public static final void method3286(int arg0, int arg1) {
        field8079++;
        if (class360.field5198 == arg1) {
            return;
        }
        field8082 = class12.field113 = class226.field2949[arg1];
        class143.method982(arg0 ^ 0xC8);
        class65.field860 = new int[field8082][class12.field113];
        class38.field418 = new int[field8082][class12.field113];
        class185.field2273 = new int[4][field8082 >> 3][class12.field113 >> 3];
        for (int var2 = arg0; var2 < 4; var2++) {
            class624.field8489[var2] = class114.method638(class12.field113, (byte) -68, field8082);
        }
        class361.field5210 = new byte[4][field8082][class12.field113];
        class417.method2426(6, class12.field113, field8082, 4);
        class353.method2205(field8082 >> 3, class9.field103, 1626015052, class12.field113 >> 3);
        class360.field5198 = arg1;
    }
}
