import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class291 extends class176 {

    @OriginalMember(owner = "client!md", name = "o", descriptor = "I")
    public int field3637;

    @OriginalMember(owner = "client!md", name = "u", descriptor = "I")
    public int field3643;

    @OriginalMember(owner = "client!md", name = "p", descriptor = "I")
    public static int field3638 = 0;

    @OriginalMember(owner = "client!md", name = "n", descriptor = "I")
    public static int field3636;

    @OriginalMember(owner = "client!md", name = "q", descriptor = "I")
    public static int field3639;

    @OriginalMember(owner = "client!md", name = "r", descriptor = "I")
    public static int field3640;

    @OriginalMember(owner = "client!md", name = "s", descriptor = "Ltf;")
    public static class701 field3641;

    @OriginalMember(owner = "client!md", name = "t", descriptor = "Lrda;")
    public static class96 field3642;

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Ldba;Lpa;IIIIIIIIII)V")
    public class291(class240 arg0, class648 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field3637 = arg10;
        this.field3643 = arg11;
    }

    @OriginalMember(owner = "client!md", name = "c", descriptor = "(B)V")
    public static void method1698(byte arg0) {
        field3641 = null;
        int var1 = -9 / ((16 - arg0) / 57);
        field3642 = null;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(B)Lib;")
    public final class14 method203(byte arg0) {
        if (arg0 != -92) {
            method1699(-105, null, -97);
        }
        field3636++;
        return class295.field3685;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ILjava/lang/String;I)Z")
    public static final boolean method1699(int arg0, String arg1, int arg2) {
        field3639++;
        if (class353.field4757.field6614) {
            class117.field1294 = new class178();
            class117.field1294.field1987 = arg1;
            class117.field1294.field2001 = arg0;
            if (class364.field4875 != class337.field4237) {
                class117.field1294.field1996 = class117.field1294.field2001 + 50000;
                class117.field1294.field1999 = class117.field1294.field2001 + 40000;
            }
            if (arg0 < class114.field1202.length && class114.field1202[arg0] != null) {
                class16.field135 = class114.field1202[arg0].field9794;
            }
            return true;
        }
        String var3 = "";
        if (class364.field4875 != class337.field4237) {
            var3 = ":" + (arg0 + 7000);
        }
        String var4 = "";
        if (class208.field2464 != null) {
            var4 = "/p=" + class208.field2464;
        }
        String var5 = "http://" + arg1 + var3 + "/l=" + class504.field7267 + "/a=" + class112.field1186 + var4 + "/j" + (class381.field5161 ? "1" : "0") + ",o" + (class546.field7791 ? "1" : "0") + ",a2";
        try {
            if (arg2 == 32506) {
                class338.field4252.getAppletContext().showDocument(new URL(var5), "_self");
                return true;
            } else {
                return false;
            }
        } catch (Exception var6) {
            return false;
        }
    }
}
