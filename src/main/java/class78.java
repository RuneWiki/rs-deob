import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class78 extends class91 {

    @OriginalMember(owner = "client!ph", name = "p", descriptor = "Ljava/lang/String;")
    public static String field1247 = "Attack";

    @OriginalMember(owner = "client!ph", name = "w", descriptor = "Z")
    public static boolean field1254 = true;

    @OriginalMember(owner = "client!ph", name = "n", descriptor = "Ljava/lang/String;")
    public static String field1245 = " more options";

    @OriginalMember(owner = "client!ph", name = "A", descriptor = "I")
    public static int field1258 = -1;

    @OriginalMember(owner = "client!ph", name = "q", descriptor = "[Ljava/lang/String;")
    public static String[] field1248 = new String[1000];

    @OriginalMember(owner = "client!ph", name = "C", descriptor = "I")
    public static int field1260 = 0;

    @OriginalMember(owner = "client!ph", name = "y", descriptor = "Ljava/lang/String;")
    public static String field1256 = "Loading textures - ";

    @OriginalMember(owner = "client!ph", name = "o", descriptor = "I")
    public static int field1246 = 0;

    @OriginalMember(owner = "client!ph", name = "r", descriptor = "I")
    public int field1249;

    @OriginalMember(owner = "client!ph", name = "t", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!ph", name = "v", descriptor = "I")
    public static int field1253;

    @OriginalMember(owner = "client!ph", name = "x", descriptor = "I")
    public static int field1255;

    @OriginalMember(owner = "client!ph", name = "z", descriptor = "I")
    public static int field1257;

    @OriginalMember(owner = "client!ph", name = "B", descriptor = "I")
    public static int field1259;

    @OriginalMember(owner = "client!ph", name = "u", descriptor = "Lqh;")
    public static class201 field1252;

    @OriginalMember(owner = "client!ph", name = "s", descriptor = "Ljava/lang/String;")
    public String field1250;

    @OriginalMember(owner = "client!ph", name = "D", descriptor = "Ljava/lang/String;")
    public String field1261;

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "(I)V")
    public static void method544(int arg0) {
        field1256 = null;
        field1245 = null;
        field1248 = null;
        field1252 = null;
        field1247 = null;
        if (arg0 >= -119) {
            field1258 = 115;
        }
    }

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "(I)Lha;")
    public final class30 method545(int arg0) {
        if (arg0 != -2648) {
            return null;
        } else {
            ++field1251;
            return class219.field3585[super.field1503];
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "([S[Ljava/lang/String;B)V")
    public static final void method546(short[] arg0, String[] arg1, byte arg2) {
        if (arg2 < 49) {
            field1245 = null;
        }
        class194.method1325(arg1, arg0, arg1.length + -1, 0, 51);
        ++field1257;
    }

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "(I)V")
    public static final void method547(int arg0) {
        if (class212.field3455 == null || class84.field1319 == null) {
            class84.field1319 = new int[256];
            class212.field3455 = new int[256];
            for (int var1 = 0; ~var1 > -257; ++var1) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class212.field3455[var1] = (int) (Math.sin(var2) * 4096.0D);
                class84.field1319[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        ++field1255;
        if (arg0 != 14764) {
            method544(-95);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "([BZ)[B")
    public static final byte[] method548(byte[] arg0, boolean arg1) {
        if (arg1) {
            return null;
        } else {
            ++field1259;
            class221 var2 = new class221(arg0);
            int var3 = var2.method1517((byte) -96);
            int var4 = var2.method1526(-16777216);
            if (~var4 > -1 || class169.field2682 != 0 && var4 > class169.field2682) {
                throw new RuntimeException();
            } else if (~var3 == -1) {
                byte[] var5 = new byte[var4];
                var2.method1555(18379, var4, 0, var5);
                return var5;
            } else {
                int var6 = var2.method1526(-16777216);
                if (~var6 <= -1 && (class169.field2682 == 0 || class169.field2682 >= var6)) {
                    byte[] var7 = new byte[var6];
                    if (~var3 == -2) {
                        class283.method1905(var7, var6, arg0, var4, 9);
                    } else {
                        class94.field1545.method1062(var2, -7494, var7);
                    }
                    return var7;
                } else {
                    throw new RuntimeException();
                }
            }
        }
    }
}
