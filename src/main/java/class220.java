import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public abstract class class220 extends class408 {

    @OriginalMember(owner = "client!cu", name = "A", descriptor = "Z")
    public volatile boolean field3226 = true;

    @OriginalMember(owner = "client!cu", name = "z", descriptor = "Ljava/util/Calendar;")
    public static Calendar field3225 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!cu", name = "B", descriptor = "I")
    public static int field3227;

    @OriginalMember(owner = "client!cu", name = "E", descriptor = "I")
    public static int field3229;

    @OriginalMember(owner = "client!cu", name = "y", descriptor = "Z")
    public boolean field3224;

    @OriginalMember(owner = "client!cu", name = "D", descriptor = "Z")
    public boolean field3228;

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(I)I")
    public abstract int method1475(int arg0);

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(Z)[B")
    public abstract byte[] method1476(boolean arg0);

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "(B)V")
    public static void method1477(byte arg0) {
        field3225 = null;
        if (arg0 > -67) {
            field3225 = null;
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(JI)Ljava/lang/String;")
    public static final String method1478(long arg0, int arg1) {
        field3229++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if ((arg0 % 37L) == 0L) {
            return null;
        } else {
            if (arg1 > -122) {
                field3225 = null;
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
                char var9 = class313.field4435[(int) (var7 - (arg0 * 37L))];
                if (var9 == '_') {
                    int var10 = var6.length() - 1;
                    var9 = ' ';
                    var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                }
                var6.append(var9);
            }
            var6.reverse();
            var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
            return var6.toString();
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(IIIILiq;)V")
    public static final void method1479(int arg0, int arg1, int arg2, int arg3, class608 arg4) {
        class186 var5 = class467.method2834(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        arg4.field8423 = (arg1 << class459.field6769) + class631.field8819;
        arg4.field8421 = arg3;
        arg4.field8428 = (arg2 << class459.field6769) + class631.field8819;
        var5.field2845 = arg4;
        int var6 = class582.field8287 == class46.field568 ? 1 : 0;
        if (arg4.method320((byte) 84)) {
            if (arg4.method329((byte) 32)) {
                arg4.field8431 = class614.field8664[var6];
                class614.field8664[var6] = arg4;
                return;
            }
            arg4.field8431 = class577.field8153[var6];
            class577.field8153[var6] = arg4;
            class226.field3323 = true;
            return;
        }
        arg4.field8431 = class374.field5677[var6];
        class374.field5677[var6] = arg4;
    }
}
