import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class137 {

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
    public static int field2111 = 0;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field2109 = new String[100];

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "[I")
    public static int[] field2113 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "I")
    public static int field2110;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
    public static int field2112;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "I")
    public static int field2114;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V", line = 7)
    public static void method1047(int arg0) {
        field2109 = null;
        field2113 = null;
        if (arg0 != 8) {
            method1048(false);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Z)V", line = 30)
    public static final void method1048(boolean arg0) {
        class5.method20(class68.field910, (byte) -105);
        field2110++;
        int var1 = (class386.field5469 >> 10) + (class306.field4459 >> 3);
        int var2 = (class417.field5999 >> 10) + (class342.field4959 >> 3);
        byte var3 = 0;
        byte var4 = 8;
        byte var5 = 8;
        byte var6 = 18;
        class439.field6265 = new byte[var6][];
        class289.field4210 = new int[var6];
        class295.field4271 = new byte[var6][];
        class2.field12 = new byte[var6][];
        class450.field6456 = new int[var6];
        class75.field991 = new byte[var6][];
        class393.field5531 = new int[var6][4];
        class222.field3177 = new int[var6];
        class291.field4236 = new int[var6];
        class199.field2844 = new int[var6];
        class403.field5654 = new int[var6];
        class377.field5378 = new byte[var6][];
        int var7 = 0;
        for (int var8 = (var1 - (class80.field1034 >> 4)) / 8; var8 <= (((class80.field1034 >> 4) + var1) / 8); var8++) {
            for (int var10 = (var2 - (class381.field5414 >> 4)) / 8; var10 <= (var2 + (class381.field5414 >> 4)) / 8; var10++) {
                int var11 = (var8 << 8) + var10;
                class199.field2844[var7] = var11;
                class222.field3177[var7] = class226.field3370.method662(5899, "m" + var8 + "_" + var10);
                class403.field5654[var7] = class226.field3370.method662(5899, "l" + var8 + "_" + var10);
                class450.field6456[var7] = class226.field3370.method662(5899, "n" + var8 + "_" + var10);
                class289.field4210[var7] = class226.field3370.method662(5899, "um" + var8 + "_" + var10);
                class291.field4236[var7] = class226.field3370.method662(5899, "ul" + var8 + "_" + var10);
                if (class450.field6456[var7] == -1) {
                    class222.field3177[var7] = -1;
                    class403.field5654[var7] = -1;
                    class289.field4210[var7] = -1;
                    class291.field4236[var7] = -1;
                }
                var7++;
            }
        }
        for (int var9 = var7; var9 < class450.field6456.length; var9++) {
            class450.field6456[var9] = -1;
            class222.field3177[var9] = -1;
            class403.field5654[var9] = -1;
            class289.field4210[var9] = -1;
            class291.field4236[var9] = -1;
        }
        class54.method348(var4, false, var2, var1, arg0, arg0, var3, var5);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIII)V", line = 113)
    public static final void method1049(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 << 3;
        int var5 = arg2 << 3;
        field2112++;
        int var6 = arg3 << 3;
        class241.field3553 = (float) var5;
        if (class336.field4878 == 2) {
            class319.field4676 = var5;
            class214.field3072 = var4;
            class278.field3990 = var6;
        }
        class358.field5176 = (float) var6;
        if (arg0 != -1) {
            field2111 = 88;
        }
        class190.method1365(0);
        class56.field744 = true;
    }
}
