import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public abstract class class149 {

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "I")
    public static int field2363 = 5063219;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "I")
    public static int field2367 = -1;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "I")
    public int field2360;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "I")
    public int field2361;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "I")
    public int field2362;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "I")
    public int field2365;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "I")
    public int field2366;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "I")
    public static int field2368;

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "I")
    public int field2369;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "Ljh;")
    public static class299 field2364;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V", line = 16)
    public static final void method1088(int arg0) {
        if (arg0 < 118) {
            method1090((byte) -58);
        }
        field2368++;
        class10.field94 = null;
        class144.method1071();
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V", line = 37)
    public static void method1090(byte arg0) {
        if (arg0 >= -16) {
            field2364 = (class299) null;
        }
        field2364 = null;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "([IIIIII)V", line = 52)
    public static final void method1091(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class196 var6 = class194.field2947[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class33 var7 = var6.field2997;
        if (var7 != null) {
            int var8 = var7.field380;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class51 var10 = var6.field2987;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field589;
        int var12 = var10.field582;
        int var13 = var10.field599;
        int var14 = var10.field584;
        int[] var15 = class84.field1101[var11];
        int[] var16 = class260.field4111[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(III)V")
    public abstract void method1087(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)V")
    public abstract void method1089(int arg0, int arg1);
}
