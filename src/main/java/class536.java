import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iu")
public class class536 extends class416 {

    @OriginalMember(owner = "client!iu", name = "k", descriptor = "Z")
    public boolean field7839 = false;

    @OriginalMember(owner = "client!iu", name = "l", descriptor = "Z")
    private boolean field7840 = false;

    @OriginalMember(owner = "client!iu", name = "p", descriptor = "I")
    public int field7844 = 0;

    @OriginalMember(owner = "client!iu", name = "n", descriptor = "Lqe;")
    private class433 field7842 = new class433();

    @OriginalMember(owner = "client!iu", name = "s", descriptor = "I")
    private int field7847 = 0;

    @OriginalMember(owner = "client!iu", name = "r", descriptor = "Lor;")
    public class594 field7846 = new class594();

    @OriginalMember(owner = "client!iu", name = "u", descriptor = "Z")
    private boolean field7849 = false;

    @OriginalMember(owner = "client!iu", name = "t", descriptor = "Z")
    public boolean field7848 = false;

    @OriginalMember(owner = "client!iu", name = "v", descriptor = "I")
    private int field7850 = 0;

    @OriginalMember(owner = "client!iu", name = "x", descriptor = "Ltt;")
    public class79 field7852 = new class79();

    @OriginalMember(owner = "client!iu", name = "o", descriptor = "[Ltn;")
    public class77[] field7843 = new class77[8192];

    @OriginalMember(owner = "client!iu", name = "j", descriptor = "[Z")
    private static boolean[] field7838 = new boolean[8];

    @OriginalMember(owner = "client!iu", name = "i", descriptor = "[Z")
    private static boolean[] field7837 = new boolean[32];

    @OriginalMember(owner = "client!iu", name = "w", descriptor = "I")
    public int field7851;

    @OriginalMember(owner = "client!iu", name = "m", descriptor = "J")
    private long field7841;

    @OriginalMember(owner = "client!iu", name = "q", descriptor = "J")
    private long field7845;

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "()V")
    public final void method3246() {
        this.field7839 = true;
        for (class182 var1 = (class182) this.field7846.method3465((byte) -77); var1 != null; var1 = (class182) this.field7846.method3469(0)) {
            if (var1.field3058.field8318 == 1) {
                var1.method958((byte) 69);
            }
        }
        for (int var2 = 0; var2 < this.field7843.length; var2++) {
            if (this.field7843[var2] != null) {
                this.field7843[var2].method758();
                this.field7843[var2] = null;
            }
        }
        this.field7844 = 0;
        this.field7842 = new class433();
        this.field7847 = 0;
        this.field7846 = new class594();
        this.field7850 = 0;
        this.method2648((byte) -25);
        class210.field3507[class582.field8279] = this;
        class582.field8279 = class582.field8279 + 1 & class664.field9247[class165.field2779];
    }

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "()V")
    private final void method3247() {
        this.field7840 = false;
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "([Lrea;Z)V")
    private final void method3248(class192[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field7838[var3] = false;
        }
        label76: for (class182 var4 = (class182) this.field7846.method3465((byte) -17); var4 != null; var4 = (class182) this.field7846.method3469(0)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field3062 || arg0[var7].field3166 == var4.field3062) {
                        field7838[var7] = true;
                        var4.method1484(-72);
                        continue label76;
                    }
                }
            }
            if (!arg1) {
                var4.method707((byte) -105);
                this.field7850--;
                if (var4.method953((byte) 124)) {
                    var4.method958((byte) 69);
                    class57.field745--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && var5 != 8 && this.field7850 != 8; var5++) {
            if (!field7838[var5]) {
                class182 var6 = null;
                if (arg0[var5].method1530((byte) 105).field8318 == 1 && class57.field745 < 32) {
                    var6 = new class182(arg0[var5], this);
                    class597.field8466.method2796(-1, var6, (long) arg0[var5].field3176);
                    class57.field745++;
                }
                if (var6 == null) {
                    var6 = new class182(arg0[var5], this);
                }
                this.field7846.method3463((byte) -87, var6);
                this.field7850++;
                field7838[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "(IZ)Liu;")
    public static final class536 method3249(int arg0, boolean arg1) {
        if (class582.field8279 == class411.field6317) {
            return new class536(arg0, arg1);
        } else {
            class536 var2 = class210.field3507[class411.field6317];
            class411.field6317 = class411.field6317 + 1 & class664.field9247[class165.field2779];
            var2.method3252(arg0, arg1);
            return var2;
        }
    }

    @OriginalMember(owner = "client!iu", name = "c", descriptor = "()Ltt;")
    public final class79 method3250() {
        return this.field7852;
    }

    @OriginalMember(owner = "client!iu", name = "d", descriptor = "()V")
    public final void method3251() {
        this.field7840 = true;
    }

    @OriginalMember(owner = "client!iu", name = "c", descriptor = "(IZ)V")
    private final void method3252(int arg0, boolean arg1) {
        class364.field5737.method2757(this, -1);
        this.field7845 = arg0;
        this.field7841 = arg0;
        this.field7849 = true;
        this.field7848 = arg1;
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(Lr;)V")
    public final void method3253(class167 arg0) {
        this.field7852.field999.method1895(112);
        for (class193 var2 = (class193) this.field7842.method2754((byte) -91); var2 != null; var2 = (class193) this.field7842.method2759(1486415172)) {
            var2.method1536(this.field7841, arg0, -60643368);
        }
    }

    @OriginalMember(owner = "client!iu", name = "e", descriptor = "()Ltt;")
    public final class79 method3254() {
        this.field7852.field999.method1895(112);
        for (int var1 = 0; var1 < this.field7843.length; var1++) {
            if (this.field7843[var1] != null && this.field7843[var1].field974 != null) {
                this.field7852.field999.method1896(this.field7843[var1], (byte) -110);
            }
        }
        return this.field7852;
    }

    @OriginalMember(owner = "client!iu", name = "f", descriptor = "()V")
    public static void method3255() {
        field7837 = null;
        field7838 = null;
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(Lr;J)Z")
    public final boolean method3256(class167 arg0, long arg1) {
        if (this.field7845 == this.field7841) {
            this.method3247();
        } else {
            this.method3251();
        }
        if (arg1 - this.field7845 > 750L) {
            this.method3246();
            return false;
        }
        int var4 = (int) (arg1 - this.field7841);
        if (this.field7849) {
            for (class193 var5 = (class193) this.field7842.method2754((byte) -18); var5 != null; var5 = (class193) this.field7842.method2759(1486415172)) {
                for (int var6 = 0; var6 < var5.field3192.field6110; var6++) {
                    var5.method1534(1, arg1, 1853, arg0, !this.field7840);
                }
            }
            this.field7849 = false;
        }
        for (class193 var7 = (class193) this.field7842.method2754((byte) 126); var7 != null; var7 = (class193) this.field7842.method2759(1486415172)) {
            var7.method1534(var4, arg1, 1853, arg0, !this.field7840);
        }
        this.field7841 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(Lr;J[Lti;[Lrea;Z)V")
    public final void method3257(class167 arg0, long arg1, class406[] arg2, class192[] arg3, boolean arg4) {
        if (!this.field7839) {
            this.method3260(arg0, arg2, arg4);
            this.method3248(arg3, arg4);
            this.field7845 = arg1;
        }
    }

    @OriginalMember(owner = "client!iu", name = "g", descriptor = "()V")
    public final void method3258() {
        this.field7849 = true;
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(IIIII)V")
    public final void method3259(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field7851 = arg0;
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(Lr;[Lti;Z)V")
    private final void method3260(class167 arg0, class406[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 32; var4++) {
            field7837[var4] = false;
        }
        label67: for (class193 var5 = (class193) this.field7842.method2754((byte) -21); var5 != null; var5 = (class193) this.field7842.method2759(1486415172)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field3201 || arg1[var8].field6267 == var5.field3201) {
                        field7837[var8] = true;
                        var5.method1533(-73);
                        var5.field3204 = false;
                        continue label67;
                    }
                }
            }
            if (!arg2) {
                if (var5.field3194 == 0) {
                    var5.method2648((byte) -25);
                    this.field7847--;
                } else {
                    var5.field3204 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && var6 != 32 && this.field7847 != 32; var6++) {
            if (!field7837[var6]) {
                class193 var7 = new class193(arg0, arg1[var6], this, this.field7845);
                this.field7842.method2757(var7, -1);
                this.field7847++;
                field7837[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(J)V")
    public final void method3261(long arg0) {
        this.field7845 = arg0;
    }

    @OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(IZ)V")
    private class536(int arg0, boolean arg1) {
        this.method3252(arg0, arg1);
    }
}
