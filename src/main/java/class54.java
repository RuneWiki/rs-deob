import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class54 implements Runnable {

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "Z")
    public boolean field744 = true;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "Ljava/lang/Object;")
    public Object field741 = new Object();

    @OriginalMember(owner = "client!nh", name = "n", descriptor = "I")
    public int field751 = 0;

    @OriginalMember(owner = "client!nh", name = "o", descriptor = "[I")
    public int[] field752 = new int[500];

    @OriginalMember(owner = "client!nh", name = "p", descriptor = "[I")
    public int[] field753 = new int[500];

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "Ljava/lang/String;")
    public static String field738 = "You can't add yourself to your own friend list.";

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "I")
    public static int field742 = 1;

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "Lrh;")
    public static class46 field743 = new class46();

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "I")
    public static int field745;

    @OriginalMember(owner = "client!nh", name = "i", descriptor = "I")
    public static int field746;

    @OriginalMember(owner = "client!nh", name = "j", descriptor = "I")
    public static int field747;

    @OriginalMember(owner = "client!nh", name = "k", descriptor = "I")
    public static int field748;

    @OriginalMember(owner = "client!nh", name = "l", descriptor = "I")
    public static int field749;

    @OriginalMember(owner = "client!nh", name = "m", descriptor = "I")
    public static int field750;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "Ldl;")
    public static class123 field740;

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "Ldf;")
    public static class55 field739;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(II)I")
    public static final int method390(int arg0, int arg1) {
        field746++;
        int var2 = arg0 & 0x3F;
        if (arg1 != -1) {
            field749 = 28;
        }
        int var3 = arg0 >> 6 & 0x3;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!nh", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field744) {
            Object var1 = this.field741;
            synchronized (this.field741) {
                if (this.field751 < 500) {
                    this.field752[this.field751] = class31.field416;
                    this.field753[this.field751] = class141.field2074;
                    this.field751++;
                }
            }
            class170.method1183(50L, (byte) 120);
        }
        field747++;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(BZLef;)V")
    public static final void method391(byte arg0, boolean arg1, class214 arg2) {
        field748++;
        int var3 = arg2.field3490 == 0 ? arg2.field3473 : arg2.field3490;
        int var4 = arg2.field3378 == 0 ? arg2.field3369 : arg2.field3378;
        if (arg0 <= 46) {
            field743 = null;
        }
        class176.method1229(arg2.field3474, var4, arg1, (byte) -14, var3, class104.field1608[arg2.field3474 >> 16]);
        if (arg2.field3357 != null) {
            class176.method1229(arg2.field3474, var4, arg1, (byte) -14, var3, arg2.field3357);
        }
        class35 var5 = (class35) class2.field22.method665((byte) 85, (long) arg2.field3474);
        if (var5 != null) {
            class74.method507(-1, arg1, var5.field456, var4, var3);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V")
    public static void method392(int arg0) {
        field743 = null;
        field739 = null;
        field738 = null;
        field740 = null;
        if (arg0 != -1) {
            method391((byte) 96, true, (class214) null);
        }
    }
}
