import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public abstract class class518 extends class184 {

    @OriginalMember(owner = "client!dn", name = "m", descriptor = "Ljagtheora/ogg/OggStreamState;")
    public OggStreamState field7391;

    @OriginalMember(owner = "client!dn", name = "o", descriptor = "Lwq;")
    public static class168 field7393 = new class168();

    @OriginalMember(owner = "client!dn", name = "n", descriptor = "I")
    public static int field7392;

    @OriginalMember(owner = "client!dn", name = "p", descriptor = "I")
    public int field7394;

    @OriginalMember(owner = "client!dn", name = "r", descriptor = "I")
    public static int field7396;

    @OriginalMember(owner = "client!dn", name = "s", descriptor = "I")
    public static int field7397;

    @OriginalMember(owner = "client!dn", name = "q", descriptor = "[Lvs;")
    public static class593[] field7395;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(ILjagtheora/ogg/OggPacket;)V", line = 11)
    public final void method3054(int arg0, OggPacket arg1) {
        this.method1164(arg1, 0);
        int var3 = 124 % ((-arg0 - 13) / 59);
        field7396++;
        this.field7394++;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(B)V", line = 22)
    public static void method3055(byte arg0) {
        field7393 = null;
        field7395 = null;
        int var1 = 10 % ((1 - arg0) / 61);
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(I[I)Ljava/lang/String;", line = 38)
    public static final String method3056(int arg0, int[] arg1) {
        field7392++;
        StringBuffer var2 = new StringBuffer();
        int var3 = client.field4274;
        for (int var4 = arg0; var4 < arg1.length; var4++) {
            class62 var5 = class28.field273.method2433(arg1[var4], arg0 - 16414);
            if (var5.field889 != -1) {
                class536 var6 = (class536) class27.field266.method803(118, (long) var5.field889);
                if (var6 == null) {
                    class129 var7 = class129.method919(class640.field8990, var5.field889, 0);
                    if (var7 != null) {
                        var6 = class736.field10316.method422(var7, true);
                        class27.field266.method801(1, var6, (long) var5.field889);
                    }
                }
                if (var6 != null) {
                    class259.field3701[var3] = var6;
                    var2.append(" <img=").append(var3).append(">");
                    var3++;
                }
            }
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V", line = 86)
    public class518(OggStreamState arg0) {
        this.field7391 = arg0;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Ljagtheora/ogg/OggPacket;I)V")
    public abstract void method1164(OggPacket arg0, int arg1);

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(I)V")
    public abstract void method1165(int arg0);
}
