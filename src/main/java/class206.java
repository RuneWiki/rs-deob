import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class206 {

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "Lka;")
    private class473 field2956 = new class473(64);

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "Ldk;")
    private class421 field2954;

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "Lhi;")
    public static class45 field2961 = new class45(44, 3);

    @OriginalMember(owner = "client!aj", name = "l", descriptor = "[I")
    public static int[] field2964 = new int[25];

    @OriginalMember(owner = "client!aj", name = "k", descriptor = "I")
    public static int field2963 = 0;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "I")
    public static int field2953;

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
    public static int field2955;

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "I")
    public static int field2957;

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "I")
    public static int field2958;

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "I")
    public static int field2959;

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "I")
    public static int field2960;

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "I")
    public static int field2962;

    @OriginalMember(owner = "client!aj", name = "m", descriptor = "Ldk;")
    public static class421 field2965;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)V", line = 3)
    public final void method1315(int arg0, int arg1) {
        field2960++;
        class473 var3 = this.field2956;
        synchronized (this.field2956) {
            if (arg0 != 0) {
                method1320(-122);
            }
            this.field2956.method2764(arg0 ^ 0xFFFFFCFF);
            this.field2956 = new class473(arg1);
        }
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(II)V", line = 17)
    public final void method1316(int arg0, int arg1) {
        field2953++;
        class473 var3 = this.field2956;
        synchronized (this.field2956) {
            this.field2956.method2779(14896, arg1);
        }
        if (arg0 != 0) {
            field2964 = null;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V", line = 31)
    public final void method1317(int arg0) {
        class473 var2 = this.field2956;
        synchronized (this.field2956) {
            this.field2956.method2764(-769);
        }
        field2957++;
        int var3 = 15 / ((arg0 - 50) / 63);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(B)V", line = 44)
    public final void method1318(byte arg0) {
        class473 var2 = this.field2956;
        synchronized (this.field2956) {
            this.field2956.method2774((byte) -19);
        }
        field2959++;
        if (arg0 != -122) {
            field2963 = -100;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(BI)Lhd;", line = 57)
    public final class212 method1319(byte arg0, int arg1) {
        field2962++;
        class473 var3 = this.field2956;
        class212 var4;
        synchronized (this.field2956) {
            var4 = (class212) this.field2956.method2767((long) arg1, 0);
        }
        if (var4 != null) {
            return var4;
        }
        class421 var5 = this.field2954;
        byte[] var6;
        synchronized (this.field2954) {
            var6 = this.field2954.method2512(class24.method149(arg1, -96), (byte) -93, class75.method584(arg1, (byte) -103));
        }
        class212 var7 = new class212();
        if (var6 != null) {
            var7.method1341(new class319(var6), (byte) 26);
        }
        class473 var8 = this.field2956;
        synchronized (this.field2956) {
            this.field2956.method2777(-1025, var7, (long) arg1);
        }
        if (arg0 >= -116) {
            field2963 = 72;
        }
        return var7;
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(I)V", line = 89)
    public static final void method1320(int arg0) {
        field2955++;
        class235.method1432((byte) -55, false);
        if (arg0 != 0) {
            field2964 = null;
        }
        if (class426.field6200 >= 0 && class426.field6200 != 0) {
            class54.method349(arg0 ^ 0xFFFFFF88, class426.field6200);
            class426.field6200 = -1;
        }
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(B)V", line = 114)
    public static final void method1321(byte arg0) {
        field2958++;
        if (class236.field3268 == -1) {
            return;
        }
        if (arg0 != 51) {
            field2964 = null;
        }
        int var1 = class113.field1820.method55((byte) -37);
        int var2 = class113.field1820.method62((byte) 49);
        class97 var3 = (class97) class14.field148.method3137(0);
        if (var3 != null) {
            var1 = var3.method778(-7747);
            var2 = var3.method779((byte) -112);
        }
        class251.method1495(class66.field953, class348.field5033, arg0 + 3590, 0, var2, 0, 0, var1, 0, class236.field3268);
        if (class387.field5556 != null) {
            class235.method1438(var2, var1, false);
        }
    }

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "(I)V", line = 143)
    public static void method1322(int arg0) {
        field2965 = null;
        field2961 = null;
        if (arg0 == -29680) {
            field2964 = null;
        }
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(Lad;ILdk;)V", line = 169)
    public class206(class12 arg0, int arg1, class421 arg2) {
        this.field2954 = arg2;
        if (this.field2954 != null) {
            int var4 = this.field2954.method2493((byte) -41) - 1;
            this.field2954.method2509(0, var4);
        }
    }
}
