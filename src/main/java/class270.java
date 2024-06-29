import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class270 {

    @OriginalMember(owner = "client!h", name = "d", descriptor = "Lid;")
    public static class149 field4859 = class60.method382("; version=1; path=)4; domain=", (byte) 8);

    @OriginalMember(owner = "client!h", name = "a", descriptor = "I")
    public static int field4856;

    @OriginalMember(owner = "client!h", name = "b", descriptor = "I")
    public static int field4857;

    @OriginalMember(owner = "client!h", name = "c", descriptor = "I")
    public static int field4858;

    @OriginalMember(owner = "client!h", name = "g", descriptor = "I")
    public static int field4862;

    @OriginalMember(owner = "client!h", name = "h", descriptor = "I")
    public static int field4863;

    @OriginalMember(owner = "client!h", name = "f", descriptor = "Lal;")
    public static class230 field4861;

    @OriginalMember(owner = "client!h", name = "i", descriptor = "Lal;")
    public static class230 field4864;

    @OriginalMember(owner = "client!h", name = "e", descriptor = "[I")
    public static int[] field4860;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(B)V")
    public static void method1876(byte arg0) {
        if (arg0 != 56) {
            field4861 = null;
        }
        field4861 = null;
        field4864 = null;
        field4860 = null;
        field4859 = null;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1877(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4863++;
        int var7 = class47.method303(arg2, class94.field1655, class224.field3940, 65535);
        int var8 = class47.method303(arg6, class94.field1655, class224.field3940, 65535);
        int var9 = class47.method303(arg0, class192.field3449, class257.field4496, arg1 ^ 0xDD9A);
        int var10 = class47.method303(arg5, class192.field3449, class257.field4496, 65535);
        int var11 = class47.method303(arg2 + arg3, class94.field1655, class224.field3940, 65535);
        int var12 = class47.method303(arg6 - arg3, class94.field1655, class224.field3940, 65535);
        for (int var13 = var7; var13 < var11; var13++) {
            class141.method987(2, var9, class15.field220[var13], var10, arg4);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class141.method987(arg1 - 8803, var9, class15.field220[var14], var10, arg4);
        }
        if (arg1 != 8805) {
            method1878(-104, (class230) null);
        }
        int var15 = class47.method303(arg0 + arg3, class192.field3449, class257.field4496, arg1 ^ 0xDD9A);
        int var16 = class47.method303(arg5 - arg3, class192.field3449, class257.field4496, 65535);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class15.field220[var17];
            class141.method987(2, var9, var18, var15, arg4);
            class141.method987(2, var16, var18, var10, arg4);
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ILal;)V")
    public static final void method1878(int arg0, class230 arg1) {
        field4857++;
        class170.field3145 = arg1;
        if (arg0 != -17017) {
            field4856 = -115;
        }
    }
}
