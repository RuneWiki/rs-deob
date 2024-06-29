import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!u")
public class class38 {

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "[I")
    private int[] field514;

    @OriginalMember(owner = "mapview!u", name = "b", descriptor = "Lta;")
    public static class37 field515 = class20.method87(-115, "50(U");

    @OriginalMember(owner = "mapview!u", name = "g", descriptor = "I")
    public static int field520 = -1;

    @OriginalMember(owner = "mapview!u", name = "h", descriptor = "Lta;")
    public static class37 field521 = class20.method87(-126, "Pub)4Bar");

    @OriginalMember(owner = "mapview!u", name = "e", descriptor = "Lta;")
    public static class37 field518 = class20.method87(-101, "Guide");

    @OriginalMember(owner = "mapview!u", name = "f", descriptor = "Lta;")
    public static class37 field519 = class20.method87(-127, "Summoning Store");

    @OriginalMember(owner = "mapview!u", name = "c", descriptor = "[I")
    public static int[] field516;

    @OriginalMember(owner = "mapview!u", name = "d", descriptor = "[[B")
    public static byte[][] field517;

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "([BB)[B", line = 19)
    public static final byte[] method247(byte[] arg0, byte arg1) {
        int var2 = -67 / ((arg1 + 30) / 51);
        int var3 = arg0.length;
        byte[] var4 = new byte[var3];
        class32.method190(arg0, 0, var4, 0, var3);
        return var4;
    }

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(I)Z", line = 43)
    public static final boolean method248(int arg0) {
        class12 var1 = class21.field238;
        synchronized (class21.field238) {
            if (class31.field456 == class23.field258) {
                return false;
            }
            class4.field51 = class2.field22[class23.field258];
            class40.field526 = class9.field95[class23.field258];
            if (arg0 < 85) {
                field515 = null;
            }
            class23.field258 = class23.field258 + 1 & 0x7F;
            return true;
        }
    }

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(B)V", line = 62)
    public static final void method249(byte arg0) {
        if (class30.field444[0][class20.field228][class7.field81] == null) {
            class40.field532 = null;
        } else {
            class40.field532 = class30.field444[0][class20.field228][class7.field81];
        }
        if (class30.field444[1][class20.field228][class7.field81] == null) {
            class33.field461 = null;
        } else {
            class33.field461 = class30.field444[1][class20.field228][class7.field81];
        }
        if (class30.field444[2][class20.field228][class7.field81] == null) {
            class27.field434 = null;
        } else {
            class27.field434 = class30.field444[2][class20.field228][class7.field81];
        }
        if (class30.field444[3][class20.field228][class7.field81] == null) {
            class31.field454 = null;
        } else {
            class31.field454 = class30.field444[3][class20.field228][class7.field81];
        }
        if (class30.field444[4][class20.field228][class7.field81] == null) {
            class12.field143 = null;
        } else {
            class12.field143 = class30.field444[4][class20.field228][class7.field81];
        }
        if (class10.field113[class20.field228][class7.field81] == null) {
            class15.field163 = null;
        } else {
            class15.field163 = class10.field113[class20.field228][class7.field81];
        }
        if (class15.field160[class20.field228][class7.field81] == null) {
            class2.field12 = null;
        } else {
            class2.field12 = class15.field160[class20.field228][class7.field81];
        }
        if (class26.field432[class20.field228][class7.field81] == null) {
            class9.field98 = null;
        } else {
            class9.field98 = class26.field432[class20.field228][class7.field81];
        }
        if (arg0 >= -58) {
            field518 = null;
        }
    }

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(B[Lta;II)V", line = 112)
    public static final void method250(byte arg0, class37[] arg1, int arg2, int arg3) {
        if (arg2 == 1) {
            arg1[0].method223(false);
        } else {
            class7.method31(arg0 ^ 0xFFFFFE5A, arg3, arg1, arg2).method223(false);
        }
        if (arg0 != -126) {
            field519 = null;
        }
    }

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(II)I", line = 136)
    public final int method251(int arg0, int arg1) {
        if (arg0 < 84) {
            this.field514 = null;
        }
        int var3 = (this.field514.length >> 1) - 1;
        int var4 = var3 & arg1;
        while (true) {
            int var5 = this.field514[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field514[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }

    @OriginalMember(owner = "mapview!u", name = "b", descriptor = "(I)V", line = 169)
    public static void method252(int arg0) {
        field516 = null;
        field517 = null;
        field515 = null;
        if (arg0 != 3) {
            method248(-126);
        }
        field518 = null;
        field519 = null;
        field521 = null;
    }

    @OriginalMember(owner = "mapview!u", name = "<init>", descriptor = "([I)V", line = 182)
    public class38(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field514 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field514[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field514[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field514[var5 + var5] = arg0[var4];
            this.field514[var5 + var5 + 1] = var4++;
        }
    }
}
