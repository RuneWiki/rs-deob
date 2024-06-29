import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public class class174 extends class115 {

    @OriginalMember(owner = "client!or", name = "k", descriptor = "I")
    public int field2537 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!or", name = "l", descriptor = "I")
    public int field2538 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!or", name = "o", descriptor = "I")
    public int field2541 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!or", name = "p", descriptor = "I")
    public int field2542 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!or", name = "i", descriptor = "I")
    public int field2535 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!or", name = "m", descriptor = "I")
    public int field2539 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!or", name = "r", descriptor = "I")
    public int field2544 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!or", name = "u", descriptor = "I")
    public int field2547 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!or", name = "j", descriptor = "Lcs;")
    public class219 field2536;

    @OriginalMember(owner = "client!or", name = "s", descriptor = "I")
    public static int field2545 = 0;

    @OriginalMember(owner = "client!or", name = "t", descriptor = "Luv;")
    public static class2 field2546 = new class2(14, 3);

    @OriginalMember(owner = "client!or", name = "y", descriptor = "Z")
    public static boolean field2551 = false;

    @OriginalMember(owner = "client!or", name = "x", descriptor = "Laa;")
    public static class76 field2550 = new class76(57, 4);

    @OriginalMember(owner = "client!or", name = "n", descriptor = "I")
    public static int field2540;

    @OriginalMember(owner = "client!or", name = "q", descriptor = "I")
    public static int field2543;

    @OriginalMember(owner = "client!or", name = "z", descriptor = "I")
    public static int field2552;

    @OriginalMember(owner = "client!or", name = "v", descriptor = "[I")
    public static int[] field2548;

    @OriginalMember(owner = "client!or", name = "w", descriptor = "[[Lgo;")
    public static class310[][] field2549;

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Z)V", line = 3)
    public static void method1194(boolean arg0) {
        if (!arg0) {
            method1197(null, -121, 22, 57, null);
        }
        field2546 = null;
        field2550 = null;
        field2549 = null;
        field2548 = null;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(III)Z", line = 20)
    public final boolean method1195(int arg0, int arg1, int arg2) {
        field2540++;
        if (arg0 >= this.field2542 && this.field2539 >= arg0 && this.field2538 <= arg1 && this.field2537 >= arg1) {
            return true;
        } else if (this.field2547 <= arg0 && arg0 <= this.field2544 && this.field2535 <= arg1 && this.field2541 >= arg1) {
            return true;
        } else {
            if (arg2 != -10364) {
                this.field2538 = -36;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(ILec;)[Ltb;", line = 39)
    public static final class330[] method1196(int arg0, class109 arg1) {
        field2543++;
        if (arg0 != 29885) {
            field2545 = -37;
        }
        if (!arg1.method823(true)) {
            return new class330[0];
        }
        class533 var2 = arg1.method834(800271248);
        while (var2.field7848 == 0) {
            class389.method2332(arg0 - 29886, 10L);
        }
        if (var2.field7848 == 2) {
            return new class330[0];
        }
        int[] var3 = (int[]) var2.field7849;
        class330[] var4 = new class330[var3.length >> 2];
        for (int var5 = 0; var5 < var4.length; var5++) {
            class330 var6 = new class330();
            var4[var5] = var6;
            var6.field5140 = var3[var5 << 2];
            var6.field5137 = var3[(var5 << 2) + 1];
            var6.field5143 = var3[(var5 << 2) + 2];
            var6.field5136 = var3[(var5 << 2) + 3];
        }
        return var4;
    }

    @OriginalMember(owner = "client!or", name = "<init>", descriptor = "(Lcs;)V", line = 155)
    public class174(class219 arg0) {
        this.field2536 = arg0;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Lba;III[Z)Z", line = 93)
    public static final boolean method1197(class502 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class420.field6281 != class249.field3405) {
            int var6 = class213.field3048[arg1].method718(arg2, arg3);
            for (int var7 = 0; var7 <= arg1; var7++) {
                class337 var8 = class213.field3048[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method718(arg2, arg3);
                    if (arg4 != null) {
                        arg4[var7] = var8.method710(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method703(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }
}
