import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class111 extends class192 {

    @OriginalMember(owner = "client!th", name = "M", descriptor = "F")
    public static float field1452;

    @OriginalMember(owner = "client!th", name = "I", descriptor = "I")
    private int field1448;

    @OriginalMember(owner = "client!th", name = "J", descriptor = "I")
    public static int field1449;

    @OriginalMember(owner = "client!th", name = "K", descriptor = "I")
    public static int field1450;

    @OriginalMember(owner = "client!th", name = "L", descriptor = "I")
    public static int field1451;

    @OriginalMember(owner = "client!th", name = "N", descriptor = "I")
    private int field1453;

    @OriginalMember(owner = "client!th", name = "O", descriptor = "I")
    public static int field1454;

    @OriginalMember(owner = "client!th", name = "P", descriptor = "I")
    private int field1455;

    @OriginalMember(owner = "client!th", name = "Q", descriptor = "I")
    public static int field1456;

    @OriginalMember(owner = "client!th", name = "R", descriptor = "I")
    public static int field1457;

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "(I)V", line = 7)
    private class111(int arg0) {
        super(0, false);
        this.method852(arg0, 7810);
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "()V", line = 19)
    public class111() {
        this(0);
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(IB)[[I", line = 22)
    public final int[][] method107(int arg0, byte arg1) {
        ++field1451;
        int[][] var3 = super.field2467.method2466(arg0, 0);
        int var4 = -45 % ((arg1 - -14) / 34);
        if (super.field2467.field5565) {
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; var8 < class561.field7319; ++var8) {
                var5[var8] = this.field1453;
                var6[var8] = this.field1455;
                var7[var8] = this.field1448;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ILfd;I)V", line = 61)
    public final void method109(int arg0, class418 arg1, int arg2) {
        ++field1456;
        if (~arg0 == -1) {
            this.method852(arg1.method2364(-106), 7810);
        }
        if (arg2 != -12160) {
            method854(41, (Object) null, 100, 86);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(II)V", line = 88)
    private final void method852(int arg0, int arg1) {
        this.field1455 = (65280 & arg0) >> 4;
        if (arg1 != 7810) {
            this.method109(93, (class418) null, 38);
        }
        ++field1454;
        this.field1448 = arg0 << 4 & 4080;
        this.field1453 = (16711680 & arg0) >> 12;
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(Z)V", line = 101)
    public static final void method853(boolean arg0) {
        ++field1450;
        if (!class440.field5682) {
            class63.field862 = true;
            class440.field5682 = true;
            if (arg0) {
                method855(63, -38);
            }
            if (class260.field3509.field1283) {
                class141.field1859 = (float) ((int) class141.field1859 + -65 & -128);
            } else {
                class507.field6661 += (-24.0F - class507.field6661) / 2.0F;
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ILjava/lang/Object;II)[B", line = 126)
    public static final byte[] method854(int arg0, Object arg1, int arg2, int arg3) {
        ++field1449;
        if (arg1 == null) {
            return null;
        } else if (arg1 instanceof byte[]) {
            byte[] var4 = (byte[]) arg1;
            return class151.method1104(arg3, arg2, 0, var4);
        } else if (arg1 instanceof class602) {
            class602 var5 = (class602) arg1;
            return var5.method2682(0, arg3, arg2);
        } else {
            if (arg0 != 0) {
                field1452 = -1.0281951F;
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(II)S", line = 159)
    public static final short method855(int arg0, int arg1) {
        ++field1457;
        int var2 = (64952 & arg0) >> 10;
        int var3 = 112 & arg0 >> 3;
        int var4 = 127 & arg0;
        int var5 = var4 <= 64 ? var3 * var4 >> 7 : (127 - var4) * var3 >> 7;
        int var6 = var4 - -var5;
        if (arg1 != -3159) {
            return 32;
        } else {
            int var7;
            if (~var6 != -1) {
                var7 = (var5 << 8) / var6;
            } else {
                var7 = var5 << 1;
            }
            return (short) (var6 | var7 >> 4 << 7 | var2 << 10);
        }
    }
}
