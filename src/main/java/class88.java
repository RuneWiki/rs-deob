import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class88 {

    @OriginalMember(owner = "client!hm", name = "l", descriptor = "Z")
    public boolean field1574 = true;

    @OriginalMember(owner = "client!hm", name = "i", descriptor = "I")
    public int field1571;

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "I")
    public int field1566;

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "I")
    public int field1564;

    @OriginalMember(owner = "client!hm", name = "h", descriptor = "I")
    public int field1570;

    @OriginalMember(owner = "client!hm", name = "f", descriptor = "I")
    public int field1568;

    @OriginalMember(owner = "client!hm", name = "m", descriptor = "I")
    public int field1575;

    @OriginalMember(owner = "client!hm", name = "g", descriptor = "S")
    public static short field1569 = 32767;

    @OriginalMember(owner = "client!hm", name = "e", descriptor = "I")
    public static int field1567 = 0;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "I")
    public static int field1563;

    @OriginalMember(owner = "client!hm", name = "j", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!hm", name = "k", descriptor = "I")
    public static int field1573;

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "Lum;")
    public static class222 field1565;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIZ[Lme;II)V", line = 12)
    public static final void method615(int arg0, int arg1, boolean arg2, class75[] arg3, int arg4, int arg5) {
        int var6 = 0;
        if (arg5 != -21299) {
            return;
        }
        while (arg3.length > var6) {
            class75 var7 = arg3[var6];
            if (var7 != null && var7.field1280 == arg0) {
                class187.method1291(var7, (byte) -7, arg4, arg1, arg2);
                class200.method1405(arg1, (byte) 44, var7, arg4);
                if ((var7.field1224 - var7.field1205) < var7.field1188) {
                    var7.field1188 = var7.field1224 - var7.field1205;
                }
                if (var7.field1188 < 0) {
                    var7.field1188 = 0;
                }
                if ((var7.field1220 - var7.field1216) < var7.field1146) {
                    var7.field1146 = var7.field1220 - var7.field1216;
                }
                if (var7.field1146 < 0) {
                    var7.field1146 = 0;
                }
                if (var7.field1184 == 0) {
                    class177.method1253((byte) -55, var7, arg2);
                }
            }
            var6++;
        }
        field1573++;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "()V", line = 60)
    public static final void method616() {
        if (class142.field2431 != null) {
            for (int var0 = 0; var0 < class142.field2431.length; var0++) {
                for (int var1 = 0; var1 < class89.field1605; var1++) {
                    for (int var2 = 0; var2 < class38.field658; var2++) {
                        class142.field2431[var0][var1][var2] = null;
                    }
                }
            }
        }
        class112.field2029 = (class108[][]) null;
        if (class238.field4139 != null) {
            for (int var3 = 0; var3 < class238.field4139.length; var3++) {
                for (int var4 = 0; var4 < class89.field1605; var4++) {
                    for (int var5 = 0; var5 < class38.field658; var5++) {
                        class238.field4139[var3][var4][var5] = null;
                    }
                }
            }
        }
        class260.field4439 = (class108[][]) null;
        class181.field3097 = 0;
        if (class171.field2952 != null) {
            for (int var6 = 0; var6 < class181.field3097; var6++) {
                class171.field2952[var6] = null;
            }
        }
        if (class164.field2878 != null) {
            for (int var7 = 0; var7 < class33.field491; var7++) {
                class164.field2878[var7] = null;
            }
            class33.field491 = 0;
        }
        if (class226.field3907 != null) {
            for (int var8 = 0; var8 < class226.field3907.length; var8++) {
                class226.field3907[var8] = null;
            }
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(B)V", line = 165)
    public static void method617(byte arg0) {
        if (arg0 != -38) {
            field1567 = 121;
        }
        field1565 = null;
    }

    @OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(IIIIIIZ)V", line = 208)
    public class88(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field1574 = arg6;
        this.field1571 = arg3;
        this.field1566 = arg1;
        this.field1564 = arg2;
        this.field1570 = arg5;
        this.field1568 = arg4;
        this.field1575 = arg0;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(I)V", line = 198)
    public static final void method618(int arg0) {
        field1572++;
        if (arg0 < 14) {
            method617((byte) -55);
        }
        class175.field3038.method2172(false);
    }
}
