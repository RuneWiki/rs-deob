import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class668 extends class392 {

    @OriginalMember(owner = "client!ma", name = "m", descriptor = "Lin;")
    public static class380 field9389 = new class380(95, 6);

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "[I")
    public static int[] field9390 = new int[128];

    @OriginalMember(owner = "client!ma", name = "p", descriptor = "B")
    public static byte field9392;

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "I")
    public static int field9383;

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "I")
    public static int field9384;

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "I")
    public static int field9385;

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "I")
    public static int field9386;

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "I")
    public static int field9387;

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "I")
    public static int field9388;

    @OriginalMember(owner = "client!ma", name = "q", descriptor = "I")
    public static int field9393;

    @OriginalMember(owner = "client!ma", name = "o", descriptor = "Lbc;")
    public static class11 field9391;

    static {
        for (int var0 = 0; ~field9390.length < ~var0; ++var0) {
            field9390[var0] = -1;
        }
        for (int var1 = 65; var1 <= 90; ++var1) {
            field9390[var1] = var1 - 65;
        }
        for (int var2 = 97; var2 <= 122; ++var2) {
            field9390[var2] = var2 + -97 + 26;
        }
        for (int var3 = 48; ~var3 >= -58; ++var3) {
            field9390[var3] = var3 + -48 + 52;
        }
        field9390[45] = field9390[47] = 63;
        field9390[42] = field9390[43] = 62;
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(II)I", line = 3)
    public final int method290(int arg0, int arg1) {
        ++field9388;
        if (arg1 > -124) {
            return 108;
        } else if (super.field5454.method3782((byte) 65)) {
            return 3;
        } else {
            return super.field5454.field9487.method3081(17539) == 0 ? 3 : 1;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(BI)V", line = 20)
    public final void method286(byte arg0, int arg1) {
        super.field5452 = arg1;
        ++field9383;
        int var3 = 43 % ((arg0 - -80) / 38);
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(Z)V", line = 30)
    public final void method291(boolean arg0) {
        ++field9386;
        if (super.field5454.method3782((byte) -76)) {
            super.field5452 = 0;
        }
        if (!arg0) {
            if (~super.field5454.field9487.method3081(17539) == -1) {
                super.field5452 = 0;
            }
            if (super.field5452 < 0 || ~super.field5452 < -3) {
                super.field5452 = this.method292(true);
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)Z", line = 53)
    public final boolean method3739(int arg0) {
        ++field9384;
        if (super.field5454.method3782((byte) 105)) {
            return false;
        } else {
            return arg0 != super.field5454.field9487.method3081(17539);
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Z)I", line = 68)
    public final int method292(boolean arg0) {
        if (!arg0) {
            this.method292(true);
        }
        ++field9387;
        return 2;
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "(I)V", line = 82)
    public static void method3740(int arg0) {
        if (arg0 != 12542) {
            method3740(106);
        }
        field9390 = null;
        field9391 = null;
        field9389 = null;
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Lw;)V", line = 96)
    public class668(class675 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "(I)I", line = 100)
    public final int method3741(int arg0) {
        if (arg0 != 17539) {
            this.method3739(33);
        }
        ++field9385;
        return super.field5452;
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(ILw;)V", line = 117)
    public class668(int arg0, class675 arg1) {
        super(arg0, arg1);
    }
}
