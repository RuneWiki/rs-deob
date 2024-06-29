import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class105 {

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "Ljava/lang/String;")
    public static String field1624 = "Loaded interfaces";

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "Ljava/lang/String;")
    public static String field1623 = "purple:";

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "I")
    public static int field1626;

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "I")
    public static int field1627;

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "I")
    public static int field1629;

    @OriginalMember(owner = "client!ck", name = "h", descriptor = "I")
    public static int field1630;

    @OriginalMember(owner = "client!ck", name = "i", descriptor = "I")
    public static int field1631;

    @OriginalMember(owner = "client!ck", name = "j", descriptor = "I")
    public static int field1632;

    @OriginalMember(owner = "client!ck", name = "k", descriptor = "I")
    public static int field1633;

    @OriginalMember(owner = "client!ck", name = "l", descriptor = "I")
    public static int field1634;

    @OriginalMember(owner = "client!ck", name = "m", descriptor = "I")
    public static int field1635;

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "Ll;")
    public static class133 field1625;

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "Ll;")
    public static class133 field1628;

    @OriginalMember(owner = "client!ck", name = "n", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field1636;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lnd;ZZ)V", line = 11)
    public static final void method761(class61 arg0, boolean arg1, boolean arg2) {
        if (arg2) {
            method766(-52, (byte) -32, -39, 102, -7, 27);
        }
        field1631++;
        int var3 = (int) arg0.field758;
        int var4 = arg0.field982;
        arg0.method403(1);
        if (arg1) {
            class323.method2195(true, var4);
        }
        class237.method1656(-4248, var4);
        class220 var5 = class68.method524((byte) -81, var3);
        if (var5 != null) {
            class26.method241(3095, var5);
        }
        int var6 = class301.field4706;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class279.method1912(class233.field3689[var7], -8)) {
                class17.method138(9572, var7);
            }
        }
        if (class301.field4706 == 1) {
            class339.field5305 = false;
            class55.method450(class308.field4792, class40.field604, true, class131.field2058, class112.field1737);
        } else {
            class55.method450(class308.field4792, class40.field604, true, class131.field2058, class112.field1737);
            int var8 = class344.field5343.method2228(class174.field2630);
            for (int var9 = 0; var9 < class301.field4706; var9++) {
                int var10 = class344.field5343.method2228(class288.method1979(var9, -30));
                if (var8 < var10) {
                    var8 = var10;
                }
            }
            class131.field2058 = var8 + 8;
            class112.field1737 = class301.field4706 * 15 + (class238.field3786 ? 26 : 22);
        }
        if (class331.field5160 != -1) {
            class256.method1758(true, class331.field5160, 1);
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(B)V", line = 77)
    public static final void method762(byte arg0) {
        class233.field3698 = null;
        class107.field1661 = null;
        field1635++;
        class88.field1420 = null;
        if (arg0 != 19) {
            field1629 = 30;
        }
        class185.field2771 = null;
        class101.field1582 = null;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZLkh;[B)V", line = 93)
    public final void method763(boolean arg0, class166 arg1, byte[] arg2) {
        field1633++;
        if (arg1.field2500[arg1.field2532] != 31 || arg1.field2500[arg1.field2532 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (arg0) {
            method765(-100, (class220) null);
        }
        if (this.field1636 == null) {
            this.field1636 = new Inflater(true);
        }
        try {
            this.field1636.setInput(arg1.field2500, arg1.field2532 + 10, arg1.field2500.length + -10 + -arg1.field2532 + -8);
            this.field1636.inflate(arg2);
        } catch (Exception var5) {
            this.field1636.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field1636.reset();
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "()V", line = 126)
    public class105() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(B)V", line = 130)
    public static void method764(byte arg0) {
        field1623 = null;
        field1628 = null;
        if (arg0 > -107) {
            method766(25, (byte) 108, 22, -11, -79, 32);
        }
        field1624 = null;
        field1625 = null;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILtb;)Z", line = 147)
    public static final boolean method765(int arg0, class220 arg1) {
        if (arg0 != 250) {
            return false;
        }
        field1632++;
        if (arg1.field3427 == 205) {
            class285.field4466 = 250;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IBIIII)V", line = 174)
    public static final void method766(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        class300.field4683 = arg2;
        class77.field1239 = arg4;
        class40.field607 = arg0;
        field1626++;
        if (arg1 > 125) {
            class22.field344 = arg3;
            class285.field4469 = arg5;
        }
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(III)V", line = 203)
    private class105(int arg0, int arg1, int arg2) {
    }
}
