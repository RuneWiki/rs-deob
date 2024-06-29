import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class118 extends class65 implements Runnable {

    @OriginalMember(owner = "client!t", name = "X", descriptor = "Lte;")
    private static class123 field2793 = new class123();

    @OriginalMember(owner = "client!t", name = "Z", descriptor = "[I")
    private static int[] field2795 = new int[256];

    @OriginalMember(owner = "client!t", name = "ab", descriptor = "I")
    private static int field2796;

    @OriginalMember(owner = "client!t", name = "cb", descriptor = "I")
    private static int field2798;

    @OriginalMember(owner = "client!t", name = "Y", descriptor = "Lhe;")
    private static class51 field2794;

    @OriginalMember(owner = "client!t", name = "W", descriptor = "Z")
    private static boolean field2792;

    @OriginalMember(owner = "client!t", name = "bb", descriptor = "Z")
    private static boolean field2797;

    @OriginalMember(owner = "client!t", name = "run", descriptor = "()V", line = 3)
    public final void run() {
        try {
            while (true) {
                synchronized (this) {
                    if (field2792) {
                        field2792 = false;
                        return;
                    }
                    this.method449((byte) 87);
                }
                class84.method653(100L, (byte) 124);
            }
        } catch (Exception var6) {
            class109.method832(69, var6, null);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IBJ)V", line = 29)
    private final void method934(int arg0, byte arg1, long arg2) {
        int var5 = field2793.method971(arg0);
        if (var5 == 1) {
            field2793.method963();
        } else if ((var5 & 0x80) != 0) {
            int var6 = (int) (arg2 / (long) (field2793.field2902 * 1000));
            int var7 = var5 >> 8 & 0xFF;
            int var8 = var5 & 0xFF;
            int var9 = var5 >> 16 & 0xFF;
            if (!this.method508(var8, var7, var9, (long) var6)) {
                method936(arg1 + 29161, var8, var9, var6, var7);
            }
        }
        if (arg1 != -66) {
            field2792 = true;
        }
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(B)V", line = 60)
    public final synchronized void method449(byte arg0) {
        if (!field2793.method959()) {
            return;
        }
        long var2 = (long) (field2798 + 200 - field2794.method426((byte) -5)) * (long) (field2793.field2902 * 1000);
        while (true) {
            while (true) {
                int var4 = field2793.method965();
                int var5 = field2793.field2900[var4];
                long var6 = field2793.method966(var5);
                if (var6 > var2) {
                    method935(-1);
                    if (arg0 <= 14) {
                        this.method450(-80);
                        return;
                    }
                    return;
                }
                while (field2793.field2900[var4] == var5) {
                    field2793.method967(var4);
                    this.method934(var4, (byte) -66, var6);
                    if (field2793.method969()) {
                        field2793.method961(var4);
                        if (field2793.method956()) {
                            if (!field2797) {
                                this.method510((long) (var6 / (long) (field2793.field2902 * 1000)), (byte) -123);
                                field2793.method957();
                                method935(-1);
                                return;
                            }
                            field2793.method964(var6);
                        }
                        break;
                    }
                    field2793.method960(var4);
                    field2793.method961(var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIJ)V", line = 117)
    public final void method446(int arg0, int arg1, int arg2, long arg3) {
        method936(29095, arg0, arg2, (int) arg3, arg1);
    }

    @OriginalMember(owner = "client!t", name = "f", descriptor = "(I)V", line = 124)
    private static final void method935(int arg0) {
        if (arg0 > ~field2796) {
            field2794.method422(field2795, field2796);
            field2796 = 0;
        }
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Lc;Lhe;)V", line = 136)
    public class118(class15 arg0, class51 arg1) {
        field2794 = arg1;
        field2794.method425(false);
        field2794.method423(-9009);
        this.method510((long) field2798, (byte) -123);
        field2794.method422(field2795, field2796);
        field2796 = 0;
        arg0.method130(10, this, -10870);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Z[BII)V", line = 150)
    public final synchronized void method448(boolean arg0, byte[] arg1, int arg2, int arg3) {
        field2793.method962(arg1);
        boolean var5 = true;
        field2798 = 0;
        field2797 = arg0;
        field2794.method423(-9009);
        this.method502(arg2, 193654407, (long) field2798, 0);
        int var6 = field2793.method955();
        for (int var7 = 0; var7 < var6; var7++) {
            field2793.method967(var7);
            while (!field2793.method969()) {
                field2793.method960(var7);
                if (field2793.field2900[var7] != 0) {
                    var5 = false;
                    break;
                }
                this.method934(var7, (byte) -66, 0L);
            }
            field2793.method961(var7);
        }
        if (var5) {
            if (field2797) {
                throw new RuntimeException();
            }
            this.method510((long) field2798, (byte) -123);
            field2793.method957();
        }
        method935(-1);
        int var8 = -68 / ((arg3 + 17) / 47);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V", line = 201)
    public final synchronized void method450(int arg0) {
        field2794.method423(-9009);
        this.method510((long) field2798, (byte) -123);
        field2794.method422(field2795, field2796);
        field2796 = 0;
        field2793.method957();
        if (arg0 != -5736) {
            field2796 = -22;
        }
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(I)V", line = 215)
    public final void method452(int arg0) {
        synchronized (this) {
            field2792 = true;
        }
        while (true) {
            synchronized (this) {
                if (!field2792) {
                    break;
                }
            }
            class84.method653(20L, (byte) 124);
        }
        if (arg0 != 0) {
            this.method934(62, (byte) -35, 49L);
        }
        field2794.method421(-3326);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IZ)V", line = 240)
    public final synchronized void method447(int arg0, boolean arg1) {
        if (arg1) {
            method935(-84);
        }
        this.method499(arg0, false, (long) field2798);
        field2794.method422(field2795, field2796);
        field2796 = 0;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(III)V", line = 254)
    public final synchronized void method451(int arg0, int arg1, int arg2) {
        this.method502(arg2, 193654407, (long) field2798, arg0);
        if (arg1 != 91) {
            method935(3);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIII)V", line = 264)
    private static final void method936(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (field2796 >= field2795.length) {
            field2794.method422(field2795, field2796);
            field2796 = 0;
        }
        field2795[field2796++] = arg3 - field2798;
        field2798 = arg3;
        if (arg0 != 29095) {
            method936(84, 33, -67, -64, 101);
        }
        field2795[field2796++] = class65.method505(class65.method505(arg4 << 8, arg1), arg2 << 16);
    }
}
