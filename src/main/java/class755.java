import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kca")
public class class755 {

    @OriginalMember(owner = "client!kca", name = "c", descriptor = "I")
    public int field10513;

    @OriginalMember(owner = "client!kca", name = "g", descriptor = "[F")
    public static float[] field10517 = new float[4];

    @OriginalMember(owner = "client!kca", name = "i", descriptor = "Llc;")
    public static class435 field10519 = new class435(113, 3);

    @OriginalMember(owner = "client!kca", name = "b", descriptor = "I")
    public static int field10512;

    @OriginalMember(owner = "client!kca", name = "d", descriptor = "I")
    public static int field10514;

    @OriginalMember(owner = "client!kca", name = "e", descriptor = "I")
    public static int field10515;

    @OriginalMember(owner = "client!kca", name = "f", descriptor = "I")
    public static int field10516;

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "Ltd;")
    public static class515 field10511;

    @OriginalMember(owner = "client!kca", name = "h", descriptor = "[Lsia;")
    public static class151[] field10518;

    @OriginalMember(owner = "client!kca", name = "<init>", descriptor = "(I)V", line = 9)
    public class755(int arg0) {
        this.field10513 = arg0;
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(ZII)Z", line = 18)
    public static final boolean method4194(boolean arg0, int arg1, int arg2) {
        field10515++;
        if (!arg0) {
            method4197(78, -30, false, false);
        }
        return class211.method1495(arg2, arg1, -104) | (arg1 & 0x60000) != 0 || class584.method3437(arg2, arg1, -52) || class573.method3405(arg2, arg1, (byte) 7);
    }

    @OriginalMember(owner = "client!kca", name = "toString", descriptor = "()Ljava/lang/String;", line = 29)
    public final String toString() {
        field10516++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(I)V", line = 42)
    public static void method4195(int arg0) {
        field10511 = null;
        if (arg0 != 393216) {
            method4197(-47, -97, false, false);
        }
        field10517 = null;
        field10519 = null;
        field10518 = null;
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(IZZ)V", line = 59)
    public static final void method4196(int arg0, boolean arg1, boolean arg2) {
        field10512++;
        class37 var3 = class582.method3429(arg1, (byte) -118, arg0);
        if (!arg2 && var3 != null) {
            for (int var4 = 0; var4 < var3.field334.length; var4++) {
                var3.field334[var4] = -1;
                var3.field332[var4] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(IIZZ)Ljava/lang/String;", line = 85)
    public static final String method4197(int arg0, int arg1, boolean arg2, boolean arg3) {
        field10514++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        } else if (arg2 && arg0 >= 0) {
            int var4 = 2;
            if (arg3) {
                field10518 = null;
            }
            int var5 = arg0 / arg1;
            while (var5 != 0) {
                var5 /= arg1;
                var4++;
            }
            char[] var6 = new char[var4];
            var6[0] = '+';
            for (int var7 = var4 - 1; var7 > 0; var7--) {
                int var8 = arg0;
                arg0 /= arg1;
                int var9 = var8 - (arg0 * arg1);
                if (var9 < 10) {
                    var6[var7] = (char) (var9 + 48);
                } else {
                    var6[var7] = (char) (var9 + 87);
                }
            }
            return new String(var6);
        } else {
            return Integer.toString(arg0, arg1);
        }
    }
}
