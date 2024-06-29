import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class204 {

    @OriginalMember(owner = "client!dp", name = "k", descriptor = "Ltm;")
    public static class112 field2927 = new class112("glow1:", "leuchten1:", "brillant1:", "brilho1:");

    @OriginalMember(owner = "client!dp", name = "m", descriptor = "Lbd;")
    public static class464 field2929 = new class464(11, 17);

    @OriginalMember(owner = "client!dp", name = "o", descriptor = "Z")
    public static boolean field2931;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "I")
    public int field2917;

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "I")
    public static int field2918;

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "I")
    public int field2919;

    @OriginalMember(owner = "client!dp", name = "e", descriptor = "I")
    public int field2921;

    @OriginalMember(owner = "client!dp", name = "f", descriptor = "I")
    public int field2922;

    @OriginalMember(owner = "client!dp", name = "g", descriptor = "I")
    public static int field2923;

    @OriginalMember(owner = "client!dp", name = "h", descriptor = "I")
    public int field2924;

    @OriginalMember(owner = "client!dp", name = "j", descriptor = "I")
    public int field2926;

    @OriginalMember(owner = "client!dp", name = "l", descriptor = "I")
    public int field2928;

    @OriginalMember(owner = "client!dp", name = "n", descriptor = "Lfc;")
    public static class343 field2930;

    @OriginalMember(owner = "client!dp", name = "d", descriptor = "[B")
    public byte[] field2920;

    @OriginalMember(owner = "client!dp", name = "i", descriptor = "[B")
    public byte[] field2925;

    static {
        new class112("You can't report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-même !", "Você não pode denunciar a si próprio!");
        field2931 = false;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(Lmr;III[Z)V", line = 6)
    public static final void method1291(class173 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class8.field166 == class317.field4306) {
            return;
        }
        int var5 = class366.field5215[arg1].method701(arg2, arg3);
        for (int var6 = 0; var6 <= arg1; var6++) {
            if (arg4 == null || arg4[var6]) {
                class269 var7 = class366.field5215[var6];
                if (var7 != null) {
                    var7.method705(arg0, arg2, var5 - var7.method701(arg2, arg3), arg3, 0, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(Ldq;Ljava/awt/Frame;I)V", line = 41)
    public static final void method1292(class14 arg0, Frame arg1, int arg2) {
        while (true) {
            class420 var3 = arg0.method137(arg1, -1614);
            while (var3.field5789 == 0) {
                class258.method1603(-649, 10L);
            }
            if (var3.field5789 == 1) {
                field2923++;
                arg1.setVisible(false);
                arg1.dispose();
                if (arg2 != -2) {
                    field2931 = true;
                    return;
                }
                return;
            }
            class258.method1603(-649, 100L);
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(I)V", line = 69)
    public static void method1293(int arg0) {
        field2930 = null;
        field2927 = null;
        if (arg0 == 9711) {
            field2929 = null;
        }
    }
}
