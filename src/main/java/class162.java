import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ada")
public class class162 extends class256 {

    @OriginalMember(owner = "client!ada", name = "u", descriptor = "I")
    public int field2403;

    @OriginalMember(owner = "client!ada", name = "r", descriptor = "I")
    public int field2400;

    @OriginalMember(owner = "client!ada", name = "v", descriptor = "[Ljava/lang/String;")
    public static String[] field2404 = new String[100];

    @OriginalMember(owner = "client!ada", name = "y", descriptor = "Lqe;")
    public static class465 field2407 = new class465(28, -2);

    @OriginalMember(owner = "client!ada", name = "q", descriptor = "I")
    public static int field2399;

    @OriginalMember(owner = "client!ada", name = "s", descriptor = "I")
    public static int field2401;

    @OriginalMember(owner = "client!ada", name = "t", descriptor = "I")
    public static int field2402;

    @OriginalMember(owner = "client!ada", name = "w", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!ada", name = "x", descriptor = "[I")
    public static int[] field2406;

    @OriginalMember(owner = "client!ada", name = "p", descriptor = "[Ljava/lang/String;")
    public static String[] field2398;

    @OriginalMember(owner = "client!ada", name = "<init>", descriptor = "(Ljg;Ljha;IIIIIIIIII)V")
    public class162(class338 arg0, class692 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field2403 = arg10;
        this.field2400 = arg11;
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(I)Ljw;")
    public final class551 method930(int arg0) {
        field2399++;
        return arg0 == 17503 ? class601.field8731 : null;
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(IIIII)V")
    public static final void method1212(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2402++;
        for (int var5 = arg4; var5 < class114.field1830; var5++) {
            Rectangle var6 = class745.field10438[var5];
            if (arg3 < var6.x + var6.width && (arg3 + arg1) > var6.x && arg2 < var6.y + var6.height && var6.y < arg2 + arg0) {
                class443.field6170[var5] = true;
            }
        }
        class6.method33(true, arg2 + arg0, arg2, arg3, arg1 + arg3);
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(IILha;)V")
    public static final void method1213(int arg0, int arg1, class58 arg2) {
        field2405++;
        if (!class186.field2665 || !class491.field6993) {
            class588.field8275 = 0;
            return;
        }
        if (class86.field1558) {
            class557.field7875 = class105.field1752.method1796(-26211);
        }
        class115.field1836 = 0;
        class708.field9904 = 0;
        class503.field7188 = 0;
        int[] var3 = arg2.method547();
        class391.field5464 = (int) ((float) var3[3] / 3.0F);
        class93.field1629 = (int) ((float) var3[2] / 3.0F);
        arg2.method524(class377.field5274);
        if ((int) ((float) class377.field5274[0] / 3.0F) != class136.field2124 || ((int) ((float) class377.field5274[1] / 3.0F)) != class312.field4397) {
            class136.field2124 = (int) ((float) class377.field5274[0] / 3.0F);
            class312.field4397 = (int) ((float) class377.field5274[1] / 3.0F);
            class458.field6612 = new int[class312.field4397 * class136.field2124];
            class471.field6779 = class312.field4397 >> 1;
            class556.field7797 = class136.field2124 >> 1;
        }
        class486.field6883 = arg2.method612();
        class588.field8275 = 0;
        for (int var4 = 0; var4 < class93.field1622; var4++) {
            class70.method718(class633.field9066[var4], (byte) 105, arg2, arg0);
        }
        if (arg1 != 32036) {
            method1212(-17, -12, 98, -75, 57);
        }
        for (int var5 = 0; var5 < class522.field7393; var5++) {
            class70.method718(class467.field6737[var5], (byte) 105, arg2, arg0);
        }
        for (int var6 = 0; var6 < class650.field9180; var6++) {
            class70.method718(class27.field380[var6], (byte) 105, arg2, arg0);
        }
        class671.field9405 = 0;
        if (class588.field8275 > 0) {
            int var7 = class458.field6612.length;
            int var8 = var7 - var7 & 0x7;
            int var9 = 0;
            while (var8 > var9) {
                class458.field6612[var9++] = Integer.MAX_VALUE;
                class458.field6612[var9++] = Integer.MAX_VALUE;
                class458.field6612[var9++] = Integer.MAX_VALUE;
                class458.field6612[var9++] = Integer.MAX_VALUE;
                class458.field6612[var9++] = Integer.MAX_VALUE;
                class458.field6612[var9++] = Integer.MAX_VALUE;
                class458.field6612[var9++] = Integer.MAX_VALUE;
                class458.field6612[var9++] = Integer.MAX_VALUE;
            }
            while (var7 > var9) {
                class458.field6612[var9++] = Integer.MAX_VALUE;
            }
            class78.field1461 = 1;
            for (int var10 = 0; var10 < class588.field8275; var10++) {
                class433 var11 = class217.field3094[var10];
                class399.method2473(var11.field6042[1], -22, var11.field6043[3], var11.field6052[1], var11.field6043[1], var11.field6043[0], var11.field6042[0], var11.field6052[3], var11.field6052[0], var11.field6042[3]);
                class399.method2473(var11.field6042[2], arg1 - 32044, var11.field6043[3], var11.field6052[2], var11.field6043[2], var11.field6043[1], var11.field6042[1], var11.field6052[3], var11.field6052[1], var11.field6042[3]);
            }
            class78.field1461 = 2;
        }
        if (class86.field1558) {
            class606.field8796 = class105.field1752.method1796(-26211) - class557.field7875;
        }
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(Lvg;II)V")
    public static final void method1214(class52 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            field2406 = null;
        }
        field2401++;
        if (arg0.field885 == null) {
            return;
        }
        int var3 = arg0.field885[arg2 + 1];
        if (arg0.field944 == var3) {
            return;
        }
        arg0.field943 = 0;
        arg0.field914 = 1;
        arg0.field944 = var3;
        arg0.field904 = 0;
        arg0.field950 = 0;
        arg0.field988 = arg0.field992;
        if (arg0.field944 != -1) {
            class749.method4165(arg0.field950, (byte) 126, class698.field9806.method851(arg0.field944, -2), arg0);
            return;
        }
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(B)V")
    public static void method1215(byte arg0) {
        field2398 = null;
        if (arg0 == 18) {
            field2407 = null;
            field2406 = null;
            field2404 = null;
        }
    }
}
