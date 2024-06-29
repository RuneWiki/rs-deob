import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public class class499 {

    @OriginalMember(owner = "client!nq", name = "i", descriptor = "Ld;")
    private class242 field7267 = new class242(16);

    @OriginalMember(owner = "client!nq", name = "g", descriptor = "Lum;")
    private class83 field7265;

    @OriginalMember(owner = "client!nq", name = "f", descriptor = "Lmo;")
    public static class271 field7264 = new class271(4, -1);

    @OriginalMember(owner = "client!nq", name = "k", descriptor = "Lpn;")
    public static class49 field7269 = new class49(64, -1);

    @OriginalMember(owner = "client!nq", name = "m", descriptor = "I")
    public static int field7271 = 0;

    @OriginalMember(owner = "client!nq", name = "l", descriptor = "I")
    public static int field7270 = 0;

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "I")
    public static int field7259;

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "I")
    public static int field7260;

    @OriginalMember(owner = "client!nq", name = "c", descriptor = "I")
    public static int field7261;

    @OriginalMember(owner = "client!nq", name = "d", descriptor = "I")
    public static int field7262;

    @OriginalMember(owner = "client!nq", name = "e", descriptor = "I")
    public static int field7263;

    @OriginalMember(owner = "client!nq", name = "h", descriptor = "I")
    public static int field7266;

    @OriginalMember(owner = "client!nq", name = "j", descriptor = "I")
    public static int field7268;

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(I)V", line = 4)
    public static final void method2979(int arg0) {
        field7268++;
        int var1 = 0;
        if (class40.field667.method1835(class108.field1631, true)) {
            int var2 = var1 | 0x1;
            int var3 = var2 | 0x10;
            int var4 = var3 | 0x20;
            int var5 = var4 | 0x2;
            var1 = var5 | 0x4;
        }
        if (!class40.field667.field4217) {
            var1 |= 0x40;
        }
        if (arg0 != 32) {
            field7263 = 125;
        }
        class200.method1415(var1, (byte) -105);
        class247.field3693.method2274(var1, (byte) 65);
        class300.field4608.method2090(var1, (byte) 44);
        class462.field6842.method1235(var1, (byte) 92);
        class232.field3490.method2629(-1, var1);
        class468.method2849(var1, 19713);
        class303.method2009(var1, (byte) -117);
        class491.method2959(var1, 4);
        class51.method332(var1, 99);
        class8.method39(false);
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(B)V", line = 45)
    public final void method2980(byte arg0) {
        if (arg0 != 95) {
            field7269 = null;
        }
        field7259++;
        class242 var2 = this.field7267;
        synchronized (this.field7267) {
            this.field7267.method1630(-69);
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Ljava/lang/String;B)[B", line = 58)
    public static final byte[] method2981(String arg0, byte arg1) {
        field7261++;
        if (arg1 <= 120) {
            field7263 = -24;
        }
        int var2 = arg0.length();
        byte[] var3 = new byte[var2];
        for (int var4 = 0; var4 < var2; var4++) {
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
        }
        return var3;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(ZI)V", line = 198)
    public final void method2982(boolean arg0, int arg1) {
        field7266++;
        class242 var3 = this.field7267;
        synchronized (this.field7267) {
            this.field7267.method1631(arg1, (byte) -19);
        }
        if (!arg0) {
            this.method2984(-86, -19);
        }
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(B)V", line = 211)
    public static void method2983(byte arg0) {
        field7264 = null;
        field7269 = null;
        if (arg0 <= 87) {
            method2983((byte) -98);
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(II)Lbl;", line = 222)
    public final class237 method2984(int arg0, int arg1) {
        field7262++;
        class242 var3 = this.field7267;
        class237 var4;
        synchronized (this.field7267) {
            var4 = (class237) this.field7267.method1634((long) arg1, 64);
            if (arg0 != 8559) {
                field7264 = null;
            }
        }
        if (var4 != null) {
            return var4;
        }
        class83 var5 = this.field7265;
        byte[] var6;
        synchronized (this.field7265) {
            var6 = this.field7265.method731(0, arg1, 30);
        }
        class237 var7 = new class237();
        if (var6 != null) {
            var7.method1605(new class194(var6), 0);
        }
        class242 var8 = this.field7267;
        synchronized (this.field7267) {
            this.field7267.method1623((long) arg1, 17621, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Z)V", line = 255)
    public final void method2985(boolean arg0) {
        field7260++;
        class242 var2 = this.field7267;
        synchronized (this.field7267) {
            if (!arg0) {
                field7263 = 120;
            }
            this.field7267.method1637((byte) 13);
        }
    }

    @OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Lpt;ILum;)V", line = 277)
    public class499(class308 arg0, int arg1, class83 arg2) {
        this.field7265 = arg2;
        this.field7265.method748(30, 12408);
    }
}
