import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class155 {

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "I")
    public int field2759 = -1;

    @OriginalMember(owner = "client!gk", name = "i", descriptor = "I")
    public static int field2762 = 0;

    @OriginalMember(owner = "client!gk", name = "k", descriptor = "Z")
    public static boolean field2764 = true;

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "I")
    public static int field2755;

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "I")
    public static int field2758;

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "I")
    public static int field2760;

    @OriginalMember(owner = "client!gk", name = "j", descriptor = "I")
    public static int field2763;

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "Lp;")
    public static class86 field2757;

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "Lrd;")
    public class94 field2756;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "[I")
    public int[] field2754;

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "[Lr;")
    public class66[] field2761;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(II)V")
    public static final void method1053(int arg0, int arg1) {
        field2760++;
        if (class164.method1107(arg0, (byte) -2)) {
            class226.method1442(0, class31.field466[arg0], arg1);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(ILcj;)V")
    public static final void method1054(int arg0, class28 arg1) {
        if (arg0 != 3) {
            field2757 = null;
        }
        class99.field1928 = class20.method88(class54.field947, arg1, false);
        field2763++;
        class147.field2679 = new int[256];
        for (int var2 = 0; var2 < 3; var2++) {
            float var4 = (float) (class176.field3088[var2] >> 16 & 0xFF);
            int var5 = class176.field3088[var2 + 1] >> 16 & 0xFF;
            float var6 = (float) (class176.field3088[var2] >> 8 & 0xFF);
            float var7 = ((float) var5 - var4) / 64.0F;
            int var8 = class176.field3088[var2 + 1] >> 8 & 0xFF;
            float var9 = ((float) var8 - var6) / 64.0F;
            float var10 = (float) (class176.field3088[var2] & 0xFF);
            int var11 = class176.field3088[var2 + 1] & 0xFF;
            float var12 = ((float) var11 - var10) / 64.0F;
            for (int var13 = 0; var13 < 64; var13++) {
                class147.field2679[var2 * 64 + var13] = class73.method521((int) var10, class73.method521((int) var4 << 16, (int) var6 << 8));
                var6 += var9;
                var4 += var7;
                var10 += var12;
            }
        }
        for (int var3 = 192; var3 < 255; var3++) {
            class147.field2679[var3] = class176.field3088[3];
        }
        class56.field964 = new int[32768];
        class77.field1517 = new int[32768];
        class238.method1569(arg0 + 96, (class265) null);
        class62.field1058 = new int[32768];
        class102.field1995 = new int[32768];
        class244.field4273 = new class168(128, 254);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V")
    public static void method1055(int arg0) {
        if (arg0 != -2) {
            field2762 = -115;
        }
        field2757 = null;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIIIBII)V")
    public static final void method1056(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        field2758++;
        if (arg5 <= 115 || arg4 < 0 || arg0 < 0 || arg4 >= 103 || arg0 >= 103) {
            return;
        }
        if (arg7 == 0) {
            class47 var8 = class68.method500(arg2, arg4, arg0);
            if (var8 != null) {
                int var9 = Integer.MAX_VALUE & (int) (var8.field853 >>> 32);
                if (arg1 == 2) {
                    var8.field849 = new class260(var9, 2, arg3 + 4, arg2, arg4, arg0, arg6, false, var8.field849);
                    var8.field852 = new class260(var9, 2, arg3 + 1 & 0x3, arg2, arg4, arg0, arg6, false, var8.field852);
                } else {
                    var8.field849 = new class260(var9, arg1, arg3, arg2, arg4, arg0, arg6, false, var8.field849);
                }
            }
        }
        if (arg7 == 1) {
            class127 var10 = class42.method274(arg2, arg4, arg0);
            if (var10 != null) {
                int var11 = (int) (var10.field2390 >>> 32) & Integer.MAX_VALUE;
                if (arg1 == 4 || arg1 == 5) {
                    var10.field2384 = new class260(var11, 4, arg3, arg2, arg4, arg0, arg6, false, var10.field2384);
                } else if (arg1 == 6) {
                    var10.field2384 = new class260(var11, 4, arg3 + 4, arg2, arg4, arg0, arg6, false, var10.field2384);
                } else if (arg1 == 7) {
                    var10.field2384 = new class260(var11, 4, (arg3 + 2 & 0x3) + 4, arg2, arg4, arg0, arg6, false, var10.field2384);
                } else if (arg1 == 8) {
                    var10.field2384 = new class260(var11, 4, arg3 + 4, arg2, arg4, arg0, arg6, false, var10.field2384);
                    var10.field2386 = new class260(var11, 4, (arg3 + 2 & 0x3) + 4, arg2, arg4, arg0, arg6, false, var10.field2386);
                }
            }
        }
        if (arg7 == 2) {
            if (arg1 == 11) {
                arg1 = 10;
            }
            class44 var12 = class178.method1190(arg2, arg4, arg0);
            if (var12 != null) {
                var12.field779 = new class260((int) (var12.field780 >>> 32) & Integer.MAX_VALUE, arg1, arg3, arg2, arg4, arg0, arg6, false, var12.field779);
            }
        }
        if (arg7 != 3) {
            return;
        }
        class90 var13 = class208.method1355(arg2, arg4, arg0);
        if (var13 != null) {
            var13.field1734 = new class260(Integer.MAX_VALUE & (int) (var13.field1746 >>> 32), 22, arg3, arg2, arg4, arg0, arg6, false, var13.field1734);
            return;
        }
    }
}
