import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class132 {

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "I")
    public static int field2226;

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "I")
    public static int field2227;

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "I")
    public static int field2228;

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "Lhh;")
    public static class204 field2229;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILok;Loh;)Lma;", line = 5)
    public static final class280 method980(int arg0, class146 arg1, class15 arg2) {
        field2226++;
        int var3 = arg2.method103(77, arg1);
        if (var3 == -1) {
            return new class280(0);
        }
        int[] var4 = arg2.method99(-4577, var3);
        class280 var5 = new class280(var4.length);
        int var6 = 30 / ((50 - arg0) / 58);
        for (int var7 = 0; var7 < var5.field4796; var7++) {
            class47 var8 = new class47(arg2.method92(var3, 0, var4[var7]));
            var5.field4805[var7] = var8.method337(-1);
            var5.field4794[var7] = var8.method352(255);
            var5.field4792[var7] = (short) var8.method379(-2);
            var5.field4793[var7] = (short) var8.method379(-2);
            var5.field4798[var7] = var8.method373((byte) 36);
        }
        return var5;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Loj;IB)V", line = 46)
    public static final void method981(class318 arg0, int arg1, byte arg2) {
        field2228++;
        if (arg2 <= 8) {
            field2229 = (class204) null;
        }
        if (class203.field3385 < arg0.field5414) {
            class87.method604(arg0, 1024);
        } else if (arg0.field5437 >= class203.field3385) {
            class236.method1727(127, arg0);
        } else {
            class192.method1489(arg0, 112);
        }
        if (arg0.field5409 < 128 || arg0.field5380 < 128 || arg0.field5409 >= 13184 || arg0.field5380 >= 13184) {
            arg0.field5437 = 0;
            arg0.field5408 = -1;
            arg0.field5414 = 0;
            arg0.field5441 = -1;
            arg0.field5409 = arg0.field5419[0] * 128 + (arg0.method1717(0) * 64);
            arg0.field5380 = arg0.field5432[0] * 128 + arg0.method1717(0) * 64;
            arg0.method2213(false);
        }
        if (class102.field1639 == arg0 && (arg0.field5409 < 1536 || arg0.field5380 < 1536 || arg0.field5409 >= 11776 || arg0.field5380 >= 11776)) {
            arg0.field5414 = 0;
            arg0.field5437 = 0;
            arg0.field5408 = -1;
            arg0.field5441 = -1;
            arg0.field5409 = arg0.field5419[0] * 128 + (arg0.method1717(0) * 64);
            arg0.field5380 = arg0.field5432[0] * 128 + (arg0.method1717(0) * 64);
            arg0.method2213(false);
        }
        class316.method2208(arg0, -102);
        class294.method2094(99, arg0);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V", line = 99)
    public static void method982(int arg0) {
        field2229 = null;
        if (arg0 < 8) {
            field2230 = 125;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IB)V", line = 119)
    public static final void method983(int arg0, byte arg1) {
        class138.field2299 = -1;
        class138.field2299 = -1;
        if (arg0 == 37) {
            class28.field491 = 3.0F;
        } else if (arg0 == 50) {
            class28.field491 = 4.0F;
        } else if (arg0 == 75) {
            class28.field491 = 6.0F;
        } else if (arg0 == 100) {
            class28.field491 = 8.0F;
        } else if (arg0 == 200) {
            class28.field491 = 16.0F;
        }
        if (arg1 == 96) {
            field2227++;
        }
    }
}
