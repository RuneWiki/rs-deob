import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class55 extends class123 implements Runnable {

    @OriginalMember(owner = "client!ja", name = "T", descriptor = "Lea;")
    private static class26 field1447 = new class26();

    @OriginalMember(owner = "client!ja", name = "V", descriptor = "[I")
    private static int[] field1449 = new int[256];

    @OriginalMember(owner = "client!ja", name = "U", descriptor = "I")
    private static int field1448;

    @OriginalMember(owner = "client!ja", name = "X", descriptor = "I")
    private static int field1451;

    @OriginalMember(owner = "client!ja", name = "R", descriptor = "Ldb;")
    private static class21 field1445;

    @OriginalMember(owner = "client!ja", name = "S", descriptor = "Z")
    private static boolean field1446;

    @OriginalMember(owner = "client!ja", name = "W", descriptor = "Z")
    private static boolean field1450;

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)V", line = 3)
    public final synchronized void method309(int arg0) {
        if (!field1447.method343()) {
            return;
        }
        if (arg0 != 0) {
            field1446 = false;
        }
        long var2 = (long) (field1448 + 200 - field1445.method314(14942)) * (long) (field1447.field761 * 1000);
        while (true) {
            while (true) {
                int var4 = field1447.method336();
                int var5 = field1447.field757[var4];
                long var6 = field1447.method337(var5);
                if (var6 > var2) {
                    method543((byte) 95);
                    return;
                }
                while (field1447.field757[var4] == var5) {
                    field1447.method351(var4);
                    this.method542(var6, (byte) 103, var4);
                    if (field1447.method344()) {
                        field1447.method346(var4);
                        if (field1447.method349()) {
                            if (!field1450) {
                                this.method1003((byte) 110, (long) (var6 / (long) (field1447.field761 * 1000)));
                                field1447.method341();
                                method543((byte) -118);
                                return;
                            }
                            field1447.method345(var6);
                        }
                        break;
                    }
                    field1447.method340(var4);
                    field1447.method346(var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(JBI)V", line = 59)
    private final void method542(long arg0, byte arg1, int arg2) {
        int var5 = 31 % ((arg1 - 32) / 38);
        int var6 = field1447.method338(arg2);
        if (var6 == 1) {
            field1447.method350();
        } else if ((var6 & 0x80) != 0) {
            int var7 = (int) (arg0 / (long) (field1447.field761 * 1000));
            int var8 = var6 & 0xFF;
            int var9 = var6 >> 8 & 0xFF;
            int var10 = var6 >> 16 & 0xFF;
            if (!this.method1004(var8, var9, var10, (long) var7)) {
                method544(var9, (byte) -72, var10, var7, var8);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "run", descriptor = "()V", line = 89)
    public final void run() {
        try {
            while (true) {
                synchronized (this) {
                    if (field1446) {
                        field1446 = false;
                        return;
                    }
                    this.method309(0);
                }
                class86.method756(100L, -75);
            }
        } catch (Exception var6) {
            class11.method215(null, (byte) -127, var6);
        }
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(B)V", line = 117)
    public final void method304(byte arg0) {
        synchronized (this) {
            field1446 = true;
        }
        while (true) {
            synchronized (this) {
                if (!field1446) {
                    break;
                }
            }
            class86.method756(20L, 45);
        }
        if (arg0 >= 100) {
            field1445.method313(26534);
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "([BZII)V", line = 144)
    public final synchronized void method308(byte[] arg0, boolean arg1, int arg2, int arg3) {
        if (arg2 != -15910) {
            field1447 = null;
        }
        boolean var5 = true;
        field1447.method342(arg0);
        field1448 = 0;
        field1450 = arg1;
        field1445.method315(-26);
        this.method999(arg3, 0, (long) field1448, 0);
        int var6 = field1447.method339();
        for (int var7 = 0; var7 < var6; var7++) {
            field1447.method351(var7);
            while (!field1447.method344()) {
                field1447.method340(var7);
                if (field1447.field757[var7] != 0) {
                    var5 = false;
                    break;
                }
                this.method542(0L, (byte) 74, var7);
            }
            field1447.method346(var7);
        }
        if (var5) {
            if (field1450) {
                throw new RuntimeException();
            }
            this.method1003((byte) 127, (long) field1448);
            field1447.method341();
        }
        method543((byte) 50);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(II)V", line = 195)
    public final synchronized void method305(int arg0, int arg1) {
        this.method1000(-115, (long) field1448, arg0);
        field1445.method311(field1449, field1451);
        field1451 = arg1;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIJ)V", line = 204)
    public final void method307(int arg0, int arg1, int arg2, long arg3) {
        method544(arg1, (byte) -102, arg2, (int) arg3, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(BII)V", line = 211)
    public final synchronized void method303(byte arg0, int arg1, int arg2) {
        this.method999(arg1, arg2, (long) field1448, 0);
        if (arg0 >= -82) {
            this.method309(50);
        }
    }

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "(B)V", line = 221)
    private static final void method543(byte arg0) {
        int var1 = 16 % ((arg0 + 32) / 60);
        if (field1451 > 0) {
            field1445.method311(field1449, field1451);
            field1451 = 0;
        }
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(Llc;Ldb;)V", line = 235)
    public class55(class69 arg0, class21 arg1) {
        field1445 = arg1;
        field1445.method312(25832);
        field1445.method315(116);
        this.method1003((byte) 109, (long) field1448);
        field1445.method311(field1449, field1451);
        field1451 = 0;
        arg0.method659(10, 0, this);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)V", line = 249)
    public final synchronized void method306(byte arg0) {
        field1445.method315(-21);
        this.method1003((byte) 115, (long) field1448);
        field1445.method311(field1449, field1451);
        field1451 = 0;
        if (arg0 != -96) {
            field1450 = false;
        }
        field1447.method341();
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IBIII)V", line = 269)
    private static final void method544(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg1 > -44) {
            method543((byte) 22);
        }
        if (field1449.length <= field1451) {
            field1445.method311(field1449, field1451);
            field1451 = 0;
        }
        field1449[field1451++] = arg3 - field1448;
        field1448 = arg3;
        field1449[field1451++] = class76.method708(class76.method708(arg4, arg0 << 8), arg2 << 16);
    }
}
