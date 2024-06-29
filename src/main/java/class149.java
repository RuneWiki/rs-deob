import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public abstract class class149 extends class467 {

    @OriginalMember(owner = "client!nc", name = "v", descriptor = "[Lnc;")
    public class149[] field2146;

    @OriginalMember(owner = "client!nc", name = "x", descriptor = "Z")
    public boolean field2148;

    @OriginalMember(owner = "client!nc", name = "r", descriptor = "I")
    public static int field2142 = 0;

    @OriginalMember(owner = "client!nc", name = "D", descriptor = "I")
    public static int field2154 = 0;

    @OriginalMember(owner = "client!nc", name = "A", descriptor = "Lwi;")
    public static class340 field2151 = new class340(8, 0, 4, 1);

    @OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
    public static int field2138;

    @OriginalMember(owner = "client!nc", name = "o", descriptor = "I")
    public static int field2139;

    @OriginalMember(owner = "client!nc", name = "p", descriptor = "I")
    public static int field2140;

    @OriginalMember(owner = "client!nc", name = "q", descriptor = "I")
    public static int field2141;

    @OriginalMember(owner = "client!nc", name = "s", descriptor = "I")
    public static int field2143;

    @OriginalMember(owner = "client!nc", name = "u", descriptor = "I")
    public static int field2145;

    @OriginalMember(owner = "client!nc", name = "y", descriptor = "I")
    public int field2149;

    @OriginalMember(owner = "client!nc", name = "z", descriptor = "I")
    public static int field2150;

    @OriginalMember(owner = "client!nc", name = "C", descriptor = "I")
    public static int field2153;

    @OriginalMember(owner = "client!nc", name = "E", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!nc", name = "F", descriptor = "I")
    public static int field2156;

    @OriginalMember(owner = "client!nc", name = "G", descriptor = "I")
    public static int field2157;

    @OriginalMember(owner = "client!nc", name = "t", descriptor = "Lwk;")
    public static class171 field2144;

    @OriginalMember(owner = "client!nc", name = "H", descriptor = "Lns;")
    public static class438 field2158;

    @OriginalMember(owner = "client!nc", name = "w", descriptor = "Lrn;")
    public class453 field2147;

    @OriginalMember(owner = "client!nc", name = "B", descriptor = "Lai;")
    public class484 field2152;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)[I", line = 14)
    public int[] method92(int arg0, int arg1) {
        field2138++;
        if (arg0 != -10835) {
            field2154 = 28;
        }
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(III)V", line = 27)
    public void method977(int arg0, int arg1, int arg2) {
        field2157++;
        int var4 = this.field2149 == 255 ? arg2 : this.field2149;
        if (arg0 != -7589) {
            return;
        }
        if (this.field2148) {
            this.field2152 = new class484(var4, arg2, arg1);
        } else {
            this.field2147 = new class453(var4, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(B)V", line = 59)
    public void method397(byte arg0) {
        if (arg0 != -102) {
            this.method984((byte) -111, -102, 118);
        }
        if (this.field2148) {
            this.field2152.method2890(-64);
            this.field2152 = null;
        } else {
            this.field2147.method2727(false);
            this.field2147 = null;
        }
        field2156++;
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)I", line = 88)
    public int method396(int arg0) {
        field2150++;
        return arg0 == -1 ? -1 : 124;
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(IZ)V", line = 100)
    public class149(int arg0, boolean arg1) {
        this.field2146 = new class149[arg0];
        this.field2148 = arg1;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(BI)[[I", line = 110)
    public int[][] method139(byte arg0, int arg1) {
        field2139++;
        if (arg0 < -45) {
            throw new IllegalStateException("This operation does not have a colour output");
        }
        return null;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IBLtl;)V", line = 122)
    public void method93(int arg0, byte arg1, class91 arg2) {
        field2155++;
        if (arg1 != 35) {
            this.field2147 = null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(I)I", line = 137)
    public int method980(int arg0) {
        field2141++;
        if (arg0 != -1) {
            this.method984((byte) 121, -89, -27);
        }
        return -1;
    }

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "(I)V", line = 150)
    public void method99(int arg0) {
        field2145++;
        if (arg0 > -86) {
            this.field2152 = null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(B)V", line = 163)
    public static void method982(byte arg0) {
        field2144 = null;
        field2158 = null;
        field2151 = null;
        if (arg0 <= 50) {
            method985(20, true, 109);
        }
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(III)[I", line = 182)
    public final int[] method983(int arg0, int arg1, int arg2) {
        field2140++;
        if (arg1 == 24824) {
            return this.field2146[arg0].field2148 ? this.field2146[arg0].method92(arg1 - 35659, arg2) : this.field2146[arg0].method139((byte) -81, arg2)[0];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(BII)[[I", line = 205)
    public final int[][] method984(byte arg0, int arg1, int arg2) {
        if (arg0 < 87) {
            return null;
        }
        field2153++;
        if (this.field2146[arg1].field2148) {
            int[] var4 = this.field2146[arg1].method92(-10835, arg2);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field2146[arg1].method139((byte) -100, arg2);
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IZI)I", line = 239)
    public static final int method985(int arg0, boolean arg1, int arg2) {
        field2143++;
        if (arg1) {
            return 0;
        }
        class410 var3 = class261.method1684(arg2, 25, arg1);
        if (var3 == null) {
            return class67.field923.method1640(arg2, 28560).field3407;
        }
        int var4 = 0;
        if (arg0 != 7945) {
            return -121;
        }
        for (int var5 = 0; var5 < var3.field6169.length; var5++) {
            if (var3.field6169[var5] == -1) {
                var4++;
            }
        }
        return var4 + class67.field923.method1640(arg2, 28560).field3407 - var3.field6169.length;
    }
}
