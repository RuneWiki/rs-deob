import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class188 implements Runnable {

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "Z")
    public boolean field3789 = true;

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "Ljava/lang/Object;")
    public Object field3790 = new Object();

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "I")
    public int field3792 = 0;

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "[I")
    public int[] field3793 = new int[500];

    @OriginalMember(owner = "client!uh", name = "n", descriptor = "[I")
    public int[] field3798 = new int[500];

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "Lch;")
    public static class29 field3791 = new class29(64);

    @OriginalMember(owner = "client!uh", name = "j", descriptor = "I")
    public static int field3794 = 0;

    @OriginalMember(owner = "client!uh", name = "l", descriptor = "Z")
    public static boolean field3796 = false;

    @OriginalMember(owner = "client!uh", name = "o", descriptor = "I")
    public static int field3799 = 0;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "I")
    public static int field3785;

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "I")
    public static int field3786;

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "I")
    public static int field3787;

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "I")
    public static int field3788;

    @OriginalMember(owner = "client!uh", name = "k", descriptor = "I")
    public static int field3795;

    @OriginalMember(owner = "client!uh", name = "m", descriptor = "Lmc;")
    public static class111 field3797;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lgg;Lgg;Lgg;Z)V")
    public static final void method1232(class63 arg0, class63 arg1, class63 arg2, boolean arg3) {
        class153.field3204 = arg0;
        if (!arg3) {
            field3788++;
            class153.field3212 = arg2;
            class153.field3209 = arg1;
        }
    }

    @OriginalMember(owner = "client!uh", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field3789) {
            Object var1 = this.field3790;
            synchronized (this.field3790) {
                if (this.field3792 < 500) {
                    this.field3798[this.field3792] = class100.field2365;
                    this.field3793[this.field3792] = field3794;
                    this.field3792++;
                }
            }
            class196.method1281((byte) -8, 50L);
        }
        field3786++;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIII)V")
    public static final void method1233(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class90 var5 = (class90) class110.field2484.method694(-23979, (long) arg4);
        field3785++;
        if (var5 == null) {
            var5 = new class90();
            class110.field2484.method702((byte) 124, var5, (long) arg4);
        }
        if (arg1 >= var5.field2102.length) {
            int[] var6 = new int[arg1 + 1];
            int[] var7 = new int[arg1 + 1];
            for (int var8 = 0; var8 < var5.field2102.length; var8++) {
                var6[var8] = var5.field2102[var8];
                var7[var8] = var5.field2099[var8];
            }
            for (int var9 = var5.field2102.length; var9 < arg1; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field2099 = var7;
            var5.field2102 = var6;
        }
        var5.field2102[arg1] = arg2;
        if (arg0 == 1) {
            var5.field2099[arg1] = arg3;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(III)V")
    public static final void method1234(int arg0, int arg1, int arg2) {
        class96 var3 = class148.field3117[arg0][arg1][arg2];
        if (var3 != null) {
            var3.field2277 = null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V")
    public static void method1235(int arg0) {
        field3797 = null;
        field3791 = null;
        if (arg0 != 64) {
            method1236(null, null, null, 28);
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Ljc;Ljc;Ljc;I)V")
    public static final void method1236(class85 arg0, class85 arg1, class85 arg2, int arg3) {
        class135.field2924 = arg1;
        class24.field557 = arg0;
        int var4 = 16 / ((arg3 - 1) / 44);
        field3787++;
        class91.field2133 = arg2;
    }
}
