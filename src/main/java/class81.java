import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class81 {

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "I")
    public static int field1330 = 0;

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "Z")
    public static boolean field1326 = false;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "Lda;")
    public static class275 field1324 = class255.method1672(115, "<img=0>");

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "I")
    public static int field1325;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "I")
    public static int field1327;

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "I")
    public static int field1328;

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "I")
    public static int field1329;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lda;II)V")
    public static final void method527(class275 arg0, int arg1, int arg2) {
        field1328++;
        if (arg2 != 0) {
            method531(-127);
        }
        class184 var3 = class147.method1044(3, (byte) 124, arg1);
        var3.method1226((byte) 26);
        var3.field3146 = arg0;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Z)V")
    public static final void method528(boolean arg0) {
        class36.field599 = -1;
        class120.field2149 = 0;
        field1325++;
        class155.field2701 = 0;
        class189.field3264 = false;
        class153.field2682 = 0;
        class89.field1501 = 1;
        class119.field2140 = -3;
        if (!arg0) {
            field1330 = 57;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(II)V")
    public static final void method529(int arg0, int arg1) {
        field1329++;
        class184 var2 = class147.method1044(11, (byte) 65, arg1);
        var2.method1230(1000);
        if (arg0 != 20508) {
            method532(false);
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIJ)Z")
    public static final boolean method530(int arg0, int arg1, int arg2, long arg3) {
        class3 var5 = class235.field4101[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field50 != null && var5.field50.field2426 == arg3) {
            return true;
        } else if (var5.field41 != null && var5.field41.field2142 == arg3) {
            return true;
        } else if (var5.field39 != null && var5.field39.field3645 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field29; var6++) {
                if (var5.field48[var6].field608 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V")
    public static void method531(int arg0) {
        field1324 = null;
        if (arg0 != 0) {
            method529(64, 95);
        }
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(Z)V")
    public static final void method532(boolean arg0) {
        int var1 = class157.field2769;
        int var2 = class23.field366;
        field1327++;
        int var3 = class29.field445;
        int var4 = class6.field84;
        int var5 = 6116423;
        if (!arg0) {
            return;
        }
        class47.method299(var1, var2, var4, var3, var5);
        class47.method299(var1 + 1, var2 + 1, var4 - 2, 16, 0);
        class47.method298(var1 + 1, var2 - -18, var4 - 2, var3 + -19, 0);
        class93.field1599.method121(class52.field878, var1 + 3, var2 - -14, var5, -1);
        int var6 = class44.field746;
        int var7 = class213.field3617;
        for (int var8 = 0; var8 < class52.field863; var8++) {
            int var9 = 16777215;
            int var10 = (class52.field863 - var8 - 1) * 15 + var2 + 31;
            if (var1 < var6 && (var1 + var4) > var6 && var7 > (var10 - 13) && var7 < var10 + 3) {
                var9 = 16776960;
            }
            class93.field1599.method121(class269.method1774(var8, (byte) -127), var1 + 3, var10, var9, 0);
        }
        class192.method1260(-60, class23.field366, class29.field445, class6.field84, class157.field2769);
    }
}
