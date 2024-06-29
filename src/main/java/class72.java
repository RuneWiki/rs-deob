import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public abstract class class72 {

    @OriginalMember(owner = "client!me", name = "s", descriptor = "Z")
    public boolean field983 = true;

    @OriginalMember(owner = "client!me", name = "o", descriptor = "I")
    public int field979 = 0;

    @OriginalMember(owner = "client!me", name = "m", descriptor = "Z")
    public boolean field977 = false;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "I")
    public int field966 = 2;

    @OriginalMember(owner = "client!me", name = "k", descriptor = "Z")
    public boolean field975 = false;

    @OriginalMember(owner = "client!me", name = "h", descriptor = "I")
    public int field972 = 0;

    @OriginalMember(owner = "client!me", name = "D", descriptor = "Z")
    public boolean field994 = true;

    @OriginalMember(owner = "client!me", name = "A", descriptor = "Z")
    public boolean field991 = true;

    @OriginalMember(owner = "client!me", name = "x", descriptor = "Z")
    public boolean field988 = true;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "I")
    public int field967 = 0;

    @OriginalMember(owner = "client!me", name = "g", descriptor = "I")
    public int field971 = 0;

    @OriginalMember(owner = "client!me", name = "f", descriptor = "I")
    public int field970 = 2;

    @OriginalMember(owner = "client!me", name = "E", descriptor = "Z")
    public boolean field995 = true;

    @OriginalMember(owner = "client!me", name = "r", descriptor = "I")
    public int field982 = 0;

    @OriginalMember(owner = "client!me", name = "n", descriptor = "I")
    public int field978 = 1;

    @OriginalMember(owner = "client!me", name = "C", descriptor = "I")
    public int field993 = 0;

    @OriginalMember(owner = "client!me", name = "G", descriptor = "Z")
    public boolean field997 = false;

    @OriginalMember(owner = "client!me", name = "J", descriptor = "I")
    public int field1000 = 127;

    @OriginalMember(owner = "client!me", name = "I", descriptor = "I")
    public int field999 = 2;

    @OriginalMember(owner = "client!me", name = "K", descriptor = "I")
    public int field1001 = 2;

    @OriginalMember(owner = "client!me", name = "u", descriptor = "Z")
    public boolean field985 = true;

    @OriginalMember(owner = "client!me", name = "l", descriptor = "I")
    public int field976 = 127;

    @OriginalMember(owner = "client!me", name = "F", descriptor = "Z")
    public boolean field996 = true;

    @OriginalMember(owner = "client!me", name = "p", descriptor = "I")
    public int field980 = 255;

    @OriginalMember(owner = "client!me", name = "y", descriptor = "I")
    public int field989 = 0;

    @OriginalMember(owner = "client!me", name = "N", descriptor = "Z")
    public boolean field1004 = true;

    @OriginalMember(owner = "client!me", name = "B", descriptor = "Z")
    public boolean field992 = true;

    @OriginalMember(owner = "client!me", name = "O", descriptor = "Z")
    public boolean field1005 = true;

    @OriginalMember(owner = "client!me", name = "q", descriptor = "Z")
    public boolean field981 = true;

    @OriginalMember(owner = "client!me", name = "v", descriptor = "Z")
    public boolean field986 = true;

    @OriginalMember(owner = "client!me", name = "P", descriptor = "I")
    public int field1006 = 3;

    @OriginalMember(owner = "client!me", name = "H", descriptor = "Laa;")
    public static class76 field998 = new class76(43, 3);

    @OriginalMember(owner = "client!me", name = "L", descriptor = "I")
    public static int field1002;

    @OriginalMember(owner = "client!me", name = "M", descriptor = "I")
    public static int field1003;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "I")
    public static int field965;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "I")
    public static int field968;

    @OriginalMember(owner = "client!me", name = "j", descriptor = "I")
    public static int field974;

    @OriginalMember(owner = "client!me", name = "z", descriptor = "I")
    public static int field990;

    @OriginalMember(owner = "client!me", name = "i", descriptor = "Lwd;")
    public static class260 field973;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "Z")
    public boolean field969;

    @OriginalMember(owner = "client!me", name = "t", descriptor = "Z")
    public boolean field984;

    @OriginalMember(owner = "client!me", name = "w", descriptor = "Z")
    public boolean field987;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(CB)Z", line = 20)
    public static final boolean method506(char arg0, byte arg1) {
        if (arg1 == 75) {
            field1003++;
            return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Z)V", line = 31)
    public static final void method507(boolean arg0) {
        if (arg0) {
            field998 = null;
        }
        field965++;
        if (class116.field1742) {
            return;
        }
        class116.field1745 = true;
        if (class454.field6661.field969) {
            class254.field3443 = ((int) class254.field3443 - 17 & 0xFFFFFFF0);
        } else {
            class161.field2413 += (-class161.field2413 - 12.0F) / 2.0F;
        }
        class116.field1742 = true;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(B)V", line = 57)
    public static void method508(byte arg0) {
        if (arg0 <= 34) {
            method506((char) 65448, (byte) -42);
        }
        field973 = null;
        field998 = null;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(II)I", line = 71)
    public final int method509(int arg0, int arg1) {
        field1002++;
        if (arg1 != -2) {
            method506((char) 65463, (byte) 94);
        }
        return arg0 == 1 || arg0 == 3 ? this.field1001 : this.field972;
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(II)Z", line = 93)
    public final boolean method510(int arg0, int arg1) {
        if (arg0 != 15479) {
            method507(true);
        }
        field990++;
        return arg1 == 1 || arg1 == 3 ? this.field987 : this.field984;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIZ)V", line = 169)
    public final void method511(int arg0, int arg1, boolean arg2) {
        if (arg1 <= 56) {
            this.field988 = false;
        }
        if (arg0 == 1 || arg0 == 3) {
            this.field987 = arg2;
        } else {
            this.field984 = arg2;
        }
        field968++;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(III)V", line = 206)
    public final void method512(int arg0, int arg1, int arg2) {
        if (arg1 == 1 || arg1 == 3) {
            this.field1001 = arg2;
        } else {
            this.field972 = arg2;
        }
        field974++;
        if (arg0 != 8998) {
            this.field999 = -23;
        }
    }
}
