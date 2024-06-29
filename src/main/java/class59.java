import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public abstract class class59 {

    @OriginalMember(owner = "client!v", name = "a", descriptor = "Lvf;")
    public static class265 field1190 = class87.method582(-46, "sch-Utteln:");

    @OriginalMember(owner = "client!v", name = "e", descriptor = "[Lvf;")
    public static class265[] field1194 = new class265[100];

    @OriginalMember(owner = "client!v", name = "f", descriptor = "Lvf;")
    public static class265 field1195 = class87.method582(-46, "k");

    @OriginalMember(owner = "client!v", name = "i", descriptor = "Lvf;")
    public static class265 field1198 = class87.method582(-46, "Titelbild geladen)3");

    @OriginalMember(owner = "client!v", name = "b", descriptor = "I")
    public static int field1191;

    @OriginalMember(owner = "client!v", name = "d", descriptor = "I")
    public static int field1193;

    @OriginalMember(owner = "client!v", name = "h", descriptor = "I")
    public static int field1197;

    @OriginalMember(owner = "client!v", name = "j", descriptor = "I")
    public static int field1199;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "Lmh;")
    public static class114 field1192;

    @OriginalMember(owner = "client!v", name = "g", descriptor = "[Lvj;")
    public static class88[] field1196;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V")
    public static final void method438(int arg0) {
        if (arg0 == 0) {
            field1197++;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lfl;IIZ)[Loe;")
    public static final class108[] method439(class192 arg0, int arg1, int arg2, boolean arg3) {
        field1193++;
        if (class28.method239(50, arg0, arg2, arg1)) {
            return arg3 ? class43.method363((byte) 23) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(B)V")
    public static void method440(byte arg0) {
        field1196 = null;
        field1194 = null;
        field1198 = null;
        field1195 = null;
        field1190 = null;
        if (arg0 != 34) {
            method441(80, false, -75, 22, 77);
        }
        field1192 = null;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IZIII)V")
    public static final void method441(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field1191++;
        if (class202.method1390(2, arg0)) {
            if (arg4 != 0) {
                method438(105);
            }
            class147.method1012(class178.field3174[arg0], arg2, -1, arg1, arg3, (byte) -15);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public abstract void method442(byte arg0, Component arg1);

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(I)I")
    public abstract int method443(int arg0);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method444(Component arg0, int arg1);

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(I)V")
    public static final void method445(int arg0) {
        field1199++;
        class267.field4700 = 0;
        class131.field2376 = 0;
        class142.method978((byte) 123);
        class97.method648((byte) -26);
        class240.method1607(9533);
        for (int var1 = 0; var1 < class267.field4700; var1++) {
            int var4 = class279.field4944[var1];
            if (class93.field1655 != class4.field67[var4].field2542) {
                if (class4.field67[var4].field681.method1827(122)) {
                    class72.method511((byte) -89, class4.field67[var4]);
                }
                class4.field67[var4].method223((byte) -101, (class268) null);
                class4.field67[var4] = null;
            }
        }
        int var2 = -33 / ((arg0 - 66) / 37);
        if (class221.field3966 != class207.field3730.field2449) {
            throw new RuntimeException("gnp1 pos:" + class207.field3730.field2449 + " psize:" + class221.field3966);
        }
        for (int var3 = 0; var3 < class48.field1027; var3++) {
            if (class4.field67[class93.field1646[var3]] == null) {
                throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class48.field1027);
            }
        }
    }
}
