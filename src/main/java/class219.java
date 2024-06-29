import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class219 extends class81 {

    @OriginalMember(owner = "client!vg", name = "J", descriptor = "[Lgg;")
    public class56[] field3951;

    @OriginalMember(owner = "client!vg", name = "H", descriptor = "Lsg;")
    public static class30 field3950 = class167.method1221((byte) 33, "Lade Liste der Welten");

    @OriginalMember(owner = "client!vg", name = "L", descriptor = "Lsg;")
    public static class30 field3952 = class167.method1221((byte) 33, "<img=0>");

    @OriginalMember(owner = "client!vg", name = "T", descriptor = "Lsg;")
    public static class30 field3959 = class167.method1221((byte) 33, "");

    @OriginalMember(owner = "client!vg", name = "R", descriptor = "I")
    public static int field3957 = 0;

    @OriginalMember(owner = "client!vg", name = "V", descriptor = "Lsg;")
    public static class30 field3961 = class167.method1221((byte) 33, "Nehmen");

    @OriginalMember(owner = "client!vg", name = "Q", descriptor = "Lsg;")
    private static class30 field3956 = class167.method1221((byte) 33, "Loading wordpack )2 ");

    @OriginalMember(owner = "client!vg", name = "N", descriptor = "Lsg;")
    public static class30 field3953 = field3956;

    @OriginalMember(owner = "client!vg", name = "W", descriptor = "Lsg;")
    public static class30 field3962 = class167.method1221((byte) 33, "Hidden)2use");

    @OriginalMember(owner = "client!vg", name = "Y", descriptor = "Lsg;")
    public static class30 field3964 = class167.method1221((byte) 33, "blaugr-Un:");

    @OriginalMember(owner = "client!vg", name = "S", descriptor = "Lsg;")
    public static class30 field3958 = class167.method1221((byte) 33, "rot:");

    @OriginalMember(owner = "client!vg", name = "X", descriptor = "Lsg;")
    public static class30 field3963 = null;

    @OriginalMember(owner = "client!vg", name = "O", descriptor = "I")
    public static int field3954;

    @OriginalMember(owner = "client!vg", name = "P", descriptor = "I")
    public static int field3955;

    @OriginalMember(owner = "client!vg", name = "U", descriptor = "I")
    public static int field3960;

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "(I)V")
    public static void method1587(int arg0) {
        field3958 = null;
        field3956 = null;
        field3964 = null;
        field3952 = null;
        field3961 = null;
        field3950 = null;
        field3962 = null;
        if (arg0 != 0) {
            method1587(-98);
        }
        field3963 = null;
        field3953 = null;
        field3959 = null;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IB)Z")
    public final boolean method1588(int arg0, byte arg1) {
        field3955++;
        if (arg1 != -88) {
            field3958 = null;
        }
        return this.field3951[arg0].field1232;
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(Lmc;Lmc;IZ)V")
    public class219(class151 arg0, class151 arg1, int arg2, boolean arg3) {
        class48 var5 = new class48();
        int var6 = arg0.method1124(arg2, -85);
        this.field3951 = new class56[var6];
        int[] var7 = arg0.method1097(arg2, true);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method1115(var7[var8], (byte) -116, arg2);
            class193 var10 = null;
            int var11 = var9[1] & 0xFF | (var9[0] & 0xFF) << 8;
            for (class193 var12 = (class193) var5.method478(0); var12 != null; var12 = (class193) var5.method476((byte) 13)) {
                if (var12.field3493 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method1128(0, var11, 0);
                } else {
                    var13 = arg1.method1128(0, 0, var11);
                }
                var10 = new class193(var11, var13);
                var5.method477(var10, (byte) 6);
            }
            this.field3951[var7[var8]] = new class56(var9, var10);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lmc;IB)Lbj;")
    public static final class44 method1589(class151 arg0, int arg1, byte arg2) {
        field3954++;
        int var3 = -113 / ((arg2 - 52) / 55);
        return class41.method433(arg1, 0, arg0) ? class129.method981(false) : null;
    }
}
