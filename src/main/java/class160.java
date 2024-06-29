import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ufa")
public class class160 extends class766 {

    @OriginalMember(owner = "client!ufa", name = "y", descriptor = "Z")
    public boolean field2485 = false;

    @OriginalMember(owner = "client!ufa", name = "w", descriptor = "Z")
    public boolean field2483 = true;

    @OriginalMember(owner = "client!ufa", name = "p", descriptor = "[I")
    public static int[] field2476 = new int[4];

    @OriginalMember(owner = "client!ufa", name = "n", descriptor = "I")
    public static int field2474;

    @OriginalMember(owner = "client!ufa", name = "o", descriptor = "I")
    public int field2475;

    @OriginalMember(owner = "client!ufa", name = "q", descriptor = "I")
    public int field2477;

    @OriginalMember(owner = "client!ufa", name = "r", descriptor = "I")
    public int field2478;

    @OriginalMember(owner = "client!ufa", name = "s", descriptor = "I")
    public int field2479;

    @OriginalMember(owner = "client!ufa", name = "u", descriptor = "I")
    public static int field2481;

    @OriginalMember(owner = "client!ufa", name = "v", descriptor = "I")
    public static int field2482;

    @OriginalMember(owner = "client!ufa", name = "x", descriptor = "I")
    public int field2484;

    @OriginalMember(owner = "client!ufa", name = "z", descriptor = "I")
    public int field2486;

    @OriginalMember(owner = "client!ufa", name = "A", descriptor = "I")
    public int field2487;

    @OriginalMember(owner = "client!ufa", name = "B", descriptor = "I")
    public int field2488;

    @OriginalMember(owner = "client!ufa", name = "C", descriptor = "I")
    public int field2489;

    @OriginalMember(owner = "client!ufa", name = "D", descriptor = "I")
    public int field2490;

    @OriginalMember(owner = "client!ufa", name = "t", descriptor = "Lpe;")
    public class685 field2480;

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(ILm;)I", line = 7)
    public static final int method1224(int arg0, class554 arg1) {
        field2482++;
        String var2 = class121.method1062((byte) 124, arg1);
        int[] var3 = null;
        if (arg0 != -11691) {
            return -44;
        }
        if (class662.method3711(25, arg1.field7682)) {
            var3 = class422.field5873.method2937((byte) -3, (int) arg1.field7693).field548;
        } else if (arg1.field7683 != -1) {
            var3 = class422.field5873.method2937((byte) -51, arg1.field7683).field548;
        } else if (class61.method628(-126, arg1.field7682)) {
            class647 var4 = (class647) class486.field6697.method4253((long) ((int) arg1.field7693), -1);
            if (var4 != null) {
                class506 var5 = var4.field9191;
                class179 var6 = var5.field6964;
                if (var6.field2683 != null) {
                    var6 = var6.method1304(class578.field8328, -25917);
                }
                if (var6 != null) {
                    var3 = var6.field2704;
                }
            }
        } else if (class506.method2959(arg1.field7682, (byte) -119)) {
            Object var7 = null;
            class416 var8;
            if (arg1.field7682 == 1006) {
                var8 = class312.field4418.method369((byte) 125, (int) arg1.field7693);
            } else {
                var8 = class312.field4418.method369((byte) 123, (int) (arg1.field7693 >>> 32 & 0x7FFFFFFFL));
            }
            if (var8.field5736 != null) {
                var8 = var8.method2458(class578.field8328, -1);
            }
            if (var8 != null) {
                var3 = var8.field5702;
            }
        }
        if (var3 != null) {
            var2 = var2 + class722.method4012(var3, 0);
        }
        int var9 = class675.field9477.method2746(var2, class312.field4420, true);
        if (arg1.field7686) {
            var9 += class315.field4468.method16() + 4;
        }
        return var9;
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(I)V", line = 86)
    public static void method1225(int arg0) {
        field2476 = null;
        if (arg0 != 4) {
            method1224(-56, null);
        }
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(III)Z", line = 96)
    public static final boolean method1226(int arg0, int arg1, int arg2) {
        field2481++;
        if (arg1 == 4) {
            return (arg0 & 0x70000) != 0 | class451.method2656(arg2, arg0, (byte) -115) || class518.method3030(arg0, arg2, -124);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ufa", name = "b", descriptor = "(I)[Luo;", line = 117)
    public static final class696[] method1227(int arg0) {
        field2474++;
        if (arg0 != 0) {
            method1224(-41, null);
        }
        return new class696[] { class260.field3680, class260.field3686, class260.field3687, class260.field3688, class260.field3689, class260.field3690, class260.field3691, class260.field3692, class260.field3693, class260.field3694, class260.field3695, class260.field3696 };
    }
}
