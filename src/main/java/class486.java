import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public class class486 extends class498 {

    @OriginalMember(owner = "client!lt", name = "t", descriptor = "I")
    public int field6782;

    @OriginalMember(owner = "client!lt", name = "r", descriptor = "I")
    public int field6780;

    @OriginalMember(owner = "client!lt", name = "p", descriptor = "Ldu;")
    public static class242 field6778 = new class242(14, 7);

    @OriginalMember(owner = "client!lt", name = "o", descriptor = "I")
    public static int field6777;

    @OriginalMember(owner = "client!lt", name = "q", descriptor = "I")
    public static int field6779;

    @OriginalMember(owner = "client!lt", name = "s", descriptor = "I")
    public static int field6781;

    @OriginalMember(owner = "client!lt", name = "v", descriptor = "I")
    public static int field6784;

    @OriginalMember(owner = "client!lt", name = "u", descriptor = "Ldn;")
    public static class364 field6783;

    @OriginalMember(owner = "client!lt", name = "n", descriptor = "Loi;")
    public static class53 field6776;

    @OriginalMember(owner = "client!lt", name = "w", descriptor = "Loi;")
    public static class53 field6785;

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method2802(String arg0, byte arg1) {
        class92.method661(arg0, -1, "", "", 0, 0);
        if (arg1 <= 21) {
            field6778 = null;
        }
        field6777++;
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(I)V")
    public static void method2803(int arg0) {
        field6783 = null;
        field6776 = null;
        field6785 = null;
        if (arg0 < -106) {
            field6778 = null;
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(I[Lhm;B)V")
    public static final void method2804(int arg0, class150[] arg1, byte arg2) {
        field6779++;
        int var3 = 0;
        if (arg2 != -41) {
            return;
        }
        while (var3 < arg1.length) {
            class150 var4 = arg1[var3];
            if (var4 != null) {
                if (var4.field2022 == 0) {
                    if (var4.field2110 != null) {
                        method2804(arg0, var4.field2110, (byte) -41);
                    }
                    class489 var5 = (class489) class255.field3763.method2405((long) var4.field2134, -87);
                    if (var5 != null) {
                        class171.method1071(var5.field6840, 2, arg0);
                    }
                }
                if (arg0 == 0 && var4.field2063 != null) {
                    class389 var6 = new class389();
                    var6.field5457 = var4;
                    var6.field5466 = var4.field2063;
                    class495.method2866(var6);
                }
                if (arg0 == 1 && var4.field2050 != null) {
                    label62: {
                        if (var4.field2105 >= 0) {
                            class150 var7 = client.method1276(94, var4.field2134);
                            if (var7 == null || var7.field2110 == null || var7.field2110.length <= var4.field2105 || var7.field2110[var4.field2105] != var4) {
                                break label62;
                            }
                        }
                        class389 var8 = new class389();
                        var8.field5457 = var4;
                        var8.field5466 = var4.field2050;
                        class495.method2866(var8);
                    }
                }
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method2805(int arg0, String arg1) {
        field6781++;
        if (class133.field1752 == null) {
            class45.method259(-128);
        }
        String[] var2 = class177.method1103('\n', arg1, 0);
        for (int var3 = 0; var3 < var2.length; var3++) {
            for (int var5 = class508.field7526; var5 > 0; var5--) {
                class133.field1752[var5] = class133.field1752[var5 - 1];
            }
            class133.field1752[0] = var2[var3];
            if (class508.field7526 < (class133.field1752.length - 1)) {
                if (class408.field5782 > 0) {
                    class408.field5782++;
                }
                class508.field7526++;
            }
        }
        int var4 = 89 / ((-arg0 - 37) / 52);
    }

    @OriginalMember(owner = "client!lt", name = "<init>", descriptor = "(II)V")
    public class486(int arg0, int arg1) {
        this.field6782 = arg1;
        this.field6780 = arg0;
    }

    static {
        new class530("You are temporarily blocked from joining channels - please try again later!", "Du darfst derzeit keine Chaträume betreten - bitte versuch es später.", "Vous êtes temporairement exclu des canaux - veuillez réessayer ultérieurement.", "Você está temporariamente impedido de entrar em canais. Tente de novo depois!");
    }
}
