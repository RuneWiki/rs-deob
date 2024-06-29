import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class346 {

    @OriginalMember(owner = "client!vq", name = "h", descriptor = "Lof;")
    private class328 field5387 = new class328(64);

    @OriginalMember(owner = "client!vq", name = "o", descriptor = "Lmn;")
    private class162 field5394;

    @OriginalMember(owner = "client!vq", name = "i", descriptor = "I")
    public static int field5388 = -1;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "I")
    public static int field5380;

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "I")
    public static int field5381;

    @OriginalMember(owner = "client!vq", name = "c", descriptor = "I")
    public static int field5382;

    @OriginalMember(owner = "client!vq", name = "d", descriptor = "I")
    public static int field5383;

    @OriginalMember(owner = "client!vq", name = "e", descriptor = "I")
    public static int field5384;

    @OriginalMember(owner = "client!vq", name = "f", descriptor = "I")
    public static int field5385;

    @OriginalMember(owner = "client!vq", name = "g", descriptor = "I")
    public static int field5386;

    @OriginalMember(owner = "client!vq", name = "j", descriptor = "I")
    public static int field5389;

    @OriginalMember(owner = "client!vq", name = "k", descriptor = "I")
    public static int field5390;

    @OriginalMember(owner = "client!vq", name = "l", descriptor = "I")
    public static int field5391;

    @OriginalMember(owner = "client!vq", name = "n", descriptor = "I")
    public static int field5393;

    // $FF: synthetic field
    @OriginalMember(owner = "client!vq", name = "p", descriptor = "Ljava/lang/Class;")
    public static Class field5395;

    @OriginalMember(owner = "client!vq", name = "m", descriptor = "[I")
    public static int[] field5392;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(ILgi;ZI)V")
    public static final void method2285(int arg0, class437 arg1, boolean arg2, int arg3) {
        class142.field1927 = arg1;
        class131.field1779 = arg0;
        field5382++;
        if (!arg2) {
            class517.field7677 = arg3;
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(Luj;B)V")
    public static final void method2286(class422 arg0, byte arg1) {
        field5384++;
        if (class217.field3699 == null) {
            return;
        }
        class267 var2 = null;
        if (arg0.field6398 == 0) {
            var2 = (class267) class409.method2611(arg0.field6403, arg0.field6402, arg0.field6404);
        }
        if (arg0.field6398 == 1) {
            var2 = (class267) class75.method544(arg0.field6403, arg0.field6402, arg0.field6404);
        }
        if (arg0.field6398 == 2) {
            var2 = (class267) class49.method352(arg0.field6403, arg0.field6402, arg0.field6404, field5395 == null ? (field5395 = method2296("jq")) : field5395);
        }
        if (arg1 >= -45) {
            method2285(115, null, false, 67);
        }
        if (arg0.field6398 == 3) {
            var2 = (class267) class76.method548(arg0.field6403, arg0.field6402, arg0.field6404);
        }
        if (var2 == null) {
            arg0.field6400 = -1;
            arg0.field6395 = 0;
            arg0.field6401 = 0;
        } else {
            arg0.field6400 = var2.method96((byte) 116);
            arg0.field6395 = var2.method99((byte) 125);
            arg0.field6401 = var2.method106((byte) 18);
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(I)V")
    public static void method2287(int arg0) {
        field5392 = null;
        if (arg0 != 49) {
            field5391 = 48;
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IILza;IIIII[[[BIIII)V")
    public static final void method2288(int arg0, int arg1, class497 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte[][][] arg8, int arg9, int arg10, int arg11, int arg12) {
        field5385++;
        if (arg10 == 0 || arg5 == 0) {
            return;
        }
        if (arg10 == 9) {
            arg10 = 1;
            arg0 = arg0 + 1 & 0x3;
        }
        if (arg1 > -17) {
            method2285(-44, null, true, 96);
        }
        if (arg10 == 10) {
            arg0 = arg0 + 3 & 0x3;
            arg10 = 1;
        }
        if (arg10 == 11) {
            arg0 = arg0 + 3 & 0x3;
            arg10 = 8;
        }
        arg2.method1271(arg6, arg11, arg12, arg7, arg4, arg3, arg8[arg10 - 1][arg0], arg5, arg9);
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(II)V")
    public final void method2289(int arg0, int arg1) {
        if (arg0 != 1) {
            method2286(null, (byte) 51);
        }
        class328 var3 = this.field5387;
        synchronized (this.field5387) {
            this.field5387.method2202(0, arg1);
        }
        field5381++;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(B)V")
    public static final void method2290(byte arg0) {
        class234.field3861 = 0;
        field5383++;
        int var1 = 0;
        if (arg0 != -117) {
            method2287(37);
        }
        while (var1 < 2048) {
            class456.field7044[var1] = null;
            class467.field7156[var1] = 1;
            class460.field7103[var1] = null;
            var1++;
        }
    }

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "(B)V")
    public final void method2291(byte arg0) {
        class328 var2 = this.field5387;
        synchronized (this.field5387) {
            if (arg0 != 100) {
                return;
            }
            this.field5387.method2189(false);
        }
        field5386++;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIIII)V")
    public static final void method2292(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5390++;
        for (int var5 = arg1; var5 < class126.field1703; var5++) {
            Rectangle var6 = class18.field194[var5];
            if (var6.x + var6.width > arg4 && var6.x < arg4 + arg0 && var6.y + var6.height > arg2 && var6.y < (arg2 + arg3)) {
                class520.field7707[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "(I)V")
    public final void method2293(int arg0) {
        field5380++;
        class328 var2 = this.field5387;
        synchronized (this.field5387) {
            this.field5387.method2187(arg0);
        }
        if (arg0 != -1) {
            field5388 = 9;
        }
    }

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "(II)Lgt;")
    public final class289 method2294(int arg0, int arg1) {
        field5389++;
        class328 var3 = this.field5387;
        class289 var4;
        synchronized (this.field5387) {
            var4 = (class289) this.field5387.method2191((byte) -73, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class162 var5 = this.field5394;
        byte[] var6;
        synchronized (this.field5394) {
            var6 = this.field5394.method1004(32, false, arg0);
        }
        class289 var7 = new class289();
        if (var6 != null) {
            var7.method1945(-4026, new class208(var6));
        }
        if (arg1 != 1) {
            return null;
        }
        class328 var8 = this.field5387;
        synchronized (this.field5387) {
            this.field5387.method2188(-122, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lhw;I)V")
    public static final void method2295(class208 arg0, int arg1) {
        field5393++;
        if (arg0.field3193.length - arg0.field3162 < 1) {
            return;
        }
        int var2 = arg0.method1445(82);
        if (var2 < 0 || var2 > 1 || (arg0.field3193.length - arg0.field3162) < 2) {
            return;
        }
        int var3 = arg0.method1455(-3387);
        if ((arg0.field3193.length - arg0.field3162) < (arg1 * var3)) {
            return;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method1455(-3387);
            int var6 = arg0.method1436((byte) 99);
            if (class187.field2726.length > var5 && class225.field3770[var5] && (class483.field7340.method353(arg1 ^ 0x15, var5).field5914 != '1' || var6 >= -1 && var6 <= 1)) {
                class187.field2726[var5] = var6;
            }
        }
    }

    @OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(Lpr;ILmn;)V")
    public class346(class236 arg0, int arg1, class162 arg2) {
        this.field5394 = arg2;
        this.field5394.method1008(32, (byte) -21);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2296(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
