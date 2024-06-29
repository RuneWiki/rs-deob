import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public abstract class class29 {

    @OriginalMember(owner = "client!na", name = "c", descriptor = "Liq;")
    public static class362 field355 = new class362("Loaded wordpack", "Wordpack geladen.", "Module texte chargé", "Pacote de palavras carregado");

    @OriginalMember(owner = "client!na", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field358 = new String[100];

    @OriginalMember(owner = "client!na", name = "h", descriptor = "I")
    public static int field360 = 0;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "I")
    public static int field353;

    @OriginalMember(owner = "client!na", name = "b", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "client!na", name = "d", descriptor = "I")
    public static int field356;

    @OriginalMember(owner = "client!na", name = "g", descriptor = "I")
    public static int field359;

    @OriginalMember(owner = "client!na", name = "e", descriptor = "[[Z")
    public static boolean[][] field357;

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(B)V", line = 3)
    public static final void method195(byte arg0) {
        if (arg0 > -50) {
            field358 = null;
        }
        field359++;
        if (!class249.method1694((byte) 8)) {
            return;
        }
        if (class411.field5899 == null) {
            class255.method1718(2);
        }
        class210.field2989 = new int[100];
        class202.field2908 = new int[100];
        class235.field3298 = true;
        class405.field5843 = 0;
        class447.field6410 = new boolean[100];
        class255.field3673 = new int[100];
        for (int var1 = 0; var1 < 100; var1++) {
            class255.field3673[var1] = (int) (Math.random() * (double) class330.field4671);
            class210.field2989[var1] = (int) (Math.random() * 350.0D);
            class202.field2908[var1] = (int) (Math.random() * 102.0D);
            class447.field6410[var1] = Math.random() < 0.5D;
        }
        try {
            class176.field2402 = class382.field5381.getToolkit().getSystemClipboard();
        } catch (Exception var2) {
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(II)Ljk;", line = 48)
    public static final class380 method196(int arg0, int arg1) {
        field356++;
        class380 var2 = (class380) class345.field4887.method1625((long) arg0, 0);
        if (var2 != null) {
            return var2;
        }
        if (arg1 >= -29) {
            field355 = null;
        }
        byte[] var3 = class212.field3011.method2431((byte) 116, 29, arg0);
        class380 var4 = new class380();
        if (var3 != null) {
            var4.method2444((byte) -112, arg0, new class236(var3));
        }
        class345.field4887.method1622((byte) 13, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!na", name = "f", descriptor = "(I)V", line = 85)
    public static void method197(int arg0) {
        field357 = null;
        if (arg0 < 67) {
            method195((byte) -22);
        }
        field355 = null;
        field358 = null;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lvl;I)Z", line = 106)
    public static final boolean method198(class9 arg0, int arg1) {
        field353++;
        class88 var2 = class374.method2382(arg0.method71((byte) -76), false);
        if (var2.field1075 == -1) {
            return true;
        } else {
            class334 var3 = class162.method1066(var2.field1075, 24418);
            return ~var3.field4722 == arg1 ? true : var3.method2164(-18507);
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Z)Z")
    public abstract boolean method54(boolean arg0);

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ILae;II)Z")
    public abstract boolean method56(int arg0, class134 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lae;B)V")
    public abstract void method64(class134 arg0, byte arg1);

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(BLae;)Ljg;")
    public abstract class186 method52(byte arg0, class134 arg1);

    @OriginalMember(owner = "client!na", name = "e", descriptor = "(I)V")
    public abstract void method51(int arg0);

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ZBIILna;ILae;)V")
    public abstract void method60(boolean arg0, byte arg1, int arg2, int arg3, class29 arg4, int arg5, class134 arg6);
}
