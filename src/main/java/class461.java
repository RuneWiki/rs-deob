import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class461 extends class553 {

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "Laba;")
    public static class150 field6469 = new class150();

    @OriginalMember(owner = "client!vi", name = "i", descriptor = "I")
    public static int field6472 = -1;

    @OriginalMember(owner = "client!vi", name = "j", descriptor = "Ldv;")
    public static class566 field6473 = new class566(49, 8);

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "I")
    public static int field6468;

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "I")
    public static int field6470;

    @OriginalMember(owner = "client!vi", name = "h", descriptor = "I")
    public static int field6471;

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(B)V")
    public static void method2686(byte arg0) {
        if (arg0 < 97) {
            field6473 = null;
        }
        field6469 = null;
        field6473 = null;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)S")
    public static final short method2687(int arg0, int arg1) {
        field6468++;
        if (arg1 != -1) {
            method2689((byte) -68);
        }
        int var2 = arg0 >> 10 & 0x3F;
        int var3 = (arg0 & 0x380) >> 3;
        int var4 = arg0 & 0x7F;
        int var5 = var4 <= 64 ? var3 * var4 >> 7 : (127 - var4) * var3 >> 7;
        int var6 = var4 + var5;
        int var7;
        if (var6 == 0) {
            var7 = var5 << 1;
        } else {
            var7 = (var5 << 8) / var6;
        }
        return (short) (var6 | var7 >> 4 << 7 | var2 << 10);
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)Lsi;")
    public static final class480 method2688(int arg0) {
        field6470++;
        if (arg0 >= -54) {
            return null;
        }
        try {
            return (class480) Class.forName("ih").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "(B)V")
    public static final void method2689(byte arg0) {
        field6471++;
        class141.field2191.method2068(124);
        class493.field6910.method1251((byte) -124);
        class412.field5801.method2725((byte) 88);
        class18.field227.method1202((byte) 124);
        class516.field7253.method3262(-64);
        class181.field2574.method865(arg0 + 47);
        class331.field4418.method197(-117);
        class78.field1263.method1566((byte) -10);
        class595.field8604.method2253(512);
        class534.field7474.method587((byte) 54);
        class263.field3678.method716((byte) 5);
        class340.field4583.method3258(-123);
        class163.field2366.method2137(100);
        class630.field9230.method2771((byte) 113);
        class533.field7455.method3113(128);
        class303.field4141.method2360(arg0 ^ 0x43);
        class358.field4823.method1155(81);
        class534.field7475.method2059(false);
        class62.field1080.method2541((byte) -120);
        class642.field9327.method3563(true);
        class572.method3259(arg0 ^ 0xFFFFFFE0);
        class464.method2713((byte) -67);
        class73.method580(198);
        if (class71.field1181 != class53.field988) {
            for (int var1 = 0; var1 < class20.field250.length; var1++) {
                class20.field250[var1] = null;
            }
            class426.field6053 = 0;
        }
        class422.method2520(-21760);
        class164.method1058(3553);
        class465.method2717(1677);
        class591.method3462(arg0 - 28);
        class401.method2401(-28566);
        class123.field2013.method3246(false);
        class69.field1165.method1337();
        class8.field95.method1881((byte) -60);
        class278.method1794(-61);
        class107.field1646.method217(arg0 ^ 0x1F);
        class212.field2988.method217(0);
        class346.field4656.method217(0);
        class418.field5891.method217(arg0 - 31);
        class603.field8707.method217(0);
        class23.field346.method217(0);
        class236.field3305.method217(0);
        class566.field7830.method217(0);
        class645.field9371.method217(0);
        class505.field7049.method217(0);
        class277.field3831.method217(0);
        class7.field89.method217(0);
        class49.field960.method217(arg0 - 31);
        class385.field5162.method217(0);
        class572.field7893.method217(0);
        class549.field7603.method217(0);
        class507.field7092.method217(arg0 - 31);
        class366.field4973.method217(0);
        class336.field4486.method217(arg0 ^ 0x1F);
        class152.field2307.method217(0);
        class318.field4318.method217(0);
        if (arg0 != 31) {
            field6469 = null;
        }
        class498.field6959.method217(0);
        class633.field9253.method217(0);
        class587.field8402.method217(arg0 - 31);
        class341.field4603.method217(0);
        class623.field8995.method217(0);
        class440.field6280.method217(arg0 ^ 0x1F);
        class610.field8772.method217(arg0 ^ 0x1F);
        class269.field3759.method217(0);
        class406.field5774.method217(0);
        class398.field5688.method217(0);
        class142.field2194.method217(arg0 - 31);
        class41.field809.method3246(false);
        class365.field4963.method3246(false);
        class213.field3020.method3246(false);
        class35.field674.method3246(false);
    }
}
