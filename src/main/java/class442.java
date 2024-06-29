import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nw")
public class class442 {

    @OriginalMember(owner = "client!nw", name = "h", descriptor = "Z")
    public static boolean field6070 = false;

    @OriginalMember(owner = "client!nw", name = "c", descriptor = "Lkea;")
    public static class77 field6065 = new class77(2);

    @OriginalMember(owner = "client!nw", name = "i", descriptor = "Lju;")
    public static class102 field6071 = new class102(3, -1);

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "I")
    public static int field6063;

    @OriginalMember(owner = "client!nw", name = "d", descriptor = "I")
    public static int field6066;

    @OriginalMember(owner = "client!nw", name = "e", descriptor = "I")
    public static int field6067;

    @OriginalMember(owner = "client!nw", name = "f", descriptor = "I")
    public static int field6068;

    @OriginalMember(owner = "client!nw", name = "g", descriptor = "I")
    public static int field6069;

    @OriginalMember(owner = "client!nw", name = "j", descriptor = "I")
    public static int field6072;

    @OriginalMember(owner = "client!nw", name = "b", descriptor = "Loq;")
    public static class742 field6064;

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(III)Z", line = 4)
    public static final boolean method2640(int arg0, int arg1, int arg2) {
        field6066++;
        if (arg0 != 3) {
            method2641(-115, -104, true, -17, 101);
        }
        return (arg1 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(IIZII)Leda;", line = 17)
    public static final class14 method2641(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field6063++;
        class14 var5 = new class14();
        var5.field195 = arg3;
        var5.field194 = arg4;
        class426.field5894.method1387(var5, (long) arg1, (byte) -111);
        class191.method1271(arg4, (byte) -69);
        class712 var6 = class733.method4073(true, arg1);
        if (var6 != null) {
            class116.method764(var6, -1176833464);
        }
        if (class240.field3352 != null) {
            class116.method764(class240.field3352, -1176833464);
            class240.field3352 = null;
        }
        class501.method2992((byte) -50);
        if (var6 != null) {
            class645.method3740(!arg2, (byte) -62, var6);
        }
        if (!arg2) {
            class318.method1836(arg4);
        }
        if (!arg2 && class312.field4004 != -1) {
            class217.method1420(class312.field4004, 1, -6248);
        }
        if (arg0 != Integer.MAX_VALUE) {
            field6064 = null;
        }
        return var5;
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(ILha;I)V", line = 60)
    public static final void method2642(int arg0, class545 arg1, int arg2) {
        field6069++;
        if (!class57.field802 || !class238.field3315) {
            class75.field1036 = 0;
            return;
        }
        if (class196.field2835) {
            class519.field7254 = class137.field1831.method1445((byte) -7);
        }
        class114.field1607 = 0;
        class158.field2144 = 0;
        class27.field355 = 0;
        int[] var3 = arg1.method2107();
        class748.field10408 = (int) ((float) var3[2] / 3.0F);
        class624.field8905 = (int) ((float) var3[3] / 3.0F);
        arg1.method2127(class366.field4705);
        if ((int) ((float) class366.field4705[0] / 3.0F) != class102.field1460 || ((int) ((float) class366.field4705[1] / 3.0F)) != class690.field9668) {
            class690.field9668 = (int) ((float) class366.field4705[1] / 3.0F);
            class102.field1460 = (int) ((float) class366.field4705[0] / 3.0F);
            class732.field10235 = class102.field1460 >> 1;
            class323.field4158 = class690.field9668 >> 1;
            class185.field2719 = new int[class690.field9668 * class102.field1460];
        }
        class101.field1451 = arg1.method2135();
        class75.field1036 = 0;
        for (int var4 = 0; var4 < class679.field9573; var4++) {
            class202.method1357(arg1, 23676, class425.field5891[var4], arg0);
        }
        if (arg2 > -43) {
            return;
        }
        for (int var5 = 0; var5 < class163.field2248; var5++) {
            class202.method1357(arg1, 23676, class565.field8029[var5], arg0);
        }
        for (int var6 = 0; var6 < class290.field3802; var6++) {
            class202.method1357(arg1, 23676, class78.field1059[var6], arg0);
        }
        class129.field1762 = 0;
        if (class75.field1036 > 0) {
            int var7 = class185.field2719.length;
            int var8 = var7 - var7 & 0x7;
            int var9 = 0;
            while (var8 > var9) {
                class185.field2719[var9++] = Integer.MAX_VALUE;
                class185.field2719[var9++] = Integer.MAX_VALUE;
                class185.field2719[var9++] = Integer.MAX_VALUE;
                class185.field2719[var9++] = Integer.MAX_VALUE;
                class185.field2719[var9++] = Integer.MAX_VALUE;
                class185.field2719[var9++] = Integer.MAX_VALUE;
                class185.field2719[var9++] = Integer.MAX_VALUE;
                class185.field2719[var9++] = Integer.MAX_VALUE;
            }
            while (var9 < var7) {
                class185.field2719[var9++] = Integer.MAX_VALUE;
            }
            class209.field2969 = 1;
            for (int var10 = 0; var10 < class75.field1036; var10++) {
                class27 var11 = class313.field4023[var10];
                class435.method2617(var11.field354[3], var11.field353[1], var11.field354[0], var11.field353[3], var11.field353[0], var11.field346[1], -25506, var11.field354[1], var11.field346[3], var11.field346[0]);
                class435.method2617(var11.field354[3], var11.field353[2], var11.field354[1], var11.field353[3], var11.field353[1], var11.field346[2], -25506, var11.field354[2], var11.field346[3], var11.field346[1]);
            }
            class209.field2969 = 2;
        }
        if (class196.field2835) {
            class437.field5997 = class137.field1831.method1445((byte) -7) - class519.field7254;
        }
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(I)V", line = 169)
    public static final void method2643(int arg0) {
        field6067++;
        class538 var1 = class585.field8426;
        synchronized (class585.field8426) {
            class585.field8426.method3210(false);
            int var2 = 23 / ((89 - arg0) / 33);
        }
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(Z)V", line = 182)
    public static void method2644(boolean arg0) {
        field6064 = null;
        if (arg0) {
            method2643(-58);
        }
        field6071 = null;
        field6065 = null;
    }
}
