import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class465 implements class96 {

    @OriginalMember(owner = "client!pi", name = "m", descriptor = "[Ljava/lang/String;")
    public static String[] field5927 = new String[100];

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "Lwp;")
    public static class453 field5922 = new class453(74, 11);

    @OriginalMember(owner = "client!pi", name = "n", descriptor = "I")
    public static int field5928 = -1;

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "I")
    public int field5916;

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "I")
    public int field5917;

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "I")
    public static int field5918;

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "I")
    public int field5919;

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "I")
    public int field5920;

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "I")
    public int field5921;

    @OriginalMember(owner = "client!pi", name = "i", descriptor = "I")
    public int field5923;

    @OriginalMember(owner = "client!pi", name = "j", descriptor = "I")
    public static int field5924;

    @OriginalMember(owner = "client!pi", name = "k", descriptor = "I")
    public static int field5925;

    @OriginalMember(owner = "client!pi", name = "l", descriptor = "I")
    public static int field5926;

    @OriginalMember(owner = "client!pi", name = "o", descriptor = "I")
    public static int field5929;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "Z")
    public boolean field5915;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lgj;I)Z")
    public final boolean method555(class96 arg0, int arg1) {
        field5918++;
        if (!(arg0 instanceof class465)) {
            return false;
        }
        class465 var3 = (class465) arg0;
        if (this.field5919 != var3.field5919) {
            return false;
        } else if (this.field5923 == var3.field5923) {
            int var4 = -115 / ((35 - arg1) / 41);
            if (this.field5921 != var3.field5921) {
                return false;
            } else if (this.field5917 != var3.field5917) {
                return false;
            } else if (this.field5920 != var3.field5920) {
                return false;
            } else if (this.field5916 == var3.field5916) {
                return this.field5915 == var3.field5915;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)J")
    public final long method556(int arg0) {
        field5924++;
        long[] var2 = class36.field488;
        long var3 = -1L;
        long var5 = var3 >>> 8 ^ var2[(int) (((long) this.field5919 ^ var3) & 0xFFL)];
        long var7 = var5 >>> 8 ^ var2[(int) ((var5 ^ (long) (this.field5923 >> 8)) & 0xFFL)];
        long var9 = var7 >>> 8 ^ var2[(int) ((var7 ^ (long) this.field5923) & 0xFFL)];
        if (arg0 <= 42) {
            return -14L;
        }
        long var11 = var2[(int) (((long) (this.field5921 >> 24) ^ var9) & 0xFFL)] ^ var9 >>> 8;
        long var13 = var11 >>> 8 ^ var2[(int) (((long) (this.field5921 >> 16) ^ var11) & 0xFFL)];
        long var15 = var13 >>> 8 ^ var2[(int) ((var13 ^ (long) (this.field5921 >> 8)) & 0xFFL)];
        long var17 = var15 >>> 8 ^ var2[(int) ((var15 ^ (long) this.field5921) & 0xFFL)];
        long var19 = var2[(int) ((var17 ^ (long) this.field5917) & 0xFFL)] ^ var17 >>> 8;
        long var21 = var2[(int) (((long) (this.field5920 >> 24) ^ var19) & 0xFFL)] ^ var19 >>> 8;
        long var23 = var2[(int) (((long) (this.field5920 >> 16) ^ var21) & 0xFFL)] ^ var21 >>> 8;
        long var25 = var2[(int) ((var23 ^ (long) (this.field5920 >> 8)) & 0xFFL)] ^ var23 >>> 8;
        long var27 = var25 >>> 8 ^ var2[(int) (((long) this.field5920 ^ var25) & 0xFFL)];
        long var29 = var27 >>> 8 ^ var2[(int) (((long) this.field5916 ^ var27) & 0xFFL)];
        return var2[(int) ((var29 ^ (long) (this.field5915 ? 1 : 0)) & 0xFFL)] ^ var29 >>> 8;
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(I)V")
    public static void method2467(int arg0) {
        if (arg0 != 255) {
            method2467(70);
        }
        field5927 = null;
        field5922 = null;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IZII)V")
    public static final void method2468(int arg0, boolean arg1, int arg2, int arg3) {
        field5926++;
        if (arg2 < 8000 || arg2 > 48000) {
            throw new IllegalArgumentException();
        } else if (arg3 >= 32) {
            field5925 = arg0;
            class382.field4824 = arg1;
            class392.field4942 = arg2;
        }
    }
}
