import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class231 extends class103 {

    @OriginalMember(owner = "client!og", name = "s", descriptor = "Lda;")
    public class275 field4040;

    @OriginalMember(owner = "client!og", name = "t", descriptor = "I")
    public static int field4041 = 1;

    @OriginalMember(owner = "client!og", name = "r", descriptor = "[I")
    public static int[] field4039 = new int[5];

    @OriginalMember(owner = "client!og", name = "q", descriptor = "[I")
    public static int[] field4038 = new int[32];

    @OriginalMember(owner = "client!og", name = "u", descriptor = "Lda;")
    public static class275 field4042 = class255.method1672(100, " steht bereits auf Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!og", name = "p", descriptor = "I")
    public static int field4037 = 0;

    @OriginalMember(owner = "client!og", name = "v", descriptor = "I")
    public static int field4043;

    @OriginalMember(owner = "client!og", name = "w", descriptor = "I")
    public static int field4044;

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(II)V")
    public static final void method1496(int arg0, int arg1) {
        field4043++;
        class248 var2 = (class248) class118.field2125.method1871(arg0 ^ arg0, (long) arg1);
        if (var2 != null) {
            var2.method741(3);
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Z)V")
    public static void method1497(boolean arg0) {
        field4039 = null;
        field4042 = null;
        field4038 = null;
        if (!arg0) {
            method1498(32, -123, -110);
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(III)Z")
    public static final boolean method1498(int arg0, int arg1, int arg2) {
        int var3 = class1.field4[arg0][arg1][arg2];
        if (-class162.field2832 == var3) {
            return false;
        } else if (class162.field2832 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class34.method205(var4 + 1, class92.field1575[arg0][arg1][arg2], var5 + 1) && class34.method205(var4 + 128 - 1, class92.field1575[arg0][arg1 + 1][arg2], var5 + 1) && class34.method205(var4 + 128 - 1, class92.field1575[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class34.method205(var4 + 1, class92.field1575[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class1.field4[arg0][arg1][arg2] = class162.field2832;
                return true;
            } else {
                class1.field4[arg0][arg1][arg2] = -class162.field2832;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIIIIIILak;IZJ)Z")
    public static final boolean method1499(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class234 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class92.field1575 == class187.field3181;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var24 = arg2; var24 < arg2 + arg4; var24++) {
                if (var15 < 0 || var24 < 0 || var15 >= class247.field4359 || var24 >= class172.field2997) {
                    return false;
                }
                class3 var25 = class235.field4101[arg0][var15][var24];
                if (var25 != null && var25.field29 >= 5) {
                    return false;
                }
            }
        }
        class37 var16 = new class37();
        var16.field608 = arg11;
        var16.field621 = arg0;
        var16.field619 = arg5;
        var16.field606 = arg6;
        var16.field618 = arg7;
        var16.field612 = arg8;
        var16.field622 = arg9;
        var16.field616 = arg1;
        var16.field617 = arg2;
        var16.field610 = arg1 + arg3 - 1;
        var16.field604 = arg2 + arg4 - 1;
        for (int var17 = arg1; var17 < arg1 + arg3; var17++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                int var21 = 0;
                if (var17 > arg1) {
                    var21++;
                }
                if (var17 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; var22--) {
                    if (class235.field4101[var22][var17][var20] == null) {
                        class235.field4101[var22][var17][var20] = new class3(var22, var17, var20);
                    }
                }
                class3 var23 = class235.field4101[arg0][var17][var20];
                var23.field48[var23.field29] = var16;
                var23.field30[var23.field29] = var21;
                var23.field40 |= var21;
                var23.field29++;
                if (var13 && class13.field202[var17][var20] != 0) {
                    var14 = class13.field202[var17][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var18 = arg1; var18 < arg1 + arg3; var18++) {
                for (int var19 = arg2; var19 < arg2 + arg4; var19++) {
                    if (class13.field202[var18][var19] == 0) {
                        class13.field202[var18][var19] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class229.field3958[class235.field4104++] = var16;
        }
        return true;
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(III)Lkk;")
    public static final class225 method1500(int arg0, int arg1, int arg2) {
        field4044++;
        if (arg0 > -74) {
            method1496(-98, -90);
        }
        for (class225 var3 = (class225) class93.field1590.method550(-30); var3 != null; var3 = (class225) class93.field1590.method545(104)) {
            if (var3.field3804 && var3.method1457(111, arg1, arg2)) {
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "()V")
    public class231() {
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Lda;I)V")
    public class231(class275 arg0, int arg1) {
        this.field4040 = arg0;
    }
}
