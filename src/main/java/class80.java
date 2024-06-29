import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qu")
public class class80 extends class544 {

    @OriginalMember(owner = "client!qu", name = "F", descriptor = "I")
    public int field961;

    @OriginalMember(owner = "client!qu", name = "E", descriptor = "I")
    private int field960;

    @OriginalMember(owner = "client!qu", name = "G", descriptor = "I")
    public int field962;

    @OriginalMember(owner = "client!qu", name = "C", descriptor = "I")
    private int field958;

    @OriginalMember(owner = "client!qu", name = "m", descriptor = "I")
    private int field942;

    @OriginalMember(owner = "client!qu", name = "v", descriptor = "I")
    public int field951;

    @OriginalMember(owner = "client!qu", name = "t", descriptor = "I")
    public int field949;

    @OriginalMember(owner = "client!qu", name = "z", descriptor = "I")
    private int field955;

    @OriginalMember(owner = "client!qu", name = "r", descriptor = "I")
    private int field947;

    @OriginalMember(owner = "client!qu", name = "n", descriptor = "I")
    public static int field943;

    @OriginalMember(owner = "client!qu", name = "o", descriptor = "I")
    public static int field944;

    @OriginalMember(owner = "client!qu", name = "p", descriptor = "I")
    public static int field945;

    @OriginalMember(owner = "client!qu", name = "q", descriptor = "I")
    public static int field946;

    @OriginalMember(owner = "client!qu", name = "s", descriptor = "I")
    public static int field948;

    @OriginalMember(owner = "client!qu", name = "u", descriptor = "I")
    public static int field950;

    @OriginalMember(owner = "client!qu", name = "w", descriptor = "I")
    public static int field952;

    @OriginalMember(owner = "client!qu", name = "x", descriptor = "I")
    public static int field953;

    @OriginalMember(owner = "client!qu", name = "y", descriptor = "I")
    public static int field954;

    @OriginalMember(owner = "client!qu", name = "A", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!qu", name = "B", descriptor = "Lri;")
    public static class93 field957;

    @OriginalMember(owner = "client!qu", name = "D", descriptor = "[Lha;")
    public static class52[] field959;

    @OriginalMember(owner = "client!qu", name = "H", descriptor = "[[S")
    public static short[][] field963;

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "(III)Z")
    public final boolean method460(int arg0, int arg1, int arg2) {
        if (arg0 != -1) {
            this.field955 = 28;
        }
        field950++;
        return this.field960 <= arg1 && arg1 <= this.field958 && arg2 >= this.field947 && arg2 <= this.field942;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(B)V")
    public static final void method461(byte arg0) {
        field944++;
        if (arg0 != 66) {
            return;
        }
        for (class541 var1 = (class541) class54.field461.method1050((byte) 73); var1 != null; var1 = (class541) class54.field461.method1047(-7962)) {
            if (var1.field7907 == -1) {
                var1.field7900 = 0;
                if (var1.field7913 >= 0 && var1.field7901 >= 0 && class106.field1289 > var1.field7913 && class422.field5452 > var1.field7901) {
                    class7.method41(var1, -86);
                }
            } else {
                var1.method3187(true);
            }
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(IZ)V")
    public static final void method462(int arg0, boolean arg1) {
        class619.field8945 = arg0;
        field956++;
        if (!arg1) {
            method465(-56, -96);
        }
        class62.field619 = -1;
        class43.field353 = -1;
        class182.method999((byte) 88);
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(BII[I)V")
    public final void method463(byte arg0, int arg1, int arg2, int[] arg3) {
        field943++;
        arg3[0] = this.field955;
        arg3[2] = this.field947 - (this.field949 - arg2);
        if (arg0 <= -65) {
            arg3[1] = this.field960 + arg1 - this.field961;
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(Z)V")
    public static void method464(boolean arg0) {
        field963 = null;
        if (!arg0) {
            field959 = null;
        }
        field959 = null;
        field957 = null;
    }

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "(II)I")
    public static final int method465(int arg0, int arg1) {
        return class640.field9217 == null ? 0 : class640.field9217[arg0][arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(I)V")
    public static final void method466(int arg0) {
        field953++;
        class136.field1663.method2131(class601.field8674.method2568((byte) 120), arg0 - 1495157560);
        class136.field1663.method2131(class566.field8314.method2568((byte) -49), arg0 ^ 0xA6E1B4C8);
        class136.field1663.method2131(class489.field6828.method2568((byte) 118), -1495157560);
        class136.field1663.method2131(class280.field3679.method2568((byte) -22), -1495157560);
        class136.field1663.method2131(class173.field2110.method2568((byte) -17), arg0 ^ 0xA6E1B4C8);
        class136.field1663.method2131(class368.field4834.method2568((byte) 124), arg0 ^ 0xA6E1B4C8);
        class136.field1663.method2131(class282.field3709.method2568((byte) 117), arg0 - 1495157560);
        class136.field1663.method2131(class377.field5020.method2568((byte) 120), -1495157560);
        class136.field1663.method2131(class39.field299.method2568((byte) 118), -1495157560);
        class136.field1663.method2131(class315.field4016.method2568((byte) 127), -1495157560);
        class136.field1663.method2131(class596.field8637.method2568((byte) -81), -1495157560);
        class136.field1663.method2131(class531.field7458.method2568((byte) 122), -1495157560);
        class136.field1663.method2131(class48.field401.method2568((byte) -20), arg0 - 1495157560);
        class136.field1663.method2131(class593.field8621.method2568((byte) -124), arg0 - 1495157560);
        class136.field1663.method2131(class479.field6729.method2568((byte) -67), arg0 - 1495157560);
        class136.field1663.method2131(class92.field1132.method2568((byte) -69), -1495157560);
        class136.field1663.method2131(class106.field1286.method2568((byte) -107), arg0 - 1495157560);
        class136.field1663.method2131(class507.field7035.method2568((byte) -31), -1495157560);
        class136.field1663.method2131(class584.field8484.method2568((byte) 123), arg0 - 1495157560);
        class136.field1663.method2131(class200.field2405.method2568((byte) 121), -1495157560);
        class136.field1663.method2131(class44.field372.method2568((byte) 116), -1495157560);
        class136.field1663.method2131(class319.field4071.method2568((byte) 122), -1495157560);
        class136.field1663.method2131(class420.field5435.method2568((byte) -25), -1495157560);
        class136.field1663.method2131(class584.field8486.method2568((byte) 116), arg0 - 1495157560);
        class136.field1663.method2131(class245.field3143.method2568((byte) 18), arg0 ^ 0xA6E1B4C8);
        class136.field1663.method2131(class185.field2237.method2568((byte) 121), -1495157560);
        class136.field1663.method2131(class66.field645.method2568((byte) -82), -1495157560);
        class136.field1663.method2131(class418.field5428.method2568((byte) 2), -1495157560);
        class136.field1663.method2131(class104.field1266.method2568((byte) -81), arg0 - 1495157560);
        class136.field1663.method2131(class300.field3851.method2568((byte) 116), -1495157560);
        class136.field1663.method2131(class645.field9391.method2568((byte) -74), -1495157560);
        if (arg0 != 0) {
            field959 = null;
        }
        class136.field1663.method2131(class516.field7285.method2568((byte) 117), -1495157560);
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(IZII)Z")
    public final boolean method467(int arg0, boolean arg1, int arg2, int arg3) {
        field954++;
        if (arg1) {
            field963 = null;
        }
        return this.field955 == arg0 && arg3 >= this.field960 && arg3 <= this.field958 && this.field947 <= arg2 && this.field942 >= arg2;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(IIIIIII)V")
    public static final void method468(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 >= class470.field6589 && arg2 <= class592.field8588 && class563.field8282 <= arg5 && class271.field3513 >= arg1) {
            if (arg6 == 1) {
                class394.method2267(arg5, arg3, arg1, arg0, (byte) 25, arg2);
            } else {
                class463.method2692(arg3, arg0, arg5, (byte) -113, arg2, arg6, arg1);
            }
        } else if (arg6 == 1) {
            class323.method1779(arg2, arg1, arg0, arg3, arg5, 30);
        } else {
            class102.method612(arg3, arg2, (byte) -121, arg1, arg6, arg0, arg5);
        }
        field952++;
        if (arg4 != 12662) {
            method468(119, -43, -43, -105, 115, -23, -38);
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(II[II)V")
    public final void method469(int arg0, int arg1, int[] arg2, int arg3) {
        arg2[1] = this.field961 + arg3 - this.field960;
        arg2[2] = arg0 - (this.field947 - this.field949);
        field946++;
        arg2[0] = arg1;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(IZI)Z")
    public final boolean method470(int arg0, boolean arg1, int arg2) {
        field945++;
        if (!arg1) {
            this.method470(-65, true, -85);
        }
        return this.field961 <= arg2 && arg2 <= this.field962 && arg0 >= this.field949 && this.field951 >= arg0;
    }

    @OriginalMember(owner = "client!qu", name = "<init>", descriptor = "(IIIIIIIII)V")
    public class80(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field961 = arg5;
        this.field960 = arg1;
        this.field962 = arg7;
        this.field958 = arg3;
        this.field942 = arg4;
        this.field951 = arg8;
        this.field949 = arg6;
        this.field955 = arg0;
        this.field947 = arg2;
    }

    static {
        new class180("You do not have a high enough rank to join this clan channel.", "Dein Rang reicht nicht aus, um diesen Chatraum zu betreten.", "Votre rang n'est pas assez élevé pour rejoindre ce canal de clan.", "Sua posição não é alta o suficiente para você entrar nesse canal de clã.");
    }
}
