import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class308 extends class59 {

    @OriginalMember(owner = "client!nh", name = "O", descriptor = "[Lqi;")
    public class232[] field5201 = new class232[5];

    @OriginalMember(owner = "client!nh", name = "E", descriptor = "I")
    public int field5191 = 0;

    @OriginalMember(owner = "client!nh", name = "I", descriptor = "[I")
    public int[] field5195 = new int[5];

    @OriginalMember(owner = "client!nh", name = "F", descriptor = "I")
    public int field5192;

    @OriginalMember(owner = "client!nh", name = "T", descriptor = "I")
    public int field5206;

    @OriginalMember(owner = "client!nh", name = "R", descriptor = "I")
    public int field5204;

    @OriginalMember(owner = "client!nh", name = "L", descriptor = "I")
    public int field5198;

    @OriginalMember(owner = "client!nh", name = "y", descriptor = "I")
    public static int field5185 = 0;

    @OriginalMember(owner = "client!nh", name = "B", descriptor = "I")
    public static int field5188 = 0;

    @OriginalMember(owner = "client!nh", name = "D", descriptor = "I")
    public static int field5190 = 0;

    @OriginalMember(owner = "client!nh", name = "v", descriptor = "I")
    public static int field5182;

    @OriginalMember(owner = "client!nh", name = "x", descriptor = "I")
    public static int field5184;

    @OriginalMember(owner = "client!nh", name = "z", descriptor = "I")
    public static int field5186;

    @OriginalMember(owner = "client!nh", name = "A", descriptor = "I")
    public static int field5187;

    @OriginalMember(owner = "client!nh", name = "C", descriptor = "I")
    public static int field5189;

    @OriginalMember(owner = "client!nh", name = "G", descriptor = "I")
    public int field5193;

    @OriginalMember(owner = "client!nh", name = "J", descriptor = "I")
    public int field5196;

    @OriginalMember(owner = "client!nh", name = "K", descriptor = "I")
    public int field5197;

    @OriginalMember(owner = "client!nh", name = "P", descriptor = "I")
    public int field5202;

    @OriginalMember(owner = "client!nh", name = "Y", descriptor = "I")
    public int field5211;

    @OriginalMember(owner = "client!nh", name = "U", descriptor = "Lid;")
    public class107 field5207;

    @OriginalMember(owner = "client!nh", name = "Z", descriptor = "Lnm;")
    public class170 field5212;

    @OriginalMember(owner = "client!nh", name = "w", descriptor = "Ldm;")
    public static class182 field5183;

    @OriginalMember(owner = "client!nh", name = "V", descriptor = "Lce;")
    public class198 field5208;

    @OriginalMember(owner = "client!nh", name = "X", descriptor = "Luh;")
    public class241 field5210;

    @OriginalMember(owner = "client!nh", name = "W", descriptor = "Lre;")
    public class285 field5209;

    @OriginalMember(owner = "client!nh", name = "M", descriptor = "Lui;")
    public class289 field5199;

    @OriginalMember(owner = "client!nh", name = "S", descriptor = "Lnh;")
    public class308 field5205;

    @OriginalMember(owner = "client!nh", name = "H", descriptor = "Z")
    public boolean field5194;

    @OriginalMember(owner = "client!nh", name = "N", descriptor = "Z")
    public boolean field5200;

    @OriginalMember(owner = "client!nh", name = "Q", descriptor = "Z")
    public boolean field5203;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZBLdk;)V", line = 10)
    public static final void method2142(boolean arg0, byte arg1, class253 arg2) {
        field5189++;
        if (class166.field2625 || arg0) {
            int var3 = class14.field182;
            int var4 = var3 * 956 / 503;
            class136.field2028.method80((class188.field3055 - var4) / 2, 0, var4, var3);
            class68.field1024.method44(class188.field3055 / 2 - (class68.field1024.field5306 / 2), 18);
        }
        arg2.method1785(class226.field3613, class188.field3055 / 2, class14.field182 / 2 - 26, 16777215, -1);
        if (arg1 < 102) {
            return;
        }
        int var5 = class14.field182 / 2 - 18;
        if (class166.field2625) {
            class190.method1361(class188.field3055 / 2 - 152, var5, 304, 34, 9179409);
            class190.method1361(class188.field3055 / 2 - 151, var5 + 1, 302, 32, 0);
            class190.method1363(class188.field3055 / 2 - 150, var5 + 2, class98.field1436 * 3, 30, 9179409);
            class190.method1363(class188.field3055 / 2 + class98.field1436 * 3 - 150, var5 + 2, 300 - (class98.field1436 * 3), 30, 0);
        } else {
            class54.method378(class188.field3055 / 2 - 152, var5, 304, 34, 9179409);
            class54.method378(class188.field3055 / 2 - 151, var5 + 1, 302, 32, 0);
            class54.method383(class188.field3055 / 2 - 150, var5 - -2, class98.field1436 * 3, 30, 9179409);
            class54.method383(class188.field3055 / 2 + class98.field1436 * 3 - 150, var5 + 2, 300 - class98.field1436 * 3, 30, 0);
        }
        arg2.method1785(class92.field1346, class188.field3055 / 2, class14.field182 / 2 + 4, 16777215, -1);
    }

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "(I)V", line = 73)
    public static void method2143(int arg0) {
        if (arg0 > 26) {
            field5183 = null;
        }
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(III)V", line = 87)
    public class308(int arg0, int arg1, int arg2) {
        this.field5206 = this.field5192 = arg0;
        this.field5204 = arg1;
        this.field5198 = arg2;
    }
}
