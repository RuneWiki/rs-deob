import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class518 {

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "Ler;")
    private class157 field7683 = new class157(64);

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "Lns;")
    private class438 field7685;

    @OriginalMember(owner = "client!wh", name = "l", descriptor = "Z")
    public static boolean field7689 = false;

    @OriginalMember(owner = "client!wh", name = "m", descriptor = "I")
    public static int field7690 = 0;

    @OriginalMember(owner = "client!wh", name = "n", descriptor = "Z")
    public static boolean field7691 = false;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "I")
    public static int field7678;

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "I")
    public static int field7680;

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "I")
    public static int field7681;

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "I")
    public static int field7682;

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "I")
    public static int field7686;

    @OriginalMember(owner = "client!wh", name = "j", descriptor = "I")
    public static int field7687;

    @OriginalMember(owner = "client!wh", name = "k", descriptor = "I")
    public static int field7688;

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "Lni;")
    public static class87 field7679;

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "[[B")
    public static byte[][] field7684;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Z)V")
    public static final void method3081(boolean arg0) {
        field7687++;
        class69.method476(2, 96, 22050, class96.field1399.field5198);
        class102.field1462 = new class225();
        class102.field1462.method1532(9, 128, 22019);
        class374.field5734 = class56.method385(class245.field3430, class419.field6254, 16384, 22050, 0);
        class374.field5734.method1597(8, class102.field1462);
        class18.method141(class102.field1462, class394.field5985, class48.field675, class29.field459, -95);
        class133.field1929 = class56.method385(class245.field3430, class419.field6254, 16384, 2048, 1);
        class325.field4996 = new class177();
        class133.field1929.method1597(8, class325.field4996);
        if (arg0) {
            field7689 = true;
        }
        class316.field4824 = new class504(22050, class462.field6769);
        class397.field6031 = class438.field6532.method2652("scape main", -80);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IB)V")
    public final void method3082(int arg0, byte arg1) {
        field7688++;
        class157 var3 = this.field7683;
        synchronized (this.field7683) {
            this.field7683.method1016(arg0, (byte) 126);
        }
        int var4 = -75 / ((52 - arg1) / 32);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)Lv;")
    public final class109 method3083(int arg0, int arg1) {
        field7686++;
        class157 var3 = this.field7683;
        class109 var4;
        synchronized (this.field7683) {
            var4 = (class109) this.field7683.method1013((long) arg0, (byte) -106);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field7685.method2650(arg0, -44, 11);
        class109 var6 = new class109();
        if (var5 != null) {
            var6.method720(new class91(var5), (byte) -108);
        }
        class157 var7 = this.field7683;
        synchronized (this.field7683) {
            if (arg1 < 38) {
                return null;
            } else {
                this.field7683.method1012(-108, (long) arg0, var6);
                return var6;
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)V")
    public final void method3084(byte arg0) {
        class157 var2 = this.field7683;
        synchronized (this.field7683) {
            this.field7683.method1022((byte) -34);
            if (arg0 <= 18) {
                method3085(-14);
            }
        }
        field7682++;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V")
    public static void method3085(int arg0) {
        field7684 = null;
        field7679 = null;
        if (arg0 != 11) {
            field7680 = -126;
        }
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(B)V")
    public final void method3086(byte arg0) {
        field7681++;
        class157 var2 = this.field7683;
        synchronized (this.field7683) {
            this.field7683.method1015((byte) 102);
        }
        if (arg0 >= -44) {
            method3081(false);
        }
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Lgo;ILns;)V")
    public class518(class331 arg0, int arg1, class438 arg2) {
        this.field7685 = arg2;
        if (this.field7685 != null) {
            this.field7685.method2645(1, 11);
        }
    }
}
