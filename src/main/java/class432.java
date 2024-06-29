import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uba")
public class class432 extends class184 {

    @OriginalMember(owner = "client!uba", name = "m", descriptor = "Lkd;")
    public class282 field6439;

    @OriginalMember(owner = "client!uba", name = "p", descriptor = "Lqe;")
    public static class469 field6442 = new class469(56, 4);

    @OriginalMember(owner = "client!uba", name = "q", descriptor = "Lmia;")
    public static class63 field6443 = new class63(54, 3);

    @OriginalMember(owner = "client!uba", name = "r", descriptor = "[Z")
    public static boolean[] field6444 = new boolean[100];

    @OriginalMember(owner = "client!uba", name = "s", descriptor = "Lfa;")
    public static class235 field6445 = new class235(15, 0, 1, 0);

    @OriginalMember(owner = "client!uba", name = "t", descriptor = "I")
    public static int field6446 = 100;

    @OriginalMember(owner = "client!uba", name = "n", descriptor = "I")
    public static int field6440;

    @OriginalMember(owner = "client!uba", name = "o", descriptor = "I")
    public static int field6441;

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(II)I")
    public static final int method2684(int arg0, int arg1) {
        int var7 = arg0 - 1;
        field6440++;
        if (arg1 != -21774) {
            field6442 = null;
        }
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(Z)V")
    public static void method2685(boolean arg0) {
        field6443 = null;
        field6445 = null;
        field6442 = null;
        if (arg0) {
            field6444 = null;
        }
    }

    @OriginalMember(owner = "client!uba", name = "<init>", descriptor = "(Lkd;)V")
    public class432(class282 arg0) {
        this.field6439 = arg0;
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(ZII)I")
    public static final int method2686(boolean arg0, int arg1, int arg2) {
        field6441++;
        if (arg0) {
            return 0;
        }
        class384 var3 = class529.method3090(arg0, (byte) 35, arg1);
        if (arg2 != 1) {
            field6446 = -112;
        }
        if (var3 == null) {
            return class603.field8536.method137(5, arg1).field3206;
        }
        int var4 = 0;
        for (int var5 = 0; var5 < var3.field5804.length; var5++) {
            if (var3.field5804[var5] == -1) {
                var4++;
            }
        }
        return var4 + (class603.field8536.method137(arg2 + 4, arg1).field3206 - var3.field5804.length);
    }
}
