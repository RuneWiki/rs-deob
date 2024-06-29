import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class72 {

    @OriginalMember(owner = "client!g", name = "e", descriptor = "Lil;")
    private class4 field1104 = new class4(256);

    @OriginalMember(owner = "client!g", name = "g", descriptor = "Lil;")
    private class4 field1106 = new class4(256);

    @OriginalMember(owner = "client!g", name = "d", descriptor = "Lnm;")
    private class221 field1103;

    @OriginalMember(owner = "client!g", name = "b", descriptor = "Lnm;")
    private class221 field1101;

    @OriginalMember(owner = "client!g", name = "f", descriptor = "I")
    public static int field1105 = 0;

    @OriginalMember(owner = "client!g", name = "m", descriptor = "[Lnb;")
    public static class135[] field1112 = new class135[4];

    @OriginalMember(owner = "client!g", name = "a", descriptor = "I")
    public static int field1100;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "I")
    public static int field1102;

    @OriginalMember(owner = "client!g", name = "h", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!g", name = "j", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "client!g", name = "k", descriptor = "I")
    public static int field1110;

    @OriginalMember(owner = "client!g", name = "l", descriptor = "I")
    public static int field1111;

    @OriginalMember(owner = "client!g", name = "i", descriptor = "[Lel;")
    public static class258[] field1108;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "([III)Lpc;", line = 4)
    public final class321 method493(int[] arg0, int arg1, int arg2) {
        field1111++;
        if (this.field1101.method1503(false) == 1) {
            return this.method496((byte) 81, 0, arg0, arg2);
        }
        if (arg1 < 34) {
            this.method494((int[]) null, -114, (byte) -4, 25);
        }
        if (this.field1101.method1486(arg2, -27734) != 1) {
            throw new RuntimeException();
        }
        return this.method496((byte) 81, arg2, arg0, 0);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "([IIBI)Lpc;", line = 28)
    private final class321 method494(int[] arg0, int arg1, byte arg2, int arg3) {
        int var5 = ((arg1 & 0xC0000FFF) << 4 | arg1 >>> 12) ^ arg3;
        int var6 = var5 | arg1 << 16;
        field1110++;
        long var7 = (long) var6;
        class321 var9 = (class321) this.field1106.method29(var7, 103);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class80 var10 = class80.method542(this.field1103, arg1, arg3);
            if (var10 == null) {
                return null;
            }
            class321 var11 = var10.method543();
            this.field1106.method37(false, var11, var7);
            if (arg2 == 88) {
                if (arg0 != null) {
                    arg0[0] -= var11.field5282.length;
                }
                return var11;
            } else {
                return (class321) null;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Lnm;Lnm;)V", line = 191)
    public class72(class221 arg0, class221 arg1) {
        this.field1103 = arg0;
        this.field1101 = arg1;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIZ)I", line = 82)
    public static final int method495(int arg0, int arg1, int arg2, boolean arg3) {
        field1107++;
        int var4 = arg2 & 0x3;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return arg0;
        } else if (var4 == 2) {
            return 1023 - arg1;
        } else {
            if (!arg3) {
                method495(-89, -30, 92, false);
            }
            return 1023 - arg0;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(BI[II)Lpc;", line = 109)
    private final class321 method496(byte arg0, int arg1, int[] arg2, int arg3) {
        field1109++;
        int var5 = (arg1 << 4 & 0xFFF4 | arg1 >>> 12) ^ arg3;
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class321 var9 = (class321) this.field1106.method29(var7, arg0 ^ 0x36);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class136 var10 = (class136) this.field1104.method29(var7, 103);
            if (var10 == null) {
                var10 = class136.method936(this.field1101, arg1, arg3);
                if (var10 == null) {
                    return null;
                }
                this.field1104.method37(false, var10, var7);
            }
            class321 var11 = var10.method939(arg2);
            if (var11 == null) {
                return null;
            }
            if (arg0 != 81) {
                method495(-106, 0, 50, true);
            }
            var10.method1131(8);
            this.field1106.method37(false, var11, var7);
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(B)V", line = 152)
    public static void method497(byte arg0) {
        if (arg0 == -14) {
            field1112 = null;
            field1108 = null;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(II[I)Lpc;", line = 172)
    public final class321 method498(int arg0, int arg1, int[] arg2) {
        field1100++;
        if (this.field1103.method1503(false) == 1) {
            return this.method494(arg2, 0, (byte) 88, arg1);
        } else if (this.field1103.method1486(arg1, -27734) == 1) {
            return this.method494(arg2, arg1, (byte) 88, 0);
        } else {
            if (arg0 != 10574) {
                field1105 = -89;
            }
            throw new RuntimeException();
        }
    }
}
