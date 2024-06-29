import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class232 extends class265 {

    @OriginalMember(owner = "client!fe", name = "D", descriptor = "[I")
    private final int[] field4017 = new int[this.field4592];

    @OriginalMember(owner = "client!fe", name = "y", descriptor = "Lmh;")
    public static class128 field4012 = class22.method156(122, "welle:");

    @OriginalMember(owner = "client!fe", name = "s", descriptor = "Lvf;")
    public static class296 field4006 = new class296();

    @OriginalMember(owner = "client!fe", name = "C", descriptor = "[I")
    public static int[] field4016 = new int[32];

    @OriginalMember(owner = "client!fe", name = "q", descriptor = "I")
    public static int field4004;

    @OriginalMember(owner = "client!fe", name = "r", descriptor = "I")
    public static int field4005;

    @OriginalMember(owner = "client!fe", name = "t", descriptor = "I")
    private int field4007;

    @OriginalMember(owner = "client!fe", name = "u", descriptor = "I")
    public static int field4008;

    @OriginalMember(owner = "client!fe", name = "w", descriptor = "I")
    public static int field4010;

    @OriginalMember(owner = "client!fe", name = "x", descriptor = "I")
    public static int field4011;

    @OriginalMember(owner = "client!fe", name = "z", descriptor = "I")
    public static int field4013;

    @OriginalMember(owner = "client!fe", name = "A", descriptor = "I")
    private int field4014;

    @OriginalMember(owner = "client!fe", name = "B", descriptor = "I")
    public static int field4015;

    @OriginalMember(owner = "client!fe", name = "v", descriptor = "[B")
    private byte[] field4009;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IB)V", line = 4)
    public void method1595(int arg0, byte arg1) {
        this.field4009[this.field4007++] = (byte) (class238.method1622(127, arg1 >> 1) + 127);
        field4010++;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILdj;)V", line = 22)
    public static final void method1596(int arg0, class314 arg1) {
        class283.field4869 = class109.method667(arg1, 94, class287.field4908, 0);
        class96.field1610 = new class127[class283.field4869.length];
        class288.field4921 = new class127[class283.field4869.length];
        field4013++;
        class298.field5077 = new class127[class283.field4869.length];
        for (int var2 = 0; var2 < class283.field4869.length; var2++) {
            class283.field4869[var2].method815();
            class96.field1610[var2] = class283.field4869[var2].method807();
            class283.field4869[var2].method815();
            class288.field4921[var2] = class283.field4869[var2].method807();
            class283.field4869[var2].method815();
            class298.field5077[var2] = class283.field4869[var2].method807();
            class283.field4869[var2].method815();
        }
        class61.field1159 = class33.method238(arg1, arg0 ^ 0x9B2, class196.field3446, 0);
        class32.field708 = class240.method1632(class271.field4712, (byte) 102, 0, arg1);
        class152.field2621 = class240.method1632(class192.field3324, (byte) 102, 0, arg1);
        class208.field3641 = class240.method1632(class306.field5209, (byte) 102, 0, arg1);
        class117.field1986 = class240.method1632(class218.field3839, (byte) 102, 0, arg1);
        class242.field4147 = class298.method2040(arg1, class158.field2706, 0, 2);
        class294.field5036 = class298.method2040(arg1, class254.field4387, 0, 2);
        class96.field1612 = class260.method1825(255, arg1, class88.field1512, 0);
        class112.field1879 = class298.method2040(arg1, class157.field2689, 0, 2);
        class200.field3541 = class298.method2040(arg1, class301.field5113, 0, 2);
        class222.field3896 = class220.method1522(0, class65.field1248, arg1, -16711936);
        class167.field2861 = class220.method1522(0, class166.field2849, arg1, -16711936);
        class34.field724.method2084(class167.field2861, (int[]) null);
        class132.field2292.method2084(class167.field2861, (int[]) null);
        client.field4159.method2084(class167.field2861, (int[]) null);
        if (class247.field4247) {
            class312.field5277 = class109.method667(arg1, 109, class195.field3423, 0);
            for (int var3 = 0; var3 < class312.field5277.length; var3++) {
                class312.field5277[var3].method808();
            }
        }
        class231 var4 = class263.method1844(arg1, class285.field4891, 0, -111);
        var4.method1589();
        if (class247.field4247) {
            class221.field3887 = new class40(var4);
        } else {
            class221.field3887 = var4;
        }
        class231[] var5 = class33.method238(arg1, 20190, class159.field2728, 0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            var5[var6].method1589();
        }
        if (class247.field4247) {
            class97.field1673 = new class55[var5.length];
            for (int var7 = 0; var7 < var5.length; var7++) {
                class97.field1673[var7] = new class40(var5[var7]);
            }
        } else {
            class97.field1673 = var5;
        }
        int var8 = (int) (Math.random() * 21.0D) - 10;
        int var9 = (int) (Math.random() * 21.0D) - 10;
        int var10 = (int) (Math.random() * 21.0D) - 10;
        int var11 = (int) (Math.random() * 41.0D) - 20;
        for (int var12 = 0; var12 < class61.field1159.length; var12++) {
            class61.field1159[var12].method1587(var8 + var11, var9 + var11, var10 + var11);
        }
        if (arg0 != 18284) {
            field4006 = (class296) null;
        }
        class283.field4869[0].method813(var8 + var11, var9 + var11, var10 + var11);
        if (class247.field4247) {
            class42.field854 = new class55[class61.field1159.length];
            for (int var13 = 0; var13 < class61.field1159.length; var13++) {
                class42.field854[var13] = new class40(class61.field1159[var13]);
            }
        } else {
            class42.field854 = class61.field1159;
        }
    }

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "(I)V", line = 153)
    public final void method1497(int arg0) {
        field4004++;
        this.field4014 = Math.abs(this.field4014);
        if (this.field4014 >= 4096) {
            this.field4014 = 4095;
        }
        if (arg0 != -3) {
            this.method1497(-70);
        }
        this.method1595(this.field4007++, (byte) (this.field4014 >> 4));
        this.field4014 = 0;
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(IIIIIF)V", line = 172)
    public class232(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; var7 < this.field4592; var7++) {
            this.field4017[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(III)V", line = 191)
    public final void method1499(int arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.field4014 += this.field4017[arg0] * arg1 >> 12;
            field4005++;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Z)V", line = 207)
    public static void method1597(boolean arg0) {
        field4006 = null;
        field4012 = null;
        field4016 = null;
        if (!arg0) {
            method1596(-117, (class314) null);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V", line = 224)
    public final void method1500(int arg0) {
        field4008++;
        this.field4014 = 0;
        if (arg0 != -1007506868) {
            this.method1499(-86, -76, -117);
        }
        this.field4007 = 0;
    }

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "(I)V", line = 243)
    public static final void method1598(int arg0) {
        for (int var1 = arg0; var1 < 100; var1++) {
            class26.field581[var1] = true;
        }
        field4011++;
    }
}
