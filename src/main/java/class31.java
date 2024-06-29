import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class31 {

    @OriginalMember(owner = "client!vo", name = "d", descriptor = "Ldc;")
    private class5 field515 = new class5(64);

    @OriginalMember(owner = "client!vo", name = "m", descriptor = "I")
    public int field524 = 0;

    @OriginalMember(owner = "client!vo", name = "l", descriptor = "Lhe;")
    private class239 field523;

    @OriginalMember(owner = "client!vo", name = "i", descriptor = "I")
    public int field520;

    @OriginalMember(owner = "client!vo", name = "k", descriptor = "I")
    public static int field522 = 0;

    @OriginalMember(owner = "client!vo", name = "n", descriptor = "Lph;")
    public static class438 field525 = new class438("WTRC", 1);

    @OriginalMember(owner = "client!vo", name = "o", descriptor = "D")
    public static double field526 = -1.0D;

    @OriginalMember(owner = "client!vo", name = "j", descriptor = "F")
    public static float field521;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "I")
    public static int field513;

    @OriginalMember(owner = "client!vo", name = "c", descriptor = "I")
    public static int field514;

    @OriginalMember(owner = "client!vo", name = "e", descriptor = "I")
    public static int field516;

    @OriginalMember(owner = "client!vo", name = "f", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!vo", name = "h", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!vo", name = "g", descriptor = "[I")
    public static int[] field518;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(II)V", line = 6)
    public final void method251(int arg0, int arg1) {
        field517++;
        class5 var3 = this.field515;
        synchronized (this.field515) {
            if (arg0 == 4) {
                this.field515.method39(false, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lhd;", line = 19)
    public static final class501 method252(Throwable arg0, String arg1) {
        field516++;
        class501 var2;
        if ((arg0 instanceof class501)) {
            var2 = (class501) arg0;
            var2.field7659 = var2.field7659 + ' ' + arg1;
        } else {
            var2 = new class501(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "(II)Lvp;", line = 36)
    public final class117 method253(int arg0, int arg1) {
        field512++;
        class5 var3 = this.field515;
        class117 var4;
        synchronized (this.field515) {
            var4 = (class117) this.field515.method40(arg0 + 2, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg0 != -2) {
            method252(null, null);
        }
        byte[] var5 = this.field523.method1470(4, arg1, 4);
        class117 var6 = new class117();
        var6.field1501 = arg1;
        var6.field1507 = this;
        if (var5 != null) {
            var6.method673(0, new class156(var5));
        }
        var6.method674(arg0 + 2);
        class5 var7 = this.field515;
        synchronized (this.field515) {
            this.field515.method36(arg0 - 20958, var6, (long) arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(I)V", line = 69)
    public final void method254(int arg0) {
        field514++;
        class5 var2 = this.field515;
        synchronized (this.field515) {
            if (arg0 >= 32) {
                this.field515.method38((byte) -79);
            }
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(Ljava/lang/String;II)V", line = 83)
    public static final void method255(String arg0, int arg1, int arg2) {
        field513++;
        int var3 = class276.field3953;
        int[] var4 = class330.field4790;
        boolean var5 = false;
        int var6 = 0;
        int var7 = -128 % ((11 - arg2) / 33);
        while (var6 < var3) {
            class313 var8 = class262.field3742[var4[var6]];
            if (var8 != null && class415.field6145 != var8 && var8.field4592 != null && var8.field4592.equalsIgnoreCase(arg0)) {
                if (arg1 == 1) {
                    class386.method2321(true, class464.field6729);
                    class210.field2958++;
                    class79.field1108.method989(128, 0);
                    class79.field1108.method961(var4[var6], 1608339368);
                } else if (arg1 == 4) {
                    class487.field7126++;
                    class386.method2321(true, class403.field5939);
                    class79.field1108.method972(var4[var6], -128);
                    class79.field1108.method945(-119, 0);
                } else if (arg1 == 5) {
                    class386.method2321(true, class92.field1249);
                    class205.field2839++;
                    class79.field1108.method944(true, var4[var6]);
                    class79.field1108.method947(-34, 0);
                } else if (arg1 == 6) {
                    class148.field1920++;
                    class386.method2321(true, class262.field3743);
                    class79.field1108.method972(var4[var6], -128);
                    class79.field1108.method964(0, 0);
                } else if (arg1 == 7) {
                    class386.method2321(true, class250.field3606);
                    class492.field7521++;
                    class79.field1108.method945(-43, 0);
                    class79.field1108.method944(true, var4[var6]);
                }
                var5 = true;
                break;
            }
            var6++;
        }
        if (!var5) {
            class98.method597(29315, class454.field6597.method1220(2969, class81.field1122) + arg0);
        }
    }

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "(I)V", line = 165)
    public static void method256(int arg0) {
        if (arg0 != 0) {
            field522 = 116;
        }
        field525 = null;
        field518 = null;
    }

    @OriginalMember(owner = "client!vo", name = "c", descriptor = "(I)V", line = 177)
    public final void method257(int arg0) {
        field519++;
        class5 var2 = this.field515;
        synchronized (this.field515) {
            this.field515.method35((byte) -1);
        }
        if (arg0 < 41) {
            this.method253(-18, -78);
        }
    }

    @OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(Lci;ILhe;)V", line = 214)
    public class31(class298 arg0, int arg1, class239 arg2) {
        this.field523 = arg2;
        this.field520 = this.field523.method1473(4309, 4);
    }
}
