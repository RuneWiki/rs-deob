import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!g")
public class class10 {

    @OriginalMember(owner = "mapview!g", name = "b", descriptor = "Lw;")
    public static class38 field79 = class35.method219("Suchen", true);

    @OriginalMember(owner = "mapview!g", name = "g", descriptor = "I")
    public static int field84 = 0;

    @OriginalMember(owner = "mapview!g", name = "m", descriptor = "Lw;")
    public static class38 field90 = class35.method219("Loading )3)3)3", true);

    @OriginalMember(owner = "mapview!g", name = "e", descriptor = "Lw;")
    public static class38 field82 = class35.method219("General Store", true);

    @OriginalMember(owner = "mapview!g", name = "f", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "mapview!g", name = "h", descriptor = "I")
    public static int field85;

    @OriginalMember(owner = "mapview!g", name = "i", descriptor = "I")
    public static int field86;

    @OriginalMember(owner = "mapview!g", name = "j", descriptor = "I")
    public static int field87;

    @OriginalMember(owner = "mapview!g", name = "l", descriptor = "I")
    public static int field89;

    @OriginalMember(owner = "mapview!g", name = "d", descriptor = "J")
    public long field81;

    @OriginalMember(owner = "mapview!g", name = "c", descriptor = "Lg;")
    public class10 field80;

    @OriginalMember(owner = "mapview!g", name = "k", descriptor = "Lg;")
    public class10 field88;

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "Lu;")
    public static class36 field78;

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "(B)V", line = 5)
    public final void method46(byte arg0) {
        if (this.field88 == null) {
            return;
        }
        this.field88.field80 = this.field80;
        this.field80.field88 = this.field88;
        if (arg0 < -108) {
            this.field88 = null;
            this.field80 = null;
        }
    }

    @OriginalMember(owner = "mapview!g", name = "b", descriptor = "(B)V", line = 39)
    public static void method47(byte arg0) {
        field90 = null;
        field79 = null;
        if (arg0 < 118) {
            method48(-12, 97, null, -46);
        }
        field82 = null;
        field78 = null;
    }

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "(II[Lw;I)Lw;", line = 63)
    public static final class38 method48(int arg0, int arg1, class38[] arg2, int arg3) {
        int var4 = 0;
        for (int var5 = 0; var5 < arg1; var5++) {
            if (arg2[arg3 + var5] == null) {
                arg2[arg3 + var5] = class3.field12;
            }
            var4 += arg2[arg3 + var5].field502;
        }
        if (arg0 != 32692) {
            field86 = -80;
        }
        byte[] var6 = new byte[var4];
        int var7 = 0;
        for (int var8 = 0; var8 < arg1; var8++) {
            class38 var9 = arg2[arg3 + var8];
            class2.method5(var9.field503, 0, var6, var7, var9.field502);
            var7 += var9.field502;
        }
        class38 var10 = new class38();
        var10.field503 = var6;
        var10.field502 = var4;
        return var10;
    }

    @OriginalMember(owner = "mapview!g", name = "c", descriptor = "(B)V", line = 113)
    public static final void method49(byte arg0) {
        class37 var1 = class9.field67;
        synchronized (class9.field67) {
            class5.field33 = class3.field20;
            class26.field362 = class34.field451;
            class32.field412 = class3.field19;
            class34.field444 = class4.field21;
            if (arg0 >= -59) {
                field87 = -12;
            }
            field84 = class26.field366;
            class23.field238 = class8.field58;
            class4.field21 = 0;
        }
    }
}
