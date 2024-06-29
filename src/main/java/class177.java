import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class177 {

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "Lcc;")
    private class217 field3173 = new class217();

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "Lob;")
    private class256 field3177 = new class256();

    @OriginalMember(owner = "client!bg", name = "k", descriptor = "I")
    private int field3178;

    @OriginalMember(owner = "client!bg", name = "l", descriptor = "I")
    private int field3179;

    @OriginalMember(owner = "client!bg", name = "m", descriptor = "Ltg;")
    private class277 field3180;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
    public static int field3170 = 0;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
    public static int field3168;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "I")
    public static int field3169;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
    public static int field3171;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "I")
    public static int field3174;

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "I")
    public static int field3175;

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "I")
    public static int field3176;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lcc;JI)V")
    public final void method1163(class217 arg0, long arg1, int arg2) {
        field3174++;
        if (this.field3178 == arg2) {
            class217 var5 = this.field3177.method1700(-1);
            var5.method349(0);
            var5.method1490(-28126);
            if (this.field3173 == var5) {
                class217 var6 = this.field3177.method1700(-1);
                var6.method349(0);
                var6.method1490(arg2 ^ 0xFFFF9222);
            }
        } else {
            this.field3178--;
        }
        this.field3180.method1825(arg0, (byte) 64, arg1);
        this.field3177.method1694(112, arg0);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IILgf;)Z")
    public static final boolean method1164(int arg0, int arg1, class7 arg2) {
        if (arg1 < 38) {
            method1167(-1.7888915469001072D, 61);
        }
        field3175++;
        byte[] var3 = arg2.method33(arg0, -67);
        if (var3 == null) {
            return false;
        } else {
            class246.method1633(var3, 8);
            return true;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)Lje;")
    public final class61 method1165(byte arg0) {
        int var2 = -12 % ((4 - arg0) / 43);
        field3169++;
        return this.field3180.method1818(false);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V")
    public final void method1166(int arg0) {
        field3172++;
        this.field3177.method1695(true);
        this.field3180.method1826((byte) 61);
        this.field3173 = new class217();
        this.field3178 = this.field3179;
        if (arg0 <= 117) {
            method1164(-127, -59, (class7) null);
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(DI)V")
    public static final void method1167(double arg0, int arg1) {
        if (class82.field1487 != arg0) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg0) * 255.0D);
                class282.field4959[var3] = var4 > 255 ? 255 : var4;
            }
            class82.field1487 = arg0;
        }
        field3176++;
        if (arg1 != 255) {
            field3170 = 55;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(JB)Lcc;")
    public final class217 method1168(long arg0, byte arg1) {
        field3171++;
        class217 var4 = (class217) this.field3180.method1824(arg0, 0);
        if (arg1 != 96) {
            this.method1165((byte) 21);
        }
        if (var4 != null) {
            this.field3177.method1694(93, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(B)Lje;")
    public final class61 method1169(byte arg0) {
        field3168++;
        if (arg0 != -25) {
            method1164(-124, -63, (class7) null);
        }
        return this.field3180.method1834((byte) 111);
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(I)V")
    public class177(int arg0) {
        this.field3178 = arg0;
        this.field3179 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field3180 = new class277(var2);
    }
}
