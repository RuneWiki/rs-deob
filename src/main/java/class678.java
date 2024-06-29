import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public class class678 extends class211 {

    @OriginalMember(owner = "client!rs", name = "D", descriptor = "I")
    private int field9840;

    @OriginalMember(owner = "client!rs", name = "E", descriptor = "[Ljava/lang/String;")
    private static final String[] field9844 = new String[] { method4973(method4972("LU#vNPOyt\u000f")), method4973(method4972("LU#\u000b\u000f")), method4973(method4972("E\b#dZ")), method4973(method4972("LU#\t\u000f")), method4973(method4972("PSa&")), method4973(method4972("LU#\b\u000f")) };

    @OriginalMember(owner = "client!rs", name = "G", descriptor = "I")
    public static int field9839 = -1;

    @OriginalMember(owner = "client!rs", name = "H", descriptor = "Lel;")
    public static class573 field9842 = new class573(4, 0);

    @OriginalMember(owner = "client!rs", name = "C", descriptor = "I")
    public static int field9837;

    @OriginalMember(owner = "client!rs", name = "I", descriptor = "I")
    public static int field9838;

    @OriginalMember(owner = "client!rs", name = "J", descriptor = "I")
    public static int field9841;

    @OriginalMember(owner = "client!rs", name = "F", descriptor = "I")
    public static int field9843;

    @OriginalMember(owner = "client!rs", name = "<init>", descriptor = "(I)V", line = 4)
    public class678(int arg0) {
        super(0, true);
        this.field9840 = 4096;
        try {
            this.field9840 = arg0;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field9844[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rs", name = "c", descriptor = "(I)V", line = 14)
    public static void method4971(int arg0) {
        try {
            if (arg0 != 0) {
                field9837 = -116;
            }
            field9842 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field9844[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "(II)[I", line = 25)
    public final int[] method197(int arg0, int arg1) {
        try {
            if (arg0 != 8217) {
                return null;
            } else {
                ++field9838;
                int[] var3 = super.field3231.method34((byte) -64, arg1);
                if (super.field3231.field57) {
                    class467.method3551(var3, 0, class343.field5332, this.field9840);
                }
                return var3;
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field9844[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!rs", name = "<init>", descriptor = "()V", line = 47)
    public class678() {
        this(4096);
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(BILib;)V", line = 54)
    public final void method201(byte arg0, int arg1, class163 arg2) {
        try {
            ++field9841;
            if (~arg1 == -1) {
                this.field9840 = (arg2.method1455((byte) 62) << 12) / 255;
            }
            if (arg0 < 67) {
                field9839 = 8;
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field9844[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field9844[2] : field9844[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!rs", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4972(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 39);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!rs", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4973(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 62;
                    break;
                case 1:
                    var10005 = 38;
                    break;
                case 2:
                    var10005 = 13;
                    break;
                case 3:
                    var10005 = 74;
                    break;
                default:
                    var10005 = 39;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
