import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class3 extends class317 {

    @OriginalMember(owner = "client!pd", name = "v", descriptor = "Z")
    public static boolean field6 = true;

    @OriginalMember(owner = "client!pd", name = "y", descriptor = "I")
    public static int field9 = 0;

    @OriginalMember(owner = "client!pd", name = "w", descriptor = "Ljava/util/Random;")
    public static Random field7 = new Random();

    @OriginalMember(owner = "client!pd", name = "B", descriptor = "I")
    public static int field12 = 0;

    @OriginalMember(owner = "client!pd", name = "A", descriptor = "I")
    public static int field11 = 0;

    @OriginalMember(owner = "client!pd", name = "D", descriptor = "I")
    public static int field14 = 0;

    @OriginalMember(owner = "client!pd", name = "z", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!pd", name = "s", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!pd", name = "t", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!pd", name = "u", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!pd", name = "x", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!pd", name = "C", descriptor = "[S")
    public static short[] field13;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IBIIIILek;I)V", line = 8)
    public static final void method35(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, class184 arg6, int arg7) {
        if (arg1 != 122) {
            field6 = false;
        }
        if (class255.field3813) {
            class255.field3804 = 32;
        } else {
            class255.field3804 = 0;
        }
        class255.field3813 = false;
        field4++;
        if (class31.field400 != 0) {
            if (arg2 <= arg0 && arg0 < (arg2 + 16) && arg4 >= arg7 && arg4 < arg7 + 16) {
                arg6.field2808 -= 4;
                class133.method1007(arg6, 127);
            } else if (arg0 >= arg2 && arg0 < (arg2 + 16) && arg4 >= arg3 + arg7 - 16 && (arg3 + arg7) > arg4) {
                arg6.field2808 += 4;
                class133.method1007(arg6, 121);
            } else if ((arg2 - class255.field3804) <= arg0 && arg0 < arg2 + class255.field3804 + 16 && arg7 + 16 <= arg4 && (arg7 + arg3 - 16) > arg4) {
                int var8 = (arg3 - 32) * arg3 / arg5;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg4 - (var8 / 2) - arg7 - 16;
                int var10 = arg3 - var8 - 32;
                arg6.field2808 = (arg5 - arg3) * var9 / var10;
                class133.method1007(arg6, arg1 ^ 0x40);
                class255.field3813 = true;
            }
        }
        if (class109.field1715 == 0) {
            return;
        }
        int var11 = arg6.field2890;
        if ((arg2 - var11) <= arg0 && arg4 >= arg7 && arg2 + 16 > arg0 && (arg7 + arg3) >= arg4) {
            arg6.field2808 += class109.field1715 * 45;
            class133.method1007(arg6, 92);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(III)Lwg;", line = 75)
    public static final class290 method36(int arg0, int arg1, int arg2) {
        class99 var3 = class250.field3746[arg0][arg1][arg2];
        return var3 == null ? null : var3.field1474;
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(III)Lbb;", line = 87)
    public static final class91 method37(int arg0, int arg1, int arg2) {
        class99 var3 = class250.field3746[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field1488; var4++) {
            class91 var5 = var3.field1471[var4];
            if ((var5.field1327 >> 29 & 0x3L) == 2L && var5.field1329 == arg1 && var5.field1323 == arg2) {
                class293.method2068(var5);
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)V", line = 121)
    public static final void method38(byte arg0) {
        class58.field862.method1428(arg0 + 11015);
        field8++;
        if (arg0 != -80) {
            field7 = (Random) null;
        }
        class146.field2223.method1428(10935);
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(B)V", line = 152)
    public static void method39(byte arg0) {
        field7 = null;
        if (arg0 > -100) {
            field10 = 79;
        }
        field13 = null;
    }
}
