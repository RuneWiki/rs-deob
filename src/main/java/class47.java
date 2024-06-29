import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class47 {

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "Z")
    public boolean field637 = false;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "Laq;")
    private class494 field632 = new class494(64);

    @OriginalMember(owner = "client!sc", name = "u", descriptor = "Laq;")
    public class494 field652 = new class494(500);

    @OriginalMember(owner = "client!sc", name = "v", descriptor = "Laq;")
    public class494 field653 = new class494(30);

    @OriginalMember(owner = "client!sc", name = "w", descriptor = "Laq;")
    public class494 field654 = new class494(50);

    @OriginalMember(owner = "client!sc", name = "p", descriptor = "Lgga;")
    public class513 field647;

    @OriginalMember(owner = "client!sc", name = "t", descriptor = "Z")
    public boolean field651;

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "Lgga;")
    private class513 field641;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "Z")
    public static boolean field635 = false;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
    public static int field639 = -1;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "Lin;")
    public static class380 field634 = new class380(6, -2);

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
    public static int field633;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
    public static int field636;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
    public static int field638;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
    public static int field640;

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "I")
    public static int field642;

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "I")
    public static int field643;

    @OriginalMember(owner = "client!sc", name = "m", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!sc", name = "n", descriptor = "I")
    public static int field645;

    @OriginalMember(owner = "client!sc", name = "o", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "client!sc", name = "q", descriptor = "I")
    public static int field648;

    @OriginalMember(owner = "client!sc", name = "r", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!sc", name = "s", descriptor = "I")
    public static int field650;

    @OriginalMember(owner = "client!sc", name = "x", descriptor = "I")
    public int field655;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IZ)V", line = 6)
    public final void method361(int arg0, boolean arg1) {
        if (arg0 != -1) {
            return;
        }
        field644++;
        if (this.field637 != arg1) {
            this.field637 = arg1;
            this.method371((byte) 53);
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(IZ)V", line = 23)
    public static final void method362(int arg0, boolean arg1) {
        if (arg0 != -1) {
            method365(-79, 48, (byte) -102);
        }
        class648.field9194++;
        field646++;
        class302 var2 = class582.method3419(class247.field3554, (byte) 127, class626.field8901);
        class501.method2928(0, var2);
        for (class27 var3 = (class27) class37.field437.method4254((byte) 8); var3 != null; var3 = (class27) class37.field437.method4251(arg0 - 73)) {
            if (!var3.method4235(arg0 - 126)) {
                var3 = (class27) class37.field437.method4254((byte) 8);
                if (var3 == null) {
                    break;
                }
            }
            if (var3.field285 == 0) {
                class251.method1663(false, arg1, var3, true);
            }
        }
        if (class284.field4182 != null) {
            class172.method1268(class284.field4182, -32);
            class284.field4182 = null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZI)V", line = 65)
    public final void method363(boolean arg0, int arg1) {
        this.field632 = new class494(arg1);
        if (arg0) {
            this.field637 = false;
        }
        field642++;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)V", line = 76)
    public final void method364(int arg0, int arg1) {
        class494 var3 = this.field632;
        synchronized (this.field632) {
            this.field632.method2888(arg0, 121);
        }
        field640++;
        class494 var4 = this.field652;
        synchronized (this.field652) {
            this.field652.method2888(arg0, 126);
        }
        class494 var5 = this.field653;
        synchronized (this.field653) {
            this.field653.method2888(arg0, 121);
        }
        if (arg1 != 24506) {
            this.field637 = false;
        }
        class494 var6 = this.field654;
        synchronized (this.field654) {
            this.field654.method2888(arg0, 126);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIB)Z", line = 103)
    public static final boolean method365(int arg0, int arg1, byte arg2) {
        if (arg2 < 55) {
            field639 = 88;
        }
        field643++;
        return (arg0 & 0x60000) != 0 | class724.method4019(arg0, arg1, false) || class518.method3033(arg0, -99, arg1) || class439.method2613(arg1, (byte) -98, arg0);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)Ljg;", line = 114)
    public static final class770 method366(byte arg0) {
        field650++;
        if (class751.field10432 == null || class379.field5312 == null) {
            return null;
        }
        class379.field5312.method3959(117, class751.field10432);
        class770 var1 = (class770) class379.field5312.method3958(105);
        if (var1 == null) {
            return null;
        }
        class548 var2 = class751.field10415.method4105(var1.field10634, -70);
        if (arg0 <= 34) {
            field635 = false;
        }
        return var2 != null && var2.field7603 && var2.method3168((byte) -111, class751.field10417) ? var1 : class412.method2427(95);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z)V", line = 144)
    public static final void method367(boolean arg0) {
        field633++;
        class359.field5087 = 0;
        class754.field10490 = 0;
        for (int var1 = 0; var1 < class600.field8557; var1++) {
            int var2 = class448.field6176 * var1;
            for (int var3 = 0; var3 < class448.field6176; var3++) {
                int var4 = var2 + var3;
                class728.field10154[var4].method2163(class657.field9274 * var3, class36.field432 * var1, class657.field9274, class36.field432, 0, 0, true, true);
            }
        }
        if (arg0) {
            method367(false);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(BZ)V", line = 177)
    public final void method368(byte arg0, boolean arg1) {
        field645++;
        if (arg1 == this.field651) {
            return;
        }
        this.field651 = arg1;
        if (arg0 < 76) {
            this.field653 = null;
        }
        this.method371((byte) 53);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(BI)Lsea;", line = 196)
    public final class416 method369(byte arg0, int arg1) {
        field636++;
        class494 var3 = this.field632;
        class416 var4;
        synchronized (this.field632) {
            var4 = (class416) this.field632.method2882((long) arg1, (byte) -30);
        }
        if (var4 != null) {
            return var4;
        }
        class513 var5 = this.field641;
        byte[] var6;
        synchronized (this.field641) {
            var6 = this.field641.method3019(class575.method3391(-125, arg1), class617.method3546(255, arg1), 66);
        }
        class416 var7 = new class416();
        var7.field5721 = this;
        var7.field5746 = arg1;
        if (var6 != null) {
            var7.method2451((byte) 120, new class431(var6));
        }
        var7.method2449(-44);
        if (var7.field5743) {
            var7.field5760 = false;
            var7.field5693 = 0;
        }
        if (!this.field651 && var7.field5763) {
            var7.field5748 = null;
            var7.field5702 = null;
        }
        class494 var8 = this.field632;
        synchronized (this.field632) {
            if (arg0 < 121) {
                return null;
            } else {
                this.field632.method2890(-7307, (long) arg1, var7);
                return var7;
            }
        }
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(Lmca;IZLgga;Lgga;)V", line = 350)
    public class47(class41 arg0, int arg1, boolean arg2, class513 arg3, class513 arg4) {
        this.field647 = arg4;
        this.field651 = arg2;
        this.field641 = arg3;
        if (this.field641 != null) {
            int var6 = this.field641.method3011((byte) 72) - 1;
            this.field641.method3007(-1, var6);
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(Z)V", line = 251)
    public final void method370(boolean arg0) {
        class494 var2 = this.field632;
        synchronized (this.field632) {
            this.field632.method2893((byte) 100);
        }
        field649++;
        class494 var3 = this.field652;
        synchronized (this.field652) {
            if (arg0) {
                this.method368((byte) 45, true);
            }
            this.field652.method2893((byte) -27);
        }
        class494 var4 = this.field653;
        synchronized (this.field653) {
            this.field653.method2893((byte) 86);
        }
        class494 var5 = this.field654;
        synchronized (this.field654) {
            this.field654.method2893((byte) 111);
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(B)V", line = 277)
    public final void method371(byte arg0) {
        class494 var2 = this.field632;
        synchronized (this.field632) {
            this.field632.method2881((byte) -103);
        }
        field638++;
        class494 var3 = this.field652;
        synchronized (this.field652) {
            this.field652.method2881((byte) -13);
        }
        class494 var4 = this.field653;
        synchronized (this.field653) {
            this.field653.method2881((byte) -76);
            if (arg0 != 53) {
                this.field647 = null;
            }
        }
        class494 var5 = this.field654;
        synchronized (this.field654) {
            this.field654.method2881((byte) -87);
        }
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(B)V", line = 301)
    public static void method372(byte arg0) {
        if (arg0 != 14) {
            method367(true);
        }
        field634 = null;
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(II)V", line = 315)
    public final void method373(int arg0, int arg1) {
        field648++;
        this.field655 = arg1;
        class494 var3 = this.field652;
        synchronized (this.field652) {
            this.field652.method2881((byte) -46);
        }
        class494 var4 = this.field653;
        synchronized (this.field653) {
            if (arg0 != 0) {
                this.method369((byte) -25, -12);
            }
            this.field653.method2881((byte) -64);
        }
        class494 var5 = this.field654;
        synchronized (this.field654) {
            this.field654.method2881((byte) -15);
        }
    }
}
