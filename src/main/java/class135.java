import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public abstract class class135 {

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
    public static int field2313 = -1;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2317 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
    public static int field2318 = 0;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
    public static int field2314;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
    public static int field2315;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
    public static int field2316;

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "Lbn;")
    public static class75 field2319;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V", line = 5)
    public static final void method948(byte arg0) {
        field2315++;
        if (class278.field4540) {
            return;
        }
        if (arg0 != 79) {
            field2318 = -102;
        }
        if (class151.field2559) {
            class354.field5652 = (float) ((int) class354.field5652 + 191 & 0xFFFFFF80);
        } else {
            class336.field5344 += (24.0F - class336.field5344) / 2.0F;
        }
        class278.field4540 = true;
        class312.field5074 = true;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IBII)I", line = 30)
    public static final int method949(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 <= 45) {
            field2317 = (BigInteger) null;
        }
        int var4 = arg0 & 0x3;
        field2314++;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return arg3;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            return 7 - arg3;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lg;II)Ljava/lang/String;", line = 65)
    public static final String method950(class181 arg0, int arg1, int arg2) {
        field2316++;
        if (arg1 > -76) {
            return (String) null;
        } else if (!client.method1990(arg0).method2397(arg2, -93) && arg0.field3016 == null) {
            return null;
        } else if (arg0.field3144 == null || arg0.field3144.length <= arg2 || arg0.field3144[arg2] == null || arg0.field3144[arg2].trim().length() == 0) {
            return class323.field5230 ? "Hidden-" + arg2 : null;
        } else {
            return arg0.field3144[arg2];
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V", line = 92)
    public static void method951(int arg0) {
        field2319 = null;
        if (arg0 != -2) {
            field2319 = (class75) null;
        }
        field2317 = null;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(III)I")
    public abstract int method38(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)J")
    public abstract long method37(boolean arg0);

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(Z)V")
    public abstract void method39(boolean arg0);
}
