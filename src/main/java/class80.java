import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class80 {

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "[Lri;")
    public static class65[] field1458 = new class65[14];

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "Lqk;")
    public static class207 field1463 = class24.method212(255, " )2> ");

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1462 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "Lqk;")
    public static class207 field1464 = class24.method212(255, "_labels");

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "I")
    public static int field1459;

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "I")
    public static int field1461;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V")
    public static void method601(int arg0) {
        field1462 = null;
        field1458 = null;
        field1464 = null;
        field1463 = null;
        if (arg0 != -5231) {
            method601(-72);
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lij;Lij;I)V")
    public static final void method602(class194 arg0, class194 arg1, int arg2) {
        if (arg0.field3408 != null) {
            arg0.method1346((byte) -16);
        }
        arg0.field3410 = arg1;
        arg0.field3408 = arg1.field3408;
        if (arg2 <= 25) {
            field1462 = null;
        }
        field1459++;
        arg0.field3408.field3410 = arg0;
        arg0.field3410.field3408 = arg0;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ILpk;IZLpk;)Lml;")
    public static final class287 method603(int arg0, class99 arg1, int arg2, boolean arg3, class99 arg4) {
        field1461++;
        boolean var5 = true;
        int[] var6 = arg4.method699(arg2, (byte) -2);
        for (int var7 = arg0; var7 < var6.length; var7++) {
            byte[] var8 = arg4.method702(arg2, var6[var7], -15265);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = (var8[0] & 0xFF) << 8 | var8[1] & 0xFF;
                byte[] var10;
                if (arg3) {
                    var10 = arg1.method702(0, var9, -15265);
                } else {
                    var10 = arg1.method702(var9, 0, arg0 ^ 0xFFFFC45F);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        if (!var5) {
            return null;
        }
        try {
            return new class287(arg4, arg1, arg2, arg3);
        } catch (Exception var11) {
            return null;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZI)V")
    public static final void method604(boolean arg0, int arg1) {
        field1460++;
        byte[][] var2 = class88.field1591;
        byte var3 = 4;
        if (arg1 > -33) {
            method603(-29, (class99) null, 44, false, (class99) null);
        }
        int var4 = var2.length;
        for (int var5 = 0; var5 < var4; var5++) {
            int var11 = (class207.field3685[var5] >> 8) * 64 - class21.field349;
            int var12 = (class207.field3685[var5] & 0xFF) * 64 - class180.field3231;
            byte[] var13 = var2[var5];
            if (var13 != null) {
                class21.method129((byte) 8);
                class100.method736(arg0, var12, class89.field1602 * 8 - 48, true, (class199.field3500 - 6) * 8, var11, class133.field2303, var13);
            }
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class207.field3685[var6] >> 8) * 64 - class21.field349;
            int var8 = (class207.field3685[var6] & 0xFF) * 64 - class180.field3231;
            byte[] var9 = var2[var6];
            if (var9 == null && class199.field3500 < 800) {
                class21.method129((byte) 8);
                for (int var10 = 0; var10 < var3; var10++) {
                    class110.method789(var8, (byte) -115, var10, 64, var7, 64);
                }
            }
        }
    }
}
