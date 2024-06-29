import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public abstract class class8 {

    @OriginalMember(owner = "client!to", name = "b", descriptor = "Z")
    public boolean field110 = true;

    @OriginalMember(owner = "client!to", name = "n", descriptor = "Z")
    public boolean field122 = false;

    @OriginalMember(owner = "client!to", name = "o", descriptor = "Z")
    public boolean field123 = true;

    @OriginalMember(owner = "client!to", name = "v", descriptor = "Z")
    public boolean field130 = false;

    @OriginalMember(owner = "client!to", name = "e", descriptor = "I")
    public int field113 = 1;

    @OriginalMember(owner = "client!to", name = "h", descriptor = "I")
    public int field116 = 127;

    @OriginalMember(owner = "client!to", name = "x", descriptor = "I")
    public int field132 = 0;

    @OriginalMember(owner = "client!to", name = "u", descriptor = "Z")
    public boolean field129 = true;

    @OriginalMember(owner = "client!to", name = "z", descriptor = "Z")
    public boolean field134 = true;

    @OriginalMember(owner = "client!to", name = "B", descriptor = "Z")
    public boolean field136 = true;

    @OriginalMember(owner = "client!to", name = "g", descriptor = "Z")
    public boolean field115 = true;

    @OriginalMember(owner = "client!to", name = "A", descriptor = "I")
    public int field135 = 127;

    @OriginalMember(owner = "client!to", name = "p", descriptor = "I")
    public int field124 = 2;

    @OriginalMember(owner = "client!to", name = "y", descriptor = "Z")
    public boolean field133 = true;

    @OriginalMember(owner = "client!to", name = "I", descriptor = "I")
    public int field143 = 2;

    @OriginalMember(owner = "client!to", name = "s", descriptor = "I")
    public int field127 = 0;

    @OriginalMember(owner = "client!to", name = "J", descriptor = "Z")
    public boolean field144 = false;

    @OriginalMember(owner = "client!to", name = "K", descriptor = "Z")
    public boolean field145 = true;

    @OriginalMember(owner = "client!to", name = "C", descriptor = "I")
    public int field137 = 0;

    @OriginalMember(owner = "client!to", name = "H", descriptor = "I")
    public int field142 = 0;

    @OriginalMember(owner = "client!to", name = "E", descriptor = "I")
    public int field139 = 2;

    @OriginalMember(owner = "client!to", name = "O", descriptor = "I")
    public int field148 = 2;

    @OriginalMember(owner = "client!to", name = "j", descriptor = "Z")
    public boolean field118 = true;

    @OriginalMember(owner = "client!to", name = "F", descriptor = "I")
    public int field140 = 0;

    @OriginalMember(owner = "client!to", name = "t", descriptor = "I")
    public int field128 = 3;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "I")
    public int field109 = 0;

    @OriginalMember(owner = "client!to", name = "G", descriptor = "I")
    public int field141 = 255;

    @OriginalMember(owner = "client!to", name = "P", descriptor = "Z")
    public boolean field149 = true;

    @OriginalMember(owner = "client!to", name = "R", descriptor = "I")
    public int field151 = 0;

    @OriginalMember(owner = "client!to", name = "T", descriptor = "Z")
    public boolean field153 = true;

    @OriginalMember(owner = "client!to", name = "w", descriptor = "Z")
    public boolean field131 = true;

    @OriginalMember(owner = "client!to", name = "q", descriptor = "Z")
    public static boolean field125 = false;

    @OriginalMember(owner = "client!to", name = "f", descriptor = "I")
    public static int field114 = 0;

    @OriginalMember(owner = "client!to", name = "D", descriptor = "I")
    public static int field138 = 1403;

    @OriginalMember(owner = "client!to", name = "d", descriptor = "I")
    public static int field112;

    @OriginalMember(owner = "client!to", name = "k", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!to", name = "m", descriptor = "I")
    public static int field121;

    @OriginalMember(owner = "client!to", name = "r", descriptor = "I")
    public static int field126;

    @OriginalMember(owner = "client!to", name = "L", descriptor = "I")
    public static int field146;

    @OriginalMember(owner = "client!to", name = "S", descriptor = "I")
    public static int field152;

    @OriginalMember(owner = "client!to", name = "c", descriptor = "Lpn;")
    public static class522 field111;

    @OriginalMember(owner = "client!to", name = "l", descriptor = "Lhh;")
    public static class84 field120;

    @OriginalMember(owner = "client!to", name = "i", descriptor = "Z")
    public boolean field117;

    @OriginalMember(owner = "client!to", name = "M", descriptor = "Z")
    public boolean field147;

    @OriginalMember(owner = "client!to", name = "Q", descriptor = "Z")
    public boolean field150;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(BI)I", line = 9)
    public final int method56(byte arg0, int arg1) {
        int var3 = 59 / ((arg0 + 45) / 33);
        field126++;
        return arg1 == 1 || arg1 == 3 ? this.field148 : this.field151;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(ILjava/lang/String;)I", line = 27)
    public static final int method57(int arg0, String arg1) {
        field121++;
        if (arg0 >= -97) {
            method57(30, null);
        }
        return arg1.length() + 1;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(B)V", line = 46)
    public static void method58(byte arg0) {
        field111 = null;
        field120 = null;
        if (arg0 != 4) {
            field138 = 33;
        }
    }

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(BI)Z", line = 63)
    public final boolean method59(byte arg0, int arg1) {
        if (arg0 != 114) {
            this.method56((byte) 37, 8);
        }
        field152++;
        return arg1 == 1 || arg1 == 3 ? this.field117 : this.field147;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(I)V", line = 89)
    public static final void method60(int arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class205.field2962[var1] = false;
        }
        field112++;
        class403.field5944 = 1;
        class131.field2025 = 0;
        class98.field1598 = -1;
        if (arg0 > -8) {
            method57(-118, null);
        }
        class497.field7234 = 0;
        class258.field3726 = -1;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(ZII)V", line = 147)
    public final void method61(boolean arg0, int arg1, int arg2) {
        field119++;
        if (arg1 == 1 || arg1 == 3) {
            this.field117 = arg0;
        } else {
            this.field147 = arg0;
        }
        if (arg2 < 44) {
            this.field116 = 114;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(III)V", line = 202)
    public final void method62(int arg0, int arg1, int arg2) {
        if (arg0 == arg2 || arg2 == 3) {
            this.field148 = arg1;
        } else {
            this.field151 = arg1;
        }
        field146++;
    }
}
