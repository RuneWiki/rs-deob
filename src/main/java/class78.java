import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class78 extends class235 {

    @OriginalMember(owner = "client!ec", name = "x", descriptor = "Lsb;")
    public static class98 field1378 = class47.method368("<)4col>", 0);

    @OriginalMember(owner = "client!ec", name = "z", descriptor = "Lsb;")
    public static class98 field1380 = class47.method368("(U0a )2 in: ", 0);

    @OriginalMember(owner = "client!ec", name = "J", descriptor = "Z")
    public static boolean field1389 = false;

    @OriginalMember(owner = "client!ec", name = "t", descriptor = "I")
    public int field1374;

    @OriginalMember(owner = "client!ec", name = "u", descriptor = "I")
    public int field1375;

    @OriginalMember(owner = "client!ec", name = "v", descriptor = "I")
    public int field1376;

    @OriginalMember(owner = "client!ec", name = "w", descriptor = "I")
    public int field1377;

    @OriginalMember(owner = "client!ec", name = "y", descriptor = "I")
    public int field1379;

    @OriginalMember(owner = "client!ec", name = "A", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!ec", name = "E", descriptor = "I")
    public int field1384;

    @OriginalMember(owner = "client!ec", name = "G", descriptor = "I")
    public int field1386;

    @OriginalMember(owner = "client!ec", name = "H", descriptor = "I")
    public int field1387;

    @OriginalMember(owner = "client!ec", name = "K", descriptor = "I")
    public int field1390;

    @OriginalMember(owner = "client!ec", name = "L", descriptor = "I")
    public int field1391;

    @OriginalMember(owner = "client!ec", name = "M", descriptor = "I")
    public int field1392;

    @OriginalMember(owner = "client!ec", name = "O", descriptor = "I")
    public int field1394;

    @OriginalMember(owner = "client!ec", name = "P", descriptor = "I")
    public int field1395;

    @OriginalMember(owner = "client!ec", name = "Q", descriptor = "I")
    public int field1396;

    @OriginalMember(owner = "client!ec", name = "T", descriptor = "I")
    public int field1399;

    @OriginalMember(owner = "client!ec", name = "V", descriptor = "I")
    public static int field1400;

    @OriginalMember(owner = "client!ec", name = "W", descriptor = "I")
    public int field1401;

    @OriginalMember(owner = "client!ec", name = "X", descriptor = "I")
    public int field1402;

    @OriginalMember(owner = "client!ec", name = "F", descriptor = "Lcb;")
    public class178 field1385;

    @OriginalMember(owner = "client!ec", name = "D", descriptor = "Lac;")
    public static class188 field1383;

    @OriginalMember(owner = "client!ec", name = "S", descriptor = "Lmk;")
    public class19 field1398;

    @OriginalMember(owner = "client!ec", name = "I", descriptor = "Lmj;")
    public class234 field1388;

    @OriginalMember(owner = "client!ec", name = "R", descriptor = "Lri;")
    public static class33 field1397;

    @OriginalMember(owner = "client!ec", name = "C", descriptor = "Lfc;")
    public class89 field1382;

    @OriginalMember(owner = "client!ec", name = "N", descriptor = "[[[I")
    public static int[][][] field1393;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
    public final void method590(int arg0) {
        this.field1388 = null;
        this.field1382 = null;
        this.field1385 = null;
        this.field1398 = null;
        if (arg0 >= 125) {
            field1400++;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lki;I)V")
    public static final void method591(class255 arg0, int arg1) {
        arg0.field4479 = arg0.field4510;
        field1381++;
        if (arg0.field4496 == 0) {
            arg0.field4459 = 0;
            return;
        }
        if (arg0.field4503 != -1 && arg0.field4474 == 0) {
            class138 var2 = class16.method144(1, arg0.field4503);
            if (arg0.field4482 > 0 && var2.field2452 == 0) {
                arg0.field4459++;
                return;
            }
            if (arg0.field4482 <= 0 && var2.field2435 == 0) {
                arg0.field4459++;
                return;
            }
        }
        int var3 = arg0.field4492;
        if (arg1 != 27168) {
            field1389 = true;
        }
        int var4 = arg0.field4501[arg0.field4496 - 1] * 128 + arg0.field4486 * 64;
        int var5 = arg0.field4466;
        int var6 = arg0.field4491[arg0.field4496 - 1] * 128 + (arg0.field4486 * 64);
        if (var4 - var3 > 256 || var4 - var3 < -256 || var6 - var5 > 256 || (var6 - var5) < -256) {
            arg0.field4466 = var6;
            arg0.field4492 = var4;
            return;
        }
        if (var3 < var4) {
            if (var5 < var6) {
                arg0.field4480 = 1280;
            } else if (var6 < var5) {
                arg0.field4480 = 1792;
            } else {
                arg0.field4480 = 1536;
            }
        } else if (var3 <= var4) {
            if (var5 < var6) {
                arg0.field4480 = 1024;
            } else if (var6 < var5) {
                arg0.field4480 = 0;
            }
        } else if (var5 < var6) {
            arg0.field4480 = 768;
        } else if (var5 > var6) {
            arg0.field4480 = 256;
        } else {
            arg0.field4480 = 512;
        }
        int var7 = arg0.field4480 - arg0.field4527 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg0.field4521;
        int var9 = 4;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg0.field4508;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg0.field4463;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg0.field4512;
        }
        boolean var10 = true;
        if (var8 == -1) {
            var8 = arg0.field4508;
        }
        arg0.field4479 = var8;
        if (arg0 instanceof class108) {
            var10 = ((class108) arg0).field1928.field2185;
        }
        if (var10) {
            if (arg0.field4527 != arg0.field4480 && arg0.field4464 == -1 && arg0.field4497 != 0) {
                var9 = 2;
            }
            if (arg0.field4496 > 2) {
                var9 = 6;
            }
            if (arg0.field4496 > 3) {
                var9 = 8;
            }
            if (arg0.field4459 > 0 && arg0.field4496 > 1) {
                arg0.field4459--;
                var9 = 8;
            }
        } else {
            if (arg0.field4496 > 1) {
                var9 = 6;
            }
            if (arg0.field4496 > 2) {
                var9 = 8;
            }
            if (arg0.field4459 > 0 && arg0.field4496 > 1) {
                var9 = 8;
                arg0.field4459--;
            }
        }
        if (arg0.field4507[arg0.field4496 - 1]) {
            var9 <<= 0x1;
        }
        if (var9 >= 8 && arg0.field4508 == arg0.field4479 && arg0.field4490 != -1) {
            arg0.field4479 = arg0.field4490;
        }
        if (var3 < var4) {
            arg0.field4492 += var9;
            if (arg0.field4492 > var4) {
                arg0.field4492 = var4;
            }
        } else if (var3 > var4) {
            arg0.field4492 -= var9;
            if (arg0.field4492 < var4) {
                arg0.field4492 = var4;
            }
        }
        if (var5 < var6) {
            arg0.field4466 += var9;
            if (arg0.field4466 > var6) {
                arg0.field4466 = var6;
            }
        } else if (var5 > var6) {
            arg0.field4466 -= var9;
            if (var6 > arg0.field4466) {
                arg0.field4466 = var6;
            }
        }
        if (arg0.field4492 == var4 && arg0.field4466 == var6) {
            if (arg0.field4482 > 0) {
                arg0.field4482--;
            }
            arg0.field4496--;
        }
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)V")
    public static void method592(int arg0) {
        if (arg0 > -20) {
            field1380 = null;
        }
        field1378 = null;
        field1380 = null;
        field1393 = null;
        field1397 = null;
        field1383 = null;
    }
}
