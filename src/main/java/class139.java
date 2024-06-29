import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class139 extends class276 {

    @OriginalMember(owner = "client!qc", name = "p", descriptor = "Ljava/lang/String;")
    public String field2319;

    @OriginalMember(owner = "client!qc", name = "n", descriptor = "I")
    public static int field2317 = 0;

    @OriginalMember(owner = "client!qc", name = "r", descriptor = "Ljava/lang/String;")
    public static String field2321 = "";

    @OriginalMember(owner = "client!qc", name = "t", descriptor = "[I")
    public static int[] field2323 = new int[8];

    @OriginalMember(owner = "client!qc", name = "o", descriptor = "I")
    public static int field2318;

    @OriginalMember(owner = "client!qc", name = "q", descriptor = "I")
    public static int field2320;

    @OriginalMember(owner = "client!qc", name = "s", descriptor = "I")
    public static int field2322;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I[[BLdv;)V")
    public static final void method1040(int arg0, byte[][] arg1, class83 arg2) {
        for (int var3 = 0; var3 < arg2.field1321; var3++) {
            class529.method3131(-58);
            for (int var4 = 0; var4 < class217.field3775 >> 3; var4++) {
                for (int var5 = 0; var5 < class277.field4548 >> 3; var5++) {
                    int var6 = class361.field5602[var3][var4][var5];
                    if (var6 != -1) {
                        int var7 = var6 >> 24 & 0x3;
                        if (!arg2.field1319 || var7 == 0) {
                            int var8 = (var6 & 0x7) >> 1;
                            int var9 = var6 >> 14 & 0x3FF;
                            int var10 = var6 >> 3 & 0x7FF;
                            int var11 = (var9 / 8 << 8) + var10 / 8;
                            for (int var12 = 0; var12 < class23.field328.length; var12++) {
                                if (class23.field328[var12] == var11 && arg1[var12] != null) {
                                    arg2.method599((var9 & 0x7) * 8, var7, var3, class106.field1865, class305.field4873, var4 * 8, arg0 - 1, var5 * 8, var8, (var10 & 0x7) * 8, arg1[var12]);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        field2320++;
        if (arg0 != 8) {
            field2317 = 31;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V")
    public static void method1041(int arg0) {
        field2323 = null;
        field2321 = null;
        if (arg0 != -774) {
            field2321 = null;
        }
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "()V")
    public class139() {
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class139(String arg0, int arg1) {
        this.field2319 = arg0;
    }
}
