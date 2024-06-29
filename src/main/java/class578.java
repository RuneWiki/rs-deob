import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aaa")
public abstract class class578 {

    @OriginalMember(owner = "client!aaa", name = "c", descriptor = "I")
    public int field7757 = 0;

    @OriginalMember(owner = "client!aaa", name = "e", descriptor = "[B")
    public byte[] field7759 = new byte[5000];

    @OriginalMember(owner = "client!aaa", name = "i", descriptor = "I")
    public volatile int field7763 = 0;

    @OriginalMember(owner = "client!aaa", name = "d", descriptor = "I")
    public volatile int field7758 = 0;

    @OriginalMember(owner = "client!aaa", name = "g", descriptor = "[Ljava/lang/Object;")
    public Object[] field7761 = new Object[5000];

    @OriginalMember(owner = "client!aaa", name = "h", descriptor = "I")
    public int field7762 = 0;

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "Lws;")
    public static class333 field7755 = new class333();

    @OriginalMember(owner = "client!aaa", name = "l", descriptor = "[[I")
    public static int[][] field7766 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!aaa", name = "b", descriptor = "I")
    public static int field7756;

    @OriginalMember(owner = "client!aaa", name = "j", descriptor = "I")
    public static int field7764;

    @OriginalMember(owner = "client!aaa", name = "k", descriptor = "I")
    public static int field7765;

    @OriginalMember(owner = "client!aaa", name = "f", descriptor = "Lpfa;")
    public static class275 field7760;

    @OriginalMember(owner = "client!aaa", name = "m", descriptor = "Lrr;")
    public static class337 field7767;

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(I)V", line = 5)
    public static final void method3199(int arg0) {
        if (arg0 != -30606) {
            return;
        }
        field7756++;
        class448 var1 = null;
        try {
            class218 var2 = class386.field4955.method2596((byte) 119, false, "3");
            while (var2.field2546 == 0) {
                class700.method3867(arg0 + 59885, 1L);
            }
            if (var2.field2546 == 2) {
                throw new RuntimeException("Error opening file");
            }
            var1 = (class448) var2.field2547;
            byte[] var3 = new byte[(int) var1.method2447(1)];
            if (var3.length == 0) {
                class338.field4325 = "";
                class682.field9294 = "";
            } else {
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method2448((byte) 122, var4, var3, var3.length - var4);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class572 var6 = new class572(var3);
                int var7 = var6.method3097((byte) 12);
                if (var7 > 60) {
                    throw new RuntimeException("Bad length");
                }
                var6.field7313 = var7 + 1;
                if (!var6.method3078((byte) 65)) {
                    throw new RuntimeException("Invalid CRC");
                }
                var6.field7313 = 1;
                int var8 = var6.method3097((byte) 12);
                if (var8 > 2) {
                    throw new RuntimeException("Invalid version " + var8);
                }
                class682.field9294 = var6.method3099((byte) 43);
                class338.field4325 = var6.method3099((byte) 43);
                if (var8 >= 1) {
                    class75.field994 = var6.method3031(-1);
                } else {
                    class75.field994 = class594.field7969;
                }
                if (var8 >= 2) {
                    class116.field1432 = var6.method3046(false);
                } else {
                    class116.field1432 = class192.field2274;
                }
            }
        } catch (Exception var10) {
            class338.field4325 = "";
            class682.field9294 = "";
        }
        try {
            if (var1 != null) {
                var1.method2451(true);
            }
        } catch (Exception var9) {
        }
    }

    @OriginalMember(owner = "client!aaa", name = "b", descriptor = "(II)Z", line = 109)
    public static final boolean method3200(int arg0, int arg1) {
        if (arg0 >= -72) {
            method3200(-16, -6);
        }
        field7764++;
        return arg1 == 3 || arg1 == 4;
    }

    @OriginalMember(owner = "client!aaa", name = "d", descriptor = "(I)V", line = 145)
    public static void method3201(int arg0) {
        field7766 = null;
        field7767 = null;
        if (arg0 != 3) {
            field7755 = null;
        }
        field7760 = null;
        field7755 = null;
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(BZILd;)V")
    public abstract void method1803(byte arg0, boolean arg1, int arg2, class140 arg3);

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(II)V")
    public abstract void method1804(int arg0, int arg1);

    @OriginalMember(owner = "client!aaa", name = "b", descriptor = "(I)V")
    public abstract void method1801(int arg0);

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(Lqs;I)V")
    public abstract void method1802(class565 arg0, int arg1);

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(ILqs;)V")
    public abstract void method1807(int arg0, class565 arg1);

    @OriginalMember(owner = "client!aaa", name = "c", descriptor = "(I)V")
    public abstract void method1808(int arg0);

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(IZ)V")
    public abstract void method1806(int arg0, boolean arg1);

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(Lqs;B)V")
    public abstract void method1797(class565 arg0, byte arg1);
}
