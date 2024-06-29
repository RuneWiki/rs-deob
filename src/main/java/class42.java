import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class42 {

    @OriginalMember(owner = "client!en", name = "a", descriptor = "Lcd;")
    public static class69 field554 = new class69(64);

    @OriginalMember(owner = "client!en", name = "e", descriptor = "I")
    public static int field558 = -1;

    @OriginalMember(owner = "client!en", name = "h", descriptor = "I")
    public static int field561 = 127;

    @OriginalMember(owner = "client!en", name = "i", descriptor = "I")
    public static int field562 = 0;

    @OriginalMember(owner = "client!en", name = "b", descriptor = "I")
    public static int field555;

    @OriginalMember(owner = "client!en", name = "c", descriptor = "I")
    public static int field556;

    @OriginalMember(owner = "client!en", name = "d", descriptor = "I")
    public static int field557;

    @OriginalMember(owner = "client!en", name = "g", descriptor = "I")
    public static int field560;

    @OriginalMember(owner = "client!en", name = "f", descriptor = "Ldm;")
    public static class289 field559;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(JI)Lsf;", line = 14)
    public static final class108 method277(long arg0, int arg1) {
        field557++;
        class295.field5152.setTime(new Date(arg0));
        int var3 = 78 % ((arg1 + 32) / 61);
        int var4 = class295.field5152.get(7);
        int var5 = class295.field5152.get(5);
        int var6 = class295.field5152.get(2);
        int var7 = class295.field5152.get(1);
        int var8 = class295.field5152.get(11);
        int var9 = class295.field5152.get(12);
        int var10 = class295.field5152.get(13);
        return class117.method833(new class108[] { class117.field2024[var4 - 1], class325.field5539, class79.method518(false, var5 / 10), class79.method518(false, var5 % 10), class321.field5498, class83.field1282[var6], class321.field5498, class79.method518(false, var7), class1.field6, class79.method518(false, var8 / 10), class79.method518(false, var8 % 10), class55.field806, class79.method518(false, var9 / 10), class79.method518(false, var9 % 10), class55.field806, class79.method518(false, var10 / 10), class79.method518(false, var10 % 10), class195.field3533 }, false);
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(I)V", line = 42)
    public static void method278(int arg0) {
        field554 = null;
        if (arg0 != 5) {
            field554 = (class69) null;
        }
        field559 = null;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(II)V", line = 59)
    public static final void method279(int arg0, int arg1) {
        class120 var2 = class248.method1704(2, 116, arg0);
        field555++;
        if (arg1 != -12514) {
            method278(-17);
        }
        var2.method843((byte) 28);
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(I)Lda;", line = 71)
    public static final class120 method280(int arg0) {
        field556++;
        class120 var1 = (class120) class249.field4339.method1778(-128);
        if (var1 != null) {
            var1.method1325(0);
            var1.method648(26562);
            return var1;
        } else if (arg0 <= 40) {
            return (class120) null;
        } else {
            class120 var2;
            do {
                var2 = (class120) class232.field4095.method1778(-126);
                if (var2 == null) {
                    return null;
                }
                if (var2.method840(-12905) > class118.method835(-1272)) {
                    return null;
                }
                var2.method1325(0);
                var2.method648(26562);
            } while ((Long.MIN_VALUE & var2.field1520) == 0L);
            return var2;
        }
    }
}
