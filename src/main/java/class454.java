import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class454 {

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "Lfa;")
    private class156 field6675 = new class156(64);

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "Lfs;")
    private class387 field6680;

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "Lpk;")
    public static class133 field6674 = new class133();

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "I")
    public static int field6677 = 0;

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "Luu;")
    public static class188 field6681 = null;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "I")
    public static int field6673;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
    public static int field6676;

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "I")
    public static int field6678;

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "I")
    public static int field6679;

    @OriginalMember(owner = "client!ph", name = "j", descriptor = "I")
    public static int field6682;

    @OriginalMember(owner = "client!ph", name = "k", descriptor = "I")
    public static int field6683;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Ljj;IIII)V")
    public static final void method2734(class76 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 == 1 && arg3 > 0) {
            class344.method2078(arg0, arg2, arg3 - 1, arg4);
        } else if (arg1 == 4 && arg3 <= class241.field3562) {
            class344.method2078(arg0, arg2, arg3 + 1, arg4);
        } else if (arg1 == 8 && arg4 > 0) {
            class344.method2078(arg0, arg2, arg3, arg4 - 1);
        } else if (arg1 == 2 && arg4 <= class497.field7388) {
            class344.method2078(arg0, arg2, arg3, arg4 + 1);
        } else if (arg1 == 16 && arg3 > 0 && arg4 <= class497.field7388) {
            class344.method2078(arg0, arg2, arg3 - 1, arg4 + 1);
        } else if (arg1 == 32 && arg3 <= class241.field3562 && arg4 <= class497.field7388) {
            class344.method2078(arg0, arg2, arg3 + 1, arg4 + 1);
        } else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
            class344.method2078(arg0, arg2, arg3 - 1, arg4 - 1);
        } else if (arg1 == 64 && arg3 <= class241.field3562 && arg4 > 0) {
            class344.method2078(arg0, arg2, arg3 + 1, arg4 - 1);
        } else {
            throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)V")
    public final void method2735(byte arg0) {
        field6673++;
        int var2 = -69 / ((12 - arg0) / 45);
        class156 var3 = this.field6675;
        synchronized (this.field6675) {
            this.field6675.method1105(false);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V")
    public static void method2736(int arg0) {
        field6674 = null;
        if (arg0 != 1) {
            field6681 = null;
        }
        field6681 = null;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Z)V")
    public final void method2737(boolean arg0) {
        class156 var2 = this.field6675;
        synchronized (this.field6675) {
            this.field6675.method1119(84);
        }
        field6678++;
        if (arg0) {
            field6674 = null;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IZ)V")
    public static final void method2738(int arg0, boolean arg1) {
        class156 var2 = class100.field1370;
        synchronized (class100.field1370) {
            class100.field1370.method1116(arg0, -50);
        }
        field6679++;
        class156 var3 = class484.field7118;
        synchronized (class484.field7118) {
            class484.field7118.method1116(arg0, -50);
        }
        if (arg1) {
            method2736(-4);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)V")
    public final void method2739(int arg0, int arg1) {
        class156 var3 = this.field6675;
        synchronized (this.field6675) {
            this.field6675.method1116(arg0, -50);
        }
        field6682++;
        if (arg1 != 1) {
            this.method2735((byte) -36);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(BI)Llg;")
    public final class284 method2740(byte arg0, int arg1) {
        field6676++;
        class156 var3 = this.field6675;
        class284 var5;
        synchronized (this.field6675) {
            int var4 = 69 % ((33 - arg0) / 61);
            var5 = (class284) this.field6675.method1115((long) arg1, (byte) 58);
        }
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = this.field6680.method2363(arg1, 11, 87);
        class284 var7 = new class284();
        if (var6 != null) {
            var7.method1814(new class65(var6), (byte) 71);
        }
        class156 var8 = this.field6675;
        synchronized (this.field6675) {
            this.field6675.method1107(1, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(II)I")
    public static final int method2741(int arg0, int arg1) {
        field6683++;
        if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
            return 6407;
        }
        if (arg1 != 13519) {
            field6681 = null;
        }
        if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
            return 6408;
        } else if (arg0 == 6406 || arg0 == 34844) {
            return 6406;
        } else if (arg0 == 6409 || arg0 == 34846) {
            return 6409;
        } else if (arg0 == 6410 || arg0 == 34847) {
            return 6410;
        } else if (arg0 == 6402) {
            return 6402;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Ljk;ILfs;)V")
    public class454(class446 arg0, int arg1, class387 arg2) {
        this.field6680 = arg2;
        if (this.field6680 != null) {
            this.field6680.method2367(11, 28724);
        }
    }
}
