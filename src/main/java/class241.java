import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class241 {

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "Lrg;")
    private class227 field3857;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "Lrc;")
    private class67 field3854;

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "Lba;")
    private class167 field3859;

    @OriginalMember(owner = "client!fl", name = "h", descriptor = "Ljava/lang/String;")
    public static String field3861 = "level: ";

    @OriginalMember(owner = "client!fl", name = "m", descriptor = "[I")
    public static int[] field3866 = new int[32];

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "I")
    public static int field3855;

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "I")
    public static int field3856;

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "I")
    public static int field3858;

    @OriginalMember(owner = "client!fl", name = "j", descriptor = "I")
    public static int field3863;

    @OriginalMember(owner = "client!fl", name = "k", descriptor = "I")
    public static int field3864;

    @OriginalMember(owner = "client!fl", name = "n", descriptor = "I")
    public static int field3867;

    @OriginalMember(owner = "client!fl", name = "i", descriptor = "Llj;")
    private class25 field3862;

    @OriginalMember(owner = "client!fl", name = "g", descriptor = "[I")
    public static int[] field3860;

    @OriginalMember(owner = "client!fl", name = "l", descriptor = "[Lfd;")
    private class122[] field3865;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(B)V")
    public static void method1628(byte arg0) {
        field3860 = null;
        field3861 = null;
        if (arg0 == -118) {
            field3866 = null;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)V")
    public static final void method1629(int arg0) {
        field3864++;
        boolean var1 = true;
        class224.method1524(false, 116);
        class94.field1453 = 0;
        for (int var2 = 0; var2 < class235.field3770.length; var2++) {
            if (class182.field2880[var2] != -1 && class235.field3770[var2] == null) {
                class235.field3770[var2] = class102.field1582.method807((byte) 99, 0, class182.field2880[var2]);
                if (class235.field3770[var2] == null) {
                    class94.field1453++;
                    var1 = false;
                }
            }
            if (class17.field198[var2] != -1 && class207.field3240[var2] == null) {
                class207.field3240[var2] = class102.field1582.method833(class17.field198[var2], 0, 1, class128.field1883[var2]);
                if (class207.field3240[var2] == null) {
                    class94.field1453++;
                    var1 = false;
                }
            }
            if (class202.field3169 != null && class50.field658[var2] == null && class202.field3169[var2] != -1) {
                class50.field658[var2] = class102.field1582.method833(class202.field3169[var2], 0, 1, class128.field1883[var2]);
                if (class50.field658[var2] == null) {
                    class94.field1453++;
                    var1 = false;
                }
            }
        }
        if (class141.field2065 == null) {
            if (class4.field61 == null || !class252.field4030.method821(104, class4.field61.field2513 + "_labels")) {
                class141.field2065 = new class78(0);
            } else if (class252.field4030.method814(class4.field61.field2513 + "_labels", true)) {
                class141.field2065 = class182.method1273(class252.field4030, (byte) -100, class4.field61.field2513 + "_labels");
            } else {
                var1 = false;
                class94.field1453++;
            }
        }
        if (!var1) {
            class121.field1761 = 1;
            return;
        }
        if (arg0 != 2314) {
            method1629(-34);
        }
        class269.field4294 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class235.field3770.length; var4++) {
            byte[] var20 = class207.field3240[var4];
            if (var20 != null) {
                int var21 = (class154.field2295[var4] >> 8) * 64 - class126.field1869;
                int var22 = (class154.field2295[var4] & 0xFF) * 64 - class246.field3943;
                if (class224.field3615) {
                    var22 = 10;
                    var21 = 10;
                }
                var3 &= class281.method1878((byte) 126, var21, var22, var20);
            }
        }
        if (!var3) {
            class121.field1761 = 2;
            return;
        }
        boolean var5 = false;
        if (class121.field1761 != 0) {
            class34.method272((byte) 88, class165.field2559 + "<br>(100%)", true);
        }
        class10.method63(13371);
        class25.method169(108);
        class102.method679(4, 104, 104, 25, var5);
        for (int var6 = 0; var6 < 4; var6++) {
            class290.field4574[var6].method546((byte) -24);
        }
        for (int var7 = 0; var7 < 4; var7++) {
            for (int var18 = 0; var18 < 104; var18++) {
                for (int var19 = 0; var19 < 104; var19++) {
                    class35.field449[var7][var18][var19] = 0;
                }
            }
        }
        class192.method1345(17621, false);
        class10.method63(13371);
        System.gc();
        class224.method1524(true, 127);
        class143.method951((byte) 87, false);
        if (!class224.field3615) {
            class174.method1225(8, false);
            class224.method1524(true, 120);
            class201.method1385(-105, false);
            if (class50.field658 != null) {
                class152.method1010(0);
            }
        }
        if (class224.field3615) {
            class161.method1103(arg0 - 2318, false);
            class224.method1524(true, 123);
            class74.method508(true, false);
        }
        class25.method169(arg0 ^ 0x965);
        class224.method1524(true, 110);
        class248.method1668(false, class290.field4574, (byte) -81);
        class224.method1524(true, 105);
        int var8 = class23.field292;
        if (class276.field4398 < var8) {
            var8 = class276.field4398;
        }
        if ((class276.field4398 - 1) > var8) {
            int var9 = class276.field4398 - 1;
        }
        if (class26.method227(arg0 + 8606)) {
            class225.method1537(0);
        } else {
            class225.method1537(class23.field292);
        }
        class82.method568(-30);
        for (int var10 = 0; var10 < 104; var10++) {
            for (int var17 = 0; var17 < 104; var17++) {
                class106.method695(1, var10, var17);
            }
        }
        class199.method1376(false);
        class10.method63(arg0 + 11057);
        class273.method1838((byte) -125);
        class25.method169(70);
        if (class215.field3519 != null && class240.field3833 != null && class203.field3182 == 25) {
            class216.field3531++;
            class13.field165.method892(127, (byte) -80);
            class13.field165.method166(1057001181, -3);
        }
        if (!class224.field3615) {
            int var11 = (class179.field2794 - 6) / 8;
            int var12 = (class179.field2794 + 6) / 8;
            int var13 = (class138.field2043 - 6) / 8;
            int var14 = (class138.field2043 + 6) / 8;
            for (int var15 = var11 - 1; var15 <= (var12 + 1); var15++) {
                for (int var16 = var13 - 1; var16 <= (var14 + 1); var16++) {
                    if (var15 < var11 || var15 > var12 || var13 > var16 || var14 < var16) {
                        class102.field1582.method818("m" + var15 + "_" + var16, true);
                        class102.field1582.method818("l" + var15 + "_" + var16, true);
                    }
                }
            }
        }
        if (class203.field3182 == 28) {
            class245.method1650(10, (byte) -120);
        } else {
            class245.method1650(30, (byte) 63);
            if (class240.field3833 != null) {
                class13.field165.method892(88, (byte) -60);
            }
        }
        class85.method588(119);
        class10.method63(arg0 ^ 0x3D31);
        class236.method1601(true);
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ZBLd;Ld;I)Lfd;")
    private final class122 method1630(boolean arg0, byte arg1, class237 arg2, class237 arg3, int arg4) {
        field3863++;
        if (this.field3862 == null) {
            throw new RuntimeException();
        }
        this.field3862.field349 = arg4 * 8 + 5;
        if (this.field3862.field339.length <= this.field3862.field349) {
            throw new RuntimeException();
        } else if (this.field3865[arg4] == null) {
            if (arg1 != 61) {
                this.method1633(-2, (byte) 14, (class237) null, (class237) null);
            }
            int var6 = this.field3862.method214((byte) 44);
            int var7 = this.field3862.method214((byte) 44);
            class122 var8 = new class122(arg4, arg3, arg2, this.field3857, this.field3854, var6, var7, arg0);
            this.field3865[arg4] = var8;
            return var8;
        } else {
            return this.field3865[arg4];
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Z)Z")
    public final boolean method1631(boolean arg0) {
        if (!arg0) {
            field3866 = null;
        }
        field3858++;
        if (this.field3862 != null) {
            return true;
        }
        if (this.field3859 == null) {
            if (this.field3857.method1557((byte) 93)) {
                return false;
            }
            this.field3859 = this.field3857.method1558(255, 255, true, -21, (byte) 0);
        }
        if (this.field3859.field854) {
            return false;
        } else {
            this.field3862 = new class25(this.field3859.method432(24977));
            this.field3865 = new class122[(this.field3862.field339.length - 5) / 8];
            return true;
        }
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(I)V")
    public final void method1632(int arg0) {
        field3867++;
        if (this.field3865 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field3865.length; var2++) {
            if (this.field3865[var2] != null) {
                this.field3865[var2].method793((byte) 113);
            }
        }
        if (arg0 != -7049) {
            field3860 = null;
        }
        for (int var3 = 0; var3 < this.field3865.length; var3++) {
            if (this.field3865[var3] != null) {
                this.field3865[var3].method802(arg0 ^ 0x2021);
            }
        }
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(Lrg;Lrc;)V")
    public class241(class227 arg0, class67 arg1) {
        this.field3857 = arg0;
        this.field3854 = arg1;
        if (!this.field3857.method1557((byte) 93)) {
            this.field3859 = this.field3857.method1558(255, 255, true, -21, (byte) 0);
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IBLd;Ld;)Lfd;")
    public final class122 method1633(int arg0, byte arg1, class237 arg2, class237 arg3) {
        field3855++;
        if (arg1 > -24) {
            this.method1633(92, (byte) -67, (class237) null, (class237) null);
        }
        return this.method1630(true, (byte) 61, arg2, arg3, arg0);
    }
}
