import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public class class482 extends class434 {

    @OriginalMember(owner = "client!wr", name = "o", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field6753;

    @OriginalMember(owner = "client!wr", name = "r", descriptor = "[I")
    public static int[] field6756 = new int[] { 28, 35, 40, 44 };

    @OriginalMember(owner = "client!wr", name = "s", descriptor = "I")
    public static int field6757 = 0;

    @OriginalMember(owner = "client!wr", name = "p", descriptor = "I")
    public static int field6754;

    @OriginalMember(owner = "client!wr", name = "q", descriptor = "I")
    public static int field6755;

    @OriginalMember(owner = "client!wr", name = "t", descriptor = "I")
    public static int field6758;

    @OriginalMember(owner = "client!wr", name = "u", descriptor = "I")
    public static int field6759;

    @OriginalMember(owner = "client!wr", name = "v", descriptor = "I")
    public static int field6760;

    @OriginalMember(owner = "client!wr", name = "w", descriptor = "Lhp;")
    public static class346 field6761;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(B)V", line = 3)
    public final void method2833(byte arg0) {
        field6760++;
        if (arg0 == -70) {
            this.field6753.method3793();
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(IZ)Lqf;", line = 14)
    public static final class708 method2834(int arg0, boolean arg1) {
        field6755++;
        class708 var2 = (class708) class624.field8416.method3109((byte) 106, (long) arg0);
        if (arg1) {
            method2835(-48, -45, -89, -99);
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class737.field10009.method1188(1, -18047, arg0);
        class708 var4 = new class708();
        var4.field9683 = arg0;
        if (var3 != null) {
            var4.method3933(new class254(var3), (byte) -43);
        }
        var4.method3935(27032);
        if (var4.field9688 == 2 && class86.field1216.method1248(125, (long) arg0) == null) {
            class86.field1216.method1247(4070, (long) arg0, new class445(class184.field2421));
            class681.field9109[class184.field2421++] = var4;
        }
        class624.field8416.method3108((long) arg0, 16337, var4);
        return var4;
    }

    @OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(I)V", line = 56)
    public class482(int arg0) {
        this.field6753 = new NativeHeap(arg0);
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIII)Z", line = 69)
    public static final boolean method2835(int arg0, int arg1, int arg2, int arg3) {
        field6758++;
        if (!class14.field144 || !class717.field9767) {
            return false;
        } else if (class267.field3915 < 100) {
            return false;
        } else {
            int var4 = class712.field9720[arg1][arg2][arg3];
            if (-class228.field2949 == var4) {
                return false;
            } else if (class228.field2949 == var4) {
                return true;
            } else if (class737.field10008 == class645.field8694) {
                return false;
            } else {
                int var5 = -27 % ((18 - arg0) / 45);
                int var6 = arg2 << class478.field6717;
                int var7 = arg3 << class478.field6717;
                if (class254.method1684(var6 + 1, class645.field8694[arg1].method1898(arg3, arg2, (byte) -42), class645.field8694[arg1].method1898(arg3 + 1, arg2, (byte) -124), var6 + 1, var7 - -1, var6 + class30.field299 - 1, class30.field299 + -1 + var7, class645.field8694[arg1].method1898(arg3 + 1, arg2 + 1, (byte) -70), false, class30.field299 + var7 - 1) && class254.method1684(var6 + 1, class645.field8694[arg1].method1898(arg3, arg2, (byte) -2), class645.field8694[arg1].method1898(arg3 + 1, arg2 + 1, (byte) -86), class30.field299 + var6 - 1, var7 - -1, class30.field299 + var6 - 1, var7 + -1 + class30.field299, class645.field8694[arg1].method1898(arg3, arg2 + 1, (byte) -105), false, var7 + 1)) {
                    class271.field3953++;
                    class712.field9720[arg1][arg2][arg3] = class228.field2949;
                    return true;
                } else {
                    class712.field9720[arg1][arg2][arg3] = -class228.field2949;
                    return false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "(Z)V", line = 115)
    public static void method2836(boolean arg0) {
        field6761 = null;
        if (!arg0) {
            method2837(21, (byte) 47, -6);
        }
        field6756 = null;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(IBI)Z", line = 127)
    public static final boolean method2837(int arg0, byte arg1, int arg2) {
        if (arg1 != -8) {
            method2836(true);
        }
        field6759++;
        if ((class791.method4325(arg0, arg2, (byte) 104) | (arg0 & 0x10000) != 0) || class414.method2497(arg0, -112, arg2)) {
            return true;
        } else {
            return (arg2 & 0x37) == 0 && class84.method680(arg2, arg0, (byte) -81);
        }
    }
}
