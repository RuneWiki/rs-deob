import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class151 {

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "I")
    public static int field1970 = 0;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
    public static int field1971 = 0;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "Z")
    public static boolean field1974 = false;

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "Ljc;")
    public static class305 field1975 = new class305(" more options", " weitere Optionen", " autres options", " mais opções");

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
    public static int field1973;

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "I")
    public static int field1976;

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "I")
    public static int field1978;

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "I")
    public int field1980;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "Ljava/lang/String;")
    public String field1972;

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "[Z")
    public static boolean[] field1979;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
    public static void method903(int arg0) {
        if (arg0 > 88) {
            field1979 = null;
            field1975 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(B[Lpi;Lur;)Luq;")
    public static final class113 method904(byte arg0, class346[] arg1, class377 arg2) {
        field1973++;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (arg1[var3] == null || arg1[var3].field4612 <= 0L) {
                return null;
            }
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        if (arg0 < 21) {
            field1974 = false;
        }
        for (int var6 = 0; var6 < arg1.length; var6++) {
            OpenGL.glAttachObjectARB(var4, arg1[var6].field4612);
        }
        OpenGL.glLinkProgramARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35714, class511.field7443, 0);
        if (class511.field7443[0] == 0) {
            if (class511.field7443[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class511.field7443, 1);
            if (class511.field7443[1] > 1) {
                byte[] var7 = new byte[class511.field7443[1]];
                OpenGL.glGetInfoLogARB(var4, class511.field7443[1], class511.field7443, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (class511.field7443[0] == 0) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    OpenGL.glDetachObjectARB(var4, arg1[var8].field4612);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class113(arg2, var4, arg1);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(III)Z")
    public static final boolean method905(int arg0, int arg1, int arg2) {
        if (arg2 == 32210) {
            field1978++;
            return (arg1 & 0x18) != 0 | (arg1 & 0x220) == 544;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZLjava/lang/String;II)Z")
    public static final boolean method906(boolean arg0, String arg1, int arg2, int arg3) {
        field1976++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg1.length();
        if (arg2 != 29853) {
            method903(-107);
        }
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg1.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg0) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                return false;
            }
            if (var11 >= arg3) {
                return false;
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg3 * var6 + var11;
            if (var10 / arg3 != var6) {
                return false;
            }
            var6 = var10;
            var5 = true;
        }
        return var5;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIIIZZ)V")
    public static final void method907(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        class351.field4688 = arg0;
        class166.field2152 = 0x1 << class351.field4688;
        class123.field1595 = class166.field2152 >> 1;
        class135.field1794 = (int) Math.sqrt((double) (class123.field1595 * class123.field1595 + class123.field1595 * class123.field1595));
        class466.field6934 = class166.field2152 >> 2;
        class270.field3605 = class166.field2152;
        class515.field7487 = arg2;
        class114.field1494 = arg3;
        class349.field4645 = arg4;
        class484.field7131 = new class498[arg1][class515.field7487][class114.field1494];
        class14.field152 = new class38[arg1];
        if (arg5) {
            class516.field7502 = new int[class515.field7487][class114.field1494];
            class215.field2939 = new byte[class515.field7487][class114.field1494];
            class117.field1534 = new short[class515.field7487][class114.field1494];
            class95.field1140 = new class498[1][class515.field7487][class114.field1494];
            class378.field5470 = new class38[1];
        } else {
            class516.field7502 = null;
            class215.field2939 = null;
            class117.field1534 = null;
            class95.field1140 = null;
            class378.field5470 = null;
        }
        if (arg6) {
            class35.field354 = new long[arg1][arg2][arg3];
            class124.field1608 = new class340[65535];
            field1979 = new boolean[65535];
            class73.field925 = 0;
        } else {
            class35.field354 = null;
            class124.field1608 = null;
            field1979 = null;
            class73.field925 = 0;
        }
        class530.method3141(false);
        class508.field7354 = new class250[1000];
        class421.field6116 = 0;
        class281.field3724 = new class250[1000];
        class291.field3837 = 0;
        class505.field7340 = new int[arg1][class515.field7487 + 1][class114.field1494 + 1];
        class447.field6523 = new class279[5000];
        class428.field6219 = 0;
        class487.field7157 = new boolean[class349.field4645 + class349.field4645 + 1][class349.field4645 + class349.field4645 + 1];
        class32.field327 = new boolean[class349.field4645 + class349.field4645 + 2][class349.field4645 + class349.field4645 + 2];
        class429.field6242 = null;
    }
}
