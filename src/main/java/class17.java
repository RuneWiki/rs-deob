import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class17 extends class160 {

    @OriginalMember(owner = "client!db", name = "B", descriptor = "I")
    private int field487 = 0;

    @OriginalMember(owner = "client!db", name = "C", descriptor = "Lmg;")
    private class252 field488 = new class252(16);

    @OriginalMember(owner = "client!db", name = "N", descriptor = "I")
    private int field499 = 0;

    @OriginalMember(owner = "client!db", name = "O", descriptor = "Lrk;")
    private class257 field500 = new class257();

    @OriginalMember(owner = "client!db", name = "R", descriptor = "J")
    private long field503 = 0L;

    @OriginalMember(owner = "client!db", name = "F", descriptor = "Lgb;")
    private class144 field491;

    @OriginalMember(owner = "client!db", name = "D", descriptor = "I")
    private int field489;

    @OriginalMember(owner = "client!db", name = "P", descriptor = "Z")
    private boolean field501;

    @OriginalMember(owner = "client!db", name = "L", descriptor = "Lrk;")
    private class257 field497;

    @OriginalMember(owner = "client!db", name = "s", descriptor = "Lth;")
    private class109 field478;

    @OriginalMember(owner = "client!db", name = "t", descriptor = "Lgb;")
    private class144 field479;

    @OriginalMember(owner = "client!db", name = "z", descriptor = "Lek;")
    private class159 field485;

    @OriginalMember(owner = "client!db", name = "w", descriptor = "I")
    private int field482;

    @OriginalMember(owner = "client!db", name = "o", descriptor = "I")
    private int field474;

    @OriginalMember(owner = "client!db", name = "S", descriptor = "Z")
    private boolean field504;

    @OriginalMember(owner = "client!db", name = "r", descriptor = "Ldc;")
    private class226 field477;

    @OriginalMember(owner = "client!db", name = "I", descriptor = "I")
    public static int field494 = 0;

    @OriginalMember(owner = "client!db", name = "K", descriptor = "Ljd;")
    public static class86 field496 = class122.method868("<br>", true);

    @OriginalMember(owner = "client!db", name = "g", descriptor = "I")
    public static int field466;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!db", name = "i", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!db", name = "j", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client!db", name = "l", descriptor = "I")
    public static int field471;

    @OriginalMember(owner = "client!db", name = "n", descriptor = "I")
    public static int field473;

    @OriginalMember(owner = "client!db", name = "p", descriptor = "I")
    public static int field475;

    @OriginalMember(owner = "client!db", name = "q", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!db", name = "u", descriptor = "I")
    public static int field480;

    @OriginalMember(owner = "client!db", name = "v", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!db", name = "x", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "client!db", name = "y", descriptor = "I")
    public static int field484;

    @OriginalMember(owner = "client!db", name = "A", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!db", name = "E", descriptor = "I")
    public static int field490;

    @OriginalMember(owner = "client!db", name = "G", descriptor = "I")
    public static int field492;

    @OriginalMember(owner = "client!db", name = "H", descriptor = "I")
    public static int field493;

    @OriginalMember(owner = "client!db", name = "J", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "client!db", name = "Q", descriptor = "I")
    public static int field502;

    @OriginalMember(owner = "client!db", name = "m", descriptor = "Lca;")
    private class251 field472;

    @OriginalMember(owner = "client!db", name = "M", descriptor = "Z")
    private boolean field498;

    @OriginalMember(owner = "client!db", name = "k", descriptor = "[B")
    private byte[] field470;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(III)Ldc;")
    private final class226 method127(int arg0, int arg1, int arg2) {
        field492++;
        class226 var4 = (class226) this.field488.method1698((long) arg2, (byte) 107);
        int var5 = 55 / ((arg0 - 21) / 51);
        if (var4 != null && arg1 == 0 && !var4.field4101 && var4.field4099) {
            var4.method1477(1);
            var4 = null;
        }
        if (var4 == null) {
            if (arg1 == 0) {
                if (this.field491 == null || this.field470[arg2] == -1) {
                    if (this.field485.method1151((byte) 45)) {
                        return null;
                    }
                    var4 = this.field485.method1154(-22256, true, arg2, this.field489, (byte) 2);
                } else {
                    var4 = this.field478.method777(arg2, (byte) 78, this.field491);
                }
            } else if (arg1 == 1) {
                if (this.field491 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field478.method780((byte) -42, arg2, this.field491);
            } else if (arg1 == 2) {
                if (this.field491 == null) {
                    throw new RuntimeException();
                }
                if (this.field470[arg2] != -1) {
                    throw new RuntimeException();
                }
                if (this.field485.method1158(118)) {
                    return null;
                }
                var4 = this.field485.method1154(-22256, false, arg2, this.field489, (byte) 2);
            } else {
                throw new RuntimeException();
            }
            this.field488.method1699(-28407, var4, (long) arg2);
        }
        if (var4.field4099) {
            return null;
        }
        byte[] var6 = var4.method199((byte) 36);
        if (!var4 instanceof class30) {
            try {
                if (var6 == null || var6.length <= 2) {
                    throw new RuntimeException();
                }
                class186.field3295.reset();
                class186.field3295.update(var6, 0, var6.length - 2);
                int var10 = (int) class186.field3295.getValue();
                if (this.field472.field4461[arg2] != var10) {
                    throw new RuntimeException();
                }
                this.field485.field3004 = 0;
                this.field485.field3003 = 0;
            } catch (RuntimeException var13) {
                this.field485.method1159(1);
                var4.method1477(1);
                if (var4.field4101 && !this.field485.method1151((byte) 45)) {
                    class246 var11 = this.field485.method1154(-22256, true, arg2, this.field489, (byte) 2);
                    this.field488.method1699(-28407, var11, (long) arg2);
                }
                return null;
            }
            var6[var6.length - 2] = (byte) (this.field472.field4466[arg2] >>> 8);
            var6[var6.length - 1] = (byte) this.field472.field4466[arg2];
            if (this.field491 != null) {
                this.field478.method776(this.field491, var6, arg2, 725608299);
                if (this.field470[arg2] != 1) {
                    this.field487++;
                    this.field470[arg2] = 1;
                }
            }
            if (!var4.field4101) {
                var4.method1477(1);
            }
            return var4;
        }
        try {
            if (var6 == null || var6.length <= 2) {
                throw new RuntimeException();
            }
            class186.field3295.reset();
            class186.field3295.update(var6, 0, var6.length - 2);
            int var7 = (int) class186.field3295.getValue();
            if (this.field472.field4461[arg2] != var7) {
                throw new RuntimeException();
            }
            int var8 = ((var6[var6.length - 2] & 0xFF) << 8) + (var6[var6.length - 1] & 0xFF);
            if ((this.field472.field4466[arg2] & 0xFFFF) != var8) {
                throw new RuntimeException();
            }
            if (this.field470[arg2] != 1) {
                this.field487++;
                this.field470[arg2] = 1;
            }
            if (!var4.field4101) {
                var4.method1477(1);
            }
            return var4;
        } catch (Exception var12) {
            this.field470[arg2] = -1;
            var4.method1477(1);
            if (var4.field4101 && !this.field485.method1151((byte) 45)) {
                class246 var9 = this.field485.method1154(-22256, true, arg2, this.field489, (byte) 2);
                this.field488.method1699(-28407, var9, (long) arg2);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ZJ)V")
    public static final void method128(boolean arg0, long arg1) {
        field468++;
        if (arg1 == 0L) {
            return;
        }
        if (!(class97.field1928 < 100 || class122.field2376) || class97.field1928 >= 200) {
            class58.method423(class224.field4060, false, 0, class56.field1155);
            return;
        }
        class86 var3 = class202.method1440(arg1, (byte) 61).method608((byte) 89);
        for (int var4 = 0; var4 < class97.field1928; var4++) {
            if (class209.field3780[var4] == arg1) {
                class58.method423(class109.method783(2, new class86[] { var3, class119.field2324 }), !arg0, 0, class56.field1155);
                return;
            }
        }
        for (int var5 = 0; var5 < class56.field1146; var5++) {
            if (class119.field2325[var5] == arg1) {
                class58.method423(class109.method783(2, new class86[] { class6.field115, var3, class102.field1967 }), false, 0, class56.field1155);
                return;
            }
        }
        if (var3.method625((byte) 9, class124.field2412.field4029)) {
            class58.method423(class106.field2028, !arg0, 0, class56.field1155);
            return;
        }
        class107.field2059++;
        class100.field1957[class97.field1928] = var3;
        class209.field3780[class97.field1928] = arg1;
        class98.field1944[class97.field1928] = 0;
        class207.field3755[class97.field1928] = class56.field1155;
        class140.field2664[class97.field1928] = 0;
        class137.field2610[class97.field1928] = false;
        class97.field1928++;
        class177.field3207 = class27.field621;
        class36.field809.method1356(168, arg0);
        class36.field809.method1399((byte) -10, arg1);
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(II)V")
    public final void method129(int arg0, int arg1) {
        field493++;
        if (this.field491 == null) {
            return;
        }
        if (arg0 != -31564) {
            method134(21L, true);
        }
        for (class207 var3 = this.field500.method1737((byte) 74); var3 != null; var3 = this.field500.method1740(-8843)) {
            if (((long) arg1) == var3.field3759) {
                return;
            }
        }
        class207 var4 = new class207();
        var4.field3759 = (long) arg1;
        this.field500.method1731(127, var4);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIB)V")
    public static final void method130(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field466++;
        class13 var5 = (class13) class152.field2876.method1698((long) arg0, (byte) 112);
        if (var5 == null) {
            var5 = new class13();
            class152.field2876.method1699(-28407, var5, (long) arg0);
        }
        if (arg1 >= var5.field405.length) {
            int[] var6 = new int[arg1 + 1];
            int[] var7 = new int[arg1 + 1];
            for (int var8 = 0; var8 < var5.field405.length; var8++) {
                var6[var8] = var5.field405[var8];
                var7[var8] = var5.field402[var8];
            }
            for (int var9 = var5.field405.length; var9 < arg1; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field402 = var7;
            var5.field405 = var6;
        }
        var5.field405[arg1] = arg3;
        int var10 = 118 % ((-arg4 - 73) / 38);
        var5.field402[arg1] = arg2;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(BI)I")
    public final int method131(byte arg0, int arg1) {
        if (arg0 > -110) {
            method135(true);
        }
        field471++;
        class226 var3 = (class226) this.field488.method1698((long) arg1, (byte) 113);
        return var3 == null ? 0 : var3.method202((byte) 105);
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(I)I")
    public final int method132(int arg0) {
        field484++;
        if (this.field472 == null) {
            return 0;
        } else if (this.field501) {
            if (arg0 != -27521) {
                this.method131((byte) -78, -20);
            }
            class207 var2 = this.field497.method1737((byte) 74);
            return var2 == null ? 0 : (int) var2.field3759;
        } else {
            return this.field472.field4455;
        }
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(I)V")
    public static void method133(int arg0) {
        if (arg0 > 55) {
            field496 = null;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(JZ)V")
    public static final void method134(long arg0, boolean arg1) {
        field475++;
        if (arg0 == 0L) {
            return;
        }
        if (class56.field1146 >= 100) {
            class58.method423(class36.field808, false, 0, class56.field1155);
            return;
        }
        class86 var3 = class202.method1440(arg0, (byte) 84).method608((byte) 48);
        for (int var4 = 0; var4 < class56.field1146; var4++) {
            if (class119.field2325[var4] == arg0) {
                class58.method423(class109.method783(2, new class86[] { var3, class34.field776 }), false, 0, class56.field1155);
                return;
            }
        }
        for (int var5 = 0; var5 < class97.field1928; var5++) {
            if (class209.field3780[var5] == arg0) {
                class58.method423(class109.method783(2, new class86[] { class6.field121, var3, class119.field2329 }), !arg1, 0, class56.field1155);
                return;
            }
        }
        if (var3.method625((byte) -117, class124.field2412.field4029)) {
            class58.method423(class173.field3168, false, 0, class56.field1155);
            return;
        }
        class119.field2325[class56.field1146] = arg0;
        class59.field1187++;
        class185.field3283[class56.field1146++] = class202.method1440(arg0, (byte) 98);
        class177.field3207 = class27.field621;
        class36.field809.method1356(91, arg1);
        class36.field809.method1399((byte) -114, arg0);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Z)V")
    public static final void method135(boolean arg0) {
        if (arg0) {
            field496 = null;
        }
        field480++;
        class90.method673(true);
        class51.method387(74);
        class150.method1066((byte) -18);
        class121.method853(-128);
        class69.method483(-30);
        class67.method474(arg0);
        class54.method402(-63207988);
        class233.method1613(11776);
        class232.method1611((byte) 72);
        class107.method761(8091);
        class252.method1703(73);
        class169.method1218((byte) 39);
        class106.method759(105);
        class1.method6(33);
        ((class201) class145.field2756).method1433(0);
        class108.field2077.method394(32767);
        class252.field4478.method1080(1);
        class87.field1725.method1080(1);
        class249.field4417.method1080(1);
        class220.field3964.method1080(1);
        class149.field2777.method1080(1);
        class232.field4204.method1080(1);
        class189.field3348.method1080(1);
        class56.field1141.method1080(1);
        class201.field3616.method1080(1);
        class70.field1448.method1080(1);
        class109.field2082.method1080(1);
        class152.field2873.method703((byte) 122);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IB)[B")
    public final byte[] method136(int arg0, byte arg1) {
        class226 var3 = this.method127(-78, 0, arg0);
        field473++;
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method199((byte) 36);
            var3.method1477(arg1 - 119);
            return arg1 == 120 ? var4 : null;
        }
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(B)I")
    public final int method137(byte arg0) {
        int var2 = 55 / ((41 - arg0) / 46);
        field476++;
        return this.field487;
    }

    @OriginalMember(owner = "client!db", name = "d", descriptor = "(I)I")
    public final int method138(int arg0) {
        field502++;
        if (this.field472 == null) {
            return 0;
        } else {
            if (arg0 != -3259) {
                method145(-4, 12);
            }
            return this.field472.field4455;
        }
    }

    @OriginalMember(owner = "client!db", name = "d", descriptor = "(B)V")
    public final void method139(byte arg0) {
        field483++;
        if (arg0 != -1 || this.field497 == null || this.method142((byte) 0) == null) {
            return;
        }
        for (class207 var2 = this.field500.method1737((byte) 74); var2 != null; var2 = this.field500.method1740(arg0 ^ 0x228A)) {
            int var3 = (int) var2.field3759;
            if (var3 < 0 || var3 >= this.field472.field4456 || this.field472.field4463[var3] == 0) {
                var2.method1477(1);
            } else {
                if (this.field470[var3] == 0) {
                    this.method127(arg0 + 92, 1, var3);
                }
                if (this.field470[var3] == -1) {
                    this.method127(arg0 ^ 0xFFFFFF8D, 2, var3);
                }
                if (this.field470[var3] == 1) {
                    var2.method1477(1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "e", descriptor = "(I)V")
    public final void method140(int arg0) {
        field486++;
        if (this.field491 == null) {
            return;
        }
        if (arg0 != 0) {
            this.field482 = 59;
        }
        this.field498 = true;
        if (this.field497 == null) {
            this.field497 = new class257();
        }
    }

    @OriginalMember(owner = "client!db", name = "e", descriptor = "(B)V")
    public final void method141(byte arg0) {
        int var2 = 76 % ((68 - arg0) / 51);
        field467++;
        if (this.field497 != null) {
            if (this.method142((byte) 0) == null) {
                return;
            }
            if (this.field501) {
                boolean var7 = true;
                for (class207 var8 = this.field497.method1737((byte) 74); var8 != null; var8 = this.field497.method1740(-8843)) {
                    int var10 = (int) var8.field3759;
                    if (this.field470[var10] == 0) {
                        this.method127(-76, 1, var10);
                    }
                    if (this.field470[var10] == 0) {
                        var7 = false;
                    } else {
                        var8.method1477(1);
                    }
                }
                while (this.field499 < this.field472.field4463.length) {
                    if (this.field472.field4463[this.field499] == 0) {
                        this.field499++;
                    } else {
                        if (this.field478.field2094 >= 250) {
                            var7 = false;
                            break;
                        }
                        if (this.field470[this.field499] == 0) {
                            this.method127(90, 1, this.field499);
                        }
                        if (this.field470[this.field499] == 0) {
                            var7 = false;
                            class207 var9 = new class207();
                            var9.field3759 = (long) this.field499;
                            this.field497.method1731(108, var9);
                        }
                        this.field499++;
                    }
                }
                if (var7) {
                    this.field501 = false;
                    this.field499 = 0;
                }
            } else if (this.field498) {
                boolean var3 = true;
                for (class207 var4 = this.field497.method1737((byte) 74); var4 != null; var4 = this.field497.method1740(-8843)) {
                    int var6 = (int) var4.field3759;
                    if (this.field470[var6] != 1) {
                        this.method127(110, 2, var6);
                    }
                    if (this.field470[var6] == 1) {
                        var4.method1477(1);
                    } else {
                        var3 = false;
                    }
                }
                while (this.field472.field4463.length > this.field499) {
                    if (this.field472.field4463[this.field499] == 0) {
                        this.field499++;
                    } else {
                        if (this.field485.method1158(53)) {
                            var3 = false;
                            break;
                        }
                        if (this.field470[this.field499] != 1) {
                            this.method127(77, 2, this.field499);
                        }
                        if (this.field470[this.field499] != 1) {
                            var3 = false;
                            class207 var5 = new class207();
                            var5.field3759 = (long) this.field499;
                            this.field497.method1731(-94, var5);
                        }
                        this.field499++;
                    }
                }
                if (var3) {
                    this.field498 = false;
                    this.field499 = 0;
                }
            } else {
                this.field497 = null;
            }
        }
        if (!this.field504 || class253.method1711((byte) -25) < this.field503) {
            return;
        }
        for (class226 var11 = (class226) this.field488.method1709(-105); var11 != null; var11 = (class226) this.field488.method1704(-86)) {
            if (!var11.field4099) {
                if (var11.field4102) {
                    if (!var11.field4101) {
                        throw new RuntimeException();
                    }
                    var11.method1477(1);
                } else {
                    var11.field4102 = true;
                }
            }
        }
        this.field503 = class253.method1711((byte) -58) + 1000L;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B)Lca;")
    public final class251 method142(byte arg0) {
        field495++;
        if (this.field472 != null) {
            return this.field472;
        }
        if (this.field477 == null) {
            if (this.field485.method1151((byte) 45)) {
                return null;
            }
            this.field477 = this.field485.method1154(-22256, true, this.field489, 255, (byte) 0);
        }
        if (this.field477.field4099) {
            return null;
        } else if (arg0 == 0) {
            byte[] var2 = this.field477.method199((byte) 36);
            if (this.field477 instanceof class30) {
                try {
                    if (var2 == null) {
                        throw new RuntimeException();
                    }
                    this.field472 = new class251(var2, this.field474);
                    if (this.field472.field4465 != this.field482) {
                        throw new RuntimeException();
                    }
                } catch (RuntimeException var3) {
                    this.field472 = null;
                    if (this.field485.method1151((byte) 45)) {
                        this.field477 = null;
                    } else {
                        this.field477 = this.field485.method1154(-22256, true, this.field489, 255, (byte) 0);
                    }
                    return null;
                }
            } else {
                try {
                    if (var2 == null) {
                        throw new RuntimeException();
                    }
                    this.field472 = new class251(var2, this.field474);
                } catch (RuntimeException var4) {
                    this.field485.method1159(1);
                    this.field472 = null;
                    if (this.field485.method1151((byte) 45)) {
                        this.field477 = null;
                    } else {
                        this.field477 = this.field485.method1154(arg0 ^ 0xFFFFA910, true, this.field489, 255, (byte) 0);
                    }
                    return null;
                }
                if (this.field479 != null) {
                    this.field478.method776(this.field479, var2, this.field489, 725608299);
                }
            }
            if (this.field491 != null) {
                this.field470 = new byte[this.field472.field4456];
                this.field487 = 0;
            }
            this.field477 = null;
            return this.field472;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(Z)V")
    public static final void method143(boolean arg0) {
        class215.field3880.method702((byte) -88);
        if (arg0) {
            field490++;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIJ)Z")
    public static final boolean method144(int arg0, int arg1, int arg2, long arg3) {
        class249 var5 = class248.field4406[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field4435 != null && var5.field4435.field3978 == arg3) {
            return true;
        } else if (var5.field4433 != null && var5.field4433.field4576 == arg3) {
            return true;
        } else if (var5.field4437 != null && var5.field4437.field2065 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field4445; var6++) {
                if (var5.field4429[var6].field4122 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(II)I")
    public static final int method145(int arg0, int arg1) {
        if (arg0 > -79) {
            return -86;
        } else {
            field481++;
            return arg1 == 16711935 ? -1 : class209.method1487(arg1, true);
        }
    }

    @OriginalMember(owner = "client!db", name = "f", descriptor = "(I)I")
    public final int method146(int arg0) {
        if (arg0 > -5) {
            this.field503 = 31L;
        }
        field469++;
        if (this.method142((byte) 0) == null) {
            return this.field477 == null ? 0 : this.field477.method202((byte) -99);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "(ILgb;Lgb;Lek;Lth;IIZ)V")
    public class17(int arg0, class144 arg1, class144 arg2, class159 arg3, class109 arg4, int arg5, int arg6, boolean arg7) {
        this.field491 = arg1;
        this.field489 = arg0;
        if (this.field491 == null) {
            this.field501 = false;
        } else {
            this.field501 = true;
            this.field497 = new class257();
        }
        this.field478 = arg4;
        this.field479 = arg2;
        this.field485 = arg3;
        this.field482 = arg6;
        this.field474 = arg5;
        this.field504 = arg7;
        if (this.field479 != null) {
            this.field477 = this.field478.method777(this.field489, (byte) 93, this.field479);
        }
    }
}
