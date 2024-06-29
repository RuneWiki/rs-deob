import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!l")
public class class21 {

    @OriginalMember(owner = "mapview!l", name = "e", descriptor = "I")
    private int field195;

    @OriginalMember(owner = "mapview!l", name = "d", descriptor = "[Lna;")
    private class26[] field194;

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "[[B")
    public static byte[][] field191 = new byte[250][];

    @OriginalMember(owner = "mapview!l", name = "c", descriptor = "La;")
    public static class1 field193 = class3.method36("Fishing Spot", -97);

    @OriginalMember(owner = "mapview!l", name = "g", descriptor = "Lr;")
    public static class33 field197 = new class33();

    @OriginalMember(owner = "mapview!l", name = "h", descriptor = "La;")
    public static class1 field198 = class3.method36("Staff Shop", -110);

    @OriginalMember(owner = "mapview!l", name = "l", descriptor = "La;")
    public static class1 field202 = class3.method36("Brewery", -114);

    @OriginalMember(owner = "mapview!l", name = "j", descriptor = "[Z")
    public static boolean[] field200 = new boolean[112];

    @OriginalMember(owner = "mapview!l", name = "m", descriptor = "La;")
    public static class1 field203 = class3.method36("Enter place name to find", -104);

    @OriginalMember(owner = "mapview!l", name = "k", descriptor = "I")
    public static int field201;

    @OriginalMember(owner = "mapview!l", name = "f", descriptor = "J")
    private long field196;

    @OriginalMember(owner = "mapview!l", name = "b", descriptor = "Lna;")
    private class26 field192;

    @OriginalMember(owner = "mapview!l", name = "i", descriptor = "Lo;")
    public static class27 field199;

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(Lq;III)[Ls;", line = 10)
    public static final class34[] method108(class31 arg0, int arg1, int arg2, int arg3) {
        if (class8.method55(arg0, 1, arg1, arg2)) {
            int var4 = -97 / ((24 - arg3) / 41);
            return class39.method247(119);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(IB)I", line = 26)
    public static final int method109(int arg0, byte arg1) {
        if (arg0 >= 65 && arg0 <= 90) {
            arg0 += 32;
        }
        int var2 = -41 / ((arg1 + 39) / 58);
        return arg0;
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(BJ)Lna;", line = 51)
    public final class26 method110(byte arg0, long arg1) {
        this.field196 = arg1;
        if (arg0 != 71) {
            return (class26) null;
        }
        class26 var4 = this.field194[(int) ((long) (this.field195 - 1) & arg1)];
        for (this.field192 = var4.field369; this.field192 != var4; this.field192 = this.field192.field369) {
            if (this.field192.field365 == arg1) {
                class26 var5 = this.field192;
                this.field192 = this.field192.field369;
                return var5;
            }
        }
        this.field192 = null;
        return null;
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(B)V", line = 81)
    public static void method111(byte arg0) {
        field202 = null;
        field199 = null;
        field200 = null;
        field197 = null;
        if (arg0 == -27) {
            field198 = null;
            field203 = null;
            field191 = null;
            field193 = null;
        }
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(ZLq;II)[Lu;", line = 110)
    public static final class38[] method112(boolean arg0, class31 arg1, int arg2, int arg3) {
        if (class8.method55(arg1, 1, arg3, arg2)) {
            return arg0 ? (class38[]) null : class7.method51((byte) 47);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(I)Lna;", line = 135)
    public final class26 method113(int arg0) {
        if (this.field192 == null) {
            return null;
        }
        class26 var2 = this.field194[(int) ((long) (this.field195 - 1) & this.field196)];
        if (arg0 != -15859) {
            return (class26) null;
        }
        while (this.field192 != var2) {
            if (this.field192.field365 == this.field196) {
                class26 var3 = this.field192;
                this.field192 = this.field192.field369;
                return var3;
            }
            this.field192 = this.field192.field369;
        }
        this.field192 = null;
        return null;
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(JBLna;)V", line = 165)
    public final void method114(long arg0, byte arg1, class26 arg2) {
        if (arg2.field363 != null) {
            arg2.method173(69);
        }
        class26 var5 = this.field194[(int) ((long) (this.field195 - 1) & arg0)];
        arg2.field363 = var5.field363;
        arg2.field365 = arg0;
        int var6 = 114 % ((arg1 - 46) / 61);
        arg2.field369 = var5;
        arg2.field363.field369 = arg2;
        arg2.field369.field363 = arg2;
    }

    @OriginalMember(owner = "mapview!l", name = "<init>", descriptor = "(I)V", line = 183)
    public class21(int arg0) {
        this.field195 = arg0;
        this.field194 = new class26[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class26 var3 = this.field194[var2] = new class26();
            var3.field369 = var3;
            var3.field363 = var3;
        }
    }
}
