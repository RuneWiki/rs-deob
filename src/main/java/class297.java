import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class297 extends class7 {

    @OriginalMember(owner = "client!dk", name = "H", descriptor = "Ljc;")
    public class252 field4726;

    @OriginalMember(owner = "client!dk", name = "x", descriptor = "Lll;")
    public class203 field4716;

    @OriginalMember(owner = "client!dk", name = "A", descriptor = "I")
    public static int field4719 = 0;

    @OriginalMember(owner = "client!dk", name = "v", descriptor = "I")
    public int field4714;

    @OriginalMember(owner = "client!dk", name = "w", descriptor = "I")
    public static int field4715;

    @OriginalMember(owner = "client!dk", name = "y", descriptor = "I")
    public static int field4717;

    @OriginalMember(owner = "client!dk", name = "z", descriptor = "I")
    public int field4718;

    @OriginalMember(owner = "client!dk", name = "B", descriptor = "I")
    public int field4720;

    @OriginalMember(owner = "client!dk", name = "C", descriptor = "I")
    public int field4721;

    @OriginalMember(owner = "client!dk", name = "D", descriptor = "I")
    public int field4722;

    @OriginalMember(owner = "client!dk", name = "E", descriptor = "I")
    public static int field4723;

    @OriginalMember(owner = "client!dk", name = "F", descriptor = "I")
    public static int field4724;

    @OriginalMember(owner = "client!dk", name = "I", descriptor = "I")
    public static int field4727;

    @OriginalMember(owner = "client!dk", name = "J", descriptor = "I")
    public static int field4728;

    @OriginalMember(owner = "client!dk", name = "K", descriptor = "I")
    public static int field4729;

    @OriginalMember(owner = "client!dk", name = "G", descriptor = "[I")
    public static int[] field4725;

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "(I)V", line = 8)
    public static final void method2000(int arg0) {
        field4724++;
        if (class432.field6376 != null) {
            if (class432.field6376.field304 == 1) {
                class432.field6376 = null;
                return;
            }
            if (class432.field6376.field304 == 2) {
                class340.method2234(class344.field5295, 2, 26153, class328.field5141);
                class432.field6376 = null;
                return;
            }
        }
        if (arg0 > -53) {
            field4725 = null;
        }
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(BI)V", line = 43)
    public static final void method2001(byte arg0, int arg1) {
        class354.field5446 = arg1;
        if (arg0 != -88) {
            field4727 = -50;
        }
        field4717++;
        class52 var2 = class130.field2044;
        synchronized (class130.field2044) {
            class130.field2044.method335((byte) 101);
        }
    }

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "(I)V", line = 57)
    public static void method2002(int arg0) {
        if (arg0 > -121) {
            field4719 = 78;
        }
        field4725 = null;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIZBIII)V", line = 68)
    public static final void method2003(int arg0, int arg1, boolean arg2, byte arg3, int arg4, int arg5, int arg6) {
        class13.field184 = arg6;
        class326.field5116 = arg1;
        class216.field3544 = arg0;
        int var7 = -123 / ((arg3 + 20) / 62);
        field4728++;
        class196.field3175 = arg4;
        class196.field3183 = arg5;
        if (arg2 && class13.field184 >= 100) {
            class290.field4631 = class326.field5116 * 128 + 64;
            class427.field6301 = class196.field3175 * 128 + 64;
            class379.field5733 = class58.method386(class266.field4286, (byte) -92, class427.field6301, class290.field4631) - class196.field3183;
        }
        class13.field194 = 2;
    }

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "(I)V", line = 99)
    public final void method2004(int arg0) {
        field4715++;
        this.field4720 = this.field4726.field4114;
        this.field4721 = this.field4726.field4112;
        this.field4714 = this.field4726.field4105;
        if (this.field4726.field4113 != null) {
            this.field4726.field4113.method1996(this.field4716.field3257, this.field4716.field3259, this.field4716.field3249, class282.field4541);
        }
        if (arg0 < -113) {
            this.field4722 = class282.field4541[2];
            this.field4718 = class282.field4541[0];
        }
    }

    @OriginalMember(owner = "client!dk", name = "i", descriptor = "(I)V", line = 121)
    public static final void method2005(int arg0) {
        field4729++;
        if (arg0 <= 104) {
            return;
        }
        for (class359 var1 = (class359) class235.field3928.method253((byte) -6); var1 != null; var1 = (class359) class235.field3928.method247((byte) 19)) {
            if (var1.field5502 == -1) {
                var1.field5503 = 0;
                class326.method2170((byte) 94, var1);
            } else {
                var1.method1120(121);
            }
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Z[[I)V", line = 146)
    public static final void method2006(boolean arg0, int[][] arg1) {
        if (arg0) {
            field4725 = null;
        }
        field4723++;
        class277.field4414 = arg1;
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(Ljc;Lpj;)V", line = 162)
    public class297(class252 arg0, class78 arg1) {
        this.field4726 = arg0;
        this.field4716 = class180.method1235(-30827, arg0.field4110);
        this.method2004(-118);
    }
}
