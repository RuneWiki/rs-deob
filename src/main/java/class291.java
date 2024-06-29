import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class291 {

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "I")
    public int field4581 = 16;

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "I")
    public int field4585 = 128;

    @OriginalMember(owner = "client!uh", name = "k", descriptor = "I")
    public int field4588 = 0;

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "I")
    public int field4586 = -1;

    @OriginalMember(owner = "client!uh", name = "l", descriptor = "I")
    public int field4589 = 8;

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "Z")
    public boolean field4584 = true;

    @OriginalMember(owner = "client!uh", name = "n", descriptor = "I")
    public int field4591 = 1190717;

    @OriginalMember(owner = "client!uh", name = "o", descriptor = "Z")
    public boolean field4592 = false;

    @OriginalMember(owner = "client!uh", name = "m", descriptor = "Z")
    public boolean field4590 = true;

    @OriginalMember(owner = "client!uh", name = "r", descriptor = "I")
    public int field4595 = -1;

    @OriginalMember(owner = "client!uh", name = "p", descriptor = "Ljava/lang/String;")
    public static String field4593 = "Prepared sound engine";

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "I")
    public static int field4578;

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "I")
    public static int field4579;

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "I")
    public static int field4580;

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "I")
    public static int field4582;

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "I")
    public static int field4583;

    @OriginalMember(owner = "client!uh", name = "j", descriptor = "I")
    public static int field4587;

    @OriginalMember(owner = "client!uh", name = "q", descriptor = "I")
    public static int field4594;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lim;II)V", line = 10)
    public final void method2039(class192 arg0, int arg1, int arg2) {
        field4594++;
        if (arg2 != 30411) {
            field4593 = (String) null;
        }
        while (true) {
            int var4 = arg0.method1399(-1172389784);
            if (var4 == 0) {
                return;
            }
            this.method2042(arg2 - 30419, arg1, arg0, var4);
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 31)
    public static final void method2040(Component arg0, byte arg1) {
        field4579++;
        if (arg1 > -116) {
            field4580 = -5;
        }
        Method var2 = class6.field81;
        if (var2 != null) {
            try {
                var2.invoke(arg0, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        arg0.addKeyListener(class289.field4555);
        arg0.addFocusListener(class289.field4555);
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V", line = 59)
    public static void method2041(int arg0) {
        if (arg0 == 65535) {
            field4593 = null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IILim;I)V", line = 100)
    private final void method2042(int arg0, int arg1, class192 arg2, int arg3) {
        field4583++;
        if (arg0 != -8) {
            return;
        }
        if (arg3 == 1) {
            this.field4588 = class18.method119(arg2.method1378(false), true);
        } else if (arg3 == 2) {
            this.field4586 = arg2.method1399(-1172389784);
        } else if (arg3 == 3) {
            this.field4586 = arg2.method1396(-68);
            if (this.field4586 == 65535) {
                this.field4586 = -1;
            }
        } else if (arg3 == 5) {
            this.field4584 = false;
        } else if (arg3 == 7) {
            this.field4595 = class18.method119(arg2.method1378(false), true);
        } else if (arg3 == 8) {
            class5.field59 = arg1;
        } else if (arg3 == 9) {
            this.field4585 = arg2.method1396(-23);
        } else if (arg3 == 10) {
            this.field4590 = false;
        } else if (arg3 == 11) {
            this.field4589 = arg2.method1399(-1172389784);
        } else if (arg3 == 12) {
            this.field4592 = true;
        } else if (arg3 == 13) {
            this.field4591 = arg2.method1378(false);
        } else if (arg3 == 14) {
            this.field4581 = arg2.method1399(arg0 ^ 0x45E13F90);
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)Lch;", line = 171)
    public static final class149 method2043(int arg0, int arg1) {
        field4582++;
        class149 var2 = (class149) class127.field1899.method1619((long) arg0, 96);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class37.field496.method250(true, class56.method395((byte) -93, arg0), class103.method724(arg1 - 32762, arg0));
        class149 var4 = new class149();
        var4.field2299 = arg0;
        if (var3 != null) {
            var4.method1041(new class192(var3), (byte) -88);
        }
        var4.method1055(arg1 - 23006);
        if (var4.field2216) {
            var4.field2257 = 0;
            var4.field2281 = false;
        }
        if (!class158.field2434 && var4.field2300) {
            var4.field2263 = null;
        }
        if (arg1 == 23006) {
            class127.field1899.method1621((long) arg0, arg1 - 22956, var4);
            return var4;
        } else {
            return (class149) null;
        }
    }
}
