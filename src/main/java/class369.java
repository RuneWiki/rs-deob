import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class369 extends class329 {

    @OriginalMember(owner = "client!nm", name = "l", descriptor = "I")
    public int field4678;

    @OriginalMember(owner = "client!nm", name = "q", descriptor = "I")
    public int field4683;

    @OriginalMember(owner = "client!nm", name = "s", descriptor = "I")
    public static int field4685 = 0;

    @OriginalMember(owner = "client!nm", name = "k", descriptor = "I")
    public static int field4677;

    @OriginalMember(owner = "client!nm", name = "m", descriptor = "I")
    public static int field4679;

    @OriginalMember(owner = "client!nm", name = "n", descriptor = "I")
    public static int field4680;

    @OriginalMember(owner = "client!nm", name = "o", descriptor = "I")
    public static int field4681;

    @OriginalMember(owner = "client!nm", name = "p", descriptor = "I")
    public static int field4682;

    @OriginalMember(owner = "client!nm", name = "r", descriptor = "I")
    public static int field4684;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Z)Z", line = 5)
    public final boolean method2017(boolean arg0) {
        if (arg0) {
            return false;
        } else {
            field4682++;
            return (this.field4678 & 0x5911FF) >> 22 != 0;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)I", line = 17)
    public final int method2018(int arg0) {
        field4677++;
        if (arg0 != -1035661311) {
            this.method2020(107);
        }
        return class688.method3879(this.field4678, (byte) 104);
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(Z)I", line = 29)
    public final int method2019(boolean arg0) {
        if (arg0) {
            this.method2020(-86);
        }
        field4679++;
        return this.field4678 >> 18 & 0x7;
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(I)Z", line = 44)
    public final boolean method2020(int arg0) {
        if (arg0 >= -18) {
            this.method2020(111);
        }
        field4684++;
        return (this.field4678 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IB)Z", line = 55)
    public final boolean method2021(int arg0, byte arg1) {
        if (arg1 != 91) {
            this.method2017(true);
        }
        field4680++;
        return (this.field4678 >> arg0 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "(I)Z", line = 67)
    public final boolean method2022(int arg0) {
        field4681++;
        if (arg0 > -122) {
            this.method2017(false);
        }
        return (this.field4678 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(II)V", line = 82)
    public class369(int arg0, int arg1) {
        this.field4678 = arg0;
        this.field4683 = arg1;
    }
}
