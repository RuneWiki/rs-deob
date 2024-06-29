import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class95 extends class88 implements Runnable {

    @OriginalMember(owner = "client!pe", name = "X", descriptor = "Lr;")
    private class102 field2390 = new class102();

    @OriginalMember(owner = "client!pe", name = "W", descriptor = "[I")
    private static int[] field2389 = new int[256];

    @OriginalMember(owner = "client!pe", name = "O", descriptor = "I")
    private static int field2386;

    @OriginalMember(owner = "client!pe", name = "Y", descriptor = "I")
    private static int field2391;

    @OriginalMember(owner = "client!pe", name = "U", descriptor = "Lbb;")
    private static class9 field2387;

    @OriginalMember(owner = "client!pe", name = "I", descriptor = "Z")
    private static boolean field2385;

    @OriginalMember(owner = "client!pe", name = "V", descriptor = "Z")
    private static boolean field2388;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I[BIZ)V", line = 3)
    public final synchronized void method137(int arg0, byte[] arg1, int arg2, boolean arg3) {
        this.field2390.method845(arg1);
        boolean var5 = true;
        field2388 = arg3;
        field2386 = 0;
        if (arg0 != 13701) {
            return;
        }
        field2387.method59((byte) 12);
        this.method731((long) field2386, arg2, 0, 0);
        int var6 = this.field2390.method844();
        for (int var7 = 0; var7 < var6; var7++) {
            this.field2390.method841(var7);
            while (!this.field2390.method849()) {
                this.field2390.method856(var7);
                if (this.field2390.field2622[var7] != 0) {
                    var5 = false;
                    break;
                }
                this.method807(var7, 0L, (byte) -83);
            }
            this.field2390.method843(var7);
        }
        if (var5) {
            if (field2388) {
                throw new RuntimeException();
            }
            this.method732((long) field2386, 0);
            this.field2390.method846();
        }
        method805(-12);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V", line = 54)
    public final void method136(int arg0) {
        synchronized (this) {
            field2385 = true;
        }
        int var3 = -125 / ((arg0 + 13) / 33);
        while (true) {
            synchronized (this) {
                if (!field2385) {
                    break;
                }
            }
            class13.method86(20L, 1);
        }
        field2387.method54(-10259);
    }

    @OriginalMember(owner = "client!pe", name = "run", descriptor = "()V", line = 78)
    public final void run() {
        try {
            while (true) {
                synchronized (this) {
                    if (field2385) {
                        field2385 = false;
                        return;
                    }
                    this.method142((byte) 49);
                }
                class13.method86(100L, 1);
            }
        } catch (Exception var6) {
            class114.method918(12541, null, var6);
        }
    }

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "(I)V", line = 105)
    private static final void method805(int arg0) {
        int var1 = 19 % ((-arg0 - 51) / 38);
        if (field2391 > 0) {
            field2387.method56(field2389, field2391);
            field2391 = 0;
        }
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(B)V", line = 120)
    public final synchronized void method141(byte arg0) {
        field2387.method59((byte) 12);
        this.method732((long) field2386, 0);
        field2387.method56(field2389, field2391);
        field2391 = 0;
        this.field2390.method846();
        if (arg0 != 105) {
            this.run();
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IBI)V", line = 138)
    public final synchronized void method138(int arg0, byte arg1, int arg2) {
        int var4 = 10 / ((arg1 + 75) / 40);
        this.method731((long) field2386, arg2, arg0, 0);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIBI)V", line = 147)
    private static final void method806(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 >= -109) {
            return;
        }
        if (field2389.length <= field2391) {
            field2387.method56(field2389, field2391);
            field2391 = 0;
        }
        field2389[field2391++] = arg2 - field2386;
        field2386 = arg2;
        field2389[field2391++] = class34.method263(arg1 << 16, class34.method263(arg4, arg0 << 8));
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IB)V", line = 166)
    public final synchronized void method140(int arg0, byte arg1) {
        this.method737(arg0, (byte) -20, (long) field2386);
        int var3 = -124 / ((52 - arg1) / 36);
        field2387.method56(field2389, field2391);
        field2391 = 0;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIJ)V", line = 180)
    public final void method139(int arg0, int arg1, int arg2, long arg3) {
        method806(arg1, arg2, (int) arg3, (byte) -122, arg0);
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(Lvb;Lbb;)V", line = 192)
    public class95(class124 arg0, class9 arg1) {
        field2387 = arg1;
        field2387.method57((byte) -124);
        field2387.method59((byte) 12);
        this.method732((long) field2386, 0);
        field2387.method56(field2389, field2391);
        field2391 = 0;
        arg0.method986(0, this, 10);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IJB)V", line = 207)
    private final void method807(int arg0, long arg1, byte arg2) {
        if (arg2 >= -81) {
            this.method140(-30, (byte) -2);
        }
        int var5 = this.field2390.method842(arg0);
        if (var5 == 1) {
            this.field2390.method854();
        } else if ((var5 & 0x80) != 0) {
            int var6 = (int) (arg1 / (long) (this.field2390.field2626 * 1000));
            int var7 = var5 >> 8 & 0xFF;
            int var8 = var5 & 0xFF;
            int var9 = var5 >> 16 & 0xFF;
            if (!this.method730(var8, var7, var9, (long) var6)) {
                method806(var7, var9, var6, (byte) -118, var8);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(B)V", line = 237)
    public final synchronized void method142(byte arg0) {
        if (!this.field2390.method850()) {
            return;
        }
        long var2 = (long) (field2386 + 200 - field2387.method58(30197)) * (long) (this.field2390.field2626 * 1000);
        while (true) {
            while (true) {
                int var4 = this.field2390.method851();
                int var5 = this.field2390.field2622[var4];
                long var6 = this.field2390.method840(var5);
                if (var2 < var6) {
                    int var8 = -39 / ((arg0 + 16) / 49);
                    method805(13);
                    return;
                }
                while (this.field2390.field2622[var4] == var5) {
                    this.field2390.method841(var4);
                    this.method807(var4, var6, (byte) -83);
                    if (this.field2390.method849()) {
                        this.field2390.method843(var4);
                        if (this.field2390.method847()) {
                            if (!field2388) {
                                this.method732((long) (var6 / (long) (this.field2390.field2626 * 1000)), 0);
                                this.field2390.method846();
                                method805(87);
                                return;
                            }
                            this.field2390.method855(var6);
                        }
                        break;
                    }
                    this.field2390.method856(var4);
                    this.field2390.method843(var4);
                }
            }
        }
    }
}
