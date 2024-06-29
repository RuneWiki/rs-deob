import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class347 {

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "Llha;")
    public class623 field4488 = new class623();

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    public static int field4482;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
    public static int field4483;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
    public static int field4484;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
    public static int field4485;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
    public static int field4486;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
    public static int field4487;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
    public static int field4489;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
    public static int field4490;

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "I")
    public static int field4491;

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "Llha;")
    private class623 field4492;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z)V")
    public final void method2062(boolean arg0) {
        while (true) {
            class623 var2 = this.field4488.field8923;
            if (this.field4488 == var2) {
                if (arg0) {
                    this.field4488 = null;
                }
                field4485++;
                this.field4492 = null;
                return;
            }
            var2.method3562((byte) -64);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "([IIII[I)V")
    public static final void method2063(int[] arg0, int arg1, int arg2, int arg3, int[] arg4) {
        field4483++;
        if (arg2 != 0 || arg3 <= arg1) {
            return;
        }
        int var5 = (arg1 + arg3) / 2;
        int var6 = arg1;
        int var7 = arg4[var5];
        arg4[var5] = arg4[arg3];
        arg4[arg3] = var7;
        int var8 = arg0[var5];
        arg0[var5] = arg0[arg3];
        arg0[arg3] = var8;
        int var9 = var7 == Integer.MAX_VALUE ? 0 : 1;
        for (int var10 = arg1; var10 < arg3; var10++) {
            if (arg4[var10] < (var7 + (var10 & var9))) {
                int var11 = arg4[var10];
                arg4[var10] = arg4[var6];
                arg4[var6] = var11;
                int var12 = arg0[var10];
                arg0[var10] = arg0[var6];
                arg0[var6++] = var12;
            }
        }
        arg4[arg3] = arg4[var6];
        arg4[var6] = var7;
        arg0[arg3] = arg0[var6];
        arg0[var6] = var8;
        method2063(arg0, arg1, 0, var6 - 1, arg4);
        method2063(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lig;I)Luca;")
    public static final class511 method2064(class244 arg0, int arg1) {
        field4482++;
        class120 var2 = class486.method2935(arg0, arg1 + 1);
        int var3 = arg0.method1476(arg1 ^ 0xFFFFFFA6);
        int var4 = arg0.method1476(-68);
        int var5 = arg0.method1476(-83);
        int var6 = arg0.method1476(-102);
        int var7 = arg0.method1476(93);
        int var8 = arg0.method1476(arg1 ^ 0x61);
        return arg1 == 0 ? new class511(var2.field1253, var2.field1245, var2.field1244, var2.field1247, var2.field1249, var2.field1250, var2.field1255, var2.field1258, var2.field1252, var3, var4, var5, var6, var7, var8) : null;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIBZJ)Ljava/lang/String;")
    public static final String method2065(int arg0, int arg1, byte arg2, boolean arg3, long arg4) {
        field4490++;
        char var6 = ',';
        char var7 = '.';
        if (arg0 == 0) {
            var6 = '.';
            var7 = ',';
        }
        if (arg0 == 2) {
            var7 = ' ';
        }
        boolean var8 = false;
        if (arg4 < 0L) {
            arg4 = -arg4;
            var8 = true;
        }
        if (arg2 != 12) {
            return null;
        }
        StringBuffer var9 = new StringBuffer(26);
        if (arg1 > 0) {
            for (int var10 = 0; var10 < arg1; var10++) {
                int var11 = (int) arg4;
                arg4 /= 10L;
                var9.append((char) (var11 + 48 - (int) arg4 * 10));
            }
            var9.append(var6);
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg4;
            arg4 /= 10L;
            var9.append((char) (var13 + 48 - ((int) arg4 * 10)));
            if (arg4 == 0L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg3) {
                var12++;
                if (var12 % 3 == 0) {
                    var9.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)Llha;")
    public final class623 method2066(int arg0) {
        if (arg0 != 0) {
            return null;
        }
        field4491++;
        class623 var2 = this.field4492;
        if (this.field4488 == var2) {
            this.field4492 = null;
            return null;
        } else {
            this.field4492 = var2.field8923;
            return var2;
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)Llha;")
    public final class623 method2067(int arg0) {
        field4489++;
        if (arg0 != 22462) {
            return null;
        }
        class623 var2 = this.field4488.field8923;
        if (this.field4488 == var2) {
            this.field4492 = null;
            return null;
        } else {
            this.field4492 = var2.field8923;
            return var2;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILlha;)V")
    public final void method2068(int arg0, class623 arg1) {
        field4486++;
        if (arg0 > -126) {
            this.method2067(36);
        }
        if (arg1.field8927 != null) {
            arg1.method3562((byte) -89);
        }
        arg1.field8923 = this.field4488;
        arg1.field8927 = this.field4488.field8927;
        arg1.field8927.field8923 = arg1;
        arg1.field8923.field8927 = arg1;
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(Z)I")
    public final int method2069(boolean arg0) {
        field4484++;
        if (arg0) {
            return -3;
        }
        int var2 = 0;
        for (class623 var3 = this.field4488.field8923; var3 != this.field4488; var3 = var3.field8923) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(I)Llha;")
    public final class623 method2070(int arg0) {
        field4487++;
        if (arg0 != -13418) {
            this.field4492 = null;
        }
        class623 var2 = this.field4488.field8923;
        if (this.field4488 == var2) {
            return null;
        } else {
            var2.method3562((byte) -86);
            return var2;
        }
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "()V")
    public class347() {
        this.field4488.field8923 = this.field4488;
        this.field4488.field8927 = this.field4488;
    }
}
