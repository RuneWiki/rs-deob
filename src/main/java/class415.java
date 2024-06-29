import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class415 extends InputStream {

    @OriginalMember(owner = "client!nn", name = "e", descriptor = "Lht;")
    public static class581 field5852 = new class581();

    @OriginalMember(owner = "client!nn", name = "j", descriptor = "[Lfj;")
    public static class655[] field5857 = null;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "I")
    public static int field5848;

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "I")
    public static int field5849;

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "I")
    public static int field5850;

    @OriginalMember(owner = "client!nn", name = "d", descriptor = "I")
    public static int field5851;

    @OriginalMember(owner = "client!nn", name = "f", descriptor = "I")
    public static int field5853;

    @OriginalMember(owner = "client!nn", name = "g", descriptor = "I")
    public static int field5854;

    @OriginalMember(owner = "client!nn", name = "h", descriptor = "I")
    public static int field5855;

    @OriginalMember(owner = "client!nn", name = "i", descriptor = "Ltl;")
    public static class619 field5856;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(IIZ)I", line = 4)
    public static final int method2548(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            return 56;
        } else {
            field5851++;
            int var3 = arg1 - 1 & arg0 >> 31;
            return (arg0 + (arg0 >>> 31)) % arg1 + var3;
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(III)Lbga;", line = 19)
    public static final class356 method2549(int arg0, int arg1, int arg2) {
        class165 var3 = class553.field7776[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2270;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(ZI)V", line = 27)
    public static final void method2550(boolean arg0, int arg1) {
        field5849++;
        if (class333.field4663 != null) {
            class333.field4663.method2844(Integer.MIN_VALUE);
            class333.field4663 = null;
        }
        class215.field2831 = 0;
        class184.method1167((byte) -73);
        class505.method2993();
        for (int var2 = 0; var2 < 4; var2++) {
            class147.field2114[var2].method1871((byte) 85);
        }
        class673.method3679((byte) 113, false);
        System.gc();
        class660.method3618(2, 1);
        class105.field1268 = false;
        class118.field1431 = -1;
        class64.method540(-1);
        class344.method2225(true, -257);
        class186.field2513 = 0;
        class3.field30 = 0;
        class650.field8937 = 0;
        class466.field6609 = 0;
        class228.field3063 = 0;
        class557.field7832 = 0;
        for (int var3 = 0; var3 < class98.field1180.length; var3++) {
            class98.field1180[var3] = null;
        }
        class76.method609(-127);
        for (int var4 = 0; var4 < 2048; var4++) {
            class309.field4311[var4] = null;
        }
        class344.field4849 = 0;
        class373.field5230.method1175((byte) 126);
        class438.field6239 = 0;
        class178.field2391.method1175((byte) 111);
        class426.method2600((byte) 59);
        class270.field3865 = 0;
        class101.field1201.method1995((byte) 75);
        class303.method1982(arg1 + 25625);
        if (arg1 != -25626) {
            field5854 = -16;
        }
        class694.method3918(-110);
        class401.field5699 = null;
        class606.field8532 = 0L;
        if (arg0) {
            class60.method514(false, 12);
            return;
        }
        class60.method514(false, 3);
        try {
            class113.method797("loggedout", 109, class213.field2800);
        } catch (Throwable var5) {
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(I)V", line = 105)
    public static final void method2551(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field5855++;
        if (class90.field1075 != null) {
            class90.field1075.method474(1);
            class609.field8571 = null;
            class90.field1075 = null;
        }
    }

    @OriginalMember(owner = "client!nn", name = "read", descriptor = "()I", line = 125)
    public final int read() {
        class756.method4205(30000L, 0);
        field5850++;
        return -1;
    }

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "(I)V", line = 139)
    public static void method2552(int arg0) {
        field5852 = null;
        field5857 = null;
        int var1 = 35 / ((arg0 + 78) / 34);
        field5856 = null;
    }

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "(I)V", line = 153)
    public static final void method2553(int arg0) {
        if (arg0 == 30695) {
            class37.field475 = new class493[class48.field569.method2098((byte) 20)][];
            field5853++;
            class419.field5914 = new class493[class48.field569.method2098((byte) 20)][];
            class46.field544 = new boolean[class48.field569.method2098((byte) 20)];
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lsr;[II[III)Laba;", line = 166)
    public static final class173 method2554(class251 arg0, int[] arg1, int arg2, int[] arg3, int arg4, int arg5) {
        if (arg4 != 2871) {
            field5852 = null;
        }
        field5848++;
        if (!arg0.method1444(class309.field4305, class233.field3143, (byte) -45)) {
            int[] var10 = new int[arg2 * arg5];
            for (int var11 = 0; var11 < arg5; var11++) {
                int var12 = arg2 * var11 + arg3[var11];
                for (int var13 = 0; var13 < arg1[var11]; var13++) {
                    var10[var12++] = -16777216;
                }
            }
            return new class173(arg0, arg2, arg5, var10);
        }
        byte[] var6 = new byte[arg2 * arg5];
        for (int var7 = 0; var7 < arg5; var7++) {
            int var8 = arg2 * var7 + arg3[var7];
            for (int var9 = 0; var9 < arg1[var7]; var9++) {
                var6[var8++] = -1;
            }
        }
        return new class173(arg0, arg2, arg5, var6);
    }
}
