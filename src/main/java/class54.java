import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class54 extends class311 {

    @OriginalMember(owner = "client!bl", name = "p", descriptor = "I")
    public int field685;

    @OriginalMember(owner = "client!bl", name = "r", descriptor = "I")
    public int field687;

    @OriginalMember(owner = "client!bl", name = "C", descriptor = "I")
    public int field697;

    @OriginalMember(owner = "client!bl", name = "v", descriptor = "Z")
    public boolean field691;

    @OriginalMember(owner = "client!bl", name = "x", descriptor = "I")
    public int field693;

    @OriginalMember(owner = "client!bl", name = "s", descriptor = "I")
    public int field688;

    @OriginalMember(owner = "client!bl", name = "q", descriptor = "I")
    public static int field686 = 1;

    @OriginalMember(owner = "client!bl", name = "t", descriptor = "Ljava/lang/String;")
    public static String field689 = "";

    @OriginalMember(owner = "client!bl", name = "y", descriptor = "I")
    public static int field694 = 0;

    @OriginalMember(owner = "client!bl", name = "w", descriptor = "I")
    public static int field692;

    @OriginalMember(owner = "client!bl", name = "z", descriptor = "I")
    public static int field695;

    @OriginalMember(owner = "client!bl", name = "A", descriptor = "I")
    public static int field696;

    @OriginalMember(owner = "client!bl", name = "u", descriptor = "Lij;")
    public static class316 field690;

    // $FF: synthetic field
    @OriginalMember(owner = "client!bl", name = "D", descriptor = "Ljava/lang/Class;")
    public static Class field698;

    // $FF: synthetic method
    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method433(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(B)V", line = 6)
    public static void method429(byte arg0) {
        field690 = null;
        field689 = null;
        if (arg0 < 23) {
            field690 = null;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(III)I", line = 34)
    public static final int method430(int arg0, int arg1, int arg2) {
        field692++;
        if (arg0 != -24027) {
            method431(-126, -119, -125, 117);
        }
        int var3 = 0;
        while (arg1 > 0) {
            var3 = arg2 & 0x1 | var3 << 1;
            arg1--;
            arg2 >>>= 0x1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIII)Z", line = 54)
    public static final boolean method431(int arg0, int arg1, int arg2, int arg3) {
        field695++;
        if (arg0 <= 48) {
            return true;
        }
        class223 var4 = (class223) class243.method1587(arg1, arg2, arg3);
        boolean var5 = true;
        if (var4 != null) {
            var5 &= class282.method1766(var4, -3);
        }
        class223 var6 = (class223) class95.method734(arg1, arg2, arg3, field698 == null ? (field698 = method433("iq")) : field698);
        if (var6 != null) {
            var5 &= class282.method1766(var6, -3);
        }
        class223 var7 = (class223) class111.method852(arg1, arg2, arg3);
        if (var7 != null) {
            var5 &= class282.method1766(var7, -3);
        }
        return var5;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(CI)Z", line = 83)
    public static final boolean method432(char arg0, int arg1) {
        field696++;
        if (Character.isISOControl(arg0)) {
            return false;
        } else if (class389.method2425(arg0, arg1)) {
            return true;
        } else {
            char[] var2 = class134.field2004;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var7 = var2[var3];
                if (arg0 == var7) {
                    return true;
                }
            }
            char[] var4 = class128.field1934;
            for (int var5 = arg1; var5 < var4.length; var5++) {
                char var6 = var4[var5];
                if (arg0 == var6) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(IIIIIZ)V", line = 124)
    public class54(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field685 = arg1;
        this.field687 = arg0;
        this.field697 = arg2;
        this.field691 = arg5;
        this.field693 = arg4;
        this.field688 = arg3;
    }
}
