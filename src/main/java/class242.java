import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class242 extends class338 {

    @OriginalMember(owner = "client!qa", name = "B", descriptor = "I")
    public static int field3301 = 0;

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "I")
    public int field3286;

    @OriginalMember(owner = "client!qa", name = "n", descriptor = "I")
    public int field3287;

    @OriginalMember(owner = "client!qa", name = "o", descriptor = "I")
    public int field3288;

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "I")
    public static int field3289;

    @OriginalMember(owner = "client!qa", name = "q", descriptor = "I")
    public int field3290;

    @OriginalMember(owner = "client!qa", name = "r", descriptor = "I")
    public int field3291;

    @OriginalMember(owner = "client!qa", name = "s", descriptor = "I")
    public static int field3292;

    @OriginalMember(owner = "client!qa", name = "t", descriptor = "I")
    public int field3293;

    @OriginalMember(owner = "client!qa", name = "u", descriptor = "I")
    public int field3294;

    @OriginalMember(owner = "client!qa", name = "v", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "client!qa", name = "w", descriptor = "I")
    public int field3296;

    @OriginalMember(owner = "client!qa", name = "x", descriptor = "I")
    public static int field3297;

    @OriginalMember(owner = "client!qa", name = "y", descriptor = "I")
    public int field3298;

    @OriginalMember(owner = "client!qa", name = "z", descriptor = "I")
    public int field3299;

    @OriginalMember(owner = "client!qa", name = "A", descriptor = "I")
    public int field3300;

    @OriginalMember(owner = "client!qa", name = "D", descriptor = "I")
    public int field3302;

    @OriginalMember(owner = "client!qa", name = "E", descriptor = "Z")
    public static boolean field3303;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(I)V")
    public static final void method1298(int arg0) {
        field3295++;
        if (class263.field3595 == 5) {
            class263.field3595 = arg0;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(III)I")
    public static final int method1299(int arg0, int arg1, int arg2) {
        field3292++;
        if (arg2 != 3) {
            field3301 = -11;
        }
        return arg1 == 1 || arg1 == 3 ? class18.field171[arg0 & 0x3] : class154.field1945[arg0 & 0x3];
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(BJ)V")
    public static final void method1300(byte arg0, long arg1) {
        field3297++;
        int var3 = class274.field3698;
        if (arg0 <= 2) {
            field3301 = 101;
        }
        int var4 = class91.field1030;
        if (class449.field6526 != var3) {
            int var5 = var3 - class449.field6526;
            int var6 = (int) ((long) var5 * arg1 / 320L);
            if (var5 <= 0) {
                if (var6 == 0) {
                    var6 = -1;
                } else if (var5 > var6) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = 1;
            } else if (var5 < var6) {
                var6 = var5;
            }
            class449.field6526 += var6;
        }
        if (!class165.field2104) {
            class425.field6241 += (float) arg1 * class335.field4460 / 40.0F * 8.0F;
            class41.field432 += (float) arg1 * class125.field1604 / 40.0F * 8.0F;
        }
        if (class275.field3706 != var4) {
            int var7 = var4 - class275.field3706;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 <= 0) {
                if (var8 == 0) {
                    var8 = -1;
                } else if (var8 < var7) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = 1;
            } else if (var8 > var7) {
                var8 = var7;
            }
            class275.field3706 += var8;
        }
        class203.method1103(0);
    }
}
