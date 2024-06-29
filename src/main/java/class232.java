import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class232 extends class363 {

    @OriginalMember(owner = "client!qa", name = "s", descriptor = "Lni;")
    public class487 field3012;

    @OriginalMember(owner = "client!qa", name = "u", descriptor = "[Lse;")
    public static class240[] field3014 = new class240[2048];

    @OriginalMember(owner = "client!qa", name = "t", descriptor = "I")
    public static int field3013;

    @OriginalMember(owner = "client!qa", name = "v", descriptor = "I")
    public static int field3015;

    @OriginalMember(owner = "client!qa", name = "w", descriptor = "I")
    public static int field3016;

    @OriginalMember(owner = "client!qa", name = "x", descriptor = "Lsj;")
    public static class428 field3017;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(III)Z", line = 7)
    public static final boolean method1400(int arg0, int arg1, int arg2) {
        if (arg2 != -16711936) {
            method1400(-122, -53, 32);
        }
        field3016++;
        return (arg1 & 0x20) != 0;
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(Lni;)V", line = 20)
    public class232(class487 arg0) {
        this.field3012 = arg0;
    }

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(I)V", line = 29)
    public static void method1401(int arg0) {
        if (arg0 < -119) {
            field3017 = null;
            field3014 = null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(III)I", line = 40)
    public static final int method1402(int arg0, int arg1, int arg2) {
        field3013++;
        if (arg0 == 4379) {
            int var3 = arg1 >>> 24;
            int var4 = ((arg1 & 0xFF00) * var3 & 0xFF0000 | (arg1 & 0xFF00FF) * var3 & 0xFF00FF00) >>> 8;
            int var5 = 255 - var3;
            return (((arg2 & 0xFF00FF) * var5 & 0xFF00FF00 | (arg2 & 0xFF00) * var5 & 0xFF0000) >>> 8) + var4;
        } else {
            return -122;
        }
    }
}
