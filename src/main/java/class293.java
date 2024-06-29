import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public abstract class class293 extends class59 {

    @OriginalMember(owner = "client!bd", name = "C", descriptor = "Z")
    public volatile boolean field4700 = true;

    @OriginalMember(owner = "client!bd", name = "y", descriptor = "Z")
    public static boolean field4697 = false;

    @OriginalMember(owner = "client!bd", name = "G", descriptor = "[I")
    public static int[] field4703 = new int[1000];

    @OriginalMember(owner = "client!bd", name = "J", descriptor = "[I")
    public static int[] field4706 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!bd", name = "L", descriptor = "I")
    public static int field4708 = -1;

    @OriginalMember(owner = "client!bd", name = "B", descriptor = "I")
    public static int field4699 = 0;

    @OriginalMember(owner = "client!bd", name = "x", descriptor = "I")
    public static int field4696;

    @OriginalMember(owner = "client!bd", name = "F", descriptor = "I")
    public static int field4702;

    @OriginalMember(owner = "client!bd", name = "H", descriptor = "I")
    public static int field4704;

    @OriginalMember(owner = "client!bd", name = "K", descriptor = "I")
    public static int field4707;

    @OriginalMember(owner = "client!bd", name = "z", descriptor = "Z")
    public boolean field4698;

    @OriginalMember(owner = "client!bd", name = "I", descriptor = "Z")
    public boolean field4705;

    @OriginalMember(owner = "client!bd", name = "D", descriptor = "[Lfe;")
    public static class231[] field4701;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IZII)I")
    public static final int method1983(int arg0, boolean arg1, int arg2, int arg3) {
        field4702++;
        class182 var4 = (class182) class38.field464.method1064(arg3, (long) arg2);
        if (var4 == null) {
            return 0;
        }
        int var5 = 0;
        if (arg3 != -1) {
            method1984(73);
        }
        for (int var6 = 0; var6 < var4.field2864.length; var6++) {
            if (var4.field2864[var6] >= 0 && var4.field2864[var6] < class148.field2202) {
                class162 var7 = class104.method696((byte) -26, var4.field2864[var6]);
                if (var7.field2477 != null) {
                    class178 var8 = (class178) var7.field2477.method1064(arg3, (long) arg0);
                    if (var8 != null) {
                        if (arg1) {
                            var5 += var4.field2866[var6] * var8.field2789;
                        } else {
                            var5 += var8.field2789;
                        }
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "(I)V")
    public static void method1984(int arg0) {
        field4703 = null;
        field4706 = null;
        if (arg0 > -26) {
            method1983(121, false, 34, 99);
        }
        field4701 = null;
    }

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "(B)I")
    public abstract int method742(byte arg0);

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "(I)[B")
    public abstract byte[] method738(int arg0);

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIZII)V")
    public static final void method1985(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field4696++;
        class72.field1069 = -1;
        class282.field4592 = -1;
        float var5 = (float) class207.field3247 / (float) class207.field3242;
        int var6 = arg1;
        int var7 = arg0;
        if ((var5 < 1.0F)) {
            var6 = (int) ((float) arg0 * var5);
        } else {
            var7 = (int) ((float) arg1 / var5);
        }
        int var8 = arg4 - (arg0 - var7) / 2;
        if (arg2) {
            method1984(-21);
        }
        int var9 = arg3 - (arg1 - var6) / 2;
        class311.field4993 = class207.field3242 * var8 / var7;
        class229.field3544 = class207.field3247 * var9 / var6;
        class283.method1945(-110);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)[B")
    public static final byte[] method1986(int arg0, int arg1) {
        if (arg1 < 15) {
            method1983(24, true, -98, 71);
        }
        class161 var2 = (class161) class175.field2754.method707((long) arg0, (byte) 34);
        field4704++;
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg0);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class19.method108(var4, var7, 26329);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class161(var3);
            class175.field2754.method712(false, var2, (long) arg0);
        }
        return var2.field2402;
    }
}
