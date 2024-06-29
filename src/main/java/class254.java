import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class254 {

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "[I")
    public static int[] field3853 = new int[14];

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "I")
    public static int field3857 = 100;

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "Lqd;")
    public static class37 field3858 = new class37(64);

    @OriginalMember(owner = "client!wg", name = "n", descriptor = "[Z")
    public static boolean[] field3863 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!wg", name = "m", descriptor = "Z")
    public static boolean field3862 = false;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "I")
    public static int field3850;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "I")
    public static int field3852;

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "I")
    public static int field3854;

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "I")
    public static int field3855;

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "I")
    public static int field3856;

    @OriginalMember(owner = "client!wg", name = "l", descriptor = "I")
    public static int field3861;

    @OriginalMember(owner = "client!wg", name = "o", descriptor = "I")
    public static int field3864;

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "J")
    public long field3851;

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "Lwg;")
    public class254 field3859;

    @OriginalMember(owner = "client!wg", name = "k", descriptor = "Lwg;")
    public class254 field3860;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Z)Z")
    public final boolean method1701(boolean arg0) {
        field3864++;
        if (this.field3860 == null) {
            return false;
        } else {
            if (arg0) {
                method1703(47, 0, -7, 107);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)[B")
    public static final byte[] method1702(int arg0, int arg1) {
        class170 var2 = (class170) class84.field1305.method1501((long) arg0, (byte) 118);
        if (var2 == null) {
            Random var3 = new Random((long) arg0);
            byte[] var4 = new byte[512];
            for (int var5 = 0; var5 < 255; var5++) {
                var4[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class259.method1734(var7, false, var3);
                byte var9 = var4[var8];
                var4[var8] = var4[var7];
                var4[var7] = var4[511 - var6] = var9;
            }
            var2 = new class170(var4);
            class84.field1305.method1499((long) arg0, -82, var2);
        }
        field3861++;
        if (arg1 != 0) {
            field3862 = true;
        }
        return var2.field2445;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIII)I")
    public static final int method1703(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 & 0x3;
        field3855++;
        if (var4 == 0) {
            return arg2;
        } else if (~var4 == arg1) {
            return 7 - arg3;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(II)I")
    public static final int method1704(int arg0, int arg1) {
        field3852++;
        if (arg1 != -21261) {
            method1702(-34, -91);
        }
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V")
    public static void method1705(int arg0) {
        field3863 = null;
        field3853 = null;
        if (arg0 != 9564) {
            field3862 = false;
        }
        field3858 = null;
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(I)V")
    public final void method1706(int arg0) {
        if (arg0 >= -53) {
            field3863 = null;
        }
        field3854++;
        if (this.field3860 != null) {
            this.field3860.field3859 = this.field3859;
            this.field3859.field3860 = this.field3860;
            this.field3859 = null;
            this.field3860 = null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(III)V")
    public static final void method1707(int arg0, int arg1, int arg2) {
        field3856++;
        class95.field1451.method522(240, 28727);
        class95.field1451.method764(19753, arg0);
        field3850++;
        if (arg2 > -52) {
            method1703(-73, -38, -73, -127);
        }
        class95.field1451.method738(arg1, (byte) 99);
    }
}
