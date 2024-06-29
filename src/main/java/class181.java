import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class181 {

    @OriginalMember(owner = "client!u", name = "d", descriptor = "I")
    public static int field2870 = 0;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "I")
    public static int field2869 = 0;

    @OriginalMember(owner = "client!u", name = "e", descriptor = "I")
    public static int field2871 = 0;

    @OriginalMember(owner = "client!u", name = "i", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2875 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!u", name = "k", descriptor = "I")
    public static volatile int field2877 = -1;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "I")
    public static int field2867;

    @OriginalMember(owner = "client!u", name = "f", descriptor = "I")
    public static int field2872;

    @OriginalMember(owner = "client!u", name = "g", descriptor = "I")
    public static int field2873;

    @OriginalMember(owner = "client!u", name = "h", descriptor = "I")
    public static int field2874;

    @OriginalMember(owner = "client!u", name = "j", descriptor = "I")
    public static int field2876;

    @OriginalMember(owner = "client!u", name = "l", descriptor = "I")
    public static int field2878;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "Lvh;")
    public static class212 field2868;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(II)V", line = 13)
    public static final void method1154(int arg0, int arg1) {
        field2873++;
        if (arg0 == -1 && !class196.field3151) {
            class103.method678(false);
        } else if (arg0 != -1 && (class250.field4042 != arg0 || !method1155(arg1 ^ 0xFFFFFF8F)) && class78.field1205 != 0 && !class196.field3151) {
            class236.method1516(2, class11.field193, true, arg0, false, 0, class78.field1205);
        }
        if (arg1 != 0) {
            field2871 = -100;
        }
        class250.field4042 = arg0;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)Z", line = 39)
    public static final boolean method1155(int arg0) {
        field2872++;
        if (arg0 > -111) {
            method1155(0);
        }
        return class126.field1947 == 0 ? class263.field4274.method1232(128) : true;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lwi;ILkl;I)V", line = 54)
    public static final void method1156(class23 arg0, int arg1, class75 arg2, int arg3) {
        field2867++;
        byte[] var4 = null;
        class156 var5 = class82.field1256;
        synchronized (class82.field1256) {
            for (class210 var6 = (class210) class82.field1256.method995(arg1 ^ 0x6D783EC8); var6 != null; var6 = (class210) class82.field1256.method996(0)) {
                if ((long) arg3 == var6.field1218 && var6.field3359 == arg2 && var6.field3349 == 0) {
                    var4 = var6.field3354;
                    break;
                }
            }
        }
        if (var4 != null) {
            arg0.method179(var4, arg2, arg3, true, (byte) 118);
            return;
        }
        if (arg1 != 0) {
            field2877 = 72;
        }
        byte[] var8 = arg2.method541(arg1 + 255, arg3);
        arg0.method179(var8, arg2, arg3, true, (byte) 118);
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(I)V", line = 117)
    public static void method1157(int arg0) {
        if (arg0 != -32255) {
            field2871 = -116;
        }
        field2868 = null;
        field2875 = null;
    }

    @OriginalMember(owner = "client!u", name = "c", descriptor = "(I)V", line = 135)
    public static final void method1158(int arg0) {
        field2876++;
        class14.method117(true);
        class71.method510(7);
        class139.method916((byte) 52);
        class222.method1404((byte) 122);
        class108.method697(-2693);
        class246.method1603(-98);
        class55.method413(3547);
        class151.method972(false);
        class190.method1201((byte) 88);
        class26.method193((byte) -107);
        class297.method1986(true);
        class98.method659((byte) 121);
        class98.method656(-124);
        class184.method1168((byte) -126);
        class169.field2680.method526(arg0 - 32275);
        class210.field3352.method274(arg0 - 30653);
        class61.field974.method274(arg0 ^ 0xFFFF8843);
        class283.field4678.method274(arg0 - 30653);
        class168.field2652.method274(-30653);
        class196.field3152.method274(-30653);
        class11.field193.method274(-30653);
        class117.field1764.method274(-30653);
        class1.field21.method274(-30653);
        class13.field203.method274(-30653);
        if (arg0 != 0) {
            method1154(88, -16);
        }
        class13.field208.method274(-30653);
        class42.field629.method274(-30653);
    }
}
