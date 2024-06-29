import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class121 {

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "Lmh;")
    public static class62 field2017 = class201.method1405(true, "<col=ffffff>");

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "Lmh;")
    public static class62 field2019 = class201.method1405(true, "compass");

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "Lmh;")
    public static class62 field2015 = null;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "Lmh;")
    public static class62 field2016 = class201.method1405(true, "n");

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "Lmh;")
    public static class62 field2021 = class201.method1405(true, "null");

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
    public static int field2018;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "[[[B")
    public static byte[][][] field2020;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IBIIII)V", line = 17)
    public static final void method931(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field2018++;
        class259.field4361 = arg4;
        class153.field2453 = arg5;
        class165.field2687 = arg0;
        class207.field3509 = arg3;
        class267.field4518 = arg2;
        if (arg1 < 101) {
            return;
        }
        if (class207.field3509 >= 100) {
            int var6 = class259.field4361 * 128 + 64;
            int var7 = class153.field2453 * 128 + 64;
            int var8 = class165.method1186((byte) -58, var7, var6, class7.field85) - class267.field4518;
            int var9 = var8 - class15.field134;
            int var10 = var7 - class215.field3647;
            int var11 = var6 - class258.field4351;
            int var12 = (int) Math.sqrt((double) (var11 * var11 + (var10 * var10)));
            class46.field683 = (int) (Math.atan2((double) var9, (double) var12) * 325.949D) & 0x7FF;
            class30.field414 = (int) (Math.atan2((double) var11, (double) var10) * -325.949D) & 0x7FF;
            if (class46.field683 < 128) {
                class46.field683 = 128;
            }
            if (class46.field683 > 383) {
                class46.field683 = 383;
            }
        }
        class21.field220 = 2;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V", line = 80)
    public static void method932(int arg0) {
        field2020 = (byte[][][]) null;
        field2019 = null;
        field2021 = null;
        field2017 = null;
        field2016 = null;
        if (arg0 != 128) {
            method931(-18, (byte) -29, -24, 63, -24, 49);
        }
        field2015 = null;
    }
}
