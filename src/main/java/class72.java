import java.awt.Frame;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class72 extends class80 {

    @OriginalMember(owner = "client!kk", name = "J", descriptor = "[I")
    public int[] field1221 = new int[5];

    @OriginalMember(owner = "client!kk", name = "O", descriptor = "I")
    public int field1226 = 0;

    @OriginalMember(owner = "client!kk", name = "E", descriptor = "[Lki;")
    public class152[] field1216 = new class152[5];

    @OriginalMember(owner = "client!kk", name = "G", descriptor = "I")
    public int field1218;

    @OriginalMember(owner = "client!kk", name = "D", descriptor = "I")
    public int field1215;

    @OriginalMember(owner = "client!kk", name = "P", descriptor = "I")
    public int field1227;

    @OriginalMember(owner = "client!kk", name = "L", descriptor = "I")
    public int field1223;

    @OriginalMember(owner = "client!kk", name = "m", descriptor = "Lph;")
    public static class229 field1198 = class266.method1858("null", 0);

    @OriginalMember(owner = "client!kk", name = "r", descriptor = "[I")
    public static int[] field1203 = new int[256];

    @OriginalMember(owner = "client!kk", name = "U", descriptor = "[Lhb;")
    public static class164[] field1232;

    @OriginalMember(owner = "client!kk", name = "W", descriptor = "Lph;")
    public static class229 field1234;

    @OriginalMember(owner = "client!kk", name = "X", descriptor = "Lph;")
    public static class229 field1235;

    @OriginalMember(owner = "client!kk", name = "S", descriptor = "Lph;")
    private static class229 field1230;

    @OriginalMember(owner = "client!kk", name = "Q", descriptor = "Lph;")
    public static class229 field1228;

    @OriginalMember(owner = "client!kk", name = "ab", descriptor = "Lph;")
    private static class229 field1238;

    @OriginalMember(owner = "client!kk", name = "T", descriptor = "I")
    public static int field1231;

    @OriginalMember(owner = "client!kk", name = "Z", descriptor = "Lph;")
    public static class229 field1237;

    @OriginalMember(owner = "client!kk", name = "v", descriptor = "B")
    public byte field1207;

    @OriginalMember(owner = "client!kk", name = "l", descriptor = "I")
    public static int field1197;

    @OriginalMember(owner = "client!kk", name = "n", descriptor = "I")
    public static int field1199;

    @OriginalMember(owner = "client!kk", name = "o", descriptor = "I")
    public static int field1200;

    @OriginalMember(owner = "client!kk", name = "p", descriptor = "I")
    public static int field1201;

    @OriginalMember(owner = "client!kk", name = "q", descriptor = "I")
    public static int field1202;

    @OriginalMember(owner = "client!kk", name = "s", descriptor = "I")
    public static int field1204;

    @OriginalMember(owner = "client!kk", name = "t", descriptor = "I")
    public static int field1205;

    @OriginalMember(owner = "client!kk", name = "u", descriptor = "I")
    public static int field1206;

    @OriginalMember(owner = "client!kk", name = "w", descriptor = "I")
    public int field1208;

    @OriginalMember(owner = "client!kk", name = "y", descriptor = "I")
    public int field1210;

    @OriginalMember(owner = "client!kk", name = "z", descriptor = "I")
    public int field1211;

    @OriginalMember(owner = "client!kk", name = "B", descriptor = "I")
    public int field1213;

    @OriginalMember(owner = "client!kk", name = "Y", descriptor = "I")
    public int field1236;

    @OriginalMember(owner = "client!kk", name = "I", descriptor = "Lkc;")
    public class101 field1220;

    @OriginalMember(owner = "client!kk", name = "R", descriptor = "Ld;")
    public class158 field1229;

    @OriginalMember(owner = "client!kk", name = "N", descriptor = "Lmj;")
    public class162 field1225;

    @OriginalMember(owner = "client!kk", name = "M", descriptor = "Lwk;")
    public class207 field1224;

    @OriginalMember(owner = "client!kk", name = "x", descriptor = "Lkk;")
    public class72 field1209;

    @OriginalMember(owner = "client!kk", name = "V", descriptor = "Lih;")
    public class78 field1233;

    @OriginalMember(owner = "client!kk", name = "C", descriptor = "Lne;")
    public class88 field1214;

    @OriginalMember(owner = "client!kk", name = "A", descriptor = "Lfm;")
    public class98 field1212;

    @OriginalMember(owner = "client!kk", name = "F", descriptor = "Z")
    public boolean field1217;

    @OriginalMember(owner = "client!kk", name = "H", descriptor = "Z")
    public boolean field1219;

    @OriginalMember(owner = "client!kk", name = "K", descriptor = "Z")
    public boolean field1222;

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "(I)V", line = 6)
    public static void method560(int arg0) {
        field1232 = null;
        field1238 = null;
        field1228 = null;
        field1234 = null;
        field1198 = null;
        field1235 = null;
        field1203 = null;
        field1237 = null;
        field1230 = null;
        if (arg0 != 17548) {
            method562((class229) null, (byte) -8);
        }
    }

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "(I)I", line = 43)
    public static final int method561(int arg0) {
        field1206++;
        if (arg0 != 28770) {
            method561(107);
        }
        return class281.field4656 == 0 ? 0 : class282.field4678[class281.field4656].method83();
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lph;B)I", line = 61)
    public static final int method562(class229 arg0, byte arg1) {
        field1202++;
        if (arg1 >= -116) {
            method566((byte) 116, (class92) null, -6, 121, 112, 21);
        }
        for (int var2 = 0; var2 < class39.field630.length; var2++) {
            if (class39.field630[var2].method1630(10, arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ZI)V", line = 89)
    public static final void method563(boolean arg0, int arg1) {
        if (arg0) {
            class281 var2 = class135.method957(0, arg1, 5);
            var2.method1933(0);
            field1200++;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(I[B)Lmf;", line = 102)
    public static final class31 method564(int arg0, byte[] arg1) {
        field1197++;
        if (arg1 == null) {
            return null;
        }
        class31 var2;
        if (class99.field1675) {
            var2 = new class90(arg1, class303.field5064, class27.field387, class36.field597, class288.field4729, class279.field4623);
        } else {
            var2 = new class81(arg1, class303.field5064, class27.field387, class36.field597, class288.field4729, class279.field4623);
        }
        if (arg0 > -72) {
            method563(true, -57);
        }
        class214.method1517(-25672);
        return var2;
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(III)V", line = 121)
    public class72(int arg0, int arg1, int arg2) {
        this.field1215 = this.field1218 = arg0;
        this.field1227 = arg1;
        this.field1223 = arg2;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field1203[var0] = var1;
        }
        field1232 = new class164[2048];
        field1234 = class266.method1858("Lade Sprites )2 ", 0);
        field1235 = class266.method1858("Fps:", 0);
        field1230 = class266.method1858(" has logged in)3", 0);
        field1228 = field1230;
        field1238 = class266.method1858("Loading)3)3)3", 0);
        field1231 = 0;
        field1237 = field1238;
    }

    @OriginalMember(owner = "client!kk", name = "g", descriptor = "(I)V", line = 144)
    public static final void method565(int arg0) {
        field1205++;
        try {
            Method var1 = Runtime.class.getMethod("maxMemory");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                    class241.field3982 = (int) (var3 / 1048576L) + 1;
                } catch (Throwable var6) {
                }
            }
            if (arg0 != -20913) {
                field1238 = (class229) null;
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(BLwe;IIII)Ljava/awt/Frame;", line = 172)
    public static final Frame method566(byte arg0, class92 arg1, int arg2, int arg3, int arg4, int arg5) {
        field1204++;
        if (!arg1.method694(107)) {
            return null;
        }
        if (arg4 == 0) {
            class77[] var6 = class294.method1998(arg1, true);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field1290 == arg2 && var6[var8].field1291 == arg3 && (arg5 == 0 || var6[var8].field1288 == arg5) && (!var7 || arg4 < var6[var8].field1284)) {
                    arg4 = var6[var8].field1284;
                    var7 = true;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class247 var9 = arg1.method679(arg2, -174, arg5, arg4, arg3);
        while (var9.field4125 == 0) {
            class288.method1976((byte) 63, 10L);
        }
        Frame var10 = (Frame) var9.field4123;
        int var11 = -40 / ((arg0 + 35) / 41);
        if (var10 == null) {
            return null;
        } else if (var9.field4125 == 2) {
            class266.method1861(var10, (byte) 86, arg1);
            return null;
        } else {
            return var10;
        }
    }
}
