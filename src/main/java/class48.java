import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class48 extends class27 {

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "Z")
    private boolean field813 = false;

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "I")
    public int field814 = 0;

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "Z")
    public boolean field816 = false;

    @OriginalMember(owner = "client!ha", name = "u", descriptor = "Ltd;")
    private class107 field819 = new class107();

    @OriginalMember(owner = "client!ha", name = "w", descriptor = "I")
    private int field821 = 0;

    @OriginalMember(owner = "client!ha", name = "v", descriptor = "Lfi;")
    public class166 field820 = new class166();

    @OriginalMember(owner = "client!ha", name = "x", descriptor = "Z")
    private boolean field822 = false;

    @OriginalMember(owner = "client!ha", name = "D", descriptor = "I")
    private int field828 = 0;

    @OriginalMember(owner = "client!ha", name = "B", descriptor = "Lbg;")
    public class374 field826 = new class374();

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "[Lvi;")
    public class310[] field811 = new class310[8192];

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "J")
    private long field812;

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "J")
    private long field815;

    @OriginalMember(owner = "client!ha", name = "s", descriptor = "[Z")
    private static boolean[] field817 = new boolean[8];

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "[Z")
    private static boolean[] field818 = new boolean[8];

    @OriginalMember(owner = "client!ha", name = "y", descriptor = "I")
    public int field823;

    @OriginalMember(owner = "client!ha", name = "z", descriptor = "I")
    public int field824;

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "I")
    public int field825;

    @OriginalMember(owner = "client!ha", name = "C", descriptor = "I")
    public int field827;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(J)V", line = 3)
    public final void method481(long arg0) {
        this.field812 = arg0;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lpe;J[Lds;[Lae;Z)V", line = 7)
    public final void method482(class391 arg0, long arg1, class227[] arg2, class276[] arg3, boolean arg4) {
        if (!this.field816) {
            this.method487(arg0, arg2, arg4);
            this.method483(arg3, arg4);
            this.field812 = arg1;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([Lae;Z)V", line = 17)
    private final void method483(class276[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field818[var3] = false;
        }
        label73: for (class249 var4 = (class249) this.field820.method1240((byte) -96); var4 != null; var4 = (class249) this.field820.method1245(1)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field3405 || arg0[var7].field3722 == var4.field3405) {
                        field818[var7] = true;
                        var4.method1622(1);
                        continue label73;
                    }
                }
            }
            if (!arg1) {
                var4.method2367(5);
                this.field828--;
                if (var4.method1898(7)) {
                    var4.method1902(32);
                    class89.field1314--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && this.field828 != 8; var5++) {
            if (!field818[var5]) {
                class249 var6 = null;
                if (class23.method288(5, arg0[var5].field3715).field3699 == 1 && class89.field1314 < 32) {
                    var6 = new class249(arg0[var5], this);
                    class153.field2332.method969(var6, (long) arg0[var5].field3715, true);
                    class89.field1314++;
                }
                if (var6 == null) {
                    var6 = new class249(arg0[var5], this);
                }
                this.field820.method1249(var6, (byte) -127);
                this.field828++;
                field818[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lpe;J)Z", line = 102)
    public final boolean method484(class391 arg0, long arg1) {
        if (this.field815 == this.field812) {
            this.method485();
        } else {
            this.method486();
        }
        if (arg1 - this.field812 > 750L) {
            this.method492();
            return false;
        }
        int var4 = (int) (arg1 - this.field815);
        if (this.field822) {
            for (class100 var5 = (class100) this.field819.method891(20838); var5 != null; var5 = (class100) this.field819.method898(64)) {
                for (int var6 = 0; var6 < var5.field1480.field5118; var6++) {
                    var5.method850(1, 2049857680, !this.field813, arg1, arg0);
                }
            }
            this.field822 = false;
        }
        for (class100 var7 = (class100) this.field819.method891(20838); var7 != null; var7 = (class100) this.field819.method898(64)) {
            var7.method850(var4, 2049857680, !this.field813, arg1, arg0);
        }
        this.field815 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "()V", line = 150)
    private final void method485() {
        this.field813 = false;
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "()V", line = 154)
    public final void method486() {
        this.field813 = true;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lpe;[Lds;Z)V", line = 159)
    private final void method487(class391 arg0, class227[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 8; var4++) {
            field817[var4] = false;
        }
        label64: for (class100 var5 = (class100) this.field819.method891(20838); var5 != null; var5 = (class100) this.field819.method898(64)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field1463 || arg1[var8].field3149 == var5.field1463) {
                        field817[var8] = true;
                        var5.method858(-86);
                        var5.field1479 = false;
                        continue label64;
                    }
                }
            }
            if (!arg2) {
                if (var5.field1469 == 0) {
                    var5.method328(-37);
                    this.field821--;
                } else {
                    var5.field1479 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && this.field821 != 8; var6++) {
            if (!field817[var6]) {
                class100 var7 = new class100(arg0, arg1[var6], this, this.field812);
                this.field819.method901(false, var7);
                this.field821++;
                field817[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "()V", line = 231)
    public static void method488() {
        field817 = null;
        field818 = null;
    }

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "()Lbg;", line = 236)
    public final class374 method489() {
        return this.field826;
    }

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "()V", line = 241)
    public final void method490() {
        this.field822 = true;
    }

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "()V", line = 244)
    public final void method491() {
        this.field826.field5256.method1689((byte) -110);
        for (class100 var1 = (class100) this.field819.method891(20838); var1 != null; var1 = (class100) this.field819.method898(64)) {
            var1.method854(this.field815, (byte) 126);
        }
    }

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "()V", line = 257)
    public final void method492() {
        this.field816 = true;
        for (class249 var1 = (class249) this.field820.method1240((byte) -114); var1 != null; var1 = (class249) this.field820.method1245(1)) {
            if (var1.field3404.field3699 == 1) {
                var1.method1902(32);
            }
        }
        this.field811 = new class310[8192];
        this.field814 = 0;
        this.field819 = new class107();
        this.field821 = 0;
        this.field820 = new class166();
        this.field828 = 0;
        this.method328(-53);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIII)V", line = 278)
    public final void method493(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field827 = arg0;
        this.field825 = arg1;
        this.field824 = arg3;
        this.field823 = arg4;
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(I)V", line = 332)
    public class48(int arg0) {
        class428.field6084.method901(false, this);
        this.field812 = (long) arg0;
        this.field815 = (long) arg0;
        this.field822 = true;
    }
}
