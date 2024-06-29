import java.net.URL;
import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class51 {

    @OriginalMember(owner = "client!di", name = "g", descriptor = "S")
    public static short field688 = 1;

    @OriginalMember(owner = "client!di", name = "i", descriptor = "Ljava/lang/String;")
    public static String field690 = "Loaded textures";

    @OriginalMember(owner = "client!di", name = "a", descriptor = "Z")
    public static boolean field682 = false;

    @OriginalMember(owner = "client!di", name = "h", descriptor = "I")
    public static int field689 = -1;

    @OriginalMember(owner = "client!di", name = "l", descriptor = "Ljava/lang/String;")
    public static String field693 = "Take";

    @OriginalMember(owner = "client!di", name = "m", descriptor = "I")
    public static int field694 = 0;

    @OriginalMember(owner = "client!di", name = "d", descriptor = "I")
    public static int field685;

    @OriginalMember(owner = "client!di", name = "e", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!di", name = "j", descriptor = "I")
    public static int field691;

    @OriginalMember(owner = "client!di", name = "k", descriptor = "Lvl;")
    public static class6 field692;

    @OriginalMember(owner = "client!di", name = "c", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field684;

    @OriginalMember(owner = "client!di", name = "b", descriptor = "[I")
    public static int[] field683;

    @OriginalMember(owner = "client!di", name = "f", descriptor = "[Lfl;")
    public static class339[] field687;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ILjava/lang/String;)V", line = 5)
    public static final void method379(int arg0, String arg1) {
        int var2 = class111.method850(arg1, (byte) -35);
        field686++;
        if (arg0 < -55 && var2 != -1) {
            int[] var3 = class163.field2649.method1842((class228.field3489.field289[var2] & 0xFFFE571) >> 14, (class228.field3489.field289[var2] & 0x3CE4FA68) >> 28, class228.field3489.field289[var2] & 0x3FFF, (byte) 103);
            class103.method787(-10858, var3[1], var3[2]);
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V", line = 24)
    public static void method380(int arg0) {
        if (arg0 != 7000) {
            return;
        }
        field690 = null;
        field692 = null;
        field687 = null;
        field683 = null;
        field693 = null;
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "()V", line = 47)
    public class51() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(II)Z", line = 67)
    public static final boolean method381(int arg0, int arg1) {
        class163 var2 = class25.method194((byte) 47, arg0);
        field691++;
        if (var2 == null) {
            return false;
        } else if (class6.field87 == 1 || class6.field87 == 2 || class312.field4837 == 2) {
            class224.field3427 = var2.field2638;
            class224.field3424 = var2.field2647;
            if (class312.field4837 != 0) {
                class340.field5286 = class224.field3424 + 40000;
                class62.field829 = class340.field5286;
                class216.field3318 = class224.field3424 + 50000;
            }
            return true;
        } else {
            String var3 = "";
            String var4 = "";
            if (class160.field2420 != null) {
                var4 = "/p=" + class160.field2420;
            }
            if (class312.field4837 != 0) {
                var3 = ":" + (var2.field2647 + 7000);
            }
            String var5 = "http://" + var2.field2638 + var3 + "/l=" + class81.field1197 + "/a=" + class76.field1109 + var4 + "/j" + (class99.field1427 ? "1" : "0") + ",o" + (class209.field3202 ? "1" : "0") + ",a2,m" + (class174.field2794 ? "1" : "0");
            try {
                class304.field4654.getAppletContext().showDocument(new URL(var5), "_self");
            } catch (Exception var7) {
                return false;
            }
            if (arg1 != 1) {
                field682 = false;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "(III)V", line = 122)
    private class51(int arg0, int arg1, int arg2) {
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "([BBLwm;)V", line = 137)
    public final void method382(byte[] arg0, byte arg1, class254 arg2) {
        field685++;
        if (arg2.field3840[arg2.field3866] != 31 || arg2.field3840[arg2.field3866 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field684 == null) {
            this.field684 = new Inflater(true);
        }
        try {
            this.field684.setInput(arg2.field3840, arg2.field3866 + 10, arg2.field3840.length - 10 - (arg2.field3866 + 8));
            if (arg1 >= -25) {
                field693 = (String) null;
            }
            this.field684.inflate(arg0);
        } catch (Exception var5) {
            this.field684.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field684.reset();
    }
}
