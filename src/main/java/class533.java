import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class533 {

    @OriginalMember(owner = "client!de", name = "b", descriptor = "I")
    public static int field7664 = 0;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "Lada;")
    public static class164 field7665 = new class164();

    @OriginalMember(owner = "client!de", name = "g", descriptor = "J")
    public static long field7669 = 0L;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "I")
    public static int field7663;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "I")
    public static int field7666;

    @OriginalMember(owner = "client!de", name = "f", descriptor = "Lbba;")
    public static class115 field7668;

    @OriginalMember(owner = "client!de", name = "h", descriptor = "Lbl;")
    public static class652 field7670;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "[I")
    public static int[] field7667;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(B)V")
    public static void method3135(byte arg0) {
        field7670 = null;
        field7668 = null;
        if (arg0 != -124) {
            method3135((byte) -13);
        }
        field7667 = null;
        field7665 = null;
    }

    @OriginalMember(owner = "client!de", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field7666++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method3136(int arg0, String arg1) {
        field7663++;
        if (class146.field1946 == null) {
            class399.method2533((byte) -77);
        }
        if (arg0 < 116) {
            return;
        }
        class220.field3225.setTime(new Date(class524.method3075(18)));
        int var2 = class220.field3225.get(11);
        int var3 = class220.field3225.get(12);
        int var4 = class220.field3225.get(13);
        String var5 = Integer.toString(var2 / 10) + var2 % 10 + ":" + var3 / 10 + var3 % 10 + ":" + var4 / 10 + var4 % 10;
        String[] var6 = class258.method1684(3270, arg1, '\n');
        for (int var7 = 0; var7 < var6.length; var7++) {
            for (int var8 = class736.field10318; var8 > 0; var8--) {
                class146.field1946[var8] = class146.field1946[var8 - 1];
            }
            class146.field1946[0] = var5 + ": " + var6[var7];
            if (class754.field10532 != null) {
                try {
                    class754.field10532.write(class408.method2593(class146.field1946[0] + "\n", true));
                } catch (IOException var9) {
                }
            }
            if (class736.field10318 < class146.field1946.length - 1) {
                if (class692.field9564 > 0) {
                    class692.field9564++;
                }
                class736.field10318++;
            }
        }
    }
}
