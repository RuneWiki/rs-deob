import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uea")
public class class315 {

    @OriginalMember(owner = "client!uea", name = "g", descriptor = "[Lkha;")
    private class583[] field4359;

    @OriginalMember(owner = "client!uea", name = "f", descriptor = "I")
    private int field4358;

    @OriginalMember(owner = "client!uea", name = "j", descriptor = "Lgg;")
    public static class172 field4362 = new class172(1);

    @OriginalMember(owner = "client!uea", name = "l", descriptor = "[Loaa;")
    public static class287[] field4364 = new class287[0];

    @OriginalMember(owner = "client!uea", name = "k", descriptor = "[I")
    public static int[] field4363 = new int[14];

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "I")
    public static int field4353;

    @OriginalMember(owner = "client!uea", name = "c", descriptor = "I")
    public static int field4355;

    @OriginalMember(owner = "client!uea", name = "e", descriptor = "I")
    public static int field4357;

    @OriginalMember(owner = "client!uea", name = "h", descriptor = "I")
    public static int field4360;

    @OriginalMember(owner = "client!uea", name = "i", descriptor = "I")
    public static int field4361;

    @OriginalMember(owner = "client!uea", name = "b", descriptor = "J")
    private long field4354;

    @OriginalMember(owner = "client!uea", name = "m", descriptor = "J")
    public static long field4365;

    @OriginalMember(owner = "client!uea", name = "d", descriptor = "Lkha;")
    private class583 field4356;

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(BJLkha;)V", line = 7)
    public final void method2030(byte arg0, long arg1, class583 arg2) {
        int var5 = -71 % ((-arg0 - 13) / 32);
        if (arg2.field8205 != null) {
            arg2.method3311(100);
        }
        field4360++;
        class583 var6 = this.field4359[(int) ((long) (this.field4358 - 1) & arg1)];
        arg2.field8205 = var6.field8205;
        arg2.field8206 = var6;
        arg2.field8205.field8206 = arg2;
        arg2.field8207 = arg1;
        arg2.field8206.field8205 = arg2;
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(II)Ljava/lang/String;", line = 31)
    public static final String method2031(int arg0, int arg1) {
        field4355++;
        String var2 = Integer.toString(arg0);
        if (arg1 <= 54) {
            return null;
        }
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class71.field929.method588((byte) 109, class549.field7669) + " (" + var2 + ")</col>";
        } else if (var2.length() > 6) {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class71.field931.method588((byte) 97, class549.field7669) + " (" + var2 + ")</col>";
        } else {
            return " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(Ljb;Z)Ljb;", line = 64)
    public static final class493 method2032(class493 arg0, boolean arg1) {
        field4361++;
        if (arg0.field7078 != -1) {
            return class127.method854((byte) -105, arg0.field7078);
        }
        int var2 = arg0.field6956 >>> 16;
        class69 var3 = new class69(class475.field6744);
        if (!arg1) {
            field4362 = null;
        }
        for (class47 var4 = (class47) var3.method570(0); var4 != null; var4 = (class47) var3.method568((byte) -93)) {
            if (var4.field550 == var2) {
                return class127.method854((byte) -88, (int) var4.field2546);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!uea", name = "<init>", descriptor = "(I)V", line = 94)
    public class315(int arg0) {
        this.field4359 = new class583[arg0];
        this.field4358 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class583 var3 = this.field4359[var2] = new class583();
            var3.field8205 = var3;
            var3.field8206 = var3;
        }
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(IJ)Lkha;", line = 118)
    public final class583 method2033(int arg0, long arg1) {
        this.field4354 = arg1;
        field4353++;
        class583 var4 = this.field4359[(int) ((long) (this.field4358 + arg0) & arg1)];
        for (this.field4356 = var4.field8206; this.field4356 != var4; this.field4356 = this.field4356.field8206) {
            if (this.field4356.field8207 == arg1) {
                class583 var5 = this.field4356;
                this.field4356 = this.field4356.field8206;
                return var5;
            }
        }
        this.field4356 = null;
        return null;
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(I)Lkha;", line = 144)
    public final class583 method2034(int arg0) {
        if (arg0 != -23702) {
            return null;
        }
        field4357++;
        if (this.field4356 == null) {
            return null;
        }
        class583 var2 = this.field4359[(int) (this.field4354 & (long) (this.field4358 - 1))];
        while (this.field4356 != var2) {
            if (this.field4356.field8207 == this.field4354) {
                class583 var3 = this.field4356;
                this.field4356 = this.field4356.field8206;
                return var3;
            }
            this.field4356 = this.field4356.field8206;
        }
        this.field4356 = null;
        return null;
    }

    @OriginalMember(owner = "client!uea", name = "b", descriptor = "(I)V", line = 176)
    public static void method2035(int arg0) {
        field4363 = null;
        field4364 = null;
        field4362 = null;
        if (arg0 != 0) {
            field4362 = null;
        }
    }
}
