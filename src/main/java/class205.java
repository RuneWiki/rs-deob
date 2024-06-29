import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class205 {

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "Z")
    public boolean field3246 = false;

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "I")
    public static int field3244 = 7759444;

    @OriginalMember(owner = "client!sj", name = "q", descriptor = "I")
    public static int field3256 = 0;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "I")
    public static int field3240;

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "I")
    public int field3243;

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "I")
    public static int field3245;

    @OriginalMember(owner = "client!sj", name = "h", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!sj", name = "k", descriptor = "I")
    public static int field3250;

    @OriginalMember(owner = "client!sj", name = "m", descriptor = "I")
    public static int field3252;

    @OriginalMember(owner = "client!sj", name = "n", descriptor = "I")
    public int field3253;

    @OriginalMember(owner = "client!sj", name = "o", descriptor = "I")
    public static int field3254;

    @OriginalMember(owner = "client!sj", name = "p", descriptor = "I")
    public static int field3255;

    @OriginalMember(owner = "client!sj", name = "j", descriptor = "Lug;")
    public static class253 field3249;

    @OriginalMember(owner = "client!sj", name = "l", descriptor = "Lug;")
    public static class253 field3251;

    @OriginalMember(owner = "client!sj", name = "i", descriptor = "Lvf;")
    public static class66 field3248;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Z)V", line = 9)
    public static final void method1507(boolean arg0) {
        field3254++;
        class9.field169.method1359(99);
        if (!arg0) {
            field3249 = (class253) null;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ZII)Lci;", line = 22)
    public final class201 method1508(boolean arg0, int arg1, int arg2) {
        field3252++;
        class201 var4 = (class201) class334.field5206.method1351((long) (this.field3243 | arg2 << 16 | (arg0 ? 262144 : 0)), 63);
        if (var4 != null) {
            return var4;
        }
        class10.field178.method1837(81, this.field3243);
        class201 var5 = class274.method1928(0, class10.field178, this.field3243, 118);
        if (var5 != null) {
            var5.method1487(class291.field4495, class316.field4994, class169.field2786);
            var5.field284 = var5.field297;
            var5.field289 = var5.field290;
            if (arg0) {
                var5.method1488();
            }
            for (int var6 = 0; var6 < arg2; var6++) {
                var5.method1495();
            }
            class334.field5206.method1347(var5, (long) ((arg0 ? 262144 : 0) | arg2 << 16 | this.field3243), (byte) -122);
        }
        int var7 = 51 % ((36 - arg1) / 41);
        return var5;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IZ)Ldg;", line = 58)
    public static final class185 method1509(int arg0, boolean arg1) {
        class185 var2 = (class185) class310.field4827.method1628(arg1, (long) arg0);
        field3250++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class215.field3399.method1813(arg0, 26, true);
        class185 var4 = new class185();
        if (var3 != null) {
            var4.method1360(new class6(var3), (byte) 85);
        }
        class310.field4827.method1627((byte) 97, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(B)V", line = 88)
    public static void method1510(byte arg0) {
        field3251 = null;
        if (arg0 > -33) {
            method1515(75);
        }
        field3249 = null;
        field3248 = null;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lcd;II)Ljava/lang/String;", line = 104)
    public static final String method1511(class136 arg0, int arg1, int arg2) {
        field3245++;
        if (!client.method953(arg0).method926((byte) 70, arg2) && arg0.field2112 == null) {
            return null;
        }
        if (arg1 != 1557676176) {
            field3251 = (class253) null;
        }
        if (arg0.field2140 == null || arg0.field2140.length <= arg2 || arg0.field2140[arg2] == null || arg0.field2140[arg2].trim().length() == 0) {
            return class290.field4478 ? "Hidden-" + arg2 : null;
        } else {
            return arg0.field2140[arg2];
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ILvl;II)V", line = 132)
    private final void method1512(int arg0, class6 arg1, int arg2, int arg3) {
        if (arg0 == 1) {
            this.field3243 = arg1.method39((byte) 116);
        } else if (arg0 == 2) {
            this.field3253 = arg1.method31(-22888);
        } else if (arg0 == 3) {
            this.field3246 = true;
        } else if (arg0 == 4) {
            this.field3243 = -1;
        }
        if (arg2 != -20061) {
            method1515(80);
        }
        field3247++;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)V", line = 163)
    public static final void method1513(int arg0) {
        field3241++;
        class179.field2911.method1355(false);
        if (arg0 == 0) {
            class79.field1078.method1355(false);
            class27.field395.method1355(false);
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lvl;II)V", line = 176)
    public final void method1514(class6 arg0, int arg1, int arg2) {
        if (arg1 > -57) {
            field3249 = (class253) null;
        }
        while (true) {
            int var4 = arg0.method58(-288140008);
            if (var4 == 0) {
                field3242++;
                return;
            }
            this.method1512(var4, arg0, -20061, arg2);
        }
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(I)Z", line = 199)
    public static final boolean method1515(int arg0) {
        field3240++;
        if (arg0 != 0) {
            return true;
        }
        try {
            return class204.method1503(2);
        } catch (IOException var5) {
            class153.method1114(arg0 - 32);
            return true;
        } catch (Exception var6) {
            String var3 = "T2 - " + class30.field449 + "," + class326.field5120 + "," + class68.field958 + " - " + class61.field899 + "," + (class326.field5108 + class146.field2310.field4708[0]) + "," + (class146.field2310.field4675[0] + class198.field3168) + " - ";
            for (int var4 = 0; var4 < class61.field899 && var4 < 50; var4++) {
                var3 = var3 + class111.field1544.field115[var4] + ",";
            }
            client.method949(var3, var6, 24);
            class305.method2112((byte) -57);
            return true;
        }
    }
}
