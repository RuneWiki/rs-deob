import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cfa")
public class class164 implements class669 {

    @OriginalMember(owner = "client!cfa", name = "m", descriptor = "Ljava/lang/String;")
    private String field2314;

    @OriginalMember(owner = "client!cfa", name = "d", descriptor = "I")
    public static int field2305 = -1;

    @OriginalMember(owner = "client!cfa", name = "e", descriptor = "I")
    public static int field2306 = 1400;

    @OriginalMember(owner = "client!cfa", name = "h", descriptor = "I")
    public static int field2309 = -1;

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!cfa", name = "c", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!cfa", name = "f", descriptor = "I")
    public static int field2307;

    @OriginalMember(owner = "client!cfa", name = "g", descriptor = "I")
    public static int field2308;

    @OriginalMember(owner = "client!cfa", name = "i", descriptor = "I")
    public static int field2310;

    @OriginalMember(owner = "client!cfa", name = "j", descriptor = "I")
    public static int field2311;

    @OriginalMember(owner = "client!cfa", name = "k", descriptor = "I")
    public static int field2312;

    @OriginalMember(owner = "client!cfa", name = "l", descriptor = "I")
    public static int field2313;

    @OriginalMember(owner = "client!cfa", name = "n", descriptor = "Z")
    private boolean field2315;

    @OriginalMember(owner = "client!cfa", name = "b", descriptor = "[I")
    public static int[] field2303;

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(Z)Z", line = 10)
    public final boolean method1154(boolean arg0) {
        field2312++;
        if (arg0) {
            field2309 = -28;
        }
        return this.field2315;
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(FFFIFLbt;BFIII)[B", line = 23)
    public static final byte[] method1155(float arg0, float arg1, float arg2, int arg3, float arg4, class466 arg5, byte arg6, float arg7, int arg8, int arg9, int arg10) {
        int var11 = -116 / ((69 - arg6) / 55);
        field2302++;
        byte[] var12 = new byte[arg3 * arg8 * arg10];
        class17.method123(arg4, arg7, arg9, arg3, -79, arg10, arg0, arg5, arg2, 0, arg1, var12, arg8);
        return var12;
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(III)V", line = 36)
    public static final void method1156(int arg0, int arg1, int arg2) {
        field2308++;
        class489 var3 = class704.method3942(arg0, 13, 0);
        var3.method2797(arg1);
        var3.field6952 = arg2;
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(ZI)V", line = 53)
    public static final void method1157(boolean arg0, int arg1) {
        field2307++;
        class489 var2 = class704.method3942(arg1, 12, 0);
        if (arg0) {
            var2.method2799(-126);
        }
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(I)V", line = 78)
    public static void method1158(int arg0) {
        if (arg0 != -101) {
            method1156(22, 101, 85);
        }
        field2303 = null;
    }

    @OriginalMember(owner = "client!cfa", name = "b", descriptor = "(B)Lbl;", line = 88)
    public final class348 method358(byte arg0) {
        if (arg0 < 75) {
            field2305 = -17;
        }
        field2310++;
        return class348.field5156;
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(B)I", line = 99)
    public final int method360(byte arg0) {
        field2313++;
        if (arg0 != 84) {
            method1155(-0.76012206F, 0.2444146F, 0.26138523F, 112, -0.5381794F, null, (byte) 17, -0.36661878F, -91, -17, -110);
        }
        int var2 = class62.method388(true, this.field2314);
        if (var2 >= 0 && var2 <= 100) {
            return var2;
        } else {
            this.field2315 = true;
            return 100;
        }
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(BIII)V", line = 116)
    public static final void method1159(byte arg0, int arg1, int arg2, int arg3) {
        int var4 = class335.field4872.field9471 * arg1 >> 8;
        field2304++;
        if (arg3 == -1 && !class700.field9845) {
            class624.method3592(-116);
        } else if (arg3 != -1 && (class443.field6426 != arg3 || !class678.method3812(-30990)) && var4 != 0 && !class700.field9845) {
            class314.method1953(class18.field360, arg3, false, arg2, 0, var4, false);
            class613.method3488(arg0 ^ 0xFFFFBC1B);
        }
        if (class443.field6426 != arg3) {
            class125.field1829 = null;
        }
        class443.field6426 = arg3;
        if (arg0 != -120) {
            method1158(89);
        }
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(IIII)V", line = 145)
    public static final void method1160(int arg0, int arg1, int arg2, int arg3) {
        field2311++;
        String var4 = "tele " + arg2 + "," + (arg1 >> 6) + "," + (arg3 >> 6) + "," + (arg1 & 0x3F) + "," + (arg3 & 0x3F);
        if (arg0 >= 56) {
            System.out.println(var4);
            class640.method3648(true, false, var4, -92);
        }
    }

    @OriginalMember(owner = "client!cfa", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 161)
    public class164(String arg0) {
        this.field2314 = arg0;
    }
}
