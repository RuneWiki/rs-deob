import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class23 extends class456 {

    @OriginalMember(owner = "client!pc", name = "L", descriptor = "[I")
    public static int[] field305 = new int[256];

    @OriginalMember(owner = "client!pc", name = "H", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "client!pc", name = "I", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!pc", name = "J", descriptor = "I")
    private int field303;

    @OriginalMember(owner = "client!pc", name = "K", descriptor = "I")
    private int field304;

    @OriginalMember(owner = "client!pc", name = "M", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "client!pc", name = "N", descriptor = "I")
    public static int field307;

    @OriginalMember(owner = "client!pc", name = "O", descriptor = "I")
    private int field308;

    @OriginalMember(owner = "client!pc", name = "Q", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!pc", name = "P", descriptor = "Lhq;")
    public static class392 field309;

    static {
        for (int var0 = 0; var0 < 256; ++var0) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; ++var2) {
                if ((var1 & 1) == 1) {
                    var1 = -306674912 ^ var1 >>> 1;
                } else {
                    var1 >>>= 1;
                }
            }
            field305[var0] = var1;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(JB)Ljava/lang/String;", line = 3)
    public static final String method208(long arg0, byte arg1) {
        class186.field2832.setTime(new Date(arg0));
        ++field306;
        int var3 = class186.field2832.get(7);
        if (arg1 != 99) {
            method211(false);
        }
        int var4 = class186.field2832.get(5);
        int var5 = class186.field2832.get(2);
        int var6 = class186.field2832.get(1);
        int var7 = class186.field2832.get(11);
        int var8 = class186.field2832.get(12);
        int var9 = class186.field2832.get(13);
        return class71.field953[var3 + -1] + ", " + var4 / 10 + var4 % 10 + "-" + class299.field4472[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(II)V", line = 30)
    private final void method209(int arg0, int arg1) {
        ++field301;
        this.field304 = 4080 & arg1 >> 4;
        this.field308 = 4080 & arg1 >> 12;
        if (arg0 == 7) {
            this.field303 = 4080 & arg1 << 4;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IBLre;)V", line = 44)
    public final void method210(int arg0, byte arg1, class446 arg2) {
        if (arg0 == 0) {
            this.method209(7, arg2.method2613(-25778));
        }
        if (arg1 != 55) {
            field309 = null;
        }
        ++field307;
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(I)V", line = 76)
    private class23(int arg0) {
        super(0, false);
        this.method209(7, arg0);
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(Z)V", line = 84)
    public static void method211(boolean arg0) {
        if (!arg0) {
            field310 = 15;
        }
        field305 = null;
        field309 = null;
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "()V", line = 95)
    public class23() {
        this(0);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)[[I", line = 100)
    public final int[][] method212(int arg0, int arg1) {
        ++field302;
        int[][] var3 = super.field6468.method1090(-2, arg1);
        if (arg0 != 0) {
            return null;
        } else {
            if (super.field6468.field2227) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                for (int var7 = 0; class156.field2169 > var7; ++var7) {
                    var4[var7] = this.field308;
                    var5[var7] = this.field304;
                    var6[var7] = this.field303;
                }
            }
            return var3;
        }
    }
}
