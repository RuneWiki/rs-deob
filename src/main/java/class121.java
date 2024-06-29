import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class121 extends class235 {

    @OriginalMember(owner = "client!f", name = "Pb", descriptor = "I")
    public static int field2132 = 0;

    @OriginalMember(owner = "client!f", name = "Nb", descriptor = "Loh;")
    public static class258 field2130 = class153.method1046("www)2wtrc", 99);

    @OriginalMember(owner = "client!f", name = "Tb", descriptor = "Loh;")
    public static class258 field2136 = class153.method1046("Texturen geladen)3", 110);

    @OriginalMember(owner = "client!f", name = "Rb", descriptor = "[I")
    public static int[] field2134 = new int[128];

    @OriginalMember(owner = "client!f", name = "Yb", descriptor = "J")
    public static long field2141 = 0L;

    @OriginalMember(owner = "client!f", name = "Ib", descriptor = "Z")
    public static boolean field2125 = false;

    @OriginalMember(owner = "client!f", name = "Zb", descriptor = "Loh;")
    public static class258 field2142 = class153.method1046("Verbindung mit Update)2Server)3)3)3", 96);

    @OriginalMember(owner = "client!f", name = "fc", descriptor = "Loh;")
    public static class258 field2148 = class153.method1046(" (X", 118);

    @OriginalMember(owner = "client!f", name = "dc", descriptor = "[I")
    public static int[] field2146 = new int[100];

    @OriginalMember(owner = "client!f", name = "Wb", descriptor = "F")
    public static float field2139;

    @OriginalMember(owner = "client!f", name = "Hb", descriptor = "I")
    public static int field2124;

    @OriginalMember(owner = "client!f", name = "Kb", descriptor = "I")
    public static int field2127;

    @OriginalMember(owner = "client!f", name = "Lb", descriptor = "I")
    public static int field2128;

    @OriginalMember(owner = "client!f", name = "Mb", descriptor = "I")
    public static int field2129;

    @OriginalMember(owner = "client!f", name = "Ob", descriptor = "I")
    public static int field2131;

    @OriginalMember(owner = "client!f", name = "Qb", descriptor = "I")
    public static int field2133;

    @OriginalMember(owner = "client!f", name = "Sb", descriptor = "I")
    public static int field2135;

    @OriginalMember(owner = "client!f", name = "Ub", descriptor = "I")
    public static int field2137;

    @OriginalMember(owner = "client!f", name = "Vb", descriptor = "I")
    public static int field2138;

    @OriginalMember(owner = "client!f", name = "bc", descriptor = "I")
    public static int field2144;

    @OriginalMember(owner = "client!f", name = "cc", descriptor = "I")
    public static int field2145;

    @OriginalMember(owner = "client!f", name = "ec", descriptor = "I")
    public static int field2147;

    @OriginalMember(owner = "client!f", name = "gc", descriptor = "I")
    private int field2149;

    @OriginalMember(owner = "client!f", name = "hc", descriptor = "I")
    public static int field2150;

    @OriginalMember(owner = "client!f", name = "ic", descriptor = "I")
    public static int field2151;

    @OriginalMember(owner = "client!f", name = "Xb", descriptor = "Llb;")
    private class297 field2140;

    @OriginalMember(owner = "client!f", name = "Jb", descriptor = "Ljava/lang/Thread;")
    public static Thread field2126;

    @OriginalMember(owner = "client!f", name = "ac", descriptor = "[I")
    public static int[] field2143;

    @OriginalMember(owner = "client!f", name = "k", descriptor = "(B)V", line = 7)
    public final void method879(byte arg0) {
        this.field4051 = (this.field2149 + 7) / 8;
        field2147++;
        if (arg0 != 27) {
            field2148 = (class258) null;
        }
    }

    @OriginalMember(owner = "client!f", name = "l", descriptor = "(B)I", line = 18)
    public final int method880(byte arg0) {
        if (arg0 >= -48) {
            return -66;
        } else {
            field2131++;
            return this.field4066[this.field4051++] - this.field2140.method2102((byte) -128) & 0xFF;
        }
    }

    @OriginalMember(owner = "client!f", name = "g", descriptor = "(IB)I", line = 34)
    public final int method881(int arg0, byte arg1) {
        if (arg1 > -87) {
            this.field2140 = (class297) null;
        }
        field2129++;
        int var3 = this.field2149 >> 3;
        int var4 = 0;
        int var5 = 8 - (this.field2149 & 0x7);
        this.field2149 += arg0;
        while (arg0 > var5) {
            var4 += (class4.field61[var5] & this.field4066[var3++]) << arg0 - var5;
            arg0 -= var5;
            var5 = 8;
        }
        int var6;
        if (arg0 == var5) {
            var6 = (this.field4066[var3] & class4.field61[var5]) + var4;
        } else {
            var6 = (this.field4066[var3] >> var5 - arg0 & class4.field61[arg0]) + var4;
        }
        return var6;
    }

    @OriginalMember(owner = "client!f", name = "s", descriptor = "(I)V", line = 64)
    public static final void method882(int arg0) {
        if (arg0 != 7) {
            field2134 = (int[]) null;
        }
        class226.field3886.method1161(arg0 ^ 0xFFFFFFC7);
        field2127++;
    }

    @OriginalMember(owner = "client!f", name = "m", descriptor = "(B)V", line = 77)
    public static final void method883(byte arg0) {
        field2138++;
        if (arg0 > 3) {
            class74.field1290 = true;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(BII[B)V", line = 91)
    public final void method884(byte arg0, int arg1, int arg2, byte[] arg3) {
        for (int var5 = 0; var5 < arg1; var5++) {
            arg3[arg2 + var5] = (byte) (this.field4066[this.field4051++] - this.field2140.method2102((byte) -128));
        }
        if (arg0 > -116) {
            this.field2149 = -10;
        }
        field2137++;
    }

    @OriginalMember(owner = "client!f", name = "h", descriptor = "(II)V", line = 120)
    public final void method885(int arg0, int arg1) {
        if (arg1 <= -57) {
            field2135++;
            this.field4066[this.field4051++] = (byte) (this.field2140.method2102((byte) -126) + arg0);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(B[I)V", line = 133)
    public final void method886(byte arg0, int[] arg1) {
        int var3 = -73 % ((-arg0 - 77) / 41);
        field2133++;
        this.field2140 = new class297(arg1);
    }

    @OriginalMember(owner = "client!f", name = "n", descriptor = "(B)V", line = 149)
    public static void method887(byte arg0) {
        field2143 = null;
        field2134 = null;
        field2130 = null;
        field2148 = null;
        field2142 = null;
        int var1 = 13 / ((arg0 + 49) / 59);
        field2146 = null;
        field2126 = null;
        field2136 = null;
    }

    @OriginalMember(owner = "client!f", name = "t", descriptor = "(I)V", line = 173)
    public final void method888(int arg0) {
        field2124++;
        this.field2149 = this.field4051 * arg0;
    }

    @OriginalMember(owner = "client!f", name = "i", descriptor = "(II)I", line = 195)
    public final int method889(int arg0, int arg1) {
        if (arg1 != -13787) {
            this.method880((byte) -87);
        }
        field2128++;
        return arg0 * 8 - this.field2149;
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "(I)V", line = 211)
    public class121(int arg0) {
        super(arg0);
    }
}
