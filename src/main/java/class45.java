import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class45 {

    @OriginalMember(owner = "client!hi", name = "h", descriptor = "Lcd;")
    private class65 field589;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "Liv;")
    private class289 field582;

    @OriginalMember(owner = "client!hi", name = "l", descriptor = "Lrp;")
    private class274 field593;

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "I")
    public static int field583;

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "I")
    public static int field584;

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "I")
    public static int field585;

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "I")
    public static int field586;

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "I")
    public static int field587;

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "I")
    public static int field588;

    @OriginalMember(owner = "client!hi", name = "i", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!hi", name = "m", descriptor = "I")
    public static int field594;

    @OriginalMember(owner = "client!hi", name = "j", descriptor = "Lde;")
    public static class10 field591;

    @OriginalMember(owner = "client!hi", name = "k", descriptor = "Lgk;")
    private class468 field592;

    @OriginalMember(owner = "client!hi", name = "n", descriptor = "[Lws;")
    private class440[] field595;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILur;Lur;IZ)Lws;", line = 14)
    private final class440 method345(int arg0, class292 arg1, class292 arg2, int arg3, boolean arg4) {
        field583++;
        if (arg3 < 6) {
            return null;
        } else if (this.field592 == null) {
            throw new RuntimeException();
        } else {
            this.field592.field6830 = arg0 * 8 + 5;
            if (this.field592.field6868.length <= this.field592.field6830) {
                throw new RuntimeException();
            } else if (this.field595[arg0] == null) {
                int var6 = this.field592.method2722(false);
                int var7 = this.field592.method2722(false);
                class440 var8 = new class440(arg0, arg1, arg2, this.field582, this.field589, var6, var7, arg4);
                this.field595[arg0] = var8;
                return var8;
            } else {
                return this.field595[arg0];
            }
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Z)V", line = 53)
    public static final void method346(boolean arg0) {
        class460.field6710++;
        class97.method758(class450.field6618, false);
        field594++;
        class43.field559.method2754(class437.method2568(-32), 5574);
        if (arg0) {
            class43.field559.method2777((byte) 74, class155.field2347);
            class43.field559.method2777((byte) 74, class413.field6241);
            class43.field559.method2754(class454.field6661.field993, 5574);
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIII)Lkh;", line = 69)
    public static final class400 method347(int arg0, int arg1, int arg2, int arg3) {
        field585++;
        class306 var4 = class236.field3305[arg1][arg2][arg0];
        if (var4 == null) {
            return null;
        }
        if (arg3 < 70) {
            method348((byte) 35);
        }
        class400 var5 = null;
        int var6 = -1;
        for (class17 var7 = var4.field4589; var7 != null; var7 = var7.field281) {
            class522 var8 = var7.field279;
            if (var8 instanceof class400) {
                class400 var9 = (class400) var8;
                int var10 = var9.method2419((byte) 112) * 64 + 60 - 64;
                int var11 = var9.field7681 - var10 >> 7;
                int var12 = var9.field7671 - var10 >> 7;
                int var13 = var9.field7681 + var10 >> 7;
                int var14 = var9.field7671 + var10 >> 7;
                if (var11 <= arg2 && var12 <= arg0 && arg2 <= var13 && var14 >= arg0) {
                    int var15 = (var13 + 1 - arg2) * (var14 + 1 - arg0);
                    if (var15 > var6) {
                        var5 = var9;
                        var6 = var15;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)V", line = 128)
    public static void method348(byte arg0) {
        field591 = null;
        if (arg0 >= -94) {
            method347(124, 104, -113, 74);
        }
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(B)V", line = 142)
    public final void method349(byte arg0) {
        if (arg0 > -81) {
            method350(-123);
        }
        field584++;
        if (this.field595 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field595.length; var2++) {
            if (this.field595[var2] != null) {
                this.field595[var2].method2579(-68);
            }
        }
        for (int var3 = 0; var3 < this.field595.length; var3++) {
            if (this.field595[var3] != null) {
                this.field595[var3].method2584(-85);
            }
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)I", line = 178)
    public static final int method350(int arg0) {
        field590++;
        if (arg0 != 1) {
            method346(false);
        }
        if (class251.field3435 == null) {
            if (!class495.field7350 && class448.field6610 > 0) {
                if (class80.field1107 && class49.field630.method1879(81, true) && class448.field6610 > 2) {
                    return ((class477) class154.field2334.field7365.field1736.field1736).field7032;
                }
                return ((class477) class154.field2334.field7365.field1736).field7032;
            }
            int var1 = field591.method44((byte) 110);
            int var2 = field591.method54(arg0 ^ 0x6F26);
            int var3 = class148.field2227;
            int var4 = class274.field4094;
            int var5 = class88.field1383;
            if (var1 > var3 && (var3 + var5) > var1) {
                int var6 = -1;
                for (int var7 = 0; var7 < class448.field6610; var7++) {
                    if (class56.field774) {
                        int var11 = var4 + ((class448.field6610 - var7 - 1) * 16) + 33;
                        if (var2 > (var11 - 13) && var2 <= var11 + 3) {
                            var6 = var7;
                        }
                    } else {
                        int var12 = (class448.field6610 - var7 - 1) * 16 + var4 + 31;
                        if (var12 - 13 < var2 && var12 + 3 >= var2) {
                            var6 = var7;
                        }
                    }
                }
                if (var6 != -1) {
                    int var8 = 0;
                    class535 var9 = new class535(class154.field2334);
                    for (class477 var10 = (class477) var9.method3164((byte) -123); var10 != null; var10 = (class477) var9.method3162((byte) -91)) {
                        if (var6 == var8++) {
                            return var10.field7032;
                        }
                    }
                }
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(I)Z", line = 271)
    public final boolean method351(int arg0) {
        field588++;
        if (this.field592 != null) {
            return true;
        }
        if (arg0 != 8) {
            this.field595 = null;
        }
        if (this.field593 == null) {
            if (this.field582.method1794((byte) -1)) {
                return false;
            }
            this.field593 = this.field582.method1796(255, 255, -98, true, (byte) 0);
        }
        if (this.field593.field7421) {
            return false;
        } else {
            this.field592 = new class468(this.field593.method682(48));
            this.field595 = new class440[(this.field592.field6868.length - 5) / 8];
            return true;
        }
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(Liv;Lcd;)V", line = 301)
    public class45(class289 arg0, class65 arg1) {
        this.field589 = arg1;
        this.field582 = arg0;
        if (!this.field582.method1794((byte) -1)) {
            this.field593 = this.field582.method1796(255, 255, -90, true, (byte) 0);
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(BI)I", line = 314)
    public static final int method352(byte arg0, int arg1) {
        field586++;
        int var2 = arg1 >>> 1;
        if (arg0 > -94) {
            method346(true);
        }
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return ~var7 & arg1;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lur;ILur;I)Lws;", line = 332)
    public final class440 method353(class292 arg0, int arg1, class292 arg2, int arg3) {
        field587++;
        return arg3 < 18 ? null : this.method345(arg1, arg0, arg2, 97, true);
    }
}
