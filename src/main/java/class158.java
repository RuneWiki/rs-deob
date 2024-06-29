import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class158 extends class4 {

    @OriginalMember(owner = "client!ne", name = "s", descriptor = "Lsi;")
    public class694 field2215;

    @OriginalMember(owner = "client!ne", name = "v", descriptor = "I")
    public static int field2218 = 0;

    @OriginalMember(owner = "client!ne", name = "r", descriptor = "F")
    public static float field2214;

    @OriginalMember(owner = "client!ne", name = "t", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!ne", name = "u", descriptor = "I")
    public static int field2217;

    @OriginalMember(owner = "client!ne", name = "w", descriptor = "I")
    public static int field2219;

    @OriginalMember(owner = "client!ne", name = "x", descriptor = "I")
    public static int field2220;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIII)V")
    public static final void method991(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2216++;
        int var5 = 0;
        int var6 = arg0;
        int var7 = -arg0;
        int var8 = arg3;
        int var9 = class41.method223(true, class726.field10064, class607.field8185, arg0 + arg1);
        int var10 = class41.method223(true, class726.field10064, class607.field8185, arg1 - arg0);
        class102.method675(arg4, 109, var10, var9, class538.field7454[arg2]);
        while (var5 < var6) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var6--;
                var7 -= var6 << 1;
                int var11 = arg2 - var6;
                int var12 = arg2 + var6;
                if (var12 >= class291.field4181 && var11 <= class262.field3848) {
                    int var13 = class41.method223(true, class726.field10064, class607.field8185, arg1 + var5);
                    int var14 = class41.method223(true, class726.field10064, class607.field8185, arg1 - var5);
                    if (class262.field3848 >= var12) {
                        class102.method675(arg4, arg3 ^ 0x3D, var14, var13, class538.field7454[var12]);
                    }
                    if (var11 >= class291.field4181) {
                        class102.method675(arg4, -107, var14, var13, class538.field7454[var11]);
                    }
                }
            }
            var5++;
            int var15 = arg2 - var5;
            int var16 = arg2 + var5;
            if (var16 >= class291.field4181 && class262.field3848 >= var15) {
                int var17 = class41.method223(true, class726.field10064, class607.field8185, arg1 + var6);
                int var18 = class41.method223(true, class726.field10064, class607.field8185, arg1 - var6);
                if (var16 <= class262.field3848) {
                    class102.method675(arg4, 72, var18, var17, class538.field7454[var16]);
                }
                if (var15 >= class291.field4181) {
                    class102.method675(arg4, -47, var18, var17, class538.field7454[var15]);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIB)V")
    public static final void method992(int arg0, int arg1, byte arg2) {
        field2219++;
        class346 var3 = class299.method1976(0, 6, arg1);
        var3.method2209(255);
        if (arg2 != 85) {
            field2218 = -105;
        }
        var3.field4926 = arg0;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIZ)V")
    public static final void method993(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2217++;
        if (!arg4) {
            return;
        }
        if (arg2 > arg1) {
            for (int var5 = arg1; var5 < arg2; var5++) {
                class538.field7454[var5][arg3] = arg0;
            }
        } else {
            for (int var6 = arg2; var6 < arg1; var6++) {
                class538.field7454[var6][arg3] = arg0;
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)Z")
    public static final boolean method994(int arg0, int arg1) {
        if (arg1 > -99) {
            return false;
        }
        field2220++;
        if (arg0 == 12 || arg0 == 47 || arg0 == 6 || arg0 == 25 || arg0 == 49) {
            return true;
        } else {
            return arg0 == 46 || arg0 == 1003;
        }
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(Lsi;)V")
    public class158(class694 arg0) {
        this.field2215 = arg0;
    }
}
