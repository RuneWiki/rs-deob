import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class97 {

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "D")
    public static double field1767 = -1.0D;

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "Lbd;")
    public static class162 field1762 = class17.method142(0, "settings");

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "Lbd;")
    public static class162 field1764 = class17.method142(0, "Fertigkeit: ");

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "I")
    public int field1761;

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "I")
    public int field1765;

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "I")
    public static int field1769;

    @OriginalMember(owner = "client!hk", name = "j", descriptor = "I")
    public int field1770;

    @OriginalMember(owner = "client!hk", name = "k", descriptor = "I")
    public static int field1771;

    @OriginalMember(owner = "client!hk", name = "l", descriptor = "I")
    public int field1772;

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "Lda;")
    public static class143 field1768;

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "Ldc;")
    public static class71 field1766;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIBII)V", line = 8)
    public static final void method777(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        class298.field4989 = arg0;
        class82.field1426 = arg3;
        if (arg2 != -91) {
            method777(-85, 72, (byte) 12, -11, -112);
        }
        field1763++;
        class303.field5106 = arg4;
        class112.field2028 = arg1;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(B)V", line = 27)
    public static void method778(byte arg0) {
        field1764 = null;
        field1768 = null;
        field1766 = null;
        field1762 = null;
        if (arg0 != 50) {
            method781(-114);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Z)V", line = 40)
    public static final void method779(boolean arg0) {
        class4.field29 = 0;
        class267.field4446 = 0;
        field1771++;
        class259.method1789(118);
        class104.method845(-121);
        class102.method836((byte) -45);
        if (arg0) {
            field1766 = (class71) null;
        }
        for (int var1 = 0; var1 < class4.field29; var1++) {
            int var2 = class181.field3116[var1];
            if (class90.field1598 != class204.field3446[var2].field5051) {
                if (class204.field3446[var2].field926.method640(5782)) {
                    class22.method182(false, class204.field3446[var2]);
                }
                class204.field3446[var2].field926 = null;
                class204.field3446[var2] = null;
            }
        }
        if (class244.field4045 != class63.field975.field1653) {
            throw new RuntimeException("gnp1 pos:" + class63.field975.field1653 + " psize:" + class244.field4045);
        }
        for (int var3 = 0; var3 < class31.field520; var3++) {
            if (class204.field3446[class278.field4674[var3]] == null) {
                throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class31.field520);
            }
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(III)Llk;", line = 96)
    public static final class138 method780(int arg0, int arg1, int arg2) {
        class225 var3 = class288.field4856[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class138 var4 = var3.field3775;
            var3.field3775 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)V", line = 109)
    public static final void method781(int arg0) {
        field1769++;
        for (int var1 = 0; var1 < 5; var1++) {
            class228.field3795[var1] = false;
        }
        class73.field1169 = -1;
        class302.field5085 = 1;
        class168.field2951 = arg0;
    }
}
