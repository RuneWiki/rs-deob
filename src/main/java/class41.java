import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class41 {

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "Le;")
    public static class29 field953 = new class29(500);

    @OriginalMember(owner = "client!fe", name = "j", descriptor = "Lda;")
    public static class23 field955 = new class23();

    @OriginalMember(owner = "client!fe", name = "m", descriptor = "I")
    public static int field958 = 0;

    @OriginalMember(owner = "client!fe", name = "n", descriptor = "I")
    public static int field959 = 0;

    @OriginalMember(owner = "client!fe", name = "l", descriptor = "Lu;")
    public static class135 field957 = class87.method676((byte) -52, "oberen Rand der Webseite ausw-=hlen)3");

    @OriginalMember(owner = "client!fe", name = "q", descriptor = "[I")
    public static int[] field962 = new int[] { 1, 1, 1, 1 };

    @OriginalMember(owner = "client!fe", name = "o", descriptor = "Loe;")
    public static class102 field960 = new class102(4096);

    @OriginalMember(owner = "client!fe", name = "s", descriptor = "Lu;")
    private static class135 field964 = class87.method676((byte) -122, " million");

    @OriginalMember(owner = "client!fe", name = "r", descriptor = "Lu;")
    public static class135 field963 = class87.method676((byte) -48, "gr-Un:");

    @OriginalMember(owner = "client!fe", name = "u", descriptor = "Lu;")
    public static class135 field966 = field964;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
    public static int field946;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "I")
    public static int field948;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
    public static int field949;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "I")
    public static int field950;

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "J")
    public long field951;

    @OriginalMember(owner = "client!fe", name = "k", descriptor = "Lpe;")
    public static class109 field956;

    @OriginalMember(owner = "client!fe", name = "t", descriptor = "Lde;")
    public static class27 field965;

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "Lfe;")
    public class41 field952;

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "Lfe;")
    public class41 field954;

    @OriginalMember(owner = "client!fe", name = "p", descriptor = "Lic;")
    public static class59 field961;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
    public final void method302(int arg0) {
        field949++;
        if (this.field954 == null) {
            return;
        }
        this.field954.field952 = this.field952;
        this.field952.field954 = this.field954;
        this.field952 = null;
        if (arg0 != 4071) {
            method306(-2, -119);
        }
        this.field954 = null;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public static final void method303(byte arg0, Component arg1) {
        field950++;
        arg1.addMouseListener(class131.field3158);
        arg1.addMouseMotionListener(class131.field3158);
        arg1.addFocusListener(class131.field3158);
        int var2 = 57 % ((-arg0 - 58) / 53);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)Z")
    public final boolean method304(byte arg0) {
        field947++;
        if (this.field954 == null) {
            return false;
        } else {
            if (arg0 != 116) {
                method303((byte) 79, null);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)V")
    public static void method305(int arg0) {
        field960 = null;
        field956 = null;
        if (arg0 != 0) {
            return;
        }
        field955 = null;
        field957 = null;
        field963 = null;
        field961 = null;
        field962 = null;
        field966 = null;
        field953 = null;
        field964 = null;
        field965 = null;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)Lnd;")
    public static final class94 method306(int arg0, int arg1) {
        class94 var2 = (class94) class77.field1822.method239(9325, (long) arg1);
        field946++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class83.field1976.method324(0, arg1, 10);
        class94 var4 = new class94();
        var4.field2257 = arg1;
        if (var3 != null) {
            var4.method769(true, new class59(var3));
        }
        var4.method761((byte) -4);
        if (var4.field2268 != -1) {
            var4.method770(method306(-83, var4.field2268), true, method306(-108, var4.field2259));
        }
        if (!class68.field1667 && var4.field2234) {
            var4.field2284 = class106.field2561;
            var4.field2242 = null;
            var4.field2256 = null;
            var4.field2225 = 0;
        }
        if (arg0 > -64) {
            method305(1);
        }
        class77.field1822.method241(var4, 0, (long) arg1);
        return var4;
    }
}
