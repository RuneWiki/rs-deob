import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class286 extends Canvas {

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "Ljava/awt/Component;")
    private Component field4018;

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "F")
    public static float field4016 = 0.0F;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "Z")
    public static boolean field4013 = true;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
    public static int field4014 = 0;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
    public static int field4009;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
    public static int field4010;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
    public static int field4011;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
    public static int field4012;

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "I")
    public static int field4015;

    @OriginalMember(owner = "client!jb", name = "k", descriptor = "I")
    public static int field4019;

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "[Lgj;")
    public static class381[] field4017;

    @OriginalMember(owner = "client!jb", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 5)
    public final void update(Graphics arg0) {
        this.field4018.update(arg0);
        field4019++;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(JB)V", line = 14)
    public static final void method1867(long arg0, byte arg1) {
        field4015++;
        class62.field718.field3320 = 0;
        class62.field718.method1583(21, (byte) -114);
        if (arg1 < 9) {
            field4014 = 29;
        }
        class62.field718.method1615(arg0, 94);
        class69.field803 = 1;
        class366.field5192 = 0;
        class222.field3109 = -3;
        class298.field4171 = 0;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Ltq;Ltq;Z)V", line = 35)
    public static final void method1868(class376 arg0, class376 arg1, boolean arg2) {
        class412.field5909 = arg1;
        field4012++;
        if (!arg2) {
            field4016 = -1.4897178F;
        }
        class8.field123 = arg0;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lce;ZZB)V", line = 47)
    public static final void method1869(class167 arg0, boolean arg1, boolean arg2, byte arg3) {
        field4010++;
        int var4 = arg0.field2332;
        int var5 = (int) arg0.field5855;
        arg0.method2594((byte) -22);
        if (arg1) {
            class292.method1936(var4, (byte) -121);
        }
        class127.method792(var4, false);
        class184 var6 = class282.method1863(var5, -25835);
        if (var6 != null) {
            class186.method1277(var6, (byte) 101);
        }
        class156.method936((byte) -121);
        if (!arg2 && class248.field3548 != -1) {
            class94.method524(1, 0, class248.field3548);
        }
        if (arg3 < 74) {
            method1871(126);
        }
        class389 var7 = new class389(class22.field280);
        for (class167 var8 = (class167) var7.method2491(-124); var8 != null; var8 = (class167) var7.method2494((byte) -122)) {
            if (!var8.method2598((byte) 35)) {
                var8 = (class167) var7.method2491(-107);
                if (var8 == null) {
                    return;
                }
            }
            if (var8.field2338 == 3) {
                int var9 = (int) var8.field5855;
                if (var9 >>> 16 == var4) {
                    method1869(var8, true, arg2, (byte) 90);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 107)
    public final void paint(Graphics arg0) {
        field4011++;
        this.field4018.paint(arg0);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IILjava/lang/String;)V", line = 115)
    public static final void method1870(int arg0, int arg1, String arg2) {
        field4009++;
        boolean var3 = false;
        for (int var4 = 0; var4 < class305.field4287; var4++) {
            class40 var5 = class26.field314[class94.field1135[var4]];
            if (var5 != null && var5.field487 != null && var5.field487.equalsIgnoreCase(arg2)) {
                if (arg1 == 1) {
                    class62.field718.method2143(2, -2);
                    class202.field2897++;
                    class62.field718.method1557(301673864, 0);
                    class62.field718.method1612(class94.field1135[var4], -17029);
                } else if (arg1 == 4) {
                    class24.field301++;
                    class62.field718.method2143(59, -2);
                    class62.field718.method1605(class94.field1135[var4], false);
                    class62.field718.method1611(-53, 0);
                } else if (arg1 == 5) {
                    class210.field2990++;
                    class62.field718.method2143(33, -2);
                    class62.field718.method1612(class94.field1135[var4], -17029);
                    class62.field718.method1583(0, (byte) -48);
                } else if (arg1 == 6) {
                    class62.field718.method2143(169, -2);
                    class207.field2940++;
                    class62.field718.method1563(-2, class94.field1135[var4]);
                    class62.field718.method1611(-69, 0);
                } else if (arg1 == 7) {
                    class62.field718.method2143(40, -2);
                    class399.field5698++;
                    class62.field718.method1563(-2, class94.field1135[var4]);
                    class62.field718.method1583(0, (byte) -82);
                }
                var3 = true;
                break;
            }
        }
        int var6 = 25 / ((arg0 - 68) / 39);
        if (!var3) {
            class105.method578(class132.field1603.method2331(25, class271.field3836) + arg2, (byte) -45);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V", line = 195)
    public static void method1871(int arg0) {
        field4017 = null;
        if (arg0 != 17439) {
            method1870(122, 54, (String) null);
        }
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 214)
    public class286(Component arg0) {
        this.field4018 = arg0;
    }
}
