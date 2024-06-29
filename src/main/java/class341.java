import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vu")
public class class341 {

    @OriginalMember(owner = "client!vu", name = "d", descriptor = "Lni;")
    private class522 field4590;

    @OriginalMember(owner = "client!vu", name = "f", descriptor = "Lni;")
    private class522 field4592;

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "I")
    public static int field4588 = 4;

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "I")
    public static int field4587;

    @OriginalMember(owner = "client!vu", name = "e", descriptor = "I")
    public static int field4591;

    @OriginalMember(owner = "client!vu", name = "g", descriptor = "I")
    public static int field4593;

    @OriginalMember(owner = "client!vu", name = "h", descriptor = "I")
    public static int field4594;

    @OriginalMember(owner = "client!vu", name = "c", descriptor = "Lvv;")
    private class328 field4589;

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(ILji;)Lhi;")
    public static final class207 method2009(int arg0, class611 arg1) {
        field4594++;
        class424 var2 = class573.method3219((byte) 94, arg1);
        int var3 = arg1.method3413(false);
        if (arg0 != 1) {
            field4588 = -67;
        }
        return new class207(var2.field2408, var2.field2412, var2.field2403, var2.field2406, var2.field2415, var2.field2402, var2.field2407, var2.field2405, var2.field2414, var2.field5952, var2.field5946, var2.field5954, var2.field5950, var2.field5943, var2.field5953, var3);
    }

    @OriginalMember(owner = "client!vu", name = "<init>", descriptor = "(Lni;Lni;)V")
    public class341(class522 arg0, class522 arg1) {
        this.field4590 = arg0;
        this.field4592 = arg1;
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(Z)Lvv;")
    private final class328 method2010(boolean arg0) {
        field4593++;
        if (this.field4589 == null) {
            this.field4589 = new class328();
        }
        return arg0 ? null : this.field4589;
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(IIIILha;III)V")
    public static final void method2011(int arg0, int arg1, int arg2, int arg3, class60 arg4, int arg5, int arg6, int arg7) {
        class603.field8409 = arg4;
        field4591++;
        class527.field7074 = class603.field8409.method454();
        class725.field10127 = class603.field8409.method454();
        class545.field7704 = class603.field8409.method454();
        class283.field3748 = arg6;
        class173.field2147 = null;
        class65.field716 = 0;
        class392.field5553 = 1;
        class450.field6294 = arg1;
        class759.field10586 = arg5;
        class377.field5235 = arg3;
        class122.field1606 = 0;
        class702.method3957(arg7, arg2, 2);
        if (arg0 > -112) {
            method2009(42, null);
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(BLtda;)Lrea;")
    public final class209 method2012(byte arg0, class637 arg1) {
        field4587++;
        if (arg1 == null) {
            return null;
        }
        class750 var3 = arg1.method333(30778);
        if (class76.field925 == var3) {
            return new class494((class746) arg1);
        } else if (class50.field525 == var3) {
            return new class246(this.method2010(false), (class511) arg1);
        } else if (class268.field3558 == var3) {
            return new class684(this.field4590, (class263) arg1);
        } else if (class93.field1228 == var3) {
            return new class492(this.field4590, (class658) arg1);
        } else if (class208.field2506 == var3) {
            return new class147(this.field4590, this.field4592, (class288) arg1);
        } else if (class291.field3849 == var3) {
            return new class180(this.field4590, this.field4592, (class352) arg1);
        } else if (class164.field2054 == var3) {
            return new class499(this.field4590, this.field4592, (class424) arg1);
        } else if (class659.field9196 == var3) {
            return new class37(this.field4590, this.field4592, (class58) arg1);
        } else if (class51.field535 == var3) {
            return new class438(this.field4590, (class275) arg1);
        } else if (class360.field4762 == var3) {
            return new class129(this.field4590, this.field4592, (class207) arg1);
        } else {
            if (arg0 != 62) {
                this.field4592 = null;
            }
            return null;
        }
    }
}
