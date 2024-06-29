import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public class class327 implements Runnable {

    @OriginalMember(owner = "client!nq", name = "c", descriptor = "[Led;")
    public volatile class507[] field4807 = new class507[2];

    @OriginalMember(owner = "client!nq", name = "h", descriptor = "Z")
    public volatile boolean field4812 = false;

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "Z")
    public volatile boolean field4805 = false;

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "I")
    public static int field4806 = 1;

    @OriginalMember(owner = "client!nq", name = "i", descriptor = "[J")
    public static long[] field4813;

    @OriginalMember(owner = "client!nq", name = "e", descriptor = "I")
    public static int field4809;

    @OriginalMember(owner = "client!nq", name = "f", descriptor = "I")
    public static int field4810;

    @OriginalMember(owner = "client!nq", name = "g", descriptor = "I")
    public static int field4811;

    @OriginalMember(owner = "client!nq", name = "d", descriptor = "Lul;")
    public class411 field4808;

    static {
        new class44(" joined the channel.", " hat den Chatraum betreten.", " a rejoint le canal.", " entrou no canal.");
        new class44("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...");
        field4813 = new long[32];
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(IZ)Z", line = 3)
    public static final boolean method2070(int arg0, boolean arg1) {
        field4811++;
        if (arg1) {
            return arg0 == 3 || arg0 == 4;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!nq", name = "run", descriptor = "()V", line = 15)
    public final void run() {
        field4810++;
        this.field4805 = true;
        try {
            while (!this.field4812) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class507 var2 = this.field4807[var1];
                    if (var2 != null) {
                        var2.method2956(-16385);
                    }
                }
                class477.method2826(10L, 0);
                class117.method846(0, null, this.field4808);
            }
        } catch (Exception var9) {
            class266.method1710((byte) 81, var9, null);
        } finally {
            Object var6 = null;
            this.field4805 = false;
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(IB)V", line = 54)
    public static final void method2071(int arg0, byte arg1) {
        if (arg1 >= -45) {
            field4806 = -74;
        }
        class519.field7579 = 1000 / arg0;
        field4809++;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(B)V", line = 83)
    public static void method2072(byte arg0) {
        if (arg0 != 127) {
            field4813 = null;
        }
        field4813 = null;
    }
}
