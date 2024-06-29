import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class178 extends class30 {

    @OriginalMember(owner = "client!ri", name = "O", descriptor = "I")
    public int field3492 = -1;

    @OriginalMember(owner = "client!ri", name = "T", descriptor = "I")
    public int field3497 = -1;

    @OriginalMember(owner = "client!ri", name = "Z", descriptor = "I")
    public int field3503 = 2;

    @OriginalMember(owner = "client!ri", name = "W", descriptor = "I")
    public int field3500 = -1;

    @OriginalMember(owner = "client!ri", name = "R", descriptor = "I")
    public int field3495 = -1;

    @OriginalMember(owner = "client!ri", name = "fb", descriptor = "I")
    public int field3509 = -1;

    @OriginalMember(owner = "client!ri", name = "kb", descriptor = "Z")
    public boolean field3514 = false;

    @OriginalMember(owner = "client!ri", name = "gb", descriptor = "I")
    public int field3510 = 99;

    @OriginalMember(owner = "client!ri", name = "jb", descriptor = "I")
    public int field3513 = 5;

    @OriginalMember(owner = "client!ri", name = "M", descriptor = "[Lpe;")
    public static class154[] field3490 = new class154[50];

    @OriginalMember(owner = "client!ri", name = "eb", descriptor = "I")
    public static int field3508 = 0;

    @OriginalMember(owner = "client!ri", name = "P", descriptor = "Lrd;")
    public static class173 field3493 = class133.method843("<col=40ff00>", 96);

    @OriginalMember(owner = "client!ri", name = "K", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!ri", name = "L", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!ri", name = "N", descriptor = "I")
    public static int field3491;

    @OriginalMember(owner = "client!ri", name = "Q", descriptor = "I")
    public static int field3494;

    @OriginalMember(owner = "client!ri", name = "V", descriptor = "I")
    public static int field3499;

    @OriginalMember(owner = "client!ri", name = "X", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!ri", name = "Y", descriptor = "I")
    public static int field3502;

    @OriginalMember(owner = "client!ri", name = "ab", descriptor = "I")
    public static int field3504;

    @OriginalMember(owner = "client!ri", name = "bb", descriptor = "I")
    public static int field3505;

    @OriginalMember(owner = "client!ri", name = "db", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!ri", name = "ib", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!ri", name = "mb", descriptor = "I")
    public static int field3516;

    @OriginalMember(owner = "client!ri", name = "S", descriptor = "[I")
    public int[] field3496;

    @OriginalMember(owner = "client!ri", name = "U", descriptor = "[I")
    public int[] field3498;

    @OriginalMember(owner = "client!ri", name = "cb", descriptor = "[I")
    private int[] field3506;

    @OriginalMember(owner = "client!ri", name = "hb", descriptor = "[I")
    public int[] field3511;

    @OriginalMember(owner = "client!ri", name = "lb", descriptor = "[I")
    private int[] field3515;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILvf;B)Lvf;")
    public final class213 method1191(int arg0, class213 arg1, byte arg2) {
        int var4 = this.field3496[arg0];
        class41 var5 = class13.method80(91, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        field3488++;
        if (var5 == null) {
            return arg1.method624(true);
        } else {
            class213 var7 = arg1.method624(!var5.method303(var6, arg2 ^ 0x3C));
            var7.method628(var5, var6);
            return arg2 == 60 ? var7 : null;
        }
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(II)Z")
    public static final boolean method1192(int arg0, int arg1) {
        if (arg1 != -3018) {
            field3508 = 92;
        }
        field3512++;
        return arg0 >= 48 && arg0 <= 57;
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(ILvf;B)Lvf;")
    public final class213 method1193(int arg0, class213 arg1, byte arg2) {
        field3502++;
        int var4 = this.field3496[arg0];
        class41 var5 = class13.method80(-112, var4 >> 16);
        if (arg2 <= 73) {
            this.field3514 = true;
        }
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg1.method629(true);
        } else {
            class213 var7 = arg1.method629(!var5.method303(var6, 0));
            var7.method628(var5, var6);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILmb;)V")
    public final void method1194(int arg0, class121 arg1) {
        field3507++;
        int var3 = -18 / ((45 - arg0) / 44);
        while (true) {
            int var4 = arg1.method751((byte) -27);
            if (var4 == 0) {
                return;
            }
            this.method1195(arg1, var4, (byte) -114);
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lmb;IB)V")
    private final void method1195(class121 arg0, int arg1, byte arg2) {
        if (arg1 == 1) {
            int var4 = arg0.method755((byte) -52);
            this.field3498 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3498[var5] = arg0.method755((byte) -123);
            }
            this.field3496 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field3496[var6] = arg0.method755((byte) -121);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field3496[var7] += arg0.method755((byte) -102) << 16;
            }
        } else if (arg1 == 2) {
            this.field3497 = arg0.method755((byte) -71);
        } else if (arg1 == 3) {
            int var13 = arg0.method751((byte) -78);
            this.field3506 = new int[var13 + 1];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field3506[var14] = arg0.method751((byte) 114);
            }
            this.field3506[var13] = 9999999;
        } else if (arg1 == 4) {
            this.field3514 = true;
        } else if (arg1 == 5) {
            this.field3513 = arg0.method751((byte) 89);
        } else if (arg1 == 6) {
            this.field3495 = arg0.method755((byte) -42);
        } else if (arg1 == 7) {
            this.field3509 = arg0.method755((byte) -75);
        } else if (arg1 == 8) {
            this.field3510 = arg0.method751((byte) -113);
        } else if (arg1 == 9) {
            this.field3492 = arg0.method751((byte) -56);
        } else if (arg1 == 10) {
            this.field3500 = arg0.method751((byte) 122);
        } else if (arg1 == 11) {
            this.field3503 = arg0.method751((byte) -46);
        } else if (arg1 == 12) {
            int var10 = arg0.method751((byte) -76);
            this.field3515 = new int[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                this.field3515[var11] = arg0.method755((byte) -42);
            }
            for (int var12 = 0; var12 < var10; var12++) {
                this.field3515[var12] = (arg0.method755((byte) -89) << 16) + this.field3515[var12];
            }
        } else if (arg1 == 13) {
            int var8 = arg0.method751((byte) -123);
            this.field3511 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field3511[var9] = arg0.method780(16711680);
            }
        }
        if (arg2 > -84) {
            this.field3500 = 72;
        }
        field3501++;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lrd;Z)Z")
    public static final boolean method1196(class173 arg0, boolean arg1) {
        field3504++;
        if (arg0 == null) {
            return false;
        }
        if (arg1) {
            field3508 = 37;
        }
        for (int var2 = 0; var2 < class129.field2442; var2++) {
            if (arg0.method1123(-124, class159.field2972[var2])) {
                return true;
            }
        }
        return arg0.method1123(32, class175.field3447.field4097);
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IILa;Llb;)V")
    public static final void method1197(int arg0, int arg1, class1 arg2, class111 arg3) {
        field3505++;
        class77 var4 = new class77();
        var4.field1498 = 1;
        var4.field2437 = arg1;
        var4.field1500 = arg2;
        var4.field1503 = arg3;
        class145 var5 = class131.field2479;
        synchronized (class131.field2479) {
            class131.field2479.method920(false, var4);
        }
        if (arg0 < 77) {
            field3508 = 43;
        }
        class31.method252((byte) -101);
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IILvf;I)Lvf;")
    public final class213 method1198(int arg0, int arg1, class213 arg2, int arg3) {
        field3516++;
        int var5 = this.field3496[arg3];
        class41 var6 = class13.method80(arg1 - 109, var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method629(true);
        }
        class213 var8 = arg2.method629(!var6.method303(var7, arg1 ^ arg1));
        int var9 = arg0 & 0x3;
        if (var9 == 1) {
            var8.method1397();
        } else if (var9 == 2) {
            var8.method1401();
        } else if (var9 == 3) {
            var8.method1398();
        }
        var8.method628(var6, var7);
        if (var9 == 1) {
            var8.method1398();
        } else if (var9 == 2) {
            var8.method1401();
        } else if (var9 == 3) {
            var8.method1397();
        }
        return var8;
    }

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "(II)V")
    public static final void method1199(int arg0, int arg1) {
        class105 var2 = class208.field4055[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class105 var4 = class208.field4055[var3][arg0][arg1] = class208.field4055[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field1947--;
                for (int var5 = 0; var5 < var4.field1972; var5++) {
                    class5 var6 = var4.field1948[var5];
                    if ((var6.field123 >> 29 & 0x3L) == 2L && var6.field120 == arg0 && var6.field125 == arg1) {
                        var6.field115--;
                    }
                }
            }
        }
        if (class208.field4055[0][arg0][arg1] == null) {
            class208.field4055[0][arg0][arg1] = new class105(0, arg0, arg1);
        }
        class208.field4055[0][arg0][arg1].field1963 = var2;
        class208.field4055[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "(I)V")
    public final void method1200(int arg0) {
        field3491++;
        int var2 = 6 % ((8 - arg0) / 49);
        if (this.field3492 == -1) {
            if (this.field3506 == null) {
                this.field3492 = 0;
            } else {
                this.field3492 = 2;
            }
        }
        if (this.field3500 != -1) {
            return;
        }
        if (this.field3506 == null) {
            this.field3500 = 0;
        } else {
            this.field3500 = 2;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILri;IBLvf;)Lvf;")
    public final class213 method1201(int arg0, class178 arg1, int arg2, byte arg3, class213 arg4) {
        int var6 = this.field3496[arg0];
        class41 var7 = class13.method80(117, var6 >> 16);
        field3499++;
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg1.method1193(arg2, arg4, (byte) 115);
        }
        int var9 = arg1.field3496[arg2];
        class41 var10 = class13.method80(arg3 ^ 0x1C, var9 >> 16);
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            class213 var12 = arg4.method629(!var7.method303(var8, arg3 ^ 0xFFFFFFD4));
            var12.method628(var7, var8);
            return var12;
        } else {
            class213 var13 = arg4.method629(!var7.method303(var8, arg3 + 44) & !var10.method303(var11, arg3 + 44));
            var13.method637(var7, var8, var10, var11, this.field3506);
            return arg3 == -44 ? var13 : null;
        }
    }

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "(I)V")
    public static void method1202(int arg0) {
        field3490 = null;
        if (arg0 != 12) {
            method1199(38, 10);
        }
        field3493 = null;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lvf;II)Lvf;")
    public final class213 method1203(class213 arg0, int arg1, int arg2) {
        field3494++;
        int var4 = this.field3496[arg2];
        class41 var5 = class13.method80(112, var4 >> 16);
        int var6 = var4 & arg1;
        if (var5 == null) {
            return arg0.method629(true);
        }
        int var7 = 0;
        class41 var8 = null;
        if (this.field3515 != null && this.field3515.length > arg2) {
            int var9 = this.field3515[arg2];
            var8 = class13.method80(arg1 - 65468, var9 >> 16);
            var7 = var9 & 0xFFFF;
        }
        if (var8 == null || var7 == 65535) {
            class213 var11 = arg0.method629(!var5.method303(var6, 0));
            var11.method628(var5, var6);
            return var11;
        } else {
            class213 var10 = arg0.method629(!var5.method303(var6, arg1 ^ 0xFFFF) & !var8.method303(var7, 0));
            var10.method628(var5, var6);
            var10.method628(var8, var7);
            return var10;
        }
    }
}
