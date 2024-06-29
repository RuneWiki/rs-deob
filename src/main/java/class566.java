import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class class566 {

    @OriginalMember(owner = "client!cs", name = "f", descriptor = "Lme;")
    private class668 field7393 = new class668(64);

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "Lpe;")
    private class615 field7388;

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "I")
    public int field7389;

    @OriginalMember(owner = "client!cs", name = "d", descriptor = "I")
    public static int field7391 = 0;

    @OriginalMember(owner = "client!cs", name = "c", descriptor = "I")
    public static int field7390;

    @OriginalMember(owner = "client!cs", name = "e", descriptor = "I")
    public static int field7392;

    @OriginalMember(owner = "client!cs", name = "g", descriptor = "I")
    public static int field7394;

    @OriginalMember(owner = "client!cs", name = "h", descriptor = "I")
    public static int field7395;

    @OriginalMember(owner = "client!cs", name = "i", descriptor = "I")
    public static int field7396;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(ZI)Lvl;", line = 6)
    public final class316 method3023(boolean arg0, int arg1) {
        field7392++;
        class668 var3 = this.field7393;
        class316 var4;
        synchronized (this.field7393) {
            var4 = (class316) this.field7393.method3655(-116, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        if (!arg0) {
            this.field7393 = null;
        }
        class615 var5 = this.field7388;
        byte[] var6;
        synchronized (this.field7388) {
            var6 = this.field7388.method3346(-1, 16, arg1);
        }
        class316 var7 = new class316();
        if (var6 != null) {
            var7.method1849(0, new class418(var6));
        }
        class668 var8 = this.field7393;
        synchronized (this.field7393) {
            this.field7393.method3650((long) arg1, -105, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(Z)V", line = 41)
    public final void method3024(boolean arg0) {
        class668 var2 = this.field7393;
        synchronized (this.field7393) {
            if (arg0) {
                field7391 = 29;
            }
            this.field7393.method3658(0);
        }
        field7390++;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(B)V", line = 54)
    public static final void method3025(byte arg0) {
        field7396++;
        if (class260.field3509.method1579(class364.field4697, true) != 2) {
            return;
        }
        byte var1 = (byte) (class413.field5318 - 4 & 0xFF);
        int var2 = class413.field5318 % class611.field8258;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var16 = 0; var16 < class656.field9155; var16++) {
                class605.field8192[var3][var2][var16] = var1;
            }
        }
        if (class390.field4991 == 3 || arg0 != 3) {
            return;
        }
        for (int var4 = 0; var4 < 2; var4++) {
            class625.field8742[var4] = -1000000;
            class505.field6644[var4] = 1000000;
            class457.field5991[var4] = 0;
            class37.field544[var4] = 1000000;
            class354.field4578[var4] = 0;
        }
        if (class704.field9810 != 1) {
            int var5 = class332.method1916(1218445319, class549.field7132, class390.field4991, class499.field6555);
            if ((var5 - class655.field9120) < 3200 && (class159.field1994[class390.field4991][class499.field6555 >> 9][class549.field7132 >> 9] & 0x4) != 0) {
                class201.method1310((byte) -75, class483.field6438, false, class499.field6555 >> 9, class549.field7132 >> 9, 1);
                return;
            }
            return;
        }
        if ((class159.field1994[class390.field4991][class233.field3130.field506 >> 9][class233.field3130.field503 >> 9] & 0x4) != 0) {
            class201.method1310((byte) -75, class483.field6438, false, class233.field3130.field506 >> 9, class233.field3130.field503 >> 9, 0);
        }
        if (class299.field3911 >= 2560) {
            return;
        }
        int var6 = class499.field6555 >> 9;
        int var7 = class549.field7132 >> 9;
        int var8 = class233.field3130.field506 >> 9;
        int var9 = class233.field3130.field503 >> 9;
        int var10;
        if (var6 < var8) {
            var10 = var8 - var6;
        } else {
            var10 = var6 - var8;
        }
        int var11;
        if (var7 < var9) {
            var11 = var9 - var7;
        } else {
            var11 = var7 - var9;
        }
        if (var10 == 0 && var11 == 0 || (-class611.field8258) >= var10 || var10 >= class611.field8258 || -class656.field9155 >= var11 || var11 >= class656.field9155) {
            class698.method3809("RC: " + var6 + "," + var7 + " " + var8 + "," + var9 + " " + class100.field1326 + "," + class186.field2376, (byte) 124, null);
            return;
        }
        if (var11 >= var10) {
            int var12 = var10 * 65536 / var11;
            int var13 = 32768;
            while (var7 != var9) {
                if (var7 < var9) {
                    var7++;
                } else if (var7 > var9) {
                    var7--;
                }
                if ((class159.field1994[class390.field4991][var6][var7] & 0x4) != 0) {
                    class201.method1310((byte) -75, class483.field6438, false, var6, var7, 1);
                    return;
                }
                var13 += var12;
                if (var13 >= 65536) {
                    if (var6 < var8) {
                        var6++;
                    } else if (var8 < var6) {
                        var6--;
                    }
                    var13 -= 65536;
                    if ((class159.field1994[class390.field4991][var6][var7] & 0x4) != 0) {
                        class201.method1310((byte) -75, class483.field6438, false, var6, var7, 1);
                        return;
                    }
                }
            }
            return;
        }
        int var14 = var11 * 65536 / var10;
        int var15 = 32768;
        while (var6 != var8) {
            if (var6 < var8) {
                var6++;
            } else if (var6 > var8) {
                var6--;
            }
            if ((class159.field1994[class390.field4991][var6][var7] & 0x4) != 0) {
                class201.method1310((byte) -75, class483.field6438, false, var6, var7, 1);
                return;
            }
            var15 += var14;
            if (var15 >= 65536) {
                if (var7 < var9) {
                    var7++;
                } else if (var9 < var7) {
                    var7--;
                }
                var15 -= 65536;
                if ((class159.field1994[class390.field4991][var6][var7] & 0x4) != 0) {
                    class201.method1310((byte) -75, class483.field6438, false, var6, var7, 1);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(II)V", line = 249)
    public final void method3026(int arg0, int arg1) {
        field7394++;
        class668 var3 = this.field7393;
        synchronized (this.field7393) {
            this.field7393.method3659(-128, arg1);
            if (arg0 < 87) {
                method3025((byte) -49);
            }
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)V", line = 265)
    public final void method3027(int arg0) {
        field7395++;
        class668 var2 = this.field7393;
        synchronized (this.field7393) {
            this.field7393.method3656((byte) 0);
        }
        if (arg0 != -9424) {
            this.method3026(-111, 46);
        }
    }

    @OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Lvd;ILpe;)V", line = 284)
    public class566(class635 arg0, int arg1, class615 arg2) {
        this.field7388 = arg2;
        if (this.field7388 == null) {
            this.field7389 = 0;
        } else {
            this.field7389 = this.field7388.method3341(16, -19046);
        }
    }
}
