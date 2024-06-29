import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tja")
public class class384 implements class262 {

    @OriginalMember(owner = "client!tja", name = "a", descriptor = "Lwm;")
    private class30 field4792;

    @OriginalMember(owner = "client!tja", name = "c", descriptor = "Lln;")
    private class495 field4794;

    @OriginalMember(owner = "client!tja", name = "f", descriptor = "Lrn;")
    public static class633 field4797 = new class633(59, 4);

    @OriginalMember(owner = "client!tja", name = "i", descriptor = "[[I")
    public static int[][] field4800 = new int[128][128];

    @OriginalMember(owner = "client!tja", name = "j", descriptor = "Lrn;")
    public static class633 field4801 = new class633(51, -1);

    @OriginalMember(owner = "client!tja", name = "b", descriptor = "I")
    public static int field4793;

    @OriginalMember(owner = "client!tja", name = "e", descriptor = "I")
    public static int field4796;

    @OriginalMember(owner = "client!tja", name = "g", descriptor = "I")
    public static int field4798;

    @OriginalMember(owner = "client!tja", name = "h", descriptor = "I")
    public static int field4799;

    @OriginalMember(owner = "client!tja", name = "k", descriptor = "Loha;")
    public static class465 field4802;

    @OriginalMember(owner = "client!tja", name = "d", descriptor = "Lpu;")
    private class772 field4795;

    @OriginalMember(owner = "client!tja", name = "b", descriptor = "(I)V", line = 4)
    public final void method1035(int arg0) {
        field4793++;
        this.field4795 = class752.method4085(this.field4792, this.field4794.field6332, (byte) 36);
        if (arg0 != 27889) {
            this.method1034(97);
        }
    }

    @OriginalMember(owner = "client!tja", name = "a", descriptor = "(I)Z", line = 17)
    public final boolean method1034(int arg0) {
        if (arg0 != -32160) {
            this.method1034(-114);
        }
        field4799++;
        return this.field4792.method130(arg0 + 32158, this.field4794.field6332);
    }

    @OriginalMember(owner = "client!tja", name = "a", descriptor = "(B)V", line = 30)
    public static void method2199(byte arg0) {
        field4797 = null;
        field4800 = null;
        if (arg0 != 69) {
            method2199((byte) 118);
        }
        field4802 = null;
        field4801 = null;
    }

    @OriginalMember(owner = "client!tja", name = "a", descriptor = "(ZI)V", line = 55)
    public final void method835(boolean arg0, int arg1) {
        if (arg0) {
            int var3 = class372.field4550 <= class719.field9443 ? class719.field9443 : class372.field4550;
            int var4 = class398.field5240 >= class463.field6021 ? class398.field5240 : class463.field6021;
            int var5 = this.field4795.method623();
            int var6 = this.field4795.method628();
            int var7 = 0;
            int var8 = var3;
            int var9 = var3 * var6 / var5;
            int var10 = (var4 - var9) / 2;
            if (var4 < var9) {
                var8 = var4 * var5 / var6;
                var9 = var4;
                var10 = 0;
                var7 = (var3 - var8) / 2;
            }
            this.field4795.method4206(var7, var10, var8, var9);
        }
        field4798++;
        if (arg1 != 24726) {
            field4797 = null;
        }
    }

    @OriginalMember(owner = "client!tja", name = "<init>", descriptor = "(Lwm;Lln;)V", line = 97)
    public class384(class30 arg0, class495 arg1) {
        this.field4792 = arg0;
        this.field4794 = arg1;
    }
}
