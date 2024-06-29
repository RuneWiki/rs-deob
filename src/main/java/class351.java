import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hea")
public class class351 {

    @OriginalMember(owner = "client!hea", name = "f", descriptor = "S")
    public short field4740;

    @OriginalMember(owner = "client!hea", name = "b", descriptor = "B")
    public byte field4736;

    @OriginalMember(owner = "client!hea", name = "e", descriptor = "B")
    public byte field4739;

    @OriginalMember(owner = "client!hea", name = "d", descriptor = "Lut;")
    public class199 field4738;

    @OriginalMember(owner = "client!hea", name = "c", descriptor = "Lrh;")
    public static class44 field4737 = new class44();

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "I")
    public static int field4735;

    @OriginalMember(owner = "client!hea", name = "g", descriptor = "I")
    public static int field4741;

    @OriginalMember(owner = "client!hea", name = "h", descriptor = "I")
    public static int field4742;

    @OriginalMember(owner = "client!hea", name = "i", descriptor = "I")
    public static int field4743;

    @OriginalMember(owner = "client!hea", name = "j", descriptor = "I")
    public static int field4744;

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(ILnp;)Lcu;", line = 5)
    public static final class478 method2078(int arg0, class115 arg1) {
        arg1.method620((byte) 90);
        field4735++;
        if (arg0 < 123) {
            field4737 = null;
        }
        int var2 = arg1.method620((byte) 15);
        class478 var3 = class313.method1798(var2, true);
        var3.field6887 = arg1.method620((byte) -127);
        int var4 = arg1.method620((byte) 70);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg1.method620((byte) 21);
            var3.method33(255, arg1, var6);
        }
        var3.method34((byte) 23);
        return var3;
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(Lnp;I)Lmd;", line = 41)
    public static final class291 method2079(class115 arg0, int arg1) {
        field4743++;
        class176 var2 = class309.method1779(arg0, -86);
        int var3 = arg0.method631(false);
        int var4 = -36 % ((arg1 - 12) / 39);
        int var5 = arg0.method631(false);
        int var6 = arg0.method643((byte) -77);
        return new class291(var2.field1965, var2.field1962, var2.field1967, var2.field1970, var2.field1972, var2.field1971, var2.field1973, var2.field1969, var2.field1968, var3, var5, var6);
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(B)V", line = 59)
    public static void method2080(byte arg0) {
        if (arg0 != -3) {
            field4737 = null;
        }
        field4737 = null;
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V", line = 69)
    public static final void method2081(String arg0, String arg1, int arg2) {
        class533.field7494 = 1;
        field4742++;
        class445.field6273 = arg2;
        class483.method2795(19326, false, arg1, arg0);
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(I[[[Lru;)V", line = 83)
    public static final void method2082(int arg0, class499[][][] arg1) {
        for (int var2 = arg0; var2 < arg1.length; var2++) {
            class499[][] var3 = arg1[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class499 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field7230 instanceof class49) {
                            ((class49) var6.field7230).method234(-87);
                        }
                        if (var6.field7231 instanceof class49) {
                            ((class49) var6.field7231).method234(-80);
                        }
                        if (var6.field7228 instanceof class49) {
                            ((class49) var6.field7228).method234(-82);
                        }
                        if (var6.field7218 instanceof class49) {
                            ((class49) var6.field7218).method234(-54);
                        }
                        if (var6.field7223 instanceof class49) {
                            ((class49) var6.field7223).method234(-87);
                        }
                        for (class245 var7 = var6.field7215; var7 != null; var7 = var7.field3027) {
                            class613 var8 = var7.field3029;
                            if (var8 instanceof class49) {
                                ((class49) var8).method234(arg0 - 58);
                            }
                        }
                    }
                }
            }
        }
        field4744++;
    }

    @OriginalMember(owner = "client!hea", name = "<init>", descriptor = "(Lut;III)V", line = 152)
    public class351(class199 arg0, int arg1, int arg2, int arg3) {
        this.field4740 = (short) arg1;
        this.field4736 = (byte) arg3;
        this.field4739 = (byte) arg2;
        this.field4738 = arg0;
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(Z)V", line = 168)
    public static final void method2083(boolean arg0) {
        if (class203.field2404 != null) {
            class203.field2404.method3099((byte) -37);
        }
        field4741++;
        if (!arg0 || class648.field9137 == null) {
            return;
        }
        while (true) {
            try {
                class648.field9137.join();
                return;
            } catch (InterruptedException var1) {
            }
        }
    }
}
