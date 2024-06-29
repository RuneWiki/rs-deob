import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class88 {

    @OriginalMember(owner = "client!hq", name = "g", descriptor = "I")
    public int field1143;

    @OriginalMember(owner = "client!hq", name = "o", descriptor = "I")
    public int field1151;

    @OriginalMember(owner = "client!hq", name = "p", descriptor = "B")
    public byte field1152;

    @OriginalMember(owner = "client!hq", name = "h", descriptor = "I")
    public int field1144;

    @OriginalMember(owner = "client!hq", name = "m", descriptor = "I")
    public int field1149;

    @OriginalMember(owner = "client!hq", name = "t", descriptor = "Lhq;")
    public class88 field1156;

    @OriginalMember(owner = "client!hq", name = "s", descriptor = "Lpm;")
    public static class349 field1155;

    @OriginalMember(owner = "client!hq", name = "u", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "I")
    public int field1137;

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "I")
    public int field1138;

    @OriginalMember(owner = "client!hq", name = "c", descriptor = "I")
    public int field1139;

    @OriginalMember(owner = "client!hq", name = "d", descriptor = "I")
    public static int field1140;

    @OriginalMember(owner = "client!hq", name = "e", descriptor = "I")
    public int field1141;

    @OriginalMember(owner = "client!hq", name = "f", descriptor = "I")
    public int field1142;

    @OriginalMember(owner = "client!hq", name = "i", descriptor = "I")
    public static int field1145;

    @OriginalMember(owner = "client!hq", name = "j", descriptor = "I")
    public int field1146;

    @OriginalMember(owner = "client!hq", name = "k", descriptor = "I")
    public int field1147;

    @OriginalMember(owner = "client!hq", name = "l", descriptor = "I")
    public static int field1148;

    @OriginalMember(owner = "client!hq", name = "n", descriptor = "I")
    public int field1150;

    @OriginalMember(owner = "client!hq", name = "q", descriptor = "I")
    public int field1153;

    @OriginalMember(owner = "client!hq", name = "r", descriptor = "I")
    public static int field1154;

    @OriginalMember(owner = "client!hq", name = "v", descriptor = "I")
    public static int field1158;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(I)V")
    public static void method525(int arg0) {
        int var1 = 14 / ((25 - arg0) / 41);
        field1155 = null;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(II)I")
    public static final int method526(int arg0, int arg1) {
        if (arg0 != -24524) {
            method528(-11, -41, 42, 117, (class269) null, 9);
        }
        field1140++;
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "(I)V")
    public static final void method527(int arg0) {
        field1145++;
        class390.field5490.method883(((float) class355.field5139 * 0.1F + 0.7F) * 1.1523438F);
        class390.field5490.method873(class262.field3870, 0.69921875F, 1.2F, -50.0F, -60.0F, -50.0F);
        if (arg0 == -13100) {
            class390.field5490.method989(class24.field303, -1);
            class390.field5490.method948(class216.field3118);
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIIILvq;I)V")
    public static final void method528(int arg0, int arg1, int arg2, int arg3, class269 arg4, int arg5) {
        arg4.method937(arg3, arg1, arg0 + arg3, arg1 + arg5);
        field1148++;
        arg4.method1832(arg3, -16777216, arg0, 1, arg1, arg5);
        int var6 = -53 / ((-arg2 - 63) / 52);
        if (class284.field4121 < 100) {
            return;
        }
        float var7 = (float) class176.field2492 / (float) class176.field2494;
        int var8 = arg0;
        int var9 = arg5;
        if ((var7 < 1.0F)) {
            var9 = (int) ((float) arg0 * var7);
        } else {
            var8 = (int) ((float) arg5 / var7);
        }
        int var10 = (arg0 - var8) / 2 + arg3;
        int var11 = (arg5 - var9) / 2 + arg1;
        if (class136.field2096 == null || arg0 != class136.field2096.method87() || class136.field2096.method80() != arg5) {
            class176.method1241(class176.field2486, class176.field2493 + class176.field2492, class176.field2494 + class176.field2486, class176.field2493, var10, var11, var10 + var8, var9 + var11);
            class176.method1255(arg4);
            class136.field2096 = arg4.method1027(var10, var11, var8, var9, false);
        }
        class136.field2096.method1772(var10, var11);
        int var12 = class13.field196 * var8 / class176.field2494;
        int var13 = class347.field5069 * var9 / class176.field2492;
        int var14 = var10 + (class56.field745 * var8 / class176.field2494);
        int var15 = var9 + var11 - (class323.field4705 * var9 / class176.field2492) - var13;
        int var16 = -1996554240;
        if (class317.field4656 == 1) {
            var16 = -1996488705;
        }
        arg4.method1012(var14, var15, var12, var13, var16, 1);
        arg4.method983(var14, var15, var12, var13, var16, 0);
        if (class166.field2377 <= 0) {
            return;
        }
        int var17;
        if (class385.field5445 <= 50) {
            var17 = class385.field5445 * 5;
        } else {
            var17 = (100 - class385.field5445) * 5;
        }
        for (class194 var18 = (class194) class176.field2472.method2752(-55); var18 != null; var18 = (class194) class176.field2472.method2754(-1)) {
            class297 var19 = class379.method2417(3144, var18.field2794);
            if (class239.method1628(true, var19)) {
                if (class334.field4849 == var18.field2794) {
                    int var20 = var18.field2793 * var8 / class176.field2494 + var10;
                    int var21 = (class176.field2492 - var18.field2797) * var9 / class176.field2492 + var11;
                    arg4.method1832(var20 - 2, var17 << 24 | 0xFFFF00, 4, 1, var21 - 2, 4);
                } else if (class252.field3743 != -1 && class252.field3743 == var19.field4287) {
                    int var22 = var18.field2793 * var8 / class176.field2494 + var10;
                    int var23 = (class176.field2492 - var18.field2797) * var9 / class176.field2492 + var11;
                    arg4.method1832(var22 - 2, var17 << 24 | 0xFFFF00, 4, 1, var23 - 2, 4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(IIIIB)V")
    public class88(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field1143 = arg2;
        this.field1151 = arg1;
        this.field1152 = arg4;
        this.field1144 = arg3;
        this.field1149 = arg0;
    }

    @OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Lhq;I)V")
    public class88(class88 arg0, int arg1) {
        this.field1156 = arg0;
        this.field1152 = this.field1156.field1152;
        this.field1151 = this.field1156.field1151 + arg1;
        this.field1144 = this.field1156.field1144 + arg1;
        this.field1143 = this.field1156.field1143 + arg1;
        this.field1149 = this.field1156.field1149;
    }

    static {
        new class349("Chat disabled", "Deaktiviert", "Messagerie désactivée", "Bate-papo desativado");
        new class349("To prevent further mutes please read the rules.", "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.", "Pour éviter un nouveau blocage, lisez le règlement.", "Para evitar outros vetos, leia as regras.");
        field1155 = new class349("wave2:", "welle2:", "ondulation2:", "onda2:");
        field1157 = -1;
    }
}
