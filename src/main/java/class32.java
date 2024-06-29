import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class32 extends class105 {

    @OriginalMember(owner = "client!ec", name = "M", descriptor = "I")
    private int field802 = 0;

    @OriginalMember(owner = "client!ec", name = "Z", descriptor = "I")
    private int field815 = 4096;

    @OriginalMember(owner = "client!ec", name = "O", descriptor = "Lak;")
    public static class269 field804 = new class269(16);

    @OriginalMember(owner = "client!ec", name = "V", descriptor = "I")
    public static int field811 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!ec", name = "T", descriptor = "[I")
    public static int[] field809 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!ec", name = "Y", descriptor = "I")
    public static int field814 = 0;

    @OriginalMember(owner = "client!ec", name = "U", descriptor = "[I")
    public static int[] field810 = new int[5];

    @OriginalMember(owner = "client!ec", name = "N", descriptor = "I")
    public static int field803;

    @OriginalMember(owner = "client!ec", name = "P", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!ec", name = "Q", descriptor = "I")
    public static int field806;

    @OriginalMember(owner = "client!ec", name = "R", descriptor = "I")
    public static int field807;

    @OriginalMember(owner = "client!ec", name = "W", descriptor = "I")
    public static int field812;

    @OriginalMember(owner = "client!ec", name = "X", descriptor = "I")
    public static int field813;

    @OriginalMember(owner = "client!ec", name = "S", descriptor = "Lfl;")
    public static class192 field808;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(B)V")
    public static final void method262(byte arg0) {
        class4.field52 = new class269(32);
        int var1 = 75 % ((2 - arg0) / 52);
        ++field803;
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(B)V")
    public static void method263(byte arg0) {
        if (arg0 <= 77) {
            method264((class226) null, 96);
        }
        field810 = null;
        field809 = null;
        field808 = null;
        field804 = null;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lve;I)V")
    public static final void method264(class226 arg0, int arg1) {
        ++field805;
        class99 var2 = null;
        class124.field2227 = 3;
        class162.method1072(arg1 ^ -22605, true);
        class61.field1219 = true;
        class245.field4270 = true;
        class214.field3830 = true;
        class70.field1360 = true;
        if (arg1 != -22581) {
            field810 = null;
        }
        class107.field1895 = 2;
        class117.field2077 = true;
        class10.field341 = 0;
        class196.field3505 = true;
        client.field3855 = true;
        class258.field4428 = true;
        class127.field2273 = true;
        class43.field959 = 127;
        class23.field688 = true;
        class54.field1119 = 0;
        class105.field1868 = 255;
        class19.field498 = true;
        class172.field3095 = 127;
        class243.field4246 = 0;
        class283.field4990 = 0;
        if (~class105.field1851 <= -97) {
            class255.method1679(2);
        } else {
            class255.method1679(0);
        }
        class221.field3970 = 0;
        class253.field4359 = false;
        class186.field3373 = false;
        class77.field1469 = 0;
        class110.field1924 = true;
        class100.field1774 = false;
        class50.field1058 = 0;
        try {
            class114 var3 = arg0.method1538("runescape", 4);
            while (var3.field1996 == 0) {
                class19.method136(1, 1L);
            }
            if (~var3.field1996 == -2) {
                var2 = (class99) var3.field1997;
                byte[] var4 = new byte[(int) var2.method657(arg1 ^ -22581)];
                int var6;
                for (int var5 = 0; ~var5 > ~var4.length; var5 += var6) {
                    var6 = var2.method660(true, var5, var4.length - var5, var4);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class259.method1719(-9, new class135(var4));
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method656(false);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IILng;)V")
    public final void method12(int arg0, int arg1, class135 arg2) {
        if (~arg0 != -1) {
            if (arg0 == 1) {
                this.field815 = arg2.method927(125);
            }
        } else {
            this.field802 = arg2.method927(126);
        }
        if (arg1 != 255) {
            method265((byte) 63, false);
        }
        ++field812;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(BZ)V")
    public static final void method265(byte arg0, boolean arg1) {
        ++field807;
        int var2 = class254.field4372.length;
        if (arg0 == -23) {
            byte[][] var3 = class218.field3930;
            for (int var4 = 0; var4 < var2; ++var4) {
                byte[] var5 = var3[var4];
                if (var5 != null) {
                    int var6 = (class111.field1953[var4] >> 8) * 64 + -class64.field1248;
                    int var7 = (class111.field1953[var4] & 255) * 64 - class231.field4073;
                    class44.method369(true);
                    class11.method90(var5, var7, class130.field2279, var6, 122, arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)[I")
    public final int[] method16(int arg0, int arg1) {
        if (arg0 != 8055) {
            field809 = null;
        }
        int[] var3 = super.field1862.method458(arg1, false);
        if (super.field1862.field1236) {
            int[] var4 = this.method705(arg1, (byte) -71, 0);
            for (int var5 = 0; ~var5 > ~class94.field1668; ++var5) {
                int var6 = var4[var5];
                var3[var5] = var6 >= this.field802 && ~this.field815 <= ~var6 ? 4096 : 0;
            }
        }
        ++field806;
        return var3;
    }

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "(B)V")
    public static final void method266(byte arg0) {
        ++field813;
        if (class141.field2626 != 0) {
            if (arg0 == 110) {
                try {
                    if (++class56.field1146 > 2000) {
                        if (class197.field3520 != null) {
                            class197.field3520.method990(4);
                            class197.field3520 = null;
                        }
                        if (~class212.field3813 <= -2) {
                            class277.field4892 = -5;
                            class141.field2626 = 0;
                            return;
                        }
                        if (~class53.field1106 == ~class177.field3152) {
                            class53.field1106 = class40.field910;
                        } else {
                            class53.field1106 = class177.field3152;
                        }
                        class56.field1146 = 0;
                        class141.field2626 = 1;
                        ++class212.field3813;
                    }
                    if (class141.field2626 == 1) {
                        class278.field4913 = class281.field4957.method1533(0, class256.field4381, class53.field1106);
                        class141.field2626 = 2;
                    }
                    if (~class141.field2626 == -3) {
                        if (~class278.field4913.field1996 == -3) {
                            throw new IOException();
                        }
                        if (class278.field4913.field1996 != 1) {
                            return;
                        }
                        class197.field3520 = new class143((Socket) class278.field4913.field1997, class281.field4957);
                        class278.field4913 = null;
                        class197.field3520.method982(0, true, class55.field1133.field2483, class55.field1133.field2449);
                        if (class238.field4145 != null) {
                            class238.field4145.method675(0);
                        }
                        if (class30.field774 != null) {
                            class30.field774.method675(0);
                        }
                        int var1 = class197.field3520.method985((byte) 70);
                        if (class238.field4145 != null) {
                            class238.field4145.method675(arg0 ^ 110);
                        }
                        if (class30.field774 != null) {
                            class30.field774.method675(0);
                        }
                        if (~var1 != -22) {
                            class277.field4892 = var1;
                            class141.field2626 = 0;
                            class197.field3520.method990(4);
                            class197.field3520 = null;
                            return;
                        }
                        class141.field2626 = 3;
                    }
                    if (class141.field2626 == 3) {
                        if (~class197.field3520.method987((byte) 53) > -2) {
                            return;
                        }
                        class49.field1045 = new class265[class197.field3520.method985((byte) 70)];
                        class141.field2626 = 4;
                    }
                    if (~class141.field2626 == -5) {
                        if (class197.field3520.method987((byte) 53) >= class49.field1045.length * 8) {
                            class207.field3730.field2449 = 0;
                            class197.field3520.method986(class49.field1045.length * 8, 0, class207.field3730.field2483, 13418);
                            for (int var2 = 0; ~var2 > ~class49.field1045.length; ++var2) {
                                class49.field1045[var2] = class103.method691(class207.field3730.method943(105), class100.method662(arg0, 22701));
                            }
                            class277.field4892 = 21;
                            class141.field2626 = 0;
                            class197.field3520.method990(4);
                            class197.field3520 = null;
                        }
                    }
                } catch (IOException var3) {
                    if (class197.field3520 != null) {
                        class197.field3520.method990(arg0 ^ 106);
                        class197.field3520 = null;
                    }
                    if (~class212.field3813 > -2) {
                        if (class53.field1106 == class177.field3152) {
                            class53.field1106 = class40.field910;
                        } else {
                            class53.field1106 = class177.field3152;
                        }
                        class141.field2626 = 1;
                        ++class212.field3813;
                        class56.field1146 = 0;
                    } else {
                        class277.field4892 = -4;
                        class141.field2626 = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "()V")
    public class32() {
        super(1, true);
    }
}
