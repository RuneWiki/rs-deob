import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public abstract class class69 {

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "Ljava/lang/String;")
    public static String field1028 = "Please wait - attempting to reestablish.";

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "F")
    public static float field1029;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!jm", name = "e", descriptor = "[Lng;")
    public static class245[] field1030;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIIIBIIII)V", line = 9)
    public static final void method490(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg5 != 97) {
            return;
        }
        if (class256.field3995 <= arg8 && arg8 <= class118.field1834 && class256.field3995 <= arg7 && class118.field1834 >= arg7 && arg9 >= class256.field3995 && arg9 <= class118.field1834 && arg0 >= class256.field3995 && arg0 <= class118.field1834 && arg4 >= class323.field5030 && arg4 <= class88.field1324 && arg1 >= class323.field5030 && class88.field1324 >= arg1 && arg6 >= class323.field5030 && arg6 <= class88.field1324 && arg2 >= class323.field5030 && class88.field1324 >= arg2) {
            class339.method2350(arg8, arg2, arg1, arg6, arg3, 122, arg7, arg9, arg4, arg0);
        } else {
            class39.method288(arg4, arg7, arg3, (byte) 118, arg8, arg6, arg0, arg1, arg2, arg9);
        }
        field1027++;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIILfe;JLfe;Lfe;)V", line = 28)
    public static final void method492(int arg0, int arg1, int arg2, int arg3, class94 arg4, long arg5, class94 arg6, class94 arg7) {
        class123 var9 = new class123();
        var9.field1918 = arg4;
        var9.field1917 = arg1 * 128 + 64;
        var9.field1923 = arg2 * 128 + 64;
        var9.field1915 = arg3;
        var9.field1930 = arg5;
        var9.field1927 = arg6;
        var9.field1931 = arg7;
        int var10 = 0;
        class174 var11 = class90.field1375[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field2655; var12++) {
                class272 var13 = var11.field2671[var12];
                if ((var13.field4183 & 0x400000L) == 4194304L) {
                    int var14 = var13.field4173.method112();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field1916 = -var10;
        if (class90.field1375[arg0][arg1][arg2] == null) {
            class90.field1375[arg0][arg1][arg2] = new class174(arg0, arg1, arg2);
        }
        class90.field1375[arg0][arg1][arg2].field2656 = var9;
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(I)V", line = 75)
    public static void method493(int arg0) {
        if (arg0 >= -44) {
            method492(-69, 43, -12, -1, (class94) null, -44L, (class94) null, (class94) null);
        }
        field1030 = null;
        field1028 = null;
    }

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "(I)Ln;", line = 86)
    public static final class178 method494(int arg0) {
        if (arg0 != -31610) {
            return (class178) null;
        }
        field1026++;
        int var1 = class68.field1011[0] * class107.field1652[0];
        int[] var2 = new int[var1];
        byte[] var3 = class46.field644[0];
        for (int var4 = 0; var4 < var1; var4++) {
            var2[var4] = class154.field2417[class311.method2135(var3[var4], 255)];
        }
        class178 var5 = new class178(class116.field1798, class168.field2567, class276.field4257[0], class123.field1919[0], class68.field1011[0], class107.field1652[0], var2);
        class345.method2394((byte) -92);
        return var5;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)V")
    public abstract void method491(int arg0);

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(ZII)I")
    public abstract int method495(boolean arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "(I)J")
    public abstract long method496(int arg0);
}
