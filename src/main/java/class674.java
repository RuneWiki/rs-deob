import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public abstract class class674 extends class381 {

    @OriginalMember(owner = "client!on", name = "s", descriptor = "I")
    public int field9476 = 2;

    @OriginalMember(owner = "client!on", name = "j", descriptor = "Z")
    public boolean field9467 = true;

    @OriginalMember(owner = "client!on", name = "q", descriptor = "I")
    public int field9474 = 2;

    @OriginalMember(owner = "client!on", name = "r", descriptor = "Z")
    public boolean field9475 = true;

    @OriginalMember(owner = "client!on", name = "y", descriptor = "Z")
    public boolean field9482 = true;

    @OriginalMember(owner = "client!on", name = "o", descriptor = "Z")
    public boolean field9472 = true;

    @OriginalMember(owner = "client!on", name = "p", descriptor = "Z")
    public boolean field9473 = false;

    @OriginalMember(owner = "client!on", name = "A", descriptor = "Z")
    public boolean field9484 = true;

    @OriginalMember(owner = "client!on", name = "w", descriptor = "Z")
    public boolean field9480 = true;

    @OriginalMember(owner = "client!on", name = "i", descriptor = "I")
    public int field9466 = 3;

    @OriginalMember(owner = "client!on", name = "H", descriptor = "I")
    public int field9490 = 0;

    @OriginalMember(owner = "client!on", name = "E", descriptor = "Z")
    public boolean field9487 = true;

    @OriginalMember(owner = "client!on", name = "u", descriptor = "I")
    public int field9478 = 0;

    @OriginalMember(owner = "client!on", name = "D", descriptor = "I")
    public int field9486 = 127;

    @OriginalMember(owner = "client!on", name = "h", descriptor = "Z")
    public boolean field9465 = false;

    @OriginalMember(owner = "client!on", name = "n", descriptor = "I")
    public int field9471 = 127;

    @OriginalMember(owner = "client!on", name = "x", descriptor = "I")
    public int field9481 = 0;

    @OriginalMember(owner = "client!on", name = "K", descriptor = "I")
    public int field9493 = 2;

    @OriginalMember(owner = "client!on", name = "v", descriptor = "I")
    public int field9479 = 127;

    @OriginalMember(owner = "client!on", name = "O", descriptor = "Z")
    public boolean field9497 = true;

    @OriginalMember(owner = "client!on", name = "G", descriptor = "I")
    public int field9489 = 0;

    @OriginalMember(owner = "client!on", name = "P", descriptor = "I")
    public int field9498 = 0;

    @OriginalMember(owner = "client!on", name = "M", descriptor = "I")
    public int field9495 = 127;

    @OriginalMember(owner = "client!on", name = "J", descriptor = "I")
    public int field9492 = 0;

    @OriginalMember(owner = "client!on", name = "U", descriptor = "I")
    public int field9503 = 1;

    @OriginalMember(owner = "client!on", name = "S", descriptor = "I")
    public int field9501 = 3;

    @OriginalMember(owner = "client!on", name = "T", descriptor = "I")
    public int field9502 = 0;

    @OriginalMember(owner = "client!on", name = "W", descriptor = "I")
    public int field9505 = 0;

    @OriginalMember(owner = "client!on", name = "L", descriptor = "Z")
    public boolean field9494 = false;

    @OriginalMember(owner = "client!on", name = "Y", descriptor = "I")
    public int field9507 = 127;

    @OriginalMember(owner = "client!on", name = "I", descriptor = "Z")
    public boolean field9491 = true;

    @OriginalMember(owner = "client!on", name = "z", descriptor = "I")
    public int field9483 = 2;

    @OriginalMember(owner = "client!on", name = "V", descriptor = "Z")
    public boolean field9504 = true;

    @OriginalMember(owner = "client!on", name = "Z", descriptor = "Z")
    public boolean field9508 = true;

    @OriginalMember(owner = "client!on", name = "X", descriptor = "Z")
    public boolean field9506 = true;

    @OriginalMember(owner = "client!on", name = "B", descriptor = "I")
    public int field9485 = 0;

    @OriginalMember(owner = "client!on", name = "l", descriptor = "I")
    public static int field9469;

    @OriginalMember(owner = "client!on", name = "m", descriptor = "I")
    public static int field9470;

    @OriginalMember(owner = "client!on", name = "t", descriptor = "I")
    public static int field9477;

    @OriginalMember(owner = "client!on", name = "F", descriptor = "I")
    public static int field9488;

    @OriginalMember(owner = "client!on", name = "R", descriptor = "I")
    public static int field9500;

    @OriginalMember(owner = "client!on", name = "ab", descriptor = "Lmv;")
    public static class295 field9509;

    @OriginalMember(owner = "client!on", name = "k", descriptor = "Z")
    public boolean field9468;

    @OriginalMember(owner = "client!on", name = "N", descriptor = "Z")
    public boolean field9496;

    @OriginalMember(owner = "client!on", name = "Q", descriptor = "Z")
    public boolean field9499;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(IBI)V")
    public final void method3782(int arg0, byte arg1, int arg2) {
        if (arg1 >= -70) {
            return;
        }
        field9500++;
        if (class287.method1726(2097152, arg0)) {
            this.field9493 = arg2;
        } else {
            this.field9492 = arg2;
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(IZI)V")
    public final void method3783(int arg0, boolean arg1, int arg2) {
        if (class287.method1726(2097152, arg2)) {
            this.field9468 = arg1;
        } else {
            this.field9496 = arg1;
        }
        field9469++;
        if (arg0 != 26488) {
            this.field9495 = 3;
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(B)V")
    public static void method3784(byte arg0) {
        field9509 = null;
        if (arg0 != -35) {
            method3784((byte) -79);
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(II)Z")
    public final boolean method3785(int arg0, int arg1) {
        field9470++;
        if (arg1 == 3) {
            return class287.method1726(2097152, arg0) ? this.field9468 : this.field9496;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(IZ)I")
    public final int method3786(int arg0, boolean arg1) {
        if (arg1) {
            method3784((byte) 30);
        }
        field9488++;
        return class287.method1726(2097152, arg0) ? this.field9493 : this.field9492;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(ILgk;)V")
    public final void method3787(int arg0, class540 arg1) {
        field9477++;
        arg1.method3110(22, 94);
        arg1.method3110(this.field9501, 108);
        arg1.method3110(this.field9472 ? 1 : 0, 79);
        arg1.method3110(this.field9482 ? 1 : 0, 62);
        arg1.method3110(this.field9480 ? 1 : 0, 105);
        arg1.method3110(this.field9484 ? 1 : 0, 97);
        arg1.method3110(0, 118);
        arg1.method3110(this.field9467 ? 1 : 0, 58);
        arg1.method3110(this.field9497 ? 1 : 0, 78);
        arg1.method3110(this.field9506 ? 1 : 0, 75);
        arg1.method3110(this.field9493, 92);
        arg1.method3110(this.field9492, 112);
        arg1.method3110(this.field9468 ? 1 : 0, 81);
        arg1.method3110(this.field9496 ? 1 : 0, 46);
        arg1.method3110(this.field9491 ? 1 : 0, 81);
        arg1.method3110(this.field9487 ? 1 : 0, 74);
        arg1.method3110(this.field9478, 112);
        arg1.method3110(this.field9504 ? 1 : 0, 33);
        arg1.method3110(this.field9495, 113);
        arg1.method3110(this.field9479, 98);
        arg1.method3110(this.field9471, 58);
        arg1.method3110(this.field9507, 72);
        arg1.method3110(this.field9486, 52);
        int var3 = -128 % ((arg0 + 37) / 61);
        arg1.method3162(-2003712696, this.field9505);
        arg1.method3162(-2003712696, this.field9490);
        arg1.method3110(class308.method1924(-21558), 80);
        arg1.method3146(this.field9498, -94);
        arg1.method3110(this.field9474, 105);
        arg1.method3110(this.field9494 ? 1 : 0, 106);
        arg1.method3110(this.field9499 ? 1 : 0, 41);
        arg1.method3110(this.field9481, 55);
        arg1.method3110(this.field9473 ? 1 : 0, 100);
        arg1.method3110(this.field9508 ? 1 : 0, 125);
        arg1.method3110(this.field9503, 70);
        arg1.method3110(this.field9475 ? 1 : 0, 63);
        arg1.method3110(this.field9483, 81);
        arg1.method3110(this.field9476, 42);
        arg1.method3110(this.field9465 ? 1 : 0, 58);
        arg1.method3110(this.field9466, 104);
        arg1.method3110(this.field9489, 67);
        arg1.method3110(this.field9502, 105);
    }
}
