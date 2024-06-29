import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public class class46 extends RuntimeException {

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "Ljava/lang/String;")
    public String field527;

    @OriginalMember(owner = "client!pq", name = "d", descriptor = "Ljava/lang/Throwable;")
    public Throwable field529;

    @OriginalMember(owner = "client!pq", name = "e", descriptor = "I")
    public static int field530 = -1;

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "[Lfe;")
    public static class133[] field526;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(B)V", line = 4)
    public static void method268(byte arg0) {
        field526 = null;
        if (arg0 != -63) {
            method268((byte) 6);
        }
    }

    @OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 19)
    public class46(Throwable arg0, String arg1) {
        this.field527 = arg1;
        this.field529 = arg0;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Luo;I)V", line = 30)
    public static final void method269(class118 arg0, int arg1) {
        field528++;
        arg0.method774(0, 0, class39.field457, 350);
        arg0.method789(0, 0, class39.field457, 350, class264.field3386 << 24 | 0x332277, 1);
        int var2 = 0;
        if (arg1 != 30442) {
            method269((class118) null, 40);
        }
        while (var2 < 100) {
            int var13 = class228.field2883[var2];
            int var14 = class175.field2032[var2];
            arg0.method789(var13, var14, 2, 2, class296.field3951[var2] << 24 | 0xFFFFFF, 1);
            var2++;
        }
        int var3 = 350 / class368.field5021;
        if (class5.field36 > 0) {
            int var4 = 346 - class368.field5021 - 4;
            int var5 = var3 * var4 / (class5.field36 + var3 - 1);
            int var6 = 4;
            if (class5.field36 > 1) {
                var6 += (var4 - var5) * (class5.field36 - class278.field3592 - 1) / (class5.field36 - 1);
            }
            arg0.method789(class39.field457 - 16, var6, 12, var5, class264.field3386 << 24 | 0x332277, 2);
            for (int var7 = class278.field3592; var7 < class278.field3592 + var3 && var7 < class5.field36; var7++) {
                String[] var8 = class349.method2225(-11337, '\b', class431.field5878[var7]);
                int var9 = (class39.field457 - 8 - 16) / var8.length;
                for (int var10 = 0; var10 < var8.length; var10++) {
                    int var11 = (var9 * var10) + 8;
                    arg0.method774(var11, 0, var9 + var11 - 8, 350);
                    class55.field636.method206(-1, var11, 350 - class236.field3101.field4706 - class190.field2230 - ((-class278.field3592 + var7) * class368.field5021) - 2, -16777216, true, var8[var10]);
                }
            }
        }
        arg0.method774(0, 0, class39.field457, 350);
        arg0.method705((byte) 83, class39.field457, 350 - class190.field2230, 0, -1);
        class210.field2544.method206(-1, 10, 350 - class213.field2611.field4706 - 1, -16777216, true, "--> " + class342.field4668);
        int var12 = -1;
        if ((class106.field1273 % 30) > 15) {
            var12 = 16777215;
        }
        arg0.method754(12, var12, -125, 350 - class213.field2611.field4706 - 11, class213.field2611.method2203((byte) -105, "--> " + class342.field4668.substring(0, class286.field3774)) + 10);
    }
}
