import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class227 extends class211 {

    @OriginalMember(owner = "client!km", name = "v", descriptor = "Ljava/lang/String;")
    public static String field3484;

    @OriginalMember(owner = "client!km", name = "k", descriptor = "I")
    public static int field3473;

    @OriginalMember(owner = "client!km", name = "l", descriptor = "I")
    public static int field3474;

    @OriginalMember(owner = "client!km", name = "o", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!km", name = "p", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!km", name = "q", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!km", name = "r", descriptor = "I")
    public int field3480;

    @OriginalMember(owner = "client!km", name = "s", descriptor = "I")
    public static int field3481;

    @OriginalMember(owner = "client!km", name = "t", descriptor = "I")
    public int field3482;

    @OriginalMember(owner = "client!km", name = "u", descriptor = "I")
    public int field3483;

    @OriginalMember(owner = "client!km", name = "m", descriptor = "Lps;")
    public class59 field3475;

    @OriginalMember(owner = "client!km", name = "n", descriptor = "[Lni;")
    public class346[] field3476;

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(B)V")
    public static void method1366(byte arg0) {
        if (arg0 != -49) {
            field3484 = null;
        }
        field3484 = null;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IIB)Z")
    public static final boolean method1367(int arg0, int arg1, byte arg2) {
        field3481++;
        int var3 = -90 % ((arg2 - 4) / 37);
        return class111.method799(1, arg0, arg1) | (arg0 & 0x60000) != 0 || class78.method567(arg0, (byte) -118, arg1) || class366.method2212(arg0, arg1, (byte) 93);
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IIILqq;)Z")
    public final boolean method1368(int arg0, int arg1, int arg2, class318 arg3) {
        field3479++;
        int var5 = -67 % ((arg0 + 2) / 45);
        if (this.field3476 != null) {
            for (int var6 = 0; var6 < this.field3476.length; var6++) {
                if (this.field3476[var6].method2115(arg2, arg1) && this.field3475.method162(arg3, (byte) -44, arg2, arg1)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(ZI)V")
    public static final void method1369(boolean arg0, int arg1) {
        if (!arg0) {
            return;
        }
        field3478++;
        class273.field4150 = 3;
        class462.field7107 = arg1;
        class28.field358 = -1;
        class102.field1822 = 100;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(ILod;IILqq;Lll;Lgf;Z)V")
    public static final void method1370(int arg0, class334 arg1, int arg2, int arg3, class318 arg4, class235 arg5, class173 arg6, boolean arg7) {
        field3474++;
        int var8 = arg1.field4983 - (arg3 / 2) - 5;
        int var9 = arg0 + 2;
        if (arg6.field2687 != 0) {
            arg4.method1943(var8, arg6.field2687, var9, arg0 + (arg5.method1417() * arg2) + 1 - var9, 1, arg3 + 10);
        }
        if (arg6.field2695 != 0) {
            arg4.method1920(arg3 + 10, arg6.field2695, var8, arg0 + arg5.method1417() * arg2 + 1 - var9, 22437, var9);
        }
        int var10 = arg6.field2673;
        if (arg1.field4984 && arg6.field2685 != -1) {
            var10 = arg6.field2685;
        }
        if (!arg7) {
            method1372(-3);
        }
        for (int var11 = 0; var11 < arg2; var11++) {
            String var12 = class481.field7349[var11];
            if ((arg2 - 1) > var11) {
                var12 = var12.substring(0, var12.length() - 4);
            }
            arg5.method1412(arg4, var12, arg1.field4983, arg0, var10, true);
            arg0 += arg5.method1417();
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(ZIIII)V")
    public static final void method1371(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field3477++;
        class64 var5 = class230.method1387(arg2, (byte) 40, 4);
        var5.method441((byte) 58);
        if (arg0) {
            var5.field1059 = arg1;
            var5.field1054 = arg4;
            var5.field1051 = arg3;
        }
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(I)V")
    public static final void method1372(int arg0) {
        class197.method1223(class463.field7116.field2957, 2, 22050, 8000);
        int var1 = -127 / ((18 - arg0) / 33);
        field3473++;
        class220.field3381 = new class88();
        class220.field3381.method637((byte) -89, 9, 128);
        class462.field7108 = class85.method603(22050, 0, class7.field86, class257.field3919, 14405);
        class462.field7108.method1640(class220.field3381, -69);
        class239.method1432(-118, class131.field2087, class220.field3381, class226.field3466, class173.field2694);
        class386.field5607 = class85.method603(2048, 1, class7.field86, class257.field3919, 14405);
        class178.field2786 = new class340();
        class386.field5607.method1640(class178.field2786, -48);
        class225.field3461 = new class115(22050, class170.field2646);
        class131.field2092 = class471.field7207.method2720("scape main", 1);
    }

    static {
        new class423(null, "Spieler nicht auf deiner Freunde-Liste.", null, null);
        field3484 = null;
    }
}
