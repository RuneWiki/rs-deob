import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class197 {

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "I")
    public int field3290 = -1;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "Lok;")
    public static class146 field3282 = class235.method1724(-12908, ": ");

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "Lok;")
    public static class146 field3287 = class235.method1724(-12908, "welle2:");

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
    public static int field3276;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "I")
    public int field3277;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
    public static int field3278;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
    public int field3279;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
    public static int field3281;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "I")
    public int field3283;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "I")
    public int field3284;

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "I")
    public int field3285;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "I")
    public int field3286;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "I")
    public int field3288;

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "I")
    public int field3289;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "Lok;")
    public static class146 field3280;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZI)V", line = 8)
    public static final void method1519(boolean arg0, int arg1) {
        field3281++;
        class3.method9(-120);
        if (class238.field3973 != arg1 && class238.field3973 != 25) {
            return;
        }
        class115.field1850++;
        if (class115.field1850 < 50 && !arg0) {
            return;
        }
        class115.field1850 = 0;
        if (!class43.field745 && class98.field1582 != null) {
            class237.field3952++;
            class47.field820.method1656(41, arg1 - 14);
            try {
                class98.field1582.method279(127, 0, class47.field820.field857, class47.field820.field860);
                class47.field820.field857 = 0;
            } catch (IOException var3) {
                class43.field745 = true;
            }
        }
        class3.method9(-62);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)[Lje;", line = 57)
    public static final class70[] method1520(int arg0) {
        if (arg0 < 86) {
            return (class70[]) null;
        }
        field3276++;
        class70[] var1 = new class70[class241.field4004];
        for (int var2 = 0; var2 < class241.field4004; var2++) {
            int var3 = class238.field3967[var2] * class150.field2562[var2];
            int[] var4 = new int[var3];
            byte[] var5 = class17.field353[var2];
            for (int var6 = 0; var6 < var3; var6++) {
                var4[var6] = class94.field1514[class82.method582(255, var5[var6])];
            }
            if (class271.field4640) {
                var1[var2] = new class8(class177.field3006, class242.field4027, class226.field3776[var2], class23.field424[var2], class238.field3967[var2], class150.field2562[var2], var4);
            } else {
                var1[var2] = new class307(class177.field3006, class242.field4027, class226.field3776[var2], class23.field424[var2], class238.field3967[var2], class150.field2562[var2], var4);
            }
        }
        class301.method2122((byte) 0);
        return var1;
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)V", line = 103)
    public static final void method1521(int arg0) {
        field3278++;
        if (arg0 == 255) {
            class311.field5304.method793((byte) -111);
            class13.field244.method793((byte) -69);
            class200.field3344.method793((byte) -105);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Z)V", line = 117)
    public static void method1522(boolean arg0) {
        field3287 = null;
        field3282 = null;
        if (!arg0) {
            method1521(-87);
        }
        field3280 = null;
    }
}
