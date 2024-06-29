import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class19 {

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "I")
    public int field167 = 0;

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "Z")
    public static boolean field166 = false;

    @OriginalMember(owner = "client!qo", name = "d", descriptor = "[I")
    public static int[] field169 = new int[50];

    @OriginalMember(owner = "client!qo", name = "c", descriptor = "Lsr;")
    public static class167 field168 = new class167();

    @OriginalMember(owner = "client!qo", name = "i", descriptor = "[I")
    public static int[] field174 = new int[1000];

    @OriginalMember(owner = "client!qo", name = "e", descriptor = "I")
    public static int field170;

    @OriginalMember(owner = "client!qo", name = "f", descriptor = "I")
    public static int field171;

    @OriginalMember(owner = "client!qo", name = "g", descriptor = "I")
    public static int field172;

    @OriginalMember(owner = "client!qo", name = "h", descriptor = "I")
    public static int field173;

    @OriginalMember(owner = "client!qo", name = "j", descriptor = "I")
    public static int field175;

    @OriginalMember(owner = "client!qo", name = "k", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(ILza;)V", line = 4)
    public static final void method105(int arg0, class287 arg1) {
        if (arg0 != 5) {
            method111(-108, (byte) 121);
        }
        field172++;
        if (class102.field1392 != class96.field1170.field3695 && class186.field2421 != null && class509.method3041(arg1, class96.field1170.field3695, 2)) {
            class102.field1392 = class96.field1170.field3695;
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(B)V", line = 26)
    public static void method106(byte arg0) {
        field169 = null;
        field174 = null;
        field168 = null;
        if (arg0 != 112) {
            method105(112, null);
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lug;B)V", line = 39)
    public final void method107(class396 arg0, byte arg1) {
        field173++;
        if (arg1 >= -99) {
            field168 = null;
        }
        while (true) {
            int var3 = arg0.method2388((byte) -121);
            if (var3 == 0) {
                return;
            }
            this.method109(arg0, false, var3);
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(ZII)Ljk;", line = 65)
    public static final class450 method108(boolean arg0, int arg1, int arg2) {
        field170++;
        class450 var3 = class406.method2490((byte) -116, arg1);
        if (!arg0) {
            method105(17, null);
        }
        if (arg2 == -1) {
            return var3;
        } else if (var3 == null || var3.field6643 == null || var3.field6643.length <= arg2) {
            return null;
        } else {
            return var3.field6643[arg2];
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lug;ZI)V", line = 90)
    private final void method109(class396 arg0, boolean arg1, int arg2) {
        field171++;
        if (arg1) {
            method106((byte) -100);
        }
        if (arg2 == 5) {
            this.field167 = arg0.method2386(-23648);
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(I)V", line = 120)
    public static final void method110(int arg0) {
        class49[] var1 = class195.field2519;
        synchronized (class195.field2519) {
            int var2 = arg0;
            while (true) {
                if (var2 >= class195.field2519.length) {
                    break;
                }
                class195.field2519[var2] = new class49();
                class381.field5513[var2] = 0;
                var2++;
            }
        }
        field176++;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IB)V", line = 142)
    public static final void method111(int arg0, byte arg1) {
        class178.field2308 = -1;
        field175++;
        class163.field2133 = arg0;
        class178.field2308 = -1;
        class104.method631((byte) 31);
        int var2 = 65 % ((arg1 + 25) / 60);
    }
}
