import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public class class193 extends class187 {

    @OriginalMember(owner = "client!vp", name = "F", descriptor = "[I")
    public static int[] field2442 = new int[14];

    @OriginalMember(owner = "client!vp", name = "A", descriptor = "Ljava/lang/String;")
    public static String field2438 = "yellow:";

    @OriginalMember(owner = "client!vp", name = "D", descriptor = "C")
    private char field2440;

    @OriginalMember(owner = "client!vp", name = "w", descriptor = "I")
    public static int field2434;

    @OriginalMember(owner = "client!vp", name = "y", descriptor = "I")
    public static int field2436;

    @OriginalMember(owner = "client!vp", name = "B", descriptor = "I")
    public static int field2439;

    @OriginalMember(owner = "client!vp", name = "E", descriptor = "I")
    public int field2441;

    @OriginalMember(owner = "client!vp", name = "G", descriptor = "I")
    public static int field2443;

    @OriginalMember(owner = "client!vp", name = "x", descriptor = "Ljava/lang/String;")
    public String field2435;

    @OriginalMember(owner = "client!vp", name = "z", descriptor = "[Ljj;")
    public static class156[] field2437;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Ltq;I)V", line = 4)
    public final void method1034(class250 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1350(31351);
            if (var3 == 0) {
                if (arg1 != -1) {
                    field2438 = null;
                }
                field2439++;
                return;
            }
            this.method1035(var3, (byte) 112, arg0);
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(IBLtq;)V", line = 26)
    private final void method1035(int arg0, byte arg1, class250 arg2) {
        int var4 = 61 / ((40 - arg1) / 55);
        if (arg0 == 1) {
            this.field2440 = class199.method1066(arg2.method1363((byte) -124), false);
        } else if (arg0 == 2) {
            this.field2441 = arg2.method1359(255);
        } else if (arg0 == 5) {
            this.field2435 = arg2.method1349(-1754884856);
        }
        field2443++;
    }

    @OriginalMember(owner = "client!vp", name = "f", descriptor = "(I)V", line = 53)
    public static void method1036(int arg0) {
        if (arg0 != 22178) {
            field2437 = null;
        }
        field2442 = null;
        field2437 = null;
        field2438 = null;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(II)Llb;", line = 65)
    public static final class208 method1037(int arg0, int arg1) {
        field2434++;
        if (arg0 < 1) {
            field2442 = null;
        }
        class114 var2 = class204.field2762;
        class208 var3;
        synchronized (class204.field2762) {
            var3 = (class208) class204.field2762.method616(-108, (long) arg1);
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class62.field633.method1687(class141.method766(127, arg1), class2.method13(arg1, -14956), 255);
        class208 var5 = new class208();
        var5.field2837 = arg1;
        if (var4 != null) {
            var5.method1128(-14775, new class250(var4));
        }
        var5.method1129(124);
        class114 var6 = class204.field2762;
        synchronized (class204.field2762) {
            class204.field2762.method615((byte) -123, (long) arg1, var5);
            return var5;
        }
    }

    @OriginalMember(owner = "client!vp", name = "g", descriptor = "(I)Z", line = 98)
    public final boolean method1038(int arg0) {
        if (arg0 == 7392) {
            field2436++;
            return this.field2440 == 's';
        } else {
            return true;
        }
    }
}
