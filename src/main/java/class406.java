import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public class class406 implements class695 {

    @OriginalMember(owner = "client!os", name = "c", descriptor = "I")
    public int field5727;

    @OriginalMember(owner = "client!os", name = "a", descriptor = "I")
    public static int field5725;

    @OriginalMember(owner = "client!os", name = "b", descriptor = "I")
    public static int field5726;

    @OriginalMember(owner = "client!os", name = "d", descriptor = "I")
    public static int field5728;

    @OriginalMember(owner = "client!os", name = "e", descriptor = "I")
    public static int field5729;

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(I)Lhs;")
    public final class295 method52(int arg0) {
        if (arg0 != -14151) {
            method2315(93, 21, null, (byte) 68, -108, null, -128, 126L, -25);
        }
        field5729++;
        return class22.field306;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IILfa;BILfaa;IJI)V")
    public static final void method2315(int arg0, int arg1, class212 arg2, byte arg3, int arg4, class140 arg5, int arg6, long arg7, int arg8) {
        field5725++;
        if (arg3 != 66) {
            return;
        }
        int var10 = arg1 * arg1 + arg4 * arg4;
        if (((long) var10) > arg7) {
            return;
        }
        int var11 = Math.min(arg5.field2121 / 2, arg5.field2082 / 2);
        if (var10 <= var11 * var11) {
            class317.method1941(arg0, class485.field6725[arg6], arg4, arg2, arg1, arg5, 3265, arg8);
            return;
        }
        var11 -= 10;
        int var12;
        if (class670.field9445 == 4) {
            var12 = (int) class646.field9167 & 0x3FFF;
        } else {
            var12 = (int) class646.field9167 + class156.field2356 & 0x3FFF;
        }
        int var13 = class675.field9542[var12];
        int var14 = class675.field9541[var12];
        if (class670.field9445 != 4) {
            var13 = var13 * 256 / (class455.field6362 + 256);
            var14 = var14 * 256 / (class455.field6362 + 256);
        }
        int var15 = arg1 * var13 + (arg4 * var14) >> 14;
        int var16 = arg1 * var14 - (arg4 * var13) >> 14;
        double var17 = Math.atan2((double) var15, (double) var16);
        int var19 = (int) ((double) var11 * Math.sin(var17));
        int var20 = (int) (Math.cos(var17) * (double) var11);
        class423.field5966[arg6].method2655((float) arg5.field2121 / 2.0F + (float) arg0 + (float) var19, (float) arg5.field2082 / 2.0F + (float) arg8 + (float) (-var20), 4096, (int) (-var17 / 6.283185307179586D * 65535.0D));
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(II)V")
    public static final void method2316(int arg0, int arg1) {
        if (arg0 != -12022) {
            method2315(-106, -97, null, (byte) -105, 99, null, -90, 108L, -32);
        }
        class208.field3075 = arg1;
        field5728++;
        class86.field1181 = 2;
        long var2 = 0L;
        if (class690.field9699 == null) {
            class35.method161(35, (byte) -82);
        } else {
            class96 var4 = new class96(class513.method2851(0, class532.method2942(class690.field9699, arg0 + 11923)));
            long var5 = var4.method715(true);
            class129.field1775 = var4.method715(true);
            class402.method2295(arg0 ^ 0xFFFFAA96, "", true, class170.method1166(var5, (byte) -128));
        }
    }

    @OriginalMember(owner = "client!os", name = "<init>", descriptor = "(I)V")
    public class406(int arg0) {
        this.field5727 = arg0;
    }
}
