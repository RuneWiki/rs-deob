import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class159 implements Runnable {

    @OriginalMember(owner = "client!re", name = "l", descriptor = "Z")
    public boolean field3218 = true;

    @OriginalMember(owner = "client!re", name = "i", descriptor = "Ljava/lang/Object;")
    public Object field3215 = new Object();

    @OriginalMember(owner = "client!re", name = "m", descriptor = "[I")
    public int[] field3219 = new int[500];

    @OriginalMember(owner = "client!re", name = "o", descriptor = "[I")
    public int[] field3221 = new int[500];

    @OriginalMember(owner = "client!re", name = "n", descriptor = "I")
    public int field3220 = 0;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "Lob;")
    public static class129 field3211 = null;

    @OriginalMember(owner = "client!re", name = "h", descriptor = "Z")
    public static boolean field3214 = false;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "Led;")
    public static class43 field3209 = class191.method1219(":chalreq:", false);

    @OriginalMember(owner = "client!re", name = "k", descriptor = "Ltd;")
    public static class176 field3217 = new class176(5);

    @OriginalMember(owner = "client!re", name = "p", descriptor = "Led;")
    public static class43 field3222 = class191.method1219("au", false);

    @OriginalMember(owner = "client!re", name = "s", descriptor = "Led;")
    private static class43 field3225 = class191.method1219("We suspect someone knows your password)3", false);

    @OriginalMember(owner = "client!re", name = "q", descriptor = "Led;")
    public static class43 field3223 = field3225;

    @OriginalMember(owner = "client!re", name = "t", descriptor = "Led;")
    private static class43 field3226 = class191.method1219("You can(Wt add yourself to your own ignore list)3", false);

    @OriginalMember(owner = "client!re", name = "r", descriptor = "I")
    public static int field3224 = 1;

    @OriginalMember(owner = "client!re", name = "u", descriptor = "Led;")
    public static class43 field3227 = field3226;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "I")
    public static int field3207;

    @OriginalMember(owner = "client!re", name = "b", descriptor = "I")
    public static int field3208;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "I")
    public static int field3210;

    @OriginalMember(owner = "client!re", name = "f", descriptor = "I")
    public static int field3212;

    @OriginalMember(owner = "client!re", name = "j", descriptor = "I")
    public static int field3216;

    @OriginalMember(owner = "client!re", name = "g", descriptor = "[I")
    public static int[] field3213;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(B)V")
    public static final void method999(byte arg0) {
        field3216++;
        if (arg0 != 13) {
            field3209 = null;
        }
        if (class49.field981 != null && class122.field2451 != null) {
            return;
        }
        class122.field2451 = new int[256];
        class49.field981 = new int[256];
        for (int var1 = 0; var1 < 256; var1++) {
            double var2 = (double) var1 / 255.0D * 6.283185307179586D;
            class49.field981[var1] = (int) (Math.sin(var2) * 4096.0D);
            class122.field2451[var1] = (int) (Math.cos(var2) * 4096.0D);
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IILga;)Z")
    public static final boolean method1000(int arg0, int arg1, class58 arg2) {
        if (arg0 < 121) {
            method999((byte) -78);
        }
        field3210++;
        byte[] var3 = arg2.method364(26552, arg1);
        if (var3 == null) {
            return false;
        } else {
            class101.method626(-18, var3);
            return true;
        }
    }

    @OriginalMember(owner = "client!re", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field3218) {
            Object var1 = this.field3215;
            synchronized (this.field3215) {
                if (this.field3220 < 500) {
                    this.field3219[this.field3220] = class185.field3654;
                    this.field3221[this.field3220] = class105.field1998;
                    this.field3220++;
                }
            }
            class38.method209(50L, -7296);
        }
        field3207++;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIII)V")
    public static final void method1001(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3208++;
        class174 var5 = (class174) class90.field1792.method75((long) arg1, -103);
        if (var5 == null) {
            var5 = new class174();
            class90.field1792.method82(78, var5, (long) arg1);
        }
        int var6 = -87 % (arg4 / 35);
        if (arg2 >= var5.field3462.length) {
            int[] var7 = new int[arg2 + 1];
            int[] var8 = new int[arg2 + 1];
            for (int var9 = 0; var9 < var5.field3462.length; var9++) {
                var7[var9] = var5.field3462[var9];
                var8[var9] = var5.field3468[var9];
            }
            for (int var10 = var5.field3462.length; var10 < arg2; var10++) {
                var7[var10] = -1;
                var8[var10] = 0;
            }
            var5.field3462 = var7;
            var5.field3468 = var8;
        }
        var5.field3462[arg2] = arg0;
        var5.field3468[arg2] = arg3;
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(B)V")
    public static final void method1002(byte arg0) {
        field3212++;
        if (arg0 != -2) {
            method999((byte) 106);
        }
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < class41.field799 - 1; var2++) {
                if (class40.field756[var2] < 1000 && class40.field756[var2 + 1] > 1000) {
                    class43 var3 = class115.field2237[var2];
                    var1 = false;
                    class115.field2237[var2] = class115.field2237[var2 + 1];
                    class115.field2237[var2 + 1] = var3;
                    class43 var4 = class112.field2141[var2];
                    class112.field2141[var2] = class112.field2141[var2 + 1];
                    class112.field2141[var2 + 1] = var4;
                    int var5 = class40.field756[var2];
                    class40.field756[var2] = class40.field756[var2 + 1];
                    class40.field756[var2 + 1] = var5;
                    int var6 = class115.field2243[var2];
                    class115.field2243[var2] = class115.field2243[var2 + 1];
                    class115.field2243[var2 + 1] = var6;
                    int var7 = class171.field3405[var2];
                    class171.field3405[var2] = class171.field3405[var2 + 1];
                    class171.field3405[var2 + 1] = var7;
                    int var8 = class203.field3961[var2];
                    class203.field3961[var2] = class203.field3961[var2 + 1];
                    class203.field3961[var2 + 1] = var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(B)V")
    public static void method1003(byte arg0) {
        if (arg0 != 112) {
            field3225 = null;
        }
        field3222 = null;
        field3209 = null;
        field3227 = null;
        field3226 = null;
        field3211 = null;
        field3223 = null;
        field3213 = null;
        field3217 = null;
        field3225 = null;
    }
}
