import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public abstract class class203 extends class61 {

    @OriginalMember(owner = "client!bg", name = "E", descriptor = "Lwm;")
    public static class152 field3273 = class157.method1048("::serverjs5drop", 94);

    @OriginalMember(owner = "client!bg", name = "G", descriptor = "Lfd;")
    public static class243 field3275 = new class243(64);

    @OriginalMember(owner = "client!bg", name = "S", descriptor = "[J")
    public static long[] field3287 = new long[32];

    @OriginalMember(owner = "client!bg", name = "T", descriptor = "Lwm;")
    public static class152 field3288 = class157.method1048("<col=ff0000>", 95);

    @OriginalMember(owner = "client!bg", name = "Q", descriptor = "Lek;")
    public static class183 field3285 = new class183();

    @OriginalMember(owner = "client!bg", name = "F", descriptor = "I")
    public static int field3274;

    @OriginalMember(owner = "client!bg", name = "H", descriptor = "I")
    public static int field3276;

    @OriginalMember(owner = "client!bg", name = "J", descriptor = "I")
    public int field3278;

    @OriginalMember(owner = "client!bg", name = "K", descriptor = "I")
    public static int field3279;

    @OriginalMember(owner = "client!bg", name = "L", descriptor = "I")
    public int field3280;

    @OriginalMember(owner = "client!bg", name = "M", descriptor = "I")
    public int field3281;

    @OriginalMember(owner = "client!bg", name = "N", descriptor = "I")
    public int field3282;

    @OriginalMember(owner = "client!bg", name = "O", descriptor = "I")
    public int field3283;

    @OriginalMember(owner = "client!bg", name = "P", descriptor = "I")
    public int field3284;

    @OriginalMember(owner = "client!bg", name = "U", descriptor = "I")
    public static int field3289;

    @OriginalMember(owner = "client!bg", name = "R", descriptor = "[I")
    public static int[] field3286;

    @OriginalMember(owner = "client!bg", name = "I", descriptor = "[Lbg;")
    public static class203[] field3277;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIII)V", line = 21)
    public final void method1341(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 2) {
            this.method1341(-56, -87, 63, -21, 49);
        }
        int var6 = this.field3283 << 3;
        int var7 = (arg2 << 4) + (var6 & 0xF);
        int var8 = this.field3278 << 3;
        int var9 = (arg4 << 4) + (var8 & 0xF);
        this.method434(var6, var8, var7, var9, arg3, arg1);
        field3274++;
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(B)V", line = 43)
    public static void method1342(byte arg0) {
        field3287 = null;
        field3288 = null;
        field3273 = null;
        int var1 = 59 / ((arg0 + 49) / 46);
        field3285 = null;
        field3286 = null;
        field3275 = null;
        field3277 = null;
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(II)V", line = 58)
    public static final void method1343(int arg0, int arg1) {
        field3276++;
        if (arg1 != -1167351037) {
            method1343(-41, -97);
        }
        class303 var2 = class90.method589(false, arg0, 1);
        var2.method2114((byte) 112);
    }

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "(I)V", line = 102)
    public static final void method1344(int arg0) {
        class73.field1058.method1068(8);
        field3279++;
        int var1 = class73.field1058.method1075(false, 1);
        if (var1 == 0) {
            return;
        }
        int var2 = class73.field1058.method1075(false, 2);
        if (var2 == 0) {
            class235.field3851[class238.field3912++] = 2047;
        } else if (~var2 == arg0) {
            int var11 = class73.field1058.method1075(false, 3);
            class85.field1176.method1702(1, (byte) -54, var11);
            int var12 = class73.field1058.method1075(false, 1);
            if (var12 == 1) {
                class235.field3851[class238.field3912++] = 2047;
            }
        } else if (var2 == 2) {
            if (class73.field1058.method1075(false, 1) == 1) {
                int var3 = class73.field1058.method1075(false, 3);
                class85.field1176.method1702(2, (byte) 124, var3);
                int var4 = class73.field1058.method1075(false, 3);
                class85.field1176.method1702(2, (byte) -107, var4);
            } else {
                int var5 = class73.field1058.method1075(false, 3);
                class85.field1176.method1702(0, (byte) -20, var5);
            }
            int var6 = class73.field1058.method1075(false, 1);
            if (var6 == 1) {
                class235.field3851[class238.field3912++] = 2047;
            }
        } else if (var2 == 3) {
            int var7 = class73.field1058.method1075(false, 7);
            int var8 = class73.field1058.method1075(false, 1);
            if (var8 == 1) {
                class235.field3851[class238.field3912++] = 2047;
            }
            int var9 = class73.field1058.method1075(false, 1);
            class23.field400 = class73.field1058.method1075(false, 2);
            int var10 = class73.field1058.method1075(false, 7);
            class85.field1176.method60(arg0 ^ 0xFFFFFFFD, var7, var10, var9 == 1);
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIII)V")
    public abstract void method428(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(II)V")
    public abstract void method435(int arg0, int arg1);

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIIII)V")
    public abstract void method434(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(III)V")
    public abstract void method438(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(IIIII)V")
    public abstract void method427(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "(II)V")
    public abstract void method429(int arg0, int arg1);

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "(II)V")
    public abstract void method436(int arg0, int arg1);
}
