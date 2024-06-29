import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public class class231 extends class389 {

    @OriginalMember(owner = "client!ru", name = "l", descriptor = "I")
    public int field3084 = 0;

    @OriginalMember(owner = "client!ru", name = "j", descriptor = "Z")
    private boolean field3082 = false;

    @OriginalMember(owner = "client!ru", name = "p", descriptor = "Z")
    public boolean field3088 = false;

    @OriginalMember(owner = "client!ru", name = "m", descriptor = "Lhca;")
    private class365 field3085 = new class365();

    @OriginalMember(owner = "client!ru", name = "r", descriptor = "I")
    private int field3090 = 0;

    @OriginalMember(owner = "client!ru", name = "s", descriptor = "Lki;")
    public class364 field3091 = new class364();

    @OriginalMember(owner = "client!ru", name = "w", descriptor = "Z")
    public boolean field3095 = false;

    @OriginalMember(owner = "client!ru", name = "y", descriptor = "I")
    private int field3097 = 0;

    @OriginalMember(owner = "client!ru", name = "A", descriptor = "Z")
    private boolean field3099 = false;

    @OriginalMember(owner = "client!ru", name = "t", descriptor = "Lqu;")
    public class282 field3092 = new class282();

    @OriginalMember(owner = "client!ru", name = "k", descriptor = "[Ler;")
    public class209[] field3083 = new class209[8192];

    @OriginalMember(owner = "client!ru", name = "i", descriptor = "[Z")
    private static boolean[] field3081 = new boolean[8];

    @OriginalMember(owner = "client!ru", name = "q", descriptor = "[Z")
    private static boolean[] field3089 = new boolean[32];

    @OriginalMember(owner = "client!ru", name = "u", descriptor = "I")
    public int field3093;

    @OriginalMember(owner = "client!ru", name = "v", descriptor = "I")
    public int field3094;

    @OriginalMember(owner = "client!ru", name = "x", descriptor = "I")
    public int field3096;

    @OriginalMember(owner = "client!ru", name = "z", descriptor = "I")
    public int field3098;

    @OriginalMember(owner = "client!ru", name = "B", descriptor = "I")
    public int field3100;

    @OriginalMember(owner = "client!ru", name = "n", descriptor = "J")
    private long field3086;

    @OriginalMember(owner = "client!ru", name = "o", descriptor = "J")
    private long field3087;

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "()Lqu;")
    public final class282 method1454() {
        this.field3092.field3673.method3184(-74);
        for (int var1 = 0; var1 < this.field3083.length; var1++) {
            if (this.field3083[var1] != null && this.field3083[var1].field2690 != null) {
                this.field3092.field3673.method3182(this.field3083[var1], 0);
            }
        }
        return this.field3092;
    }

    @OriginalMember(owner = "client!ru", name = "b", descriptor = "()V")
    private final void method1455() {
        this.field3082 = false;
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(IZ)V")
    private final void method1456(int arg0, boolean arg1) {
        class666.field9241.method2104((byte) -22, this);
        this.field3086 = arg0;
        this.field3087 = arg0;
        this.field3099 = true;
        this.field3095 = arg1;
    }

    @OriginalMember(owner = "client!ru", name = "c", descriptor = "()V")
    public static void method1457() {
        field3089 = null;
        field3081 = null;
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(Loa;J)Z")
    public final boolean method1458(class43 arg0, long arg1) {
        if (this.field3087 == this.field3086) {
            this.method1455();
        } else {
            this.method1463();
        }
        if (arg1 - this.field3086 > 750L) {
            this.method1459();
            return false;
        }
        int var4 = (int) (arg1 - this.field3087);
        if (this.field3099) {
            for (class512 var5 = (class512) this.field3085.method2101(260); var5 != null; var5 = (class512) this.field3085.method2098((byte) 57)) {
                for (int var6 = 0; var6 < var5.field6692.field2817; var6++) {
                    var5.method2765(arg1, (byte) -87, arg0, 1, !this.field3082);
                }
            }
            this.field3099 = false;
        }
        for (class512 var7 = (class512) this.field3085.method2101(260); var7 != null; var7 = (class512) this.field3085.method2098((byte) 57)) {
            var7.method2765(arg1, (byte) -87, arg0, var4, !this.field3082);
        }
        this.field3087 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!ru", name = "d", descriptor = "()V")
    public final void method1459() {
        this.field3088 = true;
        for (class197 var1 = (class197) this.field3091.method2090(true); var1 != null; var1 = (class197) this.field3091.method2088(-152)) {
            if (var1.field2583.field8909 == 1) {
                var1.method237((byte) -125);
            }
        }
        for (int var2 = 0; var2 < this.field3083.length; var2++) {
            if (this.field3083[var2] != null) {
                this.field3083[var2].method1340();
                this.field3083[var2] = null;
            }
        }
        this.field3084 = 0;
        this.field3085 = new class365();
        this.field3090 = 0;
        this.field3091 = new class364();
        this.field3097 = 0;
        this.method2227(66);
        class679.field9367[class336.field4351] = this;
        class336.field4351 = class336.field4351 + 1 & class590.field8008[class446.field5735];
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(J)V")
    public final void method1460(long arg0) {
        this.field3086 = arg0;
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "([Lrea;Z)V")
    private final void method1461(class32[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field3081[var3] = false;
        }
        label76: for (class197 var4 = (class197) this.field3091.method2090(true); var4 != null; var4 = (class197) this.field3091.method2088(-152)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field2592 || arg0[var7].field478 == var4.field2592) {
                        field3081[var7] = true;
                        var4.method1301((byte) -67);
                        continue label76;
                    }
                }
            }
            if (!arg1) {
                var4.method2438((byte) -116);
                this.field3097--;
                if (var4.method235(67)) {
                    var4.method237((byte) -82);
                    class385.field4919--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && var5 != 8 && this.field3097 != 8; var5++) {
            if (!field3081[var5]) {
                class197 var6 = null;
                if (arg0[var5].method260((byte) 10).field8909 == 1 && class385.field4919 < 32) {
                    var6 = new class197(arg0[var5], this);
                    class359.field4655.method3558(var6, (long) arg0[var5].field476, 121);
                    class385.field4919++;
                }
                if (var6 == null) {
                    var6 = new class197(arg0[var5], this);
                }
                this.field3091.method2087(var6, 43);
                this.field3097++;
                field3081[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(Loa;J[Lgi;[Lrea;Z)V")
    public final void method1462(class43 arg0, long arg1, class574[] arg2, class32[] arg3, boolean arg4) {
        if (!this.field3088) {
            this.method1469(arg0, arg2, arg4);
            this.method1461(arg3, arg4);
            this.field3086 = arg1;
        }
    }

    @OriginalMember(owner = "client!ru", name = "e", descriptor = "()V")
    public final void method1463() {
        this.field3082 = true;
    }

    @OriginalMember(owner = "client!ru", name = "f", descriptor = "()V")
    public final void method1464() {
        this.field3099 = true;
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(IIIII)V")
    public final void method1465(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field3094 = arg0;
        this.field3096 = arg1;
        this.field3098 = arg2;
        this.field3100 = arg3;
        this.field3093 = arg4;
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(Loa;)V")
    public final void method1466(class43 arg0) {
        this.field3092.field3673.method3184(-106);
        for (class512 var2 = (class512) this.field3085.method2101(260); var2 != null; var2 = (class512) this.field3085.method2098((byte) 57)) {
            var2.method2761(this.field3087, arg0, 200);
        }
    }

    @OriginalMember(owner = "client!ru", name = "b", descriptor = "(IZ)Lru;")
    public static final class231 method1467(int arg0, boolean arg1) {
        if (class580.field7906 == class336.field4351) {
            return new class231(arg0, arg1);
        } else {
            class231 var2 = class679.field9367[class580.field7906];
            class580.field7906 = class580.field7906 + 1 & class590.field8008[class446.field5735];
            var2.method1456(arg0, arg1);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ru", name = "g", descriptor = "()Lqu;")
    public final class282 method1468() {
        return this.field3092;
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(Loa;[Lgi;Z)V")
    private final void method1469(class43 arg0, class574[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 32; var4++) {
            field3089[var4] = false;
        }
        label67: for (class512 var5 = (class512) this.field3085.method2101(260); var5 != null; var5 = (class512) this.field3085.method2098((byte) 57)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field6691 || arg1[var8].field7465 == var5.field6691) {
                        field3089[var8] = true;
                        var5.method2766(53);
                        var5.field6701 = false;
                        continue label67;
                    }
                }
            }
            if (!arg2) {
                if (var5.field6699 == 0) {
                    var5.method2227(81);
                    this.field3090--;
                } else {
                    var5.field6701 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && var6 != 32 && this.field3090 != 32; var6++) {
            if (!field3089[var6]) {
                class512 var7 = new class512(arg0, arg1[var6], this, this.field3086);
                this.field3085.method2104((byte) -22, var7);
                this.field3090++;
                field3089[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(IZ)V")
    private class231(int arg0, boolean arg1) {
        this.method1456(arg0, arg1);
    }
}
