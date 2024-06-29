import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class259 extends class181 {

    @OriginalMember(owner = "client!dd", name = "v", descriptor = "I")
    public static int field3968 = 0;

    @OriginalMember(owner = "client!dd", name = "x", descriptor = "I")
    public static int field3970 = 0;

    @OriginalMember(owner = "client!dd", name = "u", descriptor = "[I")
    public static int[] field3967 = new int[25];

    @OriginalMember(owner = "client!dd", name = "I", descriptor = "[I")
    public static int[] field3981 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!dd", name = "s", descriptor = "I")
    public static int field3965;

    @OriginalMember(owner = "client!dd", name = "w", descriptor = "I")
    public static int field3969;

    @OriginalMember(owner = "client!dd", name = "y", descriptor = "I")
    public static int field3971;

    @OriginalMember(owner = "client!dd", name = "C", descriptor = "I")
    public static int field3975;

    @OriginalMember(owner = "client!dd", name = "G", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!dd", name = "H", descriptor = "I")
    public static int field3980;

    @OriginalMember(owner = "client!dd", name = "J", descriptor = "I")
    public static int field3982;

    @OriginalMember(owner = "client!dd", name = "K", descriptor = "I")
    public static int field3983;

    @OriginalMember(owner = "client!dd", name = "F", descriptor = "J")
    public long field3978;

    @OriginalMember(owner = "client!dd", name = "t", descriptor = "Lpk;")
    public static class237 field3966;

    @OriginalMember(owner = "client!dd", name = "D", descriptor = "Lpk;")
    public static class237 field3976;

    @OriginalMember(owner = "client!dd", name = "E", descriptor = "Lpk;")
    public static class237 field3977;

    @OriginalMember(owner = "client!dd", name = "z", descriptor = "Ldd;")
    public class259 field3972;

    @OriginalMember(owner = "client!dd", name = "A", descriptor = "Ldd;")
    public class259 field3973;

    @OriginalMember(owner = "client!dd", name = "B", descriptor = "[[B")
    public static byte[][] field3974;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1743(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg5 != 18711) {
            return;
        }
        int var7 = arg1 + arg4;
        field3982++;
        int var8 = arg0 - arg4;
        int var9 = arg4 + arg6;
        for (int var10 = arg1; var10 < var7; var10++) {
            class222.method1519((byte) -115, arg6, class241.field3751[var10], arg2, arg3);
        }
        int var11 = arg2 - arg4;
        for (int var12 = arg0; var12 > var8; var12--) {
            class222.method1519((byte) -112, arg6, class241.field3751[var12], arg2, arg3);
        }
        for (int var13 = var7; var13 <= var8; var13++) {
            int[] var14 = class241.field3751[var13];
            class222.method1519((byte) -124, arg6, var14, var9, arg3);
            class222.method1519((byte) -114, var11, var14, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(II)V")
    public static final void method1744(int arg0, int arg1) {
        field3983++;
        class51.field826--;
        int var2 = -3 / ((arg1 - 31) / 33);
        if (class51.field826 == arg0) {
            return;
        }
        class41.method339(class179.field2614, arg0 + 1, class179.field2614, arg0, class51.field826 - arg0);
        class41.method339(class280.field4297, arg0 + 1, class280.field4297, arg0, class51.field826 - arg0);
        class41.method338(class186.field2708, arg0 + 1, class186.field2708, arg0, class51.field826 - arg0);
        class41.method341(class265.field4147, arg0 + 1, class265.field4147, arg0, class51.field826 - arg0);
        class41.method340(class84.field1294, arg0 + 1, class84.field1294, arg0, class51.field826 - arg0);
        class41.method338(class260.field4000, arg0 + 1, class260.field4000, arg0, class51.field826 - arg0);
        class41.method338(class8.field96, arg0 + 1, class8.field96, arg0, class51.field826 - arg0);
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(I)V")
    public static void method1745(int arg0) {
        field3977 = null;
        field3976 = null;
        if (arg0 != -1) {
            method1747(-99, 47);
        }
        field3981 = null;
        field3966 = null;
        field3967 = null;
        field3974 = null;
    }

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "(I)V")
    public final void method1746(int arg0) {
        field3979++;
        int var2 = 65 / ((arg0 + 29) / 39);
        if (this.field3973 != null) {
            this.field3973.field3972 = this.field3972;
            this.field3972.field3973 = this.field3973;
            this.field3972 = null;
            this.field3973 = null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "(II)I")
    public static final int method1747(int arg0, int arg1) {
        if (arg1 != 5539) {
            method1745(3);
        }
        field3969++;
        int var2 = arg0 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return ~var7 & arg0;
    }
}
