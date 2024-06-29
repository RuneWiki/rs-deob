import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class30 extends class104 implements Runnable {

    @OriginalMember(owner = "client!ea", name = "O", descriptor = "Lsc;")
    private static class119 field619 = new class119();

    @OriginalMember(owner = "client!ea", name = "P", descriptor = "[I")
    private static int[] field620 = new int[256];

    @OriginalMember(owner = "client!ea", name = "Q", descriptor = "I")
    private static int field621;

    @OriginalMember(owner = "client!ea", name = "S", descriptor = "I")
    private static int field623;

    @OriginalMember(owner = "client!ea", name = "M", descriptor = "Lhd;")
    private static class53 field617;

    @OriginalMember(owner = "client!ea", name = "N", descriptor = "Z")
    private static boolean field618;

    @OriginalMember(owner = "client!ea", name = "R", descriptor = "Z")
    private static boolean field622;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)V")
    public final synchronized void method167(int arg0, int arg1) {
        this.method801(arg1, (long) field621, false);
        field617.method376(field620, field623);
        if (arg0 == 65535) {
            field623 = 0;
        }
    }

    @OriginalMember(owner = "client!ea", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (true) {
                synchronized (this) {
                    if (field618) {
                        field618 = false;
                        return;
                    }
                    this.method169(15299);
                }
                class141.method1122(17525, 100L);
            }
        } catch (Exception var6) {
            class121.method943((byte) 96, var6, null);
        }
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)V")
    public final synchronized void method169(int arg0) {
        if (!field619.method934()) {
            return;
        }
        if (arg0 != 15299) {
            this.method225(113, 114, 4, 44L);
        }
        long var2 = (long) (field621 + 200 - field617.method379(arg0 ^ 0x33A6)) * (long) (field619.field2783 * 1000);
        while (true) {
            while (true) {
                int var4 = field619.method929();
                int var5 = field619.field2781[var4];
                long var6 = field619.method920(var5);
                if (var2 < var6) {
                    method222(false);
                    return;
                }
                while (field619.field2781[var4] == var5) {
                    field619.method925(var4);
                    this.method224(var6, (byte) -35, var4);
                    if (field619.method931()) {
                        field619.method930(var4);
                        if (field619.method924()) {
                            if (!field622) {
                                this.method804(-17, (long) (var6 / (long) (field619.field2783 * 1000)));
                                field619.method921();
                                method222(false);
                                return;
                            }
                            field619.method927(var6);
                        }
                        break;
                    }
                    field619.method928(var4);
                    field619.method930(var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(Z)V")
    private static final void method222(boolean arg0) {
        if (field623 > 0) {
            field617.method376(field620, field623);
            field623 = 0;
        }
        if (arg0) {
            method222(false);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V")
    public final synchronized void method181(byte arg0) {
        field617.method377(127);
        this.method804(-17, (long) field621);
        field617.method376(field620, field623);
        field623 = 0;
        int var2 = -58 / ((71 - arg0) / 40);
        field619.method921();
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lg;Lhd;)V")
    public class30(class43 arg0, class53 arg1) {
        field617 = arg1;
        field617.method381((byte) 120);
        field617.method377(127);
        this.method804(-17, (long) field621);
        field617.method376(field620, field623);
        field623 = 0;
        arg0.method309(10, (byte) -103, this);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZIB[B)V")
    public final synchronized void method178(boolean arg0, int arg1, byte arg2, byte[] arg3) {
        if (arg2 >= -19) {
            return;
        }
        field619.method922(arg3);
        field621 = 0;
        boolean var5 = true;
        field622 = arg0;
        field617.method377(125);
        this.method806((long) field621, (byte) -8, arg1, 0);
        int var6 = field619.method935();
        for (int var7 = 0; var7 < var6; var7++) {
            field619.method925(var7);
            while (!field619.method931()) {
                field619.method928(var7);
                if (field619.field2781[var7] != 0) {
                    var5 = false;
                    break;
                }
                this.method224(0L, (byte) -35, var7);
            }
            field619.method930(var7);
        }
        if (var5) {
            if (field622) {
                throw new RuntimeException();
            }
            this.method804(-17, (long) field621);
            field619.method921();
        }
        method222(false);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BIIII)V")
    private static final void method223(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (field623 >= field620.length) {
            field617.method376(field620, field623);
            field623 = 0;
        }
        field620[field623++] = arg2 - field621;
        field621 = arg2;
        if (arg0 != -33) {
            field622 = false;
        }
        field620[field623++] = class38.method271(arg1 << 16, class38.method271(arg4, arg3 << 8));
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(III)V")
    public final synchronized void method176(int arg0, int arg1, int arg2) {
        if (arg2 == 14) {
            this.method806((long) field621, (byte) -8, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "(I)V")
    public final void method172(int arg0) {
        synchronized (this) {
            field618 = true;
        }
        while (true) {
            synchronized (this) {
                if (!field618) {
                    break;
                }
            }
            class141.method1122(17525, 20L);
        }
        int var4 = 59 % ((62 - arg0) / 59);
        field617.method378(-29032);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(JBI)V")
    private final void method224(long arg0, byte arg1, int arg2) {
        if (arg1 != -35) {
            return;
        }
        int var5 = field619.method936(arg2);
        if (var5 == 1) {
            field619.method923();
        } else if ((var5 & 0x80) != 0) {
            int var6 = (int) (arg0 / (long) (field619.field2783 * 1000));
            int var7 = var5 >> 8 & 0xFF;
            int var8 = var5 & 0xFF;
            int var9 = var5 >> 16 & 0xFF;
            if (!this.method802(var8, var7, var9, (long) var6)) {
                method223((byte) -33, var9, var6, var7, var8);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIJ)V")
    public final void method225(int arg0, int arg1, int arg2, long arg3) {
        method223((byte) -33, arg2, (int) arg3, arg1, arg0);
    }
}
