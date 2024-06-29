import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class92 extends class106 implements class514 {

    @OriginalMember(owner = "client!er", name = "g", descriptor = "I")
    private int field1326;

    @OriginalMember(owner = "client!er", name = "c", descriptor = "I")
    public static int field1322;

    @OriginalMember(owner = "client!er", name = "d", descriptor = "I")
    public static int field1323;

    @OriginalMember(owner = "client!er", name = "e", descriptor = "I")
    public static int field1324;

    @OriginalMember(owner = "client!er", name = "f", descriptor = "I")
    public static int field1325;

    @OriginalMember(owner = "client!er", name = "h", descriptor = "I")
    public static int field1327;

    @OriginalMember(owner = "client!er", name = "c", descriptor = "(I)J", line = 4)
    public final long method667(int arg0) {
        if (arg0 != 25023) {
            this.field1326 = 32;
        }
        ++field1324;
        return super.field1487.getAddress();
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(I)I", line = 15)
    public final int method668(int arg0) {
        ++field1327;
        if (arg0 != -7881) {
            this.method671(117);
        }
        return 0;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Lhb;I)I", line = 26)
    public static final int method669(class677 arg0, int arg1) {
        ++field1325;
        int var2 = arg0.field9685;
        if (arg1 < 102) {
            return -65;
        } else {
            class67 var3 = arg0.method895(-25227);
            if (~arg0.field1761 != 0 && !arg0.field1703) {
                if (arg0.field1761 != var3.field875 && ~arg0.field1761 != ~var3.field893 && arg0.field1761 != var3.field911 && ~arg0.field1761 != ~var3.field874) {
                    if (~arg0.field1761 == ~var3.field890 || ~arg0.field1761 == ~var3.field870 || arg0.field1761 == var3.field886 || arg0.field1761 == var3.field906) {
                        var2 = arg0.field9703;
                    }
                } else {
                    var2 = arg0.field9679;
                }
            } else {
                var2 = arg0.field9659;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(III[B)V", line = 57)
    public final void method670(int arg0, int arg1, int arg2, byte[] arg3) {
        if (arg1 <= -68) {
            this.method777(arg3, arg0);
            ++field1323;
            this.field1326 = arg2;
        }
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(I)I", line = 70)
    public final int method671(int arg0) {
        ++field1322;
        return arg0 != 3566 ? -95 : this.field1326;
    }

    @OriginalMember(owner = "client!er", name = "<init>", descriptor = "(Llj;I[BI)V", line = 82)
    public class92(class565 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field1326 = arg1;
    }
}
