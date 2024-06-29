import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class27 extends class47 implements Runnable {

    @OriginalMember(owner = "client!de", name = "K", descriptor = "Lue;")
    private static class133 field606 = new class133();

    @OriginalMember(owner = "client!de", name = "M", descriptor = "[I")
    private static int[] field608 = new int[256];

    @OriginalMember(owner = "client!de", name = "N", descriptor = "I")
    private static int field609;

    @OriginalMember(owner = "client!de", name = "O", descriptor = "I")
    private static int field610;

    @OriginalMember(owner = "client!de", name = "J", descriptor = "Lad;")
    private static class5 field605;

    @OriginalMember(owner = "client!de", name = "L", descriptor = "Z")
    private static boolean field607;

    @OriginalMember(owner = "client!de", name = "P", descriptor = "Z")
    private static boolean field611;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(B)V")
    public final void method157(byte arg0) {
        synchronized (this) {
            field607 = true;
        }
        while (true) {
            synchronized (this) {
                if (!field607) {
                    break;
                }
            }
            class28.method219(true, 20L);
        }
        if (arg0 > -107) {
            this.method158((byte) 100);
        }
        field605.method35(6117);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IBIII)V")
    private static final void method215(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (field610 >= field608.length) {
            field605.method31(field608, field610);
            field610 = 0;
        }
        if (arg1 >= 54) {
            field608[field610++] = arg4 - field609;
            field609 = arg4;
            field608[field610++] = class49.method351(arg3 << 16, class49.method351(arg2 << 8, arg0));
        }
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "(Lha;Lad;)V")
    public class27(class50 arg0, class5 arg1) {
        field605 = arg1;
        field605.method34(-23888);
        field605.method33(true);
        this.method339(true, (long) field609);
        field605.method31(field608, field610);
        field610 = 0;
        arg0.method358(this, 10, 0);
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(I)V")
    public final synchronized void method160(int arg0) {
        if (!field606.method978()) {
            return;
        }
        long var2 = (long) (field609 + 200 - field605.method36((byte) 50)) * (long) (field606.field3092 * 1000);
        while (true) {
            while (true) {
                int var4 = field606.method982();
                int var5 = field606.field3095[var4];
                long var6 = field606.method984(var5);
                if (var2 < var6) {
                    if (arg0 != 31) {
                        field609 = 65;
                    }
                    method216(-1);
                    return;
                }
                while (field606.field3095[var4] == var5) {
                    field606.method975(var4);
                    this.method217(arg0 ^ 0xFFFFFF84, var4, var6);
                    if (field606.method980()) {
                        field606.method976(var4);
                        if (field606.method979()) {
                            if (!field611) {
                                this.method339(true, (long) (var6 / (long) (field606.field3092 * 1000)));
                                field606.method977();
                                method216(-1);
                                return;
                            }
                            field606.method988(var6);
                        }
                        break;
                    }
                    field606.method983(var4);
                    field606.method976(var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "d", descriptor = "(I)V")
    private static final void method216(int arg0) {
        if (arg0 > ~field610) {
            field605.method31(field608, field610);
            field610 = 0;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(III)V")
    public final synchronized void method156(int arg0, int arg1, int arg2) {
        this.method340(arg1, arg2, (long) field609, 39);
        int var4 = 14 / ((arg0 + 49) / 53);
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(IIIJ)V")
    public final void method155(int arg0, int arg1, int arg2, long arg3) {
        method215(arg0, (byte) 124, arg1, arg2, (int) arg3);
    }

    @OriginalMember(owner = "client!de", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (true) {
                synchronized (this) {
                    if (field607) {
                        field607 = false;
                        return;
                    }
                    this.method160(31);
                }
                class28.method219(true, 100L);
            }
        } catch (Exception var6) {
            class110.method850((byte) 127, null, var6);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIJ)V")
    private final void method217(int arg0, int arg1, long arg2) {
        int var5 = field606.method990(arg1);
        if (arg0 > -18) {
            return;
        }
        if (var5 == 1) {
            field606.method986();
        } else if ((var5 & 0x80) != 0) {
            int var6 = var5 & 0xFF;
            int var7 = var5 >> 8 & 0xFF;
            int var8 = var5 >> 16 & 0xFF;
            int var9 = (int) (arg2 / (long) (field606.field3092 * 1000));
            if (!this.method341(var6, var7, var8, (long) var9)) {
                method215(var6, (byte) 113, var7, var8, var9);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(B)V")
    public final synchronized void method158(byte arg0) {
        field605.method33(true);
        if (arg0 != 116) {
            this.method156(92, 109, -17);
        }
        this.method339(true, (long) field609);
        field605.method31(field608, field610);
        field610 = 0;
        field606.method977();
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ZI)V")
    public final synchronized void method154(boolean arg0, int arg1) {
        if (arg0) {
            field611 = true;
        }
        this.method337((long) field609, (byte) -114, arg1);
        field605.method31(field608, field610);
        field610 = 0;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IZI[B)V")
    public final synchronized void method159(int arg0, boolean arg1, int arg2, byte[] arg3) {
        field606.method985(arg3);
        field611 = arg1;
        if (arg0 != 17) {
            this.method158((byte) -34);
        }
        boolean var5 = true;
        field609 = 0;
        field605.method33(true);
        this.method340(arg2, 0, (long) field609, 39);
        int var6 = field606.method987();
        for (int var7 = 0; var7 < var6; var7++) {
            field606.method975(var7);
            while (!field606.method980()) {
                field606.method983(var7);
                if (field606.field3095[var7] != 0) {
                    var5 = false;
                    break;
                }
                this.method217(-78, var7, 0L);
            }
            field606.method976(var7);
        }
        if (var5) {
            if (field611) {
                throw new RuntimeException();
            }
            this.method339(true, (long) field609);
            field606.method977();
        }
        method216(-1);
    }
}
