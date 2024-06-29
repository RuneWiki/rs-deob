import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class120 extends class23 implements Runnable {

    @OriginalMember(owner = "client!u", name = "db", descriptor = "Lnd;")
    private class82 field2961 = new class82();

    @OriginalMember(owner = "client!u", name = "ab", descriptor = "[I")
    private static int[] field2958 = new int[256];

    @OriginalMember(owner = "client!u", name = "bb", descriptor = "I")
    private static int field2959;

    @OriginalMember(owner = "client!u", name = "cb", descriptor = "I")
    private static int field2960;

    @OriginalMember(owner = "client!u", name = "Z", descriptor = "Lrd;")
    private static class106 field2957;

    @OriginalMember(owner = "client!u", name = "X", descriptor = "Z")
    private static boolean field2955;

    @OriginalMember(owner = "client!u", name = "Y", descriptor = "Z")
    private static boolean field2956;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V", line = 5)
    public final synchronized void method90(byte arg0) {
        if (arg0 != 59) {
            return;
        }
        field2957.method872((byte) -128);
        this.method184(-31895, (long) field2959);
        field2957.method871(field2958, field2960);
        field2960 = 0;
        this.field2961.method723();
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(IIIJ)V", line = 21)
    public final void method91(int arg0, int arg1, int arg2, long arg3) {
        method965((int) arg3, arg1, 75, arg2, arg0);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IJB)V", line = 28)
    private final void method964(int arg0, long arg1, byte arg2) {
        int var5 = 40 % ((arg2 - 24) / 58);
        int var6 = this.field2961.method726(arg0);
        if (var6 == 1) {
            this.field2961.method729();
        } else if ((var6 & 0x80) != 0) {
            int var7 = (int) (arg1 / (long) (this.field2961.field2169 * 1000));
            int var8 = var6 >> 8 & 0xFF;
            int var9 = var6 & 0xFF;
            int var10 = var6 >> 16 & 0xFF;
            if (!this.method178(var9, var8, var10, (long) var7)) {
                method965(var7, var8, 89, var10, var9);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!u", name = "run", descriptor = "()V", line = 58)
    public final void run() {
        try {
            while (true) {
                synchronized (this) {
                    if (field2955) {
                        field2955 = false;
                        return;
                    }
                    this.method87((byte) -56);
                }
                class58.method498(100L, 10);
            }
        } catch (Exception var6) {
            class129.method1015(-127, var6, null);
        }
    }

    @OriginalMember(owner = "client!u", name = "c", descriptor = "(B)V", line = 85)
    public final void method85(byte arg0) {
        synchronized (this) {
            field2955 = true;
        }
        if (arg0 < 57) {
            field2956 = false;
        }
        while (true) {
            synchronized (this) {
                if (!field2955) {
                    break;
                }
            }
            class58.method498(20L, 10);
        }
        field2957.method870(108);
    }

    @OriginalMember(owner = "client!u", name = "d", descriptor = "(B)V", line = 111)
    public final synchronized void method87(byte arg0) {
        if (!this.field2961.method727()) {
            return;
        }
        if (arg0 != -56) {
            field2958 = null;
        }
        long var2 = (long) (field2959 + 200 - field2957.method874(arg0 + 19332)) * (long) (this.field2961.field2169 * 1000);
        while (true) {
            while (true) {
                int var4 = this.field2961.method716();
                int var5 = this.field2961.field2172[var4];
                long var6 = this.field2961.method725(var5);
                if (var6 > var2) {
                    method966(true);
                    return;
                }
                while (this.field2961.field2172[var4] == var5) {
                    this.field2961.method724(var4);
                    this.method964(var4, var6, (byte) 86);
                    if (this.field2961.method730()) {
                        this.field2961.method717(var4);
                        if (this.field2961.method721()) {
                            if (!field2956) {
                                this.method184(-31895, (long) (var6 / (long) (this.field2961.field2169 * 1000)));
                                this.field2961.method723();
                                method966(true);
                                return;
                            }
                            this.field2961.method728(var6);
                        }
                        break;
                    }
                    this.field2961.method719(var4);
                    this.field2961.method717(var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(III)V", line = 171)
    public final synchronized void method86(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method185(true, (long) field2959, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IB)V", line = 183)
    public final synchronized void method88(int arg0, byte arg1) {
        this.method179(-202, arg0, (long) field2959);
        if (arg1 < -43) {
            field2957.method871(field2958, field2960);
            field2960 = 0;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIII)V", line = 195)
    private static final void method965(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (field2960 >= field2958.length) {
            field2957.method871(field2958, field2960);
            field2960 = 0;
        }
        field2958[field2960++] = arg0 - field2959;
        field2959 = arg0;
        if (arg2 < 58) {
            field2958 = null;
        }
        field2958[field2960++] = class5.method37(class5.method37(arg1 << 8, arg4), arg3 << 16);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Z)V", line = 214)
    private static final void method966(boolean arg0) {
        if (!arg0) {
            field2956 = true;
        }
        if (field2960 > 0) {
            field2957.method871(field2958, field2960);
            field2960 = 0;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(BZI[B)V", line = 229)
    public final synchronized void method89(byte arg0, boolean arg1, int arg2, byte[] arg3) {
        boolean var5 = true;
        this.field2961.method732(arg3);
        field2959 = 0;
        field2956 = arg1;
        if (arg0 >= -93) {
            this.method89((byte) 86, false, 8, null);
        }
        field2957.method872((byte) -128);
        this.method185(true, (long) field2959, 0, arg2);
        int var6 = this.field2961.method722();
        for (int var7 = 0; var7 < var6; var7++) {
            this.field2961.method724(var7);
            while (!this.field2961.method730()) {
                this.field2961.method719(var7);
                if (this.field2961.field2172[var7] != 0) {
                    var5 = false;
                    break;
                }
                this.method964(var7, 0L, (byte) -127);
            }
            this.field2961.method717(var7);
        }
        if (var5) {
            if (field2956) {
                throw new RuntimeException();
            }
            this.method184(-31895, (long) field2959);
            this.field2961.method723();
        }
        method966(true);
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Lcc;Lrd;)V", line = 287)
    public class120(class15 arg0, class106 arg1) {
        field2957 = arg1;
        field2957.method873((byte) -81);
        field2957.method872((byte) -127);
        this.method184(-31895, (long) field2959);
        field2957.method871(field2958, field2960);
        field2960 = 0;
        arg0.method95((byte) 21, this, 10);
    }
}
