import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public abstract class class113 extends class330 {

    @OriginalMember(owner = "client!sa", name = "j", descriptor = "S")
    public short field1299;

    @OriginalMember(owner = "client!sa", name = "r", descriptor = "B")
    public byte field1307;

    @OriginalMember(owner = "client!sa", name = "u", descriptor = "I")
    public int field1310;

    @OriginalMember(owner = "client!sa", name = "A", descriptor = "S")
    public short field1316;

    @OriginalMember(owner = "client!sa", name = "o", descriptor = "I")
    public int field1304;

    @OriginalMember(owner = "client!sa", name = "v", descriptor = "I")
    public int field1311;

    @OriginalMember(owner = "client!sa", name = "w", descriptor = "Z")
    public boolean field1312;

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "S")
    public short field1298;

    @OriginalMember(owner = "client!sa", name = "p", descriptor = "S")
    public short field1305;

    @OriginalMember(owner = "client!sa", name = "s", descriptor = "B")
    public byte field1308;

    @OriginalMember(owner = "client!sa", name = "n", descriptor = "I")
    public static int field1303 = 999999;

    @OriginalMember(owner = "client!sa", name = "m", descriptor = "Ljava/lang/String;")
    public static String field1302 = "Loaded interfaces";

    @OriginalMember(owner = "client!sa", name = "k", descriptor = "[[S")
    public static short[][] field1300 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!sa", name = "l", descriptor = "I")
    public static int field1301;

    @OriginalMember(owner = "client!sa", name = "q", descriptor = "I")
    public static int field1306;

    @OriginalMember(owner = "client!sa", name = "t", descriptor = "I")
    public static int field1309;

    @OriginalMember(owner = "client!sa", name = "x", descriptor = "I")
    public static int field1313;

    @OriginalMember(owner = "client!sa", name = "y", descriptor = "I")
    public static int field1314;

    @OriginalMember(owner = "client!sa", name = "z", descriptor = "I")
    public int field1315;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(B)V")
    public void method621(byte arg0) {
        if (arg0 >= 98) {
            field1313++;
        }
    }

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "(I)I")
    public abstract int method222(int arg0);

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ILen;ILgk;Llm;Lgp;ZI)V")
    public static final void method622(int arg0, class174 arg1, int arg2, class278 arg3, class290 arg4, class31 arg5, boolean arg6, int arg7) {
        if (arg6) {
            field1302 = null;
        }
        field1301++;
        int var8 = arg3.field3918 - (arg2 / 2 + 5);
        int var9 = arg0 + 2;
        if (arg4.field4151 != 0) {
            arg1.method1150((byte) 108, var9, var8, arg7 * arg5.method176() + arg0 + 1 - var9, arg2 - -10, arg4.field4151);
        }
        if (arg4.field4136 != 0) {
            arg1.method1149(arg4.field4136, (byte) -111, var9, var8, arg7 * arg5.method176() + arg0 + 1 - var9, arg2 + 10);
        }
        int var10 = arg4.field4149;
        if (arg3.field3928 && arg4.field4146 != -1) {
            var10 = arg4.field4146;
        }
        for (int var11 = 0; var11 < arg7; var11++) {
            String var12 = class88.field986[var11];
            if (var11 < arg7 - 1) {
                var12 = var12.substring(0, var12.length() - 4);
            }
            arg5.method179(arg1, var12, arg3.field3918, arg0, var10, true);
            arg0 += arg5.method176();
        }
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(Z)V")
    public static final void method623(boolean arg0) {
        field1314++;
        for (int var1 = 0; var1 < 5; var1++) {
            class8.field105[var1] = false;
        }
        if (arg0) {
            method623(true);
        }
        class290.field4141 = -1;
        class75.field832 = -1;
        class231.field3128 = 1;
        class26.field256 = 0;
        class180.field2474 = 0;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(JZ)Ljava/lang/String;")
    public static final String method624(long arg0, boolean arg1) {
        field1306++;
        class306.field4378.setTime(new Date(arg0));
        int var3 = class306.field4378.get(7);
        if (arg1) {
            field1302 = null;
        }
        int var4 = class306.field4378.get(5);
        int var5 = class306.field4378.get(2);
        int var6 = class306.field4378.get(1);
        int var7 = class306.field4378.get(11);
        int var8 = class306.field4378.get(12);
        int var9 = class306.field4378.get(13);
        return class337.field4997[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class152.field2138[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)V")
    public static final void method625(int arg0, int arg1) {
        if (arg1 != 32542) {
            field1300 = null;
        }
        class331 var2 = class369.field5408;
        synchronized (class369.field5408) {
            class369.field5408.method2054(71, arg0);
        }
        field1309++;
    }

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "(I)V")
    public static void method626(int arg0) {
        field1300 = null;
        field1302 = null;
        if (arg0 != 14577) {
            field1302 = null;
        }
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(IIIIIIIIZB)V")
    public class113(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, byte arg9) {
        this.field1299 = (short) arg7;
        this.field1307 = arg9;
        this.field1310 = (short) arg2;
        this.field1316 = (short) arg4;
        this.field1304 = (short) arg1;
        this.field1311 = (short) arg3;
        this.field1312 = arg8;
        this.field1298 = (short) arg5;
        this.field1305 = (short) arg6;
        this.field1308 = (byte) arg0;
    }
}
