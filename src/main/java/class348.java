import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class348 {

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "[C")
    public static char[] field5198 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "I")
    public static int field5194 = 1;

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "[[Z")
    public static boolean[][] field5197 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "I")
    public static int field5191;

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "I")
    public static int field5195;

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "I")
    public static int field5196;

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "[I")
    public static int[] field5193;

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "[[[Lvt;")
    public static class281[][][] field5192;

    static {
        new class179("You have been permanently muted due to breaking a rule.", "Du wurdest permanent stumm geschaltet, da du gegen eine Regel verstoßen hast.", "L'accès à la messagerie instantanée vous a définitivement été retiré suite à une infraction.", "Você foi permanentemente vetado por ter violado uma regra.");
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "([Ljava/lang/String;I[SII)V", line = 9)
    public static final void method2239(String[] arg0, int arg1, short[] arg2, int arg3, int arg4) {
        if (arg3 >= -42) {
            method2241((byte) 91);
        }
        if (arg4 < arg1) {
            int var5 = (arg1 + arg4) / 2;
            int var6 = arg4;
            String var7 = arg0[var5];
            arg0[var5] = arg0[arg1];
            arg0[arg1] = var7;
            short var8 = arg2[var5];
            arg2[var5] = arg2[arg1];
            arg2[arg1] = var8;
            for (int var9 = arg4; var9 < arg1; var9++) {
                if (var7 == null || arg0[var9] != null && (var9 & 0x1) > arg0[var9].compareTo(var7)) {
                    String var10 = arg0[var9];
                    arg0[var9] = arg0[var6];
                    arg0[var6] = var10;
                    short var11 = arg2[var9];
                    arg2[var9] = arg2[var6];
                    arg2[var6++] = var11;
                }
            }
            arg0[arg1] = arg0[var6];
            arg0[var6] = var7;
            arg2[arg1] = arg2[var6];
            arg2[var6] = var8;
            method2239(arg0, var6 - 1, arg2, -113, arg4);
            method2239(arg0, arg1, arg2, -128, var6 + 1);
        }
        field5196++;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIILed;)V", line = 65)
    public static final void method2240(int arg0, int arg1, int arg2, int arg3, class90 arg4) {
        class281 var5 = class141.method1018(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        int var6 = 0;
        arg4.field1450 = (arg1 << class295.field4543) + class74.field1258;
        arg4.field1451 = arg3;
        arg4.field1452 = (arg2 << class295.field4543) + class74.field1258;
        for (class21 var7 = var5.field4381; var7 != null; var7 = var7.field235) {
            if (var7.field240.field1276) {
                int var8 = var7.field240.method101(false);
                if (var8 != -32768 && var8 < var6) {
                    var6 = var8;
                }
            }
        }
        if (var6 < 0) {
            arg4.field1451 += var6;
            arg4.field1446 = true;
        } else if (var5.field4371 != null) {
            arg4.field1451 -= var5.field4371.field7053;
        }
        var5.field4388 = arg4;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(B)V", line = 108)
    public static void method2241(byte arg0) {
        field5197 = null;
        field5193 = null;
        field5198 = null;
        int var1 = 40 % ((-arg0 - 44) / 42);
        field5192 = null;
    }
}
