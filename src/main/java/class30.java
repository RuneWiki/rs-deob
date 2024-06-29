import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class30 extends class128 {

    @OriginalMember(owner = "client!na", name = "L", descriptor = "Ljava/lang/String;")
    public static String field437 = "Loading - please wait.";

    @OriginalMember(owner = "client!na", name = "O", descriptor = "I")
    public static int field440 = 0;

    @OriginalMember(owner = "client!na", name = "J", descriptor = "I")
    public static int field435 = 0;

    @OriginalMember(owner = "client!na", name = "T", descriptor = "I")
    public static int field445 = 0;

    @OriginalMember(owner = "client!na", name = "y", descriptor = "I")
    public int field425;

    @OriginalMember(owner = "client!na", name = "z", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!na", name = "B", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "client!na", name = "D", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!na", name = "E", descriptor = "I")
    public static int field430;

    @OriginalMember(owner = "client!na", name = "F", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "client!na", name = "G", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "client!na", name = "H", descriptor = "I")
    public static int field433;

    @OriginalMember(owner = "client!na", name = "I", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!na", name = "M", descriptor = "I")
    public int field438;

    @OriginalMember(owner = "client!na", name = "N", descriptor = "I")
    public static int field439;

    @OriginalMember(owner = "client!na", name = "P", descriptor = "I")
    public int field441;

    @OriginalMember(owner = "client!na", name = "R", descriptor = "I")
    public static int field443;

    @OriginalMember(owner = "client!na", name = "S", descriptor = "Lcg;")
    public static class49 field444;

    @OriginalMember(owner = "client!na", name = "K", descriptor = "Ljava/lang/String;")
    public String field436;

    @OriginalMember(owner = "client!na", name = "C", descriptor = "[I")
    public static int[] field428;

    @OriginalMember(owner = "client!na", name = "Q", descriptor = "[S")
    public static short[] field442;

    @OriginalMember(owner = "client!na", name = "d", descriptor = "(I)V", line = 5)
    public final void method276(int arg0) {
        this.field2214 = Long.MIN_VALUE & this.field2214 | class306.method2102(-289) + 500L;
        field433++;
        if (arg0 != 0) {
            field428 = (int[]) null;
        }
        class135.field2357.method851(this, (byte) -44);
    }

    @OriginalMember(owner = "client!na", name = "d", descriptor = "(Z)V", line = 18)
    public final void method277(boolean arg0) {
        this.field2214 |= Long.MIN_VALUE;
        if (arg0) {
            if (this.method281(90) == 0L) {
                class253.field4074.method851(this, (byte) -44);
            }
            field443++;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(B)I", line = 36)
    public final int method278(byte arg0) {
        if (arg0 == 124) {
            field429++;
            return (int) (this.field5062 >>> 32 & 0xFFL);
        } else {
            return -59;
        }
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(B)V", line = 61)
    public static void method279(byte arg0) {
        field442 = null;
        field428 = null;
        if (arg0 != -57) {
            field445 = -35;
        }
        field437 = null;
        field444 = null;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 76)
    public static final String method280(String arg0, int arg1) {
        int var2 = arg0.length();
        field430++;
        char[] var3 = new char[var2];
        byte var4 = 2;
        if (arg1 != -23587) {
            return (String) null;
        }
        for (int var5 = 0; var5 < var2; var5++) {
            char var6 = arg0.charAt(var5);
            if (var4 == 0) {
                var6 = Character.toLowerCase(var6);
            } else if (var4 == 2 || Character.isUpperCase(var6)) {
                var6 = class8.method57(var6, (byte) 111);
            }
            if (Character.isLetter(var6)) {
                var4 = 0;
            } else if (var6 == '.' || var6 == '?' || var6 == '!') {
                var4 = 2;
            } else if (!Character.isSpaceChar(var6)) {
                var4 = 1;
            } else if (var4 != 2) {
                var4 = 1;
            }
            var3[var5] = var6;
        }
        return new String(var3);
    }

    @OriginalMember(owner = "client!na", name = "e", descriptor = "(I)J", line = 129)
    public final long method281(int arg0) {
        field431++;
        return arg0 <= 46 ? -63L : this.field2214 & Long.MAX_VALUE;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lqe;I)V", line = 154)
    public static final void method282(class205 arg0, int arg1) {
        class261 var2 = (class261) class305.field4831.method732(class142.method1151(arg0.field3491, -94), true);
        if (arg1 != -1) {
            return;
        }
        if (var2 != null) {
            if (var2.field4229 != null) {
                class1.field9.method1839(var2.field4229);
                var2.field4229 = null;
            }
            var2.method2195(-1);
        }
        field439++;
    }

    @OriginalMember(owner = "client!na", name = "f", descriptor = "(I)I", line = 180)
    public final int method283(int arg0) {
        field426++;
        int var2 = -127 / ((arg0 + 37) / 48);
        return (int) this.field5062;
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "(II)V", line = 192)
    public class30(int arg0, int arg1) {
        this.field5062 = (long) arg0 << 32 | (long) arg1;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ILpi;)V", line = 201)
    public static final void method284(int arg0, class336 arg1) {
        if (arg0 != -28936) {
            return;
        }
        for (int var2 = 0; var2 < class316.field5009; var2++) {
            int var3 = arg1.method2314((byte) -38);
            int var4 = arg1.method2339((byte) -46);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class13.field212[var3] != null) {
                class13.field212[var3].field5234 = var4;
            }
        }
        field427++;
    }
}
