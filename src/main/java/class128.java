import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class128 extends class326 {

    @OriginalMember(owner = "client!te", name = "m", descriptor = "Ljava/lang/String;")
    public static String field1865 = "Walk here";

    @OriginalMember(owner = "client!te", name = "j", descriptor = "Z")
    public static boolean field1862 = true;

    @OriginalMember(owner = "client!te", name = "o", descriptor = "Ljava/lang/String;")
    public static String field1867 = "Cancel";

    @OriginalMember(owner = "client!te", name = "i", descriptor = "Llf;")
    public static class260 field1861 = new class260(5000);

    @OriginalMember(owner = "client!te", name = "p", descriptor = "[I")
    public static int[] field1868 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

    @OriginalMember(owner = "client!te", name = "g", descriptor = "I")
    public static int field1859;

    @OriginalMember(owner = "client!te", name = "h", descriptor = "I")
    public static int field1860;

    @OriginalMember(owner = "client!te", name = "k", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!te", name = "l", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!te", name = "n", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ILph;B)Lpk;", line = 6)
    public static final class291 method945(int arg0, class361 arg1, byte arg2) {
        field1860++;
        byte[] var3 = arg1.method2513((byte) -84, arg0);
        if (arg2 != -16) {
            field1864 = -99;
        }
        return var3 == null ? null : new class291(var3);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V", line = 34)
    public static void method946(int arg0) {
        field1867 = null;
        if (arg0 != 1) {
            method946(77);
        }
        field1868 = null;
        field1861 = null;
        field1865 = null;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ILph;IZLph;)Lvk;", line = 71)
    public static final class209 method947(int arg0, class361 arg1, int arg2, boolean arg3, class361 arg4) {
        field1859++;
        boolean var5 = true;
        int[] var6 = arg4.method2508(91, arg0);
        for (int var7 = 0; var7 < var6.length; var7++) {
            byte[] var8 = arg4.method2522(var6[var7], arg0, (byte) 106);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = var8[1] & 0xFF | var8[0] & 0xFF << 8;
                byte[] var10;
                if (arg3) {
                    var10 = arg1.method2522(var9, 0, (byte) 82);
                } else {
                    var10 = arg1.method2522(0, var9, (byte) -118);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        int var11 = 76 % ((arg2 + 37) / 61);
        if (!var5) {
            return null;
        }
        try {
            return new class209(arg4, arg1, arg0, arg3);
        } catch (Exception var13) {
            return null;
        }
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(I)Lrc;", line = 124)
    public static final class83 method948(int arg0) {
        field1863++;
        if (arg0 != 1) {
            return (class83) null;
        }
        try {
            return new class168();
        } catch (Throwable var4) {
            try {
                return (class83) Class.forName("dg").getDeclaredConstructor().newInstance();
            } catch (Throwable var3) {
                return new class6();
            }
        }
    }
}
