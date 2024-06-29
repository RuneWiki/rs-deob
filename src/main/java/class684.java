import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dv")
public class class684 implements class486 {

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "I")
    public int field9128;

    @OriginalMember(owner = "client!dv", name = "l", descriptor = "I")
    public int field9139;

    @OriginalMember(owner = "client!dv", name = "j", descriptor = "Lgi;")
    public class705 field9137;

    @OriginalMember(owner = "client!dv", name = "m", descriptor = "I")
    public int field9140;

    @OriginalMember(owner = "client!dv", name = "v", descriptor = "I")
    public int field9149;

    @OriginalMember(owner = "client!dv", name = "e", descriptor = "I")
    public int field9132;

    @OriginalMember(owner = "client!dv", name = "k", descriptor = "I")
    public int field9138;

    @OriginalMember(owner = "client!dv", name = "d", descriptor = "I")
    public int field9131;

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "I")
    public int field9129;

    @OriginalMember(owner = "client!dv", name = "r", descriptor = "Log;")
    public class673 field9145;

    @OriginalMember(owner = "client!dv", name = "i", descriptor = "Ljava/lang/String;")
    public String field9136;

    @OriginalMember(owner = "client!dv", name = "s", descriptor = "I")
    public int field9146;

    @OriginalMember(owner = "client!dv", name = "q", descriptor = "I")
    public int field9144;

    @OriginalMember(owner = "client!dv", name = "o", descriptor = "I")
    public static int field9142 = 0;

    @OriginalMember(owner = "client!dv", name = "c", descriptor = "I")
    public static int field9130;

    @OriginalMember(owner = "client!dv", name = "f", descriptor = "I")
    public static int field9133;

    @OriginalMember(owner = "client!dv", name = "g", descriptor = "I")
    public static int field9134;

    @OriginalMember(owner = "client!dv", name = "n", descriptor = "I")
    public static int field9141;

    @OriginalMember(owner = "client!dv", name = "p", descriptor = "I")
    public static int field9143;

    @OriginalMember(owner = "client!dv", name = "t", descriptor = "I")
    public static int field9147;

    @OriginalMember(owner = "client!dv", name = "u", descriptor = "I")
    public static int field9148;

    @OriginalMember(owner = "client!dv", name = "h", descriptor = "Ljava/lang/Object;")
    public static Object field9135;

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(I)V")
    public static void method3747(int arg0) {
        if (arg0 == -1) {
            field9135 = null;
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(ILjava/lang/String;C)[Ljava/lang/String;")
    public static final String[] method3748(int arg0, String arg1, char arg2) {
        field9141++;
        int var3 = class82.method665(false, arg2, arg1);
        String[] var4 = new String[var3 + 1];
        int var5 = 0;
        int var6 = 0;
        if (arg0 != -2242) {
            field9133 = 89;
        }
        for (int var7 = 0; var7 < var3; var7++) {
            int var8;
            for (var8 = var6; arg2 != arg1.charAt(var8); var8++) {
            }
            var4[var5++] = arg1.substring(var6, var8);
            var6 = var8 + 1;
        }
        var4[var3] = arg1.substring(var6);
        return var4;
    }

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "(I)V")
    public static final void method3749(int arg0) {
        for (class641 var1 = (class641) class716.field9763.method152((byte) -13); var1 != null; var1 = (class641) class716.field9763.method146((byte) 97)) {
            if (var1.field8639 > 1) {
                var1.field8639 = 0;
                class497.field6990.method3108(((class478) var1.field8636.field259.field8885).field6708, 16337, var1);
                var1.field8636.method153(74);
            }
        }
        field9148++;
        if (arg0 != -3244) {
            return;
        }
        class269.field3929 = 0;
        class382.field5558 = 0;
        class645.field8695.method690(arg0 ^ 0xFFFFBDF2);
        class533.field7395.method1244(30407);
        class716.field9763.method153(47);
        class677.field9075 = false;
    }

    @OriginalMember(owner = "client!dv", name = "c", descriptor = "(I)I")
    public static final int method3750(int arg0) {
        field9147++;
        if (arg0 > -115) {
            field9130 = 61;
        }
        return class758.field10380;
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(IIB)Z")
    public static final boolean method3751(int arg0, int arg1, byte arg2) {
        field9143++;
        int var3 = -104 % ((arg2 - 55) / 47);
        return (arg1 & 0xC580) != 0;
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(B)Leo;")
    public final class313 method576(byte arg0) {
        field9134++;
        if (arg0 != 41) {
            this.method576((byte) 30);
        }
        return class289.field4118;
    }

    @OriginalMember(owner = "client!dv", name = "<init>", descriptor = "(Ljava/lang/String;Log;Lgi;IIIIIIIIII)V")
    public class684(String arg0, class673 arg1, class705 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        this.field9128 = arg4;
        this.field9139 = arg11;
        this.field9137 = arg2;
        this.field9140 = arg5;
        this.field9149 = arg3;
        this.field9132 = arg12;
        this.field9138 = arg10;
        this.field9131 = arg7;
        this.field9129 = arg9;
        this.field9145 = arg1;
        this.field9136 = arg0;
        this.field9146 = arg8;
        this.field9144 = arg6;
    }
}
