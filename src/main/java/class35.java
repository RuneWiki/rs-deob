import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class35 extends class124 implements Runnable {

    @OriginalMember(owner = "client!fd", name = "L", descriptor = "Ljd;")
    private class58 field783 = new class58();

    @OriginalMember(owner = "client!fd", name = "R", descriptor = "[I")
    private static int[] field788 = new int[256];

    @OriginalMember(owner = "client!fd", name = "K", descriptor = "I")
    private static int field782;

    @OriginalMember(owner = "client!fd", name = "P", descriptor = "I")
    private static int field787;

    @OriginalMember(owner = "client!fd", name = "M", descriptor = "Lgb;")
    private static class39 field784;

    @OriginalMember(owner = "client!fd", name = "N", descriptor = "Z")
    private static boolean field785;

    @OriginalMember(owner = "client!fd", name = "O", descriptor = "Z")
    private static boolean field786;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(III)V")
    public final synchronized void method170(int arg0, int arg1, int arg2) {
        if (arg0 != 332) {
            this.method295(-80, 33, -107, 89L);
        }
        this.method960(arg2, (long) field782, arg0 ^ 0x14C, arg1);
    }

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "(B)V")
    private static final void method293(byte arg0) {
        if (field787 > 0) {
            field784.method313(field788, field787);
            field787 = 0;
        }
        if (arg0 != -79) {
            method293((byte) 67);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IJI)V")
    private final void method294(int arg0, long arg1, int arg2) {
        int var5 = this.field783.method467(arg2);
        if (var5 == 1) {
            this.field783.method465();
        } else if ((var5 & 0x80) != 0) {
            int var6 = (int) (arg1 / (long) (this.field783.field1316 * 1000));
            int var7 = var5 & 0xFF;
            int var8 = var5 >> 16 & 0xFF;
            int var9 = var5 >> 8 & 0xFF;
            if (!this.method961(var7, var9, var8, (long) var6)) {
                method296(var9, var7, (byte) -108, var8, var6);
            }
        }
        if (arg0 != 1593274256) {
            field788 = null;
        }
    }

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "(B)V")
    public final synchronized void method174(byte arg0) {
        this.method956((long) field782, true);
        if (arg0 == -50) {
            field784.method313(field788, field787);
            field787 = 0;
        }
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(B)V")
    public final synchronized void method178(byte arg0) {
        field784.method310(-22544);
        this.method957((long) field782, (byte) 116);
        field784.method313(field788, field787);
        if (arg0 != 81) {
            field786 = true;
        }
        field787 = 0;
        this.field783.method461();
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IZ[BZ)V")
    public final synchronized void method180(int arg0, boolean arg1, byte[] arg2, boolean arg3) {
        if (arg1) {
            return;
        }
        this.field783.method469(arg2);
        boolean var5 = true;
        field782 = 0;
        field786 = arg3;
        field784.method310(-22544);
        this.method960(arg0, (long) field782, 0, 0);
        int var6 = this.field783.method460();
        for (int var7 = 0; var7 < var6; var7++) {
            this.field783.method464(var7);
            while (!this.field783.method475()) {
                this.field783.method472(var7);
                if (this.field783.field1318[var7] != 0) {
                    var5 = false;
                    break;
                }
                this.method294(1593274256, 0L, var7);
            }
            this.field783.method474(var7);
        }
        if (var5) {
            if (field786) {
                throw new RuntimeException();
            }
            this.method957((long) field782, (byte) 108);
            this.field783.method461();
        }
        method293((byte) -79);
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)V")
    public final void method177(int arg0) {
        synchronized (this) {
            field785 = true;
            if (arg0 != 82) {
                this.method180(-19, true, null, true);
            }
        }
        while (true) {
            synchronized (this) {
                if (!field785) {
                    break;
                }
            }
            class31.method247(20L, (byte) 123);
        }
        field784.method314(-125);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIJ)V")
    public final void method295(int arg0, int arg1, int arg2, long arg3) {
        method296(arg1, arg0, (byte) -115, arg2, (int) arg3);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)V")
    public final synchronized void method171(byte arg0) {
        if (!this.field783.method462()) {
            return;
        }
        long var2 = (long) (field782 + 200 - field784.method315((byte) 35)) * (long) (this.field783.field1316 * 1000);
        while (true) {
            while (true) {
                int var4 = this.field783.method473();
                int var5 = this.field783.field1318[var4];
                long var6 = this.field783.method466(var5);
                if (var6 > var2) {
                    if (arg0 != 55) {
                        return;
                    }
                    method293((byte) -79);
                    return;
                }
                while (this.field783.field1318[var4] == var5) {
                    this.field783.method464(var4);
                    this.method294(arg0 ^ 0x5EF76FA7, var6, var4);
                    if (this.field783.method475()) {
                        this.field783.method474(var4);
                        if (this.field783.method471()) {
                            if (!field786) {
                                this.method957((long) (var6 / (long) (this.field783.field1316 * 1000)), (byte) 73);
                                this.field783.method461();
                                method293((byte) -79);
                                return;
                            }
                            this.field783.method476(var6);
                        }
                        break;
                    }
                    this.field783.method472(var4);
                    this.field783.method474(var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Lnd;Lgb;)V")
    public class35(class82 arg0, class39 arg1) {
        field784 = arg1;
        field784.method311((byte) -101);
        field784.method310(-22544);
        this.method957((long) field782, (byte) 112);
        field784.method313(field788, field787);
        field787 = 0;
        arg0.method617(this, -10172, 10);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIBII)V")
    private static final void method296(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 >= -84) {
            method296(-61, -94, (byte) 30, -82, -4);
        }
        if (field788.length <= field787) {
            field784.method313(field788, field787);
            field787 = 0;
        }
        field788[field787++] = arg4 - field782;
        field782 = arg4;
        field788[field787++] = class117.method840(arg3 << 16, class117.method840(arg1, arg0 << 8));
    }

    @OriginalMember(owner = "client!fd", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (true) {
                synchronized (this) {
                    if (field785) {
                        field785 = false;
                        return;
                    }
                    this.method171((byte) 55);
                }
                class31.method247(100L, (byte) 123);
            }
        } catch (Exception var6) {
            class119.method884(32, var6, null);
        }
    }
}
