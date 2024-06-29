import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class83 extends class280 {

    @OriginalMember(owner = "client!eh", name = "p", descriptor = "[I")
    public int[] field1197 = new int[1];

    @OriginalMember(owner = "client!eh", name = "y", descriptor = "[I")
    public int[] field1206 = new int[] { -1 };

    @OriginalMember(owner = "client!eh", name = "v", descriptor = "I")
    public static int field1203 = 0;

    @OriginalMember(owner = "client!eh", name = "s", descriptor = "[I")
    public static int[] field1200 = new int[128];

    @OriginalMember(owner = "client!eh", name = "u", descriptor = "[Ltd;")
    public static class74[] field1202 = new class74[50];

    @OriginalMember(owner = "client!eh", name = "r", descriptor = "[J")
    public static long[] field1199 = new long[32];

    @OriginalMember(owner = "client!eh", name = "o", descriptor = "I")
    public static int field1196;

    @OriginalMember(owner = "client!eh", name = "q", descriptor = "I")
    public static int field1198;

    @OriginalMember(owner = "client!eh", name = "t", descriptor = "I")
    public static int field1201;

    @OriginalMember(owner = "client!eh", name = "w", descriptor = "I")
    public static int field1204;

    @OriginalMember(owner = "client!eh", name = "x", descriptor = "I")
    public static int field1205;

    @OriginalMember(owner = "client!eh", name = "z", descriptor = "I")
    public static int field1207;

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(B)V")
    public static void method602(byte arg0) {
        field1200 = null;
        if (arg0 <= -69) {
            field1199 = null;
            field1202 = null;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ILqi;II)V")
    public static final void method603(int arg0, class131 arg1, int arg2, int arg3) {
        if (arg0 >= -108) {
            field1200 = null;
        }
        field1204++;
        if (class243.field3890 < 2 && class63.field941 == 0 && !class131.field2131) {
            return;
        }
        String var4 = class33.method247((byte) 123);
        if (arg1 == null) {
            int var6 = class285.field4511.method1246(var4, arg2 + 4, arg3 + 15, 16777215, 0, class210.field3364, class134.field2203);
            class194.method1440(15, arg3, arg2 + 4, -104, var6 + class285.field4511.method1257(var4));
            return;
        }
        class170 var5 = arg1.method949(26122, class92.field1384);
        if (var5 == null) {
            var5 = class285.field4511;
        }
        var5.method1248(var4, arg2, arg3, arg1.field2102, arg1.field2167, arg1.field2015, arg1.field2011, arg1.field2123, arg1.field2120, class210.field3364, class134.field2203, class230.field3716);
        class194.method1440(class230.field3716[3], class230.field3716[1], class230.field3716[0], -114, class230.field3716[2]);
    }

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "(I)V")
    public static final void method604(int arg0) {
        int var1 = 126 / ((arg0 + 4) / 34);
        field1201++;
        if (!class18.field196 && class27.field313 != 2) {
            try {
                class54.method405((byte) 112, class18.field202, "tbrefresh");
            } catch (Throwable var2) {
            }
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "([BIII)Ljava/lang/String;")
    public static final String method605(byte[] arg0, int arg1, int arg2, int arg3) {
        field1207++;
        if (arg3 < 81) {
            method606((class280) null, 125, (class280) null);
        }
        char[] var4 = new char[arg2];
        int var5 = 0;
        for (int var6 = 0; var6 < arg2; var6++) {
            int var7 = arg0[arg1 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class160.field2626[var7 - 128];
                    if (var8 == '\u0000') {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Ltj;ILtj;)V")
    public static final void method606(class280 arg0, int arg1, class280 arg2) {
        field1205++;
        if (arg0.field4463 != null) {
            arg0.method1922(-1);
        }
        arg0.field4463 = arg2.field4463;
        arg0.field4470 = arg2;
        arg0.field4463.field4470 = arg0;
        if (arg1 != 0) {
            method602((byte) -104);
        }
        arg0.field4470.field4463 = arg0;
    }
}
