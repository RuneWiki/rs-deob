import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class208 {

    @OriginalMember(owner = "client!kg", name = "k", descriptor = "F")
    public float field2727 = 1.0F;

    @OriginalMember(owner = "client!kg", name = "n", descriptor = "F")
    public float field2730 = 0.25F;

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "F")
    public float field2718 = 1.0F;

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "I")
    public int field2723;

    @OriginalMember(owner = "client!kg", name = "l", descriptor = "I")
    public int field2728;

    @OriginalMember(owner = "client!kg", name = "r", descriptor = "I")
    public int field2734;

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "F")
    public float field2721;

    @OriginalMember(owner = "client!kg", name = "s", descriptor = "Laq;")
    public class108 field2735;

    @OriginalMember(owner = "client!kg", name = "j", descriptor = "F")
    public float field2726;

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "F")
    public float field2720;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "I")
    public int field2717;

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "I")
    public int field2722;

    @OriginalMember(owner = "client!kg", name = "u", descriptor = "I")
    public int field2737;

    @OriginalMember(owner = "client!kg", name = "o", descriptor = "Lcb;")
    public static class318 field2731 = new class318(30, 4);

    @OriginalMember(owner = "client!kg", name = "q", descriptor = "I")
    public static int field2733 = 1;

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "I")
    public static int field2719;

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "I")
    public static int field2724;

    @OriginalMember(owner = "client!kg", name = "i", descriptor = "I")
    public static int field2725;

    @OriginalMember(owner = "client!kg", name = "m", descriptor = "I")
    public static int field2729;

    @OriginalMember(owner = "client!kg", name = "p", descriptor = "I")
    public static int field2732;

    @OriginalMember(owner = "client!kg", name = "t", descriptor = "I")
    public static int field2736;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lfca;IBI)V")
    public static final void method1301(class188 arg0, int arg1, byte arg2, int arg3) {
        field2729++;
        if (arg0 == null) {
            return;
        }
        if (arg0.field2441 != null) {
            class425 var4 = new class425();
            var4.field5911 = arg0;
            var4.field5913 = arg0.field2441;
            class317.method2051(var4);
        }
        class59.field828 = arg0.field2361;
        class413.field5798 = arg0.field2434;
        class525.field7268 = arg3;
        class613.field8378 = true;
        class525.field7257 = arg1;
        class664.field9413 = arg0.field2394;
        class68.field898 = arg0.field2387;
        class443.field6115 = arg0.field2324;
        if (arg2 < 86) {
            method1301(null, -56, (byte) -16, 76);
        }
        class553.method3100(arg0, 0);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method1302(int arg0, String arg1) {
        if (arg0 == 16) {
            field2724++;
            System.out.println("Error: " + class453.method2575("%0a", "\n", arg1, (byte) -21));
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lkg;B)Z")
    public final boolean method1303(class208 arg0, byte arg1) {
        field2736++;
        if (arg1 < 49) {
            return true;
        } else {
            return this.field2722 == arg0.field2722 && this.field2721 == arg0.field2721 && this.field2726 == arg0.field2726 && this.field2720 == arg0.field2720 && this.field2730 == arg0.field2730 && this.field2727 == arg0.field2727 && this.field2718 == arg0.field2718 && this.field2723 == arg0.field2723 && this.field2734 == arg0.field2734 && this.field2735 == arg0.field2735;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILdga;)V")
    public final void method1304(int arg0, class138 arg1) {
        this.field2727 = (float) (arg1.method957((byte) -68) * 8) / 255.0F;
        field2719++;
        if (arg0 < -88) {
            this.field2730 = (float) (arg1.method957((byte) -97) * 8) / 255.0F;
            this.field2718 = (float) (arg1.method957((byte) -112) * 8) / 255.0F;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)V")
    public static void method1305(int arg0) {
        field2731 = null;
        if (arg0 != 32250) {
            field2731 = null;
        }
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "()V")
    public class208() {
        this.field2723 = class4.field41;
        this.field2728 = -50;
        this.field2734 = 0;
        this.field2721 = 1.1523438F;
        this.field2735 = class59.field835;
        this.field2726 = 0.69921875F;
        this.field2720 = 1.2F;
        this.field2717 = -60;
        this.field2722 = class679.field9657;
        this.field2737 = -50;
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(Ldga;)V")
    public class208(class138 arg0) {
        int var2 = arg0.method957((byte) -120);
        if (class72.field935.method2695(false, class161.field2038) && class606.field8280.method1962() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field2722 = class679.field9657;
            } else {
                this.field2722 = arg0.method943(-101);
            }
            if ((var2 & 0x2) == 0) {
                this.field2721 = 1.1523438F;
            } else {
                this.field2721 = (float) arg0.method922((byte) -120) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field2726 = 0.69921875F;
            } else {
                this.field2726 = (float) arg0.method922((byte) -128) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field2720 = 1.2F;
            } else {
                this.field2720 = (float) arg0.method922((byte) -124) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method943(-94);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method922((byte) -125);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method922((byte) -122);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method922((byte) -128);
            }
            this.field2721 = 1.1523438F;
            this.field2726 = 0.69921875F;
            this.field2720 = 1.2F;
            this.field2722 = class679.field9657;
        }
        if ((var2 & 0x10) == 0) {
            this.field2737 = -50;
            this.field2728 = -50;
            this.field2717 = -60;
        } else {
            this.field2737 = arg0.method924(2);
            this.field2717 = arg0.method924(2);
            this.field2728 = arg0.method924(2);
        }
        if ((var2 & 0x20) == 0) {
            this.field2723 = class4.field41;
        } else {
            this.field2723 = arg0.method943(-97);
        }
        if ((var2 & 0x40) == 0) {
            this.field2734 = 0;
        } else {
            this.field2734 = arg0.method922((byte) -117);
        }
        if ((var2 & 0x80) == 0) {
            this.field2735 = class59.field835;
        } else {
            int var3 = arg0.method922((byte) -123);
            int var4 = arg0.method922((byte) -128);
            int var5 = arg0.method922((byte) -123);
            int var6 = arg0.method922((byte) -120);
            int var7 = arg0.method922((byte) -117);
            int var8 = arg0.method922((byte) -118);
            this.field2735 = class428.method2464(var3, 0, var8, var5, var4, var6, var7);
        }
    }
}
