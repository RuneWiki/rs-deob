import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class432 {

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "[Lfs;")
    private class287[] field6253;

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "I")
    private int field6252;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "I")
    public static int field6248;

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "I")
    public static int field6250;

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "I")
    public static int field6251;

    @OriginalMember(owner = "client!tl", name = "g", descriptor = "I")
    public static int field6254;

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "J")
    private long field6249;

    @OriginalMember(owner = "client!tl", name = "h", descriptor = "Lfs;")
    private class287 field6255;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(B)V", line = 8)
    public static final void method2562(byte arg0) {
        field6251++;
        int var1 = class76.field1075.method1108(2, class195.field2849);
        if (var1 == 0) {
            class398.field5712 = null;
            class128.method921(0, 0);
        } else if (var1 == 1) {
            class169.method1166(-11323, (byte) 0);
            class128.method921(512, 0);
            if (class27.field379 != null) {
                class189.method1260(24391);
            }
        } else {
            class169.method1166(-11323, (byte) (class367.field5267 - 4 & 0xFF));
            class128.method921(2, 0);
        }
        class187.field2758 = class366.field5260;
        if (arg0 <= -42) {
            ;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(ILfs;J)V", line = 45)
    public final void method2563(int arg0, class287 arg1, long arg2) {
        field6254++;
        if (arg1.field3890 != null) {
            arg1.method1645(-116);
        }
        class287 var5 = this.field6253[(int) (arg2 & (long) (this.field6252 + arg0))];
        arg1.field3888 = var5;
        arg1.field3890 = var5.field3890;
        arg1.field3890.field3888 = arg1;
        arg1.field3883 = arg2;
        arg1.field3888.field3890 = arg1;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(JI)Lfs;", line = 68)
    public final class287 method2564(long arg0, int arg1) {
        field6248++;
        this.field6249 = arg0;
        class287 var4 = this.field6253[(int) (arg0 & (long) (this.field6252 - 1))];
        this.field6255 = var4.field3888;
        if (arg1 != -4530) {
            return null;
        }
        while (this.field6255 != var4) {
            if (this.field6255.field3883 == arg0) {
                class287 var5 = this.field6255;
                this.field6255 = this.field6255.field3888;
                return var5;
            }
            this.field6255 = this.field6255.field3888;
        }
        this.field6255 = null;
        return null;
    }

    @OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(I)V", line = 105)
    public class432(int arg0) {
        this.field6253 = new class287[arg0];
        this.field6252 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class287 var3 = this.field6253[var2] = new class287();
            var3.field3888 = var3;
            var3.field3890 = var3;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Z)Lfs;", line = 128)
    public final class287 method2565(boolean arg0) {
        field6250++;
        if (!arg0) {
            return null;
        } else if (this.field6255 == null) {
            return null;
        } else {
            class287 var2 = this.field6253[(int) (this.field6249 & (long) (this.field6252 - 1))];
            while (this.field6255 != var2) {
                if (this.field6255.field3883 == this.field6249) {
                    class287 var3 = this.field6255;
                    this.field6255 = this.field6255.field3888;
                    return var3;
                }
                this.field6255 = this.field6255.field3888;
            }
            this.field6255 = null;
            return null;
        }
    }
}
