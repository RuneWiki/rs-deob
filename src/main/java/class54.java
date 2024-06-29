import java.awt.Component;
import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public abstract class class54 {

    @OriginalMember(owner = "client!he", name = "e", descriptor = "I")
    public static int field1241 = 0;

    @OriginalMember(owner = "client!he", name = "j", descriptor = "Lmb;")
    public static class84 field1246 = class79.method672(true, "@gr1@");

    @OriginalMember(owner = "client!he", name = "g", descriptor = "Lmb;")
    private static class84 field1243 = class79.method672(true, "Loaded input handler");

    @OriginalMember(owner = "client!he", name = "o", descriptor = "Lmb;")
    public static class84 field1251 = class79.method672(true, "Registrierter Benutzer");

    @OriginalMember(owner = "client!he", name = "k", descriptor = "Lmb;")
    public static class84 field1247 = field1243;

    @OriginalMember(owner = "client!he", name = "l", descriptor = "Lmb;")
    public static class84 field1248 = class79.method672(true, "@yel@*V");

    @OriginalMember(owner = "client!he", name = "q", descriptor = "Lmb;")
    private static class84 field1253 = class79.method672(true, "This world is full)3");

    @OriginalMember(owner = "client!he", name = "c", descriptor = "Lmb;")
    public static class84 field1239 = field1253;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "I")
    public static int field1237;

    @OriginalMember(owner = "client!he", name = "h", descriptor = "I")
    public static int field1244;

    @OriginalMember(owner = "client!he", name = "i", descriptor = "I")
    public static int field1245;

    @OriginalMember(owner = "client!he", name = "p", descriptor = "I")
    public static int field1252;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "Lsc;")
    public static class121 field1238;

    @OriginalMember(owner = "client!he", name = "f", descriptor = "Lia;")
    public static class57 field1242;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "Ljd;")
    public static class66 field1240;

    @OriginalMember(owner = "client!he", name = "n", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field1250;

    @OriginalMember(owner = "client!he", name = "m", descriptor = "[I")
    public static int[] field1249;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method246(int arg0, Component arg1);

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V")
    public static void method447(int arg0) {
        field1246 = null;
        field1249 = null;
        field1242 = null;
        if (arg0 < 58) {
            return;
        }
        field1243 = null;
        field1238 = null;
        field1251 = null;
        field1253 = null;
        field1248 = null;
        field1250 = null;
        field1240 = null;
        field1239 = null;
        field1247 = null;
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(I)I")
    public abstract int method244(int arg0);

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method245(int arg0, Component arg1);

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(BLia;)[I")
    public static final int[] method448(byte arg0, class57 arg1) {
        int var2 = arg1.field1369 >> 16;
        field1245++;
        if (!class47.method338(116, var2)) {
            return null;
        }
        int var3 = arg1.field1433;
        if (arg0 < 112) {
            method447(-124);
        }
        int var4 = arg1.field1348;
        int var5 = arg1.field1443;
        while (var5 != -1) {
            class57 var7 = class24.field557[var2][var5 & 0xFFFF];
            var5 = var7.field1443;
            var4 += var7.field1348 - var7.field1380;
            var3 += var7.field1433 - var7.field1334;
        }
        return new int[] { var4, var3 };
    }
}
