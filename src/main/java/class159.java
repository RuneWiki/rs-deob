import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class159 {

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "[I")
    public static int[] field2350 = new int[500];

    @OriginalMember(owner = "client!bj", name = "m", descriptor = "Lki;")
    public static class498 field2356 = new class498(32, -1);

    @OriginalMember(owner = "client!bj", name = "n", descriptor = "I")
    public static int field2357 = 0;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "I")
    public static int field2344;

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "I")
    public static int field2345;

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "I")
    public static int field2351;

    @OriginalMember(owner = "client!bj", name = "l", descriptor = "I")
    public static int field2355;

    @OriginalMember(owner = "client!bj", name = "j", descriptor = "Lic;")
    public static class491 field2353;

    @OriginalMember(owner = "client!bj", name = "k", descriptor = "[B")
    public byte[] field2354;

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "[I")
    public static int[] field2348;

    @OriginalMember(owner = "client!bj", name = "i", descriptor = "[I")
    public static int[] field2352;

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "[S")
    public short[] field2346;

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "[S")
    public short[] field2347;

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "[S")
    public short[] field2349;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;II)V", line = 10)
    public static final void method1013(String arg0, int arg1, String arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        field2355++;
        int var8 = -50 % ((arg3 + 42) / 41);
        for (int var9 = 99; var9 > 0; var9--) {
            class227.field3365[var9] = class227.field3365[var9 - 1];
            class93.field1380[var9] = class93.field1380[var9 - 1];
            class226.field3326[var9] = class226.field3326[var9 - 1];
            class392.field5898[var9] = class392.field5898[var9 - 1];
            class162.field2365[var9] = class162.field2365[var9 - 1];
            class227.field3364[var9] = class227.field3364[var9 - 1];
            class207.field2959[var9] = class207.field2959[var9 - 1];
        }
        class227.field3365[0] = arg1;
        class93.field1380[0] = arg7;
        class226.field3326[0] = arg5;
        class392.field5898[0] = arg4;
        class162.field2365[0] = arg0;
        class227.field3364[0] = arg2;
        class68.field1039++;
        class207.field2959[0] = arg6;
        class491.field7283 = class99.field1453;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V", line = 46)
    public static void method1014(int arg0) {
        field2348 = null;
        field2350 = null;
        if (arg0 != 29988) {
            field2357 = -38;
        }
        field2352 = null;
        field2353 = null;
        field2356 = null;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(ZB)V", line = 62)
    public static final void method1015(boolean arg0, byte arg1) {
        if (arg1 > 31) {
            class485.method2877(arg0, (byte) 122, class4.field57, class6.field79, class116.field1743);
            field2345++;
        }
    }
}
