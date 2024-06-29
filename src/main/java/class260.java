import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class260 extends class71 {

    @OriginalMember(owner = "client!rm", name = "B", descriptor = "I")
    public int field4150;

    @OriginalMember(owner = "client!rm", name = "z", descriptor = "I")
    public int field4148;

    @OriginalMember(owner = "client!rm", name = "u", descriptor = "I")
    public static int field4143 = 0;

    @OriginalMember(owner = "client!rm", name = "y", descriptor = "Ljava/lang/String;")
    public static String field4147 = " has logged out.";

    @OriginalMember(owner = "client!rm", name = "E", descriptor = "I")
    public static int field4153 = 0;

    @OriginalMember(owner = "client!rm", name = "A", descriptor = "I")
    public static int field4149 = 1;

    @OriginalMember(owner = "client!rm", name = "s", descriptor = "I")
    public static int field4141;

    @OriginalMember(owner = "client!rm", name = "t", descriptor = "I")
    public static int field4142;

    @OriginalMember(owner = "client!rm", name = "v", descriptor = "I")
    public static int field4144;

    @OriginalMember(owner = "client!rm", name = "w", descriptor = "I")
    public static int field4145;

    @OriginalMember(owner = "client!rm", name = "x", descriptor = "I")
    public static int field4146;

    @OriginalMember(owner = "client!rm", name = "C", descriptor = "I")
    public static int field4151;

    @OriginalMember(owner = "client!rm", name = "D", descriptor = "I")
    public static int field4152;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(ILim;Ljava/lang/String;)I", line = 9)
    public static final int method1861(int arg0, class192 arg1, String arg2) {
        field4152++;
        if (arg0 <= 28) {
            method1865(true);
        }
        int var3 = arg1.field3129;
        byte[] var4 = class227.method1655(arg2, (byte) -23);
        arg1.method1349(var4.length, 65280);
        arg1.field3129 += class147.field2198.method392(arg1.field3129, 0, var4, (byte) 8, var4.length, arg1.field3128);
        return arg1.field3129 - var3;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "([Ljava/lang/String;B[S)V", line = 29)
    public static final void method1862(String[] arg0, byte arg1, short[] arg2) {
        if (arg1 <= 84) {
            field4143 = 82;
        }
        field4151++;
        class282.method2001(0, (byte) -26, arg2, arg0, arg0.length - 1);
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(ZI)V", line = 46)
    public static final void method1863(boolean arg0, int arg1) {
        field4142++;
        class179 var2 = class319.method2220(arg1, (byte) -31, 2);
        var2.method1239(arg0);
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(I)V", line = 66)
    public static void method1864(int arg0) {
        int var1 = -84 % ((arg0 + 41) / 47);
        field4147 = null;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Z)V", line = 76)
    public static final void method1865(boolean arg0) {
        field4144++;
        if (!arg0) {
            method1863(true, -106);
        }
        for (int var1 = 0; var1 < class126.field1877; var1++) {
            int var2 = class318.field4946[var1];
            class320 var3 = class100.field1523[var2];
            int var4 = class336.field5213.method1399(-1172389784);
            if ((var4 & 0x4) != 0) {
                var4 += class336.field5213.method1399(-1172389784) << 8;
            }
            class339.method2336(var4, var2, var3, true);
        }
    }

    @OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(II)V", line = 114)
    public class260(int arg0, int arg1) {
        this.field4150 = arg0;
        this.field4148 = arg1;
    }
}
