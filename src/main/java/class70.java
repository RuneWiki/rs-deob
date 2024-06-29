import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class70 extends class242 {

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "Ldf;")
    public static class51 field1122 = class46.method233(")4", 100);

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "Ldf;")
    public static class51 field1123 = class46.method233("Spieler kann nicht gefunden werden: ", 100);

    @OriginalMember(owner = "client!gd", name = "q", descriptor = "Lqh;")
    public static class189 field1124 = new class189(20);

    @OriginalMember(owner = "client!gd", name = "y", descriptor = "[Ldf;")
    public static class51[] field1132 = new class51[1000];

    @OriginalMember(owner = "client!gd", name = "C", descriptor = "[Llb;")
    public static class121[] field1136 = new class121[2048];

    @OriginalMember(owner = "client!gd", name = "A", descriptor = "Ldf;")
    public static class51 field1134 = class46.method233(")2", 100);

    @OriginalMember(owner = "client!gd", name = "u", descriptor = "I")
    public static int field1128 = 0;

    @OriginalMember(owner = "client!gd", name = "B", descriptor = "Ldf;")
    public static class51 field1135 = class46.method233("Sprites geladen)3", 100);

    @OriginalMember(owner = "client!gd", name = "z", descriptor = "Ldf;")
    public static class51 field1133 = class46.method233(")4a=", 100);

    @OriginalMember(owner = "client!gd", name = "x", descriptor = "Ldf;")
    public static class51 field1131 = class46.method233("event_opbase", 100);

    @OriginalMember(owner = "client!gd", name = "t", descriptor = "I")
    public static int field1127;

    @OriginalMember(owner = "client!gd", name = "v", descriptor = "I")
    public static int field1129;

    @OriginalMember(owner = "client!gd", name = "r", descriptor = "Lu;")
    public static class111 field1125;

    @OriginalMember(owner = "client!gd", name = "w", descriptor = "Loj;")
    public static class150 field1130;

    @OriginalMember(owner = "client!gd", name = "s", descriptor = "Lla;")
    public static class91 field1126;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Z)V")
    public static void method484(boolean arg0) {
        field1135 = null;
        field1122 = null;
        field1131 = null;
        field1123 = null;
        field1126 = null;
        field1124 = null;
        if (arg0) {
            field1128 = 101;
        }
        field1132 = null;
        field1134 = null;
        field1133 = null;
        field1125 = null;
        field1136 = null;
        field1130 = null;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V")
    public static final void method485(byte arg0) {
        if (arg0 > -64) {
            field1132 = null;
        }
        field1127++;
        if (class208.field3475 != null) {
            class29 var1 = class208.field3475;
            synchronized (class208.field3475) {
                class208.field3475 = null;
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIJ)Z")
    public static final boolean method486(int arg0, int arg1, int arg2, long arg3) {
        class97 var5 = class27.field395[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field1627 != null && var5.field1627.field4176 == arg3) {
            return true;
        } else if (var5.field1616 != null && var5.field1616.field3273 == arg3) {
            return true;
        } else if (var5.field1614 != null && var5.field1614.field2660 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field1620; var6++) {
                if (var5.field1632[var6].field477 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }
}
