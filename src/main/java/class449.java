import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public abstract class class449 {

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "Los;")
    public static class309 field6674 = new class309("Loading world map - ", "Lade Weltkarte - ", "Chargement de la mappemonde - ", "Carregando mapa-múndi - ");

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "I")
    public static int field6677 = -1;

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "I")
    public static int field6675;

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "I")
    public static int field6676;

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "Lph;")
    public static class459 field6678;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IZI)V")
    public static final void method2682(int arg0, boolean arg1, int arg2) {
        field6676++;
        class18 var3 = class140.method1047(14, arg0, arg1);
        var3.method122(true);
        var3.field283 = arg2;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILlt;Ljava/lang/String;B)Lwp;")
    public static final class121 method2683(int arg0, class480 arg1, String arg2, byte arg3) {
        field6675++;
        if (arg0 == 0) {
            return arg1.method2866(arg2, -25185);
        } else if (arg0 == 1) {
            try {
                class227.method1507(10393, new Object[] { (new URL(arg1.field7072.getCodeBase(), arg2)).toString() }, arg1.field7072, "openjs");
                class121 var4 = new class121();
                var4.field2119 = 1;
                return var4;
            } catch (Throwable var11) {
                class121 var5 = new class121();
                var5.field2119 = 2;
                return var5;
            }
        } else if (arg0 == 2) {
            try {
                arg1.field7072.getAppletContext().showDocument(new URL(arg1.field7072.getCodeBase(), arg2), "_blank");
                class121 var6 = new class121();
                var6.field2119 = 1;
                return var6;
            } catch (Exception var12) {
                class121 var7 = new class121();
                var7.field2119 = 2;
                return var7;
            }
        } else {
            int var8 = 22 % ((arg3 - 2) / 53);
            if (arg0 != 3) {
                throw new IllegalArgumentException();
            }
            try {
                class227.method1509(arg1.field7072, "loggedout", 29436);
            } catch (Throwable var14) {
            }
            try {
                arg1.field7072.getAppletContext().showDocument(new URL(arg1.field7072.getCodeBase(), arg2), "_top");
                class121 var9 = new class121();
                var9.field2119 = 1;
                return var9;
            } catch (Exception var13) {
                class121 var10 = new class121();
                var10.field2119 = 2;
                return var10;
            }
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)V")
    public static void method2684(int arg0) {
        field6678 = null;
        field6674 = null;
        if (arg0 != -18935) {
            field6677 = 12;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Z)J")
    public abstract long method1442(boolean arg0);

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)I")
    public abstract int method1443(int arg0, int arg1);

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(I)V")
    public abstract void method1440(int arg0);
}
