import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class149 extends class13 {

    @OriginalMember(owner = "client!vc", name = "H", descriptor = "I")
    public int field3368 = -1;

    @OriginalMember(owner = "client!vc", name = "W", descriptor = "I")
    public int field3383 = -1;

    @OriginalMember(owner = "client!vc", name = "X", descriptor = "I")
    public int field3384 = -1;

    @OriginalMember(owner = "client!vc", name = "Z", descriptor = "I")
    public int field3386 = 5;

    @OriginalMember(owner = "client!vc", name = "M", descriptor = "Z")
    public boolean field3373 = false;

    @OriginalMember(owner = "client!vc", name = "bb", descriptor = "I")
    public int field3388 = -1;

    @OriginalMember(owner = "client!vc", name = "fb", descriptor = "I")
    public int field3392 = -1;

    @OriginalMember(owner = "client!vc", name = "eb", descriptor = "I")
    public int field3391 = 99;

    @OriginalMember(owner = "client!vc", name = "kb", descriptor = "I")
    public int field3397 = 2;

    @OriginalMember(owner = "client!vc", name = "L", descriptor = "Lec;")
    private static class32 field3372 = class73.method594("Your account is already logged in)3", true);

    @OriginalMember(owner = "client!vc", name = "K", descriptor = "Lec;")
    public static class32 field3371 = field3372;

    @OriginalMember(owner = "client!vc", name = "U", descriptor = "Lec;")
    public static class32 field3381 = class73.method594("jlv", true);

    @OriginalMember(owner = "client!vc", name = "jb", descriptor = "I")
    public static int field3396 = 0;

    @OriginalMember(owner = "client!vc", name = "Y", descriptor = "B")
    public static byte field3385;

    @OriginalMember(owner = "client!vc", name = "I", descriptor = "I")
    public static int field3369;

    @OriginalMember(owner = "client!vc", name = "O", descriptor = "I")
    public static int field3375;

    @OriginalMember(owner = "client!vc", name = "P", descriptor = "I")
    public static int field3376;

    @OriginalMember(owner = "client!vc", name = "Q", descriptor = "I")
    public static int field3377;

    @OriginalMember(owner = "client!vc", name = "S", descriptor = "I")
    public static int field3379;

    @OriginalMember(owner = "client!vc", name = "T", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!vc", name = "V", descriptor = "I")
    public static int field3382;

    @OriginalMember(owner = "client!vc", name = "db", descriptor = "I")
    public static int field3390;

    @OriginalMember(owner = "client!vc", name = "gb", descriptor = "I")
    public static int field3393;

    @OriginalMember(owner = "client!vc", name = "hb", descriptor = "I")
    public static int field3394;

    @OriginalMember(owner = "client!vc", name = "N", descriptor = "Lpf;")
    public static class110 field3374;

    @OriginalMember(owner = "client!vc", name = "J", descriptor = "[I")
    public int[] field3370;

    @OriginalMember(owner = "client!vc", name = "R", descriptor = "[I")
    public int[] field3378;

    @OriginalMember(owner = "client!vc", name = "ab", descriptor = "[I")
    private int[] field3387;

    @OriginalMember(owner = "client!vc", name = "cb", descriptor = "[I")
    private int[] field3389;

    @OriginalMember(owner = "client!vc", name = "ib", descriptor = "[I")
    public int[] field3395;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "(I)V")
    public static void method1108(int arg0) {
        field3381 = null;
        field3374 = null;
        if (arg0 != 0) {
            field3385 = 0;
        }
        field3372 = null;
        field3371 = null;
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(Ljd;B)V")
    public final void method1109(class66 arg0, byte arg1) {
        field3380++;
        int var3 = 52 % ((arg1 - 4) / 41);
        while (true) {
            int var4 = arg0.method533(255);
            if (var4 == 0) {
                return;
            }
            this.method1112(arg0, var4, (byte) 93);
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IILec;)V")
    public static final void method1110(int arg0, int arg1, class32 arg2) {
        class32 var3 = arg2.method244((byte) 120).method264((byte) 52);
        field3369++;
        boolean var4 = false;
        if (arg1 != 81) {
            return;
        }
        for (int var5 = 0; var5 < class62.field1405; var5++) {
            class70 var6 = class52.field1176[class137.field3189[var5]];
            if (var6 != null && var6.field1660 != null && var6.field1660.method271((byte) 118, var3)) {
                class94.method749(false, 0, class20.field373.field2738[0], -1, 0, 1, var6.field2761[0], class20.field373.field2761[0], 0, var6.field2738[0], 1, 2);
                var4 = true;
                if (arg0 == 1) {
                    class44.field1027.method357(35, -100);
                    class44.field1027.method547(arg1 - 25761, class137.field3189[var5]);
                    class114.field2661++;
                } else if (arg0 == 4) {
                    class77.field1798++;
                    class44.field1027.method357(81, -113);
                    class44.field1027.method505(arg1 ^ 0x8029A6E1, class137.field3189[var5]);
                } else if (arg0 == 6) {
                    class63.field1469++;
                    class44.field1027.method357(193, -117);
                    class44.field1027.method514(class137.field3189[var5], (byte) -76);
                } else if (arg0 == 7) {
                    class50.field1154++;
                    class44.field1027.method357(138, -81);
                    class44.field1027.method549(class137.field3189[var5], 109);
                }
                break;
            }
        }
        if (!var4) {
            class79.method629((byte) 98, class52.method403(new class32[] { class97.field2240, var3 }, (byte) -20), 0, class77.field1787);
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IILod;B)Lod;")
    public final class101 method1111(int arg0, int arg1, class101 arg2, byte arg3) {
        int var5 = this.field3395[arg1];
        field3393++;
        class121 var6 = class86.method667((byte) -122, var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method801(true);
        }
        int var8 = arg0 & 0x3;
        class101 var9 = arg2.method801(!var6.method960(var7, (byte) 124));
        if (var8 == 1) {
            var9.method814();
        } else if (var8 == 2) {
            var9.method805();
        } else if (var8 == 3) {
            var9.method803();
        }
        var9.method812(var6, var7);
        if (arg3 >= -69) {
            this.field3383 = -70;
        }
        if (var8 == 1) {
            var9.method803();
        } else if (var8 == 2) {
            var9.method805();
        } else if (var8 == 3) {
            var9.method814();
        }
        return var9;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Ljd;IB)V")
    private final void method1112(class66 arg0, int arg1, byte arg2) {
        if (arg2 <= 22) {
            this.method1117(93);
        }
        field3377++;
        if (arg1 == 1) {
            int var4 = arg0.method532(0);
            this.field3378 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3378[var5] = arg0.method532(0);
            }
            this.field3395 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field3395[var6] = arg0.method532(0);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field3395[var7] += arg0.method532(0) << 16;
            }
        } else if (arg1 == 2) {
            this.field3388 = arg0.method532(0);
        } else if (arg1 == 3) {
            int var8 = arg0.method533(255);
            this.field3387 = new int[var8 + 1];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field3387[var9] = arg0.method533(255);
            }
            this.field3387[var8] = 9999999;
        } else if (arg1 == 4) {
            this.field3373 = true;
        } else if (arg1 == 5) {
            this.field3386 = arg0.method533(255);
        } else if (arg1 == 6) {
            this.field3392 = arg0.method532(0);
        } else if (arg1 == 7) {
            this.field3368 = arg0.method532(0);
        } else if (arg1 == 8) {
            this.field3391 = arg0.method533(255);
        } else if (arg1 == 9) {
            this.field3384 = arg0.method533(255);
        } else if (arg1 == 10) {
            this.field3383 = arg0.method533(255);
        } else if (arg1 == 11) {
            this.field3397 = arg0.method533(255);
        } else if (arg1 == 12) {
            int var10 = arg0.method533(255);
            this.field3389 = new int[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                this.field3389[var11] = arg0.method532(0);
            }
            for (int var12 = 0; var12 < var10; var12++) {
                this.field3389[var12] = (arg0.method532(0) << 16) + this.field3389[var12];
            }
            return;
        } else if (arg1 == 13) {
            int var13 = arg0.method533(255);
            this.field3370 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field3370[var14] = arg0.method518((byte) 67);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ZLod;I)Lod;")
    public final class101 method1113(boolean arg0, class101 arg1, int arg2) {
        field3375++;
        int var4 = this.field3395[arg2];
        class121 var5 = class86.method667((byte) -122, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg1.method822(true);
        }
        if (!arg0) {
            this.method1116(-2, null, null, -26, -109);
        }
        class101 var7 = arg1.method822(!var5.method960(var6, (byte) 125));
        var7.method812(var5, var6);
        return var7;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(JI)V")
    public static final void method1114(long arg0, int arg1) {
        field3382++;
        if (arg1 != -7645) {
            method1110(-120, -22, null);
        }
        if (arg0 != 0L) {
            class44.field1027.method357(23, -103);
            class88.field2043++;
            class44.field1027.method542(arg0, (byte) 56);
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IILod;)Lod;")
    public final class101 method1115(int arg0, int arg1, class101 arg2) {
        field3376++;
        int var4 = this.field3395[arg1];
        class121 var5 = class86.method667((byte) -122, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg2.method801(true);
        }
        if (arg0 != -964) {
            method1114(1L, -117);
        }
        class121 var7 = null;
        int var8 = 0;
        if (this.field3389 != null && arg1 < this.field3389.length) {
            int var9 = this.field3389[arg1];
            var7 = class86.method667((byte) -122, var9 >> 16);
            var8 = var9 & 0xFFFF;
        }
        if (var7 == null || var8 == 65535) {
            class101 var11 = arg2.method801(!var5.method960(var6, (byte) 125));
            var11.method812(var5, var6);
            return var11;
        } else {
            class101 var10 = arg2.method801(!var5.method960(var6, (byte) 125) & !var7.method960(var8, (byte) 124));
            var10.method812(var5, var6);
            var10.method812(var7, var8);
            return var10;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILvc;Lod;II)Lod;")
    public final class101 method1116(int arg0, class149 arg1, class101 arg2, int arg3, int arg4) {
        field3379++;
        int var6 = this.field3395[arg4];
        class121 var7 = class86.method667((byte) -122, var6 >> 16);
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg1.method1118(arg2, arg0, 0);
        }
        int var9 = arg1.field3395[arg0];
        if (arg3 != 0) {
            return null;
        }
        class121 var10 = class86.method667((byte) -122, var9 >> 16);
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            class101 var12 = arg2.method801(!var7.method960(var8, (byte) 127));
            var12.method812(var7, var8);
            return var12;
        } else {
            class101 var13 = arg2.method801(!var7.method960(var8, (byte) 124) & !var10.method960(var11, (byte) 127));
            var13.method816(var7, var8, var10, var11, this.field3387);
            return var13;
        }
    }

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "(I)V")
    public final void method1117(int arg0) {
        field3394++;
        if (this.field3384 == -1) {
            if (this.field3387 == null) {
                this.field3384 = 0;
            } else {
                this.field3384 = 2;
            }
        }
        if (~this.field3383 != arg0) {
            return;
        }
        if (this.field3387 == null) {
            this.field3383 = 0;
        } else {
            this.field3383 = 2;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lod;II)Lod;")
    public final class101 method1118(class101 arg0, int arg1, int arg2) {
        int var4 = this.field3395[arg1];
        field3390++;
        class121 var5 = class86.method667((byte) -122, var4 >> 16);
        if (arg2 != 0) {
            this.field3389 = null;
        }
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method801(true);
        } else {
            class101 var7 = arg0.method801(!var5.method960(var6, (byte) 125));
            var7.method812(var5, var6);
            return var7;
        }
    }
}
