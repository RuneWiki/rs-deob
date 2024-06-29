import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class514 {

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "Lak;")
    public static class234 field7468 = new class234("slide:", "gleiten:", "glissement:", "deslizamento:");

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "Lqu;")
    public static class65 field7470 = new class65(10, 2, 2, 0);

    @OriginalMember(owner = "client!cm", name = "g", descriptor = "[I")
    public static int[] field7472 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "I")
    public static int field7466;

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "I")
    public static int field7467;

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "I")
    public static int field7469;

    @OriginalMember(owner = "client!cm", name = "i", descriptor = "Ll;")
    public static class16 field7474;

    @OriginalMember(owner = "client!cm", name = "h", descriptor = "Lwt;")
    public static class205 field7473;

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "Lam;")
    public static class449 field7471;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IBLah;)V")
    public static final void method3043(int arg0, byte arg1, class263 arg2) {
        field7467++;
        boolean var3 = arg2.method1760(1, true) == 1;
        if (var3) {
            class210.field3437[class219.field3588++] = arg0;
        }
        int var4 = arg2.method1760(2, true);
        class177 var5 = class26.field319[arg0];
        if (var4 == 0) {
            if (var3) {
                var5.field2677 = false;
            } else if (class261.field4008 == arg0) {
                throw new RuntimeException("s:lr");
            } else {
                class443 var6 = class131.field2005[arg0] = new class443();
                var6.field6513 = (var5.field1978[0] + class390.field5842 >> 6 << 14) + (var5.field5826 << 28) + (var5.field1976[0] + class176.field2613 >> 6);
                if (var5.field2644 == -1) {
                    var6.field6509 = var5.field1949.method889(16383);
                } else {
                    var6.field6509 = var5.field2644;
                }
                var6.field6512 = var5.field1968;
                var6.field6515 = var5.field2639;
                if (var5.field2641 > 0) {
                    class385.method2407(var5, -30);
                }
                class26.field319[arg0] = null;
                if (arg2.method1760(1, true) != 0) {
                    class275.method1807(6, arg0, arg2);
                }
            }
        } else if (var4 == 1) {
            int var7 = arg2.method1760(3, true);
            int var8 = var5.field1978[0];
            int var9 = var5.field1976[0];
            if (var7 == 0) {
                var9--;
                var8--;
            } else if (var7 == 1) {
                var9--;
            } else if (var7 == 2) {
                var8++;
                var9--;
            } else if (var7 == 3) {
                var8--;
            } else if (var7 == 4) {
                var8++;
            } else if (var7 == 5) {
                var8--;
                var9++;
            } else if (var7 == 6) {
                var9++;
            } else if (var7 == 7) {
                var8++;
                var9++;
            }
            if (var3) {
                var5.field2657 = var9;
                var5.field2646 = var8;
                var5.field2677 = true;
            } else {
                var5.method1188(var9, class524.field7667[arg0], (byte) -121, var8);
            }
        } else if (var4 == 2) {
            int var10 = arg2.method1760(4, true);
            int var11 = var5.field1978[0];
            int var12 = var5.field1976[0];
            if (var10 == 0) {
                var11 -= 2;
                var12 -= 2;
            } else if (var10 == 1) {
                var12 -= 2;
                var11--;
            } else if (var10 == 2) {
                var12 -= 2;
            } else if (var10 == 3) {
                var11++;
                var12 -= 2;
            } else if (var10 == 4) {
                var11 += 2;
                var12 -= 2;
            } else if (var10 == 5) {
                var12--;
                var11 -= 2;
            } else if (var10 == 6) {
                var11 += 2;
                var12--;
            } else if (var10 == 7) {
                var11 -= 2;
            } else if (var10 == 8) {
                var11 += 2;
            } else if (var10 == 9) {
                var12++;
                var11 -= 2;
            } else if (var10 == 10) {
                var12++;
                var11 += 2;
            } else if (var10 == 11) {
                var12 += 2;
                var11 -= 2;
            } else if (var10 == 12) {
                var11--;
                var12 += 2;
            } else if (var10 == 13) {
                var12 += 2;
            } else if (var10 == 14) {
                var11++;
                var12 += 2;
            } else if (var10 == 15) {
                var11 += 2;
                var12 += 2;
            }
            if (var3) {
                var5.field2677 = true;
                var5.field2646 = var11;
                var5.field2657 = var12;
            } else {
                var5.method1188(var12, class524.field7667[arg0], (byte) -121, var11);
            }
        } else {
            int var13 = arg2.method1760(1, true);
            if (var13 == 0) {
                int var14 = arg2.method1760(12, true);
                int var15 = var14 >> 10;
                int var16 = (var14 & 0x3E5) >> 5;
                if (var16 > 15) {
                    var16 -= 32;
                }
                int var17 = var14 & 0x1F;
                if (var17 > 15) {
                    var17 -= 32;
                }
                int var18 = var5.field1978[0] + var16;
                int var19 = var5.field1976[0] + var17;
                if (var3) {
                    var5.field2646 = var18;
                    var5.field2677 = true;
                    var5.field2657 = var19;
                } else {
                    var5.method1188(var19, class524.field7667[arg0], (byte) -121, var18);
                }
                var5.field5826 = (byte) (var5.field5826 + var15 & 0x3);
                if (class261.field4008 == arg0) {
                    class154.field2286 = var5.field5826;
                }
            } else if (arg1 == 13) {
                int var20 = arg2.method1760(30, true);
                int var21 = var20 >> 28;
                int var22 = (var20 & 0xFFFFBD7) >> 14;
                int var23 = var20 & 0x3FFF;
                int var24 = (var5.field1978[0] + var22 + class390.field5842 & 0x3FFF) - class390.field5842;
                int var25 = (class176.field2613 + var23 + var5.field1976[0] & 0x3FFF) - class176.field2613;
                if (var3) {
                    var5.field2646 = var24;
                    var5.field2657 = var25;
                    var5.field2677 = true;
                } else {
                    var5.method1188(var25, class524.field7667[arg0], (byte) -121, var24);
                }
                var5.field5826 = (byte) (var5.field5826 + var21 & 0x3);
                if (class261.field4008 == arg0) {
                    class154.field2286 = var5.field5826;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)Z")
    public static final boolean method3044(int arg0) {
        if (arg0 >= -20) {
            field7468 = null;
        }
        field7469++;
        try {
            return class501.method2965(0);
        } catch (IOException var4) {
            class421.method2625(63);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + (class289.field4354 == null ? -1 : class289.field4354.method3031(false)) + "," + (class150.field2247 == null ? -1 : class150.field2247.method3031(false)) + "," + (class274.field4194 == null ? -1 : class274.field4194.method3031(false)) + " - " + class142.field2164 + "," + (class398.field5947.field1978[0] + class390.field5842) + "," + (class398.field5947.field1976[0] + class176.field2613) + " - ";
            for (int var3 = 0; class142.field2164 > var3 && var3 < 50; var3++) {
                var2 = var2 + class238.field3819.field3572[var3] + ",";
            }
            class88.method727(var5, -32, var2);
            class417.method2613(false, -71);
            return true;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Z)V")
    public static void method3045(boolean arg0) {
        field7472 = null;
        if (arg0) {
            field7468 = null;
        }
        field7474 = null;
        field7471 = null;
        field7468 = null;
        field7473 = null;
        field7470 = null;
    }
}
