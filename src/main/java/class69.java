import java.awt.Font;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class69 {

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "[I")
    private int[] field1290;

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "Lvd;")
    public static class222 field1297 = class212.method1357("<col=ffb000>", 10731);

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "[S")
    public static short[] field1287 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "Lvd;")
    public static class222 field1298 = class212.method1357("<col=c0ff00>", 10731);

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "Lvd;")
    private static class222 field1289 = class212.method1357("You have only just left another world)3", 10731);

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "I")
    public static int field1299 = 0;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "Lvd;")
    public static class222 field1292 = field1289;

    @OriginalMember(owner = "client!gd", name = "q", descriptor = "[Lvd;")
    public static class222[] field1303 = new class222[1000];

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
    public static int field1288;

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "I")
    public static int field1291;

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "I")
    public static int field1293;

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "I")
    public static int field1294;

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "I")
    public static int field1295;

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "I")
    public static int field1302;

    @OriginalMember(owner = "client!gd", name = "r", descriptor = "I")
    public static int field1304;

    @OriginalMember(owner = "client!gd", name = "s", descriptor = "I")
    public static int field1305;

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "Ljava/awt/Font;")
    public static Font field1301;

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "[[[B")
    public static byte[][][] field1296;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(BLka;)V")
    public static final void method467(byte arg0, class109 arg1) {
        field1295++;
        if (arg0 != -23) {
            field1301 = null;
        }
        byte[] var2 = new byte[24];
        if (class70.field1312 != null) {
            try {
                class70.field1312.method1501((byte) -118, 0L);
                class70.field1312.method1500((byte) 8, var2);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg1.method689(false, 0, var2, 24);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I[SII[Lvd;)V")
    public static final void method468(int arg0, short[] arg1, int arg2, int arg3, class222[] arg4) {
        if (arg3 > arg0) {
            int var5 = (arg0 + arg3) / 2;
            int var6 = arg0;
            class222 var7 = arg4[var5];
            arg4[var5] = arg4[arg3];
            arg4[arg3] = var7;
            short var8 = arg1[var5];
            arg1[var5] = arg1[arg3];
            arg1[arg3] = var8;
            for (int var9 = arg0; var9 < arg3; var9++) {
                if (var7 == null || arg4[var9] != null && arg4[var9].method1420((byte) -38, var7) < (var9 & 0x1)) {
                    class222 var10 = arg4[var9];
                    arg4[var9] = arg4[var6];
                    arg4[var6] = var10;
                    short var11 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6++] = var11;
                }
            }
            arg4[arg3] = arg4[var6];
            arg4[var6] = var7;
            arg1[arg3] = arg1[var6];
            arg1[var6] = var8;
            method468(arg0, arg1, 0, var6 - 1, arg4);
            method468(var6 + 1, arg1, 0, arg3, arg4);
        }
        field1305++;
        if (arg2 != 0) {
            field1301 = null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILba;)Z")
    public static final boolean method469(int arg0, class13 arg1) {
        if (arg0 != 250) {
            field1292 = null;
        }
        field1300++;
        if (arg1.field348 == 205) {
            class28.field629 = 250;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "([I)V")
    public class69(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field1290 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field1290[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field1290[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field1290[var5 + var5] = arg0[var4];
            this.field1290[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IZ)I")
    public final int method470(int arg0, boolean arg1) {
        field1294++;
        int var3 = (this.field1290.length >> 1) - 1;
        if (arg1) {
            return -38;
        }
        int var4 = arg0 & var3;
        while (true) {
            int var5 = this.field1290[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field1290[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(JBZI)Lvd;")
    public static final class222 method471(long arg0, byte arg1, boolean arg2, int arg3) {
        field1291++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
        int var5 = 1;
        long var6 = arg0 / (long) arg3;
        while (var6 != 0L) {
            var6 /= arg3;
            var5++;
        }
        if (arg1 != -110) {
            field1301 = null;
        }
        int var8 = var5;
        if (arg0 < 0L || arg2) {
            var8 = var5 + 1;
        }
        byte[] var9 = new byte[var8];
        if (arg0 < 0L) {
            var9[0] = 45;
        } else if (arg2) {
            var9[0] = 43;
        }
        for (int var10 = 0; var10 < var5; var10++) {
            int var12 = (int) (arg0 % (long) arg3);
            arg0 /= arg3;
            if (var12 < 0) {
                var12 = -var12;
            }
            if (var12 > 9) {
                var12 += 39;
            }
            var9[var8 - var10 - 1] = (byte) (var12 + 48);
        }
        class222 var11 = new class222();
        var11.field4163 = var9;
        var11.field4121 = var8;
        return var11;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V")
    public static void method472(byte arg0) {
        field1296 = null;
        field1292 = null;
        field1297 = null;
        field1298 = null;
        field1289 = null;
        field1303 = null;
        field1287 = null;
        field1301 = null;
        if (arg0 < 95) {
            method471(-102L, (byte) -17, false, 123);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)Z")
    public static final boolean method473(int arg0) {
        if (arg0 != 3204) {
            return true;
        }
        field1304++;
        try {
            if (class59.field1099 == 2) {
                if (class10.field189 == null) {
                    class10.field189 = class154.method987(class40.field884, class174.field3277, class87.field1652);
                    if (class10.field189 == null) {
                        return false;
                    }
                }
                if (class134.field2589 == null) {
                    class134.field2589 = new class179(class186.field3445, class168.field3203);
                }
                if (class18.field435.method1048(class10.field189, class32.field676, -1, 22050, class134.field2589)) {
                    class18.field435.method1034(-388);
                    class18.field435.method1065(class174.field3270, (byte) -82);
                    class18.field435.method1047(true, class108.field1995, class10.field189);
                    class59.field1099 = 0;
                    class40.field884 = null;
                    class10.field189 = null;
                    class134.field2589 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class18.field435.method1043((byte) -89);
            class40.field884 = null;
            class59.field1099 = 0;
            class10.field189 = null;
            class134.field2589 = null;
        }
        return false;
    }
}
