import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class306 extends class117 {

    @OriginalMember(owner = "client!pn", name = "K", descriptor = "Lta;")
    public class309 field4186;

    @OriginalMember(owner = "client!pn", name = "F", descriptor = "Lbp;")
    public class69 field4182;

    @OriginalMember(owner = "client!pn", name = "N", descriptor = "[[I")
    public static int[][] field4189 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!pn", name = "G", descriptor = "Lfn;")
    public static class52 field4183 = new class52(89, -2);

    @OriginalMember(owner = "client!pn", name = "P", descriptor = "I")
    public static int field4191 = 0;

    @OriginalMember(owner = "client!pn", name = "R", descriptor = "[I")
    public static int[] field4193 = new int[] { 32, 39, 44, 47 };

    @OriginalMember(owner = "client!pn", name = "S", descriptor = "I")
    public static int field4194 = -1;

    @OriginalMember(owner = "client!pn", name = "C", descriptor = "I")
    public int field4179;

    @OriginalMember(owner = "client!pn", name = "D", descriptor = "I")
    public int field4180;

    @OriginalMember(owner = "client!pn", name = "E", descriptor = "I")
    public int field4181;

    @OriginalMember(owner = "client!pn", name = "I", descriptor = "I")
    public int field4184;

    @OriginalMember(owner = "client!pn", name = "J", descriptor = "I")
    public int field4185;

    @OriginalMember(owner = "client!pn", name = "L", descriptor = "I")
    public static int field4187;

    @OriginalMember(owner = "client!pn", name = "M", descriptor = "I")
    public static int field4188;

    @OriginalMember(owner = "client!pn", name = "O", descriptor = "I")
    public static int field4190;

    @OriginalMember(owner = "client!pn", name = "Q", descriptor = "I")
    public static int field4192;

    @OriginalMember(owner = "client!pn", name = "f", descriptor = "(I)V", line = 7)
    public static void method1853(int arg0) {
        field4193 = null;
        field4183 = null;
        field4189 = null;
        if (arg0 != 9) {
            field4189 = null;
        }
    }

    @OriginalMember(owner = "client!pn", name = "g", descriptor = "(I)V", line = 19)
    public final void method1854(int arg0) {
        this.field4184 = this.field4186.field4213;
        this.field4180 = this.field4186.field4212;
        this.field4181 = this.field4186.field4218;
        field4190++;
        if (this.field4186.field4219 != null) {
            this.field4186.field4219.method1385(this.field4182.field1017, this.field4182.field1009, this.field4182.field1019, class130.field1829);
        }
        this.field4185 = class130.field1829[2];
        if (arg0 == 32480) {
            this.field4179 = class130.field1829[0];
        }
    }

    @OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(Lta;Lm;)V", line = 49)
    public class306(class309 arg0, class83 arg1) {
        this.field4186 = arg0;
        this.field4182 = class347.method2079(arg0.field4221, -1);
        this.method1854(32480);
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIIZI)V", line = 61)
    public static final void method1855(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (arg3) {
            return;
        }
        if (arg4 <= arg2) {
            class80.method554(class2.field16[arg1], 109, arg0, arg2, arg4);
        } else {
            class80.method554(class2.field16[arg1], 97, arg0, arg4, arg2);
        }
        field4188++;
    }
}
