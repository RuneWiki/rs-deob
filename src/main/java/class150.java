import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public class class150 {

    @OriginalMember(owner = "client!rt", name = "g", descriptor = "Lwa;")
    private class433 field2225 = new class433(256);

    @OriginalMember(owner = "client!rt", name = "o", descriptor = "Lwa;")
    private class433 field2233 = new class433(256);

    @OriginalMember(owner = "client!rt", name = "k", descriptor = "Lic;")
    private class491 field2229;

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "Lic;")
    private class491 field2219;

    @OriginalMember(owner = "client!rt", name = "j", descriptor = "Lki;")
    public static class498 field2228 = new class498(74, 3);

    @OriginalMember(owner = "client!rt", name = "m", descriptor = "[I")
    public static int[] field2231 = new int[50];

    @OriginalMember(owner = "client!rt", name = "n", descriptor = "I")
    public static int field2232 = 0;

    @OriginalMember(owner = "client!rt", name = "q", descriptor = "I")
    public static int field2235 = 52;

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "I")
    public static int field2220;

    @OriginalMember(owner = "client!rt", name = "c", descriptor = "I")
    public static int field2221;

    @OriginalMember(owner = "client!rt", name = "d", descriptor = "I")
    public static int field2222;

    @OriginalMember(owner = "client!rt", name = "e", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!rt", name = "f", descriptor = "I")
    public static int field2224;

    @OriginalMember(owner = "client!rt", name = "h", descriptor = "I")
    public static int field2226;

    @OriginalMember(owner = "client!rt", name = "i", descriptor = "I")
    public static int field2227;

    @OriginalMember(owner = "client!rt", name = "s", descriptor = "I")
    public static int field2237;

    @OriginalMember(owner = "client!rt", name = "p", descriptor = "Lic;")
    public static class491 field2234;

    @OriginalMember(owner = "client!rt", name = "l", descriptor = "[I")
    public static int[] field2230;

    @OriginalMember(owner = "client!rt", name = "r", descriptor = "[S")
    public static short[] field2236;

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(I[IB)Lnq;", line = 5)
    public final class319 method981(int arg0, int[] arg1, byte arg2) {
        field2224++;
        if (arg2 != 106) {
            return null;
        } else if (this.field2219.method2943((byte) -33) == 1) {
            return this.method983(-104, arg1, 0, arg0);
        } else if (this.field2219.method2942(false, arg0) == 1) {
            return this.method983(-117, arg1, arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(BII)B", line = 28)
    public static final byte method982(byte arg0, int arg1, int arg2) {
        field2221++;
        int var3 = -67 % ((-arg0 - 48) / 36);
        if (arg2 == 9) {
            return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(I[III)Lnq;", line = 48)
    private final class319 method983(int arg0, int[] arg1, int arg2, int arg3) {
        field2226++;
        int var5 = (arg2 >>> 12 | (arg2 & 0xC0000FFF) << 4) ^ arg3;
        int var6 = var5 | arg2 << 16;
        long var7 = (long) var6;
        class319 var9 = (class319) this.field2233.method2605(false, var7);
        if (var9 != null) {
            return var9;
        } else if (arg1 != null && arg1[0] <= 0) {
            return null;
        } else if (arg0 > -85) {
            return null;
        } else {
            class488 var10 = class488.method2896(this.field2219, arg2, arg3);
            if (var10 == null) {
                return null;
            }
            class319 var11 = var10.method2898();
            this.field2233.method2606(var11, var7, 0);
            if (arg1 != null) {
                arg1[0] -= var11.field4575.length;
            }
            return var11;
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(B[II)Lnq;", line = 91)
    public final class319 method984(byte arg0, int[] arg1, int arg2) {
        field2220++;
        if (arg0 != -67) {
            return null;
        } else if (this.field2229.method2943((byte) -33) == 1) {
            return this.method986(0, true, arg1, arg2);
        } else if (this.field2229.method2942(false, arg2) == 1) {
            return this.method986(arg2, true, arg1, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(IIZI)I", line = 111)
    public static final int method985(int arg0, int arg1, boolean arg2, int arg3) {
        field2223++;
        if (arg1 != -1) {
            field2231 = null;
        }
        class138 var4 = class307.method1936((byte) 67, arg2, arg0);
        if (var4 == null) {
            return -1;
        } else if (arg3 >= 0 && arg3 < var4.field2079.length) {
            return var4.field2079[arg3];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(IZ[II)Lnq;", line = 131)
    private final class319 method986(int arg0, boolean arg1, int[] arg2, int arg3) {
        if (!arg1) {
            return null;
        }
        field2227++;
        int var5 = arg3 ^ (arg0 >>> 12 | (arg0 & 0xD0000FFF) << 4);
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class319 var9 = (class319) this.field2233.method2605(!arg1, var7);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class383 var10 = (class383) this.field2225.method2605(false, var7);
            if (var10 == null) {
                var10 = class383.method2348(this.field2229, arg0, arg3);
                if (var10 == null) {
                    return null;
                }
                this.field2225.method2606(var10, var7, 0);
            }
            class319 var11 = var10.method2342(arg2);
            if (var11 == null) {
                return null;
            } else {
                var10.method2049(-110);
                this.field2233.method2606(var11, var7, 0);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(I)V", line = 177)
    public static void method987(int arg0) {
        field2236 = null;
        field2230 = null;
        field2234 = null;
        if (arg0 > -21) {
            method988(-120);
        }
        field2231 = null;
        field2228 = null;
    }

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "(I)V", line = 196)
    public static final void method988(int arg0) {
        field2222++;
        if (class82.field1255 != null) {
            return;
        }
        int var1 = class320.field4580;
        int var2 = class500.field7363;
        if (arg0 != 2056) {
            method985(13, -40, false, -119);
        }
        int var3 = class293.field4195 - class4.field57 - var1;
        int var4 = class453.field6721 - class116.field1743 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class214.field3119 == null) {
                var5 = class483.field7077.field6462;
            } else {
                var5 = class214.field3119;
            }
            int var6 = 0;
            int var7 = 0;
            if (class214.field3119 == var5) {
                Insets var8 = class214.field3119.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, class453.field6721);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, class293.field4195, var2);
            }
            if (var3 > 0) {
                var9.fillRect(var6 - (var3 - class293.field4195), var7, var3, class453.field6721);
            }
            if (var4 > 0) {
                var9.fillRect(var6, class453.field6721 + var7 - var4, class293.field4195, var4);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }

    @OriginalMember(owner = "client!rt", name = "<init>", descriptor = "(Lic;Lic;)V", line = 285)
    public class150(class491 arg0, class491 arg1) {
        this.field2229 = arg1;
        this.field2219 = arg0;
    }
}
