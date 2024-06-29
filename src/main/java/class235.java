import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public class class235 {

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "Lhn;")
    private class509 field3134 = new class509(64);

    @OriginalMember(owner = "client!rq", name = "k", descriptor = "Lfo;")
    private class361 field3144;

    @OriginalMember(owner = "client!rq", name = "e", descriptor = "Lfo;")
    public class361 field3138;

    @OriginalMember(owner = "client!rq", name = "j", descriptor = "I")
    public static int field3143 = -1;

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "[I")
    public static int[] field3135 = new int[14];

    @OriginalMember(owner = "client!rq", name = "l", descriptor = "I")
    public static int field3145 = 0;

    @OriginalMember(owner = "client!rq", name = "c", descriptor = "I")
    public static int field3136;

    @OriginalMember(owner = "client!rq", name = "d", descriptor = "I")
    public static int field3137;

    @OriginalMember(owner = "client!rq", name = "f", descriptor = "I")
    public static int field3139;

    @OriginalMember(owner = "client!rq", name = "g", descriptor = "I")
    public static int field3140;

    @OriginalMember(owner = "client!rq", name = "h", descriptor = "I")
    public static int field3141;

    @OriginalMember(owner = "client!rq", name = "i", descriptor = "I")
    public static int field3142;

    @OriginalMember(owner = "client!rq", name = "m", descriptor = "Ljl;")
    public static class179 field3146;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(ZI)Lki;")
    public final class502 method1483(boolean arg0, int arg1) {
        field3136++;
        class509 var3 = this.field3134;
        class502 var4;
        synchronized (this.field3134) {
            var4 = (class502) this.field3134.method3032(3589, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class361 var5 = this.field3144;
        byte[] var6;
        synchronized (this.field3144) {
            var6 = this.field3144.method2130(3, arg1, -65);
        }
        class502 var7 = new class502();
        var7.field7310 = this;
        if (var6 != null) {
            var7.method3015(new class396(var6), -1);
        }
        class509 var8 = this.field3134;
        synchronized (this.field3134) {
            this.field3134.method3046((long) arg1, var7, 1);
        }
        if (arg0) {
            this.method1484(122, -116);
        }
        return var7;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(II)V")
    public final void method1484(int arg0, int arg1) {
        class509 var3 = this.field3134;
        synchronized (this.field3134) {
            this.field3134.method3036(arg1, (byte) -98);
        }
        if (arg0 != 7) {
            this.field3134 = null;
        }
        field3137++;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(I)V")
    public final void method1485(int arg0) {
        if (arg0 != 10) {
            return;
        }
        field3141++;
        class509 var2 = this.field3134;
        synchronized (this.field3134) {
            this.field3134.method3045(48);
        }
    }

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "(I)V")
    public final void method1486(int arg0) {
        field3142++;
        if (arg0 != 14239) {
            this.field3134 = null;
        }
        class509 var2 = this.field3134;
        synchronized (this.field3134) {
            this.field3134.method3034((byte) 122);
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(B)V")
    public static void method1487(byte arg0) {
        field3146 = null;
        field3135 = null;
        if (arg0 != 6) {
            method1488(30, 98, (byte) 67, 70);
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(IIBI)V")
    public static final void method1488(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 <= 40) {
            field3143 = 30;
        }
        field3139++;
        class252.field3358 = new byte[arg1][arg3][arg0];
    }

    @OriginalMember(owner = "client!rq", name = "c", descriptor = "(I)V")
    public static final void method1489(int arg0) {
        if (class527.field7734 == 2) {
            class57.method345(1, 3);
        } else if (class527.field7734 == 6) {
            class57.method345(1, 7);
        } else if (class527.field7734 == 9) {
            class57.method345(1, 10);
        }
        if (arg0 >= 96) {
            field3140++;
        }
    }

    @OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(Ld;ILfo;Lfo;)V")
    public class235(class104 arg0, int arg1, class361 arg2, class361 arg3) {
        this.field3144 = arg2;
        this.field3138 = arg3;
        this.field3144.method2136(-65, 3);
    }
}
