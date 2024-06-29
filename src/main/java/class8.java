import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class8 {

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "Lge;")
    private class65 field168 = new class65(256);

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "Lge;")
    private class65 field170 = new class65(256);

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "Lu;")
    private class184 field162;

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "Lu;")
    private class184 field166;

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "Lfc;")
    public static class54 field171 = new class54(20);

    @OriginalMember(owner = "client!ag", name = "k", descriptor = "Lrf;")
    public static class163 field172 = class53.method392(-101, "nicht hergestellt werden)3");

    @OriginalMember(owner = "client!ag", name = "n", descriptor = "Lrf;")
    private static class163 field175 = class53.method392(73, "Click to switch");

    @OriginalMember(owner = "client!ag", name = "m", descriptor = "Lrf;")
    public static class163 field174 = field175;

    @OriginalMember(owner = "client!ag", name = "l", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field173 = new CRC32();

    @OriginalMember(owner = "client!ag", name = "q", descriptor = "Lrf;")
    public static class163 field178 = class53.method392(-79, "http:)4)4");

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "I")
    public static int field163;

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "I")
    public static int field164;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
    public static int field165;

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "I")
    public static int field167;

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "I")
    public static int field169;

    @OriginalMember(owner = "client!ag", name = "o", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!ag", name = "p", descriptor = "I")
    public static int field177;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I[III)Lqe;")
    private final class153 method65(int arg0, int[] arg1, int arg2, int arg3) {
        field169++;
        int var5 = arg0 ^ (arg3 << 4 & 0xFFF4 | arg3 >>> 12);
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6;
        class153 var9 = (class153) this.field170.method465(var7, (byte) 118);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            if (arg2 != 1902188016) {
                this.method65(-43, null, 67, -36);
            }
            class110 var10 = class110.method767(this.field162, arg3, arg0);
            if (var10 == null) {
                return null;
            }
            class153 var11 = var10.method769();
            this.field170.method462(-60, var11, var7);
            if (arg1 != null) {
                arg1[0] -= var11.field3173.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)V")
    public static void method66(byte arg0) {
        field178 = null;
        field171 = null;
        field175 = null;
        field173 = null;
        field172 = null;
        field174 = null;
        if (arg0 < 62) {
            field176 = -123;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(II[I)Lqe;")
    public final class153 method67(int arg0, int arg1, int[] arg2) {
        field167++;
        if (arg0 != 0) {
            method70(-108, (byte) 17);
        }
        if (this.field162.method1245(382) == 1) {
            return this.method65(arg1, arg2, arg0 + 1902188016, 0);
        } else if (this.field162.method1225(arg1, true) == 1) {
            return this.method65(0, arg2, 1902188016, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(B[II)Lqe;")
    public final class153 method68(byte arg0, int[] arg1, int arg2) {
        field165++;
        if (arg0 <= 13) {
            this.field162 = null;
        }
        if (this.field166.method1245(382) == 1) {
            return this.method69(arg2, 0, 20, arg1);
        } else if (this.field166.method1225(arg2, true) == 1) {
            return this.method69(0, arg2, 20, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(III[I)Lqe;")
    private final class153 method69(int arg0, int arg1, int arg2, int[] arg3) {
        field163++;
        int var5 = arg0 ^ (arg1 >>> 12 | (arg1 & 0x80000FFF) << 4);
        if (arg2 != 20) {
            return null;
        }
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class153 var9 = (class153) this.field170.method465(var7, (byte) 125);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class24 var10 = (class24) this.field168.method465(var7, (byte) 100);
            if (var10 == null) {
                var10 = class24.method148(this.field166, arg1, arg0);
                if (var10 == null) {
                    return null;
                }
                this.field168.method462(-61, var10, var7);
            }
            class153 var11 = var10.method147(arg3);
            if (var11 == null) {
                return null;
            } else {
                var10.method630(75);
                this.field170.method462(-16, var11, var7);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IB)Z")
    public static final boolean method70(int arg0, byte arg1) {
        field164++;
        int var2 = -38 % ((arg1 - 71) / 51);
        return (arg0 >> 28 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(Lu;Lu;)V")
    public class8(class184 arg0, class184 arg1) {
        this.field162 = arg0;
        this.field166 = arg1;
    }
}
