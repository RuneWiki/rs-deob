import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class495 extends class65 {

    @OriginalMember(owner = "client!bn", name = "l", descriptor = "Ljava/lang/String;")
    public String field7165;

    @OriginalMember(owner = "client!bn", name = "m", descriptor = "I")
    public static int field7166 = 0;

    @OriginalMember(owner = "client!bn", name = "o", descriptor = "I")
    public static int field7168 = 0;

    @OriginalMember(owner = "client!bn", name = "k", descriptor = "I")
    public static int field7164;

    @OriginalMember(owner = "client!bn", name = "n", descriptor = "I")
    public static int field7167;

    @OriginalMember(owner = "client!bn", name = "<init>", descriptor = "()V", line = 6)
    public class495() {
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IILraa;)I", line = 10)
    public static final int method3006(int arg0, int arg1, class353 arg2) {
        field7167++;
        if (arg1 > -110) {
            field7168 = 70;
        }
        if (!client.method2735(arg2).method1864(2362, arg0) && arg2.field5305 == null) {
            return -1;
        } else if (arg2.field5220 == null || arg2.field5220.length <= arg0) {
            return -1;
        } else {
            return arg2.field5220[arg0];
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIIBII)V", line = 25)
    public static final void method3007(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        if (arg3 != 69) {
            method3007(-120, 120, 111, (byte) -24, -87, 81);
        }
        if (arg5 >= class184.field3102 && class657.field9347 >= arg1 && arg2 >= class76.field1126 && arg4 <= class461.field6699) {
            class709.method3927(arg4, arg5, arg1, (byte) -61, arg2, arg0);
        } else {
            class205.method1509(arg5, arg1, arg0, arg4, arg3 ^ 0x754B, arg2);
        }
        field7164++;
    }

    @OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 47)
    public class495(String arg0) {
        this.field7165 = arg0;
    }
}
