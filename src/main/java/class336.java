import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jba")
public class class336 extends class176 {

    @OriginalMember(owner = "client!jba", name = "B", descriptor = "Ldaa;")
    public static class11 field4482 = new class11(new byte[5000]);

    @OriginalMember(owner = "client!jba", name = "J", descriptor = "Lcba;")
    public static class471 field4489 = new class471(97, 7);

    @OriginalMember(owner = "client!jba", name = "m", descriptor = "I")
    public int field4467;

    @OriginalMember(owner = "client!jba", name = "n", descriptor = "I")
    public int field4468;

    @OriginalMember(owner = "client!jba", name = "o", descriptor = "I")
    public int field4469;

    @OriginalMember(owner = "client!jba", name = "p", descriptor = "I")
    public int field4470;

    @OriginalMember(owner = "client!jba", name = "q", descriptor = "I")
    public static int field4471;

    @OriginalMember(owner = "client!jba", name = "r", descriptor = "I")
    public static int field4472;

    @OriginalMember(owner = "client!jba", name = "s", descriptor = "I")
    public int field4473;

    @OriginalMember(owner = "client!jba", name = "t", descriptor = "I")
    public int field4474;

    @OriginalMember(owner = "client!jba", name = "u", descriptor = "I")
    public static int field4475;

    @OriginalMember(owner = "client!jba", name = "v", descriptor = "I")
    public int field4476;

    @OriginalMember(owner = "client!jba", name = "x", descriptor = "I")
    public int field4478;

    @OriginalMember(owner = "client!jba", name = "y", descriptor = "I")
    public int field4479;

    @OriginalMember(owner = "client!jba", name = "z", descriptor = "I")
    public int field4480;

    @OriginalMember(owner = "client!jba", name = "A", descriptor = "I")
    public static int field4481;

    @OriginalMember(owner = "client!jba", name = "C", descriptor = "I")
    public int field4483;

    @OriginalMember(owner = "client!jba", name = "D", descriptor = "I")
    public int field4484;

    @OriginalMember(owner = "client!jba", name = "E", descriptor = "I")
    public static int field4485;

    @OriginalMember(owner = "client!jba", name = "H", descriptor = "I")
    public int field4488;

    @OriginalMember(owner = "client!jba", name = "K", descriptor = "I")
    public int field4490;

    @OriginalMember(owner = "client!jba", name = "L", descriptor = "I")
    public int field4491;

    @OriginalMember(owner = "client!jba", name = "w", descriptor = "Lqb;")
    public static class189 field4477;

    @OriginalMember(owner = "client!jba", name = "F", descriptor = "Lan;")
    public static class21 field4486;

    // $FF: synthetic field
    @OriginalMember(owner = "client!jba", name = "M", descriptor = "Ljava/lang/Class;")
    public static Class field4492;

    // $FF: synthetic field
    @OriginalMember(owner = "client!jba", name = "N", descriptor = "Ljava/lang/Class;")
    public static Class field4493;

    @OriginalMember(owner = "client!jba", name = "G", descriptor = "[Lha;")
    public static class52[] field4487;

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(ZLjava/lang/String;)Z")
    public static final boolean method2038(boolean arg0, String arg1) {
        if (arg0) {
            field4487 = null;
        }
        field4475++;
        return class448.method2644((byte) -69, field4492 == null ? (field4492 = method2043("ub")) : field4492, arg1);
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(Lqa;BI)Lr;")
    public final class157 method2039(class207 arg0, byte arg1, int arg2) {
        field4471++;
        int var4 = class147.field2269[this.field4468];
        if (arg1 != 0) {
            return null;
        }
        class157 var5 = null;
        if (var4 == 0) {
            class344 var6 = class265.method1739(this.field4473, this.field4479, this.field4491);
            if (var6 instanceof class214) {
                class214 var7 = (class214) var6;
                if (var7.field3030 != null) {
                    var5 = ((class115) var7.field3030).method744((byte) -114, arg0, arg2);
                }
            }
        } else if (var4 == 1) {
            class23 var8 = class548.method3127(this.field4473, this.field4479, this.field4491);
            if (var8 instanceof class191) {
                class191 var9 = (class191) var8;
                if (var9.field2703 != null) {
                    var5 = ((class115) var9.field2703).method744((byte) -128, arg0, arg2);
                }
            }
        } else if (var4 == 2) {
            class425 var10 = class582.method3324(this.field4473, this.field4479, this.field4491, field4493 == null ? (field4493 = method2043("wf")) : field4493);
            if (var10 instanceof class130) {
                class130 var11 = (class130) var10;
                if (var11.field2073 != null) {
                    var5 = ((class115) var11.field2073).method744((byte) -123, arg0, arg2);
                }
            }
        } else if (var4 == 3) {
            class197 var12 = class404.method2411(this.field4473, this.field4479, this.field4491);
            if (var12 instanceof class469) {
                class469 var13 = (class469) var12;
                if (var13.field6602 != null) {
                    var5 = ((class115) var13.field6602).method744((byte) 82, arg0, arg2);
                }
            }
        }
        return var5 == null ? null : var5.method163((byte) 0, arg2, true);
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(B)V")
    public static void method2040(byte arg0) {
        if (arg0 <= 15) {
            method2038(true, null);
        }
        field4487 = null;
        field4486 = null;
        field4489 = null;
        field4477 = null;
        field4482 = null;
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(Lqa;I)V")
    public static final void method2041(class207 arg0, int arg1) {
        arg0.method1308(0, 0, class387.field5196, 350);
        field4472++;
        arg0.method1321(0, 0, class387.field5196, 350, class519.field7316 << 24 | 0x332277, 1);
        int var2 = 350 / class576.field7932;
        if (class266.field3735 > 0) {
            int var3 = 342 - class576.field7932;
            int var4 = var2 * var3 / (class266.field3735 + var2 - 1);
            int var5 = 4;
            if (class266.field3735 > 1) {
                var5 += (class266.field3735 - class169.field2443 - 1) * (var3 - var4) / (class266.field3735 - 1);
            }
            arg0.method1321(class387.field5196 - 16, var5, 12, var4, class519.field7316 << 24 | 0x332277, 2);
            for (int var6 = class169.field2443; var6 < class169.field2443 + var2 && class266.field3735 > var6; var6++) {
                String[] var7 = class294.method1884(1, class607.field8742[var6], '\b');
                int var8 = (class387.field5196 - 24) / var7.length;
                for (int var9 = 0; var9 < var7.length; var9++) {
                    int var10 = var8 * var9 + 8;
                    arg0.method1308(var10, 0, var8 + var10 - 8, 350);
                    class206.field2905.method663(-128, -16777216, var10, var7[var9], 350 - (class208.field2944.field6813 + ((var6 - class169.field2443) * class576.field7932) + class435.field6195 + 2), -1);
                }
            }
        }
        arg0.method1308(0, 0, class387.field5196, 350);
        int var11 = -14 / ((-arg1 - 89) / 33);
        arg0.method1316(-1, class387.field5196, 0, 350 - class435.field6195, 0);
        class515.field7246.method663(-45, -16777216, 10, "--> " + class585.field8364, 350 - class40.field798.field6813 - 1, -1);
        if (!class408.field5783) {
            return;
        }
        int var12 = -1;
        if ((class405.field5763 % 30) > 15) {
            var12 = 16777215;
        }
        arg0.method1335(350 - class40.field798.field6813 - 11, 12, 0, var12, class40.field798.method2810("--> " + class585.field8364.substring(0, class148.field2273), (byte) 124) + 10);
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(BI)V")
    public static final void method2042(byte arg0, int arg1) {
        field4485++;
        if (arg0 <= 4) {
            field4477 = null;
        }
        class314 var2 = class483.method2819(14, arg1, 21303);
        var2.method1962((byte) 0);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2043(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
