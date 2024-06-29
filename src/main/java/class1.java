import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!a")
public class class1 {

    @OriginalMember(owner = "mapview!a", name = "b", descriptor = "Lv;")
    public static JagString field2 = method2(255, "Fur Trader");

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "Lv;")
    public static JagString field1 = method2(255, "Windmill");

    @OriginalMember(owner = "mapview!a", name = "f", descriptor = "Lv;")
    public static JagString field6 = method2(255, " map");

    @OriginalMember(owner = "mapview!a", name = "g", descriptor = "Lv;")
    public static JagString field7 = method2(255, "Water Source");

    @OriginalMember(owner = "mapview!a", name = "c", descriptor = "Lv;")
    public static JagString field3 = method2(255, "Platebody Shop");

    @OriginalMember(owner = "mapview!a", name = "j", descriptor = "Lv;")
    public static JagString field10 = method2(255, "Platelegs Shop");

    @OriginalMember(owner = "mapview!a", name = "e", descriptor = "[I")
    public static int[] field5 = new int[128];

    @OriginalMember(owner = "mapview!a", name = "i", descriptor = "Lv;")
    public static JagString field9 = method2(255, "Guide");

    @OriginalMember(owner = "mapview!a", name = "k", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "mapview!a", name = "d", descriptor = "[I")
    public static int[] field4;

    @OriginalMember(owner = "mapview!a", name = "h", descriptor = "[Lb;")
    public static Pix24[] field8;

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(I)V", line = 4)
    public static void method1(int arg0) {
        field2 = null;
        if (arg0 != 0) {
            field2 = null;
        }
        field3 = null;
        field7 = null;
        field6 = null;
        field5 = null;
        field8 = null;
        field9 = null;
        field4 = null;
        field1 = null;
        field10 = null;
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(ILjava/lang/String;)Lv;", line = 48)
    public static final JagString method2(int arg0, String arg1) {
        byte[] var2 = arg1.getBytes();
        if (arg0 != 255) {
            field9 = null;
        }
        int var3 = var2.length;
        JagString var4 = new JagString();
        var4.field474 = new byte[var3];
        int var5 = 0;
        while (var5 < var3) {
            int var6 = var2[var5++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var3 <= var5) {
                    break;
                }
                int var7 = var2[var5++] & 0xFF;
                var4.field474[var4.field468++] = (byte) (var6 * 43 + var7 - 1720 - 48);
            } else if (var6 != 0) {
                var4.field474[var4.field468++] = (byte) var6;
            }
        }
        var4.method231(122);
        return var4.method233(4096);
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(B)I", line = 91)
    public static final int method3(byte arg0) {
        int var1 = -95 % ((57 - arg0) / 51);
        if (MillisTimer.field151 == null) {
            return 0;
        } else if (MillisTimer.field151.field375 == null) {
            return Packet.field340[MillisTimer.field151.field367 & 0xFF];
        } else {
            return Packet.field340[MillisTimer.field151.field375[JavaKeyboard.field12] & 0xFF];
        }
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "([Lv;III)V", line = 163)
    public static final void method4(JagString[] arg0, int arg1, int arg2, int arg3) {
        if (arg3 == 1) {
            arg0[0].method249(-1);
        } else {
            Timer.method194(arg0, arg2, arg3, 22760).method249(-1);
        }
        if (arg1 != -21657) {
            method1(-97);
        }
    }
}
