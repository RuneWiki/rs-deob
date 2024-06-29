import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class332 {

    @OriginalMember(owner = "client!si", name = "b", descriptor = "I")
    public static int field5066;

    @OriginalMember(owner = "client!si", name = "d", descriptor = "I")
    public static int field5068;

    @OriginalMember(owner = "client!si", name = "e", descriptor = "I")
    public static int field5069;

    @OriginalMember(owner = "client!si", name = "f", descriptor = "I")
    public static int field5070;

    @OriginalMember(owner = "client!si", name = "g", descriptor = "I")
    public static int field5071;

    @OriginalMember(owner = "client!si", name = "h", descriptor = "I")
    public static int field5072;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "J")
    public long field5065;

    @OriginalMember(owner = "client!si", name = "c", descriptor = "Lsi;")
    public class332 field5067;

    @OriginalMember(owner = "client!si", name = "i", descriptor = "Lsi;")
    public class332 field5073;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I)Z", line = 6)
    public final boolean method2284(int arg0) {
        field5070++;
        if (this.field5067 == null) {
            return false;
        } else {
            if (arg0 != 17698) {
                method2288(13, (byte) 92);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Z)V", line = 23)
    public final void method2285(boolean arg0) {
        if (!arg0) {
            this.method2284(-76);
        }
        field5068++;
        if (this.field5067 != null) {
            this.field5067.field5073 = this.field5073;
            this.field5073.field5067 = this.field5067;
            this.field5067 = null;
            this.field5073 = null;
        }
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(I)V", line = 40)
    public static final void method2286(int arg0) {
        field5071++;
        if (arg0 == 25485) {
            class103.field1334++;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(BI)V", line = 57)
    public static final void method2287(byte arg0, int arg1) {
        class30.field383 = -1;
        class231.field3373 = arg1;
        class308.field4765 = -1;
        field5066++;
        if (arg0 > 82) {
            class106.method617(-8915);
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IB)V", line = 74)
    public static final void method2288(int arg0, byte arg1) {
        field5069++;
        if (arg1 > -25) {
            method2287((byte) -49, -77);
        }
        class69.field899 = (class79) class335.field5171.method1537((long) arg0, -22708);
    }
}
