import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class101 {

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "[Lih;")
    public static class208[] field1592 = new class208[4];

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "I")
    public static int field1594 = 0;

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "[I")
    public static int[] field1593 = new int[100];

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "[Lod;")
    public static class93[] field1591 = new class93[8];

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
    public static int field1588;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "I")
    public static int field1589;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "[Z")
    public static boolean[] field1587;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IBLrf;)Ljava/lang/String;")
    public static final String method650(int arg0, byte arg1, class289 arg2) {
        if (arg1 != 58) {
            method652((String) null, -50, false);
        }
        field1589++;
        if (!client.method972(arg2).method1788(arg0, true) && arg2.field4487 == null) {
            return null;
        } else if (arg2.field4522 == null || arg2.field4522.length <= arg0 || arg2.field4522[arg0] == null || arg2.field4522[arg0].trim().length() == 0) {
            return class64.field1009 ? "Hidden-" + arg0 : null;
        } else {
            return arg2.field4522[arg0];
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
    public static void method651(int arg0) {
        field1591 = null;
        if (arg0 < 45) {
            method653(-115, 98, -60, 39, 28, (class114) null, 10, 41L, false);
        }
        field1587 = null;
        field1593 = null;
        field1592 = null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
    public static final void method652(String arg0, int arg1, boolean arg2) {
        field1590++;
        byte var3 = 4;
        int var4 = var3 + 6;
        int var5 = var3 + 6;
        int var6 = class268.field4036.method1015(arg0, 250);
        int var7 = class268.field4036.method1016(arg0, 250) * 13;
        class111.method702(var4 - var3, -var3 + var5, var3 + var6 + var3, var3 + var7 - -var3, 0);
        class111.method701(var4 - var3, var5 - var3, var6 + var3 + var3, var3 + var7 + var3, 16777215);
        class268.field4036.method1023(arg0, var4, var5, var6, var7, 16777215, -1, 1, 1, 0);
        class8.method40(arg1 ^ arg1, var4 - var3, var3 + var6 + var3, var3 + var7 + var3, -var3 + var5);
        if (!arg2) {
            class191.method1195(var6, var4, var7, (byte) 117, var5);
            return;
        }
        try {
            Graphics var8 = class47.field762.getGraphics();
            class273.field4109.method1074(0, 0, var8, (byte) -68);
        } catch (Exception var9) {
            class47.field762.repaint();
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIILsk;IJZ)Z")
    public static final boolean method653(int arg0, int arg1, int arg2, int arg3, int arg4, class114 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class284.method1869(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }
}
