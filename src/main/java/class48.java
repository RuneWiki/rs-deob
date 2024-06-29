import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class48 {

    @OriginalMember(owner = "client!m", name = "d", descriptor = "Lud;")
    public static class279 field973 = class130.method1024("Chargement en cours)3)3)3", 255);

    @OriginalMember(owner = "client!m", name = "c", descriptor = "[I")
    public static int[] field972 = new int[25];

    @OriginalMember(owner = "client!m", name = "h", descriptor = "[I")
    public static int[] field977 = new int[100];

    @OriginalMember(owner = "client!m", name = "g", descriptor = "Lud;")
    public static class279 field976 = class130.method1024("Mem:", 255);

    @OriginalMember(owner = "client!m", name = "a", descriptor = "I")
    public static int field970;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "I")
    public static int field971;

    @OriginalMember(owner = "client!m", name = "f", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!m", name = "e", descriptor = "Z")
    public static boolean field974;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIZZI)V", line = 6)
    public static final void method392(int arg0, int arg1, boolean arg2, boolean arg3, int arg4) {
        class250.method1790(arg3, arg4, class58.field1233.length - 1, arg1, arg2, 0, arg0 ^ arg0);
        field975++;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(II)Lb;", line = 28)
    public static final class60 method393(int arg0, int arg1) {
        field970++;
        class60 var2 = (class60) class282.field5034.method1336((long) arg0, 0);
        if (arg1 < 83) {
            return (class60) null;
        } else if (var2 == null) {
            byte[] var3 = class177.field3171.method1192(0, 16, arg0);
            class60 var4 = new class60();
            if (var3 != null) {
                var4.method536(new class53(var3), (byte) 125);
            }
            class282.field5034.method1331(var4, 30237, (long) arg0);
            return var4;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V", line = 64)
    public static void method394(int arg0) {
        if (arg0 != 255) {
            method393(122, 126);
        }
        field976 = null;
        field972 = null;
        field977 = null;
        field973 = null;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Lok;I)V", line = 86)
    public static final void method395(class149 arg0, int arg1) {
        field971++;
        class78.field1502 = class21.method198((byte) 115, arg0, class217.field3844);
        class178.field3239 = new int[256];
        if (arg1 != -13551) {
            field977 = (int[]) null;
        }
        for (int var2 = 0; var2 < 3; var2++) {
            float var3 = (float) (class58.field1225[var2] >> 16 & 0xFF);
            int var4 = class58.field1225[var2 + 1] >> 16 & 0xFF;
            float var5 = ((float) var4 - var3) / 64.0F;
            float var6 = (float) ((class58.field1225[var2] & 0xFF00) >> 8);
            int var7 = (class58.field1225[var2 + 1] & 0xFF00) >> 8;
            float var8 = ((float) var7 - var6) / 64.0F;
            float var9 = (float) (class58.field1225[var2] & 0xFF);
            int var10 = class58.field1225[var2 + 1] & 0xFF;
            float var11 = ((float) var10 - var9) / 64.0F;
            for (int var12 = 0; var12 < 64; var12++) {
                class178.field3239[var2 * 64 + var12] = class301.method2139((int) var9, class301.method2139((int) var3 << 16, (int) var6 << 8));
                var6 += var8;
                var3 += var5;
                var9 += var11;
            }
        }
        for (int var13 = 192; var13 < 255; var13++) {
            class178.field3239[var13] = class58.field1225[3];
        }
        class26.field625 = new int[32768];
        class134.field2448 = new int[32768];
        class246.method1763((class158) null, (byte) -42);
        class59.field1238 = new int[32768];
        class85.field1606 = new int[32768];
        class83.field1584 = new class66(128, 254);
    }
}
