import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class297 {

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "Lcj;")
    public static class182 field4968 = new class182(128);

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "I")
    public static volatile int field4972 = 0;

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "Lbd;")
    public static class162 field4974 = class17.method142(0, "m");

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "Lbd;")
    public static class162 field4975 = class17.method142(0, "Zugewiesener Speicher)3");

    @OriginalMember(owner = "client!wg", name = "m", descriptor = "I")
    public static int field4980 = 0;

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "[I")
    public static int[] field4976 = new int[128];

    @OriginalMember(owner = "client!wg", name = "l", descriptor = "I")
    public static int field4979 = 0;

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "I")
    public static int field4973 = -1;

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "B")
    public static byte field4971;

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "I")
    public static int field4969;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "I")
    public static int field4970;

    @OriginalMember(owner = "client!wg", name = "n", descriptor = "I")
    public static int field4981;

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "[I")
    public static int[] field4977;

    @OriginalMember(owner = "client!wg", name = "k", descriptor = "[Lpm;")
    public static class99[] field4978;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V", line = 5)
    public static final void method2034(int arg0) {
        if (class116.field2054 != null) {
            class116.field2054.method1829((byte) 4);
            class116.field2054 = null;
        }
        class202.method1506((byte) 124);
        field4969++;
        class308.method2091();
        for (int var1 = 0; var1 < 4; var1++) {
            class267.field4473[var1].method1369(16777216);
        }
        class235.method1676((byte) 93);
        System.gc();
        class78.method593(true, 2);
        class163.field2887 = -1;
        class127.field2307 = false;
        class30.method251(true, (byte) -83);
        class258.field4294 = arg0;
        class178.field3052 = 0;
        class213.field3570 = false;
        for (int var2 = 0; var2 < class149.field2679.length; var2++) {
            class149.field2679[var2] = null;
        }
        class31.field520 = 0;
        class171.field2966 = 0;
        for (int var3 = 0; var3 < 2048; var3++) {
            class270.field4520[var3] = null;
            class56.field877[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class204.field3446[var4] = null;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var6 = 0; var6 < 104; var6++) {
                for (int var7 = 0; var7 < 104; var7++) {
                    class212.field3557[var5][var6][var7] = null;
                }
            }
        }
        class97.method781(-1);
        class63.field988 = 0;
        class256.method1766(true, true);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIILrk;IJIIII)Z", line = 97)
    public static final boolean method2035(int arg0, int arg1, int arg2, int arg3, class255 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class188.method1409(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(I)V", line = 114)
    public static void method2036(int arg0) {
        field4976 = null;
        field4974 = null;
        field4978 = null;
        field4977 = null;
        if (arg0 > -101) {
            field4968 = (class182) null;
        }
        field4975 = null;
        field4968 = null;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Ljk;Lda;ZLda;)V", line = 130)
    public static final void method2037(class299 arg0, class143 arg1, boolean arg2, class143 arg3) {
        if (!arg2) {
            method2037((class299) null, (class143) null, true, (class143) null);
        }
        class301.field5010 = arg1;
        class19.field314 = arg3;
        field4981++;
        class242.field4016 = arg0;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)Ljf;", line = 149)
    public static final class42 method2038(int arg0, int arg1) {
        field4970++;
        if (arg0 > -47) {
            method2036(-18);
        }
        class42 var2 = (class42) class270.field4508.method1536((long) arg1, -91);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class64.field993.method1128(class209.method1530((byte) -80, arg1), 0, class138.method1080(false, arg1));
        class42 var4 = new class42();
        var4.field685 = arg1;
        if (var3 != null) {
            var4.method312(new class94(var3), 0);
        }
        class270.field4508.method1532((long) arg1, -66, var4);
        return var4;
    }
}
