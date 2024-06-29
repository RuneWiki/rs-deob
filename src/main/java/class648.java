import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nia")
public abstract class class648 {

    @OriginalMember(owner = "client!nia", name = "d", descriptor = "Lwu;")
    public class373 field9139;

    @OriginalMember(owner = "client!nia", name = "f", descriptor = "Lfa;")
    public static class235 field9141 = new class235(12, 0, 1, 0);

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "I")
    public static int field9136;

    @OriginalMember(owner = "client!nia", name = "b", descriptor = "I")
    public static int field9137;

    @OriginalMember(owner = "client!nia", name = "c", descriptor = "I")
    public static int field9138;

    @OriginalMember(owner = "client!nia", name = "e", descriptor = "I")
    public static int field9140;

    @OriginalMember(owner = "client!nia", name = "g", descriptor = "I")
    public static int field9142;

    @OriginalMember(owner = "client!nia", name = "h", descriptor = "I")
    public static int field9143;

    @OriginalMember(owner = "client!nia", name = "i", descriptor = "I")
    public static int field9144;

    @OriginalMember(owner = "client!nia", name = "j", descriptor = "I")
    public static int field9145;

    @OriginalMember(owner = "client!nia", name = "k", descriptor = "I")
    public static int field9146;

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(Z)V")
    public void method2630(boolean arg0) {
        if (!arg0) {
            this.method1448(false, 79);
        }
        field9138++;
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(B)V")
    public static final void method3767(byte arg0) {
        field9136++;
        class93.field1289.method809(true);
        if (arg0 != -73) {
            method3770(85);
        }
    }

    @OriginalMember(owner = "client!nia", name = "b", descriptor = "(Z)V")
    public void method2628(boolean arg0) {
        field9144++;
        if (!arg0) {
            this.field9139 = null;
        }
    }

    @OriginalMember(owner = "client!nia", name = "b", descriptor = "(B)V")
    public void method2629(byte arg0) {
        field9145++;
        if (arg0 != 6) {
            this.method1448(false, -76);
        }
    }

    @OriginalMember(owner = "client!nia", name = "<init>", descriptor = "(Lwu;)V")
    public class648(class373 arg0) {
        this.field9139 = arg0;
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(Lbca;II)V")
    public abstract void method1455(class663 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(ZI)V")
    public abstract void method1448(boolean arg0, int arg1);

    @OriginalMember(owner = "client!nia", name = "c", descriptor = "(Z)V")
    public void method2497(boolean arg0) {
        if (arg0) {
            method3768(-72);
        }
        field9137++;
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(I)Z")
    public static final boolean method3768(int arg0) {
        field9146++;
        if (class383.method2462((byte) 104, "jaclib")) {
            if (arg0 != 12) {
                field9141 = null;
            }
            return class383.method2462((byte) 61, "hw3d");
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nia", name = "d", descriptor = "(Z)V")
    public void method2498(boolean arg0) {
        field9143++;
        if (!arg0) {
            this.method2498(true);
        }
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(Ljava/lang/String;CILjava/lang/String;)Ljava/lang/String;")
    public static final String method3769(String arg0, char arg1, int arg2, String arg3) {
        field9140++;
        int var4 = arg3.length();
        int var5 = arg0.length();
        int var6 = var4;
        int var7 = arg2 + var5;
        if (var7 != 0) {
            int var8 = 0;
            while (true) {
                var8 = arg3.indexOf(arg1, var8);
                if (var8 < 0) {
                    break;
                }
                var6 += var7;
                var8++;
            }
        }
        StringBuffer var9 = new StringBuffer(var6);
        int var10 = 0;
        while (true) {
            int var11 = arg3.indexOf(arg1, var10);
            if (var11 < 0) {
                var9.append(arg3.substring(var10));
                return var9.toString();
            }
            var9.append(arg3.substring(var10, var11));
            var9.append(arg0);
            var10 = var11 + 1;
        }
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(BII)V")
    public abstract void method1453(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!nia", name = "b", descriptor = "(I)V")
    public static void method3770(int arg0) {
        field9141 = null;
        if (arg0 != 0) {
            field9141 = null;
        }
    }

    @OriginalMember(owner = "client!nia", name = "c", descriptor = "(I)Z")
    public abstract boolean method1449(int arg0);

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(ZZ)V")
    public abstract void method1451(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!nia", name = "e", descriptor = "(Z)V")
    public void method2631(boolean arg0) {
        if (!arg0) {
            this.method1448(true, -99);
        }
        field9142++;
    }

    @OriginalMember(owner = "client!nia", name = "d", descriptor = "(I)V")
    public abstract void method1450(int arg0);
}
