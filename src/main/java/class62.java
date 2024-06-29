import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class62 extends class23 {

    @OriginalMember(owner = "client!ff", name = "Q", descriptor = "I")
    private int field1136 = 4096;

    @OriginalMember(owner = "client!ff", name = "T", descriptor = "I")
    private int field1139 = 0;

    @OriginalMember(owner = "client!ff", name = "X", descriptor = "Li;")
    public static class88 field1143 = class208.method1425(105, "logo");

    @OriginalMember(owner = "client!ff", name = "U", descriptor = "Lwi;")
    public static class248 field1140 = new class248();

    @OriginalMember(owner = "client!ff", name = "Z", descriptor = "Li;")
    public static class88 field1145 = class208.method1425(105, "Geben Sie Ihren Benutzernamen");

    @OriginalMember(owner = "client!ff", name = "Y", descriptor = "Li;")
    private static class88 field1144 = class208.method1425(105, "and choose the (Wcreate account(W");

    @OriginalMember(owner = "client!ff", name = "bb", descriptor = "I")
    public static int field1147 = 4;

    @OriginalMember(owner = "client!ff", name = "eb", descriptor = "I")
    public static int field1150 = 0;

    @OriginalMember(owner = "client!ff", name = "gb", descriptor = "Li;")
    public static class88 field1152 = field1144;

    @OriginalMember(owner = "client!ff", name = "db", descriptor = "[[Lba;")
    public static class13[][] field1149 = new class13[field1147][500];

    @OriginalMember(owner = "client!ff", name = "cb", descriptor = "[I")
    public static int[] field1148 = new int[field1147];

    @OriginalMember(owner = "client!ff", name = "S", descriptor = "I")
    public static int field1138;

    @OriginalMember(owner = "client!ff", name = "V", descriptor = "I")
    public static int field1141;

    @OriginalMember(owner = "client!ff", name = "W", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "client!ff", name = "ab", descriptor = "Lnb;")
    public static class144 field1146;

    @OriginalMember(owner = "client!ff", name = "fb", descriptor = "Lp;")
    public static class163 field1151;

    @OriginalMember(owner = "client!ff", name = "R", descriptor = "[[[I")
    public static int[][][] field1137;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IB)[I")
    public final int[] method54(int arg0, byte arg1) {
        if (arg1 < 19) {
            method442((byte) 51);
        }
        ++field1141;
        int[] var3 = super.field379.method1080(false, arg0);
        if (super.field379.field3100) {
            int[] var4 = this.method120(arg0, false, 0);
            for (int var5 = 0; var5 < class70.field1276; ++var5) {
                int var6 = var4[var5];
                var3[var5] = ~var6 <= ~this.field1139 && var6 <= this.field1136 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lea;II)V")
    public final void method11(class46 arg0, int arg1, int arg2) {
        if (arg1 != -3) {
            method441(39, (byte) 0);
        }
        if (~arg2 != -1) {
            if (arg2 == 1) {
                this.field1136 = arg0.method301(21);
            }
        } else {
            this.field1139 = arg0.method301(77);
        }
        ++field1142;
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(IB)Lcj;")
    public static final class33 method441(int arg0, byte arg1) {
        if (arg1 <= 11) {
            method442((byte) -118);
        }
        ++field1138;
        class33 var2 = (class33) class137.field2535.method666((long) arg0, 0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class59.field1114.method941((byte) 56, class118.method801(arg0, false), class142.method930(100, arg0));
            class33 var4 = new class33();
            var4.field539 = arg0;
            if (var3 != null) {
                var4.method211(new class46(var3), (byte) 12);
            }
            class137.field2535.method664((long) arg0, var4, false);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(B)V")
    public static void method442(byte arg0) {
        field1144 = null;
        field1149 = null;
        field1148 = null;
        field1143 = null;
        field1152 = null;
        field1140 = null;
        if (arg0 > -9) {
            field1150 = 38;
        }
        field1146 = null;
        field1151 = null;
        field1137 = null;
        field1145 = null;
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "()V")
    public class62() {
        super(1, true);
    }
}
