import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public abstract class class19 {

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
    public int field196 = 0;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
    public int field197 = 0;

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "[Ljava/lang/Object;")
    public Object[] field204 = new Object[5000];

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "[B")
    public byte[] field205 = new byte[5000];

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
    public volatile int field199 = 0;

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "[F")
    public float[] field201 = new float[5000];

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
    public volatile int field198 = 0;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "Z")
    public static boolean field200;

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "I")
    public static int field202;

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "I")
    public static int field203;

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!ia", name = "l", descriptor = "Lnl;")
    public static class435 field207;

    static {
        new class151("You are not currently in a clan channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes pas dans un canal de clan.", "No momento você não está em um canal de clã.");
        field200 = false;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V", line = 26)
    public static final void method133(int arg0) {
        class143.field1996 = 0;
        field202++;
        for (int var1 = 0; var1 < 2048; var1++) {
            class141.field1970[var1] = null;
            class418.field5783[var1] = 1;
        }
        if (arg0 != -10557) {
            field207 = null;
        }
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(I)V", line = 47)
    public static void method134(int arg0) {
        if (arg0 != 0) {
            field200 = false;
        }
        field207 = null;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IILkk;)Ljava/lang/String;", line = 57)
    public static final String method135(int arg0, int arg1, class161 arg2) {
        field203++;
        try {
            if (arg0 < 18) {
                field207 = null;
            }
            int var3 = arg2.method1133(0);
            if (arg1 < var3) {
                var3 = arg1;
            }
            byte[] var4 = new byte[var3];
            arg2.field2298 += class155.field2152.method522(0, var3, arg2.field2262, arg2.field2298, var4, 32);
            return class388.method2357(var4, var3, 0, -28860);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZBLjava/lang/String;ZLjava/lang/String;IJIIII)V", line = 96)
    public static final void method140(boolean arg0, byte arg1, String arg2, boolean arg3, String arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        field206++;
        if (class205.field3005 || class303.field4310 >= 500) {
            return;
        }
        int var12 = arg10 == -1 ? class377.field5197 : arg10;
        class73 var13 = new class73(arg4, arg2, var12, arg7, arg9, arg6, arg5, arg8, arg3, arg0);
        class6.field38.method766(var13, -1);
        int var14 = -50 % ((63 - arg1) / 42);
        class303.field4310++;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lwr;B)V")
    public abstract void method131(class52 arg0, byte arg1);

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Z)V")
    public abstract void method132(boolean arg0);

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(I)V")
    public abstract void method136(int arg0);

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILwr;)V")
    public abstract void method137(int arg0, class52 arg1);

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IB)V")
    public abstract void method138(int arg0, byte arg1);

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lwr;I)V")
    public abstract void method139(class52 arg0, int arg1);

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(FIZLij;B)V")
    public abstract void method141(float arg0, int arg1, boolean arg2, class241 arg3, byte arg4);

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(BI)V")
    public abstract void method142(byte arg0, int arg1);
}
