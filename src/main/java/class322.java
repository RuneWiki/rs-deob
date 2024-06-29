import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class322 {

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "Luq;")
    public static class235 field4363 = null;

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "I")
    public static int field4364 = 0;

    @OriginalMember(owner = "client!dn", name = "j", descriptor = "Z")
    public static boolean field4370 = false;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "I")
    public int field4361;

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "I")
    public static int field4362;

    @OriginalMember(owner = "client!dn", name = "e", descriptor = "I")
    public static int field4365;

    @OriginalMember(owner = "client!dn", name = "f", descriptor = "I")
    public static int field4366;

    @OriginalMember(owner = "client!dn", name = "g", descriptor = "I")
    public static int field4367;

    @OriginalMember(owner = "client!dn", name = "h", descriptor = "I")
    public static int field4368;

    @OriginalMember(owner = "client!dn", name = "k", descriptor = "I")
    private int field4371;

    @OriginalMember(owner = "client!dn", name = "l", descriptor = "I")
    public static int field4372;

    @OriginalMember(owner = "client!dn", name = "i", descriptor = "Lda;")
    public static class303 field4369;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Z)V")
    public static void method2040(boolean arg0) {
        field4369 = null;
        if (!arg0) {
            field4369 = null;
        }
        field4363 = null;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(I)I")
    public final int method2041(int arg0) {
        field4366++;
        if (arg0 != -5961) {
            this.field4361 = -62;
        }
        return this.field4361 & 0x3FFF;
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(Z)V")
    public final void method2042(boolean arg0) {
        this.field4361 &= 0x3FFF;
        field4365++;
        if (arg0) {
            field4363 = null;
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(ILqo;)V")
    public static final void method2043(int arg0, class127 arg1) {
        if (arg0 != 0) {
            method2040(false);
        }
        field4362++;
        for (class417 var2 = (class417) client.field3444.method1240((byte) -124); var2 != null; var2 = (class417) client.field3444.method1245(1)) {
            if (var2.field5849 == arg1) {
                if (var2.field5836 != null) {
                    class315.field4277.method1431(var2.field5836);
                    var2.field5836 = null;
                }
                var2.method2367(arg0 ^ 0x5);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIII)Z")
    public final boolean method2044(int arg0, int arg1, int arg2, int arg3) {
        field4368++;
        int var5 = this.field4371;
        if (this.field4361 == arg1 && this.field4371 == 0) {
            return false;
        }
        if (arg3 != 2) {
            field4369 = null;
        }
        boolean var8;
        if (this.field4371 == 0) {
            if (this.field4361 < arg1 && (this.field4361 + arg2) >= arg1 || this.field4361 > arg1 && arg1 >= this.field4361 - arg2) {
                this.field4361 = arg1;
                return false;
            }
            var8 = true;
        } else if (this.field4371 > 0 && this.field4361 < arg1) {
            int var6 = this.field4371 * this.field4371 / (arg2 * 2);
            int var7 = this.field4361 + var6;
            if (var7 < arg1 && var7 >= this.field4361) {
                var8 = true;
            } else {
                var8 = false;
            }
        } else if (this.field4371 < 0 && arg1 < this.field4361) {
            int var9 = this.field4371 * this.field4371 / (arg2 * 2);
            int var10 = this.field4361 - var9;
            if (var10 > arg1 && this.field4361 >= var10) {
                var8 = true;
            } else {
                var8 = false;
            }
        } else {
            var8 = false;
        }
        if (var8) {
            if (this.field4361 < arg1) {
                this.field4371 += arg2;
                if (arg0 != 0 && arg0 < this.field4371) {
                    this.field4371 = arg0;
                }
            } else {
                this.field4371 -= arg2;
                if (arg0 != 0 && (-arg0) > this.field4371) {
                    this.field4371 = -arg0;
                }
            }
            if (this.field4371 != var5) {
                int var11 = this.field4371 * this.field4371 / (arg2 * 2);
                if (this.field4361 >= arg1) {
                    if (arg1 < this.field4361 && (this.field4361 - var11) < arg1) {
                        this.field4371 = var5;
                    }
                } else if (arg1 < this.field4361 + var11) {
                    this.field4371 = var5;
                }
            }
        } else if (this.field4371 <= 0) {
            this.field4371 += arg2;
            if (this.field4371 > 0) {
                this.field4371 = 0;
            }
        } else {
            this.field4371 -= arg2;
            if (this.field4371 < 0) {
                this.field4371 = 0;
            }
        }
        this.field4361 += this.field4371 + var5 >> 1;
        return var8;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(II)V")
    public final void method2045(int arg0, int arg1) {
        this.field4361 = arg0;
        field4367++;
        this.field4371 = arg1;
    }
}
