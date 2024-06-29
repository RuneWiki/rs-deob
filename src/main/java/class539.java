import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bea")
public class class539 {

    @OriginalMember(owner = "client!bea", name = "b", descriptor = "Lcb;")
    public static class631 field7698 = new class631(30, 2);

    @OriginalMember(owner = "client!bea", name = "e", descriptor = "Lwk;")
    public static class430 field7701 = new class430(6, 4);

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "I")
    public static int field7697;

    @OriginalMember(owner = "client!bea", name = "c", descriptor = "I")
    public static int field7699;

    @OriginalMember(owner = "client!bea", name = "d", descriptor = "I")
    public static int field7700;

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(III)I", line = 7)
    public static final int method3160(int arg0, int arg1, int arg2) {
        int var3 = (arg0 & 0x7F) * arg2 >> 7;
        field7700++;
        if (arg1 != -6022) {
            method3160(-80, 70, -30);
        }
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg0 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(IIIIIIII)V", line = 35)
    public static final void method3161(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field7697++;
        int var8 = class487.method2955(class76.field1126, class461.field6699, (byte) -87, arg5);
        int var9 = class487.method2955(class76.field1126, class461.field6699, (byte) 118, arg2);
        int var10 = class487.method2955(class184.field3102, class657.field9347, (byte) 127, arg1);
        int var11 = class487.method2955(class184.field3102, class657.field9347, (byte) -78, arg4);
        int var12 = class487.method2955(class76.field1126, class461.field6699, (byte) 87, arg5 + arg7);
        int var13 = class487.method2955(class76.field1126, class461.field6699, (byte) -102, arg2 - arg7);
        for (int var14 = var8; var14 < var12; var14++) {
            class608.method3484(class77.field1131[var14], var10, -7, arg0, var11);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class608.method3484(class77.field1131[var15], var10, arg6 - 65415, arg0, var11);
        }
        int var16 = class487.method2955(class184.field3102, class657.field9347, (byte) -122, arg1 + arg7);
        int var17 = class487.method2955(class184.field3102, class657.field9347, (byte) 85, arg4 - arg7);
        if (arg6 != 65408) {
            field7701 = null;
        }
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class77.field1131[var18];
            class608.method3484(var19, var10, -7, arg0, var16);
            class608.method3484(var19, var16, arg6 - 65415, arg3, var17);
            class608.method3484(var19, var17, -7, arg0, var11);
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(Z)V", line = 89)
    public static void method3162(boolean arg0) {
        if (arg0) {
            field7698 = null;
        }
        field7701 = null;
        field7698 = null;
    }

    @OriginalMember(owner = "client!bea", name = "toString", descriptor = "()Ljava/lang/String;", line = 100)
    public final String toString() {
        field7699++;
        throw new IllegalStateException();
    }
}
