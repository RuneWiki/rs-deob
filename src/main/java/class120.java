import java.awt.Frame;
import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class120 {

    @OriginalMember(owner = "client!da", name = "l", descriptor = "Ljl;")
    private class262 field2165 = null;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "I")
    private int field2161 = 65000;

    @OriginalMember(owner = "client!da", name = "o", descriptor = "Ljl;")
    private class262 field2168 = null;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "I")
    private int field2164;

    @OriginalMember(owner = "client!da", name = "n", descriptor = "Lud;")
    public static class279 field2167 = class130.method1024("::fpson", 255);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "I")
    public static int field2154;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "I")
    public static int field2157;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "I")
    public static int field2158;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "I")
    public static int field2160;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "I")
    public static int field2162;

    @OriginalMember(owner = "client!da", name = "m", descriptor = "I")
    public static int field2166;

    @OriginalMember(owner = "client!da", name = "j", descriptor = "Lth;")
    public static class86 field2163;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "Ljava/awt/Frame;")
    public static Frame field2159;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "[Lom;")
    public static class70[] field2156;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BI)V", line = 8)
    public static final void method950(byte arg0, int arg1) {
        class298.field5284 = -1;
        field2155++;
        if (arg0 > -103) {
            field2163 = (class86) null;
        }
        if (arg1 == 37) {
            class183.field3356 = 3.0F;
        } else if (arg1 == 50) {
            class183.field3356 = 4.0F;
        } else if (arg1 == 75) {
            class183.field3356 = 6.0F;
        } else if (arg1 == 100) {
            class183.field3356 = 8.0F;
        } else if (arg1 == 200) {
            class183.field3356 = 16.0F;
        }
        class298.field5284 = -1;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I[BII)Z", line = 46)
    public final boolean method951(int arg0, byte[] arg1, int arg2, int arg3) {
        field2162++;
        if (arg0 != 24947) {
            this.method952(41, -114, (byte[]) null, true, (byte) -70);
        }
        class262 var5 = this.field2168;
        synchronized (this.field2168) {
            if (arg2 < 0 || arg2 > this.field2161) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method952(arg3, arg2, arg1, true, (byte) -125);
            if (!var6) {
                var6 = this.method952(arg3, arg2, arg1, false, (byte) -115);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II[BZB)Z", line = 72)
    private final boolean method952(int arg0, int arg1, byte[] arg2, boolean arg3, byte arg4) {
        field2166++;
        class262 var6 = this.field2168;
        synchronized (this.field2168) {
            try {
                int var7;
                boolean var10000;
                if (arg3) {
                    if (this.field2165.method1875(-4955) < ((long) (arg0 * 6 + 6))) {
                        var10000 = false;
                        return var10000;
                    }
                    this.field2165.method1874(true, (long) (arg0 * 6));
                    this.field2165.method1879(0, class144.field2605, 6, false);
                    var7 = (class144.field2605[5] & 0xFF) + ((class144.field2605[4] & 0xFF) << 8) + ((class144.field2605[3] & 0xFF) << 16);
                    if (var7 <= 0 || (long) var7 > this.field2168.method1875(-4955) / 520L) {
                        var10000 = false;
                        return var10000;
                    }
                } else {
                    var7 = (int) ((this.field2168.method1875(-4955) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class144.field2605[4] = (byte) (var7 >> 8);
                class144.field2605[3] = (byte) (var7 >> 16);
                class144.field2605[5] = (byte) var7;
                class144.field2605[0] = (byte) (arg1 >> 16);
                int var8 = 0;
                if (arg4 > -96) {
                    method950((byte) -39, -119);
                }
                class144.field2605[1] = (byte) (arg1 >> 8);
                int var9 = 0;
                class144.field2605[2] = (byte) arg1;
                this.field2165.method1874(true, (long) (arg0 * 6));
                this.field2165.method1883(class144.field2605, 0, 6, true);
                while (true) {
                    if (arg1 > var8) {
                        label140: {
                            int var10 = 0;
                            if (arg3) {
                                this.field2168.method1874(true, (long) (var7 * 520));
                                try {
                                    this.field2168.method1879(0, class144.field2605, 8, false);
                                } catch (EOFException var18) {
                                    break label140;
                                }
                                int var12 = ((class144.field2605[0] & 0xFF) << 8) + (class144.field2605[1] & 0xFF);
                                var10 = (class144.field2605[4] & 0xFF << 16) + (class144.field2605[5] & 0xFF << 8) + (class144.field2605[6] & 0xFF);
                                int var13 = (class144.field2605[2] & 0xFF << 8) + (class144.field2605[3] & 0xFF);
                                int var14 = class144.field2605[7] & 0xFF;
                                if (arg0 != var12 || var9 != var13 || this.field2164 != var14) {
                                    var10000 = false;
                                    return var10000;
                                }
                                if (var10 < 0 || (long) var10 > this.field2168.method1875(-4955) / 520L) {
                                    var10000 = false;
                                    return var10000;
                                }
                            }
                            if (var10 == 0) {
                                arg3 = false;
                                var10 = (int) ((this.field2168.method1875(-4955) + 519L) / 520L);
                                if (var10 == 0) {
                                    var10++;
                                }
                                if (var7 == var10) {
                                    var10++;
                                }
                            }
                            class144.field2605[3] = (byte) var9;
                            class144.field2605[2] = (byte) (var9 >> 8);
                            class144.field2605[0] = (byte) (arg0 >> 8);
                            int var15 = arg1 - var8;
                            class144.field2605[7] = (byte) this.field2164;
                            if (var15 > 512) {
                                var15 = 512;
                            }
                            if (arg1 - var8 <= 512) {
                                var10 = 0;
                            }
                            var9++;
                            class144.field2605[4] = (byte) (var10 >> 16);
                            class144.field2605[1] = (byte) arg0;
                            class144.field2605[5] = (byte) (var10 >> 8);
                            class144.field2605[6] = (byte) var10;
                            this.field2168.method1874(true, (long) (var7 * 520));
                            this.field2168.method1883(class144.field2605, 0, 8, true);
                            this.field2168.method1883(arg2, var8, var15, true);
                            var8 += var15;
                            var7 = var10;
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

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II)[B", line = 193)
    public final byte[] method953(int arg0, int arg1) {
        field2160++;
        class262 var3 = this.field2168;
        synchronized (this.field2168) {
            try {
                Object var10000;
                if (this.field2165.method1875(-4955) < ((long) (arg1 * 6 + 6))) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                this.field2165.method1874(true, (long) (arg1 * 6));
                this.field2165.method1879(0, class144.field2605, 6, false);
                int var4 = ((class144.field2605[4] & 0xFF) << 8) + (class144.field2605[3] & 0xFF << 16) + (class144.field2605[5] & 0xFF);
                int var5 = (class144.field2605[2] & 0xFF) + ((class144.field2605[1] & 0xFF) << 8) + (class144.field2605[0] & 0xFF << 16);
                int var6 = 19 % ((arg0 + 82) / 34);
                if (var5 < 0 || this.field2161 < var5) {
                    var10000 = null;
                    return (byte[]) var10000;
                } else if (var4 > 0 && (this.field2168.method1875(-4955) / 520L) >= ((long) var4)) {
                    int var7 = 0;
                    int var8 = 0;
                    byte[] var9 = new byte[var5];
                    while (var5 > var8) {
                        if (var4 == 0) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        int var10 = var5 - var8;
                        this.field2168.method1874(true, (long) (var4 * 520));
                        if (var10 > 512) {
                            var10 = 512;
                        }
                        this.field2168.method1879(0, class144.field2605, var10 + 8, false);
                        int var11 = class144.field2605[7] & 0xFF;
                        int var12 = ((class144.field2605[5] & 0xFF) << 8) + ((class144.field2605[4] & 0xFF) << 16) + (class144.field2605[6] & 0xFF);
                        int var13 = ((class144.field2605[2] & 0xFF) << 8) + (class144.field2605[3] & 0xFF);
                        int var14 = (class144.field2605[0] & 0xFF << 8) + (class144.field2605[1] & 0xFF);
                        if (arg1 != var14 || var7 != var13 || this.field2164 != var11) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        if (var12 < 0 || ((long) var12) > (this.field2168.method1875(-4955) / 520L)) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        var7++;
                        var4 = var12;
                        for (int var15 = 0; var15 < var10; var15++) {
                            var9[var8++] = class144.field2605[var15 + 8];
                        }
                    }
                    byte[] var20 = var9;
                    return var20;
                } else {
                    var10000 = null;
                    return (byte[]) var10000;
                }
            } catch (IOException var18) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lvh;B)V", line = 273)
    public static final void method954(class53 arg0, byte arg1) {
        int var2 = -33 % ((10 - arg1) / 42);
        field2154++;
        while (true) {
            while (arg0.field1168.length > arg0.field1142) {
                boolean var3 = false;
                int var4 = 0;
                int var5 = 0;
                if (arg0.method483(-128) == 1) {
                    var5 = arg0.method483(-104);
                    var3 = true;
                    var4 = arg0.method483(-103);
                }
                int var6 = arg0.method483(-110);
                int var7 = arg0.method483(-123);
                int var8 = var6 * 64 - class245.field4356;
                int var9 = class166.field3007 - (var7 * 64) - (1 - class34.field777);
                if (var8 >= 0 && (var9 - 63) >= 0 && (var8 + 63) < class121.field2180 && class166.field3007 > var9) {
                    int var10 = var9 >> 6;
                    int var11 = var8 >> 6;
                    for (int var12 = 0; var12 < 64; var12++) {
                        for (int var13 = 0; var13 < 64; var13++) {
                            if (!var3 || var12 >= (var5 * 8) && var12 < (var5 * 8 + 8) && var13 >= (var4 * 8) && (var4 * 8 + 8) > var13) {
                                byte var14 = arg0.method494(false);
                                if (var14 != 0) {
                                    if (class7.field141[var11][var10] == null) {
                                        class7.field141[var11][var10] = new byte[4096];
                                    }
                                    class7.field141[var11][var10][(63 - var13 << 6) + var12] = var14;
                                    byte var15 = arg0.method494(false);
                                    if (class62.field1280[var11][var10] == null) {
                                        class62.field1280[var11][var10] = new byte[4096];
                                    }
                                    class62.field1280[var11][var10][(63 - var13 << 6) + var12] = var15;
                                }
                            }
                        }
                    }
                } else {
                    for (int var16 = 0; var16 < (var3 ? 64 : 4096); var16++) {
                        byte var17 = arg0.method494(false);
                        if (var17 != 0) {
                            arg0.field1142++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ZI)Lob;", line = 373)
    public static final class289 method955(boolean arg0, int arg1) {
        field2157++;
        class289 var2 = (class289) class32.field732.method1767((byte) -37, (long) arg1);
        if (var2 != null) {
            return var2;
        } else if (arg0) {
            return (class289) null;
        } else {
            byte[] var3;
            if (arg1 < 32768) {
                var3 = class69.field1357.method1192(0, 0, arg1);
            } else {
                var3 = class149.field2713.method1192(0, 0, arg1 & 0x7FFF);
            }
            class289 var4 = new class289();
            if (var3 != null) {
                var4.method2062((byte) 122, new class53(var3));
            }
            if (arg1 >= 32768) {
                var4.method2061((byte) 76);
            }
            class32.field732.method1771(-128, (long) arg1, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V", line = 413)
    public static void method956(int arg0) {
        if (arg0 != 255) {
            method954((class53) null, (byte) -64);
        }
        field2156 = null;
        field2167 = null;
        field2159 = null;
        field2163 = null;
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(ILjl;Ljl;I)V", line = 450)
    public class120(int arg0, class262 arg1, class262 arg2, int arg3) {
        this.field2161 = arg3;
        this.field2165 = arg2;
        this.field2164 = arg0;
        this.field2168 = arg1;
    }

    @OriginalMember(owner = "client!da", name = "toString", descriptor = "()Ljava/lang/String;", line = 444)
    public final String toString() {
        field2158++;
        return "Cache:" + this.field2164;
    }
}
