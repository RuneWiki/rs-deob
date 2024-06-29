import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class257 {

    @OriginalMember(owner = "client!nj", name = "k", descriptor = "Loo;")
    private class652 field3779 = new class652(64);

    @OriginalMember(owner = "client!nj", name = "s", descriptor = "Loo;")
    public class652 field3787 = new class652(50);

    @OriginalMember(owner = "client!nj", name = "t", descriptor = "Lwj;")
    public class414 field3788 = new class414(250);

    @OriginalMember(owner = "client!nj", name = "v", descriptor = "Lhaa;")
    private class87 field3790 = new class87();

    @OriginalMember(owner = "client!nj", name = "z", descriptor = "Lega;")
    private class739 field3794;

    @OriginalMember(owner = "client!nj", name = "j", descriptor = "Lwia;")
    private class791 field3778;

    @OriginalMember(owner = "client!nj", name = "r", descriptor = "Lwia;")
    public class791 field3786;

    @OriginalMember(owner = "client!nj", name = "p", descriptor = "Z")
    private boolean field3784;

    @OriginalMember(owner = "client!nj", name = "i", descriptor = "I")
    public int field3777;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "I")
    public int field3769;

    @OriginalMember(owner = "client!nj", name = "y", descriptor = "[Ljava/lang/String;")
    private String[] field3793;

    @OriginalMember(owner = "client!nj", name = "x", descriptor = "[Ljava/lang/String;")
    private String[] field3792;

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "Lfba;")
    public static class27 field3774 = new class27(40, -1);

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "I")
    public static int field3770;

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "I")
    public static int field3771;

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "I")
    public static int field3772;

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "I")
    public static int field3773;

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "I")
    public static int field3775;

    @OriginalMember(owner = "client!nj", name = "h", descriptor = "I")
    public static int field3776;

    @OriginalMember(owner = "client!nj", name = "l", descriptor = "I")
    public static int field3780;

    @OriginalMember(owner = "client!nj", name = "m", descriptor = "I")
    public static int field3781;

    @OriginalMember(owner = "client!nj", name = "n", descriptor = "I")
    public static int field3782;

    @OriginalMember(owner = "client!nj", name = "o", descriptor = "I")
    public static int field3783;

    @OriginalMember(owner = "client!nj", name = "q", descriptor = "I")
    public static int field3785;

    @OriginalMember(owner = "client!nj", name = "u", descriptor = "I")
    public static int field3789;

    @OriginalMember(owner = "client!nj", name = "w", descriptor = "I")
    public int field3791;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(II)V", line = 3)
    public final void method1671(int arg0, int arg1) {
        class652 var3 = this.field3779;
        synchronized (this.field3779) {
            this.field3779.method3741(arg1, 0);
            int var4 = -107 % ((arg0 - 67) / 43);
        }
        field3783++;
        class652 var5 = this.field3787;
        synchronized (this.field3787) {
            this.field3787.method3741(arg1, 0);
        }
        class414 var6 = this.field3788;
        synchronized (this.field3788) {
            this.field3788.method2512(-31028, arg1);
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)V", line = 22)
    public final void method1672(int arg0) {
        class414 var2 = this.field3788;
        synchronized (this.field3788) {
            this.field3788.method2517(-15647);
            if (arg0 >= -25) {
                this.field3793 = null;
            }
        }
        field3781++;
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(I)Z", line = 37)
    public static final boolean method1673(int arg0) {
        field3776++;
        if (arg0 == -1) {
            return class90.field1011 != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Z)V", line = 51)
    public final void method1674(boolean arg0) {
        field3780++;
        if (!arg0) {
            this.method1674(false);
        }
        class652 var2 = this.field3779;
        synchronized (this.field3779) {
            this.field3779.method3735(2);
        }
        class652 var3 = this.field3787;
        synchronized (this.field3787) {
            this.field3787.method3735(2);
        }
        class414 var4 = this.field3788;
        synchronized (this.field3788) {
            this.field3788.method2517(-15647);
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IZ)V", line = 70)
    public final void method1675(int arg0, boolean arg1) {
        field3771++;
        if (arg0 != -1579) {
            method1682((byte) -124);
        }
        if (this.field3784 != arg1) {
            this.field3784 = arg1;
            this.method1674(true);
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lsq;IIILha;III)Ljd;", line = 85)
    public final class241 method1676(class190 arg0, int arg1, int arg2, int arg3, class65 arg4, int arg5, int arg6, int arg7) {
        this.field3790.field960 = arg5;
        field3782++;
        this.field3790.field958 = arg7;
        if (arg1 != 40) {
            return null;
        }
        this.field3790.field963 = arg6;
        this.field3790.field967 = arg3;
        this.field3790.field965 = arg0 != null;
        this.field3790.field966 = arg4.field784;
        this.field3790.field962 = arg2;
        return (class241) this.field3788.method2523(0, this.field3790);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(BI)V", line = 103)
    public final void method1677(byte arg0, int arg1) {
        this.field3791 = arg1;
        field3775++;
        if (arg0 != -103) {
            this.field3792 = null;
        }
        class652 var3 = this.field3787;
        synchronized (this.field3787) {
            this.field3787.method3735(2);
        }
    }

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "(I)V", line = 128)
    public final void method1678(int arg0) {
        class652 var2 = this.field3779;
        synchronized (this.field3779) {
            this.field3779.method3743(8);
        }
        field3789++;
        class652 var3 = this.field3787;
        synchronized (this.field3787) {
            if (arg0 != -21455) {
                this.method1672(8);
            }
            this.field3787.method3743(8);
        }
        class414 var4 = this.field3788;
        synchronized (this.field3788) {
            this.field3788.method2513(arg0 - 1953);
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lha;Lsq;IIIILda;Lha;ZIBZ)Ljd;", line = 148)
    public final class241 method1679(class65 arg0, class190 arg1, int arg2, int arg3, int arg4, int arg5, class66 arg6, class65 arg7, boolean arg8, int arg9, byte arg10, boolean arg11) {
        field3785++;
        class241 var13 = this.method1676(arg1, 40, arg9, arg5, arg7, arg3, arg4, arg2);
        if (var13 != null) {
            return var13;
        }
        class689 var14 = this.method1681(arg9, 113);
        if (arg10 < 22) {
            this.method1676(null, -84, 68, 62, null, -104, -71, 89);
        }
        if (arg3 > 1 && var14.field9576 != null) {
            int var15 = -1;
            for (int var16 = 0; var16 < 10; var16++) {
                if (arg3 >= var14.field9647[var16] && var14.field9647[var16] != 0) {
                    var15 = var14.field9576[var16];
                }
            }
            if (var15 != -1) {
                var14 = this.method1681(var15, 92);
            }
        }
        int[] var17 = var14.method3898(arg6, arg3, arg8, arg7, arg0, arg5, arg4, arg2, arg1, (byte) -49);
        if (var17 == null) {
            return null;
        }
        class241 var18;
        if (arg11) {
            var18 = arg0.method458((byte) 85, 32, 36, var17, 36, 0);
        } else {
            var18 = arg7.method458((byte) 93, 32, 36, var17, 36, 0);
        }
        if (!arg11) {
            class87 var19 = new class87();
            var19.field965 = arg1 != null;
            var19.field958 = arg2;
            var19.field960 = arg3;
            var19.field963 = arg4;
            var19.field966 = arg7.field784;
            var19.field962 = arg9;
            var19.field967 = arg5;
            this.field3788.method2519(var18, var19, -12548);
        }
        return var18;
    }

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "(I)V", line = 212)
    public final void method1680(int arg0) {
        field3772++;
        class652 var2 = this.field3787;
        synchronized (this.field3787) {
            this.field3787.method3735(2);
            if (arg0 <= 55) {
                this.method1678(85);
            }
        }
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(II)Lbca;", line = 230)
    public final class689 method1681(int arg0, int arg1) {
        field3770++;
        class652 var3 = this.field3779;
        class689 var4;
        synchronized (this.field3779) {
            var4 = (class689) this.field3779.method3742((byte) 67, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class791 var5 = this.field3778;
        byte[] var6;
        synchronized (this.field3778) {
            var6 = this.field3778.method4339(class505.method3049(arg0, 6), 0, class353.method2239(-1950670936, arg0));
        }
        class689 var7 = new class689();
        var7.field9628 = arg0;
        var7.field9637 = this;
        var7.field9648 = new String[] { null, null, class620.field8669.method3580(this.field3777, 12), null, null };
        var7.field9587 = new String[] { null, null, null, null, class620.field8670.method3580(this.field3777, 12) };
        if (arg1 <= 82) {
            return null;
        }
        if (var6 != null) {
            var7.method3897(new class494(var6), -28921);
        }
        var7.method3896((byte) -107);
        if (var7.field9594 != -1) {
            var7.method3884(this.method1681(var7.field9594, 127), this.method1681(var7.field9638, 116), -88);
        }
        if (var7.field9572 != -1) {
            var7.method3886((byte) -50, this.method1681(var7.field9572, 93), this.method1681(var7.field9569, 103));
        }
        if (var7.field9581 != -1) {
            var7.method3881(this.method1681(var7.field9623, 101), this.method1681(var7.field9581, 105), 0);
        }
        if (!this.field3784 && var7.field9575) {
            var7.field9565 = class620.field8666.method3580(this.field3777, 12);
            var7.field9648 = this.field3793;
            var7.field9587 = this.field3792;
            var7.field9621 = false;
            var7.field9642 = null;
            var7.field9636 = 0;
            if (var7.field9588 != null) {
                boolean var8 = false;
                for (class577 var9 = var7.field9588.method2243((byte) 100); var9 != null; var9 = var7.field9588.method2248(-15690)) {
                    class645 var10 = this.field3794.method4117((byte) 49, (int) var9.field8133);
                    if (var10.field9013) {
                        var9.method3387((byte) 115);
                    } else {
                        var8 = true;
                    }
                }
                if (!var8) {
                    var7.field9588 = null;
                }
            }
        }
        class652 var11 = this.field3779;
        synchronized (this.field3779) {
            this.field3779.method3739((long) arg0, (byte) 62, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(Ldt;IZLega;Lwia;Lwia;)V", line = 340)
    public class257(class252 arg0, int arg1, boolean arg2, class739 arg3, class791 arg4, class791 arg5) {
        this.field3794 = arg3;
        this.field3778 = arg4;
        this.field3786 = arg5;
        this.field3784 = arg2;
        this.field3777 = arg1;
        if (this.field3778 == null) {
            this.field3769 = 0;
        } else {
            int var7 = this.field3778.method4332((byte) 125) - 1;
            this.field3769 = this.field3778.method4353(var7, true) + var7 * 256;
        }
        this.field3793 = new String[] { null, null, class620.field8669.method3580(this.field3777, 12), null, null };
        this.field3792 = new String[] { null, null, null, null, class620.field8670.method3580(this.field3777, 12) };
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)V", line = 314)
    public static void method1682(byte arg0) {
        if (arg0 != 34) {
            field3773 = 122;
        }
        field3774 = null;
    }
}
