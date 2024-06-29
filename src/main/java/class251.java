import java.nio.ByteBuffer;
import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class251 {

    @OriginalMember(owner = "client!id", name = "g", descriptor = "I")
    public int field4197 = 0;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "Z")
    public boolean field4196 = false;

    @OriginalMember(owner = "client!id", name = "r", descriptor = "I")
    public int field4208 = 0;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "Ljava/util/Calendar;")
    public static Calendar field4192 = Calendar.getInstance();

    @OriginalMember(owner = "client!id", name = "i", descriptor = "Lce;")
    public static class126 field4199 = class206.method1445(-7923, "Hierhin gehen");

    @OriginalMember(owner = "client!id", name = "l", descriptor = "I")
    public static int field4202 = 0;

    @OriginalMember(owner = "client!id", name = "j", descriptor = "Lce;")
    public static class126 field4200 = class206.method1445(-7923, "Annuler");

    @OriginalMember(owner = "client!id", name = "h", descriptor = "I")
    public static int field4198 = 0;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "I")
    public static int field4195 = -1;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "I")
    public static int field4193;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "I")
    public static int field4194;

    @OriginalMember(owner = "client!id", name = "m", descriptor = "I")
    public static int field4203;

    @OriginalMember(owner = "client!id", name = "n", descriptor = "I")
    public static int field4204;

    @OriginalMember(owner = "client!id", name = "o", descriptor = "I")
    public static int field4205;

    @OriginalMember(owner = "client!id", name = "q", descriptor = "I")
    public static int field4207;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "Lgb;")
    public class83 field4191;

    @OriginalMember(owner = "client!id", name = "k", descriptor = "Ljava/lang/String;")
    public static String field4201;

    @OriginalMember(owner = "client!id", name = "p", descriptor = "Ljava/nio/ByteBuffer;")
    public ByteBuffer field4206;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ZIIIII)V", line = 10)
    public static final void method1697(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4204++;
        int var6 = class94.method645(class197.field3372, 0, arg4, class194.field3302);
        if (arg0) {
            method1700(75, 40, -29, 19, 59);
        }
        int var7 = class94.method645(class197.field3372, 0, arg3, class194.field3302);
        int var8 = class94.method645(class321.field5489, 0, arg2, class52.field795);
        int var9 = class94.method645(class321.field5489, 0, arg1, class52.field795);
        for (int var10 = var6; var10 <= var7; var10++) {
            class94.method647(class314.field5393[var10], var8, -7, var9, arg5);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ILcc;)V", line = 58)
    public static final void method1698(int arg0, class313 arg1) {
        class234.field3952 = arg1;
        field4193++;
        if (arg0 != 0) {
            method1698(-52, (class313) null);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(II)V", line = 74)
    public static final void method1699(int arg0, int arg1) {
        int var2 = -97 / ((44 - arg1) / 59);
        class37.field546.method1175(true, arg0);
        field4203++;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIII)V", line = 87)
    public static final void method1700(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 <= 43) {
            method1699(-53, 18);
        }
        if (arg3 > arg2) {
            for (int var5 = arg2; var5 < arg3; var5++) {
                class314.field5393[var5][arg1] = arg4;
            }
        } else {
            for (int var6 = arg3; var6 < arg2; var6++) {
                class314.field5393[var6][arg1] = arg4;
            }
        }
        field4194++;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(B)V", line = 144)
    public static final void method1701(byte arg0) {
        int var1 = 48 % ((arg0 + 35) / 61);
        field4205++;
        class151.field2764.method1629(0);
        class242.field4104.method1301(-128);
        class32.field473.method1301(-114);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V", line = 161)
    public static void method1702(int arg0) {
        field4201 = null;
        field4199 = null;
        field4200 = null;
        field4192 = null;
        if (arg0 != -1) {
            field4200 = (class126) null;
        }
    }
}
