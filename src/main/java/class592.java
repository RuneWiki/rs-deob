import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class592 {

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "I")
    public int field8334 = 128;

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
    public int field8332 = 128;

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
    public int field8336;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "I")
    public int field8331;

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "I")
    public int field8337;

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "I")
    public int field8333;

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "I")
    public static int field8335;

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "I")
    public static int field8338;

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "I")
    public static int field8339;

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "I")
    public static int field8340;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)I")
    public static final int method3442(byte arg0) {
        field8339++;
        if (class161.field2561 != null) {
            return 3;
        } else if (arg0 > -29) {
            return 35;
        } else if (class710.field9871) {
            return 2;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lqi;Z)V")
    public final void method3443(class592 arg0, boolean arg1) {
        this.field8331 = arg0.field8331;
        field8340++;
        this.field8337 = arg0.field8337;
        if (arg1) {
            this.field8333 = -41;
        }
        this.field8333 = arg0.field8333;
        this.field8336 = arg0.field8336;
        this.field8334 = arg0.field8334;
        this.field8332 = arg0.field8332;
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(B)I")
    public static final int method3444(byte arg0) {
        field8335++;
        class65 var1 = class37.field491;
        boolean var2 = false;
        if (class21.field353.field10098.method1588(-38) != 0) {
            Canvas var3 = new Canvas();
            var3.setSize(100, 100);
            var1 = class774.method4267((byte) 127, 0, null, null, var3, 0);
            var2 = true;
        }
        long var4 = class459.method2731(126);
        for (int var6 = 0; var6 < 10000; var6++) {
            var1.method522(5, 10, 100, 75, 50, 100, 15, 90, 100, -65536, -65536, -65536, 1);
        }
        int var7 = -106 / ((arg0 + 14) / 63);
        int var8 = (int) (class459.method2731(124) - var4);
        var1.method436(0, 100, -16777216, 0, true, 100);
        if (var2) {
            var1.method533(100);
        }
        return var8;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)Lqi;")
    public final class592 method3445(int arg0) {
        if (arg0 != 10) {
            method3442((byte) -94);
        }
        field8338++;
        return new class592(this.field8336, this.field8332, this.field8334, this.field8337, this.field8333, this.field8331);
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(I)V")
    public class592(int arg0) {
        this.field8336 = arg0;
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(IIIIII)V")
    private class592(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field8334 = arg2;
        this.field8336 = arg0;
        this.field8331 = arg5;
        this.field8337 = arg3;
        this.field8332 = arg1;
        this.field8333 = arg4;
    }
}
