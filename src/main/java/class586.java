import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public class class586 extends class389 {

    @OriginalMember(owner = "client!ns", name = "l", descriptor = "Lbm;")
    public static class637 field7944 = new class637();

    @OriginalMember(owner = "client!ns", name = "i", descriptor = "I")
    public int field7941;

    @OriginalMember(owner = "client!ns", name = "j", descriptor = "I")
    public int field7942;

    @OriginalMember(owner = "client!ns", name = "k", descriptor = "I")
    public int field7943;

    @OriginalMember(owner = "client!ns", name = "m", descriptor = "I")
    public static int field7945;

    @OriginalMember(owner = "client!ns", name = "n", descriptor = "I")
    public int field7946;

    @OriginalMember(owner = "client!ns", name = "o", descriptor = "I")
    public static int field7947;

    @OriginalMember(owner = "client!ns", name = "q", descriptor = "I")
    public int field7949;

    @OriginalMember(owner = "client!ns", name = "r", descriptor = "I")
    public int field7950;

    @OriginalMember(owner = "client!ns", name = "p", descriptor = "Ljava/lang/String;")
    public String field7948;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IZI)Z", line = 7)
    public static final boolean method3197(int arg0, boolean arg1, int arg2) {
        field7947++;
        if (arg1) {
            field7944 = null;
        }
        return (arg0 & 0x70000) != 0 | class493.method2692(arg2, true, arg0) || class559.method2992((byte) -84, arg0, arg2);
    }

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "(I)V", line = 22)
    public static void method3198(int arg0) {
        field7944 = null;
        int var1 = 17 / ((-arg0 - 61) / 57);
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IZLjava/lang/String;)V", line = 35)
    public static final void method3199(int arg0, boolean arg1, String arg2) {
        String var3 = arg2.toLowerCase();
        field7945++;
        short[] var4 = new short[16];
        int var5 = 0;
        int var6 = arg1 ? 32768 : 0;
        int var7 = (arg1 ? class196.field2553.field57 : class196.field2553.field61) + var6;
        for (int var8 = var6; var8 < var7; var8++) {
            class30 var11 = class196.field2553.method24(var8, arg0 ^ 0x609C);
            if (var11.field443 && var11.method255((byte) -54).toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 50) {
                    client.field1222 = null;
                    class542.field7043 = -1;
                    return;
                }
                if (var4.length <= var5) {
                    short[] var12 = new short[var4.length * 2];
                    for (int var13 = 0; var13 < var5; var13++) {
                        var12[var13] = var4[var13];
                    }
                    var4 = var12;
                }
                var4[var5++] = (short) var8;
            }
        }
        client.field1222 = var4;
        class542.field7043 = var5;
        class587.field7973 = 0;
        if (arg0 != 8035) {
            method3198(56);
        }
        String[] var9 = new String[class542.field7043];
        for (int var10 = 0; var10 < class542.field7043; var10++) {
            var9[var10] = class196.field2553.method24(var4[var10], 32767).method255((byte) -80);
        }
        class82.method638(false, var9, client.field1222);
    }
}
