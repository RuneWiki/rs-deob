import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public class class186 extends class314 {

    @OriginalMember(owner = "client!fq", name = "L", descriptor = "I")
    private int field3115;

    @OriginalMember(owner = "client!fq", name = "M", descriptor = "I")
    public static int field3116 = 0;

    @OriginalMember(owner = "client!fq", name = "N", descriptor = "I")
    public static int field3117;

    @OriginalMember(owner = "client!fq", name = "O", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!fq", name = "P", descriptor = "I")
    public static int field3119;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(II)[I")
    public final int[] method6(int arg0, int arg1) {
        ++field3117;
        if (arg1 <= 109) {
            method1504((byte[]) null, true);
        }
        int[] var3 = super.field4928.method534((byte) -126, arg0);
        if (super.field4928.field618) {
            class398.method2562(var3, 0, class81.field1009, this.field3115);
        }
        return var3;
    }

    @OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(I)V")
    public class186(int arg0) {
        super(0, true);
        this.field3115 = 4096;
        this.field3115 = arg0;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "([BZ)[B")
    public static final byte[] method1504(byte[] arg0, boolean arg1) {
        ++field3119;
        class6 var2 = new class6(arg0);
        if (!arg1) {
            method1504((byte[]) null, true);
        }
        int var3 = var2.method70(-9059);
        int var4 = var2.method72(-18);
        if (var4 >= 0 && (~class106.field1727 == -1 || class106.field1727 >= var4)) {
            if (var3 == 0) {
                byte[] var5 = new byte[var4];
                var2.method50(var5, 0, var4, (byte) 19);
                return var5;
            } else {
                int var6 = var2.method72(-99);
                if (~var6 > -1 || class106.field1727 != 0 && class106.field1727 < var6) {
                    throw new RuntimeException();
                } else {
                    byte[] var7 = new byte[var6];
                    if (~var3 != -2) {
                        class442 var8 = class156.field2671;
                        synchronized (class156.field2671) {
                            class156.field2671.method2792(var2, -1, var7);
                        }
                    } else {
                        class352.method2365(var7, var6, arg0, var4, 9);
                    }
                    return var7;
                }
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(BLie;I)V")
    public final void method5(byte arg0, class6 arg1, int arg2) {
        ++field3118;
        if (arg0 >= -1) {
            method1504((byte[]) null, false);
        }
        if (~arg2 == -1) {
            this.field3115 = (arg1.method70(-9059) << 12) / 255;
        }
    }

    @OriginalMember(owner = "client!fq", name = "<init>", descriptor = "()V")
    public class186() {
        this(4096);
    }
}
