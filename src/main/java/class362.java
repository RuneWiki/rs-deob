import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public abstract class class362 extends class154 {

    @OriginalMember(owner = "client!ng", name = "x", descriptor = "[Lng;")
    public class362[] field4941;

    @OriginalMember(owner = "client!ng", name = "l", descriptor = "Z")
    public boolean field4929;

    @OriginalMember(owner = "client!ng", name = "r", descriptor = "I")
    public static int field4935 = 0;

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "I")
    public static int field4926;

    @OriginalMember(owner = "client!ng", name = "k", descriptor = "I")
    public static int field4928;

    @OriginalMember(owner = "client!ng", name = "m", descriptor = "I")
    public static int field4930;

    @OriginalMember(owner = "client!ng", name = "n", descriptor = "I")
    public static int field4931;

    @OriginalMember(owner = "client!ng", name = "o", descriptor = "I")
    public static int field4932;

    @OriginalMember(owner = "client!ng", name = "p", descriptor = "I")
    public int field4933;

    @OriginalMember(owner = "client!ng", name = "q", descriptor = "I")
    public static int field4934;

    @OriginalMember(owner = "client!ng", name = "s", descriptor = "I")
    public static int field4936;

    @OriginalMember(owner = "client!ng", name = "t", descriptor = "I")
    public static int field4937;

    @OriginalMember(owner = "client!ng", name = "v", descriptor = "I")
    public static int field4939;

    @OriginalMember(owner = "client!ng", name = "w", descriptor = "I")
    public static int field4940;

    @OriginalMember(owner = "client!ng", name = "u", descriptor = "Lfd;")
    public class555 field4938;

    @OriginalMember(owner = "client!ng", name = "j", descriptor = "Ltn;")
    public class95 field4927;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lfca;II)V", line = 4)
    public void method154(class93 arg0, int arg1, int arg2) {
        field4930++;
        if (arg2 != -1) {
            this.field4929 = true;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)[I", line = 22)
    public int[] method156(int arg0, int arg1) {
        if (arg0 == -2026769311) {
            field4940++;
            throw new IllegalStateException("This operation does not have a monochrome output");
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IB)[[I", line = 40)
    public int[][] method153(int arg0, byte arg1) {
        field4931++;
        if (arg1 < 57) {
            this.method2222(43, 88, 5);
        }
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V", line = 51)
    public void method160(int arg0) {
        field4936++;
        if (arg0 != -996226836) {
            this.method160(34);
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(B)I", line = 61)
    public int method2219(byte arg0) {
        if (arg0 != 11) {
            this.method400((byte) 79);
        }
        field4932++;
        return -1;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(III)V", line = 72)
    public void method2220(int arg0, int arg1, int arg2) {
        field4928++;
        int var4 = ~this.field4933 == arg0 ? arg2 : this.field4933;
        if (this.field4929) {
            this.field4927 = new class95(var4, arg2, arg1);
        } else {
            this.field4938 = new class555(var4, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "(B)V", line = 96)
    public void method400(byte arg0) {
        field4937++;
        if (arg0 >= -67) {
            this.method401(-42);
        }
        if (this.field4929) {
            this.field4927.method803(91);
            this.field4927 = null;
        } else {
            this.field4938.method3198(true);
            this.field4938 = null;
        }
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(III)[I", line = 121)
    public final int[] method2221(int arg0, int arg1, int arg2) {
        field4939++;
        int var4 = 48 / ((arg2 + 43) / 37);
        return this.field4941[arg0].field4929 ? this.field4941[arg0].method156(-2026769311, arg1) : this.field4941[arg0].method153(arg1, (byte) 91)[0];
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(I)I", line = 148)
    public int method401(int arg0) {
        if (arg0 != 15667) {
            field4935 = 84;
        }
        field4926++;
        return -1;
    }

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "(III)[[I", line = 159)
    public final int[][] method2222(int arg0, int arg1, int arg2) {
        field4934++;
        if (arg2 != 28008) {
            this.method154(null, -73, -79);
        }
        if (this.field4941[arg0].field4929) {
            int[] var4 = this.field4941[arg0].method156(arg2 ^ 0x87319909, arg1);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field4941[arg0].method153(arg1, (byte) 89);
        }
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(IZ)V", line = 200)
    public class362(int arg0, boolean arg1) {
        this.field4941 = new class362[arg0];
        this.field4929 = arg1;
    }
}
