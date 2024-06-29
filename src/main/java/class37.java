import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class37 extends class119 implements Runnable {

    @OriginalMember(owner = "client!g", name = "J", descriptor = "Lke;")
    private class65 field745 = new class65();

    @OriginalMember(owner = "client!g", name = "I", descriptor = "[I")
    private static int[] field744 = new int[256];

    @OriginalMember(owner = "client!g", name = "H", descriptor = "I")
    private static int field743;

    @OriginalMember(owner = "client!g", name = "K", descriptor = "I")
    private static int field746;

    @OriginalMember(owner = "client!g", name = "E", descriptor = "Lfa;")
    private static class32 field740;

    @OriginalMember(owner = "client!g", name = "F", descriptor = "Z")
    private static boolean field741;

    @OriginalMember(owner = "client!g", name = "G", descriptor = "Z")
    private static boolean field742;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Z)V")
    public final synchronized void method7(boolean arg0) {
        if (!this.field745.method422()) {
            return;
        }
        if (!arg0) {
            method228(6, -40, -53, -38, -10);
        }
        long var2 = (long) (field743 + 200 - field740.method208((byte) -105)) * (long) (this.field745.field1368 * 1000);
        while (true) {
            while (true) {
                int var4 = this.field745.method424();
                int var5 = this.field745.field1362[var4];
                long var6 = this.field745.method414(var5);
                if (var2 < var6) {
                    method227((byte) -102);
                    return;
                }
                while (this.field745.field1362[var4] == var5) {
                    this.field745.method421(var4);
                    this.method229(var4, var6, 32285);
                    if (this.field745.method428()) {
                        this.field745.method420(var4);
                        if (this.field745.method416()) {
                            if (!field742) {
                                this.method873(50, (long) (var6 / (long) (this.field745.field1368 * 1000)));
                                this.field745.method415();
                                method227((byte) -48);
                                return;
                            }
                            this.field745.method429(var6);
                        }
                        break;
                    }
                    this.field745.method413(var4);
                    this.field745.method420(var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V")
    public final synchronized void method1(int arg0) {
        this.method875(108, (long) field743);
        if (arg0 < 94) {
            this.method6((byte) -70);
        }
        field740.method205(field744, field746);
        field746 = 0;
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(B)V")
    private static final void method227(byte arg0) {
        if (field746 > 0) {
            field740.method205(field744, field746);
            field746 = 0;
        }
        if (arg0 >= -17) {
            field744 = null;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIII)V")
    private static final void method228(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (field746 >= field744.length) {
            field740.method205(field744, field746);
            field746 = 0;
        }
        int var5 = 62 % ((arg3 - 22) / 46);
        field744[field746++] = arg2 - field743;
        field743 = arg2;
        field744[field746++] = class107.method795(arg1 << 16, class107.method795(arg0, arg4 << 8));
    }

    @OriginalMember(owner = "client!g", name = "d", descriptor = "(I)V")
    public final synchronized void method4(int arg0) {
        if (arg0 >= -107) {
            this.field745 = null;
        }
        field740.method206(-65);
        this.method873(48, (long) field743);
        field740.method205(field744, field746);
        field746 = 0;
        this.field745.method415();
    }

    @OriginalMember(owner = "client!g", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (true) {
                synchronized (this) {
                    if (field741) {
                        field741 = false;
                        return;
                    }
                    this.method7(true);
                }
                class108.method814((byte) 15, 100L);
            }
        } catch (Exception var6) {
            class70.method499(null, var6, 40);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ZBI[B)V")
    public final synchronized void method3(boolean arg0, byte arg1, int arg2, byte[] arg3) {
        this.field745.method425(arg3);
        field742 = arg0;
        boolean var5 = true;
        field743 = 0;
        if (arg1 >= -87) {
            this.field745 = null;
        }
        field740.method206(-123);
        this.method871(-86, arg2, (long) field743, 0);
        int var6 = this.field745.method423();
        for (int var7 = 0; var7 < var6; var7++) {
            this.field745.method421(var7);
            while (!this.field745.method428()) {
                this.field745.method413(var7);
                if (this.field745.field1362[var7] != 0) {
                    var5 = false;
                    break;
                }
                this.method229(var7, 0L, 32285);
            }
            this.field745.method420(var7);
        }
        if (var5) {
            if (field742) {
                throw new RuntimeException();
            }
            this.method873(115, (long) field743);
            this.field745.method415();
        }
        method227((byte) -117);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(B)V")
    public final void method6(byte arg0) {
        synchronized (this) {
            field741 = true;
        }
        if (arg0 >= -106) {
            field740 = null;
        }
        while (true) {
            synchronized (this) {
                if (!field741) {
                    break;
                }
            }
            class108.method814((byte) 15, 20L);
        }
        field740.method204((byte) -106);
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Lqd;Lfa;)V")
    public class37(class99 arg0, class32 arg1) {
        field740 = arg1;
        field740.method207(13878);
        field740.method206(-120);
        this.method873(54, (long) field743);
        field740.method205(field744, field746);
        field746 = 0;
        arg0.method751(10, this, 122);
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(IIIJ)V")
    public final void method2(int arg0, int arg1, int arg2, long arg3) {
        method228(arg0, arg2, (int) arg3, 106, arg1);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(BII)V")
    public final synchronized void method5(byte arg0, int arg1, int arg2) {
        this.method871(-68, arg1, (long) field743, arg2);
        if (arg0 > -81) {
            this.field745 = null;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IJI)V")
    private final void method229(int arg0, long arg1, int arg2) {
        int var5 = this.field745.method418(arg0);
        if (arg2 != 32285) {
            return;
        }
        if (var5 == 1) {
            this.field745.method427();
        } else if ((var5 & 0x80) != 0) {
            int var6 = (int) (arg1 / (long) (this.field745.field1368 * 1000));
            int var7 = var5 & 0xFF;
            int var8 = var5 >> 8 & 0xFF;
            int var9 = var5 >> 16 & 0xFF;
            if (!this.method874(var7, var8, var9, (long) var6)) {
                method228(var7, var9, var6, -122, var8);
                return;
            }
        }
    }
}
