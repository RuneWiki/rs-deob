import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class228 extends class393 {

    @OriginalMember(owner = "client!ic", name = "F", descriptor = "Ljava/lang/String;")
    public static String field3225 = "";

    @OriginalMember(owner = "client!ic", name = "H", descriptor = "[I")
    public static int[] field3227 = new int[4];

    @OriginalMember(owner = "client!ic", name = "r", descriptor = "Lwe;")
    public static class24 field3212 = new class24(64);

    @OriginalMember(owner = "client!ic", name = "m", descriptor = "I")
    public static int field3207;

    @OriginalMember(owner = "client!ic", name = "n", descriptor = "I")
    public static int field3208;

    @OriginalMember(owner = "client!ic", name = "o", descriptor = "I")
    public int field3209;

    @OriginalMember(owner = "client!ic", name = "s", descriptor = "I")
    public int field3213;

    @OriginalMember(owner = "client!ic", name = "w", descriptor = "I")
    public int field3217;

    @OriginalMember(owner = "client!ic", name = "x", descriptor = "I")
    public static int field3218;

    @OriginalMember(owner = "client!ic", name = "y", descriptor = "I")
    public int field3219;

    @OriginalMember(owner = "client!ic", name = "B", descriptor = "I")
    public static int field3221;

    @OriginalMember(owner = "client!ic", name = "C", descriptor = "I")
    public static int field3222;

    @OriginalMember(owner = "client!ic", name = "D", descriptor = "I")
    public static int field3223;

    @OriginalMember(owner = "client!ic", name = "E", descriptor = "I")
    public static int field3224;

    @OriginalMember(owner = "client!ic", name = "G", descriptor = "I")
    public int field3226;

    @OriginalMember(owner = "client!ic", name = "I", descriptor = "Lqa;")
    public static class243 field3228;

    @OriginalMember(owner = "client!ic", name = "p", descriptor = "Lro;")
    public class249 field3210;

    @OriginalMember(owner = "client!ic", name = "t", descriptor = "Lro;")
    public class249 field3214;

    @OriginalMember(owner = "client!ic", name = "z", descriptor = "Lr;")
    public static class63 field3220;

    @OriginalMember(owner = "client!ic", name = "q", descriptor = "Ljava/lang/String;")
    public String field3211;

    @OriginalMember(owner = "client!ic", name = "v", descriptor = "Z")
    public boolean field3216;

    @OriginalMember(owner = "client!ic", name = "u", descriptor = "[Ljava/lang/Object;")
    public Object[] field3215;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(Z)V")
    public static void method1413(boolean arg0) {
        field3227 = null;
        if (arg0) {
            method1414((class238) null, 121);
        }
        field3212 = null;
        field3220 = null;
        field3228 = null;
        field3225 = null;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lqj;I)V")
    public static final void method1414(class238 arg0, int arg1) {
        if (arg1 >= -105) {
            method1414((class238) null, 73);
        }
        class281.field4131 = arg0;
        field3224++;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(II)I")
    public static final int method1415(int arg0, int arg1) {
        if (arg1 != 29059) {
            field3223 = -97;
        }
        field3221++;
        return arg0 & 0x3FF;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZLqj;Lqj;Lqj;)V")
    public static final void method1416(boolean arg0, class238 arg1, class238 arg2, class238 arg3) {
        class72.field977 = arg3;
        field3218++;
        if (!arg0) {
            method1416(false, (class238) null, (class238) null, (class238) null);
        }
        class404.method2632(arg2, arg1, 0);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILil;)Llm;")
    public static final class348 method1417(int arg0, class265 arg1) {
        field3208++;
        if (arg0 != 10) {
            field3212 = null;
        }
        class348 var2 = new class348();
        var2.field5174 = arg1.method1685(8104);
        var2.field5169 = class284.method1804(var2.field5174, (byte) -105);
        return var2;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(BJ)Ljava/lang/String;")
    public static final String method1418(byte arg0, long arg1) {
        class301.field4324.setTime(new Date(arg1));
        field3207++;
        int var3 = class301.field4324.get(7);
        int var4 = class301.field4324.get(5);
        int var5 = class301.field4324.get(2);
        int var6 = class301.field4324.get(1);
        int var7 = class301.field4324.get(11);
        if (arg0 != 40) {
            method1415(-66, 127);
        }
        int var8 = class301.field4324.get(12);
        int var9 = class301.field4324.get(13);
        return class177.field2331[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class22.field357[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }
}
