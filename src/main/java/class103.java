import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class103 extends class6 implements Runnable {

    @OriginalMember(owner = "client!ra", name = "fb", descriptor = "Laa;")
    private static class2 field2333 = new class2();

    @OriginalMember(owner = "client!ra", name = "ib", descriptor = "[I")
    private static int[] field2336 = new int[256];

    @OriginalMember(owner = "client!ra", name = "hb", descriptor = "I")
    private static int field2335;

    @OriginalMember(owner = "client!ra", name = "jb", descriptor = "I")
    private static int field2337;

    @OriginalMember(owner = "client!ra", name = "db", descriptor = "Lac;")
    private static class4 field2331;

    @OriginalMember(owner = "client!ra", name = "eb", descriptor = "Z")
    private static boolean field2332;

    @OriginalMember(owner = "client!ra", name = "gb", descriptor = "Z")
    private static boolean field2334;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Z)V", line = 4)
    public final synchronized void method732(boolean arg0) {
        if (!field2333.method12()) {
            return;
        }
        long var2 = (long) (field2337 + 200 - field2331.method40(15751)) * (long) (field2333.field21 * 1000);
        if (arg0) {
            return;
        }
        while (true) {
            while (true) {
                int var4 = field2333.method19();
                int var5 = field2333.field20[var4];
                long var6 = field2333.method9(var5);
                if (var6 > var2) {
                    method820((byte) 1);
                    return;
                }
                while (field2333.field20[var4] == var5) {
                    field2333.method20(var4);
                    this.method818(var6, var4, (byte) -24);
                    if (field2333.method15()) {
                        field2333.method14(var4);
                        if (field2333.method17()) {
                            if (!field2334) {
                                this.method52(26, (long) (var6 / (long) (field2333.field21 * 1000)));
                                field2333.method8();
                                method820((byte) 1);
                                return;
                            }
                            field2333.method11(var6);
                        }
                        break;
                    }
                    field2333.method13(var4);
                    field2333.method14(var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IZI)V", line = 64)
    public final synchronized void method734(int arg0, boolean arg1, int arg2) {
        this.method50(arg2, arg1, (long) field2337, arg0);
        if (!arg1) {
            this.method818(-54L, -97, (byte) -62);
        }
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Lfb;Lac;)V", line = 73)
    public class103(class33 arg0, class4 arg1) {
        field2331 = arg1;
        field2331.method42(-31570);
        field2331.method41(false);
        this.method52(-17, (long) field2337);
        field2331.method38(field2336, field2335);
        field2335 = 0;
        arg0.method318(10, -67, this);
    }

    @OriginalMember(owner = "client!ra", name = "run", descriptor = "()V", line = 87)
    public final void run() {
        try {
            while (true) {
                synchronized (this) {
                    if (field2332) {
                        field2332 = false;
                        return;
                    }
                    this.method732(false);
                }
                class75.method634(100L, 20306);
            }
        } catch (Exception var6) {
            class19.method225(0, null, var6);
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(IIIJ)V", line = 113)
    public final void method57(int arg0, int arg1, int arg2, long arg3) {
        method819(arg0, (byte) -86, arg1, (int) arg3, arg2);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IZ)V", line = 120)
    public final synchronized void method735(int arg0, boolean arg1) {
        this.method58(arg0, (byte) -66, (long) field2337);
        field2331.method38(field2336, field2335);
        field2335 = 0;
        if (arg1) {
            field2334 = false;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)V", line = 132)
    public final synchronized void method738(byte arg0) {
        field2331.method41(false);
        this.method52(127, (long) field2337);
        field2331.method38(field2336, field2335);
        field2335 = 0;
        if (arg0 <= 90) {
            this.method732(true);
        }
        field2333.method8();
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(JIB)V", line = 146)
    private final void method818(long arg0, int arg1, byte arg2) {
        if (arg2 >= -6) {
            return;
        }
        int var5 = field2333.method10(arg1);
        if (var5 == 1) {
            field2333.method7();
        } else if ((var5 & 0x80) != 0) {
            int var6 = (int) (arg0 / (long) (field2333.field21 * 1000));
            int var7 = var5 & 0xFF;
            int var8 = var5 >> 8 & 0xFF;
            int var9 = var5 >> 16 & 0xFF;
            if (!this.method55(var7, var8, var9, (long) var6)) {
                method819(var7, (byte) -88, var8, var6, var9);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "([BZII)V", line = 176)
    public final synchronized void method733(byte[] arg0, boolean arg1, int arg2, int arg3) {
        field2333.method18(arg0);
        field2334 = arg1;
        field2337 = 0;
        field2331.method41(false);
        this.method50(0, true, (long) field2337, arg2);
        int var5 = field2333.method4();
        boolean var6 = true;
        int var7 = -86 / ((arg3 + 24) / 50);
        for (int var8 = 0; var8 < var5; var8++) {
            field2333.method20(var8);
            while (!field2333.method15()) {
                field2333.method13(var8);
                if (field2333.field20[var8] != 0) {
                    var6 = false;
                    break;
                }
                this.method818(0L, var8, (byte) -11);
            }
            field2333.method14(var8);
        }
        if (var6) {
            if (field2334) {
                throw new RuntimeException();
            }
            this.method52(-2, (long) field2337);
            field2333.method8();
        }
        method820((byte) 1);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IBIII)V", line = 229)
    private static final void method819(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (field2336.length <= field2335) {
            field2331.method38(field2336, field2335);
            field2335 = 0;
        }
        field2336[field2335++] = arg3 - field2337;
        field2337 = arg3;
        if (arg1 <= -77) {
            field2336[field2335++] = class14.method156(class14.method156(arg0, arg2 << 8), arg4 << 16);
        }
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(B)V", line = 247)
    private static final void method820(byte arg0) {
        if (field2335 > 0) {
            field2331.method38(field2336, field2335);
            field2335 = 0;
        }
        if (arg0 != 1) {
            method819(-45, (byte) 61, -92, -90, -46);
        }
    }

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "(I)V", line = 269)
    public final void method731(int arg0) {
        synchronized (this) {
            if (arg0 >= -122) {
                return;
            }
            field2332 = true;
        }
        while (true) {
            synchronized (this) {
                if (!field2332) {
                    break;
                }
            }
            class75.method634(20L, 20306);
        }
        field2331.method43(13988);
    }
}
