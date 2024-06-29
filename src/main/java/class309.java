import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class309 {

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "I")
    public int field4216;

    @OriginalMember(owner = "client!ta", name = "j", descriptor = "I")
    public int field4221;

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "Lta;")
    public class309 field4215;

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "Ldr;")
    public class250 field4219;

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "Lfn;")
    public static class52 field4220 = new class52(32, -2);

    @OriginalMember(owner = "client!ta", name = "m", descriptor = "Z")
    public static boolean field4224 = false;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "I")
    public int field4212;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "I")
    public int field4213;

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "I")
    public static int field4214;

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "I")
    public static int field4217;

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "I")
    public int field4218;

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "I")
    public static int field4222;

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "I")
    public static int field4223;

    @OriginalMember(owner = "client!ta", name = "n", descriptor = "I")
    public static int field4225;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(III)I", line = 6)
    public static final int method1865(int arg0, int arg1, int arg2) {
        field4214++;
        if (arg0 > -36) {
            field4220 = null;
        }
        int var3 = arg2 >>> 24;
        int var4 = 255 - var3;
        int var5 = ((arg2 & 0xFF00FF) * var3 & 0xFF00FF00 | (arg2 & 0xFF00) * var3 & 0xFF0000) >>> 8;
        return (((arg1 & 0xFF00FF) * var4 & 0xFF00FF00 | (arg1 & 0xFF00) * var4 & 0xFF0000) >>> 8) + var5;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILuq;[[B)V", line = 22)
    public static final void method1866(int arg0, class115 arg1, byte[][] arg2) {
        field4225++;
        if (arg0 >= -44) {
            return;
        }
        for (int var3 = 0; var3 < arg1.field345; var3++) {
            class172.method1155(15547);
            for (int var4 = 0; var4 < class200.field2875 >> 3; var4++) {
                for (int var5 = 0; var5 < class422.field5811 >> 3; var5++) {
                    int var6 = class109.field1544[var3][var4][var5];
                    if (var6 != -1) {
                        int var7 = (var6 & 0x376C67C) >> 24;
                        if (!arg1.field352 || var7 == 0) {
                            int var8 = (var6 & 0x7) >> 1;
                            int var9 = var6 >> 14 & 0x3FF;
                            int var10 = var6 >> 3 & 0x7FF;
                            int var11 = (var9 / 8 << 8) + var10 / 8;
                            for (int var12 = 0; var12 < class490.field6908.length; var12++) {
                                if (class490.field6908[var12] == var11 && arg2[var12] != null) {
                                    arg1.method720((var10 & 0x7) * 8, var5 * 8, (var9 & 0x7) * 8, var4 * 8, var8, class338.field4636, class308.field4209, var7, arg2[var12], var3, -3);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(B)V", line = 94)
    public static final void method1867(byte arg0) {
        field4217++;
        if (class22.field377 == 0) {
            return;
        }
        if (arg0 != -117) {
            field4220 = null;
        }
        try {
            if ((++class205.field2936) > 1500) {
                if (class237.field3339 != null) {
                    class237.field3339.method2632(arg0 ^ 0xFFFF825D);
                    class237.field3339 = null;
                }
                if (class407.field5643 >= 1) {
                    class22.field377 = 0;
                    class353.field4917 = -5;
                    return;
                }
                if (class270.field3736 == class154.field2228) {
                    class270.field3736 = class363.field5074;
                } else {
                    class270.field3736 = class154.field2228;
                }
                class205.field2936 = 0;
                class407.field5643++;
                class22.field377 = 1;
            }
            if (class22.field377 == 1) {
                class15.field247 = class343.field4703.method125((byte) 87, class84.field1264, class270.field3736);
                class22.field377 = 2;
            }
            if (class22.field377 == 2) {
                if (class15.field247.field5789 == 2) {
                    throw new IOException();
                }
                if (class15.field247.field5789 != 1) {
                    return;
                }
                class237.field3339 = new class456((Socket) class15.field247.field5791, class343.field4703);
                class15.field247 = null;
                class237.field3339.method2635(0, class366.field5214.field5830, class366.field5214.field5886, -15109);
                if (class36.field622 != null) {
                    class36.field622.method1035((byte) -115);
                }
                if (class2.field22 != null) {
                    class2.field22.method1035((byte) -104);
                }
                int var1 = class237.field3339.method2630((byte) 117);
                if (class36.field622 != null) {
                    class36.field622.method1035((byte) -75);
                }
                if (class2.field22 != null) {
                    class2.field22.method1035((byte) -54);
                }
                if (var1 != 101) {
                    class353.field4917 = var1;
                    class22.field377 = 0;
                    class237.field3339.method2632(arg0 ^ 0xFFFF825D);
                    class237.field3339 = null;
                    return;
                }
                class22.field377 = 3;
            }
            if (class22.field377 == 3 && class237.field3339.method2634(-115) >= 2) {
                int var2 = class237.field3339.method2630((byte) 125) << 8 | class237.field3339.method2630((byte) 89);
                class262.method1624(var2, (byte) 74);
                if (class355.field4955 == -1) {
                    class353.field4917 = 6;
                    class22.field377 = 0;
                    class237.field3339.method2632(32214);
                    class237.field3339 = null;
                } else {
                    class22.field377 = 0;
                    class237.field3339.method2632(arg0 + 32331);
                    class237.field3339 = null;
                    class115.method730(1);
                }
            }
        } catch (IOException var3) {
            if (class237.field3339 != null) {
                class237.field3339.method2632(32214);
                class237.field3339 = null;
            }
            if (class407.field5643 >= 1) {
                class22.field377 = 0;
                class353.field4917 = -4;
            } else {
                class407.field5643++;
                class205.field2936 = 0;
                if (class270.field3736 == class154.field2228) {
                    class270.field3736 = class363.field5074;
                } else {
                    class270.field3736 = class154.field2228;
                }
                class22.field377 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ljava/lang/String;B)[B", line = 249)
    public static final byte[] method1868(String arg0, byte arg1) {
        field4222++;
        int var2 = arg0.length();
        byte[] var3 = new byte[var2];
        if (arg1 != -108) {
            method1866(-104, (class115) null, (byte[][]) null);
        }
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

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)V", line = 387)
    public static void method1869(int arg0) {
        field4220 = null;
        if (arg0 != 0) {
            method1869(-31);
        }
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(II)V", line = 400)
    public class309(int arg0, int arg1) {
        this.field4216 = arg1;
        this.field4221 = arg0;
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Lta;I)V", line = 408)
    public class309(class309 arg0, int arg1) {
        this.field4215 = arg0;
        this.field4219 = this.field4215.field4219;
        this.field4216 = this.field4215.field4216 + arg1;
        this.field4221 = this.field4215.field4221;
    }
}
