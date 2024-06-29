import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class31 extends class118 {

    @OriginalMember(owner = "client!dc", name = "C", descriptor = "Lcf;")
    public class25 field666 = new class25();

    @OriginalMember(owner = "client!dc", name = "S", descriptor = "Lvd;")
    public class192 field681 = new class192();

    @OriginalMember(owner = "client!dc", name = "Q", descriptor = "Lwb;")
    private class199 field679;

    @OriginalMember(owner = "client!dc", name = "A", descriptor = "I")
    public static int field664 = 10;

    @OriginalMember(owner = "client!dc", name = "B", descriptor = "Ldh;")
    public static class36 field665 = new class36(8);

    @OriginalMember(owner = "client!dc", name = "H", descriptor = "Lcd;")
    public static class23 field670 = class54.method414("(U", -1);

    @OriginalMember(owner = "client!dc", name = "L", descriptor = "Lcd;")
    public static class23 field674 = class54.method414("Begeben Sie sich in ein freies Gebiet)1 um", -1);

    @OriginalMember(owner = "client!dc", name = "E", descriptor = "Lcd;")
    public static class23 field668 = class54.method414("<br>", -1);

    @OriginalMember(owner = "client!dc", name = "O", descriptor = "I")
    public static int field677 = 0;

    @OriginalMember(owner = "client!dc", name = "P", descriptor = "Lcd;")
    private static class23 field678 = class54.method414("Please wait 1 minute and try again)3", -1);

    @OriginalMember(owner = "client!dc", name = "G", descriptor = "Lcd;")
    public static class23 field669 = field678;

    @OriginalMember(owner = "client!dc", name = "K", descriptor = "Lcd;")
    public static class23 field673 = field678;

    @OriginalMember(owner = "client!dc", name = "t", descriptor = "I")
    public static int field657;

    @OriginalMember(owner = "client!dc", name = "u", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!dc", name = "v", descriptor = "I")
    public static int field659;

    @OriginalMember(owner = "client!dc", name = "w", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!dc", name = "x", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!dc", name = "y", descriptor = "I")
    public static int field662;

    @OriginalMember(owner = "client!dc", name = "z", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!dc", name = "D", descriptor = "I")
    public static int field667;

    @OriginalMember(owner = "client!dc", name = "I", descriptor = "I")
    public static int field671;

    @OriginalMember(owner = "client!dc", name = "J", descriptor = "I")
    public static int field672;

    @OriginalMember(owner = "client!dc", name = "M", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!dc", name = "R", descriptor = "I")
    public static int field680;

    @OriginalMember(owner = "client!dc", name = "N", descriptor = "[Loe;")
    public static class130[] field676;

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(B)V")
    public static void method228(byte arg0) {
        field665 = null;
        field669 = null;
        field668 = null;
        field674 = null;
        field670 = null;
        field673 = null;
        if (arg0 >= 96) {
            field678 = null;
            field676 = null;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILbb;)V")
    public static final void method229(int arg0, class12 arg1) {
        field680++;
        if (arg1.field271 == 0) {
            return;
        }
        if (arg1.field218 != -1 && arg1.field218 < 32768) {
            class182 var2 = class91.field1944[arg1.field218];
            if (var2 != null) {
                int var3 = arg1.field215 - var2.field215;
                int var4 = arg1.field277 - var2.field277;
                if (var3 != 0 || var4 != 0) {
                    arg1.field227 = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0 < 122) {
            method229(32, null);
        }
        if (arg1.field218 >= 32768) {
            int var5 = arg1.field218 - 32768;
            if (class15.field338 == var5) {
                var5 = 2047;
            }
            class57 var6 = class95.field2007[var5];
            if (var6 != null) {
                int var7 = arg1.field215 - var6.field215;
                int var8 = arg1.field277 - var6.field277;
                if (var7 != 0 || var8 != 0) {
                    arg1.field227 = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg1.field245 != 0 || arg1.field217 != 0) && (arg1.field247 == 0 || arg1.field284 > 0)) {
            int var9 = arg1.field215 - (arg1.field245 - class155.field3099 - class155.field3099) * 64;
            int var10 = arg1.field277 - (arg1.field217 - class94.field1989 - class94.field1989) * 64;
            if (var9 != 0 || var10 != 0) {
                arg1.field227 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
            }
            arg1.field217 = 0;
            arg1.field245 = 0;
        }
        int var11 = arg1.field227 - arg1.field264 & 0x7FF;
        if (var11 == 0) {
            arg1.field255 = 0;
            return;
        }
        arg1.field255++;
        if (var11 <= 1024) {
            arg1.field264 += arg1.field271;
            boolean var12 = true;
            if (var11 < arg1.field271 || var11 > 2048 - arg1.field271) {
                arg1.field264 = arg1.field227;
                var12 = false;
            }
            if (arg1.field262 == arg1.field250 && (arg1.field255 > 25 || var12)) {
                if (arg1.field226 == -1) {
                    arg1.field250 = arg1.field268;
                } else {
                    arg1.field250 = arg1.field226;
                }
            }
        } else {
            arg1.field264 -= arg1.field271;
            boolean var13 = true;
            if (arg1.field271 > var11 || var11 > 2048 - arg1.field271) {
                arg1.field264 = arg1.field227;
                var13 = false;
            }
            if (arg1.field262 == arg1.field250 && (arg1.field255 > 25 || var13)) {
                if (arg1.field251 == -1) {
                    arg1.field250 = arg1.field268;
                } else {
                    arg1.field250 = arg1.field251;
                }
            }
        }
        arg1.field264 &= 0x7FF;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(III)I")
    public static final int method230(int arg0, int arg1, int arg2) {
        field660++;
        class191 var3 = (class191) class204.field4021.method260((long) arg2, (byte) 28);
        if (arg0 < 34) {
            field670 = null;
        }
        if (var3 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var3.field3790.length) {
            return var3.field3790[arg1];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "()Lnb;")
    public final class118 method231() {
        field658++;
        class41 var1;
        do {
            var1 = (class41) this.field666.method185((byte) -102);
            if (var1 == null) {
                return null;
            }
        } while (var1.field876 == null);
        return var1.field876;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "()Lnb;")
    public final class118 method232() {
        field672++;
        class41 var1 = (class41) this.field666.method188((byte) 54);
        if (var1 == null) {
            return null;
        } else if (var1.field876 == null) {
            return this.method231();
        } else {
            return var1.field876;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IZLed;)V")
    private final void method233(int arg0, boolean arg1, class41 arg2) {
        field661++;
        if (arg1) {
            method230(119, -40, -29);
        }
        if ((this.field679.field3901[arg2.field867] & 0x4) != 0 && arg2.field881 < 0) {
            int var4 = this.field679.field3919[arg2.field867] / class48.field1163;
            int var5 = (var4 + 1048575 - arg2.field872) / var4;
            arg2.field872 = arg0 * var4 + arg2.field872 & 0xFFFFF;
            if (var5 <= arg0) {
                if (this.field679.field3914[arg2.field867] == 0) {
                    arg2.field876 = class171.method1077(arg2.field887, arg2.field876.method1071(), arg2.field876.method1063(), arg2.field876.method1060());
                } else {
                    arg2.field876 = class171.method1077(arg2.field887, arg2.field876.method1071(), 0, arg2.field876.method1060());
                    this.field679.method1307(arg2, -1, arg2.field883.field310[arg2.field873] < 0);
                }
                if (arg2.field883.field310[arg2.field873] < 0) {
                    arg2.field876.method1048(-1);
                }
                arg0 = arg2.field872 / var4;
            }
        }
        arg2.field876.method236(arg0);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "([III)V")
    public final void method234(int[] arg0, int arg1, int arg2) {
        field662++;
        this.field681.method234(arg0, arg1, arg2);
        for (class41 var4 = (class41) this.field666.method188((byte) 54); var4 != null; var4 = (class41) this.field666.method185((byte) -102)) {
            if (!this.field679.method1302(-45, var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field865) {
                        this.method237(0, arg0, var5, var4, var5 + var6, var6);
                        var4.field865 -= var6;
                        break;
                    }
                    this.method237(0, arg0, var5, var4, var5 + var6, var4.field865);
                    var5 += var4.field865;
                    var6 -= var4.field865;
                } while (!this.field679.method1318(var6, -99, var5, arg0, var4));
            }
        }
    }

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "()I")
    public final int method235() {
        field663++;
        return 0;
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(I)V")
    public final void method236(int arg0) {
        this.field681.method236(arg0);
        field671++;
        for (class41 var2 = (class41) this.field666.method188((byte) 54); var2 != null; var2 = (class41) this.field666.method185((byte) -102)) {
            if (!this.field679.method1302(-73, var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field865) {
                        this.method233(var3, false, var2);
                        var2.field865 -= var3;
                        break;
                    }
                    this.method233(var2.field865, false, var2);
                    var3 -= var2.field865;
                } while (!this.field679.method1318(var3, -55, 0, null, var2));
            }
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I[IILed;II)V")
    private final void method237(int arg0, int[] arg1, int arg2, class41 arg3, int arg4, int arg5) {
        field657++;
        if ((this.field679.field3901[arg3.field867] & 0x4) != arg0 && arg3.field881 < 0) {
            int var7 = this.field679.field3919[arg3.field867] / class48.field1163;
            while (true) {
                int var8 = (var7 + 1048575 - arg3.field872) / var7;
                if (arg5 < var8) {
                    arg3.field872 += arg5 * var7;
                    break;
                }
                arg3.field876.method234(arg1, arg2, var8);
                arg5 -= var8;
                arg2 += var8;
                arg3.field872 += var7 * var8 - 1048576;
                int var9 = class48.field1163 / 100;
                class171 var10 = arg3.field876;
                int var11 = 262144 / var7;
                if (var11 < var9) {
                    var9 = var11;
                }
                if (this.field679.field3914[arg3.field867] == 0) {
                    arg3.field876 = class171.method1077(arg3.field887, var10.method1071(), var10.method1063(), var10.method1060());
                } else {
                    arg3.field876 = class171.method1077(arg3.field887, var10.method1071(), 0, var10.method1060());
                    this.field679.method1307(arg3, -1, arg3.field883.field310[arg3.field873] < 0);
                    arg3.field876.method1062(var9, var10.method1063());
                }
                if (arg3.field883.field310[arg3.field873] < 0) {
                    arg3.field876.method1048(-1);
                }
                var10.method1075(var9);
                var10.method234(arg1, arg2, arg4 - arg2);
                if (var10.method1059()) {
                    this.field681.method1244(var10);
                }
            }
        }
        arg3.field876.method234(arg1, arg2, arg5);
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(Lwb;)V")
    public class31(class199 arg0) {
        this.field679 = arg0;
    }
}
