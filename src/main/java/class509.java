import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class509 extends class681 {

    @OriginalMember(owner = "client!od", name = "o", descriptor = "Z")
    private boolean field7169 = false;

    @OriginalMember(owner = "client!od", name = "p", descriptor = "Z")
    public boolean field7170 = false;

    @OriginalMember(owner = "client!od", name = "s", descriptor = "I")
    public int field7173 = 0;

    @OriginalMember(owner = "client!od", name = "r", descriptor = "Lan;")
    private class23 field7172 = new class23();

    @OriginalMember(owner = "client!od", name = "t", descriptor = "I")
    private int field7174 = 0;

    @OriginalMember(owner = "client!od", name = "u", descriptor = "Lfh;")
    public class653 field7175 = new class653();

    @OriginalMember(owner = "client!od", name = "w", descriptor = "Z")
    public boolean field7177 = false;

    @OriginalMember(owner = "client!od", name = "z", descriptor = "I")
    private int field7180 = 0;

    @OriginalMember(owner = "client!od", name = "y", descriptor = "Z")
    private boolean field7179 = false;

    @OriginalMember(owner = "client!od", name = "v", descriptor = "Lfl;")
    public class741 field7176 = new class741();

    @OriginalMember(owner = "client!od", name = "l", descriptor = "[Lvp;")
    public class191[] field7166 = new class191[8192];

    @OriginalMember(owner = "client!od", name = "n", descriptor = "[Z")
    private static boolean[] field7168 = new boolean[8];

    @OriginalMember(owner = "client!od", name = "k", descriptor = "[Z")
    private static boolean[] field7165 = new boolean[32];

    @OriginalMember(owner = "client!od", name = "x", descriptor = "I")
    public int field7178;

    @OriginalMember(owner = "client!od", name = "m", descriptor = "J")
    private long field7167;

    @OriginalMember(owner = "client!od", name = "q", descriptor = "J")
    private long field7171;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lha;J)Z", line = 3)
    public final boolean method2966(class60 arg0, long arg1) {
        if (this.field7171 == this.field7167) {
            this.method2973();
        } else {
            this.method2977();
        }
        if (arg1 - this.field7167 > 750L) {
            this.method2975();
            return false;
        }
        int var4 = (int) (arg1 - this.field7171);
        if (this.field7179) {
            for (class482 var5 = (class482) this.field7172.method162(-22305); var5 != null; var5 = (class482) this.field7172.method158(false)) {
                for (int var6 = 0; var6 < var5.field6550.field1672; var6++) {
                    var5.method2769(arg0, 1, arg1, !this.field7169, 30349);
                }
            }
            this.field7179 = false;
        }
        for (class482 var7 = (class482) this.field7172.method162(-22305); var7 != null; var7 = (class482) this.field7172.method158(false)) {
            var7.method2769(arg0, var4, arg1, !this.field7169, 30349);
        }
        this.field7171 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "([Lhv;Z)V", line = 54)
    private final void method2967(class521[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field7168[var3] = false;
        }
        label76: for (class422 var4 = (class422) this.field7175.method3672(-1); var4 != null; var4 = (class422) this.field7175.method3662(-1)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field5356 || arg0[var7].field7310 == var4.field5356) {
                        field7168[var7] = true;
                        var4.method2351(-117);
                        continue label76;
                    }
                }
            }
            if (!arg1) {
                var4.method1175(-2);
                this.field7180--;
                if (var4.method3614((byte) -88)) {
                    var4.method3615(81);
                    class686.field9558--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && var5 != 8 && this.field7180 != 8; var5++) {
            if (!field7168[var5]) {
                class422 var6 = null;
                if (arg0[var5].method3029((byte) -86).field2205 == 1 && class686.field9558 < 32) {
                    var6 = new class422(arg0[var5], this);
                    class417.field5308.method1947((long) arg0[var5].field7301, 23882, var6);
                    class686.field9558++;
                }
                if (var6 == null) {
                    var6 = new class422(arg0[var5], this);
                }
                this.field7175.method3671(var6, false);
                this.field7180++;
                field7168[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lha;J[Lqi;[Lhv;Z)V", line = 142)
    public final void method2968(class60 arg0, long arg1, class569[] arg2, class521[] arg3, boolean arg4) {
        if (!this.field7170) {
            this.method2971(arg0, arg2, arg4);
            this.method2967(arg3, arg4);
            this.field7167 = arg1;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "()Lfl;", line = 152)
    public final class741 method2969() {
        return this.field7176;
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "()V", line = 155)
    public static void method2970() {
        field7165 = null;
        field7168 = null;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lha;[Lqi;Z)V", line = 161)
    private final void method2971(class60 arg0, class569[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 32; var4++) {
            field7165[var4] = false;
        }
        label67: for (class482 var5 = (class482) this.field7172.method162(-22305); var5 != null; var5 = (class482) this.field7172.method158(false)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field6542 || arg1[var8].field8008 == var5.field6542) {
                        field7165[var8] = true;
                        var5.method2773(-1);
                        var5.field6543 = false;
                        continue label67;
                    }
                }
            }
            if (!arg2) {
                if (var5.field6541 == 0) {
                    var5.method3835(0);
                    this.field7174--;
                } else {
                    var5.field6543 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && var6 != 32 && this.field7174 != 32; var6++) {
            if (!field7165[var6]) {
                class482 var7 = new class482(arg0, arg1[var6], this, this.field7167);
                this.field7172.method166(-8839, var7);
                this.field7174++;
                field7165[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIII)V", line = 236)
    public final void method2972(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field7178 = arg0;
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "()V", line = 247)
    private final void method2973() {
        this.field7169 = false;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(J)V", line = 250)
    public final void method2974(long arg0) {
        this.field7167 = arg0;
    }

    @OriginalMember(owner = "client!od", name = "d", descriptor = "()V", line = 253)
    public final void method2975() {
        this.field7170 = true;
        for (class422 var1 = (class422) this.field7175.method3672(-1); var1 != null; var1 = (class422) this.field7175.method3662(-1)) {
            if (var1.field5361.field2205 == 1) {
                var1.method3615(100);
            }
        }
        for (int var2 = 0; var2 < this.field7166.length; var2++) {
            if (this.field7166[var2] != null) {
                this.field7166[var2].method1283();
                this.field7166[var2] = null;
            }
        }
        this.field7173 = 0;
        this.field7172 = new class23();
        this.field7174 = 0;
        this.field7175 = new class653();
        this.field7180 = 0;
        this.method3835(0);
        class679.field9482[class386.field4932] = this;
        class386.field4932 = class386.field4932 + 1 & class241.field3121[class705.field9772];
    }

    @OriginalMember(owner = "client!od", name = "e", descriptor = "()V", line = 290)
    public final void method2976() {
        this.field7179 = true;
    }

    @OriginalMember(owner = "client!od", name = "f", descriptor = "()V", line = 294)
    public final void method2977() {
        this.field7169 = true;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IZ)Lod;", line = 297)
    public static final class509 method2978(int arg0, boolean arg1) {
        if (class386.field4932 == class298.field3916) {
            return new class509(arg0, arg1);
        } else {
            class509 var2 = class679.field9482[class298.field3916];
            class298.field3916 = class298.field3916 + 1 & class241.field3121[class705.field9772];
            var2.method2981(arg0, arg1);
            return var2;
        }
    }

    @OriginalMember(owner = "client!od", name = "g", descriptor = "()Lfl;", line = 313)
    public final class741 method2979() {
        this.field7176.field10344.method2956((byte) 126);
        for (int var1 = 0; var1 < this.field7166.length; var1++) {
            if (this.field7166[var1] != null && this.field7166[var1].field2636 != null) {
                this.field7176.field10344.method2958(true, this.field7166[var1]);
            }
        }
        return this.field7176;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lha;)V", line = 328)
    public final void method2980(class60 arg0) {
        this.field7176.field10344.method2956((byte) 118);
        for (class482 var2 = (class482) this.field7172.method162(-22305); var2 != null; var2 = (class482) this.field7172.method158(false)) {
            var2.method2771(arg0, this.field7171, (byte) -88);
        }
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(IZ)V", line = 340)
    private final void method2981(int arg0, boolean arg1) {
        class259.field3282.method166(-8839, this);
        this.field7167 = arg0;
        this.field7171 = arg0;
        this.field7179 = true;
        this.field7177 = arg1;
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(IZ)V", line = 394)
    private class509(int arg0, boolean arg1) {
        this.method2981(arg0, arg1);
    }
}
