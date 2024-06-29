import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public class class64 {

    @OriginalMember(owner = "client!pv", name = "c", descriptor = "I")
    public int field741 = 128;

    @OriginalMember(owner = "client!pv", name = "l", descriptor = "I")
    public int field750 = 128;

    @OriginalMember(owner = "client!pv", name = "m", descriptor = "I")
    public int field751;

    @OriginalMember(owner = "client!pv", name = "g", descriptor = "I")
    public int field745;

    @OriginalMember(owner = "client!pv", name = "h", descriptor = "I")
    public int field746;

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "I")
    public int field739;

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "Z")
    public static boolean field740 = false;

    @OriginalMember(owner = "client!pv", name = "d", descriptor = "I")
    public int field742;

    @OriginalMember(owner = "client!pv", name = "e", descriptor = "I")
    public static int field743;

    @OriginalMember(owner = "client!pv", name = "f", descriptor = "I")
    public int field744;

    @OriginalMember(owner = "client!pv", name = "j", descriptor = "I")
    public static int field748;

    @OriginalMember(owner = "client!pv", name = "k", descriptor = "I")
    public int field749;

    @OriginalMember(owner = "client!pv", name = "n", descriptor = "I")
    public static int field752;

    @OriginalMember(owner = "client!pv", name = "o", descriptor = "I")
    public int field753;

    @OriginalMember(owner = "client!pv", name = "i", descriptor = "Lha;")
    public static class116 field747;

    @OriginalMember(owner = "client!pv", name = "<init>", descriptor = "(I)V", line = 266)
    public class64(int arg0) {
        this.field751 = arg0;
    }

    @OriginalMember(owner = "client!pv", name = "<init>", descriptor = "(IIIIII)V", line = 273)
    private class64(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field751 = arg0;
        this.field745 = arg4;
        this.field746 = arg5;
        this.field739 = arg3;
        this.field750 = arg1;
        this.field741 = arg2;
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(III)Llaa;", line = 21)
    public static final class578 method399(int arg0, int arg1, int arg2) {
        class415 var3 = class526.field7777[arg0][arg1][arg2];
        return var3 == null ? null : var3.field5978;
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(I)V", line = 28)
    public static void method400(int arg0) {
        if (arg0 <= 1) {
            field747 = null;
        }
        field747 = null;
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(Lpv;B)V", line = 39)
    public final void method401(class64 arg0, byte arg1) {
        this.field745 = arg0.field745;
        this.field746 = arg0.field746;
        this.field751 = arg0.field751;
        if (arg1 == 33) {
            this.field741 = arg0.field741;
            this.field750 = arg0.field750;
            field743++;
            this.field739 = arg0.field739;
        }
    }

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "(I)Lpv;", line = 55)
    public final class64 method402(int arg0) {
        field748++;
        if (arg0 > -74) {
            method399(9, 106, -4);
        }
        return new class64(this.field751, this.field750, this.field741, this.field739, this.field745, this.field746);
    }

    @OriginalMember(owner = "client!pv", name = "c", descriptor = "(I)V", line = 72)
    public static final void method403(int arg0) {
        field752++;
        if (class94.field1158.method2676(class239.field3499, 127) != 2) {
            return;
        }
        byte var1 = (byte) (class614.field9000 - 4 & 0xFF);
        int var2 = class614.field9000 % class35.field399;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var16 = 0; var16 < class382.field5586; var16++) {
                class22.field197[var3][var2][var16] = var1;
            }
        }
        if (class355.field5157 == 3) {
            return;
        }
        if (arg0 != -11075) {
            field740 = true;
        }
        for (int var4 = 0; var4 < 2; var4++) {
            class109.field1384[var4] = -1000000;
            class89.field1133[var4] = 1000000;
            class200.field3004[var4] = 0;
            class190.field2886[var4] = 1000000;
            class426.field6079[var4] = 0;
        }
        if (class287.field4232 != 1) {
            int var5 = class226.method1477(class355.field5157, true, class358.field5200, class367.field5319);
            if (var5 - class111.field1412 < 800 && (class237.field3473[class355.field5157][class358.field5200 >> 7][class367.field5319 >> 7] & 0x4) != 0) {
                class527.method3118(class358.field5200 >> 7, 1, class526.field7777, false, class367.field5319 >> 7, 97);
                return;
            }
            return;
        }
        if ((class237.field3473[class355.field5157][class239.field3493.field3464 >> 7][class239.field3493.field3463 >> 7] & 0x4) != 0) {
            class527.method3118(class239.field3493.field3464 >> 7, 0, class526.field7777, false, class239.field3493.field3463 >> 7, -80);
        }
        if (class151.field1935 >= 2560) {
            return;
        }
        int var6 = class358.field5200 >> 7;
        int var7 = class367.field5319 >> 7;
        int var8 = class239.field3493.field3464 >> 7;
        int var9 = class239.field3493.field3463 >> 7;
        int var10;
        if (var8 > var6) {
            var10 = var8 - var6;
        } else {
            var10 = var6 - var8;
        }
        int var11;
        if (var9 > var7) {
            var11 = var9 - var7;
        } else {
            var11 = var7 - var9;
        }
        if (var10 == 0 && var11 == 0 || var10 <= -class35.field399 || class35.field399 <= var10 || var11 <= -class382.field5586 || var11 >= class382.field5586) {
            class31.method140("RC: " + var6 + "," + var7 + " " + var8 + "," + var9 + " " + class584.field8677 + "," + class424.field6061, arg0 + 10958, null);
            return;
        }
        if (var11 < var10) {
            int var12 = var11 * 65536 / var10;
            int var13 = 32768;
            while (var6 != var8) {
                if (var6 < var8) {
                    var6++;
                } else if (var8 < var6) {
                    var6--;
                }
                if ((class237.field3473[class355.field5157][var6][var7] & 0x4) != 0) {
                    class527.method3118(var6, 1, class526.field7777, false, var7, -105);
                    return;
                }
                var13 += var12;
                if (var13 >= 65536) {
                    var13 -= 65536;
                    if (var9 > var7) {
                        var7++;
                    } else if (var7 > var9) {
                        var7--;
                    }
                    if ((class237.field3473[class355.field5157][var6][var7] & 0x4) != 0) {
                        class527.method3118(var6, 1, class526.field7777, false, var7, -112);
                        return;
                    }
                }
            }
            return;
        }
        int var14 = var10 * 65536 / var11;
        int var15 = 32768;
        while (var7 != var9) {
            if (var9 > var7) {
                var7++;
            } else if (var9 < var7) {
                var7--;
            }
            if ((class237.field3473[class355.field5157][var6][var7] & 0x4) != 0) {
                class527.method3118(var6, 1, class526.field7777, false, var7, -77);
                return;
            }
            var15 += var14;
            if (var15 >= 65536) {
                var15 -= 65536;
                if (var6 < var8) {
                    var6++;
                } else if (var6 > var8) {
                    var6--;
                }
                if ((class237.field3473[class355.field5157][var6][var7] & 0x4) != 0) {
                    class527.method3118(var6, 1, class526.field7777, false, var7, arg0 ^ 0x2B50);
                    return;
                }
            }
        }
    }
}
