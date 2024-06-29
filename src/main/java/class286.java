import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class286 extends class259 {

    @OriginalMember(owner = "client!si", name = "L", descriptor = "I")
    public int field4380 = 0;

    @OriginalMember(owner = "client!si", name = "S", descriptor = "[I")
    public static int[] field4387 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!si", name = "O", descriptor = "Lhl;")
    public static class139 field4383 = new class139(64);

    @OriginalMember(owner = "client!si", name = "T", descriptor = "Z")
    public static boolean field4388 = false;

    @OriginalMember(owner = "client!si", name = "M", descriptor = "I")
    public static int field4381;

    @OriginalMember(owner = "client!si", name = "N", descriptor = "I")
    public static int field4382;

    @OriginalMember(owner = "client!si", name = "P", descriptor = "I")
    public static int field4384;

    @OriginalMember(owner = "client!si", name = "Q", descriptor = "I")
    public static int field4385;

    @OriginalMember(owner = "client!si", name = "R", descriptor = "I")
    public static int field4386;

    @OriginalMember(owner = "client!si", name = "e", descriptor = "(I)V")
    public static void method1898(int arg0) {
        field4383 = null;
        int var1 = 126 % ((-arg0 - 83) / 37);
        field4387 = null;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ILca;I)V")
    private final void method1899(int arg0, class54 arg1, int arg2) {
        if (arg0 == 2) {
            this.field4380 = arg1.method423(57);
        }
        if (arg2 <= -19) {
            field4381++;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ILpk;B)Lij;")
    public static final class151 method1900(int arg0, class237 arg1, byte arg2) {
        if (arg2 != 108) {
            method1898(89);
        }
        field4386++;
        byte[] var3 = arg1.method1620(false, arg0);
        return var3 == null ? null : new class151(var3);
    }

    @OriginalMember(owner = "client!si", name = "e", descriptor = "(II)I")
    public static final int method1901(int arg0, int arg1) {
        int var2 = ((arg0 & 0xAAAAAAAA) >>> 1) + (arg0 & 0x55555555);
        field4385++;
        int var3 = ((var2 & 0xCCCCCCCF) >>> 2) + (var2 & 0x33333333);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        if (arg1 != 8) {
            field4387 = null;
        }
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(BI)I")
    public static final int method1902(byte arg0, int arg1) {
        field4384++;
        if (arg0 <= 93) {
            method1898(-61);
        }
        return arg1 == 16711935 ? -1 : class81.method630(arg1, -495735545);
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Lca;I)V")
    public final void method1903(class54 arg0, int arg1) {
        if (arg1 < 92) {
            return;
        }
        field4382++;
        while (true) {
            int var3 = arg0.method407(255);
            if (var3 == 0) {
                return;
            }
            this.method1899(var3, arg0, -50);
        }
    }
}
