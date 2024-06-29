import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!raa")
public class class355 extends class257 {

    @OriginalMember(owner = "client!raa", name = "l", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field5104;

    @OriginalMember(owner = "client!raa", name = "n", descriptor = "Z")
    public static boolean field5106 = true;

    @OriginalMember(owner = "client!raa", name = "k", descriptor = "I")
    public static int field5103;

    @OriginalMember(owner = "client!raa", name = "m", descriptor = "I")
    public static int field5105;

    @OriginalMember(owner = "client!raa", name = "o", descriptor = "I")
    public static int field5107;

    @OriginalMember(owner = "client!raa", name = "p", descriptor = "I")
    public static int field5108;

    @OriginalMember(owner = "client!raa", name = "q", descriptor = "I")
    public static int field5109;

    @OriginalMember(owner = "client!raa", name = "r", descriptor = "I")
    public static int field5110;

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(Lha;IIIIII)Lka;", line = 3)
    public static final class284 method2273(class548 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5110++;
        long var7 = (long) arg4;
        class284 var9 = (class284) class522.field7267.method3898((byte) -42, var7);
        short var10 = 2055;
        if (var9 == null) {
            class133 var11 = class214.method1266(class186.field2537, 0, arg4, 0);
            if (var11 == null) {
                return null;
            }
            if (var11.field1891 < 13) {
                var11.method833(2, 6);
            }
            var9 = arg0.method1463(var11, var10, class63.field993, 64, 768);
            class522.field7267.method3899(122, var9, var7);
        }
        class284 var12 = var9.method1659((byte) 2, var10, true);
        if (arg6 > -56) {
            field5109 = 87;
        }
        if (arg3 != 0) {
            var12.method1704(arg3);
        }
        if (arg5 != 0) {
            var12.method1694(arg5);
        }
        if (arg2 != 0) {
            var12.method1690(arg2);
        }
        if (arg1 != 0) {
            var12.method1672(0, arg1, 0);
        }
        return var12;
    }

    @OriginalMember(owner = "client!raa", name = "<init>", descriptor = "(I)V", line = 55)
    public class355(int arg0) {
        this.field5104 = new NativeHeap(arg0);
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(I)V", line = 63)
    public static final void method2274(int arg0) {
        if (arg0 != -2) {
            return;
        }
        field5108++;
        if (class664.field8914 == null) {
            return;
        }
        if (class664.field8914.field3633 == 1) {
            class664.field8914 = null;
            return;
        }
        if (class664.field8914.field3633 == 2) {
            class172.method1104(2, (byte) 119, class649.field8706, class262.field3839);
            class664.field8914 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!raa", name = "b", descriptor = "(I)V", line = 92)
    public final void method2275(int arg0) {
        if (arg0 != -1) {
            method2274(-78);
        }
        this.field5104.method2624();
        field5103++;
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(Luu;ZIIIII)V", line = 107)
    public static final void method2276(class237 arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 <= 0) {
            class720.method4033(false, arg5, arg4, arg0, arg3, arg1);
        } else {
            class123.field1689 = null;
            class217.field2826 = 1;
            class202.field2679 = arg1;
            class438.field6107 = arg5;
            class524.field7281 = arg0;
            class517.field7221 = arg4;
            class720.field10022 = arg3;
            class459.field6373 = class149.field2066.method1778((byte) -90) / arg2;
            if (class459.field6373 < 1) {
                class459.field6373 = 1;
            }
        }
        if (arg6 == -29366) {
            field5107++;
        }
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(I[Ljava/lang/String;II)Ljava/lang/String;", line = 141)
    public static final String method2277(int arg0, String[] arg1, int arg2, int arg3) {
        field5105++;
        if (arg3 == 0) {
            return "";
        } else if (arg3 == 1) {
            String var4 = arg1[arg2];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg2 + arg3;
            int var6 = 0;
            for (int var7 = arg2; var7 < var5; var7++) {
                String var12 = arg1[var7];
                if (var12 == null) {
                    var6 += 4;
                } else {
                    var6 += var12.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var6);
            int var9 = -44 / ((-arg0 - 11) / 36);
            for (int var10 = arg2; var10 < var5; var10++) {
                String var11 = arg1[var10];
                if (var11 == null) {
                    var8.append("null");
                } else {
                    var8.append(var11);
                }
            }
            return var8.toString();
        }
    }
}
