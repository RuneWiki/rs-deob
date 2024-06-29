import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public class class253 {

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "I")
    public static int field3369 = 0;

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "Z")
    public static boolean field3370 = false;

    @OriginalMember(owner = "client!wu", name = "e", descriptor = "I")
    public static int field3373;

    @OriginalMember(owner = "client!wu", name = "f", descriptor = "I")
    public static int field3374;

    @OriginalMember(owner = "client!wu", name = "c", descriptor = "Lak;")
    public static class234 field3371;

    @OriginalMember(owner = "client!wu", name = "d", descriptor = "Lob;")
    public static class521 field3372;

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(I)V", line = 4)
    public static void method1566(int arg0) {
        field3372 = null;
        if (arg0 >= -46) {
            field3371 = null;
        }
        field3371 = null;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lfq;ZLjava/lang/String;I)Ltc;", line = 18)
    public static final class236 method1567(class137 arg0, boolean arg1, String arg2, int arg3) {
        field3374++;
        if (arg3 == 0) {
            return arg0.method854((byte) 39, arg2);
        } else if (arg3 == 1) {
            try {
                class400.method2474("openjs", arg0.field1828, new Object[] { (new URL(arg0.field1828.getCodeBase(), arg2)).toString() }, true);
                class236 var4 = new class236();
                var4.field3149 = 1;
                return var4;
            } catch (Throwable var10) {
                class236 var5 = new class236();
                var5.field3149 = 2;
                return var5;
            }
        } else if (arg3 == 2) {
            try {
                arg0.field1828.getAppletContext().showDocument(new URL(arg0.field1828.getCodeBase(), arg2), "_blank");
                class236 var6 = new class236();
                var6.field3149 = 1;
                return var6;
            } catch (Exception var11) {
                class236 var7 = new class236();
                var7.field3149 = 2;
                return var7;
            }
        } else if (arg3 == 3) {
            try {
                class400.method2475(arg0.field1828, -122, "loggedout");
            } catch (Throwable var13) {
            }
            try {
                arg0.field1828.getAppletContext().showDocument(new URL(arg0.field1828.getCodeBase(), arg2), "_top");
                class236 var8 = new class236();
                var8.field3149 = 1;
                return var8;
            } catch (Exception var12) {
                class236 var9 = new class236();
                var9.field3149 = 2;
                return var9;
            }
        } else {
            if (!arg1) {
                method1569(null, 23, 97, 12, -75, 112);
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(FFIF)I", line = 96)
    public static final int method1568(float arg0, float arg1, int arg2, float arg3) {
        field3373++;
        float var4 = (arg1 < 0.0F) ? -arg1 : arg1;
        if (arg2 != 2) {
            field3370 = true;
        }
        float var5 = arg3 < 0.0F ? -arg3 : arg3;
        float var6 = (arg0 < 0.0F) ? -arg0 : arg0;
        if (var4 < var5 && var5 > var6) {
            return arg3 > 0.0F ? 0 : 1;
        } else if (var6 > var4 && var6 > var5) {
            return (arg0 > 0.0F) ? 2 : 3;
        } else if (arg1 > 0.0F) {
            return 4;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lii;IIIII)V", line = 144)
    public static final void method1569(class390 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field5643 = 0;
        for (int var6 = 0; var6 < 4; var6++) {
            if (arg0.field5642[var6] != null) {
                arg0.field5643++;
            }
        }
        label50: for (int var7 = 0; var7 < arg0.field5643; var7++) {
            long var8 = class35.field354[arg1][arg2][arg3];
            while (var8 != 0L) {
                class340 var14 = class124.field1608[(int) ((var8 & 0xFFFFL) - 1L)];
                var8 >>>= 0x10;
                if (arg0.field5642[var7] == var14.field4510) {
                    continue label50;
                }
            }
            long var10 = class35.field354[arg1][arg4][arg5];
            while (var10 != 0L) {
                class340 var13 = class124.field1608[(int) ((var10 & 0xFFFFL) - 1L)];
                var10 >>>= 0x10;
                if (arg0.field5642[var7] == var13.field4510) {
                    continue label50;
                }
            }
            for (int var12 = var7; var12 < arg0.field5643 - 1; var12++) {
                arg0.field5642[var12] = arg0.field5642[var12 + 1];
            }
            arg0.field5643--;
        }
    }
}
