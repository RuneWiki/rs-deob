import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class23 implements class451 {

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "Lmt;")
    public static class276 field297 = new class276(10, 2, 2, 0);

    @OriginalMember(owner = "client!uc", name = "l", descriptor = "I")
    public static int field302 = 0;

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "Ltn;")
    public static class60 field301 = new class60(66, 0);

    @OriginalMember(owner = "client!uc", name = "m", descriptor = "Ltn;")
    public static class60 field303;

    @OriginalMember(owner = "client!uc", name = "p", descriptor = "[I")
    public static int[] field306;

    @OriginalMember(owner = "client!uc", name = "n", descriptor = "I")
    public static int field304;

    @OriginalMember(owner = "client!uc", name = "o", descriptor = "[I")
    public static int[] field305;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
    public int field293;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "I")
    public int field294;

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "I")
    public static int field295;

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "I")
    public int field296;

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "I")
    public int field298;

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "I")
    public int field299;

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "I")
    public int field300;

    @OriginalMember(owner = "client!uc", name = "q", descriptor = "Loi;")
    public static class53 field307;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "Z")
    public boolean field291;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)J")
    public final long method139(int arg0) {
        field292++;
        long[] var2 = class205.field2973;
        long var3 = -1L;
        long var5 = var2[(int) (((long) this.field299 ^ var3) & 0xFFL)] ^ var3 >>> 8;
        long var7 = var2[(int) (((long) (this.field294 >> 8) ^ var5) & 0xFFL)] ^ var5 >>> 8;
        long var9 = var7 >>> 8 ^ var2[(int) (((long) this.field294 ^ var7) & 0xFFL)];
        long var11 = var9 >>> 8 ^ var2[(int) ((var9 ^ (long) (this.field296 >> 24)) & 0xFFL)];
        long var13 = var11 >>> 8 ^ var2[(int) (((long) (this.field296 >> 16) ^ var11) & 0xFFL)];
        long var15 = var2[(int) (((long) (this.field296 >> 8) ^ var13) & 0xFFL)] ^ var13 >>> 8;
        long var17 = var2[(int) ((var15 ^ (long) this.field296) & 0xFFL)] ^ var15 >>> 8;
        long var19 = var2[(int) (((long) this.field300 ^ var17) & 0xFFL)] ^ var17 >>> 8;
        long var21 = var19 >>> 8 ^ var2[(int) ((var19 ^ (long) (this.field293 >> 24)) & 0xFFL)];
        long var23 = var2[(int) (((long) (this.field293 >> 16) ^ var21) & 0xFFL)] ^ var21 >>> 8;
        long var25 = var23 >>> 8 ^ var2[(int) ((var23 ^ (long) (this.field293 >> 8)) & 0xFFL)];
        long var27 = var25 >>> 8 ^ var2[(int) (((long) this.field293 ^ var25) & 0xFFL)];
        if (arg0 >= -74) {
            this.method139(-14);
        }
        long var29 = var27 >>> 8 ^ var2[(int) ((var27 ^ (long) this.field298) & 0xFFL)];
        return var2[(int) ((var29 ^ (long) (this.field291 ? 1 : 0)) & 0xFFL)] ^ var29 >>> 8;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILgo;)Z")
    public final boolean method140(int arg0, class451 arg1) {
        field295++;
        if (!(arg1 instanceof class23)) {
            return false;
        }
        class23 var3 = (class23) arg1;
        if (this.field299 != var3.field299) {
            return false;
        } else if (this.field294 != var3.field294) {
            return false;
        } else if (this.field296 == var3.field296) {
            if (arg0 != -31649) {
                this.field294 = 54;
            }
            if (this.field300 != var3.field300) {
                return false;
            } else if (this.field293 != var3.field293) {
                return false;
            } else if (this.field298 == var3.field298) {
                return this.field291 == var3.field291;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)V")
    public static void method141(int arg0) {
        field305 = null;
        field307 = null;
        if (arg0 != 255) {
            method141(-16);
        }
        field306 = null;
        field303 = null;
        field301 = null;
        field297 = null;
    }

    static {
        new class530("Select", "Auswählen", "Sélectionner", "Selecionar");
        field303 = new class60(44, 2);
        field306 = new int[6];
        field304 = 0;
        field305 = new int[500];
    }
}
