import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class24 extends class354 {

    @OriginalMember(owner = "client!o", name = "J", descriptor = "I")
    private int field423 = -1;

    @OriginalMember(owner = "client!o", name = "K", descriptor = "Lgf;")
    public static class180 field424 = new class180("Prepared sound engine", "Musik-Engine vorbereitet.", "Moteur son préparé", "Mecanismo de som preparado");

    @OriginalMember(owner = "client!o", name = "U", descriptor = "Z")
    public static boolean field434 = false;

    @OriginalMember(owner = "client!o", name = "H", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "client!o", name = "I", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!o", name = "L", descriptor = "I")
    public int field425;

    @OriginalMember(owner = "client!o", name = "N", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "client!o", name = "O", descriptor = "I")
    public static int field428;

    @OriginalMember(owner = "client!o", name = "P", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!o", name = "Q", descriptor = "I")
    public static int field430;

    @OriginalMember(owner = "client!o", name = "R", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "client!o", name = "S", descriptor = "I")
    public int field432;

    @OriginalMember(owner = "client!o", name = "T", descriptor = "I")
    public static int field433;

    @OriginalMember(owner = "client!o", name = "V", descriptor = "Lhh;")
    public static class84 field435;

    @OriginalMember(owner = "client!o", name = "M", descriptor = "[I")
    public int[] field426;

    static {
        new class180("To interact with this please login to a members' server.", "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.", "Veuillez vous connecter à un serveur d'abonnés pour cette interaction.", "Para interagir, acesse um servidor para membros.");
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V", line = 5)
    public class24() {
        super(0, false);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIILqg;[I[I)Lop;", line = 9)
    public static final class124 method199(int arg0, int arg1, int arg2, class321 arg3, int[] arg4, int[] arg5) {
        ++field430;
        byte[] var6 = new byte[arg1 * arg2];
        int var7 = 0;
        if (arg0 > -109) {
            return null;
        } else {
            while (var7 < arg2) {
                int var8 = arg1 * var7 - -arg4[var7];
                for (int var9 = 0; ~arg5[var7] < ~var9; ++var9) {
                    var6[var8++] = -1;
                }
                ++var7;
            }
            return new class124(arg3, arg1, arg2, var6);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IILm;ILci;Ljava/awt/Canvas;)Lqa;", line = 39)
    public static final class162 method200(int arg0, int arg1, class126 arg2, int arg3, class312 arg4, Canvas arg5) {
        ++field433;
        return arg1 != -1237636220 ? null : new class321(arg0, arg5, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!o", name = "d", descriptor = "(I)I", line = 51)
    public final int method201(int arg0) {
        int var2 = -76 % ((arg0 - -14) / 61);
        ++field422;
        return this.field423;
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(B)V", line = 66)
    public static void method202(byte arg0) {
        field435 = null;
        int var1 = 10 / ((arg0 - 55) / 48);
        field424 = null;
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(B)V", line = 76)
    public final void method203(byte arg0) {
        ++field421;
        super.method203(arg0);
        this.field426 = null;
    }

    @OriginalMember(owner = "client!o", name = "d", descriptor = "(B)V", line = 89)
    public static final void method204(byte arg0) {
        ++field429;
        class407.field5984.method2220(4);
        class224.field3259.method269((byte) 96);
        class413.field6075.method1851(0);
        class246.field3567.method615(-17);
        class500.field7358.method1612(arg0 ^ -86);
        class8.field111.method3080(15);
        class311.field4455.method1238(88);
        if (arg0 != -102) {
            field435 = null;
        }
        class450.field6582.method1477(true);
        class369.field5528.method721(7);
        class85.field1409.method730((byte) -127);
        class4.field64.method1196(-8697);
        class173.field2651.method1764((byte) 8);
        class495.field7209.method1833((byte) -85);
        class275.field3992.method1665(arg0 + -27947);
        class219.field3164.method2569(true);
        class233.field3389.method1207(-123);
        class25.field443.method303((byte) 103);
        class17.field267.method1279(-18650);
        class230.field3355.method2760(2);
        class418.field6177.method3029(arg0 ^ 30030);
        class385.method2426(-5438);
        class47.method353(true);
        class477.method2851((byte) -126);
        if (class502.field7371 != class108.field1683) {
            for (int var1 = 0; ~var1 > ~class425.field6239.length; ++var1) {
                class425.field6239[var1] = null;
            }
            class7.field100 = 0;
        }
        class430.method2614((byte) -17);
        class342.method2232(0);
        class76.method626(false);
        class122.method923(0);
        class42.method325(true);
        class150.field2298.method2349(0);
        class394.field5821.method503();
        class373.field5580.method795(1);
        class292.method1812(103);
        class445.field6540.method663(0);
        class327.field5068.method663(arg0 + 102);
        class200.field2917.method663(arg0 ^ -102);
        class104.field1648.method663(arg0 ^ -102);
        class250.field3600.method663(0);
        class490.field7157.method663(0);
        class427.field6244.method663(arg0 ^ -102);
        class300.field4276.method663(0);
        class460.field6798.method663(0);
        class488.field7115.method663(0);
        class515.field7577.method663(arg0 ^ -102);
        class515.field7580.method663(0);
        class334.field5125.method663(0);
        class420.field6181.method663(arg0 ^ -102);
        class272.field3933.method663(0);
        class380.field5670.method663(0);
        class34.field526.method663(0);
        class16.field249.method663(arg0 ^ -102);
        class36.field544.method663(0);
        class8.field120.method663(0);
        class484.field7095.method663(arg0 ^ -102);
        class496.field7216.method663(0);
        field435.method663(0);
        class511.field7543.method663(arg0 + 102);
        class143.field2120.method663(0);
        class378.field5646.method663(0);
        class26.field454.method663(0);
        class387.field5735.method663(arg0 + 102);
        class93.field1533.method663(0);
        class447.field6544.method663(0);
        class439.field6400.method2349(arg0 + 102);
        class91.field1511.method2349(0);
        class326.field5032.method2349(0);
        class148.field2208.method2349(0);
    }

    @OriginalMember(owner = "client!o", name = "e", descriptor = "(I)Z", line = 180)
    public final boolean method205(int arg0) {
        ++field431;
        if (this.field426 != null) {
            return true;
        } else if (this.field423 >= 0) {
            class158 var2 = ~class92.field1523 > -1 ? class158.method1142(class255.field3683, this.field423) : class158.method1134(class255.field3683, class92.field1523, this.field423);
            var2.method1136();
            this.field426 = var2.method1141();
            this.field432 = var2.field2388;
            this.field425 = var2.field2391;
            return true;
        } else {
            if (arg0 <= 123) {
                field424 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ILti;I)V", line = 208)
    public final void method206(int arg0, class303 arg1, int arg2) {
        ++field428;
        if (arg0 == 15180) {
            if (arg2 == 0) {
                this.field423 = arg1.method1868(0);
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(BI)[[I", line = 224)
    public int[][] method207(byte arg0, int arg1) {
        ++field427;
        int[][] var3 = super.field5351.method2819((byte) -69, arg1);
        if (arg0 > -40) {
            this.field425 = 75;
        }
        if (super.field5351.field6959 && this.method205(127)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = this.field425 * (class337.field5146 == this.field432 ? arg1 : this.field432 * arg1 / class337.field5146);
            if (~class404.field5952 == ~this.field425) {
                for (int var8 = 0; var8 < class404.field5952; ++var8) {
                    int var9 = this.field426[var7++];
                    var6[var8] = class388.method2441(4080, var9 << 4);
                    var5[var8] = class388.method2441(65280, var9) >> 4;
                    var4[var8] = class388.method2441(var9, 16711680) >> 12;
                }
            } else {
                for (int var10 = 0; class404.field5952 > var10; ++var10) {
                    int var11 = this.field425 * var10 / class404.field5952;
                    int var12 = this.field426[var7 - -var11];
                    var6[var10] = class388.method2441(4080, var12 << 4);
                    var5[var10] = class388.method2441(var12, 65280) >> 4;
                    var4[var10] = class388.method2441(16711680, var12) >> 12;
                }
            }
        }
        return var3;
    }
}
