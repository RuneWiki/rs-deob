import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class168 extends class9 {

    @OriginalMember(owner = "client!tj", name = "D", descriptor = "Lfr;")
    public class348 field2056;

    @OriginalMember(owner = "client!tj", name = "H", descriptor = "Lpg;")
    public class623 field2060;

    @OriginalMember(owner = "client!tj", name = "x", descriptor = "I")
    public static int field2051 = 765;

    @OriginalMember(owner = "client!tj", name = "w", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "client!tj", name = "y", descriptor = "I")
    public int field2052;

    @OriginalMember(owner = "client!tj", name = "z", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!tj", name = "A", descriptor = "I")
    public int field2054;

    @OriginalMember(owner = "client!tj", name = "C", descriptor = "I")
    public static int field2055;

    @OriginalMember(owner = "client!tj", name = "E", descriptor = "I")
    public int field2057;

    @OriginalMember(owner = "client!tj", name = "F", descriptor = "I")
    public int field2058;

    @OriginalMember(owner = "client!tj", name = "G", descriptor = "I")
    public int field2059;

    @OriginalMember(owner = "client!tj", name = "I", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIB)Z")
    public static final boolean method944(int arg0, int arg1, byte arg2) {
        field2050++;
        if (arg2 != -63) {
            field2051 = -53;
        }
        return (arg1 & 0x10000) != 0;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILjava/lang/String;Los;)I")
    public static final int method945(int arg0, String arg1, class374 arg2) {
        field2053++;
        int var3 = arg2.field4966;
        byte[] var4 = class160.method877((byte) -122, arg1);
        if (arg0 == -1) {
            arg2.method2087(var4.length, (byte) -79);
            arg2.field4966 += class93.field1141.method2845(arg2.field4966, arg2.field4929, var4, 32234, var4.length, 0);
            return arg2.field4966 - var3;
        } else {
            return -66;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)V")
    public final void method946(byte arg0) {
        field2061++;
        this.field2057 = this.field2056.field4476;
        this.field2052 = this.field2056.field4486;
        this.field2054 = this.field2056.field4475;
        if (this.field2056.field4483 != null) {
            this.field2056.field4483.method662(this.field2060.field8986, this.field2060.field8974, this.field2060.field8983, class351.field4527);
        }
        this.field2058 = class351.field4527[2];
        if (arg0 <= 15) {
            method944(107, 85, (byte) 92);
        }
        this.field2059 = class351.field4527[0];
    }

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(Lfr;Lts;)V")
    public class168(class348 arg0, class455 arg1) {
        this.field2056 = arg0;
        this.field2060 = this.field2056.method1942(false);
        this.method946((byte) 44);
    }
}
