import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class360 implements class160 {

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "[I")
    public static int[] field4654 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!ke", name = "o", descriptor = "Lhb;")
    public static class250 field4663;

    @OriginalMember(owner = "client!ke", name = "p", descriptor = "[B")
    public static byte[] field4664;

    @OriginalMember(owner = "client!ke", name = "q", descriptor = "Z")
    public static boolean field4665;

    @OriginalMember(owner = "client!ke", name = "r", descriptor = "Loi;")
    public static class169 field4666;

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
    public static int field4650;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "I")
    public static int field4651;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "I")
    public static int field4652;

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "I")
    public static int field4653;

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "I")
    public static int field4655;

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "I")
    public int field4656;

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "I")
    public int field4657;

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "I")
    public static int field4658;

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "I")
    public int field4659;

    @OriginalMember(owner = "client!ke", name = "l", descriptor = "I")
    public int field4660;

    @OriginalMember(owner = "client!ke", name = "m", descriptor = "I")
    public int field4661;

    @OriginalMember(owner = "client!ke", name = "n", descriptor = "I")
    public int field4662;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "Z")
    public boolean field4649;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Z)J")
    public final long method1071(boolean arg0) {
        field4658++;
        if (arg0) {
            return -6L;
        }
        long[] var2 = class180.field2345;
        long var3 = -1L;
        long var5 = var2[(int) ((var3 ^ (long) this.field4656) & 0xFFL)] ^ var3 >>> 8;
        long var7 = var5 >>> 8 ^ var2[(int) ((var5 ^ (long) (this.field4660 >> 8)) & 0xFFL)];
        long var9 = var2[(int) (((long) this.field4660 ^ var7) & 0xFFL)] ^ var7 >>> 8;
        long var11 = var2[(int) ((var9 ^ (long) (this.field4662 >> 24)) & 0xFFL)] ^ var9 >>> 8;
        long var13 = var2[(int) (((long) (this.field4662 >> 16) ^ var11) & 0xFFL)] ^ var11 >>> 8;
        long var15 = var13 >>> 8 ^ var2[(int) ((var13 ^ (long) (this.field4662 >> 8)) & 0xFFL)];
        long var17 = var2[(int) (((long) this.field4662 ^ var15) & 0xFFL)] ^ var15 >>> 8;
        long var19 = var2[(int) (((long) this.field4661 ^ var17) & 0xFFL)] ^ var17 >>> 8;
        long var21 = var2[(int) (((long) (this.field4659 >> 24) ^ var19) & 0xFFL)] ^ var19 >>> 8;
        long var23 = var21 >>> 8 ^ var2[(int) (((long) (this.field4659 >> 16) ^ var21) & 0xFFL)];
        long var25 = var23 >>> 8 ^ var2[(int) (((long) (this.field4659 >> 8) ^ var23) & 0xFFL)];
        long var27 = var2[(int) ((var25 ^ (long) this.field4659) & 0xFFL)] ^ var25 >>> 8;
        long var29 = var2[(int) ((var27 ^ (long) this.field4657) & 0xFFL)] ^ var27 >>> 8;
        return var2[(int) (((long) (this.field4649 ? 1 : 0) ^ var29) & 0xFFL)] ^ var29 >>> 8;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)I")
    public static final int method2117(int arg0) {
        field4652++;
        return arg0 == 0 ? 2 : -68;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILs;)Z")
    public final boolean method1070(int arg0, class160 arg1) {
        field4655++;
        if (!(arg1 instanceof class360)) {
            return false;
        }
        class360 var3 = (class360) arg1;
        if (this.field4656 != var3.field4656) {
            return false;
        } else if (this.field4660 != var3.field4660) {
            return false;
        } else if (this.field4662 != var3.field4662) {
            return false;
        } else if (this.field4661 == var3.field4661) {
            if (arg0 != 30424) {
                field4663 = null;
            }
            if (this.field4659 != var3.field4659) {
                return false;
            } else if (this.field4657 == var3.field4657) {
                return this.field4649 == var3.field4649;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(Z)V")
    public static void method2118(boolean arg0) {
        field4666 = null;
        field4654 = null;
        field4663 = null;
        field4664 = null;
        if (!arg0) {
            field4654 = null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Ljava/lang/Object;BZ)[B")
    public static final byte[] method2119(Object arg0, byte arg1, boolean arg2) {
        field4650++;
        int var3 = -20 / ((12 - arg1) / 53);
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var4 = (byte[]) arg0;
            return arg2 ? class182.method1200(var4, 17916) : var4;
        } else if (arg0 instanceof class238) {
            class238 var5 = (class238) arg0;
            return var5.method1509(0);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method2120(String arg0, int arg1) {
        class482.method2888("", 0, "", 0, 0, arg0);
        if (arg1 <= 67) {
            method2120(null, 124);
        }
        field4651++;
    }

    static {
        new class169("Unable to add name - unknown player.", "Name konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter le nom - joueur inconnu.", "Não foi possível adicionar um nome - jogador desconhecido.");
        field4663 = new class250(49, 7);
        field4664 = new byte[2048];
        field4665 = false;
        field4666 = new class169("M", "M", "M", "M");
    }
}
