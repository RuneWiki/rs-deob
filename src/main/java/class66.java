import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class66 extends class17 implements Runnable {

    @OriginalMember(owner = "client!l", name = "T", descriptor = "Lbc;")
    private class10 field1453 = new class10();

    @OriginalMember(owner = "client!l", name = "P", descriptor = "[I")
    private static int[] field1449 = new int[256];

    @OriginalMember(owner = "client!l", name = "N", descriptor = "I")
    private static int field1447;

    @OriginalMember(owner = "client!l", name = "R", descriptor = "I")
    private static int field1451;

    @OriginalMember(owner = "client!l", name = "Q", descriptor = "Lid;")
    private static class52 field1450;

    @OriginalMember(owner = "client!l", name = "O", descriptor = "Z")
    private static boolean field1448;

    @OriginalMember(owner = "client!l", name = "S", descriptor = "Z")
    private static boolean field1452;

    @OriginalMember(owner = "client!l", name = "e", descriptor = "(I)V", line = 4)
    public final synchronized void method440(int arg0) {
        if (!this.field1453.method101()) {
            return;
        }
        long var2 = (long) (field1447 + 200 - field1450.method450(17296)) * (long) (this.field1453.field198 * 1000);
        while (true) {
            while (true) {
                int var4 = this.field1453.method87();
                int var5 = this.field1453.field201[var4];
                long var6 = this.field1453.method92(var5);
                if (var2 < var6) {
                    if (arg0 != -1) {
                        this.method437(109);
                    }
                    method511(0);
                    return;
                }
                while (this.field1453.field201[var4] == var5) {
                    this.field1453.method102(var4);
                    this.method513(var4, 75, var6);
                    if (this.field1453.method91()) {
                        this.field1453.method93(var4);
                        if (this.field1453.method90()) {
                            if (!field1452) {
                                this.method136((long) (var6 / (long) (this.field1453.field198 * 1000)), (byte) 69);
                                this.field1453.method96();
                                method511(0);
                                return;
                            }
                            this.field1453.method86(var6);
                        }
                        break;
                    }
                    this.field1453.method97(var4);
                    this.field1453.method93(var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "i", descriptor = "(I)V", line = 64)
    private static final void method511(int arg0) {
        if (field1451 > 0) {
            field1450.method446(field1449, field1451);
            field1451 = 0;
        }
        if (arg0 != 0) {
            field1452 = false;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIB)V", line = 81)
    private static final void method512(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (field1451 >= field1449.length) {
            field1450.method446(field1449, field1451);
            field1451 = 0;
        }
        if (arg4 != 122) {
            method511(-19);
        }
        field1449[field1451++] = arg1 - field1447;
        field1447 = arg1;
        field1449[field1451++] = class106.method785(class106.method785(arg0 << 8, arg3), arg2 << 16);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ZB[BI)V", line = 101)
    public final synchronized void method438(boolean arg0, byte arg1, byte[] arg2, int arg3) {
        this.field1453.method99(arg2);
        field1447 = 0;
        field1452 = arg0;
        field1450.method445((byte) -16);
        boolean var5 = true;
        this.method135(-65, arg3, (long) field1447, 0);
        int var6 = this.field1453.method94();
        if (arg1 != 2) {
            this.method141(-65, 110, 107, -74L);
        }
        for (int var7 = 0; var7 < var6; var7++) {
            this.field1453.method102(var7);
            while (!this.field1453.method91()) {
                this.field1453.method97(var7);
                if (this.field1453.field201[var7] != 0) {
                    var5 = false;
                    break;
                }
                this.method513(var7, 37, 0L);
            }
            this.field1453.method93(var7);
        }
        if (var5) {
            if (field1452) {
                throw new RuntimeException();
            }
            this.method136((long) field1447, (byte) 69);
            this.field1453.method96();
        }
        method511(arg1 ^ 0x2);
    }

    @OriginalMember(owner = "client!l", name = "run", descriptor = "()V", line = 154)
    public final void run() {
        try {
            while (true) {
                synchronized (this) {
                    if (field1448) {
                        field1448 = false;
                        return;
                    }
                    this.method440(-1);
                }
                class113.method873(true, 100L);
            }
        } catch (Exception var6) {
            class45.method392((byte) 32, null, var6);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIJ)V", line = 181)
    private final void method513(int arg0, int arg1, long arg2) {
        int var5 = this.field1453.method88(arg0);
        if (arg1 < 7) {
            method511(-126);
        }
        if (var5 == 1) {
            this.field1453.method89();
        } else if ((var5 & 0x80) != 0) {
            int var6 = (int) (arg2 / (long) (this.field1453.field198 * 1000));
            int var7 = var5 & 0xFF;
            int var8 = var5 >> 8 & 0xFF;
            int var9 = var5 >> 16 & 0xFF;
            if (!this.method132(var7, var8, var9, (long) var6)) {
                method512(var8, var6, var9, var7, (byte) 122);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(IIIJ)V", line = 214)
    public final void method141(int arg0, int arg1, int arg2, long arg3) {
        method512(arg1, (int) arg3, arg2, arg0, (byte) 122);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(BII)V", line = 221)
    public final synchronized void method432(byte arg0, int arg1, int arg2) {
        this.method135(-65, arg2, (long) field1447, arg1);
        if (arg0 != -97) {
            field1450 = null;
        }
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(I)V", line = 234)
    public final void method437(int arg0) {
        synchronized (this) {
            field1448 = true;
        }
        while (true) {
            synchronized (this) {
                if (!field1448) {
                    break;
                }
            }
            class113.method873(true, 20L);
        }
        if (arg0 != 128) {
            this.method141(40, -115, -108, 110L);
        }
        field1450.method447(arg0 ^ 0xBA);
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(B)V", line = 260)
    public final synchronized void method429(byte arg0) {
        int var2 = -92 % ((arg0 + 2) / 57);
        field1450.method445((byte) -16);
        this.method136((long) field1447, (byte) 69);
        field1450.method446(field1449, field1451);
        field1451 = 0;
        this.field1453.method96();
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Lbb;Lid;)V", line = 275)
    public class66(class9 arg0, class52 arg1) {
        field1450 = arg1;
        field1450.method448(-9304);
        field1450.method445((byte) -16);
        this.method136((long) field1447, (byte) 69);
        field1450.method446(field1449, field1451);
        field1451 = 0;
        arg0.method83(10, this, (byte) 31);
    }

    @OriginalMember(owner = "client!l", name = "d", descriptor = "(I)V", line = 289)
    public final synchronized void method439(int arg0) {
        if (arg0 != 1) {
            this.method429((byte) -10);
        }
        this.method138((byte) -97, (long) field1447);
        field1450.method446(field1449, field1451);
        field1451 = 0;
    }
}
