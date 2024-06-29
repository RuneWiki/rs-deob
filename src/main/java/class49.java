import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class49 extends class92 implements Runnable {

    @OriginalMember(owner = "client!ib", name = "Y", descriptor = "Lcc;")
    private static class15 field1222 = new class15();

    @OriginalMember(owner = "client!ib", name = "bb", descriptor = "[I")
    private static int[] field1225 = new int[256];

    @OriginalMember(owner = "client!ib", name = "ab", descriptor = "I")
    private static int field1224;

    @OriginalMember(owner = "client!ib", name = "db", descriptor = "I")
    private static int field1227;

    @OriginalMember(owner = "client!ib", name = "X", descriptor = "Lwa;")
    private static class132 field1221;

    @OriginalMember(owner = "client!ib", name = "Z", descriptor = "Z")
    private static boolean field1223;

    @OriginalMember(owner = "client!ib", name = "cb", descriptor = "Z")
    private static boolean field1226;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(I)V", line = 3)
    public final synchronized void method382(int arg0) {
        field1221.method1045((byte) -84);
        this.method677(false, (long) field1224);
        field1221.method1047(field1225, field1227);
        field1227 = arg0;
        field1222.method98();
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(B)V", line = 14)
    public final synchronized void method383(byte arg0) {
        if (!field1222.method96() || arg0 > -20) {
            return;
        }
        long var2 = (long) (field1224 + 200 - field1221.method1048(-15117)) * (long) (field1222.field375 * 1000);
        while (true) {
            while (true) {
                int var4 = field1222.method101();
                int var5 = field1222.field377[var4];
                long var6 = field1222.method89(var5);
                if (var6 > var2) {
                    method387((byte) -128);
                    return;
                }
                while (field1222.field377[var4] == var5) {
                    field1222.method100(var4);
                    this.method384(var4, var6, 0);
                    if (field1222.method92()) {
                        field1222.method87(var4);
                        if (field1222.method95()) {
                            if (!field1226) {
                                this.method677(false, (long) (var6 / (long) (field1222.field375 * 1000)));
                                field1222.method98();
                                method387((byte) -17);
                                return;
                            }
                            field1222.method86(var6);
                        }
                        break;
                    }
                    field1222.method102(var4);
                    field1222.method87(var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Lbd;Lwa;)V", line = 74)
    public class49(class11 arg0, class132 arg1) {
        field1221 = arg1;
        field1221.method1046(10068);
        field1221.method1045((byte) -67);
        this.method677(false, (long) field1224);
        field1221.method1047(field1225, field1227);
        field1227 = 0;
        arg0.method74(10, this, (byte) 2);
    }

    @OriginalMember(owner = "client!ib", name = "run", descriptor = "()V", line = 88)
    public final void run() {
        try {
            while (true) {
                synchronized (this) {
                    if (field1223) {
                        field1223 = false;
                        return;
                    }
                    this.method383((byte) -31);
                }
                class127.method1004(100L, 119);
            }
        } catch (Exception var6) {
            class81.method607(null, var6, (byte) -87);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IJI)V", line = 114)
    private final void method384(int arg0, long arg1, int arg2) {
        int var5 = field1222.method93(arg0);
        if (arg2 != 0) {
            field1223 = true;
        }
        if (var5 == 1) {
            field1222.method97();
        } else if ((var5 & 0x80) != 0) {
            int var6 = var5 >> 8 & 0xFF;
            int var7 = (int) (arg1 / (long) (field1222.field375 * 1000));
            int var8 = var5 & 0xFF;
            int var9 = var5 >> 16 & 0xFF;
            if (!this.method683(var8, var6, var9, (long) var7)) {
                method391(var8, 31308, var9, var6, var7);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZI[BI)V", line = 146)
    public final synchronized void method385(boolean arg0, int arg1, byte[] arg2, int arg3) {
        field1222.method90(arg2);
        field1224 = 0;
        boolean var5 = true;
        field1226 = arg0;
        field1221.method1045((byte) -49);
        this.method678(0, arg3, (long) field1224, -17);
        int var6 = field1222.method94();
        for (int var7 = 0; var7 < var6; var7++) {
            field1222.method100(var7);
            while (!field1222.method92()) {
                field1222.method102(var7);
                if (field1222.field377[var7] != 0) {
                    var5 = false;
                    break;
                }
                this.method384(var7, 0L, 0);
            }
            field1222.method87(var7);
        }
        if (arg1 != -1) {
            field1222 = null;
        }
        if (var5) {
            if (field1226) {
                throw new RuntimeException();
            }
            this.method677(false, (long) field1224);
            field1222.method98();
        }
        method387((byte) -34);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V", line = 197)
    public final void method386(int arg0) {
        synchronized (this) {
            field1223 = true;
        }
        while (true) {
            synchronized (this) {
                if (!field1223) {
                    break;
                }
            }
            class127.method1004(20L, arg0 ^ 0x21A3);
        }
        if (arg0 != -8594) {
            field1221 = null;
        }
        field1221.method1049(18026);
    }

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "(B)V", line = 222)
    private static final void method387(byte arg0) {
        int var1 = 48 % ((-arg0 - 85) / 34);
        if (field1227 > 0) {
            field1221.method1047(field1225, field1227);
            field1227 = 0;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IBI)V", line = 237)
    public final synchronized void method388(int arg0, byte arg1, int arg2) {
        this.method678(arg2, arg0, (long) field1224, -17);
        if (arg1 > -15) {
            this.method384(-90, 63L, -14);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIJ)V", line = 248)
    public final void method389(int arg0, int arg1, int arg2, long arg3) {
        method391(arg0, 31308, arg2, arg1, (int) arg3);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)V", line = 255)
    public final synchronized void method390(int arg0, int arg1) {
        if (arg1 != 59) {
            field1221 = null;
        }
        this.method682(arg0, (byte) -124, (long) field1224);
        field1221.method1047(field1225, field1227);
        field1227 = 0;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIII)V", line = 268)
    private static final void method391(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (field1227 >= field1225.length) {
            field1221.method1047(field1225, field1227);
            field1227 = 0;
        }
        field1225[field1227++] = arg4 - field1224;
        field1224 = arg4;
        field1225[field1227++] = class100.method756(class100.method756(arg0, arg3 << 8), arg2 << 16);
        if (arg1 != 31308) {
            field1221 = null;
        }
    }
}
