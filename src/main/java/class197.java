import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public abstract class class197 {

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "I")
    public int field3681;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "I")
    public int field3675;

    @OriginalMember(owner = "client!sa", name = "n", descriptor = "I")
    public int field3688;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "Ldc;")
    private static class37 field3677 = class185.method1233((byte) 86, "Loaded sprites");

    @OriginalMember(owner = "client!sa", name = "k", descriptor = "[[I")
    public static int[][] field3685 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!sa", name = "m", descriptor = "Ldc;")
    public static class37 field3687 = class185.method1233((byte) 86, "Konfig geladen)3");

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "J")
    public static long field3683 = 0L;

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "Ldc;")
    public static class37 field3676 = field3677;

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "S")
    public static short field3678 = 256;

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "Lbb;")
    public static class14 field3682 = new class14(64);

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "I")
    public static int field3679;

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "I")
    public static int field3680;

    @OriginalMember(owner = "client!sa", name = "j", descriptor = "I")
    public static int field3684;

    @OriginalMember(owner = "client!sa", name = "l", descriptor = "I")
    public static int field3686;

    @OriginalMember(owner = "client!sa", name = "o", descriptor = "I")
    public static int field3689;

    @OriginalMember(owner = "client!sa", name = "p", descriptor = "Lwa;")
    public static class238 field3690;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIBI)I")
    public static final int method1310(int arg0, int arg1, byte arg2, int arg3) {
        field3680++;
        int var4 = arg3 / arg1;
        int var5 = arg0 / arg1;
        int var6 = arg1 - 1 & arg0;
        int var7 = arg1 - 1 & arg3;
        if (arg2 > -17) {
            method1312(null, 86, null);
        }
        int var8 = class89.method595(4, var4, var5);
        int var9 = class89.method595(4, var4, var5 + 1);
        int var10 = class89.method595(4, var4 + 1, var5);
        int var11 = class89.method595(4, var4 + 1, var5 + 1);
        int var12 = class58.method448(var6, var9, var8, 0, arg1);
        int var13 = class58.method448(var6, var11, var10, 0, arg1);
        return class58.method448(var7, var13, var12, 0, arg1);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V")
    public static void method1311(int arg0) {
        field3687 = null;
        if (arg0 != -13896) {
            method1311(74);
        }
        field3682 = null;
        field3685 = null;
        field3677 = null;
        field3676 = null;
        field3690 = null;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Ljava/lang/Object;ILbi;)V")
    public static final void method1312(Object arg0, int arg1, class21 arg2) {
        field3679++;
        if (arg2.field348 == null) {
            return;
        }
        for (int var3 = arg1; var3 < 50 && arg2.field348.peekEvent() != null; var3++) {
            class238.method1548((byte) -84, 1L);
        }
        if (arg0 != null) {
            arg2.field348.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(III)V")
    public abstract void method715(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lce;I)Lsh;")
    public static final class204 method1313(class28 arg0, int arg1) {
        field3686++;
        return arg1 == 0 ? new class204(arg0.method228(true), arg0.method228(true), arg0.method228(true), arg0.method228(true), arg0.method225(103), arg0.method215(-1797813752)) : null;
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(III)V")
    public abstract void method714(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(III)V")
    public abstract void method713(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(III)V")
    public class197(int arg0, int arg1, int arg2) {
        this.field3681 = arg1;
        this.field3675 = arg0;
        this.field3688 = arg2;
    }
}
