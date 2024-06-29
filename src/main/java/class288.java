import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vea")
public class class288 {

    @OriginalMember(owner = "client!vea", name = "b", descriptor = "I")
    public int field4228;

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "I")
    public static int field4227;

    @OriginalMember(owner = "client!vea", name = "c", descriptor = "I")
    public static int field4229;

    @OriginalMember(owner = "client!vea", name = "e", descriptor = "I")
    public static int field4231;

    @OriginalMember(owner = "client!vea", name = "d", descriptor = "Lwia;")
    public static class791 field4230;

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(JI)Ljava/lang/String;")
    public static final String method1856(long arg0, int arg1) {
        field4231++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if ((arg0 % (long) arg1) == 0L) {
            return null;
        } else {
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
                var6.append(class256.field3767[(int) (var7 - (arg0 * 37L))]);
            }
            return var6.reverse().toString();
        }
    }

    @OriginalMember(owner = "client!vea", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4229++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(I)V")
    public static void method1857(int arg0) {
        field4230 = null;
        if (arg0 < 60) {
            method1856(-124L, -55);
        }
    }

    @OriginalMember(owner = "client!vea", name = "<init>", descriptor = "(I)V")
    public class288(int arg0) {
        this.field4228 = arg0;
    }
}
