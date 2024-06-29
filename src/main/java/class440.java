import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public abstract class class440 extends class665 {

    @OriginalMember(owner = "client!ap", name = "y", descriptor = "Z")
    public boolean field6424;

    @OriginalMember(owner = "client!ap", name = "t", descriptor = "[Lap;")
    public class440[] field6419;

    @OriginalMember(owner = "client!ap", name = "p", descriptor = "Luc;")
    public static class27 field6415 = new class27("", 16);

    @OriginalMember(owner = "client!ap", name = "k", descriptor = "I")
    public static int field6410;

    @OriginalMember(owner = "client!ap", name = "l", descriptor = "I")
    public static int field6411;

    @OriginalMember(owner = "client!ap", name = "n", descriptor = "I")
    public static int field6413;

    @OriginalMember(owner = "client!ap", name = "o", descriptor = "I")
    public int field6414;

    @OriginalMember(owner = "client!ap", name = "q", descriptor = "I")
    public static int field6416;

    @OriginalMember(owner = "client!ap", name = "s", descriptor = "I")
    public static int field6418;

    @OriginalMember(owner = "client!ap", name = "u", descriptor = "I")
    public static int field6420;

    @OriginalMember(owner = "client!ap", name = "v", descriptor = "I")
    public static int field6421;

    @OriginalMember(owner = "client!ap", name = "w", descriptor = "I")
    public static int field6422;

    @OriginalMember(owner = "client!ap", name = "x", descriptor = "I")
    public static int field6423;

    @OriginalMember(owner = "client!ap", name = "z", descriptor = "I")
    public static int field6425;

    @OriginalMember(owner = "client!ap", name = "A", descriptor = "I")
    public static int field6426;

    @OriginalMember(owner = "client!ap", name = "B", descriptor = "I")
    public static int field6427;

    @OriginalMember(owner = "client!ap", name = "m", descriptor = "Lmfa;")
    public class571 field6412;

    @OriginalMember(owner = "client!ap", name = "r", descriptor = "Lcc;")
    public class680 field6417;

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIZ)V", line = 5)
    public void method2605(int arg0, int arg1, boolean arg2) {
        field6413++;
        if (arg2) {
            field6415 = null;
        }
        int var4 = this.field6414 == 255 ? arg1 : this.field6414;
        if (this.field6424) {
            this.field6412 = new class571(var4, arg1, arg0);
        } else {
            this.field6417 = new class680(var4, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(I)V", line = 29)
    public void method230(int arg0) {
        if (arg0 != -9) {
            method2607(93, null);
        }
        field6425++;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(III)[[I", line = 41)
    public final int[][] method2606(int arg0, int arg1, int arg2) {
        if (arg2 != -1) {
            method2610((byte) 116);
        }
        field6411++;
        if (this.field6419[arg1].field6424) {
            int[] var4 = this.field6419[arg1].method229((byte) 1, arg0);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field6419[arg1].method763(-5766, arg0);
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(ILjava/lang/String;)I", line = 73)
    public static final int method2607(int arg0, String arg1) {
        field6427++;
        if (arg0 != 7330) {
            method2608(-57);
        }
        return class690.method3798(true, arg1, true, 10);
    }

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "(I)V", line = 84)
    public static void method2608(int arg0) {
        field6415 = null;
        if (arg0 != 3) {
            method2610((byte) 97);
        }
    }

    @OriginalMember(owner = "client!ap", name = "c", descriptor = "(I)I", line = 95)
    public int method2609(int arg0) {
        if (arg0 > -95) {
            method2608(26);
        }
        field6422++;
        return -1;
    }

    @OriginalMember(owner = "client!ap", name = "e", descriptor = "(I)I", line = 111)
    public int method2303(int arg0) {
        field6410++;
        if (arg0 != -1) {
            this.field6424 = false;
        }
        return -1;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(II)[[I", line = 129)
    public int[][] method763(int arg0, int arg1) {
        field6423++;
        if (arg0 == -5766) {
            throw new IllegalStateException("This operation does not have a colour output");
        }
        return null;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(BI)[I", line = 141)
    public int[] method229(byte arg0, int arg1) {
        int var3 = -89 % ((arg0 + 56) / 41);
        field6426++;
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(B)V", line = 151)
    public static final void method2610(byte arg0) {
        if (arg0 <= 32) {
            field6415 = null;
        }
        field6420++;
        class143.field2112.method2285((byte) -122);
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(ILmo;I)V", line = 162)
    public void method234(int arg0, class695 arg1, int arg2) {
        if (arg0 == 5) {
            field6418++;
        }
    }

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "(III)[I", line = 174)
    public final int[] method2611(int arg0, int arg1, int arg2) {
        field6421++;
        int var4 = -128 % ((50 - arg0) / 53);
        return this.field6419[arg2].field6424 ? this.field6419[arg2].method229((byte) 89, arg1) : this.field6419[arg2].method763(-5766, arg1)[0];
    }

    @OriginalMember(owner = "client!ap", name = "f", descriptor = "(I)V", line = 204)
    public void method2301(int arg0) {
        if (arg0 != -1) {
            method2610((byte) -1);
        }
        field6416++;
        if (this.field6424) {
            this.field6412.method3248((byte) 61);
            this.field6412 = null;
        } else {
            this.field6417.method3768(-1);
            this.field6417 = null;
        }
    }

    @OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(IZ)V", line = 229)
    public class440(int arg0, boolean arg1) {
        this.field6424 = arg1;
        this.field6419 = new class440[arg0];
    }
}
