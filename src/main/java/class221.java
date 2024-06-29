import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public abstract class class221 {

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "[B")
    public byte[] field3046 = new byte[5000];

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "I")
    public int field3050 = 0;

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "[F")
    public float[] field3048 = new float[5000];

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "[Ljava/lang/Object;")
    public Object[] field3053 = new Object[5000];

    @OriginalMember(owner = "client!ak", name = "k", descriptor = "I")
    public int field3056 = 0;

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "I")
    public volatile int field3049 = 0;

    @OriginalMember(owner = "client!ak", name = "l", descriptor = "I")
    public volatile int field3057 = 0;

    @OriginalMember(owner = "client!ak", name = "i", descriptor = "[I")
    public static int[] field3054 = new int[32];

    @OriginalMember(owner = "client!ak", name = "j", descriptor = "I")
    public static int field3055 = 0;

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "I")
    public static int field3047;

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "I")
    public static int field3051;

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "I")
    public static int field3052;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field3054[var1] = var0 - 1;
            var0 += var0;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)V", line = 14)
    public static void method1499(int arg0) {
        if (arg0 != 0) {
            field3052 = 45;
        }
        field3054 = null;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lpe;Z)V", line = 46)
    public static final void method1500(class391 arg0, boolean arg1) {
        field3051++;
        if (class94.field1369) {
            class22.method279(arg0, (byte) -52);
        } else {
            class412.method2554(arg0, (byte) -11);
        }
        if (!arg1) {
            method1499(-42);
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(II)V")
    public abstract void method1027(int arg0, int arg1);

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILdg;)V")
    public abstract void method1019(int arg0, class224 arg1);

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IFZILsa;)V")
    public abstract void method1018(int arg0, float arg1, boolean arg2, int arg3, class411 arg4);

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Ldg;I)V")
    public abstract void method1025(class224 arg0, int arg1);

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ZI)V")
    public abstract void method1026(boolean arg0, int arg1);

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)V")
    public abstract void method1028(byte arg0);

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(BLdg;)V")
    public abstract void method1021(byte arg0, class224 arg1);

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(B)V")
    public abstract void method1020(byte arg0);
}
