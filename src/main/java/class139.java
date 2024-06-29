import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public abstract class class139 {

    @OriginalMember(owner = "client!n", name = "d", descriptor = "Lhh;")
    public static class163 field2665 = class137.method1065("", 17);

    @OriginalMember(owner = "client!n", name = "a", descriptor = "[Lqi;")
    public static class132[] field2662 = new class132[100];

    @OriginalMember(owner = "client!n", name = "b", descriptor = "I")
    public static int field2663;

    @OriginalMember(owner = "client!n", name = "c", descriptor = "I")
    public static int field2664;

    @OriginalMember(owner = "client!n", name = "e", descriptor = "Lpa;")
    public static class123 field2666;

    @OriginalMember(owner = "client!n", name = "f", descriptor = "Lv;")
    public static class22 field2667;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ZLjava/awt/Component;)V")
    public abstract void method316(boolean arg0, Component arg1);

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IJIZ)Lhh;")
    public static final class163 method1074(int arg0, long arg1, int arg2, boolean arg3) {
        field2664++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        long var5 = arg1 / (long) arg2;
        int var7 = 1;
        while (var5 != 0L) {
            var5 /= (long) arg2;
            var7++;
        }
        if (arg0 < 9) {
            field2665 = null;
        }
        int var8 = var7;
        if (arg1 < 0L || arg3) {
            var8 = var7 + 1;
        }
        byte[] var9 = new byte[var8];
        if (arg1 < 0L) {
            var9[0] = 45;
        } else if (arg3) {
            var9[0] = 43;
        }
        for (int var10 = 0; var10 < var7; var10++) {
            int var12 = (int) (arg1 % (long) arg2);
            if (var12 < 0) {
                var12 = -var12;
            }
            if (var12 > 9) {
                var12 += 39;
            }
            var9[var8 - var10 - 1] = (byte) (var12 + 48);
            arg1 /= (long) arg2;
        }
        class163 var11 = new class163();
        var11.field2990 = var8;
        var11.field3020 = var9;
        return var11;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public abstract void method315(Component arg0, byte arg1);

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(B)I")
    public abstract int method317(byte arg0);

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ILpa;)V")
    public static final void method1075(int arg0, class123 arg1) {
        class16.field225 = arg1;
        field2663++;
        if (arg0 >= -35) {
            field2666 = null;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V")
    public static void method1076(int arg0) {
        field2665 = null;
        field2662 = null;
        field2666 = null;
        field2667 = null;
        if (arg0 != 0) {
            field2662 = null;
        }
    }
}
