import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class123 {

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "[I")
    private int[] field1804;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "Z")
    public static boolean field1801 = false;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "I")
    public static int field1802 = 0;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "I")
    public static int field1803;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
    public static int field1805;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "I")
    public static int field1806;

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "Liu;")
    public static class375 field1799;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "[Lec;")
    public static class143[] field1800;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IB)Ljq;", line = 7)
    public static final class326 method758(int arg0, byte arg1) {
        field1807++;
        int var2 = 81 % ((43 - arg1) / 59);
        if (arg0 == 0) {
            return new class150();
        } else if (arg0 == 1) {
            return new class431();
        } else if (arg0 == 2) {
            return new class301();
        } else if (arg0 == 3) {
            return new class92();
        } else if (arg0 == 4) {
            return new class120();
        } else if (arg0 == 5) {
            return new class444();
        } else if (arg0 == 6) {
            return new class30();
        } else if (arg0 == 7) {
            return new class65();
        } else if (arg0 == 8) {
            return new class186();
        } else if (arg0 == 9) {
            return new class391();
        } else if (arg0 == 10) {
            return new class98();
        } else if (arg0 == 11) {
            return new class34();
        } else if (arg0 == 12) {
            return new class162();
        } else if (arg0 == 13) {
            return new class271();
        } else if (arg0 == 14) {
            return new class135();
        } else if (arg0 == 15) {
            return new class60();
        } else if (arg0 == 16) {
            return new class175();
        } else if (arg0 == 17) {
            return new class52();
        } else if (arg0 == 18) {
            return new class102();
        } else if (arg0 == 19) {
            return new class124();
        } else if (arg0 == 20) {
            return new class187();
        } else if (arg0 == 21) {
            return new class7();
        } else if (arg0 == 22) {
            return new class453();
        } else if (arg0 == 23) {
            return new class466();
        } else if (arg0 == 24) {
            return new class475();
        } else if (arg0 == 25) {
            return new class335();
        } else if (arg0 == 26) {
            return new class243();
        } else if (arg0 == 27) {
            return new class56();
        } else if (arg0 == 28) {
            return new class11();
        } else if (arg0 == 29) {
            return new class446();
        } else if (arg0 == 30) {
            return new class214();
        } else if (arg0 == 31) {
            return new class4();
        } else if (arg0 == 32) {
            return new class72();
        } else if (arg0 == 33) {
            return new class246();
        } else if (arg0 == 34) {
            return new class297();
        } else if (arg0 == 35) {
            return new class188();
        } else if (arg0 == 36) {
            return new class18();
        } else if (arg0 == 37) {
            return new class14();
        } else if (arg0 == 38) {
            return new class209();
        } else if (arg0 == 39) {
            return new class322();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)I", line = 333)
    public final int method759(int arg0, int arg1) {
        if (arg1 <= 82) {
            return -76;
        }
        field1803++;
        int var3 = (this.field1804.length >> 1) - 1;
        int var4 = arg0 & var3;
        while (true) {
            int var5 = this.field1804[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field1804[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V", line = 369)
    public static void method760(int arg0) {
        field1799 = null;
        if (arg0 != -31) {
            method761(true, 21);
        }
        field1800 = null;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZI)Z", line = 384)
    public static final boolean method761(boolean arg0, int arg1) {
        field1806++;
        if (!arg0) {
            method761(true, -86);
        }
        return (arg1 & -arg1) == arg1;
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "([I)V", line = 394)
    public class123(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field1804 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field1804[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field1804[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field1804[var5 + var5] = arg0[var4];
            this.field1804[var5 + var5 + 1] = var4++;
        }
    }
}
