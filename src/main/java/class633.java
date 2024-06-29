import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class633 {

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "I")
    public int field8779;

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "J")
    public long field8782;

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "Ljava/lang/String;")
    public String field8778;

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "Ljava/lang/String;")
    public String field8777;

    @OriginalMember(owner = "client!oj", name = "h", descriptor = "I")
    public int field8783;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "Lqia;")
    public static class547 field8776 = new class547();

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "I")
    public static int field8780;

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "I")
    public static int field8781;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIILpg;)V")
    public static final void method3439(int arg0, int arg1, int arg2, class711 arg3) {
        if (arg1 == -1) {
            class73.field960[arg0][arg2] = arg3;
            field8781++;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Z)V")
    public static void method3440(boolean arg0) {
        if (arg0) {
            field8776 = null;
        }
        field8776 = null;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(JI)V")
    public static final void method3441(long arg0, int arg1) {
        field8780++;
        int var3 = class703.field9922 + class339.field4374.field5790;
        if (arg1 != 0) {
            return;
        }
        int var4 = class409.field5778 + class339.field4374.field5784;
        if (class742.field10372 - var3 < -2000 || (class742.field10372 - var3) > 2000 || (class175.field2278 - var4) < -2000 || (class175.field2278 - var4) > 2000) {
            class175.field2278 = var4;
            class742.field10372 = var3;
        }
        if (class742.field10372 != var3) {
            int var5 = var3 - class742.field10372;
            int var6 = (int) ((long) var5 * arg0 / 320L);
            if (var5 > 0) {
                if (var6 == 0) {
                    var6 = 1;
                } else if (var6 > var5) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = -1;
            } else if (var5 > var6) {
                var6 = var5;
            }
            class742.field10372 += var6;
        }
        if (class175.field2278 != var4) {
            int var7 = var4 - class175.field2278;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (var7 > 0) {
                if (var8 == 0) {
                    var8 = 1;
                } else if (var7 < var8) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = -1;
            } else if (var8 < var7) {
                var8 = var7;
            }
            class175.field2278 += var8;
        }
        class602.field8360 += (float) arg0 * class591.field8230 / 6.0F;
        class748.field10471 += (float) arg0 * class661.field9067 / 6.0F;
        class106.method727(false);
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V")
    public class633(int arg0, String arg1, int arg2, String arg3, long arg4) {
        this.field8779 = arg2;
        this.field8782 = arg4;
        this.field8778 = arg3;
        this.field8777 = arg1;
        this.field8783 = arg0;
    }
}
