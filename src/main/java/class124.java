import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class124 {

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "Lgw;")
    private class690 field1710 = new class690(256);

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "Ldw;")
    private class664 field1706;

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "Ld;")
    private class270 field1711;

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "Lst;")
    public static class335 field1707 = new class335(40, 5);

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "[F")
    public static float[] field1713 = new float[4];

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "I")
    public static int field1705;

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "I")
    public static int field1708;

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "I")
    public static int field1709;

    @OriginalMember(owner = "client!gi", name = "j", descriptor = "I")
    public static int field1714;

    @OriginalMember(owner = "client!gi", name = "k", descriptor = "I")
    public static int field1715;

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "Lqo;")
    public static class645 field1712;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(B)V", line = 6)
    public final void method774(byte arg0) {
        if (arg0 > -39) {
            this.field1710 = null;
        }
        this.field1710.method3906(-98);
        field1709++;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(II)Lfba;", line = 23)
    public final class350 method775(int arg0, int arg1) {
        field1714++;
        Object var3 = this.field1710.method3898((byte) -42, (long) arg0);
        if (var3 != null) {
            return (class350) var3;
        } else if (this.field1711.method517(arg0, true)) {
            if (arg1 < 121) {
                this.method774((byte) -71);
            }
            class239 var4 = this.field1711.method521(arg0, 109);
            int var5 = var4.field3556 ? 64 : this.field1706.field8999;
            class350 var7;
            if (var4.field3572 && this.field1706.method289()) {
                float[] var6 = this.field1711.method518(0.7F, arg0, 8606, var5, false, var5);
                var7 = new class350(this.field1706, 3553, 34842, var5, var5, var4.field3575 != 0, var6, 6408);
            } else {
                int[] var8;
                if (var4.field3557 != 2 && class416.method2592(var4.field3561, 2780)) {
                    var8 = this.field1711.method519(-6839, arg0, 0.7F, var5, var5, true);
                } else {
                    var8 = this.field1711.method520(var5, (byte) 77, var5, false, arg0, 0.7F);
                }
                var7 = new class350(this.field1706, 3553, 6408, var5, var5, var4.field3575 != 0, var8, 0, 0, false);
            }
            var7.method2230(3314, var4.field3576, var4.field3569);
            this.field1710.method3899(-126, var7, (long) arg0);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)V", line = 72)
    public final void method776(int arg0) {
        field1708++;
        int var2 = 0 / ((-arg0 - 25) / 52);
        this.field1710.method3896(1, 5);
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(B)V", line = 82)
    public static final void method777(byte arg0) {
        class331.field4701 = true;
        int var1 = -93 % ((3 - arg0) / 56);
        field1705++;
    }

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "(B)V", line = 92)
    public static void method778(byte arg0) {
        field1713 = null;
        field1712 = null;
        field1707 = null;
        if (arg0 != 102) {
            field1715 = 6;
        }
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Ldw;Ld;)V", line = 117)
    public class124(class664 arg0, class270 arg1) {
        this.field1706 = arg0;
        this.field1711 = arg1;
    }
}
