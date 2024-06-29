import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class427 extends class139 {

    @OriginalMember(owner = "client!fh", name = "M", descriptor = "Z")
    public static boolean field5976 = true;

    @OriginalMember(owner = "client!fh", name = "N", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field5977 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!fh", name = "O", descriptor = "Z")
    public static boolean field5978 = false;

    @OriginalMember(owner = "client!fh", name = "P", descriptor = "[I")
    public static int[] field5979;

    @OriginalMember(owner = "client!fh", name = "Q", descriptor = "Lrp;")
    public static class276 field5980;

    @OriginalMember(owner = "client!fh", name = "R", descriptor = "Lus;")
    public static class1 field5981;

    @OriginalMember(owner = "client!fh", name = "T", descriptor = "[J")
    public static long[] field5983;

    @OriginalMember(owner = "client!fh", name = "H", descriptor = "I")
    public static int field5972;

    @OriginalMember(owner = "client!fh", name = "I", descriptor = "I")
    public static int field5973;

    @OriginalMember(owner = "client!fh", name = "K", descriptor = "I")
    public static int field5974;

    @OriginalMember(owner = "client!fh", name = "L", descriptor = "I")
    public static int field5975;

    @OriginalMember(owner = "client!fh", name = "S", descriptor = "Lti;")
    public static class280 field5982;

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(II)[I")
    public final int[] method22(int arg0, int arg1) {
        field5972++;
        if (arg1 != 27782) {
            field5982 = null;
        }
        return class216.field3245;
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(Z)V")
    public static void method2509(boolean arg0) {
        field5982 = null;
        if (!arg0) {
            field5979 = null;
        }
        field5977 = null;
        field5983 = null;
        field5979 = null;
        field5981 = null;
        field5980 = null;
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "()V")
    public class427() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(BLb;)V")
    public static final void method2510(byte arg0, class201 arg1) {
        field5975++;
        if (arg0 != 118) {
            method2509(false);
        }
        class26.field338 = arg1;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZLb;Ljava/lang/String;B)Lnr;")
    public static final class39 method2511(boolean arg0, class201 arg1, String arg2, byte arg3) {
        field5974++;
        int var4 = arg1.method1234(false, arg2);
        if (var4 == -1) {
            return new class39(0);
        }
        int[] var5 = arg1.method1232(var4, (byte) -118);
        if (arg3 != 75) {
            method2509(true);
        }
        class39 var6 = new class39(var5.length);
        int var7 = 0;
        int var8 = 0;
        while (true) {
            while (var7 < var6.field517) {
                class276 var9 = new class276(arg1.method1257(var5[var8++], var4, arg3 + 24483));
                int var10 = var9.method1688(arg3 ^ 0x4FF9);
                int var11 = var9.method1729(65280);
                int var12 = var9.method1701(-23121);
                if (!arg0 && var12 == 1) {
                    var6.field517--;
                } else {
                    var6.field513[var7] = var10;
                    var6.field515[var7] = var11;
                    var7++;
                }
            }
            return var6;
        }
    }

    static {
        new class326("Now talking in clan channel ", "Chatraum: ", "Vous participez actuellement au canal de clan ", "Falando no canal do clã agora ");
        field5979 = new int[2048];
        field5980 = new class276(new byte[5000]);
        field5981 = new class1(15, 2);
        field5983 = new long[256];
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field5983[var0] = var1;
        }
    }
}
