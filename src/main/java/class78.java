import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class class78 {

    @OriginalMember(owner = "client!lr", name = "g", descriptor = "Z")
    public boolean field1176 = false;

    @OriginalMember(owner = "client!lr", name = "c", descriptor = "Lfn;")
    public static class52 field1172 = new class52(55, 8);

    @OriginalMember(owner = "client!lr", name = "k", descriptor = "[[B")
    public static byte[][] field1180 = new byte[50][];

    @OriginalMember(owner = "client!lr", name = "n", descriptor = "Lcs;")
    public static class351 field1183 = new class351(51, 4);

    @OriginalMember(owner = "client!lr", name = "p", descriptor = "Z")
    public static boolean field1185 = false;

    @OriginalMember(owner = "client!lr", name = "o", descriptor = "Lsq;")
    public static class454 field1184 = new class454(16);

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "I")
    public static int field1170;

    @OriginalMember(owner = "client!lr", name = "d", descriptor = "I")
    public static int field1173;

    @OriginalMember(owner = "client!lr", name = "e", descriptor = "I")
    public static int field1174;

    @OriginalMember(owner = "client!lr", name = "f", descriptor = "I")
    public int field1175;

    @OriginalMember(owner = "client!lr", name = "h", descriptor = "I")
    public static int field1177;

    @OriginalMember(owner = "client!lr", name = "i", descriptor = "I")
    public int field1178;

    @OriginalMember(owner = "client!lr", name = "j", descriptor = "I")
    public static int field1179;

    @OriginalMember(owner = "client!lr", name = "m", descriptor = "I")
    public static int field1182;

    @OriginalMember(owner = "client!lr", name = "l", descriptor = "Laq;")
    public static class385 field1181;

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "Lpp;")
    public class48 field1171;

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(B)Z", line = 3)
    public final boolean method535(byte arg0) {
        field1170++;
        if (arg0 != -43) {
            this.method535((byte) 102);
        }
        return this.field1171.field775.method2034(this.field1175, -28758);
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(I)V", line = 16)
    public static void method536(int arg0) {
        field1183 = null;
        field1184 = null;
        if (arg0 != -1) {
            method536(99);
        }
        field1180 = null;
        field1172 = null;
        field1181 = null;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIZLkm;)Laq;", line = 37)
    public final class385 method537(int arg0, int arg1, boolean arg2, class487 arg3) {
        field1177++;
        long var5 = (long) (arg3.field6871 << 19 | (arg2 ? 262144 : 0) | arg1 << 16 | this.field1175);
        class385 var7 = (class385) this.field1171.field781.method659(var5, (byte) -1);
        if (var7 != null) {
            return var7;
        } else if (this.field1171.field775.method2034(this.field1175, -28758)) {
            class140 var8 = class140.method854(this.field1171.field775, this.field1175, 0);
            if (var8 != null) {
                var8.field1996 = var8.field1992 = var8.field1990 = var8.field1988 = 0;
                if (arg2) {
                    var8.method858();
                }
                for (int var9 = 0; var9 < arg1; var9++) {
                    var8.method860();
                }
            }
            if (arg0 < 13) {
                this.method537(73, 61, false, (class487) null);
            }
            class385 var10 = arg3.method1139(var8, true);
            if (var10 != null) {
                this.field1171.field781.method653(94, var5, var10);
            }
            return var10;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(ILlk;B)V", line = 82)
    private final void method538(int arg0, class425 arg1, byte arg2) {
        if (arg2 != 57) {
            method536(54);
        }
        field1174++;
        if (arg0 == 1) {
            this.field1175 = arg1.method2508(true);
        } else if (arg0 == 2) {
            this.field1178 = arg1.method2498(3);
        } else if (arg0 == 3) {
            this.field1176 = true;
            return;
        } else if (arg0 == 4) {
            this.field1175 = -1;
            return;
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(ILlk;)V", line = 110)
    public final void method539(int arg0, class425 arg1) {
        while (true) {
            int var3 = arg1.method2503(true);
            if (var3 == 0) {
                field1173++;
                if (arg0 >= -55) {
                    this.field1176 = true;
                    return;
                }
                return;
            }
            this.method538(var3, arg1, (byte) 57);
        }
    }
}
