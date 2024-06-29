import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class24 {

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "I")
    public int field519;

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "I")
    public int field522;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
    public int field513;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "I")
    public int field516;

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "Lrd;")
    public static class173 field520 = class133.method843("und loggen sich dann erneut ein)3", 61);

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field512 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "[[I")
    public static int[][] field524 = new int[][] { { 1, 1 }, { -1, 1 }, { 1, -1 }, { -1, -1 } };

    @OriginalMember(owner = "client!cc", name = "n", descriptor = "I")
    public static int field525 = 0;

    @OriginalMember(owner = "client!cc", name = "p", descriptor = "Lrd;")
    public static class173 field527 = class133.method843("Okay", 73);

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "Lrd;")
    public static class173 field523 = class133.method843("title_mute", 19);

    @OriginalMember(owner = "client!cc", name = "o", descriptor = "Z")
    public static boolean field526 = false;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
    public static int field514;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "[Lsa;")
    public static class180[] field521;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lmb;I)Lhc;")
    public static final class73 method189(class121 arg0, int arg1) {
        field515++;
        int var2 = 6 / ((56 - arg1) / 58);
        return new class73(arg0.method782(true), arg0.method782(true), arg0.method782(true), arg0.method782(true), arg0.method782(true), arg0.method782(true), arg0.method782(true), arg0.method782(true), arg0.method780(16711680), arg0.method751((byte) -64));
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(III)V")
    public static final void method190(int arg0, int arg1, int arg2) {
        class105 var3 = class208.field4055[arg0][arg1][arg2];
        if (var3 != null) {
            var3.field1952 = null;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)V")
    public static final void method191(byte arg0) {
        class70.field1358.method1027(8);
        int var1 = class70.field1358.method1029(1, 0);
        field514++;
        if (var1 == 0) {
            return;
        }
        if (arg0 >= -40) {
            field527 = null;
        }
        int var2 = class70.field1358.method1029(2, 0);
        if (var2 == 0) {
            class4.field97[class36.field783++] = 2047;
        } else if (var2 == 1) {
            int var3 = class70.field1358.method1029(3, 0);
            class175.field3447.method975(-118, var3, false);
            int var4 = class70.field1358.method1029(1, 0);
            if (var4 == 1) {
                class4.field97[class36.field783++] = 2047;
            }
        } else if (var2 == 2) {
            int var5 = class70.field1358.method1029(3, 0);
            class175.field3447.method975(-73, var5, true);
            int var6 = class70.field1358.method1029(3, 0);
            class175.field3447.method975(-110, var6, true);
            int var7 = class70.field1358.method1029(1, 0);
            if (var7 == 1) {
                class4.field97[class36.field783++] = 2047;
            }
        } else if (var2 == 3) {
            class172.field3347 = class70.field1358.method1029(2, 0);
            int var8 = class70.field1358.method1029(7, 0);
            int var9 = class70.field1358.method1029(1, 0);
            int var10 = class70.field1358.method1029(1, 0);
            if (var10 == 1) {
                class4.field97[class36.field783++] = 2047;
            }
            int var11 = class70.field1358.method1029(7, 0);
            class175.field3447.method970(128, var9 == 1, var8, var11);
        }
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "()V")
    public class24() {
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V")
    public static void method192(int arg0) {
        field527 = null;
        field520 = null;
        if (arg0 <= -79) {
            field521 = null;
            field523 = null;
            field524 = null;
            field512 = null;
        }
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Lcc;)V")
    public class24(class24 arg0) {
        this.field519 = arg0.field519;
        this.field522 = arg0.field522;
        this.field513 = arg0.field513;
        this.field516 = arg0.field516;
    }
}
