import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public abstract class class414 {

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "Lpi;")
    public static class342 field6180 = new class342("Loading interface scripts - ", "Lade Interface-Skripte - ", "Chargement des interfaces - ", "Carregando interfaces - ");

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "[I")
    public static int[] field6181 = new int[2];

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "I")
    public static int field6183 = 0;

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "[S")
    public static short[] field6184 = new short[] { 17, 4, 11, 9, 22, 12, 20, 30 };

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
    public static int field6177;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
    public static int field6178;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
    public static int field6179;

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "[Lf;")
    public static class529[] field6182;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V", line = 12)
    public static void method2506(byte arg0) {
        field6181 = null;
        field6182 = null;
        field6184 = null;
        int var1 = 49 % ((arg0 - 59) / 47);
        field6180 = null;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(BLcu;)V", line = 27)
    public static final void method2507(byte arg0, class145 arg1) {
        if (arg0 != 103) {
            field6182 = null;
        }
        field6178++;
        byte[] var2 = new byte[24];
        if (class1.field15 != null) {
            try {
                class1.field15.method753(0, 0L);
                class1.field15.method748((byte) 112, var2);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg1.method1076(24, -1, 0, var2);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(II[BI)[B", line = 73)
    public static final byte[] method2508(int arg0, int arg1, byte[] arg2, int arg3) {
        field6177++;
        if (arg1 < 55) {
            field6184 = null;
        }
        byte[] var4 = new byte[arg0];
        class73.method589(arg2, arg3, var4, 0, arg0);
        return var4;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZII)Ljava/lang/String;", line = 88)
    public static final String method2509(boolean arg0, int arg1, int arg2) {
        field6179++;
        if (arg0 && arg1 >= 0) {
            return arg2 == 12 ? class261.method1689(10, arg1, arg0, (byte) -71) : null;
        } else {
            return Integer.toString(arg1);
        }
    }

    @OriginalMember(owner = "client!ia", name = "YA", descriptor = "(I)V")
    public abstract void method874(int arg0);

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(I)V")
    public abstract void method865(int arg0);

    @OriginalMember(owner = "client!ia", name = "ba", descriptor = "(Lia;)V")
    public abstract void method866(class414 arg0);

    @OriginalMember(owner = "client!ia", name = "Q", descriptor = "(IIIIII)V")
    public abstract void method873(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ia", name = "O", descriptor = "(I)V")
    public abstract void method864(int arg0);

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(III[I)V")
    public abstract void method875(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "()Lia;")
    public abstract class414 method871();

    @OriginalMember(owner = "client!ia", name = "R", descriptor = "(III)V")
    public abstract void method868(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ia", name = "ZA", descriptor = "(III)V")
    public abstract void method876(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ia", name = "HA", descriptor = "()V")
    public abstract void method872();

    @OriginalMember(owner = "client!ia", name = "E", descriptor = "(III[I)V")
    public abstract void method877(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ia", name = "ma", descriptor = "(I)V")
    public abstract void method869(int arg0);

    @OriginalMember(owner = "client!ia", name = "X", descriptor = "([I)V")
    public abstract void method870(int[] arg0);

    @OriginalMember(owner = "client!ia", name = "na", descriptor = "(I)V")
    public abstract void method867(int arg0);
}
