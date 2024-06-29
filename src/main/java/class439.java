import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public class class439 {

    @OriginalMember(owner = "client!it", name = "c", descriptor = "Lrp;")
    private class288 field6443 = new class288(128);

    @OriginalMember(owner = "client!it", name = "d", descriptor = "Llt;")
    private class458 field6444;

    @OriginalMember(owner = "client!it", name = "a", descriptor = "Lsk;")
    public static class423 field6441 = new class423(" more options", " weitere Optionen", " autres options", " mais opções");

    @OriginalMember(owner = "client!it", name = "g", descriptor = "Loe;")
    public static class127 field6447 = new class127(61, -2);

    @OriginalMember(owner = "client!it", name = "i", descriptor = "I")
    public static int field6449 = 0;

    @OriginalMember(owner = "client!it", name = "b", descriptor = "I")
    public static int field6442;

    @OriginalMember(owner = "client!it", name = "e", descriptor = "I")
    public static int field6445;

    @OriginalMember(owner = "client!it", name = "f", descriptor = "I")
    public static int field6446;

    @OriginalMember(owner = "client!it", name = "h", descriptor = "[I")
    public static int[] field6448;

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(Ltf;IBI)J")
    public static final long method2560(class185 arg0, int arg1, byte arg2, int arg3) {
        if (arg2 < 1) {
            return -118L;
        }
        field6446++;
        long var4 = 4194304L;
        long var6 = 2147483648L;
        long var8 = Long.MIN_VALUE;
        class56 var10 = class128.field2070.method916((byte) -15, arg0.method174((byte) 115));
        long var11 = (long) (arg1 | 0x800000 << 7 | arg3 | arg0.method170(true) << 14 | arg0.method173(1438) << 20);
        if (var10.field895 == 0) {
            var11 |= var8;
        }
        if (var10.field960 == 1) {
            var11 |= var4;
        }
        if (var10.field900) {
            var11 |= var6;
        }
        return var11 | (long) arg0.method174((byte) 122) << 32;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(I)V")
    public static void method2561(int arg0) {
        field6448 = null;
        field6447 = null;
        field6441 = null;
        if (arg0 != 6970) {
            field6447 = null;
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(Lha;B)Let;")
    public static final class404 method2562(class40 arg0, byte arg1) {
        field6442++;
        arg0.method257((byte) 45);
        int var2 = 68 / ((arg1 - 40) / 44);
        int var3 = arg0.method257((byte) 41);
        class404 var4 = class302.method1817((byte) 71, var3);
        var4.field5884 = arg0.method257((byte) 91);
        int var5 = arg0.method257((byte) 37);
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = arg0.method257((byte) 35);
            var4.method87(0, arg0, var7);
        }
        var4.method211(-3);
        return var4;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(BI)Lkp;")
    public final class324 method2563(byte arg0, int arg1) {
        field6445++;
        class288 var3 = this.field6443;
        class324 var4;
        synchronized (this.field6443) {
            var4 = (class324) this.field6443.method1752(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field6444.method2715(class222.method1348(arg1, (byte) -80), class67.method452(arg1, (byte) -28), false);
        class324 var6 = new class324();
        if (var5 != null) {
            var6.method2022(-106, new class40(var5));
        }
        class288 var7 = this.field6443;
        synchronized (this.field6443) {
            this.field6443.method1758(1, var6, (long) arg1);
        }
        if (arg0 <= 22) {
            this.method2563((byte) -71, 66);
        }
        return var6;
    }

    @OriginalMember(owner = "client!it", name = "<init>", descriptor = "(Lcm;ILlt;)V")
    public class439(class491 arg0, int arg1, class458 arg2) {
        this.field6444 = arg2;
        if (this.field6444 != null) {
            int var4 = this.field6444.method2738((byte) 109) - 1;
            this.field6444.method2726((byte) 113, var4);
        }
    }
}
