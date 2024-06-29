import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class389 extends class383 {

    @OriginalMember(owner = "client!ii", name = "k", descriptor = "I")
    public int field5218;

    @OriginalMember(owner = "client!ii", name = "o", descriptor = "I")
    public int field5222;

    @OriginalMember(owner = "client!ii", name = "q", descriptor = "I")
    public int field5224;

    @OriginalMember(owner = "client!ii", name = "n", descriptor = "I")
    public int field5221;

    @OriginalMember(owner = "client!ii", name = "p", descriptor = "Z")
    public boolean field5223;

    @OriginalMember(owner = "client!ii", name = "j", descriptor = "I")
    public int field5217;

    @OriginalMember(owner = "client!ii", name = "m", descriptor = "[Lks;")
    public static class304[] field5220 = new class304[128];

    @OriginalMember(owner = "client!ii", name = "r", descriptor = "Lap;")
    public static class335 field5225;

    @OriginalMember(owner = "client!ii", name = "s", descriptor = "[Lcm;")
    public static class513[] field5226;

    @OriginalMember(owner = "client!ii", name = "l", descriptor = "I")
    public static int field5219;

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(Z)V")
    public static void method2211(boolean arg0) {
        field5220 = null;
        field5226 = null;
        field5225 = null;
        if (!arg0) {
            method2212(65);
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V")
    public static final void method2212(int arg0) {
        field5219++;
        if (class49.field629 < 1024.0F) {
            class49.field629 = 1024.0F;
        }
        if (class49.field629 > 3072.0F) {
            class49.field629 = 3072.0F;
        }
        while (class463.field6626 >= 16384.0F) {
            class463.field6626 -= 16384.0F;
        }
        while (class463.field6626 < 0.0F) {
            class463.field6626 += 16384.0F;
        }
        int var1 = class119.field1603 >> 7;
        int var2 = class56.field740 >> 7;
        int var3 = class151.method991(class56.field740, false, class276.field3488, class119.field1603);
        int var4 = 0;
        if (arg0 != -4) {
            field5220 = null;
        }
        if (var1 > 3 && var2 > 3 && class452.field6526 - 4 > var1 && class440.field6307 - 4 > var2) {
            for (int var5 = var1 - 4; var5 <= var1 + 4; var5++) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    int var7 = class276.field3488;
                    if (var7 < 3 && class256.method1538(arg0 ^ 0xFFFFFFFE, var5, var6)) {
                        var7++;
                    }
                    int var8 = 0;
                    if (class532.field7825.field956 != null && class532.field7825.field956[var7] != null) {
                        var8 = (class532.field7825.field956[var7][var5][var6] & 0xFF) * 8;
                    }
                    int var9 = var8 - (class520.field7520[var7].method399(var5, var6) - var3);
                    if (var4 < var9) {
                        var4 = var9;
                    }
                }
            }
        }
        int var10 = (var4 >> 0) * 1536;
        if (var10 > 786432) {
            var10 = 786432;
        }
        if (var10 < 262144) {
            var10 = 262144;
        }
        if (var10 > class174.field2272) {
            class174.field2272 += (var10 - class174.field2272) / 24;
        } else if (var10 < class174.field2272) {
            class174.field2272 += (var10 - class174.field2272) / 80;
        }
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(IIIIIZ)V")
    public class389(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field5218 = arg1;
        this.field5222 = arg0;
        this.field5224 = arg3;
        this.field5221 = arg4;
        this.field5223 = arg5;
        this.field5217 = arg2;
    }

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "(I)V")
    public static final void method2213(int arg0) {
        class329.field4164 = arg0;
        for (int var1 = 0; var1 < class470.field6825; var1++) {
            for (int var2 = 0; var2 < class105.field1336; var2++) {
                if (class125.field1664[arg0][var1][var2] == null) {
                    class125.field1664[arg0][var1][var2] = new class490(arg0, var1, var2);
                }
            }
        }
    }

    static {
        new class335("Join your channel by clicking 'Join Chat' and typing: ", "Klick auf 'Betreten' und gib ein: ", "Pour rejoindre votre canal, cliquez sur « Participer » et entrez : ", "Para entrar no seu canal, clique em \"Acessar bate-papo\" e digite: ");
        field5225 = new class335("purple:", "lila:", "violet:", "roxo:");
        field5226 = new class513[14];
    }
}
