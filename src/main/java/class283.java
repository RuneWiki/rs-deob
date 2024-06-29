import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public abstract class class283 {

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "Z")
    public static boolean field4852 = false;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "Ljf;")
    public static class229 field4851 = class212.method1457((byte) 117, "Lade)3)3)3");

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "[I")
    public static int[] field4858 = new int[32768];

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "I")
    public static int field4850 = 0;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "I")
    public static int field4853;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
    public int field4854;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "I")
    public int field4855;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "I")
    public static int field4856;

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "I")
    public static int field4857;

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "I")
    public static int field4859;

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "I")
    public static int field4860;

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "I")
    public static int field4861;

    @OriginalMember(owner = "client!ee", name = "m", descriptor = "I")
    public static int field4862;

    @OriginalMember(owner = "client!ee", name = "n", descriptor = "I")
    public int field4863;

    @OriginalMember(owner = "client!ee", name = "o", descriptor = "I")
    public static int field4864;

    @OriginalMember(owner = "client!ee", name = "p", descriptor = "I")
    public static int field4865;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIBIII)V", line = 7)
    public static final void method1988(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field4861++;
        int var6 = -103 / ((arg2 + 51) / 62);
        if (arg3 >= class149.field2578 && class327.field5490 >= arg5 && class56.field991 <= arg0 && class142.field2458 >= arg1) {
            class288.method2010(arg4, arg5, -2, arg1, arg0, arg3);
        } else {
            class199.method1390(arg3, 625350280, arg0, arg1, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Z)Z", line = 31)
    public final boolean method1989(boolean arg0) {
        if (arg0) {
            this.method1989(true);
        }
        field4853++;
        return (this.field4863 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)Z", line = 46)
    public final boolean method1990(byte arg0) {
        field4857++;
        if (arg0 > -108) {
            field4858 = (int[]) null;
        }
        return (this.field4863 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V", line = 59)
    public static void method1991(int arg0) {
        field4858 = null;
        if (arg0 != -10899) {
            field4850 = -41;
        }
        field4851 = null;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IBI)I", line = 76)
    public static final int method1992(int arg0, byte arg1, int arg2) {
        int var3 = 59 / ((arg1 + 4) / 33);
        field4856++;
        class187 var4 = (class187) class278.field4772.method1890((long) arg2, -88);
        if (var4 == null) {
            return -1;
        } else if (arg0 >= 0 && var4.field3279.length > arg0) {
            return var4.field3279[arg0];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)V", line = 93)
    public static final void method1993(int arg0) {
        field4860++;
        if (arg0 != 13823) {
            field4858 = (int[]) null;
        }
        if (class325.field5482 == 10 && class108.field1900) {
            class186.method1295(28, (byte) 84);
        }
        if (class325.field5482 == 30) {
            class186.method1295(25, (byte) 84);
        }
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(I)Z", line = 113)
    public final boolean method1994(int arg0) {
        field4865++;
        int var2 = 121 / ((-arg0 - 50) / 61);
        return (this.field4863 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(III)I", line = 124)
    public static final int method1995(int arg0, int arg1, int arg2) {
        field4859++;
        if (arg1 == -1) {
            return 12345678;
        }
        int var3 = (arg1 & 0x7F) * arg0 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        if (arg2 != 126) {
            field4850 = -51;
        }
        return (arg1 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "(I)Z", line = 153)
    public final boolean method1996(int arg0) {
        if (arg0 == 0) {
            field4864++;
            return (this.field4863 & 0x1) != 0;
        } else {
            return false;
        }
    }
}
