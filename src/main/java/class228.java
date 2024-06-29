import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public abstract class class228 {

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "I")
    public int field3316 = 0;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "Z")
    public boolean field3314 = true;

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "Z")
    public boolean field3317 = true;

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "Z")
    public boolean field3320 = true;

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "Z")
    public boolean field3315 = true;

    @OriginalMember(owner = "client!dj", name = "j", descriptor = "Z")
    public boolean field3323 = true;

    @OriginalMember(owner = "client!dj", name = "n", descriptor = "I")
    public int field3327 = 1;

    @OriginalMember(owner = "client!dj", name = "r", descriptor = "I")
    public int field3331 = 2;

    @OriginalMember(owner = "client!dj", name = "x", descriptor = "I")
    public int field3337 = 0;

    @OriginalMember(owner = "client!dj", name = "o", descriptor = "I")
    public int field3328 = 0;

    @OriginalMember(owner = "client!dj", name = "y", descriptor = "Z")
    public boolean field3338 = false;

    @OriginalMember(owner = "client!dj", name = "i", descriptor = "I")
    public int field3322 = 0;

    @OriginalMember(owner = "client!dj", name = "k", descriptor = "I")
    public int field3324 = 0;

    @OriginalMember(owner = "client!dj", name = "t", descriptor = "Z")
    public boolean field3333 = true;

    @OriginalMember(owner = "client!dj", name = "v", descriptor = "I")
    public int field3335 = 0;

    @OriginalMember(owner = "client!dj", name = "D", descriptor = "Z")
    public boolean field3343 = false;

    @OriginalMember(owner = "client!dj", name = "p", descriptor = "I")
    public int field3329 = 2;

    @OriginalMember(owner = "client!dj", name = "u", descriptor = "I")
    public int field3334 = 255;

    @OriginalMember(owner = "client!dj", name = "q", descriptor = "I")
    public int field3330 = 3;

    @OriginalMember(owner = "client!dj", name = "L", descriptor = "I")
    public int field3350 = 127;

    @OriginalMember(owner = "client!dj", name = "H", descriptor = "I")
    public int field3347 = 2;

    @OriginalMember(owner = "client!dj", name = "F", descriptor = "I")
    public int field3345 = 2;

    @OriginalMember(owner = "client!dj", name = "M", descriptor = "I")
    public int field3351 = 0;

    @OriginalMember(owner = "client!dj", name = "K", descriptor = "I")
    public int field3349 = 127;

    @OriginalMember(owner = "client!dj", name = "z", descriptor = "Z")
    public boolean field3339 = true;

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "Z")
    public boolean field3321 = true;

    @OriginalMember(owner = "client!dj", name = "R", descriptor = "Z")
    public boolean field3356 = false;

    @OriginalMember(owner = "client!dj", name = "P", descriptor = "Z")
    public boolean field3354 = true;

    @OriginalMember(owner = "client!dj", name = "Q", descriptor = "Z")
    public boolean field3355 = true;

    @OriginalMember(owner = "client!dj", name = "O", descriptor = "Z")
    public boolean field3353 = true;

    @OriginalMember(owner = "client!dj", name = "I", descriptor = "Z")
    public boolean field3348 = true;

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "Z")
    public static boolean field3319 = false;

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "I")
    public static int field3318 = 0;

    @OriginalMember(owner = "client!dj", name = "m", descriptor = "F")
    public static float field3326;

    @OriginalMember(owner = "client!dj", name = "l", descriptor = "I")
    public static int field3325;

    @OriginalMember(owner = "client!dj", name = "s", descriptor = "I")
    public static int field3332;

    @OriginalMember(owner = "client!dj", name = "w", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!dj", name = "B", descriptor = "I")
    public static int field3341;

    @OriginalMember(owner = "client!dj", name = "C", descriptor = "I")
    public static int field3342;

    @OriginalMember(owner = "client!dj", name = "G", descriptor = "I")
    public static int field3346;

    @OriginalMember(owner = "client!dj", name = "A", descriptor = "Z")
    public boolean field3340;

    @OriginalMember(owner = "client!dj", name = "E", descriptor = "Z")
    public boolean field3344;

    @OriginalMember(owner = "client!dj", name = "N", descriptor = "Z")
    public boolean field3352;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IB)I")
    public final int method1536(int arg0, byte arg1) {
        if (arg1 != -28) {
            field3326 = 0.75827694F;
        }
        field3332++;
        return arg0 == 1 || arg0 == 3 ? this.field3329 : this.field3322;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Luu;I)V")
    public static final void method1537(class188 arg0, int arg1) {
        if (arg1 != 2) {
            field3319 = false;
        }
        if (arg0.field2727 == 5 && arg0.field2617 != -1) {
            class380.method2324(arg1 - 16777218, arg0, class225.field3300);
        }
        field3325++;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(III)V")
    public final void method1538(int arg0, int arg1, int arg2) {
        if (arg0 == 1 || arg0 == 3) {
            this.field3329 = arg2;
        } else {
            this.field3322 = arg2;
        }
        field3346++;
        if (arg1 != -4) {
            this.field3338 = false;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IZII)I")
    public static final int method1539(int arg0, boolean arg1, int arg2, int arg3) {
        field3341++;
        class110 var4 = class455.method2749(38, arg1, arg2);
        if (var4 == null) {
            return 0;
        } else if (arg3 == -1) {
            return 0;
        } else {
            if (arg0 != -10077) {
                field3318 = 13;
            }
            int var5 = 0;
            for (int var6 = 0; var6 < var4.field1555.length; var6++) {
                if (var4.field1558[var6] == arg3) {
                    var5 += var4.field1555[var6];
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)Z")
    public final boolean method1540(int arg0, int arg1) {
        field3336++;
        if (arg0 != 29083) {
            this.field3348 = true;
        }
        return arg1 == 1 || arg1 == 3 ? this.field3340 : this.field3344;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ZII)V")
    public final void method1541(boolean arg0, int arg1, int arg2) {
        if (arg1 > -63) {
            method1537(null, -102);
        }
        field3342++;
        if (arg2 == 1 || arg2 == 3) {
            this.field3340 = arg0;
        } else {
            this.field3344 = arg0;
        }
    }
}
