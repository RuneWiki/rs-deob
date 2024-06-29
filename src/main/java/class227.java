import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class227 {

    @OriginalMember(owner = "client!eg", name = "j", descriptor = "Z")
    public boolean field3760 = false;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "[I")
    public static int[] field3751 = new int[256];

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "I")
    public static int field3754 = 0;

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "Laf;")
    public static class68 field3757 = new class68(30);

    @OriginalMember(owner = "client!eg", name = "o", descriptor = "I")
    public static int field3765 = 0;

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "I")
    public int field3752;

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "I")
    public static int field3753;

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "I")
    public static int field3755;

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "I")
    public static int field3756;

    @OriginalMember(owner = "client!eg", name = "i", descriptor = "I")
    public static int field3759;

    @OriginalMember(owner = "client!eg", name = "k", descriptor = "I")
    public static int field3761;

    @OriginalMember(owner = "client!eg", name = "l", descriptor = "I")
    public static int field3762;

    @OriginalMember(owner = "client!eg", name = "m", descriptor = "I")
    public static int field3763;

    @OriginalMember(owner = "client!eg", name = "n", descriptor = "I")
    public int field3764;

    @OriginalMember(owner = "client!eg", name = "h", descriptor = "Lqh;")
    public static class201 field3758;

    @OriginalMember(owner = "client!eg", name = "p", descriptor = "[[[B")
    public static byte[][][] field3766;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Log;II)V")
    public final void method1596(class221 arg0, int arg1, int arg2) {
        if (arg2 != -1) {
            return;
        }
        field3753++;
        while (true) {
            int var4 = arg0.method1517((byte) -96);
            if (var4 == 0) {
                return;
            }
            this.method1602(var4, arg1, 0, arg0);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IZIII)V")
    public static final void method1597(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (arg2 > arg4) {
            for (int var5 = arg4; var5 < arg2; var5++) {
                class29.field452[var5][arg3] = arg0;
            }
        } else {
            for (int var6 = arg2; var6 < arg4; var6++) {
                class29.field452[var6][arg3] = arg0;
            }
        }
        field3763++;
        if (!arg1) {
            method1601(42, 94, (String[]) null, false);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)V")
    public static void method1598(int arg0) {
        field3751 = null;
        if (arg0 == -18204) {
            field3758 = null;
            field3757 = null;
            field3766 = null;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)Lcb;")
    public final class243 method1599(int arg0, int arg1) {
        field3759++;
        if (arg1 <= 71) {
            return null;
        }
        class243 var3 = (class243) class15.field260.method480((long) (arg0 << 16 | this.field3764), 77);
        if (var3 != null) {
            return var3;
        }
        class214.field3507.method1353(-107, this.field3764);
        class243 var4 = class53.method404(class214.field3507, 0, this.field3764, 25308);
        if (var4 != null) {
            var4.method1669(class209.field3422, class128.field2065, class112.field1856);
            var4.field3736 = var4.field3740;
            var4.field3748 = var4.field3744;
            for (int var5 = 0; var5 < arg0; var5++) {
                var4.method1674();
            }
            class15.field260.method474((long) (arg0 << 16 | this.field3764), (byte) 47, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(I)Ljava/lang/String;")
    public static final String method1600(int arg0) {
        if (arg0 < 70) {
            method1598(58);
        }
        field3762++;
        String var1;
        if (class51.field894 == 1 && class205.field3291 < 2) {
            var1 = class200.field3193 + class154.field2487 + class197.field3152 + " ->";
        } else if (class288.field4560 && class205.field3291 < 2) {
            var1 = class154.field2496 + class154.field2487 + class149.field2403 + " ->";
        } else if (class183.field2869 && class73.field1193[81] && class205.field3291 > 2) {
            var1 = class141.method978(-102, class205.field3291 - 2);
        } else {
            var1 = class141.method978(-87, class205.field3291 - 1);
        }
        if (class205.field3291 > 2) {
            var1 = var1 + "<col=ffffff> / " + (class205.field3291 - 2) + class78.field1245;
        }
        return var1;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(II[Ljava/lang/String;Z)Ljava/lang/String;")
    public static final String method1601(int arg0, int arg1, String[] arg2, boolean arg3) {
        field3761++;
        if (arg1 == 0) {
            return "";
        } else if (arg1 == 1) {
            String var4 = arg2[arg0];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = 0;
            int var6 = arg0 + arg1;
            for (int var7 = arg0; var7 < var6; var7++) {
                String var11 = arg2[var7];
                if (var11 == null) {
                    var5 += 4;
                } else {
                    var5 += var11.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var5);
            if (!arg3) {
                field3758 = null;
            }
            for (int var9 = arg0; var9 < var6; var9++) {
                String var10 = arg2[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIILog;)V")
    private final void method1602(int arg0, int arg1, int arg2, class221 arg3) {
        if (arg2 != 0) {
            this.method1596((class221) null, 75, 41);
        }
        field3755++;
        if (arg0 == 1) {
            this.field3764 = arg3.method1521((byte) 113);
        } else if (arg0 == 2) {
            this.field3752 = arg3.method1531(65280);
        } else if (arg0 == 3) {
            this.field3760 = true;
            return;
        } else if (arg0 == 4) {
            this.field3764 = -1;
            return;
        }
    }
}
