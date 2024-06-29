import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public class class304 {

    @OriginalMember(owner = "client!os", name = "h", descriptor = "Ljv;")
    private class55 field4643 = new class55(16);

    @OriginalMember(owner = "client!os", name = "k", descriptor = "Lbu;")
    private class17 field4646;

    @OriginalMember(owner = "client!os", name = "a", descriptor = "I")
    public static int field4636;

    @OriginalMember(owner = "client!os", name = "b", descriptor = "I")
    public static int field4637;

    @OriginalMember(owner = "client!os", name = "c", descriptor = "I")
    public static int field4638;

    @OriginalMember(owner = "client!os", name = "d", descriptor = "I")
    public static int field4639;

    @OriginalMember(owner = "client!os", name = "e", descriptor = "I")
    public static int field4640;

    @OriginalMember(owner = "client!os", name = "f", descriptor = "I")
    public static int field4641;

    @OriginalMember(owner = "client!os", name = "g", descriptor = "I")
    public static int field4642;

    @OriginalMember(owner = "client!os", name = "i", descriptor = "I")
    public static int field4644;

    @OriginalMember(owner = "client!os", name = "j", descriptor = "I")
    public static int field4645;

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(B)V", line = 3)
    public final void method1991(byte arg0) {
        if (arg0 != 28) {
            this.method1992(105, -126, -99, -15, 113, null);
        }
        class55 var2 = this.field4643;
        synchronized (this.field4643) {
            this.field4643.method484(76);
        }
        field4644++;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IIIIILrb;)Lib;", line = 16)
    public final class105 method1992(int arg0, int arg1, int arg2, int arg3, int arg4, class234 arg5) {
        field4642++;
        if (arg3 != -23528) {
            method1997(null, 123);
        }
        class266[] var7 = null;
        class193 var8 = this.method1998(arg1, (byte) -35);
        if (var8.field2858 != null) {
            var7 = new class266[var8.field2858.length];
            for (int var9 = 0; var9 < var7.length; var9++) {
                class316 var10 = arg5.method1539(var8.field2858[var9], -3765);
                var7[var9] = new class266(var10.field4763, var10.field4755, var10.field4761, var10.field4764, var10.field4760, var10.field4756, var10.field4757, var10.field4762);
            }
        }
        return new class105(var8.field2854, var7, var8.field2860, arg2, arg4, arg0);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Ljava/lang/String;ILcu;)I", line = 54)
    public static final int method1993(String arg0, int arg1, class145 arg2) {
        if (arg1 >= -75) {
            return -41;
        }
        field4641++;
        int var3 = arg2.field2289;
        byte[] var4 = class21.method175(arg0, 111);
        arg2.method1060(var4.length, false);
        arg2.field2289 += class3.field101.method2877(arg2.field2289, var4.length, (byte) -109, 0, var4, arg2.field2270);
        return arg2.field2289 - var3;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(II)V", line = 75)
    public final void method1994(int arg0, int arg1) {
        field4639++;
        if (arg1 >= -85) {
            method1997(null, -111);
        }
        class55 var3 = this.field4643;
        synchronized (this.field4643) {
            this.field4643.method493(false, arg0);
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(ILli;I)I", line = 88)
    public static final int method1995(int arg0, class293 arg1, int arg2) {
        field4636++;
        return arg0;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(I)V", line = 101)
    public final void method1996(int arg0) {
        class55 var2 = this.field4643;
        synchronized (this.field4643) {
            this.field4643.method488(-3);
            if (arg0 >= -8) {
                this.field4646 = null;
            }
        }
        field4640++;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Ljava/awt/Component;I)Luv;", line = 117)
    public static final class243 method1997(Component arg0, int arg1) {
        field4638++;
        int var2 = 118 / ((82 - arg1) / 34);
        return new class445(arg0);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IB)Leo;", line = 127)
    private final class193 method1998(int arg0, byte arg1) {
        field4645++;
        class55 var3 = this.field4643;
        class193 var4;
        synchronized (this.field4643) {
            var4 = (class193) this.field4643.method494(0, (long) arg0);
        }
        if (arg1 != -35) {
            method1995(44, null, 57);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field4646.method114(arg0, 29, 123);
        class193 var6 = new class193();
        if (var5 != null) {
            var6.method1329(new class145(var5), true);
        }
        class55 var7 = this.field4643;
        synchronized (this.field4643) {
            this.field4643.method485((long) arg0, (byte) -125, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!os", name = "<init>", descriptor = "(Loq;ILbu;)V", line = 158)
    public class304(class239 arg0, int arg1, class17 arg2) {
        this.field4646 = arg2;
        this.field4646.method119(29630, 29);
    }
}
