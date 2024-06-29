import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class240 extends OutputStream {

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "[I")
    public static int[] field3156;

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "[I")
    public static int[] field3157;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
    public static int field3151;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
    public static int field3152;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
    public static int field3153;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
    public static int field3154;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "I")
    public static int field3155;

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "I")
    public static int field3159;

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "Lwo;")
    public static class285 field3158;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I[Laq;I)V")
    public static final void method1531(int arg0, class453[] arg1, int arg2) {
        field3154++;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class453 var4 = arg1[var3];
            if (var4 != null) {
                if (var4.field6383 == 0) {
                    if (var4.field6350 != null) {
                        method1531(arg0, var4.field6350, -1);
                    }
                    class244 var5 = (class244) class282.field3678.method2218(1, (long) var4.field6475);
                    if (var5 != null) {
                        class430.method2623(var5.field3245, true, arg0);
                    }
                }
                if (arg0 == 0 && var4.field6353 != null) {
                    class221 var6 = new class221();
                    var6.field2732 = var4;
                    var6.field2735 = var4.field6353;
                    class93.method578(var6);
                }
                if (arg0 == 1 && var4.field6389 != null) {
                    if (var4.field6364 >= 0) {
                        class453 var7 = class195.method1212(var4.field6475, (byte) 49);
                        if (var7 == null || var7.field6350 == null || var7.field6350.length <= var4.field6364 || var7.field6350[var4.field6364] != var4) {
                            continue;
                        }
                    }
                    class221 var8 = new class221();
                    var8.field2735 = var4.field6389;
                    var8.field2732 = var4;
                    class93.method578(var8);
                }
            }
        }
        if (arg2 != -1) {
            field3158 = null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
    public static final void method1532(int arg0) {
        class59.field751.method2290(13831);
        field3151++;
        class344.field4678.method2290(13831);
        class28.field313.method2290(13831);
        if (arg0 >= -108) {
            field3159 = 76;
        }
        class91.field1062.method2290(13831);
        class278.field3607.method2290(13831);
    }

    @OriginalMember(owner = "client!ic", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field3155++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V")
    public static final void method1533(byte arg0) {
        for (int var1 = 0; var1 < class284.field3715.length; var1++) {
            for (int var2 = 0; var2 < class284.field3715[var1].length; var2++) {
                class284.field3715[var1][var2] = class12.field139;
            }
        }
        if (arg0 <= 77) {
            field3156 = null;
        }
        field3153++;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)V")
    public static void method1534(int arg0) {
        int var1 = -89 % ((22 - arg0) / 61);
        field3156 = null;
        field3158 = null;
        field3157 = null;
    }

    static {
        new class72("Unable to delete name - system busy.", "Name konnte nicht gelöscht werden - Systemfehler.", "Impossible d'effacer le nom - système occupé.", "Não foi possível deletar o nome - sistema ocupado.");
        field3156 = new int[5];
        field3157 = new int[25];
    }
}
