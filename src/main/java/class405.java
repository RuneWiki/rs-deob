import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class405 {

    @OriginalMember(owner = "client!kj", name = "l", descriptor = "Lfc;")
    private class174 field5742 = new class174(256);

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "Lih;")
    private class503 field5733;

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "Ll;")
    private class16 field5732;

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "[I")
    public static int[] field5736 = new int[2];

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "I")
    public static int field5737 = -1;

    @OriginalMember(owner = "client!kj", name = "k", descriptor = "[Ljava/lang/String;")
    public static String[] field5741 = new String[100];

    @OriginalMember(owner = "client!kj", name = "j", descriptor = "Lkn;")
    public static class530 field5740 = new class530("Self", "Mich", "Moi", "Eu");

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "I")
    public static int field5731;

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "I")
    public static int field5734;

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "I")
    public static int field5735;

    @OriginalMember(owner = "client!kj", name = "h", descriptor = "I")
    public static int field5738;

    @OriginalMember(owner = "client!kj", name = "i", descriptor = "I")
    public static int field5739;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIIII)V")
    public static final void method2399(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class353.field5062 = arg0;
        if (arg2 != 100) {
            method2399(-116, 30, -119, -94, 97);
        }
        field5735++;
        class303.field4422 = arg3;
        class392.field5514 = arg4;
        class518.field7624 = arg1;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Loi;ZLoi;)V")
    public static final void method2400(class53 arg0, boolean arg1, class53 arg2) {
        class486.field6785 = arg0;
        field5738++;
        if (arg1) {
            field5740 = null;
        }
        class63.field801 = arg2;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(B)V")
    public static void method2401(byte arg0) {
        if (arg0 < 109) {
            method2400(null, true, null);
        }
        field5740 = null;
        field5741 = null;
        field5736 = null;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)V")
    public final void method2402(int arg0) {
        this.field5742.method1087(arg0 - 15081, 5);
        field5739++;
        if (arg0 != 15082) {
            field5737 = -114;
        }
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(B)V")
    public final void method2403(byte arg0) {
        field5731++;
        this.field5742.method1096((byte) -56);
        if (arg0 != 93) {
            this.field5733 = null;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(II)Lgu;")
    public final class417 method2404(int arg0, int arg1) {
        field5734++;
        Object var3 = this.field5742.method1088((long) arg1, (byte) 124);
        if (var3 != null) {
            return (class417) var3;
        }
        if (arg0 > -40) {
            this.method2402(119);
        }
        if (!this.field5732.method82(arg1, -18226)) {
            return null;
        }
        class222 var4 = this.field5732.method83(arg1, 93);
        int var5 = var4.field3186 ? 64 : this.field5733.field7295;
        class417 var7;
        if (var4.field3194 && this.field5733.method327()) {
            float[] var6 = this.field5732.method80(false, var5, false, 0.7F, var5, arg1);
            var7 = new class417(this.field5733, 3553, 34842, var5, var5, var4.field3193 != 0, var6, 6408);
        } else {
            int[] var8;
            if (var4.field3185) {
                var8 = this.field5732.method79(false, var5, arg1, var5, 0.7F, -20550);
            } else {
                var8 = this.field5732.method81((byte) 106, var5, arg1, 0.7F, false, var5);
            }
            var7 = new class417(this.field5733, 3553, 6408, var5, var5, var4.field3193 != 0, var8, false);
        }
        var7.method2467(19, var4.field3187, var4.field3196);
        this.field5742.method1097(19627, var7, (long) arg1);
        return var7;
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(Lih;Ll;)V")
    public class405(class503 arg0, class16 arg1) {
        this.field5733 = arg0;
        this.field5732 = arg1;
    }
}
