import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public class class353 extends class508 {

    @OriginalMember(owner = "client!cu", name = "z", descriptor = "Lhb;")
    public static class250 field4517 = new class250(36, 12);

    @OriginalMember(owner = "client!cu", name = "H", descriptor = "Lil;")
    public static class47 field4525 = class272.method1676(2);

    @OriginalMember(owner = "client!cu", name = "I", descriptor = "Lpi;")
    public static class340 field4526 = null;

    @OriginalMember(owner = "client!cu", name = "L", descriptor = "Loi;")
    public static class169 field4529 = new class169("Loading sprites - ", "Lade Sprites - ", "Chargement des sprites - ", "Carregando sprites - ");

    @OriginalMember(owner = "client!cu", name = "N", descriptor = "I")
    public static int field4531 = 0;

    @OriginalMember(owner = "client!cu", name = "p", descriptor = "I")
    public int field4507;

    @OriginalMember(owner = "client!cu", name = "q", descriptor = "I")
    public int field4508;

    @OriginalMember(owner = "client!cu", name = "r", descriptor = "I")
    public int field4509;

    @OriginalMember(owner = "client!cu", name = "s", descriptor = "I")
    public int field4510;

    @OriginalMember(owner = "client!cu", name = "t", descriptor = "I")
    public int field4511;

    @OriginalMember(owner = "client!cu", name = "u", descriptor = "I")
    public int field4512;

    @OriginalMember(owner = "client!cu", name = "v", descriptor = "I")
    public int field4513;

    @OriginalMember(owner = "client!cu", name = "w", descriptor = "I")
    public static int field4514;

    @OriginalMember(owner = "client!cu", name = "x", descriptor = "I")
    public int field4515;

    @OriginalMember(owner = "client!cu", name = "y", descriptor = "I")
    public int field4516;

    @OriginalMember(owner = "client!cu", name = "A", descriptor = "I")
    public int field4518;

    @OriginalMember(owner = "client!cu", name = "B", descriptor = "I")
    public int field4519;

    @OriginalMember(owner = "client!cu", name = "C", descriptor = "I")
    public int field4520;

    @OriginalMember(owner = "client!cu", name = "D", descriptor = "I")
    public static int field4521;

    @OriginalMember(owner = "client!cu", name = "E", descriptor = "I")
    public int field4522;

    @OriginalMember(owner = "client!cu", name = "F", descriptor = "I")
    public int field4523;

    @OriginalMember(owner = "client!cu", name = "G", descriptor = "I")
    public int field4524;

    @OriginalMember(owner = "client!cu", name = "J", descriptor = "I")
    public static int field4527;

    @OriginalMember(owner = "client!cu", name = "M", descriptor = "Lta;")
    public static class333 field4530;

    @OriginalMember(owner = "client!cu", name = "K", descriptor = "Lpi;")
    public static class340 field4528;

    // $FF: synthetic field
    @OriginalMember(owner = "client!cu", name = "O", descriptor = "Ljava/lang/Class;")
    public static Class field4532;

    // $FF: synthetic method
    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2075(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(ILqa;B)Lc;", line = 11)
    public final class507 method2071(int arg0, class129 arg1, byte arg2) {
        int var4 = -104 % ((-arg2 - 74) / 45);
        field4521++;
        int var5 = class20.field335[this.field4518];
        if (var5 == 0) {
            class270 var6 = class67.method384(this.field4522, this.field4513, this.field4515);
            if (var6 instanceof class516) {
                class516 var7 = (class516) var6;
                if (var7.field7584 != null) {
                    return ((class323) var7.field7584).method419(arg0, -32039, arg1);
                }
            }
        } else if (var5 == 1) {
            class303 var12 = class301.method1806(this.field4522, this.field4513, this.field4515);
            if (var12 instanceof class461) {
                class461 var13 = (class461) var12;
                if (var13.field6443 != null) {
                    return ((class323) var13.field6443).method419(arg0, -32039, arg1);
                }
            }
        } else if (var5 == 2) {
            class448 var10 = class346.method2038(this.field4522, this.field4513, this.field4515, field4532 == null ? (field4532 = method2075("wk")) : field4532);
            if (var10 instanceof class188) {
                class188 var11 = (class188) var10;
                if (var11.field2460 != null) {
                    return ((class323) var11.field2460).method419(arg0, -32039, arg1);
                }
            }
        } else if (var5 == 3) {
            class338 var8 = class205.method1342(this.field4522, this.field4513, this.field4515);
            if (var8 instanceof class368) {
                class368 var9 = (class368) var8;
                if (var9.field4729 != null) {
                    return ((class323) var9.field4729).method419(arg0, -32039, arg1);
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(ILeo;I)I", line = 99)
    public static final int method2072(int arg0, class423 arg1, int arg2) {
        if (arg2 != -1) {
            field4517 = null;
        }
        field4527++;
        if (!client.method3037(arg1).method1626(true, arg0) && arg1.field5779 == null) {
            return -1;
        } else if (arg1.field5784 == null || arg0 >= arg1.field5784.length) {
            return -1;
        } else {
            return arg1.field5784[arg0];
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(Z)V", line = 116)
    public static void method2073(boolean arg0) {
        field4529 = null;
        if (arg0) {
            return;
        }
        field4517 = null;
        field4528 = null;
        field4526 = null;
        field4530 = null;
        field4525 = null;
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(IIIZIII)V", line = 133)
    public static final void method2074(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        class5.field45 = arg6;
        class524.field7766 = arg4;
        class125.field1719 = arg5;
        class517.field7619 = arg1;
        class382.field5039 = arg0;
        field4514++;
        if (arg3 && class125.field1719 >= 100) {
            class299.field3885 = class524.field7766 * 128 + 64;
            class291.field3724 = class517.field7619 * 128 + 64;
            class53.field730 = class366.method2145(class366.field4715, (byte) 6, class299.field3885, class291.field3724) - class5.field45;
        }
        if (arg2 < -84) {
            class396.field5271 = 2;
        }
    }
}
