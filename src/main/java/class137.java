import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class137 {

    @OriginalMember(owner = "client!km", name = "i", descriptor = "Lof;")
    private class328 field1886 = new class328(16);

    @OriginalMember(owner = "client!km", name = "b", descriptor = "Lmn;")
    private class162 field1879;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!km", name = "d", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!km", name = "e", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!km", name = "f", descriptor = "I")
    public static int field1883;

    @OriginalMember(owner = "client!km", name = "g", descriptor = "I")
    public static int field1884;

    @OriginalMember(owner = "client!km", name = "j", descriptor = "I")
    public static int field1887;

    @OriginalMember(owner = "client!km", name = "k", descriptor = "I")
    public static int field1888;

    @OriginalMember(owner = "client!km", name = "h", descriptor = "Lmt;")
    public static class321 field1885;

    @OriginalMember(owner = "client!km", name = "c", descriptor = "[Ltm;")
    public static class423[] field1880;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(B)V")
    public final void method835(byte arg0) {
        field1887++;
        if (arg0 > -26) {
            method837(-113);
        }
        class328 var2 = this.field1886;
        synchronized (this.field1886) {
            this.field1886.method2189(false);
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(ILcc;IIII)Luk;")
    public final class203 method836(int arg0, class123 arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 <= 61) {
            return null;
        }
        field1878++;
        class381[] var7 = null;
        class93 var8 = this.method842(0, arg3);
        if (var8.field1356 != null) {
            var7 = new class381[var8.field1356.length];
            for (int var9 = 0; var9 < var7.length; var9++) {
                class58 var10 = arg1.method772(var8.field1356[var9], (byte) 124);
                var7[var9] = new class381(var10.field934, var10.field927, var10.field925, var10.field937, var10.field938, var10.field928, var10.field933, var10.field931);
            }
        }
        return new class203(var8.field1355, var7, var8.field1352, arg5, arg2, arg4);
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(I)V")
    public static void method837(int arg0) {
        field1885 = null;
        field1880 = null;
        if (arg0 != 29) {
            field1880 = null;
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Z[BI)V")
    public static final void method838(boolean arg0, byte[] arg1, int arg2) {
        if (class512.field7610 == null) {
            class512.field7610 = new class208(20000);
        }
        if (arg2 != -9228) {
            return;
        }
        field1888++;
        class512.field7610.method1474(arg1, 0, arg1.length, (byte) -124);
        if (!arg0) {
            return;
        }
        class229.method1642((byte) -63, class512.field7610.field3193);
        class471.field7209 = new class68[class292.field4601];
        int var3 = 0;
        for (int var4 = class257.field4150; var4 <= class168.field2457; var4++) {
            class68 var5 = class54.method412(0, var4);
            if (var5 != null) {
                class471.field7209[var3++] = var5;
            }
        }
        class418.field6349 = false;
        class202.field3078 = class246.method1705((byte) 28);
        class512.field7610 = null;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(II)V")
    public final void method839(int arg0, int arg1) {
        field1881++;
        class328 var3 = this.field1886;
        synchronized (this.field1886) {
            this.field1886.method2202(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(I)Z")
    public static final boolean method840(int arg0) {
        field1882++;
        try {
            if (class174.field2565 == 2) {
                if (class167.field2443 == null) {
                    class167.field2443 = class287.method1932(class73.field1106, class503.field7532, class186.field2709);
                    if (class167.field2443 == null) {
                        return false;
                    }
                }
                if (class217.field3700 == null) {
                    class217.field3700 = new class355(class52.field704, class215.field3652);
                }
                if (class453.field7022.method394(class217.field3700, class237.field3886, class167.field2443, 22050, -1)) {
                    class453.field7022.method380(-1);
                    class453.field7022.method387((byte) -127, class170.field2489);
                    class453.field7022.method403(class328.field5138, -5126, class167.field2443);
                    class73.field1106 = null;
                    class217.field3700 = null;
                    class174.field2565 = 0;
                    class167.field2443 = null;
                    return true;
                }
            }
            int var1 = 65 / ((arg0 + 13) / 42);
        } catch (Exception var3) {
            var3.printStackTrace();
            class453.field7022.method407(128);
            class174.field2565 = 0;
            class217.field3700 = null;
            class73.field1106 = null;
            class167.field2443 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!km", name = "c", descriptor = "(I)V")
    public final void method841(int arg0) {
        class328 var2 = this.field1886;
        synchronized (this.field1886) {
            if (arg0 < 123) {
                method838(true, null, 37);
            }
            this.field1886.method2187(-1);
        }
        field1883++;
    }

    @OriginalMember(owner = "client!km", name = "<init>", descriptor = "(Lpr;ILmn;)V")
    public class137(class236 arg0, int arg1, class162 arg2) {
        this.field1879 = arg2;
        this.field1879.method1008(29, (byte) -21);
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(II)Lig;")
    private final class93 method842(int arg0, int arg1) {
        field1884++;
        class328 var3 = this.field1886;
        class93 var4;
        synchronized (this.field1886) {
            var4 = (class93) this.field1886.method2191((byte) -73, (long) arg1);
            if (arg0 != 0) {
                this.field1886 = null;
            }
        }
        if (var4 != null) {
            return var4;
        }
        class162 var5 = this.field1879;
        byte[] var6;
        synchronized (this.field1879) {
            var6 = this.field1879.method1004(29, false, arg1);
        }
        class93 var7 = new class93();
        if (var6 != null) {
            var7.method641((byte) 121, new class208(var6));
        }
        class328 var8 = this.field1886;
        synchronized (this.field1886) {
            this.field1886.method2188(-124, (long) arg1, var7);
            return var7;
        }
    }
}
