import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class674 {

    @OriginalMember(owner = "client!bl", name = "k", descriptor = "Lqj;")
    private class535 field9030 = new class535(64);

    @OriginalMember(owner = "client!bl", name = "g", descriptor = "Luq;")
    private class172 field9026;

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "J")
    public static long field9021 = 20000000L;

    @OriginalMember(owner = "client!bl", name = "h", descriptor = "Lej;")
    public static class133 field9027 = class714.method3957(4);

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "I")
    public static int field9020;

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "I")
    public static int field9022;

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "I")
    public static int field9023;

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "I")
    public static int field9024;

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "I")
    public static int field9025;

    @OriginalMember(owner = "client!bl", name = "i", descriptor = "I")
    public static int field9028;

    @OriginalMember(owner = "client!bl", name = "j", descriptor = "I")
    public static int field9029;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IB)V", line = 4)
    public final void method3715(int arg0, byte arg1) {
        class535 var3 = this.field9030;
        synchronized (this.field9030) {
            this.field9030.method3103(arg1 ^ 0xFFFFD3A7);
            this.field9030 = new class535(arg0);
            if (arg1 != 69) {
                method3718(-0.24224295F, -88, 1.090339F, -1.6466848F, -124, 0.2862625F, -2.5027804F, 2.243574F);
            }
        }
        field9020++;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)V", line = 23)
    public final void method3716(int arg0) {
        field9029++;
        if (arg0 != 1) {
            field9021 = -6L;
        }
        class535 var2 = this.field9030;
        synchronized (this.field9030) {
            this.field9030.method3113(-128);
        }
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(I)V", line = 38)
    public static void method3717(int arg0) {
        field9027 = null;
        int var1 = -31 % ((arg0 + 47) / 57);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(FIFFIFFF)F", line = 48)
    public static final float method3718(float arg0, int arg1, float arg2, float arg3, int arg4, float arg5, float arg6, float arg7) {
        field9028++;
        float var8 = 0.0F;
        float var9 = arg0 - arg7;
        float var10 = arg6 - arg5;
        float var11 = arg2 - arg3;
        float var12 = 0.0F;
        float var13 = 0.0F;
        float var14 = (float) arg4;
        while (var8 < 1.1F) {
            float var15 = var8 * var9 + arg7;
            float var16 = var8 * var10 + arg5;
            float var17 = var8 * var11 + arg3;
            int var18 = (int) var15 >> 9;
            int var19 = (int) var17 >> 9;
            if (var18 > 0 && var19 > 0 && class102.field1467 > var18 && class393.field5663 > var19) {
                int var20 = class625.field8475.field2813;
                if (var20 < 3 && (class328.field4667[1][var18][var19] & 0x2) != 0) {
                    var20++;
                }
                int var21 = class648.field8748[var20].method1895((int) var15, (int) var17, 120);
                if ((float) var21 < var16) {
                    if (arg1 < 2) {
                        return var8;
                    }
                    return method3718(var15, arg1 - 1, var17, var14, 0, var13, var16, var12) * 0.1F + (var8 - 0.1F);
                }
            }
            var8 += 0.1F;
            var12 = var15;
            var14 = var17;
            var13 = var16;
        }
        return -1.0F;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(II)Lhl;", line = 114)
    public final class554 method3719(int arg0, int arg1) {
        field9025++;
        class535 var3 = this.field9030;
        class554 var4;
        synchronized (this.field9030) {
            if (arg0 != 0) {
                field9021 = -83L;
            }
            var4 = (class554) this.field9030.method3109((byte) 106, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class172 var5 = this.field9026;
        byte[] var6;
        synchronized (this.field9026) {
            var6 = this.field9026.method1188(class103.method795(arg1, 123), -18047, class683.method3745((byte) 21, arg1));
        }
        class554 var7 = new class554();
        if (var6 != null) {
            var7.method3184((byte) -113, new class254(var6));
        }
        class535 var8 = this.field9030;
        synchronized (this.field9030) {
            this.field9030.method3108((long) arg1, arg0 ^ 0x3FD1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(III)V", line = 144)
    public static final void method3720(int arg0, int arg1, int arg2) {
        if (arg0 != 1) {
            method3717(-126);
        }
        field9023++;
        class778 var3 = class389.method2406(-91, (long) arg1 | (long) arg2 << 32, 18);
        var3.method4276(arg0 - 1);
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(II)V", line = 162)
    public final void method3721(int arg0, int arg1) {
        if (arg0 != 26735) {
            return;
        }
        field9024++;
        class535 var3 = this.field9030;
        synchronized (this.field9030) {
            this.field9030.method3101(false, arg1);
        }
    }

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "(I)V", line = 176)
    public final void method3722(int arg0) {
        field9022++;
        class535 var2 = this.field9030;
        synchronized (this.field9030) {
            this.field9030.method3103(-11294);
        }
        if (arg0 != -10196) {
            field9021 = 125L;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "()V", line = 193)
    public static final void method3723() {
        while (true) {
            boolean var0 = true;
            for (int var1 = 0; var1 < class97.field1384.length; var1++) {
                if (class97.field1384[var1].method586()) {
                    class597.field8134[var1] = class97.field1384[var1].method588();
                } else {
                    synchronized (class97.field1384[var1]) {
                        class97.field1384[var1].notify();
                    }
                    var0 = false;
                }
            }
            if (var0) {
                class97.field1384[class97.field1384.length - 1].method582();
                class525.method3046(1);
                while (true) {
                    boolean var3 = true;
                    for (int var4 = 0; var4 < class97.field1384.length - 1; var4++) {
                        if (!class97.field1384[var4].method586()) {
                            synchronized (class97.field1384[var4]) {
                                class97.field1384[var4].notify();
                            }
                            var3 = false;
                        }
                    }
                    if (var3) {
                        for (int var6 = 1; var6 < class97.field1384.length - 2; var6++) {
                            class97.field1384[var6].method582();
                        }
                        class525.method3046(2);
                        while (!class97.field1384[0].method586()) {
                            synchronized (class97.field1384[0]) {
                                class97.field1384[0].notify();
                            }
                            try {
                                class171.method1152(1L, false);
                            } catch (Exception var9) {
                            }
                        }
                        class97.field1384[0].method582();
                        return;
                    }
                    try {
                        class171.method1152(1L, false);
                    } catch (Exception var12) {
                    }
                }
            }
            try {
                class171.method1152(1L, false);
            } catch (Exception var8) {
            }
        }
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(Lkw;ILuq;)V", line = 288)
    public class674(class263 arg0, int arg1, class172 arg2) {
        this.field9026 = arg2;
        if (this.field9026 != null) {
            int var4 = this.field9026.method1193(true) - 1;
            this.field9026.method1175(var4, (byte) 122);
        }
    }
}
