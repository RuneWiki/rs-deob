import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class28 extends class235 {

    @OriginalMember(owner = "client!rf", name = "C", descriptor = "Lsb;")
    public static class98 field523 = class47.method368(" zuerst von Ihrer Freunde)2Liste(Q", 0);

    @OriginalMember(owner = "client!rf", name = "G", descriptor = "[I")
    public static int[] field527 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!rf", name = "I", descriptor = "Lwa;")
    public static class219 field529 = new class219(4096);

    @OriginalMember(owner = "client!rf", name = "K", descriptor = "Z")
    public static boolean field531 = false;

    @OriginalMember(owner = "client!rf", name = "J", descriptor = "Lsb;")
    public static class98 field530 = class47.method368(":duelfriend:", 0);

    @OriginalMember(owner = "client!rf", name = "u", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!rf", name = "v", descriptor = "I")
    public int field516;

    @OriginalMember(owner = "client!rf", name = "x", descriptor = "I")
    public int field518;

    @OriginalMember(owner = "client!rf", name = "y", descriptor = "I")
    public int field519;

    @OriginalMember(owner = "client!rf", name = "z", descriptor = "I")
    public static int field520;

    @OriginalMember(owner = "client!rf", name = "D", descriptor = "I")
    public static int field524;

    @OriginalMember(owner = "client!rf", name = "E", descriptor = "I")
    public int field525;

    @OriginalMember(owner = "client!rf", name = "H", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!rf", name = "L", descriptor = "I")
    public int field532;

    @OriginalMember(owner = "client!rf", name = "w", descriptor = "Lq;")
    public class148 field517;

    @OriginalMember(owner = "client!rf", name = "F", descriptor = "Lq;")
    public class148 field526;

    @OriginalMember(owner = "client!rf", name = "B", descriptor = "Lsb;")
    public class98 field522;

    @OriginalMember(owner = "client!rf", name = "A", descriptor = "Z")
    public boolean field521;

    @OriginalMember(owner = "client!rf", name = "t", descriptor = "[Ljava/lang/Object;")
    public Object[] field514;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V")
    public static void method270(int arg0) {
        field527 = null;
        field523 = null;
        field529 = null;
        field530 = null;
        if (arg0 != -8107) {
            method271((byte) 59, (byte[]) null);
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(B[B)[B")
    public static final byte[] method271(byte arg0, byte[] arg1) {
        field528++;
        class216 var2 = new class216(arg1);
        int var3 = var2.method1446(5350);
        int var4 = var2.method1442(-1330139880);
        if (var4 < 0 || !(class92.field1619 == 0 || var4 <= class92.field1619)) {
            throw new RuntimeException();
        }
        int var5 = 96 / ((arg0 - 17) / 43);
        if (var3 == 0) {
            byte[] var6 = new byte[var4];
            var2.method1481(var4, var6, 0, 255);
            return var6;
        }
        int var7 = var2.method1442(-1330139880);
        if (var7 < 0 || class92.field1619 != 0 && var7 > class92.field1619) {
            throw new RuntimeException();
        }
        byte[] var8 = new byte[var7];
        if (var3 == 1) {
            class123.method916(var8, var7, arg1, var4, 9);
        } else {
            class244.field4225.method1615(var2, (byte) -87, var8);
        }
        return var8;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(ZZ)V")
    public static final void method272(boolean arg0, boolean arg1) {
        field520++;
        byte var2 = 4;
        byte[][] var3 = class75.field1329;
        if (arg1) {
            field530 = null;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            class115.method867(53);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class156.field2847[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = (var7 & 0x3D3F993) >> 24;
                        if (!arg0 || var8 == 0) {
                            int var9 = var7 >> 1 & 0x3;
                            int var10 = (var7 & 0x3FFD) >> 3;
                            int var11 = (var7 & 0xFFEE06) >> 14;
                            int var12 = (var11 / 8 << 8) + var10 / 8;
                            for (int var13 = 0; var13 < class49.field812.length; var13++) {
                                if (class49.field812[var13] == var12 && var3[var13] != null) {
                                    class236.method1614(22721, arg0, var4, var9, var6 * 8, class110.field1961, var3[var13], (var11 & 0x7) * 8, var8, var5 * 8, (var10 & 0x7) * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
