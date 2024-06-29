import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class40 {

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "[Lta;")
    private class254[] field620;

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "[I")
    public static int[] field616 = new int[100];

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "Lj;")
    public static class165 field614 = new class165();

    @OriginalMember(owner = "client!ok", name = "j", descriptor = "Lmb;")
    public static class160 field623 = new class160();

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
    public static int field615;

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "I")
    public static int field617;

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "I")
    public static int field618;

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "I")
    public static int field619;

    @OriginalMember(owner = "client!ok", name = "k", descriptor = "I")
    public static int field624;

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "Lfh;")
    public static class132 field621;

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "Lhg;")
    public static class177 field622;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(BLtg;)V")
    public static final void method229(byte arg0, class181 arg1) {
        field615++;
        class181 var2 = class8.method35(arg1, 0);
        if (arg0 < 119) {
            method229((byte) -39, (class181) null);
        }
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class150.field2629;
            var4 = class169.field2968;
        } else {
            var4 = var2.field3252;
            var3 = var2.field3270;
        }
        class166.method1204(arg1, var4, -1, false, var3);
        class161.method1163(-46, var4, var3, arg1);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lcf;IZ)V")
    public static final void method230(class93 arg0, int arg1, boolean arg2) {
        field618++;
        class93 var3 = arg0.method663(109);
        int var4 = arg2 ? 32768 : 0;
        int var5 = 0;
        if (arg1 > -61) {
            method230((class93) null, -33, true);
        }
        short[] var6 = new short[16];
        int var7 = var4 + (arg2 ? class248.field4465 : class37.field564);
        for (int var8 = var4; var8 < var7; var8++) {
            class63 var11 = class127.method928(var8, (byte) 18);
            if (var11.field1143 && var11.method410((byte) 94).method663(118).method652(var3, 9) != -1) {
                if (var5 >= 50) {
                    class254.field4596 = -1;
                    class230.field4122 = null;
                    return;
                }
                if (var5 >= var6.length) {
                    short[] var12 = new short[var6.length * 2];
                    for (int var13 = 0; var13 < var5; var13++) {
                        var12[var13] = var6[var13];
                    }
                    var6 = var12;
                }
                var6[var5++] = (short) var8;
            }
        }
        class254.field4596 = var5;
        client.field2720 = 0;
        class230.field4122 = var6;
        class93[] var9 = new class93[class254.field4596];
        for (int var10 = 0; var10 < class254.field4596; var10++) {
            var9[var10] = class127.method928(var6[var10], (byte) 18).method410((byte) 103);
        }
        class78.method538(-108, class230.field4122, var9);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Z)V")
    public static void method231(boolean arg0) {
        field616 = null;
        if (arg0) {
            field616 = null;
        }
        field623 = null;
        field614 = null;
        field622 = null;
        field621 = null;
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(I)V")
    public class40(int arg0) {
        this.field620 = new class254[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class254 var3 = this.field620[var2] = new class254();
            var3.field4595 = var3;
            var3.field4604 = var3;
        }
    }
}
