import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class48 extends class35 implements Runnable {

    @OriginalMember(owner = "client!hd", name = "O", descriptor = "Lb;")
    private static class11 field1078 = new class11();

    @OriginalMember(owner = "client!hd", name = "R", descriptor = "[I")
    private static int[] field1081 = new int[256];

    @OriginalMember(owner = "client!hd", name = "P", descriptor = "I")
    private static int field1079;

    @OriginalMember(owner = "client!hd", name = "Q", descriptor = "I")
    private static int field1080;

    @OriginalMember(owner = "client!hd", name = "M", descriptor = "Lnd;")
    private static class84 field1076;

    @OriginalMember(owner = "client!hd", name = "N", descriptor = "Z")
    private static boolean field1077;

    @OriginalMember(owner = "client!hd", name = "S", descriptor = "Z")
    private static boolean field1082;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIB)V", line = 4)
    private static final void method388(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (field1081.length <= field1080) {
            field1076.method718(field1081, field1080);
            field1080 = 0;
        }
        if (arg4 >= -72) {
            method390(-56);
        }
        field1081[field1080++] = arg1 - field1079;
        field1079 = arg1;
        field1081[field1080++] = class105.method885(class105.method885(arg2 << 8, arg0), arg3 << 16);
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(IIIJ)V", line = 23)
    public final void method315(int arg0, int arg1, int arg2, long arg3) {
        method388(arg0, (int) arg3, arg1, arg2, (byte) -85);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V", line = 31)
    public final void method362(int arg0) {
        synchronized (this) {
            field1077 = true;
        }
        while (true) {
            synchronized (this) {
                if (!field1077) {
                    break;
                }
            }
            class82.method696(3, 20L);
        }
        field1076.method715((byte) -123);
        if (arg0 <= 100) {
            field1080 = -14;
        }
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)V", line = 56)
    public final synchronized void method364(int arg0) {
        if (!field1078.method124()) {
            return;
        }
        long var2 = (long) (field1079 + 200 - field1076.method716(30982)) * (long) (field1078.field218 * 1000);
        while (true) {
            while (true) {
                int var4 = field1078.method113();
                int var5 = field1078.field219[var4];
                long var6 = field1078.method123(var5);
                if (var6 > var2) {
                    if (arg0 != 0) {
                        field1077 = false;
                    }
                    method390(-7521);
                    return;
                }
                while (field1078.field219[var4] == var5) {
                    field1078.method119(var4);
                    this.method389((byte) -94, var4, var6);
                    if (field1078.method112()) {
                        field1078.method116(var4);
                        if (field1078.method114()) {
                            if (!field1082) {
                                this.method312((long) (var6 / (long) (field1078.field218 * 1000)), arg0);
                                field1078.method111();
                                method390(-7521);
                                return;
                            }
                            field1078.method122(var6);
                        }
                        break;
                    }
                    field1078.method118(var4);
                    field1078.method116(var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(Led;Lnd;)V", line = 113)
    public class48(class31 arg0, class84 arg1) {
        field1076 = arg1;
        field1076.method717(4443);
        field1076.method719((byte) 120);
        this.method312((long) field1079, 0);
        field1076.method718(field1081, field1080);
        field1080 = 0;
        arg0.method280(102, this, 10);
    }

    @OriginalMember(owner = "client!hd", name = "run", descriptor = "()V", line = 127)
    public final void run() {
        try {
            while (true) {
                synchronized (this) {
                    if (field1077) {
                        field1077 = false;
                        return;
                    }
                    this.method364(0);
                }
                class82.method696(3, 100L);
            }
        } catch (Exception var6) {
            class78.method675(var6, 64, null);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(BIJ)V", line = 153)
    private final void method389(byte arg0, int arg1, long arg2) {
        int var5 = 57 % ((arg0 + 18) / 53);
        int var6 = field1078.method110(arg1);
        if (var6 == 1) {
            field1078.method121();
        } else if ((var6 & 0x80) != 0) {
            int var7 = var6 & 0xFF;
            int var8 = (int) (arg2 / (long) (field1078.field218 * 1000));
            int var9 = var6 >> 8 & 0xFF;
            int var10 = var6 >> 16 & 0xFF;
            if (!this.method310(var7, var9, var10, (long) var8)) {
                method388(var7, var8, var9, var10, (byte) -105);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(Z)V", line = 182)
    public final synchronized void method365(boolean arg0) {
        field1076.method719((byte) 124);
        this.method312((long) field1079, 0);
        field1076.method718(field1081, field1080);
        if (!arg0) {
            field1080 = 0;
            field1078.method111();
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I[BBZ)V", line = 198)
    public final synchronized void method361(int arg0, byte[] arg1, byte arg2, boolean arg3) {
        field1078.method117(arg1);
        boolean var5 = true;
        field1079 = 0;
        field1082 = arg3;
        field1076.method719((byte) 124);
        this.method318((byte) -9, 0, (long) field1079, arg0);
        int var6 = field1078.method108();
        if (arg2 < 73) {
            field1080 = -45;
        }
        for (int var7 = 0; var7 < var6; var7++) {
            field1078.method119(var7);
            while (!field1078.method112()) {
                field1078.method118(var7);
                if (field1078.field219[var7] != 0) {
                    var5 = false;
                    break;
                }
                this.method389((byte) -77, var7, 0L);
            }
            field1078.method116(var7);
        }
        if (var5) {
            if (field1082) {
                throw new RuntimeException();
            }
            this.method312((long) field1079, 0);
            field1078.method111();
        }
        method390(-7521);
    }

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "(I)V", line = 251)
    private static final void method390(int arg0) {
        if (arg0 == -7521 && field1080 > 0) {
            field1076.method718(field1081, field1080);
            field1080 = 0;
        }
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(IB)V", line = 271)
    public final synchronized void method363(int arg0, byte arg1) {
        this.method311((long) field1079, true, arg0);
        field1076.method718(field1081, field1080);
        field1080 = 0;
        if (arg1 < 44) {
            this.method363(17, (byte) 126);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(III)V", line = 285)
    public final synchronized void method360(int arg0, int arg1, int arg2) {
        this.method318((byte) -9, arg0, (long) field1079, arg1);
        if (arg2 != 0) {
            this.method389((byte) -5, 102, -70L);
        }
    }
}
