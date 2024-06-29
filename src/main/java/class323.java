import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class323 {

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "Lii;")
    private class250 field4985 = new class250(256);

    @OriginalMember(owner = "client!ed", name = "r", descriptor = "Lii;")
    private class250 field4998 = new class250(256);

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "Ljd;")
    private class95 field4981;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "Ljd;")
    private class95 field4986;

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "I")
    public static int field4990 = 0;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "[S")
    public static short[] field4983 = new short[256];

    @OriginalMember(owner = "client!ed", name = "m", descriptor = "[I")
    public static int[] field4993 = new int[500];

    @OriginalMember(owner = "client!ed", name = "s", descriptor = "Ljava/lang/String;")
    public static String field4999 = "purple:";

    @OriginalMember(owner = "client!ed", name = "p", descriptor = "Ljava/lang/String;")
    public static String field4996 = "Loading sprites - ";

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "I")
    public static int field4982;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
    public static int field4984;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
    public static int field4987;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
    public static int field4988;

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "I")
    public static int field4989;

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "I")
    public static int field4991;

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "I")
    public static int field4992;

    @OriginalMember(owner = "client!ed", name = "n", descriptor = "I")
    public static int field4994;

    @OriginalMember(owner = "client!ed", name = "o", descriptor = "I")
    public static int field4995;

    @OriginalMember(owner = "client!ed", name = "q", descriptor = "I")
    public static int field4997;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIB[I)Lid;", line = 12)
    private final class266 method2238(int arg0, int arg1, byte arg2, int[] arg3) {
        field4989++;
        int var5 = ((arg0 & 0xF0000FFF) << 4 | arg0 >>> 12) ^ arg1;
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        if (arg2 <= 126) {
            return (class266) null;
        }
        class266 var9 = (class266) this.field4998.method1716(-1, var7);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class155 var10 = (class155) this.field4985.method1716(-1, var7);
            if (var10 == null) {
                var10 = class155.method1171(this.field4981, arg0, arg1);
                if (var10 == null) {
                    return null;
                }
                this.field4985.method1708(var7, (byte) -79, var10);
            }
            class266 var11 = var10.method1169(arg3);
            if (var11 == null) {
                return null;
            } else {
                var10.method39(10717);
                this.field4998.method1708(var7, (byte) -79, var11);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "([IBI)Lid;", line = 63)
    public final class266 method2239(int[] arg0, byte arg1, int arg2) {
        field4987++;
        if (this.field4986.method687((byte) 20) == 1) {
            return this.method2245(arg2, arg0, 0, false);
        } else if (this.field4986.method685((byte) 15, arg2) == 1) {
            return this.method2245(0, arg0, arg2, false);
        } else {
            if (arg1 != -25) {
                this.method2238(-79, 41, (byte) -42, (int[]) null);
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V", line = 84)
    public static final void method2240(int arg0) {
        field4992++;
        class230.field3500.method750((byte) 107);
        if (arg0 != 0) {
            field4993 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)V", line = 101)
    public static final void method2241(int arg0) {
        int var1 = -62 / ((arg0 - 40) / 48);
        for (int var2 = 0; var2 < 100; var2++) {
            class121.field1861[var2] = true;
        }
        field4982++;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(II[I)Lid;", line = 116)
    public final class266 method2242(int arg0, int arg1, int[] arg2) {
        field4988++;
        if (this.field4981.method687((byte) 20) == 1) {
            return this.method2238(0, arg0, (byte) 127, arg2);
        } else if (this.field4981.method685((byte) 15, arg0) == 1) {
            return this.method2238(arg0, 0, (byte) 127, arg2);
        } else {
            if (arg1 >= -104) {
                field4994 = 112;
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)I", line = 150)
    public static final int method2243(int arg0, int arg1) {
        if (arg1 != 1922) {
            field4983 = (short[]) null;
        }
        field4984++;
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(II)I", line = 169)
    public static final int method2244(int arg0, int arg1) {
        field4995++;
        if (arg1 != -1) {
            field4994 = 11;
        }
        return arg0 >> 11 & 0x7F;
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Ljd;Ljd;)V", line = 240)
    public class323(class95 arg0, class95 arg1) {
        this.field4981 = arg1;
        this.field4986 = arg0;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I[IIZ)Lid;", line = 187)
    private final class266 method2245(int arg0, int[] arg1, int arg2, boolean arg3) {
        field4991++;
        if (arg3) {
            method2241(50);
        }
        int var5 = (arg2 << 4 & 0xFFFC | arg2 >>> 12) ^ arg0;
        int var6 = var5 | arg2 << 16;
        long var7 = (long) var6;
        class266 var9 = (class266) this.field4998.method1716(-1, var7);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class317 var10 = class317.method2207(this.field4986, arg2, arg0);
            if (var10 == null) {
                return null;
            }
            class266 var11 = var10.method2206();
            this.field4998.method1708(var7, (byte) -79, var11);
            if (arg1 != null) {
                arg1[0] -= var11.field4145.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)V", line = 226)
    public static void method2246(byte arg0) {
        field4983 = null;
        field4999 = null;
        field4996 = null;
        if (arg0 != -86) {
            field4993 = (int[]) null;
        }
        field4993 = null;
    }
}
