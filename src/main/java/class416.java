import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class416 {

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "Lvv;")
    public static class313 field6308 = new class313(41, 5);

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "I")
    public static int field6309;

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "I")
    public int field6310;

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "I")
    public static int field6312;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "Lr;")
    public class71 field6307;

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "[I")
    public int[] field6311;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)V", line = 3)
    public static void method2564(int arg0) {
        if (arg0 != 41) {
            method2564(106);
        }
        field6308 = null;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(B)V", line = 13)
    public static final void method2565(byte arg0) {
        class300.field4809.method2781((byte) 93);
        field6312++;
        class1.field7.method2959((byte) 56);
        class106.field1901.method1499((byte) -112);
        class61.field928.method796(true);
        class22.field239.method1093((byte) 22);
        class20.field218.method2216(-1309);
        class130.field2232.method635((byte) -1);
        class30.field482.method2632((byte) -70);
        class189.field2953.method2907((byte) -28);
        class338.field5296.method2585((byte) -106);
        class224.field3870.method1937(-32011);
        class272.field4515.method2001((byte) 0);
        if (arg0 != -49) {
            return;
        }
        class94.field1585.method494((byte) 127);
        class446.field6660.method2977(-11692);
        class213.field3383.method2257((byte) -118);
        class503.field7338.method1614((byte) -52);
        class279.field4582.method2504(true);
        class343.field5367.method405(-75);
        class209.field3313.method1914(-65);
        class160.field2563.method1348((byte) 109);
        class337.method2126(125);
        class391.method2449(arg0 + 1755134431);
        class287.method1866(true);
        if (class255.field4320 != class180.field2857) {
            for (int var1 = 0; var1 < class205.field3253.length; var1++) {
                class205.field3253[var1] = null;
            }
            class482.field7085 = 0;
        }
        class239.method1638(-121);
        class111.method798(3);
        class125.method985(255);
        class261.method1746(-90);
        class17.method84(arg0 - 28254);
        class521.field7693.method1604(4);
        class305.field4873.method913();
        class387.field5958.method2833(124);
        class71.method503((byte) -98);
        class362.field5635.method2932(0);
        class374.field5817.method2932(0);
        class487.field7132.method2932(arg0 ^ 0xFFFFFFCF);
        class480.field7081.method2932(0);
        class471.field6971.method2932(0);
        class388.field5971.method2932(0);
        class29.field472.method2932(0);
        class81.field1407.method2932(0);
        class536.field7881.method2932(arg0 + 49);
        class205.field3246.method2932(0);
        class467.field6939.method2932(0);
        class226.field3886.method2932(0);
        class488.field7142.method2932(0);
        class147.field2392.method2932(arg0 + 49);
        class298.field4799.method2932(0);
        class316.field4978.method2932(0);
        class82.field1445.method2932(0);
        class536.field7870.method2932(0);
        class18.field198.method2932(0);
        class490.field7161.method2932(arg0 ^ 0xFFFFFFCF);
        class388.field5969.method2932(0);
        class516.field7627.method2932(arg0 ^ 0xFFFFFFCF);
        class451.field6719.method2932(0);
        class208.field3292.method2932(arg0 ^ 0xFFFFFFCF);
        class358.field5574.method2932(0);
        class236.field4087.method2932(arg0 ^ 0xFFFFFFCF);
        class191.field2968.method2932(0);
        class177.field2803.method2932(arg0 + 49);
        class362.field5639.method2932(0);
        class295.field4754.method2932(arg0 + 49);
        class462.field6872.method1604(arg0 ^ 0xFFFFFFCB);
        class115.field2049.method1604(arg0 ^ 0xFFFFFFCB);
        class22.field235.method1604(4);
        class469.field6965.method1604(4);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "([BB)Z", line = 102)
    public static final boolean method2566(byte[] arg0, byte arg1) {
        field6309++;
        class23 var2 = new class23(arg0);
        int var3 = var2.method126((byte) -115);
        if (var3 != 2) {
            return false;
        }
        boolean var4 = var2.method126((byte) -89) == 1;
        if (var4) {
            class189.method1280((byte) 118, var2);
        }
        if (arg1 >= -31) {
            return true;
        } else {
            class263.method1753(var2, -92);
            return true;
        }
    }
}
