import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class476 {

    @OriginalMember(owner = "client!po", name = "e", descriptor = "Lqc;")
    private class325 field7259 = new class325(64);

    @OriginalMember(owner = "client!po", name = "b", descriptor = "Ldda;")
    private class597 field7256;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "I")
    public static int field7255;

    @OriginalMember(owner = "client!po", name = "c", descriptor = "I")
    public static int field7257;

    @OriginalMember(owner = "client!po", name = "d", descriptor = "I")
    public static int field7258;

    @OriginalMember(owner = "client!po", name = "f", descriptor = "I")
    public static int field7260;

    @OriginalMember(owner = "client!po", name = "g", descriptor = "I")
    public static int field7261;

    @OriginalMember(owner = "client!po", name = "h", descriptor = "I")
    public static int field7262;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(IB)Luk;", line = 12)
    public final class435 method2891(int arg0, byte arg1) {
        if (arg1 <= 9) {
            this.field7259 = null;
        }
        field7262++;
        class325 var3 = this.field7259;
        class435 var4;
        synchronized (this.field7259) {
            var4 = (class435) this.field7259.method2025((long) arg0, 2);
        }
        if (var4 != null) {
            return var4;
        }
        class597 var5 = this.field7256;
        byte[] var6;
        synchronized (this.field7256) {
            var6 = this.field7256.method3486((byte) -57, arg0, 35);
        }
        class435 var7 = new class435();
        if (var6 != null) {
            var7.method2654(new class428(var6), (byte) 23);
        }
        var7.method2652(-123);
        class325 var8 = this.field7259;
        synchronized (this.field7259) {
            this.field7259.method2029(false, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(II)I", line = 48)
    public static final int method2892(int arg0, int arg1) {
        field7260++;
        return arg1 == 27515 ? arg0 >>> 7 : -73;
    }

    @OriginalMember(owner = "client!po", name = "b", descriptor = "(II)V", line = 60)
    public final void method2893(int arg0, int arg1) {
        class325 var3 = this.field7259;
        synchronized (this.field7259) {
            this.field7259.method2028(arg0, true);
        }
        if (arg1 == 64) {
            field7255++;
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(I)V", line = 75)
    public final void method2894(int arg0) {
        if (arg0 < 74) {
            method2892(22, 0);
        }
        class325 var2 = this.field7259;
        synchronized (this.field7259) {
            this.field7259.method2024((byte) -109);
        }
        field7258++;
    }

    @OriginalMember(owner = "client!po", name = "b", descriptor = "(I)V", line = 88)
    public final void method2895(int arg0) {
        field7261++;
        class325 var2 = this.field7259;
        synchronized (this.field7259) {
            this.field7259.method2037(true);
        }
        if (arg0 < 120) {
            method2896(-112, null);
        }
    }

    @OriginalMember(owner = "client!po", name = "<init>", descriptor = "(Loda;ILdda;)V", line = 104)
    public class476(class559 arg0, int arg1, class597 arg2) {
        this.field7256 = arg2;
        if (this.field7256 != null) {
            this.field7256.method3462(35, -99);
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(ILlc;)I", line = 124)
    public static final int method2896(int arg0, class629 arg1) {
        field7257++;
        if (class629.field9205 == arg1) {
            return 5120;
        } else if (class629.field9206 == arg1) {
            return 5122;
        } else if (class629.field9207 == arg1) {
            return 5124;
        } else if (class629.field9208 == arg1) {
            return 5121;
        } else if (class629.field9209 == arg1) {
            return 5123;
        } else if (class629.field9210 == arg1) {
            return 5125;
        } else if (class629.field9211 == arg1) {
            return 5131;
        } else if (class629.field9212 == arg1) {
            return 5126;
        } else if (arg0 >= -86) {
            return -10;
        } else {
            throw new IllegalArgumentException("");
        }
    }
}
