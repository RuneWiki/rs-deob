import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class480 {

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "Ltm;")
    public static class112 field6789 = new class112("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "[C")
    public static char[] field6793 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "I")
    public static int field6794 = 0;

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "I")
    public static int field6795 = 0;

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "B")
    public byte field6790;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "I")
    public int field6786;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "I")
    public static int field6788;

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "I")
    public static int field6792;

    @OriginalMember(owner = "client!ra", name = "l", descriptor = "I")
    public static int field6796;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "Ljava/lang/String;")
    public String field6785;

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "Ljava/lang/String;")
    public String field6787;

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "Ljava/lang/String;")
    public String field6791;

    @OriginalMember(owner = "client!ra", name = "m", descriptor = "Ljava/lang/String;")
    public String field6797;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V", line = 6)
    public static final void method2825(int arg0) {
        if (arg0 == 9742) {
            for (int var1 = 0; var1 < 100; var1++) {
                class127.field1809[var1] = true;
            }
            field6796++;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IB)I", line = 33)
    public static final int method2826(int arg0, byte arg1) {
        int var2 = -119 % ((arg1 - 59) / 32);
        field6788++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)V", line = 50)
    public static final void method2827(int arg0, int arg1) {
        class406 var2 = class455.field6293[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class406 var4 = class455.field6293[var3][arg0][arg1] = class455.field6293[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field5622--;
                for (class146 var5 = var4.field5613; var5 != null; var5 = var5.field2066) {
                    class478 var6 = var5.field2062;
                    if (var6.field6753 == arg0 && var6.field6747 == arg1) {
                        var6.field6766--;
                    }
                }
            }
        }
        if (class455.field6293[0][arg0][arg1] == null) {
            class455.field6293[0][arg0][arg1] = new class406(0, arg0, arg1);
            class455.field6293[0][arg0][arg1].field5620 = 1;
        }
        class455.field6293[0][arg0][arg1].field5606 = var2;
        class455.field6293[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)V", line = 91)
    public static void method2828(int arg0) {
        field6789 = null;
        field6793 = null;
        if (arg0 != -11901) {
            field6795 = 106;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lvf;ZBZ)V", line = 102)
    public static final void method2829(class465 arg0, boolean arg1, byte arg2, boolean arg3) {
        field6792++;
        int var4 = arg0.field6527;
        int var5 = (int) arg0.field2608;
        arg0.method1182(arg2 ^ 0x7091);
        if (arg1) {
            class447.method2601(-1, var4);
        }
        class460.method2718(var4, (byte) -126);
        if (arg2 != 3) {
            method2829((class465) null, false, (byte) -86, false);
        }
        class363 var6 = class292.method1804((byte) -104, var5);
        if (var6 != null) {
            class356.method2141(arg2 - 120, var6);
        }
        class68.method480((byte) 43);
        if (!arg3 && class182.field2652 != -1) {
            class64.method463(class182.field2652, 1, 1);
        }
        class293 var7 = new class293(class231.field3258);
        for (class465 var8 = (class465) var7.method1813(24004); var8 != null; var8 = (class465) var7.method1811((byte) 76)) {
            if (!var8.method1181(100)) {
                var8 = (class465) var7.method1813(24004);
                if (var8 == null) {
                    return;
                }
            }
            if (var8.field6530 == 3) {
                int var9 = (int) var8.field2608;
                if (var9 >>> 16 == var4) {
                    method2829(var8, true, (byte) 3, arg3);
                }
            }
        }
    }
}
