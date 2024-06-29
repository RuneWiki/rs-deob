import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class54 extends class216 {

    @OriginalMember(owner = "client!bf", name = "I", descriptor = "[Lhd;")
    public class52[] field858;

    @OriginalMember(owner = "client!bf", name = "E", descriptor = "I")
    public static int field854;

    @OriginalMember(owner = "client!bf", name = "G", descriptor = "I")
    public static int field856;

    @OriginalMember(owner = "client!bf", name = "H", descriptor = "I")
    public static int field857;

    @OriginalMember(owner = "client!bf", name = "F", descriptor = "Lda;")
    public static class143 field855;

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(Z)V", line = 8)
    public static void method382(boolean arg0) {
        field855 = null;
        if (arg0) {
            field855 = (class143) null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIIIIII)V", line = 24)
    public static final void method383(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field854++;
        if (arg3 != -3419) {
            field855 = (class143) null;
        }
        if (class12.method104(arg4, 571329488)) {
            class104.field1880 = null;
            class98.method784(arg0, arg7, arg2, class95.field1739[arg4], -1, arg1, arg8, (byte) -127, arg5, arg6);
            if (class104.field1880 != null) {
                class98.method784(arg0, arg7, arg2, class104.field1880, -1412584499, arg1, class262.field4374, (byte) -122, arg5, class180.field3104);
                class104.field1880 = null;
            }
        } else if (arg5 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class73.field1159[var9] = true;
            }
        } else {
            class73.field1159[arg5] = true;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZLbd;)V", line = 62)
    public static final void method384(boolean arg0, class162 arg1) {
        class235.method1676((byte) 119);
        class265.method1813(arg1, 0);
        if (arg0) {
            field855 = (class143) null;
        }
        field857++;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IZ)Z", line = 78)
    public final boolean method385(int arg0, boolean arg1) {
        field856++;
        if (arg1) {
            field855 = (class143) null;
        }
        return this.field858[arg0].field830;
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lda;Lda;IZ)V", line = 89)
    public class54(class143 arg0, class143 arg1, int arg2, boolean arg3) {
        class18 var5 = new class18();
        int var6 = arg0.method1121(arg2, (byte) -115);
        this.field858 = new class52[var6];
        int[] var7 = arg0.method1149(arg2, (byte) 110);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method1128(var7[var8], 0, arg2);
            int var10 = var9[1] & 0xFF | var9[0] & 0xFF << 8;
            class149 var11 = null;
            for (class149 var12 = (class149) var5.method169(105); var12 != null; var12 = (class149) var5.method165((byte) -101)) {
                if (var12.field2676 == var10) {
                    var11 = var12;
                    break;
                }
            }
            if (var11 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method1123(var10, 0, -103);
                } else {
                    var13 = arg1.method1123(0, var10, -91);
                }
                var11 = new class149(var10, var13);
                var5.method167(false, var11);
            }
            this.field858[var7[var8]] = new class52(var9, var11);
        }
    }
}
