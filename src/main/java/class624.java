import java.awt.Canvas;
import java.awt.Dimension;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public abstract class class624 {

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "I")
    public static int field8417 = 0;

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "Lqj;")
    public static class535 field8416 = new class535(64);

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
    public static int field8413;

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "I")
    public static int field8414;

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "I")
    public static int field8415;

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "I")
    public static int field8418;

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "I")
    public static int field8419;

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "I")
    public static int field8420;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Ljava/awt/Canvas;B)V", line = 7)
    public static final void method3441(Canvas arg0, byte arg1) {
        if (arg1 != -58) {
            field8419 = 73;
        }
        field8413++;
        Dimension var2 = arg0.getSize();
        class306.method1982(-2, var2.height, var2.width);
        if (class206.field2664 == 1) {
            class685.field9171.method492(arg0, class169.field2222, class776.field10671);
        } else {
            class685.field9171.method492(arg0, class265.field3899, class220.field2858);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(B)V", line = 25)
    public static void method3442(byte arg0) {
        if (arg0 != 58) {
            field8419 = -76;
        }
        field8416 = null;
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(JB)I", line = 35)
    public final int method3443(long arg0, byte arg1) {
        field8414++;
        long var4 = this.method1519((byte) 110);
        if (var4 > 0L) {
            class171.method1152(var4, false);
        }
        if (arg1 <= 87) {
            field8420 = 24;
        }
        return this.method1515(arg0, (byte) -122);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lmfa;I)Ljava/lang/String;", line = 58)
    public static final String method3444(class641 arg0, int arg1) {
        field8415++;
        int var2 = 4 / ((4 - arg1) / 63);
        return arg0.field8635 + " <col=ffffff>>";
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Ljava/lang/String;II)Z", line = 72)
    public static final boolean method3445(String arg0, int arg1, int arg2) {
        field8418++;
        if (class786.field10800.field3248) {
            class102.field1464 = new class680();
            class102.field1464.field9101 = arg0;
            class102.field1464.field9099 = arg1;
            if (class554.field7645 != class222.field2884) {
                class102.field1464.field9102 = class102.field1464.field9099 + 40000;
                class102.field1464.field9095 = class102.field1464.field9099 + 50000;
            }
            for (int var3 = 0; var3 < class310.field4388.length; var3++) {
                if (class310.field4388[var3].field2086 == arg1) {
                    class302.field4241 = class310.field4388[var3].field3873;
                }
            }
            return true;
        }
        String var4 = "";
        if (class554.field7645 != class222.field2884) {
            var4 = ":" + (arg1 + 7000);
        }
        String var5 = "";
        if (class33.field317 != null) {
            var5 = "/p=" + class33.field317;
        }
        String var6 = "http://" + arg0 + var4 + "/l=" + class55.field647 + "/a=" + class416.field6007 + var5 + "/j" + (class273.field3971 ? "1" : "0") + ",o" + (class787.field10808 ? "1" : "0") + ",a2";
        try {
            class723.field9821.getAppletContext().showDocument(new URL(var6), "_self");
            if (arg2 >= -118) {
                method3445(null, 9, -77);
            }
            return true;
        } catch (Exception var7) {
            return false;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(JB)I")
    public abstract int method1515(long arg0, byte arg1);

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)V")
    public abstract void method1517(int arg0);

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(B)J")
    public abstract long method1519(byte arg0);

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(B)J")
    public abstract long method1516(byte arg0);
}
