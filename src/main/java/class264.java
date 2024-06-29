import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class264 implements class95 {

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "I")
    public static int field3859 = 0;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "I")
    public static int field3857;

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "I")
    public static int field3860;

    @OriginalMember(owner = "client!sm", name = "e", descriptor = "I")
    public static int field3861;

    @OriginalMember(owner = "client!sm", name = "f", descriptor = "I")
    public static int field3862;

    @OriginalMember(owner = "client!sm", name = "g", descriptor = "I")
    public static int field3863;

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "Lin;")
    public static class344 field3858;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(II)I", line = 9)
    public static final int method1795(int arg0, int arg1) {
        if (arg0 > -16) {
            field3858 = (class344) null;
        }
        field3860++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(B)V", line = 24)
    public static void method1796(byte arg0) {
        field3858 = null;
        if (arg0 < 56) {
            field3859 = 89;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IJ[II)Ljava/lang/String;", line = 37)
    public final String method702(int arg0, long arg1, int[] arg2, int arg3) {
        field3861++;
        if (arg0 == 0) {
            class28 var6 = class234.method1615((byte) 46, arg2[0]);
            return var6.method165((int) arg1, -87);
        } else if (arg0 == 1 || arg0 == 10) {
            class198 var7 = class115.method854((byte) -88, (int) arg1);
            return var7.field2757;
        } else if (arg0 == 6 || arg0 == 7 || arg0 == 11) {
            return class234.method1615((byte) 46, arg2[0]).method165((int) arg1, -121);
        } else {
            if (arg3 < 115) {
                method1798(-109, false, 48);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(BIIIIII)V", line = 70)
    public static final void method1797(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3862++;
        int var7 = -20 / ((39 - arg0) / 40);
        int var8 = class185.method1299(arg2, (byte) 113, class44.field536, class101.field1397);
        int var9 = class185.method1299(arg3, (byte) 110, class44.field536, class101.field1397);
        int var10 = class185.method1299(arg5, (byte) 113, class259.field3813, class206.field2952);
        int var11 = class185.method1299(arg1, (byte) 111, class259.field3813, class206.field2952);
        int var12 = class185.method1299(arg2 + arg4, (byte) 106, class44.field536, class101.field1397);
        int var13 = class185.method1299(arg3 - arg4, (byte) 119, class44.field536, class101.field1397);
        for (int var14 = var8; var14 < var12; var14++) {
            class190.method1329(class126.field1723[var14], var11, arg6, (byte) -115, var10);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class190.method1329(class126.field1723[var15], var11, arg6, (byte) -89, var10);
        }
        int var16 = class185.method1299(arg4 + arg5, (byte) 119, class259.field3813, class206.field2952);
        int var17 = class185.method1299(arg1 - arg4, (byte) 123, class259.field3813, class206.field2952);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class126.field1723[var18];
            class190.method1329(var19, var16, arg6, (byte) -82, var10);
            class190.method1329(var19, var11, arg6, (byte) -98, var17);
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IZI)V", line = 126)
    public static final void method1798(int arg0, boolean arg1, int arg2) {
        class90.field1264.method2238(69, (byte) -128);
        field3857++;
        class196.field2752++;
        if (arg1) {
            method1797((byte) -108, -54, 73, 13, -107, 12, 72);
        }
        class90.field1264.method2199(!arg1, arg0);
        class90.field1264.method2189(-1, arg2);
    }

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(B)V", line = 144)
    public static final void method1799(byte arg0) {
        field3863++;
        if (arg0 != 102) {
            field3859 = 100;
        }
        class145.field2001.method717((byte) 95);
    }
}
