import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public class class125 extends class163 {

    @OriginalMember(owner = "client!ju", name = "C", descriptor = "I")
    public static int field1308 = 0;

    @OriginalMember(owner = "client!ju", name = "G", descriptor = "I")
    public static int field1312 = -1;

    @OriginalMember(owner = "client!ju", name = "I", descriptor = "I")
    public static int field1314 = 1;

    @OriginalMember(owner = "client!ju", name = "M", descriptor = "I")
    public static int field1318 = -1;

    @OriginalMember(owner = "client!ju", name = "D", descriptor = "Ldh;")
    public static class320 field1309 = new class320(110, 6);

    @OriginalMember(owner = "client!ju", name = "F", descriptor = "I")
    public static int field1311;

    @OriginalMember(owner = "client!ju", name = "H", descriptor = "I")
    public static int field1313;

    @OriginalMember(owner = "client!ju", name = "J", descriptor = "I")
    public static int field1315;

    @OriginalMember(owner = "client!ju", name = "K", descriptor = "I")
    public static int field1316;

    @OriginalMember(owner = "client!ju", name = "L", descriptor = "I")
    public static int field1317;

    @OriginalMember(owner = "client!ju", name = "E", descriptor = "Lgt;")
    public static class454 field1310;

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(ZZZ)V")
    public static final void method797(boolean arg0, boolean arg1, boolean arg2) {
        if (arg2) {
            --class653.field9315;
            if (class653.field9315 == 0) {
                class721.field10115 = null;
            }
        }
        if (arg0) {
            --class714.field10045;
            if (~class714.field10045 == -1) {
                class32.field361 = null;
            }
        }
        ++field1317;
        if (arg1) {
            field1313 = 75;
        }
    }

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "(B)V")
    public static void method798(byte arg0) {
        if (arg0 < 82) {
            field1309 = null;
        }
        field1310 = null;
        field1309 = null;
    }

    @OriginalMember(owner = "client!ju", name = "<init>", descriptor = "(IIIIIF)V")
    public class125(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(IF)V")
    public final void method799(int arg0, float arg1) {
        super.field1814 = arg1;
        ++field1316;
        if (arg0 < 111) {
            method797(true, true, true);
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "([Ljava/lang/String;IIB)Ljava/lang/String;")
    public static final String method800(String[] arg0, int arg1, int arg2, byte arg3) {
        ++field1315;
        if (arg2 == 0) {
            return "";
        } else if (~arg2 == -2) {
            String var4 = arg0[arg1];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg1 + arg2;
            int var6 = 0;
            for (int var7 = arg1; var5 > var7; ++var7) {
                String var11 = arg0[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            if (arg3 != -39) {
                method797(true, true, true);
            }
            StringBuffer var8 = new StringBuffer(var6);
            for (int var9 = arg1; var9 < var5; ++var9) {
                String var10 = arg0[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(BIII)V")
    public final void method801(byte arg0, int arg1, int arg2, int arg3) {
        ++field1311;
        if (arg0 < 86) {
            field1310 = null;
        }
        super.field1822 = arg2;
        super.field1823 = arg1;
        super.field1820 = arg3;
    }
}
