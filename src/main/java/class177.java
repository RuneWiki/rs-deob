import jaggl.OpenGL;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class177 extends class92 {

    @OriginalMember(owner = "client!fl", name = "A", descriptor = "Llh;")
    private class125 field2591;

    @OriginalMember(owner = "client!fl", name = "x", descriptor = "Lom;")
    private class331 field2588;

    @OriginalMember(owner = "client!fl", name = "s", descriptor = "Lqg;")
    private class201 field2583;

    @OriginalMember(owner = "client!fl", name = "w", descriptor = "[I")
    public static int[] field2587;

    @OriginalMember(owner = "client!fl", name = "q", descriptor = "I")
    public static int field2581;

    @OriginalMember(owner = "client!fl", name = "r", descriptor = "I")
    public static int field2582;

    @OriginalMember(owner = "client!fl", name = "t", descriptor = "I")
    public static int field2584;

    @OriginalMember(owner = "client!fl", name = "u", descriptor = "I")
    public static int field2585;

    @OriginalMember(owner = "client!fl", name = "v", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!fl", name = "y", descriptor = "I")
    public static int field2589;

    @OriginalMember(owner = "client!fl", name = "z", descriptor = "I")
    public static int field2590;

    @OriginalMember(owner = "client!fl", name = "B", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!fl", name = "C", descriptor = "[[Loh;")
    public static class549[][] field2593;

    static {
        new class567("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que você tentou acessar não existe.");
        field2587 = new int[1];
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ZII)V", line = 3)
    public final void method675(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            this.method672(-79, 87, (class96) null);
        }
        if (this.field2588.field4752) {
            float var4 = (float) (super.field1635.field9162 % 4000) / 4000.0F;
            super.field1635.method3577(this.field2588.field4750, true);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var4, 0.0F, 0.0F, 1.0F);
        } else {
            int var5 = super.field1635.field9162 % 4000 * 16 / 4000;
            super.field1635.method3577(this.field2588.field4755[var5], true);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
        }
        ++field2585;
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(B)V", line = 30)
    public final void method669(byte arg0) {
        super.field1635.method3601(-46, class477.field6813, 0);
        ++field2584;
        OpenGL.glBindProgramARB(34336, 0);
        OpenGL.glDisable(34820);
        if (arg0 <= 55) {
            this.field2583 = null;
        }
        OpenGL.glDisable(34336);
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ILjava/lang/String;I)Z", line = 44)
    public static final boolean method1207(int arg0, String arg1, int arg2) {
        ++field2590;
        if (class40.field554 != 3) {
            class352.field5017 = new class232();
            class352.field5017.field3411 = arg1;
            class352.field5017.field3409 = arg2;
            if (class563.field8065 != class47.field657) {
                class352.field5017.field3413 = 50000 - -class352.field5017.field3409;
                class352.field5017.field3416 = class352.field5017.field3409 + 40000;
            }
            if (~class445.field6493.length < ~arg2 && class445.field6493[arg2] != null) {
                class600.field8520 = class445.field6493[arg2].field596;
            }
            return true;
        } else {
            String var3 = "";
            if (class563.field8065 != class47.field657) {
                var3 = ":" + (arg2 + 7000);
            }
            if (arg0 != 40000) {
                return false;
            } else {
                String var4 = "";
                if (class459.field6612 != null) {
                    var4 = "/p=" + class459.field6612;
                }
                String var5 = "http://" + arg1 + var3 + "/l=" + class538.field7500 + "/a=" + class56.field803 + var4 + "/j" + (class61.field852 ? "1" : "0") + ",o" + (class162.field2400 ? "1" : "0") + ",a2";
                try {
                    class454.field6574.getAppletContext().showDocument(new URL(var5), "_self");
                    return true;
                } catch (Exception var6) {
                    return false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IILqv;)V", line = 91)
    public final void method672(int arg0, int arg1, class96 arg2) {
        ++field2582;
        if (arg0 != 0) {
            this.method673(83);
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ZB)V", line = 101)
    public final void method671(boolean arg0, byte arg1) {
        if (arg1 != 107) {
            method1207(117, (String) null, -91);
        }
        OpenGL.glBindProgramARB(34336, this.field2583.field2839);
        ++field2581;
        OpenGL.glEnable(34336);
        super.field1635.method3601(-47, class554.field7834, 0);
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(Llh;Lgp;Lom;)V", line = 120)
    public class177(class125 arg0, class561 arg1, class331 arg2) {
        super(arg0);
        this.field2591 = arg0;
        this.field2588 = arg2;
        if (this.field2588.method2051(128) && this.field2591.field2060) {
            this.field2583 = class491.method2804(this.field2591, arg1.method3193(-14855, "gl", "transparent_water"), 34336, -6876);
        } else {
            this.field2583 = null;
        }
    }

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "(B)V", line = 136)
    public static void method1208(byte arg0) {
        int var1 = -70 / ((-16 - arg0) / 63);
        field2587 = null;
        field2593 = null;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)Z", line = 153)
    public final boolean method673(int arg0) {
        ++field2586;
        if (arg0 != -1) {
            return true;
        } else {
            return this.field2583 != null;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ILco;Ljava/lang/String;)I", line = 167)
    public static final int method1209(int arg0, class268 arg1, String arg2) {
        ++field2592;
        int var3 = arg1.field3913;
        byte[] var4 = class492.method2813((byte) -122, arg2);
        arg1.method1704(32768, var4.length);
        arg1.field3913 += class321.field4653.method2500(arg0, arg0 + 24, var4.length, arg1.field3913, var4, arg1.field3952);
        return -var3 + arg1.field3913;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ZI)V", line = 184)
    public final void method676(boolean arg0, int arg1) {
        ++field2589;
        if (arg1 > -65) {
            field2593 = null;
        }
        super.field1635.method3583(false, class634.field9219, class211.field3065);
    }
}
