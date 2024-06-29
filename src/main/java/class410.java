import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public class class410 extends class86 {

    @OriginalMember(owner = "client!qs", name = "w", descriptor = "Z")
    public boolean field6015 = false;

    @OriginalMember(owner = "client!qs", name = "y", descriptor = "I")
    public int field6017 = -1;

    @OriginalMember(owner = "client!qs", name = "o", descriptor = "Ldc;")
    public static class5 field6007 = new class5(8);

    @OriginalMember(owner = "client!qs", name = "z", descriptor = "[I")
    public static int[] field6018 = new int[3];

    @OriginalMember(owner = "client!qs", name = "A", descriptor = "[F")
    public static float[] field6019;

    @OriginalMember(owner = "client!qs", name = "p", descriptor = "I")
    public int field6008;

    @OriginalMember(owner = "client!qs", name = "q", descriptor = "I")
    public int field6009;

    @OriginalMember(owner = "client!qs", name = "s", descriptor = "I")
    public int field6011;

    @OriginalMember(owner = "client!qs", name = "t", descriptor = "I")
    public int field6012;

    @OriginalMember(owner = "client!qs", name = "u", descriptor = "I")
    public static int field6013;

    @OriginalMember(owner = "client!qs", name = "v", descriptor = "I")
    public int field6014;

    @OriginalMember(owner = "client!qs", name = "x", descriptor = "I")
    public static int field6016;

    @OriginalMember(owner = "client!qs", name = "r", descriptor = "Lqg;")
    public static class307 field6010;

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(Z)V")
    public static void method2448(boolean arg0) {
        field6018 = null;
        field6010 = null;
        field6007 = null;
        field6019 = null;
        if (!arg0) {
            field6019 = null;
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(ILqn;ILjava/lang/String;)Lit;")
    public static final class439 method2449(int arg0, class44 arg1, int arg2, String arg3) {
        field6013++;
        int var4 = -119 / ((arg0 + 48) / 48);
        if (arg2 == 0) {
            return arg1.method326(arg3, false);
        } else if (arg2 == 1) {
            try {
                class123.method698(arg1.field668, (byte) 50, "openjs", new Object[] { (new URL(arg1.field668.getCodeBase(), arg3)).toString() });
                class439 var5 = new class439();
                var5.field6417 = 1;
                return var5;
            } catch (Throwable var11) {
                class439 var6 = new class439();
                var6.field6417 = 2;
                return var6;
            }
        } else if (arg2 == 2) {
            try {
                arg1.field668.getAppletContext().showDocument(new URL(arg1.field668.getCodeBase(), arg3), "_blank");
                class439 var7 = new class439();
                var7.field6417 = 1;
                return var7;
            } catch (Exception var12) {
                class439 var8 = new class439();
                var8.field6417 = 2;
                return var8;
            }
        } else if (arg2 == 3) {
            try {
                class123.method697((byte) 95, "loggedout", arg1.field668);
            } catch (Throwable var14) {
            }
            try {
                arg1.field668.getAppletContext().showDocument(new URL(arg1.field668.getCodeBase(), arg3), "_top");
                class439 var9 = new class439();
                var9.field6417 = 1;
                return var9;
            } catch (Exception var13) {
                class439 var10 = new class439();
                var10.field6417 = 2;
                return var10;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(I)V")
    public class410(int arg0) {
        this.field6017 = arg0;
    }

    static {
        new class194(null, "Spieler nicht auf deiner Freunde-Liste.", null, null);
        field6019 = new float[4];
    }
}
