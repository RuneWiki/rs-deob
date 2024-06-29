import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class62 extends class90 implements Runnable {

    @OriginalMember(owner = "client!kc", name = "I", descriptor = "Lub;")
    private static class121 field1531 = new class121();

    @OriginalMember(owner = "client!kc", name = "U", descriptor = "[I")
    private static int[] field1536 = new int[256];

    @OriginalMember(owner = "client!kc", name = "S", descriptor = "I")
    private static int field1534;

    @OriginalMember(owner = "client!kc", name = "V", descriptor = "I")
    private static int field1537;

    @OriginalMember(owner = "client!kc", name = "Q", descriptor = "Lcd;")
    private static class17 field1532;

    @OriginalMember(owner = "client!kc", name = "R", descriptor = "Z")
    private static boolean field1533;

    @OriginalMember(owner = "client!kc", name = "T", descriptor = "Z")
    private static boolean field1535;

    @OriginalMember(owner = "client!kc", name = "run", descriptor = "()V", line = 3)
    public final void run() {
        try {
            while (true) {
                synchronized (this) {
                    if (field1533) {
                        field1533 = false;
                        return;
                    }
                    this.method74((byte) 73);
                }
                class51.method400((byte) 51, 100L);
            }
        } catch (Exception var6) {
            class50.method392(46, null, var6);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIII)V", line = 29)
    private static final void method452(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (field1534 >= field1536.length) {
            field1532.method99(field1536, field1534);
            field1534 = 0;
        }
        int var5 = 61 % ((-arg2 - 28) / 49);
        field1536[field1534++] = arg1 - field1537;
        field1537 = arg1;
        field1536[field1534++] = class43.method294(arg3 << 16, class43.method294(arg0, arg4 << 8));
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(Lra;Lcd;)V", line = 45)
    public class62(class102 arg0, class17 arg1) {
        field1532 = arg1;
        field1532.method103((byte) 99);
        field1532.method100(18470);
        this.method598((long) field1537, (byte) 91);
        field1532.method99(field1536, field1534);
        field1534 = 0;
        arg0.method725((byte) 60, 10, this);
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(IJI)V", line = 59)
    private final void method453(int arg0, long arg1, int arg2) {
        int var5 = 105 / ((31 - arg0) / 54);
        int var6 = field1531.method927(arg2);
        if (var6 == 1) {
            field1531.method922();
        } else if ((var6 & 0x80) != 0) {
            int var7 = (int) (arg1 / (long) (field1531.field2855 * 1000));
            int var8 = var6 & 0xFF;
            int var9 = var6 >> 8 & 0xFF;
            int var10 = var6 >> 16 & 0xFF;
            if (!this.method599(var8, var9, var10, (long) var7)) {
                method452(var8, var7, -119, var10, var9);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)V", line = 89)
    public final synchronized void method80(byte arg0) {
        int var2 = 48 % ((33 - arg0) / 44);
        field1532.method100(18470);
        this.method598((long) field1537, (byte) 91);
        field1532.method99(field1536, field1534);
        field1534 = 0;
        field1531.method920();
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIJ)V", line = 102)
    public final void method454(int arg0, int arg1, int arg2, long arg3) {
        method452(arg0, (int) arg3, 116, arg2, arg1);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(III)V", line = 110)
    public final synchronized void method75(int arg0, int arg1, int arg2) {
        this.method596((long) field1537, 85, arg0, arg2);
        if (arg1 != -25) {
            this.method454(60, -86, -96, 122L);
        }
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(B)V", line = 120)
    public final synchronized void method74(byte arg0) {
        if (!field1531.method928()) {
            return;
        }
        long var2 = (long) (field1537 + 200 - field1532.method102(-100)) * (long) (field1531.field2855 * 1000);
        while (true) {
            while (true) {
                int var4 = field1531.method925();
                int var5 = field1531.field2858[var4];
                long var6 = field1531.method918(var5);
                if (var2 < var6) {
                    if (arg0 < 48) {
                        return;
                    }
                    method455((byte) 97);
                    return;
                }
                while (field1531.field2858[var4] == var5) {
                    field1531.method916(var4);
                    this.method453(-45, var6, var4);
                    if (field1531.method914()) {
                        field1531.method926(var4);
                        if (field1531.method915()) {
                            if (!field1535) {
                                this.method598((long) (var6 / (long) (field1531.field2855 * 1000)), (byte) 91);
                                field1531.method920();
                                method455((byte) 115);
                                return;
                            }
                            field1531.method919(var6);
                        }
                        break;
                    }
                    field1531.method929(var4);
                    field1531.method926(var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "(B)V", line = 178)
    private static final void method455(byte arg0) {
        if (arg0 <= 90) {
            method452(-74, 1, -108, 120, -72);
        }
        if (field1534 > 0) {
            field1532.method99(field1536, field1534);
            field1534 = 0;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I[BZI)V", line = 194)
    public final synchronized void method77(int arg0, byte[] arg1, boolean arg2, int arg3) {
        field1531.method917(arg1);
        field1535 = arg2;
        field1537 = 0;
        boolean var5 = true;
        if (arg3 != -28) {
            return;
        }
        field1532.method100(18470);
        this.method596((long) field1537, 101, arg0, 0);
        int var6 = field1531.method921();
        for (int var7 = 0; var7 < var6; var7++) {
            field1531.method916(var7);
            while (!field1531.method914()) {
                field1531.method929(var7);
                if (field1531.field2858[var7] != 0) {
                    var5 = false;
                    break;
                }
                this.method453(arg3 ^ 0x79, 0L, var7);
            }
            field1531.method926(var7);
        }
        if (var5) {
            if (field1535) {
                throw new RuntimeException();
            }
            this.method598((long) field1537, (byte) 91);
            field1531.method920();
        }
        method455((byte) 113);
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(BI)V", line = 248)
    public final synchronized void method76(byte arg0, int arg1) {
        this.method601(arg0 + 86, (long) field1537, arg1);
        field1532.method99(field1536, field1534);
        field1534 = 0;
        if (arg0 != -86) {
            field1532 = null;
        }
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "(B)V", line = 260)
    public final void method79(byte arg0) {
        synchronized (this) {
            field1533 = true;
        }
        while (true) {
            synchronized (this) {
                if (!field1533) {
                    break;
                }
            }
            class51.method400((byte) 91, 20L);
        }
        int var4 = 108 % ((arg0 + 75) / 51);
        field1532.method98((byte) 86);
    }
}
