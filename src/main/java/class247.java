import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class247 extends class159 {

    @OriginalMember(owner = "client!fa", name = "k", descriptor = "[B")
    public byte[] field3221;

    @OriginalMember(owner = "client!fa", name = "l", descriptor = "I")
    public static int field3222 = 999999;

    @OriginalMember(owner = "client!fa", name = "p", descriptor = "I")
    public static int field3226 = 0;

    @OriginalMember(owner = "client!fa", name = "q", descriptor = "I")
    public static int field3227 = 0;

    @OriginalMember(owner = "client!fa", name = "m", descriptor = "I")
    public static int field3223;

    @OriginalMember(owner = "client!fa", name = "n", descriptor = "I")
    public static int field3224;

    @OriginalMember(owner = "client!fa", name = "o", descriptor = "I")
    public static int field3225;

    @OriginalMember(owner = "client!fa", name = "r", descriptor = "I")
    public static int field3228;

    @OriginalMember(owner = "client!fa", name = "s", descriptor = "I")
    public static int field3229;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IILoq;)Z")
    public static final boolean method1532(int arg0, int arg1, class378 arg2) {
        field3223++;
        class227.field2929.method820(arg2.field5517[arg1], arg2.field5515[arg1], arg2.field5516[arg1], class263.field3875);
        int var3 = class263.field3875[2];
        if (var3 < 50) {
            return false;
        } else {
            arg2.field5519[arg1] = (short) (class263.field3875[0] * class709.field9700 / var3 + class163.field2168);
            arg2.field5514[arg1] = (short) (class263.field3875[arg0] * class324.field4597 / var3 + class497.field6979);
            arg2.field5525[arg1] = (short) var3;
            return true;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(III)Z")
    public static final boolean method1533(int arg0, int arg1, int arg2) {
        if (arg1 != -30127) {
            method1532(100, 30, null);
        }
        field3228++;
        return (arg2 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(III)Z")
    public static final boolean method1534(int arg0, int arg1, int arg2) {
        field3224++;
        if (arg1 > -29) {
            return false;
        } else {
            return (arg0 & 0x800) != 0;
        }
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "([B)V")
    public class247(byte[] arg0) {
        this.field3221 = arg0;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Z)V")
    public static final void method1535(boolean arg0) {
        field3225++;
        class419.field6032 = new class347[class82.field1139.method1193(arg0)][];
        class230.field2956 = new class347[class82.field1139.method1193(true)][];
        class408.field5782 = new boolean[class82.field1139.method1193(arg0)];
    }
}
