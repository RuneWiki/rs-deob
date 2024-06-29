import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rfa")
public class class494 {

    @OriginalMember(owner = "client!rfa", name = "i", descriptor = "Ljn;")
    private class117 field7086 = new class117(64);

    @OriginalMember(owner = "client!rfa", name = "j", descriptor = "Lvo;")
    private class345 field7087;

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "I")
    public int field7078;

    @OriginalMember(owner = "client!rfa", name = "b", descriptor = "I")
    public static int field7079;

    @OriginalMember(owner = "client!rfa", name = "c", descriptor = "I")
    public static int field7080;

    @OriginalMember(owner = "client!rfa", name = "d", descriptor = "I")
    public static int field7081;

    @OriginalMember(owner = "client!rfa", name = "e", descriptor = "I")
    public static int field7082;

    @OriginalMember(owner = "client!rfa", name = "f", descriptor = "I")
    public static int field7083;

    @OriginalMember(owner = "client!rfa", name = "g", descriptor = "I")
    public static int field7084;

    @OriginalMember(owner = "client!rfa", name = "k", descriptor = "I")
    public static int field7088;

    @OriginalMember(owner = "client!rfa", name = "h", descriptor = "Lqaa;")
    public static class309 field7085;

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IB)Lhf;", line = 3)
    public final class644 method2888(int arg0, byte arg1) {
        field7079++;
        class117 var3 = this.field7086;
        class644 var4;
        synchronized (this.field7086) {
            var4 = (class644) this.field7086.method941((long) arg0, 0);
            if (arg1 != 10) {
                method2892(38, null, -75, 34, -89, null);
            }
        }
        if (var4 != null) {
            return var4;
        }
        class345 var5 = this.field7087;
        byte[] var6;
        synchronized (this.field7087) {
            var6 = this.field7087.method2081(-23, arg0, 16);
        }
        class644 var7 = new class644();
        if (var6 != null) {
            var7.method3619(-11, new class465(var6));
        }
        class117 var8 = this.field7086;
        synchronized (this.field7086) {
            this.field7086.method949((long) arg0, true, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IIIIIII)Lpa;", line = 34)
    public static final class587 method2889(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field7082++;
        long var7 = (long) arg0 * 76724863L ^ (long) arg2 * 32147369L ^ (long) arg5 * 475427L ^ (long) arg6 * 67481L ^ (long) arg3 * 97549L ^ (long) arg1 * 986053L;
        class587 var9 = (class587) class246.field3574.method941(var7, 0);
        if (var9 != null) {
            return var9;
        }
        if (arg4 < 111) {
            method2889(18, -24, -44, 86, 114, 84, -55);
        }
        class587 var10 = class506.field7522.method797(arg6, arg3, arg5, arg1, arg2, arg0);
        class246.field3574.method949(var7, true, var10);
        return var10;
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(I)V", line = 56)
    public static void method2890(int arg0) {
        field7085 = null;
        if (arg0 >= -44) {
            field7088 = 106;
        }
    }

    @OriginalMember(owner = "client!rfa", name = "b", descriptor = "(I)V", line = 68)
    public final void method2891(int arg0) {
        class117 var2 = this.field7086;
        synchronized (this.field7086) {
            this.field7086.method936(-57);
        }
        field7084++;
        if (arg0 != -25404) {
            method2890(86);
        }
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(I[BIIILjava/lang/String;)I", line = 87)
    public static final int method2892(int arg0, byte[] arg1, int arg2, int arg3, int arg4, String arg5) {
        field7081++;
        int var6 = arg2 - arg0;
        for (int var7 = 0; var7 < var6; var7++) {
            char var9 = arg5.charAt(arg0 + var7);
            if (!(var9 <= '\u0000' || var9 >= '\u0080') || !(var9 < ' ' || var9 > 'ÿ')) {
                arg1[arg4 + var7] = (byte) var9;
            } else if (var9 == '€') {
                arg1[arg4 + var7] = -128;
            } else if (var9 == '‚') {
                arg1[arg4 + var7] = -126;
            } else if (var9 == 'ƒ') {
                arg1[arg4 + var7] = -125;
            } else if (var9 == '„') {
                arg1[arg4 + var7] = -124;
            } else if (var9 == '…') {
                arg1[arg4 + var7] = -123;
            } else if (var9 == '†') {
                arg1[arg4 + var7] = -122;
            } else if (var9 == '‡') {
                arg1[arg4 + var7] = -121;
            } else if (var9 == 'ˆ') {
                arg1[arg4 + var7] = -120;
            } else if (var9 == '‰') {
                arg1[arg4 + var7] = -119;
            } else if (var9 == 'Š') {
                arg1[arg4 + var7] = -118;
            } else if (var9 == '‹') {
                arg1[arg4 + var7] = -117;
            } else if (var9 == 'Œ') {
                arg1[arg4 + var7] = -116;
            } else if (var9 == 'Ž') {
                arg1[arg4 + var7] = -114;
            } else if (var9 == '‘') {
                arg1[arg4 + var7] = -111;
            } else if (var9 == '’') {
                arg1[arg4 + var7] = -110;
            } else if (var9 == '“') {
                arg1[arg4 + var7] = -109;
            } else if (var9 == '”') {
                arg1[arg4 + var7] = -108;
            } else if (var9 == '•') {
                arg1[arg4 + var7] = -107;
            } else if (var9 == '–') {
                arg1[arg4 + var7] = -106;
            } else if (var9 == '—') {
                arg1[arg4 + var7] = -105;
            } else if (var9 == '˜') {
                arg1[arg4 + var7] = -104;
            } else if (var9 == '™') {
                arg1[arg4 + var7] = -103;
            } else if (var9 == 'š') {
                arg1[arg4 + var7] = -102;
            } else if (var9 == '›') {
                arg1[arg4 + var7] = -101;
            } else if (var9 == 'œ') {
                arg1[arg4 + var7] = -100;
            } else if (var9 == 'ž') {
                arg1[arg4 + var7] = -98;
            } else if (var9 == 'Ÿ') {
                arg1[arg4 + var7] = -97;
            } else {
                arg1[arg4 + var7] = 63;
            }
        }
        int var8 = -116 / ((arg3 + 35) / 59);
        return var6;
    }

    @OriginalMember(owner = "client!rfa", name = "<init>", descriptor = "(Lgn;ILvo;)V", line = 240)
    public class494(class529 arg0, int arg1, class345 arg2) {
        this.field7087 = arg2;
        if (this.field7087 == null) {
            this.field7078 = 0;
        } else {
            this.field7078 = this.field7087.method2098(0, 16);
        }
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(II)V", line = 228)
    public final void method2893(int arg0, int arg1) {
        class117 var3 = this.field7086;
        synchronized (this.field7086) {
            this.field7086.method939(28093, arg1);
        }
        field7083++;
        if (arg0 != 0) {
            this.field7087 = null;
        }
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Z)V", line = 257)
    public final void method2894(boolean arg0) {
        field7080++;
        class117 var2 = this.field7086;
        synchronized (this.field7086) {
            this.field7086.method950((byte) 8);
            if (!arg0) {
                this.method2891(-17);
            }
        }
    }
}
