import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class12 extends class146 {

    @OriginalMember(owner = "client!bd", name = "C", descriptor = "I")
    public static int field206 = -1;

    @OriginalMember(owner = "client!bd", name = "x", descriptor = "I")
    public static int field201 = 0;

    @OriginalMember(owner = "client!bd", name = "r", descriptor = "I")
    public static int field195;

    @OriginalMember(owner = "client!bd", name = "s", descriptor = "I")
    public static int field196;

    @OriginalMember(owner = "client!bd", name = "t", descriptor = "I")
    public static int field197;

    @OriginalMember(owner = "client!bd", name = "v", descriptor = "I")
    public int field199;

    @OriginalMember(owner = "client!bd", name = "w", descriptor = "I")
    public static int field200;

    @OriginalMember(owner = "client!bd", name = "A", descriptor = "I")
    public int field204;

    @OriginalMember(owner = "client!bd", name = "B", descriptor = "I")
    public int field205;

    @OriginalMember(owner = "client!bd", name = "D", descriptor = "I")
    public int field207;

    @OriginalMember(owner = "client!bd", name = "G", descriptor = "I")
    public int field210;

    @OriginalMember(owner = "client!bd", name = "u", descriptor = "Lea;")
    public static class30 field198;

    @OriginalMember(owner = "client!bd", name = "z", descriptor = "Lec;")
    public class32 field203;

    @OriginalMember(owner = "client!bd", name = "y", descriptor = "Lf;")
    public class36 field202;

    @OriginalMember(owner = "client!bd", name = "F", descriptor = "Lf;")
    public class36 field209;

    @OriginalMember(owner = "client!bd", name = "E", descriptor = "[Ljava/lang/Object;")
    public Object[] field208;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "(I)V")
    public static final void method65(int arg0) {
        for (int var1 = 0; var1 < class102.field2399; var1++) {
            int var2 = class15.field313[var1];
            class111 var3 = class14.field230[var2];
            if (var3 != null) {
                class31.method227((byte) -105, var3.field2597.field2198, var3);
            }
        }
        field200++;
        if (arg0 >= -84) {
            field201 = 68;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)V")
    public static final void method66(byte arg0) {
        field195++;
        if (class25.field464.toLowerCase().indexOf("microsoft") == -1) {
            class92.field2122[92] = 74;
            class92.field2122[61] = 27;
            class92.field2122[46] = 72;
            if (class25.field452 == null) {
                class92.field2122[192] = 58;
                class92.field2122[222] = 59;
            } else {
                class92.field2122[222] = 58;
                class92.field2122[520] = 59;
                class92.field2122[192] = 28;
            }
            class92.field2122[44] = 71;
            class92.field2122[93] = 43;
            class92.field2122[47] = 73;
            class92.field2122[59] = 57;
            class92.field2122[45] = 26;
            class92.field2122[91] = 42;
        } else {
            class92.field2122[191] = 73;
            class92.field2122[220] = 74;
            class92.field2122[190] = 72;
            class92.field2122[222] = 59;
            class92.field2122[221] = 43;
            class92.field2122[219] = 42;
            class92.field2122[223] = 28;
            class92.field2122[187] = 27;
            class92.field2122[189] = 26;
            class92.field2122[192] = 58;
            class92.field2122[188] = 71;
            class92.field2122[186] = 57;
        }
        if (arg0 != -75) {
            method65(113);
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Z)V")
    public static void method67(boolean arg0) {
        field198 = null;
        if (!arg0) {
            field206 = -11;
        }
    }
}
