import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class250 implements class118 {

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "Lbi;")
    public static class104 field4054 = new class104(47, 5);

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "Lqu;")
    public static class219 field4058 = new class219(50, 2);

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "J")
    public static long field4059 = 0L;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "I")
    public static int field4055;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "I")
    public static int field4056;

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "I")
    public static int field4057;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Ltm;)V")
    public static final void method1728(class423 arg0) {
        for (int var1 = arg0.field6423; var1 <= arg0.field6420; var1++) {
            for (int var2 = arg0.field6424; var2 <= arg0.field6418; var2++) {
                class409 var3 = class217.field3699[arg0.field6419][var1][var2];
                if (var3 != null) {
                    class192 var4 = var3.field6175;
                    class192 var5 = null;
                    while (var4 != null) {
                        if (var4.field2845 == arg0) {
                            if (var5 == null) {
                                var3.field6175 = var4.field2841;
                            } else {
                                var5.field2841 = var4.field2841;
                            }
                            var4.method1202(-26392);
                            break;
                        }
                        var5 = var4;
                        var4 = var4.field2841;
                    }
                    var3.field6193 = 0;
                    for (class192 var6 = var3.field6175; var6 != null; var6 = var6.field2841) {
                        var3.field6193 = (byte) (var3.field6193 | var6.field2849);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V")
    public static final void method1729(int arg0, String arg1, String arg2, int arg3) {
        if (arg3 == -25381) {
            class334.field5227 = 2;
            class300.field4718 = arg0;
            field4056++;
            class426.method2695(arg2, false, arg1);
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V")
    public static void method1730(int arg0) {
        if (arg0 == 20258) {
            field4058 = null;
            field4054 = null;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(BJLcg;[I)Ljava/lang/String;")
    public final String method751(byte arg0, long arg1, class10 arg2, int[] arg3) {
        field4057++;
        if (class317.field4938 == arg2) {
            class41 var6 = class375.field5749.method2439(arg3[0], -1);
            return var6.method253((int) arg1, 24667);
        }
        if (arg0 > -66) {
            field4058 = null;
        }
        if (class462.field7106 == arg2 || class477.field7307 == arg2) {
            class196 var7 = class337.field5262.method2077((byte) -65, (int) arg1);
            return var7.field3034;
        } else if (class434.field6544 == arg2 || class249.field4038 == arg2 || class218.field3707 == arg2) {
            return class375.field5749.method2439(arg3[0], -1).method253((int) arg1, 24667);
        } else {
            return null;
        }
    }
}
