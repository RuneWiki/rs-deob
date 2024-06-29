import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public abstract class class23 {

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "[I")
    public static int[] field353 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "Z")
    public static boolean field354 = false;

    @OriginalMember(owner = "client!hj", name = "h", descriptor = "S")
    public static short field358 = 32767;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "Ljava/lang/String;")
    public static String field351 = "purple:";

    @OriginalMember(owner = "client!hj", name = "j", descriptor = "S")
    public static short field360 = 320;

    @OriginalMember(owner = "client!hj", name = "m", descriptor = "[I")
    public static int[] field363 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "Ldf;")
    public static class177 field357 = new class177(64);

    @OriginalMember(owner = "client!hj", name = "n", descriptor = "[I")
    public static int[] field364 = new int[8];

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "I")
    public static int field352;

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "I")
    public static int field356;

    @OriginalMember(owner = "client!hj", name = "i", descriptor = "I")
    public static int field359;

    @OriginalMember(owner = "client!hj", name = "l", descriptor = "I")
    public static int field362;

    @OriginalMember(owner = "client!hj", name = "k", descriptor = "Ljava/lang/String;")
    public static String field361;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(B)V", line = 12)
    public static final void method236(byte arg0) {
        field356++;
        class190 var1 = class113.field1724;
        synchronized (class113.field1724) {
            if (arg0 >= -116) {
                method240(-125, (byte[]) null);
            }
            class238.field3696 = class308.field4768;
            class99.field1493++;
            if (class148.field2430 >= 0) {
                while (class148.field2430 != class146.field2384) {
                    int var2 = class51.field799[class146.field2384];
                    class146.field2384 = class146.field2384 + 1 & 0x7F;
                    if (var2 >= 0) {
                        class116.field1774[var2] = true;
                    } else {
                        class116.field1774[~var2] = false;
                    }
                }
            } else {
                for (int var3 = 0; var3 < 112; var3++) {
                    class116.field1774[var3] = false;
                }
                class148.field2430 = class146.field2384;
            }
            class308.field4768 = class222.field3453;
        }
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(B)Z", line = 67)
    public static final boolean method238(byte arg0) {
        field359++;
        if (arg0 != -21) {
            field361 = (String) null;
        }
        class190 var1 = class113.field1724;
        synchronized (class113.field1724) {
            if (class308.field4768 == class238.field3696) {
                return false;
            } else {
                class328.field5043 = class173.field2758[class238.field3696];
                class209.field3221 = class320.field4939[class238.field3696];
                class238.field3696 = class238.field3696 + 1 & 0x7F;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)V", line = 88)
    public static final void method239(int arg0) {
        field355++;
        if (class148.field2428 || class353.field5636 == 2) {
            return;
        }
        try {
            if (arg0 != 2) {
                method239(-52);
            }
            class141.method1176(class110.field1674, true, "tbrefresh");
        } catch (Throwable var2) {
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I[B)Lqk;", line = 119)
    public static final class70 method240(int arg0, byte[] arg1) {
        field362++;
        int var2 = -101 % ((arg0 + 63) / 46);
        if (arg1 == null) {
            return null;
        } else {
            class70 var3 = new class70(arg1, class150.field2449, class89.field1262, class358.field5694, class62.field957, class172.field2732);
            class29.method330(-1);
            return var3;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Z)V", line = 136)
    public static void method241(boolean arg0) {
        field353 = null;
        if (arg0) {
            return;
        }
        field364 = null;
        field357 = null;
        field361 = null;
        field363 = null;
        field351 = null;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(B[B)V")
    public abstract void method237(byte arg0, byte[] arg1);

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(I)[B")
    public abstract byte[] method242(int arg0);
}
