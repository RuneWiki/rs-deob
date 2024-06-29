import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public class class254 {

    @OriginalMember(owner = "client!hu", name = "c", descriptor = "I")
    public static int field3553 = 1403;

    @OriginalMember(owner = "client!hu", name = "g", descriptor = "[I")
    public static int[] field3557 = new int[6];

    @OriginalMember(owner = "client!hu", name = "e", descriptor = "I")
    public static int field3555 = 0;

    @OriginalMember(owner = "client!hu", name = "d", descriptor = "[B")
    public static byte[] field3554 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!hu", name = "j", descriptor = "[Ldu;")
    public static class479[] field3560;

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "I")
    public static int field3552;

    @OriginalMember(owner = "client!hu", name = "f", descriptor = "I")
    public static int field3556;

    @OriginalMember(owner = "client!hu", name = "h", descriptor = "I")
    public static int field3558;

    @OriginalMember(owner = "client!hu", name = "i", descriptor = "I")
    public static int field3559;

    @OriginalMember(owner = "client!hu", name = "k", descriptor = "I")
    public static int field3561;

    @OriginalMember(owner = "client!hu", name = "l", descriptor = "I")
    public static int field3562;

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "Lfc;")
    public static class343 field3551;

    static {
        new class112("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Impossible de supprimer un ami - système occupé.", "Não foi possível excluir o amigo. O sistema está ocupado.");
        field3560 = new class479[5];
        for (int var0 = 0; var0 < field3560.length; var0++) {
            field3560[var0] = new class479();
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(ZLkm;J)V", line = 3)
    public static final void method1575(boolean arg0, class487 arg1, long arg2) {
        class466.field6541 = class197.field2833;
        field3556++;
        class159.field2300 = 0;
        class197.field2833 = 0;
        long var4 = class193.method1237(-9581);
        if (!arg0) {
            return;
        }
        for (class83 var6 = (class83) class70.field1038.method2823(39); var6 != null; var6 = (class83) class70.field1038.method2818(0)) {
            if (var6.method575(arg1, arg2)) {
                class159.field2300++;
            }
        }
        if (class488.field6889 && arg2 % 100L == 0L) {
            System.out.println("Particle system count: " + class70.field1038.method2816(77) + ", running: " + class159.field2300 + ". Particles: " + class197.field2833 + ". Time taken: " + (class193.method1237(-9581) - var4) + "ms");
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(III)Z", line = 54)
    public static final boolean method1576(int arg0, int arg1, int arg2) {
        field3559++;
        class475 var3 = class304.field4160.method2075(arg0, false);
        if (~arg1 == arg2) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var3.method2781(false, arg1);
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(I)V", line = 71)
    public static void method1577(int arg0) {
        field3551 = null;
        field3554 = null;
        if (arg0 <= 101) {
            field3553 = -108;
        }
        field3557 = null;
        field3560 = null;
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(IIIIIII)V", line = 84)
    public static final void method1578(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3552++;
        class363 var7 = class485.method2840(arg2, arg0, (byte) 21);
        if (var7 == null) {
            return;
        }
        if (var7.field5057 != null) {
            class32 var8 = new class32();
            var8.field518 = var7.field5057;
            var8.field517 = var7;
            class212.method1331(var8);
        }
        class299.field4106 = arg5;
        class416.field5733 = arg3;
        class58.field919 = arg2;
        class99.field1406 = arg0;
        class227.field3209 = arg1;
        class184.field2678 = true;
        class202.field2897 = var7.field5195;
        if (arg4 == -6) {
            class90.field1346 = arg6;
            class356.method2141(-74, var7);
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(ILdq;)[Lrd;", line = 122)
    public static final class275[] method1579(int arg0, class14 arg1) {
        field3561++;
        if (!arg1.method122(false)) {
            return new class275[0];
        }
        class420 var2 = arg1.method138(arg0 - 5866);
        while (var2.field5789 == 0) {
            class258.method1603(-649, 10L);
        }
        if (var2.field5789 == 2) {
            return new class275[0];
        }
        int[] var3 = (int[]) var2.field5791;
        class275[] var4 = new class275[var3.length >> 2];
        if (arg0 != 5878) {
            return null;
        }
        for (int var5 = 0; var5 < var4.length; var5++) {
            class275 var6 = new class275();
            var4[var5] = var6;
            var6.field3811 = var3[var5 << 2];
            var6.field3802 = var3[(var5 << 2) + 1];
            var6.field3808 = var3[(var5 << 2) + 2];
            var6.field3805 = var3[(var5 << 2) + 3];
        }
        return var4;
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(ZIZ)I", line = 177)
    public static final int method1580(boolean arg0, int arg1, boolean arg2) {
        field3558++;
        if (arg2) {
            return 0;
        }
        class459 var3 = class27.method228((byte) -116, arg2, arg1);
        if (var3 == null) {
            return class101.field1446.method81((byte) 111, arg1).field4647;
        }
        int var4 = 0;
        if (arg0) {
            method1579(8, (class14) null);
        }
        for (int var5 = 0; var5 < var3.field6464.length; var5++) {
            if (var3.field6464[var5] == -1) {
                var4++;
            }
        }
        return var4 + (class101.field1446.method81((byte) 111, arg1).field4647 - var3.field6464.length);
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(IBLjava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)V", line = 223)
    public static final void method1581(int arg0, byte arg1, String arg2, String arg3, int arg4, String arg5, int arg6, String arg7) {
        field3562++;
        for (int var8 = 99; var8 > 0; var8--) {
            class418.field5747[var8] = class418.field5747[var8 - 1];
            class446.field6155[var8] = class446.field6155[var8 - 1];
            class48.field784[var8] = class48.field784[var8 - 1];
            class224.field3182[var8] = class224.field3182[var8 - 1];
            class265.field3686[var8] = class265.field3686[var8 - 1];
            class166.field2441[var8] = class166.field2441[var8 - 1];
            class133.field1881[var8] = class133.field1881[var8 - 1];
        }
        class418.field5747[0] = arg4;
        class446.field6155[0] = arg6;
        int var9 = 30 / ((-arg1 - 40) / 36);
        class48.field784[0] = arg2;
        class224.field3182[0] = arg7;
        class265.field3686[0] = arg3;
        class471.field6595 = class122.field1700;
        class133.field1881[0] = arg0;
        class166.field2441[0] = arg5;
        class55.field889++;
    }
}
