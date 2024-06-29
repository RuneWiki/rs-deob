import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class146 {

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "Z")
    public static boolean field2205 = false;

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "[[I")
    public static int[][] field2209 = new int[104][104];

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
    public static int field2204;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
    public static int field2206;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
    public static int field2207;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
    public int field2208;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "Ljava/lang/String;")
    public String field2203;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ZI)V", line = 10)
    public static final void method1043(boolean arg0, int arg1) {
        class87.field1295 = new int[104];
        class240.field3574 = new int[104];
        class246.field3662 = new int[104];
        field2204++;
        class182.field2716 = new int[104];
        if (arg1 <= 53) {
            return;
        }
        byte var2;
        if (arg0) {
            var2 = 1;
        } else {
            var2 = 4;
        }
        class250.field3730 = new byte[var2][104][104];
        class93.field1396 = new int[104];
        class144.field2178 = new byte[var2][104][104];
        class311.field4736 = 99;
        class3.field8 = new byte[var2][104][104];
        class212.field3225 = new byte[var2][105][105];
        class22.field337 = new int[var2][105][105];
        class326.field4912 = new byte[var2][104][104];
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIIB)V", line = 41)
    public static final void method1044(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 != 22) {
            method1044(-115, 127, 19, 58, (byte) -96);
        }
        class204.field3070 = -1;
        class154.field2321 = -1;
        class203.field3037 = class111.field1719 * arg1 / arg3;
        field2206++;
        class233.field3504 = class41.field497 * arg2 / arg0;
        class162.method1150((byte) 24);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IILgl;III)Ljava/awt/Frame;", line = 56)
    public static final Frame method1045(int arg0, int arg1, class262 arg2, int arg3, int arg4, int arg5) {
        field2207++;
        if (!arg2.method1768((byte) -87)) {
            return null;
        }
        if (arg1 == arg4) {
            class314[] var6 = class271.method1912(arg2, 6099);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field4751 == arg5 && var6[var8].field4752 == arg3 && (arg0 == 0 || var6[var8].field4754 == arg0) && (!var7 || arg1 < var6[var8].field4753)) {
                    var7 = true;
                    arg1 = var6[var8].field4753;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class227 var9 = arg2.method1771(arg5, arg0, arg3, 13691, arg1);
        while (var9.field3456 == 0) {
            class93.method662(-553, 10L);
        }
        Frame var10 = (Frame) var9.field3452;
        if (var10 == null) {
            return null;
        } else if (var9.field3456 == 2) {
            class130.method968(arg2, (byte) 114, var10);
            return null;
        } else {
            return var10;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V", line = 130)
    public static void method1046(int arg0) {
        if (arg0 == -1) {
            field2209 = (int[][]) null;
        }
    }
}
