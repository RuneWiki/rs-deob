import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class295 extends class3 {

    @OriginalMember(owner = "client!em", name = "J", descriptor = "Lta;")
    public class204 field4772;

    @OriginalMember(owner = "client!em", name = "H", descriptor = "I")
    public static int field4770 = 0;

    @OriginalMember(owner = "client!em", name = "I", descriptor = "Lok;")
    public static class41 field4771 = class137.method956(":duelfriend:", 45);

    @OriginalMember(owner = "client!em", name = "L", descriptor = "Lok;")
    public static class41 field4774 = class137.method956("Lade Sprites )2 ", 45);

    @OriginalMember(owner = "client!em", name = "O", descriptor = "Lok;")
    public static class41 field4777 = class137.method956("<br>(X", 45);

    @OriginalMember(owner = "client!em", name = "K", descriptor = "I")
    public static int field4773 = 5063219;

    @OriginalMember(owner = "client!em", name = "G", descriptor = "I")
    public static int field4769;

    @OriginalMember(owner = "client!em", name = "M", descriptor = "I")
    public static int field4775;

    @OriginalMember(owner = "client!em", name = "N", descriptor = "I")
    public static int field4776;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(II[J[Ljava/lang/Object;B)V", line = 4)
    public static final void method2038(int arg0, int arg1, long[] arg2, Object[] arg3, byte arg4) {
        if (arg4 != -75) {
            method2039(53);
        }
        field4776++;
        if (arg0 >= arg1) {
            return;
        }
        int var5 = arg0;
        int var6 = (arg0 + arg1) / 2;
        long var7 = arg2[var6];
        arg2[var6] = arg2[arg1];
        arg2[arg1] = var7;
        Object var9 = arg3[var6];
        arg3[var6] = arg3[arg1];
        arg3[arg1] = var9;
        for (int var10 = arg0; var10 < arg1; var10++) {
            if (var7 + ((long) (var10 & 0x1)) > arg2[var10]) {
                long var11 = arg2[var10];
                arg2[var10] = arg2[var5];
                arg2[var5] = var11;
                Object var13 = arg3[var10];
                arg3[var10] = arg3[var5];
                arg3[var5++] = var13;
            }
        }
        arg2[arg1] = arg2[var5];
        arg2[var5] = var7;
        arg3[arg1] = arg3[var5];
        arg3[var5] = var9;
        method2038(arg0, var5 - 1, arg2, arg3, (byte) -75);
        method2038(var5 + 1, arg1, arg2, arg3, (byte) -75);
    }

    @OriginalMember(owner = "client!em", name = "f", descriptor = "(I)V", line = 63)
    public static void method2039(int arg0) {
        if (arg0 >= -75) {
            field4773 = -119;
        }
        field4777 = null;
        field4774 = null;
        field4771 = null;
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "(Lta;)V", line = 89)
    public class295(class204 arg0) {
        this.field4772 = arg0;
    }
}
