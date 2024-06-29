import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public class class317 {

    @OriginalMember(owner = "client!pr", name = "f", descriptor = "Z")
    public static boolean field4710 = false;

    @OriginalMember(owner = "client!pr", name = "i", descriptor = "I")
    public static int field4713 = 0;

    @OriginalMember(owner = "client!pr", name = "h", descriptor = "Lqt;")
    public static class459 field4712 = new class459(50, -1);

    @OriginalMember(owner = "client!pr", name = "k", descriptor = "Lqv;")
    public static class316 field4715 = new class316(13, 8);

    @OriginalMember(owner = "client!pr", name = "l", descriptor = "Lbd;")
    public static class44 field4716 = new class44("Loading title screen - ", "Lade Titelbild - ", "Chargement de l'écran-titre - ", "Carregando tela título - ");

    @OriginalMember(owner = "client!pr", name = "n", descriptor = "Lgw;")
    public static class118 field4718 = new class118();

    @OriginalMember(owner = "client!pr", name = "m", descriptor = "F")
    public static float field4717;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "I")
    public static int field4705;

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "I")
    public static int field4706;

    @OriginalMember(owner = "client!pr", name = "c", descriptor = "I")
    public static int field4707;

    @OriginalMember(owner = "client!pr", name = "d", descriptor = "I")
    public static int field4708;

    @OriginalMember(owner = "client!pr", name = "j", descriptor = "I")
    public int field4714;

    @OriginalMember(owner = "client!pr", name = "e", descriptor = "Lpr;")
    public class317 field4709;

    @OriginalMember(owner = "client!pr", name = "g", descriptor = "Lsv;")
    public class478 field4711;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(II[Ltf;)V", line = 10)
    public static final void method2000(int arg0, int arg1, class198[] arg2) {
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class198 var4 = arg2[var3];
            if (var4 != null && var4.field3033 == arg1 && !client.method1378(var4)) {
                if (var4.field2941 == 0) {
                    method2000(16, var4.field3016, arg2);
                    if (var4.field3013 != null) {
                        method2000(16, var4.field3016, var4.field3013);
                    }
                    class541 var5 = (class541) class220.field3370.method2284(true, (long) var4.field3016);
                    if (var5 != null) {
                        class444.method2626((byte) -65, var5.field7955);
                    }
                }
                if (var4.field2941 == 6 && var4.field2920 != -1) {
                    class183 var6 = class96.field1526.method2717(-115, var4.field2920);
                    if (var6 != null) {
                        var4.field2975 += class163.field2465;
                        while (var6.field2713[var4.field2935] < var4.field2975) {
                            var4.field2975 -= var6.field2713[var4.field2935];
                            var4.field2935++;
                            if (var4.field2935 >= var6.field2692.length) {
                                var4.field2935 -= var6.field2691;
                                if (var4.field2935 < 0 || var4.field2935 >= var6.field2692.length) {
                                    var4.field2935 = 0;
                                }
                            }
                            var4.field2900 = var4.field2935 + 1;
                            if (var4.field2900 >= var6.field2692.length) {
                                var4.field2900 -= var6.field2691;
                                if (var4.field2900 < 0 || var6.field2692.length <= var4.field2900) {
                                    var4.field2900 = -1;
                                }
                            }
                            class284.method1832(-17067, var4);
                        }
                    }
                }
            }
        }
        field4708++;
        if (arg0 != 16) {
            method2000(53, 81, null);
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(III)V", line = 94)
    public static final void method2001(int arg0, int arg1, int arg2) {
        field4705++;
        class275 var3 = class213.method1433((byte) 110, arg0, arg1);
        var3.method1778(0);
        var3.field4113 = arg2;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(I)V", line = 108)
    public static void method2002(int arg0) {
        field4718 = null;
        if (arg0 != 13) {
            method2000(-16, -63, null);
        }
        field4716 = null;
        field4715 = null;
        field4712 = null;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(Z)V", line = 122)
    public final void method2003(boolean arg0) {
        field4707++;
        if (arg0 || class297.field4439 >= 500) {
            return;
        }
        this.field4711 = null;
        this.field4709 = class102.field1575;
        this.field4714 = 0;
        class102.field1575 = this;
        class297.field4439++;
    }
}
