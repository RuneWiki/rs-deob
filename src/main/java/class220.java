import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rga")
public class class220 {

    @OriginalMember(owner = "client!rga", name = "e", descriptor = "Ljq;")
    private class475 field3331;

    @OriginalMember(owner = "client!rga", name = "b", descriptor = "I")
    public int field3328;

    @OriginalMember(owner = "client!rga", name = "d", descriptor = "Lsb;")
    public static class266 field3330 = new class266(14, 16);

    @OriginalMember(owner = "client!rga", name = "j", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field3336 = new Rectangle[100];

    @OriginalMember(owner = "client!rga", name = "i", descriptor = "I")
    public static int field3335 = 0;

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "I")
    public static int field3327;

    @OriginalMember(owner = "client!rga", name = "c", descriptor = "I")
    public static int field3329;

    @OriginalMember(owner = "client!rga", name = "f", descriptor = "I")
    public static int field3332;

    @OriginalMember(owner = "client!rga", name = "g", descriptor = "Lom;")
    public static class344 field3333;

    @OriginalMember(owner = "client!rga", name = "h", descriptor = "Lf;")
    public static class702 field3334;

    @OriginalMember(owner = "client!rga", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field3329++;
        this.field3331.method2896((byte) -58, this.field3328);
        super.finalize();
    }

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(BII)V")
    public static final void method1523(byte arg0, int arg1, int arg2) {
        if (arg0 < -93) {
            field3327++;
            class19 var3 = class373.method2355(116, arg2, 13);
            var3.method432(69);
            var3.field829 = arg1;
        }
    }

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(JI)Ljava/lang/String;")
    public static final String method1524(long arg0, int arg1) {
        field3332++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if (arg0 % 37L == 0L) {
            return null;
        } else {
            int var3 = 0;
            for (long var4 = arg0; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg0 != 0L) {
                long var7 = arg0;
                arg0 /= 37L;
                char var9 = class481.field6910[(int) (var7 - (arg0 * 37L))];
                if (var9 == '_') {
                    int var10 = var6.length() - 1;
                    var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                    var9 = ' ';
                }
                var6.append(var9);
            }
            var6.reverse();
            var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
            if (arg1 != -6898) {
                method1525((byte) 104);
            }
            return var6.toString();
        }
    }

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(B)V")
    public static void method1525(byte arg0) {
        field3336 = null;
        int var1 = 58 % ((arg0 + 3) / 40);
        field3333 = null;
        field3330 = null;
        field3334 = null;
    }

    @OriginalMember(owner = "client!rga", name = "<init>", descriptor = "(Ljq;II)V")
    public class220(class475 arg0, int arg1, int arg2) {
        this.field3331 = arg0;
        this.field3328 = arg2;
    }
}
