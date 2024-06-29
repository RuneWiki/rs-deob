import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class class150 extends class589 {

    @OriginalMember(owner = "client!ls", name = "h", descriptor = "Z")
    private boolean field2033 = false;

    @OriginalMember(owner = "client!ls", name = "j", descriptor = "Z")
    public boolean field2035 = false;

    @OriginalMember(owner = "client!ls", name = "k", descriptor = "I")
    public int field2036 = 0;

    @OriginalMember(owner = "client!ls", name = "n", descriptor = "Lsaa;")
    private class345 field2039 = new class345();

    @OriginalMember(owner = "client!ls", name = "q", descriptor = "I")
    private int field2042 = 0;

    @OriginalMember(owner = "client!ls", name = "p", descriptor = "Lqw;")
    public class84 field2041 = new class84();

    @OriginalMember(owner = "client!ls", name = "t", descriptor = "Z")
    public boolean field2045 = false;

    @OriginalMember(owner = "client!ls", name = "s", descriptor = "I")
    private int field2044 = 0;

    @OriginalMember(owner = "client!ls", name = "v", descriptor = "Z")
    private boolean field2047 = false;

    @OriginalMember(owner = "client!ls", name = "r", descriptor = "Ltv;")
    public class586 field2043 = new class586();

    @OriginalMember(owner = "client!ls", name = "l", descriptor = "[Lvm;")
    public class713[] field2037 = new class713[8192];

    @OriginalMember(owner = "client!ls", name = "i", descriptor = "[Z")
    private static boolean[] field2034 = new boolean[32];

    @OriginalMember(owner = "client!ls", name = "g", descriptor = "[Z")
    private static boolean[] field2032 = new boolean[8];

    @OriginalMember(owner = "client!ls", name = "u", descriptor = "I")
    public int field2046;

    @OriginalMember(owner = "client!ls", name = "m", descriptor = "J")
    private long field2038;

    @OriginalMember(owner = "client!ls", name = "o", descriptor = "J")
    private long field2040;

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(Lha;[Lvja;Z)V", line = 5)
    private final void method1043(class66 arg0, class290[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 32; var4++) {
            field2034[var4] = false;
        }
        label67: for (class139 var5 = (class139) this.field2039.method2189((byte) 45); var5 != null; var5 = (class139) this.field2039.method2192(0)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field1870 || arg1[var8].field4130 == var5.field1870) {
                        field2034[var8] = true;
                        var5.method964(-12231);
                        var5.field1871 = false;
                        continue label67;
                    }
                }
            }
            if (!arg2) {
                if (var5.field1879 == 0) {
                    var5.method3310(30305);
                    this.field2042--;
                } else {
                    var5.field1871 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && var6 != 32 && this.field2042 != 32; var6++) {
            if (!field2034[var6]) {
                class139 var7 = new class139(arg0, arg1[var6], this, this.field2038);
                this.field2039.method2188((byte) 31, var7);
                this.field2042++;
                field2034[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(Lha;J)Z", line = 81)
    public final boolean method1044(class66 arg0, long arg1) {
        if (this.field2040 == this.field2038) {
            this.method1048();
        } else {
            this.method1051();
        }
        if (arg1 - this.field2038 > 750L) {
            this.method1055();
            return false;
        }
        int var4 = (int) (arg1 - this.field2040);
        if (this.field2047) {
            for (class139 var5 = (class139) this.field2039.method2189((byte) 106); var5 != null; var5 = (class139) this.field2039.method2192(0)) {
                for (int var6 = 0; var6 < var5.field1869.field2744; var6++) {
                    var5.method963(1, !this.field2033, (byte) 126, arg0, arg1);
                }
            }
            this.field2047 = false;
        }
        for (class139 var7 = (class139) this.field2039.method2189((byte) 36); var7 != null; var7 = (class139) this.field2039.method2192(0)) {
            var7.method963(var4, !this.field2033, (byte) 125, arg0, arg1);
        }
        this.field2040 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(Lha;J[Lvja;[Lrea;Z)V", line = 129)
    public final void method1045(class66 arg0, long arg1, class290[] arg2, class220[] arg3, boolean arg4) {
        if (!this.field2035) {
            this.method1043(arg0, arg2, arg4);
            this.method1056(arg3, arg4);
            this.field2038 = arg1;
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "()V", line = 137)
    public final void method1046() {
        this.field2047 = true;
    }

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "()V", line = 143)
    public static void method1047() {
        field2034 = null;
        field2032 = null;
    }

    @OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(IZ)V", line = 394)
    private class150(int arg0, boolean arg1) {
        this.method1054(arg0, arg1);
    }

    @OriginalMember(owner = "client!ls", name = "c", descriptor = "()V", line = 156)
    private final void method1048() {
        this.field2033 = false;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(Lha;)V", line = 159)
    public final void method1049(class66 arg0) {
        this.field2043.field7972.method1832((byte) -123);
        for (class139 var2 = (class139) this.field2039.method2189((byte) 82); var2 != null; var2 = (class139) this.field2039.method2192(0)) {
            var2.method966(this.field2040, (byte) -75, arg0);
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(J)V", line = 171)
    public final void method1050(long arg0) {
        this.field2038 = arg0;
    }

    @OriginalMember(owner = "client!ls", name = "d", descriptor = "()V", line = 174)
    public final void method1051() {
        this.field2033 = true;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(IZ)Lls;", line = 178)
    public static final class150 method1052(int arg0, boolean arg1) {
        if (class600.field8183 == class273.field3974) {
            return new class150(arg0, arg1);
        } else {
            class150 var2 = class211.field2713[class600.field8183];
            class600.field8183 = class600.field8183 + 1 & class308.field4373[class758.field10380];
            var2.method1054(arg0, arg1);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ls", name = "e", descriptor = "()Ltv;", line = 191)
    public final class586 method1053() {
        this.field2043.field7972.method1832((byte) -117);
        for (int var1 = 0; var1 < this.field2037.length; var1++) {
            if (this.field2037[var1] != null && this.field2037[var1].field9732 != null) {
                this.field2043.field7972.method1833((byte) 91, this.field2037[var1]);
            }
        }
        return this.field2043;
    }

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "(IZ)V", line = 206)
    private final void method1054(int arg0, boolean arg1) {
        class69.field954.method2188((byte) 31, this);
        this.field2038 = arg0;
        this.field2040 = arg0;
        this.field2047 = true;
        this.field2045 = arg1;
    }

    @OriginalMember(owner = "client!ls", name = "f", descriptor = "()V", line = 213)
    public final void method1055() {
        this.field2035 = true;
        for (class620 var1 = (class620) this.field2041.method679((byte) -86); var1 != null; var1 = (class620) this.field2041.method681(-43)) {
            if (var1.field8391.field9688 == 1) {
                var1.method3659(1);
            }
        }
        for (int var2 = 0; var2 < this.field2037.length; var2++) {
            if (this.field2037[var2] != null) {
                this.field2037[var2].method3953();
                this.field2037[var2] = null;
            }
        }
        this.field2036 = 0;
        this.field2039 = new class345();
        this.field2042 = 0;
        this.field2041 = new class84();
        this.field2044 = 0;
        this.method3310(30305);
        class211.field2713[class273.field3974] = this;
        class273.field3974 = class273.field3974 + 1 & class308.field4373[class758.field10380];
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "([Lrea;Z)V", line = 252)
    private final void method1056(class220[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field2032[var3] = false;
        }
        label76: for (class620 var4 = (class620) this.field2041.method679((byte) -86); var4 != null; var4 = (class620) this.field2041.method681(-76)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field8396 || arg0[var7].field2855 == var4.field8396) {
                        field2032[var7] = true;
                        var4.method3432(12524);
                        continue label76;
                    }
                }
            }
            if (!arg1) {
                var4.method1102((byte) 92);
                this.field2044--;
                if (var4.method3658((byte) -121)) {
                    var4.method3659(1);
                    class682.field9119--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && var5 != 8 && this.field2044 != 8; var5++) {
            if (!field2032[var5]) {
                class620 var6 = null;
                if (arg0[var5].method1408(84).field9688 == 1 && class682.field9119 < 32) {
                    var6 = new class620(arg0[var5], this);
                    class716.field9758.method2284((long) arg0[var5].field2843, -124, var6);
                    class682.field9119++;
                }
                if (var6 == null) {
                    var6 = new class620(arg0[var5], this);
                }
                this.field2041.method689(var6, -24);
                this.field2044++;
                field2032[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!ls", name = "g", descriptor = "()Ltv;", line = 340)
    public final class586 method1057() {
        return this.field2043;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(IIIII)V", line = 346)
    public final void method1058(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field2046 = arg0;
    }
}
