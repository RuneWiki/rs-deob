import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class645 extends class4 {

    @OriginalMember(owner = "client!am", name = "E", descriptor = "I")
    private int field9339 = 0;

    @OriginalMember(owner = "client!am", name = "K", descriptor = "I")
    private int field9345 = 4096;

    @OriginalMember(owner = "client!am", name = "H", descriptor = "Luv;")
    public static class3 field9342 = new class3(73, 7);

    @OriginalMember(owner = "client!am", name = "F", descriptor = "I")
    public static int field9340;

    @OriginalMember(owner = "client!am", name = "G", descriptor = "I")
    public static int field9341;

    @OriginalMember(owner = "client!am", name = "I", descriptor = "I")
    public static int field9343;

    @OriginalMember(owner = "client!am", name = "J", descriptor = "I")
    public static int field9344;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(BI)[I")
    public final int[] method15(byte arg0, int arg1) {
        ++field9343;
        int[] var3 = super.field31.method2252(arg1, arg0 ^ 1);
        if (arg0 != 10) {
            return null;
        } else {
            if (super.field31.field5127) {
                int[] var4 = this.method20(0, -21986, arg1);
                for (int var5 = 0; class132.field1627 > var5; ++var5) {
                    int var6 = var4[var5];
                    var3[var5] = var6 >= this.field9339 && this.field9345 >= var6 ? 4096 : 0;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(ILge;I)V")
    public final void method13(int arg0, class551 arg1, int arg2) {
        if (arg0 > -89) {
            method3715(true);
        }
        if (~arg2 != -1) {
            if (arg2 == 1) {
                this.field9345 = arg1.method3090(-74);
            }
        } else {
            this.field9339 = arg1.method3090(-109);
        }
        ++field9344;
    }

    @OriginalMember(owner = "client!am", name = "i", descriptor = "(I)V")
    public static void method3713(int arg0) {
        field9342 = null;
        int var1 = 66 % ((arg0 - 59) / 38);
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Lkr;ZLom;Lkr;Lkr;)Z")
    public static final boolean method3714(class329 arg0, boolean arg1, class333 arg2, class329 arg3, class329 arg4) {
        class115.field1466 = arg2;
        ++field9340;
        class620.field8931 = arg3;
        class171.field2197 = arg0;
        class633.field9213 = arg4;
        if (arg1) {
            field9342 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!am", name = "<init>", descriptor = "()V")
    public class645() {
        super(1, true);
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Z)V")
    public static final void method3715(boolean arg0) {
        class508.field7083 = new class564(8);
        ++field9341;
        class556.field7774 = 0;
        class309 var1 = (class309) class2.field18.method1876((byte) -98);
        if (arg0) {
            while (var1 != null) {
                var1.method1860();
                var1 = (class309) class2.field18.method1877(0);
            }
        }
    }
}
