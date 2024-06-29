import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class204 extends class217 {

    @OriginalMember(owner = "client!kk", name = "C", descriptor = "Z")
    public boolean field3702 = true;

    @OriginalMember(owner = "client!kk", name = "D", descriptor = "I")
    public static int field3703 = 0;

    @OriginalMember(owner = "client!kk", name = "S", descriptor = "Llc;")
    public static class143 field3717 = class66.method374(",Mcran)2titre ouvert", -1);

    @OriginalMember(owner = "client!kk", name = "y", descriptor = "I")
    public static int field3698;

    @OriginalMember(owner = "client!kk", name = "z", descriptor = "I")
    public static int field3699;

    @OriginalMember(owner = "client!kk", name = "A", descriptor = "I")
    public static int field3700;

    @OriginalMember(owner = "client!kk", name = "G", descriptor = "I")
    public static int field3705;

    @OriginalMember(owner = "client!kk", name = "H", descriptor = "I")
    public static int field3706;

    @OriginalMember(owner = "client!kk", name = "I", descriptor = "I")
    public static int field3707;

    @OriginalMember(owner = "client!kk", name = "J", descriptor = "I")
    public static int field3708;

    @OriginalMember(owner = "client!kk", name = "K", descriptor = "I")
    public static int field3709;

    @OriginalMember(owner = "client!kk", name = "M", descriptor = "I")
    public static int field3711;

    @OriginalMember(owner = "client!kk", name = "N", descriptor = "I")
    public static int field3712;

    @OriginalMember(owner = "client!kk", name = "O", descriptor = "I")
    public static int field3713;

    @OriginalMember(owner = "client!kk", name = "Q", descriptor = "I")
    public static int field3715;

    @OriginalMember(owner = "client!kk", name = "R", descriptor = "I")
    public static int field3716;

    @OriginalMember(owner = "client!kk", name = "B", descriptor = "[I")
    private int[] field3701;

    @OriginalMember(owner = "client!kk", name = "L", descriptor = "[I")
    public int[] field3710;

    @OriginalMember(owner = "client!kk", name = "E", descriptor = "[Llc;")
    private class143[] field3704;

    @OriginalMember(owner = "client!kk", name = "P", descriptor = "[[I")
    private int[][] field3714;

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "(I)V")
    public static void method1390(int arg0) {
        int var1 = 84 % ((arg0 - 23) / 40);
        field3717 = null;
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(B)Llc;")
    public final class143 method1391(byte arg0) {
        field3716++;
        class143 var2 = class170.method1114(80, false);
        if (this.field3704 == null) {
            return class261.field4664;
        }
        if (arg0 != 19) {
            this.method1399(-73, (class190) null);
        }
        var2.method906(0, this.field3704[0]);
        for (int var3 = 1; var3 < this.field3704.length; var3++) {
            var2.method906(0, class246.field4416);
            var2.method906(0, this.field3704[var3]);
        }
        return var2.method908(0);
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(BJ)Llc;")
    public static final class143 method1392(byte arg0, long arg1) {
        class218.field3981.setTime(new Date(arg1));
        int var3 = class218.field3981.get(7);
        if (arg0 != 40) {
            method1390(4);
        }
        field3706++;
        int var4 = class218.field3981.get(5);
        int var5 = class218.field3981.get(2);
        int var6 = class218.field3981.get(1);
        int var7 = class218.field3981.get(11);
        int var8 = class218.field3981.get(12);
        int var9 = class218.field3981.get(13);
        return class25.method179(arg0 - 40, new class143[] { class109.field1920[var3 - 1], class1.field3, class274.method1806(var4 / 10, true), class274.method1806(var4 % 10, true), class208.field3823, class10.field202[var5], class208.field3823, class274.method1806(var6, true), class271.field4837, class274.method1806(var7 / 10, true), class274.method1806(var7 % 10, true), class149.field2749, class274.method1806(var8 / 10, true), class274.method1806(var8 % 10, true), class149.field2749, class274.method1806(var9 / 10, true), class274.method1806(var9 % 10, true), class179.field3210 });
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lh;II)V")
    private final void method1393(class190 arg0, int arg1, int arg2) {
        if (arg2 != 24188) {
            this.method1393((class190) null, 25, 65);
        }
        if (arg1 == 1) {
            this.field3704 = arg0.method1270((byte) -115).method885(60, 0);
        } else if (arg1 == 2) {
            int var4 = arg0.method1265(123);
            this.field3710 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3710[var5] = arg0.method1275(128);
            }
        } else if (arg1 == 3) {
            int var6 = arg0.method1265(arg2 ^ 0x5E03);
            this.field3701 = new int[var6];
            this.field3714 = new int[var6][];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg0.method1275(128);
                this.field3701[var7] = var8;
                this.field3714[var7] = new int[class273.field4869[var8]];
                for (int var9 = 0; var9 < class273.field4869[var8]; var9++) {
                    this.field3714[var7][var9] = arg0.method1275(class25.method178(arg2, 24316));
                }
            }
        } else if (arg1 == 4) {
            this.field3702 = false;
        }
        field3705++;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Z)I")
    public final int method1394(boolean arg0) {
        field3698++;
        if (this.field3701 == null) {
            return 0;
        } else if (arg0) {
            return 82;
        } else {
            return this.field3701.length;
        }
    }

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "(I)V")
    public final void method1395(int arg0) {
        if (this.field3710 != null) {
            for (int var2 = 0; var2 < this.field3710.length; var2++) {
                this.field3710[var2] = class119.method729(this.field3710[var2], 32768);
            }
        }
        if (arg0 == -28684) {
            field3715++;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(BLh;[I)V")
    public final void method1396(byte arg0, class190 arg1, int[] arg2) {
        field3711++;
        if (this.field3701 == null) {
            return;
        }
        int var4 = 0;
        if (arg0 <= 0) {
            field3717 = null;
        }
        while (var4 < this.field3701.length) {
            if (var4 >= arg2.length) {
                return;
            }
            int var5 = class31.field503[this.method1401(var4, -127)];
            if (var5 > 0) {
                arg1.method1237(var5, (long) arg2[var4], -1);
            }
            var4++;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IBI)V")
    public static final void method1397(int arg0, byte arg1, int arg2) {
        field3712++;
        int var3 = -2 / ((53 - arg1) / 39);
        if (class72.field1359 != arg0) {
            class3.field43 = new int[arg0];
            for (int var4 = 0; var4 < arg0; var4++) {
                class3.field43[var4] = (var4 << 12) / arg0;
            }
            class172.field3077 = arg0 - 1;
            class170.field3033 = arg0 == 64 ? 2048 : 4096;
            class72.field1359 = arg0;
        }
        if (class9.field179 == arg2) {
            return;
        }
        if (class72.field1359 == arg2) {
            class31.field495 = class3.field43;
        } else {
            class31.field495 = new int[arg2];
            for (int var5 = 0; var5 < arg2; var5++) {
                class31.field495[var5] = (var5 << 12) / arg2;
            }
        }
        class79.field1426 = arg2 - 1;
        class9.field179 = arg2;
    }

    @OriginalMember(owner = "client!kk", name = "g", descriptor = "(I)V")
    public static final void method1398(int arg0) {
        for (int var1 = 0; var1 < class187.field3388; var1++) {
            int var10002 = class56.field1084[var1]--;
            if (class56.field1084[var1] >= -10) {
                class78 var3 = class75.field1403[var1];
                if (var3 == null) {
                    var3 = class78.method445(class89.field1614, class190.field3489[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class56.field1084[var1] += var3.method444();
                    class75.field1403[var1] = var3;
                }
                if (class56.field1084[var1] < 0) {
                    int var4;
                    if (class149.field2741[var1] == 0) {
                        var4 = class240.field4332;
                    } else {
                        int var5 = (class149.field2741[var1] & 0xFF) * 128;
                        int var6 = class149.field2741[var1] >> 8 & 0xFF;
                        int var7 = (class149.field2741[var1] & 0xFFB891) >> 16;
                        int var8 = var7 * 128 + 64 - class229.field4195.field4178;
                        int var9 = var6 * 128 + 64 - class229.field4195.field4108;
                        if (var8 < 0) {
                            var8 = -var8;
                        }
                        if (var9 < 0) {
                            var9 = -var9;
                        }
                        int var10 = var8 - (128 - var9);
                        if (var5 < var10) {
                            class56.field1084[var1] = -100;
                            continue;
                        }
                        if (var10 < 0) {
                            var10 = 0;
                        }
                        var4 = (var5 - var10) * class58.field1117 / var5;
                    }
                    if (var4 > 0) {
                        class216 var11 = var3.method446().method1486(class134.field2345);
                        class288 var12 = class288.method1897(var11, 100, var4);
                        var12.method1883(class89.field1615[var1] - 1);
                        class86.field1578.method998(var12);
                    }
                    class56.field1084[var1] = -100;
                }
            } else {
                class187.field3388--;
                for (int var2 = var1; var2 < class187.field3388; var2++) {
                    class190.field3489[var2] = class190.field3489[var2 + 1];
                    class75.field1403[var2] = class75.field1403[var2 + 1];
                    class89.field1615[var2] = class89.field1615[var2 + 1];
                    class56.field1084[var2] = class56.field1084[var2 + 1];
                    class149.field2741[var2] = class149.field2741[var2 + 1];
                }
                var1--;
            }
        }
        if (arg0 > -11) {
            field3703 = -85;
        }
        field3709++;
        if (class175.field3142 && !client.method1513((byte) 71)) {
            if (class211.field3926 != 0 && class221.field4001 != -1) {
                class129.method778(class278.field4911, class221.field4001, 2627, false, 0, class211.field3926);
            }
            class175.field3142 = false;
        } else if (class211.field3926 != 0 && class221.field4001 != -1 && !client.method1513((byte) 71)) {
            class285.field5010.method799(103, 124);
            class285.field5010.method1280(-126, class221.field4001);
            class221.field4001 = -1;
            class227.field4105++;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ILh;)Llc;")
    public final class143 method1399(int arg0, class190 arg1) {
        field3708++;
        class143 var3 = class170.method1114(80, false);
        if (this.field3701 != null) {
            for (int var4 = 0; var4 < this.field3701.length; var4++) {
                var3.method906(0, this.field3704[var4]);
                var3.method906(0, class68.method396(204, this.field3701[var4], arg1.method1253(class117.field2085[this.field3701[var4]], (byte) -69), this.field3714[var4]));
            }
        }
        var3.method906(0, this.field3704[this.field3704.length - 1]);
        int var5 = 127 / ((arg0 + 73) / 33);
        return var3.method908(0);
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lh;I)V")
    public final void method1400(class190 arg0, int arg1) {
        if (arg1 != -1) {
            return;
        }
        while (true) {
            int var3 = arg0.method1265(118);
            if (var3 == 0) {
                field3699++;
                return;
            }
            this.method1393(arg0, var3, 24188);
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(II)I")
    public final int method1401(int arg0, int arg1) {
        field3700++;
        if (this.field3701 == null || arg0 < 0 || arg0 > this.field3701.length) {
            return -1;
        } else if (arg1 >= -118) {
            return 23;
        } else {
            return this.field3701[arg0];
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIB)I")
    public final int method1402(int arg0, int arg1, byte arg2) {
        if (arg2 != 93) {
            this.field3704 = null;
        }
        field3707++;
        if (this.field3701 == null || arg0 < 0 || this.field3701.length < arg0) {
            return -1;
        } else if (this.field3714[arg0] == null || arg1 < 0 || arg1 > this.field3714[arg0].length) {
            return -1;
        } else {
            return this.field3714[arg0][arg1];
        }
    }
}
