import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class306 {

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "Z")
    public boolean field4582 = false;

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "[I")
    public static int[] field4587 = new int[32];

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "Lqc;")
    public static class99 field4589 = new class99(4);

    @OriginalMember(owner = "client!fd", name = "m", descriptor = "Lqc;")
    public static class99 field4591 = new class99(5);

    @OriginalMember(owner = "client!fd", name = "o", descriptor = "I")
    public static int field4593 = -1;

    @OriginalMember(owner = "client!fd", name = "n", descriptor = "[Z")
    public static boolean[] field4592 = new boolean[5];

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "I")
    public static int field4579;

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "I")
    public int field4581;

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "I")
    public int field4583;

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "I")
    public static int field4584;

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "I")
    public static int field4585;

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "I")
    public int field4588;

    @OriginalMember(owner = "client!fd", name = "l", descriptor = "I")
    public static int field4590;

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "J")
    public long field4580;

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "Ldn;")
    public class132 field4586;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZLjava/lang/String;C)I", line = 19)
    public static final int method2079(boolean arg0, String arg1, char arg2) {
        field4585++;
        int var3 = 0;
        int var4 = arg1.length();
        for (int var5 = 0; var5 < var4; var5++) {
            if (arg2 == arg1.charAt(var5)) {
                var3++;
            }
        }
        if (!arg0) {
            field4593 = 26;
        }
        return var3;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V", line = 46)
    public static void method2080(int arg0) {
        field4587 = null;
        field4591 = null;
        if (arg0 < 108) {
            field4592 = (boolean[]) null;
        }
        field4589 = null;
        field4592 = null;
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)Z", line = 64)
    public static final boolean method2081(int arg0) {
        field4579++;
        class207 var1 = class171.field2336;
        synchronized (class171.field2336) {
            if (class54.field731 == class248.field3570) {
                return false;
            }
            class44.field541 = class148.field2049[class54.field731];
            if (arg0 == 16989) {
                class124.field1673 = class148.field2055[class54.field731];
                class54.field731 = class54.field731 + 1 & 0x7F;
                return true;
            } else {
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(I)V", line = 87)
    public static final void method2082(int arg0) {
        class45.field549.method717((byte) 68);
        field4584++;
        if (arg0 != 5) {
            method2082(-63);
        }
    }
}
