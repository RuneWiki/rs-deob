import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class222 {

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "[I")
    public static int[] field3890 = new int[200];

    @OriginalMember(owner = "client!kk", name = "g", descriptor = "Ljd;")
    public static class85 field3892 = class221.method1499("(Y", (byte) 119);

    @OriginalMember(owner = "client!kk", name = "i", descriptor = "Ljd;")
    public static class85 field3894 = class221.method1499("::qa_op_test", (byte) 112);

    @OriginalMember(owner = "client!kk", name = "h", descriptor = "I")
    public static int field3893 = 0;

    @OriginalMember(owner = "client!kk", name = "m", descriptor = "I")
    public static int field3898 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "I")
    public static int field3886;

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "I")
    public static int field3887;

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "I")
    public static int field3889;

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "I")
    public static int field3891;

    @OriginalMember(owner = "client!kk", name = "j", descriptor = "I")
    public static int field3895;

    @OriginalMember(owner = "client!kk", name = "k", descriptor = "I")
    public static int field3896;

    @OriginalMember(owner = "client!kk", name = "l", descriptor = "I")
    public static int field3897;

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field3888;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Ldg;B)V")
    public static final void method1503(class136 arg0, byte arg1) {
        field3895++;
        arg0.field2376 = false;
        if (arg0.field2375 != null) {
            arg0.field2375.field3002 = 0;
        }
        if (arg1 != 1) {
            method1507(72, (byte[]) null, 84);
        }
        for (class136 var2 = arg0.method791(); var2 != null; var2 = arg0.method780()) {
            method1503(var2, (byte) 1);
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIIII)V")
    public static final void method1504(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3896++;
        class186 var5 = (class186) class172.field2975.method1398(1, (long) arg3);
        if (var5 == null) {
            var5 = new class186();
            class172.field2975.method1393(var5, (long) arg3, 817);
        }
        if (arg4 != 0) {
            field3898 = 49;
        }
        if (arg2 >= var5.field3198.length) {
            int[] var6 = new int[arg2 + 1];
            int[] var7 = new int[arg2 + 1];
            for (int var8 = 0; var8 < var5.field3198.length; var8++) {
                var6[var8] = var5.field3198[var8];
                var7[var8] = var5.field3191[var8];
            }
            for (int var9 = var5.field3198.length; var9 < arg2; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field3198 = var6;
            var5.field3191 = var7;
        }
        var5.field3198[arg2] = arg1;
        var5.field3191[arg2] = arg0;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)V")
    public static void method1505(int arg0) {
        field3894 = null;
        int var1 = -95 % (arg0 / 57);
        field3892 = null;
        field3888 = null;
        field3890 = null;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Z)Lc;")
    public static final class103 method1506(boolean arg0) {
        class103 var1 = new class103(class251.field4331, class229.field3961, class246.field4200[0], class121.field2134[0], class30.field443[0], class244.field4165[0], class178.field3060[0], class2.field20);
        if (!arg0) {
            method1506(false);
        }
        class47.method322(-29493);
        field3891++;
        return var1;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(I[BI)I")
    public static final int method1507(int arg0, byte[] arg1, int arg2) {
        field3886++;
        if (arg2 != -17901) {
            method1509(true, (Object) null, -42);
        }
        return class184.method1265(0, arg0, 22263, arg1);
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(II)Z")
    public static final boolean method1508(int arg0, int arg1) {
        field3889++;
        if (class71.field1327[arg1]) {
            return true;
        } else if (class242.field4153.method454((byte) -24, arg1)) {
            int var2 = class242.field4153.method456(arg1, -104);
            if (var2 == 0) {
                class71.field1327[arg1] = true;
                return true;
            }
            if (class215.field3774[arg1] == null) {
                class215.field3774[arg1] = new class255[var2];
            }
            for (int var3 = arg0; var3 < var2; var3++) {
                if (class215.field3774[arg1][var3] == null) {
                    byte[] var4 = class242.field4153.method464(-1, arg1, var3);
                    if (var4 != null) {
                        class215.field3774[arg1][var3] = new class255();
                        class215.field3774[arg1][var3].field4479 = (arg1 << 16) + var3;
                        if (var4[0] == -1) {
                            class215.field3774[arg1][var3].method1762(new class247(var4), 65535);
                        } else {
                            class215.field3774[arg1][var3].method1770(false, new class247(var4));
                        }
                    }
                }
            }
            class71.field1327[arg1] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ZLjava/lang/Object;I)[B")
    public static final byte[] method1509(boolean arg0, Object arg1, int arg2) {
        field3887++;
        if (arg1 == null) {
            return null;
        } else if (arg1 instanceof byte[]) {
            byte[] var3 = (byte[]) arg1;
            return arg0 ? class116.method815(var3, true) : var3;
        } else if (arg1 instanceof class198) {
            class198 var4 = (class198) arg1;
            return var4.method106((byte) 117);
        } else {
            if (arg2 <= 59) {
                method1504(-126, -71, -117, -102, 80);
            }
            throw new IllegalArgumentException();
        }
    }
}
