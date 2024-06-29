import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cda")
public class class390 {

    @OriginalMember(owner = "client!cda", name = "f", descriptor = "S")
    public short field5411;

    @OriginalMember(owner = "client!cda", name = "c", descriptor = "I")
    public int field5408;

    @OriginalMember(owner = "client!cda", name = "e", descriptor = "S")
    public short field5410;

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "Z")
    public boolean field5406;

    @OriginalMember(owner = "client!cda", name = "b", descriptor = "B")
    public byte field5407;

    @OriginalMember(owner = "client!cda", name = "i", descriptor = "S")
    public short field5414;

    @OriginalMember(owner = "client!cda", name = "k", descriptor = "B")
    public byte field5416;

    @OriginalMember(owner = "client!cda", name = "d", descriptor = "Lim;")
    public static class353 field5409 = new class353(65, -2);

    @OriginalMember(owner = "client!cda", name = "g", descriptor = "I")
    public static int field5412;

    @OriginalMember(owner = "client!cda", name = "h", descriptor = "I")
    public static int field5413;

    @OriginalMember(owner = "client!cda", name = "j", descriptor = "I")
    public static int field5415;

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(I)V")
    public static void method2350(int arg0) {
        if (arg0 != -129) {
            method2352(-3, -85, null, 47);
        }
        field5409 = null;
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(BIIII)Lcda;")
    public final class390 method2351(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 > -93) {
            method2350(-98);
        }
        field5412++;
        return new class390(arg3, arg1, arg2, arg4, this.field5410, this.field5411, this.field5414, this.field5416, this.field5407, this.field5406);
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(II[BI)Ljava/lang/String;")
    public static final String method2352(int arg0, int arg1, byte[] arg2, int arg3) {
        field5415++;
        char[] var4 = new char[arg1];
        if (arg3 != 65) {
            return null;
        }
        int var5 = 0;
        int var6 = arg0 + arg1;
        for (int var7 = arg0; var7 < var6; var7++) {
            int var8 = arg2[var7] & 0xFF;
            if (var8 < 128) {
                var4[var5++] = (char) var8;
            } else if (var8 < 194) {
                throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + var8);
            } else if (var8 < 224) {
                if (var6 <= (var7 + 1)) {
                    throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
                }
                var7++;
                int var9 = arg2[var7] & 0xFF;
                if (var9 < 128 || var9 > 191) {
                    throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
                }
                var4[var5++] = (char) class292.method1790(class143.method783(var8 << 6, -12352), class143.method783(-129, var9));
            } else if (var8 < 240) {
                if (var6 <= var7 + 2) {
                    throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
                }
                var7++;
                int var10 = arg2[var7] & 0xFF;
                if (var10 < 128 || var10 > 191) {
                    throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
                }
                var7++;
                int var11 = arg2[var7] & 0xFF;
                if (var11 < 128 || var11 > 191) {
                    throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
                }
                var4[var5++] = (char) class292.method1790(class143.method783(var11, -129), class292.method1790(class143.method783(-225, var8) << 12, class143.method783(var10 << 6, -8256)));
            } else if (var8 < 244) {
                throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
            } else {
                throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + var8);
            }
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(BIIIIII)V")
    public static final void method2353(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 < 28) {
            method2353((byte) -11, 44, -91, -116, 4, 39, 3);
        }
        field5413++;
        int var7 = class69.method398((byte) 44, arg5, class113.field1453, class535.field7467);
        int var8 = class69.method398((byte) -126, arg1, class113.field1453, class535.field7467);
        int var9 = class69.method398((byte) -112, arg2, class355.field4972, class594.field8575);
        int var10 = class69.method398((byte) -111, arg4, class355.field4972, class594.field8575);
        int var11 = class69.method398((byte) -116, arg3 + arg5, class113.field1453, class535.field7467);
        int var12 = class69.method398((byte) 68, arg1 - arg3, class113.field1453, class535.field7467);
        for (int var13 = var7; var13 < var11; var13++) {
            class373.method2275((byte) -9, var10, arg6, var9, class256.field3173[var13]);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class373.method2275((byte) -9, var10, arg6, var9, class256.field3173[var14]);
        }
        int var15 = class69.method398((byte) -121, arg2 + arg3, class355.field4972, class594.field8575);
        int var16 = class69.method398((byte) -17, arg4 - arg3, class355.field4972, class594.field8575);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class256.field3173[var17];
            class373.method2275((byte) -9, var15, arg6, var9, var18);
            class373.method2275((byte) -9, var10, arg6, var16, var18);
        }
    }

    @OriginalMember(owner = "client!cda", name = "<init>", descriptor = "(IIIIIIIIIZ)V")
    public class390(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        this.field5411 = (short) arg5;
        this.field5408 = arg0;
        this.field5410 = (short) arg4;
        this.field5406 = arg9;
        this.field5407 = (byte) arg8;
        this.field5414 = (short) arg6;
        this.field5416 = (byte) arg7;
    }
}
