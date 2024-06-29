import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class100 {

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "Lh;")
    private class571 field1520 = new class571(64);

    @OriginalMember(owner = "client!jj", name = "j", descriptor = "Lan;")
    private class21 field1523;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "I")
    public static int field1514;

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "I")
    public static int field1515;

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "I")
    public static int field1516;

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "I")
    public static int field1517;

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "I")
    public static int field1518;

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "I")
    public static int field1519;

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "I")
    public static int field1521;

    @OriginalMember(owner = "client!jj", name = "i", descriptor = "I")
    public static int field1522;

    @OriginalMember(owner = "client!jj", name = "k", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)V")
    public final void method709(int arg0, int arg1) {
        class571 var3 = this.field1520;
        synchronized (this.field1520) {
            this.field1520.method3253(arg1, -119);
            if (arg0 != 17196) {
                method715(85, -82, -39, 92, -116, 117, -60, false, 94);
            }
        }
        field1519++;
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(II)Lju;")
    public final class107 method710(int arg0, int arg1) {
        field1524++;
        class571 var3 = this.field1520;
        class107 var4;
        synchronized (this.field1520) {
            var4 = (class107) this.field1520.method3252((long) arg1, (byte) -87);
        }
        if (var4 != null) {
            return var4;
        }
        class21 var5 = this.field1523;
        byte[] var6;
        synchronized (this.field1523) {
            if (arg0 != 260522) {
                method714(34, 92);
            }
            var6 = this.field1523.method240(32, arg1, (byte) -124);
        }
        class107 var7 = new class107();
        if (var6 != null) {
            var7.method758(new class11(var6), false);
        }
        class571 var8 = this.field1520;
        synchronized (this.field1520) {
            this.field1520.method3243(var7, (long) arg1, arg0 ^ 0xFFFC0637);
            return var7;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(B)V")
    public static final void method711(byte arg0) {
        int var1 = -41 % ((arg0 + 67) / 45);
        for (int var2 = 0; var2 < class300.field4116.length; var2++) {
            for (int var3 = 0; var3 < class300.field4116[var2].length; var3++) {
                class300.field4116[var2][var3] = class425.field6043;
            }
        }
        field1517++;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILqa;J)V")
    public static final void method712(int arg0, class207 arg1, long arg2) {
        class466.field6568 = class23.field329;
        class388.field5238 = 0;
        field1515++;
        class23.field329 = 0;
        long var4 = class488.method2835(30160);
        for (class475 var6 = (class475) class150.field2281.method3150(16); var6 != null; var6 = (class475) class150.field2281.method3147(16)) {
            if (var6.method2758(arg1, arg2)) {
                class388.field5238++;
            }
        }
        int var7 = -121 % ((arg0 - 55) / 34);
        if (class597.field8623 && (arg2 % 100L) == 0L) {
            System.out.println("Particle system count: " + class150.field2281.method3143(0) + ", running: " + class388.field5238 + ". Particles: " + class23.field329 + ". Time taken: " + (class488.method2835(30160) - var4) + "ms");
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V")
    public final void method713(int arg0) {
        class571 var2 = this.field1520;
        synchronized (this.field1520) {
            if (arg0 > -71) {
                this.field1520 = null;
            }
            this.field1520.method3248(0);
        }
        field1514++;
    }

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "(II)I")
    public static final int method714(int arg0, int arg1) {
        if (arg1 == 260522) {
            field1521++;
            return (arg0 & 0x3F9AA) >> 11;
        } else {
            return 4;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIIIIIZI)V")
    public static final void method715(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8) {
        field1518++;
        class375.method2220(arg0, arg5, arg4, 22976, arg1, 0, arg6, arg8, arg2, arg3);
        if (arg7) {
            ;
        }
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(B)V")
    public final void method716(byte arg0) {
        field1522++;
        if (arg0 != 5) {
            this.method710(-84, 102);
        }
        class571 var2 = this.field1520;
        synchronized (this.field1520) {
            this.field1520.method3246(false);
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(III)Z")
    public static final boolean method717(int arg0, int arg1, int arg2) {
        if (arg1 == -5569) {
            field1516++;
            return (arg0 & 0x84080) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Lhu;ILan;)V")
    public class100(class111 arg0, int arg1, class21 arg2) {
        this.field1523 = arg2;
        this.field1523.method231(32, -126);
    }
}
