import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class40 extends class137 {

    @OriginalMember(owner = "client!d", name = "D", descriptor = "[Lsg;")
    public class196[] field605;

    @OriginalMember(owner = "client!d", name = "w", descriptor = "[I")
    public static int[] field599 = new int[100];

    @OriginalMember(owner = "client!d", name = "B", descriptor = "Ltl;")
    public static class59 field604 = class85.method639("mapdots", 9588);

    @OriginalMember(owner = "client!d", name = "v", descriptor = "[I")
    public static int[] field598 = new int[500];

    @OriginalMember(owner = "client!d", name = "y", descriptor = "Lbj;")
    public static class184 field601 = new class184();

    @OriginalMember(owner = "client!d", name = "x", descriptor = "I")
    public static int field600;

    @OriginalMember(owner = "client!d", name = "z", descriptor = "I")
    public static int field602;

    @OriginalMember(owner = "client!d", name = "A", descriptor = "I")
    public static int field603;

    @OriginalMember(owner = "client!d", name = "F", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!d", name = "E", descriptor = "Lld;")
    public static class52 field606;

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(Z)V", line = 11)
    public static void method258(boolean arg0) {
        if (!arg0) {
            field601 = (class184) null;
        }
        field599 = null;
        field601 = null;
        field598 = null;
        field604 = null;
        field606 = null;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Ltl;Z)I", line = 35)
    public static final int method259(class59 arg0, boolean arg1) {
        if (!arg1) {
            return -15;
        }
        field600++;
        if (class23.field310 == null || arg0.method495(22) == 0) {
            return -1;
        }
        for (int var2 = 0; var2 < class23.field310.field116; var2++) {
            if (class23.field310.field114[var2].method469(class64.field975, class265.field4582, 25600).method499(arg0, (byte) 79)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IB)Z", line = 68)
    public static final boolean method260(int arg0, byte arg1) {
        field603++;
        if (arg1 > -21) {
            return false;
        } else {
            return arg0 >= 48 && arg0 <= 57;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(BZ)V", line = 84)
    public static final void method261(byte arg0, boolean arg1) {
        class100.method757(arg0 ^ 0x31, class262.field4364, arg1, class152.field2498, class53.field792);
        if (arg0 == -13) {
            field602++;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(II)Z", line = 102)
    public final boolean method262(int arg0, int arg1) {
        field607++;
        int var3 = 38 % ((arg1 + 57) / 42);
        return this.field605[arg0].field3236;
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "(Lme;Lme;IZ)V", line = 119)
    public class40(class295 arg0, class295 arg1, int arg2, boolean arg3) {
        class64 var5 = new class64();
        int var6 = arg0.method2040(arg2, (byte) -97);
        this.field605 = new class196[var6];
        int[] var7 = arg0.method2041((byte) 18, arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method2042(arg2, var7[var8], (byte) -119);
            class88 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class88 var12 = (class88) var5.method536(2); var12 != null; var12 = (class88) var5.method533(24)) {
                if (var12.field1394 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method2045(-106, var11, 0);
                } else {
                    var13 = arg1.method2045(-119, 0, var11);
                }
                var10 = new class88(var11, var13);
                var5.method532(104, var10);
            }
            this.field605[var7[var8]] = new class196(var9, var10);
        }
    }
}
