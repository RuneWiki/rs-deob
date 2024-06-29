import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class class505 {

    @OriginalMember(owner = "client!qr", name = "c", descriptor = "Ljo;")
    private class382 field7427 = new class382(128);

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "Lok;")
    private class74 field7426;

    @OriginalMember(owner = "client!qr", name = "e", descriptor = "Laa;")
    public static class76 field7429 = new class76(7, 4);

    @OriginalMember(owner = "client!qr", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field7431 = new String[100];

    @OriginalMember(owner = "client!qr", name = "h", descriptor = "Luv;")
    public static class2 field7432 = new class2(76, 2);

    @OriginalMember(owner = "client!qr", name = "i", descriptor = "F")
    public static float field7433;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "I")
    public static int field7425;

    @OriginalMember(owner = "client!qr", name = "d", descriptor = "I")
    public static int field7428;

    @OriginalMember(owner = "client!qr", name = "f", descriptor = "I")
    public static int field7430;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "([Ljava/lang/String;ZII)Ljava/lang/String;", line = 3)
    public static final String method2982(String[] arg0, boolean arg1, int arg2, int arg3) {
        field7425++;
        if (arg2 == 0) {
            return "";
        } else if (arg2 == 1) {
            String var4 = arg0[arg3];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg2 + arg3;
            if (!arg1) {
                field7431 = null;
            }
            int var6 = 0;
            for (int var7 = arg3; var7 < var5; var7++) {
                String var11 = arg0[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var6);
            for (int var9 = arg3; var9 < var5; var9++) {
                String var10 = arg0[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(B)V", line = 69)
    public static void method2983(byte arg0) {
        field7429 = null;
        if (arg0 < 18) {
            field7431 = null;
        }
        field7431 = null;
        field7432 = null;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(II)Lrj;", line = 81)
    public final class491 method2984(int arg0, int arg1) {
        field7430++;
        class382 var3 = this.field7427;
        class491 var4;
        synchronized (this.field7427) {
            var4 = (class491) this.field7427.method2288((long) arg0, 0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field7426.method541(class193.method1284(arg0, -4418), class476.method2826(arg0, (byte) -113), (byte) -122);
        class491 var6 = new class491();
        if (var5 != null) {
            var6.method2926(new class468(var5), arg1 ^ 0xFFFFC5FE);
        }
        class382 var7 = this.field7427;
        synchronized (this.field7427) {
            this.field7427.method2290((long) arg0, var6, 119);
        }
        return arg1 == -14850 ? var6 : null;
    }

    @OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(Lkr;ILok;)V", line = 126)
    public class505(class262 arg0, int arg1, class74 arg2) {
        this.field7426 = arg2;
        if (this.field7426 != null) {
            int var4 = this.field7426.method535((byte) 117) - 1;
            this.field7426.method536(false, var4);
        }
    }
}
