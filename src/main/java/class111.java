import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class111 extends class52 implements Runnable {

    @OriginalMember(owner = "client!ta", name = "I", descriptor = "Laa;")
    private class2 field2482 = new class2();

    @OriginalMember(owner = "client!ta", name = "J", descriptor = "[I")
    private static int[] field2483 = new int[256];

    @OriginalMember(owner = "client!ta", name = "G", descriptor = "I")
    private static int field2480;

    @OriginalMember(owner = "client!ta", name = "H", descriptor = "I")
    private static int field2481;

    @OriginalMember(owner = "client!ta", name = "D", descriptor = "Lvc;")
    private static class123 field2477;

    @OriginalMember(owner = "client!ta", name = "E", descriptor = "Z")
    private static boolean field2478;

    @OriginalMember(owner = "client!ta", name = "F", descriptor = "Z")
    private static boolean field2479;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIII)V", line = 4)
    private static final void method809(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (field2483.length <= field2481) {
            field2477.method971(field2483, field2481);
            field2481 = 0;
        }
        field2483[field2481++] = arg2 - field2480;
        if (arg1 != 1000) {
            field2481 = 53;
        }
        field2480 = arg2;
        field2483[field2481++] = class59.method430(class59.method430(arg3 << 8, arg0), arg4 << 16);
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(B)V", line = 22)
    private static final void method810(byte arg0) {
        if (arg0 > 72 && field2481 > 0) {
            field2477.method971(field2483, field2481);
            field2481 = 0;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIJ)V", line = 39)
    public final void method144(int arg0, int arg1, int arg2, long arg3) {
        method809(arg0, 1000, (int) arg3, arg1, arg2);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I[BIZ)V", line = 46)
    public final synchronized void method139(int arg0, byte[] arg1, int arg2, boolean arg3) {
        this.field2482.method11(arg1);
        boolean var5 = true;
        field2479 = arg3;
        field2480 = 0;
        field2477.method973(false);
        this.method366(arg2, (byte) 112, arg0, (long) field2480);
        int var6 = this.field2482.method19();
        for (int var7 = 0; var7 < var6; var7++) {
            this.field2482.method12(var7);
            while (!this.field2482.method7()) {
                this.field2482.method6(var7);
                if (this.field2482.field27[var7] != 0) {
                    var5 = false;
                    break;
                }
                this.method811(arg2 ^ 0x70, 0L, var7);
            }
            this.field2482.method8(var7);
        }
        if (var5) {
            if (field2479) {
                throw new RuntimeException();
            }
            this.method368((long) field2480, 127);
            this.field2482.method9();
        }
        method810((byte) 117);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IB)V", line = 94)
    public final synchronized void method142(int arg0, byte arg1) {
        if (arg1 != 50) {
            this.method811(-79, -26L, -124);
        }
        this.method370(arg0, (long) field2480, (byte) 20);
        field2477.method971(field2483, field2481);
        field2481 = 0;
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(I)V", line = 106)
    public final synchronized void method145(int arg0) {
        if (!this.field2482.method13()) {
            return;
        }
        long var2 = (long) (field2480 + 200 - field2477.method975(-29810)) * (long) (this.field2482.field24 * 1000);
        while (true) {
            while (true) {
                int var4 = this.field2482.method22();
                int var5 = this.field2482.field27[var4];
                long var6 = this.field2482.method18(var5);
                if (var2 < var6) {
                    if (arg0 > -90) {
                        field2477 = null;
                    }
                    method810((byte) 126);
                    return;
                }
                while (this.field2482.field27[var4] == var5) {
                    this.field2482.method12(var4);
                    this.method811(126, var6, var4);
                    if (this.field2482.method7()) {
                        this.field2482.method8(var4);
                        if (this.field2482.method17()) {
                            if (!field2479) {
                                this.method368((long) (var6 / (long) (this.field2482.field24 * 1000)), 127);
                                this.field2482.method9();
                                method810((byte) 107);
                                return;
                            }
                            this.field2482.method20(var6);
                        }
                        break;
                    }
                    this.field2482.method6(var4);
                    this.field2482.method8(var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Z)V", line = 165)
    public final synchronized void method140(boolean arg0) {
        field2477.method973(false);
        if (!arg0) {
            method809(115, 57, -61, -76, 126);
        }
        this.method368((long) field2480, 127);
        field2477.method971(field2483, field2481);
        field2481 = 0;
        this.field2482.method9();
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)V", line = 179)
    public final void method141(int arg0) {
        synchronized (this) {
            field2478 = true;
        }
        while (true) {
            synchronized (this) {
                if (!field2478) {
                    break;
                }
            }
            class113.method833(20L, true);
        }
        if (arg0 != 699) {
            field2481 = 48;
        }
        field2477.method972(true);
    }

    @OriginalMember(owner = "client!ta", name = "run", descriptor = "()V", line = 204)
    public final void run() {
        try {
            while (true) {
                synchronized (this) {
                    if (field2478) {
                        field2478 = false;
                        return;
                    }
                    this.method145(-126);
                }
                class113.method833(100L, true);
            }
        } catch (Exception var6) {
            class119.method920(true, null, var6);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IJI)V", line = 232)
    private final void method811(int arg0, long arg1, int arg2) {
        int var5 = this.field2482.method15(arg2);
        if (var5 == 1) {
            this.field2482.method14();
        } else if ((var5 & 0x80) != 0) {
            int var6 = (int) (arg1 / (long) (this.field2482.field24 * 1000));
            int var7 = var5 & 0xFF;
            int var8 = var5 >> 16 & 0xFF;
            int var9 = var5 >> 8 & 0xFF;
            if (!this.method367(var7, var9, var8, (long) var6)) {
                method809(var7, 1000, var6, var9, var8);
            }
        }
        if (arg0 < 104) {
            field2481 = 23;
        }
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Ls;Lvc;)V", line = 272)
    public class111(class105 arg0, class123 arg1) {
        field2477 = arg1;
        field2477.method976((byte) 96);
        field2477.method973(false);
        this.method368((long) field2480, 127);
        field2477.method971(field2483, field2481);
        field2481 = 0;
        arg0.method780(this, 0, 10);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIB)V", line = 286)
    public final synchronized void method143(int arg0, int arg1, byte arg2) {
        this.method366(arg1, (byte) 106, arg0, (long) field2480);
        int var4 = 73 / ((arg2 + 20) / 50);
    }
}
