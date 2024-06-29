import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class104 extends class61 implements Runnable {

    @OriginalMember(owner = "client!rb", name = "X", descriptor = "Lcb;")
    private class15 field2578 = new class15();

    @OriginalMember(owner = "client!rb", name = "V", descriptor = "[I")
    private static int[] field2576 = new int[256];

    @OriginalMember(owner = "client!rb", name = "T", descriptor = "I")
    private static int field2574;

    @OriginalMember(owner = "client!rb", name = "U", descriptor = "I")
    private static int field2575;

    @OriginalMember(owner = "client!rb", name = "R", descriptor = "Lgb;")
    private static class39 field2572;

    @OriginalMember(owner = "client!rb", name = "S", descriptor = "Z")
    private static boolean field2573;

    @OriginalMember(owner = "client!rb", name = "W", descriptor = "Z")
    private static boolean field2577;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V", line = 3)
    public final void method758(int arg0) {
        synchronized (this) {
            field2577 = true;
        }
        if (arg0 > -44) {
            return;
        }
        while (true) {
            synchronized (this) {
                if (!field2577) {
                    break;
                }
            }
            class30.method282((byte) -114, 20L);
        }
        field2572.method337(true);
    }

    @OriginalMember(owner = "client!rb", name = "run", descriptor = "()V", line = 29)
    public final void run() {
        try {
            while (true) {
                synchronized (this) {
                    if (field2577) {
                        field2577 = false;
                        return;
                    }
                    this.method756(89);
                }
                class30.method282((byte) -61, 100L);
            }
        } catch (Exception var6) {
            class84.method678(null, var6, 1);
        }
    }

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "(I)V", line = 56)
    private static final void method794(int arg0) {
        if (field2574 > 0) {
            field2572.method338(field2576, field2574);
            field2574 = 0;
        }
        if (arg0 != -2143) {
            method794(25);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIII)V", line = 75)
    private static final void method795(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (field2574 >= field2576.length) {
            field2572.method338(field2576, field2574);
            field2574 = 0;
        }
        field2576[field2574++] = arg2 - field2575;
        if (arg0 > -39) {
            field2574 = 19;
        }
        field2575 = arg2;
        field2576[field2574++] = class74.method623(arg3 << 16, class74.method623(arg4, arg1 << 8));
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)V", line = 98)
    public final synchronized void method756(int arg0) {
        if (!this.field2578.method136()) {
            return;
        }
        long var2 = (long) (field2575 + 200 - field2572.method342(-8409)) * (long) (this.field2578.field376 * 1000);
        if (arg0 <= 69) {
            this.method472(-111, -94, 109, 3L);
        }
        while (true) {
            while (true) {
                int var4 = this.field2578.method144();
                int var5 = this.field2578.field377[var4];
                long var6 = this.field2578.method135(var5);
                if (var2 < var6) {
                    method794(-2143);
                    return;
                }
                while (this.field2578.field377[var4] == var5) {
                    this.field2578.method134(var4);
                    this.method796((byte) -64, var6, var4);
                    if (this.field2578.method130()) {
                        this.field2578.method137(var4);
                        if (this.field2578.method132()) {
                            if (!field2573) {
                                this.method467((long) (var6 / (long) (this.field2578.field376 * 1000)), (byte) 86);
                                this.field2578.method141();
                                method794(-2143);
                                return;
                            }
                            this.field2578.method142(var6);
                        }
                        break;
                    }
                    this.field2578.method131(var4);
                    this.field2578.method137(var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(III)V", line = 157)
    public final synchronized void method754(int arg0, int arg1, int arg2) {
        this.method463(arg1, (long) field2575, 245, arg0);
        if (arg2 != -6427) {
            this.field2578 = null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)V", line = 167)
    public final synchronized void method755(int arg0, int arg1) {
        this.method466(arg0, 0, (long) field2575);
        if (arg1 <= -53) {
            field2572.method338(field2576, field2574);
            field2574 = 0;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)V", line = 179)
    public final synchronized void method759(byte arg0) {
        field2572.method339((byte) 115);
        this.method467((long) field2575, (byte) 86);
        field2572.method338(field2576, field2574);
        field2574 = 0;
        this.field2578.method141();
        if (arg0 > -11) {
            field2572 = null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(IIIJ)V", line = 193)
    public final void method472(int arg0, int arg1, int arg2, long arg3) {
        method795(-109, arg1, (int) arg3, arg2, arg0);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ZI[BI)V", line = 200)
    public final synchronized void method757(boolean arg0, int arg1, byte[] arg2, int arg3) {
        int var5 = -51 / ((arg3 - 37) / 61);
        this.field2578.method133(arg2);
        field2573 = arg0;
        field2575 = 0;
        field2572.method339((byte) 115);
        boolean var6 = true;
        this.method463(0, (long) field2575, 245, arg1);
        int var7 = this.field2578.method128();
        for (int var8 = 0; var8 < var7; var8++) {
            this.field2578.method134(var8);
            while (!this.field2578.method130()) {
                this.field2578.method131(var8);
                if (this.field2578.field377[var8] != 0) {
                    var6 = false;
                    break;
                }
                this.method796((byte) -108, 0L, var8);
            }
            this.field2578.method137(var8);
        }
        if (var6) {
            if (field2573) {
                throw new RuntimeException();
            }
            this.method467((long) field2575, (byte) 86);
            this.field2578.method141();
        }
        method794(-2143);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(BJI)V", line = 251)
    private final void method796(byte arg0, long arg1, int arg2) {
        if (arg0 > -19) {
            return;
        }
        int var5 = this.field2578.method138(arg2);
        if (var5 == 1) {
            this.field2578.method129();
        } else if ((var5 & 0x80) != 0) {
            int var6 = (int) (arg1 / (long) (this.field2578.field376 * 1000));
            int var7 = var5 >> 8 & 0xFF;
            int var8 = var5 & 0xFF;
            int var9 = var5 >> 16 & 0xFF;
            if (!this.method468(var8, var7, var9, (long) var6)) {
                method795(-95, var7, var6, var9, var8);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(Ljc;Lgb;)V", line = 285)
    public class104(class57 arg0, class39 arg1) {
        field2572 = arg1;
        field2572.method341((byte) 113);
        field2572.method339((byte) 115);
        this.method467((long) field2575, (byte) 86);
        field2572.method338(field2576, field2574);
        field2574 = 0;
        arg0.method442(10, this, false);
    }
}
