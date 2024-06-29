import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dba")
public class class240 {

    @OriginalMember(owner = "client!dba", name = "b", descriptor = "Lcq;")
    public static class110 field2971 = new class110(106, 16);

    @OriginalMember(owner = "client!dba", name = "g", descriptor = "Z")
    public static boolean field2976 = true;

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "I")
    public static int field2970;

    @OriginalMember(owner = "client!dba", name = "c", descriptor = "I")
    public static int field2972;

    @OriginalMember(owner = "client!dba", name = "e", descriptor = "I")
    public static int field2974;

    @OriginalMember(owner = "client!dba", name = "f", descriptor = "I")
    public static int field2975;

    @OriginalMember(owner = "client!dba", name = "h", descriptor = "I")
    public static int field2977;

    @OriginalMember(owner = "client!dba", name = "i", descriptor = "I")
    public static int field2978;

    @OriginalMember(owner = "client!dba", name = "d", descriptor = "Ltf;")
    public static class701 field2973;

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(III)I", line = 3)
    public final int method1426(int arg0, int arg1, int arg2) {
        field2972++;
        int var4 = class146.field1618 <= arg0 ? arg0 : class146.field1618;
        if (class600.field8463 == this) {
            return 0;
        } else if (class255.field3200 == this) {
            return var4 - arg1;
        } else if (class578.field8186 == this) {
            return (var4 - arg1) / 2;
        } else {
            if (arg2 != -1) {
                method1427(-25);
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(I)V", line = 29)
    public static void method1427(int arg0) {
        if (arg0 == 4) {
            field2971 = null;
            field2973 = null;
        }
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(II)V", line = 50)
    public static final void method1428(int arg0, int arg1) {
        class348.field4660 = 100;
        field2978++;
        class254.field3190 = -1;
        class269.field3346 = 3;
        class599.field8437 = arg1;
        if (arg0 != 8) {
            method1429(117, null, 21, -23);
        }
    }

    @OriginalMember(owner = "client!dba", name = "toString", descriptor = "()Ljava/lang/String;", line = 64)
    public final String toString() {
        field2977++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(ILgda;II)J", line = 72)
    public static final long method1429(int arg0, class49 arg1, int arg2, int arg3) {
        field2970++;
        if (arg0 >= -59) {
            field2971 = null;
        }
        long var4 = 4194304L;
        long var6 = Long.MIN_VALUE;
        class638 var8 = class364.field4891.method2134(arg1.method238(6518), true);
        long var9 = (long) (arg3 | 0x40000000 | arg2 << 7 | arg1.method241((byte) 29) << 14 | arg1.method237(false) << 20);
        if (var8.field9035 == 0) {
            var9 |= var6;
        }
        if (var8.field9068 == 1) {
            var9 |= var4;
        }
        return var9 | (long) arg1.method238(6518) << 32;
    }

    @OriginalMember(owner = "client!dba", name = "b", descriptor = "(III)Liba;", line = 103)
    public static final class498 method1430(int arg0, int arg1, int arg2) {
        class499 var3 = class487.field7044[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class498 var4 = var3.field7217;
            var3.field7217 = null;
            class220.method1274(var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(IFIIIIFIFIII[F)V", line = 120)
    public static final void method1431(int arg0, float arg1, int arg2, int arg3, int arg4, int arg5, float arg6, int arg7, float arg8, int arg9, int arg10, int arg11, float[] arg12) {
        int var13 = arg4 - arg10;
        int var14 = arg11 - arg5;
        field2975++;
        int var15 = arg9 - arg0;
        float var16 = arg12[2] * (float) var15 + arg12[arg3] * (float) var13 + arg12[0] * (float) var14;
        float var17 = arg12[5] * (float) var15 + arg12[4] * (float) var13 + arg12[3] * (float) var14;
        float var18 = arg12[8] * (float) var15 + arg12[7] * (float) var13 + arg12[6] * (float) var14;
        float var19;
        float var20;
        if (arg2 == 0) {
            var20 = arg8 + 0.5F - var18;
            var19 = arg1 + var16 + 0.5F;
        } else if (arg2 == 1) {
            var19 = arg1 + var16 + 0.5F;
            var20 = arg8 + var18 + 0.5F;
        } else if (arg2 == 2) {
            var19 = arg1 + 0.5F - var16;
            var20 = arg6 + 0.5F - var17;
        } else if (arg2 == 3) {
            var20 = arg6 + 0.5F - var17;
            var19 = arg1 + var16 + 0.5F;
        } else if (arg2 == 4) {
            var19 = arg8 + var18 + 0.5F;
            var20 = arg6 + 0.5F - var17;
        } else {
            var20 = arg6 + 0.5F - var17;
            var19 = arg8 + 0.5F - var18;
        }
        if (arg7 == 1) {
            float var22 = var19;
            var19 = -var20;
            var20 = var22;
        } else if (arg7 == 2) {
            var19 = -var19;
            var20 = -var20;
        } else if (arg7 == 3) {
            float var21 = var19;
            var19 = var20;
            var20 = -var21;
        }
        class329.field4035 = var19;
        class558.field7958 = var20;
    }
}
