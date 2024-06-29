import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class201 extends class115 {

    @OriginalMember(owner = "client!kj", name = "n", descriptor = "Z")
    public boolean field2928;

    @OriginalMember(owner = "client!kj", name = "o", descriptor = "I")
    public int field2929;

    @OriginalMember(owner = "client!kj", name = "s", descriptor = "I")
    public int field2933;

    @OriginalMember(owner = "client!kj", name = "t", descriptor = "I")
    public int field2934;

    @OriginalMember(owner = "client!kj", name = "q", descriptor = "I")
    public int field2931;

    @OriginalMember(owner = "client!kj", name = "m", descriptor = "I")
    public int field2927;

    @OriginalMember(owner = "client!kj", name = "p", descriptor = "I")
    public static int field2930 = -1;

    @OriginalMember(owner = "client!kj", name = "r", descriptor = "[I")
    public static int[] field2932 = new int[500];

    @OriginalMember(owner = "client!kj", name = "i", descriptor = "I")
    public static int field2923;

    @OriginalMember(owner = "client!kj", name = "j", descriptor = "I")
    public static int field2924;

    @OriginalMember(owner = "client!kj", name = "k", descriptor = "I")
    public static int field2925;

    @OriginalMember(owner = "client!kj", name = "l", descriptor = "I")
    public static int field2926;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "([BI)[B", line = 4)
    public static final byte[] method1327(byte[] arg0, int arg1) {
        field2923++;
        if (arg1 <= 63) {
            field2932 = null;
        }
        class468 var2 = new class468(arg0);
        int var3 = var2.method2765(119);
        int var4 = var2.method2722(false);
        if (var4 < 0 || class83.field1306 != 0 && class83.field1306 < var4) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var7 = new byte[var4];
            var2.method2716(0, 82, var7, var4);
            return var7;
        } else {
            int var5 = var2.method2722(false);
            if (var5 < 0 || !(class83.field1306 == 0 || class83.field1306 >= var5)) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class369.method2206(var6, var5, arg0, var4, 9);
            } else {
                class452.field6645.method671(var2, var6, true);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Ljava/lang/String;BZ)V", line = 72)
    public static final void method1328(String arg0, byte arg1, boolean arg2) {
        field2926++;
        String var3 = arg0.toLowerCase();
        short[] var4 = new short[16];
        int var5 = 0;
        int var6 = arg2 ? 32768 : 0;
        int var7 = var6 + (arg2 ? class40.field530.field3245 : class40.field530.field3247);
        for (int var8 = var6; var8 < var7; var8++) {
            class145 var11 = class40.field530.method1433(false, var8);
            if (var11.field2165 && var11.method1050((byte) -23).toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 50) {
                    class182.field2706 = null;
                    class6.field57 = -1;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var12 = new short[var4.length * 2];
                    for (int var13 = 0; var13 < var5; var13++) {
                        var12[var13] = var4[var13];
                    }
                    var4 = var12;
                }
                var4[var5++] = (short) var8;
            }
        }
        class153.field2322 = 0;
        class182.field2706 = var4;
        class6.field57 = var5;
        String[] var9 = new String[class6.field57];
        if (arg1 != 79) {
            field2932 = null;
        }
        for (int var10 = 0; var10 < class6.field57; var10++) {
            var9[var10] = class40.field530.method1433(false, var4[var10]).method1050((byte) -23);
        }
        class140.method1019(class182.field2706, var9, (byte) -83);
    }

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "(B)V", line = 148)
    public static void method1329(byte arg0) {
        int var1 = -14 % ((arg0 - 28) / 42);
        field2932 = null;
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(IIIIIZ)V", line = 159)
    public class201(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field2928 = arg5;
        this.field2929 = arg2;
        this.field2933 = arg4;
        this.field2934 = arg3;
        this.field2931 = arg1;
        this.field2927 = arg0;
    }
}
