import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public abstract class class97 extends class126 {

    @OriginalMember(owner = "client!e", name = "o", descriptor = "I")
    public int field1366;

    @OriginalMember(owner = "client!e", name = "k", descriptor = "I")
    public int field1362;

    @OriginalMember(owner = "client!e", name = "n", descriptor = "I")
    public int field1365;

    @OriginalMember(owner = "client!e", name = "m", descriptor = "I")
    public int field1364;

    @OriginalMember(owner = "client!e", name = "h", descriptor = "I")
    public static int field1359 = 0;

    @OriginalMember(owner = "client!e", name = "i", descriptor = "I")
    public static int field1360;

    @OriginalMember(owner = "client!e", name = "j", descriptor = "I")
    public static int field1361;

    @OriginalMember(owner = "client!e", name = "l", descriptor = "I")
    public static int field1363;

    @OriginalMember(owner = "client!e", name = "p", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IB)V", line = 4)
    public static final void method660(int arg0, byte arg1) {
        if (class12.field184 == null) {
            class12.field184 = new byte[4][class192.field2574][class364.field5262];
        }
        field1367++;
        for (int var2 = arg0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < class192.field2574; var3++) {
                for (int var4 = 0; var4 < class364.field5262; var4++) {
                    class12.field184[var2][var3][var4] = arg1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lwd;Ljava/lang/String;II)Ltj;", line = 49)
    public static final class429 method661(class36 arg0, String arg1, int arg2, int arg3) {
        field1360++;
        if (arg3 == 0) {
            return arg0.method248(arg1, -106);
        }
        if (arg2 != -10628) {
            field1359 = 31;
        }
        if (arg3 == 1) {
            try {
                class421.method2691(arg0.field519, new Object[] { (new URL(arg0.field519.getCodeBase(), arg1)).toString() }, "openjs", -30810);
                class429 var4 = new class429();
                var4.field6308 = 1;
                return var4;
            } catch (Throwable var10) {
                class429 var5 = new class429();
                var5.field6308 = 2;
                return var5;
            }
        } else if (arg3 == 2) {
            try {
                arg0.field519.getAppletContext().showDocument(new URL(arg0.field519.getCodeBase(), arg1), "_blank");
                class429 var6 = new class429();
                var6.field6308 = 1;
                return var6;
            } catch (Exception var11) {
                class429 var7 = new class429();
                var7.field6308 = 2;
                return var7;
            }
        } else if (arg3 == 3) {
            try {
                class421.method2690(arg0.field519, "loggedout", arg2 - 16816);
            } catch (Throwable var13) {
            }
            try {
                arg0.field519.getAppletContext().showDocument(new URL(arg0.field519.getCodeBase(), arg1), "_top");
                class429 var8 = new class429();
                var8.field6308 = 1;
                return var8;
            } catch (Exception var12) {
                class429 var9 = new class429();
                var9.field6308 = 2;
                return var9;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "(IIII)V", line = 126)
    public class97(int arg0, int arg1, int arg2, int arg3) {
        this.field1366 = arg0;
        this.field1362 = arg2;
        this.field1365 = arg3;
        this.field1364 = arg1;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lps;III)V", line = 137)
    public static final void method662(class394 arg0, int arg1, int arg2, int arg3) {
        class69.field904 = arg1;
        field1363++;
        if (arg3 != 0) {
            method662((class394) null, -10, -15, -67);
        }
        class124.field1733 = arg2;
        class118.field1653 = arg0;
    }
}
