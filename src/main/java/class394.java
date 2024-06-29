import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public class class394 extends class297 {

    @OriginalMember(owner = "client!ps", name = "E", descriptor = "B")
    public byte field5754 = 5;

    @OriginalMember(owner = "client!ps", name = "z", descriptor = "I")
    public static int field5749 = 0;

    @OriginalMember(owner = "client!ps", name = "F", descriptor = "I")
    public static int field5755 = 0;

    @OriginalMember(owner = "client!ps", name = "I", descriptor = "I")
    public static int field5758 = 0;

    @OriginalMember(owner = "client!ps", name = "y", descriptor = "I")
    public int field5748;

    @OriginalMember(owner = "client!ps", name = "A", descriptor = "I")
    public int field5750;

    @OriginalMember(owner = "client!ps", name = "B", descriptor = "I")
    public int field5751;

    @OriginalMember(owner = "client!ps", name = "C", descriptor = "I")
    public int field5752;

    @OriginalMember(owner = "client!ps", name = "G", descriptor = "I")
    public static int field5756;

    @OriginalMember(owner = "client!ps", name = "H", descriptor = "I")
    public int field5757;

    @OriginalMember(owner = "client!ps", name = "K", descriptor = "I")
    public int field5760;

    @OriginalMember(owner = "client!ps", name = "L", descriptor = "I")
    public static int field5761;

    @OriginalMember(owner = "client!ps", name = "D", descriptor = "Ldp;")
    public static class174 field5753;

    @OriginalMember(owner = "client!ps", name = "J", descriptor = "Ldp;")
    public static class174 field5759;

    @OriginalMember(owner = "client!ps", name = "d", descriptor = "(I)V")
    public static final void method2507(int arg0) {
        if (class73.field1235 != null) {
            class58.field937.method2494(0);
            class73.method580();
            class105.method934((byte) -50);
            class275.method1965((byte) -96);
            class9.method61(0);
            class436.method2733((byte) -115);
            if (class250.field3616 != null) {
                class250.field3616.method2818(119);
            }
            class339.method2197((byte) -36);
            class403.method2556(arg0 ^ 0x800);
            class319.method2134((byte) 119);
            class51.method404(false, 64);
            class303.method2078(1);
            for (int var1 = 0; var1 < 2048; var1++) {
                class127 var5 = class367.field5225[var1];
                if (var5 != null) {
                    var5.field5702 = null;
                    for (int var6 = 0; var6 < var5.field5704.length; var6++) {
                        var5.field5704[var6] = null;
                    }
                }
            }
            for (int var2 = 0; var2 < class447.field6512.length; var2++) {
                class98 var3 = class447.field6512[var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field5704.length; var4++) {
                        var3.field5704[var4] = null;
                    }
                }
            }
            class73.field1235.method685((byte) -31);
            class73.field1235 = null;
        }
        if (arg0 == 2048) {
            field5761++;
        }
    }

    @OriginalMember(owner = "client!ps", name = "e", descriptor = "(I)V")
    public static void method2508(int arg0) {
        field5753 = null;
        field5759 = null;
        if (arg0 != 101) {
            method2509(31, (char) 65501);
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(IC)C")
    public static final char method2509(int arg0, char arg1) {
        field5756++;
        if (arg1 == 'Æ') {
            return 'E';
        } else if (arg1 == 'æ') {
            return 'e';
        } else if (arg1 == 'ß') {
            return 's';
        } else {
            if (arg0 != 101) {
                method2509(24, (char) 65413);
            }
            if (arg1 == 'Œ') {
                return 'E';
            } else {
                return (char) (arg1 == 'œ' ? 'e' : '\u0000');
            }
        }
    }
}
