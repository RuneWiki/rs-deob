import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class329 {

    @OriginalMember(owner = "client!km", name = "b", descriptor = "Z")
    public boolean field4088 = false;

    @OriginalMember(owner = "client!km", name = "c", descriptor = "I")
    public static int field4089;

    @OriginalMember(owner = "client!km", name = "d", descriptor = "I")
    public int field4090;

    @OriginalMember(owner = "client!km", name = "e", descriptor = "I")
    public static int field4091;

    @OriginalMember(owner = "client!km", name = "g", descriptor = "I")
    public static int field4093;

    @OriginalMember(owner = "client!km", name = "h", descriptor = "I")
    public static int field4094;

    @OriginalMember(owner = "client!km", name = "j", descriptor = "I")
    public static int field4096;

    @OriginalMember(owner = "client!km", name = "k", descriptor = "I")
    public static int field4097;

    @OriginalMember(owner = "client!km", name = "l", descriptor = "I")
    public int field4098;

    @OriginalMember(owner = "client!km", name = "m", descriptor = "I")
    public static int field4099;

    @OriginalMember(owner = "client!km", name = "f", descriptor = "Lhba;")
    public static class10 field4092;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "Laba;")
    public class164 field4087;

    @OriginalMember(owner = "client!km", name = "i", descriptor = "Lpfa;")
    public static class275 field4095;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Z)V", line = 12)
    public static void method1884(boolean arg0) {
        field4092 = null;
        if (arg0) {
            field4095 = null;
        }
        field4095 = null;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(BZLoa;I)Lxa;", line = 23)
    public final class468 method1885(byte arg0, boolean arg1, class650 arg2, int arg3) {
        field4091++;
        long var5 = (long) (this.field4098 | arg3 << 16 | (arg1 ? 262144 : 0) | arg2.field8780 << 19);
        class468 var7 = (class468) this.field4087.field1936.method1221(var5, true);
        if (var7 != null) {
            return var7;
        } else if (this.field4087.field1929.method1669((byte) -113, this.field4098)) {
            class495 var8 = class495.method2695(this.field4087.field1929, this.field4098, 0);
            if (var8 != null) {
                var8.field6194 = var8.field6190 = var8.field6188 = var8.field6192 = 0;
                if (arg1) {
                    var8.method2689();
                }
                for (int var9 = 0; var9 < arg3; var9++) {
                    var8.method2688();
                }
            }
            class468 var10 = arg2.method402(var8, true);
            if (arg0 == -53) {
                if (var10 != null) {
                    this.field4087.field1936.method1230((byte) 93, var5, var10);
                }
                return var10;
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIZ)V", line = 67)
    public static final void method1886(String arg0, String arg1, int arg2, int arg3, boolean arg4) {
        class557.method2966(-1, arg4, true, arg3, (byte) 59, arg1, arg0);
        if (arg2 == 9710) {
            field4097++;
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Lrr;Z)Lrr;", line = 79)
    public static final class337 method1887(class337 arg0, boolean arg1) {
        field4089++;
        if (arg0.field4190 != -1) {
            return class442.method2421(arg0.field4190, 90);
        }
        if (!arg1) {
            method1886(null, null, 71, -53, false);
        }
        int var2 = arg0.field4172 >>> 16;
        class182 var3 = new class182(class216.field2530);
        for (class293 var4 = (class293) var3.method1085(38); var4 != null; var4 = (class293) var3.method1082((byte) 56)) {
            if (var4.field3727 == var2) {
                return class442.method2421((int) var4.field3321, 106);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Lji;B)V", line = 108)
    public final void method1888(class572 arg0, byte arg1) {
        field4096++;
        if (arg1 <= 119) {
            method1887(null, true);
        }
        while (true) {
            int var3 = arg0.method3097((byte) 12);
            if (var3 == 0) {
                return;
            }
            this.method1889(var3, arg0, (byte) -22);
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(ILji;B)V", line = 128)
    private final void method1889(int arg0, class572 arg1, byte arg2) {
        if (arg2 != -22) {
            method1886(null, null, 70, -16, true);
        }
        field4093++;
        if (arg0 == 1) {
            this.field4098 = arg1.method3031(-1);
        } else if (arg0 == 2) {
            this.field4090 = arg1.method3059(1);
        } else if (arg0 == 3) {
            this.field4088 = true;
        } else if (arg0 == 4) {
            this.field4098 = -1;
            return;
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(B)Z", line = 157)
    public final boolean method1890(byte arg0) {
        if (arg0 != 109) {
            this.field4088 = true;
        }
        field4099++;
        return this.field4087.field1929.method1669((byte) 127, this.field4098);
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(I[BII[BIIII)V", line = 179)
    public static final void method1891(int arg0, byte[] arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg5 != 817) {
            field4092 = null;
        }
        field4094++;
        int var9 = -(arg2 >> 2);
        int var10 = -(arg2 & 0x3);
        for (int var11 = -arg7; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg0++;
                arg1[var10001] += arg4[arg8++];
                int var14 = arg0++;
                arg1[var14] += arg4[arg8++];
                int var15 = arg0++;
                arg1[var15] += arg4[arg8++];
                int var16 = arg0++;
                arg1[var16] += arg4[arg8++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg0++;
                arg1[var10001] += arg4[arg8++];
            }
            arg0 += arg3;
            arg8 += arg6;
        }
    }
}
