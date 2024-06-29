import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jga")
public abstract class class667 extends class401 {

    @OriginalMember(owner = "client!jga", name = "n", descriptor = "Z")
    public boolean field9340 = false;

    @OriginalMember(owner = "client!jga", name = "r", descriptor = "Z")
    public boolean field9344 = false;

    @OriginalMember(owner = "client!jga", name = "o", descriptor = "I")
    public int field9341 = 0;

    @OriginalMember(owner = "client!jga", name = "u", descriptor = "I")
    public int field9347 = 0;

    @OriginalMember(owner = "client!jga", name = "B", descriptor = "Z")
    public boolean field9354 = true;

    @OriginalMember(owner = "client!jga", name = "C", descriptor = "I")
    public int field9355 = 0;

    @OriginalMember(owner = "client!jga", name = "E", descriptor = "Z")
    public boolean field9357 = true;

    @OriginalMember(owner = "client!jga", name = "H", descriptor = "I")
    public int field9359 = 127;

    @OriginalMember(owner = "client!jga", name = "O", descriptor = "Z")
    public boolean field9366 = true;

    @OriginalMember(owner = "client!jga", name = "A", descriptor = "Z")
    public boolean field9353 = true;

    @OriginalMember(owner = "client!jga", name = "s", descriptor = "I")
    public int field9345 = 3;

    @OriginalMember(owner = "client!jga", name = "L", descriptor = "I")
    public int field9363 = 3;

    @OriginalMember(owner = "client!jga", name = "v", descriptor = "Z")
    public boolean field9348 = true;

    @OriginalMember(owner = "client!jga", name = "N", descriptor = "Z")
    public boolean field9365 = true;

    @OriginalMember(owner = "client!jga", name = "I", descriptor = "I")
    public int field9360 = 1;

    @OriginalMember(owner = "client!jga", name = "D", descriptor = "Z")
    public boolean field9356 = true;

    @OriginalMember(owner = "client!jga", name = "Q", descriptor = "I")
    public int field9368 = 0;

    @OriginalMember(owner = "client!jga", name = "y", descriptor = "Z")
    public boolean field9351 = true;

    @OriginalMember(owner = "client!jga", name = "K", descriptor = "Z")
    public boolean field9362 = false;

    @OriginalMember(owner = "client!jga", name = "V", descriptor = "I")
    public int field9372 = 2;

    @OriginalMember(owner = "client!jga", name = "X", descriptor = "I")
    public int field9374 = 0;

    @OriginalMember(owner = "client!jga", name = "Y", descriptor = "Z")
    public boolean field9375 = true;

    @OriginalMember(owner = "client!jga", name = "J", descriptor = "I")
    public int field9361 = 0;

    @OriginalMember(owner = "client!jga", name = "R", descriptor = "I")
    public int field9369 = 2;

    @OriginalMember(owner = "client!jga", name = "j", descriptor = "I")
    public int field9336 = 0;

    @OriginalMember(owner = "client!jga", name = "T", descriptor = "I")
    public int field9370 = 2;

    @OriginalMember(owner = "client!jga", name = "Z", descriptor = "Z")
    public boolean field9376 = true;

    @OriginalMember(owner = "client!jga", name = "G", descriptor = "I")
    public int field9358 = 0;

    @OriginalMember(owner = "client!jga", name = "W", descriptor = "Z")
    public boolean field9373 = true;

    @OriginalMember(owner = "client!jga", name = "U", descriptor = "Z")
    public boolean field9371 = true;

    @OriginalMember(owner = "client!jga", name = "db", descriptor = "I")
    public int field9380 = 2;

    @OriginalMember(owner = "client!jga", name = "t", descriptor = "I")
    public int field9346 = 127;

    @OriginalMember(owner = "client!jga", name = "z", descriptor = "I")
    public int field9352 = 127;

    @OriginalMember(owner = "client!jga", name = "M", descriptor = "I")
    public int field9364 = 127;

    @OriginalMember(owner = "client!jga", name = "ab", descriptor = "I")
    public int field9377 = 0;

    @OriginalMember(owner = "client!jga", name = "eb", descriptor = "I")
    public int field9381 = 127;

    @OriginalMember(owner = "client!jga", name = "q", descriptor = "Lem;")
    public static class206 field9343 = new class206(31, -1);

    @OriginalMember(owner = "client!jga", name = "bb", descriptor = "[I")
    public static int[] field9378 = new int[4096];

    @OriginalMember(owner = "client!jga", name = "l", descriptor = "I")
    public static int field9338;

    @OriginalMember(owner = "client!jga", name = "p", descriptor = "I")
    public static int field9342;

    @OriginalMember(owner = "client!jga", name = "w", descriptor = "I")
    public static int field9349;

    @OriginalMember(owner = "client!jga", name = "x", descriptor = "I")
    public static int field9350;

    @OriginalMember(owner = "client!jga", name = "cb", descriptor = "I")
    public static int field9379;

    @OriginalMember(owner = "client!jga", name = "k", descriptor = "Z")
    public boolean field9337;

    @OriginalMember(owner = "client!jga", name = "m", descriptor = "Z")
    public boolean field9339;

    @OriginalMember(owner = "client!jga", name = "P", descriptor = "Z")
    public boolean field9367;

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field9378[var0] = class24.method241(var0, (byte) 118);
        }
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(IB)Z", line = 18)
    public final boolean method3766(int arg0, byte arg1) {
        field9379++;
        if (arg1 > -45) {
            this.field9364 = 83;
        }
        return class7.method24((byte) 98, arg0) ? this.field9339 : this.field9337;
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(I)V", line = 43)
    public static void method3767(int arg0) {
        int var1 = -96 / ((arg0 + 15) / 46);
        field9378 = null;
        field9343 = null;
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(BLac;)V", line = 65)
    public final void method3768(byte arg0, class501 arg1) {
        arg1.method2817(22, true);
        field9349++;
        arg1.method2817(this.field9345, true);
        arg1.method2817(this.field9376 ? 1 : 0, true);
        arg1.method2817(this.field9365 ? 1 : 0, true);
        arg1.method2817(this.field9373 ? 1 : 0, true);
        arg1.method2817(this.field9371 ? 1 : 0, true);
        arg1.method2817(0, true);
        arg1.method2817(this.field9375 ? 1 : 0, true);
        arg1.method2817(this.field9366 ? 1 : 0, true);
        arg1.method2817(this.field9351 ? 1 : 0, true);
        if (arg0 != 75) {
            this.method3766(71, (byte) 76);
        }
        arg1.method2817(this.field9369, true);
        arg1.method2817(this.field9358, true);
        arg1.method2817(this.field9339 ? 1 : 0, true);
        arg1.method2817(this.field9337 ? 1 : 0, true);
        arg1.method2817(this.field9353 ? 1 : 0, true);
        arg1.method2817(this.field9348 ? 1 : 0, true);
        arg1.method2817(this.field9377, true);
        arg1.method2817(this.field9354 ? 1 : 0, true);
        arg1.method2817(this.field9346, true);
        arg1.method2817(this.field9381, true);
        arg1.method2817(this.field9352, true);
        arg1.method2817(this.field9364, true);
        arg1.method2817(this.field9359, true);
        arg1.method2837(this.field9355, -2);
        arg1.method2837(this.field9374, -2);
        arg1.method2817(class546.method3073(arg0 - 73), true);
        arg1.method2836(this.field9361, -22164);
        arg1.method2817(this.field9370, true);
        arg1.method2817(this.field9362 ? 1 : 0, true);
        arg1.method2817(this.field9367 ? 1 : 0, true);
        arg1.method2817(this.field9368, true);
        arg1.method2817(this.field9340 ? 1 : 0, true);
        arg1.method2817(this.field9357 ? 1 : 0, true);
        arg1.method2817(this.field9360, true);
        arg1.method2817(this.field9356 ? 1 : 0, true);
        arg1.method2817(this.field9372, true);
        arg1.method2817(this.field9380, true);
        arg1.method2817(this.field9344 ? 1 : 0, true);
        arg1.method2817(this.field9363, true);
        arg1.method2817(this.field9341, true);
        arg1.method2817(this.field9336, true);
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(IZI)V", line = 116)
    public final void method3769(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            this.field9341 = 98;
        }
        field9342++;
        if (class7.method24((byte) 98, arg2)) {
            this.field9369 = arg0;
        } else {
            this.field9358 = arg0;
        }
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(IZ)I", line = 140)
    public final int method3770(int arg0, boolean arg1) {
        field9350++;
        if (!arg1) {
            this.field9339 = false;
        }
        return class7.method24((byte) 98, arg0) ? this.field9369 : this.field9358;
    }

    @OriginalMember(owner = "client!jga", name = "b", descriptor = "(IZI)V", line = 169)
    public final void method3771(int arg0, boolean arg1, int arg2) {
        field9338++;
        if (arg0 != 127) {
            this.field9373 = false;
        }
        if (class7.method24((byte) 98, arg2)) {
            this.field9339 = arg1;
        } else {
            this.field9337 = arg1;
        }
    }
}
