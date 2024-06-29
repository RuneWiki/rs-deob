import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ffa")
public class class195 extends class568 {

    @OriginalMember(owner = "client!ffa", name = "l", descriptor = "I")
    public int field3086 = 0;

    @OriginalMember(owner = "client!ffa", name = "S", descriptor = "[Ljava/lang/String;")
    private static final String[] field3112 = new String[] { method1802(method1801("!E4J\u001bo")), method1802(method1801("!E4J\u0018o")) };

    @OriginalMember(owner = "client!ffa", name = "w", descriptor = "I")
    public static int field3091 = 0;

    @OriginalMember(owner = "client!ffa", name = "R", descriptor = "Lwc;")
    public static class71 field3093 = new class71();

    @OriginalMember(owner = "client!ffa", name = "q", descriptor = "I")
    public int field3082;

    @OriginalMember(owner = "client!ffa", name = "Q", descriptor = "I")
    public int field3092;

    @OriginalMember(owner = "client!ffa", name = "u", descriptor = "I")
    public int field3094;

    @OriginalMember(owner = "client!ffa", name = "z", descriptor = "I")
    public int field3095;

    @OriginalMember(owner = "client!ffa", name = "P", descriptor = "I")
    public int field3096;

    @OriginalMember(owner = "client!ffa", name = "o", descriptor = "I")
    public int field3097;

    @OriginalMember(owner = "client!ffa", name = "y", descriptor = "I")
    public int field3099;

    @OriginalMember(owner = "client!ffa", name = "p", descriptor = "I")
    public int field3100;

    @OriginalMember(owner = "client!ffa", name = "G", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "client!ffa", name = "v", descriptor = "I")
    public int field3103;

    @OriginalMember(owner = "client!ffa", name = "t", descriptor = "I")
    public int field3105;

    @OriginalMember(owner = "client!ffa", name = "H", descriptor = "I")
    public int field3107;

    @OriginalMember(owner = "client!ffa", name = "O", descriptor = "I")
    public int field3109;

    @OriginalMember(owner = "client!ffa", name = "K", descriptor = "I")
    public int field3110;

    @OriginalMember(owner = "client!ffa", name = "r", descriptor = "I")
    public int field3111;

    @OriginalMember(owner = "client!ffa", name = "B", descriptor = "Lgga;")
    public class306 field3080;

    @OriginalMember(owner = "client!ffa", name = "N", descriptor = "Lgga;")
    public class306 field3084;

    @OriginalMember(owner = "client!ffa", name = "x", descriptor = "Ljg;")
    public class357 field3090;

    @OriginalMember(owner = "client!ffa", name = "C", descriptor = "Ljg;")
    public class357 field3104;

    @OriginalMember(owner = "client!ffa", name = "m", descriptor = "Ltk;")
    public class362 field3089;

    @OriginalMember(owner = "client!ffa", name = "J", descriptor = "Lns;")
    public class426 field3087;

    @OriginalMember(owner = "client!ffa", name = "D", descriptor = "Lit;")
    public class675 field3081;

    @OriginalMember(owner = "client!ffa", name = "M", descriptor = "Lit;")
    public class675 field3101;

    @OriginalMember(owner = "client!ffa", name = "n", descriptor = "Lip;")
    public class738 field3079;

    @OriginalMember(owner = "client!ffa", name = "E", descriptor = "Ljava/lang/String;")
    public static String field3108;

    @OriginalMember(owner = "client!ffa", name = "A", descriptor = "Z")
    public boolean field3085;

    @OriginalMember(owner = "client!ffa", name = "L", descriptor = "Z")
    public boolean field3088;

    @OriginalMember(owner = "client!ffa", name = "s", descriptor = "Z")
    public boolean field3098;

    @OriginalMember(owner = "client!ffa", name = "F", descriptor = "[I")
    public int[] field3083;

    @OriginalMember(owner = "client!ffa", name = "I", descriptor = "[I")
    public static int[] field3106;

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(B)V")
    public final void method1799(byte arg0) {
        try {
            field3102++;
            int var2 = this.field3103;
            if (arg0 == -37) {
                boolean var3 = this.field3088;
                if (this.field3089 != null) {
                    class362 var6 = this.field3089.method2997(-36, class398.field6315);
                    if (var6 == null) {
                        this.field3096 = 0;
                        this.field3083 = null;
                        this.field3099 = 0;
                        this.field3098 = false;
                        this.field3100 = 0;
                        this.field3103 = -1;
                        this.field3088 = false;
                        this.field3105 = 0;
                        this.field3107 = 256;
                        this.field3095 = 0;
                        this.field3092 = 256;
                    } else {
                        this.field3098 = var6.field5853;
                        this.field3107 = var6.field5893;
                        this.field3092 = var6.field5833;
                        this.field3096 = var6.field5895;
                        this.field3105 = var6.field5917;
                        this.field3099 = var6.field5928 << 9;
                        this.field3100 = var6.field5904;
                        this.field3083 = var6.field5870;
                        this.field3088 = var6.field5881;
                        this.field3103 = var6.field5921;
                    }
                } else if (this.field3087 != null) {
                    int var4 = class356.method2949(this.field3087, 50);
                    if (var2 != var4) {
                        this.field3103 = var4;
                        class162 var5 = this.field3087.field6716;
                        if (var5.field2620 != null) {
                            var5 = var5.method1530(-72, class398.field6315);
                        }
                        if (var5 == null) {
                            this.field3092 = 256;
                            this.field3096 = this.field3099 = this.field3095 = 0;
                            this.field3107 = 256;
                            this.field3088 = this.field3087.field6716.field2613;
                        } else {
                            this.field3092 = var5.field2574;
                            this.field3099 = var5.field2558 << 9;
                            this.field3107 = var5.field2618;
                            this.field3096 = var5.field2557;
                            this.field3088 = var5.field2613;
                            this.field3095 = var5.field2579 << 9;
                        }
                    }
                } else if (this.field3079 != null) {
                    this.field3103 = class543.method4041(0, this.field3079);
                    this.field3099 = this.field3079.field10819 << 9;
                    this.field3095 = 0;
                    this.field3092 = 256;
                    this.field3088 = this.field3079.field10856;
                    this.field3107 = 256;
                    this.field3096 = this.field3079.field10832;
                }
                if (this.field3103 != var2 || var3 != this.field3088) {
                    if (this.field3081 == null) {
                        return;
                    }
                    class476.field7253.method2594(this.field3081);
                    this.field3080 = null;
                    this.field3104 = null;
                    this.field3081 = null;
                }
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field3112[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(I)V")
    public static void method1800(int arg0) {
        try {
            int var1 = -14 % ((53 - arg0) / 41);
            field3093 = null;
            field3108 = null;
            field3106 = null;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field3112[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1801(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ffa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1802(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 71;
                    break;
                case 1:
                    var10005 = 35;
                    break;
                case 2:
                    var10005 = 85;
                    break;
                case 3:
                    var10005 = 100;
                    break;
                default:
                    var10005 = 90;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
