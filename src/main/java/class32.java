import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class32 extends class16 implements Runnable {

    @OriginalMember(owner = "client!fa", name = "L", descriptor = "Lib;")
    private class50 field780 = new class50();

    @OriginalMember(owner = "client!fa", name = "M", descriptor = "[I")
    private static int[] field781 = new int[256];

    @OriginalMember(owner = "client!fa", name = "N", descriptor = "I")
    private static int field782;

    @OriginalMember(owner = "client!fa", name = "O", descriptor = "I")
    private static int field783;

    @OriginalMember(owner = "client!fa", name = "J", descriptor = "Lrd;")
    private static class106 field778;

    @OriginalMember(owner = "client!fa", name = "K", descriptor = "Z")
    private static boolean field779;

    @OriginalMember(owner = "client!fa", name = "P", descriptor = "Z")
    private static boolean field784;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIJ)V", line = 3)
    public final void method50(int arg0, int arg1, int arg2, long arg3) {
        method315(arg2, arg0, (int) arg3, true, arg1);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZI)V", line = 11)
    public final synchronized void method49(boolean arg0, int arg1) {
        if (arg0) {
            this.field780 = null;
        }
        this.method108((long) field783, arg1, (byte) -127);
        field778.method837(field781, field782);
        field782 = 0;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIZI)V", line = 23)
    private static final void method315(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (field782 >= field781.length) {
            field778.method837(field781, field782);
            field782 = 0;
        }
        field781[field782++] = arg2 - field783;
        if (!arg3) {
            field778 = null;
        }
        field783 = arg2;
        field781[field782++] = class40.method350(arg0 << 16, class40.method350(arg4 << 8, arg1));
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IBI)V", line = 42)
    public final synchronized void method45(int arg0, byte arg1, int arg2) {
        int var4 = 32 / ((-arg1 - 28) / 57);
        this.method106((long) field783, arg2, (byte) -27, arg0);
    }

    @OriginalMember(owner = "client!fa", name = "run", descriptor = "()V", line = 51)
    public final void run() {
        try {
            while (true) {
                synchronized (this) {
                    if (field784) {
                        field784 = false;
                        return;
                    }
                    this.method51(126);
                }
                class47.method447((byte) -51, 100L);
            }
        } catch (Exception var6) {
            client.method132(null, var6, (byte) 68);
        }
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(I)V", line = 77)
    public final void method48(int arg0) {
        synchronized (this) {
            field784 = true;
            if (arg0 != -17036) {
                field779 = false;
            }
        }
        while (true) {
            synchronized (this) {
                if (!field784) {
                    break;
                }
            }
            class47.method447((byte) -93, 20L);
        }
        field778.method835(49);
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(Ljb;Lrd;)V", line = 215)
    public class32(class56 arg0, class106 arg1) {
        field778 = arg1;
        field778.method834(-2);
        field778.method832((byte) -10);
        this.method110((long) field783, -121);
        field778.method837(field781, field782);
        field782 = 0;
        arg0.method524(10, this, (byte) 43);
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(JIB)V", line = 110)
    private final void method316(long arg0, int arg1, byte arg2) {
        if (arg2 != 96) {
            field781 = null;
        }
        int var5 = this.field780.method476(arg1);
        if (var5 == 1) {
            this.field780.method475();
        } else if ((var5 & 0x80) != 0) {
            int var6 = (int) (arg0 / (long) (this.field780.field1225 * 1000));
            int var7 = var5 & 0xFF;
            int var8 = var5 >> 8 & 0xFF;
            int var9 = var5 >> 16 & 0xFF;
            if (!this.method107(var7, var8, var9, (long) var6)) {
                method315(var9, var7, var6, true, var8);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "(I)V", line = 142)
    public final synchronized void method47(int arg0) {
        if (arg0 < 44) {
            return;
        }
        field778.method832((byte) -10);
        this.method110((long) field783, -115);
        field778.method837(field781, field782);
        field782 = 0;
        this.field780.method465();
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(I)V", line = 157)
    public final synchronized void method51(int arg0) {
        if (arg0 < 55) {
            this.field780 = null;
        }
        if (!this.field780.method473()) {
            return;
        }
        long var2 = (long) (field783 + 200 - field778.method833(false)) * (long) (this.field780.field1225 * 1000);
        while (true) {
            while (true) {
                int var4 = this.field780.method470();
                int var5 = this.field780.field1220[var4];
                long var6 = this.field780.method469(var5);
                if (var6 > var2) {
                    method317(0);
                    return;
                }
                while (this.field780.field1220[var4] == var5) {
                    this.field780.method471(var4);
                    this.method316(var6, var4, (byte) 96);
                    if (this.field780.method477()) {
                        this.field780.method480(var4);
                        if (this.field780.method464()) {
                            if (!field779) {
                                this.method110((long) (var6 / (long) (this.field780.field1225 * 1000)), -110);
                                this.field780.method465();
                                method317(0);
                                return;
                            }
                            this.field780.method474(var6);
                        }
                        break;
                    }
                    this.field780.method472(var4);
                    this.field780.method480(var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "(I)V", line = 230)
    private static final void method317(int arg0) {
        if (field782 > arg0) {
            field778.method837(field781, field782);
            field782 = 0;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZBI[B)V", line = 243)
    public final synchronized void method46(boolean arg0, byte arg1, int arg2, byte[] arg3) {
        this.field780.method478(arg3);
        field779 = arg0;
        field783 = 0;
        field778.method832((byte) -10);
        this.method106((long) field783, arg2, (byte) -47, 0);
        if (arg1 != -72) {
            this.method45(55, (byte) 34, 5);
        }
        boolean var5 = true;
        int var6 = this.field780.method479();
        for (int var7 = 0; var7 < var6; var7++) {
            this.field780.method471(var7);
            while (!this.field780.method477()) {
                this.field780.method472(var7);
                if (this.field780.field1220[var7] != 0) {
                    var5 = false;
                    break;
                }
                this.method316(0L, var7, (byte) 96);
            }
            this.field780.method480(var7);
        }
        if (var5) {
            if (field779) {
                throw new RuntimeException();
            }
            this.method110((long) field783, -111);
            this.field780.method465();
        }
        method317(0);
    }
}
