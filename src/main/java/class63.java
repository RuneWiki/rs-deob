import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public abstract class class63 {

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "I")
    public int field1066;

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "I")
    public int field1064;

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "I")
    public int field1062;

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field1065 = new String[500];

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "[S")
    public static short[] field1068 = new short[256];

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "I")
    public static int field1059;

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "I")
    public static int field1060;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "I")
    public static int field1061;

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "I")
    public static int field1063;

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "I")
    public static int field1067;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(III)V")
    public abstract void method210(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z)V")
    public static void method428(boolean arg0) {
        field1065 = null;
        if (!arg0) {
            field1068 = null;
        }
        field1068 = null;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILab;I)Ljava/lang/String;")
    public static final String method429(int arg0, class249 arg1, int arg2) {
        field1067++;
        try {
            if (arg0 != -7582) {
                return null;
            }
            int var3 = arg1.method1819(arg0 ^ 0x67CC84CA);
            if (arg2 < var3) {
                var3 = arg2;
            }
            byte[] var4 = new byte[var3];
            arg1.field4160 += class196.field3166.method87(var3, 0, arg1.field4182, arg1.field4160, var4, (byte) 126);
            return class248.method1758(0, var3, 18532, var4);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IZI)V")
    public abstract void method216(int arg0, boolean arg1, int arg2);

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILhg;B)Ljava/lang/String;")
    public static final String method430(int arg0, class207 arg1, byte arg2) {
        if (arg2 > -110) {
            field1065 = null;
        }
        field1063++;
        if (!client.method732(arg1).method125(arg0, false) && arg1.field3391 == null) {
            return null;
        } else if (arg1.field3507 == null || arg0 >= arg1.field3507.length || arg1.field3507[arg0] == null || arg1.field3507[arg0].trim().length() == 0) {
            return class45.field701 ? "Hidden-" + arg0 : null;
        } else {
            return arg1.field3507[arg0];
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIB)V")
    public abstract void method214(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIII)V")
    public static final void method431(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1060++;
        class211.method1488(arg1, arg3, arg1 + arg4, arg0 + arg3);
        class211.method1483(arg1, arg3, arg4, arg0, 0);
        if (class171.field2773 < 100) {
            return;
        }
        int var5 = arg0;
        int var6 = arg4;
        float var7 = (float) class148.field2434 / (float) class148.field2436;
        if ((var7 < 1.0F)) {
            var5 = (int) ((float) arg4 * var7);
        } else {
            var6 = (int) ((float) arg0 / var7);
        }
        if (class203.field3247 == null || class203.field3247.field4564 != arg4 || class203.field3247.field4574 != arg0) {
            class92 var8 = new class92(arg4, arg0);
            class211.method1499(var8.field1516, arg4, arg0);
            if (class148.field2441.field3311 != -1) {
                class211.method1483(0, 0, arg4, arg0, class148.field2441.field3311);
            }
            class148.method1100(0, 0, class148.field2436, class148.field2434, 0, 0, var6, var5);
            class148.method1095();
            class203.field3247 = var8;
            class7.field152.method1016(arg2 - 27655);
        }
        int var9 = (arg4 - var6) / 2 + arg1;
        if (arg2 != 27910) {
            field1061 = 47;
        }
        int var10 = (arg0 - var5) / 2 + arg3;
        class203.field3247.method660(var9, var10);
        int var11 = class296.field4851 * var6 / class148.field2436 + var9;
        int var12 = class167.field2703 * var5 / class148.field2434 + var10;
        int var13 = class104.field1679 * var6 / class148.field2436;
        int var14 = 16711680;
        if (class43.field659 == 1) {
            var14 = 16777215;
        }
        int var15 = class250.field4233 * var5 / class148.field2434;
        class211.method1480(var11, var12, var13, var15, var14, 128);
        class211.method1477(var11, var12, var13, var15, var14);
        if (class118.field1984 <= 0) {
            return;
        }
        int var16;
        if (class146.field2401 <= 50) {
            var16 = class146.field2401 * 5;
        } else {
            var16 = 500 - class146.field2401 * 5;
        }
        for (class206 var17 = (class206) class148.field2439.method452(1576); var17 != null; var17 = (class206) class148.field2439.method448(631244930)) {
            class195 var18 = class22.method146((byte) -101, var17.field3327);
            if (class299.method2046(true, var18)) {
                if (class271.field4507 == var17.field3327) {
                    int var19 = var9 + (var17.field3324 * var6 / class148.field2436);
                    int var20 = var10 + (var17.field3313 * var5 / class148.field2434);
                    class211.method1480(var19 - 2, var20 - 2, 4, 4, 16776960, var16);
                } else if (class84.field1401 != -1 && class84.field1401 == var18.field3139) {
                    int var21 = var17.field3324 * var6 / class148.field2436 + var9;
                    int var22 = var10 + (var17.field3313 * var5 / class148.field2434);
                    class211.method1480(var21 - 2, var22 - 2, 4, 4, 16776960, var16);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)Lsg;")
    public static final class183 method432(int arg0) {
        field1059++;
        if (arg0 != 0) {
            method429(104, (class249) null, 36);
        }
        try {
            return new class60();
        } catch (Throwable var2) {
            try {
                return (class183) Class.forName("qc").getDeclaredConstructor().newInstance();
            } catch (Throwable var1) {
                return new class281();
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(III)V")
    public class63(int arg0, int arg1, int arg2) {
        this.field1066 = arg1;
        this.field1064 = arg2;
        this.field1062 = arg0;
    }
}
