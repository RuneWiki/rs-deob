import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public class class39 {

    @OriginalMember(owner = "client!gv", name = "f", descriptor = "B")
    public byte field587;

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "B")
    public byte field583;

    @OriginalMember(owner = "client!gv", name = "e", descriptor = "S")
    public short field586;

    @OriginalMember(owner = "client!gv", name = "g", descriptor = "Lfba;")
    public class558 field588;

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "I")
    public static int field582;

    @OriginalMember(owner = "client!gv", name = "h", descriptor = "I")
    public static int field589;

    @OriginalMember(owner = "client!gv", name = "i", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!gv", name = "c", descriptor = "Lne;")
    public static class176 field584;

    @OriginalMember(owner = "client!gv", name = "d", descriptor = "[[[Lms;")
    public static class44[][][] field585;

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(Z)V", line = 4)
    public static void method222(boolean arg0) {
        field585 = null;
        field584 = null;
        if (arg0) {
            field584 = null;
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(I)V", line = 23)
    public static final void method223(int arg0) {
        if (class262.field3405 != null) {
            for (int var1 = 0; var1 < class218.field2907; var1++) {
                class262.field3405[var1] = null;
            }
            class262.field3405 = null;
        }
        field582++;
        if (class405.field6060 != null) {
            for (int var2 = 0; var2 < class264.field3450; var2++) {
                class405.field6060[var2] = null;
            }
            class405.field6060 = null;
        }
        if (class191.field2591 != null) {
            for (int var3 = 0; var3 < class261.field3398; var3++) {
                class191.field2591[var3] = null;
            }
            class191.field2591 = null;
        }
        class154.field2177 = null;
        if (arg0 < 104) {
            method225(-66);
        }
        class351.field5202 = null;
        class619.field8969 = null;
        class645.field9297 = -1;
        class76.field1228 = -1;
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(Lmv;ZLew;)V", line = 81)
    public static final void method224(class295 arg0, boolean arg1, class226 arg2) {
        field589++;
        class257.field3343 = arg0;
        class682.field9622 = "";
        class470.field6765 = arg2;
        if (class181.field2496.startsWith("win")) {
            class682.field9622 = class682.field9622 + "windows/";
        } else if (class181.field2496.startsWith("linux")) {
            class682.field9622 = class682.field9622 + "linux/";
        } else if (class181.field2496.startsWith("mac")) {
            class682.field9622 = class682.field9622 + "macos/";
        }
        if (class470.field6765.field2983) {
            class682.field9622 = class682.field9622 + "msjava/";
        } else if (class181.field2499.startsWith("amd64") || class181.field2499.startsWith("x86_64")) {
            class682.field9622 = class682.field9622 + "x86_64/";
        } else if (class181.field2499.startsWith("i386") || class181.field2499.startsWith("i486") || class181.field2499.startsWith("i586") || class181.field2499.startsWith("x86")) {
            class682.field9622 = class682.field9622 + "x86/";
        } else if (class181.field2499.startsWith("ppc")) {
            class682.field9622 = class682.field9622 + "ppc/";
        } else {
            class682.field9622 = class682.field9622 + "universal/";
        }
        if (!arg1) {
            method225(109);
        }
    }

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "(I)V", line = 129)
    public static final void method225(int arg0) {
        class250.field3284 = new class302();
        field590++;
        if (arg0 != 0) {
            field584 = null;
        }
    }

    @OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(Lfba;III)V", line = 141)
    public class39(class558 arg0, int arg1, int arg2, int arg3) {
        this.field587 = (byte) arg3;
        this.field583 = (byte) arg2;
        this.field586 = (short) arg1;
        this.field588 = arg0;
    }
}
