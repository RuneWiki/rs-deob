import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class646 extends class546 {

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "Z")
    public boolean field8923 = false;

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "I")
    public int field8927 = 0;

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "Z")
    private boolean field8928 = false;

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "Lkr;")
    private class693 field8924 = new class693();

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "I")
    private int field8929 = 0;

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "Lgca;")
    public class227 field8930 = new class227();

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "Z")
    private boolean field8932 = false;

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "I")
    private int field8934 = 0;

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "Z")
    public boolean field8931 = false;

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "Ldk;")
    public class472 field8933 = new class472();

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "[Liga;")
    public class421[] field8921 = new class421[8192];

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "[Z")
    private static boolean[] field8926 = new boolean[8];

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "[Z")
    private static boolean[] field8920 = new boolean[32];

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "I")
    public int field8935;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "J")
    private long field8922;

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "J")
    private long field8925;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "()Ldk;", line = 3)
    public final class472 method3598() {
        return this.field8933;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([Llp;Z)V", line = 8)
    private final void method3599(class357[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field8926[var3] = false;
        }
        label76: for (class701 var4 = (class701) this.field8930.method1436(28964); var4 != null; var4 = (class701) this.field8930.method1443((byte) 6)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field9938 || arg0[var7].field4733 == var4.field9938) {
                        field8926[var7] = true;
                        var4.method3924(61);
                        continue label76;
                    }
                }
            }
            if (!arg1) {
                var4.method2340(-114);
                this.field8934--;
                if (var4.method3302(0)) {
                    var4.method3301(123);
                    class60.field672--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && var5 != 8 && this.field8934 != 8; var5++) {
            if (!field8926[var5]) {
                class701 var6 = null;
                if (arg0[var5].method2047(-1).field1299 == 1 && class60.field672 < 32) {
                    var6 = new class701(arg0[var5], this);
                    class76.field1004.method1315(var6, (byte) 118, (long) arg0[var5].field4742);
                    class60.field672++;
                }
                if (var6 == null) {
                    var6 = new class701(arg0[var5], this);
                }
                this.field8930.method1441(var6, 0);
                this.field8934++;
                field8926[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "()V", line = 98)
    public final void method3600() {
        this.field8932 = true;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lr;J[Lns;[Llp;Z)V", line = 101)
    public final void method3601(class166 arg0, long arg1, class369[] arg2, class357[] arg3, boolean arg4) {
        if (!this.field8923) {
            this.method3612(arg0, arg2, arg4);
            this.method3599(arg3, arg4);
            this.field8925 = arg1;
        }
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "()V", line = 109)
    private final void method3602() {
        this.field8928 = false;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IZ)Loa;", line = 112)
    public static final class646 method3603(int arg0, boolean arg1) {
        if (class251.field3425 == class222.field3098) {
            return new class646(arg0, arg1);
        } else {
            class646 var2 = class291.field4003[class222.field3098];
            class222.field3098 = class222.field3098 + 1 & class339.field4549[class139.field1970];
            var2.method3613(arg0, arg1);
            return var2;
        }
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "()V", line = 126)
    public final void method3604() {
        this.field8928 = true;
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(IZ)V", line = 394)
    private class646(int arg0, boolean arg1) {
        this.method3613(arg0, arg1);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(J)V", line = 134)
    public final void method3605(long arg0) {
        this.field8925 = arg0;
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "()V", line = 138)
    public static void method3606() {
        field8920 = null;
        field8926 = null;
    }

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "()Ldk;", line = 142)
    public final class472 method3607() {
        this.field8933.field6493.method3413(-7623);
        for (int var1 = 0; var1 < this.field8921.length; var1++) {
            if (this.field8921[var1] != null && this.field8921[var1].field5931 != null) {
                this.field8933.field6493.method3407(true, this.field8921[var1]);
            }
        }
        return this.field8933;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lr;J)Z", line = 157)
    public final boolean method3608(class166 arg0, long arg1) {
        if (this.field8925 == this.field8922) {
            this.method3602();
        } else {
            this.method3604();
        }
        if (arg1 - this.field8925 > 750L) {
            this.method3609();
            return false;
        }
        int var4 = (int) (arg1 - this.field8922);
        if (this.field8932) {
            for (class649 var5 = (class649) this.field8924.method3898((byte) -88); var5 != null; var5 = (class649) this.field8924.method3902(true)) {
                for (int var6 = 0; var6 < var5.field8997.field4924; var6++) {
                    var5.method3657(-107, arg0, 1, !this.field8928, arg1);
                }
            }
            this.field8932 = false;
        }
        for (class649 var7 = (class649) this.field8924.method3898((byte) -115); var7 != null; var7 = (class649) this.field8924.method3902(true)) {
            var7.method3657(-56, arg0, var4, !this.field8928, arg1);
        }
        this.field8922 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "()V", line = 205)
    public final void method3609() {
        this.field8923 = true;
        for (class701 var1 = (class701) this.field8930.method1436(28964); var1 != null; var1 = (class701) this.field8930.method1443((byte) 6)) {
            if (var1.field9936.field1299 == 1) {
                var1.method3301(117);
            }
        }
        for (int var2 = 0; var2 < this.field8921.length; var2++) {
            if (this.field8921[var2] != null) {
                this.field8921[var2].method2438();
                this.field8921[var2] = null;
            }
        }
        this.field8927 = 0;
        this.field8924 = new class693();
        this.field8929 = 0;
        this.field8930 = new class227();
        this.field8934 = 0;
        this.method3074((byte) 48);
        class291.field4003[class251.field3425] = this;
        class251.field3425 = class251.field3425 + 1 & class339.field4549[class139.field1970];
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIII)V", line = 246)
    public final void method3610(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field8935 = arg0;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lr;)V", line = 261)
    public final void method3611(class166 arg0) {
        this.field8933.field6493.method3413(-7623);
        for (class649 var2 = (class649) this.field8924.method3898((byte) -38); var2 != null; var2 = (class649) this.field8924.method3902(true)) {
            var2.method3656(this.field8922, 4000, arg0);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lr;[Lns;Z)V", line = 278)
    private final void method3612(class166 arg0, class369[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 32; var4++) {
            field8920[var4] = false;
        }
        label67: for (class649 var5 = (class649) this.field8924.method3898((byte) -125); var5 != null; var5 = (class649) this.field8924.method3902(true)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field9004 || arg1[var8].field4984 == var5.field9004) {
                        field8920[var8] = true;
                        var5.method3658(true);
                        var5.field8993 = false;
                        continue label67;
                    }
                }
            }
            if (!arg2) {
                if (var5.field8999 == 0) {
                    var5.method3074((byte) 48);
                    this.field8929--;
                } else {
                    var5.field8993 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && var6 != 32 && this.field8929 != 32; var6++) {
            if (!field8920[var6]) {
                class649 var7 = new class649(arg0, arg1[var6], this, this.field8925);
                this.field8924.method3906(var7, (byte) -19);
                this.field8929++;
                field8920[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(IZ)V", line = 353)
    private final void method3613(int arg0, boolean arg1) {
        class589.field8271.method3906(this, (byte) -19);
        this.field8925 = arg0;
        this.field8922 = arg0;
        this.field8932 = true;
        this.field8931 = arg1;
    }
}
