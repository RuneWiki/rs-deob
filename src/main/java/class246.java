import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public abstract class class246 {

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "I")
    public static int field4043 = 0;

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "[I")
    public static int[] field4047 = new int[14];

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
    public static int field4040 = 0;

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "[I")
    public static int[] field4046 = new int[99];

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "I")
    public static int field4039;

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "I")
    public static int field4041;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "I")
    public static int field4042;

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "I")
    public static int field4045;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "Lvh;")
    public static class108 field4038;

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "Lcj;")
    public static class74 field4044;

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "Ljava/lang/String;")
    public static String field4048;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "[I")
    public static int[] field4037;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)[B")
    public abstract byte[] method1644(int arg0);

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIII)I")
    public static final int method1645(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = 41 % ((arg1 + 21) / 58);
        field4039++;
        int var6 = 65536 - class287.field4562[arg3 * 1024 / arg4] >> 1;
        return ((65536 - var6) * arg0 >> 16) + (arg2 * var6 >> 16);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V")
    public static void method1646(byte arg0) {
        field4037 = null;
        field4038 = null;
        field4044 = null;
        field4048 = null;
        field4046 = null;
        if (arg0 == 100) {
            field4047 = null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZILvh;III)V")
    public static final void method1647(boolean arg0, int arg1, class108 arg2, int arg3, int arg4, int arg5) {
        class286.field4533 = arg4;
        class146.field2484 = 1;
        if (arg5 != -11577) {
            method1646((byte) 123);
        }
        class268.field4330 = 10000;
        class169.field2791 = arg2;
        class122.field2151 = arg0;
        class90.field1588 = arg3;
        field4045++;
        class82.field1503 = arg1;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IJ)Ljava/lang/String;")
    public static final String method1648(int arg0, long arg1) {
        field4041++;
        class78.field1306.setTime(new Date(arg1));
        int var3 = class78.field1306.get(7);
        int var4 = -112 / ((arg0 - 41) / 34);
        int var5 = class78.field1306.get(5);
        int var6 = class78.field1306.get(2);
        int var7 = class78.field1306.get(1);
        int var8 = class78.field1306.get(11);
        int var9 = class78.field1306.get(12);
        int var10 = class78.field1306.get(13);
        return class152.field2539[var3 - 1] + ", " + var5 / 10 + var5 % 10 + "-" + class145.field2480[var6] + "-" + var7 + " " + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + ":" + var10 / 10 + var10 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I[B)V")
    public abstract void method1649(int arg0, byte[] arg1);

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field4046[var1] = var0 / 4;
        }
    }
}
