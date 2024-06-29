import java.io.IOException;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class63 extends class32 {

    @OriginalMember(owner = "client!ng", name = "q", descriptor = "I")
    public int field1206;

    @OriginalMember(owner = "client!ng", name = "n", descriptor = "I")
    public int field1203;

    @OriginalMember(owner = "client!ng", name = "o", descriptor = "I")
    public static int field1204 = -1;

    @OriginalMember(owner = "client!ng", name = "l", descriptor = "Lea;")
    public static class67 field1201 = null;

    @OriginalMember(owner = "client!ng", name = "u", descriptor = "I")
    public static int field1210 = 3353893;

    @OriginalMember(owner = "client!ng", name = "t", descriptor = "Lod;")
    public static class127 field1209 = new class127(64);

    @OriginalMember(owner = "client!ng", name = "z", descriptor = "I")
    public static volatile int field1215 = 0;

    @OriginalMember(owner = "client!ng", name = "k", descriptor = "I")
    public static int field1200;

    @OriginalMember(owner = "client!ng", name = "m", descriptor = "I")
    public static int field1202;

    @OriginalMember(owner = "client!ng", name = "p", descriptor = "I")
    public static int field1205;

    @OriginalMember(owner = "client!ng", name = "r", descriptor = "I")
    public static int field1207;

    @OriginalMember(owner = "client!ng", name = "s", descriptor = "I")
    public static int field1208;

    @OriginalMember(owner = "client!ng", name = "v", descriptor = "I")
    public static int field1211;

    @OriginalMember(owner = "client!ng", name = "w", descriptor = "I")
    public static int field1212;

    @OriginalMember(owner = "client!ng", name = "x", descriptor = "I")
    public static int field1213;

    @OriginalMember(owner = "client!ng", name = "y", descriptor = "I")
    public static int field1214;

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(Z)V")
    public static final void method489(boolean arg0) {
        field1211++;
        if (!arg0) {
            class151.field2622.method762((byte) 117);
            class84.field1597.method762((byte) 117);
        }
    }

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "(I)V")
    public static void method490(int arg0) {
        field1209 = null;
        if (arg0 != 2902) {
            method490(-119);
        }
        field1201 = null;
    }

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "(I)V")
    public static final void method491(int arg0) {
        if (class90.field1717 != class58.field1043) {
            class136.field2370 += class90.field1717;
            class136.field2370 -= class58.field1043;
            class90.field1717 = class58.field1043;
            if (class48.field871 != -1) {
                class207.method1393(0, true);
            }
        }
        field1208++;
        if (class206.field3414 != null) {
            class206.field3414.hide();
        }
        class114.method825(false, class228.field3834);
        class252.method1704((byte) -112, class228.field3834);
        if (class199.field3282 != null) {
            class199.field3282.method537((byte) -79, class228.field3834);
        }
        if (arg0 != -202575902) {
            return;
        }
        class130.method922((byte) -112);
        class213.method1418((byte) 67, class228.field3834);
        class57.method450(0, class228.field3834);
        if (class199.field3282 != null) {
            class199.field3282.method540(class228.field3834, arg0 + 202568632);
        }
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(II)V")
    public class63(int arg0, int arg1) {
        this.field1206 = arg1;
        this.field1203 = arg0;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(ZLn;I)V")
    public static final void method492(boolean arg0, class138 arg1, int arg2) {
        field1205++;
        if (arg2 != 255) {
            method491(-26);
        }
        if (arg0) {
            class99.field1828 = 3;
            class2.method11(false, (byte) -114);
            client.field1525 = false;
            class146.field2530 = false;
            class21.field459 = false;
            class56.field998 = false;
            class83.field1556 = 0;
            class44.field808 = false;
            class241.field4146 = 0;
            class170.field2841 = 0;
            class203.field3379 = 127;
            class66.field1260 = 255;
            class87.field1682 = 0;
            class172.field2878 = false;
            class5.field68 = false;
            class70.field1344 = false;
            class196.field3249 = 127;
            class76.field1440 = false;
            class193.field3211 = false;
            class126.field2210 = false;
            class196.method1321(arg1, arg2 - 255);
            return;
        }
        class99.field1828 = 3;
        class180 var3 = null;
        class2.method11(true, (byte) -114);
        class76.field1440 = true;
        class56.field998 = true;
        class126.field2210 = true;
        class172.field2878 = true;
        class83.field1556 = 2;
        class5.field68 = true;
        class87.field1682 = 0;
        class193.field3211 = true;
        class146.field2530 = true;
        class66.field1260 = 255;
        class170.field2841 = 0;
        class196.field3249 = 127;
        class203.field3379 = 127;
        client.field1525 = true;
        class21.field459 = true;
        class44.field808 = true;
        class70.field1344 = true;
        class241.field4146 = 0;
        try {
            class9 var4 = arg1.method965("runescape", 0);
            while (var4.field133 == 0) {
                class162.method1137(-95, 1L);
            }
            if (var4.field133 == 1) {
                var3 = (class180) var4.field132;
                byte[] var5 = new byte[(int) var3.method1223(73)];
                int var7;
                for (int var6 = 0; var6 < var5.length; var6 += var7) {
                    var7 = var3.method1225(var6, var5, var5.length - var6, (byte) 38);
                    if (var7 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class250.method1696(-125, new class217(var5));
            }
        } catch (Exception var9) {
        }
        try {
            if (var3 != null) {
                var3.method1227(-121);
                return;
            }
        } catch (Exception var8) {
            return;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)I")
    public static final int method493(int arg0, int arg1) {
        field1213++;
        if (arg1 != 816860964) {
            field1204 = -24;
        }
        int var2 = (arg0 & 0x55555555) + ((arg0 & 0xAAAAAAAA) >>> 1);
        int var3 = ((var2 & 0xCCCCCCCE) >>> 2) + (var2 & 0x33333333);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Ljava/util/Random;II)I")
    public static final int method494(Random arg0, int arg1, int arg2) {
        field1212++;
        if (arg2 <= 0) {
            throw new IllegalArgumentException();
        } else if (class101.method775(arg2, -106)) {
            return (int) (((long) arg0.nextInt() & 0xFFFFFFFFL) * (long) arg2 >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg2));
            if (arg1 != -32752) {
                return 97;
            }
            int var4;
            do {
                var4 = arg0.nextInt();
            } while (var4 >= var3);
            return class190.method1283(-88, var4, arg2);
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(BLgi;)I")
    public static final int method495(byte arg0, class187 arg1) {
        field1207++;
        int var2 = arg1.field3071;
        if (arg1.field3996 == arg1.field3965) {
            var2 = arg1.field3074;
        } else if (arg1.field4023 == arg1.field3996) {
            var2 = arg1.field3082;
        }
        int var3 = -33 % ((75 - arg0) / 48);
        return var2;
    }
}
