import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class148 extends class378 {

    @OriginalMember(owner = "client!hm", name = "L", descriptor = "Lkg;")
    public static class179 field1874;

    @OriginalMember(owner = "client!hm", name = "M", descriptor = "Ldp;")
    public static class3 field1875;

    @OriginalMember(owner = "client!hm", name = "J", descriptor = "I")
    public static int field1872;

    @OriginalMember(owner = "client!hm", name = "K", descriptor = "I")
    public static int field1873;

    @OriginalMember(owner = "client!hm", name = "N", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!hm", name = "I", descriptor = "[B")
    private byte[] field1871;

    static {
        new class335("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...");
        field1874 = new class179(39, 15);
        field1875 = new class3();
    }

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "(IIII)[B", line = 4)
    public final byte[] method980(int arg0, int arg1, int arg2, int arg3) {
        this.field1871 = new byte[arg0 * arg2 * 2 * arg1];
        field1873++;
        if (arg3 <= 95) {
            return null;
        } else {
            this.method2562(arg1, arg0, 128, arg2);
            return this.field1871;
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;", line = 17)
    public static final String method981(int arg0, Throwable arg1) throws IOException {
        field1872++;
        String var3;
        if (arg1 instanceof class315) {
            class315 var2 = (class315) arg1;
            arg1 = var2.field4019;
            var3 = var2.field4016 + " | ";
        } else {
            var3 = "";
        }
        if (arg0 != 5) {
            return null;
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            String var9 = var7.readLine();
            if (var9 == null) {
                return var3 + "| " + var8;
            }
            int var10 = var9.indexOf(40);
            int var11 = var9.indexOf(41, var10 + 1);
            String var12;
            if (var10 == -1) {
                var12 = var9;
            } else {
                var12 = var9.substring(0, var10);
            }
            String var13 = var12.trim();
            String var14 = var13.substring(var13.lastIndexOf(32) + 1);
            String var15 = var14.substring(var14.lastIndexOf(9) + 1);
            String var16 = var3 + var15;
            if (var10 != -1 && var11 != -1) {
                int var17 = var9.indexOf(".java:", var10);
                if (var17 >= 0) {
                    var16 = var16 + var9.substring(var17 + 5, var11);
                }
            }
            var3 = var16 + ' ';
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IBI)V", line = 94)
    public final void method982(int arg0, byte arg1, int arg2) {
        field1876++;
        int var4 = arg2 * 2;
        if (arg0 < 100) {
            field1874 = null;
        }
        int var5 = arg1 & 0xFF;
        this.field1871[var4++] = (byte) (var5 * 3 >> 5);
        this.field1871[var4] = (byte) (var5 * 3 >> 5);
    }

    @OriginalMember(owner = "client!hm", name = "e", descriptor = "(I)V", line = 110)
    public static void method983(int arg0) {
        if (arg0 == 2) {
            field1874 = null;
            field1875 = null;
        }
    }

    @OriginalMember(owner = "client!hm", name = "<init>", descriptor = "()V", line = 124)
    public class148() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }
}
