import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class117 {

    @OriginalMember(owner = "client!u", name = "b", descriptor = "Leb;")
    public static class230 field2095 = class68.method589(0, "cookieprefix");

    @OriginalMember(owner = "client!u", name = "e", descriptor = "Leb;")
    public static class230 field2098 = class68.method589(0, "Hidden)2use");

    @OriginalMember(owner = "client!u", name = "l", descriptor = "[I")
    public static int[] field2105 = new int[4096];

    @OriginalMember(owner = "client!u", name = "g", descriptor = "[[I")
    public static int[][] field2100 = new int[104][104];

    @OriginalMember(owner = "client!u", name = "a", descriptor = "I")
    public static int field2094;

    @OriginalMember(owner = "client!u", name = "d", descriptor = "I")
    public static int field2097;

    @OriginalMember(owner = "client!u", name = "i", descriptor = "I")
    public static int field2102;

    @OriginalMember(owner = "client!u", name = "j", descriptor = "I")
    public static int field2103;

    @OriginalMember(owner = "client!u", name = "k", descriptor = "I")
    public static int field2104;

    @OriginalMember(owner = "client!u", name = "h", descriptor = "Lkk;")
    public static class223 field2101;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "Lfj;")
    public static class239 field2096;

    @OriginalMember(owner = "client!u", name = "f", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field2099;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V")
    public static void method939(int arg0) {
        field2098 = null;
        field2095 = null;
        field2100 = null;
        if (arg0 != -4) {
            field2102 = 63;
        }
        field2105 = null;
        field2101 = null;
        field2096 = null;
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "()V")
    public class117() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lfk;I[B)V")
    public final void method940(class14 arg0, int arg1, byte[] arg2) {
        field2104++;
        if (arg0.field269[arg0.field318] != 31 || arg0.field269[arg0.field318 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field2099 == null) {
            this.field2099 = new Inflater(true);
        }
        try {
            this.field2099.setInput(arg0.field269, arg0.field318 + 10, -arg0.field318 + -8 + arg0.field269.length + -10);
            this.field2099.inflate(arg2);
            if (arg1 != 2678) {
                method942(122, true);
            }
        } catch (Exception var4) {
            this.field2099.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field2099.reset();
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIIII)V")
    public static final void method941(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2103++;
        int var6 = arg2 - arg3;
        int var7 = arg0 - arg1;
        if (var6 == 0) {
            if (var7 != 0) {
                class127.method990(arg3, arg1, 17544, arg4, arg0);
            }
        } else if (var7 == 0) {
            class33.method309(arg4, arg1, arg3, 1000, arg2);
        } else {
            if (arg5 != -10) {
                method942(102, true);
            }
            int var8 = (var7 << 12) / var6;
            int var9 = arg1 - (arg3 * var8 >> 12);
            int var10;
            int var11;
            if (class78.field1404 > arg3) {
                var10 = class78.field1404;
                var11 = (class78.field1404 * var8 >> 12) + var9;
            } else if (class42.field769 < arg3) {
                var10 = class42.field769;
                var11 = var9 + (class42.field769 * var8 >> 12);
            } else {
                var10 = arg3;
                var11 = arg1;
            }
            int var12;
            int var13;
            if (arg2 < class78.field1404) {
                var12 = class78.field1404;
                var13 = (class78.field1404 * var8 >> 12) + var9;
            } else if (arg2 <= class42.field769) {
                var12 = arg2;
                var13 = arg0;
            } else {
                var13 = (class42.field769 * var8 >> 12) + var9;
                var12 = class42.field769;
            }
            if (var11 < class15.field345) {
                var10 = (class15.field345 - var9 << 12) / var8;
                var11 = class15.field345;
            } else if (var11 > class259.field4587) {
                var10 = (class259.field4587 - var9 << 12) / var8;
                var11 = class259.field4587;
            }
            if (class15.field345 > var13) {
                var12 = (class15.field345 - var9 << 12) / var8;
                var13 = class15.field345;
            } else if (var13 > class259.field4587) {
                var12 = (class259.field4587 - var9 << 12) / var8;
                var13 = class259.field4587;
            }
            class18.method226((byte) -128, var10, var11, var12, var13, arg4);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IZ)Lvi;")
    public static final class186 method942(int arg0, boolean arg1) {
        field2097++;
        if (!arg1) {
            return null;
        }
        class186 var2 = (class186) class228.field3929.method273((long) arg0, 255);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg0 >= 32768) {
            var3 = class128.field2257.method1546(arg0 & 0x7FFF, (byte) -100, 0);
        } else {
            var3 = class56.field1036.method1546(arg0, (byte) -100, 0);
        }
        class186 var4 = new class186();
        if (var3 != null) {
            var4.method1332(new class14(var3), 30695);
        }
        if (arg0 >= 32768) {
            var4.method1330(0);
        }
        class228.field3929.method276(var4, (long) arg0, -110);
        return var4;
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "(III)V")
    private class117(int arg0, int arg1, int arg2) {
    }
}
