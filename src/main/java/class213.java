import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class213 implements class83 {

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "Lqe;")
    public static class465 field3053 = new class465(51, 4);

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "I")
    public int field3051;

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "I")
    public int field3052;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "I")
    public static int field3054;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "I")
    public int field3056;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "I")
    public int field3057;

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "I")
    public static int field3058;

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "I")
    public int field3059;

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "I")
    public int field3060;

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "I")
    public static int field3061;

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "Z")
    public boolean field3055;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(III)V")
    public static final void method1489(int arg0, int arg1, int arg2) {
        class416 var3 = class390.field5454[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        class260.method1768(var3.field5838);
        class260.method1768(var3.field5840);
        if (var3.field5838 != null) {
            var3.field5838 = null;
        }
        if (var3.field5840 != null) {
            var3.field5840 = null;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lrf;B)Z")
    public final boolean method802(class83 arg0, byte arg1) {
        field3058++;
        if (!(arg0 instanceof class213)) {
            return false;
        }
        class213 var3 = (class213) arg0;
        if (this.field3056 != var3.field3056) {
            return false;
        } else if (this.field3059 != var3.field3059) {
            return false;
        } else if (this.field3057 != var3.field3057) {
            return false;
        } else if (this.field3060 != var3.field3060) {
            return false;
        } else if (this.field3051 == var3.field3051) {
            if (arg1 != -91) {
                method1490(50);
            }
            if (this.field3052 == var3.field3052) {
                return this.field3055 == var3.field3055;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)J")
    public final long method803(byte arg0) {
        field3054++;
        long[] var2 = class674.field9468;
        long var3 = -1L;
        long var5 = var3 >>> 8 ^ var2[(int) (((long) this.field3056 ^ var3) & 0xFFL)];
        long var7 = var5 >>> 8 ^ var2[(int) (((long) (this.field3059 >> 8) ^ var5) & 0xFFL)];
        long var9 = var7 >>> 8 ^ var2[(int) (((long) this.field3059 ^ var7) & 0xFFL)];
        long var11 = var2[(int) ((var9 ^ (long) (this.field3057 >> 24)) & 0xFFL)] ^ var9 >>> 8;
        if (arg0 != 108) {
            this.method803((byte) 90);
        }
        long var13 = var11 >>> 8 ^ var2[(int) ((var11 ^ (long) (this.field3057 >> 16)) & 0xFFL)];
        long var15 = var2[(int) (((long) (this.field3057 >> 8) ^ var13) & 0xFFL)] ^ var13 >>> 8;
        long var17 = var2[(int) ((var15 ^ (long) this.field3057) & 0xFFL)] ^ var15 >>> 8;
        long var19 = var2[(int) (((long) this.field3060 ^ var17) & 0xFFL)] ^ var17 >>> 8;
        long var21 = var2[(int) ((var19 ^ (long) (this.field3051 >> 24)) & 0xFFL)] ^ var19 >>> 8;
        long var23 = var21 >>> 8 ^ var2[(int) (((long) (this.field3051 >> 16) ^ var21) & 0xFFL)];
        long var25 = var2[(int) (((long) (this.field3051 >> 8) ^ var23) & 0xFFL)] ^ var23 >>> 8;
        long var27 = var25 >>> 8 ^ var2[(int) (((long) this.field3051 ^ var25) & 0xFFL)];
        long var29 = var27 >>> 8 ^ var2[(int) (((long) this.field3052 ^ var27) & 0xFFL)];
        return var2[(int) ((var29 ^ (long) (this.field3055 ? 1 : 0)) & 0xFFL)] ^ var29 >>> 8;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V")
    public static void method1490(int arg0) {
        if (arg0 == 4) {
            field3053 = null;
        }
    }
}
