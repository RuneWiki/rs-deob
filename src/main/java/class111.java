import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class111 extends class113 {

    @OriginalMember(owner = "client!md", name = "D", descriptor = "Lcd;")
    public static class23 field2343 = class54.method414("Spieler)3 Bitte w-=hlen Sie eine andere Welt)3", -1);

    @OriginalMember(owner = "client!md", name = "G", descriptor = "Lcd;")
    public static class23 field2346 = class54.method414("hitmarks", -1);

    @OriginalMember(owner = "client!md", name = "H", descriptor = "Lcd;")
    public static class23 field2347 = class54.method414(")1", -1);

    @OriginalMember(owner = "client!md", name = "L", descriptor = "Lcd;")
    public static class23 field2351 = class54.method414("Ihr Spielkonto wird bereits benutzt)3", -1);

    @OriginalMember(owner = "client!md", name = "I", descriptor = "Lsa;")
    public static class162 field2348 = new class162(50);

    @OriginalMember(owner = "client!md", name = "M", descriptor = "Lme;")
    public static class112 field2352 = new class112();

    @OriginalMember(owner = "client!md", name = "O", descriptor = "Lkg;")
    public static class96 field2354 = new class96(5000);

    @OriginalMember(owner = "client!md", name = "Q", descriptor = "I")
    public static int field2356 = 0;

    @OriginalMember(owner = "client!md", name = "R", descriptor = "Lcd;")
    private static class23 field2357 = class54.method414("skill)2", -1);

    @OriginalMember(owner = "client!md", name = "P", descriptor = "Lcd;")
    public static class23 field2355 = field2357;

    @OriginalMember(owner = "client!md", name = "J", descriptor = "B")
    public byte field2349;

    @OriginalMember(owner = "client!md", name = "E", descriptor = "I")
    public static int field2344;

    @OriginalMember(owner = "client!md", name = "F", descriptor = "I")
    public static int field2345;

    @OriginalMember(owner = "client!md", name = "K", descriptor = "I")
    public int field2350;

    @OriginalMember(owner = "client!md", name = "C", descriptor = "Lgd;")
    public class58 field2342;

    @OriginalMember(owner = "client!md", name = "N", descriptor = "[I")
    public static int[] field2353;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "(I)V")
    public static final void method715(int arg0) {
        if (class21.field429 == null || class48.field1151 == null) {
            class21.field429 = new int[256];
            class48.field1151 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class21.field429[var1] = (int) (Math.sin(var2) * 4096.0D);
                class48.field1151[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        if (arg0 != 4096) {
            field2346 = null;
        }
        field2344++;
    }

    @OriginalMember(owner = "client!md", name = "e", descriptor = "(I)V")
    public static void method716(int arg0) {
        field2353 = null;
        field2354 = null;
        field2351 = null;
        field2352 = null;
        field2355 = null;
        field2348 = null;
        field2347 = null;
        field2343 = null;
        field2357 = null;
        if (arg0 != 256) {
            field2357 = null;
        }
        field2346 = null;
    }

    @OriginalMember(owner = "client!md", name = "f", descriptor = "(I)V")
    public static final void method717(int arg0) {
        class115 var1 = (class115) class31.field665.method264(96);
        int var2 = -121 % ((arg0 - 63) / 59);
        while (var1 != null) {
            int var3 = var1.field2408;
            if (class82.method556(var3, (byte) -7)) {
                boolean var4 = true;
                class47[] var5 = class100.field2114[var3];
                for (int var6 = 0; var6 < var5.length; var6++) {
                    if (var5[var6] != null) {
                        var4 = var5[var6].field1027;
                        break;
                    }
                }
                if (!var4) {
                    int var7 = (int) var1.field3317;
                    class47 var8 = class113.method725((byte) 111, var7);
                    if (var8 != null) {
                        class3.method12(var8, false);
                    }
                }
            }
            var1 = (class115) class31.field665.method259(-16);
        }
        field2345++;
    }
}
