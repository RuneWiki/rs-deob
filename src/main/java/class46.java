import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class46 extends class130 {

    @OriginalMember(owner = "client!eh", name = "r", descriptor = "I")
    public int field817 = -1;

    @OriginalMember(owner = "client!eh", name = "B", descriptor = "I")
    public int field827 = 0;

    @OriginalMember(owner = "client!eh", name = "v", descriptor = "I")
    public static int field821 = 0;

    @OriginalMember(owner = "client!eh", name = "D", descriptor = "I")
    public static int field829 = 0;

    @OriginalMember(owner = "client!eh", name = "w", descriptor = "[Lpf;")
    public static class141[] field822 = new class141[4];

    @OriginalMember(owner = "client!eh", name = "u", descriptor = "[I")
    public static int[] field820 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!eh", name = "H", descriptor = "[I")
    public static int[] field833 = new int[50];

    @OriginalMember(owner = "client!eh", name = "K", descriptor = "I")
    public static volatile int field836 = 0;

    @OriginalMember(owner = "client!eh", name = "s", descriptor = "I")
    public static int field818;

    @OriginalMember(owner = "client!eh", name = "t", descriptor = "I")
    public static int field819;

    @OriginalMember(owner = "client!eh", name = "x", descriptor = "I")
    public int field823;

    @OriginalMember(owner = "client!eh", name = "y", descriptor = "I")
    public int field824;

    @OriginalMember(owner = "client!eh", name = "z", descriptor = "I")
    public int field825;

    @OriginalMember(owner = "client!eh", name = "A", descriptor = "I")
    public int field826;

    @OriginalMember(owner = "client!eh", name = "C", descriptor = "I")
    public int field828;

    @OriginalMember(owner = "client!eh", name = "E", descriptor = "I")
    public int field830;

    @OriginalMember(owner = "client!eh", name = "F", descriptor = "I")
    public int field831;

    @OriginalMember(owner = "client!eh", name = "G", descriptor = "I")
    public int field832;

    @OriginalMember(owner = "client!eh", name = "I", descriptor = "I")
    public int field834;

    @OriginalMember(owner = "client!eh", name = "J", descriptor = "I")
    public int field835;

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "(I)[Lre;")
    public static final class158[] method347(int arg0) {
        field818++;
        class158[] var1 = new class158[class108.field2097];
        int var2 = 104 % ((-arg0 - 7) / 56);
        for (int var3 = 0; var3 < class108.field2097; var3++) {
            class158 var4 = new class158();
            var4.field3013 = class63.field1315;
            var4.field3011 = class98.field1870;
            var4.field3010 = class47.field884[var3];
            var4.field3015 = class82.field1664[var3];
            var4.field3012 = class41.field723[var3];
            var4.field3016 = class161.field3083[var3];
            byte[] var5 = class137.field2669[var3];
            int var6 = var4.field3016 * var4.field3012;
            var4.field3014 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                var4.field3014[var7] = class9.field176[class22.method151(255, var5[var7])];
            }
            var1[var3] = var4;
        }
        class102.method773(116);
        return var1;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lje;[BIB)V")
    public static final void method348(class86 arg0, byte[] arg1, int arg2, byte arg3) {
        int var4 = -62 / ((-arg3 - 18) / 59);
        field819++;
        class153 var5 = new class153();
        var5.field2953 = arg1;
        var5.field2541 = arg2;
        var5.field2948 = arg0;
        var5.field2946 = 0;
        class165 var6 = class137.field2671;
        synchronized (class137.field2671) {
            class137.field2671.method1112(-1250931468, var5);
        }
        class53.method387((byte) -63);
    }

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "(I)V")
    public static void method349(int arg0) {
        field822 = null;
        field820 = null;
        field833 = null;
        int var1 = -102 % ((25 - arg0) / 61);
    }
}
