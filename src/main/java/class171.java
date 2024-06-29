import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public abstract class class171 {

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "I")
    public volatile int field2435 = 0;

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "I")
    public volatile int field2436 = 0;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "I")
    public int field2434 = 0;

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "[B")
    public byte[] field2438 = new byte[5000];

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "[F")
    public float[] field2433 = new float[5000];

    @OriginalMember(owner = "client!cd", name = "k", descriptor = "[Ljava/lang/Object;")
    public Object[] field2442 = new Object[5000];

    @OriginalMember(owner = "client!cd", name = "n", descriptor = "I")
    public int field2445 = 0;

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "J")
    public static long field2437 = 0L;

    @OriginalMember(owner = "client!cd", name = "l", descriptor = "Ltc;")
    public static class196 field2443 = new class196();

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
    public static int field2432;

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "I")
    public static int field2439;

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "I")
    public static int field2440;

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "I")
    public static int field2441;

    @OriginalMember(owner = "client!cd", name = "m", descriptor = "Lrb;")
    public static class197 field2444;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)V")
    public abstract void method1152(byte arg0);

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V")
    public abstract void method1153(int arg0);

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(B)V")
    public static void method1154(byte arg0) {
        if (arg0 != 34) {
            field2443 = null;
        }
        field2443 = null;
        field2444 = null;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILuk;)V")
    public abstract void method1155(int arg0, class142 arg1);

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lsm;ZBIF)V")
    public abstract void method1156(class156 arg0, boolean arg1, byte arg2, int arg3, float arg4);

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IB)V")
    public abstract void method1157(int arg0, byte arg1);

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Z)V")
    public static final void method1158(boolean arg0) {
        class308.field4230.method1826(((float) class326.field4453 * 0.1F + 0.7F) * class436.field6266);
        if (!arg0) {
            method1158(true);
        }
        field2439++;
        class308.field4230.method1814(class182.field2551, class83.field1272, class9.field135, (float) class412.field5970, (float) class64.field992, (float) class451.field6575);
        class308.field4230.method1756(class176.field2488);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Luk;I)V")
    public abstract void method1159(class142 arg0, int arg1);

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIII)I")
    public static final int method1160(int arg0, int arg1, int arg2, int arg3) {
        field2432++;
        if ((class221.field2910[arg0][arg1][arg2] & 0x8) != 0) {
            return 0;
        } else if (arg0 <= 0 || (class221.field2910[1][arg1][arg2] & 0x2) == 0) {
            return arg3 >= -52 ? -111 : arg0;
        } else {
            return arg0 - 1;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)V")
    public abstract void method1161(int arg0, int arg1);

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(BLuk;)V")
    public abstract void method1162(byte arg0, class142 arg1);

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(B)V")
    public static final void method1163(byte arg0) {
        if (arg0 != -52) {
            method1158(false);
        }
        class314.method1999();
        field2441++;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZI[I)V")
    public static final void method1164(boolean arg0, int arg1, int[] arg2) {
        if (arg0) {
            field2444 = null;
        }
        for (int var3 = 31; var3 > 0; var3--) {
            int var4 = var3 * 36;
            for (int var5 = 35; var5 > 0; var5--) {
                if (arg2[var4 + var5] == 0 && arg2[var5 - (-var4 - -1) - 36] != 0) {
                    arg2[var4 + var5] = arg1;
                }
            }
        }
        field2440++;
    }
}
