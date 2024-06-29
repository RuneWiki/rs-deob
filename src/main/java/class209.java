import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public abstract class class209 {

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "I")
    public int field3430;

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "I")
    public int field3431;

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "I")
    public int field3432;

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "I")
    public static int field3433;

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "I")
    public int field3434;

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "I")
    public static int field3435;

    @OriginalMember(owner = "client!ol", name = "g", descriptor = "I")
    public static int field3436;

    @OriginalMember(owner = "client!ol", name = "h", descriptor = "I")
    public int field3437;

    @OriginalMember(owner = "client!ol", name = "i", descriptor = "I")
    public int field3438;

    @OriginalMember(owner = "client!ol", name = "j", descriptor = "I")
    public static int field3439;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(III)V")
    public abstract void method538(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIIIII)V")
    public static final void method1421(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class233.field3702 = arg4;
        class78.field1064 = arg0;
        class34.field420 = arg1;
        if (arg3 > -9) {
            method1421(50, -45, 27, 9, 126, 50);
        }
        class124.field2075 = arg5;
        field3436++;
        class173.field2799 = arg2;
        if (class34.field420 >= 100) {
            int var6 = class233.field3702 * 128 + 64;
            int var7 = class78.field1064 * 128 + 64;
            int var8 = class220.method1461(var6, class28.field336, var7, 74) - class173.field2799;
            int var9 = var6 - class44.field522;
            int var10 = var8 - class193.field3108;
            int var11 = var7 - class119.field2014;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + (var11 * var11)));
            class8.field119 = (int) (Math.atan2((double) var10, (double) var12) * 325.949D) & 0x7FF;
            class244.field3910 = (int) (-325.949D * Math.atan2((double) var9, (double) var11)) & 0x7FF;
            if (class8.field119 < 128) {
                class8.field119 = 128;
            }
            if (class8.field119 > 383) {
                class8.field119 = 383;
            }
        }
        class92.field1316 = 2;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(II)V")
    public abstract void method533(int arg0, int arg1);
}
