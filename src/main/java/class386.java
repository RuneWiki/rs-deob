import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mba")
public abstract class class386 extends class513 {

    @OriginalMember(owner = "client!mba", name = "x", descriptor = "Z")
    public boolean field5145;

    @OriginalMember(owner = "client!mba", name = "j", descriptor = "[Lmba;")
    public class386[] field5131;

    @OriginalMember(owner = "client!mba", name = "n", descriptor = "Ln;")
    public static class17 field5135 = null;

    @OriginalMember(owner = "client!mba", name = "u", descriptor = "I")
    public static int field5142 = 1;

    @OriginalMember(owner = "client!mba", name = "z", descriptor = "I")
    public static int field5147 = -1;

    @OriginalMember(owner = "client!mba", name = "k", descriptor = "I")
    public int field5132;

    @OriginalMember(owner = "client!mba", name = "l", descriptor = "I")
    public static int field5133;

    @OriginalMember(owner = "client!mba", name = "m", descriptor = "I")
    public static int field5134;

    @OriginalMember(owner = "client!mba", name = "o", descriptor = "I")
    public static int field5136;

    @OriginalMember(owner = "client!mba", name = "p", descriptor = "I")
    public static int field5137;

    @OriginalMember(owner = "client!mba", name = "q", descriptor = "I")
    public static int field5138;

    @OriginalMember(owner = "client!mba", name = "r", descriptor = "I")
    public static int field5139;

    @OriginalMember(owner = "client!mba", name = "t", descriptor = "I")
    public static int field5141;

    @OriginalMember(owner = "client!mba", name = "v", descriptor = "I")
    public static int field5143;

    @OriginalMember(owner = "client!mba", name = "w", descriptor = "I")
    public static int field5144;

    @OriginalMember(owner = "client!mba", name = "y", descriptor = "I")
    public static int field5146;

    @OriginalMember(owner = "client!mba", name = "B", descriptor = "I")
    public static int field5149;

    @OriginalMember(owner = "client!mba", name = "A", descriptor = "Lefa;")
    public class166 field5148;

    @OriginalMember(owner = "client!mba", name = "s", descriptor = "Lkd;")
    public class256 field5140;

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(B)I", line = 7)
    public int method1862(byte arg0) {
        if (arg0 <= 21) {
            field5142 = 89;
        }
        field5143++;
        return -1;
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(II)[I", line = 18)
    public int[] method359(int arg0, int arg1) {
        field5139++;
        int var3 = 74 % ((arg1 - 13) / 40);
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!mba", name = "b", descriptor = "(III)[[I", line = 30)
    public final int[][] method2211(int arg0, int arg1, int arg2) {
        if (arg2 > -99) {
            field5135 = null;
        }
        field5138++;
        if (this.field5131[arg1].field5145) {
            int[] var4 = this.field5131[arg1].method359(arg0, 80);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field5131[arg1].method645(arg0, 3);
        }
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(Z)V", line = 64)
    public void method926(boolean arg0) {
        field5137++;
        if (arg0) {
            return;
        }
        if (this.field5145) {
            this.field5140.method1562(false);
            this.field5140 = null;
        } else {
            this.field5148.method1053((byte) 30);
            this.field5148 = null;
        }
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(IBI)V", line = 90)
    public void method1863(int arg0, byte arg1, int arg2) {
        field5134++;
        int var4 = this.field5132 == 255 ? arg2 : this.field5132;
        int var5 = -126 % ((21 - arg1) / 47);
        if (this.field5145) {
            this.field5140 = new class256(var4, arg2, arg0);
        } else {
            this.field5148 = new class166(var4, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!mba", name = "b", descriptor = "(II)[[I", line = 114)
    public int[][] method645(int arg0, int arg1) {
        field5141++;
        if (arg1 != 3) {
            field5142 = 10;
        }
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(IBLun;)V", line = 127)
    public void method355(int arg0, byte arg1, class389 arg2) {
        if (arg1 < 111) {
            this.method2212((byte) -34, 1, -72);
        }
        field5136++;
    }

    @OriginalMember(owner = "client!mba", name = "c", descriptor = "(B)I", line = 141)
    public int method930(byte arg0) {
        field5149++;
        if (arg0 <= 82) {
            field5135 = null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(I)V", line = 158)
    public void method358(int arg0) {
        if (arg0 < 0) {
            this.method359(-86, 87);
        }
        field5133++;
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(BII)[I", line = 173)
    public final int[] method2212(byte arg0, int arg1, int arg2) {
        field5146++;
        int var4 = -63 / ((arg0 - 37) / 32);
        return this.field5131[arg2].field5145 ? this.field5131[arg2].method359(arg1, -51) : this.field5131[arg2].method645(arg1, 3)[0];
    }

    @OriginalMember(owner = "client!mba", name = "d", descriptor = "(B)V", line = 195)
    public static final void method2213(byte arg0) {
        class42.field760.method2776(false);
        if (arg0 >= -27) {
            method2213((byte) -14);
        }
        field5144++;
    }

    @OriginalMember(owner = "client!mba", name = "<init>", descriptor = "(IZ)V", line = 211)
    public class386(int arg0, boolean arg1) {
        this.field5145 = arg1;
        this.field5131 = new class386[arg0];
    }

    @OriginalMember(owner = "client!mba", name = "b", descriptor = "(I)V", line = 235)
    public static void method2214(int arg0) {
        field5135 = null;
        if (arg0 >= -38) {
            method2214(-39);
        }
    }
}
