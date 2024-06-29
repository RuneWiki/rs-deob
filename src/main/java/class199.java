import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class199 {

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "I")
    public static int field2822 = 0;

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "[F")
    public static float[] field2821 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "I")
    public static int field2818;

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "I")
    public static int field2819;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "I")
    public static int field2820;

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "I")
    public static int field2823;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(III)I", line = 7)
    public static final int method1241(int arg0, int arg1, int arg2) {
        field2823++;
        if (arg1 != 3) {
            method1244(null, 86);
        }
        return arg0 == 1 || arg0 == 3 ? class359.field5239[arg2 & 0x3] : class154.field2362[arg2 & 0x3];
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V", line = 29)
    public static void method1242(int arg0) {
        field2821 = null;
        if (arg0 != 5) {
            field2821 = null;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lco;I)V", line = 41)
    public static final void method1243(class77 arg0, int arg1) {
        field2819++;
        if (arg1 != 22865) {
            return;
        }
        if ((arg0 instanceof class502)) {
            class502 var3 = (class502) arg0;
            if (var3.field7387 == null) {
                return;
            }
            class291.method1729(true, var3, class316.field4324.field1738 != var3.field1738);
        } else if (arg0 instanceof class438) {
            class438 var2 = (class438) arg0;
            class408.method2440(var2, 5, class316.field4324.field1738 != var2.field1738);
            return;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lem;I)V", line = 76)
    public static final void method1244(class150 arg0, int arg1) {
        field2820++;
        if (class175.field2596 == arg0.field2289) {
            if (class316.field4324.field6421 == null) {
                arg0.field2194 = 0;
                arg0.field2229 = 0;
            } else {
                arg0.field2276 = 150;
                arg0.field2234 = (int) (Math.sin((double) class441.field6516 / 40.0D) * 256.0D) & 0x7FF;
                arg0.field2229 = class152.field2335;
                arg0.field2297 = 5;
                arg0.field2194 = class316.method1846(class316.field4324.field6421, 7);
                arg0.field2240 = 0;
                arg0.field2267 = class316.field4324.field1098;
                arg0.field2262 = class316.field4324.field1083;
                arg0.field2281 = class316.field4324.field1102;
            }
        } else if (arg1 != 0) {
            method1242(-45);
        }
    }
}
