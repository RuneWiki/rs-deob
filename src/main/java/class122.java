import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public class class122 {

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "Lfe;")
    private class409 field1905 = new class409();

    @OriginalMember(owner = "client!wp", name = "i", descriptor = "I")
    public static int field1912 = -1;

    @OriginalMember(owner = "client!wp", name = "k", descriptor = "Z")
    public static boolean field1914 = false;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "I")
    public static int field1904;

    @OriginalMember(owner = "client!wp", name = "c", descriptor = "I")
    public static int field1906;

    @OriginalMember(owner = "client!wp", name = "d", descriptor = "I")
    public static int field1907;

    @OriginalMember(owner = "client!wp", name = "e", descriptor = "I")
    public static int field1908;

    @OriginalMember(owner = "client!wp", name = "f", descriptor = "I")
    public static int field1909;

    @OriginalMember(owner = "client!wp", name = "g", descriptor = "I")
    public static int field1910;

    @OriginalMember(owner = "client!wp", name = "h", descriptor = "I")
    public static int field1911;

    @OriginalMember(owner = "client!wp", name = "j", descriptor = "I")
    public static int field1913;

    @OriginalMember(owner = "client!wp", name = "l", descriptor = "I")
    public static int field1915;

    @OriginalMember(owner = "client!wp", name = "m", descriptor = "I")
    public static int field1916;

    @OriginalMember(owner = "client!wp", name = "n", descriptor = "Lfe;")
    private class409 field1917;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(B)Lfe;")
    public final class409 method900(byte arg0) {
        field1909++;
        class409 var2 = this.field1905.field5792;
        if (this.field1905 == var2) {
            this.field1917 = null;
            return null;
        } else if (arg0 >= -73) {
            return null;
        } else {
            this.field1917 = var2.field5792;
            return var2;
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(I)V")
    public final void method901(int arg0) {
        while (true) {
            class409 var2 = this.field1905.field5794;
            if (this.field1905 == var2) {
                field1913++;
                if (arg0 != -1) {
                    this.field1905 = null;
                }
                this.field1917 = null;
                return;
            }
            var2.method2429(arg0 + 120);
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(IJ)V")
    public static final void method902(int arg0, long arg1) {
        field1904++;
        int var3 = class385.field5502;
        if (class78.field1279 != var3) {
            int var4 = var3 - class78.field1279;
            int var5 = (int) ((long) var4 * arg1 / 320L);
            if (var4 <= 0) {
                if (var5 == 0) {
                    var5 = -1;
                } else if (var4 > var5) {
                    var5 = var4;
                }
            } else if (var5 == 0) {
                var5 = 1;
            } else if (var5 > var4) {
                var5 = var4;
            }
            class78.field1279 += var5;
        }
        int var6 = class279.field4147;
        if (class486.field7048 != var6) {
            int var7 = var6 - class486.field7048;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 > 0) {
                if (var8 == 0) {
                    var8 = 1;
                } else if (var7 < var8) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = -1;
            } else if (var7 > var8) {
                var8 = var7;
            }
            class486.field7048 += var8;
        }
        if (!class220.field3371.field2554) {
            class508.field7354 += (float) arg1 * class253.field3748 / 40.0F * 8.0F;
            class524.field7655 += (float) arg1 * class294.field4384 / 40.0F * 8.0F;
        }
        if (arg0 != -1) {
            field1912 = 81;
        }
        class289.method1849(-786433);
    }

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "(I)I")
    public final int method903(int arg0) {
        field1906++;
        int var2 = 0;
        if (arg0 != -1) {
            field1914 = false;
        }
        class409 var3 = this.field1905.field5794;
        while (this.field1905 != var3) {
            var3 = var3.field5794;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(Z)Lfe;")
    public final class409 method904(boolean arg0) {
        if (arg0) {
            return null;
        }
        field1915++;
        class409 var2 = this.field1905.field5794;
        if (this.field1905 == var2) {
            this.field1917 = null;
            return null;
        } else {
            this.field1917 = var2.field5794;
            return var2;
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(Lfe;I)V")
    public final void method905(class409 arg0, int arg1) {
        field1907++;
        if (arg0.field5792 != null) {
            arg0.method2429(124);
        }
        arg0.field5794 = this.field1905;
        arg0.field5792 = this.field1905.field5792;
        arg0.field5792.field5794 = arg0;
        arg0.field5794.field5792 = arg0;
        if (arg1 != 0) {
            this.method900((byte) -53);
        }
    }

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "(Z)Z")
    public final boolean method906(boolean arg0) {
        field1910++;
        if (!arg0) {
            this.method906(true);
        }
        return this.field1905.field5794 == this.field1905;
    }

    @OriginalMember(owner = "client!wp", name = "c", descriptor = "(I)Lfe;")
    public final class409 method907(int arg0) {
        field1916++;
        if (arg0 != -1) {
            this.field1917 = null;
        }
        class409 var2 = this.field1917;
        if (this.field1905 == var2) {
            this.field1917 = null;
            return null;
        } else {
            this.field1917 = var2.field5794;
            return var2;
        }
    }

    @OriginalMember(owner = "client!wp", name = "<init>", descriptor = "()V")
    public class122() {
        this.field1905.field5794 = this.field1905;
        this.field1905.field5792 = this.field1905;
    }

    @OriginalMember(owner = "client!wp", name = "d", descriptor = "(I)Lfe;")
    public final class409 method908(int arg0) {
        field1911++;
        class409 var2 = this.field1905.field5794;
        if (this.field1905 == var2) {
            return null;
        } else if (arg0 < 35) {
            return null;
        } else {
            var2.method2429(124);
            return var2;
        }
    }
}
