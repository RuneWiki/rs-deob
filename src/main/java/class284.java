import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class284 {

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
    public static int field3697 = 0;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "Lnj;")
    public static class415 field3691 = new class415(19, 0);

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
    public static int field3690;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
    public static int field3692;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
    public static int field3693;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
    public static int field3694;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
    public static int field3696;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "Lpe;")
    public static class615 field3695;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lfd;Z)Lqo;", line = 3)
    public static final class187 method1695(class418 arg0, boolean arg1) {
        field3693++;
        class41 var2 = class432.method2472(arg0, (byte) 122);
        int var3 = arg0.method2355(88);
        if (arg1) {
            method1696(45);
        }
        int var4 = arg0.method2355(106);
        return new class187(var2.field579, var2.field574, var2.field581, var2.field582, var2.field584, var2.field585, var2.field575, var2.field587, var2.field586, var3, var4);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V", line = 20)
    public static final void method1696(int arg0) {
        field3696++;
        if (arg0 >= -30) {
            field3691 = null;
        }
        for (int var1 = 0; var1 < 5; var1++) {
            class86.field1150[var1] = false;
        }
        class424.field5505 = -1;
        class704.field9810 = 1;
        class235.field3140 = 0;
        class71.field965 = 0;
        class660.field9205 = -1;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V", line = 47)
    public static void method1697(byte arg0) {
        if (arg0 <= 105) {
            field3690 = 56;
        }
        field3695 = null;
        field3691 = null;
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)Z", line = 59)
    public static final boolean method1698(int arg0) {
        if (arg0 != 0) {
            method1699(null, 85);
        }
        field3694++;
        if (class508.field6667) {
            try {
                class92.method688(arg0 ^ 0xFFFFCBBB, "showVideoAd", class348.field4462);
                return true;
            } catch (Throwable var1) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lfd;I)Ldv;", line = 83)
    public static final class112 method1699(class418 arg0, int arg1) {
        field3692++;
        String var2 = arg0.method2394(4);
        class562 var3 = class167.method1156(arg1 ^ 0x5D)[arg0.method2396(-119)];
        class573 var4 = class239.method1507((byte) -37)[arg0.method2396(-21)];
        int var5 = arg0.method2383(arg1 ^ 0xFF13);
        int var6 = arg0.method2383(65280);
        int var7 = arg0.method2396(arg1 ^ 0xFFFFFFE8);
        int var8 = arg0.method2396(15);
        int var9 = arg0.method2396(57);
        int var10 = arg0.method2393(arg1 ^ 0xFFFF87EA);
        int var11 = arg0.method2393(-30727);
        int var12 = arg0.method2355(45);
        if (arg1 != 19) {
            method1696(-10);
        }
        int var13 = arg0.method2355(arg1 + 94);
        int var14 = arg0.method2355(92);
        return new class112(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14);
    }
}
