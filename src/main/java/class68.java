import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class68 extends class167 {

    @OriginalMember(owner = "client!ec", name = "r", descriptor = "I")
    public int field1034 = -1;

    @OriginalMember(owner = "client!ec", name = "v", descriptor = "Lss;")
    public static class213 field1038 = new class213("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.");

    @OriginalMember(owner = "client!ec", name = "w", descriptor = "Z")
    public static boolean field1039 = true;

    @OriginalMember(owner = "client!ec", name = "n", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!ec", name = "o", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!ec", name = "q", descriptor = "I")
    public static int field1033;

    @OriginalMember(owner = "client!ec", name = "t", descriptor = "I")
    public int field1036;

    @OriginalMember(owner = "client!ec", name = "u", descriptor = "I")
    public static int field1037;

    @OriginalMember(owner = "client!ec", name = "x", descriptor = "I")
    public static int field1040;

    @OriginalMember(owner = "client!ec", name = "p", descriptor = "Ljava/lang/String;")
    public String field1032;

    @OriginalMember(owner = "client!ec", name = "s", descriptor = "Ljava/lang/String;")
    public String field1035;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)V")
    public static final void method485(int arg0) {
        class301.field4732.method168(112);
        ++field1030;
        for (int var1 = 0; var1 < 32; ++var1) {
            class170.field2490[var1] = 0L;
        }
        for (int var2 = arg0; var2 < 32; ++var2) {
            class88.field1277[var2] = 0L;
        }
        class201.field3056 = 0;
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(I)Lnr;")
    public final class16 method486(int arg0) {
        int var2 = -93 / ((-27 - arg0) / 43);
        ++field1037;
        return class9.field101[super.field2435];
    }

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "(I)V")
    public static void method487(int arg0) {
        if (arg0 > -4) {
            field1040 = -111;
        }
        field1038 = null;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lpb;ZLjava/lang/String;IZ)V")
    public static final void method488(class2 arg0, boolean arg1, String arg2, int arg3, boolean arg4) {
        ++field1031;
        if (arg4) {
            if (class2.field23.startsWith("win") && ~class2.field15 != -4) {
                String var5 = null;
                if (arg0.field27 != null) {
                    var5 = arg0.field27.getParameter("haveie6");
                }
                if (var5 == null || !var5.equals("1")) {
                    class495 var6 = class144.method869((byte) -121, arg2, 0, arg0);
                    class422.field6406 = var6;
                    class76.field1140 = arg0;
                    class389.field5927 = arg2;
                    return;
                }
            }
            if (class2.field23.startsWith("mac")) {
                String var7 = null;
                if (arg0.field27 != null) {
                    var7 = arg0.field27.getParameter("havefirefox");
                }
                if (var7 != null && var7.equals("1") && arg1) {
                    class144.method869((byte) -111, arg2, 1, arg0);
                    return;
                }
            }
            class144.method869((byte) -123, arg2, 2, arg0);
        } else {
            class144.method869((byte) -54, arg2, 3, arg0);
        }
        if (arg3 != 0) {
            method489(-26, (byte) -73, (class276) null);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IBLtq;)V")
    public static final void method489(int arg0, byte arg1, class276 arg2) {
        class537.field7864 = false;
        ++field1033;
        class275.field4367 = 0;
        class94.method647(arg1 + -34, arg2);
        class7.method58((byte) 107, arg2);
        if (arg1 == 34) {
            if (class537.field7864) {
                System.out.println("---endgpp---");
            }
            if (arg2.field3162 != arg0) {
                throw new RuntimeException("gpi1 pos:" + arg2.field3162 + " psize:" + arg0);
            }
        }
    }

    static {
        new class213("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que você tentou acessar não existe.");
    }
}
