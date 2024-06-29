import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class578 implements class759 {

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "Lbt;")
    private class48 field7878;

    @OriginalMember(owner = "client!nl", name = "g", descriptor = "[[I")
    public static int[][] field7880 = new int[128][128];

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "I")
    public static int field7874;

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "I")
    public static int field7875;

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "I")
    public static int field7876;

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "I")
    public static int field7877;

    @OriginalMember(owner = "client!nl", name = "f", descriptor = "I")
    public static int field7879;

    @OriginalMember(owner = "client!nl", name = "h", descriptor = "Lqca;")
    public static class127 field7881;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(B[B)V")
    public static final void method3333(byte arg0, byte[] arg1) {
        field7874++;
        class403 var2 = new class403(arg1);
        boolean var3 = false;
        while (true) {
            while (true) {
                int var4 = var2.method2396((byte) 23);
                if (var4 == 0) {
                    if (arg0 != -30) {
                        method3335(56);
                    }
                    if (var3) {
                        return;
                    }
                    if (class355.field4407 == null) {
                        class355.field4407 = new int[4];
                        class606.field8163 = 4;
                        class204.field2442 = new int[4];
                    }
                    for (int var6 = 0; var6 < class355.field4407.length; var6++) {
                        class355.field4407[var6] = 0;
                        class204.field2442[var6] = var6 * 20;
                    }
                    return;
                }
                if (var4 == 1) {
                    if (class355.field4407 == null) {
                        class606.field8163 = 4;
                        class204.field2442 = new int[4];
                        class355.field4407 = new int[4];
                    }
                    for (int var5 = 0; var5 < class355.field4407.length; var5++) {
                        class355.field4407[var5] = var2.method2365(true);
                        class204.field2442[var5] = var2.method2365(true);
                    }
                    var3 = true;
                } else if (var4 == 2) {
                    class792.field10888 = var2.method2390((byte) -121);
                } else if (var4 == 3) {
                    class606.field8163 = var2.method2396((byte) 52);
                    class355.field4407 = new int[class606.field8163];
                    class204.field2442 = new int[class606.field8163];
                }
            }
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)I")
    public final int method230(int arg0) {
        field7879++;
        if (arg0 != -6635) {
            method3336((byte) -100, -103, -90);
        }
        return this.field7878.method455(-3) ? 100 : this.field7878.method439(arg0 ^ 0x68EA);
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ILuea;)V")
    public static final void method3334(int arg0, class336 arg1) {
        field7875++;
        class266.field3145.method2732(arg1, 21939);
        if (arg0 == 4) {
            arg1.field4153 = arg1.field4150.field5262;
            arg1.field4150.field5262 = 0;
            class535.field7533 += arg1.field4153;
        }
    }

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "(I)V")
    public static void method3335(int arg0) {
        field7880 = null;
        field7881 = null;
        if (arg0 != 0) {
            method3335(30);
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(BII)Z")
    public static final boolean method3336(byte arg0, int arg1, int arg2) {
        field7876++;
        if (arg0 != -107) {
            field7880 = null;
        }
        return (arg1 & 0x20) != 0;
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(I)Lsg;")
    public final class418 method231(int arg0) {
        field7877++;
        return arg0 == -27990 ? class418.field5447 : null;
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(Lbt;)V")
    public class578(class48 arg0) {
        this.field7878 = arg0;
    }
}
