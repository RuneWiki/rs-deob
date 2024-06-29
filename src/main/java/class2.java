import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class2 {

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
    public static int field18 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!aa", name = "l", descriptor = "I")
    public static int field28 = 0;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "I")
    public static int field21;

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!aa", name = "m", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "J")
    public long field22;

    @OriginalMember(owner = "client!aa", name = "j", descriptor = "Laa;")
    public class2 field26;

    @OriginalMember(owner = "client!aa", name = "k", descriptor = "Laa;")
    public class2 field27;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "[Lab;")
    public static class3[] field17;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V", line = 6)
    public static final void method8(int arg0) {
        field23++;
        for (int var1 = arg0; var1 < class81.field1948; var1++) {
            int var5;
            if (var1 == -1) {
                var5 = 2047;
            } else {
                var5 = class119.field2820[var1];
            }
            class103 var6 = class44.field1067[var5];
            if (var6 != null && var6.field1251 > 0) {
                var6.field1251--;
                if (var6.field1251 == 0) {
                    var6.field1219 = null;
                }
            }
        }
        for (int var2 = 0; var2 < class130.field3042; var2++) {
            int var3 = class65.field1530[var2];
            class66 var4 = class9.field189[var3];
            if (var4 != null && var4.field1251 > 0) {
                var4.field1251--;
                if (var4.field1251 == 0) {
                    var4.field1219 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)V", line = 73)
    public static final void method9(int arg0) {
        field19++;
        if (arg0 != 0) {
            method12(117, 90);
        }
        for (class54 var1 = (class54) class49.field1174.method83(64); var1 != null; var1 = (class54) class49.field1174.method81(arg0 ^ 0xFFFFFF9B)) {
            if (var1.field1286 == -1) {
                var1.field1292 = 0;
                class77.method619(arg0 ^ 0x6D, var1);
            } else {
                var1.method13(72);
            }
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Z)Z", line = 118)
    public final boolean method10(boolean arg0) {
        field25++;
        if (arg0) {
            this.method10(true);
        }
        return this.field26 != null;
    }

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "(I)V", line = 136)
    public static void method11(int arg0) {
        if (arg0 > 35) {
            field17 = null;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)Lr;", line = 146)
    public static final class106 method12(int arg0, int arg1) {
        field24++;
        class106 var2 = (class106) class77.field1820.method373((byte) 103, (long) arg0);
        if (arg1 != 21876) {
            method12(19, 56);
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class59.field1406.method27(arg0, true, 6);
        class106 var4 = new class106();
        var4.field2414 = arg0;
        if (var3 != null) {
            var4.method811((byte) 113, new class140(var3));
        }
        var4.method821((byte) 76);
        if (var4.field2419) {
            var4.field2429 = false;
            var4.field2390 = false;
        }
        class77.field1820.method374(0, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "(I)V", line = 194)
    public final void method13(int arg0) {
        field20++;
        if (this.field26 == null) {
            return;
        }
        this.field26.field27 = this.field27;
        this.field27.field26 = this.field26;
        if (arg0 < 59) {
            method11(79);
        }
        this.field26 = null;
        this.field27 = null;
    }
}
