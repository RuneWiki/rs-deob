import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class297 extends class435 {

    @OriginalMember(owner = "client!ed", name = "s", descriptor = "Ljava/lang/String;")
    public static String field4397 = "purple:";

    @OriginalMember(owner = "client!ed", name = "q", descriptor = "Lfg;")
    public static class18 field4395 = new class18(64);

    @OriginalMember(owner = "client!ed", name = "x", descriptor = "I")
    public static int field4402 = 0;

    @OriginalMember(owner = "client!ed", name = "w", descriptor = "[I")
    public static int[] field4401 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!ed", name = "p", descriptor = "I")
    public static int field4394;

    @OriginalMember(owner = "client!ed", name = "r", descriptor = "I")
    public static int field4396;

    @OriginalMember(owner = "client!ed", name = "t", descriptor = "I")
    public static int field4398;

    @OriginalMember(owner = "client!ed", name = "u", descriptor = "I")
    public static int field4399;

    @OriginalMember(owner = "client!ed", name = "o", descriptor = "Led;")
    public class297 field4393;

    @OriginalMember(owner = "client!ed", name = "v", descriptor = "Led;")
    public class297 field4400;

    @OriginalMember(owner = "client!ed", name = "n", descriptor = "[Z")
    public static boolean[] field4392;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lwm;Z)V")
    public static final void method2063(class298 arg0, boolean arg1) {
        if (!arg1) {
            field4402 = -81;
        }
        if (arg0.field4403 != null) {
            arg0.field4403.field2234 = 0;
        }
        field4396++;
        arg0.field4405 = false;
        for (class298 var2 = arg0.method206(); var2 != null; var2 = arg0.method183()) {
            method2063(var2, true);
        }
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)V")
    public final void method2064(int arg0) {
        field4399++;
        if (this.field4400 == null) {
            return;
        }
        this.field4400.field4393 = this.field4393;
        this.field4393.field4400 = this.field4400;
        this.field4400 = null;
        if (arg0 != 11) {
            method2063((class298) null, true);
        }
        this.field4393 = null;
    }

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "(I)V")
    public static void method2065(int arg0) {
        field4401 = null;
        field4397 = null;
        if (arg0 >= -106) {
            method2065(117);
        }
        field4392 = null;
        field4395 = null;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I[Ljava/lang/String;BI)Ljava/lang/String;")
    public static final String method2066(int arg0, String[] arg1, byte arg2, int arg3) {
        field4394++;
        if (arg3 == 0) {
            return "";
        } else if (arg3 == 1) {
            String var4 = arg1[arg0];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg0 + arg3;
            int var6 = 0;
            int var7 = -16 / ((arg2 + 20) / 62);
            for (int var8 = arg0; var8 < var5; var8++) {
                String var12 = arg1[var8];
                if (var12 == null) {
                    var6 += 4;
                } else {
                    var6 += var12.length();
                }
            }
            StringBuffer var9 = new StringBuffer(var6);
            for (int var10 = arg0; var10 < var5; var10++) {
                String var11 = arg1[var10];
                if (var11 == null) {
                    var9.append("null");
                } else {
                    var9.append(var11);
                }
            }
            return var9.toString();
        }
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(B)V")
    public static final void method2067(byte arg0) {
        class18 var1 = class63.field1013;
        synchronized (class63.field1013) {
            class63.field1013.method106((byte) -122);
        }
        field4398++;
        class18 var2 = class197.field2875;
        synchronized (class197.field2875) {
            if (arg0 != 35) {
                method2067((byte) 67);
            }
            class197.field2875.method106((byte) -126);
        }
    }
}
