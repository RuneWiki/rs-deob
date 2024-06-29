import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class39 implements class175 {

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "I")
    public static int field603 = 0;

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "Lmh;")
    public static class62 field606 = class201.method1405(true, "Mem:");

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "Lmh;")
    public static class62 field607 = class201.method1405(true, "_labels");

    @OriginalMember(owner = "client!gj", name = "j", descriptor = "[I")
    public static int[] field609 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "[I")
    public static int[] field604 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!gj", name = "l", descriptor = "Lmh;")
    public static class62 field611 = class201.method1405(true, "(U5");

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "I")
    public static int field600;

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "I")
    public static int field602;

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!gj", name = "k", descriptor = "I")
    public static int field610;

    @OriginalMember(owner = "client!gj", name = "i", descriptor = "[I")
    public static int[] field608;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)V", line = 6)
    public static void method264(int arg0) {
        field604 = null;
        if (arg0 != -31576) {
            return;
        }
        field611 = null;
        field608 = null;
        field606 = null;
        field609 = null;
        field607 = null;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "()V", line = 21)
    public static final void method265() {
        GL var0 = class154.field2479;
        var0.glDisableClientState(32886);
        class154.method1113(false);
        var0.glDisable(2929);
        var0.glPushAttrib(128);
        var0.glFogf(2915, 3072.0F);
        class154.method1106();
        for (int var1 = 0; var1 < class73.field1124[0].length; var1++) {
            class224 var2 = class73.field1124[0][var1];
            if (var2.field3916 >= 0 && class23.field248.method192(var2.field3916, 255) == 4) {
                var0.glColor4fv(class238.method1675((byte) 90, var2.field3910), 0);
                float var3 = 201.5F - (var2.field3890 ? 1.0F : 0.5F);
                var2.method1593(class256.field4320, var3, true);
            }
        }
        var0.glEnableClientState(32886);
        class154.method1122();
        var0.glEnable(2929);
        var0.glPopAttrib();
        class154.method1132();
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIIIIII)V", line = 56)
    public static final void method266(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field601++;
        int var8 = class4.method17(class99.field1630, -16168, class81.field1348, arg6);
        int var9 = class4.method17(class99.field1630, arg0 - 540455, class81.field1348, arg7);
        int var10 = class4.method17(class176.field2819, -16168, class52.field755, arg1);
        int var11 = class4.method17(class176.field2819, arg0 ^ 0xFFF83F27, class52.field755, arg5);
        int var12 = class4.method17(class99.field1630, -16168, class81.field1348, arg3 + arg6);
        int var13 = class4.method17(class99.field1630, arg0 - 540455, class81.field1348, arg7 - arg3);
        for (int var14 = var8; var14 < var12; var14++) {
            class271.method1861(arg2, true, class282.field4817[var14], var11, var10);
        }
        if (arg0 != 524287) {
            return;
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class271.method1861(arg2, true, class282.field4817[var15], var11, var10);
        }
        int var16 = class4.method17(class176.field2819, -16168, class52.field755, arg1 + arg3);
        int var17 = class4.method17(class176.field2819, arg0 - 540455, class52.field755, arg5 - arg3);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class282.field4817[var18];
            class271.method1861(arg2, true, var19, var16, var10);
            class271.method1861(arg4, true, var19, var17, var16);
            class271.method1861(arg2, true, var19, var11, var17);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "([IBIJ)Lmh;", line = 128)
    public final class62 method267(int[] arg0, byte arg1, int arg2, long arg3) {
        if (arg1 < 29) {
            method266(30, -46, 21, 0, 99, -86, 27, 86);
        }
        field610++;
        if (arg2 == 0) {
            class56 var6 = class163.method1178(arg0[0], 64);
            return var6.method370((int) arg3, 1);
        } else if (arg2 == 1 || arg2 == 10) {
            class37 var7 = class189.method1320(0, (int) arg3);
            return var7.field541;
        } else if (arg2 == 6 || arg2 == 7) {
            return class163.method1178(arg0[0], 64).method370((int) arg3, 1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(ZIILmh;SJLmh;)V", line = 158)
    public static final void method268(boolean arg0, int arg1, int arg2, class62 arg3, short arg4, long arg5, class62 arg6) {
        field600++;
        if (class80.field1341) {
            return;
        }
        if (!arg0) {
            method269((byte) -17);
        }
        if (class195.field3293 >= 500) {
            return;
        }
        class146.field2317[class195.field3293] = arg3;
        class244.field4151[class195.field3293] = arg6;
        class286.field4892[class195.field3293] = arg4;
        class144.field2297[class195.field3293] = arg5;
        class212.field3557[class195.field3293] = arg1;
        class109.field1766[class195.field3293] = arg2;
        class195.field3293++;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(B)V", line = 186)
    public static final void method269(byte arg0) {
        class119.field1999.method1442((byte) -123);
        field602++;
        if (arg0 != -10) {
            method264(100);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIB)I", line = 205)
    public static final int method270(int arg0, int arg1, byte arg2) {
        if (arg2 <= 32) {
            method270(127, -123, (byte) 124);
        }
        field605++;
        int var3 = class304.method2083(arg0 - 1, 85, arg1 - 1) + class304.method2083(arg0 - 1, 112, arg1 + 1) - (-class304.method2083(arg0 - -1, 92, arg1 + -1) + -class304.method2083(arg0 + 1, 104, arg1 + 1));
        int var4 = class304.method2083(arg0, 61, arg1 - 1) - (-class304.method2083(arg0, 29, arg1 + 1) - (class304.method2083(arg0 - 1, 65, arg1) + class304.method2083(arg0 + 1, 64, arg1)));
        int var5 = class304.method2083(arg0, 29, arg1);
        return var5 / 4 + var3 / 16 + var4 / 8;
    }
}
