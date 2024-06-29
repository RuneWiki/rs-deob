import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class311 {

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "Lgn;")
    public static class303 field4928 = new class303(new byte[5000]);

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "I")
    public static int field4932 = -1;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "I")
    public static int field4929;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
    public static int field4930;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
    public static int field4931;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "I")
    public static int field4933;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "Lwf;")
    public static class306 field4935;

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "[Z")
    public static boolean[] field4934;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)I", line = 7)
    public static int method2135(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)V", line = 20)
    public static void method2136(byte arg0) {
        field4928 = null;
        field4935 = null;
        if (arg0 != 2) {
            method2139(44, (short[]) null, (String[]) null, 62, -96);
        }
        field4934 = null;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V", line = 34)
    public static final void method2137(int arg0) {
        field4929++;
        int var1 = -66 % ((arg0 + 30) / 38);
        for (int var2 = 0; var2 < 5; var2++) {
            class86.field1304[var2] = false;
        }
        class219.field3489 = 1;
        class27.field348 = 0;
        class90.field1364 = 0;
        class253.field3939 = -1;
        class88.field1349 = -1;
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(B)Lng;", line = 58)
    public static final class245 method2138(byte arg0) {
        byte[] var1 = class46.field644[0];
        int var2 = class68.field1011[0] * class107.field1652[0];
        int[] var3 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = class154.field2417[method2135(var1[var4], 255)];
        }
        if (arg0 != 3) {
            field4934 = (boolean[]) null;
        }
        class245 var5;
        if (class333.field5166) {
            var5 = new class186(class116.field1798, class168.field2567, class276.field4257[0], class123.field1919[0], class68.field1011[0], class107.field1652[0], var3);
        } else {
            var5 = new class178(class116.field1798, class168.field2567, class276.field4257[0], class123.field1919[0], class68.field1011[0], class107.field1652[0], var3);
        }
        field4930++;
        class345.method2394((byte) -92);
        return var5;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I[S[Ljava/lang/String;II)V", line = 90)
    public static final void method2139(int arg0, short[] arg1, String[] arg2, int arg3, int arg4) {
        if (arg4 < arg3) {
            int var5 = (arg3 + arg4) / 2;
            int var6 = arg4;
            String var7 = arg2[var5];
            arg2[var5] = arg2[arg3];
            arg2[arg3] = var7;
            short var8 = arg1[var5];
            arg1[var5] = arg1[arg3];
            arg1[arg3] = var8;
            for (int var9 = arg4; var9 < arg3; var9++) {
                if (var7 == null || arg2[var9] != null && arg2[var9].compareTo(var7) < (var9 & 0x1)) {
                    String var10 = arg2[var9];
                    arg2[var9] = arg2[var6];
                    arg2[var6] = var10;
                    short var11 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6++] = var11;
                }
            }
            arg2[arg3] = arg2[var6];
            arg2[var6] = var7;
            arg1[arg3] = arg1[var6];
            arg1[var6] = var8;
            method2139(0, arg1, arg2, var6 - 1, arg4);
            method2139(0, arg1, arg2, arg3, var6 + 1);
        }
        if (arg0 == 0) {
            field4933++;
        }
    }

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "(B)Lvg;", line = 163)
    public static final class342 method2140(byte arg0) {
        field4931++;
        if (arg0 != -5) {
            field4934 = (boolean[]) null;
        }
        try {
            return (class342) Class.forName("jb").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }
}
