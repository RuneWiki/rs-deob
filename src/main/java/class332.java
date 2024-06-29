import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class332 extends class279 {

    @OriginalMember(owner = "client!cm", name = "u", descriptor = "I")
    public int field5172 = 0;

    @OriginalMember(owner = "client!cm", name = "w", descriptor = "Lrm;")
    public static class184 field5174 = new class184(64);

    @OriginalMember(owner = "client!cm", name = "C", descriptor = "I")
    public static int field5180 = 0;

    @OriginalMember(owner = "client!cm", name = "v", descriptor = "I")
    public static int field5173;

    @OriginalMember(owner = "client!cm", name = "x", descriptor = "I")
    public static int field5175;

    @OriginalMember(owner = "client!cm", name = "y", descriptor = "I")
    public static int field5176;

    @OriginalMember(owner = "client!cm", name = "z", descriptor = "I")
    public static int field5177;

    @OriginalMember(owner = "client!cm", name = "A", descriptor = "I")
    public static int field5178;

    @OriginalMember(owner = "client!cm", name = "B", descriptor = "I")
    public static int field5179;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;", line = 9)
    public static final String method2310(String arg0, String arg1, int arg2, String arg3) {
        field5175++;
        for (int var4 = arg3.indexOf(arg0); var4 != -1; var4 = arg3.indexOf(arg0, var4 + arg1.length())) {
            arg3 = arg3.substring(0, var4) + arg1 + arg3.substring(arg0.length() + var4);
        }
        if (arg2 != -1) {
            field5174 = (class184) null;
        }
        return arg3;
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(B)Z", line = 33)
    public static final boolean method2311(byte arg0) {
        field5176++;
        if (class335.field5223) {
            try {
                class209.method1531("showVideoAd", 116, class42.field581.field2181);
                return true;
            } catch (Throwable var2) {
            }
        }
        if (arg0 != -31) {
            method2313(2);
        }
        return false;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lvl;Z)V", line = 56)
    public final void method2312(class6 arg0, boolean arg1) {
        field5173++;
        while (true) {
            int var3 = arg0.method58(-288140008);
            if (var3 == 0) {
                if (arg1) {
                    field5174 = (class184) null;
                }
                return;
            }
            this.method2314(arg0, var3, (byte) 55);
        }
    }

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "(I)V", line = 79)
    public static void method2313(int arg0) {
        if (arg0 != -5755) {
            method2310((String) null, (String) null, -41, (String) null);
        }
        field5174 = null;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lvl;IB)V", line = 91)
    private final void method2314(class6 arg0, int arg1, byte arg2) {
        field5178++;
        int var4 = 51 / ((-arg2 - 11) / 47);
        if (arg1 == 2) {
            this.field5172 = arg0.method39((byte) 82);
        }
    }

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "(I)V", line = 106)
    public static final void method2315(int arg0) {
        field5177++;
        if (arg0 != 0) {
            field5180 = -84;
        }
        if (class124.field1797 == 5) {
            class124.field1797 = 6;
        }
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(III)V", line = 128)
    public static final void method2316(int arg0, int arg1, int arg2) {
        class181.field2938 = true;
        class270.field4192 = arg0;
        class284.field4404 = arg1;
        class32.field481 = arg2;
        class120.field1664 = -1;
        class132.field1949 = -1;
    }
}
