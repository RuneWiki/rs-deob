import java.awt.Canvas;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class22 extends class127 {

    @OriginalMember(owner = "client!dc", name = "M", descriptor = "I")
    public int field464 = 0;

    @OriginalMember(owner = "client!dc", name = "Q", descriptor = "[Lc;")
    public class13[] field468 = new class13[5];

    @OriginalMember(owner = "client!dc", name = "fb", descriptor = "[I")
    public int[] field482 = new int[5];

    @OriginalMember(owner = "client!dc", name = "hb", descriptor = "I")
    public int field484;

    @OriginalMember(owner = "client!dc", name = "X", descriptor = "I")
    public int field474;

    @OriginalMember(owner = "client!dc", name = "ab", descriptor = "I")
    public int field477;

    @OriginalMember(owner = "client!dc", name = "R", descriptor = "I")
    public int field469;

    @OriginalMember(owner = "client!dc", name = "E", descriptor = "I")
    public static int field456 = 0;

    @OriginalMember(owner = "client!dc", name = "F", descriptor = "Lhb;")
    public static class44 field457 = class102.method810("gr-Un:", -28606);

    @OriginalMember(owner = "client!dc", name = "C", descriptor = "Lhb;")
    private static class44 field454 = class102.method810("Public chat", -28606);

    @OriginalMember(owner = "client!dc", name = "G", descriptor = "I")
    public static int field458 = -1;

    @OriginalMember(owner = "client!dc", name = "D", descriptor = "I")
    public static int field455 = 0;

    @OriginalMember(owner = "client!dc", name = "B", descriptor = "Lhb;")
    public static class44 field453 = field454;

    @OriginalMember(owner = "client!dc", name = "y", descriptor = "I")
    public static int field450 = 0;

    @OriginalMember(owner = "client!dc", name = "eb", descriptor = "Lhe;")
    public static class47 field481 = new class47();

    @OriginalMember(owner = "client!dc", name = "jb", descriptor = "Lhb;")
    public static class44 field486 = class102.method810("Sichtbare Karte vorbereitet)3", -28606);

    @OriginalMember(owner = "client!dc", name = "ib", descriptor = "I")
    public static int field485 = 0;

    @OriginalMember(owner = "client!dc", name = "A", descriptor = "I")
    public static int field452;

    @OriginalMember(owner = "client!dc", name = "I", descriptor = "I")
    public int field460;

    @OriginalMember(owner = "client!dc", name = "L", descriptor = "I")
    public int field463;

    @OriginalMember(owner = "client!dc", name = "U", descriptor = "I")
    public int field471;

    @OriginalMember(owner = "client!dc", name = "V", descriptor = "I")
    public int field472;

    @OriginalMember(owner = "client!dc", name = "W", descriptor = "I")
    public static int field473;

    @OriginalMember(owner = "client!dc", name = "bb", descriptor = "I")
    public int field478;

    @OriginalMember(owner = "client!dc", name = "cb", descriptor = "I")
    public int field479;

    @OriginalMember(owner = "client!dc", name = "S", descriptor = "Lv;")
    public class122 field470;

    @OriginalMember(owner = "client!dc", name = "P", descriptor = "Ldc;")
    public class22 field467;

    @OriginalMember(owner = "client!dc", name = "H", descriptor = "Lh;")
    public class42 field459;

    @OriginalMember(owner = "client!dc", name = "K", descriptor = "Lkc;")
    public class63 field462;

    @OriginalMember(owner = "client!dc", name = "N", descriptor = "Lae;")
    public class6 field465;

    @OriginalMember(owner = "client!dc", name = "J", descriptor = "Lnc;")
    public class81 field461;

    @OriginalMember(owner = "client!dc", name = "Z", descriptor = "Lpd;")
    public class94 field476;

    @OriginalMember(owner = "client!dc", name = "gb", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field483;

    @OriginalMember(owner = "client!dc", name = "O", descriptor = "Z")
    public boolean field466;

    @OriginalMember(owner = "client!dc", name = "Y", descriptor = "Z")
    public boolean field475;

    @OriginalMember(owner = "client!dc", name = "db", descriptor = "Z")
    public boolean field480;

    @OriginalMember(owner = "client!dc", name = "z", descriptor = "[Lhc;")
    public static class45[] field451;

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(B)V", line = 14)
    public static void method160(byte arg0) {
        field454 = null;
        if (arg0 <= 105) {
            method160((byte) 69);
        }
        field457 = null;
        field453 = null;
        field481 = null;
        field483 = null;
        field486 = null;
        field451 = null;
    }

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "(I)Z", line = 31)
    public static final boolean method161(int arg0) {
        field473++;
        long var1 = System.currentTimeMillis();
        int var3 = (int) (var1 - class128.field3079);
        if (var3 > 200) {
            var3 = 200;
        }
        class128.field3079 = var1;
        class75.field1907 += var3;
        if (class13.field248 == 0 && class36.field858 == 0 && field485 == 0 && class55.field1364 == 0) {
            return true;
        } else if (class28.field662 == null) {
            return false;
        } else {
            try {
                if (class75.field1907 > 30000) {
                    throw new IOException();
                }
                while (class36.field858 < 20 && class55.field1364 > 0) {
                    class129 var4 = (class129) class40.field895.method153(false);
                    class131 var5 = new class131(4);
                    var5.method993(19579, 1);
                    var5.method977(-104, (int) var4.field3057);
                    class28.field662.method323(0, (byte) 111, 4, var5.field3172);
                    class41.field915.method158(var4.field3057, var4, arg0 ^ 0xFFFFA749);
                    class55.field1364--;
                    class36.field858++;
                }
                while (class13.field248 < 20 && field485 > 0) {
                    class129 var6 = (class129) class71.field1736.method129((byte) 71);
                    class131 var7 = new class131(4);
                    var7.method993(19579, 0);
                    var7.method977(-103, (int) var6.field3057);
                    class28.field662.method323(0, (byte) 103, 4, var7.field3172);
                    var6.method39(1);
                    class74.field1866.method158(var6.field3057, var6, arg0 ^ 0xFFFFA749);
                    field485--;
                    class13.field248++;
                }
                for (int var8 = arg0; var8 < 100; var8++) {
                    int var9 = class28.field662.method327((byte) -68);
                    if (var9 < 0) {
                        throw new IOException();
                    }
                    if (var9 == 0) {
                        break;
                    }
                    class75.field1907 = 0;
                    byte var10 = 0;
                    if (class2.field35 == null) {
                        var10 = 8;
                    } else if (class125.field3029 == 0) {
                        var10 = 1;
                    }
                    if (var10 > 0) {
                        int var11 = var10 - class67.field1686.field3182;
                        if (var9 < var11) {
                            var11 = var9;
                        }
                        class28.field662.method320(class67.field1686.field3182, class67.field1686.field3172, false, var11);
                        if (class125.field3033 != 0) {
                            for (int var12 = 0; var12 < var11; var12++) {
                                class67.field1686.field3172[class67.field1686.field3182 + var12] = (byte) class14.method99(class67.field1686.field3172[class67.field1686.field3182 + var12], class125.field3033);
                            }
                        }
                        class67.field1686.field3182 += var11;
                        if (class67.field1686.field3182 < var10) {
                            break;
                        }
                        if (class2.field35 == null) {
                            class67.field1686.field3182 = 0;
                            int var13 = class67.field1686.method971(true);
                            int var14 = class67.field1686.method1001(65280);
                            int var15 = class67.field1686.method971(true);
                            int var16 = class67.field1686.method994((byte) 36);
                            long var17 = (long) ((var13 << 16) + var14);
                            class129 var19 = (class129) class41.field915.method154(-1, var17);
                            class100.field2532 = true;
                            if (var19 == null) {
                                var19 = (class129) class74.field1866.method154(-1, var17);
                                class100.field2532 = false;
                            }
                            if (var19 == null) {
                                throw new IOException();
                            }
                            class2.field35 = var19;
                            int var20 = var15 == 0 ? 5 : 9;
                            class98.field2505 = new class131(var16 + var20 + class2.field35.field3086);
                            class98.field2505.method993(19579, var15);
                            class98.field2505.method975(var16, false);
                            class67.field1686.field3182 = 0;
                            class125.field3029 = 8;
                        } else if (class125.field3029 == 0) {
                            if (class67.field1686.field3172[0] == -1) {
                                class125.field3029 = 1;
                                class67.field1686.field3182 = 0;
                            } else {
                                class2.field35 = null;
                            }
                        }
                    } else {
                        int var21 = 512 - class125.field3029;
                        int var22 = class98.field2505.field3172.length - class2.field35.field3086;
                        if (var21 > var22 - class98.field2505.field3182) {
                            var21 = var22 - class98.field2505.field3182;
                        }
                        if (var21 > var9) {
                            var21 = var9;
                        }
                        class28.field662.method320(class98.field2505.field3182, class98.field2505.field3172, false, var21);
                        if (class125.field3033 != 0) {
                            for (int var23 = 0; var23 < var21; var23++) {
                                class98.field2505.field3172[class98.field2505.field3182 + var23] = (byte) class14.method99(class98.field2505.field3172[class98.field2505.field3182 + var23], class125.field3033);
                            }
                        }
                        class125.field3029 += var21;
                        class98.field2505.field3182 += var21;
                        if (class98.field2505.field3182 == var22) {
                            if (class2.field35.field3057 == 16711935L) {
                                class53.field1306 = class98.field2505;
                                for (int var25 = 0; var25 < 256; var25++) {
                                    class100 var26 = class77.field1940[var25];
                                    if (var26 != null) {
                                        class53.field1306.field3182 = var25 * 4 + 5;
                                        int var27 = class53.field1306.method994((byte) 36);
                                        var26.method786(arg0 ^ 0xFF, var27);
                                    }
                                }
                            } else {
                                class118.field2902.reset();
                                class118.field2902.update(class98.field2505.field3172, 0, var22);
                                int var24 = (int) class118.field2902.getValue();
                                if (class2.field35.field3091 != var24) {
                                    try {
                                        class28.field662.method328(256);
                                    } catch (Exception var29) {
                                    }
                                    class28.field662 = null;
                                    class67.field1687++;
                                    class125.field3033 = (byte) (Math.random() * 255.0D + 1.0D);
                                    return false;
                                }
                                class117.field2856 = 0;
                                class67.field1687 = 0;
                                class2.field35.field3100.method796(class100.field2532, false, (class2.field35.field3057 & 0xFF0000L) == 16711680L, (int) (class2.field35.field3057 & 0xFFFFL), class98.field2505.field3172);
                            }
                            class2.field35.method948(-120);
                            class125.field3029 = 0;
                            class98.field2505 = null;
                            class2.field35 = null;
                            if (class100.field2532) {
                                class36.field858--;
                            } else {
                                class13.field248--;
                            }
                        } else {
                            if (class125.field3029 != 512) {
                                break;
                            }
                            class125.field3029 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var30) {
                try {
                    class28.field662.method328(arg0 ^ 0x100);
                } catch (Exception var28) {
                }
                class117.field2856++;
                class28.field662 = null;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(III)V", line = 322)
    public class22(int arg0, int arg1, int arg2) {
        this.field484 = arg2;
        this.field474 = arg1;
        this.field469 = this.field477 = arg0;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZLtd;)V", line = 391)
    public static final void method162(boolean arg0, class116 arg1) {
        field452++;
        class31.field777 = arg1;
        class42.field965 = class31.field777.method886(0, 16);
        if (arg0) {
            field454 = null;
        }
    }
}
