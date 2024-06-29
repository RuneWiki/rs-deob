import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public abstract class class197 {

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "Leg;")
    public static class37 field3351 = class174.method1167("Konfig geladen)3", -29);

    @OriginalMember(owner = "client!lh", name = "n", descriptor = "Leg;")
    private static class37 field3358 = class174.method1167("glow3:", -17);

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "Leg;")
    public static class37 field3349 = field3358;

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "Leg;")
    public static class37 field3346 = field3358;

    @OriginalMember(owner = "client!lh", name = "o", descriptor = "Leg;")
    public static class37 field3359 = class174.method1167(" de votre liste d(Wamis)3", 102);

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "I")
    public static int field3348;

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "I")
    public static int field3350;

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "I")
    public int field3352;

    @OriginalMember(owner = "client!lh", name = "j", descriptor = "I")
    public static int field3354;

    @OriginalMember(owner = "client!lh", name = "k", descriptor = "I")
    public int field3355;

    @OriginalMember(owner = "client!lh", name = "m", descriptor = "Ljl;")
    public static class101 field3357;

    @OriginalMember(owner = "client!lh", name = "l", descriptor = "Ljava/awt/Image;")
    public Image field3356;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "[I")
    public int[] field3345;

    @OriginalMember(owner = "client!lh", name = "i", descriptor = "[Lja;")
    public static class105[] field3353;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V")
    public final void method1368(int arg0) {
        field3350++;
        if (arg0 > -76) {
            field3359 = null;
        }
        class122.method876(this.field3345, this.field3355, this.field3352);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIII)I")
    public static final int method1369(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg2 - 1 & arg1;
        int var5 = arg1 / arg2;
        field3354++;
        int var6 = arg3 / arg2;
        int var7 = class29.method166(arg0 + 126, var5, var6);
        int var8 = arg3 & arg2 - 1;
        int var9 = class29.method166(127, var5 + 1, var6);
        int var10 = class29.method166(127, var5, var6 + 1);
        int var11 = class29.method166(127, arg0 + var5, var6 + 1);
        int var12 = class234.method1606(var9, var7, arg2, var4, false);
        int var13 = class234.method1606(var11, var10, arg2, var4, false);
        return class234.method1606(var13, var12, arg2, var8, false);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Leg;B)V")
    public static final void method1370(class37 arg0, byte arg1) {
        class88.field1399 = arg0;
        field3348++;
        if (class177.field2957.field3504 == null || arg1 != 50) {
            return;
        }
        try {
            class37 var2 = class176.field2942.method230(-121, class177.field2957.field3504);
            class37 var3 = class196.field3337.method230(-14, class177.field2957.field3504);
            class37 var4 = class156.method1061((byte) -109, new class37[] { var2, class168.field2815, arg0, class182.field3042, var3 });
            class37 var5;
            if (arg0.method222((byte) -64) == 0) {
                var5 = class156.method1061((byte) -115, new class37[] { var4, class165.field2727 });
            } else {
                var5 = class156.method1061((byte) 30, new class37[] { var4, class181.field3028, class93.method609(-1, class149.method1024(-14898) + 94608000000L), class202.field3451, client.method799(94608000L, true) });
            }
            class156.method1061((byte) -85, new class37[] { class77.field1204, var5, class204.field3480 }).method260((byte) 107, class177.field2957.field3504);
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILjava/awt/Component;IZ)V")
    public abstract void method930(int arg0, Component arg1, int arg2, boolean arg3);

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)V")
    public static void method1371(int arg0) {
        if (arg0 > -114) {
            return;
        }
        field3353 = null;
        field3358 = null;
        field3359 = null;
        field3351 = null;
        field3346 = null;
        field3349 = null;
        field3357 = null;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(BLjava/awt/Graphics;II)V")
    public abstract void method920(byte arg0, Graphics arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IILjava/awt/Graphics;IBI)V")
    public abstract void method927(int arg0, int arg1, Graphics arg2, int arg3, byte arg4, int arg5);

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "()V")
    protected class197() {
    }
}
