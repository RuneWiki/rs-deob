import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class81 extends class334 {

    @OriginalMember(owner = "client!qh", name = "H", descriptor = "I")
    public static int field1197 = 0;

    @OriginalMember(owner = "client!qh", name = "J", descriptor = "Lin;")
    public static class380 field1199 = new class380(5, 20);

    @OriginalMember(owner = "client!qh", name = "L", descriptor = "I")
    public static int field1201 = 0;

    @OriginalMember(owner = "client!qh", name = "N", descriptor = "[Z")
    public static boolean[] field1203 = new boolean[5];

    @OriginalMember(owner = "client!qh", name = "E", descriptor = "I")
    public static int field1194;

    @OriginalMember(owner = "client!qh", name = "F", descriptor = "I")
    public static int field1195;

    @OriginalMember(owner = "client!qh", name = "G", descriptor = "I")
    public static int field1196;

    @OriginalMember(owner = "client!qh", name = "I", descriptor = "I")
    public static int field1198;

    @OriginalMember(owner = "client!qh", name = "K", descriptor = "I")
    public static int field1200;

    @OriginalMember(owner = "client!qh", name = "O", descriptor = "I")
    public static int field1204;

    @OriginalMember(owner = "client!qh", name = "M", descriptor = "[I")
    public static int[] field1202;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(II)[I", line = 3)
    public final int[] method28(int arg0, int arg1) {
        if (arg1 == -22563988) {
            field1200++;
            return class295.field4296;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I[II[II)V", line = 14)
    public static final void method716(int arg0, int[] arg1, int arg2, int[] arg3, int arg4) {
        if (arg2 < arg0) {
            int var5 = (arg0 + arg2) / 2;
            int var6 = arg2;
            int var7 = arg3[var5];
            arg3[var5] = arg3[arg0];
            arg3[arg0] = var7;
            int var8 = arg1[var5];
            arg1[var5] = arg1[arg0];
            arg1[arg0] = var8;
            int var9 = ~var7 == Integer.MIN_VALUE ? 0 : 1;
            for (int var10 = arg2; var10 < arg0; var10++) {
                if (arg3[var10] < ((var10 & var9) + var7)) {
                    int var11 = arg3[var10];
                    arg3[var10] = arg3[var6];
                    arg3[var6] = var11;
                    int var12 = arg1[var10];
                    arg1[var10] = arg1[var6];
                    arg1[var6++] = var12;
                }
            }
            arg3[arg0] = arg3[var6];
            arg3[var6] = var7;
            arg1[arg0] = arg1[var6];
            arg1[var6] = var8;
            method716(var6 - 1, arg1, arg2, arg3, arg4);
            method716(arg0, arg1, var6 + 1, arg3, Integer.MIN_VALUE);
        }
        if (arg4 != Integer.MIN_VALUE) {
            method718(90);
        }
        field1194++;
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "()V", line = 70)
    public class81() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Z)Ljava/lang/String;", line = 77)
    public static final String method717(boolean arg0) {
        field1195++;
        String var1 = "www";
        if (class547.field7574 == class145.field2353) {
            var1 = "www-wtrc";
        } else if (class210.field3079 == class145.field2353) {
            var1 = "www-wtqa";
        } else if (class145.field2353 == class121.field2060) {
            var1 = "www-wtwip";
        }
        if (arg0) {
            method718(-71);
        }
        String var2 = "";
        if (class121.field2061 != null) {
            var2 = "/p=" + class121.field2061;
        }
        return "http://" + var1 + "." + class113.field1647.field479 + ".com/l=" + class423.field5892 + "/a=" + class276.field3953 + var2 + "/";
    }

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "(I)V", line = 115)
    public static void method718(int arg0) {
        field1203 = null;
        field1199 = null;
        int var1 = 115 / ((11 - arg0) / 37);
        field1202 = null;
    }
}
