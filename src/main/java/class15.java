import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public abstract class class15 {

    @OriginalMember(owner = "client!o", name = "e", descriptor = "[I")
    public static int[] field168 = new int[100];

    @OriginalMember(owner = "client!o", name = "f", descriptor = "Ljava/lang/String;")
    public static String field169 = "level: ";

    @OriginalMember(owner = "client!o", name = "a", descriptor = "I")
    public int field164;

    @OriginalMember(owner = "client!o", name = "b", descriptor = "I")
    public int field165;

    @OriginalMember(owner = "client!o", name = "c", descriptor = "I")
    public static int field166;

    @OriginalMember(owner = "client!o", name = "d", descriptor = "I")
    public static int field167;

    @OriginalMember(owner = "client!o", name = "g", descriptor = "I")
    public int field170;

    @OriginalMember(owner = "client!o", name = "i", descriptor = "I")
    public static int field172;

    @OriginalMember(owner = "client!o", name = "j", descriptor = "I")
    public static int field173;

    @OriginalMember(owner = "client!o", name = "h", descriptor = "Llm;")
    public static class210 field171;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Z)Z", line = 8)
    public final boolean method94(boolean arg0) {
        field172++;
        if (!arg0) {
            field168 = (int[]) null;
        }
        return (this.field164 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)Z", line = 19)
    public final boolean method95(int arg0) {
        field173++;
        if (arg0 != -1) {
            field169 = (String) null;
        }
        return (this.field164 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(B)Z", line = 32)
    public final boolean method96(byte arg0) {
        field167++;
        if (arg0 >= -111) {
            this.method96((byte) -46);
        }
        return (this.field164 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(Z)V", line = 53)
    public static void method97(boolean arg0) {
        if (arg0) {
            method97(false);
        }
        field169 = null;
        field168 = null;
        field171 = null;
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(I)Z", line = 66)
    public final boolean method98(int arg0) {
        if (arg0 != 4) {
            this.field165 = 31;
        }
        field166++;
        return (this.field164 & 0x4) != 0;
    }
}
