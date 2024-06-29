import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class208 {

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "I")
    public int field3230;

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "I")
    public int field3231;

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "I")
    public int field3229;

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "I")
    public int field3228;

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "I")
    public static int field3225 = 0;

    @OriginalMember(owner = "client!ih", name = "j", descriptor = "I")
    public static int field3233 = -1;

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "Lgb;")
    public static class149 field3232 = new class149();

    @OriginalMember(owner = "client!ih", name = "o", descriptor = "I")
    public static int field3238 = 0;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "I")
    public static int field3224;

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "I")
    public static int field3226;

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "I")
    public static int field3227;

    @OriginalMember(owner = "client!ih", name = "k", descriptor = "I")
    public static int field3234;

    @OriginalMember(owner = "client!ih", name = "l", descriptor = "I")
    public static int field3235;

    @OriginalMember(owner = "client!ih", name = "m", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!ih", name = "n", descriptor = "I")
    public static int field3237;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(BI)I")
    public static final int method1388(byte arg0, int arg1) {
        int var7 = arg1 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        field3236++;
        int var4 = var3 | var3 >>> 4;
        if (arg0 < 71) {
            field3238 = 3;
        }
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V")
    public static void method1389(int arg0) {
        if (arg0 < -9) {
            field3232 = null;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIII)V")
    public static final void method1390(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class295 var5 = class250.method1673(17, 10, arg4);
        field3237++;
        var5.method1980(1022716908);
        var5.field4626 = arg1;
        int var6 = 63 / ((-arg0 - 65) / 49);
        var5.field4632 = arg2;
        var5.field4636 = arg3;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)I")
    public static final int method1391(int arg0, String arg1, String arg2, int arg3) {
        field3234++;
        int var4 = arg2.length();
        int var5 = arg1.length();
        int var6 = 0;
        char var7 = 0;
        char var8 = 0;
        int var9 = 0;
        while ((var9 - var8) < var4 || var5 > var6 - var7) {
            if (var4 <= (var9 - var8)) {
                return -1;
            }
            if (var5 <= var6 - var7) {
                return 1;
            }
            char var23;
            if (var8 == '\u0000') {
                var23 = arg2.charAt(var9++);
            } else {
                var23 = var8;
                boolean var24 = false;
            }
            char var25;
            if (var7 == '\u0000') {
                var25 = arg1.charAt(var6++);
            } else {
                var25 = var7;
                boolean var26 = false;
            }
            var8 = class90.method716(var23, (byte) 94);
            var7 = class90.method716(var25, (byte) 84);
            char var27 = class223.method1495(-113, arg0, var23);
            char var28 = class223.method1495(-124, arg0, var25);
            if (var27 != var28 && Character.toUpperCase(var27) != Character.toUpperCase(var28)) {
                char var29 = Character.toLowerCase(var27);
                char var30 = Character.toLowerCase(var28);
                if (var29 != var30) {
                    return class151.method1020(7, var29, arg0) - class151.method1020(-49, var30, arg0);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        for (int var11 = 0; var11 < var10; var11++) {
            int var17;
            int var18;
            if (arg0 == 2) {
                var17 = var4 - var11 - 1;
                var18 = var5 - var11 - 1;
            } else {
                var18 = var11;
                var17 = var11;
            }
            char var19 = arg2.charAt(var17);
            char var20 = arg1.charAt(var18);
            if (var19 != var20 && Character.toUpperCase(var19) != Character.toUpperCase(var20)) {
                char var21 = Character.toLowerCase(var19);
                char var22 = Character.toLowerCase(var20);
                if (var21 != var22) {
                    return class151.method1020(109, var21, arg0) - class151.method1020(-92, var22, arg0);
                }
            }
        }
        int var12 = var4 - var5;
        if (var12 != 0) {
            return var12;
        }
        int var13 = 75 % ((arg3 - 16) / 38);
        for (int var14 = 0; var14 < var10; var14++) {
            char var15 = arg2.charAt(var14);
            char var16 = arg1.charAt(var14);
            if (var15 != var16) {
                return class151.method1020(-47, var15, arg0) - class151.method1020(-100, var16, arg0);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZZ)V")
    public static final void method1392(boolean arg0, boolean arg1) {
        field3226++;
        if (arg1 != class216.field3343) {
            class216.field3343 = arg1;
            class87.method700(arg0);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public static final void method1393(Component arg0, byte arg1) {
        field3235++;
        if (arg1 >= -55) {
            return;
        }
        Method var2 = class59.field941;
        if (var2 != null) {
            try {
                var2.invoke(arg0, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        arg0.addKeyListener(class258.field3955);
        arg0.addFocusListener(class258.field3955);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IB)V")
    public static final void method1394(int arg0, byte arg1) {
        field3227++;
        if (arg0 == -1 || !class103.method784(-1, arg0)) {
            return;
        }
        class188[] var2 = class261.field4006[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class188 var5 = var2[var3];
            if (var5.field2926 != null) {
                class39 var6 = new class39();
                var6.field657 = var5;
                var6.field647 = var5.field2926;
                class61.method486(-6766, 2000000, var6);
            }
        }
        int var4 = -41 / ((-arg1 - 66) / 48);
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "()V")
    public class208() {
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1395(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 >= class75.field1265 && arg6 <= class261.field4025 && class271.field4289 <= arg4 && class113.field1779 >= arg2) {
            if (arg3 == 1) {
                class65.method516(arg4, arg6, arg5, (byte) 59, arg2, arg0);
            } else {
                class132.method926(arg6, arg4, arg0, arg3, (byte) 104, arg2, arg5);
            }
        } else if (arg3 == 1) {
            class166.method1098(arg0, arg6, arg4, arg2, arg5, 2048);
        } else {
            class156.method1049(arg5, 30, arg3, arg0, arg4, arg2, arg6);
        }
        if (arg1 >= 40) {
            field3224++;
        }
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(Lih;)V")
    public class208(class208 arg0) {
        this.field3230 = arg0.field3230;
        this.field3231 = arg0.field3231;
        this.field3229 = arg0.field3229;
        this.field3228 = arg0.field3228;
    }
}
