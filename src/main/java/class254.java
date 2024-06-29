import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class254 {

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "I")
    public static int field3868;

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "I")
    public static int field3869;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "([[[Ldc;B)V")
    public static final void method1562(class13[][][] arg0, byte arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class13[][] var3 = arg0[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class13 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field166 instanceof class18) {
                            ((class18) var6.field166).method11(-21910);
                        }
                        if (var6.field164 instanceof class18) {
                            ((class18) var6.field164).method11(-21910);
                        }
                        if (var6.field149 instanceof class18) {
                            ((class18) var6.field149).method11(-21910);
                        }
                        if (var6.field167 instanceof class18) {
                            ((class18) var6.field167).method11(-21910);
                        }
                        if (var6.field163 instanceof class18) {
                            ((class18) var6.field163).method11(-21910);
                        }
                        for (class466 var7 = var6.field151; var7 != null; var7 = var7.field6853) {
                            class141 var8 = var7.field6862;
                            if (var8 instanceof class18) {
                                ((class18) var8).method11(-21910);
                            }
                        }
                    }
                }
            }
        }
        if (arg1 >= -80) {
            method1562((class13[][][]) null, (byte) 123);
        }
        field3868++;
    }

    static {
        new class151("Use", "Benutzen", "Utiliser", "Usar");
        new class151("To talk, start each line of chat with the / symbol.", "Leite eine Zeile mit / ein, um hier zu chatten.", "Pour parler, insérez le symbole / au début de chaque ligne.", "Para falar, comece cada linha de conversa com o símbolo /.");
    }
}
