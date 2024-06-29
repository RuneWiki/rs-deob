import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class279 {

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "I")
    public int field4089 = -1;

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "I")
    public int field4088 = -1;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "I")
    public static int field4086;

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "I")
    public static int field4090;

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "I")
    public static int field4092;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "Lfs;")
    public static class387 field4087;

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "[I")
    public int[] field4091;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Liv;I)V", line = 3)
    public final void method1790(class65 arg0, int arg1) {
        field4086++;
        if (arg1 != -1) {
            this.method1790(null, 22);
        }
        while (true) {
            int var3 = arg0.method577(arg1 ^ 0xFFFFFF00);
            if (var3 == 0) {
                return;
            }
            this.method1792(var3, 89, arg0);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Ljava/lang/String;I)[B", line = 24)
    public static final byte[] method1791(String arg0, int arg1) {
        field4092++;
        int var2 = arg0.length();
        byte[] var3 = new byte[var2];
        int var4 = 0;
        if (arg1 != 17952) {
            return null;
        }
        while (var2 > var4) {
            char var5 = arg0.charAt(var4);
            if (var5 > '\u0000' && var5 < '\u0080' || var5 >= ' ' && var5 <= 'ÿ') {
                var3[var4] = (byte) var5;
            } else if (var5 == '€') {
                var3[var4] = -128;
            } else if (var5 == '‚') {
                var3[var4] = -126;
            } else if (var5 == 'ƒ') {
                var3[var4] = -125;
            } else if (var5 == '„') {
                var3[var4] = -124;
            } else if (var5 == '…') {
                var3[var4] = -123;
            } else if (var5 == '†') {
                var3[var4] = -122;
            } else if (var5 == '‡') {
                var3[var4] = -121;
            } else if (var5 == 'ˆ') {
                var3[var4] = -120;
            } else if (var5 == '‰') {
                var3[var4] = -119;
            } else if (var5 == 'Š') {
                var3[var4] = -118;
            } else if (var5 == '‹') {
                var3[var4] = -117;
            } else if (var5 == 'Œ') {
                var3[var4] = -116;
            } else if (var5 == 'Ž') {
                var3[var4] = -114;
            } else if (var5 == '‘') {
                var3[var4] = -111;
            } else if (var5 == '’') {
                var3[var4] = -110;
            } else if (var5 == '“') {
                var3[var4] = -109;
            } else if (var5 == '”') {
                var3[var4] = -108;
            } else if (var5 == '•') {
                var3[var4] = -107;
            } else if (var5 == '–') {
                var3[var4] = -106;
            } else if (var5 == '—') {
                var3[var4] = -105;
            } else if (var5 == '˜') {
                var3[var4] = -104;
            } else if (var5 == '™') {
                var3[var4] = -103;
            } else if (var5 == 'š') {
                var3[var4] = -102;
            } else if (var5 == '›') {
                var3[var4] = -101;
            } else if (var5 == 'œ') {
                var3[var4] = -100;
            } else if (var5 == 'ž') {
                var3[var4] = -98;
            } else if (var5 == 'Ÿ') {
                var3[var4] = -97;
            } else {
                var3[var4] = 63;
            }
            var4++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IILiv;)V", line = 162)
    private final void method1792(int arg0, int arg1, class65 arg2) {
        if (arg1 <= 23) {
            method1791(null, 59);
        }
        if (arg0 == 1) {
            this.field4089 = arg2.method623((byte) -74);
        } else if (arg0 == 2) {
            this.field4091 = new int[arg2.method577(255)];
            for (int var4 = 0; var4 < this.field4091.length; var4++) {
                this.field4091[var4] = arg2.method623((byte) 115);
            }
        } else if (arg0 == 3) {
            this.field4088 = arg2.method577(255);
        }
        field4090++;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V", line = 196)
    public static void method1793(int arg0) {
        if (arg0 == 13732) {
            field4087 = null;
        }
    }
}
