import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public abstract class class335 {

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "[Ljava/lang/Object;")
    public Object[] field4717 = new Object[5000];

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "I")
    public volatile int field4719 = 0;

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "I")
    public int field4722 = 0;

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "I")
    public volatile int field4723 = 0;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "[B")
    public byte[] field4718 = new byte[5000];

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "I")
    public int field4720 = 0;

    @OriginalMember(owner = "client!aa", name = "k", descriptor = "[F")
    public float[] field4725 = new float[5000];

    @OriginalMember(owner = "client!aa", name = "j", descriptor = "[I")
    public static int[] field4724 = new int[5];

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "Lri;")
    public static class73 field4716 = new class73(62, 4);

    @OriginalMember(owner = "client!aa", name = "l", descriptor = "Lri;")
    public static class73 field4726 = new class73(37, 6);

    @OriginalMember(owner = "client!aa", name = "n", descriptor = "Lki;")
    public static class498 field4728 = new class498(38, 11);

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
    public static int field4715;

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "I")
    public static int field4721;

    @OriginalMember(owner = "client!aa", name = "m", descriptor = "I")
    public static int field4727;

    @OriginalMember(owner = "client!aa", name = "o", descriptor = "Lbr;")
    public static class268 field4729;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 4)
    public static final int method2044(String arg0, int arg1) {
        field4727++;
        if (arg1 <= 54) {
            return 107;
        }
        for (int var2 = 0; var2 < class405.field6120.length; var2++) {
            if (class405.field6120[var2].equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZI)Lrp;", line = 27)
    public static final class299 method2045(boolean arg0, int arg1) {
        field4721++;
        class299 var2 = (class299) class342.field4908.method1536((long) arg1, 0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class365.field5581.method2945(1, arg1, arg0);
        class299 var4 = new class299();
        var4.field4255 = arg1;
        if (var3 != null) {
            var4.method1898(new class209(var3), (byte) 24);
        }
        var4.method1894(false);
        if (var4.field4239 == 2 && class447.field6664.method2605(false, (long) arg1) == null) {
            class447.field6664.method2606(new class427(class462.field6853), (long) arg1, 0);
            class219.field3222[class462.field6853++] = var4;
        }
        class342.field4908.method1542(var4, (byte) 112, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V", line = 83)
    public static void method2046(int arg0) {
        field4729 = null;
        if (arg0 == -1) {
            field4716 = null;
            field4724 = null;
            field4726 = null;
            field4728 = null;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IB)V")
    public abstract void method950(int arg0, byte arg1);

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(BFLna;IZ)V")
    public abstract void method951(byte arg0, float arg1, class35 arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZLfl;)V")
    public abstract void method943(boolean arg0, class518 arg1);

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)V")
    public abstract void method947(int arg0, int arg1);

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lfl;B)V")
    public abstract void method953(class518 arg0, byte arg1);

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)V")
    public abstract void method945(byte arg0);

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILfl;)V")
    public abstract void method946(int arg0, class518 arg1);

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)V")
    public abstract void method949(int arg0);
}
