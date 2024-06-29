import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class330 {

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "I")
    private int field4977 = 65000;

    @OriginalMember(owner = "client!ng", name = "l", descriptor = "Lhd;")
    private class56 field4981 = null;

    @OriginalMember(owner = "client!ng", name = "k", descriptor = "Lhd;")
    private class56 field4980 = null;

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "I")
    private int field4975;

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "I")
    public static int field4971 = 0;

    @OriginalMember(owner = "client!ng", name = "m", descriptor = "I")
    public static int field4982 = -1;

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "Ljava/lang/String;")
    public static String field4972 = "Examine";

    @OriginalMember(owner = "client!ng", name = "n", descriptor = "I")
    public static int field4983 = 0;

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "Ljava/lang/String;")
    public static String field4976 = "glow2:";

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "I")
    public static int field4970;

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "I")
    public static int field4973;

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "I")
    public static int field4974;

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "I")
    public static int field4978;

    @OriginalMember(owner = "client!ng", name = "j", descriptor = "I")
    public static int field4979;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IZI[BI)Z", line = 4)
    private final boolean method2302(int arg0, boolean arg1, int arg2, byte[] arg3, int arg4) {
        field4973++;
        class56 var6 = this.field4981;
        synchronized (this.field4981) {
            try {
                int var7;
                boolean var10000;
                if (arg1) {
                    if ((long) (arg0 * 6 + 6) > this.field4980.method385(-1)) {
                        var10000 = false;
                        return var10000;
                    }
                    this.field4980.method388((byte) -119, (long) (arg0 * 6));
                    this.field4980.method392(0, (byte) -75, class174.field2368, 6);
                    var7 = ((class174.field2368[4] & 0xFF) << 8) + ((class174.field2368[3] & 0xFF) << 16) + (class174.field2368[5] & 0xFF);
                    if (var7 <= 0 || (this.field4981.method385(-1) / 520L) < ((long) var7)) {
                        var10000 = false;
                        return var10000;
                    }
                } else {
                    var7 = (int) ((this.field4981.method385(-1) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class174.field2368[5] = (byte) var7;
                class174.field2368[4] = (byte) (var7 >> 8);
                class174.field2368[1] = (byte) (arg4 >> 8);
                class174.field2368[3] = (byte) (var7 >> 16);
                int var8 = 0;
                class174.field2368[2] = (byte) arg4;
                int var9 = 0;
                class174.field2368[0] = (byte) (arg4 >> 16);
                this.field4980.method388((byte) 58, (long) (arg0 * 6));
                this.field4980.method394(0, 0, 6, class174.field2368);
                while (true) {
                    if (var8 < arg4) {
                        label139: {
                            int var10 = 0;
                            if (arg1) {
                                this.field4981.method388((byte) -114, (long) (var7 * 520));
                                try {
                                    this.field4981.method392(0, (byte) -75, class174.field2368, 8);
                                } catch (EOFException var19) {
                                    break label139;
                                }
                                var10 = ((class174.field2368[5] & 0xFF) << 8) + (class174.field2368[4] & 0xFF << 16) + (class174.field2368[6] & 0xFF);
                                int var12 = (class174.field2368[0] & 0xFF << 8) + (class174.field2368[1] & 0xFF);
                                int var13 = ((class174.field2368[2] & 0xFF) << 8) + (class174.field2368[3] & 0xFF);
                                int var14 = class174.field2368[7] & 0xFF;
                                if (arg0 != var12 || var9 != var13 || this.field4975 != var14) {
                                    var10000 = false;
                                    return var10000;
                                }
                                if (var10 < 0 || this.field4981.method385(-1) / 520L < (long) var10) {
                                    var10000 = false;
                                    return var10000;
                                }
                            }
                            int var15 = arg4 - var8;
                            if (var10 == 0) {
                                arg1 = false;
                                var10 = (int) ((this.field4981.method385(-1) + 519L) / 520L);
                                if (var10 == 0) {
                                    var10++;
                                }
                                if (var7 == var10) {
                                    var10++;
                                }
                            }
                            if (var15 > 512) {
                                var15 = 512;
                            }
                            class174.field2368[0] = (byte) (arg0 >> 8);
                            class174.field2368[7] = (byte) this.field4975;
                            class174.field2368[1] = (byte) arg0;
                            class174.field2368[2] = (byte) (var9 >> 8);
                            class174.field2368[3] = (byte) var9;
                            var9++;
                            if ((arg4 - var8) <= 512) {
                                var10 = 0;
                            }
                            class174.field2368[5] = (byte) (var10 >> 8);
                            class174.field2368[6] = (byte) var10;
                            class174.field2368[4] = (byte) (var10 >> 16);
                            this.field4981.method388((byte) -109, (long) (var7 * 520));
                            var7 = var10;
                            this.field4981.method394(0, 0, 8, class174.field2368);
                            this.field4981.method394(var8, 0, var15, arg3);
                            var8 += var15;
                            continue;
                        }
                    }
                    var10000 = true;
                    return var10000;
                }
            } catch (IOException var20) {
                int var17 = 94 % ((arg2 - 77) / 38);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)[B", line = 128)
    public final byte[] method2303(int arg0, int arg1) {
        field4974++;
        class56 var3 = this.field4981;
        synchronized (this.field4981) {
            try {
                Object var10000;
                if (this.field4980.method385(-1) < ((long) (arg1 * 6 + 6))) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                this.field4980.method388((byte) -112, (long) (arg1 * 6));
                this.field4980.method392(0, (byte) -75, class174.field2368, 6);
                int var4 = (class174.field2368[5] & 0xFF) + ((class174.field2368[4] & 0xFF) << 8) + (class174.field2368[3] & 0xFF << 16);
                int var5 = ((class174.field2368[1] & 0xFF) << 8) + (class174.field2368[0] & 0xFF << 16) + (class174.field2368[2] & 0xFF);
                if (var5 < 0 || this.field4977 < var5) {
                    var10000 = null;
                    return (byte[]) var10000;
                } else if (var4 <= 0 || (long) var4 > this.field4981.method385(-1) / 520L) {
                    var10000 = null;
                    return (byte[]) var10000;
                } else {
                    int var6 = 0;
                    int var7 = arg0;
                    byte[] var8 = new byte[var5];
                    while (var7 < var5) {
                        if (var4 == 0) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        this.field4981.method388((byte) 58, (long) (var4 * 520));
                        int var9 = var5 - var7;
                        if (var9 > 512) {
                            var9 = 512;
                        }
                        this.field4981.method392(0, (byte) -75, class174.field2368, var9 + 8);
                        int var10 = (class174.field2368[2] & 0xFF << 8) + (class174.field2368[3] & 0xFF);
                        int var11 = class174.field2368[7] & 0xFF;
                        int var12 = (class174.field2368[0] & 0xFF << 8) + (class174.field2368[1] & 0xFF);
                        int var13 = (class174.field2368[4] & 0xFF << 16) + (((class174.field2368[5] & 0xFF) << 8) + (class174.field2368[6] & 0xFF));
                        if (arg1 != var12 || var6 != var10 || this.field4975 != var11) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        if (var13 < 0 || (this.field4981.method385(-1) / 520L) < ((long) var13)) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        var6++;
                        for (int var14 = 0; var14 < var9; var14++) {
                            var8[var7++] = class174.field2368[var14 + 8];
                        }
                        var4 = var13;
                    }
                    byte[] var19 = var8;
                    return var19;
                }
            } catch (IOException var17) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "toString", descriptor = "()Ljava/lang/String;", line = 206)
    public final String toString() {
        field4970++;
        return "Cache:" + this.field4975;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "([BIZI)Z", line = 224)
    public final boolean method2304(byte[] arg0, int arg1, boolean arg2, int arg3) {
        field4979++;
        class56 var5 = this.field4981;
        synchronized (this.field4981) {
            if (arg3 < 0 || arg3 > this.field4977) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method2302(arg1, arg2, -128, arg0, arg3);
            if (!var6) {
                var6 = this.method2302(arg1, false, 118, arg0, arg3);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V", line = 250)
    public static void method2305(int arg0) {
        if (arg0 != 255) {
            method2305(43);
        }
        field4972 = null;
        field4976 = null;
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(ILhd;Lhd;I)V", line = 476)
    public class330(int arg0, class56 arg1, class56 arg2, int arg3) {
        this.field4980 = arg2;
        this.field4977 = arg3;
        this.field4975 = arg0;
        this.field4981 = arg1;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIII)Z", line = 275)
    public static final boolean method2306(int arg0, int arg1, int arg2, int arg3) {
        if (!class343.method2363(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class333.field5020[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class234.field3310) {
                    if (!class143.method1030(var4, var6, var5)) {
                        return false;
                    }
                    if (!class143.method1030(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class143.method1030(var4, var7, var5)) {
                        return false;
                    }
                    if (!class143.method1030(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class143.method1030(var4, var8, var5)) {
                    return false;
                }
                if (!class143.method1030(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class113.field1539) {
                    if (!class143.method1030(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class143.method1030(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class143.method1030(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class143.method1030(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class143.method1030(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class143.method1030(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class234.field3310) {
                    if (!class143.method1030(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class143.method1030(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class143.method1030(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class143.method1030(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class143.method1030(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class143.method1030(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class113.field1539) {
                    if (!class143.method1030(var4, var6, var5)) {
                        return false;
                    }
                    if (!class143.method1030(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class143.method1030(var4, var7, var5)) {
                        return false;
                    }
                    if (!class143.method1030(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class143.method1030(var4, var8, var5)) {
                    return false;
                }
                if (!class143.method1030(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class143.method1030(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class143.method1030(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class143.method1030(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class143.method1030(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class143.method1030(var4, var8, var5);
        } else {
            return true;
        }
    }
}
