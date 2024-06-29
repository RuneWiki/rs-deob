import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public class class207 {

    @OriginalMember(owner = "client!cq", name = "g", descriptor = "I")
    private int field2927;

    @OriginalMember(owner = "client!cq", name = "f", descriptor = "[Ljn;")
    private class86[] field2926;

    @OriginalMember(owner = "client!cq", name = "c", descriptor = "Z")
    public static boolean field2923 = false;

    @OriginalMember(owner = "client!cq", name = "e", descriptor = "[I")
    public static int[] field2925 = new int[1];

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "I")
    public static int field2922;

    @OriginalMember(owner = "client!cq", name = "d", descriptor = "I")
    public static int field2924;

    @OriginalMember(owner = "client!cq", name = "h", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!cq", name = "j", descriptor = "I")
    public static int field2930;

    @OriginalMember(owner = "client!cq", name = "l", descriptor = "I")
    public static int field2932;

    @OriginalMember(owner = "client!cq", name = "k", descriptor = "J")
    private long field2931;

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "Ljn;")
    private class86 field2921;

    @OriginalMember(owner = "client!cq", name = "i", descriptor = "Lni;")
    public static class87 field2929;

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(Lco;IIIII)V", line = 11)
    public static final void method1434(class442 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field6569 = 0;
        for (int var6 = 0; var6 < 4; var6++) {
            if (arg0.field6567[var6] != null) {
                arg0.field6569++;
            }
        }
        label50: for (int var7 = 0; var7 < arg0.field6569; var7++) {
            long var8 = class467.field6805[arg1][arg2][arg3];
            while (var8 != 0L) {
                class138 var14 = class515.field7632[(int) ((var8 & 0xFFFFL) - 1L)];
                var8 >>>= 0x10;
                if (arg0.field6567[var7] == var14.field2020) {
                    continue label50;
                }
            }
            long var10 = class467.field6805[arg1][arg4][arg5];
            while (var10 != 0L) {
                class138 var13 = class515.field7632[(int) ((var10 & 0xFFFFL) - 1L)];
                var10 >>>= 0x10;
                if (arg0.field6567[var7] == var13.field2020) {
                    continue label50;
                }
            }
            for (int var12 = var7; var12 < arg0.field6569 - 1; var12++) {
                arg0.field6567[var12] = arg0.field6567[var12 + 1];
            }
            arg0.field6569--;
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(I)V", line = 67)
    public static void method1435(int arg0) {
        field2925 = null;
        if (arg0 == 23394) {
            field2929 = null;
        }
    }

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "(I)Ljn;", line = 81)
    public final class86 method1436(int arg0) {
        field2928++;
        if (this.field2921 == null) {
            return null;
        }
        class86 var2 = this.field2926[(int) ((long) (this.field2927 - 1) & this.field2931)];
        while (this.field2921 != var2) {
            if (this.field2921.field1173 == this.field2931) {
                class86 var3 = this.field2921;
                this.field2921 = this.field2921.field1177;
                return var3;
            }
            this.field2921 = this.field2921.field1177;
        }
        if (arg0 != 9975) {
            this.field2927 = 95;
        }
        this.field2921 = null;
        return null;
    }

    @OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(I)V", line = 120)
    public class207(int arg0) {
        this.field2927 = arg0;
        this.field2926 = new class86[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class86 var3 = this.field2926[var2] = new class86();
            var3.field1180 = var3;
            var3.field1177 = var3;
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(IIIIIIB)V", line = 142)
    public static final void method1437(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        field2924++;
        int var7 = class278.method1758(class158.field2302, class410.field6176, arg5, -92);
        int var8 = class278.method1758(class158.field2302, class410.field6176, arg2, 109);
        int var9 = class278.method1758(class443.field6591, class396.field6021, arg3, arg6 ^ 0xFFFFFFE2);
        int var10 = class278.method1758(class443.field6591, class396.field6021, arg4, -96);
        int var11 = class278.method1758(class158.field2302, class410.field6176, arg1 + arg5, -107);
        int var12 = class278.method1758(class158.field2302, class410.field6176, arg2 - arg1, -116);
        for (int var13 = var7; var13 < var11; var13++) {
            class271.method1736(var10, arg0, var9, arg6 + 98, class23.field356[var13]);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class271.method1736(var10, arg0, var9, -11, class23.field356[var14]);
        }
        int var15 = class278.method1758(class443.field6591, class396.field6021, arg1 + arg3, arg6 ^ 0x2C);
        int var16 = class278.method1758(class443.field6591, class396.field6021, arg4 - arg1, -121);
        if (arg6 != -109) {
            method1437(8, -86, 46, -112, -18, 96, (byte) 73);
        }
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class23.field356[var17];
            class271.method1736(var15, arg0, var9, -11, var18);
            class271.method1736(var10, arg0, var16, -11, var18);
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(BJ)Ljn;", line = 195)
    public final class86 method1438(byte arg0, long arg1) {
        field2922++;
        this.field2931 = arg1;
        class86 var4 = this.field2926[(int) ((long) (this.field2927 - 1) & arg1)];
        this.field2921 = var4.field1177;
        if (arg0 != 33) {
            this.method1439(114L, (byte) -30, null);
        }
        while (this.field2921 != var4) {
            if (this.field2921.field1173 == arg1) {
                class86 var5 = this.field2921;
                this.field2921 = this.field2921.field1177;
                return var5;
            }
            this.field2921 = this.field2921.field1177;
        }
        this.field2921 = null;
        return null;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(JBLjn;)V", line = 229)
    public final void method1439(long arg0, byte arg1, class86 arg2) {
        if (arg2.field1180 != null) {
            arg2.method560((byte) -101);
        }
        field2932++;
        if (arg1 != 46) {
            return;
        }
        class86 var5 = this.field2926[(int) (arg0 & (long) (this.field2927 - 1))];
        arg2.field1177 = var5;
        arg2.field1180 = var5.field1180;
        arg2.field1180.field1177 = arg2;
        arg2.field1177.field1180 = arg2;
        arg2.field1173 = arg0;
    }
}
