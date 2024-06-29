import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class266 {

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "I")
    public int field4424 = 8;

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "I")
    public int field4426 = 0;

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "Z")
    public boolean field4428 = true;

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "I")
    public int field4425 = 128;

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "I")
    public int field4427 = 16;

    @OriginalMember(owner = "client!ef", name = "o", descriptor = "Z")
    public boolean field4436 = true;

    @OriginalMember(owner = "client!ef", name = "p", descriptor = "Z")
    public boolean field4437 = false;

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "I")
    public int field4429 = 1190717;

    @OriginalMember(owner = "client!ef", name = "r", descriptor = "I")
    public int field4439 = -1;

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "I")
    public int field4431 = -1;

    @OriginalMember(owner = "client!ef", name = "l", descriptor = "Lbd;")
    public static class162 field4433 = class17.method142(0, " )2> <col=ffffff>");

    @OriginalMember(owner = "client!ef", name = "n", descriptor = "Lbd;")
    public static class162 field4435 = class17.method142(0, "headicons_pk");

    @OriginalMember(owner = "client!ef", name = "k", descriptor = "[J")
    public static long[] field4432 = new long[256];

    @OriginalMember(owner = "client!ef", name = "u", descriptor = "Lbd;")
    public static class162 field4442;

    @OriginalMember(owner = "client!ef", name = "t", descriptor = "I")
    public static volatile int field4441;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "I")
    public static int field4422;

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "I")
    public static int field4423;

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "I")
    public static int field4430;

    @OriginalMember(owner = "client!ef", name = "m", descriptor = "I")
    public static int field4434;

    @OriginalMember(owner = "client!ef", name = "s", descriptor = "I")
    public static int field4440;

    @OriginalMember(owner = "client!ef", name = "q", descriptor = "[Lpm;")
    public static class99[] field4438;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lb;II)V", line = 17)
    public final void method1820(class94 arg0, int arg1, int arg2) {
        while (true) {
            int var4 = arg0.method756(915905888);
            if (var4 == 0) {
                field4422++;
                if (arg2 != 21093) {
                    this.field4425 = -77;
                }
                return;
            }
            this.method1821(arg1, arg2 - 21206, arg0, var4);
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IILb;I)V", line = 59)
    private final void method1821(int arg0, int arg1, class94 arg2, int arg3) {
        int var5 = 43 % ((-arg1 - 52) / 60);
        field4434++;
        if (arg3 == 1) {
            this.field4426 = class144.method1156(false, arg2.method732(-1));
        } else if (arg3 == 2) {
            this.field4439 = arg2.method756(915905888);
        } else if (arg3 == 3) {
            this.field4439 = arg2.method761((byte) 108);
            if (this.field4439 == 65535) {
                this.field4439 = -1;
            }
        } else if (arg3 == 5) {
            this.field4428 = false;
        } else if (arg3 == 7) {
            this.field4431 = class144.method1156(false, arg2.method732(-1));
        } else if (arg3 == 8) {
            class149.field2686 = arg0;
        } else if (arg3 == 9) {
            this.field4425 = arg2.method761((byte) 108);
        } else if (arg3 == 10) {
            this.field4436 = false;
        } else if (arg3 == 11) {
            this.field4424 = arg2.method756(915905888);
        } else if (arg3 == 12) {
            this.field4437 = true;
        } else if (arg3 == 13) {
            this.field4429 = arg2.method732(-1);
        } else if (arg3 == 14) {
            this.field4427 = arg2.method756(915905888);
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field4432[var0] = var1;
        }
        field4442 = class17.method142(0, "Clientscript error in: ");
        field4441 = 0;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(BIIIZ)V", line = 142)
    public static final void method1822(byte arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg0 != -35) {
            field4433 = (class162) null;
        }
        class82.field1432 = 0L;
        field4430++;
        int var5 = class251.method1754((byte) -126);
        if (arg3 == 3 || var5 == 3) {
            arg4 = true;
        }
        if (class28.field472.startsWith("mac") && arg3 > 0) {
            arg4 = true;
        }
        boolean var6 = false;
        if (arg3 <= 0 == var5 > 0) {
            var6 = true;
        }
        if (arg4 && arg3 > 0) {
            var6 = true;
        }
        class134.method1058(arg1, var6, var5, (byte) -122, arg3, arg2, arg4);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)V", line = 181)
    public static final void method1823(int arg0, int arg1) {
        for (class188 var2 = (class188) class178.field3046.method1666((byte) -122); var2 != null; var2 = (class188) class178.field3046.method1673((byte) 44)) {
            if ((var2.field2701 >> 48 & 0xFFFFL) == ((long) arg0)) {
                var2.method1183(false);
            }
        }
        if (arg1 != 2949) {
            method1824((byte) 34);
        }
        field4440++;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)V", line = 203)
    public static void method1824(byte arg0) {
        int var1 = -121 / ((arg0 - 7) / 36);
        field4432 = null;
        field4435 = null;
        field4442 = null;
        field4438 = null;
        field4433 = null;
    }
}
