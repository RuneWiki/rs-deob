import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!efa")
public class class324 implements class654 {

    @OriginalMember(owner = "client!efa", name = "h", descriptor = "J")
    public static long field4206 = 0L;

    @OriginalMember(owner = "client!efa", name = "k", descriptor = "Lra;")
    public static class361 field4209 = new class361(44, -1);

    @OriginalMember(owner = "client!efa", name = "l", descriptor = "[B")
    public static byte[] field4210 = new byte[2048];

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "I")
    public static int field4199;

    @OriginalMember(owner = "client!efa", name = "b", descriptor = "I")
    public int field4200;

    @OriginalMember(owner = "client!efa", name = "c", descriptor = "I")
    public int field4201;

    @OriginalMember(owner = "client!efa", name = "d", descriptor = "I")
    public int field4202;

    @OriginalMember(owner = "client!efa", name = "e", descriptor = "I")
    public static int field4203;

    @OriginalMember(owner = "client!efa", name = "f", descriptor = "I")
    public int field4204;

    @OriginalMember(owner = "client!efa", name = "g", descriptor = "I")
    public int field4205;

    @OriginalMember(owner = "client!efa", name = "i", descriptor = "I")
    public int field4207;

    @OriginalMember(owner = "client!efa", name = "j", descriptor = "Z")
    public boolean field4208;

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(I)J")
    public final long method1871(int arg0) {
        field4199++;
        long[] var2 = class64.field878;
        long var3 = -1L;
        long var5 = var2[(int) ((var3 ^ (long) this.field4207) & 0xFFL)] ^ var3 >>> 8;
        long var7 = var5 >>> 8 ^ var2[(int) ((var5 ^ (long) (this.field4205 >> 8)) & 0xFFL)];
        long var9 = var7 >>> 8 ^ var2[(int) ((var7 ^ (long) this.field4205) & 0xFFL)];
        long var11 = var2[(int) ((var9 ^ (long) (this.field4200 >> 24)) & 0xFFL)] ^ var9 >>> 8;
        long var13 = var2[(int) (((long) (this.field4200 >> 16) ^ var11) & 0xFFL)] ^ var11 >>> 8;
        long var15 = var13 >>> 8 ^ var2[(int) (((long) (this.field4200 >> 8) ^ var13) & 0xFFL)];
        long var17 = var15 >>> 8 ^ var2[(int) ((var15 ^ (long) this.field4200) & 0xFFL)];
        long var19 = var17 >>> 8 ^ var2[(int) (((long) this.field4204 ^ var17) & 0xFFL)];
        if (arg0 != 10292) {
            method1873((byte) -77);
        }
        long var21 = var19 >>> 8 ^ var2[(int) (((long) (this.field4201 >> 24) ^ var19) & 0xFFL)];
        long var23 = var21 >>> 8 ^ var2[(int) (((long) (this.field4201 >> 16) ^ var21) & 0xFFL)];
        long var25 = var2[(int) (((long) (this.field4201 >> 8) ^ var23) & 0xFFL)] ^ var23 >>> 8;
        long var27 = var2[(int) ((var25 ^ (long) this.field4201) & 0xFFL)] ^ var25 >>> 8;
        long var29 = var2[(int) ((var27 ^ (long) this.field4202) & 0xFFL)] ^ var27 >>> 8;
        return var29 >>> 8 ^ var2[(int) (((long) (this.field4208 ? 1 : 0) ^ var29) & 0xFFL)];
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(Lgj;I)Z")
    public final boolean method1872(class654 arg0, int arg1) {
        field4203++;
        if (!(arg0 instanceof class324)) {
            return false;
        }
        class324 var3 = (class324) arg0;
        if (this.field4207 != var3.field4207) {
            return false;
        } else if (this.field4205 != var3.field4205) {
            return false;
        } else if (this.field4200 != var3.field4200) {
            return false;
        } else if (this.field4204 != var3.field4204) {
            return false;
        } else if (this.field4201 == var3.field4201) {
            if (arg1 != 18282) {
                method1873((byte) -93);
            }
            if (this.field4202 == var3.field4202) {
                return this.field4208 == var3.field4208;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(B)V")
    public static void method1873(byte arg0) {
        field4210 = null;
        if (arg0 > -111) {
            field4206 = -32L;
        }
        field4209 = null;
    }
}
