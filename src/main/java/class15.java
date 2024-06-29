import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class15 {

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "[S")
    public static short[] field146 = new short[256];

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "[I")
    public static int[] field145 = new int[] { 28, 35, 40, 44 };

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "I")
    public static int field148 = 0;

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "I")
    public static int field147;

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "I")
    public static int field149;

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "I")
    public static int field151;

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "Z")
    public static boolean field150;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Z)V", line = 39)
    public static void method84(boolean arg0) {
        field145 = null;
        if (arg0) {
            method85(50, null, (byte) -109);
        }
        field146 = null;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILwv;B)V", line = 57)
    public static final void method85(int arg0, class32 arg1, byte arg2) {
        field151++;
        int var3 = -1;
        int var4 = 0;
        if (class665.field9027 < arg1.field470) {
            class311.method1831((byte) 113, arg1);
        } else if (arg1.field445 >= class665.field9027) {
            class596.method3293((byte) -118, arg1);
        } else {
            class382.method2197(true, arg1, false);
            var4 = class318.field3987;
            var3 = class174.field2037;
        }
        if (arg1.field8018 < 512 || arg1.field8011 < 512 || arg1.field8018 >= (class85.field1090 - 1) * 512 || class656.field8932 * 512 - 512 <= arg1.field8011) {
            arg1.field445 = 0;
            arg1.field429 = -1;
            var4 = 0;
            arg1.field470 = 0;
            arg1.field492 = -1;
            arg1.field447 = -1;
            var3 = -1;
            arg1.field448 = null;
            arg1.field8018 = arg1.field508[0] * 512 + (arg1.method210(false) * 256);
            arg1.field8011 = arg1.field511[0] * 512 + (arg1.method210(false) * 256);
            arg1.method213(true);
        }
        if (arg2 != 55) {
            field150 = false;
        }
        if (class67.field815 == arg1 && (arg1.field8018 < 6144 || arg1.field8011 < 6144 || (class85.field1090 * 512 - 6144) <= arg1.field8018 || ((class656.field8932 - 12) * 512) <= arg1.field8011)) {
            arg1.field445 = 0;
            arg1.field448 = null;
            arg1.field492 = -1;
            var4 = 0;
            arg1.field429 = -1;
            arg1.field447 = -1;
            var3 = -1;
            arg1.field470 = 0;
            arg1.field8018 = arg1.field508[0] * 512 + arg1.method210(false) * 256;
            arg1.field8011 = arg1.field511[0] * 512 + (arg1.method210(false) * 256);
            arg1.method213(true);
        }
        int var5 = class667.method3708(arg1, (byte) 87);
        class62.method509(var5, var4, var3, 0, arg1);
        class696.method3848(arg1, var3, arg2 ^ 0x37);
        class488.method2653(arg1, 109);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(III)Z", line = 129)
    public static final boolean method86(int arg0, int arg1, int arg2) {
        field149++;
        if (arg0 <= 66) {
            return true;
        } else {
            return class549.method2935((byte) -51, arg2, arg1) | (arg2 & 0x70000) != 0 || class20.method124(arg2, 23008, arg1);
        }
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(III)Z", line = 160)
    public static final boolean method87(int arg0, int arg1, int arg2) {
        if (arg2 == 256) {
            field147++;
            return class448.method2446(arg0, arg1, arg2 - 135) | (arg0 & 0x40000) != 0 || class273.method1626((byte) -50, arg0, arg1);
        } else {
            return true;
        }
    }
}
