import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class472 extends class577 {

    @OriginalMember(owner = "client!ci", name = "q", descriptor = "J")
    public long field6626;

    @OriginalMember(owner = "client!ci", name = "l", descriptor = "I")
    public static int field6621 = 0;

    @OriginalMember(owner = "client!ci", name = "r", descriptor = "F")
    public static float field6627;

    @OriginalMember(owner = "client!ci", name = "m", descriptor = "I")
    public static int field6622;

    @OriginalMember(owner = "client!ci", name = "n", descriptor = "I")
    public static int field6623;

    @OriginalMember(owner = "client!ci", name = "o", descriptor = "I")
    public static int field6624;

    @OriginalMember(owner = "client!ci", name = "p", descriptor = "I")
    public static int field6625;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lso;B)Llw;")
    public static final class687 method2808(class494 arg0, byte arg1) {
        field6624++;
        int var2 = arg0.method2998(true);
        class97 var3 = class391.method2424((byte) -122)[arg0.method2964((byte) 115)];
        class463 var4 = class670.method3807((byte) -127)[arg0.method2964((byte) 45)];
        int var5 = arg0.method2988(-3);
        int var6 = -115 / ((-arg1 - 27) / 49);
        int var7 = arg0.method2988(-3);
        return new class687(var2, var3, var4, var5, var7);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(BILmea;I)V")
    public static final void method2809(byte arg0, int arg1, class451 arg2, int arg3) {
        if (arg2.field6325 == 0) {
            arg2.field6333 = arg2.field6174;
        } else if (arg2.field6325 == 1) {
            arg2.field6333 = (arg1 - arg2.field6290) / 2 + arg2.field6174;
        } else if (arg2.field6325 == 2) {
            arg2.field6333 = arg1 - arg2.field6174 - arg2.field6290;
        } else if (arg2.field6325 == 3) {
            arg2.field6333 = arg2.field6174 * arg1 >> 14;
        } else if (arg2.field6325 == 4) {
            arg2.field6333 = (arg2.field6174 * arg1 >> 14) + (arg1 - arg2.field6290) / 2;
        } else {
            arg2.field6333 = arg1 - (arg2.field6174 * arg1 >> 14) - arg2.field6290;
        }
        field6623++;
        if (arg2.field6177 == 0) {
            arg2.field6242 = arg2.field6284;
        } else if (arg2.field6177 == 1) {
            arg2.field6242 = (arg3 - arg2.field6288) / 2 + arg2.field6284;
        } else if (arg2.field6177 == 2) {
            arg2.field6242 = arg3 - arg2.field6284 - arg2.field6288;
        } else if (arg2.field6177 == 3) {
            arg2.field6242 = arg2.field6284 * arg3 >> 14;
        } else if (arg2.field6177 == 4) {
            arg2.field6242 = (arg2.field6284 * arg3 >> 14) + (arg3 - arg2.field6288) / 2;
        } else {
            arg2.field6242 = arg3 - arg2.field6288 - (arg2.field6284 * arg3 >> 14);
        }
        int var4 = -105 / ((-arg0 - 87) / 39);
        if (!class81.field901) {
            return;
        }
        if (client.method2046(arg2).field441 == 0 && arg2.field6210 != 0) {
            return;
        }
        if (arg2.field6242 < 0) {
            arg2.field6242 = 0;
        } else if ((arg2.field6288 + arg2.field6242) > arg3) {
            arg2.field6242 = arg3 - arg2.field6288;
        }
        if (arg2.field6333 < 0) {
            arg2.field6333 = 0;
            return;
        }
        if ((arg2.field6333 + arg2.field6290) > arg1) {
            arg2.field6333 = arg1 - arg2.field6290;
            return;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIIIILvn;)V")
    public static final void method2810(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class330 arg6) {
        class773.method4258(arg2, arg6.field5742, (byte) -125, arg4, arg1, arg6.field5746, arg6.field5755, arg3, 0, arg0);
        if (arg5 != 1981) {
            field6622 = 42;
        }
        field6625++;
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "()V")
    public class472() {
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(J)V")
    public class472(long arg0) {
        this.field6626 = arg0;
    }
}
