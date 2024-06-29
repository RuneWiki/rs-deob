import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class250 {

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "Lck;")
    private class1 field4151 = null;

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "Lck;")
    private class1 field4154 = null;

    @OriginalMember(owner = "client!kh", name = "m", descriptor = "I")
    private int field4159 = 65000;

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "I")
    private int field4149;

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "Ldg;")
    public static class6 field4148 = new class6(5000);

    @OriginalMember(owner = "client!kh", name = "t", descriptor = "Lph;")
    private static class229 field4166 = class266.method1858(" ", 0);

    @OriginalMember(owner = "client!kh", name = "p", descriptor = "Lph;")
    public static class229 field4162 = field4166;

    @OriginalMember(owner = "client!kh", name = "r", descriptor = "Lph;")
    public static class229 field4164 = class266.method1858("null", 0);

    @OriginalMember(owner = "client!kh", name = "s", descriptor = "Lph;")
    public static class229 field4165 = class266.method1858("RuneScape wird geladen )2 bitte warten)3)3)3", 0);

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "I")
    public static int field4147;

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "I")
    public static int field4150;

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "I")
    public static int field4152;

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "I")
    public static int field4153;

    @OriginalMember(owner = "client!kh", name = "i", descriptor = "I")
    public static int field4155;

    @OriginalMember(owner = "client!kh", name = "j", descriptor = "I")
    public static int field4156;

    @OriginalMember(owner = "client!kh", name = "k", descriptor = "I")
    public static int field4157;

    @OriginalMember(owner = "client!kh", name = "q", descriptor = "I")
    public static int field4163;

    @OriginalMember(owner = "client!kh", name = "l", descriptor = "[I")
    public static int[] field4158;

    @OriginalMember(owner = "client!kh", name = "o", descriptor = "[Lka;")
    public static class293[] field4161;

    @OriginalMember(owner = "client!kh", name = "n", descriptor = "[Lcl;")
    public static class32[] field4160;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)[F", line = 12)
    public static final float[] method1751(int arg0, int arg1) {
        float var2 = class117.method879() + class117.method887();
        int var3 = class117.method881();
        field4152++;
        class178.field2934[3] = 1.0F;
        float var4 = (float) (var3 >> 16 & 0xFF) / 255.0F;
        float var5 = (float) (var3 & 0xFF) / 255.0F;
        if (arg0 != -1027097016) {
            return (float[]) null;
        }
        float var6 = (float) (var3 >> 8 & 0xFF) / 255.0F;
        float var7 = 0.58823526F;
        class178.field2934[1] = var7 * (float) (class243.method1696(arg1, 65306) >> 8) / 255.0F * var6 * var2;
        class178.field2934[2] = var5 * ((float) class243.method1696(255, arg1) / 255.0F) * var7 * var2;
        class178.field2934[0] = var2 * var4 * ((float) class243.method1696(255, arg1 >> 16) / 255.0F) * var7;
        return class178.field2934;
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(II)[B", line = 38)
    public final byte[] method1752(int arg0, int arg1) {
        field4155++;
        class1 var3 = this.field4154;
        synchronized (this.field4154) {
            try {
                Object var10000;
                if (this.field4151.method1(arg1 - 749985962) < (long) (arg0 * 6 + 6)) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                this.field4151.method4((long) (arg0 * 6), 0);
                this.field4151.method9(true, 6, class249.field4135, 0);
                int var4 = ((class249.field4135[0] & 0xFF) << 16) + (class249.field4135[2] & 0xFF) + ((class249.field4135[1] & 0xFF) << 8);
                int var5 = (class249.field4135[5] & 0xFF) + ((class249.field4135[3] & 0xFF) << 16) + (class249.field4135[4] & 0xFF << 8);
                if (var4 < 0 || var4 > this.field4159) {
                    var10000 = null;
                    return (byte[]) var10000;
                } else if (var5 <= 0 || ((long) var5) > (this.field4154.method1(112) / 520L)) {
                    var10000 = null;
                    return (byte[]) var10000;
                } else {
                    if (arg1 != 749985960) {
                        this.field4159 = 80;
                    }
                    int var6 = 0;
                    int var7 = 0;
                    byte[] var8 = new byte[var4];
                    while (var4 > var7) {
                        if (var5 == 0) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        int var9 = var4 - var7;
                        if (var9 > 512) {
                            var9 = 512;
                        }
                        this.field4154.method4((long) (var5 * 520), 0);
                        this.field4154.method9(true, var9 + 8, class249.field4135, 0);
                        int var10 = ((class249.field4135[2] & 0xFF) << 8) + (class249.field4135[3] & 0xFF);
                        int var11 = ((class249.field4135[0] & 0xFF) << 8) + (class249.field4135[1] & 0xFF);
                        int var12 = class249.field4135[7] & 0xFF;
                        int var13 = ((class249.field4135[5] & 0xFF) << 8) + (class249.field4135[4] & 0xFF << 16) + (class249.field4135[6] & 0xFF);
                        if (arg0 != var11 || var6 != var10 || this.field4149 != var12) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        if (var13 < 0 || (long) var13 > this.field4154.method1(125) / 520L) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        var5 = var13;
                        var6++;
                        for (int var14 = 0; var14 < var9; var14++) {
                            var8[var7++] = class249.field4135[var14 + 8];
                        }
                    }
                    byte[] var19 = var8;
                    return var19;
                }
            } catch (IOException var17) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)V", line = 120)
    public static final void method1753(int arg0) {
        field4147++;
        class12.field165.method1415(-18218);
        int var1 = 15 / ((arg0 + 12) / 36);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I[BII)Z", line = 141)
    public final boolean method1754(int arg0, byte[] arg1, int arg2, int arg3) {
        field4156++;
        class1 var5 = this.field4154;
        synchronized (this.field4154) {
            if (arg0 < 0 || arg0 > this.field4159) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method1758(arg0, true, arg1, (byte) 96, arg3);
            if (!var6) {
                var6 = this.method1758(arg0, false, arg1, (byte) 100, arg3);
            }
            if (arg2 != 27336) {
                method1756(126, -100, false, 24, (class209) null, (class83) null, 15, (class217) null);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(ILck;Lck;I)V", line = 456)
    public class250(int arg0, class1 arg1, class1 arg2, int arg3) {
        this.field4149 = arg0;
        this.field4151 = arg2;
        this.field4159 = arg3;
        this.field4154 = arg1;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)V", line = 171)
    public static void method1755(byte arg0) {
        field4162 = null;
        int var1 = -69 / ((22 - arg0) / 54);
        field4166 = null;
        field4160 = null;
        field4165 = null;
        field4148 = null;
        field4158 = null;
        field4161 = null;
        field4164 = null;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIZILce;Lqa;ILrd;)V", line = 191)
    public static final void method1756(int arg0, int arg1, boolean arg2, int arg3, class209 arg4, class83 arg5, int arg6, class217 arg7) {
        if (arg2) {
            return;
        }
        class332 var8 = new class332();
        var8.field5653 = arg1;
        field4163++;
        var8.field5641 = arg6 * 128;
        var8.field5663 = arg0 * 128;
        if (arg5 != null) {
            var8.field5657 = arg5.field1379;
            var8.field5645 = arg5.field1418;
            var8.field5643 = arg5.field1433 * 128;
            int var10 = arg5.field1424;
            var8.field5644 = arg5.field1399;
            var8.field5650 = arg5.field1395;
            int var11 = arg5.field1434;
            var8.field5642 = arg5;
            if (arg3 == 1 || arg3 == 3) {
                var10 = arg5.field1434;
                var11 = arg5.field1424;
            }
            var8.field5651 = (arg0 + var11) * 128;
            var8.field5649 = (arg6 + var10) * 128;
            if (arg5.field1373 != null) {
                var8.field5658 = true;
                var8.method2271(0);
            }
            if (var8.field5645 != null) {
                var8.field5656 = (int) ((double) (var8.field5657 - var8.field5650) * Math.random()) + var8.field5650;
            }
            class75.field1266.method1582(var8, 4);
        } else if (arg7 != null) {
            var8.field5655 = arg7;
            class313 var9 = arg7.field3559;
            if (var9.field5262 != null) {
                var8.field5658 = true;
                var9 = var9.method2118(0);
            }
            if (var9 != null) {
                var8.field5649 = (arg6 + var9.field5304) * 128;
                var8.field5651 = (arg0 + var9.field5304) * 128;
                var8.field5644 = class94.method701(arg7, arg2);
                var8.field5643 = var9.field5332 * 128;
            }
            class299.field4866.method1582(var8, 4);
        } else if (arg4 != null) {
            var8.field5647 = arg4;
            var8.field5651 = (arg4.method1457(0) + arg0) * 128;
            var8.field5649 = (arg4.method1457(0) + arg6) * 128;
            var8.field5644 = class301.method2021((byte) 89, arg4);
            var8.field5643 = arg4.field3447 * 128;
            class122.field2049.method710(var8, (byte) 57, arg4.field3463.method1634(arg2));
        }
    }

    @OriginalMember(owner = "client!kh", name = "toString", descriptor = "()Ljava/lang/String;", line = 278)
    public final String toString() {
        field4157++;
        return "Cache:" + this.field4149;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lph;B)V", line = 299)
    public static final void method1757(class229 arg0, byte arg1) {
        field4153++;
        class154.method1116(-1, false);
        class139.method999((byte) 75, arg0);
        if (arg1 >= -98) {
            method1757((class229) null, (byte) 104);
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IZ[BBI)Z", line = 325)
    private final boolean method1758(int arg0, boolean arg1, byte[] arg2, byte arg3, int arg4) {
        field4150++;
        class1 var6 = this.field4154;
        synchronized (this.field4154) {
            try {
                int var7;
                boolean var10000;
                if (arg1) {
                    if (this.field4151.method1(-127) < (long) (arg4 * 6 + 6)) {
                        var10000 = false;
                        return var10000;
                    }
                    this.field4151.method4((long) (arg4 * 6), 0);
                    this.field4151.method9(true, 6, class249.field4135, 0);
                    var7 = (class249.field4135[3] & 0xFF << 16) + ((class249.field4135[4] & 0xFF) << 8) + (class249.field4135[5] & 0xFF);
                    if (var7 <= 0 || (this.field4154.method1(100) / 520L) < ((long) var7)) {
                        var10000 = false;
                        return var10000;
                    }
                } else {
                    var7 = (int) ((this.field4154.method1(87) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                if (arg3 < 94) {
                    var10000 = false;
                    return var10000;
                }
                class249.field4135[3] = (byte) (var7 >> 16);
                class249.field4135[1] = (byte) (arg0 >> 8);
                class249.field4135[4] = (byte) (var7 >> 8);
                class249.field4135[5] = (byte) var7;
                class249.field4135[2] = (byte) arg0;
                int var8 = 0;
                int var9 = 0;
                class249.field4135[0] = (byte) (arg0 >> 16);
                this.field4151.method4((long) (arg4 * 6), 0);
                this.field4151.method5(class249.field4135, 0, (byte) -125, 6);
                while (true) {
                    if (arg0 > var8) {
                        label144: {
                            int var10 = 0;
                            if (arg1) {
                                this.field4154.method4((long) (var7 * 520), 0);
                                try {
                                    this.field4154.method9(true, 8, class249.field4135, 0);
                                } catch (EOFException var18) {
                                    break label144;
                                }
                                var10 = ((class249.field4135[4] & 0xFF) << 16) + (class249.field4135[5] & 0xFF << 8) + (class249.field4135[6] & 0xFF);
                                int var12 = class249.field4135[7] & 0xFF;
                                int var13 = ((class249.field4135[2] & 0xFF) << 8) + (class249.field4135[3] & 0xFF);
                                int var14 = ((class249.field4135[0] & 0xFF) << 8) + (class249.field4135[1] & 0xFF);
                                if (arg4 != var14 || var9 != var13 || this.field4149 != var12) {
                                    var10000 = false;
                                    return var10000;
                                }
                                if (var10 < 0 || (this.field4154.method1(103) / 520L) < ((long) var10)) {
                                    var10000 = false;
                                    return var10000;
                                }
                            }
                            if (var10 == 0) {
                                arg1 = false;
                                var10 = (int) ((this.field4154.method1(97) + 519L) / 520L);
                                if (var10 == 0) {
                                    var10++;
                                }
                                if (var7 == var10) {
                                    var10++;
                                }
                            }
                            class249.field4135[3] = (byte) var9;
                            class249.field4135[2] = (byte) (var9 >> 8);
                            class249.field4135[1] = (byte) arg4;
                            class249.field4135[0] = (byte) (arg4 >> 8);
                            var9++;
                            if ((arg0 - var8) <= 512) {
                                var10 = 0;
                            }
                            class249.field4135[6] = (byte) var10;
                            int var15 = arg0 - var8;
                            class249.field4135[4] = (byte) (var10 >> 16);
                            class249.field4135[5] = (byte) (var10 >> 8);
                            class249.field4135[7] = (byte) this.field4149;
                            this.field4154.method4((long) (var7 * 520), 0);
                            this.field4154.method5(class249.field4135, 0, (byte) -125, 8);
                            if (var15 > 512) {
                                var15 = 512;
                            }
                            this.field4154.method5(arg2, var8, (byte) -125, var15);
                            var7 = var10;
                            var8 += var15;
                            continue;
                        }
                    }
                    var10000 = true;
                    return var10000;
                }
            } catch (IOException var19) {
                return false;
            }
        }
    }
}
