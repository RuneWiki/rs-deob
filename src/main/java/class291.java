import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public class class291 {

    @OriginalMember(owner = "client!dr", name = "d", descriptor = "Lad;")
    private class11 field3722 = new class11(64);

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "Ldn;")
    private class201 field3720;

    @OriginalMember(owner = "client!dr", name = "g", descriptor = "Ldn;")
    private class201 field3725;

    @OriginalMember(owner = "client!dr", name = "c", descriptor = "I")
    public static int field3721 = -1;

    @OriginalMember(owner = "client!dr", name = "i", descriptor = "Z")
    public static boolean field3727 = false;

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "I")
    public static int field3719;

    @OriginalMember(owner = "client!dr", name = "e", descriptor = "I")
    public static int field3723;

    @OriginalMember(owner = "client!dr", name = "f", descriptor = "I")
    public static int field3724;

    @OriginalMember(owner = "client!dr", name = "h", descriptor = "I")
    public static int field3726;

    @OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(ILdn;Ldn;)V")
    public class291(int arg0, class201 arg1, class201 arg2) {
        this.field3720 = arg2;
        this.field3725 = arg1;
        if (this.field3725 != null) {
            this.field3725.method1302(-124, 0);
        }
        if (this.field3720 != null) {
            this.field3720.method1302(-89, 0);
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IB)Lnk;")
    public final class306 method1757(int arg0, byte arg1) {
        field3723++;
        int var3 = -94 % ((arg1 - 24) / 39);
        class306 var4 = (class306) this.field3722.method78((long) arg0, (byte) -109);
        if (var4 != null) {
            return var4;
        }
        byte[] var5;
        if (arg0 < 32768) {
            var5 = this.field3725.method1313((byte) -100, 0, arg0);
        } else {
            var5 = this.field3720.method1313((byte) -110, 0, arg0 & 0x7FFF);
        }
        class306 var6 = new class306();
        if (var5 != null) {
            var6.method1827(new class88(var5), -12697);
        }
        if (arg0 >= 32768) {
            var6.method1826((byte) -28);
        }
        this.field3722.method88((long) arg0, 117, var6);
        return var6;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method1758(int arg0, String arg1) {
        field3726++;
        int var2 = arg1.length();
        if (arg0 != 7638) {
            return null;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            char var8 = arg1.charAt(var4);
            if (var8 == '<' || var8 == '>') {
                var3 += 3;
            }
        }
        StringBuffer var5 = new StringBuffer(var2 + var3);
        for (int var6 = 0; var6 < var2; var6++) {
            char var7 = arg1.charAt(var6);
            if (var7 == '<') {
                var5.append("<lt>");
            } else if (var7 == '>') {
                var5.append("<gt>");
            } else {
                var5.append(var7);
            }
        }
        return var5.toString();
    }
}
