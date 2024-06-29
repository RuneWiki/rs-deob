import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class366 extends class301 {

    @OriginalMember(owner = "client!a", name = "I", descriptor = "Ljava/lang/String;")
    public static String field5125 = "green:";

    @OriginalMember(owner = "client!a", name = "J", descriptor = "Z")
    public static boolean field5126 = true;

    @OriginalMember(owner = "client!a", name = "H", descriptor = "Z")
    public static boolean field5124 = true;

    @OriginalMember(owner = "client!a", name = "R", descriptor = "Ljava/lang/String;")
    public static String field5133 = "rating: ";

    @OriginalMember(owner = "client!a", name = "E", descriptor = "[I")
    public static int[] field5121 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!a", name = "T", descriptor = "I")
    public static int field5135 = 0;

    @OriginalMember(owner = "client!a", name = "G", descriptor = "I")
    public static int field5123;

    @OriginalMember(owner = "client!a", name = "L", descriptor = "I")
    public int field5128;

    @OriginalMember(owner = "client!a", name = "O", descriptor = "I")
    public static int field5130;

    @OriginalMember(owner = "client!a", name = "P", descriptor = "I")
    public static int field5131;

    @OriginalMember(owner = "client!a", name = "Q", descriptor = "I")
    public static int field5132;

    @OriginalMember(owner = "client!a", name = "S", descriptor = "I")
    public static int field5134;

    @OriginalMember(owner = "client!a", name = "F", descriptor = "Lrb;")
    public class197 field5122;

    @OriginalMember(owner = "client!a", name = "M", descriptor = "Lqj;")
    public static class296 field5129;

    @OriginalMember(owner = "client!a", name = "K", descriptor = "[B")
    public byte[] field5127;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "(I)[B", line = 3)
    public final byte[] method961(int arg0) {
        ++field5123;
        if (super.field4169) {
            throw new RuntimeException();
        } else {
            int var2 = 19 / ((arg0 - 60) / 55);
            return this.field5127;
        }
    }

    @OriginalMember(owner = "client!a", name = "f", descriptor = "(B)V", line = 20)
    public static final void method2350(byte arg0) {
        class225 var1 = class237.field3228;
        synchronized (class237.field3228) {
            ++class307.field4213;
            class73.field1142 = class55.field803;
            if (~class146.field2122 <= -1) {
                while (class35.field547 != class146.field2122) {
                    int var2 = class381.field5399[class35.field547];
                    class35.field547 = 127 & class35.field547 + 1;
                    if (var2 < 0) {
                        class293.field4056[~var2] = false;
                    } else {
                        class293.field4056[var2] = true;
                    }
                }
            } else {
                for (int var3 = 0; ~var3 > -113; ++var3) {
                    class293.field4056[var3] = false;
                }
                class146.field2122 = class35.field547;
            }
            class55.field803 = class28.field443;
            if (arg0 != 2) {
                field5124 = false;
            }
        }
        ++field5132;
    }

    @OriginalMember(owner = "client!a", name = "f", descriptor = "(I)V", line = 76)
    public static void method2351(int arg0) {
        field5129 = null;
        if (arg0 != 9246) {
            method2350((byte) 102);
        }
        field5133 = null;
        field5121 = null;
        field5125 = null;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(II)V", line = 92)
    public static final void method2352(int arg0, int arg1) {
        class406.field5898 = arg0;
        ++field5130;
        class190 var2 = class188.field2607;
        synchronized (class188.field2607) {
            if (arg1 != -18735) {
                return;
            }
            class188.field2607.method1249(arg1 ^ -18736);
        }
        class190 var3 = class414.field6007;
        synchronized (class414.field6007) {
            class414.field6007.method1249(1);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(ZBLjava/lang/String;)V", line = 112)
    public static final void method2353(boolean arg0, byte arg1, String arg2) {
        ++field5134;
        if (arg1 > -121) {
            field5125 = null;
        }
        String var3 = arg2.toLowerCase();
        short[] var4 = new short[16];
        int var5 = 0;
        int var6 = arg0 ? 32768 : 0;
        int var7 = (arg0 ? class31.field489 : field5135) + var6;
        for (int var8 = var6; ~var7 < ~var8; ++var8) {
            class144 var11 = class411.method2632(var8, (byte) -119);
            if (var11.field2078 && ~var11.method988(true).toLowerCase().indexOf(var3) != 0) {
                if (var5 >= 50) {
                    class434.field6239 = null;
                    class222.field2981 = -1;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var12 = new short[var4.length * 2];
                    for (int var13 = 0; var13 < var5; ++var13) {
                        var12[var13] = var4[var13];
                    }
                    var4 = var12;
                }
                var4[var5++] = (short) var8;
            }
        }
        class222.field2981 = var5;
        class298.field4125 = 0;
        class434.field6239 = var4;
        String[] var9 = new String[class222.field2981];
        for (int var10 = 0; ~class222.field2981 < ~var10; ++var10) {
            var9[var10] = class411.method2632(var4[var10], (byte) -15).method988(true);
        }
        class69.method470(114, var9, class434.field6239);
    }

    @OriginalMember(owner = "client!a", name = "e", descriptor = "(B)I", line = 186)
    public final int method965(byte arg0) {
        ++field5131;
        if (super.field4169) {
            return 0;
        } else {
            return arg0 != -55 ? 109 : 100;
        }
    }
}
