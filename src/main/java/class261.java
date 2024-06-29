import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class261 extends class23 {

    @OriginalMember(owner = "client!jc", name = "Q", descriptor = "I")
    private int field4666 = 4096;

    @OriginalMember(owner = "client!jc", name = "O", descriptor = "Llc;")
    public static class143 field4664 = class66.method374("", -1);

    @OriginalMember(owner = "client!jc", name = "M", descriptor = "[I")
    public static int[] field4662 = new int[256];

    @OriginalMember(owner = "client!jc", name = "J", descriptor = "Lc;")
    public static class269 field4659 = new class269(0, 0);

    @OriginalMember(owner = "client!jc", name = "R", descriptor = "J")
    public static long field4667 = 0L;

    @OriginalMember(owner = "client!jc", name = "I", descriptor = "I")
    public static int field4658;

    @OriginalMember(owner = "client!jc", name = "K", descriptor = "I")
    public static int field4660;

    @OriginalMember(owner = "client!jc", name = "L", descriptor = "I")
    public static int field4661;

    @OriginalMember(owner = "client!jc", name = "N", descriptor = "I")
    public static int field4663;

    @OriginalMember(owner = "client!jc", name = "P", descriptor = "I")
    public static int field4665;

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "(I)V")
    public static void method1739(int arg0) {
        field4664 = null;
        if (arg0 != 20148) {
            field4664 = null;
        }
        field4659 = null;
        field4662 = null;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)[I")
    public final int[] method86(int arg0, int arg1) {
        ++field4660;
        int[] var3 = super.field369.method306(arg1, -23179);
        if (super.field369.field1005) {
            int[] var4 = this.method155(class79.field1426 & arg1 + -1, (byte) 102, 0);
            int[] var5 = this.method155(arg1, (byte) 109, 0);
            int[] var6 = this.method155(class79.field1426 & arg1 + 1, (byte) 85, 0);
            for (int var7 = 0; var7 < class72.field1359; ++var7) {
                int var8 = (var6[var7] - var4[var7]) * this.field4666;
                int var9 = (var5[class172.field3077 & var7 - -1] + -var5[var7 + -1 & class172.field3077]) * this.field4666;
                int var10 = var8 >> 12;
                int var11 = var9 >> 12;
                int var12 = var11 * var11 >> 12;
                int var13 = var10 * var10 >> 12;
                int var14 = (int) (4096.0D * Math.sqrt((double) ((float) (var12 + var13 + 4096) / 4096.0F)));
                int var15 = ~var14 == -1 ? 0 : 16777216 / var14;
                var3[var7] = -var15 + 4096;
            }
        }
        if (arg0 > -13) {
            field4662 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIILqk;IJIIII)Z")
    public static final boolean method1740(int arg0, int arg1, int arg2, int arg3, class51 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class5.method26(arg0, arg7, arg8, arg9 - arg7 + 1, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(BZ)V")
    public static final void method1741(byte arg0, boolean arg1) {
        class224.method1543((byte) -56);
        ++field4665;
        if (~class147.field2652 == -31 || class147.field2652 == 25) {
            ++class270.field4831;
            if (arg0 != 51) {
                method1742((byte) 80);
            }
            if (~class270.field4831 <= -51 || arg1) {
                class270.field4831 = 0;
                if (!class170.field3030 && class17.field298 != null) {
                    class285.field5010.method799(103, 120);
                    try {
                        class17.field298.method1685(class285.field5010.field3465, class285.field5010.field3487, false, 0);
                        class285.field5010.field3487 = 0;
                    } catch (IOException var2) {
                        class170.field3030 = true;
                    }
                    ++class62.field1171;
                }
                class224.method1543((byte) -56);
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "()V")
    public class261() {
        super(1, true);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lh;IZ)V")
    public final void method83(class190 arg0, int arg1, boolean arg2) {
        if (!arg2) {
            method1740(114, -109, -109, 2, (class51) null, 15, -20L, -115, -73, -21, -68);
        }
        ++field4661;
        if (arg1 == 0) {
            this.field4666 = arg0.method1275(128);
        }
    }

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "(B)Z")
    public static final boolean method1742(byte arg0) {
        ++field4663;
        class192 var1 = class229.field4189;
        synchronized (class229.field4189) {
            if (arg0 < 10) {
                return false;
            } else if (~class66.field1229 == ~class31.field493) {
                return false;
            } else {
                class263.field4689 = class91.field1637[class31.field493];
                class229.field4191 = class113.field1979[class31.field493];
                class31.field493 = 127 & class31.field493 + 1;
                return true;
            }
        }
    }
}
