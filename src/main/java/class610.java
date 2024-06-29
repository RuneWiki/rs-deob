import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kha")
public class class610 {

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "I")
    public int field8513 = 0;

    @OriginalMember(owner = "client!kha", name = "f", descriptor = "Lvl;")
    public static class15 field8518 = new class15(84, 8);

    @OriginalMember(owner = "client!kha", name = "g", descriptor = "Lfja;")
    public static class783 field8519 = new class783(52, -2);

    @OriginalMember(owner = "client!kha", name = "i", descriptor = "I")
    public static int field8521 = -1;

    @OriginalMember(owner = "client!kha", name = "h", descriptor = "I")
    public static int field8520 = 0;

    @OriginalMember(owner = "client!kha", name = "b", descriptor = "I")
    public static int field8514;

    @OriginalMember(owner = "client!kha", name = "c", descriptor = "I")
    public static int field8515;

    @OriginalMember(owner = "client!kha", name = "d", descriptor = "I")
    public static int field8516;

    @OriginalMember(owner = "client!kha", name = "e", descriptor = "I")
    public static int field8517;

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(Lfca;B)V", line = 3)
    public final void method3460(class93 arg0, byte arg1) {
        field8517++;
        if (arg1 != 104) {
            return;
        }
        while (true) {
            int var3 = arg0.method793((byte) 95);
            if (var3 == 0) {
                return;
            }
            this.method3463(var3, arg1 - 102, arg0);
        }
    }

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(III)Z", line = 31)
    public static final boolean method3461(int arg0, int arg1, int arg2) {
        if (arg0 != 21906) {
            method3464(92);
        }
        field8515++;
        return (arg2 & 0x22) != 0;
    }

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(I)V", line = 45)
    public static void method3462(int arg0) {
        if (arg0 <= 33) {
            method3462(77);
        }
        field8518 = null;
        field8519 = null;
    }

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(IILfca;)V", line = 61)
    private final void method3463(int arg0, int arg1, class93 arg2) {
        if (arg0 == 5) {
            this.field8513 = arg2.method763(6);
        }
        if (arg1 == 2) {
            field8514++;
        }
    }

    @OriginalMember(owner = "client!kha", name = "b", descriptor = "(I)Z", line = 77)
    public static final boolean method3464(int arg0) {
        field8516++;
        try {
            if (arg0 != 19782) {
                method3462(52);
            }
            if (class469.field6348 == 2) {
                if (class736.field10168 == null) {
                    class736.field10168 = class77.method663(class11.field180, class126.field2224, class457.field6220);
                    if (class736.field10168 == null) {
                        return false;
                    }
                }
                if (class217.field3199 == null) {
                    class217.field3199 = new class573(class713.field9819, class593.field8329);
                }
                class558 var1 = class500.field6844;
                if (class676.field9431 != null) {
                    var1 = class676.field9431;
                }
                if (var1.method3226(22050, class736.field10168, class217.field3199, arg0 - 19766, class191.field2931)) {
                    class500.field6844 = var1;
                    class500.field6844.method3235(true);
                    if (class1.field6 <= 0) {
                        class469.field6348 = 0;
                        class500.field6844.method3207(class752.field10377, arg0 - 19783);
                        for (int var2 = 0; var2 < class427.field5834.length; var2++) {
                            class500.field6844.method3215((byte) -98, class427.field5834[var2], var2);
                            class427.field5834[var2] = 255;
                        }
                    } else {
                        class469.field6348 = 3;
                        class500.field6844.method3207(class752.field10377 >= class1.field6 ? class1.field6 : class752.field10377, -1);
                        for (int var3 = 0; var3 < class427.field5834.length; var3++) {
                            class500.field6844.method3215((byte) -98, class427.field5834[var3], var3);
                            class427.field5834[var3] = 255;
                        }
                    }
                    if (class676.field9431 == null) {
                        if (class203.field3067 <= 0L) {
                            class500.field6844.method3211(class234.field3371, (byte) -124, class736.field10168);
                        } else {
                            class500.field6844.method3241(-34, class203.field3067, class736.field10168, class234.field3371, true);
                        }
                    }
                    if (class449.field6151 != null) {
                        class449.field6151.method2704(0, class500.field6844);
                    }
                    class676.field9431 = null;
                    class11.field180 = null;
                    class217.field3199 = null;
                    class736.field10168 = null;
                    class203.field3067 = 0L;
                    return true;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            class500.field6844.method3234(-7);
            class736.field10168 = null;
            class11.field180 = null;
            class676.field9431 = null;
            class469.field6348 = 0;
            class217.field3199 = null;
        }
        return false;
    }
}
