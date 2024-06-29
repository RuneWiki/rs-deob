import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class94 {

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "Z")
    public boolean field1648 = false;

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "I")
    public static int field1651 = 0;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "[I")
    public static int[] field1650 = new int[14];

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "I")
    public int field1649;

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "I")
    public int field1654;

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "I")
    public int field1655;

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "I")
    public static int field1656;

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "J")
    public long field1652;

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "Lml;")
    public class152 field1653;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lqc;I)V", line = 5)
    public static final void method715(class6 arg0, int arg1) {
        field1656++;
        if (arg1 < 77) {
            method716(71);
        }
        int var2 = arg0.field172 - class267.field4371;
        int var3 = arg0.field183 * 128 + arg0.method49((byte) 126) * 64;
        int var4 = arg0.field187 * 128 + (arg0.method49((byte) 88) * 64);
        if (arg0.field151 == 0) {
            arg0.field144 = 1024;
        }
        if (arg0.field151 == 1) {
            arg0.field144 = 1536;
        }
        if (arg0.field151 == 2) {
            arg0.field144 = 0;
        }
        arg0.field121 = 0;
        arg0.field199 += (var3 - arg0.field199) / var2;
        if (arg0.field151 == 3) {
            arg0.field144 = 512;
        }
        arg0.field213 += (var4 - arg0.field213) / var2;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V", line = 38)
    public static void method716(int arg0) {
        if (arg0 <= -6) {
            field1650 = null;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIIII)V", line = 63)
    public static final void method717(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class308 var7 = new class308();
        var7.field5018 = arg1 / 128;
        var7.field5032 = arg2 / 128;
        var7.field5024 = arg3 / 128;
        var7.field5041 = arg4 / 128;
        var7.field5021 = arg0;
        var7.field5033 = arg1;
        var7.field5025 = arg2;
        var7.field5029 = arg3;
        var7.field5037 = arg4;
        var7.field5030 = arg5;
        var7.field5039 = arg6;
        class33.field736[class177.field2927++] = var7;
    }
}
