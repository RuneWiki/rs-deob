import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class65 extends class307 {

    @OriginalMember(owner = "client!om", name = "B", descriptor = "I")
    public int field1208 = 0;

    @OriginalMember(owner = "client!om", name = "I", descriptor = "I")
    public int field1215 = -1;

    @OriginalMember(owner = "client!om", name = "z", descriptor = "Lqd;")
    public static class40 field1206 = class147.method1106(")1o", (byte) -112);

    @OriginalMember(owner = "client!om", name = "F", descriptor = "Lqd;")
    public static class40 field1212 = class147.method1106(")4", (byte) -107);

    @OriginalMember(owner = "client!om", name = "X", descriptor = "[I")
    public static int[] field1229 = new int[32768];

    @OriginalMember(owner = "client!om", name = "Y", descriptor = "Lqd;")
    public static class40 field1230 = class147.method1106("::wm2", (byte) -128);

    @OriginalMember(owner = "client!om", name = "J", descriptor = "I")
    public static int field1216 = 50;

    @OriginalMember(owner = "client!om", name = "Q", descriptor = "[I")
    public static int[] field1223 = new int[field1216];

    @OriginalMember(owner = "client!om", name = "H", descriptor = "[I")
    public static int[] field1214 = new int[field1216];

    @OriginalMember(owner = "client!om", name = "L", descriptor = "[I")
    public static int[] field1218 = new int[field1216];

    @OriginalMember(owner = "client!om", name = "S", descriptor = "[Lqd;")
    public static class40[] field1225 = new class40[field1216];

    @OriginalMember(owner = "client!om", name = "O", descriptor = "[I")
    public static int[] field1221 = new int[field1216];

    @OriginalMember(owner = "client!om", name = "C", descriptor = "[I")
    public static int[] field1209 = new int[field1216];

    @OriginalMember(owner = "client!om", name = "T", descriptor = "[I")
    public static int[] field1226 = new int[field1216];

    @OriginalMember(owner = "client!om", name = "x", descriptor = "[I")
    public static int[] field1204 = new int[field1216];

    @OriginalMember(owner = "client!om", name = "w", descriptor = "I")
    public int field1203;

    @OriginalMember(owner = "client!om", name = "y", descriptor = "I")
    public int field1205;

    @OriginalMember(owner = "client!om", name = "A", descriptor = "I")
    public int field1207;

    @OriginalMember(owner = "client!om", name = "D", descriptor = "I")
    public int field1210;

    @OriginalMember(owner = "client!om", name = "E", descriptor = "I")
    public static int field1211;

    @OriginalMember(owner = "client!om", name = "G", descriptor = "I")
    public int field1213;

    @OriginalMember(owner = "client!om", name = "K", descriptor = "I")
    public int field1217;

    @OriginalMember(owner = "client!om", name = "M", descriptor = "I")
    public int field1219;

    @OriginalMember(owner = "client!om", name = "N", descriptor = "I")
    public static int field1220;

    @OriginalMember(owner = "client!om", name = "P", descriptor = "I")
    public static int field1222;

    @OriginalMember(owner = "client!om", name = "R", descriptor = "I")
    public int field1224;

    @OriginalMember(owner = "client!om", name = "U", descriptor = "I")
    public int field1227;

    @OriginalMember(owner = "client!om", name = "V", descriptor = "I")
    public int field1228;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(BILce;)Lse;", line = 38)
    public static final class11 method520(byte arg0, int arg1, class239 arg2) {
        field1220++;
        if (arg0 != -32) {
            method522(13, 74, -53);
        }
        byte[] var3 = arg2.method1674(arg1, arg0 ^ 0x1E);
        return var3 == null ? null : new class11(var3);
    }

    @OriginalMember(owner = "client!om", name = "d", descriptor = "(I)V", line = 63)
    public static void method521(int arg0) {
        field1229 = null;
        field1204 = null;
        field1212 = null;
        field1214 = null;
        if (arg0 != 0) {
            return;
        }
        field1226 = null;
        field1209 = null;
        field1206 = null;
        field1223 = null;
        field1218 = null;
        field1225 = null;
        field1221 = null;
        field1230 = null;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(III)J", line = 87)
    public static final long method522(int arg0, int arg1, int arg2) {
        class14 var3 = class93.field1690[arg0][arg1][arg2];
        return var3 == null || var3.field225 == null ? 0L : var3.field225.field338;
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(III)V", line = 109)
    public static final void method523(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class294.field4942; var3++) {
            for (int var4 = 0; var4 < class90.field1632; var4++) {
                for (int var5 = 0; var5 < class285.field4807; var5++) {
                    class14 var6 = class93.field1690[var3][var4][var5];
                    if (var6 != null) {
                        class302 var7 = var6.field235;
                        if (var7 != null && var7.field5059.method1180()) {
                            class233.method1619(var7.field5059, var3, var4, var5, 1, 1);
                            if (var7.field5066 != null && var7.field5066.method1180()) {
                                class233.method1619(var7.field5066, var3, var4, var5, 1, 1);
                                var7.field5059.method1159(var7.field5066, 0, 0, 0, false);
                                var7.field5066 = var7.field5066.method1153(arg0, arg1, arg2);
                            }
                            var7.field5059 = var7.field5059.method1153(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field216; var8++) {
                            class193 var9 = var6.field230[var8];
                            if (var9 != null && var9.field3106.method1180()) {
                                class233.method1619(var9.field3106, var3, var4, var5, var9.field3112 + 1 - var9.field3107, var9.field3115 - var9.field3108 + 1);
                                var9.field3106 = var9.field3106.method1153(arg0, arg1, arg2);
                            }
                        }
                        class102 var10 = var6.field222;
                        if (var10 != null && var10.field1790.method1180()) {
                            class86.method663(var10.field1790, var3, var4, var5);
                            var10.field1790 = var10.field1790.method1153(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }
}
