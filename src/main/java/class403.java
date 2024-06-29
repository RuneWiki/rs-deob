import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class403 extends class445 {

    @OriginalMember(owner = "client!tl", name = "v", descriptor = "J")
    public static long field5530 = 0L;

    @OriginalMember(owner = "client!tl", name = "A", descriptor = "Z")
    public static boolean field5535;

    @OriginalMember(owner = "client!tl", name = "s", descriptor = "I")
    public static int field5527;

    @OriginalMember(owner = "client!tl", name = "t", descriptor = "I")
    public static int field5528;

    @OriginalMember(owner = "client!tl", name = "w", descriptor = "I")
    public static int field5531;

    @OriginalMember(owner = "client!tl", name = "y", descriptor = "I")
    public static int field5533;

    @OriginalMember(owner = "client!tl", name = "x", descriptor = "J")
    public long field5532;

    @OriginalMember(owner = "client!tl", name = "u", descriptor = "Ltl;")
    public class403 field5529;

    @OriginalMember(owner = "client!tl", name = "z", descriptor = "Ltl;")
    public class403 field5534;

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(B)V")
    public static final void method2439(byte arg0) {
        field5528++;
        if (arg0 != 105) {
            method2439((byte) -77);
        }
        if (class239.field3186 < 1024.0F) {
            class239.field3186 = 1024.0F;
        }
        while (class270.field3610 >= 16384.0F) {
            class270.field3610 -= 16384.0F;
        }
        if (class239.field3186 > 3072.0F) {
            class239.field3186 = 3072.0F;
        }
        while (class270.field3610 < 0.0F) {
            class270.field3610 += 16384.0F;
        }
        int var1 = class87.field1215 >> 7;
        int var2 = class36.field544 >> 7;
        int var3 = class247.method1385(97, class87.field1215, class36.field544, class373.field5104);
        int var4 = 0;
        if (var1 > 3 && var2 > 3 && var1 < 100 && var2 < 100) {
            for (int var5 = var1 - 4; var5 <= (var1 + 4); var5++) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    int var7 = class373.field5104;
                    if (var7 < 3 && class151.method894((byte) 25, var6, var5)) {
                        var7++;
                    }
                    int var8 = 0;
                    if (class98.field1438.field6795 != null && class98.field1438.field6795[var7] != null) {
                        var8 = (class98.field1438.field6795[var7][var5][var6] & 0xFF) * 8;
                    }
                    int var9 = var8 + var3 - class221.field2945[var7].method371(var5, var6);
                    if (var9 > var4) {
                        var4 = var9;
                    }
                }
            }
        }
        int var10 = var4 * 1536;
        if (var10 > 786432) {
            var10 = 786432;
        }
        if (var10 < 262144) {
            var10 = 262144;
        }
        if (class387.field5358 < var10) {
            class387.field5358 += (var10 - class387.field5358) / 24;
        } else if (class387.field5358 > var10) {
            class387.field5358 += (var10 - class387.field5358) / 80;
            return;
        }
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(Z)Z")
    public final boolean method2440(boolean arg0) {
        if (arg0) {
            return false;
        } else {
            field5533++;
            return this.field5534 != null;
        }
    }

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "(B)V")
    public final void method2441(byte arg0) {
        field5527++;
        if (this.field5534 == null) {
            return;
        }
        this.field5534.field5529 = this.field5529;
        this.field5529.field5534 = this.field5534;
        this.field5529 = null;
        if (arg0 < -72) {
            this.field5534 = null;
        }
    }

    static {
        new class206("To interact with this please login to a members' server.", "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.", "Veuillez vous connecter à un serveur d'abonnés pour cette interaction.", "Para interagir, acesse um servidor para membros.");
        field5535 = false;
    }
}
