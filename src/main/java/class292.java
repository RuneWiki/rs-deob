import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class292 extends class180 {

    @OriginalMember(owner = "client!nm", name = "p", descriptor = "I")
    public int field4004;

    @OriginalMember(owner = "client!nm", name = "v", descriptor = "I")
    public int field4010;

    @OriginalMember(owner = "client!nm", name = "t", descriptor = "[I")
    public static int[] field4008 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!nm", name = "o", descriptor = "I")
    public static int field4003;

    @OriginalMember(owner = "client!nm", name = "q", descriptor = "I")
    public static int field4005;

    @OriginalMember(owner = "client!nm", name = "r", descriptor = "I")
    public static int field4006;

    @OriginalMember(owner = "client!nm", name = "s", descriptor = "Ls;")
    public static class417 field4007;

    @OriginalMember(owner = "client!nm", name = "u", descriptor = "Lsn;")
    public static class7 field4009;

    @OriginalMember(owner = "client!nm", name = "w", descriptor = "[S")
    public static short[] field4011;

    @OriginalMember(owner = "client!nm", name = "x", descriptor = "[[I")
    public static int[][] field4012;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(BI)Lms;", line = 3)
    public static final class363 method1804(byte arg0, int arg1) {
        if (arg0 >= -43) {
            return null;
        }
        field4006++;
        int var2 = arg1 >> 16;
        int var3 = arg1 & 0xFFFF;
        if (class39.field666[var2] == null || class39.field666[var2][var3] == null) {
            boolean var4 = class56.method431(12449, var2);
            if (!var4) {
                return null;
            }
        }
        return class39.field666[var2][var3];
    }

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "(I)V", line = 29)
    public static void method1805(int arg0) {
        field4008 = null;
        field4007 = null;
        if (arg0 != 24790) {
            method1806((class343) null, (class35) null, (class343) null, (class343) null, (byte) 94);
        }
        field4011 = null;
        field4009 = null;
        field4012 = null;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lfc;Lln;Lfc;Lfc;B)Z", line = 56)
    public static final boolean method1806(class343 arg0, class35 arg1, class343 arg2, class343 arg3, byte arg4) {
        class137.field1947 = arg0;
        class224.field3181 = arg1;
        class347.field4752 = arg3;
        class8.field167 = arg2;
        if (arg4 == -85) {
            field4005++;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(III)Lof;", line = 77)
    public static final class367 method1807(int arg0, int arg1, int arg2) {
        class406 var3 = class455.field6293[arg0][arg1][arg2];
        return var3 == null || var3.field5621 == null ? null : var3.field5621;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(ILlk;)Lcl;", line = 85)
    public static final class214 method1808(int arg0, class425 arg1) {
        field4003++;
        arg1.method2503(true);
        int var2 = arg1.method2503(true);
        class214 var3 = class435.method2530((byte) 125, var2);
        var3.field3023 = arg1.method2503(true);
        int var4 = arg1.method2503(true);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg1.method2503(true);
            var3.method15(arg1, -125, var6);
        }
        if (arg0 >= -16) {
            return null;
        } else {
            var3.method12(27108);
            return var3;
        }
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(II)V", line = 121)
    public class292(int arg0, int arg1) {
        this.field4004 = arg1;
        this.field4010 = arg0;
    }
}
