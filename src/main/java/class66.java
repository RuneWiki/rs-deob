import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class66 extends class116 implements Runnable {

    @OriginalMember(owner = "client!l", name = "cb", descriptor = "Lcc;")
    private static class16 field1670 = new class16();

    @OriginalMember(owner = "client!l", name = "gb", descriptor = "[I")
    private static int[] field1674 = new int[256];

    @OriginalMember(owner = "client!l", name = "eb", descriptor = "I")
    private static int field1672;

    @OriginalMember(owner = "client!l", name = "fb", descriptor = "I")
    private static int field1673;

    @OriginalMember(owner = "client!l", name = "db", descriptor = "Lu;")
    private static class118 field1671;

    @OriginalMember(owner = "client!l", name = "bb", descriptor = "Z")
    private static boolean field1669;

    @OriginalMember(owner = "client!l", name = "hb", descriptor = "Z")
    private static boolean field1675;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(B)V", line = 3)
    public final void method170(byte arg0) {
        synchronized (this) {
            field1669 = true;
        }
        if (arg0 < 119) {
            this.method172(-15);
        }
        while (true) {
            synchronized (this) {
                if (!field1669) {
                    break;
                }
            }
            class37.method375(-1, 20L);
        }
        field1671.method912(20971);
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(I)V", line = 28)
    public final synchronized void method176(int arg0) {
        field1671.method908(false);
        this.method892((long) field1673, true);
        field1671.method909(field1674, field1672);
        field1672 = 0;
        int var2 = 83 / ((-arg0 - 73) / 52);
        field1670.method129();
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(IIIJ)V", line = 41)
    public final void method542(int arg0, int arg1, int arg2, long arg3) {
        method544((int) arg3, arg1, arg2, (byte) 2, arg0);
    }

    @OriginalMember(owner = "client!l", name = "h", descriptor = "(I)V", line = 50)
    private static final void method543(int arg0) {
        if (field1672 > 0) {
            field1671.method909(field1674, field1672);
            field1672 = 0;
        }
        if (arg0 != 23202) {
            method544(61, -89, -103, (byte) 82, -122);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(III)V", line = 66)
    public final synchronized void method171(int arg0, int arg1, int arg2) {
        if (arg1 != 19029) {
            this.method177(null, true, 25, true);
        }
        this.method891((long) field1673, (byte) -123, arg2, arg0);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "([BZIZ)V", line = 76)
    public final synchronized void method177(byte[] arg0, boolean arg1, int arg2, boolean arg3) {
        boolean var5 = true;
        field1670.method127(arg0);
        field1673 = 0;
        field1675 = arg3;
        field1671.method908(arg1);
        this.method891((long) field1673, (byte) -123, 0, arg2);
        int var6 = field1670.method131();
        for (int var7 = 0; var7 < var6; var7++) {
            field1670.method120(var7);
            while (!field1670.method126()) {
                field1670.method119(var7);
                if (field1670.field449[var7] != 0) {
                    var5 = false;
                    break;
                }
                this.method545(var7, 0L, (byte) -64);
            }
            field1670.method133(var7);
        }
        if (var5) {
            if (field1675) {
                throw new RuntimeException();
            }
            this.method892((long) field1673, true);
            field1670.method129();
        }
        method543(23202);
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Lsb;Lu;)V", line = 125)
    public class66(class110 arg0, class118 arg1) {
        field1671 = arg1;
        field1671.method907(true);
        field1671.method908(false);
        this.method892((long) field1673, true);
        field1671.method909(field1674, field1672);
        field1672 = 0;
        arg0.method842(this, (byte) 67, 10);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(BI)V", line = 139)
    public final synchronized void method179(byte arg0, int arg1) {
        this.method890((byte) -34, arg1, (long) field1673);
        field1671.method909(field1674, field1672);
        field1672 = 0;
        int var3 = -1 % ((-arg0 - 66) / 60);
    }

    @OriginalMember(owner = "client!l", name = "run", descriptor = "()V", line = 154)
    public final void run() {
        try {
            while (true) {
                synchronized (this) {
                    if (field1669) {
                        field1669 = false;
                        return;
                    }
                    this.method172(59);
                }
                class37.method375(-1, 100L);
            }
        } catch (Exception var6) {
            class33.method264(null, var6, (byte) -108);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V", line = 180)
    public final synchronized void method172(int arg0) {
        if (!field1670.method130()) {
            return;
        }
        long var2 = (long) (field1673 + 200 - field1671.method910((byte) -12)) * (long) (field1670.field452 * 1000);
        int var4 = -37 / ((-arg0 - 41) / 61);
        while (true) {
            while (true) {
                int var5 = field1670.method132();
                int var6 = field1670.field449[var5];
                long var7 = field1670.method125(var6);
                if (var7 > var2) {
                    method543(23202);
                    return;
                }
                while (field1670.field449[var5] == var6) {
                    field1670.method120(var5);
                    this.method545(var5, var7, (byte) -96);
                    if (field1670.method126()) {
                        field1670.method133(var5);
                        if (field1670.method122()) {
                            if (!field1675) {
                                this.method892((long) (var7 / (long) (field1670.field452 * 1000)), true);
                                field1670.method129();
                                method543(23202);
                                return;
                            }
                            field1670.method124(var7);
                        }
                        break;
                    }
                    field1670.method119(var5);
                    field1670.method133(var5);
                }
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIBI)V", line = 244)
    private static final void method544(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (field1674.length <= field1672) {
            field1671.method909(field1674, field1672);
            field1672 = 0;
        }
        int var5 = -35 % ((63 - arg3) / 38);
        field1674[field1672++] = arg0 - field1673;
        field1673 = arg0;
        field1674[field1672++] = class129.method950(class129.method950(arg1 << 8, arg4), arg2 << 16);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IJB)V", line = 262)
    private final void method545(int arg0, long arg1, byte arg2) {
        int var5 = field1670.method134(arg0);
        if (var5 == 1) {
            field1670.method128();
        } else if ((var5 & 0x80) != 0) {
            int var6 = var5 & 0xFF;
            int var7 = (int) (arg1 / (long) (field1670.field452 * 1000));
            int var8 = var5 >> 8 & 0xFF;
            int var9 = var5 >> 16 & 0xFF;
            if (!this.method894(var6, var8, var9, (long) var7)) {
                method544(var7, var8, var9, (byte) -121, var6);
            }
        }
        if (arg2 >= -54) {
            this.method172(-90);
        }
    }
}
