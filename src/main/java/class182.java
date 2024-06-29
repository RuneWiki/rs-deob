import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class182 extends class544 {

    @OriginalMember(owner = "client!jf", name = "r", descriptor = "Ljava/lang/String;")
    public String field2213;

    @OriginalMember(owner = "client!jf", name = "p", descriptor = "Z")
    public static boolean field2211 = false;

    @OriginalMember(owner = "client!jf", name = "m", descriptor = "I")
    public static int field2208;

    @OriginalMember(owner = "client!jf", name = "n", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!jf", name = "o", descriptor = "I")
    public static int field2210;

    @OriginalMember(owner = "client!jf", name = "q", descriptor = "I")
    public static int field2212;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIII)I", line = 5)
    public static final int method996(int arg0, int arg1, int arg2, int arg3) {
        field2209++;
        int var4 = arg3 & 0x3;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return 7 - arg2;
        } else {
            if (arg0 != 7) {
                method997((byte) -41);
            }
            return var4 == 2 ? 7 - arg1 : arg2;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V", line = 28)
    public static final void method997(byte arg0) {
        field2212++;
        class627 var1 = null;
        try {
            class506 var2 = class74.field873.method912("2", -4588, true);
            while (var2.field7031 == 0) {
                class462.method2688(1L, (byte) 110);
            }
            if (arg0 != 37) {
                return;
            }
            if (var2.field7031 == 1) {
                var1 = (class627) var2.field7030;
                byte[] var3 = new byte[(int) var1.method3594(-1)];
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method3597(false, var3, var4, var3.length - var4);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class539.method3146(true, new class374(var3));
            }
        } catch (Exception var7) {
        }
        try {
            if (var1 != null) {
                var1.method3596((byte) -95);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "(B)V", line = 78)
    public static final void method998(byte arg0) {
        class136.field1666 = -1;
        field2210++;
        class260.field3355 = -1;
        class469.field6549 = -1;
        class275.field3625 = 0;
        if (arg0 < 64) {
            method997((byte) -103);
        }
    }

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "(B)V", line = 92)
    public static final void method999(byte arg0) {
        if (class619.field8945 < 0) {
            class62.field619 = -1;
            class43.field353 = -1;
            class619.field8945 = 0;
        }
        if (arg0 <= 10) {
            field2211 = false;
        }
        field2208++;
        if (class353.field4623 < class619.field8945) {
            class619.field8945 = class353.field4623;
            class43.field353 = -1;
            class62.field619 = -1;
        }
        if (class34.field273 < 0) {
            class34.field273 = 0;
            class62.field619 = -1;
            class43.field353 = -1;
        }
        if (class34.field273 > class353.field4615) {
            class62.field619 = -1;
            class43.field353 = -1;
            class34.field273 = class353.field4615;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIIII)Z", line = 138)
    public static final boolean method1000(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class297.field3815[arg0][var8][var14] == -class341.field4394) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << class362.field4756) + 1;
            int var10 = (arg3 << class362.field4756) + 2;
            int var11 = class128.field1574[arg0].method855(arg1, arg3) + arg5;
            if (!class497.method2868(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << class362.field4756) - 1;
            if (!class497.method2868(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << class362.field4756) - 1;
            if (!class497.method2868(var9, var11, var13)) {
                return false;
            } else if (class497.method2868(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class544.method3186(arg0, arg1, arg3)) {
            int var6 = arg1 << class362.field4756;
            int var7 = arg3 << class362.field4756;
            return class497.method2868(var6 + 1, class128.field1574[arg0].method855(arg1, arg3) + arg5, var7 + 1) && class497.method2868(class79.field929 + var6 - 1, class128.field1574[arg0].method855(arg1 + 1, arg3) + arg5, var7 + 1) && class497.method2868(class79.field929 + var6 - 1, class128.field1574[arg0].method855(arg1 + 1, arg3 + 1) + arg5, class79.field929 + var7 - 1) && class497.method2868(var6 + 1, class128.field1574[arg0].method855(arg1, arg3 + 1) + arg5, class79.field929 + var7 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "()V", line = 197)
    public class182() {
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 200)
    public class182(String arg0, int arg1) {
        this.field2213 = arg0;
    }
}
