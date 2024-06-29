import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public abstract class class237 extends class54 {

    @OriginalMember(owner = "client!uj", name = "o", descriptor = "I")
    public int field3567;

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "I")
    public int field3556;

    @OriginalMember(owner = "client!uj", name = "k", descriptor = "I")
    public int field3563;

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "I")
    public int field3560;

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "Lsh;")
    public static class48 field3557 = new class48("LIVE", 0);

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "[I")
    public static int[] field3558 = new int[200];

    @OriginalMember(owner = "client!uj", name = "l", descriptor = "I")
    public static int field3564 = 0;

    @OriginalMember(owner = "client!uj", name = "m", descriptor = "[S")
    public static short[] field3565 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!uj", name = "i", descriptor = "I")
    public static int field3561;

    @OriginalMember(owner = "client!uj", name = "n", descriptor = "I")
    public static int field3566;

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "[I")
    public static int[] field3559;

    @OriginalMember(owner = "client!uj", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field3562;

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "(B)V")
    public static void method1507(byte arg0) {
        field3562 = null;
        field3565 = null;
        field3558 = null;
        if (arg0 < 19) {
            field3559 = null;
        }
        field3559 = null;
        field3557 = null;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IBIILok;IZ)V")
    public static final void method1508(int arg0, byte arg1, int arg2, int arg3, class153 arg4, int arg5, boolean arg6) {
        field3566++;
        if (class442.field6125 >= 50 || arg4 == null || arg4.field2272 == null || arg4.field2272.length <= arg3 || arg4.field2272[arg3] == null) {
            return;
        }
        int var7 = arg4.field2272[arg3][0];
        int var8 = var7 >> 8;
        int var9 = (var7 & 0xF9) >> 5;
        int var10 = var7 & 0x1F;
        if (arg4.field2272[arg3].length > 1) {
            int var11 = (int) (Math.random() * (double) arg4.field2272[arg3].length);
            if (var11 > 0) {
                var8 = arg4.field2272[arg3][var11];
            }
        }
        if (var10 == 0) {
            if (arg6) {
                class58.method354(var8, var9, 8, 0, 255);
            }
        } else if (class314.field4438.field5771 != 0) {
            class40.field532[class442.field6125] = var8;
            class339.field4952[class442.field6125] = var9;
            int var12 = 98 % ((83 - arg1) / 35);
            class242.field3621[class442.field6125] = 0;
            class318.field4614[class442.field6125] = null;
            class306.field4360[class442.field6125] = 255;
            int var13 = (arg2 - 64) / 128;
            int var14 = (arg5 - 64) / 128;
            class235.field3545[class442.field6125] = (var14 << 8) + (arg0 << 24) + (var13 << 16) + var10;
            class442.field6125++;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "([BI)[B")
    public static final byte[] method1509(byte[] arg0, int arg1) {
        field3561++;
        class276 var2 = new class276(arg0);
        if (arg1 > -59) {
            field3557 = null;
        }
        int var3 = var2.method1701(-23121);
        int var4 = var2.method1688(20402);
        if (var4 < 0 || !(class193.field2852 == 0 || var4 <= class193.field2852)) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var7 = new byte[var4];
            var2.method1706(var7, 0, -27, var4);
            return var7;
        } else {
            int var5 = var2.method1688(20402);
            if (var5 < 0 || !(class193.field2852 == 0 || var5 <= class193.field2852)) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class464.method2721(var6, var5, arg0, var4, 9);
            } else {
                class305.field4343.method2430(var2, var6, 8);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(IIII)V")
    public class237(int arg0, int arg1, int arg2, int arg3) {
        this.field3567 = arg1;
        this.field3556 = arg0;
        this.field3563 = arg2;
        this.field3560 = arg3;
    }
}
