import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hda")
public class class635 extends class600 {

    @OriginalMember(owner = "client!hda", name = "i", descriptor = "Z")
    public boolean field8982 = false;

    @OriginalMember(owner = "client!hda", name = "g", descriptor = "Z")
    private boolean field8980 = false;

    @OriginalMember(owner = "client!hda", name = "n", descriptor = "I")
    public int field8987 = 0;

    @OriginalMember(owner = "client!hda", name = "m", descriptor = "Liv;")
    private class565 field8986 = new class565();

    @OriginalMember(owner = "client!hda", name = "p", descriptor = "I")
    private int field8989 = 0;

    @OriginalMember(owner = "client!hda", name = "q", descriptor = "Lau;")
    public class692 field8990 = new class692();

    @OriginalMember(owner = "client!hda", name = "s", descriptor = "Z")
    public boolean field8992 = false;

    @OriginalMember(owner = "client!hda", name = "u", descriptor = "I")
    private int field8994 = 0;

    @OriginalMember(owner = "client!hda", name = "v", descriptor = "Z")
    private boolean field8995 = false;

    @OriginalMember(owner = "client!hda", name = "r", descriptor = "Lqg;")
    public class272 field8991 = new class272();

    @OriginalMember(owner = "client!hda", name = "l", descriptor = "[Lrea;")
    public class32[] field8985 = new class32[8192];

    @OriginalMember(owner = "client!hda", name = "j", descriptor = "[Z")
    private static boolean[] field8983 = new boolean[32];

    @OriginalMember(owner = "client!hda", name = "o", descriptor = "[Z")
    private static boolean[] field8988 = new boolean[8];

    @OriginalMember(owner = "client!hda", name = "t", descriptor = "I")
    public int field8993;

    @OriginalMember(owner = "client!hda", name = "h", descriptor = "J")
    private long field8981;

    @OriginalMember(owner = "client!hda", name = "k", descriptor = "J")
    private long field8984;

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(Lr;[Lkw;Z)V")
    private final void method3573(class98 arg0, class7[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 32; var4++) {
            field8983[var4] = false;
        }
        label67: for (class344 var5 = (class344) this.field8986.method3313((byte) 99); var5 != null; var5 = (class344) this.field8986.method3308(11)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field4825 || arg1[var8].field63 == var5.field4825) {
                        field8983[var8] = true;
                        var5.method2064(-1);
                        var5.field4823 = false;
                        continue label67;
                    }
                }
            }
            if (!arg2) {
                if (var5.field4824 == 0) {
                    var5.method3421(3);
                    this.field8989--;
                } else {
                    var5.field4823 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && var6 != 32 && this.field8989 != 32; var6++) {
            if (!field8983[var6]) {
                class344 var7 = new class344(arg0, arg1[var6], this, this.field8981);
                this.field8986.method3307(0, var7);
                this.field8989++;
                field8983[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "()Lqg;")
    public final class272 method3574() {
        this.field8991.field3898.method271((byte) -80);
        for (int var1 = 0; var1 < this.field8985.length; var1++) {
            if (this.field8985[var1] != null && this.field8985[var1].field462 != null) {
                this.field8991.field3898.method272(this.field8985[var1], 28386);
            }
        }
        return this.field8991;
    }

    @OriginalMember(owner = "client!hda", name = "b", descriptor = "()V")
    private final void method3575() {
        this.field8980 = false;
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(J)V")
    public final void method3576(long arg0) {
        this.field8981 = arg0;
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(Lr;)V")
    public final void method3577(class98 arg0) {
        this.field8991.field3898.method271((byte) -80);
        for (class344 var2 = (class344) this.field8986.method3313((byte) 77); var2 != null; var2 = (class344) this.field8986.method3308(13)) {
            var2.method2066(-114, arg0, this.field8984);
        }
    }

    @OriginalMember(owner = "client!hda", name = "c", descriptor = "()V")
    public final void method3578() {
        this.field8982 = true;
        for (class584 var1 = (class584) this.field8990.method3905(-115); var1 != null; var1 = (class584) this.field8990.method3899(0)) {
            if (var1.field8549.field1675 == 1) {
                var1.method1113(32730);
            }
        }
        for (int var2 = 0; var2 < this.field8985.length; var2++) {
            if (this.field8985[var2] != null) {
                this.field8985[var2].method290();
                this.field8985[var2] = null;
            }
        }
        this.field8987 = 0;
        this.field8986 = new class565();
        this.field8989 = 0;
        this.field8990 = new class692();
        this.field8994 = 0;
        this.method3421(3);
        class358.field5000[class435.field6260] = this;
        class435.field6260 = class435.field6260 + 1 & class522.field7696[class201.field3102];
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(Lr;J[Lkw;[Lcea;Z)V")
    public final void method3579(class98 arg0, long arg1, class7[] arg2, class94[] arg3, boolean arg4) {
        if (!this.field8982) {
            this.method3573(arg0, arg2, arg4);
            this.method3586(arg3, arg4);
            this.field8981 = arg1;
        }
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(IZ)Lhda;")
    public static final class635 method3580(int arg0, boolean arg1) {
        if (class73.field1157 == class435.field6260) {
            return new class635(arg0, arg1);
        } else {
            class635 var2 = class358.field5000[class73.field1157];
            class73.field1157 = class73.field1157 + 1 & class522.field7696[class201.field3102];
            var2.method3582(arg0, arg1);
            return var2;
        }
    }

    @OriginalMember(owner = "client!hda", name = "d", descriptor = "()Lqg;")
    public final class272 method3581() {
        return this.field8991;
    }

    @OriginalMember(owner = "client!hda", name = "b", descriptor = "(IZ)V")
    private final void method3582(int arg0, boolean arg1) {
        class18.field268.method3307(0, this);
        this.field8981 = arg0;
        this.field8984 = arg0;
        this.field8995 = true;
        this.field8992 = arg1;
    }

    @OriginalMember(owner = "client!hda", name = "e", descriptor = "()V")
    public final void method3583() {
        this.field8995 = true;
    }

    @OriginalMember(owner = "client!hda", name = "f", descriptor = "()V")
    public final void method3584() {
        this.field8980 = true;
    }

    @OriginalMember(owner = "client!hda", name = "g", descriptor = "()V")
    public static void method3585() {
        field8983 = null;
        field8988 = null;
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "([Lcea;Z)V")
    private final void method3586(class94[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field8988[var3] = false;
        }
        label76: for (class584 var4 = (class584) this.field8990.method3905(-113); var4 != null; var4 = (class584) this.field8990.method3899(0)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field8557 || arg0[var7].field1390 == var4.field8557) {
                        field8988[var7] = true;
                        var4.method3375(2);
                        continue label76;
                    }
                }
            }
            if (!arg1) {
                var4.method2549((byte) -87);
                this.field8994--;
                if (var4.method1114((byte) 0)) {
                    var4.method1113(32730);
                    class443.field6423--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && var5 != 8 && this.field8994 != 8; var5++) {
            if (!field8988[var5]) {
                class584 var6 = null;
                if (arg0[var5].method722(false).field1675 == 1 && class443.field6423 < 32) {
                    var6 = new class584(arg0[var5], this);
                    class5.field46.method3866(var6, -47, (long) arg0[var5].field1401);
                    class443.field6423++;
                }
                if (var6 == null) {
                    var6 = new class584(arg0[var5], this);
                }
                this.field8990.method3904(var6, 0);
                this.field8994++;
                field8988[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(IIIII)V")
    public final void method3587(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field8993 = arg0;
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(Lr;J)Z")
    public final boolean method3588(class98 arg0, long arg1) {
        if (this.field8984 == this.field8981) {
            this.method3575();
        } else {
            this.method3584();
        }
        if (arg1 - this.field8981 > 750L) {
            this.method3578();
            return false;
        }
        int var4 = (int) (arg1 - this.field8984);
        if (this.field8995) {
            for (class344 var5 = (class344) this.field8986.method3313((byte) 72); var5 != null; var5 = (class344) this.field8986.method3308(-107)) {
                for (int var6 = 0; var6 < var5.field4818.field8351; var6++) {
                    var5.method2062(arg1, !this.field8980, arg0, 1, 29437);
                }
            }
            this.field8995 = false;
        }
        for (class344 var7 = (class344) this.field8986.method3313((byte) 46); var7 != null; var7 = (class344) this.field8986.method3308(-125)) {
            var7.method2062(arg1, !this.field8980, arg0, var4, 29437);
        }
        this.field8984 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!hda", name = "<init>", descriptor = "(IZ)V")
    private class635(int arg0, boolean arg1) {
        this.method3582(arg0, arg1);
    }
}
