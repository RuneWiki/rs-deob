import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class103 extends class456 {

    @OriginalMember(owner = "client!fd", name = "I", descriptor = "I")
    private int field1435 = 1;

    @OriginalMember(owner = "client!fd", name = "J", descriptor = "I")
    private int field1436 = 1;

    @OriginalMember(owner = "client!fd", name = "Q", descriptor = "I")
    private int field1443 = 204;

    @OriginalMember(owner = "client!fd", name = "P", descriptor = "[Z")
    public static boolean[] field1442 = new boolean[100];

    @OriginalMember(owner = "client!fd", name = "L", descriptor = "Lsh;")
    public static class472 field1438 = new class472(3, -2);

    @OriginalMember(owner = "client!fd", name = "R", descriptor = "Lct;")
    public static class285 field1444;

    @OriginalMember(owner = "client!fd", name = "H", descriptor = "I")
    public static int field1434;

    @OriginalMember(owner = "client!fd", name = "K", descriptor = "I")
    public static int field1437;

    @OriginalMember(owner = "client!fd", name = "M", descriptor = "I")
    public static int field1439;

    @OriginalMember(owner = "client!fd", name = "N", descriptor = "I")
    public static int field1440;

    @OriginalMember(owner = "client!fd", name = "O", descriptor = "I")
    public static int field1441;

    @OriginalMember(owner = "client!fd", name = "S", descriptor = "Les;")
    public static class441 field1445;

    static {
        new class332("You will be un-muted within 24 hours.", "Du wirst innerhalb der nächsten 24 Stunden wieder sprechen können.", "Vous aurez à nouveau accès à la messagerie instantanée dans 24 heures.", "O veto será retirado dentro de 24 horas.");
        field1444 = new class285(1, 8);
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "()V", line = 12)
    public class103() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIII)Z", line = 15)
    public static final boolean method775(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1440;
        if (~(arg4 & class246.field3532[0][arg1][arg2]) != -1) {
            return true;
        } else if (~(class246.field3532[arg3][arg1][arg2] & 16) != -1) {
            return false;
        } else {
            return class427.method2510(arg1, arg3, 255, arg2) == arg0;
        }
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(II)[I", line = 40)
    public final int[] method33(int arg0, int arg1) {
        ++field1441;
        if (arg0 != -1) {
            method775(-39, 69, -93, 91, -127);
        }
        int[] var3 = super.field6466.method2533(true, arg1);
        if (super.field6466.field6153) {
            for (int var4 = 0; var4 < class156.field2169; ++var4) {
                int var5 = class288.field4397[var4];
                int var6 = class14.field206[arg1];
                int var7 = this.field1435 * var5 >> 12;
                int var8 = this.field1436 * var6 >> 12;
                int var9 = var5 % (4096 / this.field1435) * this.field1435;
                int var10 = var6 % (4096 / this.field1436) * this.field1436;
                if (var10 < this.field1443) {
                    for (var7 -= var8; ~var7 > -1; var7 += 4) {
                    }
                    while (var7 > 3) {
                        var7 -= 4;
                    }
                    if (var7 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (~var9 > ~this.field1443) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (this.field1443 > var9) {
                    int var11;
                    for (var11 = var7 - var8; var11 < 0; var11 += 4) {
                    }
                    while (~var11 < -4) {
                        var11 -= 4;
                    }
                    if (~var11 < -1) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Ljava/awt/Canvas;B)Ltn;", line = 130)
    public static final class402 method776(Canvas arg0, byte arg1) {
        ++field1439;
        try {
            if (arg1 != 8) {
                return null;
            } else {
                Class var2 = Class.forName("tc");
                class402 var3 = (class402) var2.newInstance();
                var3.method2356(0, arg0);
                return var3;
            }
        } catch (Throwable var5) {
            class391 var4 = new class391();
            var4.method2356(0, arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IBLre;)V", line = 153)
    public final void method210(int arg0, byte arg1, class446 arg2) {
        if (arg1 != 55) {
            this.method210(21, (byte) 29, (class446) null);
        }
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    this.field1443 = arg2.method2631(arg1 ^ 2517);
                }
            } else {
                this.field1436 = arg2.method2628(49152);
            }
        } else {
            this.field1435 = arg2.method2628(49152);
        }
        ++field1437;
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(B)V", line = 196)
    public static void method777(byte arg0) {
        field1445 = null;
        field1442 = null;
        field1444 = null;
        if (arg0 <= 32) {
            method776((Canvas) null, (byte) -67);
        }
        field1438 = null;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IZ)V", line = 209)
    public static final void method778(int arg0, boolean arg1) {
        if (!arg1) {
            method777((byte) 3);
        }
        ++field1434;
        if (class330.field4947 != arg0) {
            class379.field5642 = class456.field6477 = class9.field152[arg0];
            class138.field1976.method577(50, (int) ((double) class379.field5642 * 34.46D));
            class406.field5898 = new int[class379.field5642][class456.field6477];
            class324.field4870 = new int[class379.field5642][class456.field6477];
            class38.field530 = new int[4][class379.field5642 >> 3][class456.field6477 >> 3];
            for (int var2 = 0; ~var2 > -5; ++var2) {
                class183.field2717[var2] = class257.method1701((byte) -102, class379.field5642, class456.field6477);
            }
            class134.field1954 = new byte[4][class379.field5642][class456.field6477];
            class469.method2749(class379.field5642, class456.field6477, 4, -100);
            class424.method2499(class379.field5642 >> 3, class138.field1976, class456.field6477 >> 3, 1);
            class330.field4947 = arg0;
        }
    }
}
