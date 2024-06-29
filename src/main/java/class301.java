import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class class301 implements class217 {

    @OriginalMember(owner = "client!cs", name = "e", descriptor = "Ltl;")
    private class570 field3696;

    @OriginalMember(owner = "client!cs", name = "f", descriptor = "Lrga;")
    public static class280 field3697 = new class280(39, 16);

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "I")
    public static int field3692;

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "I")
    public static int field3693;

    @OriginalMember(owner = "client!cs", name = "c", descriptor = "I")
    public static int field3694;

    @OriginalMember(owner = "client!cs", name = "d", descriptor = "I")
    public static int field3695;

    @OriginalMember(owner = "client!cs", name = "h", descriptor = "I")
    public static int field3699;

    @OriginalMember(owner = "client!cs", name = "g", descriptor = "Ldg;")
    public static class20 field3698;

    @OriginalMember(owner = "client!cs", name = "i", descriptor = "Lpl;")
    public static class612 field3700;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)V", line = 3)
    public final void method394(int arg0) {
        field3692++;
        if (arg0 >= -41) {
            this.method395(true, -111);
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(B)Z", line = 15)
    public final boolean method392(byte arg0) {
        if (arg0 == 82) {
            field3695++;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(ZI)V", line = 28)
    public final void method395(boolean arg0, int arg1) {
        field3694++;
        if (arg0) {
            class32.field452.method1090(0, 0, class523.field7111, class244.field3022, this.field3696.field7975, 0);
        }
        if (arg1 != 6621) {
            field3697 = null;
        }
    }

    @OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Ltl;)V", line = 43)
    public class301(class570 arg0) {
        this.field3696 = arg0;
    }

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "(I)V", line = 51)
    public static final void method1668(int arg0) {
        field3693++;
        if (field3698.method143(-63, class651.field9191) != 2) {
            return;
        }
        if (arg0 <= 52) {
            field3697 = null;
        }
        byte var1 = (byte) (class673.field9473 - 4 & 0xFF);
        int var2 = class673.field9473 % class431.field5395;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var18 = 0; var18 < class452.field5802; var18++) {
                class569.field7970[var3][var2][var18] = var1;
            }
        }
        if (class476.field6039 == 3) {
            return;
        }
        for (int var4 = 0; var4 < 2; var4++) {
            class540.field7233[var4] = -1000000;
            class289.field3588[var4] = 1000000;
            class389.field4915[var4] = 0;
            class215.field2671[var4] = 1000000;
            class693.field9833[var4] = 0;
        }
        int var5 = class376.field4748.field6461;
        int var6 = class376.field4748.field6464;
        if (class296.field3661 != 1 && class306.field3890 == -1) {
            int var7 = class467.method2469(class20.field292, class476.field6039, -20214, class276.field3464);
            if (var7 - class571.field7982 < 3200 && (class10.field190[class476.field6039][class20.field292 >> 9][class276.field3464 >> 9] & 0x4) != 0) {
                class383.method2070(false, 1, class276.field3464 >> 9, (byte) 92, class20.field292 >> 9, class270.field3423);
                return;
            }
            return;
        }
        if (class296.field3661 != 1) {
            var6 = class196.field2471;
            var5 = class306.field3890;
        }
        if ((class10.field190[class476.field6039][var5 >> 9][var6 >> 9] & 0x4) != 0) {
            class383.method2070(false, 0, var6 >> 9, (byte) 88, var5 >> 9, class270.field3423);
        }
        if (class215.field2673 >= 2560) {
            return;
        }
        int var8 = class20.field292 >> 9;
        int var9 = class276.field3464 >> 9;
        int var10 = var5 >> 9;
        int var11 = var6 >> 9;
        int var12;
        if (var8 >= var10) {
            var12 = var8 - var10;
        } else {
            var12 = var10 - var8;
        }
        int var13;
        if (var9 < var11) {
            var13 = var11 - var9;
        } else {
            var13 = var9 - var11;
        }
        if (var12 == 0 && var13 == 0 || var12 <= -class431.field5395 || class431.field5395 <= var12 || var13 <= (-class452.field5802) || class452.field5802 <= var13) {
            class106.method597("RC: " + var8 + "," + var9 + " " + var10 + "," + var11 + " " + class145.field1879 + "," + class630.field8817, -2, null);
            return;
        }
        if (var13 < var12) {
            int var14 = var13 * 65536 / var12;
            int var15 = 32768;
            while (var8 != var10) {
                if (var8 < var10) {
                    var8++;
                } else if (var10 < var8) {
                    var8--;
                }
                if ((class10.field190[class476.field6039][var8][var9] & 0x4) != 0) {
                    class383.method2070(false, 1, var9, (byte) 126, var8, class270.field3423);
                    return;
                }
                var15 += var14;
                if (var15 >= 65536) {
                    var15 -= 65536;
                    if (var9 < var11) {
                        var9++;
                    } else if (var11 < var9) {
                        var9--;
                    }
                    if ((class10.field190[class476.field6039][var8][var9] & 0x4) != 0) {
                        class383.method2070(false, 1, var9, (byte) 82, var8, class270.field3423);
                        return;
                    }
                }
            }
            return;
        }
        int var16 = var12 * 65536 / var13;
        int var17 = 32768;
        while (var9 != var11) {
            if (var9 < var11) {
                var9++;
            } else if (var11 < var9) {
                var9--;
            }
            if ((class10.field190[class476.field6039][var8][var9] & 0x4) != 0) {
                class383.method2070(false, 1, var9, (byte) 77, var8, class270.field3423);
                return;
            }
            var17 += var16;
            if (var17 >= 65536) {
                var17 -= 65536;
                if (var10 > var8) {
                    var8++;
                } else if (var8 > var10) {
                    var8--;
                }
                if ((class10.field190[class476.field6039][var8][var9] & 0x4) != 0) {
                    class383.method2070(false, 1, var9, (byte) 95, var8, class270.field3423);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(Z)V", line = 259)
    public static void method1669(boolean arg0) {
        field3698 = null;
        field3700 = null;
        if (!arg0) {
            field3700 = null;
        }
        field3697 = null;
    }
}
