import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class79 {

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "Ljava/lang/String;")
    public static String field1246 = "Opened title screen";

    @OriginalMember(owner = "client!ng", name = "k", descriptor = "F")
    public static float field1255 = 128.0F;

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "I")
    public static int field1247;

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "I")
    public static int field1248;

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "I")
    public static int field1249;

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "I")
    public static int field1250;

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "I")
    public static int field1253;

    @OriginalMember(owner = "client!ng", name = "j", descriptor = "I")
    public static int field1254;

    @OriginalMember(owner = "client!ng", name = "l", descriptor = "I")
    public static int field1256;

    @OriginalMember(owner = "client!ng", name = "n", descriptor = "I")
    public static int field1258;

    @OriginalMember(owner = "client!ng", name = "o", descriptor = "I")
    public static int field1259;

    @OriginalMember(owner = "client!ng", name = "p", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "Lfa;")
    public static class273 field1252;

    @OriginalMember(owner = "client!ng", name = "m", descriptor = "Lfa;")
    public static class273 field1257;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "Lh;")
    public static class294 field1245;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IILjava/util/Random;)I")
    public static final int method524(int arg0, int arg1, Random arg2) {
        if (arg1 <= 44) {
            method524(-90, -123, (Random) null);
        }
        field1250++;
        if (arg0 <= 0) {
            throw new IllegalArgumentException();
        } else if (class33.method189(2, arg0)) {
            return (int) ((long) arg0 * ((long) arg2.nextInt() & 0xFFFFFFFFL) >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg0));
            int var4;
            do {
                var4 = arg2.nextInt();
            } while (var4 >= var3);
            return class207.method1469(arg0, var4, (byte) -124);
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(BC)Z")
    public static final boolean method525(byte arg0, char arg1) {
        if (arg0 >= -19) {
            method524(62, 18, (Random) null);
        }
        field1251++;
        return arg1 >= '0' && arg1 <= '9' || arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(B)V")
    public static void method526(byte arg0) {
        if (arg0 != 41) {
            method526((byte) 108);
        }
        field1246 = null;
        field1252 = null;
        field1245 = null;
        field1257 = null;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lbl;B)I")
    public static final int method527(class35 arg0, byte arg1) {
        class106 var2 = arg0.field442;
        field1258++;
        if (var2.field1630 != null) {
            var2 = var2.method685(-1);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = -38 / ((-arg1 - 42) / 53);
        int var4 = var2.field1642;
        class261 var5 = arg0.method361(-1);
        if (arg0.field857 == var5.field4282) {
            var4 = var2.field1580;
        } else if (arg0.field857 == var5.field4299 || arg0.field857 == var5.field4278 || arg0.field857 == var5.field4302 || arg0.field857 == var5.field4305) {
            var4 = var2.field1589;
        } else if (arg0.field857 == var5.field4308 || arg0.field857 == var5.field4281 || arg0.field857 == var5.field4272 || arg0.field857 == var5.field4275) {
            var4 = var2.field1612;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIII)V")
    public static final void method528(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1260++;
        class62.method391(arg4, arg1, arg4 + arg3, arg0 + arg1);
        class62.method380(arg4, arg1, arg3, arg0, 0);
        if (class127.field1968 < 100) {
            return;
        }
        int var5 = arg3;
        float var6 = (float) class13.field165 / (float) class13.field175;
        int var7 = arg0;
        if (((float) arg2 > var6)) {
            var7 = (int) ((float) arg3 * var6);
        } else {
            var5 = (int) ((float) arg0 / var6);
        }
        int var8 = (arg0 - var7) / 2 + arg1;
        if (field1245 == null || field1245.field4830 != arg3 || field1245.field4833 != arg0) {
            class38 var9 = new class38(arg3, arg0);
            class62.method399(var9.field488, arg3, arg0);
            if (class13.field171.field3485 != -1) {
                class62.method380(0, 0, arg3, arg0, class13.field171.field3485);
            }
            class13.method76(0, 0, class13.field175, class13.field165, 0, 0, var5, var7);
            class13.method67();
            field1245 = var9;
            class301.field4942.method118(127);
        }
        int var10 = (arg3 - var5) / 2 + arg4;
        field1245.method235(var10, var8);
        int var11 = class284.field4749 * var5 / class13.field175 + var10;
        int var12 = class67.field979 * var7 / class13.field165 + var8;
        int var13 = class48.field661 * var7 / class13.field165;
        int var14 = 16711680;
        int var15 = class89.field1375 * var5 / class13.field175;
        if (class121.field1857 == 1) {
            var14 = 16777215;
        }
        class62.method395(var11, var12, var15, var13, var14, 128);
        class62.method389(var11, var12, var15, var13, var14);
        if (class237.field3752 <= 0) {
            return;
        }
        int var16;
        if (class273.field4482 > 50) {
            var16 = (100 - class273.field4482) * 5;
        } else {
            var16 = class273.field4482 * 5;
        }
        for (class314 var17 = (class314) class13.field166.method1187((byte) 127); var17 != null; var17 = (class314) class13.field166.method1186(true)) {
            class195 var18 = class192.method1334(false, var17.field5051);
            if (class70.method439(23155, var18)) {
                if (class203.field3279 == var17.field5051) {
                    int var21 = var8 + (var17.field5056 * var7 / class13.field165);
                    int var22 = var17.field5065 * var5 / class13.field175 + var10;
                    class62.method395(var22 - 2, var21 + -2, 4, 4, 16776960, var16);
                } else if (class208.field3326 != -1 && class208.field3326 == var18.field3099) {
                    int var19 = var17.field5056 * var7 / class13.field165 + var8;
                    int var20 = var17.field5065 * var5 / class13.field175 + var10;
                    class62.method395(var20 - 2, var19 + -2, 4, 4, 16776960, var16);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(III)Lkk;")
    public static final class254 method529(int arg0, int arg1, int arg2) {
        field1248++;
        if (arg1 < 6) {
            return null;
        }
        class254 var3 = class80.method534(111, arg0);
        if (arg2 == -1) {
            return var3;
        } else if (var3 == null || var3.field4123 == null || var3.field4123.length <= arg2) {
            return null;
        } else {
            return var3.field4123[arg2];
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V")
    public static final void method530(int arg0) {
        field1259++;
        if (arg0 > -123) {
            field1245 = null;
        }
        class87.field1359++;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIII)V")
    public static final void method531(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 50) {
            method528(-61, -18, -28, 111, -108);
        }
        field1253++;
        if (arg0 == 1010) {
            class273.method1887(true, arg3, 10, arg1);
        } else if (arg0 == 1001) {
            class273.method1887(true, arg3, 11, arg1);
            return;
        } else if (arg0 == 1012) {
            class273.method1887(true, arg3, 12, arg1);
            return;
        } else if (arg0 == 1002) {
            class273.method1887(true, arg3, 13, arg1);
            return;
        } else if (arg0 == 1007) {
            class273.method1887(true, arg3, 14, arg1);
            return;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)Lj;")
    public static final class174 method532(int arg0, int arg1) {
        field1247++;
        class174 var2 = (class174) class113.field1700.method1343(75, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg1 >= 32768) {
            var3 = class270.field4426.method1877(arg1 & 0x7FFF, 1, (byte) 65);
        } else {
            var3 = class220.field3522.method1877(arg1, 1, (byte) 92);
        }
        class174 var4 = new class174();
        if (var3 != null) {
            var4.method1169(new class202(var3), -116);
        }
        if (~arg1 <= arg0) {
            var4.method1174((byte) 64);
        }
        class113.field1700.method1337(var4, (long) arg1, -1);
        return var4;
    }
}
