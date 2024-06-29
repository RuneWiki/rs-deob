import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cha")
public class class174 extends class627 {

    @OriginalMember(owner = "client!cha", name = "n", descriptor = "I")
    public volatile int field2272 = -1;

    @OriginalMember(owner = "client!cha", name = "m", descriptor = "Ljava/lang/String;")
    public volatile String field2271;

    @OriginalMember(owner = "client!cha", name = "j", descriptor = "Lus;")
    public static class328 field2268 = new class328(25, 12);

    @OriginalMember(owner = "client!cha", name = "k", descriptor = "I")
    public static int field2269;

    @OriginalMember(owner = "client!cha", name = "l", descriptor = "I")
    public static int field2270;

    @OriginalMember(owner = "client!cha", name = "o", descriptor = "I")
    public static int field2273;

    @OriginalMember(owner = "client!cha", name = "a", descriptor = "(B)V", line = 7)
    public static void method1076(byte arg0) {
        if (arg0 != -26) {
            method1076((byte) -19);
        }
        field2268 = null;
    }

    @OriginalMember(owner = "client!cha", name = "a", descriptor = "(I[B[[BI[I[[B[IB)I", line = 20)
    public static final int method1077(int arg0, byte[] arg1, byte[][] arg2, int arg3, int[] arg4, byte[][] arg5, int[] arg6, byte arg7) {
        field2270++;
        int var8 = arg6[arg3];
        int var9 = arg4[arg3] + var8;
        int var10 = arg6[arg0];
        int var11 = var10 + arg4[arg0];
        int var12 = var8;
        if (var10 > var8) {
            var12 = var10;
        }
        int var13 = var9;
        if (var11 < var9) {
            var13 = var11;
        }
        int var14 = arg1[arg3] & 0xFF;
        if (var14 > (arg1[arg0] & 0xFF)) {
            var14 = arg1[arg0] & 0xFF;
        }
        byte[] var15 = arg5[arg3];
        if (arg7 != -107) {
            method1077(-1, null, null, 40, null, null, null, (byte) -39);
        }
        byte[] var16 = arg2[arg0];
        int var17 = var12 - var8;
        int var18 = var12 - var10;
        for (int var19 = var12; var19 < var13; var19++) {
            int var20 = var16[var18++] + var15[var17++];
            if (var20 < var14) {
                var14 = var20;
            }
        }
        return -var14;
    }

    @OriginalMember(owner = "client!cha", name = "a", descriptor = "(Lnga;BILjava/lang/String;)Lwp;", line = 76)
    public static final class435 method1078(class256 arg0, byte arg1, int arg2, String arg3) {
        field2269++;
        if (arg2 == 0) {
            return arg0.method1563((byte) -120, arg3);
        } else if (arg2 == 1) {
            try {
                class193.method1214(class745.field10393, new Object[] { (new URL(class745.field10393.getCodeBase(), arg3)).toString() }, "openjs", (byte) -105);
                class435 var4 = new class435();
                var4.field6124 = 1;
                return var4;
            } catch (Throwable var10) {
                class435 var5 = new class435();
                var5.field6124 = 2;
                return var5;
            }
        } else if (arg2 == 2) {
            try {
                class745.field10393.getAppletContext().showDocument(new URL(class745.field10393.getCodeBase(), arg3), "_blank");
                class435 var6 = new class435();
                var6.field6124 = 1;
                return var6;
            } catch (Exception var11) {
                class435 var7 = new class435();
                var7.field6124 = 2;
                return var7;
            }
        } else {
            if (arg1 <= 12) {
                method1079(105, 36, 15, -10, false, 66, 67);
            }
            if (arg2 != 3) {
                throw new IllegalArgumentException();
            }
            try {
                class193.method1213(-13481, "loggedout", class745.field10393);
            } catch (Throwable var13) {
            }
            try {
                class745.field10393.getAppletContext().showDocument(new URL(class745.field10393.getCodeBase(), arg3), "_top");
                class435 var8 = new class435();
                var8.field6124 = 1;
                return var8;
            } catch (Exception var12) {
                class435 var9 = new class435();
                var9.field6124 = 2;
                return var9;
            }
        }
    }

    @OriginalMember(owner = "client!cha", name = "a", descriptor = "(IIIIZII)V", line = 152)
    public static final void method1079(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field2273++;
        class126[] var7 = class498.field7043;
        if (arg4) {
            field2268 = null;
        }
        for (int var8 = 0; var8 < var7.length; var8++) {
            class126 var9 = var7[var8];
            if (var9 != null && var9.field1507 == 2) {
                class411.method2438(arg1, arg0 >> 1, var9.field1508 * 2, var9.field1516, arg2, var9.field1519, var9.field1517, 103, arg6 >> 1);
                if (class681.field9310[0] > -1 && (class266.field3368 % 20) < 10) {
                    class712 var10 = class487.field6935[var9.field1512];
                    int var11 = class681.field9310[0] + arg5 - 12;
                    int var12 = class681.field9310[1] + arg3 - 28;
                    var10.method3929(var11, var12);
                    class365.method2249(true, var12 + var10.method1882(), var12, var11 + var10.method1892(), var11);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cha", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 196)
    public class174(String arg0) {
        this.field2271 = arg0;
    }
}
