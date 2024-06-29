import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class518 {

    @OriginalMember(owner = "client!kn", name = "g", descriptor = "I")
    private int field7610 = 65000;

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "Lje;")
    private class275 field7605 = null;

    @OriginalMember(owner = "client!kn", name = "i", descriptor = "Lje;")
    private class275 field7612 = null;

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "I")
    private int field7607;

    @OriginalMember(owner = "client!kn", name = "o", descriptor = "[Lkq;")
    public static class417[] field7618 = new class417[2048];

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "I")
    public static int field7604;

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "I")
    public static int field7606;

    @OriginalMember(owner = "client!kn", name = "e", descriptor = "I")
    public static int field7608;

    @OriginalMember(owner = "client!kn", name = "f", descriptor = "I")
    public static int field7609;

    @OriginalMember(owner = "client!kn", name = "h", descriptor = "I")
    public static int field7611;

    @OriginalMember(owner = "client!kn", name = "k", descriptor = "I")
    public static int field7614;

    @OriginalMember(owner = "client!kn", name = "l", descriptor = "I")
    public static int field7615;

    @OriginalMember(owner = "client!kn", name = "m", descriptor = "I")
    public static int field7616;

    @OriginalMember(owner = "client!kn", name = "j", descriptor = "Lvb;")
    public static class130 field7613;

    @OriginalMember(owner = "client!kn", name = "n", descriptor = "Lfi;")
    public static class388 field7617;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(B)V")
    public static void method3059(byte arg0) {
        if (arg0 < 53) {
            field7613 = null;
        }
        field7613 = null;
        field7618 = null;
        field7617 = null;
    }

    @OriginalMember(owner = "client!kn", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field7609++;
        return "Cache:" + this.field7607;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IBIIIIII)V")
    public static final void method3060(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class322.field4945 <= arg0 && arg7 <= class145.field2134 && arg5 >= class229.field3347 && arg2 <= class156.field2366) {
            class251.method1598(arg0, arg4, arg2, arg7, false, arg3, arg5, arg6);
        } else {
            class375.method2392(arg7, arg6, (byte) 75, arg5, arg3, arg4, arg2, arg0);
        }
        if (arg1 <= -37) {
            field7604++;
        }
    }

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(B)Z")
    public static final boolean method3061(byte arg0) {
        field7608++;
        if (arg0 <= 105) {
            method3062(-62);
        }
        try {
            if (class43.field655 == 2) {
                if (class377.field5624 == null) {
                    class377.field5624 = class352.method2282(class251.field3626, class480.field7037, class156.field2378);
                    if (class377.field5624 == null) {
                        return false;
                    }
                }
                if (class245.field3534 == null) {
                    class245.field3534 = new class112(class170.field2548, class225.field3272);
                }
                if (class23.field420.method2114(22050, class192.field2818, 0, class245.field3534, class377.field5624)) {
                    class23.field420.method2119(-108);
                    class23.field420.method2126((byte) -125, class459.field6777);
                    class23.field420.method2105((byte) 76, class494.field7205, class377.field5624);
                    class251.field3626 = null;
                    class245.field3534 = null;
                    class377.field5624 = null;
                    class43.field655 = 0;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class23.field420.method2137(6794);
            class251.field3626 = null;
            class245.field3534 = null;
            class43.field655 = 0;
            class377.field5624 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)V")
    public static final void method3062(int arg0) {
        field7616++;
        for (int var1 = 0; var1 < class420.field6182; var1++) {
            class310 var3 = class375.field5603[var1];
            boolean var4 = false;
            if (var3.field4431 == null) {
                var3.field4440--;
                if (var3.field4440 >= (var3.field4437 == 2 ? -1500 : -10)) {
                    if (var3.field4437 == 1 && var3.field4439 == null) {
                        var3.field4439 = class71.method603(class250.field3600, var3.field4442, 0);
                        if (var3.field4439 == null) {
                            continue;
                        }
                        var3.field4440 += var3.field4439.method600();
                    } else if (var3.field4437 == 2 && (var3.field4426 == null || var3.field4428 == null)) {
                        if (var3.field4426 == null) {
                            var3.field4426 = class195.method1324(class272.field3933, var3.field4442);
                        }
                        if (var3.field4426 == null) {
                            continue;
                        }
                        if (var3.field4428 == null) {
                            var3.field4428 = var3.field4426.method1328(new int[] { 22050 });
                            if (var3.field4428 == null) {
                                continue;
                            }
                        }
                    }
                    if (var3.field4440 < 0) {
                        int var12;
                        if (var3.field4433 == 0) {
                            var12 = class397.field5830.field116 * var3.field4436 >> 8;
                        } else {
                            int var5 = (var3.field4433 & 0x30548D5) >> 24;
                            if (class95.field1558.field5538 == var5) {
                                int var6 = (var3.field4433 & 0xFF) << 7;
                                int var7 = var3.field4433 >> 16 & 0xFF;
                                int var8 = (var7 << 7) + 64 - class95.field1558.field5529;
                                if (var8 < 0) {
                                    var8 = -var8;
                                }
                                int var9 = (var3.field4433 & 0xFF35) >> 8;
                                int var10 = (var9 << 7) + 64 - class95.field1558.field5539;
                                if (var10 < 0) {
                                    var10 = -var10;
                                }
                                int var11 = var8 + var10 - 128;
                                if (var11 > var6) {
                                    var3.field4440 = -99999;
                                    continue;
                                }
                                if (var11 < 0) {
                                    var11 = 0;
                                }
                                var12 = (var6 - var11) * class397.field5830.field135 * var3.field4436 / var6 >> 8;
                            } else {
                                var12 = 0;
                            }
                        }
                        if (var12 > 0) {
                            class199 var13 = null;
                            if (var3.field4437 == 1) {
                                var13 = var3.field4439.method602().method1362(class508.field7428);
                            } else if (var3.field4437 == 2) {
                                var13 = var3.field4428;
                            }
                            class330 var14 = var3.field4431 = class330.method2186(var13, 100, var12);
                            var14.method2154(var3.field4430 - 1);
                            class124.field1920.method230(var14);
                        }
                    }
                } else {
                    var4 = true;
                }
            } else if (!var3.field4431.method2664(126)) {
                var4 = true;
            }
            if (var4) {
                class420.field6182--;
                for (int var15 = var1; var15 < class420.field6182; var15++) {
                    class375.field5603[var15] = class375.field5603[var15 + 1];
                }
                var1--;
            }
        }
        if (class124.field1918 && !class54.method391(1)) {
            if (class397.field5830.field141 != 0 && class277.field3994 != -1) {
                class72.method605(0, class397.field5830.field141, class277.field3994, false, 0, class427.field6244);
            }
            class124.field1918 = false;
        } else if (class397.field5830.field141 != 0 && class277.field3994 != -1 && !class54.method391(1)) {
            class114.method841(false, class188.field2786);
            class57.field822++;
            class86.field1436.method1892(397825512, class277.field3994);
            class277.field3994 = -1;
        }
        int var2 = 8 % ((arg0 - 28) / 62);
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IILtp;)Lmo;")
    public static final class525 method3063(int arg0, int arg1, class370 arg2) {
        if (arg0 != 520) {
            method3062(-120);
        }
        field7611++;
        class525 var3;
        if (class520.field7641 == null) {
            var3 = new class525();
        } else {
            var3 = class520.field7641;
            class520.field7641 = class520.field7641.field7716;
            var3.field7716 = null;
            class503.field7380--;
        }
        var3.field7712 = arg1;
        var3.field7711 = arg2;
        return var3;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(BI)[B")
    public final byte[] method3064(byte arg0, int arg1) {
        field7615++;
        class275 var3 = this.field7612;
        synchronized (this.field7612) {
            try {
                if (((long) (arg1 * 6 + 6)) > this.field7605.method1758(true)) {
                    return null;
                }
                this.field7605.method1755((long) (arg1 * 6), -1);
                this.field7605.method1757(0, 6, class11.field187, -200000001);
                int var5 = (class11.field187[2] & 0xFF) + ((class11.field187[0] & 0xFF << 16) + (class11.field187[1] & 0xFF << 8));
                int var6 = (class11.field187[5] & 0xFF) + ((class11.field187[3] & 0xFF) << 16) + (class11.field187[4] & 0xFF << 8);
                if (var5 < 0 || var5 > this.field7610) {
                    return null;
                } else if (var6 > 0 && (long) var6 <= this.field7612.method1758(true) / 520L) {
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    int var11 = -54 % ((66 - arg0) / 54);
                    int var12 = 0;
                    label70: while (var10 < var5) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field7612.method1755((long) (var6 * 520), -1);
                        int var14 = var5 - var10;
                        if (var14 > 512) {
                            var14 = 512;
                        }
                        this.field7612.method1757(0, var14 + 8, class11.field187, -200000001);
                        int var15 = (class11.field187[0] & 0xFF << 8) + (class11.field187[1] & 0xFF);
                        int var16 = (class11.field187[2] & 0xFF << 8) + (class11.field187[3] & 0xFF);
                        int var17 = (class11.field187[6] & 0xFF) + (class11.field187[5] & 0xFF << 8) + (class11.field187[4] & 0xFF << 16);
                        int var18 = class11.field187[7] & 0xFF;
                        if (arg1 == var15 && var12 == var16 && this.field7607 == var18) {
                            if (var17 >= 0 && (long) var17 <= this.field7612.method1758(true) / 520L) {
                                var6 = var17;
                                var12++;
                                int var21 = 0;
                                while (true) {
                                    if (var14 <= var21) {
                                        continue label70;
                                    }
                                    var9[var10++] = class11.field187[var21 + 8];
                                    var21++;
                                }
                            }
                            return null;
                        }
                        return null;
                    }
                    return var9;
                } else {
                    return null;
                }
            } catch (IOException var40) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(B[BIIZ)Z")
    private final boolean method3065(byte arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        field7614++;
        class275 var6 = this.field7612;
        synchronized (this.field7612) {
            if (arg0 < 124) {
                method3062(126);
            }
            try {
                int var7;
                if (arg4) {
                    if (this.field7605.method1758(true) < (long) (arg3 * 6 + 6)) {
                        return false;
                    }
                    this.field7605.method1755((long) (arg3 * 6), -1);
                    this.field7605.method1757(0, 6, class11.field187, -200000001);
                    var7 = (class11.field187[3] & 0xFF << 16) + (class11.field187[4] & 0xFF << 8) + (class11.field187[5] & 0xFF);
                    if (var7 <= 0 || (long) var7 > this.field7612.method1758(true) / 520L) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field7612.method1758(true) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class11.field187[4] = (byte) (var7 >> 8);
                class11.field187[0] = (byte) (arg2 >> 16);
                class11.field187[3] = (byte) (var7 >> 16);
                class11.field187[2] = (byte) arg2;
                class11.field187[5] = (byte) var7;
                class11.field187[1] = (byte) (arg2 >> 8);
                this.field7605.method1755((long) (arg3 * 6), -1);
                this.field7605.method1751(0, 6, -1, class11.field187);
                int var10 = 0;
                int var11 = 0;
                while (arg2 > var10) {
                    int var12 = 0;
                    if (arg4) {
                        label109: {
                            this.field7612.method1755((long) (var7 * 520), -1);
                            try {
                                this.field7612.method1757(0, 8, class11.field187, -200000001);
                            } catch (EOFException var33) {
                                return true;
                            }
                            int var13 = ((class11.field187[0] & 0xFF) << 8) + (class11.field187[1] & 0xFF);
                            int var14 = (class11.field187[2] & 0xFF << 8) + (class11.field187[3] & 0xFF);
                            var12 = (class11.field187[6] & 0xFF) + ((class11.field187[4] & 0xFF << 16) + (class11.field187[5] & 0xFF << 8));
                            int var15 = class11.field187[7] & 0xFF;
                            if (arg3 == var13 && var11 == var14 && this.field7607 == var15) {
                                if (var12 >= 0 && this.field7612.method1758(true) / 520L >= (long) var12) {
                                    break label109;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        var12 = (int) ((this.field7612.method1758(true) + 519L) / 520L);
                        arg4 = false;
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var7 == var12) {
                            var12++;
                        }
                    }
                    class11.field187[0] = (byte) (arg3 >> 8);
                    class11.field187[2] = (byte) (var11 >> 8);
                    if (arg2 - var10 <= 512) {
                        var12 = 0;
                    }
                    class11.field187[3] = (byte) var11;
                    class11.field187[1] = (byte) arg3;
                    class11.field187[6] = (byte) var12;
                    class11.field187[7] = (byte) this.field7607;
                    class11.field187[4] = (byte) (var12 >> 16);
                    class11.field187[5] = (byte) (var12 >> 8);
                    this.field7612.method1755((long) (var7 * 520), -1);
                    this.field7612.method1751(0, 8, -1, class11.field187);
                    int var18 = arg2 - var10;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    this.field7612.method1751(var10, var18, -1, arg1);
                    var7 = var12;
                    var11++;
                    var10 += var18;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(II[BI)Z")
    public final boolean method3066(int arg0, int arg1, byte[] arg2, int arg3) {
        int var5 = -52 / ((14 - arg1) / 58);
        field7606++;
        class275 var6 = this.field7612;
        synchronized (this.field7612) {
            if (arg0 < 0 || this.field7610 < arg0) {
                throw new IllegalArgumentException();
            }
            boolean var7 = this.method3065((byte) 125, arg2, arg0, arg3, true);
            if (!var7) {
                var7 = this.method3065((byte) 126, arg2, arg0, arg3, false);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(ILje;Lje;I)V")
    public class518(int arg0, class275 arg1, class275 arg2, int arg3) {
        this.field7605 = arg2;
        this.field7607 = arg0;
        this.field7612 = arg1;
        this.field7610 = arg3;
    }
}
