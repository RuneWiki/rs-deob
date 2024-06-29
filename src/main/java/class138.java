import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class138 extends class381 {

    @OriginalMember(owner = "client!od", name = "l", descriptor = "I")
    public static int field1942 = 0;

    @OriginalMember(owner = "client!od", name = "r", descriptor = "I")
    public static int field1948 = 0;

    @OriginalMember(owner = "client!od", name = "n", descriptor = "I")
    public static int field1944;

    @OriginalMember(owner = "client!od", name = "o", descriptor = "I")
    public static int field1945;

    @OriginalMember(owner = "client!od", name = "q", descriptor = "I")
    public static int field1947;

    @OriginalMember(owner = "client!od", name = "s", descriptor = "I")
    public static int field1949;

    @OriginalMember(owner = "client!od", name = "t", descriptor = "I")
    public static int field1950;

    @OriginalMember(owner = "client!od", name = "p", descriptor = "Lvm;")
    public static class323 field1946;

    @OriginalMember(owner = "client!od", name = "m", descriptor = "Lrk;")
    public static class427 field1943;

    @OriginalMember(owner = "client!od", name = "u", descriptor = "Lkb;")
    public class80 field1951;

    @OriginalMember(owner = "client!od", name = "v", descriptor = "Z")
    public boolean field1952;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIBI)V")
    public static final void method1082(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field1949++;
        int var5 = 0;
        int var6 = arg0;
        int var7 = -46 / ((11 - arg3) / 34);
        int var8 = -arg0;
        int var9 = -1;
        class396.method2436(-1070, arg2, arg1 - arg0, class186.field2697[arg4], arg0 + arg1);
        while (var5 < var6) {
            var9 += 2;
            var8 += var9;
            var5++;
            if (var8 >= 0) {
                var6--;
                var8 -= var6 << 1;
                int[] var10 = class186.field2697[arg4 + var6];
                int[] var11 = class186.field2697[arg4 - var6];
                int var12 = arg1 + var5;
                int var13 = arg1 - var5;
                class396.method2436(-1070, arg2, var13, var10, var12);
                class396.method2436(-1070, arg2, var13, var11, var12);
            }
            int var14 = arg1 + var6;
            int var15 = arg1 - var6;
            int[] var16 = class186.field2697[arg4 + var5];
            int[] var17 = class186.field2697[arg4 - var5];
            class396.method2436(-1070, arg2, var15, var16, var14);
            class396.method2436(-1070, arg2, var15, var17, var14);
        }
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(I)V")
    public static void method1083(int arg0) {
        if (arg0 != 1) {
            field1946 = null;
        }
        field1946 = null;
        field1943 = null;
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(B)V")
    public static final void method1084(byte arg0) {
        class14.method68((byte) -70, class418.field5867);
        field1950++;
        int var1 = 54 / ((arg0 - 7) / 60);
        class60.method543(3, class418.field5867);
        if (class394.field5517 != null) {
            class394.field5517.method666(30, class418.field5867);
        }
        class244.field3371.method2033(true);
        class418.field5867.setBackground(Color.black);
        class31.field519 = -1;
        class414.method2561((byte) -107, class418.field5867);
        class427.method2640(class418.field5867, (byte) -90);
        if (class394.field5517 != null) {
            class394.field5517.method658(class418.field5867, (byte) -126);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lrk;I)V")
    public static final void method1085(class427 arg0, int arg1) {
        class167.field2481 = arg0;
        field1944++;
        class167.field2481.method2626(35, arg1 ^ 0x716C);
        if (arg1 != 29029) {
            method1082(-2, -91, -43, (byte) -44, 119);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IILrk;ZII)V")
    public static final void method1086(int arg0, int arg1, class427 arg2, boolean arg3, int arg4, int arg5) {
        class241.field3327 = arg2;
        class229.field3182 = 1;
        class163.field2414 = arg3;
        class266.field3567 = 10000;
        class395.field5532 = arg5;
        int var6 = 54 % (arg1 / 54);
        class148.field2286 = arg4;
        field1945++;
        class433.field6142 = arg0;
    }
}
