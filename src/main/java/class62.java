import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public class class62 extends class578 {

    @OriginalMember(owner = "client!ru", name = "k", descriptor = "I")
    public int field943;

    @OriginalMember(owner = "client!ru", name = "j", descriptor = "I")
    public int field947;

    @OriginalMember(owner = "client!ru", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field948 = new String[] { method671(method670("\u0004(P\u0001")), method671(method670("\u0018(\u0012/!")), method671(method670("\u0011s\u0012Ct")), method671(method670("\u0018(\u0012Q`\u00044HS!")), method671(method670("\u0018(\u0012,!")) };

    @OriginalMember(owner = "client!ru", name = "m", descriptor = "Lhj;")
    public static class671 field944 = new class671(10, 2, 2, 0);

    @OriginalMember(owner = "client!ru", name = "l", descriptor = "I")
    public static int field945;

    @OriginalMember(owner = "client!ru", name = "i", descriptor = "Ld;")
    public static class673 field946;

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(BIBLem;I)V", line = 11)
    public static final void method668(byte arg0, int arg1, byte arg2, class339 arg3, int arg4) {
        try {
            field945++;
            int var5 = arg3.field2252[0];
            int var6 = arg3.field2256[0];
            if (var5 >= 0 && var5 < class625.field8929 && var6 >= 0 && var6 < class14.field187 && arg4 >= 0 && arg4 < class625.field8929 && arg1 >= 0 && arg1 < class14.field187) {
                int var7 = class670.method4825(0, arg3.method1437((byte) -28), var6, var5, arg4, class480.field7073, class584.field8433, 0, 15705, class195.field2919[arg3.field2981], -4, true, 0, 0, arg1);
                if (var7 >= 1 && var7 <= 3) {
                    if (arg0 != -118) {
                        method669(-72);
                    }
                    for (int var8 = 0; var8 < var7 - 1; var8++) {
                        arg3.method2720(false, class584.field8433[var8], arg2, class480.field7073[var8]);
                    }
                }
            }
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field948[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field948[0] : field948[2]) + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(I)V", line = 47)
    public static void method669(int arg0) {
        try {
            field946 = null;
            if (arg0 != 10) {
                field946 = null;
            }
            field944 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field948[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(II)V", line = 60)
    public class62(int arg0, int arg1) {
        try {
            this.field943 = arg0;
            this.field947 = arg1;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field948[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ru", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method670(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x9);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ru", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method671(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 106;
                    break;
                case 1:
                    var10005 = 93;
                    break;
                case 2:
                    var10005 = 60;
                    break;
                case 3:
                    var10005 = 109;
                    break;
                default:
                    var10005 = 9;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
