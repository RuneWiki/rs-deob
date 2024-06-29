import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hha")
public class class520 extends class241 {

    @OriginalMember(owner = "client!hha", name = "O", descriptor = "I")
    public static int field7216;

    @OriginalMember(owner = "client!hha", name = "P", descriptor = "I")
    public static int field7217;

    @OriginalMember(owner = "client!hha", name = "Q", descriptor = "I")
    public static int field7218;

    @OriginalMember(owner = "client!hha", name = "R", descriptor = "I")
    public static int field7219;

    @OriginalMember(owner = "client!hha", name = "S", descriptor = "I")
    public static int field7220;

    @OriginalMember(owner = "client!hha", name = "U", descriptor = "I")
    public static int field7222;

    @OriginalMember(owner = "client!hha", name = "T", descriptor = "[B")
    private byte[] field7221;

    @OriginalMember(owner = "client!hha", name = "<init>", descriptor = "()V", line = 3)
    public class520() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!hha", name = "b", descriptor = "(Z)V", line = 9)
    public static final void method3024(boolean arg0) {
        field7220++;
        if (class99.field1732 != null) {
            class99.field1732.method1712((byte) -75);
        }
        if (arg0 || class77.field1391 == null) {
            return;
        }
        while (true) {
            try {
                class77.field1391.join();
                return;
            } catch (InterruptedException var1) {
            }
        }
    }

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(IB)Ltf;", line = 37)
    public static final class297 method3025(int arg0, byte arg1) {
        int var2 = 22 / ((arg1 - 37) / 63);
        field7217++;
        if (arg0 == 0) {
            return new class333();
        } else if (arg0 == 1) {
            return new class104();
        } else if (arg0 == 2) {
            return new class98();
        } else if (arg0 == 3) {
            return new class528();
        } else if (arg0 == 4) {
            return new class459();
        } else if (arg0 == 5) {
            return new class527();
        } else if (arg0 == 6) {
            return new class556();
        } else if (arg0 == 7) {
            return new class630();
        } else if (arg0 == 8) {
            return new class381();
        } else if (arg0 == 9) {
            return new class618();
        } else if (arg0 == 10) {
            return new class76();
        } else if (arg0 == 11) {
            return new class449();
        } else if (arg0 == 12) {
            return new class517();
        } else if (arg0 == 13) {
            return new class270();
        } else if (arg0 == 14) {
            return new class265();
        } else if (arg0 == 15) {
            return new class719();
        } else if (arg0 == 16) {
            return new class341();
        } else if (arg0 == 17) {
            return new class443();
        } else if (arg0 == 18) {
            return new class268();
        } else if (arg0 == 19) {
            return new class525();
        } else if (arg0 == 20) {
            return new class314();
        } else if (arg0 == 21) {
            return new class364();
        } else if (arg0 == 22) {
            return new class466();
        } else if (arg0 == 23) {
            return new class396();
        } else if (arg0 == 24) {
            return new class73();
        } else if (arg0 == 25) {
            return new class230();
        } else if (arg0 == 26) {
            return new class175();
        } else if (arg0 == 27) {
            return new class435();
        } else if (arg0 == 28) {
            return new class728();
        } else if (arg0 == 29) {
            return new class4();
        } else if (arg0 == 30) {
            return new class593();
        } else if (arg0 == 31) {
            return new class57();
        } else if (arg0 == 32) {
            return new class383();
        } else if (arg0 == 33) {
            return new class170();
        } else if (arg0 == 34) {
            return new class512();
        } else if (arg0 == 35) {
            return new class566();
        } else if (arg0 == 36) {
            return new class153();
        } else if (arg0 == 37) {
            return new class438();
        } else if (arg0 == 38) {
            return new class579();
        } else if (arg0 == 39) {
            return new class148();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(IBB)V", line = 358)
    public final void method1668(int arg0, byte arg1, byte arg2) {
        if (arg2 != 14) {
            return;
        }
        field7218++;
        int var4 = arg0 * 2;
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field7221[var10001] = -1;
        int var5 = arg1 & 0xFF;
        this.field7221[var6] = (byte) (var5 * 3 >> 5);
    }

    @OriginalMember(owner = "client!hha", name = "f", descriptor = "(I)Lef;", line = 375)
    public static final class488 method3026(int arg0) {
        int var1 = -98 % ((arg0 + 34) / 33);
        field7222++;
        try {
            return (class488) Class.forName("sw").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(IIBI)[B", line = 391)
    public final byte[] method3027(int arg0, int arg1, byte arg2, int arg3) {
        this.field7221 = new byte[arg0 * arg1 * 2 * arg3];
        if (arg2 < 85) {
            this.field7221 = null;
        }
        field7219++;
        this.method2236(arg1, arg0, 0, arg3);
        return this.field7221;
    }

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(Ljda;I)V", line = 406)
    public static final void method3028(class228 arg0, int arg1) {
        field7216++;
        arg0.field3309 = null;
        int var2 = arg0.field3313.length;
        int var3 = 127 / ((arg1 - 82) / 32);
        for (int var4 = 0; var4 < var2; var4++) {
            arg0.field3313[var4].field4379 = false;
        }
        class174[] var5 = class726.field9828;
        synchronized (class726.field9828) {
            if (var2 < class726.field9828.length && class234.field3391[var2] < 200) {
                class726.field9828[var2].method1298(-126, arg0);
                int var10002 = class234.field3391[var2]++;
            }
        }
    }
}
