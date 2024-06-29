import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class class660 extends class488 {

    @OriginalMember(owner = "client!qp", name = "l", descriptor = "Lch;")
    public class465 field9238;

    @OriginalMember(owner = "client!qp", name = "f", descriptor = "[S")
    private static short[] field9232 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!qp", name = "i", descriptor = "[S")
    private static short[] field9235 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!qp", name = "g", descriptor = "[S")
    private static short[] field9233 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!qp", name = "m", descriptor = "[[S")
    public static short[][] field9239 = new short[][] { field9233, field9232, field9235 };

    @OriginalMember(owner = "client!qp", name = "h", descriptor = "I")
    public static int field9234;

    @OriginalMember(owner = "client!qp", name = "j", descriptor = "I")
    public static int field9236;

    @OriginalMember(owner = "client!qp", name = "k", descriptor = "I")
    public static int field9237;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(III)Z", line = 9)
    public static final boolean method3805(int arg0, int arg1, int arg2) {
        field9237++;
        if (arg1 >= -40) {
            method3805(-46, 59, -25);
        }
        return class263.method1696(arg2, -25072, arg0) | (arg0 & 0x70000) != 0 || class530.method3102(arg2, arg0, -64);
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IILjava/lang/String;)Z", line = 21)
    public static final boolean method3806(int arg0, int arg1, String arg2) {
        field9236++;
        if (class179.field2759.field10019) {
            class528.field7513 = new class575();
            class528.field7513.field8138 = arg2;
            class528.field7513.field8131 = arg0;
            if (class607.field8585 != class206.field3043) {
                class528.field7513.field8136 = class528.field7513.field8131 + 40000;
                class528.field7513.field8139 = class528.field7513.field8131 + 50000;
            }
            for (int var3 = 0; var3 < class124.field1669.length; var3++) {
                if (class124.field1669[var3].field3212 == arg0) {
                    class612.field8655 = class124.field1669[var3].field10496;
                }
            }
            return true;
        }
        String var4 = "";
        if (class607.field8585 != class206.field3043) {
            var4 = ":" + (arg0 + 7000);
        }
        String var5 = "";
        if (arg1 != -26276) {
            method3806(-83, 46, null);
        }
        if (class736.field10317 != null) {
            var5 = "/p=" + class736.field10317;
        }
        String var6 = "http://" + arg2 + var4 + "/l=" + class650.field9160 + "/a=" + class299.field4243 + var5 + "/j" + (class590.field8364 ? "1" : "0") + ",o" + (class701.field9736 ? "1" : "0") + ",a2";
        try {
            class236.field3433.getAppletContext().showDocument(new URL(var6), "_self");
            return true;
        } catch (Exception var7) {
            return false;
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(Z)V", line = 75)
    public static void method3807(boolean arg0) {
        field9233 = null;
        if (arg0) {
            field9235 = null;
            field9239 = null;
            field9232 = null;
        }
    }

    @OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(Lwu;II[B)V", line = 102)
    public class660(class373 arg0, int arg1, int arg2, byte[] arg3) {
        this.field9238 = arg0.method2386(arg2, (byte) -100, false, arg3, class39.field413, arg1);
        this.field9238.method1272(false, (byte) -120, false);
    }

    @OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(Lwu;II[I)V", line = 114)
    public class660(class373 arg0, int arg1, int arg2, int[] arg3) {
        this.field9238 = arg0.method2358(40, false, arg2, arg3, arg1);
        this.field9238.method1272(false, (byte) -111, false);
    }
}
