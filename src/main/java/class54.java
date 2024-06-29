import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public class class54 extends Canvas {

    @OriginalMember(owner = "client!mq", name = "g", descriptor = "Ljava/awt/Component;")
    private Component field790;

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "[J")
    public static long[] field786 = new long[100];

    @OriginalMember(owner = "client!mq", name = "k", descriptor = "[I")
    public static int[] field794 = new int[16];

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "I")
    public static int field784;

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "I")
    public static int field785;

    @OriginalMember(owner = "client!mq", name = "d", descriptor = "I")
    public static int field787;

    @OriginalMember(owner = "client!mq", name = "e", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "client!mq", name = "f", descriptor = "I")
    public static int field789;

    @OriginalMember(owner = "client!mq", name = "h", descriptor = "I")
    public static int field791;

    @OriginalMember(owner = "client!mq", name = "i", descriptor = "I")
    public static int field792;

    @OriginalMember(owner = "client!mq", name = "j", descriptor = "I")
    public static int field793;

    @OriginalMember(owner = "client!mq", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field790.update(arg0);
        field787++;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(B)V")
    public static final void method409(byte arg0) {
        field791++;
        if (class509.field7597 == -1) {
            return;
        }
        if (arg0 <= 51) {
            field794 = null;
        }
        int var1 = class472.field7240.method2038(-49);
        int var2 = class472.field7240.method2043((byte) -97);
        class32 var3 = (class32) class513.field7612.method2123(71);
        if (var3 != null) {
            var1 = var3.method139(true);
            var2 = var3.method142(39);
        }
        class159.method968(var2, var1, class509.field7597, 0, 0, -78, 0, class219.field3715, 0, class489.field7400);
        if (class204.field3125 != null) {
            class510.method3086(var2, 15759, var1);
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(I)V")
    public static final void method410(int arg0) {
        field792++;
        class310.field4844.method522(-1031);
        class32.field333.method1135((byte) 87);
        class17.field178.method1032(false);
        class454.field7029.method3000((byte) 113);
        class6.field72.method2976(-50);
        class337.field5262.method2088(124);
        class388.field5915.method1702(arg0 ^ 0x4F71);
        class85.field1242.method1971(arg0 - 20050);
        class197.field3037.method765(-661);
        class322.field5027.method600(0);
        class19.field199.method2291((byte) 100);
        class453.field7020.method2740(5);
        class457.field7049.method663(false);
        class360.field5583.method130(-18419);
        class274.field4353.method1173(-122);
        class93.field1361.method835((byte) -52);
        class187.field2727.method773((byte) -99);
        class525.field7743.method555(19277);
        class359.field5569.method1766(false);
        class436.field6588.method345(-9322);
        class368.method2410(arg0 ^ 0xFFFFB089);
        class80.method573(false);
        class328.method2197(-29);
        if (class209.field3228 != class181.field2626) {
            for (int var1 = 0; var1 < class112.field1571.length; var1++) {
                class112.field1571[var1] = null;
            }
            class135.field1838 = 0;
        }
        method414(true);
        class508.method3078((byte) -126);
        class490.method3010(-82);
        class521.method3117(0);
        class326.method2181(arg0 ^ 0xFFFFB09B);
        class420.field6380.method2189(false);
        class19.field198.method1293();
        class364.field5628.method2131(arg0 - 49872);
        class6.method55(false);
        class184.field2680.method1013(0);
        class89.field1314.method1013(arg0 ^ 0x4F1A);
        class483.field7346.method1013(0);
        class315.field4926.method1013(0);
        class300.field4717.method1013(0);
        class128.field1730.method1013(0);
        class305.field4799.method1013(arg0 ^ arg0);
        class236.field3876.method1013(0);
        class120.field1646.method1013(0);
        class186.field2714.method1013(0);
        class337.field5259.method1013(0);
        class198.field3045.method1013(arg0 - 20250);
        class467.field7157.method1013(0);
        class130.field1767.method1013(0);
        class116.field1621.method1013(0);
        class71.field1074.method1013(0);
        class263.field4264.method1013(0);
        class415.field6290.method1013(arg0 - 20250);
        class79.field1178.method1013(0);
        class181.field2636.method1013(arg0 ^ 0x4F1A);
        class290.field4581.method1013(arg0 - 20250);
        class463.field7119.method1013(arg0 - 20250);
        class41.field448.method1013(0);
        class52.field706.method1013(0);
        class122.field1664.method1013(arg0 - 20250);
        class285.field4501.method1013(arg0 ^ 0x4F1A);
        class502.field7525.method1013(0);
        class214.field3646.method1013(arg0 ^ 0x4F1A);
        class10.field106.method1013(0);
        class463.field7117.method1013(0);
        class121.field1653.method2189(false);
        class122.field1660.method2189(false);
        class174.field2538.method2189(false);
        class316.field4933.method2189(false);
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method411(String arg0, int arg1) {
        field789++;
        if (!class128.field1732) {
            return;
        }
        boolean var2 = false;
        int var3 = class234.field3861;
        int[] var4 = class21.field245;
        for (int var5 = arg1; var5 < var3; var5++) {
            class350 var6 = class264.field4276[var4[var5]];
            if (var6 != null && class358.field5565 != var6 && var6.field5443 != null && var6.field5443.equalsIgnoreCase(arg0)) {
                class81.method578((byte) 66, class316.field4930);
                class64.field1011++;
                class170.field2488.method1419(-10147, var4[var5]);
                class170.field2488.method1433(0, 100);
                class170.field2488.method1437(class264.field4277, arg1);
                class170.field2488.method1437(class31.field327, 0);
                class170.field2488.method1443(class398.field6007, (byte) 94);
                class83.method585(var6.field894[0], 0, var6.method415(-4), var6.field899[0], -2, (byte) -82, 0, var6.method415(-4), true);
                var2 = true;
                break;
            }
        }
        if (!var2) {
            class295.method1988(class489.field7407.method1583(99, class12.field131) + arg0, 0);
        }
        if (class128.field1732) {
            class497.method3038(84);
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(II)Lec;")
    public static final class68 method412(int arg0, int arg1) {
        field788++;
        if (arg0 != 0) {
            method411(null, 46);
        }
        return class435.field6571 && arg1 >= class257.field4150 && arg1 <= class168.field2457 ? class326.field5124[arg1 - class257.field4150] : null;
    }

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "(I)V")
    public static void method413(int arg0) {
        field786 = null;
        field794 = null;
        if (arg0 != -20536) {
            field785 = 105;
        }
    }

    @OriginalMember(owner = "client!mq", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field790.paint(arg0);
        field784++;
    }

    @OriginalMember(owner = "client!mq", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class54(Component arg0) {
        this.field790 = arg0;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(Z)V")
    public static final void method414(boolean arg0) {
        field793++;
        class260.field4197.method2189(false);
        if (!arg0) {
            field785 = -17;
        }
    }
}
