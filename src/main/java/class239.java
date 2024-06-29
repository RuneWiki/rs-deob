import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class239 {

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "Ljava/lang/String;")
    public static String field3825 = "Cancel";

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "Z")
    public static boolean field3831 = true;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "I")
    public static int field3824;

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "I")
    public static int field3826;

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "I")
    public static int field3827;

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "I")
    public static int field3828;

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "I")
    public static int field3830;

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "Lbc;")
    public static class299 field3829;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ZILdk;Ljava/lang/String;)Lem;")
    public static final class292 method1612(boolean arg0, int arg1, class251 arg2, String arg3) {
        field3824++;
        int var4 = arg2.method1699(0, arg3);
        if (var4 == -1) {
            return new class292(0);
        }
        int var5 = 0;
        if (arg1 <= 64) {
            field3829 = null;
        }
        int[] var6 = arg2.method1688(true, var4);
        class292 var7 = new class292(var6.length);
        int var8 = 0;
        while (true) {
            while (var5 < var7.field4681) {
                class162 var9 = new class162(arg2.method1680(var6[var8++], var4, -95));
                int var10 = var9.method1157(65280);
                int var11 = var9.method1142(-18970);
                int var12 = var9.method1133((byte) 53);
                if (!arg0 && var12 == 1) {
                    var7.field4681--;
                } else {
                    var7.field4685[var5] = var10;
                    var7.field4686[var5] = new class269();
                    var7.field4686[var5].field4333 = var11;
                    var5++;
                }
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(III)V")
    public static final void method1613(int arg0, int arg1, int arg2) {
        field3830++;
        int var3 = -12 % ((-arg0 - 47) / 53);
        class175 var4 = class182.method1317(12, arg1, false);
        var4.method1279((byte) -80);
        var4.field2855 = arg2;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ZIIIZII)V")
    public static final void method1614(boolean arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field3826++;
        if (arg5 == 3) {
            method1614(true, -1, -1, -1, true, class229.field3704, arg6);
            return;
        }
        Container var7;
        if (class259.field4184 != null) {
            var7 = class259.field4184;
        } else if (class92.field1494 == null) {
            var7 = class268.field4323.field751;
        } else {
            var7 = class92.field1494;
        }
        class66.field1099 = var7.getSize().width;
        class153.field2387 = var7.getSize().height;
        if (class92.field1494 == var7) {
            Insets var8 = class92.field1494.getInsets();
            class153.field2387 -= var8.top + var8.bottom;
            class66.field1099 -= var8.right + var8.left;
        }
        if (arg5 >= 2) {
            class6.field59 = 0;
            class294.field4709 = class66.field1099;
            class310.field4964 = class153.field2387;
            class238.field3822 = 0;
        } else {
            class6.field59 = (class66.field1099 - 765) / 2;
            class238.field3822 = 0;
            class310.field4964 = 503;
            class294.field4709 = 765;
        }
        if (arg0) {
            class22.method125(class131.field2064, (byte) 3);
            class271.method1816(class131.field2064, 9938);
            if (class193.field3136 != null) {
                class193.field3136.method999(class131.field2064, (byte) -125);
            }
            class59.field973.method258((byte) -99);
            class201.method1406(class131.field2064, -119);
            class52.method360(true, class131.field2064);
            if (class193.field3136 != null) {
                class193.field3136.method1000(class131.field2064, (byte) -91);
            }
        } else {
            class131.field2064.setSize(class294.field4709, class310.field4964);
            if (class92.field1494 == var7) {
                Insets var9 = class92.field1494.getInsets();
                class131.field2064.setLocation(var9.left + class6.field59, var9.top - -class238.field3822);
            } else {
                class131.field2064.setLocation(class6.field59, class238.field3822);
            }
        }
        if (~arg5 < arg1) {
            method1614(true, -1, -1, -1, true, 0, arg6);
            return;
        }
        class103.field1660 = !class129.method918(false);
        class171.method1242(class294.field4709, class310.field4964);
        if (class22.field284 != -1) {
            class278.method1875(12, true);
        }
        if (class208.field3298 != null && (class153.field2385 == 30 || class153.field2385 == 25)) {
            class95.method659((byte) 126);
        }
        for (int var10 = 0; var10 < 100; var10++) {
            class73.field1227[var10] = true;
        }
        class32.field468 = true;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)I")
    public static final int method1615(int arg0, int arg1) {
        field3828++;
        if (arg0 < 0) {
            return 0;
        }
        class227 var2 = (class227) class1.field14.method1059(0, (long) arg0);
        if (var2 == null) {
            return class82.method568(arg0, arg1 ^ 0x63B1).field238;
        } else if (arg1 == 25524) {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field3666.length; var4++) {
                if (var2.field3666[var4] == -1) {
                    var3++;
                }
            }
            return var3 + (class82.method568(arg0, arg1 - 25519).field238 - var2.field3666.length);
        } else {
            return -27;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V")
    public static void method1616(int arg0) {
        if (arg0 != 15226) {
            field3827 = -113;
        }
        field3829 = null;
        field3825 = null;
    }
}
