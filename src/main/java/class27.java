import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class27 extends class282 {

    @OriginalMember(owner = "client!na", name = "P", descriptor = "Lcd;")
    public class69 field479;

    @OriginalMember(owner = "client!na", name = "M", descriptor = "[I")
    public static int[] field476 = new int[1000];

    @OriginalMember(owner = "client!na", name = "T", descriptor = "Ljf;")
    private static class229 field483 = class212.method1457((byte) 98, "Loaded fonts");

    @OriginalMember(owner = "client!na", name = "U", descriptor = "Ljf;")
    public static class229 field484 = class212.method1457((byte) 93, "Veuillez patienter)3)3)3");

    @OriginalMember(owner = "client!na", name = "W", descriptor = "Ljf;")
    private static class229 field486 = class212.method1457((byte) 97, "Prepared sound engine");

    @OriginalMember(owner = "client!na", name = "Q", descriptor = "Ljf;")
    public static class229 field480 = field483;

    @OriginalMember(owner = "client!na", name = "X", descriptor = "I")
    public static int field487 = 255;

    @OriginalMember(owner = "client!na", name = "Y", descriptor = "Ljf;")
    public static class229 field488 = field486;

    @OriginalMember(owner = "client!na", name = "ab", descriptor = "[Ljf;")
    public static class229[] field490 = new class229[100];

    @OriginalMember(owner = "client!na", name = "N", descriptor = "I")
    public static int field477;

    @OriginalMember(owner = "client!na", name = "O", descriptor = "I")
    public static int field478;

    @OriginalMember(owner = "client!na", name = "S", descriptor = "I")
    public static int field482;

    @OriginalMember(owner = "client!na", name = "Z", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "client!na", name = "V", descriptor = "Lkn;")
    public static class198 field485;

    @OriginalMember(owner = "client!na", name = "R", descriptor = "Ljava/awt/Image;")
    public static Image field481;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IB)I", line = 11)
    public static final int method239(int arg0, byte arg1) {
        if (arg1 >= -54) {
            method240(-26, (byte) -114, 6, 112, -31, 67, 9);
        }
        field482++;
        int var2 = 0;
        if (arg0 < 0 || arg0 >= 65536) {
            var2 += 16;
            arg0 >>>= 0x10;
        }
        if (arg0 >= 256) {
            var2 += 8;
            arg0 >>>= 0x8;
        }
        if (arg0 >= 16) {
            arg0 >>>= 0x4;
            var2 += 4;
        }
        if (arg0 >= 4) {
            arg0 >>>= 0x2;
            var2 += 2;
        }
        if (arg0 >= 1) {
            arg0 >>>= 0x1;
            var2++;
        }
        return arg0 + var2;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IBIIIII)V", line = 60)
    public static final void method240(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field478++;
        class191[] var7 = class279.field4777;
        if (arg1 != -19) {
            field481 = (Image) null;
        }
        for (int var8 = 0; var8 < var7.length; var8++) {
            class191 var9 = var7[var8];
            if (var9 != null && var9.field3314 == 2) {
                class106.method724((var9.field3320 - class213.field3649 << 7) + var9.field3312, 109, arg5 >> 1, var9.field3321 * 2, arg0, arg3 >> 1, (var9.field3306 - class258.field4503 << 7) + var9.field3307, arg4);
                if (class97.field1724 > -1 && (class199.field3475 % 20) < 10) {
                    class84.field1612[var9.field3319].method314(arg6 + class97.field1724 - 12, class125.field2216 + arg2 + -28);
                }
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "d", descriptor = "(B)V", line = 99)
    public static void method241(byte arg0) {
        field485 = null;
        field481 = null;
        field484 = null;
        if (arg0 != -77) {
            field483 = (class229) null;
        }
        field486 = null;
        field476 = null;
        field483 = null;
        field488 = null;
        field480 = null;
        field490 = null;
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(II)Lcg;", line = 123)
    public static final class42 method242(int arg0, int arg1) {
        field477++;
        if (arg1 != -30280) {
            return (class42) null;
        }
        class42 var2 = (class42) class302.field5134.method643((long) arg0, arg1 ^ 0x9DB2C114);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg0 < 32768) {
            var3 = class14.field158.method1275(arg0, 1, -5211);
        } else {
            var3 = class200.field3503.method1275(arg0 & 0x7FFF, 1, -5211);
        }
        class42 var4 = new class42();
        if (var3 != null) {
            var4.method368(new class14(var3), (byte) -121);
        }
        if (arg0 >= 32768) {
            var4.method365(0);
        }
        class302.field5134.method640(var4, (long) arg0, 24179);
        return var4;
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "(Lcd;)V", line = 152)
    public class27(class69 arg0) {
        this.field479 = arg0;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I[Lnf;I)V", line = 173)
    public static final void method243(int arg0, class67[] arg1, int arg2) {
        field489++;
        int var3 = -99 / ((arg0 - 26) / 40);
        for (int var4 = 0; var4 < arg1.length; var4++) {
            class67 var5 = arg1[var4];
            if (var5 != null && var5.field1211 == arg2 && (!var5.field1249 || !client.method1827(var5))) {
                if (var5.field1267 == 0) {
                    if (!var5.field1249 && client.method1827(var5) && class312.field5244 != var5) {
                        continue;
                    }
                    method243(84, arg1, var5.field1247);
                    if (var5.field1243 != null) {
                        method243(-83, var5.field1243, var5.field1247);
                    }
                    class321 var6 = (class321) class151.field2618.method1890((long) var5.field1247, -109);
                    if (var6 != null) {
                        class120.method851(-1, var6.field5432);
                    }
                }
                if (var5.field1267 == 6) {
                    if (var5.field1276 != -1 || var5.field1146 != -1) {
                        boolean var7 = class213.method1462(var5, 26);
                        int var8;
                        if (var7) {
                            var8 = var5.field1146;
                        } else {
                            var8 = var5.field1276;
                        }
                        if (var8 != -1) {
                            class194 var9 = class280.method1965(var8, 122);
                            if (var9 != null) {
                                var5.field1293 += class146.field2540;
                                while (var5.field1293 > var9.field3384[var5.field1252]) {
                                    var5.field1293 -= var9.field3384[var5.field1252];
                                    var5.field1252++;
                                    if (var9.field3366.length <= var5.field1252) {
                                        var5.field1252 -= var9.field3378;
                                        if (var5.field1252 < 0 || var5.field1252 >= var9.field3366.length) {
                                            var5.field1252 = 0;
                                        }
                                    }
                                    class194.method1328((byte) -89, var5);
                                }
                            }
                        }
                    }
                    if (var5.field1287 != 0 && !var5.field1249) {
                        int var10 = var5.field1287 >> 16;
                        int var11 = var5.field1287 << 16 >> 16;
                        int var12 = class146.field2540 * var11;
                        int var13 = class146.field2540 * var10;
                        var5.field1209 = var5.field1209 + var12 & 0x7FF;
                        var5.field1231 = var5.field1231 + var13 & 0x7FF;
                        class194.method1328((byte) -84, var5);
                    }
                }
            }
        }
    }
}
