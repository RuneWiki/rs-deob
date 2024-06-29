import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class144 extends class202 {

    @OriginalMember(owner = "client!lg", name = "M", descriptor = "I")
    private int field1939 = 32768;

    @OriginalMember(owner = "client!lg", name = "L", descriptor = "Lss;")
    public static class213 field1938 = new class213("Loading title screen - ", "Lade Titelbild - ", "Chargement de l'écran-titre - ", "Carregando tela título - ");

    @OriginalMember(owner = "client!lg", name = "P", descriptor = "[I")
    public static int[] field1942 = new int[13];

    @OriginalMember(owner = "client!lg", name = "I", descriptor = "I")
    public static int field1935;

    @OriginalMember(owner = "client!lg", name = "J", descriptor = "I")
    public static int field1936;

    @OriginalMember(owner = "client!lg", name = "K", descriptor = "I")
    public static int field1937;

    @OriginalMember(owner = "client!lg", name = "N", descriptor = "I")
    public static int field1940;

    @OriginalMember(owner = "client!lg", name = "O", descriptor = "I")
    public static int field1941;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(II)[[I")
    public final int[][] method44(int arg0, int arg1) {
        ++field1941;
        if (arg0 != -1) {
            this.method41(-73, false);
        }
        int[][] var3 = super.field3081.method1050(arg1, -121);
        if (super.field3081.field2432) {
            int[] var4 = this.method1376(1046794076, 1, arg1);
            int[] var5 = this.method1376(1046794076, 2, arg1);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; var9 < class276.field4375; ++var9) {
                int var10 = (var4[var9] * 255 & 1047811) >> 12;
                int var11 = var5[var9] * this.field1939 >> 12;
                int var12 = class237.field3882[var10] * var11 >> 12;
                int var13 = class425.field6440[var10] * var11 >> 12;
                int var14 = var9 - -(var12 >> 12) & class538.field7882;
                int var15 = class335.field5237 & (var13 >> 12) + arg1;
                int[][] var16 = this.method1382(0, var15, 104);
                var6[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "()V")
    public class144() {
        super(3, false);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V")
    public final void method51(int arg0) {
        ++field1937;
        class62.method461(101);
        int var2 = -55 % ((80 - arg0) / 46);
    }

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "(I)V")
    public static void method868(int arg0) {
        field1938 = null;
        if (arg0 != 885873836) {
            method868(101);
        }
        field1942 = null;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lhw;BI)V")
    public final void method40(class208 arg0, byte arg1, int arg2) {
        ++field1935;
        int var4 = 95 % ((arg1 - -46) / 50);
        if (~arg2 != -1) {
            if (~arg2 == -2) {
                super.field3071 = arg0.method1445(-94) == 1;
            }
        } else {
            this.field1939 = arg0.method1455(-3387) << 4;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IZ)[I")
    public final int[] method41(int arg0, boolean arg1) {
        ++field1936;
        int[] var3 = super.field3064.method2452((byte) 34, arg0);
        if (!arg1) {
            this.method44(22, 16);
        }
        if (super.field3064.field5837) {
            int[] var4 = this.method1376(1046794076, 1, arg0);
            int[] var5 = this.method1376(1046794076, 2, arg0);
            for (int var6 = 0; var6 < class276.field4375; ++var6) {
                int var7 = (4084 & var4[var6]) >> 4;
                int var8 = var5[var6] * this.field1939 >> 12;
                int var9 = class237.field3882[var7] * var8 >> 12;
                int var10 = class425.field6440[var7] * var8 >> 12;
                int var11 = var6 - -(var9 >> 12) & class538.field7882;
                int var12 = arg0 - -(var10 >> 12) & class335.field5237;
                int[] var13 = this.method1376(1046794076, 0, var12);
                var3[var6] = var13[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(BLjava/lang/String;ILpb;)Ljl;")
    public static final class495 method869(byte arg0, String arg1, int arg2, class2 arg3) {
        if (arg0 >= -46) {
            method868(-98);
        }
        ++field1940;
        if (arg2 == 0) {
            return arg3.method11(arg1, (byte) 107);
        } else if (arg2 == 1) {
            try {
                class200.method1369(arg3.field27, new Object[] { (new URL(arg3.field27.getCodeBase(), arg1)).toString() }, "openjs", (byte) -103);
                class495 var4 = new class495();
                var4.field7458 = 1;
                return var4;
            } catch (Throwable var10) {
                class495 var5 = new class495();
                var5.field7458 = 2;
                return var5;
            }
        } else if (~arg2 == -3) {
            try {
                arg3.field27.getAppletContext().showDocument(new URL(arg3.field27.getCodeBase(), arg1), "_blank");
                class495 var6 = new class495();
                var6.field7458 = 1;
                return var6;
            } catch (Exception var11) {
                class495 var7 = new class495();
                var7.field7458 = 2;
                return var7;
            }
        } else if (arg2 == 3) {
            try {
                class200.method1370(103, arg3.field27, "loggedout");
            } catch (Throwable var13) {
            }
            try {
                arg3.field27.getAppletContext().showDocument(new URL(arg3.field27.getCodeBase(), arg1), "_top");
                class495 var8 = new class495();
                var8.field7458 = 1;
                return var8;
            } catch (Exception var12) {
                class495 var9 = new class495();
                var9.field7458 = 2;
                return var9;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    static {
        new class213("You do not have a high enough rank to join this clan channel.", "Dein Rang reicht nicht aus, um diesen Chatraum zu betreten.", "Votre rang n'est pas assez élevé pour rejoindre ce canal de clan.", "Sua posição não é alta o suficiente para você entrar nesse canal de clã.");
    }
}
