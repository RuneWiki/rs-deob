import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tw")
public class class172 {

    @OriginalMember(owner = "client!tw", name = "h", descriptor = "Lsw;")
    public static class641 field2092 = new class641(8);

    @OriginalMember(owner = "client!tw", name = "k", descriptor = "Lcu;")
    public static class185 field2095 = new class185(0, 16);

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "I")
    public static int field2085;

    @OriginalMember(owner = "client!tw", name = "b", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!tw", name = "c", descriptor = "I")
    public static int field2087;

    @OriginalMember(owner = "client!tw", name = "d", descriptor = "I")
    public int field2088;

    @OriginalMember(owner = "client!tw", name = "e", descriptor = "I")
    public int field2089;

    @OriginalMember(owner = "client!tw", name = "f", descriptor = "I")
    public int field2090;

    @OriginalMember(owner = "client!tw", name = "g", descriptor = "I")
    public int field2091;

    @OriginalMember(owner = "client!tw", name = "i", descriptor = "I")
    public int field2093;

    @OriginalMember(owner = "client!tw", name = "j", descriptor = "I")
    public int field2094;

    @OriginalMember(owner = "client!tw", name = "l", descriptor = "[Lha;")
    public static class52[] field2096;

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(IZLjava/lang/String;)V", line = 6)
    public static final void method958(int arg0, boolean arg1, String arg2) {
        field2087++;
        if (arg2 == null) {
            return;
        }
        if (class426.field5481 >= 100) {
            class435.method2514(class554.field8162.method987(class31.field247, 22), true);
            return;
        }
        String var3 = class78.method453((byte) 97, arg2);
        if (var3 == null) {
            return;
        }
        if (arg0 != -28408) {
            method958(100, false, null);
        }
        for (int var4 = 0; var4 < class426.field5481; var4++) {
            String var8 = class78.method453((byte) 97, class615.field8914[var4]);
            if (var8 != null && var8.equals(var3)) {
                class435.method2514(arg2 + class31.field245.method987(class31.field247, 22), true);
                return;
            }
            if (class586.field8506[var4] != null) {
                String var9 = class78.method453((byte) 97, class586.field8506[var4]);
                if (var9 != null && var9.equals(var3)) {
                    class435.method2514(arg2 + class31.field245.method987(class31.field247, 22), true);
                    return;
                }
            }
        }
        for (int var5 = 0; var5 < class389.field5147; var5++) {
            String var6 = class78.method453((byte) 97, class436.field5911[var5]);
            if (var6 != null && var6.equals(var3)) {
                class435.method2514(class395.field5213.method987(class31.field247, 22) + arg2 + class178.field2152.method987(class31.field247, 22), true);
                return;
            }
            if (class283.field3716[var5] != null) {
                String var7 = class78.method453((byte) 97, class283.field3716[var5]);
                if (var7 != null && var7.equals(var3)) {
                    class435.method2514(class395.field5213.method987(class31.field247, 22) + arg2 + class178.field2152.method987(class31.field247, 22), true);
                    return;
                }
            }
        }
        if (class78.method453((byte) 97, class103.field1265.field8023).equals(var3)) {
            class435.method2514(class366.field4815.method987(class31.field247, 22), true);
            return;
        }
        class374.field4915++;
        class418.method2378(17984, class381.field5048);
        class136.field1663.method2093(class88.method528((byte) -86, arg2) + 1, -111);
        class136.field1663.method2106(-44, arg2);
        class136.field1663.method2093(arg1 ? 1 : 0, -107);
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(BI)V", line = 103)
    public static final void method959(byte arg0, int arg1) {
        field2086++;
        class528.field7388.method3686((byte) 53, arg1);
        class307.field3899.method3686((byte) 53, arg1);
        class209.field2523.method3686((byte) 53, arg1);
        class216.field2638.method3686((byte) 53, arg1);
        class370.field4880.method3686((byte) 53, arg1);
        if (arg0 <= 96) {
            field2095 = null;
        }
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(B)V", line = 121)
    public static void method960(byte arg0) {
        if (arg0 > -120) {
            method961('D', 5);
        }
        field2095 = null;
        field2092 = null;
        field2096 = null;
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(CI)I", line = 138)
    public static final int method961(char arg0, int arg1) {
        field2085++;
        if (arg1 != 16) {
            method958(8, false, null);
        }
        return arg0 >= '\u0000' && class405.field5330.length > arg0 ? class405.field5330[arg0] : -1;
    }
}
