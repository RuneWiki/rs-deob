import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nca")
public class class639 {

    @OriginalMember(owner = "client!nca", name = "b", descriptor = "[Los;")
    public static class374[] field9194 = new class374[2048];

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "I")
    public static int field9193 = 0;

    @OriginalMember(owner = "client!nca", name = "c", descriptor = "[I")
    public static int[] field9195 = new int[1];

    @OriginalMember(owner = "client!nca", name = "h", descriptor = "[Lsba;")
    public static class183[] field9200 = new class183[14];

    @OriginalMember(owner = "client!nca", name = "e", descriptor = "F")
    public static float field9197;

    @OriginalMember(owner = "client!nca", name = "d", descriptor = "I")
    public static int field9196;

    @OriginalMember(owner = "client!nca", name = "f", descriptor = "I")
    public static int field9198;

    @OriginalMember(owner = "client!nca", name = "g", descriptor = "I")
    public static int field9199;

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(B)V")
    public static void method3662(byte arg0) {
        field9200 = null;
        int var1 = -100 / ((arg0 - 57) / 35);
        field9195 = null;
        field9194 = null;
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "([Ljava/lang/Object;[JZ)V")
    public static final void method3663(Object[] arg0, long[] arg1, boolean arg2) {
        field9196++;
        if (!arg2) {
            field9195 = null;
        }
        class275.method1564(arg1, arg0, 1, 0, arg1.length - 1);
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(II)V")
    public static final void method3664(int arg0, int arg1) {
        if (arg1 != 128) {
            field9193 = 45;
        }
        if (class466.field6526 == null || arg0 > class466.field6526.length) {
            class466.field6526 = new int[arg0];
        }
        field9199++;
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(Z)V")
    public static final void method3665(boolean arg0) {
        field9198++;
        if (class177.field2149) {
            return;
        }
        class177.field2149 = true;
        class35.field278 = arg0;
        if (class565.field8299.field2184) {
            class588.field8527 = ((int) class588.field8527 - 17 & 0xFFFFFFF0);
        } else {
            class237.field2969 += (-12.0F - class237.field2969) / 2.0F;
        }
    }
}
