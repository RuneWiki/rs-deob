import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public class class488 implements class329 {

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "Lhga;")
    public static class158 field6985 = new class158();

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "I")
    public int field6986;

    @OriginalMember(owner = "client!hr", name = "d", descriptor = "I")
    public int field6988;

    @OriginalMember(owner = "client!hr", name = "e", descriptor = "I")
    public static int field6989;

    @OriginalMember(owner = "client!hr", name = "f", descriptor = "I")
    public static int field6990;

    @OriginalMember(owner = "client!hr", name = "g", descriptor = "I")
    public static int field6991;

    @OriginalMember(owner = "client!hr", name = "h", descriptor = "I")
    public int field6992;

    @OriginalMember(owner = "client!hr", name = "i", descriptor = "I")
    public int field6993;

    @OriginalMember(owner = "client!hr", name = "j", descriptor = "I")
    public int field6994;

    @OriginalMember(owner = "client!hr", name = "k", descriptor = "I")
    public static int field6995;

    @OriginalMember(owner = "client!hr", name = "l", descriptor = "I")
    public int field6996;

    @OriginalMember(owner = "client!hr", name = "c", descriptor = "Z")
    public boolean field6987;

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(ILlk;)V")
    public static final void method2944(int arg0, class545 arg1) {
        if (arg0 > -90) {
            return;
        }
        field6989++;
        if (class154.field2608 != arg1.field7709) {
            return;
        }
        if (class532.field7456.field8631 == null) {
            arg1.field7742 = 0;
            arg1.field7677 = 0;
            return;
        }
        arg1.field7737 = 150;
        arg1.field7635 = (int) (Math.sin((double) class336.field5031 / 40.0D) * 256.0D) & 0x7FF;
        arg1.field7742 = class422.field6096;
        arg1.field7602 = 5;
        arg1.field7677 = class447.method2688(class532.field7456.field8631, 8);
        arg1.field7624 = class532.field7456.field8736;
        arg1.field7715 = 0;
        arg1.field7661 = class532.field7456.field8685;
        arg1.field7698 = class532.field7456.field8766;
        class138 var2 = arg1.field7698 == -1 ? null : class357.field5338.method2099(arg1.field7698, true);
        if (var2 != null) {
            class130.method1098(arg1.field7624, (byte) 88, var2);
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(I)V")
    public static void method2945(int arg0) {
        field6985 = null;
        if (arg0 != 2098433104) {
            method2944(-127, null);
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lbga;B)Z")
    public final boolean method2113(class329 arg0, byte arg1) {
        field6991++;
        if (!(arg0 instanceof class488)) {
            return false;
        }
        class488 var3 = (class488) arg0;
        if (this.field6993 != var3.field6993) {
            return false;
        }
        int var4 = -73 / ((56 - arg1) / 51);
        if (this.field6994 != var3.field6994) {
            return false;
        } else if (this.field6996 != var3.field6996) {
            return false;
        } else if (this.field6986 != var3.field6986) {
            return false;
        } else if (this.field6992 != var3.field6992) {
            return false;
        } else if (this.field6988 == var3.field6988) {
            return this.field6987 == var3.field6987;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Z)J")
    public final long method2112(boolean arg0) {
        field6990++;
        long[] var2 = class311.field4629;
        long var3 = -1L;
        long var5 = var3 >>> 8 ^ var2[(int) ((var3 ^ (long) this.field6993) & 0xFFL)];
        long var7 = var2[(int) (((long) (this.field6994 >> 8) ^ var5) & 0xFFL)] ^ var5 >>> 8;
        long var9 = var2[(int) ((var7 ^ (long) this.field6994) & 0xFFL)] ^ var7 >>> 8;
        long var11 = var2[(int) ((var9 ^ (long) (this.field6996 >> 24)) & 0xFFL)] ^ var9 >>> 8;
        if (arg0) {
            this.method2113(null, (byte) -97);
        }
        long var13 = var2[(int) (((long) (this.field6996 >> 16) ^ var11) & 0xFFL)] ^ var11 >>> 8;
        long var15 = var2[(int) ((var13 ^ (long) (this.field6996 >> 8)) & 0xFFL)] ^ var13 >>> 8;
        long var17 = var2[(int) (((long) this.field6996 ^ var15) & 0xFFL)] ^ var15 >>> 8;
        long var19 = var17 >>> 8 ^ var2[(int) (((long) this.field6986 ^ var17) & 0xFFL)];
        long var21 = var19 >>> 8 ^ var2[(int) ((var19 ^ (long) (this.field6992 >> 24)) & 0xFFL)];
        long var23 = var21 >>> 8 ^ var2[(int) (((long) (this.field6992 >> 16) ^ var21) & 0xFFL)];
        long var25 = var23 >>> 8 ^ var2[(int) (((long) (this.field6992 >> 8) ^ var23) & 0xFFL)];
        long var27 = var2[(int) (((long) this.field6992 ^ var25) & 0xFFL)] ^ var25 >>> 8;
        long var29 = var2[(int) (((long) this.field6988 ^ var27) & 0xFFL)] ^ var27 >>> 8;
        return var2[(int) (((long) (this.field6987 ? 1 : 0) ^ var29) & 0xFFL)] ^ var29 >>> 8;
    }
}
