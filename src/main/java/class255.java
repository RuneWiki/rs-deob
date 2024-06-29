import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class255 {

    @OriginalMember(owner = "client!md", name = "c", descriptor = "I")
    public int field4426 = 0;

    @OriginalMember(owner = "client!md", name = "f", descriptor = "Z")
    public boolean field4429 = false;

    @OriginalMember(owner = "client!md", name = "g", descriptor = "I")
    public int field4430 = 0;

    @OriginalMember(owner = "client!md", name = "k", descriptor = "Lhe;")
    public static class94 field4434 = new class94(64);

    @OriginalMember(owner = "client!md", name = "n", descriptor = "Lsf;")
    private static class108 field4437 = class140.method973(255, "skill: ");

    @OriginalMember(owner = "client!md", name = "o", descriptor = "Lsf;")
    public static class108 field4438 = field4437;

    @OriginalMember(owner = "client!md", name = "q", descriptor = "[[I")
    public static int[][] field4440 = new int[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!md", name = "r", descriptor = "Lsf;")
    private static class108 field4441 = class140.method973(255, "Ok");

    @OriginalMember(owner = "client!md", name = "s", descriptor = "Lsf;")
    public static class108 field4442 = field4441;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "I")
    public static int field4424;

    @OriginalMember(owner = "client!md", name = "b", descriptor = "I")
    public static int field4425;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "I")
    public static int field4427;

    @OriginalMember(owner = "client!md", name = "e", descriptor = "I")
    public static int field4428;

    @OriginalMember(owner = "client!md", name = "h", descriptor = "I")
    public static int field4431;

    @OriginalMember(owner = "client!md", name = "l", descriptor = "I")
    public static int field4435;

    @OriginalMember(owner = "client!md", name = "m", descriptor = "I")
    public static int field4436;

    @OriginalMember(owner = "client!md", name = "t", descriptor = "I")
    public static int field4443;

    @OriginalMember(owner = "client!md", name = "i", descriptor = "Lnd;")
    public class319 field4432;

    @OriginalMember(owner = "client!md", name = "j", descriptor = "Ljava/nio/ByteBuffer;")
    public ByteBuffer field4433;

    @OriginalMember(owner = "client!md", name = "p", descriptor = "[[[I")
    public static int[][][] field4439;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(II)I", line = 6)
    public static final int method1796(int arg0, int arg1) {
        if (arg0 > -85) {
            method1796(-125, 111);
        }
        field4431++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V", line = 23)
    public static void method1797(int arg0) {
        field4439 = (int[][][]) null;
        field4440 = (int[][]) null;
        if (arg0 < 62) {
            method1796(-104, 45);
        }
        field4441 = null;
        field4437 = null;
        field4442 = null;
        field4434 = null;
        field4438 = null;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IBI)V", line = 40)
    public static final void method1798(int arg0, byte arg1, int arg2) {
        field4435++;
        int var3 = arg0--;
        if (var3 > 25) {
            var3 = 25;
        }
        int var4 = class26.field405[arg0];
        int var5 = class5.field66[arg0];
        if (arg2 == 0) {
            class256.field4471.method1427(184, 0);
            class281.field4921++;
            class256.field4471.method1759(-32768, var3 + var3 + 3);
        }
        if (arg2 == 1) {
            class256.field4471.method1427(250, 0);
            class256.field4471.method1759(-32768, var3 + var3 + 3 + 14);
            class75.field1155++;
        }
        if (arg2 == 2) {
            class256.field4471.method1427(225, 0);
            class256.field4471.method1759(-32768, var3 + var3 + 3);
            class219.field3900++;
        }
        class256.field4471.method1729(class305.field5295 + var5, arg1 ^ 0x1072);
        class256.field4471.method1724(false, class137.field2421 + var4);
        if (arg1 != 124) {
            field4442 = (class108) null;
        }
        class256.field4471.method1734(class144.field2529[82] ? 1 : 0, true);
        client.field4538 = class5.field66[0];
        class269.field4723 = class26.field405[0];
        for (int var6 = 1; var6 < var3; var6++) {
            arg0--;
            class256.field4471.method1734(class5.field66[arg0] - var5, true);
            class256.field4471.method1734(class26.field405[arg0] - var4, true);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Lik;Lik;B)V", line = 98)
    public static final void method1799(class262 arg0, class262 arg1, byte arg2) {
        field4424++;
        class159.field2862 = arg1;
        class101.field1779 = arg0;
        class137.field2423 = class159.field2862.method1876(3, (byte) -120);
        if (arg2 != 81) {
            method1798(-61, (byte) 4, -89);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Lik;ILsf;)Ldm;", line = 120)
    public static final class289 method1800(class262 arg0, int arg1, class108 arg2) {
        field4428++;
        if (arg1 > -95) {
            field4438 = (class108) null;
        }
        int var3 = arg0.method1887(-1, arg2);
        if (var3 == -1) {
            return new class289(0);
        }
        int[] var4 = arg0.method1889((byte) -111, var3);
        class289 var5 = new class289(var4.length);
        for (int var6 = 0; var6 < var5.field5053; var6++) {
            class249 var7 = new class249(arg0.method1868(12236, var3, var4[var6]));
            var5.field5064[var6] = var7.method1740(true);
            var5.field5062[var6] = var7.method1721((byte) 47);
            var5.field5058[var6] = (short) var7.method1712(-1);
            var5.field5063[var6] = (short) var7.method1712(-1);
            var5.field5055[var6] = var7.method1738(-1756395344);
        }
        return var5;
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(II)I", line = 176)
    public static final int method1801(int arg0, int arg1) {
        field4425++;
        return arg0 == 13391 ? arg1 & 0xFF : 54;
    }
}
