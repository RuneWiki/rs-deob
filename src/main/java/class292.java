import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public abstract class class292 {

    @OriginalMember(owner = "client!re", name = "a", descriptor = "Ljava/lang/String;")
    public static String field4576 = "white:";

    @OriginalMember(owner = "client!re", name = "i", descriptor = "I")
    public static int field4584 = 0;

    @OriginalMember(owner = "client!re", name = "f", descriptor = "I")
    public static int field4581 = 0;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "Ldh;")
    public static class179 field4579 = new class179(64);

    @OriginalMember(owner = "client!re", name = "j", descriptor = "Llb;")
    public static class224 field4585 = new class224(8);

    @OriginalMember(owner = "client!re", name = "b", descriptor = "I")
    public static int field4577;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "I")
    public static int field4580;

    @OriginalMember(owner = "client!re", name = "g", descriptor = "I")
    public static int field4582;

    @OriginalMember(owner = "client!re", name = "h", descriptor = "Llc;")
    public static class175 field4583;

    @OriginalMember(owner = "client!re", name = "m", descriptor = "Llc;")
    public static class175 field4588;

    @OriginalMember(owner = "client!re", name = "l", descriptor = "Laf;")
    public static class189 field4587;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "[I")
    public static int[] field4578;

    @OriginalMember(owner = "client!re", name = "k", descriptor = "[[[B")
    public static byte[][][] field4586;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V", line = 7)
    public static void method2076(int arg0) {
        field4583 = null;
        field4578 = null;
        field4585 = null;
        field4588 = null;
        field4587 = null;
        field4579 = null;
        if (arg0 == 8) {
            field4576 = null;
            field4586 = (byte[][][]) null;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(B)Z", line = 25)
    public static final boolean method2077(byte arg0) {
        field4577++;
        if (arg0 > -118) {
            method2079(-88, -17, 32, 106L);
        }
        if (class89.field1119) {
            try {
                class122.method824(class9.field131.field4179, 25315, "showVideoAd");
                return true;
            } catch (Throwable var2) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(I)V", line = 50)
    public static final void method2078(int arg0) {
        field4582++;
        if (arg0 != 8) {
            field4586 = (byte[][][]) ((byte[][][]) null);
        }
        class285.field4489.method1237((byte) -115);
        class264.field4165.method1237((byte) -91);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIJ)Z", line = 65)
    public static final boolean method2079(int arg0, int arg1, int arg2, long arg3) {
        class225 var5 = class158.field2184[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field3196 != null && var5.field3196.field2339 == arg3) {
            return true;
        } else if (var5.field3213 != null && var5.field3213.field656 == arg3) {
            return true;
        } else if (var5.field3209 != null && var5.field3209.field1937 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field3214; var6++) {
                if (var5.field3199[var6].field1026 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(BI)I", line = 98)
    public static final int method2080(byte arg0, int arg1) {
        field4580++;
        class161 var2 = class37.method221((byte) -124, arg1);
        int var3 = var2.field2223;
        int var4 = var2.field2211;
        int var5 = 27 % ((-arg0 - 50) / 54);
        int var6 = var2.field2218;
        int var7 = class42.field492[var6 - var4];
        return class226.field3235[var3] >> var4 & var7;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public abstract void method544(Component arg0, byte arg1);

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(I)I")
    public abstract int method546(int arg0);

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method545(int arg0, Component arg1);
}
