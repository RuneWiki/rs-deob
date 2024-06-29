import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class481 {

    @OriginalMember(owner = "client!gf", name = "m", descriptor = "Lqc;")
    private class325 field7305 = new class325(64);

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "Ldda;")
    private class597 field7301;

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "[I")
    public static int[] field7294 = new int[1];

    @OriginalMember(owner = "client!gf", name = "k", descriptor = "Z")
    public static boolean field7303 = false;

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "I")
    public static int field7295;

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "I")
    public static int field7296;

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "I")
    public static int field7297;

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "I")
    public static int field7298;

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "I")
    public static int field7299;

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "I")
    public static int field7300;

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "I")
    public static int field7302;

    @OriginalMember(owner = "client!gf", name = "l", descriptor = "I")
    public static int field7304;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "[I")
    public static int[] field7293;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V", line = 3)
    public final void method2915(int arg0) {
        field7304++;
        class325 var2 = this.field7305;
        synchronized (this.field7305) {
            this.field7305.method2024((byte) -118);
        }
        int var3 = -100 % ((arg0 + 39) / 49);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Ljava/lang/String;IZ)V", line = 16)
    public static final void method2916(String arg0, int arg1, boolean arg2) {
        field7295++;
        if (arg0 == null) {
            return;
        }
        if (class103.field1309 >= 100) {
            class62.method389(class294.field4317.method2953(3181, class77.field889), 0);
            return;
        }
        String var3 = class436.method2679(arg0, -1);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < class103.field1309; var4++) {
            String var8 = class436.method2679(class446.field6551[var4], -1);
            if (var8 != null && var8.equals(var3)) {
                class62.method389(arg0 + class579.field8527.method2953(3181, class77.field889), 0);
                return;
            }
            if (class461.field6672[var4] != null) {
                String var9 = class436.method2679(class461.field6672[var4], -1);
                if (var9 != null && var9.equals(var3)) {
                    class62.method389(arg0 + class579.field8527.method2953(3181, class77.field889), 0);
                    return;
                }
            }
        }
        if (arg1 < 46) {
            return;
        }
        for (int var5 = 0; var5 < class156.field1993; var5++) {
            String var6 = class436.method2679(class417.field5994[var5], -1);
            if (var6 != null && var6.equals(var3)) {
                class62.method389(class170.field2313.method2953(3181, class77.field889) + arg0 + class1.field7.method2953(3181, class77.field889), 0);
                return;
            }
            if (class19.field177[var5] != null) {
                String var7 = class436.method2679(class19.field177[var5], -1);
                if (var7 != null && var7.equals(var3)) {
                    class62.method389(class170.field2313.method2953(3181, class77.field889) + arg0 + class1.field7.method2953(3181, class77.field889), 0);
                    return;
                }
            }
        }
        if (class436.method2679(class239.field3493.field2718, -1).equals(var3)) {
            class62.method389(class306.field4464.method2953(3181, class77.field889), 0);
            return;
        }
        class165.method1046(-3466, class74.field862);
        class549.field8178++;
        class221.field3268.method2563(-13021, class83.method488(-124, arg0) + 1);
        class221.field3268.method2580(arg0, 30127);
        class221.field3268.method2563(-13021, arg2 ? 1 : 0);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)V", line = 118)
    public static void method2917(byte arg0) {
        if (arg0 != 108) {
            field7303 = true;
        }
        field7293 = null;
        field7294 = null;
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)V", line = 129)
    public final void method2918(int arg0) {
        class325 var2 = this.field7305;
        synchronized (this.field7305) {
            this.field7305.method2037(true);
        }
        if (arg0 != -32357) {
            method2916(null, 71, false);
        }
        field7299++;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(III)I", line = 150)
    public static final int method2919(int arg0, int arg1, int arg2) {
        if (arg0 > -101) {
            field7296 = 104;
        }
        field7300++;
        int var3 = arg2 - 1 & arg1 >> 31;
        return (arg1 + (arg1 >>> 31)) % arg2 + var3;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IZ)Lcda;", line = 164)
    public final class390 method2920(int arg0, boolean arg1) {
        field7297++;
        class325 var3 = this.field7305;
        class390 var4;
        synchronized (this.field7305) {
            var4 = (class390) this.field7305.method2025((long) arg0, 2);
        }
        if (var4 != null) {
            return var4;
        }
        if (!arg1) {
            this.field7305 = null;
        }
        class597 var5 = this.field7301;
        byte[] var6;
        synchronized (this.field7301) {
            var6 = this.field7301.method3486((byte) -106, arg0, 31);
        }
        class390 var7 = new class390();
        if (var6 != null) {
            var7.method2358(new class428(var6), (byte) 81);
        }
        class325 var8 = this.field7305;
        synchronized (this.field7305) {
            this.field7305.method2029(false, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)V", line = 196)
    public final void method2921(int arg0, int arg1) {
        class325 var3 = this.field7305;
        synchronized (this.field7305) {
            if (arg0 != 1) {
                return;
            }
            this.field7305.method2028(arg1, true);
        }
        field7302++;
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(Loda;ILdda;)V", line = 215)
    public class481(class559 arg0, int arg1, class597 arg2) {
        this.field7301 = arg2;
        this.field7301.method3462(31, -125);
    }
}
