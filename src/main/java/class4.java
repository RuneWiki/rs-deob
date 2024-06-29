import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public class class4 {

    @OriginalMember(owner = "client!ft", name = "r", descriptor = "Lol;")
    public class179 field45 = new class179();

    @OriginalMember(owner = "client!ft", name = "p", descriptor = "Z")
    public static boolean field43;

    @OriginalMember(owner = "client!ft", name = "q", descriptor = "[J")
    public static long[] field44;

    @OriginalMember(owner = "client!ft", name = "s", descriptor = "Lbg;")
    public static class310 field46;

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "client!ft", name = "c", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!ft", name = "d", descriptor = "I")
    public static int field31;

    @OriginalMember(owner = "client!ft", name = "e", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!ft", name = "g", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "client!ft", name = "h", descriptor = "I")
    public static int field35;

    @OriginalMember(owner = "client!ft", name = "i", descriptor = "I")
    public static int field36;

    @OriginalMember(owner = "client!ft", name = "j", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "client!ft", name = "k", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!ft", name = "l", descriptor = "I")
    public static int field39;

    @OriginalMember(owner = "client!ft", name = "m", descriptor = "I")
    public static int field40;

    @OriginalMember(owner = "client!ft", name = "n", descriptor = "I")
    public static int field41;

    @OriginalMember(owner = "client!ft", name = "o", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!ft", name = "f", descriptor = "Lig;")
    public static class154 field33;

    @OriginalMember(owner = "client!ft", name = "t", descriptor = "Lol;")
    private class179 field47;

    static {
        new class423("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.");
        field43 = false;
        field44 = new long[32];
        field46 = new class310(36, 2);
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(ILol;)V", line = 8)
    public final void method4(int arg0, class179 arg1) {
        if (arg1.field2795 != null) {
            arg1.method1121(false);
        }
        field31++;
        arg1.field2795 = this.field45.field2795;
        arg1.field2799 = this.field45;
        arg1.field2795.field2799 = arg1;
        arg1.field2799.field2795 = arg1;
        if (arg0 != 1) {
            method15(null);
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lft;Lol;B)V", line = 26)
    private final void method5(class4 arg0, class179 arg1, byte arg2) {
        if (arg2 > -10) {
            this.method12(null, 69);
        }
        field34++;
        class179 var4 = this.field45.field2795;
        this.field45.field2795 = arg1.field2795;
        arg1.field2795.field2799 = this.field45;
        if (this.field45 != arg1) {
            arg1.field2795 = arg0.field45.field2795;
            arg1.field2795.field2799 = arg1;
            var4.field2799 = arg0.field45;
            arg0.field45.field2795 = var4;
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(I)I", line = 52)
    public final int method6(int arg0) {
        field40++;
        int var2 = 0;
        class179 var3 = this.field45.field2799;
        while (this.field45 != var3) {
            var3 = var3.field2799;
            var2++;
        }
        if (arg0 != 18328) {
            this.field47 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(Z)Lol;", line = 74)
    public final class179 method7(boolean arg0) {
        field32++;
        class179 var2 = this.field45.field2799;
        if (this.field45 == var2) {
            return null;
        } else {
            var2.method1121(arg0);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(B)Lol;", line = 91)
    public final class179 method8(byte arg0) {
        field37++;
        class179 var2 = this.field45.field2799;
        if (this.field45 == var2) {
            this.field47 = null;
            return null;
        }
        if (arg0 != -98) {
            method16((byte) 63);
        }
        this.field47 = var2.field2799;
        return var2;
    }

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "(B)Lol;", line = 120)
    public final class179 method9(byte arg0) {
        field39++;
        if (arg0 > -65) {
            this.method13(false);
        }
        class179 var2 = this.field45.field2795;
        if (this.field45 == var2) {
            this.field47 = null;
            return null;
        } else {
            this.field47 = var2.field2795;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "(I)Lol;", line = 146)
    public final class179 method10(int arg0) {
        field30++;
        if (arg0 != 2) {
            this.method11(7, null);
        }
        class179 var2 = this.field47;
        if (this.field45 == var2) {
            this.field47 = null;
            return null;
        } else {
            this.field47 = var2.field2795;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "(ILol;)V", line = 169)
    public final void method11(int arg0, class179 arg1) {
        if (arg1.field2795 != null) {
            arg1.method1121(false);
        }
        if (arg0 > -39) {
            this.field45 = null;
        }
        field38++;
        arg1.field2795 = this.field45;
        arg1.field2799 = this.field45.field2799;
        arg1.field2795.field2799 = arg1;
        arg1.field2799.field2795 = arg1;
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lft;I)V", line = 190)
    public final void method12(class4 arg0, int arg1) {
        if (arg1 == -50) {
            field41++;
            this.method5(arg0, this.field45.field2799, (byte) -23);
        }
    }

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "(Z)V", line = 201)
    public final void method13(boolean arg0) {
        field28++;
        while (true) {
            class179 var2 = this.field45.field2799;
            if (this.field45 == var2) {
                this.field47 = null;
                if (arg0) {
                    field44 = null;
                    return;
                } else {
                    return;
                }
            }
            var2.method1121(false);
        }
    }

    @OriginalMember(owner = "client!ft", name = "c", descriptor = "(I)Z", line = 223)
    public final boolean method14(int arg0) {
        field35++;
        if (arg0 != 0) {
            this.method4(64, null);
        }
        return this.field45.field2799 == this.field45;
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(Leh;)V", line = 235)
    public static final void method15(class233 arg0) {
        if (class51.field766 >= 65535) {
            return;
        }
        class480 var1 = arg0.field3534;
        class162.field2532[class51.field766] = arg0;
        class467.field7164[class51.field766] = false;
        class51.field766++;
        int var2 = arg0.field3541;
        if (arg0.field3550) {
            var2 = 0;
        }
        int var3 = arg0.field3541;
        if (arg0.field3531) {
            var3 = class483.field7381 - 1;
        }
        for (int var4 = var2; var4 <= var3; var4++) {
            int var5 = 0;
            int var6 = var1.method2900((byte) -31) + class42.field621 - var1.method2894((byte) -111) >> class239.field3602;
            if (var6 < 0) {
                var5 -= var6;
                var6 = 0;
            }
            int var7 = var1.method2900((byte) -31) + var1.method2894((byte) -118) - class42.field621 >> class239.field3602;
            if (var7 >= class347.field5132) {
                var7 = class347.field5132 - 1;
            }
            for (int var8 = var6; var8 <= var7; var8++) {
                short var9 = arg0.field3545[var5++];
                int var10 = (var1.method2895(0) + class42.field621 - var1.method2894((byte) -96) >> class239.field3602) + (var9 >>> 8);
                int var11 = (var9 & 0xFF) + var10 - 1;
                if (var10 < 0) {
                    var10 = 0;
                }
                if (var11 >= class377.field5492) {
                    var11 = class377.field5492 - 1;
                }
                for (int var12 = var10; var12 <= var11; var12++) {
                    long var13 = class155.field2450[var4][var12][var8];
                    if ((var13 & 0xFFFFL) == 0L) {
                        class155.field2450[var4][var12][var8] = var13 | (long) class51.field766;
                    } else if ((var13 & 0xFFFF0000L) == 0L) {
                        class155.field2450[var4][var12][var8] = var13 | (long) class51.field766 << 16;
                    } else if ((var13 & 0xFFFF00000000L) == 0L) {
                        class155.field2450[var4][var12][var8] = var13 | (long) class51.field766 << 32;
                    } else if ((var13 & 0xFFFF000000000000L) == 0L) {
                        class155.field2450[var4][var12][var8] = var13 | (long) class51.field766 << 48;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ft", name = "c", descriptor = "(B)V", line = 334)
    public static final void method16(byte arg0) {
        field42++;
        class329.field4937.method1995(((float) class463.field7116.field2968 * 0.1F + 0.7F) * 1.1523438F);
        if (arg0 < 23) {
            method19(-24);
        }
        class329.field4937.method1941(class103.field1832, 0.69921875F, 1.2F, -50.0F, -60.0F, -50.0F);
        class329.field4937.method1947(class76.field1369, -1, 256);
        class329.field4937.method1914(class295.field4487);
    }

    @OriginalMember(owner = "client!ft", name = "d", descriptor = "(B)Lol;", line = 348)
    public final class179 method17(byte arg0) {
        field29++;
        class179 var2 = this.field47;
        int var3 = 21 / ((arg0 + 11) / 49);
        if (this.field45 == var2) {
            this.field47 = null;
            return null;
        } else {
            this.field47 = var2.field2799;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(III)V", line = 367)
    public static final void method18(int arg0, int arg1, int arg2) {
        if (arg0 != 1516) {
            field33 = null;
        }
        field36++;
        class400.method2379((byte) -75, class188.field2976);
        class304.field4623++;
        class230.field3508.method263(arg2, (byte) -117);
        class230.field3508.method253(-102, arg1);
    }

    @OriginalMember(owner = "client!ft", name = "d", descriptor = "(I)V", line = 391)
    public static void method19(int arg0) {
        field44 = null;
        if (arg0 <= -97) {
            field33 = null;
            field46 = null;
        }
    }

    @OriginalMember(owner = "client!ft", name = "<init>", descriptor = "()V", line = 407)
    public class4() {
        this.field45.field2795 = this.field45;
        this.field45.field2799 = this.field45;
    }
}
