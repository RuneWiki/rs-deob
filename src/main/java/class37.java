import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public abstract class class37 {

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "[I")
    public static int[] field460 = new int[14];

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
    public static int field459;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
    public static int field461;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)V", line = 12)
    public static void method262(byte arg0) {
        field460 = null;
        if (arg0 != 82) {
            field460 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V", line = 25)
    public static final void method263(int arg0) {
        class58.field802.method1298((byte) 110);
        if (arg0 == -256) {
            field459++;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "([Ln;ZLwf;)V", line = 37)
    public static final void method265(class178[] arg0, boolean arg1, class306 arg2) {
        class96.field1469 = arg2;
        field458++;
        class271.field4165 = arg0;
        class311.field4934 = new boolean[class271.field4165.length];
        if (arg1) {
            field460 = (int[]) null;
        }
        class207.field3164.method1553(-27930);
        int var3 = class96.field1469.method2107("details", (byte) 120);
        int[] var4 = class96.field1469.method2080(2820, var3);
        for (int var5 = 0; var5 < var4.length; var5++) {
            class207.field3164.method1550(class303.method2011(var4[var5], new class303(class96.field1469.method2103(0, var3, var4[var5])), true), (long) var4[var5], (byte) 115);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ICI)C", line = 64)
    public static final char method266(int arg0, char arg1, int arg2) {
        field461++;
        if (arg2 != 110) {
            method265((class178[]) null, false, (class306) null);
        }
        if (arg1 >= 'À' && arg1 <= 'ÿ') {
            if (arg1 >= 'À' && arg1 <= 'Æ') {
                return 'A';
            }
            if (arg1 == 'Ç') {
                return 'C';
            }
            if (arg1 >= 'È' && arg1 <= 'Ë') {
                return 'E';
            }
            if (arg1 >= 'Ì' && arg1 <= 'Ï') {
                return 'I';
            }
            if (arg1 == 'Ñ' && arg0 != 0) {
                return 'N';
            }
            if (arg1 >= 'Ò' && arg1 <= 'Ö') {
                return 'O';
            }
            if (arg1 >= 'Ù' && arg1 <= 'Ü') {
                return 'U';
            }
            if (arg1 == 'Ý') {
                return 'Y';
            }
            if (arg1 == 'ß') {
                return 's';
            }
            if (arg1 >= 'à' && arg1 <= 'æ') {
                return 'a';
            }
            if (arg1 == 'ç') {
                return 'c';
            }
            if (arg1 >= 'è' && arg1 <= 'ë') {
                return 'e';
            }
            if (arg1 >= 'ì' && arg1 <= 'ï') {
                return 'i';
            }
            if (arg1 == 'ñ' && arg0 != 0) {
                return 'n';
            }
            if (arg1 >= 'ò' && arg1 <= 'ö') {
                return 'o';
            }
            if (arg1 >= 'ù' && arg1 <= 'ü') {
                return 'u';
            }
            if (arg1 == 'ý' || arg1 == 'ÿ') {
                return 'y';
            }
        }
        if (arg1 == 'Œ') {
            return 'O';
        } else if (arg1 == 'œ') {
            return 'o';
        } else if (arg1 == 'Ÿ') {
            return 'Y';
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(BLco;)Lco;")
    public abstract class261 method264(byte arg0, class261 arg1);
}
