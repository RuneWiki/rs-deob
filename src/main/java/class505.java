import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lia")
public abstract class class505 {

    @OriginalMember(owner = "client!lia", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7562 = new String[] { method3810(method3809("(_IZY")), method3810(method3809("=\u0004\u000b\u0018")), method3810(method3809("?\u0018\u0006Zo{")), method3810(method3809("?\u0018\u0006Zh{")), method3810(method3809("?\u0018\u0006Zn{")), method3810(method3809("?\u0018\u0006Zm{")) };

    @OriginalMember(owner = "client!lia", name = "g", descriptor = "I")
    public static int field7555 = -1;

    @OriginalMember(owner = "client!lia", name = "d", descriptor = "Lvn;")
    public static class330 field7559 = new class330(19, 2);

    @OriginalMember(owner = "client!lia", name = "e", descriptor = "[I")
    public static int[] field7561 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!lia", name = "b", descriptor = "I")
    public static int field7560 = 0;

    @OriginalMember(owner = "client!lia", name = "c", descriptor = "I")
    public static int field7554;

    @OriginalMember(owner = "client!lia", name = "f", descriptor = "I")
    public static int field7556;

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "I")
    public static int field7557;

    @OriginalMember(owner = "client!lia", name = "h", descriptor = "I")
    public static int field7558;

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(I)V")
    public static void method3804(int arg0) {
        try {
            field7561 = null;
            if (arg0 != 36096) {
                field7560 = 60;
            }
            field7559 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field7562[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(B)V")
    public static final void method3805(byte arg0) {
        try {
            field7558++;
            int var1 = -11 / ((12 - arg0) / 39);
            for (class537 var2 = (class537) class90.field1334.method3228(11); var2 != null; var2 = (class537) class90.field1334.method3216(true)) {
                class220 var3 = var2.field7892;
                if (var3.field3458) {
                    var2.method4173(-1);
                    var3.method1944(-115);
                } else if (class431.field6776 >= var3.field3468) {
                    var3.method1943(true, class778.field11350);
                    if (var3.field3458) {
                        var2.method4173(-1);
                    } else {
                        class146.method1340(var3, true);
                    }
                }
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field7562[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lia", name = "b", descriptor = "(I)V")
    public static final void method3806(int arg0) {
        try {
            field7557++;
            try {
                if (class516.field7614 == 1) {
                    int var1 = class350.field5661.method1119(-6);
                    if (var1 > 0 && class350.field5661.method1132(-117)) {
                        int var2 = var1 - class458.field7069;
                        if (var2 < 0) {
                            var2 = 0;
                        }
                        class350.field5661.method1118(var2, true);
                        return;
                    }
                    class350.field5661.method1107(arg0 + 6053);
                    class350.field5661.method1106(true);
                    class609.field8766 = null;
                    class550.field8067 = null;
                    if (class787.field11509 == null) {
                        class516.field7614 = 0;
                    } else {
                        class516.field7614 = 2;
                    }
                }
                if (class516.field7614 == 3) {
                    int var3 = class350.field5661.method1119(-6);
                    if (class32.field389 > var3 && class350.field5661.method1132(-114)) {
                        int var4 = class714.field10341 + var3;
                        if (var4 > class32.field389) {
                            var4 = class32.field389;
                        }
                        class350.field5661.method1118(var4, true);
                        return;
                    }
                    class714.field10341 = 0;
                    class516.field7614 = 0;
                }
            } catch (Exception var7) {
                var7.printStackTrace();
                class350.field5661.method1107(0);
                class516.field7614 = 0;
                class550.field8070 = null;
                class609.field8766 = null;
                class787.field11509 = null;
                class550.field8067 = null;
            }
            if (arg0 != -6053) {
                method3807(null, 38, null);
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field7562[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "([II[Ljava/lang/Object;)V")
    public static final void method3807(int[] arg0, int arg1, Object[] arg2) {
        try {
            class206.method1861(arg2, 0, arg0.length + arg1, arg0, 4602);
            field7554++;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field7562[2] + (arg0 == null ? field7562[1] : field7562[0]) + ',' + arg1 + ',' + (arg2 == null ? field7562[1] : field7562[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(ILs;)V")
    public static final void method3808(int arg0, class293 arg1) {
        class740.field10902[arg0] = arg1;
    }

    @OriginalMember(owner = "client!lia", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3809(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x24);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!lia", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3810(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 83;
                    break;
                case 1:
                    var10005 = 113;
                    break;
                case 2:
                    var10005 = 103;
                    break;
                case 3:
                    var10005 = 116;
                    break;
                default:
                    var10005 = 36;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
