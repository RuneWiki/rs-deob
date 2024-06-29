import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public abstract class class255 {

    @OriginalMember(owner = "client!na", name = "b", descriptor = "I")
    public static int field4490 = 0;

    @OriginalMember(owner = "client!na", name = "g", descriptor = "Lda;")
    private static class275 field4495 = method1672(119, "Checking for updates )2 ");

    @OriginalMember(owner = "client!na", name = "f", descriptor = "Lda;")
    public static class275 field4494 = method1672(95, "m-Ochte mit Ihnen handeln)3");

    @OriginalMember(owner = "client!na", name = "h", descriptor = "Lda;")
    public static class275 field4496 = field4495;

    @OriginalMember(owner = "client!na", name = "n", descriptor = "[I")
    public static int[] field4502 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!na", name = "p", descriptor = "Lda;")
    public static class275 field4504 = method1672(111, ":assist:");

    @OriginalMember(owner = "client!na", name = "e", descriptor = "[S")
    public static short[] field4493 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!na", name = "o", descriptor = "I")
    public static int field4503 = 50;

    @OriginalMember(owner = "client!na", name = "j", descriptor = "[[I")
    public static int[][] field4498 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!na", name = "l", descriptor = "Lda;")
    public static class275 field4500 = method1672(107, "rot:");

    @OriginalMember(owner = "client!na", name = "a", descriptor = "I")
    public static int field4489;

    @OriginalMember(owner = "client!na", name = "c", descriptor = "I")
    public static int field4491;

    @OriginalMember(owner = "client!na", name = "i", descriptor = "I")
    public static int field4497;

    @OriginalMember(owner = "client!na", name = "q", descriptor = "I")
    public static int field4505;

    @OriginalMember(owner = "client!na", name = "r", descriptor = "I")
    public static int field4506;

    @OriginalMember(owner = "client!na", name = "k", descriptor = "Lma;")
    public static class105 field4499;

    @OriginalMember(owner = "client!na", name = "m", descriptor = "Lfd;")
    public static class229 field4501;

    @OriginalMember(owner = "client!na", name = "d", descriptor = "Llg;")
    public static class266 field4492;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method157(Component arg0, int arg1);

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ZJ)V")
    public static final void method1671(boolean arg0, long arg1) {
        field4491++;
        if (arg1 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class16.field240; var3++) {
            if (class139.field2440[var3] == arg1) {
                class16.field240--;
                class4.field56++;
                for (int var4 = var3; var4 < class16.field240; var4++) {
                    class139.field2440[var4] = class139.field2440[var4 + 1];
                    class165.field2875[var4] = class165.field2875[var4 + 1];
                }
                class156.field2753 = class209.field3533;
                class149.field2597.method526((byte) -70, 236);
                class149.field2597.method560(arg1, -92);
                break;
            }
        }
        if (!arg0) {
            field4499 = null;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ILjava/lang/String;)Lda;")
    public static final class275 method1672(int arg0, String arg1) {
        field4489++;
        byte[] var2 = arg1.getBytes();
        int var3 = var2.length;
        class275 var4 = new class275();
        var4.field4749 = new byte[var3];
        if (arg0 < 91) {
            field4493 = null;
        }
        int var5 = 0;
        while (var5 < var3) {
            int var6 = var2[var5++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var3 <= var5) {
                    break;
                }
                int var7 = var2[var5++] & 0xFF;
                var4.field4749[var4.field4752++] = (byte) (var6 * 43 + var7 - 1720 - 48);
            } else if (var6 != 0) {
                var4.field4749[var4.field4752++] = (byte) var6;
            }
        }
        var4.method1827(9151);
        return var4.method1855((byte) -2);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lma;ZIILma;)Lrh;")
    public static final class21 method1673(class105 arg0, boolean arg1, int arg2, int arg3, class105 arg4) {
        field4505++;
        if (!arg1) {
            method1675((byte) 54);
        }
        return class210.method1353(arg2, arg0, arg3, (byte) -106) ? class63.method435(arg4.method775(arg3, arg2, -24799), -1) : null;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method158(int arg0, Component arg1);

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIIILak;IJ)Z")
    public static final boolean method1674(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class234 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class231.method1499(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(B)I")
    public abstract int method156(byte arg0);

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(B)V")
    public static void method1675(byte arg0) {
        field4496 = null;
        field4498 = null;
        field4504 = null;
        field4500 = null;
        if (arg0 < 107) {
            return;
        }
        field4495 = null;
        field4499 = null;
        field4501 = null;
        field4502 = null;
        field4493 = null;
        field4492 = null;
        field4494 = null;
    }
}
