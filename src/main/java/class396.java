import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class396 extends class453 {

    @OriginalMember(owner = "client!qj", name = "h", descriptor = "[I")
    public int[] field5990;

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "[I")
    public int[] field5989;

    @OriginalMember(owner = "client!qj", name = "i", descriptor = "I")
    public static int field5991 = -1;

    @OriginalMember(owner = "client!qj", name = "k", descriptor = "Lqu;")
    public static class219 field5993 = new class219(38, -1);

    @OriginalMember(owner = "client!qj", name = "j", descriptor = "I")
    public static int field5992;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method2555(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5992++;
        int var8 = class405.method2598(class222.field3750, class462.field7105, arg1, (byte) 78);
        int var9 = class405.method2598(class222.field3750, class462.field7105, arg4, (byte) 96);
        int var10 = class405.method2598(class460.field7096, class178.field2609, arg7, (byte) 94);
        int var11 = class405.method2598(class460.field7096, class178.field2609, arg3, (byte) 101);
        int var12 = class405.method2598(class222.field3750, class462.field7105, arg1 + arg6, (byte) 82);
        int var13 = class405.method2598(class222.field3750, class462.field7105, arg4 - arg6, (byte) 126);
        for (int var14 = var8; var14 < var12; var14++) {
            class280.method1888(var10, var11, (byte) 82, class103.field1521[var14], arg5);
        }
        if (arg0 != -1) {
            method2555(126, -121, -30, 28, 12, 14, 2, 35);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class280.method1888(var10, var11, (byte) 82, class103.field1521[var15], arg5);
        }
        int var16 = class405.method2598(class460.field7096, class178.field2609, arg6 + arg7, (byte) 125);
        int var17 = class405.method2598(class460.field7096, class178.field2609, arg3 - arg6, (byte) 108);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class103.field1521[var18];
            class280.method1888(var10, var16, (byte) 82, var19, arg5);
            class280.method1888(var16, var17, (byte) 82, var19, arg2);
            class280.method1888(var17, var11, (byte) 82, var19, arg5);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(B)V")
    public static void method2556(byte arg0) {
        if (arg0 >= -33) {
            field5993 = null;
        }
        field5993 = null;
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(II[I[I)V")
    public class396(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field5990 = arg2;
        this.field5989 = arg3;
    }
}
