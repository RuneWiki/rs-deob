import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class144 {

    @OriginalMember(owner = "client!hq", name = "c", descriptor = "Laj;")
    private class287 field2511 = new class287(64);

    @OriginalMember(owner = "client!hq", name = "h", descriptor = "Lom;")
    private class344 field2516;

    @OriginalMember(owner = "client!hq", name = "e", descriptor = "Z")
    public static boolean field2513 = true;

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "[I")
    public static int[] field2510 = new int[13];

    @OriginalMember(owner = "client!hq", name = "k", descriptor = "Z")
    public static boolean field2519 = false;

    @OriginalMember(owner = "client!hq", name = "f", descriptor = "F")
    public static float field2514;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "I")
    public static int field2509;

    @OriginalMember(owner = "client!hq", name = "d", descriptor = "I")
    public static int field2512;

    @OriginalMember(owner = "client!hq", name = "g", descriptor = "I")
    public static int field2515;

    @OriginalMember(owner = "client!hq", name = "i", descriptor = "I")
    public static int field2517;

    @OriginalMember(owner = "client!hq", name = "j", descriptor = "I")
    public static int field2518;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(Lbw;II)V")
    public static final void method1152(class641 arg0, int arg1, int arg2) {
        field2517++;
        class507.field7186 = 0;
        class403.field5831 = false;
        class57.method670(arg0, 101);
        class320.method2055(0, arg0);
        if (class403.field5831) {
            System.out.println("---endgpp---");
        }
        if (arg0.field1393 != arg2) {
            throw new RuntimeException("gpi1 pos:" + arg0.field1393 + " psize:" + arg2);
        } else if (arg1 <= 29) {
            field2510 = null;
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(B)V")
    public final void method1153(byte arg0) {
        class287 var2 = this.field2511;
        synchronized (this.field2511) {
            if (arg0 != -4) {
                return;
            }
            this.field2511.method1913(true);
        }
        field2512++;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(I)V")
    public static void method1154(int arg0) {
        field2510 = null;
        if (arg0 != 32) {
            field2510 = null;
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(II)Lpw;")
    public final class658 method1155(int arg0, int arg1) {
        field2515++;
        class287 var3 = this.field2511;
        class658 var4;
        synchronized (this.field2511) {
            var4 = (class658) this.field2511.method1900((long) arg0, 89);
        }
        if (var4 != null) {
            return var4;
        }
        class344 var5 = this.field2516;
        byte[] var6;
        synchronized (this.field2516) {
            var6 = this.field2516.method2216(32, arg0, true);
            if (arg1 >= -31) {
                method1154(-6);
            }
        }
        class658 var7 = new class658();
        if (var6 != null) {
            var7.method3747((byte) 35, new class61(var6));
        }
        class287 var8 = this.field2511;
        synchronized (this.field2511) {
            this.field2511.method1904(var7, (long) arg0, -1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(Z)V")
    public final void method1156(boolean arg0) {
        field2509++;
        if (arg0) {
            class287 var2 = this.field2511;
            synchronized (this.field2511) {
                this.field2511.method1912(-2552);
            }
        }
    }

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "(II)V")
    public final void method1157(int arg0, int arg1) {
        field2518++;
        class287 var3 = this.field2511;
        synchronized (this.field2511) {
            if (arg0 != 32) {
                this.method1155(-47, 86);
            }
            this.field2511.method1908(arg1, (byte) -11);
        }
    }

    @OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Lmea;ILom;)V")
    public class144(class398 arg0, int arg1, class344 arg2) {
        this.field2516 = arg2;
        this.field2516.method2236(32, 0);
    }
}
