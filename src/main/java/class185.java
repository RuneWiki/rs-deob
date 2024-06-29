import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class185 extends class88 {

    @OriginalMember(owner = "client!r", name = "r", descriptor = "I")
    private int field3411 = 0;

    @OriginalMember(owner = "client!r", name = "y", descriptor = "I")
    private int field3418 = -32768;

    @OriginalMember(owner = "client!r", name = "I", descriptor = "I")
    private int field3428 = 0;

    @OriginalMember(owner = "client!r", name = "F", descriptor = "Z")
    public boolean field3425 = false;

    @OriginalMember(owner = "client!r", name = "A", descriptor = "I")
    private int field3420;

    @OriginalMember(owner = "client!r", name = "J", descriptor = "I")
    public int field3429;

    @OriginalMember(owner = "client!r", name = "H", descriptor = "I")
    public int field3427;

    @OriginalMember(owner = "client!r", name = "C", descriptor = "I")
    public int field3422;

    @OriginalMember(owner = "client!r", name = "E", descriptor = "I")
    public int field3424;

    @OriginalMember(owner = "client!r", name = "v", descriptor = "I")
    public int field3415;

    @OriginalMember(owner = "client!r", name = "t", descriptor = "Lta;")
    private class208 field3413;

    @OriginalMember(owner = "client!r", name = "B", descriptor = "[B")
    public static byte[] field3421 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!r", name = "z", descriptor = "Ldc;")
    public static class37 field3419 = method1233((byte) 86, "Bitte starten Sie eine Mitgliedschaft");

    @OriginalMember(owner = "client!r", name = "q", descriptor = "I")
    public static int field3410;

    @OriginalMember(owner = "client!r", name = "s", descriptor = "I")
    public static int field3412;

    @OriginalMember(owner = "client!r", name = "u", descriptor = "I")
    public static int field3414;

    @OriginalMember(owner = "client!r", name = "x", descriptor = "I")
    public static int field3417;

    @OriginalMember(owner = "client!r", name = "D", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!r", name = "G", descriptor = "I")
    public static int field3426;

    @OriginalMember(owner = "client!r", name = "K", descriptor = "I")
    public static int field3430;

    @OriginalMember(owner = "client!r", name = "w", descriptor = "Ldj;")
    public static class44 field3416;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II)Ldc;")
    public static final class37 method1232(int arg0, int arg1) {
        class37 var2 = new class37();
        var2.field733 = arg1;
        var2.field743 = new byte[arg0];
        field3423++;
        return var2;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BLjava/lang/String;)Ldc;")
    public static final class37 method1233(byte arg0, String arg1) {
        field3412++;
        byte[] var2 = arg1.getBytes();
        if (arg0 != 86) {
            field3416 = null;
        }
        int var3 = var2.length;
        int var4 = 0;
        class37 var5 = new class37();
        var5.field743 = new byte[var3];
        while (var4 < var3) {
            int var6 = var2[var4++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var3 <= var4) {
                    break;
                }
                int var7 = var2[var4++] & 0xFF;
                var5.field743[var5.field733++] = (byte) (var6 * 43 + var7 - 1720 - 48);
            } else if (var6 != 0) {
                var5.field743[var5.field733++] = (byte) var6;
            }
        }
        var5.method341((byte) -11);
        return var5.method338(112);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method19(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field3430++;
        class1 var11 = this.method1235(50);
        if (var11 != null) {
            var11.method19(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field3418 = var11.method5();
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(B)V")
    public static void method1234(byte arg0) {
        field3421 = null;
        field3419 = null;
        field3416 = null;
        if (arg0 < 73) {
            method1234((byte) 57);
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(I)La;")
    private final class1 method1235(int arg0) {
        field3414++;
        class191 var2 = class207.method1370(this.field3420, (byte) -125);
        class1 var3;
        if (this.field3425) {
            var3 = var2.method1271(-1, (byte) 95);
        } else {
            var3 = var2.method1271(this.field3411, (byte) 95);
        }
        if (var3 == null) {
            return null;
        } else {
            int var4 = 41 % ((-arg0 - 17) / 32);
            return var3;
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "()I")
    public final int method5() {
        field3417++;
        return this.field3418;
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(II)V")
    public final void method1236(int arg0, int arg1) {
        field3410++;
        if (this.field3425) {
            return;
        }
        this.field3428 += arg0;
        if (arg1 != -2) {
            this.method5();
        }
        while (this.field3413.field3882[this.field3411] < this.field3428) {
            this.field3428 -= this.field3413.field3882[this.field3411];
            this.field3411++;
            if (this.field3411 >= this.field3413.field3881.length) {
                this.field3425 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II[Lqi;I)V")
    public static final void method1237(int arg0, int arg1, class183[] arg2, int arg3) {
        field3426++;
        if (arg3 > arg0) {
            int var4 = arg0 - 1;
            int var5 = (arg0 + arg3) / 2;
            int var6 = arg3 + 1;
            class183 var7 = arg2[var5];
            arg2[var5] = arg2[arg0];
            arg2[arg0] = var7;
            while (var6 > var4) {
                boolean var8 = true;
                do {
                    var6--;
                    for (int var9 = 0; var9 < 4; var9++) {
                        int var10;
                        int var11;
                        if (class198.field3701[var9] == 2) {
                            var11 = var7.field3384;
                            var10 = arg2[var6].field3384;
                        } else if (class198.field3701[var9] == 1) {
                            var10 = arg2[var6].field3383;
                            var11 = var7.field3383;
                            if (var10 == -1 && class140.field2717[var9] == 1) {
                                var10 = 2001;
                            }
                            if (var11 == -1 && class140.field2717[var9] == 1) {
                                var11 = 2001;
                            }
                        } else if (class198.field3701[var9] == 3) {
                            var10 = arg2[var6].field3386 ? 1 : 0;
                            var11 = var7.field3386 ? 1 : 0;
                        } else {
                            var10 = arg2[var6].field3387;
                            var11 = var7.field3387;
                        }
                        if (var10 != var11) {
                            if ((class140.field2717[var9] != 1 || var11 >= var10) && (class140.field2717[var9] != 0 || var11 <= var10)) {
                                var8 = false;
                            }
                            break;
                        }
                        if (var9 == 3) {
                            var8 = false;
                        }
                    }
                } while (var8);
                boolean var12 = true;
                do {
                    var4++;
                    for (int var13 = 0; var13 < 4; var13++) {
                        int var14;
                        int var15;
                        if (class198.field3701[var13] == 2) {
                            var14 = arg2[var4].field3384;
                            var15 = var7.field3384;
                        } else if (class198.field3701[var13] == 1) {
                            var15 = var7.field3383;
                            var14 = arg2[var4].field3383;
                            if (var15 == -1 && class140.field2717[var13] == 1) {
                                var15 = 2001;
                            }
                            if (var14 == -1 && class140.field2717[var13] == 1) {
                                var14 = 2001;
                            }
                        } else if (class198.field3701[var13] == 3) {
                            var15 = var7.field3386 ? 1 : 0;
                            var14 = arg2[var4].field3386 ? 1 : 0;
                        } else {
                            var14 = arg2[var4].field3387;
                            var15 = var7.field3387;
                        }
                        if (var14 != var15) {
                            if ((class140.field2717[var13] != 1 || var15 <= var14) && (class140.field2717[var13] != 0 || var15 >= var14)) {
                                var12 = false;
                            }
                            break;
                        }
                        if (var13 == 3) {
                            var12 = false;
                        }
                    }
                } while (var12);
                if (var6 > var4) {
                    class183 var16 = arg2[var4];
                    arg2[var4] = arg2[var6];
                    arg2[var6] = var16;
                }
            }
            method1237(arg0, arg1, arg2, var6);
            method1237(var6 + 1, 0, arg2, arg3);
        }
        if (arg1 != 0) {
            method1237(-91, -77, null, -92);
        }
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "(IIIIIII)V")
    public class185(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field3420 = arg0;
        this.field3429 = arg2;
        this.field3427 = arg4;
        this.field3422 = arg1;
        this.field3424 = arg3;
        this.field3415 = arg5 + arg6;
        int var8 = class207.method1370(this.field3420, (byte) -111).field3559;
        if (var8 == -1) {
            this.field3425 = true;
        } else {
            this.field3425 = false;
            this.field3413 = class16.method113(var8, (byte) 97);
        }
    }
}
