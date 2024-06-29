import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public class class474 {

    @OriginalMember(owner = "client!vs", name = "c", descriptor = "I")
    public int field6943 = -1;

    @OriginalMember(owner = "client!vs", name = "h", descriptor = "I")
    public int field6948 = -1;

    @OriginalMember(owner = "client!vs", name = "e", descriptor = "Lmo;")
    public static class271 field6945 = new class271(8, 7);

    @OriginalMember(owner = "client!vs", name = "k", descriptor = "[I")
    public static int[] field6951 = new int[2];

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "I")
    public static int field6941;

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "I")
    public static int field6942;

    @OriginalMember(owner = "client!vs", name = "d", descriptor = "I")
    public static int field6944;

    @OriginalMember(owner = "client!vs", name = "f", descriptor = "I")
    public static int field6946;

    @OriginalMember(owner = "client!vs", name = "g", descriptor = "I")
    public static int field6947;

    @OriginalMember(owner = "client!vs", name = "j", descriptor = "I")
    public static int field6950;

    @OriginalMember(owner = "client!vs", name = "i", descriptor = "[I")
    public int[] field6949;

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(I)V", line = 3)
    public static final void method2869(int arg0) {
        field6946++;
        if (class164.field2482) {
            return;
        }
        class356.method2271((byte) -4, class470.field6902);
        if (arg0 != 31681) {
            method2870((byte) 12);
        }
        if (class360.field5317 != null) {
            class356.method2271((byte) -4, class360.field5317);
        }
        class164.field2482 = true;
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(B)V", line = 27)
    public static void method2870(byte arg0) {
        field6945 = null;
        if (arg0 < -68) {
            field6951 = null;
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(ILfh;)V", line = 39)
    public final void method2871(int arg0, class194 arg1) {
        field6941++;
        if (arg0 != 4713) {
            return;
        }
        while (true) {
            int var3 = arg1.method1337((byte) -120);
            if (var3 == 0) {
                return;
            }
            this.method2872(var3, (byte) -127, arg1);
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(IBLfh;)V", line = 60)
    private final void method2872(int arg0, byte arg1, class194 arg2) {
        field6944++;
        if (arg1 >= -27) {
            this.method2871(43, null);
        }
        if (arg0 == 1) {
            this.field6948 = arg2.method1396(92);
        } else if (arg0 == 2) {
            this.field6949 = new int[arg2.method1337((byte) -120)];
            for (int var4 = 0; var4 < this.field6949.length; var4++) {
                this.field6949[var4] = arg2.method1396(-109);
            }
        } else if (arg0 == 3) {
            this.field6943 = arg2.method1337((byte) -116);
            return;
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(Luu;Z)V", line = 95)
    public static final void method2873(class428 arg0, boolean arg1) {
        field6942++;
        arg0.method2666(92);
        int var2 = class517.field7513;
        class511 var3 = class116.field1781 = class530.field7747[var2] = new class511();
        var3.field7562 = var2;
        int var4 = arg0.method2671(-114, 30);
        byte var5 = (byte) (var4 >> 28);
        int var6 = var4 >> 14 & 0x3FFF;
        if (arg1) {
            return;
        }
        var3.field7654[0] = var6 - class422.field6201;
        int var7 = var4 & 0x3FFF;
        var3.field1275 = (var3.field7654[0] << 7) + (var3.method3045(0) << 6);
        var3.field7653[0] = var7 - class23.field273;
        var3.field1279 = (var3.field7653[0] << 7) + (var3.method3045(0) << 6);
        class30.field370 = var3.field1274 = var5;
        if (class447.field6645[var2] != null) {
            var3.method3040(class447.field6645[var2], true);
        }
        class422.field6205 = 0;
        class506.field7363[class422.field6205++] = var2;
        class441.field6560[var2] = 0;
        class110.field1648 = 0;
        for (int var8 = 1; var8 < 2048; var8++) {
            if (var2 != var8) {
                int var9 = arg0.method2671(-123, 18);
                int var10 = var9 >> 16;
                int var11 = (var9 & 0xFF6B) >> 8;
                int var12 = var9 & 0xFF;
                class463 var13 = class434.field6453[var8] = new class463();
                var13.field6862 = (var10 << 28) + (var11 << 14) + var12;
                var13.field6853 = -1;
                var13.field6856 = false;
                var13.field6855 = 0;
                class221.field3321[class110.field1648++] = var8;
                class441.field6560[var8] = 0;
            }
        }
        arg0.method2673((byte) 112);
    }
}
