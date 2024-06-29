import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public abstract class class251 {

    @OriginalMember(owner = "client!na", name = "b", descriptor = "I")
    public int field3194;

    @OriginalMember(owner = "client!na", name = "e", descriptor = "I")
    public int field3197;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "I")
    public int field3193;

    @OriginalMember(owner = "client!na", name = "f", descriptor = "I")
    public int field3198;

    @OriginalMember(owner = "client!na", name = "c", descriptor = "Lpi;")
    public static class340 field3195;

    @OriginalMember(owner = "client!na", name = "g", descriptor = "Z")
    public static boolean field3199;

    @OriginalMember(owner = "client!na", name = "d", descriptor = "Lnr;")
    public static class108 field3196;

    static {
        new class169("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!");
        field3195 = new class340(12, -2);
        field3199 = false;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lqa;)V", line = 9)
    public static final void method1568(class129 arg0) {
        for (int var1 = class405.field5434; var1 < class412.field5495; var1++) {
            for (int var2 = 0; var2 < class166.field2155; var2++) {
                for (int var3 = 0; var3 < class13.field230; var3++) {
                    class510 var4 = class470.field6877[var1][var2][var3];
                    if (var4 != null) {
                        class270 var5 = var4.field7499;
                        class270 var6 = var4.field7502;
                        if (var5 != null && var5.method177(5)) {
                            class138.method965(arg0, var5, var1, var2, var3, 1, 1);
                            if (var6 != null && var6.method177(5)) {
                                class138.method965(arg0, var6, var1, var2, var3, 1, 1);
                                var6.method174((byte) 91, var5, false, 0, 0, arg0, 0);
                                var6.method173((byte) -32);
                            }
                            var5.method173((byte) -32);
                        }
                        for (class319 var7 = var4.field7494; var7 != null; var7 = var7.field4102) {
                            class448 var9 = var7.field4107;
                            if (var9 != null && var9.method177(5)) {
                                class138.method965(arg0, var9, var1, var2, var3, var9.field6229 + 1 - var9.field6238, var9.field6221 - var9.field6228 + 1);
                                var9.method173((byte) -32);
                            }
                        }
                        class338 var8 = var4.field7492;
                        if (var8 != null && var8.method177(5)) {
                            class194.method1259(arg0, var8, var1, var2, var3);
                            var8.method173((byte) -32);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Z)V", line = 95)
    public static void method1569(boolean arg0) {
        if (!arg0) {
            method1568(null);
        }
        field3196 = null;
        field3195 = null;
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "(III)V", line = 122)
    public class251(int arg0, int arg1, int arg2) {
        this.field3194 = arg1;
        this.field3197 = arg0;
        while (arg2 > 1) {
            arg2 >>= 0x1;
            this.field3193++;
        }
        this.field3198 = 0x1 << this.field3193;
    }

    @OriginalMember(owner = "client!na", name = "I", descriptor = "(II)I")
    public abstract int method1187(int arg0, int arg1);

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lj;IIIIZ)Z")
    public abstract boolean method1172(class254 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!na", name = "U", descriptor = "(Lj;IIIIZ)V")
    public abstract void method1170(class254 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!na", name = "f", descriptor = "()V")
    public abstract void method1183();

    @OriginalMember(owner = "client!na", name = "JA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method1175(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!na", name = "va", descriptor = "(II)I")
    public abstract int method1185(int arg0, int arg1);

    @OriginalMember(owner = "client!na", name = "SA", descriptor = "(Lj;IIIIZ)V")
    public abstract void method1181(class254 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(III[[ZZ)V")
    public abstract void method1177(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4);

    @OriginalMember(owner = "client!na", name = "QA", descriptor = "(III)V")
    public abstract void method1182(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lve;[I)V")
    public abstract void method1186(class182 arg0, int[] arg1);

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method1176(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16);

    @OriginalMember(owner = "client!na", name = "O", descriptor = "(IILj;)Lj;")
    public abstract class254 method1180(int arg0, int arg1, class254 arg2);

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method1178(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(II)V")
    public abstract void method1174(int arg0, int arg1);
}
