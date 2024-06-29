import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qea")
public class class138 {

    @OriginalMember(owner = "client!qea", name = "c", descriptor = "Lpa;")
    private class391 field2011;

    @OriginalMember(owner = "client!qea", name = "h", descriptor = "J")
    public long field2016;

    @OriginalMember(owner = "client!qea", name = "g", descriptor = "[I")
    public static int[] field2015 = new int[64];

    @OriginalMember(owner = "client!qea", name = "b", descriptor = "I")
    public static int field2010;

    @OriginalMember(owner = "client!qea", name = "d", descriptor = "I")
    public static int field2012;

    @OriginalMember(owner = "client!qea", name = "e", descriptor = "I")
    public static int field2013;

    @OriginalMember(owner = "client!qea", name = "f", descriptor = "I")
    public static int field2014;

    @OriginalMember(owner = "client!qea", name = "i", descriptor = "I")
    public static int field2017;

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "Laj;")
    public static class333 field2009;

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(I)V", line = 8)
    public static void method1067(int arg0) {
        field2015 = null;
        if (arg0 == 0) {
            field2009 = null;
        }
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(ILjava/awt/Canvas;II)Llm;", line = 19)
    public static final class527 method1068(int arg0, Canvas arg1, int arg2, int arg3) {
        field2014++;
        try {
            Class var4 = Class.forName("c");
            class527 var5 = (class527) var4.getDeclaredConstructor().newInstance();
            if (arg2 != -128) {
                method1067(0);
            }
            var5.method708(arg2 ^ 0x5BB7, arg1, arg0, arg3);
            return var5;
        } catch (Throwable var7) {
            class86 var6 = new class86();
            var6.method708(-23497, arg1, arg0, arg3);
            return var6;
        }
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "([IBIII)V", line = 42)
    public static final void method1069(int[] arg0, byte arg1, int arg2, int arg3, int arg4) {
        arg2--;
        field2010++;
        int var9 = arg3 - 1;
        int var5 = var9 - 7;
        while (var5 > arg2) {
            int var7 = arg2 + 1;
            arg0[var7] = arg4;
            int var8 = var7 + 1;
            arg0[var8] = arg4;
            int var10 = var8 + 1;
            arg0[var10] = arg4;
            int var11 = var10 + 1;
            arg0[var11] = arg4;
            int var12 = var11 + 1;
            arg0[var12] = arg4;
            int var13 = var12 + 1;
            arg0[var13] = arg4;
            int var14 = var13 + 1;
            arg0[var14] = arg4;
            arg2 = var14 + 1;
            arg0[arg2] = arg4;
        }
        int var6 = 69 % ((24 - arg1) / 51);
        while (arg2 < var9) {
            arg2++;
            arg0[arg2] = arg4;
        }
    }

    @OriginalMember(owner = "client!qea", name = "finalize", descriptor = "()V", line = 69)
    protected final void finalize() throws Throwable {
        this.field2011.method2481(256, this.field2016);
        field2017++;
        super.finalize();
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(IIIIILha;Z)V", line = 81)
    public static final void method1070(int arg0, int arg1, int arg2, int arg3, int arg4, class65 arg5, boolean arg6) {
        if ((class351.field5154 == null || class106.field1462 == null || class705.field9890 == null) && class643.field8927.method2104(103, class740.field10216) && class643.field8927.method2104(-101, class225.field3082) && class643.field8927.method2104(110, class446.field6257)) {
            class508 var7 = class508.method2950(class643.field8927, class225.field3082, 0);
            class106.field1462 = arg5.method477(var7, true);
            var7.method2942();
            class648.field9002 = arg5.method477(var7, true);
            class351.field5154 = arg5.method477(class508.method2950(class643.field8927, class740.field10216, 0), true);
            class508 var8 = class508.method2950(class643.field8927, class446.field6257, 0);
            class705.field9890 = arg5.method477(var8, true);
            var8.method2942();
            class718.field10013 = arg5.method477(var8, true);
        }
        if (arg6) {
            method1071((byte) -95, 72);
        }
        field2013++;
        if (class351.field5154 == null || class106.field1462 == null || class705.field9890 == null) {
            return;
        }
        int var9 = (arg0 - (class705.field9890.method1107() * 2)) / class351.field5154.method1107();
        for (int var10 = 0; var10 < var9; var10++) {
            class351.field5154.method1102(arg4 + class705.field9890.method1107() + class351.field5154.method1107() * var10, -class351.field5154.method1110() + arg1 + arg3);
        }
        int var11 = ((arg1 - class705.field9890.method1110()) - arg2) / class106.field1462.method1110();
        for (int var12 = 0; var12 < var11; var12++) {
            class106.field1462.method1102(arg4, var12 * class106.field1462.method1110() + arg2 + arg3);
            class648.field9002.method1102(arg0 + arg4 - class648.field9002.method1107(), arg2 + (arg3 - -(class106.field1462.method1110() * var12)));
        }
        class705.field9890.method1102(arg4, arg1 + arg3 - class705.field9890.method1110());
        class718.field10013.method1102(arg4 + arg0 - class705.field9890.method1107(), -class705.field9890.method1110() + (arg3 - -arg1));
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(BI)Z", line = 139)
    public static final boolean method1071(byte arg0, int arg1) {
        field2012++;
        int var2 = arg0 & 0xFF;
        if (~var2 == arg1) {
            return false;
        } else {
            return var2 < 128 || var2 >= 160 || class714.field9988[var2 - 128] != '\u0000';
        }
    }

    @OriginalMember(owner = "client!qea", name = "<init>", descriptor = "(Lpa;JI)V", line = 163)
    public class138(class391 arg0, long arg1, int arg2) {
        this.field2011 = arg0;
        this.field2016 = arg1;
    }
}
