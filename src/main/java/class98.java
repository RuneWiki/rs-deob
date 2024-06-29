import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class98 extends class28 {

    @OriginalMember(owner = "client!di", name = "p", descriptor = "I")
    public volatile int field1204 = -1;

    @OriginalMember(owner = "client!di", name = "n", descriptor = "Ljava/lang/String;")
    public volatile String field1202;

    @OriginalMember(owner = "client!di", name = "o", descriptor = "[[I")
    public static int[][] field1203 = new int[128][128];

    @OriginalMember(owner = "client!di", name = "j", descriptor = "I")
    public static int field1198;

    @OriginalMember(owner = "client!di", name = "k", descriptor = "I")
    public static int field1199;

    @OriginalMember(owner = "client!di", name = "m", descriptor = "I")
    public static int field1201;

    @OriginalMember(owner = "client!di", name = "l", descriptor = "Lpq;")
    public static class159 field1200;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V", line = 3)
    public static void method537(int arg0) {
        field1203 = null;
        if (arg0 > 89) {
            field1200 = null;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(JI)Ljava/lang/String;", line = 15)
    public static final String method538(long arg0, int arg1) {
        field1199++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        }
        if (arg1 <= 38) {
            field1203 = null;
        }
        if (arg0 % 37L == 0L) {
            return null;
        }
        int var3 = 0;
        long var4 = arg0;
        while (var4 != 0L) {
            var4 /= 37L;
            var3++;
        }
        StringBuffer var6 = new StringBuffer(var3);
        while (arg0 != 0L) {
            long var7 = arg0;
            arg0 /= 37L;
            var6.append(class327.field4768[(int) (var7 - (arg0 * 37L))]);
        }
        return var6.reverse().toString();
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(I)V", line = 57)
    public static final void method539(int arg0) {
        for (int var1 = 0; var1 < class645.field9140.length; var1++) {
            for (int var2 = 0; var2 < class645.field9140[0].length; var2++) {
                for (int var3 = 0; var3 < class645.field9140[0][0].length; var3++) {
                    class645.field9140[var1][var2][var3] = 0;
                }
            }
        }
        field1201++;
        if (arg0 != -5250) {
            field1203 = null;
        }
    }

    @OriginalMember(owner = "client!di", name = "c", descriptor = "(I)V", line = 96)
    public static final void method540(int arg0) {
        field1198++;
        class251.field3388 = -1;
        if (arg0 <= 26) {
            method538(80L, -106);
        }
        class436.field6025 = -1;
        class325.field4740 = 0;
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 115)
    public class98(String arg0) {
        this.field1202 = arg0;
    }
}
