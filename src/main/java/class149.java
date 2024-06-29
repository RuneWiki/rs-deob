import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public abstract class class149 {

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "[F")
    public float[] field2004 = new float[5000];

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "I")
    public volatile int field2007 = 0;

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "I")
    public int field2009 = 0;

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "[Ljava/lang/Object;")
    public Object[] field2008 = new Object[5000];

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "[B")
    public byte[] field2006 = new byte[5000];

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "I")
    public volatile int field2002 = 0;

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "I")
    public int field2005 = 0;

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "[Lgn;")
    public static class410[] field2003 = new class410[5];

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "I")
    public static int field2001 = 0;

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "I")
    public static int field2010;

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "I")
    public static int field2011;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(FLya;BIZ)V")
    public abstract void method906(float arg0, class223 arg1, byte arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lhd;[[BZ)V")
    public static final void method907(class242 arg0, byte[][] arg1, boolean arg2) {
        field2010++;
        int var3 = class402.field6047.length;
        int var4 = 0;
        if (arg2) {
            field2001 = -112;
        }
        while (var4 < var3) {
            byte[] var5 = arg1[var4];
            if (var5 != null) {
                int var6 = (class529.field7782[var4] >> 8) * 64 - class453.field7018;
                int var7 = (class529.field7782[var4] & 0xFF) * 64 - class126.field1718;
                class500.method3052(0);
                arg0.method1689(false, class352.field5488, var6, var7, class19.field198, var5);
            }
            var4++;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(II)V")
    public abstract void method908(int arg0, int arg1);

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(II)V")
    public abstract void method909(int arg0, int arg1);

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(BLce;)V")
    public abstract void method910(byte arg0, class409 arg1);

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILce;)V")
    public abstract void method911(int arg0, class409 arg1);

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(BLce;)V")
    public abstract void method912(byte arg0, class409 arg1);

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V")
    public abstract void method913(int arg0);

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)V")
    public static void method914(int arg0) {
        field2003 = null;
        if (arg0 != 0) {
            method907(null, null, false);
        }
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(I)V")
    public abstract void method915(int arg0);

    static {
        for (int var0 = 0; var0 < field2003.length; var0++) {
            field2003[var0] = new class410();
        }
    }
}
