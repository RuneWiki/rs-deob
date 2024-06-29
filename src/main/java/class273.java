import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class273 extends class109 {

    @OriginalMember(owner = "client!pl", name = "A", descriptor = "I")
    private final int field4438;

    @OriginalMember(owner = "client!pl", name = "S", descriptor = "I")
    private final int field4455;

    @OriginalMember(owner = "client!pl", name = "C", descriptor = "I")
    private final int field4440;

    @OriginalMember(owner = "client!pl", name = "V", descriptor = "I")
    private int field4458;

    @OriginalMember(owner = "client!pl", name = "Q", descriptor = "Lok;")
    public static class41 field4453 = class137.method956("Spieler kann nicht gefunden werden: ", 45);

    @OriginalMember(owner = "client!pl", name = "R", descriptor = "I")
    public static int field4454 = 0;

    @OriginalMember(owner = "client!pl", name = "W", descriptor = "I")
    public static int field4459 = 2;

    @OriginalMember(owner = "client!pl", name = "y", descriptor = "[J")
    public static long[] field4436 = new long[100];

    @OriginalMember(owner = "client!pl", name = "M", descriptor = "I")
    public static int field4449 = 0;

    @OriginalMember(owner = "client!pl", name = "z", descriptor = "I")
    private int field4437;

    @OriginalMember(owner = "client!pl", name = "B", descriptor = "I")
    public static int field4439;

    @OriginalMember(owner = "client!pl", name = "D", descriptor = "I")
    public static int field4441;

    @OriginalMember(owner = "client!pl", name = "E", descriptor = "I")
    private int field4442;

    @OriginalMember(owner = "client!pl", name = "F", descriptor = "I")
    public static int field4443;

    @OriginalMember(owner = "client!pl", name = "H", descriptor = "I")
    public static int field4444;

    @OriginalMember(owner = "client!pl", name = "K", descriptor = "I")
    public static int field4447;

    @OriginalMember(owner = "client!pl", name = "L", descriptor = "I")
    public static int field4448;

    @OriginalMember(owner = "client!pl", name = "N", descriptor = "I")
    private int field4450;

    @OriginalMember(owner = "client!pl", name = "O", descriptor = "I")
    private int field4451;

    @OriginalMember(owner = "client!pl", name = "P", descriptor = "I")
    public static int field4452;

    @OriginalMember(owner = "client!pl", name = "T", descriptor = "I")
    public static int field4456;

    @OriginalMember(owner = "client!pl", name = "U", descriptor = "I")
    public static int field4457;

    @OriginalMember(owner = "client!pl", name = "X", descriptor = "I")
    public static int field4460;

    @OriginalMember(owner = "client!pl", name = "Y", descriptor = "I")
    public static int field4461;

    @OriginalMember(owner = "client!pl", name = "Z", descriptor = "Lma;")
    public static class152 field4462;

    @OriginalMember(owner = "client!pl", name = "I", descriptor = "[B")
    private byte[] field4445;

    @OriginalMember(owner = "client!pl", name = "J", descriptor = "[[Lbc;")
    public static class302[][] field4446;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(ZII)V", line = 6)
    public final void method341(boolean arg0, int arg1, int arg2) {
        field4457++;
        if (arg0) {
            return;
        }
        if (arg1 == 0) {
            this.field4437 = this.field4438 - (arg2 < 0 ? -arg2 : arg2);
            this.field4450 = 4096;
            this.field4437 = this.field4437 * this.field4437 >> 12;
            this.field4451 = this.field4437;
            return;
        }
        this.field4450 = this.field4455 * this.field4437 >> 12;
        if (this.field4450 < 0) {
            this.field4450 = 0;
        } else if (this.field4450 > 4096) {
            this.field4450 = 4096;
        }
        this.field4437 = this.field4438 - (arg2 < 0 ? -arg2 : arg2);
        this.field4437 = this.field4437 * this.field4437 >> 12;
        this.field4437 = this.field4450 * this.field4437 >> 12;
        this.field4451 += this.field4458 * this.field4437 >> 12;
        this.field4458 = this.field4458 * this.field4440 >> 12;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lok;I)I", line = 47)
    public static final int method1928(class41 arg0, int arg1) {
        if (arg1 != 4096) {
            return 65;
        }
        field4441++;
        if (arg0 == null) {
            return -1;
        }
        for (int var2 = 0; var2 < class118.field1741; var2++) {
            if (arg0.method306(class78.field1147[var2], arg1 + 22984)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IB)V", line = 99)
    public void method823(int arg0, byte arg1) {
        this.field4445[arg0] = arg1;
        field4447++;
    }

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "(I)V", line = 109)
    public final void method342(int arg0) {
        this.field4451 >>= 0x4;
        if (arg0 != 23101) {
            return;
        }
        field4439++;
        this.field4458 = this.field4440;
        if (this.field4451 < 0) {
            this.field4451 = 0;
        } else if (this.field4451 > 255) {
            this.field4451 = 255;
        }
        this.method823(this.field4442++, (byte) this.field4451);
        this.field4451 = 0;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(ZZ)V", line = 142)
    public static final void method1929(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            field4453 = (class41) null;
        }
        while (class97.field1419 > var2) {
            long var3 = (long) class101.field1441[var2] << 32 | 0x20000000L;
            class50 var5 = class216.field3471[class101.field1441[var2]];
            if (var5 != null && var5.method351(!arg0) && var5.field758.field2282 == arg1 && var5.field758.method1024((byte) -121)) {
                int var6 = var5.field4311 >> 7;
                int var7 = var5.field4280 >> 7;
                if (var7 >= 0 && var7 < 104 && var6 >= 0 && var6 < 104) {
                    label75: {
                        if (var5.method1753((byte) -15) == 1 && (var5.field4280 & 0x7F) == 64 && (var5.field4311 & 0x7F) == 64) {
                            if (class252.field4010[var7][var6] == class112.field1646) {
                                break label75;
                            }
                            class252.field4010[var7][var6] = class112.field1646;
                        }
                        if (!var5.field758.field2235) {
                            var3 |= Long.MIN_VALUE;
                        }
                        var5.field4307 = class140.method983((byte) 80, class55.field807, var5.field4280, var5.field4311);
                        class238.method1709(class55.field807, var5.field4280, var5.field4311, var5.field4307, (var5.method1753((byte) -15) - 1) * 64 + 60, var5, var5.field4297, var3, var5.field4331);
                    }
                }
            }
            var2++;
        }
        field4448++;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(II)Lwl;", line = 196)
    public static final class307 method1930(int arg0, int arg1) {
        field4460++;
        class307 var2 = (class307) class65.field974.method136((long) arg1, true);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class222.field3553.method454(arg0, 0, arg1);
        class307 var4 = new class307();
        if (var3 != null) {
            var4.method2135(new class112(var3), arg0 ^ 0xFFFFE75F);
        }
        class65.field974.method132((long) arg1, var4, -1);
        return var4;
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(IIIIIFFF)V", line = 215)
    public class273(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field4438 = (int) (arg6 * 4096.0F);
        this.field4455 = (int) (arg7 * 4096.0F);
        this.field4458 = this.field4440 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(B)V", line = 230)
    public final void method344(byte arg0) {
        this.field4442 = 0;
        if (arg0 != -77) {
            this.field4442 = -88;
        }
        field4443++;
        this.field4451 = 0;
    }

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "(I)V", line = 249)
    public static void method1931(int arg0) {
        field4446 = (class302[][]) null;
        field4462 = null;
        field4453 = null;
        field4436 = null;
        if (arg0 != 20630) {
            method1931(11);
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IILok;)V", line = 263)
    public static final void method1932(int arg0, int arg1, class41 arg2) {
        if (arg1 != -26900) {
            return;
        }
        field4456++;
        class165.field2613++;
        class285.field4642.method844(arg1 ^ 0x6910, 30);
        class285.field4642.method762(arg2.method291((byte) 65), true);
        class285.field4642.method767((byte) -56, arg0);
    }
}
