import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class283 {

    @OriginalMember(owner = "client!og", name = "a", descriptor = "Lli;")
    private class182 field4276 = null;

    @OriginalMember(owner = "client!og", name = "n", descriptor = "Lli;")
    private class182 field4289 = null;

    @OriginalMember(owner = "client!og", name = "l", descriptor = "I")
    private int field4287 = 65000;

    @OriginalMember(owner = "client!og", name = "h", descriptor = "I")
    private int field4283;

    @OriginalMember(owner = "client!og", name = "f", descriptor = "I")
    public static int field4281 = 0;

    @OriginalMember(owner = "client!og", name = "g", descriptor = "I")
    public static int field4282 = 0;

    @OriginalMember(owner = "client!og", name = "b", descriptor = "Z")
    public static boolean field4277 = false;

    @OriginalMember(owner = "client!og", name = "m", descriptor = "I")
    public static int field4288 = 0;

    @OriginalMember(owner = "client!og", name = "c", descriptor = "I")
    public static int field4278;

    @OriginalMember(owner = "client!og", name = "d", descriptor = "I")
    public static int field4279;

    @OriginalMember(owner = "client!og", name = "e", descriptor = "I")
    public static int field4280;

    @OriginalMember(owner = "client!og", name = "i", descriptor = "I")
    public static int field4284;

    @OriginalMember(owner = "client!og", name = "j", descriptor = "I")
    public static int field4285;

    @OriginalMember(owner = "client!og", name = "o", descriptor = "I")
    public static int field4290;

    @OriginalMember(owner = "client!og", name = "k", descriptor = "Ljava/lang/String;")
    public static String field4286;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(BI)[B", line = 5)
    public final byte[] method1972(byte arg0, int arg1) {
        field4290++;
        class182 var3 = this.field4289;
        synchronized (this.field4289) {
            try {
                Object var10000;
                if ((long) (arg1 * 6 + 6) > this.field4276.method1257(true)) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                if (arg0 != -43) {
                    field4286 = (String) null;
                }
                this.field4276.method1266((byte) 32, (long) (arg1 * 6));
                this.field4276.method1264(class279.field4240, 0, 6, -2624);
                int var4 = ((class279.field4240[3] & 0xFF) << 16) + ((class279.field4240[4] & 0xFF) << 8) + (class279.field4240[5] & 0xFF);
                int var5 = (class279.field4240[2] & 0xFF) + ((class279.field4240[1] & 0xFF) << 8) + (class279.field4240[0] & 0xFF << 16);
                if (var5 < 0 || var5 > this.field4287) {
                    var10000 = null;
                    return (byte[]) var10000;
                } else if (var4 > 0 && (long) var4 <= this.field4289.method1257(true) / 520L) {
                    byte[] var6 = new byte[var5];
                    int var7 = 0;
                    int var8 = 0;
                    while (var5 > var7) {
                        if (var4 == 0) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        int var9 = var5 - var7;
                        this.field4289.method1266((byte) 32, (long) (var4 * 520));
                        if (var9 > 512) {
                            var9 = 512;
                        }
                        this.field4289.method1264(class279.field4240, 0, var9 + 8, -2624);
                        int var10 = (class279.field4240[0] & 0xFF << 8) + (class279.field4240[1] & 0xFF);
                        int var11 = (class279.field4240[2] & 0xFF << 8) + (class279.field4240[3] & 0xFF);
                        int var12 = ((class279.field4240[4] & 0xFF) << 16) + (class279.field4240[6] & 0xFF) + ((class279.field4240[5] & 0xFF) << 8);
                        int var13 = class279.field4240[7] & 0xFF;
                        if (arg1 != var10 || var8 != var11 || this.field4283 != var13) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        if (var12 < 0 || (long) var12 > this.field4289.method1257(true) / 520L) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        var4 = var12;
                        var8++;
                        for (int var14 = 0; var14 < var9; var14++) {
                            var6[var7++] = class279.field4240[var14 + 8];
                        }
                    }
                    byte[] var19 = var6;
                    return var19;
                } else {
                    var10000 = null;
                    return (byte[]) var10000;
                }
            } catch (IOException var17) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "toString", descriptor = "()Ljava/lang/String;", line = 84)
    public final String toString() {
        field4278++;
        return "Cache:" + this.field4283;
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "(ILli;Lli;I)V", line = 397)
    public class283(int arg0, class182 arg1, class182 arg2, int arg3) {
        this.field4287 = arg3;
        this.field4283 = arg0;
        this.field4276 = arg2;
        this.field4289 = arg1;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ZI[BIB)Z", line = 103)
    private final boolean method1973(boolean arg0, int arg1, byte[] arg2, int arg3, byte arg4) {
        field4280++;
        class182 var6 = this.field4289;
        synchronized (this.field4289) {
            try {
                int var7;
                boolean var10000;
                if (arg0) {
                    if ((long) (arg1 * 6 + 6) > this.field4276.method1257(true)) {
                        var10000 = false;
                        return var10000;
                    }
                    this.field4276.method1266((byte) 32, (long) (arg1 * 6));
                    this.field4276.method1264(class279.field4240, 0, 6, arg4 - 2592);
                    var7 = (class279.field4240[5] & 0xFF) + (((class279.field4240[3] & 0xFF) << 16) + (class279.field4240[4] & 0xFF << 8));
                    if (var7 <= 0 || this.field4289.method1257(true) / 520L < (long) var7) {
                        var10000 = false;
                        return var10000;
                    }
                } else {
                    var7 = (int) ((this.field4289.method1257(true) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class279.field4240[1] = (byte) (arg3 >> 8);
                class279.field4240[2] = (byte) arg3;
                if (arg4 != -32) {
                    this.method1972((byte) -6, -88);
                }
                class279.field4240[5] = (byte) var7;
                class279.field4240[4] = (byte) (var7 >> 8);
                int var8 = 0;
                int var9 = 0;
                class279.field4240[3] = (byte) (var7 >> 16);
                class279.field4240[0] = (byte) (arg3 >> 16);
                this.field4276.method1266((byte) 32, (long) (arg1 * 6));
                this.field4276.method1256(6, 0, class279.field4240, 0);
                while (true) {
                    if (var8 < arg3) {
                        label141: {
                            int var10 = 0;
                            if (arg0) {
                                this.field4289.method1266((byte) 32, (long) (var7 * 520));
                                try {
                                    this.field4289.method1264(class279.field4240, 0, 8, -2624);
                                } catch (EOFException var18) {
                                    break label141;
                                }
                                var10 = ((class279.field4240[4] & 0xFF) << 16) - (-(class279.field4240[5] & 0xFF << 8) - (class279.field4240[6] & 0xFF));
                                int var12 = ((class279.field4240[0] & 0xFF) << 8) + (class279.field4240[1] & 0xFF);
                                int var13 = (class279.field4240[2] & 0xFF << 8) + (class279.field4240[3] & 0xFF);
                                int var14 = class279.field4240[7] & 0xFF;
                                if (arg1 != var12 || var9 != var13 || this.field4283 != var14) {
                                    var10000 = false;
                                    return var10000;
                                }
                                if (var10 < 0 || (this.field4289.method1257(true) / 520L) < ((long) var10)) {
                                    var10000 = false;
                                    return var10000;
                                }
                            }
                            if (var10 == 0) {
                                var10 = (int) ((this.field4289.method1257(true) + 519L) / 520L);
                                if (var10 == 0) {
                                    var10++;
                                }
                                arg0 = false;
                                if (var7 == var10) {
                                    var10++;
                                }
                            }
                            class279.field4240[7] = (byte) this.field4283;
                            class279.field4240[2] = (byte) (var9 >> 8);
                            if (arg3 - var8 <= 512) {
                                var10 = 0;
                            }
                            class279.field4240[0] = (byte) (arg1 >> 8);
                            int var15 = arg3 - var8;
                            class279.field4240[1] = (byte) arg1;
                            class279.field4240[6] = (byte) var10;
                            class279.field4240[4] = (byte) (var10 >> 16);
                            class279.field4240[3] = (byte) var9;
                            var9++;
                            if (var15 > 512) {
                                var15 = 512;
                            }
                            class279.field4240[5] = (byte) (var10 >> 8);
                            this.field4289.method1266((byte) 32, (long) (var7 * 520));
                            this.field4289.method1256(8, 0, class279.field4240, 0);
                            var7 = var10;
                            this.field4289.method1256(var15, var8, arg2, 0);
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

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V", line = 235)
    public static void method1974(int arg0) {
        field4286 = null;
        if (arg0 <= 83) {
            field4286 = (String) null;
        }
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(I)[Lnk;", line = 251)
    public static final class314[] method1975(int arg0) {
        int var1 = 94 / ((arg0 - 50) / 58);
        field4279++;
        if (class329.field4936 == null) {
            class314[] var2 = class271.method1912(class274.field4200, 6099);
            class314[] var3 = new class314[var2.length];
            int var4 = 0;
            label51: for (int var5 = 0; var5 < var2.length; var5++) {
                class314 var6 = var2[var5];
                if ((var6.field4753 <= 0 || var6.field4753 >= 24) && var6.field4751 >= 800 && var6.field4752 >= 600) {
                    for (int var7 = 0; var7 < var4; var7++) {
                        class314 var8 = var3[var7];
                        if (var6.field4751 == var8.field4751 && var6.field4752 == var8.field4752) {
                            if (var8.field4753 < var6.field4753) {
                                var3[var7] = var6;
                            }
                            continue label51;
                        }
                    }
                    var3[var4] = var6;
                    var4++;
                }
            }
            class329.field4936 = new class314[var4];
            class85.method593(var3, 0, class329.field4936, 0, var4);
            int[] var9 = new int[class329.field4936.length];
            for (int var10 = 0; var10 < class329.field4936.length; var10++) {
                class314 var11 = class329.field4936[var10];
                var9[var10] = var11.field4752 * var11.field4751;
            }
            class261.method1762(var9, class329.field4936, -1);
        }
        return class329.field4936;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(II)V", line = 328)
    public static final void method1976(int arg0, int arg1) {
        if (arg1 != -441) {
            method1975(90);
        }
        if (arg0 == -1 && !class146.field2205) {
            class169.method1174(-55);
        } else if (arg0 != -1 && (class195.field2943 != arg0 || !class43.method283(2)) && class115.field1760 != 0 && !class146.field2205) {
            class291.method2038(false, class115.field1760, 0, class48.field613, 2, arg0, arg1 ^ 0x65B5);
        }
        class195.field2943 = arg0;
        field4285++;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IBI[B)Z", line = 350)
    public final boolean method1977(int arg0, byte arg1, int arg2, byte[] arg3) {
        field4284++;
        class182 var5 = this.field4289;
        synchronized (this.field4289) {
            if (arg0 < 0 || arg0 > this.field4287) {
                throw new IllegalArgumentException();
            }
            int var6 = 79 % ((60 - arg1) / 51);
            boolean var7 = this.method1973(true, arg2, arg3, arg0, (byte) -32);
            if (!var7) {
                var7 = this.method1973(false, arg2, arg3, arg0, (byte) -32);
            }
            return var7;
        }
    }
}
