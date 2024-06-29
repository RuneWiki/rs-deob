import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class187 implements Runnable {

    @OriginalMember(owner = "client!rg", name = "l", descriptor = "Z")
    public boolean field3230 = true;

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "Ljava/lang/Object;")
    public Object field3221 = new Object();

    @OriginalMember(owner = "client!rg", name = "p", descriptor = "[I")
    public int[] field3234 = new int[500];

    @OriginalMember(owner = "client!rg", name = "q", descriptor = "[I")
    public int[] field3235 = new int[500];

    @OriginalMember(owner = "client!rg", name = "r", descriptor = "I")
    public int field3236 = 0;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "[Z")
    public static boolean[] field3219 = new boolean[100];

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "Ldj;")
    private static class44 field3220 = class89.method650(255, "Use");

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "Ldj;")
    private static class44 field3225 = class89.method650(255, "Started 3d library");

    @OriginalMember(owner = "client!rg", name = "m", descriptor = "Ldj;")
    public static class44 field3231 = field3225;

    @OriginalMember(owner = "client!rg", name = "n", descriptor = "Ldj;")
    public static class44 field3232 = field3220;

    @OriginalMember(owner = "client!rg", name = "o", descriptor = "I")
    public static int field3233 = 3;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "I")
    public static int field3222;

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "I")
    public static int field3224;

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "I")
    public static int field3226;

    @OriginalMember(owner = "client!rg", name = "i", descriptor = "I")
    public static int field3227;

    @OriginalMember(owner = "client!rg", name = "j", descriptor = "I")
    public static int field3228;

    @OriginalMember(owner = "client!rg", name = "k", descriptor = "I")
    public static int field3229;

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "Lnh;")
    public static class149 field3223;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(BLle;)V")
    public static final void method1160(byte arg0, class125 arg1) {
        if (arg0 != -34) {
            field3220 = null;
        }
        field3229++;
        short var2 = 256;
        for (int var3 = 0; var3 < class84.field1639.length; var3++) {
            class84.field1639[var3] = 0;
        }
        for (int var4 = 0; var4 < 5000; var4++) {
            int var16 = (int) (Math.random() * 128.0D * (double) var2);
            class84.field1639[var16] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var12 = 1; var12 < var2 - 1; var12++) {
                for (int var14 = 1; var14 < 127; var14++) {
                    int var15 = var14 + (var12 << 7);
                    class166.field2849[var15] = (class84.field1639[var15 + 128] + class84.field1639[var15 + 1] + class84.field1639[var15 + -1] + class84.field1639[var15 + -128]) / 4;
                }
            }
            int[] var13 = class84.field1639;
            class84.field1639 = class166.field2849;
            class166.field2849 = var13;
        }
        if (arg1 == null) {
            return;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < arg1.field2269; var7++) {
            for (int var8 = 0; var8 < arg1.field2271; var8++) {
                if (arg1.field2270[var6++] != 0) {
                    int var9 = var8 + arg1.field2268 + 16;
                    int var10 = var7 + arg1.field2266 + 16;
                    int var11 = var9 + (var10 << 7);
                    class84.field1639[var11] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "([Ldj;BII[S)V")
    public static final void method1161(class44[] arg0, byte arg1, int arg2, int arg3, short[] arg4) {
        if (arg2 < arg3) {
            int var5 = (arg2 + arg3) / 2;
            int var6 = arg2;
            class44 var7 = arg0[var5];
            arg0[var5] = arg0[arg3];
            arg0[arg3] = var7;
            short var8 = arg4[var5];
            arg4[var5] = arg4[arg3];
            arg4[arg3] = var8;
            for (int var9 = arg2; var9 < arg3; var9++) {
                if (var7 == null || arg0[var9] != null && (var9 & 0x1) > arg0[var9].method315((byte) -75, var7)) {
                    class44 var10 = arg0[var9];
                    arg0[var9] = arg0[var6];
                    arg0[var6] = var10;
                    short var11 = arg4[var9];
                    arg4[var9] = arg4[var6];
                    arg4[var6++] = var11;
                }
            }
            arg0[arg3] = arg0[var6];
            arg0[var6] = var7;
            arg4[arg3] = arg4[var6];
            arg4[var6] = var8;
            method1161(arg0, (byte) 69, arg2, var6 - 1, arg4);
            method1161(arg0, (byte) 96, var6 + 1, arg3, arg4);
        }
        if (arg1 < 61) {
            field3220 = null;
        }
        field3227++;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)V")
    public static void method1162(int arg0) {
        field3220 = null;
        field3223 = null;
        field3231 = null;
        if (arg0 != 0) {
            field3219 = null;
        }
        field3225 = null;
        field3232 = null;
        field3219 = null;
    }

    @OriginalMember(owner = "client!rg", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field3230) {
            Object var1 = this.field3221;
            synchronized (this.field3221) {
                if (this.field3236 < 500) {
                    this.field3234[this.field3236] = class27.field486;
                    this.field3235[this.field3236] = class7.field151;
                    this.field3236++;
                }
            }
            class82.method617((byte) 31, 50L);
        }
        field3222++;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)V")
    public static final void method1163(byte arg0) {
        if (arg0 != 111) {
            method1161(null, (byte) 10, -75, -106, null);
        }
        field3228++;
        for (class104 var1 = (class104) class129.field2294.method832(93); var1 != null; var1 = (class104) class129.field2294.method829((byte) 75)) {
            int var2 = var1.field1893;
            if (class122.method835(var2, 31)) {
                boolean var3 = true;
                class223[] var4 = class4.field52[var2];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field4118;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field3186;
                    class223 var7 = class213.method1379(var6, -10051);
                    if (var7 != null) {
                        class225.method1457(111, var7);
                    }
                }
            }
        }
    }
}
