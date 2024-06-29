import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class class527 extends class388 {

    @OriginalMember(owner = "client!lr", name = "l", descriptor = "I")
    public int field7791 = 0;

    @OriginalMember(owner = "client!lr", name = "k", descriptor = "Z")
    public boolean field7790 = false;

    @OriginalMember(owner = "client!lr", name = "n", descriptor = "Z")
    private boolean field7793 = false;

    @OriginalMember(owner = "client!lr", name = "p", descriptor = "Los;")
    private class305 field7795 = new class305();

    @OriginalMember(owner = "client!lr", name = "s", descriptor = "I")
    private int field7798 = 0;

    @OriginalMember(owner = "client!lr", name = "r", descriptor = "Lwl;")
    public class280 field7797 = new class280();

    @OriginalMember(owner = "client!lr", name = "u", descriptor = "Z")
    private boolean field7800 = false;

    @OriginalMember(owner = "client!lr", name = "x", descriptor = "I")
    private int field7803 = 0;

    @OriginalMember(owner = "client!lr", name = "y", descriptor = "Lpm;")
    public class411 field7804 = new class411();

    @OriginalMember(owner = "client!lr", name = "o", descriptor = "[Lcv;")
    public class398[] field7794 = new class398[8192];

    @OriginalMember(owner = "client!lr", name = "m", descriptor = "J")
    private long field7792;

    @OriginalMember(owner = "client!lr", name = "j", descriptor = "J")
    private long field7789;

    @OriginalMember(owner = "client!lr", name = "i", descriptor = "[Z")
    private static boolean[] field7788 = new boolean[8];

    @OriginalMember(owner = "client!lr", name = "q", descriptor = "[Z")
    private static boolean[] field7796 = new boolean[8];

    @OriginalMember(owner = "client!lr", name = "t", descriptor = "I")
    public int field7799;

    @OriginalMember(owner = "client!lr", name = "v", descriptor = "I")
    public int field7801;

    @OriginalMember(owner = "client!lr", name = "w", descriptor = "I")
    public int field7802;

    @OriginalMember(owner = "client!lr", name = "z", descriptor = "I")
    public int field7805;

    @OriginalMember(owner = "client!lr", name = "A", descriptor = "I")
    public int field7806;

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(J)V")
    public final void method3095(long arg0) {
        this.field7792 = arg0;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "()V")
    public final void method3096() {
        this.field7804.field5648.method632(2);
        for (class64 var1 = (class64) this.field7795.method1771(12); var1 != null; var1 = (class64) this.field7795.method1774((byte) -54)) {
            var1.method441((byte) 98, this.field7789);
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lqa;[Lqm;Z)V")
    private final void method3097(class162 arg0, class96[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 8; var4++) {
            field7796[var4] = false;
        }
        label64: for (class64 var5 = (class64) this.field7795.method1771(-30); var5 != null; var5 = (class64) this.field7795.method1774((byte) -44)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field1001 || arg1[var8].field1434 == var5.field1001) {
                        field7796[var8] = true;
                        var5.method440(-123);
                        var5.field983 = false;
                        continue label64;
                    }
                }
            }
            if (!arg2) {
                if (var5.field984 == 0) {
                    var5.method2291(-116);
                    this.field7798--;
                } else {
                    var5.field983 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && this.field7798 != 8; var6++) {
            if (!field7796[var6]) {
                class64 var7 = new class64(arg0, arg1[var6], this, this.field7792);
                this.field7795.method1766((byte) 60, var7);
                this.field7798++;
                field7796[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "()V")
    private final void method3098() {
        this.field7793 = false;
    }

    @OriginalMember(owner = "client!lr", name = "c", descriptor = "()V")
    public final void method3099() {
        this.field7793 = true;
    }

    @OriginalMember(owner = "client!lr", name = "d", descriptor = "()Lpm;")
    public final class411 method3100() {
        return this.field7804;
    }

    @OriginalMember(owner = "client!lr", name = "e", descriptor = "()V")
    public final void method3101() {
        this.field7790 = true;
        for (class41 var1 = (class41) this.field7797.method1672((byte) -87); var1 != null; var1 = (class41) this.field7797.method1668(-1)) {
            if (var1.field618.field3457 == 1) {
                var1.method2856(0);
            }
        }
        this.field7794 = new class398[8192];
        this.field7791 = 0;
        this.field7795 = new class305();
        this.field7798 = 0;
        this.field7797 = new class280();
        this.field7803 = 0;
        this.method2291(-86);
    }

    @OriginalMember(owner = "client!lr", name = "f", descriptor = "()V")
    public static void method3102() {
        field7796 = null;
        field7788 = null;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lqa;J)Z")
    public final boolean method3103(class162 arg0, long arg1) {
        if (this.field7792 == this.field7789) {
            this.method3098();
        } else {
            this.method3099();
        }
        if (arg1 - this.field7792 > 750L) {
            this.method3101();
            return false;
        }
        int var4 = (int) (arg1 - this.field7789);
        if (this.field7800) {
            for (class64 var5 = (class64) this.field7795.method1771(115); var5 != null; var5 = (class64) this.field7795.method1774((byte) -78)) {
                for (int var6 = 0; var6 < var5.field996.field3890; var6++) {
                    var5.method442(arg0, !this.field7793, 1, 9429, arg1);
                }
            }
            this.field7800 = false;
        }
        for (class64 var7 = (class64) this.field7795.method1771(114); var7 != null; var7 = (class64) this.field7795.method1774((byte) -27)) {
            var7.method442(arg0, !this.field7793, var4, 9429, arg1);
        }
        this.field7789 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!lr", name = "g", descriptor = "()V")
    public final void method3104() {
        this.field7800 = true;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "([Lau;Z)V")
    private final void method3105(class516[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field7788[var3] = false;
        }
        label73: for (class41 var4 = (class41) this.field7797.method1672((byte) -94); var4 != null; var4 = (class41) this.field7797.method1668(-1)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field612 || arg0[var7].field7643 == var4.field612) {
                        field7788[var7] = true;
                        var4.method297(0);
                        continue label73;
                    }
                }
            }
            if (!arg1) {
                var4.method300(false);
                this.field7803--;
                if (var4.method2858((byte) -57)) {
                    var4.method2856(0);
                    class370.field4987--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && this.field7803 != 8; var5++) {
            if (!field7788[var5]) {
                class41 var6 = null;
                if (arg0[var5].method3043(-122).field3457 == 1 && class370.field4987 < 32) {
                    var6 = new class41(arg0[var5], this);
                    class56.field881.method2541((long) arg0[var5].field7642, var6, -1);
                    class370.field4987++;
                }
                if (var6 == null) {
                    var6 = new class41(arg0[var5], this);
                }
                this.field7797.method1666((byte) -124, var6);
                this.field7803++;
                field7788[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "(IIIII)V")
    public final void method3106(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field7806 = arg0;
        this.field7802 = arg1;
        this.field7799 = arg2;
        this.field7805 = arg3;
        this.field7801 = arg4;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lqa;J[Lqm;[Lau;Z)V")
    public final void method3107(class162 arg0, long arg1, class96[] arg2, class516[] arg3, boolean arg4) {
        if (!this.field7790) {
            this.method3097(arg0, arg2, arg4);
            this.method3105(arg3, arg4);
            this.field7792 = arg1;
        }
    }

    @OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(I)V")
    public class527(int arg0) {
        class264.field3485.method1766((byte) 121, this);
        this.field7792 = arg0;
        this.field7789 = arg0;
        this.field7800 = true;
    }
}
