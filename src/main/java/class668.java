import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public abstract class class668 {

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "Ldg;")
    public static class376 field9442 = new class376(41, 4);

    @OriginalMember(owner = "client!dw", name = "g", descriptor = "[F")
    public static float[] field9447 = new float[16];

    @OriginalMember(owner = "client!dw", name = "f", descriptor = "I")
    public static int field9446 = 0;

    @OriginalMember(owner = "client!dw", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field9444 = new String[200];

    @OriginalMember(owner = "client!dw", name = "e", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field9445 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "I")
    public static int field9441;

    @OriginalMember(owner = "client!dw", name = "c", descriptor = "I")
    public static int field9443;

    @OriginalMember(owner = "client!dw", name = "h", descriptor = "I")
    public static int field9448;

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(Z)V")
    public static void method3699(boolean arg0) {
        field9442 = null;
        field9444 = null;
        field9445 = null;
        if (!arg0) {
            field9447 = null;
        }
        field9447 = null;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(Ljq;B)Ljq;")
    public abstract class472 method1618(class472 arg0, byte arg1);

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "(Z)V")
    public static final void method3700(boolean arg0) {
        if (arg0) {
            class153.field2210 = class634.field8979;
            class296.field4340 = class499.field7071;
        } else {
            class153.field2210 = class448.field6480;
            class296.field4340 = class420.field6108;
        }
        class41.field685 = class153.field2210.length;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(IB)I")
    public static final int method3701(int arg0, byte arg1) {
        field9448++;
        int var2 = -26 / ((11 - arg1) / 46);
        int var3 = arg0 & 0x3F;
        int var4 = (arg0 & 0xFB) >> 6;
        if (var3 == 18) {
            if (var4 == 0) {
                return 1;
            }
            if (var4 == 1) {
                return 2;
            }
            if (var4 == 2) {
                return 4;
            }
            if (var4 == 3) {
                return 8;
            }
        } else if (var3 == 19 || var3 == 21) {
            if (var4 == 0) {
                return 16;
            }
            if (var4 == 1) {
                return 32;
            }
            if (var4 == 2) {
                return 64;
            }
            if (var4 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(II)Lnw;")
    public static final class542 method3702(int arg0, int arg1) {
        field9443++;
        class542 var2 = (class542) class331.field4892.method2287(1, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class88.field1473.method3007(0, arg1, 5);
        if (arg0 != 26442) {
            method3703(107);
        }
        class542 var4 = new class542();
        if (var3 != null) {
            var4.method3076((byte) 40, new class695(var3));
        }
        var4.method3074((byte) -96);
        class331.field4892.method2291(var4, (long) arg1, 1);
        return var4;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(I)Z")
    public static final boolean method3703(int arg0) {
        field9441++;
        if (arg0 != 0) {
            field9447 = null;
        }
        if (class273.field4108) {
            try {
                class556.method3150(-21295, class421.field6129, "showVideoAd");
                return true;
            } catch (Throwable var1) {
            }
        }
        return false;
    }
}
