import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aw")
public class class53 {

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "Z")
    public boolean field742 = false;

    @OriginalMember(owner = "client!aw", name = "c", descriptor = "F")
    public static float field744 = 0.0F;

    @OriginalMember(owner = "client!aw", name = "b", descriptor = "I")
    public static int field743;

    @OriginalMember(owner = "client!aw", name = "d", descriptor = "I")
    public int field745;

    @OriginalMember(owner = "client!aw", name = "e", descriptor = "I")
    public static int field746;

    @OriginalMember(owner = "client!aw", name = "f", descriptor = "I")
    public static int field747;

    @OriginalMember(owner = "client!aw", name = "h", descriptor = "I")
    public static int field749;

    @OriginalMember(owner = "client!aw", name = "i", descriptor = "I")
    public static int field750;

    @OriginalMember(owner = "client!aw", name = "j", descriptor = "I")
    public int field751;

    @OriginalMember(owner = "client!aw", name = "g", descriptor = "Lp;")
    public class147 field748;

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(B)Z", line = 9)
    public final boolean method391(byte arg0) {
        if (arg0 <= 49) {
            return false;
        } else {
            field746++;
            return this.field748.field1951.method1288(this.field745, 18555);
        }
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(ILqa;ZI)Laa;", line = 24)
    public final class341 method392(int arg0, class165 arg1, boolean arg2, int arg3) {
        field747++;
        if (arg3 != 1) {
            this.field751 = 90;
        }
        long var5 = (long) (arg1.field2233 << 19 | (arg2 ? 262144 : 0) | arg0 << 16 | this.field745);
        class341 var7 = (class341) this.field748.field1959.method2133(var5, (byte) 93);
        if (var7 != null) {
            return var7;
        } else if (this.field748.field1951.method1288(this.field745, 18555)) {
            class252 var8 = class252.method1630(this.field748.field1951, this.field745, 0);
            if (var8 != null) {
                var8.field3507 = var8.field3509 = var8.field3510 = var8.field3505 = 0;
                if (arg2) {
                    var8.method1639();
                }
                for (int var9 = 0; var9 < arg0; var9++) {
                    var8.method1635();
                }
            }
            class341 var10 = arg1.method774(var8, true);
            if (var10 != null) {
                this.field748.field1959.method2131(var10, var5, false);
            }
            return var10;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(IILnj;)V", line = 70)
    private final void method393(int arg0, int arg1, class164 arg2) {
        if (arg0 == 1) {
            this.field745 = arg2.method1074(-635989152);
        } else if (arg0 == 2) {
            this.field751 = arg2.method1090(-1);
        } else if (arg0 == 3) {
            this.field742 = true;
        } else if (arg0 == 4) {
            this.field745 = -1;
        }
        if (arg1 >= 15) {
            field749++;
        }
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(Lnj;I)V", line = 108)
    public final void method394(class164 arg0, int arg1) {
        if (arg1 != 0) {
            this.method392(-65, null, false, -99);
        }
        field750++;
        while (true) {
            int var3 = arg0.method1087(false);
            if (var3 == 0) {
                return;
            }
            this.method393(var3, 17, arg0);
        }
    }
}
