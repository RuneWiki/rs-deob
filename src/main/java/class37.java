import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class37 extends class80 implements Runnable {

    @OriginalMember(owner = "client!g", name = "I", descriptor = "Lla;")
    private static class67 field923 = new class67();

    @OriginalMember(owner = "client!g", name = "M", descriptor = "[I")
    private static int[] field927 = new int[256];

    @OriginalMember(owner = "client!g", name = "L", descriptor = "I")
    private static int field926;

    @OriginalMember(owner = "client!g", name = "O", descriptor = "I")
    private static int field929;

    @OriginalMember(owner = "client!g", name = "J", descriptor = "Ljc;")
    private static class57 field924;

    @OriginalMember(owner = "client!g", name = "K", descriptor = "Z")
    private static boolean field925;

    @OriginalMember(owner = "client!g", name = "N", descriptor = "Z")
    private static boolean field928;

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(B)V", line = 4)
    public final void method282(byte arg0) {
        synchronized (this) {
            field925 = true;
        }
        while (true) {
            synchronized (this) {
                if (!field925) {
                    break;
                }
            }
            class121.method958(20L, (byte) 94);
        }
        int var4 = 78 / ((arg0 + 43) / 35);
        field924.method458(-26);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IBI)V", line = 28)
    public final synchronized void method283(int arg0, byte arg1, int arg2) {
        if (arg1 < -78) {
            this.method627(arg0, -96, arg2, (long) field926);
        }
    }

    @OriginalMember(owner = "client!g", name = "c", descriptor = "(I)V", line = 39)
    public final synchronized void method284(int arg0) {
        field924.method463(arg0 + 29280);
        this.method620((long) field926, -21112);
        field924.method461(field927, field929);
        if (arg0 != -28200) {
            this.method291(-86, 43);
        }
        field929 = 0;
        field923.method535();
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IJI)V", line = 53)
    private final void method285(int arg0, long arg1, int arg2) {
        int var5 = 93 % ((11 - arg0) / 58);
        int var6 = field923.method525(arg2);
        if (var6 == 1) {
            field923.method529();
        } else if ((var6 & 0x80) != 0) {
            int var7 = (int) (arg1 / (long) (field923.field1587 * 1000));
            int var8 = var6 & 0xFF;
            int var9 = var6 >> 8 & 0xFF;
            int var10 = var6 >> 16 & 0xFF;
            if (!this.method619(var8, var9, var10, (long) var7)) {
                method287(var10, true, var9, var8, var7);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!g", name = "c", descriptor = "(IIIJ)V", line = 84)
    public final void method286(int arg0, int arg1, int arg2, long arg3) {
        method287(arg2, true, arg1, arg0, (int) arg3);
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Laa;Ljc;)V", line = 90)
    public class37(class2 arg0, class57 arg1) {
        field924 = arg1;
        field924.method462(27487);
        field924.method463(1080);
        this.method620((long) field926, -21112);
        field924.method461(field927, field929);
        field929 = 0;
        arg0.method13(10, this, 0);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IZIII)V", line = 105)
    private static final void method287(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (field927.length <= field929) {
            field924.method461(field927, field929);
            field929 = 0;
        }
        field927[field929++] = arg4 - field926;
        field926 = arg4;
        field927[field929++] = class5.method54(arg0 << 16, class5.method54(arg2 << 8, arg3));
        if (!arg1) {
            field927 = null;
        }
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(I)V", line = 123)
    public final synchronized void method288(int arg0) {
        if (!field923.method533()) {
            return;
        }
        long var2 = (long) (field926 + 200 - field924.method459(arg0 ^ 0xFFFFB055)) * (long) (field923.field1587 * 1000);
        while (true) {
            while (true) {
                int var4 = field923.method527();
                int var5 = field923.field1590[var4];
                long var6 = field923.method523(var5);
                if (var2 < var6) {
                    if (arg0 != 1) {
                        this.method291(-101, -17);
                    }
                    method289((byte) 119);
                    return;
                }
                while (field923.field1590[var4] == var5) {
                    field923.method526(var4);
                    this.method285(96, var6, var4);
                    if (field923.method524()) {
                        field923.method532(var4);
                        if (field923.method521()) {
                            if (!field928) {
                                this.method620((long) (var6 / (long) (field923.field1587 * 1000)), -21112);
                                field923.method535();
                                method289((byte) 119);
                                return;
                            }
                            field923.method530(var6);
                        }
                        break;
                    }
                    field923.method522(var4);
                    field923.method532(var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!g", name = "e", descriptor = "(B)V", line = 181)
    private static final void method289(byte arg0) {
        if (field929 > 0) {
            field924.method461(field927, field929);
            field929 = 0;
        }
        if (arg0 != 119) {
            method289((byte) 0);
        }
    }

    @OriginalMember(owner = "client!g", name = "run", descriptor = "()V", line = 196)
    public final void run() {
        try {
            while (true) {
                synchronized (this) {
                    if (field925) {
                        field925 = false;
                        return;
                    }
                    this.method288(1);
                }
                class121.method958(100L, (byte) 94);
            }
        } catch (Exception var6) {
            class118.method932(var6, null, 1);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "([BIBZ)V", line = 224)
    public final synchronized void method290(byte[] arg0, int arg1, byte arg2, boolean arg3) {
        boolean var5 = true;
        field923.method536(arg0);
        field928 = arg3;
        field926 = 0;
        field924.method463(1080);
        this.method627(arg1, -119, 0, (long) field926);
        int var6 = field923.method531();
        for (int var7 = 0; var7 < var6; var7++) {
            field923.method526(var7);
            while (!field923.method524()) {
                field923.method522(var7);
                if (field923.field1590[var7] != 0) {
                    var5 = false;
                    break;
                }
                this.method285(123, 0L, var7);
            }
            field923.method532(var7);
        }
        if (arg2 <= 15) {
            return;
        }
        if (var5) {
            if (field928) {
                throw new RuntimeException();
            }
            this.method620((long) field926, -21112);
            field923.method535();
        }
        method289((byte) 119);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(II)V", line = 275)
    public final synchronized void method291(int arg0, int arg1) {
        this.method621((long) field926, arg0, true);
        field924.method461(field927, field929);
        field929 = 0;
        if (arg1 != 2) {
            this.method284(52);
        }
    }
}
