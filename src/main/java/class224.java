import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class224 extends class1 {

    @OriginalMember(owner = "client!ck", name = "K", descriptor = "Lsd;")
    public class45 field3351;

    @OriginalMember(owner = "client!ck", name = "J", descriptor = "Ljava/lang/String;")
    public static String field3350 = "Allocating memory";

    @OriginalMember(owner = "client!ck", name = "M", descriptor = "I")
    public static int field3353 = 0;

    @OriginalMember(owner = "client!ck", name = "O", descriptor = "Lrf;")
    public static class289 field3355 = null;

    @OriginalMember(owner = "client!ck", name = "G", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!ck", name = "H", descriptor = "I")
    public static int field3348;

    @OriginalMember(owner = "client!ck", name = "I", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!ck", name = "L", descriptor = "I")
    public static int field3352;

    @OriginalMember(owner = "client!ck", name = "N", descriptor = "I")
    public static int field3354;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIIBI)V")
    public static final void method1427(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        if (arg4 != -111) {
            method1428(60);
        }
        class49.field785 = arg1;
        field3354++;
        class57.field908 = arg2;
        class37.field510 = arg5;
        class85.field1360 = arg0;
        class7.field112 = arg3;
        if (class37.field510 >= 100) {
            int var6 = class85.field1360 * 128 + 64;
            int var7 = class57.field908 * 128 + 64;
            int var8 = class183.method1139(class99.field1557, var7, var6, (byte) 117) - class7.field112;
            int var9 = var8 - class213.field3184;
            int var10 = var7 - class47.field763;
            int var11 = var6 - class128.field1922;
            int var12 = (int) Math.sqrt((double) (var10 * var10 + var11 * var11));
            class259.field3949 = (int) (Math.atan2((double) var9, (double) var12) * 325.949D) & 0x7FF;
            class272.field4088 = (int) (-325.949D * Math.atan2((double) var11, (double) var10)) & 0x7FF;
            if (class259.field3949 < 128) {
                class259.field3949 = 128;
            }
            if (class259.field3949 > 383) {
                class259.field3949 = 383;
            }
        }
        class253.field3837 = 2;
    }

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "(I)V")
    public static final void method1428(int arg0) {
        class200.field3046 = null;
        class115.field1751 = null;
        if (arg0 != 17736) {
            field3353 = 60;
        }
        class89.field1409 = null;
        field3349++;
    }

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "(B)V")
    public static void method1429(byte arg0) {
        if (arg0 <= 95) {
            field3350 = null;
        }
        field3355 = null;
        field3350 = null;
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Lsd;)V")
    public class224(class45 arg0) {
        this.field3351 = arg0;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(BLpf;Lpf;)V")
    public static final void method1430(byte arg0, class294 arg1, class294 arg2) {
        class213.field3186 = arg2;
        field3347++;
        class54.field877 = arg1;
        if (arg0 != 61) {
            field3352 = -44;
        }
    }
}
