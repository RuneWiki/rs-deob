import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class46 {

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "I")
    public int field724 = 8;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "I")
    public int field725 = 16777215;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
    public static int field722 = 0;

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "Ljava/lang/String;")
    public static String field730 = "white:";

    @OriginalMember(owner = "client!dd", name = "p", descriptor = "Ljava/lang/String;")
    public static String field737 = "Please wait...";

    @OriginalMember(owner = "client!dd", name = "r", descriptor = "I")
    public static int field739 = 0;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "I")
    public static int field723;

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "I")
    public int field726;

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "I")
    public static int field728;

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "I")
    public int field731;

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "I")
    public int field732;

    @OriginalMember(owner = "client!dd", name = "l", descriptor = "I")
    public static int field733;

    @OriginalMember(owner = "client!dd", name = "m", descriptor = "I")
    public int field734;

    @OriginalMember(owner = "client!dd", name = "n", descriptor = "I")
    public static int field735;

    @OriginalMember(owner = "client!dd", name = "o", descriptor = "I")
    public int field736;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "Z")
    public boolean field727;

    @OriginalMember(owner = "client!dd", name = "q", descriptor = "[[B")
    public static byte[][] field738;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BILnc;)V", line = 12)
    public static final void method457(byte arg0, int arg1, class171 arg2) {
        if (arg0 >= -16) {
            method462(-16, (byte) 71);
        }
        field723++;
        class160 var3 = (class160) class328.field5044.method370((byte) -120, (long) arg1);
        if (var3 == null) {
            return;
        }
        if (var3.field2563 != null) {
            class19.field316.method109(var3.field2563);
            var3.field2563 = null;
        }
        var3.method1357(947647010);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V", line = 37)
    public static void method458(int arg0) {
        field738 = (byte[][]) null;
        field737 = null;
        field730 = null;
        if (arg0 != 8) {
            method458(-52);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IZILug;)V", line = 56)
    private final void method459(int arg0, boolean arg1, int arg2, class25 arg3) {
        field729++;
        if (!arg1) {
            method458(28);
        }
        if (arg0 == 1) {
            this.field724 = arg3.method314((byte) 117);
        } else if (arg0 == 2) {
            this.field727 = true;
        } else if (arg0 == 3) {
            this.field726 = arg3.method296(-103);
            this.field736 = arg3.method296(-92);
            this.field732 = arg3.method296(-100);
        } else if (arg0 == 4) {
            this.field731 = arg3.method281(-124);
        } else if (arg0 == 5) {
            this.field734 = arg3.method314((byte) 64);
        } else if (arg0 == 6) {
            this.field725 = arg3.method265(true);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BILug;)V", line = 115)
    public final void method460(byte arg0, int arg1, class25 arg2) {
        while (true) {
            int var4 = arg2.method281(-128);
            if (var4 == 0) {
                field733++;
                if (arg0 <= 36) {
                    field722 = -103;
                }
                return;
            }
            this.method459(var4, true, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)V", line = 135)
    public static final void method461(int arg0) {
        class252.field3888 = 0;
        if (arg0 != -22943) {
            method457((byte) 70, -56, (class171) null);
        }
        field735++;
        class266.field4126 = 0;
        class278.field4291 = 0;
        class29.field472 = false;
        class151.field2462 = 0;
        class331.field5086 = -1;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IB)V", line = 165)
    public static final void method462(int arg0, byte arg1) {
        class78.field1130.method649((byte) 75, arg0);
        class87.field1247.method649((byte) 75, arg0);
        field728++;
        if (arg1 != 110) {
            method458(100);
        }
    }
}
