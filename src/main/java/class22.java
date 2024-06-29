import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class22 {

    @OriginalMember(owner = "client!an", name = "f", descriptor = "Lpca;")
    private class653 field202 = new class653(256);

    @OriginalMember(owner = "client!an", name = "g", descriptor = "Ljo;")
    private class303 field203;

    @OriginalMember(owner = "client!an", name = "h", descriptor = "I")
    public static int field204 = -1;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "I")
    public static int field197;

    @OriginalMember(owner = "client!an", name = "b", descriptor = "I")
    public static int field198;

    @OriginalMember(owner = "client!an", name = "c", descriptor = "I")
    public static int field199;

    @OriginalMember(owner = "client!an", name = "d", descriptor = "I")
    public static int field200;

    @OriginalMember(owner = "client!an", name = "e", descriptor = "I")
    public static int field201;

    @OriginalMember(owner = "client!an", name = "i", descriptor = "I")
    public static int field205;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IZ)V", line = 11)
    public final void method94(int arg0, boolean arg1) {
        if (!arg1) {
            this.method94(103, true);
        }
        field200++;
        class653 var3 = this.field202;
        synchronized (this.field202) {
            this.field202.method3691(false, arg0);
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(I)V", line = 24)
    public final void method95(int arg0) {
        class653 var2 = this.field202;
        synchronized (this.field202) {
            if (arg0 != 1024) {
                field204 = 126;
            }
            this.field202.method3687((byte) -10);
        }
        field197++;
    }

    @OriginalMember(owner = "client!an", name = "b", descriptor = "(I)V", line = 37)
    public static final void method96(int arg0) {
        field198++;
        if (class680.field9649 != null) {
            return;
        }
        Container var1;
        if (class77.field796 != null) {
            var1 = class77.field796;
        } else if (class485.field7068 == null) {
            var1 = class663.field9432;
        } else {
            var1 = class485.field7068;
        }
        class433.field5699 = var1.getSize().width;
        class680.field9645 = var1.getSize().height;
        if (arg0 != -25579) {
            field204 = 11;
        }
        if (class77.field796 == var1) {
            Insets var2 = class77.field796.getInsets();
            class433.field5699 -= var2.left + var2.right;
            class680.field9645 -= var2.top + var2.bottom;
        }
        if (class480.method2800(32032) == 1) {
            class416.field5524 = class137.field1567;
            class600.field8523 = 0;
            class399.field5336 = class466.field6460;
            class287.field3673 = (class433.field5699 - class466.field6460) / 2;
        } else {
            class562.method3173(arg0 ^ 0xFFFF9815);
        }
        if (class73.field771 != class553.field7884) {
            boolean var10000;
            if (class399.field5336 < 1024 && class416.field5524 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        class220.field2664.setSize(class399.field5336, class416.field5524);
        if (class453.field6284 != null) {
            class453.field6284.method325(class220.field2664);
        }
        if (class77.field796 == var1) {
            Insets var3 = class77.field796.getInsets();
            class220.field2664.setLocation(class287.field3673 + var3.left, class600.field8523 + var3.top);
        } else {
            class220.field2664.setLocation(class287.field3673, class600.field8523);
        }
        if (class397.field5320 != -1) {
            class433.method2313(-81, true);
        }
        class280.method1597(false);
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(II)Lel;", line = 117)
    public final class499 method97(int arg0, int arg1) {
        field201++;
        class653 var3 = this.field202;
        class499 var4;
        synchronized (this.field202) {
            var4 = (class499) this.field202.method3690((byte) 119, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class303 var5 = this.field203;
        byte[] var6;
        synchronized (this.field203) {
            var6 = this.field203.method1719(arg0, 26, 4);
        }
        class499 var7 = new class499();
        if (var6 != null) {
            var7.method2867(new class452(var6), -27836);
        }
        class653 var8 = this.field202;
        synchronized (this.field202) {
            if (arg1 <= 9) {
                this.method97(-101, 31);
            }
            this.field202.method3683(var7, (byte) 127, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(B)V", line = 150)
    public final void method98(byte arg0) {
        class653 var2 = this.field202;
        synchronized (this.field202) {
            int var3 = 37 / ((53 - arg0) / 46);
            this.field202.method3684(-17200);
        }
        field205++;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(ILjo;)V", line = 164)
    public static final void method99(int arg0, class303 arg1) {
        field199++;
        if (arg0 != 21827) {
            method99(-117, null);
        }
        class379.field4917 = arg1;
    }

    @OriginalMember(owner = "client!an", name = "<init>", descriptor = "(Ljda;ILjo;)V", line = 183)
    public class22(class207 arg0, int arg1, class303 arg2) {
        this.field203 = arg2;
        this.field203.method1727(-77, 26);
    }
}
