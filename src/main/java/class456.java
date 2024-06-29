import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class456 {

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "Ld;")
    private class242 field6770 = new class242(64);

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "Lum;")
    private class83 field6769;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "Lpu;")
    public static class179 field6768 = new class179("Started 3D Library", "3D-Softwarebibliothek gestartet.", "Librairie 3D démarrée", "Biblioteca 3D iniciada");

    @OriginalMember(owner = "client!cg", name = "l", descriptor = "I")
    public static int field6779 = 0;

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "Lpu;")
    public static class179 field6777 = new class179("Loaded core fonts", "Schriftarten geladen", "Polices chargées", "Fontes principais carregadas");

    @OriginalMember(owner = "client!cg", name = "m", descriptor = "Lvl;")
    public static class241 field6780 = new class241(0, 0);

    @OriginalMember(owner = "client!cg", name = "o", descriptor = "I")
    public static int field6782 = 328;

    @OriginalMember(owner = "client!cg", name = "n", descriptor = "Lvg;")
    public static class56 field6781 = new class56(8);

    @OriginalMember(owner = "client!cg", name = "r", descriptor = "I")
    public static int field6785 = 1337;

    @OriginalMember(owner = "client!cg", name = "q", descriptor = "Ljp;")
    public static class55 field6784 = new class55(46, 3);

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "I")
    public static int field6771;

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "I")
    public static int field6772;

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "I")
    public static int field6773;

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "I")
    public static int field6774;

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "I")
    public static int field6775;

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "I")
    public static int field6776;

    @OriginalMember(owner = "client!cg", name = "s", descriptor = "[Lo;")
    public static class363[] field6786;

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "[Lfi;")
    public static class38[] field6778;

    @OriginalMember(owner = "client!cg", name = "p", descriptor = "[[I")
    public static int[][] field6783;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(BI)Lmw;", line = 3)
    public final class450 method2789(byte arg0, int arg1) {
        if (arg0 != 36) {
            return null;
        }
        field6773++;
        class242 var3 = this.field6770;
        class450 var4;
        synchronized (this.field6770) {
            var4 = (class450) this.field6770.method1634((long) arg1, arg0 ^ 0x64);
        }
        if (var4 != null) {
            return var4;
        }
        class83 var5 = this.field6769;
        byte[] var6;
        synchronized (this.field6769) {
            var6 = this.field6769.method731(arg0 ^ 0x24, arg1, 11);
        }
        class450 var7 = new class450();
        if (var6 != null) {
            var7.method2761((byte) -60, new class194(var6));
        }
        class242 var8 = this.field6770;
        synchronized (this.field6770) {
            this.field6770.method1623((long) arg1, arg0 + 17585, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)V", line = 40)
    public static void method2790(byte arg0) {
        field6784 = null;
        field6786 = null;
        field6777 = null;
        field6768 = null;
        field6783 = null;
        field6781 = null;
        field6778 = null;
        field6780 = null;
        if (arg0 >= -114) {
            method2792(-111);
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)V", line = 57)
    public final void method2791(int arg0, int arg1) {
        class242 var3 = this.field6770;
        synchronized (this.field6770) {
            if (arg1 >= -43) {
                return;
            }
            this.field6770.method1631(arg0, (byte) -19);
        }
        field6772++;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V", line = 70)
    public static final void method2792(int arg0) {
        field6776++;
        class64.field1002 = class341.method2199(8, 0.4F, 4, 35, arg0, (byte) -43, 8, true);
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(I)V", line = 78)
    public final void method2793(int arg0) {
        field6775++;
        class242 var2 = this.field6770;
        synchronized (this.field6770) {
            this.field6770.method1637((byte) 13);
        }
        if (arg0 != -2198) {
            field6782 = -51;
        }
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(B)V", line = 97)
    public final void method2794(byte arg0) {
        class242 var2 = this.field6770;
        synchronized (this.field6770) {
            this.field6770.method1630(arg0 + 1);
            if (arg0 != -104) {
                method2792(-67);
            }
        }
        field6774++;
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(Lpt;ILum;)V", line = 112)
    public class456(class308 arg0, int arg1, class83 arg2) {
        this.field6769 = arg2;
        if (this.field6769 != null) {
            this.field6769.method748(11, 12408);
        }
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(B)[Ljp;", line = 138)
    public static final class55[] method2795(byte arg0) {
        field6771++;
        return arg0 >= -42 ? null : new class55[] { class470.field6900, class71.field1129, class209.field3194, class322.field4885, class46.field712, class299.field4605, class81.field1330, class168.field2549, class297.field4576, class404.field5960, class3.field46, class115.field1763, class222.field3392, class293.field4532, class22.field245, class183.field2796, class472.field6935, class44.field689, class185.field2830, class527.field7718, class249.field3894, class289.field4480, class377.field5571, class346.field5148, class489.field7142, class286.field4464, class370.field5508, class149.field2219, class539.field7888, class186.field2861, class228.field3448, class183.field2804, class169.field2568, class138.field2089, class313.field4765, class501.field7280, class398.field5882, class14.field156, class277.field4343, class417.field6130, class449.field6683, class9.field102, class50.field773, class52.field808, class57.field876, class104.field1604, field6784, class238.field3575, class293.field4522, class476.field6955, class483.field7075, class169.field2553, class283.field4422, class370.field5494, class452.field6721, class243.field3676, class367.field5406, class408.field6038, class290.field4491, class454.field6753, class470.field6905, class99.field1530, class25.field291, class410.field6064, class240.field3610, class490.field7156, class53.field822, class308.field4699, class522.field7664, class98.field1527, class428.field6349, class101.field1580, class26.field295, class234.field3514, class296.field4562, class508.field7388, class374.field5536, class409.field6041, class438.field6540, class142.field2113, class52.field800, class56.field861, class190.field2896, class234.field3510, class340.field5088, class167.field2530, class524.field7687, class4.field58, class172.field2669, class279.field4350, class105.field1616, class523.field7675, class225.field3430, class222.field3397, class264.field4224, class118.field1817, class390.field5708, class324.field4910, class511.field7477, class115.field1771, class477.field7024, class87.field1424, class153.field2315, class168.field2546, class155.field2380, class83.field1345, class229.field3458, class148.field2197, class76.field1288, class370.field5506, class361.field5322, class75.field1270, class38.field574, class284.field4430 };
    }
}
