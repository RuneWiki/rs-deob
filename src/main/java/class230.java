import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class230 {

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "Lcc;")
    public static class209 field4172 = class95.method669(98, "(Y<)4col>");

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "Lcc;")
    public static class209 field4182 = class95.method669(91, "Cabbage");

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "I")
    public static int field4178 = 0;

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "I")
    public static int field4185 = -1;

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "I")
    public static int field4184 = 100;

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "Lla;")
    public static class95 field4177 = new class95(4);

    @OriginalMember(owner = "client!wc", name = "r", descriptor = "[Lcc;")
    public static class209[] field4188 = new class209[100];

    @OriginalMember(owner = "client!wc", name = "s", descriptor = "I")
    public static int field4189 = 1;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "I")
    public static int field4174;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "I")
    public int field4175;

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "I")
    public int field4179;

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "I")
    public int field4180;

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "I")
    public static int field4181;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "J")
    public long field4171;

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "Lpb;")
    public class126 field4183;

    @OriginalMember(owner = "client!wc", name = "q", descriptor = "Lw;")
    public static class143 field4187;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "Lkd;")
    public static class203 field4173;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "Ljava/awt/Frame;")
    public static Frame field4176;

    @OriginalMember(owner = "client!wc", name = "p", descriptor = "[Lal;")
    public static class231[] field4186;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Llk;Z)V")
    public static final void method1607(class81 arg0, boolean arg1) {
        int var2 = arg0.field1542 - class163.field2968;
        field4174++;
        int var3 = arg0.field1514 * 128 + arg0.method577((byte) -65) * 64;
        if (arg1) {
            method1607((class81) null, true);
        }
        int var4 = arg0.field1532 * 128 + arg0.method577((byte) 62) * 64;
        if (arg0.field1535 == 0) {
            arg0.field1570 = 1024;
        }
        arg0.field1554 = 0;
        arg0.field1571 += (var3 - arg0.field1571) / var2;
        if (arg0.field1535 == 1) {
            arg0.field1570 = 1536;
        }
        arg0.field1534 += (var4 - arg0.field1534) / var2;
        if (arg0.field1535 == 2) {
            arg0.field1570 = 0;
        }
        if (arg0.field1535 == 3) {
            arg0.field1570 = 512;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)V")
    public static void method1608(byte arg0) {
        field4176 = null;
        if (arg0 >= -38) {
            method1607((class81) null, false);
        }
        field4187 = null;
        field4173 = null;
        field4186 = null;
        field4177 = null;
        field4188 = null;
        field4172 = null;
        field4182 = null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V")
    public static final void method1609(int arg0) {
        int var1 = class192.method1319((byte) 94);
        field4181++;
        if (var1 == 0) {
            class272.field4820 = null;
            class218.method1538(0, arg0 + 6227);
        } else if (var1 == 1) {
            class7.method72((byte) 0, arg0 + 6207);
            class218.method1538(512, 128);
            class234.method1626(arg0 ^ 0xFFFFA72D);
        } else {
            class7.method72((byte) (class5.field73 - 4 & 0xFF), 60);
            class218.method1538(2, 128);
        }
        if (arg0 != -6099) {
            field4182 = null;
        }
    }
}
