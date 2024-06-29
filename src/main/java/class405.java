import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public abstract class class405 {

    @OriginalMember(owner = "client!op", name = "j", descriptor = "I")
    public int field6091 = 2;

    @OriginalMember(owner = "client!op", name = "c", descriptor = "I")
    public int field6084 = 0;

    @OriginalMember(owner = "client!op", name = "q", descriptor = "Z")
    public boolean field6098 = false;

    @OriginalMember(owner = "client!op", name = "s", descriptor = "I")
    public int field6100 = 127;

    @OriginalMember(owner = "client!op", name = "b", descriptor = "I")
    public int field6083 = 2;

    @OriginalMember(owner = "client!op", name = "r", descriptor = "Z")
    public boolean field6099 = false;

    @OriginalMember(owner = "client!op", name = "t", descriptor = "Z")
    public boolean field6101 = true;

    @OriginalMember(owner = "client!op", name = "f", descriptor = "Z")
    public boolean field6087 = true;

    @OriginalMember(owner = "client!op", name = "y", descriptor = "Z")
    public boolean field6106 = true;

    @OriginalMember(owner = "client!op", name = "h", descriptor = "I")
    public int field6089 = 0;

    @OriginalMember(owner = "client!op", name = "A", descriptor = "Z")
    public boolean field6108 = true;

    @OriginalMember(owner = "client!op", name = "u", descriptor = "Z")
    public boolean field6102 = true;

    @OriginalMember(owner = "client!op", name = "C", descriptor = "I")
    public int field6110 = 2;

    @OriginalMember(owner = "client!op", name = "l", descriptor = "Z")
    public boolean field6093 = true;

    @OriginalMember(owner = "client!op", name = "B", descriptor = "I")
    public int field6109 = 127;

    @OriginalMember(owner = "client!op", name = "E", descriptor = "I")
    public int field6112 = 255;

    @OriginalMember(owner = "client!op", name = "H", descriptor = "Z")
    public boolean field6115 = true;

    @OriginalMember(owner = "client!op", name = "G", descriptor = "I")
    public int field6114 = 3;

    @OriginalMember(owner = "client!op", name = "i", descriptor = "I")
    public int field6090 = 0;

    @OriginalMember(owner = "client!op", name = "K", descriptor = "I")
    public int field6117 = 0;

    @OriginalMember(owner = "client!op", name = "z", descriptor = "Z")
    public boolean field6107 = false;

    @OriginalMember(owner = "client!op", name = "o", descriptor = "Z")
    public boolean field6096 = true;

    @OriginalMember(owner = "client!op", name = "M", descriptor = "I")
    public int field6119 = 2;

    @OriginalMember(owner = "client!op", name = "p", descriptor = "I")
    public int field6097 = 0;

    @OriginalMember(owner = "client!op", name = "n", descriptor = "I")
    public int field6095 = 0;

    @OriginalMember(owner = "client!op", name = "O", descriptor = "I")
    public int field6121 = 1;

    @OriginalMember(owner = "client!op", name = "P", descriptor = "Z")
    public boolean field6122 = true;

    @OriginalMember(owner = "client!op", name = "N", descriptor = "Z")
    public boolean field6120 = true;

    @OriginalMember(owner = "client!op", name = "Q", descriptor = "Z")
    public boolean field6123 = true;

    @OriginalMember(owner = "client!op", name = "I", descriptor = "I")
    public int field6116 = 0;

    @OriginalMember(owner = "client!op", name = "m", descriptor = "Z")
    public boolean field6094 = true;

    @OriginalMember(owner = "client!op", name = "g", descriptor = "Lbi;")
    public static class104 field6088 = new class104(56, -2);

    @OriginalMember(owner = "client!op", name = "e", descriptor = "I")
    public static int field6086;

    @OriginalMember(owner = "client!op", name = "k", descriptor = "I")
    public static int field6092;

    @OriginalMember(owner = "client!op", name = "w", descriptor = "I")
    public static int field6104;

    @OriginalMember(owner = "client!op", name = "x", descriptor = "I")
    public static int field6105;

    @OriginalMember(owner = "client!op", name = "D", descriptor = "I")
    public static int field6111;

    @OriginalMember(owner = "client!op", name = "F", descriptor = "I")
    public static int field6113;

    @OriginalMember(owner = "client!op", name = "L", descriptor = "I")
    public static int field6118;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "Z")
    public boolean field6082;

    @OriginalMember(owner = "client!op", name = "d", descriptor = "Z")
    public boolean field6085;

    @OriginalMember(owner = "client!op", name = "v", descriptor = "Z")
    public boolean field6103;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(IIIB)I")
    public static final int method2598(int arg0, int arg1, int arg2, byte arg3) {
        field6111++;
        if (arg3 < 76) {
            method2600(false);
        }
        if (arg2 < arg1) {
            return arg1;
        } else if (arg2 > arg0) {
            return arg0;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(ZIB)V")
    public final void method2599(boolean arg0, int arg1, byte arg2) {
        if (arg1 == 1 || arg1 == 3) {
            this.field6085 = arg0;
        } else {
            this.field6103 = arg0;
        }
        if (arg2 > -74) {
            this.field6097 = 68;
        }
        field6086++;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(Z)V")
    public static void method2600(boolean arg0) {
        if (arg0) {
            field6088 = null;
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(BI)Z")
    public final boolean method2601(byte arg0, int arg1) {
        if (arg0 == -14) {
            field6104++;
            return arg1 == 1 || arg1 == 3 ? this.field6085 : this.field6103;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(III)V")
    public final void method2602(int arg0, int arg1, int arg2) {
        field6092++;
        if (arg2 != -25787) {
            return;
        }
        if (arg0 == 1 || arg0 == 3) {
            this.field6091 = arg1;
        } else {
            this.field6084 = arg1;
        }
    }

    @OriginalMember(owner = "client!op", name = "b", descriptor = "(BI)I")
    public final int method2603(byte arg0, int arg1) {
        field6118++;
        int var3 = -73 % ((arg0 + 50) / 43);
        return arg1 == 1 || arg1 == 3 ? this.field6091 : this.field6084;
    }
}
