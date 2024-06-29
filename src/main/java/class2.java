import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public abstract class class2 {

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "Z")
    public static boolean field24 = false;

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "Z")
    public static boolean field26 = false;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "I")
    public static int field27;

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lwm;B)I", line = 5)
    public static final int method17(class298 arg0, byte arg1) {
        field25++;
        if (arg0.field4271 == 0) {
            return 0;
        }
        if (arg0.field4330 != -1 && arg0.field4330 < 32768) {
            class43 var2 = class306.field4496[arg0.field4330];
            if (var2 != null) {
                int var3 = arg0.field740 - var2.field740;
                int var4 = arg0.field734 - var2.field734;
                if (var3 != 0 || var4 != 0) {
                    arg0.method2041(22036, (int) (Math.atan2((double) var3, (double) var4) * 2607.5945876176133D) & 0x3FFF);
                }
            }
        }
        if (arg1 > -85) {
            method18(-78, -30, -3, 82, -106, (byte) -5, 118, 41);
        }
        if (arg0.field4330 >= 32768) {
            int var5 = arg0.field4330 - 32768;
            if (class272.field3950 == var5) {
                var5 = 2047;
            }
            class25 var6 = class206.field2777[var5];
            if (var6 != null) {
                int var7 = arg0.field740 - var6.field740;
                int var8 = arg0.field734 - var6.field734;
                if (var7 != 0 || var8 != 0) {
                    arg0.method2041(22036, (int) (Math.atan2((double) var7, (double) var8) * 2607.5945876176133D) & 0x3FFF);
                }
            }
        }
        if ((arg0.field4275 != 0 || arg0.field4320 != 0) && (arg0.field4369 == 0 || arg0.field4358 > 0)) {
            int var9 = arg0.field740 - (arg0.field4275 - class7.field138 - class7.field138) * 64;
            int var10 = arg0.field734 - (arg0.field4320 - class200.field2660 - class200.field2660) * 64;
            if (var9 != 0 || var10 != 0) {
                arg0.method2041(22036, (int) (Math.atan2((double) var9, (double) var10) * 2607.5945876176133D) & 0x3FFF);
            }
            arg0.field4320 = 0;
            arg0.field4275 = 0;
        }
        return arg0.method2042(true);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIIIBII)V", line = 84)
    public static final void method18(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        field23++;
        int var8 = arg4 - arg2;
        int var9 = arg2 + arg7;
        for (int var10 = arg7; var10 < var9; var10++) {
            class207.method1221((byte) -123, arg3, arg0, class384.field5560[var10], arg6);
        }
        for (int var11 = arg4; var11 > var8; var11--) {
            class207.method1221((byte) -128, arg3, arg0, class384.field5560[var11], arg6);
        }
        int var12 = arg2 + arg3;
        int var13 = arg0 - arg2;
        for (int var14 = var9; var14 <= var8; var14++) {
            int[] var15 = class384.field5560[var14];
            class207.method1221((byte) -124, arg3, var12, var15, arg6);
            class207.method1221((byte) -128, var12, var13, var15, arg1);
            class207.method1221((byte) -125, var13, arg0, var15, arg6);
        }
        if (arg5 != -76) {
            method17((class298) null, (byte) -52);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Llm;ILlm;)V", line = 136)
    public static final void method19(class347 arg0, int arg1, class347 arg2) {
        field27++;
        class117.field1645 = arg0;
        class9.field157 = arg2;
        class9.field157.method2272(arg1 + 59, arg1);
    }
}
