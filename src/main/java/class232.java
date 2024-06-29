import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class232 extends class21 {

    @OriginalMember(owner = "client!hg", name = "Q", descriptor = "I")
    public static int field3638 = 0;

    @OriginalMember(owner = "client!hg", name = "T", descriptor = "[I")
    public static int[] field3641 = new int[128];

    @OriginalMember(owner = "client!hg", name = "N", descriptor = "I")
    public static int field3635;

    @OriginalMember(owner = "client!hg", name = "O", descriptor = "I")
    public static int field3636;

    @OriginalMember(owner = "client!hg", name = "P", descriptor = "I")
    public static int field3637;

    @OriginalMember(owner = "client!hg", name = "R", descriptor = "I")
    public static int field3639;

    @OriginalMember(owner = "client!hg", name = "U", descriptor = "I")
    public static int field3642;

    @OriginalMember(owner = "client!hg", name = "S", descriptor = "[S")
    public static short[] field3640;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(BII)I", line = 4)
    private final int method1533(byte arg0, int arg1, int arg2) {
        if (arg0 != 101) {
            method1534(true);
        }
        field3637++;
        int var4 = arg1 * 57 + arg2;
        int var5 = var4 ^ var4 << 1;
        return 4096 - (((var5 * 15731 * var5 + 789221) * var5 + 1376312589 & Integer.MAX_VALUE) / 262144);
    }

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "(Z)V", line = 27)
    public static void method1534(boolean arg0) {
        if (!arg0) {
            method1535(-69);
        }
        field3640 = null;
        field3641 = null;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(II)[I", line = 50)
    public final int[] method177(int arg0, int arg1) {
        field3642++;
        int[] var3 = this.field443.method1040(arg1, false);
        if (this.field443.field2637) {
            int var4 = class330.field5058[arg1];
            for (int var5 = 0; var5 < class294.field4489; var5++) {
                var3[var5] = this.method1533((byte) 101, var4, class51.field1027[var5]) % 4096;
            }
        }
        int var6 = 37 / ((arg0 - 33) / 36);
        return var3;
    }

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "(I)V", line = 77)
    public static final void method1535(int arg0) {
        class150.field2457 = 0;
        field3635++;
        class248.field3865 = 0;
        class291.method1956(-30716);
        class121.method782((byte) -96);
        class4.method58((byte) -16);
        for (int var1 = 0; var1 < class150.field2457; var1++) {
            int var2 = class109.field1870[var1];
            if (class25.field494 != class8.field179[var2].field1855) {
                if (class8.field179[var2].field3991.method334(false)) {
                    class134.method877(class8.field179[var2], 6033);
                }
                class8.field179[var2].method1713((byte) -77, (class44) null);
                class8.field179[var2] = null;
            }
        }
        if (class250.field3926 != class190.field3082.field3249) {
            throw new RuntimeException("gnp1 pos:" + class190.field3082.field3249 + " psize:" + class250.field3926);
        }
        for (int var3 = 0; var3 < class285.field4417; var3++) {
            if (class8.field179[class131.field2226[var3]] == null) {
                throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class285.field4417);
            }
        }
        if (arg0 != -11047) {
            field3641 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "()V", line = 127)
    public class232() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIII)Z", line = 133)
    public static final boolean method1536(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class333.field5110 * arg3 + class235.field3701 * arg0 >> 16;
        int var6 = class235.field3701 * arg3 - class333.field5110 * arg0 >> 16;
        int var7 = class159.field2599 * var6 + class136.field2288 * arg1 >> 16;
        int var8 = class159.field2599 * arg1 - class136.field2288 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class159.field2599 * var6 + class136.field2288 * arg2 >> 16;
        int var12 = class159.field2599 * arg2 - class136.field2288 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class39.field760 && var13 < class39.field760) {
            return false;
        } else if (var9 > class329.field5044 && var13 > class329.field5044) {
            return false;
        } else if (var10 < class191.field3095 && var14 < class191.field3095) {
            return false;
        } else {
            return var10 <= class343.field5334 || var14 <= class343.field5334;
        }
    }
}
