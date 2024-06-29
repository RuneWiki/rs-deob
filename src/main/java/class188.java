import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class188 extends class89 {

    @OriginalMember(owner = "client!ol", name = "z", descriptor = "Lkg;")
    public static class179 field2459 = new class179(52, 3);

    @OriginalMember(owner = "client!ol", name = "q", descriptor = "I")
    public static int field2450;

    @OriginalMember(owner = "client!ol", name = "u", descriptor = "I")
    public static int field2454;

    @OriginalMember(owner = "client!ol", name = "v", descriptor = "I")
    public static int field2455;

    @OriginalMember(owner = "client!ol", name = "w", descriptor = "I")
    public static int field2456;

    @OriginalMember(owner = "client!ol", name = "y", descriptor = "I")
    public static int field2458;

    @OriginalMember(owner = "client!ol", name = "x", descriptor = "Ljava/lang/String;")
    public String field2457;

    @OriginalMember(owner = "client!ol", name = "r", descriptor = "[C")
    public char[] field2451;

    @OriginalMember(owner = "client!ol", name = "t", descriptor = "[C")
    public char[] field2453;

    @OriginalMember(owner = "client!ol", name = "s", descriptor = "[I")
    public int[] field2452;

    @OriginalMember(owner = "client!ol", name = "A", descriptor = "[I")
    public int[] field2460;

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "(Z)V")
    public static void method1174(boolean arg0) {
        field2459 = null;
        if (!arg0) {
            method1174(false);
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(ILfh;)V")
    public final void method1175(int arg0, class463 arg1) {
        if (arg0 != -2014) {
            this.field2457 = null;
        }
        while (true) {
            int var3 = arg1.method2737(false);
            if (var3 == 0) {
                field2454++;
                return;
            }
            this.method1178(arg1, var3, (byte) 97);
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(CI)I")
    public final int method1176(char arg0, int arg1) {
        field2455++;
        if (this.field2452 == null) {
            return -1;
        } else if (arg1 < 73) {
            return -128;
        } else {
            for (int var3 = 0; var3 < this.field2452.length; var3++) {
                if (this.field2453[var3] == arg0) {
                    return this.field2452[var3];
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)V")
    public final void method1177(int arg0) {
        field2458++;
        int var2 = 32 / ((-arg0 - 45) / 43);
        if (this.field2452 != null) {
            for (int var3 = 0; var3 < this.field2452.length; var3++) {
                this.field2452[var3] = class215.method1323(this.field2452[var3], 32768);
            }
        }
        if (this.field2460 != null) {
            for (int var4 = 0; var4 < this.field2460.length; var4++) {
                this.field2460[var4] = class215.method1323(this.field2460[var4], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lfh;IB)V")
    private final void method1178(class463 arg0, int arg1, byte arg2) {
        if (arg1 == 1) {
            this.field2457 = arg0.method2768((byte) 102);
        } else if (arg1 == 2) {
            int var7 = arg0.method2737(false);
            this.field2451 = new char[var7];
            this.field2460 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2460[var8] = arg0.method2758((byte) 120);
                byte var9 = arg0.method2793(32767);
                this.field2451[var8] = var9 == 0 ? 0 : class511.method3054(var9, true);
            }
        } else if (arg1 == 3) {
            int var4 = arg0.method2737(false);
            this.field2453 = new char[var4];
            this.field2452 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2452[var5] = arg0.method2758((byte) 117);
                byte var6 = arg0.method2793(arg2 ^ 0x7F9E);
                this.field2453[var5] = var6 == 0 ? 0 : class511.method3054(var6, true);
            }
        }
        if (arg2 != 97) {
            this.method1175(82, null);
        }
        field2456++;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(CB)I")
    public final int method1179(char arg0, byte arg1) {
        field2450++;
        if (this.field2460 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field2460.length; var3++) {
            if (this.field2451[var3] == arg0) {
                return this.field2460[var3];
            }
        }
        int var4 = -50 / ((52 - arg1) / 55);
        return -1;
    }
}
