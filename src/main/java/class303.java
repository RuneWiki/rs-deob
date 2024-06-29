import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uu")
public class class303 extends class782 {

    @OriginalMember(owner = "client!uu", name = "o", descriptor = "I")
    private int field4162;

    @OriginalMember(owner = "client!uu", name = "i", descriptor = "I")
    private int field4156;

    @OriginalMember(owner = "client!uu", name = "n", descriptor = "I")
    private int field4161;

    @OriginalMember(owner = "client!uu", name = "m", descriptor = "I")
    private int field4160;

    @OriginalMember(owner = "client!uu", name = "r", descriptor = "I")
    private int field4165;

    @OriginalMember(owner = "client!uu", name = "h", descriptor = "I")
    private int field4155;

    @OriginalMember(owner = "client!uu", name = "p", descriptor = "I")
    private int field4163;

    @OriginalMember(owner = "client!uu", name = "f", descriptor = "I")
    private int field4153;

    @OriginalMember(owner = "client!uu", name = "s", descriptor = "Lfja;")
    public static class783 field4166 = new class783(88, 6);

    @OriginalMember(owner = "client!uu", name = "e", descriptor = "I")
    public static int field4152;

    @OriginalMember(owner = "client!uu", name = "g", descriptor = "I")
    public static int field4154;

    @OriginalMember(owner = "client!uu", name = "j", descriptor = "I")
    public static int field4157;

    @OriginalMember(owner = "client!uu", name = "k", descriptor = "I")
    public static int field4158;

    @OriginalMember(owner = "client!uu", name = "l", descriptor = "I")
    public static int field4159;

    @OriginalMember(owner = "client!uu", name = "q", descriptor = "I")
    public static int field4164;

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(IBI)V", line = 6)
    public final void method1935(int arg0, byte arg1, int arg2) {
        ++field4164;
        if (arg1 >= -110) {
            this.field4156 = 12;
        }
    }

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "(I)V", line = 16)
    public static void method1936(int arg0) {
        field4166 = null;
        int var1 = -72 % ((arg0 - -40) / 47);
    }

    @OriginalMember(owner = "client!uu", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 25)
    public class303(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field4162 = arg1;
        this.field4156 = arg6;
        this.field4161 = arg5;
        this.field4160 = arg3;
        this.field4165 = arg7;
        this.field4155 = arg4;
        this.field4163 = arg0;
        this.field4153 = arg2;
    }

    @OriginalMember(owner = "client!uu", name = "c", descriptor = "(IBI)Z", line = 40)
    public static final boolean method1937(int arg0, byte arg1, int arg2) {
        ++field4159;
        if (arg1 != 125) {
            method1940(false, (class606) null);
        }
        return (arg2 & 544) == 544 | (24 & arg2) != 0;
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(III)V", line = 53)
    public final void method1938(int arg0, int arg1, int arg2) {
        if (arg0 > 109) {
            ++field4157;
            int var4 = this.field4163 * arg2 >> 12;
            int var5 = this.field4162 * arg1 >> 12;
            int var6 = this.field4153 * arg2 >> 12;
            int var7 = this.field4160 * arg1 >> 12;
            int var8 = this.field4155 * arg2 >> 12;
            int var9 = this.field4161 * arg1 >> 12;
            int var10 = this.field4156 * arg2 >> 12;
            int var11 = this.field4165 * arg1 >> 12;
            class651.method3649(var6, var4, var7, var10, (byte) -95, var11, super.field10752, var8, var9, var5);
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(Lpt;ZB)V", line = 83)
    public static final void method1939(class558 arg0, boolean arg1, byte arg2) {
        class89.field1277.method2704(0, arg0);
        ++field4152;
        int var3 = 7 % ((58 - arg2) / 39);
        if (arg1) {
            class534.method3031(16, class312.field4256, class483.field6528, arg0, class89.field1277, class295.field4032);
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(ZLv;)I", line = 96)
    public static final int method1940(boolean arg0, class606 arg1) {
        if (arg0) {
            return 52;
        } else {
            ++field4158;
            String var2 = class480.method2753((byte) -106, arg1);
            return class333.field4511.method1164(var2, 455, class146.field2462);
        }
    }

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "(IBI)V", line = 116)
    public final void method1941(int arg0, byte arg1, int arg2) {
        int var4 = -124 % ((-62 - arg1) / 56);
        ++field4154;
    }
}
