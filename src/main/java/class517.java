import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pu")
public class class517 {

    @OriginalMember(owner = "client!pu", name = "e", descriptor = "I")
    public int field7057;

    @OriginalMember(owner = "client!pu", name = "c", descriptor = "Z")
    public boolean field7055;

    @OriginalMember(owner = "client!pu", name = "i", descriptor = "Z")
    public boolean field7061;

    @OriginalMember(owner = "client!pu", name = "k", descriptor = "[S")
    public short[] field7063;

    @OriginalMember(owner = "client!pu", name = "l", descriptor = "I")
    public int field7064;

    @OriginalMember(owner = "client!pu", name = "r", descriptor = "I")
    private int field7070;

    @OriginalMember(owner = "client!pu", name = "q", descriptor = "Lcc;")
    public static class670 field7069 = new class670("WTI", 5);

    @OriginalMember(owner = "client!pu", name = "t", descriptor = "I")
    public static int field7072 = 0;

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "I")
    private int field7054;

    @OriginalMember(owner = "client!pu", name = "d", descriptor = "I")
    public static int field7056;

    @OriginalMember(owner = "client!pu", name = "f", descriptor = "I")
    public static int field7058;

    @OriginalMember(owner = "client!pu", name = "g", descriptor = "I")
    private int field7059;

    @OriginalMember(owner = "client!pu", name = "h", descriptor = "I")
    public static int field7060;

    @OriginalMember(owner = "client!pu", name = "j", descriptor = "I")
    private int field7062;

    @OriginalMember(owner = "client!pu", name = "n", descriptor = "I")
    public static int field7066;

    @OriginalMember(owner = "client!pu", name = "o", descriptor = "I")
    public static int field7067;

    @OriginalMember(owner = "client!pu", name = "p", descriptor = "I")
    public static int field7068;

    @OriginalMember(owner = "client!pu", name = "s", descriptor = "I")
    private int field7071;

    @OriginalMember(owner = "client!pu", name = "m", descriptor = "Lpj;")
    public static class132 field7065;

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "Lld;")
    public class154 field7053;

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(IBIII)V")
    public final void method2873(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field7060++;
        this.field7054 = arg2;
        if (arg1 >= 8) {
            this.field7059 = arg0;
            this.field7062 = arg4;
            this.field7071 = arg3;
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(IIIILoa;II)V")
    private final void method2874(int arg0, int arg1, int arg2, int arg3, class638 arg4, int arg5, int arg6) {
        if (arg5 != 2048) {
            this.method2875(true, (byte) -61, -63);
        }
        this.field7053 = arg4.method457(arg3, arg0, arg6, arg1, arg2, 1.0F);
        field7067++;
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(ZBI)V")
    public final void method2875(boolean arg0, byte arg1, int arg2) {
        field7056++;
        if (arg1 != 110) {
            return;
        }
        int var4;
        if (arg0) {
            var4 = 2048;
        } else {
            int var5 = this.field7070 + (this.field7071 * arg2 / 50) & 0x7FF;
            int var6 = this.field7062;
            if (var6 == 1) {
                var4 = (class675.field9542[var5 << 3] >> 4) + 1024;
            } else if (var6 == 3) {
                var4 = class104.field1406[var5] >> 1;
            } else if (var6 == 4) {
                var4 = var5 >> 10 << 11;
            } else if (var6 == 2) {
                var4 = var5;
            } else if (var6 == 5) {
                var4 = (var5 >= 1024 ? 2048 - var5 : var5) << 1;
            } else {
                var4 = 2048;
            }
        }
        this.field7053.method1082((float) ((this.field7059 * var4 >> 11) + this.field7054) / 2048.0F, (byte) 87);
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(III[BIII)Z")
    public static final boolean method2876(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6) {
        field7068++;
        int var7 = arg5 % arg1;
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg1 - var7;
        }
        int var9 = -((arg0 + arg1 - 1) / arg1);
        int var10 = -((arg5 + arg1 - 1) / arg1);
        if (arg4 != 0) {
            method2879(false);
        }
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg3[arg6] == 0) {
                    return true;
                }
                arg6 += arg1;
            }
            int var13 = arg6 - var8;
            if (arg3[var13 - 1] == 0) {
                return true;
            }
            arg6 = arg2 + var13;
        }
        return false;
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(I)V")
    public static final void method2877(int arg0) {
        class181.field2675 = null;
        if (arg0 != -2127751325) {
            field7069 = null;
        }
        field7066++;
        class168.field2538 = null;
        class302.field4470 = null;
        class208.field3076 = null;
        class427.field6006 = null;
        class232.field3300 = null;
        class206.field3038 = null;
        class535.field7289 = null;
        class491.field6788 = null;
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(B)V")
    private final void method2878(byte arg0) {
        int var2 = this.field7064;
        if (var2 == 2) {
            this.field7059 = 2048;
            this.field7054 = 0;
            this.field7071 = 2048;
            this.field7062 = 1;
        } else if (var2 == 3) {
            this.field7062 = 1;
            this.field7059 = 2048;
            this.field7054 = 0;
            this.field7071 = 4096;
        } else if (var2 == 4) {
            this.field7071 = 2048;
            this.field7059 = 2048;
            this.field7062 = 4;
            this.field7054 = 0;
        } else if (var2 == 5) {
            this.field7059 = 2048;
            this.field7054 = 0;
            this.field7062 = 4;
            this.field7071 = 8192;
        } else if (var2 == 12) {
            this.field7059 = 2048;
            this.field7071 = 2048;
            this.field7062 = 2;
            this.field7054 = 0;
        } else if (var2 == 13) {
            this.field7054 = 0;
            this.field7071 = 8192;
            this.field7059 = 2048;
            this.field7062 = 2;
        } else if (var2 == 10) {
            this.field7062 = 3;
            this.field7071 = 2048;
            this.field7059 = 512;
            this.field7054 = 1536;
        } else if (var2 == 11) {
            this.field7054 = 1536;
            this.field7071 = 4096;
            this.field7059 = 512;
            this.field7062 = 3;
        } else if (var2 == 6) {
            this.field7071 = 2048;
            this.field7062 = 3;
            this.field7054 = 1280;
            this.field7059 = 768;
        } else if (var2 == 7) {
            this.field7054 = 1280;
            this.field7059 = 768;
            this.field7071 = 4096;
            this.field7062 = 3;
        } else if (var2 == 8) {
            this.field7054 = 1024;
            this.field7071 = 2048;
            this.field7059 = 1024;
            this.field7062 = 3;
        } else if (var2 == 9) {
            this.field7071 = 4096;
            this.field7054 = 1024;
            this.field7059 = 1024;
            this.field7062 = 3;
        } else if (var2 == 14) {
            this.field7062 = 1;
            this.field7054 = 1280;
            this.field7071 = 2048;
            this.field7059 = 768;
        } else if (var2 == 15) {
            this.field7062 = 1;
            this.field7054 = 1536;
            this.field7059 = 512;
            this.field7071 = 4096;
        } else if (var2 == 16) {
            this.field7059 = 256;
            this.field7054 = 1792;
            this.field7071 = 8192;
            this.field7062 = 1;
        } else {
            this.field7071 = 2048;
            this.field7054 = 0;
            this.field7062 = 0;
            this.field7059 = 2048;
        }
        int var3 = -26 / ((-arg0 - 70) / 43);
        field7058++;
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(Z)V")
    public static void method2879(boolean arg0) {
        if (arg0) {
            field7069 = null;
            field7065 = null;
        }
    }

    @OriginalMember(owner = "client!pu", name = "<init>", descriptor = "()V")
    protected class517() {
        if (class104.field1406 == null) {
            class402.method2293(-122);
        }
        this.method2878((byte) -128);
    }

    @OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(Loa;Ljr;I)V")
    public class517(class638 arg0, class96 arg1, int arg2) {
        if (class104.field1406 == null) {
            class402.method2293(-128);
        }
        this.field7057 = arg1.method718(93);
        this.field7055 = (this.field7057 & 0x10) != 0;
        this.field7061 = (this.field7057 & 0x8) != 0;
        this.field7057 &= 0x7;
        int var4 = arg1.method743((byte) -5) << arg2;
        int var5 = arg1.method743((byte) -53) << arg2;
        int var6 = arg1.method743((byte) -27) << arg2;
        int var7 = arg1.method718(104);
        int var8 = var7 * 2 + 1;
        this.field7063 = new short[var8];
        for (int var9 = 0; var9 < this.field7063.length; var9++) {
            short var13 = (short) arg1.method743((byte) -52);
            int var14 = var13 >>> 8;
            if (var14 >= var8) {
                var14 = var8 - 1;
            }
            int var15 = var13 & 0xFF;
            if (var8 - var14 < var15) {
                var15 = var8 - var14;
            }
            this.field7063[var9] = (short) class266.method1624(var15, var14 << 8);
        }
        int var10 = (var7 << class627.field8753) + class634.field8905;
        int var11 = class35.field433 == null ? class145.field2153[class99.method766(32217, arg1.method743((byte) -51)) & 0xFFFF] : class35.field433[arg1.method743((byte) -115)];
        int var12 = arg1.method718(112);
        this.field7064 = var12 & 0x1F;
        this.field7070 = var12 & 0xE0 << 3;
        if (this.field7064 != 31) {
            this.method2878((byte) -127);
        }
        this.method2874(var6, var10, var11, var4, arg0, 2048, var5);
    }
}
