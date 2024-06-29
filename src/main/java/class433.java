import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class433 {

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "I")
    public static int field5887;

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "I")
    public static int field5889;

    @OriginalMember(owner = "client!rm", name = "e", descriptor = "I")
    public static int field5891;

    @OriginalMember(owner = "client!rm", name = "g", descriptor = "I")
    public int field5893;

    @OriginalMember(owner = "client!rm", name = "h", descriptor = "I")
    public static int field5894;

    @OriginalMember(owner = "client!rm", name = "i", descriptor = "I")
    public int field5895;

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "Lgs;")
    public static class49 field5888;

    @OriginalMember(owner = "client!rm", name = "f", descriptor = "Z")
    public static boolean field5892;

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "[Lev;")
    public class721[] field5890;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(BLfca;Laca;)Lev;", line = 4)
    private final class721 method2536(byte arg0, class93 arg1, class758 arg2) {
        field5891++;
        if (class325.field4443 == arg2) {
            return class613.method3473(0, arg1);
        } else if (class538.field7311 == arg2) {
            return class584.method3355((byte) -1, arg1);
        } else if (class768.field10593 == arg2) {
            return class271.method1756(1, arg1);
        } else if (class673.field9342 == arg2) {
            return class126.method1084(false, arg1);
        } else if (class518.field7041 == arg2) {
            return class767.method4225(arg1, 57);
        } else if (class492.field6767 == arg2) {
            return class367.method2241(arg1, 59);
        } else if (class571.field8132 == arg2) {
            return class312.method1981(-101, arg1);
        } else if (class502.field6861 == arg2) {
            return class218.method1508(arg1, 15645);
        } else if (class500.field6845 == arg2) {
            return class307.method1956(arg1, (byte) -44);
        } else {
            if (arg0 > -18) {
                method2537((byte) -53, 50, 47);
            }
            return class564.field7991 == arg2 ? class506.method2890(arg1, 8912) : null;
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(BII)Z", line = 55)
    public static final boolean method2537(byte arg0, int arg1, int arg2) {
        int var3 = 47 % ((arg0 - 10) / 52);
        field5887++;
        return (arg1 & 0x180) != 0;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)V", line = 65)
    public static void method2538(int arg0) {
        if (arg0 != 26095) {
            field5894 = -93;
        }
        field5888 = null;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lfca;I)V", line = 77)
    public final void method2539(class93 arg0, int arg1) {
        if (arg1 != -22917) {
            field5888 = null;
        }
        field5889++;
        this.field5893 = arg0.method767((byte) -119);
        this.field5895 = arg0.method763(-5);
        this.field5890 = new class721[arg0.method793((byte) 35)];
        class758[] var3 = class357.method2205(21959);
        for (int var4 = 0; var4 < this.field5890.length; var4++) {
            this.field5890[var4] = this.method2536((byte) -111, arg0, var3[arg0.method793((byte) 113)]);
        }
    }
}
