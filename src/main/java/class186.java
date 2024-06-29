import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class186 extends class212 {

    @OriginalMember(owner = "client!ji", name = "S", descriptor = "Lqe;")
    public static class168 field3283 = class66.method448("(Udns", -114);

    @OriginalMember(owner = "client!ji", name = "R", descriptor = "Lqe;")
    public static class168 field3282 = class66.method448("", -123);

    @OriginalMember(owner = "client!ji", name = "P", descriptor = "Lqe;")
    public static class168 field3280 = class66.method448("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q", -111);

    @OriginalMember(owner = "client!ji", name = "U", descriptor = "Lqe;")
    private static class168 field3285 = class66.method448("", -111);

    @OriginalMember(owner = "client!ji", name = "M", descriptor = "Lqe;")
    public static class168 field3277 = field3285;

    @OriginalMember(owner = "client!ji", name = "T", descriptor = "B")
    public byte field3284;

    @OriginalMember(owner = "client!ji", name = "K", descriptor = "I")
    public static int field3275;

    @OriginalMember(owner = "client!ji", name = "L", descriptor = "I")
    public static int field3276;

    @OriginalMember(owner = "client!ji", name = "N", descriptor = "I")
    public static int field3278;

    @OriginalMember(owner = "client!ji", name = "O", descriptor = "I")
    public int field3279;

    @OriginalMember(owner = "client!ji", name = "Q", descriptor = "I")
    public static int field3281;

    @OriginalMember(owner = "client!ji", name = "I", descriptor = "Lrd;")
    public class207 field3274;

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(B)V")
    public static final void method1212(byte arg0) {
        class58.field794 = 0;
        field3278++;
        class84.field1278 = 0;
        class52.method373(52);
        class181.method1199((byte) 52);
        class81.method542(2047);
        class71.method485(4);
        int var1 = -14 % ((65 - arg0) / 59);
        for (int var2 = 0; var2 < class58.field794; var2++) {
            int var4 = class38.field518[var2];
            if (class133.field2326 != class104.field1677[var4].field165) {
                if (class104.field1677[var4].field1996 > 0) {
                    class94.method625(21734, class104.field1677[var4]);
                }
                class104.field1677[var4] = null;
            }
        }
        if (class31.field377 != class112.field1815.field1821) {
            throw new RuntimeException("gpp1 pos:" + class112.field1815.field1821 + " psize:" + class31.field377);
        }
        for (int var3 = 0; var3 < class132.field2322; var3++) {
            if (class104.field1677[class115.field1868[var3]] == null) {
                throw new RuntimeException("gpp2 pos:" + var3 + " size:" + class132.field2322);
            }
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(III)J")
    public static final long method1213(int arg0, int arg1, int arg2) {
        class177 var3 = class254.field4395[arg0][arg1][arg2];
        return var3 == null || var3.field3116 == null ? 0L : var3.field3116.field2769;
    }

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "(I)V")
    public static void method1214(int arg0) {
        int var1 = 99 / ((arg0 + 40) / 57);
        field3285 = null;
        field3277 = null;
        field3283 = null;
        field3282 = null;
        field3280 = null;
    }
}
