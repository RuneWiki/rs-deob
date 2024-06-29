import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class163 {

    @OriginalMember(owner = "client!mk", name = "l", descriptor = "I")
    private int field2460 = -1;

    @OriginalMember(owner = "client!mk", name = "r", descriptor = "I")
    private int field2466 = 0;

    @OriginalMember(owner = "client!mk", name = "p", descriptor = "Lql;")
    private class87 field2464 = new class87();

    @OriginalMember(owner = "client!mk", name = "s", descriptor = "Z")
    public boolean field2467 = false;

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "I")
    private int field2454;

    @OriginalMember(owner = "client!mk", name = "q", descriptor = "[Lgh;")
    private class223[] field2465;

    @OriginalMember(owner = "client!mk", name = "h", descriptor = "I")
    private int field2456;

    @OriginalMember(owner = "client!mk", name = "n", descriptor = "[[I")
    private int[][] field2462;

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "Ljava/lang/String;")
    public static String field2450 = "white:";

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "I")
    public static int field2451;

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "I")
    public static int field2452;

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "I")
    public static int field2453;

    @OriginalMember(owner = "client!mk", name = "g", descriptor = "I")
    public static int field2455;

    @OriginalMember(owner = "client!mk", name = "i", descriptor = "I")
    public static int field2457;

    @OriginalMember(owner = "client!mk", name = "k", descriptor = "I")
    public static int field2459;

    @OriginalMember(owner = "client!mk", name = "m", descriptor = "I")
    public static int field2461;

    @OriginalMember(owner = "client!mk", name = "j", descriptor = "Z")
    public static boolean field2458;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "[I")
    public static int[] field2449;

    @OriginalMember(owner = "client!mk", name = "o", descriptor = "[[Ltb;")
    public static class220[][] field2463;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(B)V", line = 4)
    public final void method1106(byte arg0) {
        if (arg0 <= 117) {
            field2449 = (int[]) null;
        }
        field2457++;
        for (int var2 = 0; var2 < this.field2456; var2++) {
            this.field2462[var2] = null;
        }
        this.field2465 = null;
        this.field2462 = (int[][]) null;
        this.field2464.method634((byte) 80);
        this.field2464 = null;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)[[I", line = 38)
    public final int[][] method1107(int arg0) {
        field2452++;
        if (this.field2456 != this.field2454) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = arg0; var2 < this.field2456; var2++) {
            this.field2465[var2] = class234.field3736;
        }
        return this.field2462;
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(I)V", line = 59)
    public static void method1108(int arg0) {
        field2450 = null;
        field2449 = null;
        if (arg0 != -1) {
            field2449 = (int[]) null;
        }
        field2463 = (class220[][]) null;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(II)Lnk;", line = 72)
    public static final class212 method1109(int arg0, int arg1) {
        field2459++;
        class212 var2 = (class212) class143.field2225.method443(arg1 + 32767, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (~arg0 <= arg1) {
            var3 = class263.field4097.method980(0, arg0 & 0x7FFF, 5);
        } else {
            var3 = class190.field2847.method980(0, arg0, 5);
        }
        class212 var4 = new class212();
        if (var3 != null) {
            var4.method1491((byte) -120, new class166(var3));
        }
        if (arg0 >= 32768) {
            var4.method1494(20196);
        }
        class143.field2225.method439(var4, (long) arg0, (byte) 18);
        return var4;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(BI)[I", line = 108)
    public final int[] method1110(byte arg0, int arg1) {
        field2455++;
        if (arg0 != 108) {
            method1111((String) null, false);
        }
        if (this.field2456 == this.field2454) {
            this.field2467 = this.field2465[arg1] == null;
            this.field2465[arg1] = class234.field3736;
            return this.field2462[arg1];
        } else if (this.field2456 == 1) {
            this.field2467 = this.field2460 != arg1;
            this.field2460 = arg1;
            return this.field2462[0];
        } else {
            class223 var3 = this.field2465[arg1];
            if (var3 == null) {
                this.field2467 = true;
                if (this.field2456 <= this.field2466) {
                    class223 var4 = (class223) this.field2464.method635((byte) 42);
                    var3 = new class223(arg1, var4.field3547);
                    this.field2465[var4.field3546] = null;
                    var4.method403(arg0 ^ 0x6D);
                } else {
                    var3 = new class223(arg1, this.field2466);
                    this.field2466++;
                }
                this.field2465[arg1] = var3;
            } else {
                this.field2467 = false;
            }
            this.field2464.method631(var3, false);
            return this.field2462[var3.field3547];
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Ljava/lang/String;Z)Z", line = 176)
    public static final boolean method1111(String arg0, boolean arg1) {
        field2461++;
        if (arg0 == null) {
            return false;
        }
        if (arg1) {
            field2458 = false;
        }
        for (int var2 = 0; var2 < class225.field3579; var2++) {
            if (arg0.equalsIgnoreCase(class51.field828[var2])) {
                return true;
            }
        }
        if (arg0.equalsIgnoreCase(class98.field1566.field477)) {
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(III)V", line = 218)
    public class163(int arg0, int arg1, int arg2) {
        this.field2454 = arg1;
        this.field2465 = new class223[this.field2454];
        this.field2456 = arg0;
        this.field2462 = new int[this.field2456][arg2];
    }
}
