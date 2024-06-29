import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class152 {

    @OriginalMember(owner = "client!em", name = "f", descriptor = "I")
    public int field1985 = 0;

    @OriginalMember(owner = "client!em", name = "b", descriptor = "I")
    public int field1981 = 0;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "Lwi;")
    private class330 field1980 = new class330(64);

    @OriginalMember(owner = "client!em", name = "l", descriptor = "Lan;")
    private class19 field1991 = null;

    @OriginalMember(owner = "client!em", name = "e", descriptor = "Luu;")
    private class191 field1984;

    @OriginalMember(owner = "client!em", name = "g", descriptor = "Luu;")
    private class191 field1986;

    @OriginalMember(owner = "client!em", name = "j", descriptor = "Lla;")
    public static class319 field1989 = new class319(58, 6);

    @OriginalMember(owner = "client!em", name = "c", descriptor = "I")
    public static int field1982;

    @OriginalMember(owner = "client!em", name = "d", descriptor = "I")
    public static int field1983;

    @OriginalMember(owner = "client!em", name = "h", descriptor = "I")
    public static int field1987;

    @OriginalMember(owner = "client!em", name = "i", descriptor = "I")
    public static int field1988;

    @OriginalMember(owner = "client!em", name = "k", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(III)I", line = 4)
    public static final int method991(int arg0, int arg1, int arg2) {
        field1990++;
        if (arg0 >= -90) {
            return -124;
        }
        int var3 = 1;
        while (arg1 > 1) {
            if ((arg1 & 0x1) != 0) {
                var3 = arg2 * var3;
            }
            arg1 >>= 0x1;
            arg2 *= arg2;
        }
        if (arg1 == 1) {
            return arg2 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(B)V", line = 31)
    public static void method992(byte arg0) {
        field1989 = null;
        if (arg0 != 31) {
            method994(-114, false);
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(II)Lwd;", line = 42)
    public final class182 method993(int arg0, int arg1) {
        field1983++;
        class182 var3 = (class182) this.field1980.method2133((long) arg1, (byte) 68);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg1 < 32768) {
            var4 = this.field1986.method1281(1, arg1, 111);
        } else {
            var4 = this.field1984.method1281(1, arg1 & 0x7FFF, 120);
        }
        class182 var5 = new class182();
        var5.field2461 = this;
        if (var4 != null) {
            var5.method1232((byte) -3, new class164(var4));
        }
        if (arg1 >= 32768) {
            var5.method1239((byte) 109);
        }
        this.field1980.method2131(var5, (long) arg1, false);
        return arg0 > -22 ? null : var5;
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "(ILuu;Luu;Lan;)V", line = 135)
    public class152(int arg0, class191 arg1, class191 arg2, class19 arg3) {
        this.field1984 = arg2;
        this.field1991 = arg3;
        this.field1986 = arg1;
        if (this.field1986 != null) {
            this.field1985 = this.field1986.method1290(false, 1);
        }
        if (this.field1984 != null) {
            this.field1981 = this.field1984.method1290(false, 1);
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IZ)Z", line = 91)
    public static final boolean method994(int arg0, boolean arg1) {
        if (arg1) {
            return false;
        } else {
            field1987++;
            return (-arg0 & arg0) == arg0;
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Lfg;IJ[I)Ljava/lang/String;", line = 111)
    public final String method995(class84 arg0, int arg1, long arg2, int[] arg3) {
        if (arg1 != 1) {
            return null;
        }
        field1988++;
        if (this.field1991 != null) {
            String var6 = this.field1991.method185(arg0, true, arg2, arg3);
            if (var6 != null) {
                return var6;
            }
        }
        return Long.toString(arg2);
    }
}
